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
import org.wbsilva.bx.sourcecode2controlflow.Rules.whilelul2branchbub;

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
 * An implementation of the model object '<em><b>whilelul2branchbub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class whilelul2branchbubImpl extends AbstractRuleImpl implements whilelul2branchbub {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected whilelul2branchbubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getwhilelul2branchbub();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Assignment d, Assignment b, While a, While c, While w) {

		Object[] result1_black = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_0_1_initialbindings_blackBBBBBBB(this, match, d, b, a, c, w);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[d] = " + d + ", " + "[b] = " + b + ", " + "[a] = " + a + ", "
					+ "[c] = " + c + ", " + "[w] = " + w + ".");
		}

		Object[] result2_bindingAndBlack = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, d, b, a, c, w);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[d] = " + d + ", " + "[b] = " + b + ", " + "[a] = " + a + ", "
					+ "[c] = " + c + ", " + "[w] = " + w + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whilelul2branchbubImpl.pattern_whilelul2branchbub_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whilelul2branchbubImpl
					.pattern_whilelul2branchbub_0_4_collectelementstobetranslated_blackBBBBBB(match, d, b, a, c, w);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[d] = " + d + ", "
								+ "[b] = " + b + ", " + "[a] = " + a + ", " + "[c] = " + c + ", " + "[w] = " + w + ".");
			}
			whilelul2branchbubImpl.pattern_whilelul2branchbub_0_4_collectelementstobetranslated_greenBBBBBBFFFFF(match,
					d, b, a, c, w);
			//nothing EMoflonEdge c__d____last = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge c__d____first = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[10];

			Object[] result5_black = whilelul2branchbubImpl
					.pattern_whilelul2branchbub_0_5_collectcontextelements_blackBBBBBB(match, d, b, a, c, w);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[d] = " + d + ", "
								+ "[b] = " + b + ", " + "[a] = " + a + ", " + "[c] = " + c + ", " + "[w] = " + w + ".");
			}
			whilelul2branchbubImpl.pattern_whilelul2branchbub_0_5_collectcontextelements_greenBB(match, w);

			// 
			whilelul2branchbubImpl.pattern_whilelul2branchbub_0_6_registerobjectstomatch_expressionBBBBBBB(this, match,
					d, b, a, c, w);
			return whilelul2branchbubImpl.pattern_whilelul2branchbub_0_7_expressionF();
		} else {
			return whilelul2branchbubImpl.pattern_whilelul2branchbub_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Assignment d = (Assignment) result1_bindingAndBlack[0];
		Assignment b = (Assignment) result1_bindingAndBlack[1];
		Branch i = (Branch) result1_bindingAndBlack[2];
		S2B w2i = (S2B) result1_bindingAndBlack[3];
		While a = (While) result1_bindingAndBlack[4];
		While c = (While) result1_bindingAndBlack[5];
		While w = (While) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_1_1_performtransformation_greenBBBFFFFBBFFFF(d, b, i, a, c);
		Branch x = (Branch) result1_green[3];
		S2N d2v = (S2N) result1_green[4];
		S2N b2y = (S2N) result1_green[5];
		S2B c2z = (S2B) result1_green[6];
		S2B a2x = (S2B) result1_green[9];
		Command v = (Command) result1_green[10];
		Branch z = (Branch) result1_green[11];
		Command y = (Command) result1_green[12];

		Object[] result2_black = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(d, b, x, d2v, b2y, c2z, a,
						c, a2x, v, z, y);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d] = " + d + ", " + "[b] = " + b
					+ ", " + "[x] = " + x + ", " + "[d2v] = " + d2v + ", " + "[b2y] = " + b2y + ", " + "[c2z] = " + c2z
					+ ", " + "[a] = " + a + ", " + "[c] = " + c + ", " + "[a2x] = " + a2x + ", " + "[v] = " + v + ", "
					+ "[z] = " + z + ", " + "[y] = " + y + ".");
		}
		Object[] result2_green = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(d, b, x, d2v, b2y, c2z, a,
						c, a2x, v, z, y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, d, b, i, x, d2v,
						w2i, b2y, c2z, a, c, a2x, v, z, y, w);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[d] = " + d + ", " + "[b] = " + b + ", " + "[i] = " + i + ", " + "[x] = " + x + ", "
					+ "[d2v] = " + d2v + ", " + "[w2i] = " + w2i + ", " + "[b2y] = " + b2y + ", " + "[c2z] = " + c2z
					+ ", " + "[a] = " + a + ", " + "[c] = " + c + ", " + "[a2x] = " + a2x + ", " + "[v] = " + v + ", "
					+ "[z] = " + z + ", " + "[y] = " + y + ", " + "[w] = " + w + ".");
		}
		whilelul2branchbubImpl
				.pattern_whilelul2branchbub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(ruleresult,
						d, b, i, x, d2v, b2y, c2z, a, c, a2x, v, z, y, w);
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge c__d____first = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge d2v__v____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge z__v____positive = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge d2v__d____source = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[32];

		// 
		// 
		whilelul2branchbubImpl.pattern_whilelul2branchbub_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this,
				ruleresult, d, b, i, x, d2v, w2i, b2y, c2z, a, c, a2x, v, z, y, w);
		return whilelul2branchbubImpl.pattern_whilelul2branchbub_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whilelul2branchbubImpl.pattern_whilelul2branchbub_2_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Assignment d = (Assignment) result2_binding[0];
		Assignment b = (Assignment) result2_binding[1];
		While a = (While) result2_binding[2];
		While c = (While) result2_binding[3];
		While w = (While) result2_binding[4];
		for (Object[] result2_black : whilelul2branchbubImpl.pattern_whilelul2branchbub_2_2_corematch_blackBBFFBBBB(d,
				b, a, c, w, match)) {
			Branch i = (Branch) result2_black[2];
			S2B w2i = (S2B) result2_black[3];
			// ForEach 
			for (Object[] result3_black : whilelul2branchbubImpl
					.pattern_whilelul2branchbub_2_3_findcontext_blackBBBBBBB(d, b, i, w2i, a, c, w)) {
				Object[] result3_green = whilelul2branchbubImpl
						.pattern_whilelul2branchbub_2_3_findcontext_greenBBBBBBBFFFFFFFF(d, b, i, w2i, a, c, w);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge c__d____first = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = whilelul2branchbubImpl
						.pattern_whilelul2branchbub_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, d,
								b, i, w2i, a, c, w);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d] = " + d + ", " + "[b] = " + b
							+ ", " + "[i] = " + i + ", " + "[w2i] = " + w2i + ", " + "[a] = " + a + ", " + "[c] = " + c
							+ ", " + "[w] = " + w + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whilelul2branchbubImpl.pattern_whilelul2branchbub_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whilelul2branchbubImpl
							.pattern_whilelul2branchbub_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whilelul2branchbubImpl.pattern_whilelul2branchbub_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whilelul2branchbubImpl.pattern_whilelul2branchbub_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Assignment d, Assignment b, While a, While c, While w) {
		match.registerObject("d", d);
		match.registerObject("b", b);
		match.registerObject("a", a);
		match.registerObject("c", c);
		match.registerObject("w", w);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment d, Assignment b, While a, While c, While w) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Assignment d, Assignment b, Branch i,
			S2B w2i, While a, While c, While w) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("c", c);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject d, EObject b, EObject i, EObject x,
			EObject d2v, EObject w2i, EObject b2y, EObject c2z, EObject a, EObject c, EObject a2x, EObject v, EObject z,
			EObject y, EObject w) {
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("d2v", d2v);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("v", v);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("w", w);

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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.While.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch i, Branch x, Command v, Branch z, Command y) {

		Object[] result1_black = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_10_1_initialbindings_blackBBBBBBB(this, match, i, x, v, z, y);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[i] = " + i + ", " + "[x] = " + x + ", " + "[v] = " + v + ", "
					+ "[z] = " + z + ", " + "[y] = " + y + ".");
		}

		Object[] result2_bindingAndBlack = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, i, x, v, z, y);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[i] = " + i + ", " + "[x] = " + x + ", " + "[v] = " + v + ", "
					+ "[z] = " + z + ", " + "[y] = " + y + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whilelul2branchbubImpl.pattern_whilelul2branchbub_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whilelul2branchbubImpl
					.pattern_whilelul2branchbub_10_4_collectelementstobetranslated_blackBBBBBB(match, i, x, v, z, y);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[i] = " + i + ", "
								+ "[x] = " + x + ", " + "[v] = " + v + ", " + "[z] = " + z + ", " + "[y] = " + y + ".");
			}
			whilelul2branchbubImpl.pattern_whilelul2branchbub_10_4_collectelementstobetranslated_greenBBBBBBFFFFF(match,
					i, x, v, z, y);
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge v__z____next = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge z__v____positive = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge y__x____next = (EMoflonEdge) result4_green[10];

			Object[] result5_black = whilelul2branchbubImpl
					.pattern_whilelul2branchbub_10_5_collectcontextelements_blackBBBBBB(match, i, x, v, z, y);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[i] = " + i + ", "
								+ "[x] = " + x + ", " + "[v] = " + v + ", " + "[z] = " + z + ", " + "[y] = " + y + ".");
			}
			whilelul2branchbubImpl.pattern_whilelul2branchbub_10_5_collectcontextelements_greenBB(match, i);

			// 
			whilelul2branchbubImpl.pattern_whilelul2branchbub_10_6_registerobjectstomatch_expressionBBBBBBB(this, match,
					i, x, v, z, y);
			return whilelul2branchbubImpl.pattern_whilelul2branchbub_10_7_expressionF();
		} else {
			return whilelul2branchbubImpl.pattern_whilelul2branchbub_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Branch i = (Branch) result1_bindingAndBlack[0];
		Branch x = (Branch) result1_bindingAndBlack[1];
		S2B w2i = (S2B) result1_bindingAndBlack[2];
		Command v = (Command) result1_bindingAndBlack[3];
		Branch z = (Branch) result1_bindingAndBlack[4];
		Command y = (Command) result1_bindingAndBlack[5];
		While w = (While) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_11_1_performtransformation_greenFFBFFFFFFBBBB(x, v, z, y, w);
		Assignment d = (Assignment) result1_green[0];
		Assignment b = (Assignment) result1_green[1];
		S2N d2v = (S2N) result1_green[3];
		S2N b2y = (S2N) result1_green[4];
		S2B c2z = (S2B) result1_green[5];
		While a = (While) result1_green[6];
		While c = (While) result1_green[7];
		S2B a2x = (S2B) result1_green[8];

		Object[] result2_black = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(d, b, x, d2v, b2y, c2z, a,
						c, a2x, v, z, y);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d] = " + d + ", " + "[b] = " + b
					+ ", " + "[x] = " + x + ", " + "[d2v] = " + d2v + ", " + "[b2y] = " + b2y + ", " + "[c2z] = " + c2z
					+ ", " + "[a] = " + a + ", " + "[c] = " + c + ", " + "[a2x] = " + a2x + ", " + "[v] = " + v + ", "
					+ "[z] = " + z + ", " + "[y] = " + y + ".");
		}
		Object[] result2_green = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(d, b, x, d2v, b2y, c2z, a,
						c, a2x, v, z, y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, d, b, i, x, d2v,
						w2i, b2y, c2z, a, c, a2x, v, z, y, w);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[d] = " + d + ", " + "[b] = " + b + ", " + "[i] = " + i + ", " + "[x] = " + x + ", "
					+ "[d2v] = " + d2v + ", " + "[w2i] = " + w2i + ", " + "[b2y] = " + b2y + ", " + "[c2z] = " + c2z
					+ ", " + "[a] = " + a + ", " + "[c] = " + c + ", " + "[a2x] = " + a2x + ", " + "[v] = " + v + ", "
					+ "[z] = " + z + ", " + "[y] = " + y + ", " + "[w] = " + w + ".");
		}
		whilelul2branchbubImpl
				.pattern_whilelul2branchbub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(ruleresult,
						d, b, i, x, d2v, b2y, c2z, a, c, a2x, v, z, y, w);
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge c__d____first = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge d2v__v____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge z__v____positive = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge d2v__d____source = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[32];

		// 
		// 
		whilelul2branchbubImpl.pattern_whilelul2branchbub_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this,
				ruleresult, d, b, i, x, d2v, w2i, b2y, c2z, a, c, a2x, v, z, y, w);
		return whilelul2branchbubImpl.pattern_whilelul2branchbub_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_12_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Branch i = (Branch) result2_binding[0];
		Branch x = (Branch) result2_binding[1];
		Command v = (Command) result2_binding[2];
		Branch z = (Branch) result2_binding[3];
		Command y = (Command) result2_binding[4];
		for (Object[] result2_black : whilelul2branchbubImpl.pattern_whilelul2branchbub_12_2_corematch_blackBBFBBBFB(i,
				x, v, z, y, match)) {
			S2B w2i = (S2B) result2_black[2];
			While w = (While) result2_black[6];
			// ForEach 
			for (Object[] result3_black : whilelul2branchbubImpl
					.pattern_whilelul2branchbub_12_3_findcontext_blackBBBBBBB(i, x, w2i, v, z, y, w)) {
				Object[] result3_green = whilelul2branchbubImpl
						.pattern_whilelul2branchbub_12_3_findcontext_greenBBBBBBBFFFFFFFF(i, x, w2i, v, z, y, w);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge z__v____positive = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = whilelul2branchbubImpl
						.pattern_whilelul2branchbub_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, i,
								x, w2i, v, z, y, w);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[i] = " + i + ", " + "[x] = " + x
							+ ", " + "[w2i] = " + w2i + ", " + "[v] = " + v + ", " + "[z] = " + z + ", " + "[y] = " + y
							+ ", " + "[w] = " + w + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whilelul2branchbubImpl.pattern_whilelul2branchbub_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whilelul2branchbubImpl
							.pattern_whilelul2branchbub_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whilelul2branchbubImpl.pattern_whilelul2branchbub_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whilelul2branchbubImpl.pattern_whilelul2branchbub_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Branch i, Branch x, Command v, Branch z, Command y) {
		match.registerObject("i", i);
		match.registerObject("x", x);
		match.registerObject("v", v);
		match.registerObject("z", z);
		match.registerObject("y", y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch i, Branch x, Command v, Branch z, Command y) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch i, Branch x, S2B w2i, Command v,
			Branch z, Command y, While w) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("v", v);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("y", y);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject d, EObject b, EObject i, EObject x,
			EObject d2v, EObject w2i, EObject b2y, EObject c2z, EObject a, EObject c, EObject a2x, EObject v, EObject z,
			EObject y, EObject w) {
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("d2v", d2v);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("v", v);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("w", w);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_99(EMoflonEdge _edge_negative) {

		Object[] result1_bindingAndBlack = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whilelul2branchbubImpl.pattern_whilelul2branchbub_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whilelul2branchbubImpl
				.pattern_whilelul2branchbub_20_2_testcorematchandDECs_blackFFFFFB(_edge_negative)) {
			Branch i = (Branch) result2_black[0];
			Branch x = (Branch) result2_black[1];
			Command v = (Command) result2_black[2];
			Branch z = (Branch) result2_black[3];
			Command y = (Command) result2_black[4];
			Object[] result2_green = whilelul2branchbubImpl
					.pattern_whilelul2branchbub_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whilelul2branchbubImpl
					.pattern_whilelul2branchbub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, i, x, v, z, y)) {
				// 
				if (whilelul2branchbubImpl
						.pattern_whilelul2branchbub_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = whilelul2branchbubImpl
							.pattern_whilelul2branchbub_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whilelul2branchbubImpl.pattern_whilelul2branchbub_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whilelul2branchbubImpl.pattern_whilelul2branchbub_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_105(EMoflonEdge _edge_last) {

		Object[] result1_bindingAndBlack = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whilelul2branchbubImpl.pattern_whilelul2branchbub_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whilelul2branchbubImpl
				.pattern_whilelul2branchbub_21_2_testcorematchandDECs_blackFFFFFB(_edge_last)) {
			Assignment d = (Assignment) result2_black[0];
			Assignment b = (Assignment) result2_black[1];
			While a = (While) result2_black[2];
			While c = (While) result2_black[3];
			While w = (While) result2_black[4];
			Object[] result2_green = whilelul2branchbubImpl
					.pattern_whilelul2branchbub_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whilelul2branchbubImpl
					.pattern_whilelul2branchbub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, d, b, a, c, w)) {
				// 
				if (whilelul2branchbubImpl
						.pattern_whilelul2branchbub_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = whilelul2branchbubImpl
							.pattern_whilelul2branchbub_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whilelul2branchbubImpl.pattern_whilelul2branchbub_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whilelul2branchbubImpl.pattern_whilelul2branchbub_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("whilelul2branchbub");
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
		ruleResult.setRule("whilelul2branchbub");
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

		Object[] result1_black = whilelul2branchbubImpl.pattern_whilelul2branchbub_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whilelul2branchbubImpl.pattern_whilelul2branchbub_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Assignment d = (Assignment) result2_bindingAndBlack[0];
		Assignment b = (Assignment) result2_bindingAndBlack[1];
		Branch i = (Branch) result2_bindingAndBlack[2];
		Branch x = (Branch) result2_bindingAndBlack[3];
		While a = (While) result2_bindingAndBlack[4];
		While c = (While) result2_bindingAndBlack[5];
		Command v = (Command) result2_bindingAndBlack[6];
		Branch z = (Branch) result2_bindingAndBlack[7];
		Command y = (Command) result2_bindingAndBlack[8];
		While w = (While) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, d, b, i, x, a, c, v, z, y,
						w, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[d] = " + d + ", " + "[b] = " + b + ", " + "[i] = " + i + ", " + "[x] = " + x + ", " + "[a] = "
					+ a + ", " + "[c] = " + c + ", " + "[v] = " + v + ", " + "[z] = " + z + ", " + "[y] = " + y + ", "
					+ "[w] = " + w + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whilelul2branchbubImpl.pattern_whilelul2branchbub_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whilelul2branchbubImpl
					.pattern_whilelul2branchbub_24_5_matchcorrcontext_blackBFBBB(i, w, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[1];
				Object[] result5_green = whilelul2branchbubImpl
						.pattern_whilelul2branchbub_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whilelul2branchbubImpl
						.pattern_whilelul2branchbub_24_6_createcorrespondence_blackBBBBBBBBBBB(d, b, i, x, a, c, v, z,
								y, w, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d] = " + d + ", "
							+ "[b] = " + b + ", " + "[i] = " + i + ", " + "[x] = " + x + ", " + "[a] = " + a + ", "
							+ "[c] = " + c + ", " + "[v] = " + v + ", " + "[z] = " + z + ", " + "[y] = " + y + ", "
							+ "[w] = " + w + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whilelul2branchbubImpl.pattern_whilelul2branchbub_24_6_createcorrespondence_greenBBBFFFBBFBBBB(d, b, x,
						a, c, v, z, y, ccMatch);
				//nothing S2N d2v = (S2N) result6_green[3];
				//nothing S2N b2y = (S2N) result6_green[4];
				//nothing S2B c2z = (S2B) result6_green[5];
				//nothing S2B a2x = (S2B) result6_green[8];

				Object[] result7_black = whilelul2branchbubImpl
						.pattern_whilelul2branchbub_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whilelul2branchbubImpl.pattern_whilelul2branchbub_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return whilelul2branchbubImpl.pattern_whilelul2branchbub_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Assignment d, Assignment b, Branch i, Branch x, While a, While c, Command v,
			Branch z, Command y, While w, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Assignment d, Assignment b, While a, While c, While w) {// 
		Object[] result1_black = whilelul2branchbubImpl.pattern_whilelul2branchbub_27_1_matchtggpattern_blackBBBBB(d, b,
				a, c, w);
		if (result1_black != null) {
			return whilelul2branchbubImpl.pattern_whilelul2branchbub_27_2_expressionF();
		} else {
			return whilelul2branchbubImpl.pattern_whilelul2branchbub_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Branch i, Branch x, Command v, Branch z, Command y) {// 
		Object[] result1_black = whilelul2branchbubImpl.pattern_whilelul2branchbub_28_1_matchtggpattern_blackBBBBB(i, x,
				v, z, y);
		if (result1_black != null) {
			return whilelul2branchbubImpl.pattern_whilelul2branchbub_28_2_expressionF();
		} else {
			return whilelul2branchbubImpl.pattern_whilelul2branchbub_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B w2iParameter) {

		Object[] result1_black = whilelul2branchbubImpl.pattern_whilelul2branchbub_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whilelul2branchbubImpl.pattern_whilelul2branchbub_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : whilelul2branchbubImpl
				.pattern_whilelul2branchbub_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList w2iList = (RuleEntryList) result2_black[0];
			Branch i = (Branch) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			While w = (While) result2_black[3];

			Object[] result3_bindingAndBlack = whilelul2branchbubImpl
					.pattern_whilelul2branchbub_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, i, w2i, w,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[i] = " + i + ", " + "[w2i] = " + w2i
						+ ", " + "[w] = " + w + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whilelul2branchbubImpl.pattern_whilelul2branchbub_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whilelul2branchbubImpl.pattern_whilelul2branchbub_29_5_checknacs_blackBBB(i,
						w2i, w);
				if (result5_black != null) {

					Object[] result6_black = whilelul2branchbubImpl.pattern_whilelul2branchbub_29_6_perform_blackBBBB(i,
							w2i, w, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[i] = " + i + ", "
								+ "[w2i] = " + w2i + ", " + "[w] = " + w + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whilelul2branchbubImpl.pattern_whilelul2branchbub_29_6_perform_greenFFBFFFFFFFFFFBB(i, w,
							ruleResult);
					//nothing Assignment d = (Assignment) result6_green[0];
					//nothing Assignment b = (Assignment) result6_green[1];
					//nothing Branch x = (Branch) result6_green[3];
					//nothing S2N d2v = (S2N) result6_green[4];
					//nothing S2N b2y = (S2N) result6_green[5];
					//nothing S2B c2z = (S2B) result6_green[6];
					//nothing While a = (While) result6_green[7];
					//nothing While c = (While) result6_green[8];
					//nothing S2B a2x = (S2B) result6_green[9];
					//nothing Command v = (Command) result6_green[10];
					//nothing Branch z = (Branch) result6_green[11];
					//nothing Command y = (Command) result6_green[12];

				} else {
				}

			} else {
			}

		}
		return whilelul2branchbubImpl.pattern_whilelul2branchbub_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, While w,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("w2i", w2i);
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
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_ASSIGNMENT_WHILE_WHILE_WHILE:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (While) arguments.get(4),
					(While) arguments.get(5));
		case RulesPackage.WHILELUL2BRANCHBUB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILELUL2BRANCHBUB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_ASSIGNMENT_WHILE_WHILE_WHILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (While) arguments.get(4),
					(While) arguments.get(5));
			return null;
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_ASSIGNMENT_WHILE_WHILE_WHILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (While) arguments.get(4),
					(While) arguments.get(5));
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASSIGNMENT_ASSIGNMENT_BRANCH_S2B_WHILE_WHILE_WHILE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(Assignment) arguments.get(2), (Branch) arguments.get(3), (S2B) arguments.get(4),
					(While) arguments.get(5), (While) arguments.get(6), (While) arguments.get(7));
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILELUL2BRANCHBUB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.WHILELUL2BRANCHBUB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPROPRIATE_BWD__MATCH_BRANCH_BRANCH_COMMAND_BRANCH_COMMAND:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4), (Command) arguments.get(5));
		case RulesPackage.WHILELUL2BRANCHBUB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILELUL2BRANCHBUB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_BRANCH_COMMAND_BRANCH_COMMAND:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4), (Command) arguments.get(5));
			return null;
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_BRANCH_COMMAND_BRANCH_COMMAND:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Branch) arguments.get(4),
					(Command) arguments.get(5));
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_BRANCH_S2B_COMMAND_BRANCH_COMMAND_WHILE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (S2B) arguments.get(3), (Command) arguments.get(4),
					(Branch) arguments.get(5), (Command) arguments.get(6), (While) arguments.get(7));
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILELUL2BRANCHBUB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.WHILELUL2BRANCHBUB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_99__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_99((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_105__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_105((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILELUL2BRANCHBUB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILELUL2BRANCHBUB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_CC__ASSIGNMENT_ASSIGNMENT_BRANCH_BRANCH_WHILE_WHILE_COMMAND_BRANCH_COMMAND_WHILE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Assignment) arguments.get(0), (Assignment) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3), (While) arguments.get(4),
					(While) arguments.get(5), (Command) arguments.get(6), (Branch) arguments.get(7),
					(Command) arguments.get(8), (While) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILELUL2BRANCHBUB___CHECK_DEC_FWD__ASSIGNMENT_ASSIGNMENT_WHILE_WHILE_WHILE:
			return checkDEC_FWD((Assignment) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2),
					(While) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.WHILELUL2BRANCHBUB___CHECK_DEC_BWD__BRANCH_BRANCH_COMMAND_BRANCH_COMMAND:
			return checkDEC_BWD((Branch) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4));
		case RulesPackage.WHILELUL2BRANCHBUB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILELUL2BRANCHBUB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_S2B_WHILE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (While) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILELUL2BRANCHBUB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whilelul2branchbub_0_1_initialbindings_blackBBBBBBB(whilelul2branchbub _this,
			Match match, Assignment d, Assignment b, While a, While c, While w) {
		if (!b.equals(d)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!c.equals(w)) {
						return new Object[] { _this, match, d, b, a, c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_0_2_SolveCSP_bindingFBBBBBBB(whilelul2branchbub _this,
			Match match, Assignment d, Assignment b, While a, While c, While w) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, d, b, a, c, w);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, d, b, a, c, w };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilelul2branchbub_0_2_SolveCSP_bindingAndBlackFBBBBBBB(
			whilelul2branchbub _this, Match match, Assignment d, Assignment b, While a, While c, While w) {
		Object[] result_pattern_whilelul2branchbub_0_2_SolveCSP_binding = pattern_whilelul2branchbub_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, d, b, a, c, w);
		if (result_pattern_whilelul2branchbub_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilelul2branchbub_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whilelul2branchbub_0_2_SolveCSP_black = pattern_whilelul2branchbub_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whilelul2branchbub_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, d, b, a, c, w };
			}
		}
		return null;
	}

	public static final boolean pattern_whilelul2branchbub_0_3_CheckCSP_expressionFBB(whilelul2branchbub _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilelul2branchbub_0_4_collectelementstobetranslated_blackBBBBBB(Match match,
			Assignment d, Assignment b, While a, While c, While w) {
		if (!b.equals(d)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!c.equals(w)) {
						return new Object[] { match, d, b, a, c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_0_4_collectelementstobetranslated_greenBBBBBBFFFFF(
			Match match, Assignment d, Assignment b, While a, While c, While w) {
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(d);
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(c);
		String c__d____last_name_prime = "last";
		String a__b____last_name_prime = "last";
		String c__d____first_name_prime = "first";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		match.getToBeTranslatedEdges().add(c__d____last);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____last);
		c__d____first.setSrc(c);
		c__d____first.setTrg(d);
		match.getToBeTranslatedEdges().add(c__d____first);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		c__d____last.setName(c__d____last_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		c__d____first.setName(c__d____first_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		return new Object[] { match, d, b, a, c, w, c__d____last, a__b____last, c__d____first, w__a____first,
				w__c____next };
	}

	public static final Object[] pattern_whilelul2branchbub_0_5_collectcontextelements_blackBBBBBB(Match match,
			Assignment d, Assignment b, While a, While c, While w) {
		if (!b.equals(d)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!c.equals(w)) {
						return new Object[] { match, d, b, a, c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whilelul2branchbub_0_6_registerobjectstomatch_expressionBBBBBBB(
			whilelul2branchbub _this, Match match, Assignment d, Assignment b, While a, While c, While w) {
		_this.registerObjectsToMatch_FWD(match, d, b, a, c, w);

	}

	public static final boolean pattern_whilelul2branchbub_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whilelul2branchbub_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whilelul2branchbub_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("d");
		EObject _localVariable_1 = isApplicableMatch.getObject("b");
		EObject _localVariable_2 = isApplicableMatch.getObject("i");
		EObject _localVariable_3 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_4 = isApplicableMatch.getObject("a");
		EObject _localVariable_5 = isApplicableMatch.getObject("c");
		EObject _localVariable_6 = isApplicableMatch.getObject("w");
		EObject tmpD = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpI = _localVariable_2;
		EObject tmpW2i = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpC = _localVariable_5;
		EObject tmpW = _localVariable_6;
		if (tmpD instanceof Assignment) {
			Assignment d = (Assignment) tmpD;
			if (tmpB instanceof Assignment) {
				Assignment b = (Assignment) tmpB;
				if (tmpI instanceof Branch) {
					Branch i = (Branch) tmpI;
					if (tmpW2i instanceof S2B) {
						S2B w2i = (S2B) tmpW2i;
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							if (tmpC instanceof While) {
								While c = (While) tmpC;
								if (tmpW instanceof While) {
									While w = (While) tmpW;
									return new Object[] { d, b, i, w2i, a, c, w, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_1_1_performtransformation_blackBBBBBBBFBB(Assignment d,
			Assignment b, Branch i, S2B w2i, While a, While c, While w, whilelul2branchbub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!b.equals(d)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!c.equals(w)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { d, b, i, w2i, a, c, w, csp, _this, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			whilelul2branchbub _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whilelul2branchbub_1_1_performtransformation_binding = pattern_whilelul2branchbub_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_whilelul2branchbub_1_1_performtransformation_binding != null) {
			Assignment d = (Assignment) result_pattern_whilelul2branchbub_1_1_performtransformation_binding[0];
			Assignment b = (Assignment) result_pattern_whilelul2branchbub_1_1_performtransformation_binding[1];
			Branch i = (Branch) result_pattern_whilelul2branchbub_1_1_performtransformation_binding[2];
			S2B w2i = (S2B) result_pattern_whilelul2branchbub_1_1_performtransformation_binding[3];
			While a = (While) result_pattern_whilelul2branchbub_1_1_performtransformation_binding[4];
			While c = (While) result_pattern_whilelul2branchbub_1_1_performtransformation_binding[5];
			While w = (While) result_pattern_whilelul2branchbub_1_1_performtransformation_binding[6];

			Object[] result_pattern_whilelul2branchbub_1_1_performtransformation_black = pattern_whilelul2branchbub_1_1_performtransformation_blackBBBBBBBFBB(
					d, b, i, w2i, a, c, w, _this, isApplicableMatch);
			if (result_pattern_whilelul2branchbub_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whilelul2branchbub_1_1_performtransformation_black[7];

				return new Object[] { d, b, i, w2i, a, c, w, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_1_1_performtransformation_greenBBBFFFFBBFFFF(Assignment d,
			Assignment b, Branch i, While a, While c) {
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command v = ControlflowFactory.eINSTANCE.createCommand();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		i.setPositive(x);
		d2v.setSource(d);
		b2y.setSource(b);
		c2z.setSource(c);
		a2x.setSource(a);
		a2x.setTarget(x);
		d2v.setTarget(v);
		i.setNegative(z);
		v.setNext(z);
		z.setPositive(v);
		c2z.setTarget(z);
		b2y.setTarget(y);
		y.setNext(x);
		return new Object[] { d, b, i, x, d2v, b2y, c2z, a, c, a2x, v, z, y };
	}

	public static final Object[] pattern_whilelul2branchbub_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(
			Assignment d, Assignment b, Branch x, S2N d2v, S2N b2y, S2B c2z, While a, While c, S2B a2x, Command v,
			Branch z, Command y) {
		if (!b.equals(d)) {
			if (!x.equals(z)) {
				if (!b2y.equals(d2v)) {
					if (!a.equals(c)) {
						if (!a2x.equals(c2z)) {
							if (!v.equals(y)) {
								return new Object[] { d, b, x, d2v, b2y, c2z, a, c, a2x, v, z, y };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(
			Assignment d, Assignment b, Branch x, S2N d2v, S2N b2y, S2B c2z, While a, While c, S2B a2x, Command v,
			Branch z, Command y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(d);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(d2v);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(v);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedElements().add(y);
		return new Object[] { ruleresult, d, b, x, d2v, b2y, c2z, a, c, a2x, v, z, y };
	}

	public static final Object[] pattern_whilelul2branchbub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject d, EObject b, EObject i, EObject x, EObject d2v, EObject w2i,
			EObject b2y, EObject c2z, EObject a, EObject c, EObject a2x, EObject v, EObject z, EObject y, EObject w) {
		if (!d.equals(i)) {
			if (!d.equals(x)) {
				if (!d.equals(d2v)) {
					if (!d.equals(w2i)) {
						if (!d.equals(v)) {
							if (!d.equals(z)) {
								if (!d.equals(y)) {
									if (!d.equals(w)) {
										if (!b.equals(d)) {
											if (!b.equals(i)) {
												if (!b.equals(x)) {
													if (!b.equals(d2v)) {
														if (!b.equals(w2i)) {
															if (!b.equals(b2y)) {
																if (!b.equals(c2z)) {
																	if (!b.equals(c)) {
																		if (!b.equals(v)) {
																			if (!b.equals(z)) {
																				if (!b.equals(y)) {
																					if (!b.equals(w)) {
																						if (!i.equals(x)) {
																							if (!i.equals(w2i)) {
																								if (!i.equals(v)) {
																									if (!i.equals(z)) {
																										if (!i.equals(
																												y)) {
																											if (!i.equals(
																													w)) {
																												if (!x.equals(
																														z)) {
																													if (!x.equals(
																															y)) {
																														if (!d2v.equals(
																																i)) {
																															if (!d2v.equals(
																																	x)) {
																																if (!d2v.equals(
																																		w2i)) {
																																	if (!d2v.equals(
																																			v)) {
																																		if (!d2v.equals(
																																				z)) {
																																			if (!d2v.equals(
																																					y)) {
																																				if (!d2v.equals(
																																						w)) {
																																					if (!w2i.equals(
																																							x)) {
																																						if (!w2i.equals(
																																								z)) {
																																							if (!w2i.equals(
																																									y)) {
																																								if (!b2y.equals(
																																										d)) {
																																									if (!b2y.equals(
																																											i)) {
																																										if (!b2y.equals(
																																												x)) {
																																											if (!b2y.equals(
																																													d2v)) {
																																												if (!b2y.equals(
																																														w2i)) {
																																													if (!b2y.equals(
																																															c2z)) {
																																														if (!b2y.equals(
																																																c)) {
																																															if (!b2y.equals(
																																																	v)) {
																																																if (!b2y.equals(
																																																		z)) {
																																																	if (!b2y.equals(
																																																			y)) {
																																																		if (!b2y.equals(
																																																				w)) {
																																																			if (!c2z.equals(
																																																					d)) {
																																																				if (!c2z.equals(
																																																						i)) {
																																																					if (!c2z.equals(
																																																							x)) {
																																																						if (!c2z.equals(
																																																								d2v)) {
																																																							if (!c2z.equals(
																																																									w2i)) {
																																																								if (!c2z.equals(
																																																										v)) {
																																																									if (!c2z.equals(
																																																											z)) {
																																																										if (!c2z.equals(
																																																												y)) {
																																																											if (!c2z.equals(
																																																													w)) {
																																																												if (!a.equals(
																																																														d)) {
																																																													if (!a.equals(
																																																															b)) {
																																																														if (!a.equals(
																																																																i)) {
																																																															if (!a.equals(
																																																																	x)) {
																																																																if (!a.equals(
																																																																		d2v)) {
																																																																	if (!a.equals(
																																																																			w2i)) {
																																																																		if (!a.equals(
																																																																				b2y)) {
																																																																			if (!a.equals(
																																																																					c2z)) {
																																																																				if (!a.equals(
																																																																						c)) {
																																																																					if (!a.equals(
																																																																							a2x)) {
																																																																						if (!a.equals(
																																																																								v)) {
																																																																							if (!a.equals(
																																																																									z)) {
																																																																								if (!a.equals(
																																																																										y)) {
																																																																									if (!a.equals(
																																																																											w)) {
																																																																										if (!c.equals(
																																																																												d)) {
																																																																											if (!c.equals(
																																																																													i)) {
																																																																												if (!c.equals(
																																																																														x)) {
																																																																													if (!c.equals(
																																																																															d2v)) {
																																																																														if (!c.equals(
																																																																																w2i)) {
																																																																															if (!c.equals(
																																																																																	c2z)) {
																																																																																if (!c.equals(
																																																																																		v)) {
																																																																																	if (!c.equals(
																																																																																			z)) {
																																																																																		if (!c.equals(
																																																																																				y)) {
																																																																																			if (!c.equals(
																																																																																					w)) {
																																																																																				if (!a2x.equals(
																																																																																						d)) {
																																																																																					if (!a2x.equals(
																																																																																							b)) {
																																																																																						if (!a2x.equals(
																																																																																								i)) {
																																																																																							if (!a2x.equals(
																																																																																									x)) {
																																																																																								if (!a2x.equals(
																																																																																										d2v)) {
																																																																																									if (!a2x.equals(
																																																																																											w2i)) {
																																																																																										if (!a2x.equals(
																																																																																												b2y)) {
																																																																																											if (!a2x.equals(
																																																																																													c2z)) {
																																																																																												if (!a2x.equals(
																																																																																														c)) {
																																																																																													if (!a2x.equals(
																																																																																															v)) {
																																																																																														if (!a2x.equals(
																																																																																																z)) {
																																																																																															if (!a2x.equals(
																																																																																																	y)) {
																																																																																																if (!a2x.equals(
																																																																																																		w)) {
																																																																																																	if (!v.equals(
																																																																																																			x)) {
																																																																																																		if (!v.equals(
																																																																																																				w2i)) {
																																																																																																			if (!v.equals(
																																																																																																					z)) {
																																																																																																				if (!v.equals(
																																																																																																						y)) {
																																																																																																					if (!v.equals(
																																																																																																							w)) {
																																																																																																						if (!y.equals(
																																																																																																								z)) {
																																																																																																							if (!w.equals(
																																																																																																									x)) {
																																																																																																								if (!w.equals(
																																																																																																										w2i)) {
																																																																																																									if (!w.equals(
																																																																																																											z)) {
																																																																																																										if (!w.equals(
																																																																																																												y)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													d,
																																																																																																													b,
																																																																																																													i,
																																																																																																													x,
																																																																																																													d2v,
																																																																																																													w2i,
																																																																																																													b2y,
																																																																																																													c2z,
																																																																																																													a,
																																																																																																													c,
																																																																																																													a2x,
																																																																																																													v,
																																																																																																													z,
																																																																																																													y,
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
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whilelul2branchbub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject d, EObject b, EObject i, EObject x, EObject d2v, EObject b2y,
			EObject c2z, EObject a, EObject c, EObject a2x, EObject v, EObject z, EObject y, EObject w) {
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__v____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__v____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whilelul2branchbub";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String b2y__b____source_name_prime = "source";
		String c__d____last_name_prime = "last";
		String c2z__c____source_name_prime = "source";
		String a__b____last_name_prime = "last";
		String c__d____first_name_prime = "first";
		String a2x__a____source_name_prime = "source";
		String v__z____next_name_prime = "next";
		String d2v__v____target_name_prime = "target";
		String a2x__x____target_name_prime = "target";
		String z__v____positive_name_prime = "positive";
		String d2v__d____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String y__x____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String c2z__z____target_name_prime = "target";
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		ruleresult.getTranslatedEdges().add(c__d____last);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		c__d____first.setSrc(c);
		c__d____first.setTrg(d);
		ruleresult.getTranslatedEdges().add(c__d____first);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		ruleresult.getCreatedEdges().add(v__z____next);
		d2v__v____target.setSrc(d2v);
		d2v__v____target.setTrg(v);
		ruleresult.getCreatedEdges().add(d2v__v____target);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		z__v____positive.setSrc(z);
		z__v____positive.setTrg(v);
		ruleresult.getCreatedEdges().add(z__v____positive);
		d2v__d____source.setSrc(d2v);
		d2v__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(d2v__d____source);
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
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		c__d____first.setName(c__d____first_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		d2v__v____target.setName(d2v__v____target_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		z__v____positive.setName(z__v____positive_name_prime);
		d2v__d____source.setName(d2v__d____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		return new Object[] { ruleresult, d, b, i, x, d2v, b2y, c2z, a, c, a2x, v, z, y, w, i__z____negative,
				i__x____positive, b2y__b____source, c__d____last, c2z__c____source, a__b____last, c__d____first,
				a2x__a____source, v__z____next, d2v__v____target, a2x__x____target, z__v____positive, d2v__d____source,
				b2y__y____target, y__x____next, w__a____first, w__c____next, c2z__z____target };
	}

	public static final void pattern_whilelul2branchbub_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			whilelul2branchbub _this, PerformRuleResult ruleresult, EObject d, EObject b, EObject i, EObject x,
			EObject d2v, EObject w2i, EObject b2y, EObject c2z, EObject a, EObject c, EObject a2x, EObject v, EObject z,
			EObject y, EObject w) {
		_this.registerObjects_FWD(ruleresult, d, b, i, x, d2v, w2i, b2y, c2z, a, c, a2x, v, z, y, w);

	}

	public static final PerformRuleResult pattern_whilelul2branchbub_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whilelul2branchbub_2_1_preparereturnvalue_bindingFB(whilelul2branchbub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_2_1_preparereturnvalue_blackFBB(EClass eClass,
			whilelul2branchbub _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_2_1_preparereturnvalue_bindingAndBlackFFB(
			whilelul2branchbub _this) {
		Object[] result_pattern_whilelul2branchbub_2_1_preparereturnvalue_binding = pattern_whilelul2branchbub_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whilelul2branchbub_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whilelul2branchbub_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whilelul2branchbub_2_1_preparereturnvalue_black = pattern_whilelul2branchbub_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whilelul2branchbub_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whilelul2branchbub_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whilelul2branchbub";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whilelul2branchbub_2_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("d");
		EObject _localVariable_1 = match.getObject("b");
		EObject _localVariable_2 = match.getObject("a");
		EObject _localVariable_3 = match.getObject("c");
		EObject _localVariable_4 = match.getObject("w");
		EObject tmpD = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpW = _localVariable_4;
		if (tmpD instanceof Assignment) {
			Assignment d = (Assignment) tmpD;
			if (tmpB instanceof Assignment) {
				Assignment b = (Assignment) tmpB;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpC instanceof While) {
						While c = (While) tmpC;
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							return new Object[] { d, b, a, c, w, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilelul2branchbub_2_2_corematch_blackBBFFBBBB(Assignment d,
			Assignment b, While a, While c, While w, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(d)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!c.equals(w)) {
						for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class,
								"source")) {
							Branch i = w2i.getTarget();
							if (i != null) {
								_result.add(new Object[] { d, b, i, w2i, a, c, w, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilelul2branchbub_2_3_findcontext_blackBBBBBBB(Assignment d,
			Assignment b, Branch i, S2B w2i, While a, While c, While w) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(d)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!c.equals(w)) {
						if (i.equals(w2i.getTarget())) {
							if (d.equals(c.getLast())) {
								if (b.equals(a.getLast())) {
									if (d.equals(c.getFirst())) {
										if (a.equals(w.getFirst())) {
											if (w.equals(w2i.getSource())) {
												if (c.equals(w.getNext())) {
													_result.add(new Object[] { d, b, i, w2i, a, c, w });
												}
											}
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

	public static final Object[] pattern_whilelul2branchbub_2_3_findcontext_greenBBBBBBBFFFFFFFF(Assignment d,
			Assignment b, Branch i, S2B w2i, While a, While c, While w) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w2i__i____target_name_prime = "target";
		String c__d____last_name_prime = "last";
		String a__b____last_name_prime = "last";
		String c__d____first_name_prime = "first";
		String w__a____first_name_prime = "first";
		String w2i__w____source_name_prime = "source";
		String w__c____next_name_prime = "next";
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(w);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		isApplicableMatch.getAllContextElements().add(c__d____last);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____last);
		c__d____first.setSrc(c);
		c__d____first.setTrg(d);
		isApplicableMatch.getAllContextElements().add(c__d____first);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		w2i__i____target.setName(w2i__i____target_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		c__d____first.setName(c__d____first_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		return new Object[] { d, b, i, w2i, a, c, w, isApplicableMatch, w2i__i____target, c__d____last, a__b____last,
				c__d____first, w__a____first, w2i__w____source, w__c____next };
	}

	public static final Object[] pattern_whilelul2branchbub_2_4_solveCSP_bindingFBBBBBBBBB(whilelul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Assignment d, Assignment b, Branch i, S2B w2i, While a, While c,
			While w) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, d, b, i, w2i, a, c, w);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d, b, i, w2i, a, c, w };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilelul2branchbub_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			whilelul2branchbub _this, IsApplicableMatch isApplicableMatch, Assignment d, Assignment b, Branch i,
			S2B w2i, While a, While c, While w) {
		Object[] result_pattern_whilelul2branchbub_2_4_solveCSP_binding = pattern_whilelul2branchbub_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, d, b, i, w2i, a, c, w);
		if (result_pattern_whilelul2branchbub_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilelul2branchbub_2_4_solveCSP_binding[0];

			Object[] result_pattern_whilelul2branchbub_2_4_solveCSP_black = pattern_whilelul2branchbub_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whilelul2branchbub_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d, b, i, w2i, a, c, w };
			}
		}
		return null;
	}

	public static final boolean pattern_whilelul2branchbub_2_5_checkCSP_expressionFBB(whilelul2branchbub _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilelul2branchbub_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whilelul2branchbub_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whilelul2branchbub";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whilelul2branchbub_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whilelul2branchbub_10_1_initialbindings_blackBBBBBBB(whilelul2branchbub _this,
			Match match, Branch i, Branch x, Command v, Branch z, Command y) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					if (!v.equals(y)) {
						return new Object[] { _this, match, i, x, v, z, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_10_2_SolveCSP_bindingFBBBBBBB(whilelul2branchbub _this,
			Match match, Branch i, Branch x, Command v, Branch z, Command y) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, i, x, v, z, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, i, x, v, z, y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilelul2branchbub_10_2_SolveCSP_bindingAndBlackFBBBBBBB(
			whilelul2branchbub _this, Match match, Branch i, Branch x, Command v, Branch z, Command y) {
		Object[] result_pattern_whilelul2branchbub_10_2_SolveCSP_binding = pattern_whilelul2branchbub_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, i, x, v, z, y);
		if (result_pattern_whilelul2branchbub_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilelul2branchbub_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whilelul2branchbub_10_2_SolveCSP_black = pattern_whilelul2branchbub_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whilelul2branchbub_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, i, x, v, z, y };
			}
		}
		return null;
	}

	public static final boolean pattern_whilelul2branchbub_10_3_CheckCSP_expressionFBB(whilelul2branchbub _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilelul2branchbub_10_4_collectelementstobetranslated_blackBBBBBB(Match match,
			Branch i, Branch x, Command v, Branch z, Command y) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					if (!v.equals(y)) {
						return new Object[] { match, i, x, v, z, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_10_4_collectelementstobetranslated_greenBBBBBBFFFFF(
			Match match, Branch i, Branch x, Command v, Branch z, Command y) {
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__v____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(v);
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(y);
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String v__z____next_name_prime = "next";
		String z__v____positive_name_prime = "positive";
		String y__x____next_name_prime = "next";
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		match.getToBeTranslatedEdges().add(v__z____next);
		z__v____positive.setSrc(z);
		z__v____positive.setTrg(v);
		match.getToBeTranslatedEdges().add(z__v____positive);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(y__x____next);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		z__v____positive.setName(z__v____positive_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		return new Object[] { match, i, x, v, z, y, i__z____negative, i__x____positive, v__z____next, z__v____positive,
				y__x____next };
	}

	public static final Object[] pattern_whilelul2branchbub_10_5_collectcontextelements_blackBBBBBB(Match match,
			Branch i, Branch x, Command v, Branch z, Command y) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					if (!v.equals(y)) {
						return new Object[] { match, i, x, v, z, y };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_10_5_collectcontextelements_greenBB(Match match, Branch i) {
		match.getContextNodes().add(i);
		return new Object[] { match, i };
	}

	public static final void pattern_whilelul2branchbub_10_6_registerobjectstomatch_expressionBBBBBBB(
			whilelul2branchbub _this, Match match, Branch i, Branch x, Command v, Branch z, Command y) {
		_this.registerObjectsToMatch_BWD(match, i, x, v, z, y);

	}

	public static final boolean pattern_whilelul2branchbub_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whilelul2branchbub_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whilelul2branchbub_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("i");
		EObject _localVariable_1 = isApplicableMatch.getObject("x");
		EObject _localVariable_2 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_3 = isApplicableMatch.getObject("v");
		EObject _localVariable_4 = isApplicableMatch.getObject("z");
		EObject _localVariable_5 = isApplicableMatch.getObject("y");
		EObject _localVariable_6 = isApplicableMatch.getObject("w");
		EObject tmpI = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpW2i = _localVariable_2;
		EObject tmpV = _localVariable_3;
		EObject tmpZ = _localVariable_4;
		EObject tmpY = _localVariable_5;
		EObject tmpW = _localVariable_6;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpW2i instanceof S2B) {
					S2B w2i = (S2B) tmpW2i;
					if (tmpV instanceof Command) {
						Command v = (Command) tmpV;
						if (tmpZ instanceof Branch) {
							Branch z = (Branch) tmpZ;
							if (tmpY instanceof Command) {
								Command y = (Command) tmpY;
								if (tmpW instanceof While) {
									While w = (While) tmpW;
									return new Object[] { i, x, w2i, v, z, y, w, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_11_1_performtransformation_blackBBBBBBBFBB(Branch i,
			Branch x, S2B w2i, Command v, Branch z, Command y, While w, whilelul2branchbub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					if (!v.equals(y)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { i, x, w2i, v, z, y, w, csp, _this, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			whilelul2branchbub _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whilelul2branchbub_11_1_performtransformation_binding = pattern_whilelul2branchbub_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_whilelul2branchbub_11_1_performtransformation_binding != null) {
			Branch i = (Branch) result_pattern_whilelul2branchbub_11_1_performtransformation_binding[0];
			Branch x = (Branch) result_pattern_whilelul2branchbub_11_1_performtransformation_binding[1];
			S2B w2i = (S2B) result_pattern_whilelul2branchbub_11_1_performtransformation_binding[2];
			Command v = (Command) result_pattern_whilelul2branchbub_11_1_performtransformation_binding[3];
			Branch z = (Branch) result_pattern_whilelul2branchbub_11_1_performtransformation_binding[4];
			Command y = (Command) result_pattern_whilelul2branchbub_11_1_performtransformation_binding[5];
			While w = (While) result_pattern_whilelul2branchbub_11_1_performtransformation_binding[6];

			Object[] result_pattern_whilelul2branchbub_11_1_performtransformation_black = pattern_whilelul2branchbub_11_1_performtransformation_blackBBBBBBBFBB(
					i, x, w2i, v, z, y, w, _this, isApplicableMatch);
			if (result_pattern_whilelul2branchbub_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whilelul2branchbub_11_1_performtransformation_black[7];

				return new Object[] { i, x, w2i, v, z, y, w, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_11_1_performtransformation_greenFFBFFFFFFBBBB(Branch x,
			Command v, Branch z, Command y, While w) {
		Assignment d = SourcecodeFactory.eINSTANCE.createAssignment();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		d2v.setTarget(v);
		d2v.setSource(d);
		b2y.setSource(b);
		b2y.setTarget(y);
		c2z.setTarget(z);
		a.setLast(b);
		w.setFirst(a);
		c.setLast(d);
		c2z.setSource(c);
		c.setFirst(d);
		w.setNext(c);
		a2x.setSource(a);
		a2x.setTarget(x);
		return new Object[] { d, b, x, d2v, b2y, c2z, a, c, a2x, v, z, y, w };
	}

	public static final Object[] pattern_whilelul2branchbub_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(
			Assignment d, Assignment b, Branch x, S2N d2v, S2N b2y, S2B c2z, While a, While c, S2B a2x, Command v,
			Branch z, Command y) {
		if (!b.equals(d)) {
			if (!x.equals(z)) {
				if (!b2y.equals(d2v)) {
					if (!a.equals(c)) {
						if (!a2x.equals(c2z)) {
							if (!v.equals(y)) {
								return new Object[] { d, b, x, d2v, b2y, c2z, a, c, a2x, v, z, y };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(
			Assignment d, Assignment b, Branch x, S2N d2v, S2N b2y, S2B c2z, While a, While c, S2B a2x, Command v,
			Branch z, Command y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(d);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(d2v);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(v);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getTranslatedElements().add(y);
		return new Object[] { ruleresult, d, b, x, d2v, b2y, c2z, a, c, a2x, v, z, y };
	}

	public static final Object[] pattern_whilelul2branchbub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject d, EObject b, EObject i, EObject x, EObject d2v, EObject w2i,
			EObject b2y, EObject c2z, EObject a, EObject c, EObject a2x, EObject v, EObject z, EObject y, EObject w) {
		if (!d.equals(i)) {
			if (!d.equals(x)) {
				if (!d.equals(d2v)) {
					if (!d.equals(w2i)) {
						if (!d.equals(v)) {
							if (!d.equals(z)) {
								if (!d.equals(y)) {
									if (!d.equals(w)) {
										if (!b.equals(d)) {
											if (!b.equals(i)) {
												if (!b.equals(x)) {
													if (!b.equals(d2v)) {
														if (!b.equals(w2i)) {
															if (!b.equals(b2y)) {
																if (!b.equals(c2z)) {
																	if (!b.equals(c)) {
																		if (!b.equals(v)) {
																			if (!b.equals(z)) {
																				if (!b.equals(y)) {
																					if (!b.equals(w)) {
																						if (!i.equals(x)) {
																							if (!i.equals(w2i)) {
																								if (!i.equals(v)) {
																									if (!i.equals(z)) {
																										if (!i.equals(
																												y)) {
																											if (!i.equals(
																													w)) {
																												if (!x.equals(
																														z)) {
																													if (!x.equals(
																															y)) {
																														if (!d2v.equals(
																																i)) {
																															if (!d2v.equals(
																																	x)) {
																																if (!d2v.equals(
																																		w2i)) {
																																	if (!d2v.equals(
																																			v)) {
																																		if (!d2v.equals(
																																				z)) {
																																			if (!d2v.equals(
																																					y)) {
																																				if (!d2v.equals(
																																						w)) {
																																					if (!w2i.equals(
																																							x)) {
																																						if (!w2i.equals(
																																								z)) {
																																							if (!w2i.equals(
																																									y)) {
																																								if (!b2y.equals(
																																										d)) {
																																									if (!b2y.equals(
																																											i)) {
																																										if (!b2y.equals(
																																												x)) {
																																											if (!b2y.equals(
																																													d2v)) {
																																												if (!b2y.equals(
																																														w2i)) {
																																													if (!b2y.equals(
																																															c2z)) {
																																														if (!b2y.equals(
																																																c)) {
																																															if (!b2y.equals(
																																																	v)) {
																																																if (!b2y.equals(
																																																		z)) {
																																																	if (!b2y.equals(
																																																			y)) {
																																																		if (!b2y.equals(
																																																				w)) {
																																																			if (!c2z.equals(
																																																					d)) {
																																																				if (!c2z.equals(
																																																						i)) {
																																																					if (!c2z.equals(
																																																							x)) {
																																																						if (!c2z.equals(
																																																								d2v)) {
																																																							if (!c2z.equals(
																																																									w2i)) {
																																																								if (!c2z.equals(
																																																										v)) {
																																																									if (!c2z.equals(
																																																											z)) {
																																																										if (!c2z.equals(
																																																												y)) {
																																																											if (!c2z.equals(
																																																													w)) {
																																																												if (!a.equals(
																																																														d)) {
																																																													if (!a.equals(
																																																															b)) {
																																																														if (!a.equals(
																																																																i)) {
																																																															if (!a.equals(
																																																																	x)) {
																																																																if (!a.equals(
																																																																		d2v)) {
																																																																	if (!a.equals(
																																																																			w2i)) {
																																																																		if (!a.equals(
																																																																				b2y)) {
																																																																			if (!a.equals(
																																																																					c2z)) {
																																																																				if (!a.equals(
																																																																						c)) {
																																																																					if (!a.equals(
																																																																							a2x)) {
																																																																						if (!a.equals(
																																																																								v)) {
																																																																							if (!a.equals(
																																																																									z)) {
																																																																								if (!a.equals(
																																																																										y)) {
																																																																									if (!a.equals(
																																																																											w)) {
																																																																										if (!c.equals(
																																																																												d)) {
																																																																											if (!c.equals(
																																																																													i)) {
																																																																												if (!c.equals(
																																																																														x)) {
																																																																													if (!c.equals(
																																																																															d2v)) {
																																																																														if (!c.equals(
																																																																																w2i)) {
																																																																															if (!c.equals(
																																																																																	c2z)) {
																																																																																if (!c.equals(
																																																																																		v)) {
																																																																																	if (!c.equals(
																																																																																			z)) {
																																																																																		if (!c.equals(
																																																																																				y)) {
																																																																																			if (!c.equals(
																																																																																					w)) {
																																																																																				if (!a2x.equals(
																																																																																						d)) {
																																																																																					if (!a2x.equals(
																																																																																							b)) {
																																																																																						if (!a2x.equals(
																																																																																								i)) {
																																																																																							if (!a2x.equals(
																																																																																									x)) {
																																																																																								if (!a2x.equals(
																																																																																										d2v)) {
																																																																																									if (!a2x.equals(
																																																																																											w2i)) {
																																																																																										if (!a2x.equals(
																																																																																												b2y)) {
																																																																																											if (!a2x.equals(
																																																																																													c2z)) {
																																																																																												if (!a2x.equals(
																																																																																														c)) {
																																																																																													if (!a2x.equals(
																																																																																															v)) {
																																																																																														if (!a2x.equals(
																																																																																																z)) {
																																																																																															if (!a2x.equals(
																																																																																																	y)) {
																																																																																																if (!a2x.equals(
																																																																																																		w)) {
																																																																																																	if (!v.equals(
																																																																																																			x)) {
																																																																																																		if (!v.equals(
																																																																																																				w2i)) {
																																																																																																			if (!v.equals(
																																																																																																					z)) {
																																																																																																				if (!v.equals(
																																																																																																						y)) {
																																																																																																					if (!v.equals(
																																																																																																							w)) {
																																																																																																						if (!y.equals(
																																																																																																								z)) {
																																																																																																							if (!w.equals(
																																																																																																									x)) {
																																																																																																								if (!w.equals(
																																																																																																										w2i)) {
																																																																																																									if (!w.equals(
																																																																																																											z)) {
																																																																																																										if (!w.equals(
																																																																																																												y)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													d,
																																																																																																													b,
																																																																																																													i,
																																																																																																													x,
																																																																																																													d2v,
																																																																																																													w2i,
																																																																																																													b2y,
																																																																																																													c2z,
																																																																																																													a,
																																																																																																													c,
																																																																																																													a2x,
																																																																																																													v,
																																																																																																													z,
																																																																																																													y,
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
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whilelul2branchbub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject d, EObject b, EObject i, EObject x, EObject d2v, EObject b2y,
			EObject c2z, EObject a, EObject c, EObject a2x, EObject v, EObject z, EObject y, EObject w) {
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__v____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__v____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whilelul2branchbub";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String b2y__b____source_name_prime = "source";
		String c__d____last_name_prime = "last";
		String c2z__c____source_name_prime = "source";
		String a__b____last_name_prime = "last";
		String c__d____first_name_prime = "first";
		String a2x__a____source_name_prime = "source";
		String v__z____next_name_prime = "next";
		String d2v__v____target_name_prime = "target";
		String a2x__x____target_name_prime = "target";
		String z__v____positive_name_prime = "positive";
		String d2v__d____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String y__x____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String c2z__z____target_name_prime = "target";
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		ruleresult.getCreatedEdges().add(c__d____last);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		c__d____first.setSrc(c);
		c__d____first.setTrg(d);
		ruleresult.getCreatedEdges().add(c__d____first);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		ruleresult.getTranslatedEdges().add(v__z____next);
		d2v__v____target.setSrc(d2v);
		d2v__v____target.setTrg(v);
		ruleresult.getCreatedEdges().add(d2v__v____target);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		z__v____positive.setSrc(z);
		z__v____positive.setTrg(v);
		ruleresult.getTranslatedEdges().add(z__v____positive);
		d2v__d____source.setSrc(d2v);
		d2v__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(d2v__d____source);
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
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		c__d____last.setName(c__d____last_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		c__d____first.setName(c__d____first_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		d2v__v____target.setName(d2v__v____target_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		z__v____positive.setName(z__v____positive_name_prime);
		d2v__d____source.setName(d2v__d____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		return new Object[] { ruleresult, d, b, i, x, d2v, b2y, c2z, a, c, a2x, v, z, y, w, i__z____negative,
				i__x____positive, b2y__b____source, c__d____last, c2z__c____source, a__b____last, c__d____first,
				a2x__a____source, v__z____next, d2v__v____target, a2x__x____target, z__v____positive, d2v__d____source,
				b2y__y____target, y__x____next, w__a____first, w__c____next, c2z__z____target };
	}

	public static final void pattern_whilelul2branchbub_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			whilelul2branchbub _this, PerformRuleResult ruleresult, EObject d, EObject b, EObject i, EObject x,
			EObject d2v, EObject w2i, EObject b2y, EObject c2z, EObject a, EObject c, EObject a2x, EObject v, EObject z,
			EObject y, EObject w) {
		_this.registerObjects_BWD(ruleresult, d, b, i, x, d2v, w2i, b2y, c2z, a, c, a2x, v, z, y, w);

	}

	public static final PerformRuleResult pattern_whilelul2branchbub_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whilelul2branchbub_12_1_preparereturnvalue_bindingFB(
			whilelul2branchbub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_12_1_preparereturnvalue_blackFBB(EClass eClass,
			whilelul2branchbub _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_12_1_preparereturnvalue_bindingAndBlackFFB(
			whilelul2branchbub _this) {
		Object[] result_pattern_whilelul2branchbub_12_1_preparereturnvalue_binding = pattern_whilelul2branchbub_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whilelul2branchbub_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whilelul2branchbub_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whilelul2branchbub_12_1_preparereturnvalue_black = pattern_whilelul2branchbub_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whilelul2branchbub_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whilelul2branchbub_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whilelul2branchbub";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whilelul2branchbub_12_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("i");
		EObject _localVariable_1 = match.getObject("x");
		EObject _localVariable_2 = match.getObject("v");
		EObject _localVariable_3 = match.getObject("z");
		EObject _localVariable_4 = match.getObject("y");
		EObject tmpI = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpV = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		EObject tmpY = _localVariable_4;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpV instanceof Command) {
					Command v = (Command) tmpV;
					if (tmpZ instanceof Branch) {
						Branch z = (Branch) tmpZ;
						if (tmpY instanceof Command) {
							Command y = (Command) tmpY;
							return new Object[] { i, x, v, z, y, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilelul2branchbub_12_2_corematch_blackBBFBBBFB(Branch i, Branch x,
			Command v, Branch z, Command y, Match match) {
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
								_result.add(new Object[] { i, x, w2i, v, z, y, w, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilelul2branchbub_12_3_findcontext_blackBBBBBBB(Branch i, Branch x,
			S2B w2i, Command v, Branch z, Command y, While w) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					if (!v.equals(y)) {
						if (z.equals(i.getNegative())) {
							if (x.equals(i.getPositive())) {
								if (i.equals(w2i.getTarget())) {
									if (z.equals(v.getNext())) {
										if (v.equals(z.getPositive())) {
											if (x.equals(y.getNext())) {
												if (w.equals(w2i.getSource())) {
													_result.add(new Object[] { i, x, w2i, v, z, y, w });
												}
											}
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

	public static final Object[] pattern_whilelul2branchbub_12_3_findcontext_greenBBBBBBBFFFFFFFF(Branch i, Branch x,
			S2B w2i, Command v, Branch z, Command y, While w) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__v____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String w2i__i____target_name_prime = "target";
		String v__z____next_name_prime = "next";
		String z__v____positive_name_prime = "positive";
		String y__x____next_name_prime = "next";
		String w2i__w____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(v);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(w);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		isApplicableMatch.getAllContextElements().add(v__z____next);
		z__v____positive.setSrc(z);
		z__v____positive.setTrg(v);
		isApplicableMatch.getAllContextElements().add(z__v____positive);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(y__x____next);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		z__v____positive.setName(z__v____positive_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		return new Object[] { i, x, w2i, v, z, y, w, isApplicableMatch, i__z____negative, i__x____positive,
				w2i__i____target, v__z____next, z__v____positive, y__x____next, w2i__w____source };
	}

	public static final Object[] pattern_whilelul2branchbub_12_4_solveCSP_bindingFBBBBBBBBB(whilelul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Branch i, Branch x, S2B w2i, Command v, Branch z, Command y, While w) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, i, x, w2i, v, z, y, w);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, i, x, w2i, v, z, y, w };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilelul2branchbub_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			whilelul2branchbub _this, IsApplicableMatch isApplicableMatch, Branch i, Branch x, S2B w2i, Command v,
			Branch z, Command y, While w) {
		Object[] result_pattern_whilelul2branchbub_12_4_solveCSP_binding = pattern_whilelul2branchbub_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, i, x, w2i, v, z, y, w);
		if (result_pattern_whilelul2branchbub_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilelul2branchbub_12_4_solveCSP_binding[0];

			Object[] result_pattern_whilelul2branchbub_12_4_solveCSP_black = pattern_whilelul2branchbub_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whilelul2branchbub_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, i, x, w2i, v, z, y, w };
			}
		}
		return null;
	}

	public static final boolean pattern_whilelul2branchbub_12_5_checkCSP_expressionFBB(whilelul2branchbub _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilelul2branchbub_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whilelul2branchbub_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whilelul2branchbub";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whilelul2branchbub_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whilelul2branchbub_20_1_preparereturnvalue_bindingFB(
			whilelul2branchbub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whilelul2branchbub _this) {
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

	public static final Object[] pattern_whilelul2branchbub_20_1_preparereturnvalue_bindingAndBlackFFBF(
			whilelul2branchbub _this) {
		Object[] result_pattern_whilelul2branchbub_20_1_preparereturnvalue_binding = pattern_whilelul2branchbub_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whilelul2branchbub_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whilelul2branchbub_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whilelul2branchbub_20_1_preparereturnvalue_black = pattern_whilelul2branchbub_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whilelul2branchbub_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whilelul2branchbub_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whilelul2branchbub_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_626103 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_1BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_875043 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_875043)) {
							if (!i.equals(__DEC_x_positive_875043)) {
								if (!z.equals(__DEC_x_positive_875043)) {
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

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_2BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_268056 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_268056)) {
							if (!i.equals(__DEC_x_negative_268056)) {
								if (!z.equals(__DEC_x_negative_268056)) {
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

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_3B(Command v) {
		for (Graph __DEC_v_root_470943 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(v,
				Graph.class, "root")) {
			return new Object[] { v };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_4BBBB(Command v,
			Branch i, Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (Branch __DEC_v_positive_781502 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "positive")) {
						if (!i.equals(__DEC_v_positive_781502)) {
							if (!x.equals(__DEC_v_positive_781502)) {
								if (!z.equals(__DEC_v_positive_781502)) {
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

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_5BBBB(Command v,
			Branch i, Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (Branch __DEC_v_negative_629686 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "negative")) {
						if (!i.equals(__DEC_v_negative_629686)) {
							if (!x.equals(__DEC_v_negative_629686)) {
								if (!z.equals(__DEC_v_negative_629686)) {
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

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_6B(Branch z) {
		for (Graph __DEC_z_root_255796 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_7BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_positive_223450 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_223450)) {
							if (!i.equals(__DEC_z_positive_223450)) {
								if (!x.equals(__DEC_z_positive_223450)) {
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

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_8BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_negative_24357 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_24357)) {
							if (!i.equals(__DEC_z_negative_24357)) {
								if (!x.equals(__DEC_z_negative_24357)) {
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

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_9B(Command y) {
		for (Graph __DEC_y_root_24491 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_10BBBB(Command y,
			Branch i, Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_positive_325660 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!i.equals(__DEC_y_positive_325660)) {
							if (!x.equals(__DEC_y_positive_325660)) {
								if (!z.equals(__DEC_y_positive_325660)) {
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

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_11BBBB(Command y,
			Branch i, Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_negative_499152 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!i.equals(__DEC_y_negative_499152)) {
							if (!x.equals(__DEC_y_negative_499152)) {
								if (!z.equals(__DEC_y_negative_499152)) {
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

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_12BB(Branch i,
			Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_13BB(Branch i,
			Command v) {
		if (v.equals(i.getPositive())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_14BB(Branch x,
			Command v) {
		if (v.equals(x.getPositive())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_15BB(Branch i,
			Command v) {
		if (v.equals(i.getNegative())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_16BB(Branch x,
			Command v) {
		if (v.equals(x.getNegative())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_17BB(Branch z,
			Command v) {
		if (v.equals(z.getNegative())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_18BB(Branch i,
			Branch z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_19BB(Branch x,
			Branch z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_20BB(Branch x,
			Branch z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_21BB(Branch i,
			Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_22BB(Branch x,
			Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_23BB(Branch z,
			Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_24BB(Branch i,
			Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_25BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_26BB(Branch z,
			Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilelul2branchbub_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_negative) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpI = _edge_negative.getSrc();
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			EObject tmpZ = _edge_negative.getTrg();
			if (tmpZ instanceof Branch) {
				Branch z = (Branch) tmpZ;
				if (!i.equals(z)) {
					if (z.equals(i.getNegative())) {
						Node tmpX = i.getPositive();
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							if (!i.equals(x)) {
								if (!x.equals(z)) {
									Node tmpV = z.getPositive();
									if (tmpV instanceof Command) {
										Command v = (Command) tmpV;
										if (z.equals(v.getNext())) {
											if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_6B(
													z) == null) {
												if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_18BB(
														i, z) == null) {
													if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_0B(
															x) == null) {
														if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_1BBB(
																x, i, z) == null) {
															if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_2BBB(
																	x, i, z) == null) {
																if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_7BBB(
																		z, i, x) == null) {
																	if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_8BBB(
																			z, i, x) == null) {
																		if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_12BB(
																				i, x) == null) {
																			if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_19BB(
																					x, z) == null) {
																				if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_20BB(
																						x, z) == null) {
																					if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_3B(
																							v) == null) {
																						if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_4BBBB(
																								v, i, x, z) == null) {
																							if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_5BBBB(
																									v, i, x,
																									z) == null) {
																								if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_13BB(
																										i, v) == null) {
																									if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_14BB(
																											x,
																											v) == null) {
																										if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_15BB(
																												i,
																												v) == null) {
																											if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_16BB(
																													x,
																													v) == null) {
																												if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_17BB(
																														z,
																														v) == null) {
																													for (Node tmpY : org.moflon.core.utilities.eMoflonEMFUtil
																															.getOppositeReferenceTyped(
																																	x,
																																	Node.class,
																																	"next")) {
																														if (tmpY instanceof Command) {
																															Command y = (Command) tmpY;
																															if (!v.equals(
																																	y)) {
																																if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_9B(
																																		y) == null) {
																																	if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_10BBBB(
																																			y,
																																			i,
																																			x,
																																			z) == null) {
																																		if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_11BBBB(
																																				y,
																																				i,
																																				x,
																																				z) == null) {
																																			if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_21BB(
																																					i,
																																					y) == null) {
																																				if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_22BB(
																																						x,
																																						y) == null) {
																																					if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_23BB(
																																							z,
																																							y) == null) {
																																						if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_24BB(
																																								i,
																																								y) == null) {
																																							if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_25BB(
																																									x,
																																									y) == null) {
																																								if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_26BB(
																																										z,
																																										y) == null) {
																																									_result.add(
																																											new Object[] {
																																													i,
																																													x,
																																													v,
																																													z,
																																													y,
																																													_edge_negative });
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whilelul2branchbub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			whilelul2branchbub _this, Match match, Branch i, Branch x, Command v, Branch z, Command y) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, i, x, v, z, y);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whilelul2branchbub_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whilelul2branchbub _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilelul2branchbub_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whilelul2branchbub_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whilelul2branchbub_21_1_preparereturnvalue_bindingFB(
			whilelul2branchbub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whilelul2branchbub _this) {
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

	public static final Object[] pattern_whilelul2branchbub_21_1_preparereturnvalue_bindingAndBlackFFBF(
			whilelul2branchbub _this) {
		Object[] result_pattern_whilelul2branchbub_21_1_preparereturnvalue_binding = pattern_whilelul2branchbub_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whilelul2branchbub_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whilelul2branchbub_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whilelul2branchbub_21_1_preparereturnvalue_black = pattern_whilelul2branchbub_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whilelul2branchbub_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whilelul2branchbub_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whilelul2branchbub_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_0B(Assignment d) {
		for (Decision __DEC_d_positive_754880 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_1B(Assignment d) {
		for (Decision __DEC_d_negative_462474 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_2BBBB(Assignment d,
			While a, While c, While w) {
		if (!a.equals(c)) {
			if (!a.equals(w)) {
				if (!c.equals(w)) {
					for (While __DEC_d_last_927629 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "last")) {
						if (!a.equals(__DEC_d_last_927629)) {
							if (!c.equals(__DEC_d_last_927629)) {
								if (!w.equals(__DEC_d_last_927629)) {
									return new Object[] { d, a, c, w };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_3B(Assignment d) {
		for (Program __DEC_d_first_471938 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_4B(Assignment b) {
		for (Decision __DEC_b_positive_751594 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_5B(Assignment b) {
		for (Decision __DEC_b_negative_789281 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_6BBBB(Assignment b,
			While a, While c, While w) {
		if (!a.equals(c)) {
			if (!a.equals(w)) {
				if (!c.equals(w)) {
					for (While __DEC_b_first_31953 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "first")) {
						if (!a.equals(__DEC_b_first_31953)) {
							if (!c.equals(__DEC_b_first_31953)) {
								if (!w.equals(__DEC_b_first_31953)) {
									return new Object[] { b, a, c, w };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_7BBBB(Assignment b,
			While a, While c, While w) {
		if (!a.equals(c)) {
			if (!a.equals(w)) {
				if (!c.equals(w)) {
					for (While __DEC_b_last_181362 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "last")) {
						if (!a.equals(__DEC_b_last_181362)) {
							if (!c.equals(__DEC_b_last_181362)) {
								if (!w.equals(__DEC_b_last_181362)) {
									return new Object[] { b, a, c, w };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_8B(Assignment b) {
		for (Program __DEC_b_first_61496 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_9B(While a) {
		for (Decision __DEC_a_positive_350978 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_10B(While a) {
		for (Decision __DEC_a_negative_729963 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_11BBB(While a, While c,
			While w) {
		if (!a.equals(c)) {
			if (!a.equals(w)) {
				if (!c.equals(w)) {
					for (While __DEC_a_last_281124 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, While.class, "last")) {
						if (!a.equals(__DEC_a_last_281124)) {
							if (!c.equals(__DEC_a_last_281124)) {
								if (!w.equals(__DEC_a_last_281124)) {
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

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_12B(While a) {
		for (Program __DEC_a_first_311084 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_13B(While c) {
		for (Decision __DEC_c_positive_777966 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_14B(While c) {
		for (Decision __DEC_c_negative_667227 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_15BBB(While c, While a,
			While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_first_512656 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "first")) {
						if (!c.equals(__DEC_c_first_512656)) {
							if (!a.equals(__DEC_c_first_512656)) {
								if (!w.equals(__DEC_c_first_512656)) {
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

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_16BBB(While c, While a,
			While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_last_200646 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "last")) {
						if (!c.equals(__DEC_c_last_200646)) {
							if (!a.equals(__DEC_c_last_200646)) {
								if (!w.equals(__DEC_c_last_200646)) {
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

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_17B(While c) {
		for (Program __DEC_c_first_853959 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_18BB(While a,
			Assignment d) {
		if (d.equals(a.getLast())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_19BB(While w,
			Assignment d) {
		if (d.equals(w.getLast())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_20BB(While a,
			Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_21BB(While c,
			Assignment b) {
		if (b.equals(c.getFirst())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_22BB(While w,
			Assignment b) {
		if (b.equals(w.getFirst())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_23BB(While c,
			Assignment b) {
		if (b.equals(c.getLast())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_24BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_25BB(While a, While c) {
		if (c.equals(a.getFirst())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_26BB(While a, While c) {
		if (c.equals(a.getLast())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilelul2branchbub_21_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_last) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpC = _edge_last.getSrc();
		if (tmpC instanceof While) {
			While c = (While) tmpC;
			EObject tmpD = _edge_last.getTrg();
			if (tmpD instanceof Assignment) {
				Assignment d = (Assignment) tmpD;
				if (d.equals(c.getLast())) {
					if (d.equals(c.getFirst())) {
						if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_13B(c) == null) {
							if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_14B(c) == null) {
								if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_17B(c) == null) {
									if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_0B(d) == null) {
										if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_1B(
												d) == null) {
											if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_3B(
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
																				if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_19BB(
																						w, d) == null) {
																					if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_2BBBB(
																							d, a, c, w) == null) {
																						if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_9B(
																								a) == null) {
																							if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_10B(
																									a) == null) {
																								if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_11BBB(
																										a, c,
																										w) == null) {
																									if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_12B(
																											a) == null) {
																										if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_15BBB(
																												c, a,
																												w) == null) {
																											if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_16BBB(
																													c,
																													a,
																													w) == null) {
																												if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_18BB(
																														a,
																														d) == null) {
																													if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_25BB(
																															a,
																															c) == null) {
																														if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_26BB(
																																a,
																																c) == null) {
																															if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_4B(
																																	b) == null) {
																																if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_5B(
																																		b) == null) {
																																	if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_6BBBB(
																																			b,
																																			a,
																																			c,
																																			w) == null) {
																																		if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_7BBBB(
																																				b,
																																				a,
																																				c,
																																				w) == null) {
																																			if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_8B(
																																					b) == null) {
																																				if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_20BB(
																																						a,
																																						b) == null) {
																																					if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_21BB(
																																							c,
																																							b) == null) {
																																						if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_22BB(
																																								w,
																																								b) == null) {
																																							if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_23BB(
																																									c,
																																									b) == null) {
																																								if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_24BB(
																																										w,
																																										b) == null) {
																																									_result.add(
																																											new Object[] {
																																													d,
																																													b,
																																													a,
																																													c,
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

		return _result;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whilelul2branchbub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			whilelul2branchbub _this, Match match, Assignment d, Assignment b, While a, While c, While w) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, d, b, a, c, w);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whilelul2branchbub_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whilelul2branchbub _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilelul2branchbub_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whilelul2branchbub_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whilelul2branchbub_24_1_prepare_blackB(whilelul2branchbub _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whilelul2branchbub_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_whilelul2branchbub_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("d");
		EObject _localVariable_1 = sourceMatch.getObject("b");
		EObject _localVariable_2 = targetMatch.getObject("i");
		EObject _localVariable_3 = targetMatch.getObject("x");
		EObject _localVariable_4 = sourceMatch.getObject("a");
		EObject _localVariable_5 = sourceMatch.getObject("c");
		EObject _localVariable_6 = targetMatch.getObject("v");
		EObject _localVariable_7 = targetMatch.getObject("z");
		EObject _localVariable_8 = targetMatch.getObject("y");
		EObject _localVariable_9 = sourceMatch.getObject("w");
		EObject tmpD = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpI = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpC = _localVariable_5;
		EObject tmpV = _localVariable_6;
		EObject tmpZ = _localVariable_7;
		EObject tmpY = _localVariable_8;
		EObject tmpW = _localVariable_9;
		if (tmpD instanceof Assignment) {
			Assignment d = (Assignment) tmpD;
			if (tmpB instanceof Assignment) {
				Assignment b = (Assignment) tmpB;
				if (tmpI instanceof Branch) {
					Branch i = (Branch) tmpI;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							if (tmpC instanceof While) {
								While c = (While) tmpC;
								if (tmpV instanceof Command) {
									Command v = (Command) tmpV;
									if (tmpZ instanceof Branch) {
										Branch z = (Branch) tmpZ;
										if (tmpY instanceof Command) {
											Command y = (Command) tmpY;
											if (tmpW instanceof While) {
												While w = (While) tmpW;
												return new Object[] { d, b, i, x, a, c, v, z, y, w, sourceMatch,
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

	public static final Object[] pattern_whilelul2branchbub_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(Assignment d,
			Assignment b, Branch i, Branch x, While a, While c, Command v, Branch z, Command y, While w,
			Match sourceMatch, Match targetMatch) {
		if (!b.equals(d)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (!x.equals(z)) {
						if (!a.equals(c)) {
							if (!a.equals(w)) {
								if (!c.equals(w)) {
									if (!v.equals(y)) {
										if (!sourceMatch.equals(targetMatch)) {
											return new Object[] { d, b, i, x, a, c, v, z, y, w, sourceMatch,
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

	public static final Object[] pattern_whilelul2branchbub_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_binding = pattern_whilelul2branchbub_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_binding != null) {
			Assignment d = (Assignment) result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_binding[0];
			Assignment b = (Assignment) result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_binding[1];
			Branch i = (Branch) result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_binding[2];
			Branch x = (Branch) result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_binding[3];
			While a = (While) result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_binding[4];
			While c = (While) result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_binding[5];
			Command v = (Command) result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_binding[6];
			Branch z = (Branch) result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_binding[7];
			Command y = (Command) result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_binding[8];
			While w = (While) result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_black = pattern_whilelul2branchbub_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					d, b, i, x, a, c, v, z, y, w, sourceMatch, targetMatch);
			if (result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { d, b, i, x, a, c, v, z, y, w, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
			whilelul2branchbub _this, Assignment d, Assignment b, Branch i, Branch x, While a, While c, Command v,
			Branch z, Command y, While w, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(d, b, i, x, a, c, v, z, y, w, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, d, b, i, x, a, c, v, z, y, w, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilelul2branchbub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			whilelul2branchbub _this, Assignment d, Assignment b, Branch i, Branch x, While a, While c, Command v,
			Branch z, Command y, While w, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whilelul2branchbub_24_3_solvecsp_binding = pattern_whilelul2branchbub_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, d, b, i, x, a, c, v, z, y, w, sourceMatch, targetMatch);
		if (result_pattern_whilelul2branchbub_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whilelul2branchbub_24_3_solvecsp_binding[0];

			Object[] result_pattern_whilelul2branchbub_24_3_solvecsp_black = pattern_whilelul2branchbub_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whilelul2branchbub_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, d, b, i, x, a, c, v, z, y, w, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whilelul2branchbub_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilelul2branchbub_24_5_matchcorrcontext_blackBFBBB(Branch i,
			While w, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class, "target")) {
				if (w.equals(w2i.getSource())) {
					_result.add(new Object[] { i, w2i, w, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whilelul2branchbub_24_5_matchcorrcontext_greenBBBF(S2B w2i, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "whilelul2branchbub";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(w2i);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { w2i, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_whilelul2branchbub_24_6_createcorrespondence_blackBBBBBBBBBBB(Assignment d,
			Assignment b, Branch i, Branch x, While a, While c, Command v, Branch z, Command y, While w,
			CCMatch ccMatch) {
		if (!b.equals(d)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (!x.equals(z)) {
						if (!a.equals(c)) {
							if (!a.equals(w)) {
								if (!c.equals(w)) {
									if (!v.equals(y)) {
										return new Object[] { d, b, i, x, a, c, v, z, y, w, ccMatch };
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

	public static final Object[] pattern_whilelul2branchbub_24_6_createcorrespondence_greenBBBFFFBBFBBBB(Assignment d,
			Assignment b, Branch x, While a, While c, Command v, Branch z, Command y, CCMatch ccMatch) {
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		d2v.setTarget(v);
		d2v.setSource(d);
		ccMatch.getCreateCorr().add(d2v);
		b2y.setSource(b);
		b2y.setTarget(y);
		ccMatch.getCreateCorr().add(b2y);
		c2z.setSource(c);
		c2z.setTarget(z);
		ccMatch.getCreateCorr().add(c2z);
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { d, b, x, d2v, b2y, c2z, a, c, a2x, v, z, y, ccMatch };
	}

	public static final Object[] pattern_whilelul2branchbub_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_whilelul2branchbub_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "whilelul2branchbub";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_whilelul2branchbub_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_0B(Assignment d) {
		for (Decision __DEC_d_positive_238205 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_1B(Assignment d) {
		for (Decision __DEC_d_negative_944282 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_2BBBB(Assignment d, While a,
			While c, While w) {
		if (!a.equals(c)) {
			if (!a.equals(w)) {
				if (!c.equals(w)) {
					for (While __DEC_d_last_675127 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "last")) {
						if (!a.equals(__DEC_d_last_675127)) {
							if (!c.equals(__DEC_d_last_675127)) {
								if (!w.equals(__DEC_d_last_675127)) {
									return new Object[] { d, a, c, w };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_3B(Assignment d) {
		for (Program __DEC_d_first_572449 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_4B(Assignment b) {
		for (Decision __DEC_b_positive_90550 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_5B(Assignment b) {
		for (Decision __DEC_b_negative_368335 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_6BBBB(Assignment b, While a,
			While c, While w) {
		if (!a.equals(c)) {
			if (!a.equals(w)) {
				if (!c.equals(w)) {
					for (While __DEC_b_first_38019 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "first")) {
						if (!a.equals(__DEC_b_first_38019)) {
							if (!c.equals(__DEC_b_first_38019)) {
								if (!w.equals(__DEC_b_first_38019)) {
									return new Object[] { b, a, c, w };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_7BBBB(Assignment b, While a,
			While c, While w) {
		if (!a.equals(c)) {
			if (!a.equals(w)) {
				if (!c.equals(w)) {
					for (While __DEC_b_last_258302 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "last")) {
						if (!a.equals(__DEC_b_last_258302)) {
							if (!c.equals(__DEC_b_last_258302)) {
								if (!w.equals(__DEC_b_last_258302)) {
									return new Object[] { b, a, c, w };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_8B(Assignment b) {
		for (Program __DEC_b_first_449449 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_9B(While a) {
		for (Decision __DEC_a_positive_964150 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_10B(While a) {
		for (Decision __DEC_a_negative_410052 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_11BBB(While a, While c,
			While w) {
		if (!a.equals(c)) {
			if (!a.equals(w)) {
				if (!c.equals(w)) {
					for (While __DEC_a_last_328664 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, While.class, "last")) {
						if (!a.equals(__DEC_a_last_328664)) {
							if (!c.equals(__DEC_a_last_328664)) {
								if (!w.equals(__DEC_a_last_328664)) {
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

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_12B(While a) {
		for (Program __DEC_a_first_118963 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_13B(While c) {
		for (Decision __DEC_c_positive_370522 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_14B(While c) {
		for (Decision __DEC_c_negative_197858 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_15BBB(While c, While a,
			While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_first_93913 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "first")) {
						if (!c.equals(__DEC_c_first_93913)) {
							if (!a.equals(__DEC_c_first_93913)) {
								if (!w.equals(__DEC_c_first_93913)) {
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

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_16BBB(While c, While a,
			While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_last_392234 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "last")) {
						if (!c.equals(__DEC_c_last_392234)) {
							if (!a.equals(__DEC_c_last_392234)) {
								if (!w.equals(__DEC_c_last_392234)) {
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

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_17B(While c) {
		for (Program __DEC_c_first_563750 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_18BB(While a, Assignment d) {
		if (d.equals(a.getLast())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_19BB(While w, Assignment d) {
		if (d.equals(w.getLast())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_20BB(While a, Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_21BB(While c, Assignment b) {
		if (b.equals(c.getFirst())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_22BB(While w, Assignment b) {
		if (b.equals(w.getFirst())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_23BB(While c, Assignment b) {
		if (b.equals(c.getLast())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_24BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_25BB(While a, While c) {
		if (c.equals(a.getFirst())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_26BB(While a, While c) {
		if (c.equals(a.getLast())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_blackBBBBB(Assignment d, Assignment b,
			While a, While c, While w) {
		if (!b.equals(d)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!c.equals(w)) {
						if (d.equals(c.getLast())) {
							if (b.equals(a.getLast())) {
								if (d.equals(c.getFirst())) {
									if (a.equals(w.getFirst())) {
										if (c.equals(w.getNext())) {
											if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_0B(
													d) == null) {
												if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_1B(
														d) == null) {
													if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_2BBBB(
															d, a, c, w) == null) {
														if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_3B(
																d) == null) {
															if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_4B(
																	b) == null) {
																if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_5B(
																		b) == null) {
																	if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_6BBBB(
																			b, a, c, w) == null) {
																		if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_7BBBB(
																				b, a, c, w) == null) {
																			if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_8B(
																					b) == null) {
																				if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_9B(
																						a) == null) {
																					if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_10B(
																							a) == null) {
																						if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_11BBB(
																								a, c, w) == null) {
																							if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_12B(
																									a) == null) {
																								if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_13B(
																										c) == null) {
																									if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_14B(
																											c) == null) {
																										if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_15BBB(
																												c, a,
																												w) == null) {
																											if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_16BBB(
																													c,
																													a,
																													w) == null) {
																												if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_17B(
																														c) == null) {
																													if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_18BB(
																															a,
																															d) == null) {
																														if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_19BB(
																																w,
																																d) == null) {
																															if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_20BB(
																																	a,
																																	b) == null) {
																																if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_21BB(
																																		c,
																																		b) == null) {
																																	if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_22BB(
																																			w,
																																			b) == null) {
																																		if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_23BB(
																																				c,
																																				b) == null) {
																																			if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_24BB(
																																					w,
																																					b) == null) {
																																				if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_25BB(
																																						a,
																																						c) == null) {
																																					if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_26BB(
																																							a,
																																							c) == null) {
																																						return new Object[] {
																																								d,
																																								b,
																																								a,
																																								c,
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
		return null;
	}

	public static final boolean pattern_whilelul2branchbub_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whilelul2branchbub_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_670046 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_1BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_307407 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_307407)) {
							if (!i.equals(__DEC_x_positive_307407)) {
								if (!z.equals(__DEC_x_positive_307407)) {
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

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_2BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_612726 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_612726)) {
							if (!i.equals(__DEC_x_negative_612726)) {
								if (!z.equals(__DEC_x_negative_612726)) {
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

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_3B(Command v) {
		for (Graph __DEC_v_root_735092 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(v,
				Graph.class, "root")) {
			return new Object[] { v };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_4BBBB(Command v, Branch i,
			Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (Branch __DEC_v_positive_57267 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "positive")) {
						if (!i.equals(__DEC_v_positive_57267)) {
							if (!x.equals(__DEC_v_positive_57267)) {
								if (!z.equals(__DEC_v_positive_57267)) {
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

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_5BBBB(Command v, Branch i,
			Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (Branch __DEC_v_negative_15468 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "negative")) {
						if (!i.equals(__DEC_v_negative_15468)) {
							if (!x.equals(__DEC_v_negative_15468)) {
								if (!z.equals(__DEC_v_negative_15468)) {
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

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_6B(Branch z) {
		for (Graph __DEC_z_root_68975 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_7BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_positive_998844 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_998844)) {
							if (!i.equals(__DEC_z_positive_998844)) {
								if (!x.equals(__DEC_z_positive_998844)) {
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

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_8BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_negative_276943 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_276943)) {
							if (!i.equals(__DEC_z_negative_276943)) {
								if (!x.equals(__DEC_z_negative_276943)) {
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

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_9B(Command y) {
		for (Graph __DEC_y_root_160621 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_10BBBB(Command y, Branch i,
			Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_positive_303463 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!i.equals(__DEC_y_positive_303463)) {
							if (!x.equals(__DEC_y_positive_303463)) {
								if (!z.equals(__DEC_y_positive_303463)) {
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

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_11BBBB(Command y, Branch i,
			Branch x, Branch z) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_negative_721854 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!i.equals(__DEC_y_negative_721854)) {
							if (!x.equals(__DEC_y_negative_721854)) {
								if (!z.equals(__DEC_y_negative_721854)) {
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

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_12BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_13BB(Branch i, Command v) {
		if (v.equals(i.getPositive())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_14BB(Branch x, Command v) {
		if (v.equals(x.getPositive())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_15BB(Branch i, Command v) {
		if (v.equals(i.getNegative())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_16BB(Branch x, Command v) {
		if (v.equals(x.getNegative())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_17BB(Branch z, Command v) {
		if (v.equals(z.getNegative())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_18BB(Branch i, Branch z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_19BB(Branch x, Branch z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_20BB(Branch x, Branch z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_21BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_22BB(Branch x, Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_23BB(Branch z, Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_24BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_25BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_26BB(Branch z, Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_blackBBBBB(Branch i, Branch x,
			Command v, Branch z, Command y) {
		if (!i.equals(x)) {
			if (!i.equals(z)) {
				if (!x.equals(z)) {
					if (!v.equals(y)) {
						if (z.equals(i.getNegative())) {
							if (x.equals(i.getPositive())) {
								if (z.equals(v.getNext())) {
									if (v.equals(z.getPositive())) {
										if (x.equals(y.getNext())) {
											if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_0B(
													x) == null) {
												if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_1BBB(x, i,
														z) == null) {
													if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_2BBB(
															x, i, z) == null) {
														if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_3B(
																v) == null) {
															if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_4BBBB(
																	v, i, x, z) == null) {
																if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_5BBBB(
																		v, i, x, z) == null) {
																	if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_6B(
																			z) == null) {
																		if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_7BBB(
																				z, i, x) == null) {
																			if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_8BBB(
																					z, i, x) == null) {
																				if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_9B(
																						y) == null) {
																					if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_10BBBB(
																							y, i, x, z) == null) {
																						if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_11BBBB(
																								y, i, x, z) == null) {
																							if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_12BB(
																									i, x) == null) {
																								if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_13BB(
																										i, v) == null) {
																									if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_14BB(
																											x,
																											v) == null) {
																										if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_15BB(
																												i,
																												v) == null) {
																											if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_16BB(
																													x,
																													v) == null) {
																												if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_17BB(
																														z,
																														v) == null) {
																													if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_18BB(
																															i,
																															z) == null) {
																														if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_19BB(
																																x,
																																z) == null) {
																															if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_20BB(
																																	x,
																																	z) == null) {
																																if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_21BB(
																																		i,
																																		y) == null) {
																																	if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_22BB(
																																			x,
																																			y) == null) {
																																		if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_23BB(
																																				z,
																																				y) == null) {
																																			if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_24BB(
																																					i,
																																					y) == null) {
																																				if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_25BB(
																																						x,
																																						y) == null) {
																																					if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_26BB(
																																							z,
																																							y) == null) {
																																						return new Object[] {
																																								i,
																																								x,
																																								v,
																																								z,
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
		return null;
	}

	public static final boolean pattern_whilelul2branchbub_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whilelul2branchbub_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whilelul2branchbub_29_1_createresult_blackB(whilelul2branchbub _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whilelul2branchbub_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_whilelul2branchbub_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilelul2branchbub_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_whilelul2branchbub_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									w2i) == null) {
								if (pattern_whilelul2branchbub_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										i) == null) {
									if (pattern_whilelul2branchbub_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											w) == null) {
										_result.add(
												new Object[] { w2iList, i, w2i, w, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_whilelul2branchbub_29_3_solveCSP_bindingFBBBBBB(whilelul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, While w, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, i, w2i, w, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, i, w2i, w, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilelul2branchbub_29_3_solveCSP_bindingAndBlackFBBBBBB(
			whilelul2branchbub _this, IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, While w,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whilelul2branchbub_29_3_solveCSP_binding = pattern_whilelul2branchbub_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, i, w2i, w, ruleResult);
		if (result_pattern_whilelul2branchbub_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilelul2branchbub_29_3_solveCSP_binding[0];

			Object[] result_pattern_whilelul2branchbub_29_3_solveCSP_black = pattern_whilelul2branchbub_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whilelul2branchbub_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, i, w2i, w, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whilelul2branchbub_29_4_checkCSP_expressionFBB(whilelul2branchbub _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilelul2branchbub_29_5_checknacs_blackBBB(Branch i, S2B w2i, While w) {
		return new Object[] { i, w2i, w };
	}

	public static final Object[] pattern_whilelul2branchbub_29_6_perform_blackBBBB(Branch i, S2B w2i, While w,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { i, w2i, w, ruleResult };
	}

	public static final Object[] pattern_whilelul2branchbub_29_6_perform_greenFFBFFFFFFFFFFBB(Branch i, While w,
			ModelgeneratorRuleResult ruleResult) {
		Assignment d = SourcecodeFactory.eINSTANCE.createAssignment();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command v = ControlflowFactory.eINSTANCE.createCommand();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getSourceObjects().add(d);
		ruleResult.getSourceObjects().add(b);
		i.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		d2v.setSource(d);
		ruleResult.getCorrObjects().add(d2v);
		b2y.setSource(b);
		ruleResult.getCorrObjects().add(b2y);
		ruleResult.getCorrObjects().add(c2z);
		a.setLast(b);
		w.setFirst(a);
		ruleResult.getSourceObjects().add(a);
		c.setLast(d);
		c2z.setSource(c);
		c.setFirst(d);
		w.setNext(c);
		ruleResult.getSourceObjects().add(c);
		a2x.setSource(a);
		a2x.setTarget(x);
		ruleResult.getCorrObjects().add(a2x);
		d2v.setTarget(v);
		ruleResult.getTargetObjects().add(v);
		i.setNegative(z);
		v.setNext(z);
		z.setPositive(v);
		c2z.setTarget(z);
		ruleResult.getTargetObjects().add(z);
		b2y.setTarget(y);
		y.setNext(x);
		ruleResult.getTargetObjects().add(y);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { d, b, i, x, d2v, b2y, c2z, a, c, a2x, v, z, y, w, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whilelul2branchbub_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whilelul2branchbubImpl
