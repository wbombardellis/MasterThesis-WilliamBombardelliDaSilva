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
	public boolean isAppropriate_FWD(Match match, Assignment d, While w, Assignment b, While c, While a) {

		Object[] result1_black = whileulul2branchububImpl
				.pattern_whileulul2branchubub_0_1_initialbindings_blackBBBBBBB(this, match, d, w, b, c, a);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[d] = " + d + ", " + "[w] = " + w + ", " + "[b] = " + b + ", "
					+ "[c] = " + c + ", " + "[a] = " + a + ".");
		}

		Object[] result2_bindingAndBlack = whileulul2branchububImpl
				.pattern_whileulul2branchubub_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, d, w, b, c, a);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[d] = " + d + ", " + "[w] = " + w + ", " + "[b] = " + b + ", "
					+ "[c] = " + c + ", " + "[a] = " + a + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileulul2branchububImpl.pattern_whileulul2branchubub_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileulul2branchububImpl
					.pattern_whileulul2branchubub_0_4_collectelementstobetranslated_blackBBBBBB(match, d, w, b, c, a);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[d] = " + d + ", "
								+ "[w] = " + w + ", " + "[b] = " + b + ", " + "[c] = " + c + ", " + "[a] = " + a + ".");
			}
			whileulul2branchububImpl.pattern_whileulul2branchubub_0_4_collectelementstobetranslated_greenBBBBBBFFFFFF(
					match, d, w, b, c, a);
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge c__d____last = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge a__b____first = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge c__d____first = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[11];

			Object[] result5_black = whileulul2branchububImpl
					.pattern_whileulul2branchubub_0_5_collectcontextelements_blackBBBBBB(match, d, w, b, c, a);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[d] = " + d + ", "
								+ "[w] = " + w + ", " + "[b] = " + b + ", " + "[c] = " + c + ", " + "[a] = " + a + ".");
			}
			whileulul2branchububImpl.pattern_whileulul2branchubub_0_5_collectcontextelements_greenBB(match, w);

			// 
			whileulul2branchububImpl.pattern_whileulul2branchubub_0_6_registerobjectstomatch_expressionBBBBBBB(this,
					match, d, w, b, c, a);
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
		Assignment d = (Assignment) result1_bindingAndBlack[0];
		S2B w2i = (S2B) result1_bindingAndBlack[1];
		Branch i = (Branch) result1_bindingAndBlack[2];
		While w = (While) result1_bindingAndBlack[3];
		Assignment b = (Assignment) result1_bindingAndBlack[4];
		While c = (While) result1_bindingAndBlack[5];
		While a = (While) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = whileulul2branchububImpl
				.pattern_whileulul2branchubub_1_1_performtransformation_greenFFFFBFFFFBBBB(d, i, b, c, a);
		Command y = (Command) result1_green[0];
		Command v = (Command) result1_green[1];
		S2N b2y = (S2N) result1_green[2];
		S2N d2v = (S2N) result1_green[3];
		Branch z = (Branch) result1_green[5];
		S2B c2z = (S2B) result1_green[6];
		S2B a2x = (S2B) result1_green[7];
		Branch x = (Branch) result1_green[8];

		Object[] result2_black = whileulul2branchububImpl
				.pattern_whileulul2branchubub_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(y, v, b2y, d2v, d, z, c2z,
						a2x, x, b, c, a);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[y] = " + y + ", " + "[v] = " + v
					+ ", " + "[b2y] = " + b2y + ", " + "[d2v] = " + d2v + ", " + "[d] = " + d + ", " + "[z] = " + z
					+ ", " + "[c2z] = " + c2z + ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", " + "[b] = " + b
					+ ", " + "[c] = " + c + ", " + "[a] = " + a + ".");
		}
		Object[] result2_green = whileulul2branchububImpl
				.pattern_whileulul2branchubub_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(y, v, b2y, d2v, d, z,
						c2z, a2x, x, b, c, a);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileulul2branchububImpl
				.pattern_whileulul2branchubub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, y, v, b2y, d2v,
						d, z, c2z, a2x, x, w2i, i, w, b, c, a);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[y] = " + y + ", " + "[v] = " + v + ", " + "[b2y] = " + b2y + ", " + "[d2v] = " + d2v
					+ ", " + "[d] = " + d + ", " + "[z] = " + z + ", " + "[c2z] = " + c2z + ", " + "[a2x] = " + a2x
					+ ", " + "[x] = " + x + ", " + "[w2i] = " + w2i + ", " + "[i] = " + i + ", " + "[w] = " + w + ", "
					+ "[b] = " + b + ", " + "[c] = " + c + ", " + "[a] = " + a + ".");
		}
		whileulul2branchububImpl
				.pattern_whileulul2branchubub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
						ruleresult, y, v, b2y, d2v, d, z, c2z, a2x, x, i, w, b, c, a);
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge d2v__v____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge d2v__d____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge c__d____first = (EMoflonEdge) result3_green[32];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[33];
		//nothing EMoflonEdge z__v____positive = (EMoflonEdge) result3_green[34];

		// 
		// 
		whileulul2branchububImpl.pattern_whileulul2branchubub_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this,
				ruleresult, y, v, b2y, d2v, d, z, c2z, a2x, x, w2i, i, w, b, c, a);
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
		Assignment d = (Assignment) result2_binding[0];
		While w = (While) result2_binding[1];
		Assignment b = (Assignment) result2_binding[2];
		While c = (While) result2_binding[3];
		While a = (While) result2_binding[4];
		for (Object[] result2_black : whileulul2branchububImpl
				.pattern_whileulul2branchubub_2_2_corematch_blackBFFBBBBB(d, w, b, c, a, match)) {
			S2B w2i = (S2B) result2_black[1];
			Branch i = (Branch) result2_black[2];
			// ForEach 
			for (Object[] result3_black : whileulul2branchububImpl
					.pattern_whileulul2branchubub_2_3_findcontext_blackBBBBBBB(d, w2i, i, w, b, c, a)) {
				Object[] result3_green = whileulul2branchububImpl
						.pattern_whileulul2branchubub_2_3_findcontext_greenBBBBBBBFFFFFFFFF(d, w2i, i, w, b, c, a);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge c__d____first = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = whileulul2branchububImpl
						.pattern_whileulul2branchubub_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, d,
								w2i, i, w, b, c, a);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d] = " + d + ", " + "[w2i] = "
							+ w2i + ", " + "[i] = " + i + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[c] = "
							+ c + ", " + "[a] = " + a + ".");
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
	public void registerObjectsToMatch_FWD(Match match, Assignment d, While w, Assignment b, While c, While a) {
		match.registerObject("d", d);
		match.registerObject("w", w);
		match.registerObject("b", b);
		match.registerObject("c", c);
		match.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment d, While w, Assignment b, While c, While a) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Assignment d, S2B w2i, Branch i, While w,
			Assignment b, While c, While a) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("c", c);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject y, EObject v, EObject b2y, EObject d2v,
			EObject d, EObject z, EObject c2z, EObject a2x, EObject x, EObject w2i, EObject i, EObject w, EObject b,
			EObject c, EObject a) {
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("v", v);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("d2v", d2v);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("d").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command y, Command v, Branch z, Branch x, Branch i) {

		Object[] result1_black = whileulul2branchububImpl
				.pattern_whileulul2branchubub_10_1_initialbindings_blackBBBBBBB(this, match, y, v, z, x, i);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[v] = " + v + ", " + "[z] = " + z + ", "
					+ "[x] = " + x + ", " + "[i] = " + i + ".");
		}

		Object[] result2_bindingAndBlack = whileulul2branchububImpl
				.pattern_whileulul2branchubub_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, y, v, z, x, i);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[v] = " + v + ", " + "[z] = " + z + ", "
					+ "[x] = " + x + ", " + "[i] = " + i + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileulul2branchububImpl.pattern_whileulul2branchubub_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileulul2branchububImpl
					.pattern_whileulul2branchubub_10_4_collectelementstobetranslated_blackBBBBBB(match, y, v, z, x, i);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[y] = " + y + ", "
								+ "[v] = " + v + ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[i] = " + i + ".");
			}
			whileulul2branchububImpl.pattern_whileulul2branchubub_10_4_collectelementstobetranslated_greenBBBBBBFFFFFF(
					match, y, v, z, x, i);
			//nothing EMoflonEdge y__x____next = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge v__z____next = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge z__v____positive = (EMoflonEdge) result4_green[11];

			Object[] result5_black = whileulul2branchububImpl
					.pattern_whileulul2branchubub_10_5_collectcontextelements_blackBBBBBB(match, y, v, z, x, i);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[y] = " + y + ", "
								+ "[v] = " + v + ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[i] = " + i + ".");
			}
			whileulul2branchububImpl.pattern_whileulul2branchubub_10_5_collectcontextelements_greenBB(match, i);

			// 
			whileulul2branchububImpl.pattern_whileulul2branchubub_10_6_registerobjectstomatch_expressionBBBBBBB(this,
					match, y, v, z, x, i);
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
		Command y = (Command) result1_bindingAndBlack[0];
		Command v = (Command) result1_bindingAndBlack[1];
		Branch z = (Branch) result1_bindingAndBlack[2];
		Branch x = (Branch) result1_bindingAndBlack[3];
		S2B w2i = (S2B) result1_bindingAndBlack[4];
		Branch i = (Branch) result1_bindingAndBlack[5];
		While w = (While) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = whileulul2branchububImpl
				.pattern_whileulul2branchubub_11_1_performtransformation_greenBBFFFBFFBBFFF(y, v, z, x, w);
		S2N b2y = (S2N) result1_green[2];
		S2N d2v = (S2N) result1_green[3];
		Assignment d = (Assignment) result1_green[4];
		S2B c2z = (S2B) result1_green[6];
		S2B a2x = (S2B) result1_green[7];
		Assignment b = (Assignment) result1_green[10];
		While c = (While) result1_green[11];
		While a = (While) result1_green[12];

		Object[] result2_black = whileulul2branchububImpl
				.pattern_whileulul2branchubub_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(y, v, b2y, d2v, d, z,
						c2z, a2x, x, b, c, a);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[y] = " + y + ", " + "[v] = " + v
					+ ", " + "[b2y] = " + b2y + ", " + "[d2v] = " + d2v + ", " + "[d] = " + d + ", " + "[z] = " + z
					+ ", " + "[c2z] = " + c2z + ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", " + "[b] = " + b
					+ ", " + "[c] = " + c + ", " + "[a] = " + a + ".");
		}
		Object[] result2_green = whileulul2branchububImpl
				.pattern_whileulul2branchubub_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(y, v, b2y, d2v, d, z,
						c2z, a2x, x, b, c, a);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileulul2branchububImpl
				.pattern_whileulul2branchubub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, y, v, b2y, d2v,
						d, z, c2z, a2x, x, w2i, i, w, b, c, a);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[y] = " + y + ", " + "[v] = " + v + ", " + "[b2y] = " + b2y + ", " + "[d2v] = " + d2v
					+ ", " + "[d] = " + d + ", " + "[z] = " + z + ", " + "[c2z] = " + c2z + ", " + "[a2x] = " + a2x
					+ ", " + "[x] = " + x + ", " + "[w2i] = " + w2i + ", " + "[i] = " + i + ", " + "[w] = " + w + ", "
					+ "[b] = " + b + ", " + "[c] = " + c + ", " + "[a] = " + a + ".");
		}
		whileulul2branchububImpl
				.pattern_whileulul2branchubub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
						ruleresult, y, v, b2y, d2v, d, z, c2z, a2x, x, i, w, b, c, a);
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge d2v__v____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge d2v__d____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge c__d____first = (EMoflonEdge) result3_green[32];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[33];
		//nothing EMoflonEdge z__v____positive = (EMoflonEdge) result3_green[34];

		// 
		// 
		whileulul2branchububImpl.pattern_whileulul2branchubub_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this,
				ruleresult, y, v, b2y, d2v, d, z, c2z, a2x, x, w2i, i, w, b, c, a);
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
		Command y = (Command) result2_binding[0];
		Command v = (Command) result2_binding[1];
		Branch z = (Branch) result2_binding[2];
		Branch x = (Branch) result2_binding[3];
		Branch i = (Branch) result2_binding[4];
		for (Object[] result2_black : whileulul2branchububImpl
				.pattern_whileulul2branchubub_12_2_corematch_blackBBBBFBFB(y, v, z, x, i, match)) {
			S2B w2i = (S2B) result2_black[4];
			While w = (While) result2_black[6];
			// ForEach 
			for (Object[] result3_black : whileulul2branchububImpl
					.pattern_whileulul2branchubub_12_3_findcontext_blackBBBBBBB(y, v, z, x, w2i, i, w)) {
				Object[] result3_green = whileulul2branchububImpl
						.pattern_whileulul2branchubub_12_3_findcontext_greenBBBBBBBFFFFFFFFF(y, v, z, x, w2i, i, w);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge z__v____positive = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = whileulul2branchububImpl
						.pattern_whileulul2branchubub_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								y, v, z, x, w2i, i, w);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[y] = " + y + ", " + "[v] = " + v
							+ ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[w2i] = " + w2i + ", " + "[i] = " + i
							+ ", " + "[w] = " + w + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Command y, Command v, Branch z, Branch x, Branch i) {
		match.registerObject("y", y);
		match.registerObject("v", v);
		match.registerObject("z", z);
		match.registerObject("x", x);
		match.registerObject("i", i);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command y, Command v, Branch z, Branch x, Branch i) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Command y, Command v, Branch z, Branch x,
			S2B w2i, Branch i, While w) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("v", v);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("x", x);
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
	public boolean isApplicable_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject y, EObject v, EObject b2y, EObject d2v,
			EObject d, EObject z, EObject c2z, EObject a2x, EObject x, EObject w2i, EObject i, EObject w, EObject b,
			EObject c, EObject a) {
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("v", v);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("d2v", d2v);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("v").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_28(EMoflonEdge _edge_next) {

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
				.pattern_whileulul2branchubub_20_2_testcorematchandDECs_blackFFFFFB(_edge_next)) {
			Command y = (Command) result2_black[0];
			Command v = (Command) result2_black[1];
			Branch z = (Branch) result2_black[2];
			Branch x = (Branch) result2_black[3];
			Branch i = (Branch) result2_black[4];
			Object[] result2_green = whileulul2branchububImpl
					.pattern_whileulul2branchubub_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileulul2branchububImpl
					.pattern_whileulul2branchubub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
							this, match, y, v, z, x, i)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_28(EMoflonEdge _edge_first) {

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
			Assignment d = (Assignment) result2_black[0];
			While w = (While) result2_black[1];
			Assignment b = (Assignment) result2_black[2];
			While c = (While) result2_black[3];
			While a = (While) result2_black[4];
			Object[] result2_green = whileulul2branchububImpl
					.pattern_whileulul2branchubub_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileulul2branchububImpl
					.pattern_whileulul2branchubub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
							this, match, d, w, b, c, a)) {
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
		Command y = (Command) result2_bindingAndBlack[0];
		Command v = (Command) result2_bindingAndBlack[1];
		Assignment d = (Assignment) result2_bindingAndBlack[2];
		Branch z = (Branch) result2_bindingAndBlack[3];
		Branch x = (Branch) result2_bindingAndBlack[4];
		Branch i = (Branch) result2_bindingAndBlack[5];
		While w = (While) result2_bindingAndBlack[6];
		Assignment b = (Assignment) result2_bindingAndBlack[7];
		While c = (While) result2_bindingAndBlack[8];
		While a = (While) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = whileulul2branchububImpl
				.pattern_whileulul2branchubub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, y, v, d, z, x, i, w, b,
						c, a, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[y] = " + y + ", " + "[v] = " + v + ", " + "[d] = " + d + ", " + "[z] = " + z + ", " + "[x] = "
					+ x + ", " + "[i] = " + i + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[c] = " + c + ", "
					+ "[a] = " + a + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whileulul2branchububImpl.pattern_whileulul2branchubub_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whileulul2branchububImpl
					.pattern_whileulul2branchubub_24_5_matchcorrcontext_blackFBBBB(i, w, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[0];
				Object[] result5_green = whileulul2branchububImpl
						.pattern_whileulul2branchubub_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whileulul2branchububImpl
						.pattern_whileulul2branchubub_24_6_createcorrespondence_blackBBBBBBBBBBB(y, v, d, z, x, i, w, b,
								c, a, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[y] = " + y + ", "
							+ "[v] = " + v + ", " + "[d] = " + d + ", " + "[z] = " + z + ", " + "[x] = " + x + ", "
							+ "[i] = " + i + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[c] = " + c + ", "
							+ "[a] = " + a + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whileulul2branchububImpl.pattern_whileulul2branchubub_24_6_createcorrespondence_greenBBFFBBFFBBBBB(y, v,
						d, z, x, b, c, a, ccMatch);
				//nothing S2N b2y = (S2N) result6_green[2];
				//nothing S2N d2v = (S2N) result6_green[3];
				//nothing S2B c2z = (S2B) result6_green[6];
				//nothing S2B a2x = (S2B) result6_green[7];

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
	public CSP isApplicable_solveCsp_CC(Command y, Command v, Assignment d, Branch z, Branch x, Branch i, While w,
			Assignment b, While c, While a, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Assignment d, While w, Assignment b, While c, While a) {// 
		Object[] result1_black = whileulul2branchububImpl
				.pattern_whileulul2branchubub_27_1_matchtggpattern_blackBBBBB(d, w, b, c, a);
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
	public boolean checkDEC_BWD(Command y, Command v, Branch z, Branch x, Branch i) {// 
		Object[] result1_black = whileulul2branchububImpl
				.pattern_whileulul2branchubub_28_1_matchtggpattern_blackBBBBB(y, v, z, x, i);
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
			Branch i = (Branch) result2_black[2];
			While w = (While) result2_black[3];

			Object[] result3_bindingAndBlack = whileulul2branchububImpl
					.pattern_whileulul2branchubub_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, w2i, i,
							w, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w2i] = " + w2i + ", " + "[i] = " + i
						+ ", " + "[w] = " + w + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whileulul2branchububImpl.pattern_whileulul2branchubub_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whileulul2branchububImpl
						.pattern_whileulul2branchubub_29_5_checknacs_blackBBB(w2i, i, w);
				if (result5_black != null) {

					Object[] result6_black = whileulul2branchububImpl
							.pattern_whileulul2branchubub_29_6_perform_blackBBBB(w2i, i, w, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w2i] = " + w2i + ", "
								+ "[i] = " + i + ", " + "[w] = " + w + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whileulul2branchububImpl.pattern_whileulul2branchubub_29_6_perform_greenFFFFFFFFFBBFFFB(i, w,
							ruleResult);
					//nothing Command y = (Command) result6_green[0];
					//nothing Command v = (Command) result6_green[1];
					//nothing S2N b2y = (S2N) result6_green[2];
					//nothing S2N d2v = (S2N) result6_green[3];
					//nothing Assignment d = (Assignment) result6_green[4];
					//nothing Branch z = (Branch) result6_green[5];
					//nothing S2B c2z = (S2B) result6_green[6];
					//nothing S2B a2x = (S2B) result6_green[7];
					//nothing Branch x = (Branch) result6_green[8];
					//nothing Assignment b = (Assignment) result6_green[11];
					//nothing While c = (While) result6_green[12];
					//nothing While a = (While) result6_green[13];

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
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_WHILE_ASSIGNMENT_WHILE_WHILE:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (While) arguments.get(4), (While) arguments.get(5));
		case RulesPackage.WHILEULUL2BRANCHUBUB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_WHILE_ASSIGNMENT_WHILE_WHILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4),
					(While) arguments.get(5));
			return null;
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_WHILE_ASSIGNMENT_WHILE_WHILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4),
					(While) arguments.get(5));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASSIGNMENT_S2B_BRANCH_WHILE_ASSIGNMENT_WHILE_WHILE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(S2B) arguments.get(2), (Branch) arguments.get(3), (While) arguments.get(4),
					(Assignment) arguments.get(5), (While) arguments.get(6), (While) arguments.get(7));
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
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPROPRIATE_BWD__MATCH_COMMAND_COMMAND_BRANCH_BRANCH_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4), (Branch) arguments.get(5));
		case RulesPackage.WHILEULUL2BRANCHUBUB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_COMMAND_BRANCH_BRANCH_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4), (Branch) arguments.get(5));
			return null;
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_COMMAND_BRANCH_BRANCH_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4),
					(Branch) arguments.get(5));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMMAND_COMMAND_BRANCH_BRANCH_S2B_BRANCH_WHILE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Command) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4),
					(S2B) arguments.get(5), (Branch) arguments.get(6), (While) arguments.get(7));
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
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_28__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_28((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_28__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_28((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPLICABLE_SOLVE_CSP_CC__COMMAND_COMMAND_ASSIGNMENT_BRANCH_BRANCH_BRANCH_WHILE_ASSIGNMENT_WHILE_WHILE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Command) arguments.get(0), (Command) arguments.get(1),
					(Assignment) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4),
					(Branch) arguments.get(5), (While) arguments.get(6), (Assignment) arguments.get(7),
					(While) arguments.get(8), (While) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.WHILEULUL2BRANCHUBUB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEULUL2BRANCHUBUB___CHECK_DEC_FWD__ASSIGNMENT_WHILE_ASSIGNMENT_WHILE_WHILE:
			return checkDEC_FWD((Assignment) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(While) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.WHILEULUL2BRANCHUBUB___CHECK_DEC_BWD__COMMAND_COMMAND_BRANCH_BRANCH_BRANCH:
			return checkDEC_BWD((Command) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.WHILEULUL2BRANCHUBUB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILEULUL2BRANCHUBUB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_BRANCH_WHILE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Branch) arguments.get(2), (While) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILEULUL2BRANCHUBUB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whileulul2branchubub_0_1_initialbindings_blackBBBBBBB(
			whileulul2branchubub _this, Match match, Assignment d, While w, Assignment b, While c, While a) {
		if (!b.equals(d)) {
			if (!c.equals(w)) {
				if (!a.equals(w)) {
					if (!a.equals(c)) {
						return new Object[] { _this, match, d, w, b, c, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_0_2_SolveCSP_bindingFBBBBBBB(whileulul2branchubub _this,
			Match match, Assignment d, While w, Assignment b, While c, While a) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, d, w, b, c, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, d, w, b, c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileulul2branchubub_0_2_SolveCSP_bindingAndBlackFBBBBBBB(
			whileulul2branchubub _this, Match match, Assignment d, While w, Assignment b, While c, While a) {
		Object[] result_pattern_whileulul2branchubub_0_2_SolveCSP_binding = pattern_whileulul2branchubub_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, d, w, b, c, a);
		if (result_pattern_whileulul2branchubub_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileulul2branchubub_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whileulul2branchubub_0_2_SolveCSP_black = pattern_whileulul2branchubub_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileulul2branchubub_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, d, w, b, c, a };
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
			Assignment d, While w, Assignment b, While c, While a) {
		if (!b.equals(d)) {
			if (!c.equals(w)) {
				if (!a.equals(w)) {
					if (!a.equals(c)) {
						return new Object[] { match, d, w, b, c, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_0_4_collectelementstobetranslated_greenBBBBBBFFFFFF(
			Match match, Assignment d, While w, Assignment b, While c, While a) {
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(d);
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(c);
		match.getToBeTranslatedNodes().add(a);
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String c__d____last_name_prime = "last";
		String a__b____first_name_prime = "first";
		String c__d____first_name_prime = "first";
		String a__b____last_name_prime = "last";
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		match.getToBeTranslatedEdges().add(c__d____last);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____first);
		c__d____first.setSrc(c);
		c__d____first.setTrg(d);
		match.getToBeTranslatedEdges().add(c__d____first);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____last);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		c__d____first.setName(c__d____first_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		return new Object[] { match, d, w, b, c, a, w__a____first, w__c____next, c__d____last, a__b____first,
				c__d____first, a__b____last };
	}

	public static final Object[] pattern_whileulul2branchubub_0_5_collectcontextelements_blackBBBBBB(Match match,
			Assignment d, While w, Assignment b, While c, While a) {
		if (!b.equals(d)) {
			if (!c.equals(w)) {
				if (!a.equals(w)) {
					if (!a.equals(c)) {
						return new Object[] { match, d, w, b, c, a };
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
			whileulul2branchubub _this, Match match, Assignment d, While w, Assignment b, While c, While a) {
		_this.registerObjectsToMatch_FWD(match, d, w, b, c, a);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("d");
		EObject _localVariable_1 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_2 = isApplicableMatch.getObject("i");
		EObject _localVariable_3 = isApplicableMatch.getObject("w");
		EObject _localVariable_4 = isApplicableMatch.getObject("b");
		EObject _localVariable_5 = isApplicableMatch.getObject("c");
		EObject _localVariable_6 = isApplicableMatch.getObject("a");
		EObject tmpD = _localVariable_0;
		EObject tmpW2i = _localVariable_1;
		EObject tmpI = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpB = _localVariable_4;
		EObject tmpC = _localVariable_5;
		EObject tmpA = _localVariable_6;
		if (tmpD instanceof Assignment) {
			Assignment d = (Assignment) tmpD;
			if (tmpW2i instanceof S2B) {
				S2B w2i = (S2B) tmpW2i;
				if (tmpI instanceof Branch) {
					Branch i = (Branch) tmpI;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						if (tmpB instanceof Assignment) {
							Assignment b = (Assignment) tmpB;
							if (tmpC instanceof While) {
								While c = (While) tmpC;
								if (tmpA instanceof While) {
									While a = (While) tmpA;
									return new Object[] { d, w2i, i, w, b, c, a, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_1_1_performtransformation_blackBBBBBBBFBB(Assignment d,
			S2B w2i, Branch i, While w, Assignment b, While c, While a, whileulul2branchubub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!b.equals(d)) {
			if (!c.equals(w)) {
				if (!a.equals(w)) {
					if (!a.equals(c)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { d, w2i, i, w, b, c, a, csp, _this, isApplicableMatch };
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
			Assignment d = (Assignment) result_pattern_whileulul2branchubub_1_1_performtransformation_binding[0];
			S2B w2i = (S2B) result_pattern_whileulul2branchubub_1_1_performtransformation_binding[1];
			Branch i = (Branch) result_pattern_whileulul2branchubub_1_1_performtransformation_binding[2];
			While w = (While) result_pattern_whileulul2branchubub_1_1_performtransformation_binding[3];
			Assignment b = (Assignment) result_pattern_whileulul2branchubub_1_1_performtransformation_binding[4];
			While c = (While) result_pattern_whileulul2branchubub_1_1_performtransformation_binding[5];
			While a = (While) result_pattern_whileulul2branchubub_1_1_performtransformation_binding[6];

			Object[] result_pattern_whileulul2branchubub_1_1_performtransformation_black = pattern_whileulul2branchubub_1_1_performtransformation_blackBBBBBBBFBB(
					d, w2i, i, w, b, c, a, _this, isApplicableMatch);
			if (result_pattern_whileulul2branchubub_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileulul2branchubub_1_1_performtransformation_black[7];

				return new Object[] { d, w2i, i, w, b, c, a, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_1_1_performtransformation_greenFFFFBFFFFBBBB(Assignment d,
			Branch i, Assignment b, While c, While a) {
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Command v = ControlflowFactory.eINSTANCE.createCommand();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		b2y.setTarget(y);
		b2y.setSource(b);
		d2v.setTarget(v);
		d2v.setSource(d);
		i.setNegative(z);
		v.setNext(z);
		z.setPositive(v);
		c2z.setTarget(z);
		c2z.setSource(c);
		a2x.setSource(a);
		y.setNext(x);
		a2x.setTarget(x);
		i.setPositive(x);
		x.setPositive(y);
		return new Object[] { y, v, b2y, d2v, d, z, c2z, a2x, x, i, b, c, a };
	}

	public static final Object[] pattern_whileulul2branchubub_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(Command y,
			Command v, S2N b2y, S2N d2v, Assignment d, Branch z, S2B c2z, S2B a2x, Branch x, Assignment b, While c,
			While a) {
		if (!v.equals(y)) {
			if (!b2y.equals(d2v)) {
				if (!a2x.equals(c2z)) {
					if (!x.equals(z)) {
						if (!b.equals(d)) {
							if (!a.equals(c)) {
								return new Object[] { y, v, b2y, d2v, d, z, c2z, a2x, x, b, c, a };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(
			Command y, Command v, S2N b2y, S2N d2v, Assignment d, Branch z, S2B c2z, S2B a2x, Branch x, Assignment b,
			While c, While a) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedElements().add(v);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(d2v);
		ruleresult.getTranslatedElements().add(d);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getTranslatedElements().add(a);
		return new Object[] { ruleresult, y, v, b2y, d2v, d, z, c2z, a2x, x, b, c, a };
	}

	public static final Object[] pattern_whileulul2branchubub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject y, EObject v, EObject b2y, EObject d2v, EObject d, EObject z,
			EObject c2z, EObject a2x, EObject x, EObject w2i, EObject i, EObject w, EObject b, EObject c, EObject a) {
		if (!y.equals(z)) {
			if (!v.equals(y)) {
				if (!v.equals(z)) {
					if (!v.equals(x)) {
						if (!v.equals(w2i)) {
							if (!v.equals(w)) {
								if (!b2y.equals(y)) {
									if (!b2y.equals(v)) {
										if (!b2y.equals(d2v)) {
											if (!b2y.equals(d)) {
												if (!b2y.equals(z)) {
													if (!b2y.equals(c2z)) {
														if (!b2y.equals(x)) {
															if (!b2y.equals(w2i)) {
																if (!b2y.equals(i)) {
																	if (!b2y.equals(w)) {
																		if (!b2y.equals(c)) {
																			if (!d2v.equals(y)) {
																				if (!d2v.equals(v)) {
																					if (!d2v.equals(z)) {
																						if (!d2v.equals(x)) {
																							if (!d2v.equals(w2i)) {
																								if (!d2v.equals(i)) {
																									if (!d2v.equals(
																											w)) {
																										if (!d.equals(
																												y)) {
																											if (!d.equals(
																													v)) {
																												if (!d.equals(
																														d2v)) {
																													if (!d.equals(
																															z)) {
																														if (!d.equals(
																																x)) {
																															if (!d.equals(
																																	w2i)) {
																																if (!d.equals(
																																		i)) {
																																	if (!d.equals(
																																			w)) {
																																		if (!c2z.equals(
																																				y)) {
																																			if (!c2z.equals(
																																					v)) {
																																				if (!c2z.equals(
																																						d2v)) {
																																					if (!c2z.equals(
																																							d)) {
																																						if (!c2z.equals(
																																								z)) {
																																							if (!c2z.equals(
																																									x)) {
																																								if (!c2z.equals(
																																										w2i)) {
																																									if (!c2z.equals(
																																											i)) {
																																										if (!c2z.equals(
																																												w)) {
																																											if (!a2x.equals(
																																													y)) {
																																												if (!a2x.equals(
																																														v)) {
																																													if (!a2x.equals(
																																															b2y)) {
																																														if (!a2x.equals(
																																																d2v)) {
																																															if (!a2x.equals(
																																																	d)) {
																																																if (!a2x.equals(
																																																		z)) {
																																																	if (!a2x.equals(
																																																			c2z)) {
																																																		if (!a2x.equals(
																																																				x)) {
																																																			if (!a2x.equals(
																																																					w2i)) {
																																																				if (!a2x.equals(
																																																						i)) {
																																																					if (!a2x.equals(
																																																							w)) {
																																																						if (!a2x.equals(
																																																								b)) {
																																																							if (!a2x.equals(
																																																									c)) {
																																																								if (!x.equals(
																																																										y)) {
																																																									if (!x.equals(
																																																											z)) {
																																																										if (!w2i.equals(
																																																												y)) {
																																																											if (!w2i.equals(
																																																													z)) {
																																																												if (!w2i.equals(
																																																														x)) {
																																																													if (!i.equals(
																																																															y)) {
																																																														if (!i.equals(
																																																																v)) {
																																																															if (!i.equals(
																																																																	z)) {
																																																																if (!i.equals(
																																																																		x)) {
																																																																	if (!i.equals(
																																																																			w2i)) {
																																																																		if (!i.equals(
																																																																				w)) {
																																																																			if (!w.equals(
																																																																					y)) {
																																																																				if (!w.equals(
																																																																						z)) {
																																																																					if (!w.equals(
																																																																							x)) {
																																																																						if (!w.equals(
																																																																								w2i)) {
																																																																							if (!b.equals(
																																																																									y)) {
																																																																								if (!b.equals(
																																																																										v)) {
																																																																									if (!b.equals(
																																																																											b2y)) {
																																																																										if (!b.equals(
																																																																												d2v)) {
																																																																											if (!b.equals(
																																																																													d)) {
																																																																												if (!b.equals(
																																																																														z)) {
																																																																													if (!b.equals(
																																																																															c2z)) {
																																																																														if (!b.equals(
																																																																																x)) {
																																																																															if (!b.equals(
																																																																																	w2i)) {
																																																																																if (!b.equals(
																																																																																		i)) {
																																																																																	if (!b.equals(
																																																																																			w)) {
																																																																																		if (!b.equals(
																																																																																				c)) {
																																																																																			if (!c.equals(
																																																																																					y)) {
																																																																																				if (!c.equals(
																																																																																						v)) {
																																																																																					if (!c.equals(
																																																																																							d2v)) {
																																																																																						if (!c.equals(
																																																																																								d)) {
																																																																																							if (!c.equals(
																																																																																									z)) {
																																																																																								if (!c.equals(
																																																																																										c2z)) {
																																																																																									if (!c.equals(
																																																																																											x)) {
																																																																																										if (!c.equals(
																																																																																												w2i)) {
																																																																																											if (!c.equals(
																																																																																													i)) {
																																																																																												if (!c.equals(
																																																																																														w)) {
																																																																																													if (!a.equals(
																																																																																															y)) {
																																																																																														if (!a.equals(
																																																																																																v)) {
																																																																																															if (!a.equals(
																																																																																																	b2y)) {
																																																																																																if (!a.equals(
																																																																																																		d2v)) {
																																																																																																	if (!a.equals(
																																																																																																			d)) {
																																																																																																		if (!a.equals(
																																																																																																				z)) {
																																																																																																			if (!a.equals(
																																																																																																					c2z)) {
																																																																																																				if (!a.equals(
																																																																																																						a2x)) {
																																																																																																					if (!a.equals(
																																																																																																							x)) {
																																																																																																						if (!a.equals(
																																																																																																								w2i)) {
																																																																																																							if (!a.equals(
																																																																																																									i)) {
																																																																																																								if (!a.equals(
																																																																																																										w)) {
																																																																																																									if (!a.equals(
																																																																																																											b)) {
																																																																																																										if (!a.equals(
																																																																																																												c)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													y,
																																																																																																													v,
																																																																																																													b2y,
																																																																																																													d2v,
																																																																																																													d,
																																																																																																													z,
																																																																																																													c2z,
																																																																																																													a2x,
																																																																																																													x,
																																																																																																													w2i,
																																																																																																													i,
																																																																																																													w,
																																																																																																													b,
																																																																																																													c,
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
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject y, EObject v, EObject b2y, EObject d2v, EObject d, EObject z,
			EObject c2z, EObject a2x, EObject x, EObject i, EObject w, EObject b, EObject c, EObject a) {
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__v____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__v____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileulul2branchubub";
		String b2y__y____target_name_prime = "target";
		String d2v__v____target_name_prime = "target";
		String c2z__z____target_name_prime = "target";
		String y__x____next_name_prime = "next";
		String a2x__x____target_name_prime = "target";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String v__z____next_name_prime = "next";
		String x__y____positive_name_prime = "positive";
		String d2v__d____source_name_prime = "source";
		String w__a____first_name_prime = "first";
		String b2y__b____source_name_prime = "source";
		String w__c____next_name_prime = "next";
		String c__d____last_name_prime = "last";
		String a2x__a____source_name_prime = "source";
		String a__b____first_name_prime = "first";
		String c2z__c____source_name_prime = "source";
		String c__d____first_name_prime = "first";
		String a__b____last_name_prime = "last";
		String z__v____positive_name_prime = "positive";
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		d2v__v____target.setSrc(d2v);
		d2v__v____target.setTrg(v);
		ruleresult.getCreatedEdges().add(d2v__v____target);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(y__x____next);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		ruleresult.getCreatedEdges().add(v__z____next);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		ruleresult.getCreatedEdges().add(x__y____positive);
		d2v__d____source.setSrc(d2v);
		d2v__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(d2v__d____source);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		ruleresult.getTranslatedEdges().add(c__d____last);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____first);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c__d____first.setSrc(c);
		c__d____first.setTrg(d);
		ruleresult.getTranslatedEdges().add(c__d____first);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		z__v____positive.setSrc(z);
		z__v____positive.setTrg(v);
		ruleresult.getCreatedEdges().add(z__v____positive);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		d2v__v____target.setName(d2v__v____target_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		d2v__d____source.setName(d2v__d____source_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c__d____first.setName(c__d____first_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		z__v____positive.setName(z__v____positive_name_prime);
		return new Object[] { ruleresult, y, v, b2y, d2v, d, z, c2z, a2x, x, i, w, b, c, a, b2y__y____target,
				d2v__v____target, c2z__z____target, y__x____next, a2x__x____target, i__x____positive, i__z____negative,
				v__z____next, x__y____positive, d2v__d____source, w__a____first, b2y__b____source, w__c____next,
				c__d____last, a2x__a____source, a__b____first, c2z__c____source, c__d____first, a__b____last,
				z__v____positive };
	}

	public static final void pattern_whileulul2branchubub_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			whileulul2branchubub _this, PerformRuleResult ruleresult, EObject y, EObject v, EObject b2y, EObject d2v,
			EObject d, EObject z, EObject c2z, EObject a2x, EObject x, EObject w2i, EObject i, EObject w, EObject b,
			EObject c, EObject a) {
		_this.registerObjects_FWD(ruleresult, y, v, b2y, d2v, d, z, c2z, a2x, x, w2i, i, w, b, c, a);

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
		EObject _localVariable_0 = match.getObject("d");
		EObject _localVariable_1 = match.getObject("w");
		EObject _localVariable_2 = match.getObject("b");
		EObject _localVariable_3 = match.getObject("c");
		EObject _localVariable_4 = match.getObject("a");
		EObject tmpD = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpA = _localVariable_4;
		if (tmpD instanceof Assignment) {
			Assignment d = (Assignment) tmpD;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpB instanceof Assignment) {
					Assignment b = (Assignment) tmpB;
					if (tmpC instanceof While) {
						While c = (While) tmpC;
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							return new Object[] { d, w, b, c, a, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileulul2branchubub_2_2_corematch_blackBFFBBBBB(Assignment d,
			While w, Assignment b, While c, While a, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(d)) {
			if (!c.equals(w)) {
				if (!a.equals(w)) {
					if (!a.equals(c)) {
						for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class,
								"source")) {
							Branch i = w2i.getTarget();
							if (i != null) {
								_result.add(new Object[] { d, w2i, i, w, b, c, a, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileulul2branchubub_2_3_findcontext_blackBBBBBBB(Assignment d,
			S2B w2i, Branch i, While w, Assignment b, While c, While a) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(d)) {
			if (!c.equals(w)) {
				if (!a.equals(w)) {
					if (!a.equals(c)) {
						if (i.equals(w2i.getTarget())) {
							if (w.equals(w2i.getSource())) {
								if (a.equals(w.getFirst())) {
									if (c.equals(w.getNext())) {
										if (d.equals(c.getLast())) {
											if (b.equals(a.getFirst())) {
												if (d.equals(c.getFirst())) {
													if (b.equals(a.getLast())) {
														_result.add(new Object[] { d, w2i, i, w, b, c, a });
													}
												}
											}
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

	public static final Object[] pattern_whileulul2branchubub_2_3_findcontext_greenBBBBBBBFFFFFFFFF(Assignment d,
			S2B w2i, Branch i, While w, Assignment b, While c, While a) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w2i__i____target_name_prime = "target";
		String w2i__w____source_name_prime = "source";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String c__d____last_name_prime = "last";
		String a__b____first_name_prime = "first";
		String c__d____first_name_prime = "first";
		String a__b____last_name_prime = "last";
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(a);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		isApplicableMatch.getAllContextElements().add(c__d____last);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____first);
		c__d____first.setSrc(c);
		c__d____first.setTrg(d);
		isApplicableMatch.getAllContextElements().add(c__d____first);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____last);
		w2i__i____target.setName(w2i__i____target_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		c__d____first.setName(c__d____first_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		return new Object[] { d, w2i, i, w, b, c, a, isApplicableMatch, w2i__i____target, w2i__w____source,
				w__a____first, w__c____next, c__d____last, a__b____first, c__d____first, a__b____last };
	}

	public static final Object[] pattern_whileulul2branchubub_2_4_solveCSP_bindingFBBBBBBBBB(whileulul2branchubub _this,
			IsApplicableMatch isApplicableMatch, Assignment d, S2B w2i, Branch i, While w, Assignment b, While c,
			While a) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, d, w2i, i, w, b, c, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d, w2i, i, w, b, c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileulul2branchubub_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			whileulul2branchubub _this, IsApplicableMatch isApplicableMatch, Assignment d, S2B w2i, Branch i, While w,
			Assignment b, While c, While a) {
		Object[] result_pattern_whileulul2branchubub_2_4_solveCSP_binding = pattern_whileulul2branchubub_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, d, w2i, i, w, b, c, a);
		if (result_pattern_whileulul2branchubub_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileulul2branchubub_2_4_solveCSP_binding[0];

			Object[] result_pattern_whileulul2branchubub_2_4_solveCSP_black = pattern_whileulul2branchubub_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileulul2branchubub_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d, w2i, i, w, b, c, a };
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
			whileulul2branchubub _this, Match match, Command y, Command v, Branch z, Branch x, Branch i) {
		if (!v.equals(y)) {
			if (!x.equals(z)) {
				if (!i.equals(z)) {
					if (!i.equals(x)) {
						return new Object[] { _this, match, y, v, z, x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_10_2_SolveCSP_bindingFBBBBBBB(whileulul2branchubub _this,
			Match match, Command y, Command v, Branch z, Branch x, Branch i) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, y, v, z, x, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, y, v, z, x, i };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileulul2branchubub_10_2_SolveCSP_bindingAndBlackFBBBBBBB(
			whileulul2branchubub _this, Match match, Command y, Command v, Branch z, Branch x, Branch i) {
		Object[] result_pattern_whileulul2branchubub_10_2_SolveCSP_binding = pattern_whileulul2branchubub_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, y, v, z, x, i);
		if (result_pattern_whileulul2branchubub_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileulul2branchubub_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whileulul2branchubub_10_2_SolveCSP_black = pattern_whileulul2branchubub_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileulul2branchubub_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, y, v, z, x, i };
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
			Match match, Command y, Command v, Branch z, Branch x, Branch i) {
		if (!v.equals(y)) {
			if (!x.equals(z)) {
				if (!i.equals(z)) {
					if (!i.equals(x)) {
						return new Object[] { match, y, v, z, x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_10_4_collectelementstobetranslated_greenBBBBBBFFFFFF(
			Match match, Command y, Command v, Branch z, Branch x, Branch i) {
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__v____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(v);
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(x);
		String y__x____next_name_prime = "next";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String v__z____next_name_prime = "next";
		String x__y____positive_name_prime = "positive";
		String z__v____positive_name_prime = "positive";
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(y__x____next);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		match.getToBeTranslatedEdges().add(v__z____next);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		match.getToBeTranslatedEdges().add(x__y____positive);
		z__v____positive.setSrc(z);
		z__v____positive.setTrg(v);
		match.getToBeTranslatedEdges().add(z__v____positive);
		y__x____next.setName(y__x____next_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		z__v____positive.setName(z__v____positive_name_prime);
		return new Object[] { match, y, v, z, x, i, y__x____next, i__x____positive, i__z____negative, v__z____next,
				x__y____positive, z__v____positive };
	}

	public static final Object[] pattern_whileulul2branchubub_10_5_collectcontextelements_blackBBBBBB(Match match,
			Command y, Command v, Branch z, Branch x, Branch i) {
		if (!v.equals(y)) {
			if (!x.equals(z)) {
				if (!i.equals(z)) {
					if (!i.equals(x)) {
						return new Object[] { match, y, v, z, x, i };
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
			whileulul2branchubub _this, Match match, Command y, Command v, Branch z, Branch x, Branch i) {
		_this.registerObjectsToMatch_BWD(match, y, v, z, x, i);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("y");
		EObject _localVariable_1 = isApplicableMatch.getObject("v");
		EObject _localVariable_2 = isApplicableMatch.getObject("z");
		EObject _localVariable_3 = isApplicableMatch.getObject("x");
		EObject _localVariable_4 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_5 = isApplicableMatch.getObject("i");
		EObject _localVariable_6 = isApplicableMatch.getObject("w");
		EObject tmpY = _localVariable_0;
		EObject tmpV = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpW2i = _localVariable_4;
		EObject tmpI = _localVariable_5;
		EObject tmpW = _localVariable_6;
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			if (tmpV instanceof Command) {
				Command v = (Command) tmpV;
				if (tmpZ instanceof Branch) {
					Branch z = (Branch) tmpZ;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpW2i instanceof S2B) {
							S2B w2i = (S2B) tmpW2i;
							if (tmpI instanceof Branch) {
								Branch i = (Branch) tmpI;
								if (tmpW instanceof While) {
									While w = (While) tmpW;
									return new Object[] { y, v, z, x, w2i, i, w, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_11_1_performtransformation_blackBBBBBBBFBB(Command y,
			Command v, Branch z, Branch x, S2B w2i, Branch i, While w, whileulul2branchubub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!v.equals(y)) {
			if (!x.equals(z)) {
				if (!i.equals(z)) {
					if (!i.equals(x)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { y, v, z, x, w2i, i, w, csp, _this, isApplicableMatch };
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
			Command y = (Command) result_pattern_whileulul2branchubub_11_1_performtransformation_binding[0];
			Command v = (Command) result_pattern_whileulul2branchubub_11_1_performtransformation_binding[1];
			Branch z = (Branch) result_pattern_whileulul2branchubub_11_1_performtransformation_binding[2];
			Branch x = (Branch) result_pattern_whileulul2branchubub_11_1_performtransformation_binding[3];
			S2B w2i = (S2B) result_pattern_whileulul2branchubub_11_1_performtransformation_binding[4];
			Branch i = (Branch) result_pattern_whileulul2branchubub_11_1_performtransformation_binding[5];
			While w = (While) result_pattern_whileulul2branchubub_11_1_performtransformation_binding[6];

			Object[] result_pattern_whileulul2branchubub_11_1_performtransformation_black = pattern_whileulul2branchubub_11_1_performtransformation_blackBBBBBBBFBB(
					y, v, z, x, w2i, i, w, _this, isApplicableMatch);
			if (result_pattern_whileulul2branchubub_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileulul2branchubub_11_1_performtransformation_black[7];

				return new Object[] { y, v, z, x, w2i, i, w, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_11_1_performtransformation_greenBBFFFBFFBBFFF(Command y,
			Command v, Branch z, Branch x, While w) {
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment d = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		b2y.setTarget(y);
		d2v.setTarget(v);
		d2v.setSource(d);
		c2z.setTarget(z);
		a2x.setTarget(x);
		b2y.setSource(b);
		w.setNext(c);
		c.setLast(d);
		c2z.setSource(c);
		c.setFirst(d);
		w.setFirst(a);
		a2x.setSource(a);
		a.setFirst(b);
		a.setLast(b);
		return new Object[] { y, v, b2y, d2v, d, z, c2z, a2x, x, w, b, c, a };
	}

	public static final Object[] pattern_whileulul2branchubub_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(
			Command y, Command v, S2N b2y, S2N d2v, Assignment d, Branch z, S2B c2z, S2B a2x, Branch x, Assignment b,
			While c, While a) {
		if (!v.equals(y)) {
			if (!b2y.equals(d2v)) {
				if (!a2x.equals(c2z)) {
					if (!x.equals(z)) {
						if (!b.equals(d)) {
							if (!a.equals(c)) {
								return new Object[] { y, v, b2y, d2v, d, z, c2z, a2x, x, b, c, a };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(
			Command y, Command v, S2N b2y, S2N d2v, Assignment d, Branch z, S2B c2z, S2B a2x, Branch x, Assignment b,
			While c, While a) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getTranslatedElements().add(v);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(d2v);
		ruleresult.getCreatedElements().add(d);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getCreatedElements().add(a);
		return new Object[] { ruleresult, y, v, b2y, d2v, d, z, c2z, a2x, x, b, c, a };
	}

	public static final Object[] pattern_whileulul2branchubub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject y, EObject v, EObject b2y, EObject d2v, EObject d, EObject z,
			EObject c2z, EObject a2x, EObject x, EObject w2i, EObject i, EObject w, EObject b, EObject c, EObject a) {
		if (!y.equals(z)) {
			if (!v.equals(y)) {
				if (!v.equals(z)) {
					if (!v.equals(x)) {
						if (!v.equals(w2i)) {
							if (!v.equals(w)) {
								if (!b2y.equals(y)) {
									if (!b2y.equals(v)) {
										if (!b2y.equals(d2v)) {
											if (!b2y.equals(d)) {
												if (!b2y.equals(z)) {
													if (!b2y.equals(c2z)) {
														if (!b2y.equals(x)) {
															if (!b2y.equals(w2i)) {
																if (!b2y.equals(i)) {
																	if (!b2y.equals(w)) {
																		if (!b2y.equals(c)) {
																			if (!d2v.equals(y)) {
																				if (!d2v.equals(v)) {
																					if (!d2v.equals(z)) {
																						if (!d2v.equals(x)) {
																							if (!d2v.equals(w2i)) {
																								if (!d2v.equals(i)) {
																									if (!d2v.equals(
																											w)) {
																										if (!d.equals(
																												y)) {
																											if (!d.equals(
																													v)) {
																												if (!d.equals(
																														d2v)) {
																													if (!d.equals(
																															z)) {
																														if (!d.equals(
																																x)) {
																															if (!d.equals(
																																	w2i)) {
																																if (!d.equals(
																																		i)) {
																																	if (!d.equals(
																																			w)) {
																																		if (!c2z.equals(
																																				y)) {
																																			if (!c2z.equals(
																																					v)) {
																																				if (!c2z.equals(
																																						d2v)) {
																																					if (!c2z.equals(
																																							d)) {
																																						if (!c2z.equals(
																																								z)) {
																																							if (!c2z.equals(
																																									x)) {
																																								if (!c2z.equals(
																																										w2i)) {
																																									if (!c2z.equals(
																																											i)) {
																																										if (!c2z.equals(
																																												w)) {
																																											if (!a2x.equals(
																																													y)) {
																																												if (!a2x.equals(
																																														v)) {
																																													if (!a2x.equals(
																																															b2y)) {
																																														if (!a2x.equals(
																																																d2v)) {
																																															if (!a2x.equals(
																																																	d)) {
																																																if (!a2x.equals(
																																																		z)) {
																																																	if (!a2x.equals(
																																																			c2z)) {
																																																		if (!a2x.equals(
																																																				x)) {
																																																			if (!a2x.equals(
																																																					w2i)) {
																																																				if (!a2x.equals(
																																																						i)) {
																																																					if (!a2x.equals(
																																																							w)) {
																																																						if (!a2x.equals(
																																																								b)) {
																																																							if (!a2x.equals(
																																																									c)) {
																																																								if (!x.equals(
																																																										y)) {
																																																									if (!x.equals(
																																																											z)) {
																																																										if (!w2i.equals(
																																																												y)) {
																																																											if (!w2i.equals(
																																																													z)) {
																																																												if (!w2i.equals(
																																																														x)) {
																																																													if (!i.equals(
																																																															y)) {
																																																														if (!i.equals(
																																																																v)) {
																																																															if (!i.equals(
																																																																	z)) {
																																																																if (!i.equals(
																																																																		x)) {
																																																																	if (!i.equals(
																																																																			w2i)) {
																																																																		if (!i.equals(
																																																																				w)) {
																																																																			if (!w.equals(
																																																																					y)) {
																																																																				if (!w.equals(
																																																																						z)) {
																																																																					if (!w.equals(
																																																																							x)) {
																																																																						if (!w.equals(
																																																																								w2i)) {
																																																																							if (!b.equals(
																																																																									y)) {
																																																																								if (!b.equals(
																																																																										v)) {
																																																																									if (!b.equals(
																																																																											b2y)) {
																																																																										if (!b.equals(
																																																																												d2v)) {
																																																																											if (!b.equals(
																																																																													d)) {
																																																																												if (!b.equals(
																																																																														z)) {
																																																																													if (!b.equals(
																																																																															c2z)) {
																																																																														if (!b.equals(
																																																																																x)) {
																																																																															if (!b.equals(
																																																																																	w2i)) {
																																																																																if (!b.equals(
																																																																																		i)) {
																																																																																	if (!b.equals(
																																																																																			w)) {
																																																																																		if (!b.equals(
																																																																																				c)) {
																																																																																			if (!c.equals(
																																																																																					y)) {
																																																																																				if (!c.equals(
																																																																																						v)) {
																																																																																					if (!c.equals(
																																																																																							d2v)) {
																																																																																						if (!c.equals(
																																																																																								d)) {
																																																																																							if (!c.equals(
																																																																																									z)) {
																																																																																								if (!c.equals(
																																																																																										c2z)) {
																																																																																									if (!c.equals(
																																																																																											x)) {
																																																																																										if (!c.equals(
																																																																																												w2i)) {
																																																																																											if (!c.equals(
																																																																																													i)) {
																																																																																												if (!c.equals(
																																																																																														w)) {
																																																																																													if (!a.equals(
																																																																																															y)) {
																																																																																														if (!a.equals(
																																																																																																v)) {
																																																																																															if (!a.equals(
																																																																																																	b2y)) {
																																																																																																if (!a.equals(
																																																																																																		d2v)) {
																																																																																																	if (!a.equals(
																																																																																																			d)) {
																																																																																																		if (!a.equals(
																																																																																																				z)) {
																																																																																																			if (!a.equals(
																																																																																																					c2z)) {
																																																																																																				if (!a.equals(
																																																																																																						a2x)) {
																																																																																																					if (!a.equals(
																																																																																																							x)) {
																																																																																																						if (!a.equals(
																																																																																																								w2i)) {
																																																																																																							if (!a.equals(
																																																																																																									i)) {
																																																																																																								if (!a.equals(
																																																																																																										w)) {
																																																																																																									if (!a.equals(
																																																																																																											b)) {
																																																																																																										if (!a.equals(
																																																																																																												c)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													y,
																																																																																																													v,
																																																																																																													b2y,
																																																																																																													d2v,
																																																																																																													d,
																																																																																																													z,
																																																																																																													c2z,
																																																																																																													a2x,
																																																																																																													x,
																																																																																																													w2i,
																																																																																																													i,
																																																																																																													w,
																																																																																																													b,
																																																																																																													c,
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
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject y, EObject v, EObject b2y, EObject d2v, EObject d, EObject z,
			EObject c2z, EObject a2x, EObject x, EObject i, EObject w, EObject b, EObject c, EObject a) {
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__v____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__v____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileulul2branchubub";
		String b2y__y____target_name_prime = "target";
		String d2v__v____target_name_prime = "target";
		String c2z__z____target_name_prime = "target";
		String y__x____next_name_prime = "next";
		String a2x__x____target_name_prime = "target";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String v__z____next_name_prime = "next";
		String x__y____positive_name_prime = "positive";
		String d2v__d____source_name_prime = "source";
		String w__a____first_name_prime = "first";
		String b2y__b____source_name_prime = "source";
		String w__c____next_name_prime = "next";
		String c__d____last_name_prime = "last";
		String a2x__a____source_name_prime = "source";
		String a__b____first_name_prime = "first";
		String c2z__c____source_name_prime = "source";
		String c__d____first_name_prime = "first";
		String a__b____last_name_prime = "last";
		String z__v____positive_name_prime = "positive";
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		d2v__v____target.setSrc(d2v);
		d2v__v____target.setTrg(v);
		ruleresult.getCreatedEdges().add(d2v__v____target);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(y__x____next);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		ruleresult.getTranslatedEdges().add(v__z____next);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		ruleresult.getTranslatedEdges().add(x__y____positive);
		d2v__d____source.setSrc(d2v);
		d2v__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(d2v__d____source);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		ruleresult.getCreatedEdges().add(c__d____last);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____first);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c__d____first.setSrc(c);
		c__d____first.setTrg(d);
		ruleresult.getCreatedEdges().add(c__d____first);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		z__v____positive.setSrc(z);
		z__v____positive.setTrg(v);
		ruleresult.getTranslatedEdges().add(z__v____positive);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		d2v__v____target.setName(d2v__v____target_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		d2v__d____source.setName(d2v__d____source_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c__d____first.setName(c__d____first_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		z__v____positive.setName(z__v____positive_name_prime);
		return new Object[] { ruleresult, y, v, b2y, d2v, d, z, c2z, a2x, x, i, w, b, c, a, b2y__y____target,
				d2v__v____target, c2z__z____target, y__x____next, a2x__x____target, i__x____positive, i__z____negative,
				v__z____next, x__y____positive, d2v__d____source, w__a____first, b2y__b____source, w__c____next,
				c__d____last, a2x__a____source, a__b____first, c2z__c____source, c__d____first, a__b____last,
				z__v____positive };
	}

	public static final void pattern_whileulul2branchubub_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			whileulul2branchubub _this, PerformRuleResult ruleresult, EObject y, EObject v, EObject b2y, EObject d2v,
			EObject d, EObject z, EObject c2z, EObject a2x, EObject x, EObject w2i, EObject i, EObject w, EObject b,
			EObject c, EObject a) {
		_this.registerObjects_BWD(ruleresult, y, v, b2y, d2v, d, z, c2z, a2x, x, w2i, i, w, b, c, a);

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
		EObject _localVariable_0 = match.getObject("y");
		EObject _localVariable_1 = match.getObject("v");
		EObject _localVariable_2 = match.getObject("z");
		EObject _localVariable_3 = match.getObject("x");
		EObject _localVariable_4 = match.getObject("i");
		EObject tmpY = _localVariable_0;
		EObject tmpV = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpI = _localVariable_4;
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			if (tmpV instanceof Command) {
				Command v = (Command) tmpV;
				if (tmpZ instanceof Branch) {
					Branch z = (Branch) tmpZ;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpI instanceof Branch) {
							Branch i = (Branch) tmpI;
							return new Object[] { y, v, z, x, i, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileulul2branchubub_12_2_corematch_blackBBBBFBFB(Command y,
			Command v, Branch z, Branch x, Branch i, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!v.equals(y)) {
			if (!x.equals(z)) {
				if (!i.equals(z)) {
					if (!i.equals(x)) {
						for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class,
								"target")) {
							Statement tmpW = w2i.getSource();
							if (tmpW instanceof While) {
								While w = (While) tmpW;
								_result.add(new Object[] { y, v, z, x, w2i, i, w, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileulul2branchubub_12_3_findcontext_blackBBBBBBB(Command y,
			Command v, Branch z, Branch x, S2B w2i, Branch i, While w) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!v.equals(y)) {
			if (!x.equals(z)) {
				if (!i.equals(z)) {
					if (!i.equals(x)) {
						if (x.equals(y.getNext())) {
							if (i.equals(w2i.getTarget())) {
								if (x.equals(i.getPositive())) {
									if (z.equals(i.getNegative())) {
										if (z.equals(v.getNext())) {
											if (y.equals(x.getPositive())) {
												if (w.equals(w2i.getSource())) {
													if (v.equals(z.getPositive())) {
														_result.add(new Object[] { y, v, z, x, w2i, i, w });
													}
												}
											}
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

	public static final Object[] pattern_whileulul2branchubub_12_3_findcontext_greenBBBBBBBFFFFFFFFF(Command y,
			Command v, Branch z, Branch x, S2B w2i, Branch i, While w) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__v____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String y__x____next_name_prime = "next";
		String w2i__i____target_name_prime = "target";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String v__z____next_name_prime = "next";
		String x__y____positive_name_prime = "positive";
		String w2i__w____source_name_prime = "source";
		String z__v____positive_name_prime = "positive";
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(v);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(y__x____next);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		isApplicableMatch.getAllContextElements().add(v__z____next);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		isApplicableMatch.getAllContextElements().add(x__y____positive);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		z__v____positive.setSrc(z);
		z__v____positive.setTrg(v);
		isApplicableMatch.getAllContextElements().add(z__v____positive);
		y__x____next.setName(y__x____next_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		z__v____positive.setName(z__v____positive_name_prime);
		return new Object[] { y, v, z, x, w2i, i, w, isApplicableMatch, y__x____next, w2i__i____target,
				i__x____positive, i__z____negative, v__z____next, x__y____positive, w2i__w____source,
				z__v____positive };
	}

	public static final Object[] pattern_whileulul2branchubub_12_4_solveCSP_bindingFBBBBBBBBB(
			whileulul2branchubub _this, IsApplicableMatch isApplicableMatch, Command y, Command v, Branch z, Branch x,
			S2B w2i, Branch i, While w) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, y, v, z, x, w2i, i, w);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, y, v, z, x, w2i, i, w };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileulul2branchubub_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			whileulul2branchubub _this, IsApplicableMatch isApplicableMatch, Command y, Command v, Branch z, Branch x,
			S2B w2i, Branch i, While w) {
		Object[] result_pattern_whileulul2branchubub_12_4_solveCSP_binding = pattern_whileulul2branchubub_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, y, v, z, x, w2i, i, w);
		if (result_pattern_whileulul2branchubub_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileulul2branchubub_12_4_solveCSP_binding[0];

			Object[] result_pattern_whileulul2branchubub_12_4_solveCSP_black = pattern_whileulul2branchubub_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileulul2branchubub_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, y, v, z, x, w2i, i, w };
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

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_0B(Command y) {
		for (Graph __DEC_y_root_241405 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_1BBBB(Command y,
			Branch z, Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_y_positive_50191 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!z.equals(__DEC_y_positive_50191)) {
							if (!x.equals(__DEC_y_positive_50191)) {
								if (!i.equals(__DEC_y_positive_50191)) {
									return new Object[] { y, z, x, i };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_2BBBB(Command y,
			Branch z, Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_y_negative_151266 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!z.equals(__DEC_y_negative_151266)) {
							if (!x.equals(__DEC_y_negative_151266)) {
								if (!i.equals(__DEC_y_negative_151266)) {
									return new Object[] { y, z, x, i };
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
		for (Graph __DEC_v_root_377443 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(v,
				Graph.class, "root")) {
			return new Object[] { v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_4BBBB(Command v,
			Branch z, Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_v_positive_769014 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "positive")) {
						if (!z.equals(__DEC_v_positive_769014)) {
							if (!x.equals(__DEC_v_positive_769014)) {
								if (!i.equals(__DEC_v_positive_769014)) {
									return new Object[] { v, z, x, i };
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
			Branch z, Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_v_negative_488883 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "negative")) {
						if (!z.equals(__DEC_v_negative_488883)) {
							if (!x.equals(__DEC_v_negative_488883)) {
								if (!i.equals(__DEC_v_negative_488883)) {
									return new Object[] { v, z, x, i };
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
		for (Graph __DEC_z_root_180228 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
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
					for (Branch __DEC_z_positive_943841 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_943841)) {
							if (!x.equals(__DEC_z_positive_943841)) {
								if (!i.equals(__DEC_z_positive_943841)) {
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
					for (Branch __DEC_z_negative_202669 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_202669)) {
							if (!x.equals(__DEC_z_negative_202669)) {
								if (!i.equals(__DEC_z_negative_202669)) {
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

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_9B(Branch x) {
		for (Graph __DEC_x_root_371191 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_10BBB(Branch x,
			Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_447779 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_447779)) {
							if (!z.equals(__DEC_x_positive_447779)) {
								if (!i.equals(__DEC_x_positive_447779)) {
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

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_11BBB(Branch x,
			Branch z, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_311479 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_311479)) {
							if (!z.equals(__DEC_x_negative_311479)) {
								if (!i.equals(__DEC_x_negative_311479)) {
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

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_12BB(Branch z,
			Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_13BB(Branch i,
			Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_14BB(Branch z,
			Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_15BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_16BB(Branch i,
			Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_17BB(Branch x,
			Command v) {
		if (v.equals(x.getPositive())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_18BB(Branch i,
			Command v) {
		if (v.equals(i.getPositive())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_19BB(Branch z,
			Command v) {
		if (v.equals(z.getNegative())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_20BB(Branch x,
			Command v) {
		if (v.equals(x.getNegative())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_21BB(Branch i,
			Command v) {
		if (v.equals(i.getNegative())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_22BB(Branch z,
			Branch x) {
		if (x.equals(z.getPositive())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_23BB(Branch z,
			Branch x) {
		if (x.equals(z.getNegative())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileulul2branchubub_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpY = _edge_next.getSrc();
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			EObject tmpX = _edge_next.getTrg();
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (x.equals(y.getNext())) {
					if (y.equals(x.getPositive())) {
						if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_0B(y) == null) {
							if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_9B(x) == null) {
								if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_15BB(x,
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
																	if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_13BB(
																			i, y) == null) {
																		if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_16BB(
																				i, y) == null) {
																			if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_1BBBB(
																					y, z, x, i) == null) {
																				if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_2BBBB(
																						y, z, x, i) == null) {
																					if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_6B(
																							z) == null) {
																						if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_7BBB(
																								z, x, i) == null) {
																							if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_8BBB(
																									z, x, i) == null) {
																								if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_10BBB(
																										x, z,
																										i) == null) {
																									if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_11BBB(
																											x, z,
																											i) == null) {
																										if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_12BB(
																												z,
																												y) == null) {
																											if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_14BB(
																													z,
																													y) == null) {
																												if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_22BB(
																														z,
																														x) == null) {
																													if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_23BB(
																															z,
																															x) == null) {
																														if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_3B(
																																v) == null) {
																															if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_4BBBB(
																																	v,
																																	z,
																																	x,
																																	i) == null) {
																																if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_5BBBB(
																																		v,
																																		z,
																																		x,
																																		i) == null) {
																																	if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_17BB(
																																			x,
																																			v) == null) {
																																		if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_18BB(
																																				i,
																																				v) == null) {
																																			if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_19BB(
																																					z,
																																					v) == null) {
																																				if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_20BB(
																																						x,
																																						v) == null) {
																																					if (pattern_whileulul2branchubub_20_2_testcorematchandDECs_black_nac_21BB(
																																							i,
																																							v) == null) {
																																						_result.add(
																																								new Object[] {
																																										y,
																																										v,
																																										z,
																																										x,
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
			whileulul2branchubub _this, Match match, Command y, Command v, Branch z, Branch x, Branch i) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, y, v, z, x, i);
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

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_0B(Assignment d) {
		for (Decision __DEC_d_positive_740660 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_1B(Assignment d) {
		for (Decision __DEC_d_negative_338772 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_2BBBB(Assignment d,
			While w, While c, While a) {
		if (!c.equals(w)) {
			if (!a.equals(w)) {
				if (!a.equals(c)) {
					for (While __DEC_d_last_401506 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "last")) {
						if (!w.equals(__DEC_d_last_401506)) {
							if (!c.equals(__DEC_d_last_401506)) {
								if (!a.equals(__DEC_d_last_401506)) {
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

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_3B(Assignment d) {
		for (Program __DEC_d_first_445098 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_4B(Assignment b) {
		for (Decision __DEC_b_positive_901532 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_5B(Assignment b) {
		for (Decision __DEC_b_negative_269428 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_6BBBB(Assignment b,
			While w, While c, While a) {
		if (!c.equals(w)) {
			if (!a.equals(w)) {
				if (!a.equals(c)) {
					for (While __DEC_b_last_967577 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "last")) {
						if (!w.equals(__DEC_b_last_967577)) {
							if (!c.equals(__DEC_b_last_967577)) {
								if (!a.equals(__DEC_b_last_967577)) {
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

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_7B(Assignment b) {
		for (Program __DEC_b_first_643536 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_8B(While c) {
		for (Decision __DEC_c_positive_847204 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_9B(While c) {
		for (Decision __DEC_c_negative_394568 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_10BBB(While c,
			While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_first_696736 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "first")) {
						if (!c.equals(__DEC_c_first_696736)) {
							if (!w.equals(__DEC_c_first_696736)) {
								if (!a.equals(__DEC_c_first_696736)) {
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

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_11BBB(While c,
			While w, While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_last_22699 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "last")) {
						if (!c.equals(__DEC_c_last_22699)) {
							if (!w.equals(__DEC_c_last_22699)) {
								if (!a.equals(__DEC_c_last_22699)) {
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

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_12B(While c) {
		for (Program __DEC_c_first_233604 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_13B(While a) {
		for (Decision __DEC_a_positive_370505 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_14B(While a) {
		for (Decision __DEC_a_negative_614398 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_15BBB(While a,
			While w, While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!c.equals(w)) {
					for (While __DEC_a_last_882701 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, While.class, "last")) {
						if (!a.equals(__DEC_a_last_882701)) {
							if (!w.equals(__DEC_a_last_882701)) {
								if (!c.equals(__DEC_a_last_882701)) {
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

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_16B(While a) {
		for (Program __DEC_a_first_522775 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
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

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_21BB(While w,
			While c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_22BB(While w,
			While c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_23BB(While w,
			While a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_24BB(While c,
			While a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileulul2branchubub_21_2_testcorematchandDECs_blackFFFFFB(
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
									Statement tmpB = a.getFirst();
									if (tmpB instanceof Assignment) {
										Assignment b = (Assignment) tmpB;
										if (b.equals(a.getLast())) {
											Statement tmpD = c.getLast();
											if (tmpD instanceof Assignment) {
												Assignment d = (Assignment) tmpD;
												if (!b.equals(d)) {
													if (d.equals(c.getFirst())) {
														if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_13B(
																a) == null) {
															if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_14B(
																	a) == null) {
																if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_16B(
																		a) == null) {
																	if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_23BB(
																			w, a) == null) {
																		if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_8B(
																				c) == null) {
																			if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_9B(
																					c) == null) {
																				if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_10BBB(
																						c, w, a) == null) {
																					if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_11BBB(
																							c, w, a) == null) {
																						if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_12B(
																								c) == null) {
																							if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_15BBB(
																									a, w, c) == null) {
																								if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_21BB(
																										w, c) == null) {
																									if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_22BB(
																											w,
																											c) == null) {
																										if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_24BB(
																												c,
																												a) == null) {
																											if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_4B(
																													b) == null) {
																												if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_5B(
																														b) == null) {
																													if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_6BBBB(
																															b,
																															w,
																															c,
																															a) == null) {
																														if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_7B(
																																b) == null) {
																															if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_19BB(
																																	w,
																																	b) == null) {
																																if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_20BB(
																																		c,
																																		b) == null) {
																																	if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_0B(
																																			d) == null) {
																																		if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_1B(
																																				d) == null) {
																																			if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_2BBBB(
																																					d,
																																					w,
																																					c,
																																					a) == null) {
																																				if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_3B(
																																						d) == null) {
																																					if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_17BB(
																																							w,
																																							d) == null) {
																																						if (pattern_whileulul2branchubub_21_2_testcorematchandDECs_black_nac_18BB(
																																								a,
																																								d) == null) {
																																							_result.add(
																																									new Object[] {
																																											d,
																																											w,
																																											b,
																																											c,
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
			whileulul2branchubub _this, Match match, Assignment d, While w, Assignment b, While c, While a) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, d, w, b, c, a);
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
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("y");
		EObject _localVariable_1 = targetMatch.getObject("v");
		EObject _localVariable_2 = sourceMatch.getObject("d");
		EObject _localVariable_3 = targetMatch.getObject("z");
		EObject _localVariable_4 = targetMatch.getObject("x");
		EObject _localVariable_5 = targetMatch.getObject("i");
		EObject _localVariable_6 = sourceMatch.getObject("w");
		EObject _localVariable_7 = sourceMatch.getObject("b");
		EObject _localVariable_8 = sourceMatch.getObject("c");
		EObject _localVariable_9 = sourceMatch.getObject("a");
		EObject tmpY = _localVariable_0;
		EObject tmpV = _localVariable_1;
		EObject tmpD = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		EObject tmpX = _localVariable_4;
		EObject tmpI = _localVariable_5;
		EObject tmpW = _localVariable_6;
		EObject tmpB = _localVariable_7;
		EObject tmpC = _localVariable_8;
		EObject tmpA = _localVariable_9;
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			if (tmpV instanceof Command) {
				Command v = (Command) tmpV;
				if (tmpD instanceof Assignment) {
					Assignment d = (Assignment) tmpD;
					if (tmpZ instanceof Branch) {
						Branch z = (Branch) tmpZ;
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							if (tmpI instanceof Branch) {
								Branch i = (Branch) tmpI;
								if (tmpW instanceof While) {
									While w = (While) tmpW;
									if (tmpB instanceof Assignment) {
										Assignment b = (Assignment) tmpB;
										if (tmpC instanceof While) {
											While c = (While) tmpC;
											if (tmpA instanceof While) {
												While a = (While) tmpA;
												return new Object[] { y, v, d, z, x, i, w, b, c, a, targetMatch,
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

	public static final Object[] pattern_whileulul2branchubub_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(Command y,
			Command v, Assignment d, Branch z, Branch x, Branch i, While w, Assignment b, While c, While a,
			Match sourceMatch, Match targetMatch) {
		if (!v.equals(y)) {
			if (!x.equals(z)) {
				if (!i.equals(z)) {
					if (!i.equals(x)) {
						if (!b.equals(d)) {
							if (!c.equals(w)) {
								if (!a.equals(w)) {
									if (!a.equals(c)) {
										if (!sourceMatch.equals(targetMatch)) {
											return new Object[] { y, v, d, z, x, i, w, b, c, a, sourceMatch,
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
				targetMatch, sourceMatch);
		if (result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding != null) {
			Command y = (Command) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[0];
			Command v = (Command) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[1];
			Assignment d = (Assignment) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[2];
			Branch z = (Branch) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[3];
			Branch x = (Branch) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[4];
			Branch i = (Branch) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[5];
			While w = (While) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[6];
			Assignment b = (Assignment) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[7];
			While c = (While) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[8];
			While a = (While) result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_black = pattern_whileulul2branchubub_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					y, v, d, z, x, i, w, b, c, a, sourceMatch, targetMatch);
			if (result_pattern_whileulul2branchubub_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { y, v, d, z, x, i, w, b, c, a, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
			whileulul2branchubub _this, Command y, Command v, Assignment d, Branch z, Branch x, Branch i, While w,
			Assignment b, While c, While a, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(y, v, d, z, x, i, w, b, c, a, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, y, v, d, z, x, i, w, b, c, a, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileulul2branchubub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			whileulul2branchubub _this, Command y, Command v, Assignment d, Branch z, Branch x, Branch i, While w,
			Assignment b, While c, While a, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileulul2branchubub_24_3_solvecsp_binding = pattern_whileulul2branchubub_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, y, v, d, z, x, i, w, b, c, a, sourceMatch, targetMatch);
		if (result_pattern_whileulul2branchubub_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whileulul2branchubub_24_3_solvecsp_binding[0];

			Object[] result_pattern_whileulul2branchubub_24_3_solvecsp_black = pattern_whileulul2branchubub_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whileulul2branchubub_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, y, v, d, z, x, i, w, b, c, a, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whileulul2branchubub_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileulul2branchubub_24_5_matchcorrcontext_blackFBBBB(Branch i,
			While w, Match sourceMatch, Match targetMatch) {
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

	public static final Object[] pattern_whileulul2branchubub_24_6_createcorrespondence_blackBBBBBBBBBBB(Command y,
			Command v, Assignment d, Branch z, Branch x, Branch i, While w, Assignment b, While c, While a,
			CCMatch ccMatch) {
		if (!v.equals(y)) {
			if (!x.equals(z)) {
				if (!i.equals(z)) {
					if (!i.equals(x)) {
						if (!b.equals(d)) {
							if (!c.equals(w)) {
								if (!a.equals(w)) {
									if (!a.equals(c)) {
										return new Object[] { y, v, d, z, x, i, w, b, c, a, ccMatch };
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

	public static final Object[] pattern_whileulul2branchubub_24_6_createcorrespondence_greenBBFFBBFFBBBBB(Command y,
			Command v, Assignment d, Branch z, Branch x, Assignment b, While c, While a, CCMatch ccMatch) {
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
		c2z.setTarget(z);
		c2z.setSource(c);
		ccMatch.getCreateCorr().add(c2z);
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { y, v, b2y, d2v, d, z, c2z, a2x, x, b, c, a, ccMatch };
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

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_0B(Assignment d) {
		for (Decision __DEC_d_positive_283299 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_1B(Assignment d) {
		for (Decision __DEC_d_negative_138067 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_2BBBB(Assignment d,
			While w, While c, While a) {
		if (!c.equals(w)) {
			if (!a.equals(w)) {
				if (!a.equals(c)) {
					for (While __DEC_d_last_120562 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "last")) {
						if (!w.equals(__DEC_d_last_120562)) {
							if (!c.equals(__DEC_d_last_120562)) {
								if (!a.equals(__DEC_d_last_120562)) {
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

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_3B(Assignment d) {
		for (Program __DEC_d_first_902332 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_4B(Assignment b) {
		for (Decision __DEC_b_positive_940305 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_5B(Assignment b) {
		for (Decision __DEC_b_negative_884074 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_6BBBB(Assignment b,
			While w, While c, While a) {
		if (!c.equals(w)) {
			if (!a.equals(w)) {
				if (!a.equals(c)) {
					for (While __DEC_b_last_867297 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "last")) {
						if (!w.equals(__DEC_b_last_867297)) {
							if (!c.equals(__DEC_b_last_867297)) {
								if (!a.equals(__DEC_b_last_867297)) {
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

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_7B(Assignment b) {
		for (Program __DEC_b_first_850456 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_8B(While c) {
		for (Decision __DEC_c_positive_163777 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_9B(While c) {
		for (Decision __DEC_c_negative_710458 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_10BBB(While c, While w,
			While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_first_470207 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "first")) {
						if (!c.equals(__DEC_c_first_470207)) {
							if (!w.equals(__DEC_c_first_470207)) {
								if (!a.equals(__DEC_c_first_470207)) {
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

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_11BBB(While c, While w,
			While a) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_last_273831 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "last")) {
						if (!c.equals(__DEC_c_last_273831)) {
							if (!w.equals(__DEC_c_last_273831)) {
								if (!a.equals(__DEC_c_last_273831)) {
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

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_12B(While c) {
		for (Program __DEC_c_first_169668 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_13B(While a) {
		for (Decision __DEC_a_positive_77286 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_14B(While a) {
		for (Decision __DEC_a_negative_261729 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_15BBB(While a, While w,
			While c) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!c.equals(w)) {
					for (While __DEC_a_last_66131 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, While.class, "last")) {
						if (!a.equals(__DEC_a_last_66131)) {
							if (!w.equals(__DEC_a_last_66131)) {
								if (!c.equals(__DEC_a_last_66131)) {
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

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_16B(While a) {
		for (Program __DEC_a_first_846187 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
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

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_21BB(While w, While c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_22BB(While w, While c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_23BB(While w, While a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_24BB(While c, While a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_27_1_matchtggpattern_blackBBBBB(Assignment d, While w,
			Assignment b, While c, While a) {
		if (!b.equals(d)) {
			if (!c.equals(w)) {
				if (!a.equals(w)) {
					if (!a.equals(c)) {
						if (a.equals(w.getFirst())) {
							if (c.equals(w.getNext())) {
								if (d.equals(c.getLast())) {
									if (b.equals(a.getFirst())) {
										if (d.equals(c.getFirst())) {
											if (b.equals(a.getLast())) {
												if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_0B(
														d) == null) {
													if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_1B(
															d) == null) {
														if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_2BBBB(
																d, w, c, a) == null) {
															if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_3B(
																	d) == null) {
																if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_4B(
																		b) == null) {
																	if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_5B(
																			b) == null) {
																		if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_6BBBB(
																				b, w, c, a) == null) {
																			if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_7B(
																					b) == null) {
																				if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_8B(
																						c) == null) {
																					if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_9B(
																							c) == null) {
																						if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_10BBB(
																								c, w, a) == null) {
																							if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_11BBB(
																									c, w, a) == null) {
																								if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_12B(
																										c) == null) {
																									if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_13B(
																											a) == null) {
																										if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_14B(
																												a) == null) {
																											if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_15BBB(
																													a,
																													w,
																													c) == null) {
																												if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_16B(
																														a) == null) {
																													if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_17BB(
																															w,
																															d) == null) {
																														if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_18BB(
																																a,
																																d) == null) {
																															if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_19BB(
																																	w,
																																	b) == null) {
																																if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_20BB(
																																		c,
																																		b) == null) {
																																	if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_21BB(
																																			w,
																																			c) == null) {
																																		if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_22BB(
																																				w,
																																				c) == null) {
																																			if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_23BB(
																																					w,
																																					a) == null) {
																																				if (pattern_whileulul2branchubub_27_1_matchtggpattern_black_nac_24BB(
																																						c,
																																						a) == null) {
																																					return new Object[] {
																																							d,
																																							w,
																																							b,
																																							c,
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

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_0B(Command y) {
		for (Graph __DEC_y_root_175035 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_1BBBB(Command y, Branch z,
			Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_y_positive_135190 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!z.equals(__DEC_y_positive_135190)) {
							if (!x.equals(__DEC_y_positive_135190)) {
								if (!i.equals(__DEC_y_positive_135190)) {
									return new Object[] { y, z, x, i };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_2BBBB(Command y, Branch z,
			Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_y_negative_138871 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!z.equals(__DEC_y_negative_138871)) {
							if (!x.equals(__DEC_y_negative_138871)) {
								if (!i.equals(__DEC_y_negative_138871)) {
									return new Object[] { y, z, x, i };
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
		for (Graph __DEC_v_root_475545 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(v,
				Graph.class, "root")) {
			return new Object[] { v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_4BBBB(Command v, Branch z,
			Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_v_positive_51830 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "positive")) {
						if (!z.equals(__DEC_v_positive_51830)) {
							if (!x.equals(__DEC_v_positive_51830)) {
								if (!i.equals(__DEC_v_positive_51830)) {
									return new Object[] { v, z, x, i };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_5BBBB(Command v, Branch z,
			Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_v_negative_828734 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "negative")) {
						if (!z.equals(__DEC_v_negative_828734)) {
							if (!x.equals(__DEC_v_negative_828734)) {
								if (!i.equals(__DEC_v_negative_828734)) {
									return new Object[] { v, z, x, i };
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
		for (Graph __DEC_z_root_788945 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
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
					for (Branch __DEC_z_positive_447086 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_447086)) {
							if (!x.equals(__DEC_z_positive_447086)) {
								if (!i.equals(__DEC_z_positive_447086)) {
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
					for (Branch __DEC_z_negative_808353 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_808353)) {
							if (!x.equals(__DEC_z_negative_808353)) {
								if (!i.equals(__DEC_z_negative_808353)) {
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

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_9B(Branch x) {
		for (Graph __DEC_x_root_539289 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_10BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_604942 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_604942)) {
							if (!z.equals(__DEC_x_positive_604942)) {
								if (!i.equals(__DEC_x_positive_604942)) {
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

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_11BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_740905 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_740905)) {
							if (!z.equals(__DEC_x_negative_740905)) {
								if (!i.equals(__DEC_x_negative_740905)) {
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

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_12BB(Branch z, Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_13BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_14BB(Branch z, Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_15BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_16BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_17BB(Branch x, Command v) {
		if (v.equals(x.getPositive())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_18BB(Branch i, Command v) {
		if (v.equals(i.getPositive())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_19BB(Branch z, Command v) {
		if (v.equals(z.getNegative())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_20BB(Branch x, Command v) {
		if (v.equals(x.getNegative())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_21BB(Branch i, Command v) {
		if (v.equals(i.getNegative())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_22BB(Branch z, Branch x) {
		if (x.equals(z.getPositive())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_23BB(Branch z, Branch x) {
		if (x.equals(z.getNegative())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_28_1_matchtggpattern_blackBBBBB(Command y, Command v,
			Branch z, Branch x, Branch i) {
		if (!v.equals(y)) {
			if (!x.equals(z)) {
				if (!i.equals(z)) {
					if (!i.equals(x)) {
						if (x.equals(y.getNext())) {
							if (x.equals(i.getPositive())) {
								if (z.equals(i.getNegative())) {
									if (z.equals(v.getNext())) {
										if (y.equals(x.getPositive())) {
											if (v.equals(z.getPositive())) {
												if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_0B(
														y) == null) {
													if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_1BBBB(
															y, z, x, i) == null) {
														if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_2BBBB(
																y, z, x, i) == null) {
															if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_3B(
																	v) == null) {
																if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_4BBBB(
																		v, z, x, i) == null) {
																	if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_5BBBB(
																			v, z, x, i) == null) {
																		if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_6B(
																				z) == null) {
																			if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_7BBB(
																					z, x, i) == null) {
																				if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_8BBB(
																						z, x, i) == null) {
																					if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_9B(
																							x) == null) {
																						if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_10BBB(
																								x, z, i) == null) {
																							if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_11BBB(
																									x, z, i) == null) {
																								if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_12BB(
																										z, y) == null) {
																									if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_13BB(
																											i,
																											y) == null) {
																										if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_14BB(
																												z,
																												y) == null) {
																											if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_15BB(
																													x,
																													y) == null) {
																												if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_16BB(
																														i,
																														y) == null) {
																													if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_17BB(
																															x,
																															v) == null) {
																														if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_18BB(
																																i,
																																v) == null) {
																															if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_19BB(
																																	z,
																																	v) == null) {
																																if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_20BB(
																																		x,
																																		v) == null) {
																																	if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_21BB(
																																			i,
																																			v) == null) {
																																		if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_22BB(
																																				z,
																																				x) == null) {
																																			if (pattern_whileulul2branchubub_28_1_matchtggpattern_black_nac_23BB(
																																					z,
																																					x) == null) {
																																				return new Object[] {
																																						y,
																																						v,
																																						z,
																																						x,
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
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
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
					Branch i = w2i.getTarget();
					if (i != null) {
						Statement tmpW = w2i.getSource();
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							if (pattern_whileulul2branchubub_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									w2i) == null) {
								if (pattern_whileulul2branchubub_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										i) == null) {
									if (pattern_whileulul2branchubub_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_whileulul2branchubub_29_3_solveCSP_bindingFBBBBBB(whileulul2branchubub _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, Branch i, While w, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, w2i, i, w, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w2i, i, w, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whileulul2branchubub_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileulul2branchubub_29_3_solveCSP_bindingAndBlackFBBBBBB(
			whileulul2branchubub _this, IsApplicableMatch isApplicableMatch, S2B w2i, Branch i, While w,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whileulul2branchubub_29_3_solveCSP_binding = pattern_whileulul2branchubub_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, w2i, i, w, ruleResult);
		if (result_pattern_whileulul2branchubub_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileulul2branchubub_29_3_solveCSP_binding[0];

			Object[] result_pattern_whileulul2branchubub_29_3_solveCSP_black = pattern_whileulul2branchubub_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whileulul2branchubub_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w2i, i, w, ruleResult };
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

	public static final Object[] pattern_whileulul2branchubub_29_5_checknacs_blackBBB(S2B w2i, Branch i, While w) {
		return new Object[] { w2i, i, w };
	}

	public static final Object[] pattern_whileulul2branchubub_29_6_perform_blackBBBB(S2B w2i, Branch i, While w,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { w2i, i, w, ruleResult };
	}

	public static final Object[] pattern_whileulul2branchubub_29_6_perform_greenFFFFFFFFFBBFFFB(Branch i, While w,
			ModelgeneratorRuleResult ruleResult) {
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Command v = ControlflowFactory.eINSTANCE.createCommand();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment d = SourcecodeFactory.eINSTANCE.createAssignment();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getTargetObjects().add(y);
		ruleResult.getTargetObjects().add(v);
		b2y.setTarget(y);
		ruleResult.getCorrObjects().add(b2y);
		d2v.setTarget(v);
		ruleResult.getCorrObjects().add(d2v);
		d2v.setSource(d);
		ruleResult.getSourceObjects().add(d);
		i.setNegative(z);
		v.setNext(z);
		z.setPositive(v);
		ruleResult.getTargetObjects().add(z);
		c2z.setTarget(z);
		ruleResult.getCorrObjects().add(c2z);
		ruleResult.getCorrObjects().add(a2x);
		y.setNext(x);
		a2x.setTarget(x);
		i.setPositive(x);
		x.setPositive(y);
		ruleResult.getTargetObjects().add(x);
		b2y.setSource(b);
		ruleResult.getSourceObjects().add(b);
		w.setNext(c);
		c.setLast(d);
		c2z.setSource(c);
		c.setFirst(d);
		ruleResult.getSourceObjects().add(c);
		w.setFirst(a);
		a2x.setSource(a);
		a.setFirst(b);
		a.setLast(b);
		ruleResult.getSourceObjects().add(a);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { y, v, b2y, d2v, d, z, c2z, a2x, x, i, w, b, c, a, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whileulul2branchubub_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whileulul2branchububImpl
