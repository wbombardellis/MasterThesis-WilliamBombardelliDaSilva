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
	public boolean isAppropriate_FWD(Match match, While c, Assignment d, Assignment b, While w, While a) {

		Object[] result1_black = whileulul2branchububImpl
				.pattern_whileulul2branchubub_0_1_initialbindings_blackBBBBBBB(this, match, c, d, b, w, a);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[d] = " + d + ", " + "[b] = " + b + ", "
					+ "[w] = " + w + ", " + "[a] = " + a + ".");
		}

		Object[] result2_bindingAndBlack = whileulul2branchububImpl
				.pattern_whileulul2branchubub_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, c, d, b, w, a);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[d] = " + d + ", " + "[b] = " + b + ", "
					+ "[w] = " + w + ", " + "[a] = " + a + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileulul2branchububImpl.pattern_whileulul2branchubub_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileulul2branchububImpl
					.pattern_whileulul2branchubub_0_4_collectelementstobetranslated_blackBBBBBB(match, c, d, b, w, a);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[c] = " + c + ", "
								+ "[d] = " + d + ", " + "[b] = " + b + ", " + "[w] = " + w + ", " + "[a] = " + a + ".");
			}
			whileulul2branchububImpl.pattern_whileulul2branchubub_0_4_collectelementstobetranslated_greenBBBBBBFFFFFF(
					match, c, d, b, w, a);
			//nothing EMoflonEdge c__d____first = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge a__b____first = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge c__d____last = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[11];

			Object[] result5_black = whileulul2branchububImpl
					.pattern_whileulul2branchubub_0_5_collectcontextelements_blackBBBBBB(match, c, d, b, w, a);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[c] = " + c + ", "
								+ "[d] = " + d + ", " + "[b] = " + b + ", " + "[w] = " + w + ", " + "[a] = " + a + ".");
			}
			whileulul2branchububImpl.pattern_whileulul2branchubub_0_5_collectcontextelements_greenBB(match, w);

			// 
			whileulul2branchububImpl.pattern_whileulul2branchubub_0_6_registerobjectstomatch_expressionBBBBBBB(this,
					match, c, d, b, w, a);
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
		While c = (While) result1_bindingAndBlack[0];
		Assignment d = (Assignment) result1_bindingAndBlack[1];
		Assignment b = (Assignment) result1_bindingAndBlack[2];
		While w = (While) result1_bindingAndBlack[3];
		S2B w2i = (S2B) result1_bindingAndBlack[4];
		While a = (While) result1_bindingAndBlack[5];
		Branch i = (Branch) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = whileulul2branchububImpl
				.pattern_whileulul2branchubub_1_1_performtransformation_greenBFBFBFFFBFFFB(c, d, b, a, i);
		S2B c2z = (S2B) result1_green[1];
		Branch x = (Branch) result1_green[3];
		Command v = (Command) result1_green[5];
		S2B a2x = (S2B) result1_green[6];
		Branch z = (Branch) result1_green[7];
		Command y = (Command) result1_green[9];
		S2N b2y = (S2N) result1_green[10];
		S2N d2v = (S2N) result1_green[11];

		Object[] result2_black = whileulul2branchububImpl
				.pattern_whileulul2branchubub_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(c, c2z, d, x, b, v, a2x,
						z, a, y, b2y, d2v);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", " + "[c2z] = "
					+ c2z + ", " + "[d] = " + d + ", " + "[x] = " + x + ", " + "[b] = " + b + ", " + "[v] = " + v + ", "
					+ "[a2x] = " + a2x + ", " + "[z] = " + z + ", " + "[a] = " + a + ", " + "[y] = " + y + ", "
					+ "[b2y] = " + b2y + ", " + "[d2v] = " + d2v + ".");
		}
		Object[] result2_green = whileulul2branchububImpl
				.pattern_whileulul2branchubub_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(c, c2z, d, x, b, v, a2x,
						z, a, y, b2y, d2v);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileulul2branchububImpl
				.pattern_whileulul2branchubub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, c, c2z, d, x, b,
						w, v, w2i, a2x, z, a, y, b2y, d2v, i);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c] = " + c + ", " + "[c2z] = " + c2z + ", " + "[d] = " + d + ", " + "[x] = " + x + ", "
					+ "[b] = " + b + ", " + "[w] = " + w + ", " + "[v] = " + v + ", " + "[w2i] = " + w2i + ", "
					+ "[a2x] = " + a2x + ", " + "[z] = " + z + ", " + "[a] = " + a + ", " + "[y] = " + y + ", "
					+ "[b2y] = " + b2y + ", " + "[d2v] = " + d2v + ", " + "[i] = " + i + ".");
		}
		whileulul2branchububImpl
				.pattern_whileulul2branchubub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
						ruleresult, c, c2z, d, x, b, w, v, a2x, z, a, y, b2y, d2v, i);
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c__d____first = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge z__v____positive = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge d2v__v____target = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge d2v__d____source = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[32];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[33];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[34];

		// 
		// 
		whileulul2branchububImpl.pattern_whileulul2branchubub_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this,
				ruleresult, c, c2z, d, x, b, w, v, w2i, a2x, z, a, y, b2y, d2v, i);
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
		While c = (While) result2_binding[0];
		Assignment d = (Assignment) result2_binding[1];
		Assignment b = (Assignment) result2_binding[2];
		While w = (While) result2_binding[3];
		While a = (While) result2_binding[4];
		for (Object[] result2_black : whileulul2branchububImpl
				.pattern_whileulul2branchubub_2_2_corematch_blackBBBBFBFB(c, d, b, w, a, match)) {
			S2B w2i = (S2B) result2_black[4];
			Branch i = (Branch) result2_black[6];
			// ForEach 
			for (Object[] result3_black : whileulul2branchububImpl
					.pattern_whileulul2branchubub_2_3_findcontext_blackBBBBBBB(c, d, b, w, w2i, a, i)) {
				Object[] result3_green = whileulul2branchububImpl
						.pattern_whileulul2branchubub_2_3_findcontext_greenBBBBBBBFFFFFFFFF(c, d, b, w, w2i, a, i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge c__d____first = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = whileulul2branchububImpl
						.pattern_whileulul2branchubub_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, c,
								d, b, w, w2i, a, i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[d] = " + d
							+ ", " + "[b] = " + b + ", " + "[w] = " + w + ", " + "[w2i] = " + w2i + ", " + "[a] = " + a
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
	public void registerObjectsToMatch_FWD(Match match, While c, Assignment d, Assignment b, While w, While a) {
		match.registerObject("c", c);
		match.registerObject("d", d);
		match.registerObject("b", b);
		match.registerObject("w", w);
		match.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, While c, Assignment d, Assignment b, While w, While a) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, While c, Assignment d, Assignment b,
			While w, S2B w2i, While a, Branch i) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("a", a);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject c, EObject c2z, EObject d, EObject x,
			EObject b, EObject w, EObject v, EObject w2i, EObject a2x, EObject z, EObject a, EObject y, EObject b2y,
			EObject d2v, EObject i) {
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("v", v);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("d2v", d2v);
		ruleresult.registerObject("i", i);

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
	public boolean isAppropriate_BWD(Match match, Branch x, Command v, Branch z, Command y, Branch i) {

		Object[] result1_black = whileulul2branchububImpl
				.pattern_whileulul2branchubub_10_1_initialbindings_blackBBBBBBB(this, match, x, v, z, y, i);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[v] = " + v + ", " + "[z] = " + z + ", "
					+ "[y] = " + y + ", " + "[i] = " + i + ".");
		}

		Object[] result2_bindingAndBlack = whileulul2branchububImpl
				.pattern_whileulul2branchubub_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, x, v, z, y, i);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[v] = " + v + ", " + "[z] = " + z + ", "
					+ "[y] = " + y + ", " + "[i] = " + i + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileulul2branchububImpl.pattern_whileulul2branchubub_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileulul2branchububImpl
					.pattern_whileulul2branchubub_10_4_collectelementstobetranslated_blackBBBBBB(match, x, v, z, y, i);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[x] = " + x + ", "
								+ "[v] = " + v + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[i] = " + i + ".");
			}
			whileulul2branchububImpl.pattern_whileulul2branchubub_10_4_collectelementstobetranslated_greenBBBBBBFFFFFF(
					match, x, v, z, y, i);
			//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge v__z____next = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge z__v____positive = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge y__x____next = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[11];

			Object[] result5_black = whileulul2branchububImpl
					.pattern_whileulul2branchubub_10_5_collectcontextelements_blackBBBBBB(match, x, v, z, y, i);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[x] = " + x + ", "
								+ "[v] = " + v + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[i] = " + i + ".");
			}
			whileulul2branchububImpl.pattern_whileulul2branchubub_10_5_collectcontextelements_greenBB(match, i);

			// 
			whileulul2branchububImpl.pattern_whileulul2branchubub_10_6_registerobjectstomatch_expressionBBBBBBB(this,
					match, x, v, z, y, i);
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
		Branch x = (Branch) result1_bindingAndBlack[0];
		While w = (While) result1_bindingAndBlack[1];
		Command v = (Command) result1_bindingAndBlack[2];
		S2B w2i = (S2B) result1_bindingAndBlack[3];
		Branch z = (Branch) result1_bindingAndBlack[4];
		Command y = (Command) result1_bindingAndBlack[5];
		Branch i = (Branch) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = whileulul2branchububImpl
				.pattern_whileulul2branchubub_11_1_performtransformation_greenFFFBFBBFBFBFF(x, w, v, z, y);
		While c = (While) result1_green[0];
		S2B c2z = (S2B) result1_green[1];
		Assignment d = (Assignment) result1_green[2];
		Assignment b = (Assignment) result1_green[4];
		S2B a2x = (S2B) result1_green[7];
		While a = (While) result1_green[9];
		S2N b2y = (S2N) result1_green[11];
		S2N d2v = (S2N) result1_green[12];

		Object[] result2_black = whileulul2branchububImpl
				.pattern_whileulul2branchubub_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(c, c2z, d, x, b, v, a2x,
						z, a, y, b2y, d2v);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", " + "[c2z] = "
					+ c2z + ", " + "[d] = " + d + ", " + "[x] = " + x + ", " + "[b] = " + b + ", " + "[v] = " + v + ", "
					+ "[a2x] = " + a2x + ", " + "[z] = " + z + ", " + "[a] = " + a + ", " + "[y] = " + y + ", "
					+ "[b2y] = " + b2y + ", " + "[d2v] = " + d2v + ".");
		}
		Object[] result2_green = whileulul2branchububImpl
				.pattern_whileulul2branchubub_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(c, c2z, d, x, b, v, a2x,
						z, a, y, b2y, d2v);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileulul2branchububImpl
				.pattern_whileulul2branchubub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, c, c2z, d, x,
						b, w, v, w2i, a2x, z, a, y, b2y, d2v, i);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c] = " + c + ", " + "[c2z] = " + c2z + ", " + "[d] = " + d + ", " + "[x] = " + x + ", "
					+ "[b] = " + b + ", " + "[w] = " + w + ", " + "[v] = " + v + ", " + "[w2i] = " + w2i + ", "
					+ "[a2x] = " + a2x + ", " + "[z] = " + z + ", " + "[a] = " + a + ", " + "[y] = " + y + ", "
					+ "[b2y] = " + b2y + ", " + "[d2v] = " + d2v + ", " + "[i] = " + i + ".");
		}
		whileulul2branchububImpl
				.pattern_whileulul2branchubub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
						ruleresult, c, c2z, d, x, b, w, v, a2x, z, a, y, b2y, d2v, i);
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c__d____first = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge z__v____positive = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge d2v__v____target = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge d2v__d____source = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[32];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[33];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[34];

		// 
		// 
		whileulul2branchububImpl.pattern_whileulul2branchubub_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this,
				ruleresult, c, c2z, d, x, b, w, v, w2i, a2x, z, a, y, b2y, d2v, i);
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
		Branch x = (Branch) result2_binding[0];
		Command v = (Command) result2_binding[1];
		Branch z = (Branch) result2_binding[2];
		Command y = (Command) result2_binding[3];
		Branch i = (Branch) result2_binding[4];
		for (Object[] result2_black : whileulul2branchububImpl
				.pattern_whileulul2branchubub_12_2_corematch_blackBFBFBBBB(x, v, z, y, i, match)) {
			While w = (While) result2_black[1];
			S2B w2i = (S2B) result2_black[3];
			// ForEach 
			for (Object[] result3_black : whileulul2branchububImpl
					.pattern_whileulul2branchubub_12_3_findcontext_blackBBBBBBB(x, w, v, w2i, z, y, i)) {
				Object[] result3_green = whileulul2branchububImpl
						.pattern_whileulul2branchubub_12_3_findcontext_greenBBBBBBBFFFFFFFFF(x, w, v, w2i, z, y, i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge z__v____positive = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = whileulul2branchububImpl
						.pattern_whileulul2branchubub_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								x, w, v, w2i, z, y, i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[x] = " + x + ", " + "[w] = " + w
							+ ", " + "[v] = " + v + ", " + "[w2i] = " + w2i + ", " + "[z] = " + z + ", " + "[y] = " + y
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
	public void registerObjectsToMatch_BWD(Match match, Branch x, Command v, Branch z, Command y, Branch i) {
		match.registerObject("x", x);
		match.registerObject("v", v);
		match.registerObject("z", z);
		match.registerObject("y", y);
		match.registerObject("i", i);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch x, Command v, Branch z, Command y, Branch i) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch x, While w, Command v, S2B w2i,
			Branch z, Command y, Branch i) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("v", v);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("y", y);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject c, EObject c2z, EObject d, EObject x,
			EObject b, EObject w, EObject v, EObject w2i, EObject a2x, EObject z, EObject a, EObject y, EObject b2y,
			EObject d2v, EObject i) {
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("v", v);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("d2v", d2v);
		ruleresult.registerObject("i", i);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_142(EMoflonEdge _edge_positive) {

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
			Branch x = (Branch) result2_black[0];
			Command v = (Command) result2_black[1];
			Branch z = (Branch) result2_black[2];
			Command y = (Command) result2_black[3];
			Branch i = (Branch) result2_black[4];
			Object[] result2_green = whileulul2branchububImpl
					.pattern_whileulul2branchubub_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileulul2branchububImpl
					.pattern_whileulul2branchubub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
							this, match, x, v, z, y, i)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_142(EMoflonEdge _edge_first) {

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
			While c = (While) result2_black[0];
			Assignment d = (Assignment) result2_black[1];
			Assignment b = (Assignment) result2_black[2];
			While w = (While) result2_black[3];
			While a = (While) result2_black[4];
			Object[] result2_green = whileulul2branchububImpl
					.pattern_whileulul2branchubub_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileulul2branchububImpl
					.pattern_whileulul2branchubub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
							this, match, c, d, b, w, a)) {
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
		While c = (While) result2_bindingAndBlack[0];
		Assignment d = (Assignment) result2_bindingAndBlack[1];
		Branch x = (Branch) result2_bindingAndBlack[2];
		Assignment b = (Assignment) result2_bindingAndBlack[3];
		While w = (While) result2_bindingAndBlack[4];
		Command v = (Command) result2_bindingAndBlack[5];
		Branch z = (Branch) result2_bindingAndBlack[6];
		While a = (While) result2_bindingAndBlack[7];
		Command y = (Command) result2_bindingAndBlack[8];
		Branch i = (Branch) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = whileulul2branchububImpl
				.pattern_whileulul2branchubub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, c, d, x, b, w, v, z, a,
						y, i, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[c] = " + c + ", " + "[d] = " + d + ", " + "[x] = " + x + ", " + "[b] = " + b + ", " + "[w] = "
					+ w + ", " + "[v] = " + v + ", " + "[z] = " + z + ", " + "[a] = " + a + ", " + "[y] = " + y + ", "
					+ "[i] = " + i + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whileulul2branchububImpl.pattern_whileulul2branchubub_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whileulul2branchububImpl
					.pattern_whileulul2branchubub_24_5_matchcorrcontext_blackBFBBB(w, i, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[1];
				Object[] result5_green = whileulul2branchububImpl
						.pattern_whileulul2branchubub_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whileulul2branchububImpl
						.pattern_whileulul2branchubub_24_6_createcorrespondence_blackBBBBBBBBBBB(c, d, x, b, w, v, z, a,
								y, i, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", "
							+ "[d] = " + d + ", " + "[x] = " + x + ", " + "[b] = " + b + ", " + "[w] = " + w + ", "
							+ "[v] = " + v + ", " + "[z] = " + z + ", " + "[a] = " + a + ", " + "[y] = " + y + ", "
							+ "[i] = " + i + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whileulul2branchububImpl.pattern_whileulul2branchubub_24_6_createcorrespondence_greenBFBBBBFBBBFFB(c, d,
						x, b, v, z, a, y, ccMatch);
				//nothing S2B c2z = (S2B) result6_green[1];
				//nothing S2B a2x = (S2B) result6_green[6];
				//nothing S2N b2y = (S2N) result6_green[10];
				//nothing S2N d2v = (S2N) result6_green[11];

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
	public CSP isApplicable_solveCsp_CC(While c, Assignment d, Branch x, Assignment b, While w, Command v, Branch z,
			While a, Command y, Branch i, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(While c, Assignment d, Assignment b, While w, While a) {// 
		Object[] result1_black = whileulul2branchububImpl
				.pattern_whileulul2branchubub_27_1_matchtggpattern_blackBBBBB(c, d, b, w, a);
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
	public boolean checkDEC_BWD(Branch x, Command v, Branch z, Command y, Branch i) {// 
		Object[] result1_black = whileulul2branchububImpl
				.pattern_whileulul2branchubub_28_1_matchtggpattern_blackBBBBB(x, v, z, y, i);
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
			While w = (While) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			Branch i = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = whileulul2branchububImpl
					.pattern_whileulul2branchubub_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, w, w2i,
							i, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[w2i] = " + w2i
						+ ", " + "[i] = " + i + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whileulul2branchububImpl.pattern_whileulul2branchubub_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whileulul2branchububImpl
						.pattern_whileulul2branchubub_29_5_checknacs_blackBBB(w, w2i, i);
				if (result5_black != null) {

					Object[] result6_black = whileulul2branchububImpl
							.pattern_whileulul2branchubub_29_6_perform_blackBBBB(w, w2i, i, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w] = " + w + ", "
								+ "[w2i] = " + w2i + ", " + "[i] = " + i + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whileulul2branchububImpl.pattern_whileulul2branchubub_29_6_perform_greenFFFFFBFFFFFFFBB(w, i,
							ruleResult);
					//nothing While c = (While) result6_green[0];
					//nothing S2B c2z = (S2B) result6_green[1];
					//nothing Assignment d = (Assignment) result6_green[2];
					//nothing Branch x = (Branch) result6_green[3];
					//nothing Assignment b = (Assignment) result6_green[4];
					//nothing Command v = (Command) result6_green[6];
					//nothing S2B a2x = (S2B) result6_green[7];
					//nothing Branch z = (Branch) result6_green[8];
					//nothing While a = (While) result6_green[9];
					//nothing Command y = (Command) result6_green[10];
					//nothing S2N b2y = (S2N) result6_green[11];
					//nothing S2N d2v = (S2N) result6_green[12];

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
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPROPRIATE_FWD__MATCH_WHILE_ASSIGNMENT_ASSIGNMENT_WHILE_WHILE:
			return isAppropriate_FWD((Match) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(Assignment) arguments.get(3), (While) arguments.get(4), (While) arguments.get(5));
		case RulesPackage.WHILEULUL2BRANCHUBUB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WHILE_ASSIGNMENT_ASSIGNMENT_WHILE_WHILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(Assignment) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4),
					(While) arguments.get(5));
			return null;
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WHILE_ASSIGNMENT_ASSIGNMENT_WHILE_WHILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(Assignment) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4),
					(While) arguments.get(5));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_WHILE_ASSIGNMENT_ASSIGNMENT_WHILE_S2B_WHILE_BRANCH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(Assignment) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4),
					(S2B) arguments.get(5), (While) arguments.get(6), (Branch) arguments.get(7));
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
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPROPRIATE_BWD__MATCH_BRANCH_COMMAND_BRANCH_COMMAND_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4), (Branch) arguments.get(5));
		case RulesPackage.WHILEULUL2BRANCHUBUB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_COMMAND_BRANCH_COMMAND_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4), (Branch) arguments.get(5));
			return null;
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_COMMAND_BRANCH_COMMAND_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (Command) arguments.get(4),
					(Branch) arguments.get(5));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_WHILE_COMMAND_S2B_BRANCH_COMMAND_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(While) arguments.get(2), (Command) arguments.get(3), (S2B) arguments.get(4),
					(Branch) arguments.get(5), (Command) arguments.get(6), (Branch) arguments.get(7));
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
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_142__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_142((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_142__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_142((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPLICABLE_SOLVE_CSP_CC__WHILE_ASSIGNMENT_BRANCH_ASSIGNMENT_WHILE_COMMAND_BRANCH_WHILE_COMMAND_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((While) arguments.get(0), (Assignment) arguments.get(1),
					(Branch) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4),
					(Command) arguments.get(5), (Branch) arguments.get(6), (While) arguments.get(7),
					(Command) arguments.get(8), (Branch) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___CHECK_DEC_FWD__WHILE_ASSIGNMENT_ASSIGNMENT_WHILE_WHILE:
			return checkDEC_FWD((While) arguments.get(0), (Assignment) arguments.get(1), (Assignment) arguments.get(2),
					(While) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.WHILEULUL2BRANCHUBUB___CHECK_DEC_BWD__BRANCH_COMMAND_BRANCH_COMMAND_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.WHILEULUL2BRANCHUBUB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILEULUL2BRANCHUBUB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_WHILE_S2B_BRANCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(S2B) arguments.get(2), (Branch) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILEULUL2BRANCHUBUB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whileulul2branchubub_0_1_initialbindings_blackBBBBBBB(
			whileulul2branchubub _this, Match match, While c, Assignment d, Assignment b, While w, While a) {
		if (!c.equals(w)) {
			if (!b.equals(d)) {
				if (!a.equals(c)) {
					if (!a.equals(w)) {
						return new Object[] { _this, match, c, d, b, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_0_2_SolveCSP_bindingFBBBBBBB(whileulul2branchubub _this,
			Match match, While c, Assignment d, Assignment b, While w, While a) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, c, d, b, w, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, c, d, b, w, a };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileulul2branchubub_0_2_SolveCSP_bindingAndBlackFBBBBBBB(
			whileulul2branchubub _this, Match match, While c, Assignment d, Assignment b, While w, While a) {
		Object[] result_pattern_whileulul2branchubub_0_2_SolveCSP_binding = pattern_whileulul2branchubub_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, c, d, b, w, a);
		if (result_pattern_whileulul2branchubub_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileulul2branchubub_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whileulul2branchubub_0_2_SolveCSP_black = pattern_whileulul2branchubub_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileulul2branchubub_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, c, d, b, w, a };
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
			While c, Assignment d, Assignment b, While w, While a) {
		if (!c.equals(w)) {
			if (!b.equals(d)) {
				if (!a.equals(c)) {
					if (!a.equals(w)) {
						return new Object[] { match, c, d, b, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_0_4_collectelementstobetranslated_greenBBBBBBFFFFFF(
			Match match, While c, Assignment d, Assignment b, While w, While a) {
		EMoflonEdge c__d____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(c);
		match.getToBeTranslatedNodes().add(d);
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(a);
		String c__d____first_name_prime = "first";
		String w__a____first_name_prime = "first";
		String a__b____first_name_prime = "first";
		String c__d____last_name_prime = "last";
		String a__b____last_name_prime = "last";
		String w__c____next_name_prime = "next";
		c__d____first.setSrc(c);
		c__d____first.setTrg(d);
		match.getToBeTranslatedEdges().add(c__d____first);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____first);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		match.getToBeTranslatedEdges().add(c__d____last);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____last);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		c__d____first.setName(c__d____first_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		return new Object[] { match, c, d, b, w, a, c__d____first, w__a____first, a__b____first, c__d____last,
				a__b____last, w__c____next };
	}

	public static final Object[] pattern_whileulul2branchubub_0_5_collectcontextelements_blackBBBBBB(Match match,
			While c, Assignment d, Assignment b, While w, While a) {
		if (!c.equals(w)) {
			if (!b.equals(d)) {
				if (!a.equals(c)) {
					if (!a.equals(w)) {
						return new Object[] { match, c, d, b, w, a };
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
			whileulul2branchubub _this, Match match, While c, Assignment d, Assignment b, While w, While a) {
		_this.registerObjectsToMatch_FWD(match, c, d, b, w, a);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("c");
		EObject _localVariable_1 = isApplicableMatch.getObject("d");
		EObject _localVariable_2 = isApplicableMatch.getObject("b");
		EObject _localVariable_3 = isApplicableMatch.getObject("w");
		EObject _localVariable_4 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_5 = isApplicableMatch.getObject("a");
		EObject _localVariable_6 = isApplicableMatch.getObject("i");
		EObject tmpC = _localVariable_0;
		EObject tmpD = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpW2i = _localVariable_4;
		EObject tmpA = _localVariable_5;
		EObject tmpI = _localVariable_6;
		if (tmpC instanceof While) {
			While c = (While) tmpC;
			if (tmpD instanceof Assignment) {
				Assignment d = (Assignment) tmpD;
				if (tmpB instanceof Assignment) {
					Assignment b = (Assignment) tmpB;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						if (tmpW2i instanceof S2B) {
							S2B w2i = (S2B) tmpW2i;
							if (tmpA instanceof While) {
								While a = (While) tmpA;
								if (tmpI instanceof Branch) {
									Branch i = (Branch) tmpI;
									return new Object[] { c, d, b, w, w2i, a, i, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_1_1_performtransformation_blackBBBBBBBFBB(While c,
			Assignment d, Assignment b, While w, S2B w2i, While a, Branch i, whileulul2branchubub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!c.equals(w)) {
			if (!b.equals(d)) {
				if (!a.equals(c)) {
					if (!a.equals(w)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { c, d, b, w, w2i, a, i, csp, _this, isApplicableMatch };
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
			While c = (While) result_pattern_whileulul2branchubub_1_1_performtransformation_binding[0];
			Assignment d = (Assignment) result_pattern_whileulul2branchubub_1_1_performtransformation_binding[1];
			Assignment b = (Assignment) result_pattern_whileulul2branchubub_1_1_performtransformation_binding[2];
			While w = (While) result_pattern_whileulul2branchubub_1_1_performtransformation_binding[3];
			S2B w2i = (S2B) result_pattern_whileulul2branchubub_1_1_performtransformation_binding[4];
			While a = (While) result_pattern_whileulul2branchubub_1_1_performtransformation_binding[5];
			Branch i = (Branch) result_pattern_whileulul2branchubub_1_1_performtransformation_binding[6];

			Object[] result_pattern_whileulul2branchubub_1_1_performtransformation_black = pattern_whileulul2branchubub_1_1_performtransformation_blackBBBBBBBFBB(
					c, d, b, w, w2i, a, i, _this, isApplicableMatch);
			if (result_pattern_whileulul2branchubub_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileulul2branchubub_1_1_performtransformation_black[7];

				return new Object[] { c, d, b, w, w2i, a, i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_1_1_performtransformation_greenBFBFBFFFBFFFB(While c,
			Assignment d, Assignment b, While a, Branch i) {
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Command v = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		c2z.setSource(c);
		i.setPositive(x);
		a2x.setTarget(x);
		a2x.setSource(a);
		v.setNext(z);
		c2z.setTarget(z);
		z.setPositive(v);
		i.setNegative(z);
		x.setPositive(y);
		y.setNext(x);
		b2y.setTarget(y);
		b2y.setSource(b);
		d2v.setTarget(v);
		d2v.setSource(d);
		return new Object[] { c, c2z, d, x, b, v, a2x, z, a, y, b2y, d2v, i };
	}

	public static final Object[] pattern_whileulul2branchubub_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(While c,
			S2B c2z, Assignment d, Branch x, Assignment b, Command v, S2B a2x, Branch z, While a, Command y, S2N b2y,
			S2N d2v) {
		if (!x.equals(z)) {
			if (!b.equals(d)) {
				if (!v.equals(y)) {
					if (!a2x.equals(c2z)) {
						if (!a.equals(c)) {
							if (!b2y.equals(d2v)) {
								return new Object[] { c, c2z, d, x, b, v, a2x, z, a, y, b2y, d2v };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(While c,
			S2B c2z, Assignment d, Branch x, Assignment b, Command v, S2B a2x, Branch z, While a, Command y, S2N b2y,
			S2N d2v) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getTranslatedElements().add(d);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedElements().add(v);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(d2v);
		return new Object[] { ruleresult, c, c2z, d, x, b, v, a2x, z, a, y, b2y, d2v };
	}

	public static final Object[] pattern_whileulul2branchubub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject c, EObject c2z, EObject d, EObject x, EObject b, EObject w, EObject v,
			EObject w2i, EObject a2x, EObject z, EObject a, EObject y, EObject b2y, EObject d2v, EObject i) {
		if (!c.equals(c2z)) {
			if (!c.equals(d)) {
				if (!c.equals(x)) {
					if (!c.equals(w)) {
						if (!c.equals(v)) {
							if (!c.equals(w2i)) {
								if (!c.equals(z)) {
									if (!c.equals(y)) {
										if (!c.equals(d2v)) {
											if (!c.equals(i)) {
												if (!c2z.equals(d)) {
													if (!c2z.equals(x)) {
														if (!c2z.equals(w)) {
															if (!c2z.equals(v)) {
																if (!c2z.equals(w2i)) {
																	if (!c2z.equals(z)) {
																		if (!c2z.equals(y)) {
																			if (!c2z.equals(d2v)) {
																				if (!c2z.equals(i)) {
																					if (!d.equals(x)) {
																						if (!d.equals(w)) {
																							if (!d.equals(v)) {
																								if (!d.equals(w2i)) {
																									if (!d.equals(z)) {
																										if (!d.equals(
																												y)) {
																											if (!d.equals(
																													d2v)) {
																												if (!d.equals(
																														i)) {
																													if (!x.equals(
																															z)) {
																														if (!x.equals(
																																y)) {
																															if (!b.equals(
																																	c)) {
																																if (!b.equals(
																																		c2z)) {
																																	if (!b.equals(
																																			d)) {
																																		if (!b.equals(
																																				x)) {
																																			if (!b.equals(
																																					w)) {
																																				if (!b.equals(
																																						v)) {
																																					if (!b.equals(
																																							w2i)) {
																																						if (!b.equals(
																																								z)) {
																																							if (!b.equals(
																																									y)) {
																																								if (!b.equals(
																																										b2y)) {
																																									if (!b.equals(
																																											d2v)) {
																																										if (!b.equals(
																																												i)) {
																																											if (!w.equals(
																																													x)) {
																																												if (!w.equals(
																																														w2i)) {
																																													if (!w.equals(
																																															z)) {
																																														if (!w.equals(
																																																y)) {
																																															if (!v.equals(
																																																	x)) {
																																																if (!v.equals(
																																																		w)) {
																																																	if (!v.equals(
																																																			w2i)) {
																																																		if (!v.equals(
																																																				z)) {
																																																			if (!v.equals(
																																																					y)) {
																																																				if (!w2i.equals(
																																																						x)) {
																																																					if (!w2i.equals(
																																																							z)) {
																																																						if (!w2i.equals(
																																																								y)) {
																																																							if (!a2x.equals(
																																																									c)) {
																																																								if (!a2x.equals(
																																																										c2z)) {
																																																									if (!a2x.equals(
																																																											d)) {
																																																										if (!a2x.equals(
																																																												x)) {
																																																											if (!a2x.equals(
																																																													b)) {
																																																												if (!a2x.equals(
																																																														w)) {
																																																													if (!a2x.equals(
																																																															v)) {
																																																														if (!a2x.equals(
																																																																w2i)) {
																																																															if (!a2x.equals(
																																																																	z)) {
																																																																if (!a2x.equals(
																																																																		y)) {
																																																																	if (!a2x.equals(
																																																																			b2y)) {
																																																																		if (!a2x.equals(
																																																																				d2v)) {
																																																																			if (!a2x.equals(
																																																																					i)) {
																																																																				if (!a.equals(
																																																																						c)) {
																																																																					if (!a.equals(
																																																																							c2z)) {
																																																																						if (!a.equals(
																																																																								d)) {
																																																																							if (!a.equals(
																																																																									x)) {
																																																																								if (!a.equals(
																																																																										b)) {
																																																																									if (!a.equals(
																																																																											w)) {
																																																																										if (!a.equals(
																																																																												v)) {
																																																																											if (!a.equals(
																																																																													w2i)) {
																																																																												if (!a.equals(
																																																																														a2x)) {
																																																																													if (!a.equals(
																																																																															z)) {
																																																																														if (!a.equals(
																																																																																y)) {
																																																																															if (!a.equals(
																																																																																	b2y)) {
																																																																																if (!a.equals(
																																																																																		d2v)) {
																																																																																	if (!a.equals(
																																																																																			i)) {
																																																																																		if (!y.equals(
																																																																																				z)) {
																																																																																			if (!b2y.equals(
																																																																																					c)) {
																																																																																				if (!b2y.equals(
																																																																																						c2z)) {
																																																																																					if (!b2y.equals(
																																																																																							d)) {
																																																																																						if (!b2y.equals(
																																																																																								x)) {
																																																																																							if (!b2y.equals(
																																																																																									w)) {
																																																																																								if (!b2y.equals(
																																																																																										v)) {
																																																																																									if (!b2y.equals(
																																																																																											w2i)) {
																																																																																										if (!b2y.equals(
																																																																																												z)) {
																																																																																											if (!b2y.equals(
																																																																																													y)) {
																																																																																												if (!b2y.equals(
																																																																																														d2v)) {
																																																																																													if (!b2y.equals(
																																																																																															i)) {
																																																																																														if (!d2v.equals(
																																																																																																x)) {
																																																																																															if (!d2v.equals(
																																																																																																	w)) {
																																																																																																if (!d2v.equals(
																																																																																																		v)) {
																																																																																																	if (!d2v.equals(
																																																																																																			w2i)) {
																																																																																																		if (!d2v.equals(
																																																																																																				z)) {
																																																																																																			if (!d2v.equals(
																																																																																																					y)) {
																																																																																																				if (!d2v.equals(
																																																																																																						i)) {
																																																																																																					if (!i.equals(
																																																																																																							x)) {
																																																																																																						if (!i.equals(
																																																																																																								w)) {
																																																																																																							if (!i.equals(
																																																																																																									v)) {
																																																																																																								if (!i.equals(
																																																																																																										w2i)) {
																																																																																																									if (!i.equals(
																																																																																																											z)) {
																																																																																																										if (!i.equals(
																																																																																																												y)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													c,
																																																																																																													c2z,
																																																																																																													d,
																																																																																																													x,
																																																																																																													b,
																																																																																																													w,
																																																																																																													v,
																																																																																																													w2i,
																																																																																																													a2x,
																																																																																																													z,
																																																																																																													a,
																																																																																																													y,
																																																																																																													b2y,
																																																																																																													d2v,
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
			PerformRuleResult ruleresult, EObject c, EObject c2z, EObject d, EObject x, EObject b, EObject w, EObject v,
			EObject a2x, EObject z, EObject a, EObject y, EObject b2y, EObject d2v, EObject i) {
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__v____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__v____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileulul2branchubub";
		String c2z__c____source_name_prime = "source";
		String x__y____positive_name_prime = "positive";
		String c__d____first_name_prime = "first";
		String v__z____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String a2x__x____target_name_prime = "target";
		String c2z__z____target_name_prime = "target";
		String z__v____positive_name_prime = "positive";
		String a__b____first_name_prime = "first";
		String a2x__a____source_name_prime = "source";
		String c__d____last_name_prime = "last";
		String b2y__y____target_name_prime = "target";
		String d2v__v____target_name_prime = "target";
		String a__b____last_name_prime = "last";
		String d2v__d____source_name_prime = "source";
		String y__x____next_name_prime = "next";
		String w__c____next_name_prime = "next";
		String i__x____positive_name_prime = "positive";
		String b2y__b____source_name_prime = "source";
		String i__z____negative_name_prime = "negative";
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		ruleresult.getCreatedEdges().add(x__y____positive);
		c__d____first.setSrc(c);
		c__d____first.setTrg(d);
		ruleresult.getTranslatedEdges().add(c__d____first);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		ruleresult.getCreatedEdges().add(v__z____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		z__v____positive.setSrc(z);
		z__v____positive.setTrg(v);
		ruleresult.getCreatedEdges().add(z__v____positive);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____first);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		ruleresult.getTranslatedEdges().add(c__d____last);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		d2v__v____target.setSrc(d2v);
		d2v__v____target.setTrg(v);
		ruleresult.getCreatedEdges().add(d2v__v____target);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		d2v__d____source.setSrc(d2v);
		d2v__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(d2v__d____source);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(y__x____next);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		c__d____first.setName(c__d____first_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		z__v____positive.setName(z__v____positive_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		d2v__v____target.setName(d2v__v____target_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		d2v__d____source.setName(d2v__d____source_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		return new Object[] { ruleresult, c, c2z, d, x, b, w, v, a2x, z, a, y, b2y, d2v, i, c2z__c____source,
				x__y____positive, c__d____first, v__z____next, w__a____first, a2x__x____target, c2z__z____target,
				z__v____positive, a__b____first, a2x__a____source, c__d____last, b2y__y____target, d2v__v____target,
				a__b____last, d2v__d____source, y__x____next, w__c____next, i__x____positive, b2y__b____source,
				i__z____negative };
	}

	public static final void pattern_whileulul2branchubub_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			whileulul2branchubub _this, PerformRuleResult ruleresult, EObject c, EObject c2z, EObject d, EObject x,
			EObject b, EObject w, EObject v, EObject w2i, EObject a2x, EObject z, EObject a, EObject y, EObject b2y,
			EObject d2v, EObject i) {
		_this.registerObjects_FWD(ruleresult, c, c2z, d, x, b, w, v, w2i, a2x, z, a, y, b2y, d2v, i);

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
		EObject _localVariable_0 = match.getObject("c");
		EObject _localVariable_1 = match.getObject("d");
		EObject _localVariable_2 = match.getObject("b");
		EObject _localVariable_3 = match.getObject("w");
		EObject _localVariable_4 = match.getObject("a");
		EObject tmpC = _localVariable_0;
		EObject tmpD = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpA = _localVariable_4;
		if (tmpC instanceof While) {
			While c = (While) tmpC;
			if (tmpD instanceof Assignment) {
				Assignment d = (Assignment) tmpD;
				if (tmpB instanceof Assignment) {
					Assignment b = (Assignment) tmpB;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							return new Object[] { c, d, b, w, a, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileulul2branchubub_2_2_corematch_blackBBBBFBFB(While c,
			Assignment d, Assignment b, While w, While a, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(w)) {
			if (!b.equals(d)) {
				if (!a.equals(c)) {
					if (!a.equals(w)) {
						for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class,
								"source")) {
							Branch i = w2i.getTarget();
							if (i != null) {
								_result.add(new Object[] { c, d, b, w, w2i, a, i, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileulul2branchubub_2_3_findcontext_blackBBBBBBB(While c,
			Assignment d, Assignment b, While w, S2B w2i, While a, Branch i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(w)) {
			if (!b.equals(d)) {
				if (!a.equals(c)) {
					if (!a.equals(w)) {
						if (d.equals(c.getFirst())) {
							if (a.equals(w.getFirst())) {
								if (w.equals(w2i.getSource())) {
									if (b.equals(a.getFirst())) {
										if (d.equals(c.getLast())) {
											if (b.equals(a.getLast())) {
												if (c.equals(w.getNext())) {
													if (i.equals(w2i.getTarget())) {
														_result.add(new Object[] { c, d, b, w, w2i, a, i });
													}
												}
											}
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

	public static final Object[] pattern_whileulul2branchubub_2_3_findcontext_greenBBBBBBBFFFFFFFFF(While c,
			Assignment d, Assignment b, While w, S2B w2i, While a, Branch i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c__d____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c__d____first_name_prime = "first";
		String w__a____first_name_prime = "first";
		String w2i__w____source_name_prime = "source";
		String a__b____first_name_prime = "first";
		String c__d____last_name_prime = "last";
		String a__b____last_name_prime = "last";
		String w__c____next_name_prime = "next";
		String w2i__i____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(i);
		c__d____first.setSrc(c);
		c__d____first.setTrg(d);
		isApplicableMatch.getAllContextElements().add(c__d____first);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____first);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		isApplicableMatch.getAllContextElements().add(c__d____last);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____last);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		c__d____first.setName(c__d____first_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		return new Object[] { c, d, b, w, w2i, a, i, isApplicableMatch, c__d____first, w__a____first, w2i__w____source,
				a__b____first, c__d____last, a__b____last, w__c____next, w2i__i____target };
	}

	public static final Object[] pattern_whileulul2branchubub_2_4_solveCSP_bindingFBBBBBBBBB(whileulul2branchubub _this,
			IsApplicableMatch isApplicableMatch, While c, Assignment d, Assignment b, While w, S2B w2i, While a,
			Branch i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, c, d, b, w, w2i, a, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, d, b, w, w2i, a, i };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileulul2branchubub_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			whileulul2branchubub _this, IsApplicableMatch isApplicableMatch, While c, Assignment d, Assignment b,
			While w, S2B w2i, While a, Branch i) {
		Object[] result_pattern_whileulul2branchubub_2_4_solveCSP_binding = pattern_whileulul2branchubub_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, c, d, b, w, w2i, a, i);
		if (result_pattern_whileulul2branchubub_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileulul2branchubub_2_4_solveCSP_binding[0];

			Object[] result_pattern_whileulul2branchubub_2_4_solveCSP_black = pattern_whileulul2branchubub_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileulul2branchubub_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, d, b, w, w2i, a, i };
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
			whileulul2branchubub _this, Match match, Branch x, Command v, Branch z, Command y, Branch i) {
		if (!x.equals(z)) {
			if (!v.equals(y)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						return new Object[] { _this, match, x, v, z, y, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_10_2_SolveCSP_bindingFBBBBBBB(whileulul2branchubub _this,
			Match match, Branch x, Command v, Branch z, Command y, Branch i) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, x, v, z, y, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, x, v, z, y, i };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileulul2branchubub_10_2_SolveCSP_bindingAndBlackFBBBBBBB(
			whileulul2branchubub _this, Match match, Branch x, Command v, Branch z, Command y, Branch i) {
		Object[] result_pattern_whileulul2branchubub_10_2_SolveCSP_binding = pattern_whileulul2branchubub_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, x, v, z, y, i);
		if (result_pattern_whileulul2branchubub_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileulul2branchubub_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whileulul2branchubub_10_2_SolveCSP_black = pattern_whileulul2branchubub_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileulul2branchubub_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, x, v, z, y, i };
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
			Match match, Branch x, Command v, Branch z, Command y, Branch i) {
		if (!x.equals(z)) {
			if (!v.equals(y)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						return new Object[] { match, x, v, z, y, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_10_4_collectelementstobetranslated_greenBBBBBBFFFFFF(
			Match match, Branch x, Command v, Branch z, Command y, Branch i) {
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__v____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(v);
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(y);
		String x__y____positive_name_prime = "positive";
		String v__z____next_name_prime = "next";
		String z__v____positive_name_prime = "positive";
		String y__x____next_name_prime = "next";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		match.getToBeTranslatedEdges().add(x__y____positive);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		match.getToBeTranslatedEdges().add(v__z____next);
		z__v____positive.setSrc(z);
		z__v____positive.setTrg(v);
		match.getToBeTranslatedEdges().add(z__v____positive);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(y__x____next);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		x__y____positive.setName(x__y____positive_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		z__v____positive.setName(z__v____positive_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		return new Object[] { match, x, v, z, y, i, x__y____positive, v__z____next, z__v____positive, y__x____next,
				i__x____positive, i__z____negative };
	}

	public static final Object[] pattern_whileulul2branchubub_10_5_collectcontextelements_blackBBBBBB(Match match,
			Branch x, Command v, Branch z, Command y, Branch i) {
		if (!x.equals(z)) {
			if (!v.equals(y)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						return new Object[] { match, x, v, z, y, i };
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
			whileulul2branchubub _this, Match match, Branch x, Command v, Branch z, Command y, Branch i) {
		_this.registerObjectsToMatch_BWD(match, x, v, z, y, i);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("x");
		EObject _localVariable_1 = isApplicableMatch.getObject("w");
		EObject _localVariable_2 = isApplicableMatch.getObject("v");
		EObject _localVariable_3 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_4 = isApplicableMatch.getObject("z");
		EObject _localVariable_5 = isApplicableMatch.getObject("y");
		EObject _localVariable_6 = isApplicableMatch.getObject("i");
		EObject tmpX = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpV = _localVariable_2;
		EObject tmpW2i = _localVariable_3;
		EObject tmpZ = _localVariable_4;
		EObject tmpY = _localVariable_5;
		EObject tmpI = _localVariable_6;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpV instanceof Command) {
					Command v = (Command) tmpV;
					if (tmpW2i instanceof S2B) {
						S2B w2i = (S2B) tmpW2i;
						if (tmpZ instanceof Branch) {
							Branch z = (Branch) tmpZ;
							if (tmpY instanceof Command) {
								Command y = (Command) tmpY;
								if (tmpI instanceof Branch) {
									Branch i = (Branch) tmpI;
									return new Object[] { x, w, v, w2i, z, y, i, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_11_1_performtransformation_blackBBBBBBBFBB(Branch x,
			While w, Command v, S2B w2i, Branch z, Command y, Branch i, whileulul2branchubub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!x.equals(z)) {
			if (!v.equals(y)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { x, w, v, w2i, z, y, i, csp, _this, isApplicableMatch };
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
			Branch x = (Branch) result_pattern_whileulul2branchubub_11_1_performtransformation_binding[0];
			While w = (While) result_pattern_whileulul2branchubub_11_1_performtransformation_binding[1];
			Command v = (Command) result_pattern_whileulul2branchubub_11_1_performtransformation_binding[2];
			S2B w2i = (S2B) result_pattern_whileulul2branchubub_11_1_performtransformation_binding[3];
			Branch z = (Branch) result_pattern_whileulul2branchubub_11_1_performtransformation_binding[4];
			Command y = (Command) result_pattern_whileulul2branchubub_11_1_performtransformation_binding[5];
			Branch i = (Branch) result_pattern_whileulul2branchubub_11_1_performtransformation_binding[6];

			Object[] result_pattern_whileulul2branchubub_11_1_performtransformation_black = pattern_whileulul2branchubub_11_1_performtransformation_blackBBBBBBBFBB(
					x, w, v, w2i, z, y, i, _this, isApplicableMatch);
			if (result_pattern_whileulul2branchubub_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileulul2branchubub_11_1_performtransformation_black[7];

				return new Object[] { x, w, v, w2i, z, y, i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_11_1_performtransformation_greenFFFBFBBFBFBFF(Branch x,
			While w, Command v, Branch z, Command y) {
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment d = SourcecodeFactory.eINSTANCE.createAssignment();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		w.setNext(c);
		c2z.setSource(c);
		c2z.setTarget(z);
		c.setFirst(d);
		c.setLast(d);
		a2x.setTarget(x);
		w.setFirst(a);
		a.setFirst(b);
		a2x.setSource(a);
		a.setLast(b);
		b2y.setTarget(y);
		b2y.setSource(b);
		d2v.setTarget(v);
		d2v.setSource(d);
		return new Object[] { c, c2z, d, x, b, w, v, a2x, z, a, y, b2y, d2v };
	}

	public static final Object[] pattern_whileulul2branchubub_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(While c,
			S2B c2z, Assignment d, Branch x, Assignment b, Command v, S2B a2x, Branch z, While a, Command y, S2N b2y,
			S2N d2v) {
		if (!x.equals(z)) {
			if (!b.equals(d)) {
				if (!v.equals(y)) {
					if (!a2x.equals(c2z)) {
						if (!a.equals(c)) {
							if (!b2y.equals(d2v)) {
								return new Object[] { c, c2z, d, x, b, v, a2x, z, a, y, b2y, d2v };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(While c,
			S2B c2z, Assignment d, Branch x, Assignment b, Command v, S2B a2x, Branch z, While a, Command y, S2N b2y,
			S2N d2v) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedElements().add(d);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getTranslatedElements().add(v);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(d2v);
		return new Object[] { ruleresult, c, c2z, d, x, b, v, a2x, z, a, y, b2y, d2v };
	}

	public static final Object[] pattern_whileulul2branchubub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject c, EObject c2z, EObject d, EObject x, EObject b, EObject w, EObject v,
			EObject w2i, EObject a2x, EObject z, EObject a, EObject y, EObject b2y, EObject d2v, EObject i) {
		if (!c.equals(c2z)) {
			if (!c.equals(d)) {
				if (!c.equals(x)) {
					if (!c.equals(w)) {
						if (!c.equals(v)) {
							if (!c.equals(w2i)) {
								if (!c.equals(z)) {
									if (!c.equals(y)) {
										if (!c.equals(d2v)) {
											if (!c.equals(i)) {
												if (!c2z.equals(d)) {
													if (!c2z.equals(x)) {
														if (!c2z.equals(w)) {
															if (!c2z.equals(v)) {
																if (!c2z.equals(w2i)) {
																	if (!c2z.equals(z)) {
																		if (!c2z.equals(y)) {
																			if (!c2z.equals(d2v)) {
																				if (!c2z.equals(i)) {
																					if (!d.equals(x)) {
																						if (!d.equals(w)) {
																							if (!d.equals(v)) {
																								if (!d.equals(w2i)) {
																									if (!d.equals(z)) {
																										if (!d.equals(
																												y)) {
																											if (!d.equals(
																													d2v)) {
																												if (!d.equals(
																														i)) {
																													if (!x.equals(
																															z)) {
																														if (!x.equals(
																																y)) {
																															if (!b.equals(
																																	c)) {
																																if (!b.equals(
																																		c2z)) {
																																	if (!b.equals(
																																			d)) {
																																		if (!b.equals(
																																				x)) {
																																			if (!b.equals(
																																					w)) {
																																				if (!b.equals(
																																						v)) {
																																					if (!b.equals(
																																							w2i)) {
																																						if (!b.equals(
																																								z)) {
																																							if (!b.equals(
																																									y)) {
																																								if (!b.equals(
																																										b2y)) {
																																									if (!b.equals(
																																											d2v)) {
																																										if (!b.equals(
																																												i)) {
																																											if (!w.equals(
																																													x)) {
																																												if (!w.equals(
																																														w2i)) {
																																													if (!w.equals(
																																															z)) {
																																														if (!w.equals(
																																																y)) {
																																															if (!v.equals(
																																																	x)) {
																																																if (!v.equals(
																																																		w)) {
																																																	if (!v.equals(
																																																			w2i)) {
																																																		if (!v.equals(
																																																				z)) {
																																																			if (!v.equals(
																																																					y)) {
																																																				if (!w2i.equals(
																																																						x)) {
																																																					if (!w2i.equals(
																																																							z)) {
																																																						if (!w2i.equals(
																																																								y)) {
																																																							if (!a2x.equals(
																																																									c)) {
																																																								if (!a2x.equals(
																																																										c2z)) {
																																																									if (!a2x.equals(
																																																											d)) {
																																																										if (!a2x.equals(
																																																												x)) {
																																																											if (!a2x.equals(
																																																													b)) {
																																																												if (!a2x.equals(
																																																														w)) {
																																																													if (!a2x.equals(
																																																															v)) {
																																																														if (!a2x.equals(
																																																																w2i)) {
																																																															if (!a2x.equals(
																																																																	z)) {
																																																																if (!a2x.equals(
																																																																		y)) {
																																																																	if (!a2x.equals(
																																																																			b2y)) {
																																																																		if (!a2x.equals(
																																																																				d2v)) {
																																																																			if (!a2x.equals(
																																																																					i)) {
																																																																				if (!a.equals(
																																																																						c)) {
																																																																					if (!a.equals(
																																																																							c2z)) {
																																																																						if (!a.equals(
																																																																								d)) {
																																																																							if (!a.equals(
																																																																									x)) {
																																																																								if (!a.equals(
																																																																										b)) {
																																																																									if (!a.equals(
																																																																											w)) {
																																																																										if (!a.equals(
																																																																												v)) {
																																																																											if (!a.equals(
																																																																													w2i)) {
																																																																												if (!a.equals(
																																																																														a2x)) {
																																																																													if (!a.equals(
																																																																															z)) {
																																																																														if (!a.equals(
																																																																																y)) {
																																																																															if (!a.equals(
																																																																																	b2y)) {
																																																																																if (!a.equals(
																																																																																		d2v)) {
																																																																																	if (!a.equals(
																																																																																			i)) {
																																																																																		if (!y.equals(
																																																																																				z)) {
																																																																																			if (!b2y.equals(
																																																																																					c)) {
																																																																																				if (!b2y.equals(
																																																																																						c2z)) {
																																																																																					if (!b2y.equals(
																																																																																							d)) {
																																																																																						if (!b2y.equals(
																																																																																								x)) {
																																																																																							if (!b2y.equals(
																																																																																									w)) {
																																																																																								if (!b2y.equals(
																																																																																										v)) {
																																																																																									if (!b2y.equals(
																																																																																											w2i)) {
																																																																																										if (!b2y.equals(
																																																																																												z)) {
																																																																																											if (!b2y.equals(
																																																																																													y)) {
																																																																																												if (!b2y.equals(
																																																																																														d2v)) {
																																																																																													if (!b2y.equals(
																																																																																															i)) {
																																																																																														if (!d2v.equals(
																																																																																																x)) {
																																																																																															if (!d2v.equals(
																																																																																																	w)) {
																																																																																																if (!d2v.equals(
																																																																																																		v)) {
																																																																																																	if (!d2v.equals(
																																																																																																			w2i)) {
																																																																																																		if (!d2v.equals(
																																																																																																				z)) {
																																																																																																			if (!d2v.equals(
																																																																																																					y)) {
																																																																																																				if (!d2v.equals(
																																																																																																						i)) {
																																																																																																					if (!i.equals(
																																																																																																							x)) {
																																																																																																						if (!i.equals(
																																																																																																								w)) {
																																																																																																							if (!i.equals(
																																																																																																									v)) {
																																																																																																								if (!i.equals(
																																																																																																										w2i)) {
																																																																																																									if (!i.equals(
																																																																																																											z)) {
																																																																																																										if (!i.equals(
																																																																																																												y)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													c,
																																																																																																													c2z,
																																																																																																													d,
																																																																																																													x,
																																																																																																													b,
																																																																																																													w,
																																																																																																													v,
																																																																																																													w2i,
																																																																																																													a2x,
																																																																																																													z,
																																																																																																													a,
																																																																																																													y,
																																																																																																													b2y,
																																																																																																													d2v,
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
			PerformRuleResult ruleresult, EObject c, EObject c2z, EObject d, EObject x, EObject b, EObject w, EObject v,
			EObject a2x, EObject z, EObject a, EObject y, EObject b2y, EObject d2v, EObject i) {
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__v____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__v____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileulul2branchubub";
		String c2z__c____source_name_prime = "source";
		String x__y____positive_name_prime = "positive";
		String c__d____first_name_prime = "first";
		String v__z____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String a2x__x____target_name_prime = "target";
		String c2z__z____target_name_prime = "target";
		String z__v____positive_name_prime = "positive";
		String a__b____first_name_prime = "first";
		String a2x__a____source_name_prime = "source";
		String c__d____last_name_prime = "last";
		String b2y__y____target_name_prime = "target";
		String d2v__v____target_name_prime = "target";
		String a__b____last_name_prime = "last";
		String d2v__d____source_name_prime = "source";
		String y__x____next_name_prime = "next";
		String w__c____next_name_prime = "next";
		String i__x____positive_name_prime = "positive";
		String b2y__b____source_name_prime = "source";
		String i__z____negative_name_prime = "negative";
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		ruleresult.getTranslatedEdges().add(x__y____positive);
		c__d____first.setSrc(c);
		c__d____first.setTrg(d);
		ruleresult.getCreatedEdges().add(c__d____first);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		ruleresult.getTranslatedEdges().add(v__z____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		z__v____positive.setSrc(z);
		z__v____positive.setTrg(v);
		ruleresult.getTranslatedEdges().add(z__v____positive);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____first);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		ruleresult.getCreatedEdges().add(c__d____last);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		d2v__v____target.setSrc(d2v);
		d2v__v____target.setTrg(v);
		ruleresult.getCreatedEdges().add(d2v__v____target);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		d2v__d____source.setSrc(d2v);
		d2v__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(d2v__d____source);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(y__x____next);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		c__d____first.setName(c__d____first_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		z__v____positive.setName(z__v____positive_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		d2v__v____target.setName(d2v__v____target_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		d2v__d____source.setName(d2v__d____source_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		return new Object[] { ruleresult, c, c2z, d, x, b, w, v, a2x, z, a, y, b2y, d2v, i, c2z__c____source,
				x__y____positive, c__d____first, v__z____next, w__a____first, a2x__x____target, c2z__z____target,
				z__v____positive, a__b____first, a2x__a____source, c__d____last, b2y__y____target, d2v__v____target,
				a__b____last, d2v__d____source, y__x____next, w__c____next, i__x____positive, b2y__b____source,
				i__z____negative };
	}

	public static final void pattern_whileulul2branchubub_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			whileulul2branchubub _this, PerformRuleResult ruleresult, EObject c, EObject c2z, EObject d, EObject x,
			EObject b, EObject w, EObject v, EObject w2i, EObject a2x, EObject z, EObject a, EObject y, EObject b2y,
			EObject d2v, EObject i) {
		_this.registerObjects_BWD(ruleresult, c, c2z, d, x, b, w, v, w2i, a2x, z, a, y, b2y, d2v, i);

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
		EObject _localVariable_0 = match.getObject("x");
		EObject _localVariable_1 = match.getObject("v");
		EObject _localVariable_2 = match.getObject("z");
		EObject _localVariable_3 = match.getObject("y");
		EObject _localVariable_4 = match.getObject("i");
		EObject tmpX = _localVariable_0;
		EObject tmpV = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpY = _localVariable_3;
		EObject tmpI = _localVariable_4;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpV instanceof Command) {
				Command v = (Command) tmpV;
				if (tmpZ instanceof Branch) {
					Branch z = (Branch) tmpZ;
					if (tmpY instanceof Command) {
						Command y = (Command) tmpY;
						if (tmpI instanceof Branch) {
							Branch i = (Branch) tmpI;
							return new Object[] { x, v, z, y, i, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileulul2branchubub_12_2_corematch_blackBFBFBBBB(Branch x,
			Command v, Branch z, Command y, Branch i, Match match) {
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
								_result.add(new Object[] { x, w, v, w2i, z, y, i, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileulul2branchubub_12_3_findcontext_blackBBBBBBB(Branch x, While w,
			Command v, S2B w2i, Branch z, Command y, Branch i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(z)) {
			if (!v.equals(y)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						if (y.equals(x.getPositive())) {
							if (z.equals(v.getNext())) {
								if (w.equals(w2i.getSource())) {
									if (v.equals(z.getPositive())) {
										if (x.equals(y.getNext())) {
											if (x.equals(i.getPositive())) {
												if (z.equals(i.getNegative())) {
													if (i.equals(w2i.getTarget())) {
														_result.add(new Object[] { x, w, v, w2i, z, y, i });
													}
												}
											}
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

	public static final Object[] pattern_whileulul2branchubub_12_3_findcontext_greenBBBBBBBFFFFFFFFF(Branch x, While w,
			Command v, S2B w2i, Branch z, Command y, Branch i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__v____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String x__y____positive_name_prime = "positive";
		String v__z____next_name_prime = "next";
		String w2i__w____source_name_prime = "source";
		String z__v____positive_name_prime = "positive";
		String y__x____next_name_prime = "next";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String w2i__i____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(v);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(i);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		isApplicableMatch.getAllContextElements().add(x__y____positive);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		isApplicableMatch.getAllContextElements().add(v__z____next);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		z__v____positive.setSrc(z);
		z__v____positive.setTrg(v);
		isApplicableMatch.getAllContextElements().add(z__v____positive);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(y__x____next);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		x__y____positive.setName(x__y____positive_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		z__v____positive.setName(z__v____positive_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		return new Object[] { x, w, v, w2i, z, y, i, isApplicableMatch, x__y____positive, v__z____next,
				w2i__w____source, z__v____positive, y__x____next, i__x____positive, i__z____negative,
				w2i__i____target };
	}

	public static final Object[] pattern_whileulul2branchubub_12_4_solveCSP_bindingFBBBBBBBBB(
			whileulul2branchubub _this, IsApplicableMatch isApplicableMatch, Branch x, While w, Command v, S2B w2i,
			Branch z, Command y, Branch i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, x, w, v, w2i, z, y, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, x, w, v, w2i, z, y, i };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileulul2branchubub_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			whileulul2branchubub _this, IsApplicableMatch isApplicableMatch, Branch x, While w, Command v, S2B w2i,
			Branch z, Command y, Branch i) {
		Object[] result_pattern_whileulul2branchubub_12_4_solveCSP_binding = pattern_whileulul2branchubub_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, x, w, v, w2i, z, y, i);
		if (result_pattern_whileulul2branchubub_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileulul2branchubub_12_4_solveCSP_binding[0];

			Object[] result_pattern_whileulul2branchubub_12_4_solveCSP_black = pattern_whileulul2branchubub_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileulul2branchubub_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, x, w, v, w2i, z, y, i };
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

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_970918 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_1BBB(Branch x,
			Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_936310 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_936310)) {
							if (!z.equals(__DEC_x_positive_936310)) {
								if (!i.equals(__DEC_x_positive_936310)) {
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

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_2BBB(Branch x,
			Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_375923 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_375923)) {
							if (!z.equals(__DEC_x_negative_375923)) {
								if (!i.equals(__DEC_x_negative_375923)) {
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

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_3B(Command v) {
		for (Graph __DEC_v_root_430937 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(v,
				Graph.class, "root")) {
			return new Object[] { v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_4BBBB(Command v,
			Branch x, Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_v_positive_535038 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "positive")) {
						if (!x.equals(__DEC_v_positive_535038)) {
							if (!z.equals(__DEC_v_positive_535038)) {
								if (!i.equals(__DEC_v_positive_535038)) {
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

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_5BBBB(Command v,
			Branch x, Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_v_negative_327406 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "negative")) {
						if (!x.equals(__DEC_v_negative_327406)) {
							if (!z.equals(__DEC_v_negative_327406)) {
								if (!i.equals(__DEC_v_negative_327406)) {
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

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_6B(Branch z) {
		for (Graph __DEC_z_root_152230 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
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
					for (Branch __DEC_z_positive_384290 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_384290)) {
							if (!x.equals(__DEC_z_positive_384290)) {
								if (!i.equals(__DEC_z_positive_384290)) {
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
					for (Branch __DEC_z_negative_168600 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_168600)) {
							if (!x.equals(__DEC_z_negative_168600)) {
								if (!i.equals(__DEC_z_negative_168600)) {
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
		for (Graph __DEC_y_root_875271 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
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
					for (Branch __DEC_y_positive_217335 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!x.equals(__DEC_y_positive_217335)) {
							if (!z.equals(__DEC_y_positive_217335)) {
								if (!i.equals(__DEC_y_positive_217335)) {
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
					for (Branch __DEC_y_negative_778249 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!x.equals(__DEC_y_negative_778249)) {
							if (!z.equals(__DEC_y_negative_778249)) {
								if (!i.equals(__DEC_y_negative_778249)) {
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
						if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_0B(x) == null) {
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
																			if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_1BBB(
																					x, z, i) == null) {
																				if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_2BBB(
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
																														if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_3B(
																																v) == null) {
																															if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_4BBBB(
																																	v,
																																	x,
																																	z,
																																	i) == null) {
																																if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_5BBBB(
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
																																										x,
																																										v,
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
			whileulul2branchubub _this, Match match, Branch x, Command v, Branch z, Command y, Branch i) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, x, v, z, y, i);
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

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_0B(While c) {
		for (Decision __DEC_c_positive_853246 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_1B(While c) {
		for (Decision __DEC_c_negative_201794 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_2BBB(While c, While w,
			While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_first_528413 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "first")) {
						if (!c.equals(__DEC_c_first_528413)) {
							if (!w.equals(__DEC_c_first_528413)) {
								if (!a.equals(__DEC_c_first_528413)) {
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

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_3BBB(While c, While w,
			While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_last_502001 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "last")) {
						if (!c.equals(__DEC_c_last_502001)) {
							if (!w.equals(__DEC_c_last_502001)) {
								if (!a.equals(__DEC_c_last_502001)) {
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

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_4B(While c) {
		for (Program __DEC_c_first_347129 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_5B(Assignment d) {
		for (Decision __DEC_d_positive_505911 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_6B(Assignment d) {
		for (Decision __DEC_d_negative_547236 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_7BBBB(Assignment d,
			While c, While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_d_last_567208 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "last")) {
						if (!c.equals(__DEC_d_last_567208)) {
							if (!w.equals(__DEC_d_last_567208)) {
								if (!a.equals(__DEC_d_last_567208)) {
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

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_8B(Assignment d) {
		for (Program __DEC_d_first_593460 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_9B(Assignment b) {
		for (Decision __DEC_b_positive_687897 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_10B(Assignment b) {
		for (Decision __DEC_b_negative_613934 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_11BBBB(Assignment b,
			While c, While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_b_last_244825 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "last")) {
						if (!c.equals(__DEC_b_last_244825)) {
							if (!w.equals(__DEC_b_last_244825)) {
								if (!a.equals(__DEC_b_last_244825)) {
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

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_12B(Assignment b) {
		for (Program __DEC_b_first_398039 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_13B(While a) {
		for (Decision __DEC_a_positive_343284 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_14B(While a) {
		for (Decision __DEC_a_negative_23671 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_15BBB(While a,
			While c, While w) {
		if (!a.equals(c)) {
			if (!a.equals(w)) {
				if (!c.equals(w)) {
					for (While __DEC_a_last_812718 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, While.class, "last")) {
						if (!a.equals(__DEC_a_last_812718)) {
							if (!c.equals(__DEC_a_last_812718)) {
								if (!w.equals(__DEC_a_last_812718)) {
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

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_16B(While a) {
		for (Program __DEC_a_first_661651 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_17BB(While w,
			Assignment d) {
		if (d.equals(w.getLast())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_18BB(While a,
			Assignment d) {
		if (d.equals(a.getLast())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_19BB(While c,
			Assignment b) {
		if (b.equals(c.getLast())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_20BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_21BB(While c,
			While a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_22BB(While w,
			While a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileulul2branchubub_21_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_first) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpC = _edge_first.getSrc();
		if (tmpC instanceof While) {
			While c = (While) tmpC;
			EObject tmpD = _edge_first.getTrg();
			if (tmpD instanceof Assignment) {
				Assignment d = (Assignment) tmpD;
				if (d.equals(c.getFirst())) {
					if (d.equals(c.getLast())) {
						if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_0B(c) == null) {
							if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_1B(c) == null) {
								if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_4B(c) == null) {
									if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_5B(
											d) == null) {
										if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_6B(
												d) == null) {
											if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_8B(
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
																		Statement tmpB = a.getFirst();
																		if (tmpB instanceof Assignment) {
																			Assignment b = (Assignment) tmpB;
																			if (!b.equals(d)) {
																				if (b.equals(a.getLast())) {
																					if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_17BB(
																							w, d) == null) {
																						if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_2BBB(
																								c, w, a) == null) {
																							if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_3BBB(
																									c, w, a) == null) {
																								if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_7BBBB(
																										d, c, w,
																										a) == null) {
																									if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_13B(
																											a) == null) {
																										if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_14B(
																												a) == null) {
																											if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_15BBB(
																													a,
																													c,
																													w) == null) {
																												if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_16B(
																														a) == null) {
																													if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_18BB(
																															a,
																															d) == null) {
																														if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_21BB(
																																c,
																																a) == null) {
																															if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_22BB(
																																	w,
																																	a) == null) {
																																if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_9B(
																																		b) == null) {
																																	if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_10B(
																																			b) == null) {
																																		if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_11BBBB(
																																				b,
																																				c,
																																				w,
																																				a) == null) {
																																			if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_12B(
																																					b) == null) {
																																				if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_19BB(
																																						c,
																																						b) == null) {
																																					if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_20BB(
																																							w,
																																							b) == null) {
																																						_result.add(
																																								new Object[] {
																																										c,
																																										d,
																																										b,
																																										w,
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
			whileulul2branchubub _this, Match match, While c, Assignment d, Assignment b, While w, While a) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, c, d, b, w, a);
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
		EObject _localVariable_0 = sourceMatch.getObject("c");
		EObject _localVariable_1 = sourceMatch.getObject("d");
		EObject _localVariable_2 = targetMatch.getObject("x");
		EObject _localVariable_3 = sourceMatch.getObject("b");
		EObject _localVariable_4 = sourceMatch.getObject("w");
		EObject _localVariable_5 = targetMatch.getObject("v");
		EObject _localVariable_6 = targetMatch.getObject("z");
		EObject _localVariable_7 = sourceMatch.getObject("a");
		EObject _localVariable_8 = targetMatch.getObject("y");
		EObject _localVariable_9 = targetMatch.getObject("i");
		EObject tmpC = _localVariable_0;
		EObject tmpD = _localVariable_1;
		EObject tmpX = _localVariable_2;
		EObject tmpB = _localVariable_3;
		EObject tmpW = _localVariable_4;
		EObject tmpV = _localVariable_5;
		EObject tmpZ = _localVariable_6;
		EObject tmpA = _localVariable_7;
		EObject tmpY = _localVariable_8;
		EObject tmpI = _localVariable_9;
		if (tmpC instanceof While) {
			While c = (While) tmpC;
			if (tmpD instanceof Assignment) {
				Assignment d = (Assignment) tmpD;
				if (tmpX instanceof Branch) {
					Branch x = (Branch) tmpX;
					if (tmpB instanceof Assignment) {
						Assignment b = (Assignment) tmpB;
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							if (tmpV instanceof Command) {
								Command v = (Command) tmpV;
								if (tmpZ instanceof Branch) {
									Branch z = (Branch) tmpZ;
									if (tmpA instanceof While) {
										While a = (While) tmpA;
										if (tmpY instanceof Command) {
											Command y = (Command) tmpY;
											if (tmpI instanceof Branch) {
												Branch i = (Branch) tmpI;
												return new Object[] { c, d, x, b, w, v, z, a, y, i, sourceMatch,
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

	public static final Object[] pattern_whileulul2branchubub_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(While c,
			Assignment d, Branch x, Assignment b, While w, Command v, Branch z, While a, Command y, Branch i,
			Match sourceMatch, Match targetMatch) {
		if (!c.equals(w)) {
			if (!x.equals(z)) {
				if (!b.equals(d)) {
					if (!v.equals(y)) {
						if (!a.equals(c)) {
							if (!a.equals(w)) {
								if (!i.equals(x)) {
									if (!i.equals(z)) {
										if (!sourceMatch.equals(targetMatch)) {
											return new Object[] { c, d, x, b, w, v, z, a, y, i, sourceMatch,
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
			While c = (While) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[0];
			Assignment d = (Assignment) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[1];
			Branch x = (Branch) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[2];
			Assignment b = (Assignment) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[3];
			While w = (While) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[4];
			Command v = (Command) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[5];
			Branch z = (Branch) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[6];
			While a = (While) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[7];
			Command y = (Command) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[8];
			Branch i = (Branch) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_black = pattern_whileulul2branchubub_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					c, d, x, b, w, v, z, a, y, i, sourceMatch, targetMatch);
			if (result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { c, d, x, b, w, v, z, a, y, i, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
			whileulul2branchubub _this, While c, Assignment d, Branch x, Assignment b, While w, Command v, Branch z,
			While a, Command y, Branch i, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(c, d, x, b, w, v, z, a, y, i, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, c, d, x, b, w, v, z, a, y, i, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileulul2branchubub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			whileulul2branchubub _this, While c, Assignment d, Branch x, Assignment b, While w, Command v, Branch z,
			While a, Command y, Branch i, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileulul2branchubub_24_3_solvecsp_binding = pattern_whileulul2branchubub_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, c, d, x, b, w, v, z, a, y, i, sourceMatch, targetMatch);
		if (result_pattern_whileulul2branchubub_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whileulul2branchubub_24_3_solvecsp_binding[0];

			Object[] result_pattern_whileulul2branchubub_24_3_solvecsp_black = pattern_whileulul2branchubub_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whileulul2branchubub_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, c, d, x, b, w, v, z, a, y, i, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whileulul2branchubub_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileulul2branchubub_24_5_matchcorrcontext_blackBFBBB(While w,
			Branch i, Match sourceMatch, Match targetMatch) {
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

	public static final Object[] pattern_whileulul2branchubub_24_6_createcorrespondence_blackBBBBBBBBBBB(While c,
			Assignment d, Branch x, Assignment b, While w, Command v, Branch z, While a, Command y, Branch i,
			CCMatch ccMatch) {
		if (!c.equals(w)) {
			if (!x.equals(z)) {
				if (!b.equals(d)) {
					if (!v.equals(y)) {
						if (!a.equals(c)) {
							if (!a.equals(w)) {
								if (!i.equals(x)) {
									if (!i.equals(z)) {
										return new Object[] { c, d, x, b, w, v, z, a, y, i, ccMatch };
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

	public static final Object[] pattern_whileulul2branchubub_24_6_createcorrespondence_greenBFBBBBFBBBFFB(While c,
			Assignment d, Branch x, Assignment b, Command v, Branch z, While a, Command y, CCMatch ccMatch) {
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		c2z.setSource(c);
		c2z.setTarget(z);
		ccMatch.getCreateCorr().add(c2z);
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		d2v.setTarget(v);
		d2v.setSource(d);
		ccMatch.getCreateCorr().add(d2v);
		return new Object[] { c, c2z, d, x, b, v, a2x, z, a, y, b2y, d2v, ccMatch };
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

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_0B(While c) {
		for (Decision __DEC_c_positive_602408 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_1B(While c) {
		for (Decision __DEC_c_negative_712630 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_2BBB(While c, While w,
			While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_first_33590 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "first")) {
						if (!c.equals(__DEC_c_first_33590)) {
							if (!w.equals(__DEC_c_first_33590)) {
								if (!a.equals(__DEC_c_first_33590)) {
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

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_3BBB(While c, While w,
			While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_last_852924 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "last")) {
						if (!c.equals(__DEC_c_last_852924)) {
							if (!w.equals(__DEC_c_last_852924)) {
								if (!a.equals(__DEC_c_last_852924)) {
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

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_4B(While c) {
		for (Program __DEC_c_first_827848 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_5B(Assignment d) {
		for (Decision __DEC_d_positive_998701 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_6B(Assignment d) {
		for (Decision __DEC_d_negative_504379 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_7BBBB(Assignment d,
			While c, While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_d_last_459650 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "last")) {
						if (!c.equals(__DEC_d_last_459650)) {
							if (!w.equals(__DEC_d_last_459650)) {
								if (!a.equals(__DEC_d_last_459650)) {
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

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_8B(Assignment d) {
		for (Program __DEC_d_first_82289 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_9B(Assignment b) {
		for (Decision __DEC_b_positive_968753 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_10B(Assignment b) {
		for (Decision __DEC_b_negative_980771 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_11BBBB(Assignment b,
			While c, While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_b_last_214160 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "last")) {
						if (!c.equals(__DEC_b_last_214160)) {
							if (!w.equals(__DEC_b_last_214160)) {
								if (!a.equals(__DEC_b_last_214160)) {
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

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_12B(Assignment b) {
		for (Program __DEC_b_first_679813 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_13B(While a) {
		for (Decision __DEC_a_positive_379889 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_14B(While a) {
		for (Decision __DEC_a_negative_878808 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_15BBB(While a, While c,
			While w) {
		if (!a.equals(c)) {
			if (!a.equals(w)) {
				if (!c.equals(w)) {
					for (While __DEC_a_last_334102 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, While.class, "last")) {
						if (!a.equals(__DEC_a_last_334102)) {
							if (!c.equals(__DEC_a_last_334102)) {
								if (!w.equals(__DEC_a_last_334102)) {
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

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_16B(While a) {
		for (Program __DEC_a_first_899797 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_17BB(While w,
			Assignment d) {
		if (d.equals(w.getLast())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_18BB(While a,
			Assignment d) {
		if (d.equals(a.getLast())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_19BB(While c,
			Assignment b) {
		if (b.equals(c.getLast())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_20BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_21BB(While c, While a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_22BB(While w, While a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_blackBBBBB(While c, Assignment d,
			Assignment b, While w, While a) {
		if (!c.equals(w)) {
			if (!b.equals(d)) {
				if (!a.equals(c)) {
					if (!a.equals(w)) {
						if (d.equals(c.getFirst())) {
							if (a.equals(w.getFirst())) {
								if (b.equals(a.getFirst())) {
									if (d.equals(c.getLast())) {
										if (b.equals(a.getLast())) {
											if (c.equals(w.getNext())) {
												if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_0B(
														c) == null) {
													if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_1B(
															c) == null) {
														if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_2BBB(
																c, w, a) == null) {
															if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_3BBB(
																	c, w, a) == null) {
																if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_4B(
																		c) == null) {
																	if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_5B(
																			d) == null) {
																		if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_6B(
																				d) == null) {
																			if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_7BBBB(
																					d, c, w, a) == null) {
																				if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_8B(
																						d) == null) {
																					if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_9B(
																							b) == null) {
																						if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_10B(
																								b) == null) {
																							if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_11BBBB(
																									b, c, w,
																									a) == null) {
																								if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_12B(
																										b) == null) {
																									if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_13B(
																											a) == null) {
																										if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_14B(
																												a) == null) {
																											if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_15BBB(
																													a,
																													c,
																													w) == null) {
																												if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_16B(
																														a) == null) {
																													if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_17BB(
																															w,
																															d) == null) {
																														if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_18BB(
																																a,
																																d) == null) {
																															if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_19BB(
																																	c,
																																	b) == null) {
																																if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_20BB(
																																		w,
																																		b) == null) {
																																	if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_21BB(
																																			c,
																																			a) == null) {
																																		if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_22BB(
																																				w,
																																				a) == null) {
																																			return new Object[] {
																																					c,
																																					d,
																																					b,
																																					w,
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

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_959972 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_1BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_71655 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_71655)) {
							if (!z.equals(__DEC_x_positive_71655)) {
								if (!i.equals(__DEC_x_positive_71655)) {
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

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_2BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_441691 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_441691)) {
							if (!z.equals(__DEC_x_negative_441691)) {
								if (!i.equals(__DEC_x_negative_441691)) {
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

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_3B(Command v) {
		for (Graph __DEC_v_root_32905 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(v,
				Graph.class, "root")) {
			return new Object[] { v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_4BBBB(Command v, Branch x,
			Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_v_positive_898686 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "positive")) {
						if (!x.equals(__DEC_v_positive_898686)) {
							if (!z.equals(__DEC_v_positive_898686)) {
								if (!i.equals(__DEC_v_positive_898686)) {
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

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_5BBBB(Command v, Branch x,
			Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_v_negative_988470 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "negative")) {
						if (!x.equals(__DEC_v_negative_988470)) {
							if (!z.equals(__DEC_v_negative_988470)) {
								if (!i.equals(__DEC_v_negative_988470)) {
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

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_6B(Branch z) {
		for (Graph __DEC_z_root_984538 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
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
					for (Branch __DEC_z_positive_337317 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_337317)) {
							if (!x.equals(__DEC_z_positive_337317)) {
								if (!i.equals(__DEC_z_positive_337317)) {
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
					for (Branch __DEC_z_negative_141355 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_141355)) {
							if (!x.equals(__DEC_z_negative_141355)) {
								if (!i.equals(__DEC_z_negative_141355)) {
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
		for (Graph __DEC_y_root_94417 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
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
					for (Branch __DEC_y_positive_411727 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!x.equals(__DEC_y_positive_411727)) {
							if (!z.equals(__DEC_y_positive_411727)) {
								if (!i.equals(__DEC_y_positive_411727)) {
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
					for (Branch __DEC_y_negative_705648 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!x.equals(__DEC_y_negative_705648)) {
							if (!z.equals(__DEC_y_negative_705648)) {
								if (!i.equals(__DEC_y_negative_705648)) {
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

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_blackBBBBB(Branch x, Command v,
			Branch z, Command y, Branch i) {
		if (!x.equals(z)) {
			if (!v.equals(y)) {
				if (!i.equals(x)) {
					if (!i.equals(z)) {
						if (y.equals(x.getPositive())) {
							if (z.equals(v.getNext())) {
								if (v.equals(z.getPositive())) {
									if (x.equals(y.getNext())) {
										if (x.equals(i.getPositive())) {
											if (z.equals(i.getNegative())) {
												if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_0B(
														x) == null) {
													if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_1BBB(
															x, z, i) == null) {
														if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_2BBB(
																x, z, i) == null) {
															if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_3B(
																	v) == null) {
																if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_4BBBB(
																		v, x, z, i) == null) {
																	if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_5BBBB(
																			v, x, z, i) == null) {
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
																																						x,
																																						v,
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
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
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
							if (pattern_whileulul2branchubub_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									w2i) == null) {
								if (pattern_whileulul2branchubub_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										w) == null) {
									if (pattern_whileulul2branchubub_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_whileulul2branchubub_29_3_solveCSP_bindingFBBBBBB(whileulul2branchubub _this,
			IsApplicableMatch isApplicableMatch, While w, S2B w2i, Branch i, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, w, w2i, i, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, w2i, i, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileulul2branchubub_29_3_solveCSP_bindingAndBlackFBBBBBB(
			whileulul2branchubub _this, IsApplicableMatch isApplicableMatch, While w, S2B w2i, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whileulul2branchubub_29_3_solveCSP_binding = pattern_whileulul2branchubub_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, w, w2i, i, ruleResult);
		if (result_pattern_whileulul2branchubub_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileulul2branchubub_29_3_solveCSP_binding[0];

			Object[] result_pattern_whileulul2branchubub_29_3_solveCSP_black = pattern_whileulul2branchubub_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whileulul2branchubub_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, w2i, i, ruleResult };
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

	public static final Object[] pattern_whileulul2branchubub_29_5_checknacs_blackBBB(While w, S2B w2i, Branch i) {
		return new Object[] { w, w2i, i };
	}

	public static final Object[] pattern_whileulul2branchubub_29_6_perform_blackBBBB(While w, S2B w2i, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { w, w2i, i, ruleResult };
	}

	public static final Object[] pattern_whileulul2branchubub_29_6_perform_greenFFFFFBFFFFFFFBB(While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment d = SourcecodeFactory.eINSTANCE.createAssignment();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		Command v = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		w.setNext(c);
		ruleResult.getSourceObjects().add(c);
		c2z.setSource(c);
		ruleResult.getCorrObjects().add(c2z);
		c.setFirst(d);
		c.setLast(d);
		ruleResult.getSourceObjects().add(d);
		i.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		ruleResult.getSourceObjects().add(b);
		ruleResult.getTargetObjects().add(v);
		a2x.setTarget(x);
		ruleResult.getCorrObjects().add(a2x);
		v.setNext(z);
		c2z.setTarget(z);
		z.setPositive(v);
		i.setNegative(z);
		ruleResult.getTargetObjects().add(z);
		w.setFirst(a);
		a.setFirst(b);
		a2x.setSource(a);
		a.setLast(b);
		ruleResult.getSourceObjects().add(a);
		x.setPositive(y);
		y.setNext(x);
		ruleResult.getTargetObjects().add(y);
		b2y.setTarget(y);
		b2y.setSource(b);
		ruleResult.getCorrObjects().add(b2y);
		d2v.setTarget(v);
		d2v.setSource(d);
		ruleResult.getCorrObjects().add(d2v);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { c, c2z, d, x, b, w, v, a2x, z, a, y, b2y, d2v, i, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whileulul2branchubub_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whileulul2branchububImpl