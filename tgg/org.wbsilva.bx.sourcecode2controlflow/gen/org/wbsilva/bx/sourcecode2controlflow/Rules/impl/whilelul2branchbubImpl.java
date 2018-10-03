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
	public boolean isAppropriate_FWD(Match match, While c, While a, Assignment d, While w, Assignment b) {

		Object[] result1_black = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_0_1_initialbindings_blackBBBBBBB(this, match, c, a, d, w, b);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[d] = " + d + ", "
					+ "[w] = " + w + ", " + "[b] = " + b + ".");
		}

		Object[] result2_bindingAndBlack = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, c, a, d, w, b);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[d] = " + d + ", "
					+ "[w] = " + w + ", " + "[b] = " + b + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whilelul2branchbubImpl.pattern_whilelul2branchbub_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whilelul2branchbubImpl
					.pattern_whilelul2branchbub_0_4_collectelementstobetranslated_blackBBBBBB(match, c, a, d, w, b);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[c] = " + c + ", "
								+ "[a] = " + a + ", " + "[d] = " + d + ", " + "[w] = " + w + ", " + "[b] = " + b + ".");
			}
			whilelul2branchbubImpl.pattern_whilelul2branchbub_0_4_collectelementstobetranslated_greenBBBBBBFFFFF(match,
					c, a, d, w, b);
			//nothing EMoflonEdge c__d____last = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge c__d____first = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[10];

			Object[] result5_black = whilelul2branchbubImpl
					.pattern_whilelul2branchbub_0_5_collectcontextelements_blackBBBBBB(match, c, a, d, w, b);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[c] = " + c + ", "
								+ "[a] = " + a + ", " + "[d] = " + d + ", " + "[w] = " + w + ", " + "[b] = " + b + ".");
			}
			whilelul2branchbubImpl.pattern_whilelul2branchbub_0_5_collectcontextelements_greenBB(match, w);

			// 
			whilelul2branchbubImpl.pattern_whilelul2branchbub_0_6_registerobjectstomatch_expressionBBBBBBB(this, match,
					c, a, d, w, b);
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
		While c = (While) result1_bindingAndBlack[0];
		While a = (While) result1_bindingAndBlack[1];
		Assignment d = (Assignment) result1_bindingAndBlack[2];
		Branch i = (Branch) result1_bindingAndBlack[3];
		S2B w2i = (S2B) result1_bindingAndBlack[4];
		While w = (While) result1_bindingAndBlack[5];
		Assignment b = (Assignment) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_1_1_performtransformation_greenFFFBFBFBBFFFB(c, a, d, i, b);
		S2N b2y = (S2N) result1_green[0];
		S2N d2v = (S2N) result1_green[1];
		Branch z = (Branch) result1_green[2];
		Branch x = (Branch) result1_green[4];
		Command y = (Command) result1_green[6];
		Command v = (Command) result1_green[9];
		S2B c2z = (S2B) result1_green[10];
		S2B a2x = (S2B) result1_green[11];

		Object[] result2_black = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(b2y, d2v, z, c, x, a, y, d,
						v, c2z, a2x, b);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[b2y] = " + b2y + ", "
					+ "[d2v] = " + d2v + ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[x] = " + x + ", "
					+ "[a] = " + a + ", " + "[y] = " + y + ", " + "[d] = " + d + ", " + "[v] = " + v + ", " + "[c2z] = "
					+ c2z + ", " + "[a2x] = " + a2x + ", " + "[b] = " + b + ".");
		}
		Object[] result2_green = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(b2y, d2v, z, c, x, a, y, d,
						v, c2z, a2x, b);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, b2y, d2v, z, c, x,
						a, y, d, i, w2i, v, c2z, w, a2x, b);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b2y] = " + b2y + ", " + "[d2v] = " + d2v + ", " + "[z] = " + z + ", " + "[c] = " + c
					+ ", " + "[x] = " + x + ", " + "[a] = " + a + ", " + "[y] = " + y + ", " + "[d] = " + d + ", "
					+ "[i] = " + i + ", " + "[w2i] = " + w2i + ", " + "[v] = " + v + ", " + "[c2z] = " + c2z + ", "
					+ "[w] = " + w + ", " + "[a2x] = " + a2x + ", " + "[b] = " + b + ".");
		}
		whilelul2branchbubImpl
				.pattern_whilelul2branchbub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(ruleresult,
						b2y, d2v, z, c, x, a, y, d, i, v, c2z, w, a2x, b);
		//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge d2v__d____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge z__v____positive = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge d2v__v____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge c__d____first = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[32];

		// 
		// 
		whilelul2branchbubImpl.pattern_whilelul2branchbub_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this,
				ruleresult, b2y, d2v, z, c, x, a, y, d, i, w2i, v, c2z, w, a2x, b);
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
		While c = (While) result2_binding[0];
		While a = (While) result2_binding[1];
		Assignment d = (Assignment) result2_binding[2];
		While w = (While) result2_binding[3];
		Assignment b = (Assignment) result2_binding[4];
		for (Object[] result2_black : whilelul2branchbubImpl.pattern_whilelul2branchbub_2_2_corematch_blackBBBFFBBB(c,
				a, d, w, b, match)) {
			Branch i = (Branch) result2_black[3];
			S2B w2i = (S2B) result2_black[4];
			// ForEach 
			for (Object[] result3_black : whilelul2branchbubImpl
					.pattern_whilelul2branchbub_2_3_findcontext_blackBBBBBBB(c, a, d, i, w2i, w, b)) {
				Object[] result3_green = whilelul2branchbubImpl
						.pattern_whilelul2branchbub_2_3_findcontext_greenBBBBBBBFFFFFFFF(c, a, d, i, w2i, w, b);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge c__d____first = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = whilelul2branchbubImpl
						.pattern_whilelul2branchbub_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, c,
								a, d, i, w2i, w, b);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[a] = " + a
							+ ", " + "[d] = " + d + ", " + "[i] = " + i + ", " + "[w2i] = " + w2i + ", " + "[w] = " + w
							+ ", " + "[b] = " + b + ".");
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
	public void registerObjectsToMatch_FWD(Match match, While c, While a, Assignment d, While w, Assignment b) {
		match.registerObject("c", c);
		match.registerObject("a", a);
		match.registerObject("d", d);
		match.registerObject("w", w);
		match.registerObject("b", b);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, While c, While a, Assignment d, While w, Assignment b) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, While c, While a, Assignment d, Branch i,
			S2B w2i, While w, Assignment b) {// Create CSP
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
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("w", w);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject b2y, EObject d2v, EObject z, EObject c,
			EObject x, EObject a, EObject y, EObject d, EObject i, EObject w2i, EObject v, EObject c2z, EObject w,
			EObject a2x, EObject b) {
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("d2v", d2v);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("v", v);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("b", b);

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
	public boolean isAppropriate_BWD(Match match, Branch z, Branch x, Command y, Branch i, Command v) {

		Object[] result1_black = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_10_1_initialbindings_blackBBBBBBB(this, match, z, x, y, i, v);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[y] = " + y + ", "
					+ "[i] = " + i + ", " + "[v] = " + v + ".");
		}

		Object[] result2_bindingAndBlack = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, z, x, y, i, v);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[y] = " + y + ", "
					+ "[i] = " + i + ", " + "[v] = " + v + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whilelul2branchbubImpl.pattern_whilelul2branchbub_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whilelul2branchbubImpl
					.pattern_whilelul2branchbub_10_4_collectelementstobetranslated_blackBBBBBB(match, z, x, y, i, v);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[z] = " + z + ", "
								+ "[x] = " + x + ", " + "[y] = " + y + ", " + "[i] = " + i + ", " + "[v] = " + v + ".");
			}
			whilelul2branchbubImpl.pattern_whilelul2branchbub_10_4_collectelementstobetranslated_greenBBBBBBFFFFF(match,
					z, x, y, i, v);
			//nothing EMoflonEdge y__x____next = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge z__v____positive = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge v__z____next = (EMoflonEdge) result4_green[10];

			Object[] result5_black = whilelul2branchbubImpl
					.pattern_whilelul2branchbub_10_5_collectcontextelements_blackBBBBBB(match, z, x, y, i, v);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[z] = " + z + ", "
								+ "[x] = " + x + ", " + "[y] = " + y + ", " + "[i] = " + i + ", " + "[v] = " + v + ".");
			}
			whilelul2branchbubImpl.pattern_whilelul2branchbub_10_5_collectcontextelements_greenBB(match, i);

			// 
			whilelul2branchbubImpl.pattern_whilelul2branchbub_10_6_registerobjectstomatch_expressionBBBBBBB(this, match,
					z, x, y, i, v);
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
		Branch z = (Branch) result1_bindingAndBlack[0];
		Branch x = (Branch) result1_bindingAndBlack[1];
		Command y = (Command) result1_bindingAndBlack[2];
		Branch i = (Branch) result1_bindingAndBlack[3];
		S2B w2i = (S2B) result1_bindingAndBlack[4];
		Command v = (Command) result1_bindingAndBlack[5];
		While w = (While) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_11_1_performtransformation_greenFFBFBFBFBFBFF(z, x, y, v, w);
		S2N b2y = (S2N) result1_green[0];
		S2N d2v = (S2N) result1_green[1];
		While c = (While) result1_green[3];
		While a = (While) result1_green[5];
		Assignment d = (Assignment) result1_green[7];
		S2B c2z = (S2B) result1_green[9];
		S2B a2x = (S2B) result1_green[11];
		Assignment b = (Assignment) result1_green[12];

		Object[] result2_black = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(b2y, d2v, z, c, x, a, y, d,
						v, c2z, a2x, b);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[b2y] = " + b2y + ", "
					+ "[d2v] = " + d2v + ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[x] = " + x + ", "
					+ "[a] = " + a + ", " + "[y] = " + y + ", " + "[d] = " + d + ", " + "[v] = " + v + ", " + "[c2z] = "
					+ c2z + ", " + "[a2x] = " + a2x + ", " + "[b] = " + b + ".");
		}
		Object[] result2_green = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(b2y, d2v, z, c, x, a, y,
						d, v, c2z, a2x, b);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, b2y, d2v, z, c,
						x, a, y, d, i, w2i, v, c2z, w, a2x, b);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b2y] = " + b2y + ", " + "[d2v] = " + d2v + ", " + "[z] = " + z + ", " + "[c] = " + c
					+ ", " + "[x] = " + x + ", " + "[a] = " + a + ", " + "[y] = " + y + ", " + "[d] = " + d + ", "
					+ "[i] = " + i + ", " + "[w2i] = " + w2i + ", " + "[v] = " + v + ", " + "[c2z] = " + c2z + ", "
					+ "[w] = " + w + ", " + "[a2x] = " + a2x + ", " + "[b] = " + b + ".");
		}
		whilelul2branchbubImpl
				.pattern_whilelul2branchbub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(ruleresult,
						b2y, d2v, z, c, x, a, y, d, i, v, c2z, w, a2x, b);
		//nothing EMoflonEdge c__d____last = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge d2v__d____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge z__v____positive = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge d2v__v____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge c__d____first = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[32];

		// 
		// 
		whilelul2branchbubImpl.pattern_whilelul2branchbub_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this,
				ruleresult, b2y, d2v, z, c, x, a, y, d, i, w2i, v, c2z, w, a2x, b);
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
		Branch z = (Branch) result2_binding[0];
		Branch x = (Branch) result2_binding[1];
		Command y = (Command) result2_binding[2];
		Branch i = (Branch) result2_binding[3];
		Command v = (Command) result2_binding[4];
		for (Object[] result2_black : whilelul2branchbubImpl.pattern_whilelul2branchbub_12_2_corematch_blackBBBBFBFB(z,
				x, y, i, v, match)) {
			S2B w2i = (S2B) result2_black[4];
			While w = (While) result2_black[6];
			// ForEach 
			for (Object[] result3_black : whilelul2branchbubImpl
					.pattern_whilelul2branchbub_12_3_findcontext_blackBBBBBBB(z, x, y, i, w2i, v, w)) {
				Object[] result3_green = whilelul2branchbubImpl
						.pattern_whilelul2branchbub_12_3_findcontext_greenBBBBBBBFFFFFFFF(z, x, y, i, w2i, v, w);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge z__v____positive = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge v__z____next = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = whilelul2branchbubImpl
						.pattern_whilelul2branchbub_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, z,
								x, y, i, w2i, v, w);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[z] = " + z + ", " + "[x] = " + x
							+ ", " + "[y] = " + y + ", " + "[i] = " + i + ", " + "[w2i] = " + w2i + ", " + "[v] = " + v
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
	public void registerObjectsToMatch_BWD(Match match, Branch z, Branch x, Command y, Branch i, Command v) {
		match.registerObject("z", z);
		match.registerObject("x", x);
		match.registerObject("y", y);
		match.registerObject("i", i);
		match.registerObject("v", v);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch z, Branch x, Command y, Branch i, Command v) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch z, Branch x, Command y, Branch i,
			S2B w2i, Command v, While w) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("v", v);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject b2y, EObject d2v, EObject z, EObject c,
			EObject x, EObject a, EObject y, EObject d, EObject i, EObject w2i, EObject v, EObject c2z, EObject w,
			EObject a2x, EObject b) {
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("d2v", d2v);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("v", v);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("b", b);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("v").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_28(EMoflonEdge _edge_next) {

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
				.pattern_whilelul2branchbub_20_2_testcorematchandDECs_blackFFFFFB(_edge_next)) {
			Branch z = (Branch) result2_black[0];
			Branch x = (Branch) result2_black[1];
			Command y = (Command) result2_black[2];
			Branch i = (Branch) result2_black[3];
			Command v = (Command) result2_black[4];
			Object[] result2_green = whilelul2branchbubImpl
					.pattern_whilelul2branchbub_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whilelul2branchbubImpl
					.pattern_whilelul2branchbub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, z, x, y, i, v)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_29(EMoflonEdge _edge_last) {

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
			While c = (While) result2_black[0];
			While a = (While) result2_black[1];
			Assignment d = (Assignment) result2_black[2];
			While w = (While) result2_black[3];
			Assignment b = (Assignment) result2_black[4];
			Object[] result2_green = whilelul2branchbubImpl
					.pattern_whilelul2branchbub_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whilelul2branchbubImpl
					.pattern_whilelul2branchbub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, c, a, d, w, b)) {
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
		Branch z = (Branch) result2_bindingAndBlack[0];
		While c = (While) result2_bindingAndBlack[1];
		Branch x = (Branch) result2_bindingAndBlack[2];
		While a = (While) result2_bindingAndBlack[3];
		Command y = (Command) result2_bindingAndBlack[4];
		Assignment d = (Assignment) result2_bindingAndBlack[5];
		Branch i = (Branch) result2_bindingAndBlack[6];
		Command v = (Command) result2_bindingAndBlack[7];
		While w = (While) result2_bindingAndBlack[8];
		Assignment b = (Assignment) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = whilelul2branchbubImpl
				.pattern_whilelul2branchbub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, z, c, x, a, y, d, i, v, w,
						b, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[z] = " + z + ", " + "[c] = " + c + ", " + "[x] = " + x + ", " + "[a] = " + a + ", " + "[y] = "
					+ y + ", " + "[d] = " + d + ", " + "[i] = " + i + ", " + "[v] = " + v + ", " + "[w] = " + w + ", "
					+ "[b] = " + b + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
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
						.pattern_whilelul2branchbub_24_6_createcorrespondence_blackBBBBBBBBBBB(z, c, x, a, y, d, i, v,
								w, b, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[z] = " + z + ", "
							+ "[c] = " + c + ", " + "[x] = " + x + ", " + "[a] = " + a + ", " + "[y] = " + y + ", "
							+ "[d] = " + d + ", " + "[i] = " + i + ", " + "[v] = " + v + ", " + "[w] = " + w + ", "
							+ "[b] = " + b + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whilelul2branchbubImpl.pattern_whilelul2branchbub_24_6_createcorrespondence_greenFFBBBBBBBFFBB(z, c, x,
						a, y, d, v, b, ccMatch);
				//nothing S2N b2y = (S2N) result6_green[0];
				//nothing S2N d2v = (S2N) result6_green[1];
				//nothing S2B c2z = (S2B) result6_green[9];
				//nothing S2B a2x = (S2B) result6_green[10];

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
	public CSP isApplicable_solveCsp_CC(Branch z, While c, Branch x, While a, Command y, Assignment d, Branch i,
			Command v, While w, Assignment b, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(While c, While a, Assignment d, While w, Assignment b) {// 
		Object[] result1_black = whilelul2branchbubImpl.pattern_whilelul2branchbub_27_1_matchtggpattern_blackBBBBB(c, a,
				d, w, b);
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
	public boolean checkDEC_BWD(Branch z, Branch x, Command y, Branch i, Command v) {// 
		Object[] result1_black = whilelul2branchbubImpl.pattern_whilelul2branchbub_28_1_matchtggpattern_blackBBBBB(z, x,
				y, i, v);
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
					whilelul2branchbubImpl.pattern_whilelul2branchbub_29_6_perform_greenFFFFFFFFBFFBFFB(i, w,
							ruleResult);
					//nothing S2N b2y = (S2N) result6_green[0];
					//nothing S2N d2v = (S2N) result6_green[1];
					//nothing Branch z = (Branch) result6_green[2];
					//nothing While c = (While) result6_green[3];
					//nothing Branch x = (Branch) result6_green[4];
					//nothing While a = (While) result6_green[5];
					//nothing Command y = (Command) result6_green[6];
					//nothing Assignment d = (Assignment) result6_green[7];
					//nothing Command v = (Command) result6_green[9];
					//nothing S2B c2z = (S2B) result6_green[10];
					//nothing S2B a2x = (S2B) result6_green[12];
					//nothing Assignment b = (Assignment) result6_green[13];

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
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPROPRIATE_FWD__MATCH_WHILE_WHILE_ASSIGNMENT_WHILE_ASSIGNMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (While) arguments.get(4), (Assignment) arguments.get(5));
		case RulesPackage.WHILELUL2BRANCHBUB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILELUL2BRANCHBUB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WHILE_WHILE_ASSIGNMENT_WHILE_ASSIGNMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (While) arguments.get(4), (Assignment) arguments.get(5));
			return null;
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WHILE_WHILE_ASSIGNMENT_WHILE_ASSIGNMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4),
					(Assignment) arguments.get(5));
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_WHILE_WHILE_ASSIGNMENT_BRANCH_S2B_WHILE_ASSIGNMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (Branch) arguments.get(4),
					(S2B) arguments.get(5), (While) arguments.get(6), (Assignment) arguments.get(7));
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
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_BRANCH_COMMAND_BRANCH_S2B_COMMAND_WHILE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Branch) arguments.get(4),
					(S2B) arguments.get(5), (Command) arguments.get(6), (While) arguments.get(7));
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
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_28__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_28((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_29__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_29((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILELUL2BRANCHBUB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILELUL2BRANCHBUB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_CC__BRANCH_WHILE_BRANCH_WHILE_COMMAND_ASSIGNMENT_BRANCH_COMMAND_WHILE_ASSIGNMENT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Branch) arguments.get(0), (While) arguments.get(1),
					(Branch) arguments.get(2), (While) arguments.get(3), (Command) arguments.get(4),
					(Assignment) arguments.get(5), (Branch) arguments.get(6), (Command) arguments.get(7),
					(While) arguments.get(8), (Assignment) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.WHILELUL2BRANCHBUB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILELUL2BRANCHBUB___CHECK_DEC_FWD__WHILE_WHILE_ASSIGNMENT_WHILE_ASSIGNMENT:
			return checkDEC_FWD((While) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(While) arguments.get(3), (Assignment) arguments.get(4));
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
			Match match, While c, While a, Assignment d, While w, Assignment b) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!b.equals(d)) {
						return new Object[] { _this, match, c, a, d, w, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_0_2_SolveCSP_bindingFBBBBBBB(whilelul2branchbub _this,
			Match match, While c, While a, Assignment d, While w, Assignment b) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, c, a, d, w, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, c, a, d, w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilelul2branchbub_0_2_SolveCSP_bindingAndBlackFBBBBBBB(
			whilelul2branchbub _this, Match match, While c, While a, Assignment d, While w, Assignment b) {
		Object[] result_pattern_whilelul2branchbub_0_2_SolveCSP_binding = pattern_whilelul2branchbub_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, c, a, d, w, b);
		if (result_pattern_whilelul2branchbub_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilelul2branchbub_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whilelul2branchbub_0_2_SolveCSP_black = pattern_whilelul2branchbub_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whilelul2branchbub_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, c, a, d, w, b };
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
			While c, While a, Assignment d, While w, Assignment b) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!b.equals(d)) {
						return new Object[] { match, c, a, d, w, b };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_0_4_collectelementstobetranslated_greenBBBBBBFFFFF(
			Match match, While c, While a, Assignment d, While w, Assignment b) {
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(c);
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(d);
		match.getToBeTranslatedNodes().add(b);
		String c__d____last_name_prime = "last";
		String c__d____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String a__b____last_name_prime = "last";
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		match.getToBeTranslatedEdges().add(c__d____last);
		c__d____first.setSrc(c);
		c__d____first.setTrg(d);
		match.getToBeTranslatedEdges().add(c__d____first);
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
		c__d____first.setName(c__d____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		return new Object[] { match, c, a, d, w, b, c__d____last, c__d____first, w__c____next, w__a____first,
				a__b____last };
	}

	public static final Object[] pattern_whilelul2branchbub_0_5_collectcontextelements_blackBBBBBB(Match match, While c,
			While a, Assignment d, While w, Assignment b) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!b.equals(d)) {
						return new Object[] { match, c, a, d, w, b };
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
			whilelul2branchbub _this, Match match, While c, While a, Assignment d, While w, Assignment b) {
		_this.registerObjectsToMatch_FWD(match, c, a, d, w, b);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("c");
		EObject _localVariable_1 = isApplicableMatch.getObject("a");
		EObject _localVariable_2 = isApplicableMatch.getObject("d");
		EObject _localVariable_3 = isApplicableMatch.getObject("i");
		EObject _localVariable_4 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_5 = isApplicableMatch.getObject("w");
		EObject _localVariable_6 = isApplicableMatch.getObject("b");
		EObject tmpC = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpD = _localVariable_2;
		EObject tmpI = _localVariable_3;
		EObject tmpW2i = _localVariable_4;
		EObject tmpW = _localVariable_5;
		EObject tmpB = _localVariable_6;
		if (tmpC instanceof While) {
			While c = (While) tmpC;
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (tmpD instanceof Assignment) {
					Assignment d = (Assignment) tmpD;
					if (tmpI instanceof Branch) {
						Branch i = (Branch) tmpI;
						if (tmpW2i instanceof S2B) {
							S2B w2i = (S2B) tmpW2i;
							if (tmpW instanceof While) {
								While w = (While) tmpW;
								if (tmpB instanceof Assignment) {
									Assignment b = (Assignment) tmpB;
									return new Object[] { c, a, d, i, w2i, w, b, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_1_1_performtransformation_blackBBBBBBBFBB(While c, While a,
			Assignment d, Branch i, S2B w2i, While w, Assignment b, whilelul2branchbub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!b.equals(d)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { c, a, d, i, w2i, w, b, csp, _this, isApplicableMatch };
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
			While c = (While) result_pattern_whilelul2branchbub_1_1_performtransformation_binding[0];
			While a = (While) result_pattern_whilelul2branchbub_1_1_performtransformation_binding[1];
			Assignment d = (Assignment) result_pattern_whilelul2branchbub_1_1_performtransformation_binding[2];
			Branch i = (Branch) result_pattern_whilelul2branchbub_1_1_performtransformation_binding[3];
			S2B w2i = (S2B) result_pattern_whilelul2branchbub_1_1_performtransformation_binding[4];
			While w = (While) result_pattern_whilelul2branchbub_1_1_performtransformation_binding[5];
			Assignment b = (Assignment) result_pattern_whilelul2branchbub_1_1_performtransformation_binding[6];

			Object[] result_pattern_whilelul2branchbub_1_1_performtransformation_black = pattern_whilelul2branchbub_1_1_performtransformation_blackBBBBBBBFBB(
					c, a, d, i, w2i, w, b, _this, isApplicableMatch);
			if (result_pattern_whilelul2branchbub_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whilelul2branchbub_1_1_performtransformation_black[7];

				return new Object[] { c, a, d, i, w2i, w, b, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_1_1_performtransformation_greenFFFBFBFBBFFFB(While c,
			While a, Assignment d, Branch i, Assignment b) {
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Command v = ControlflowFactory.eINSTANCE.createCommand();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		b2y.setSource(b);
		d2v.setSource(d);
		i.setNegative(z);
		i.setPositive(x);
		b2y.setTarget(y);
		y.setNext(x);
		z.setPositive(v);
		d2v.setTarget(v);
		v.setNext(z);
		c2z.setTarget(z);
		c2z.setSource(c);
		a2x.setSource(a);
		a2x.setTarget(x);
		return new Object[] { b2y, d2v, z, c, x, a, y, d, i, v, c2z, a2x, b };
	}

	public static final Object[] pattern_whilelul2branchbub_1_2_collecttranslatedelements_blackBBBBBBBBBBBB(S2N b2y,
			S2N d2v, Branch z, While c, Branch x, While a, Command y, Assignment d, Command v, S2B c2z, S2B a2x,
			Assignment b) {
		if (!b2y.equals(d2v)) {
			if (!x.equals(z)) {
				if (!a.equals(c)) {
					if (!v.equals(y)) {
						if (!a2x.equals(c2z)) {
							if (!b.equals(d)) {
								return new Object[] { b2y, d2v, z, c, x, a, y, d, v, c2z, a2x, b };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_1_2_collecttranslatedelements_greenFBBBBBBBBBBBB(S2N b2y,
			S2N d2v, Branch z, While c, Branch x, While a, Command y, Assignment d, Command v, S2B c2z, S2B a2x,
			Assignment b) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(d2v);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getTranslatedElements().add(d);
		ruleresult.getCreatedElements().add(v);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(b);
		return new Object[] { ruleresult, b2y, d2v, z, c, x, a, y, d, v, c2z, a2x, b };
	}

	public static final Object[] pattern_whilelul2branchbub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject b2y, EObject d2v, EObject z, EObject c, EObject x, EObject a,
			EObject y, EObject d, EObject i, EObject w2i, EObject v, EObject c2z, EObject w, EObject a2x, EObject b) {
		if (!b2y.equals(d2v)) {
			if (!b2y.equals(z)) {
				if (!b2y.equals(c)) {
					if (!b2y.equals(x)) {
						if (!b2y.equals(y)) {
							if (!b2y.equals(d)) {
								if (!b2y.equals(i)) {
									if (!b2y.equals(w2i)) {
										if (!b2y.equals(v)) {
											if (!b2y.equals(c2z)) {
												if (!b2y.equals(w)) {
													if (!d2v.equals(z)) {
														if (!d2v.equals(x)) {
															if (!d2v.equals(y)) {
																if (!d2v.equals(i)) {
																	if (!d2v.equals(w2i)) {
																		if (!d2v.equals(v)) {
																			if (!d2v.equals(w)) {
																				if (!c.equals(d2v)) {
																					if (!c.equals(z)) {
																						if (!c.equals(x)) {
																							if (!c.equals(y)) {
																								if (!c.equals(d)) {
																									if (!c.equals(i)) {
																										if (!c.equals(
																												w2i)) {
																											if (!c.equals(
																													v)) {
																												if (!c.equals(
																														c2z)) {
																													if (!c.equals(
																															w)) {
																														if (!x.equals(
																																z)) {
																															if (!x.equals(
																																	y)) {
																																if (!a.equals(
																																		b2y)) {
																																	if (!a.equals(
																																			d2v)) {
																																		if (!a.equals(
																																				z)) {
																																			if (!a.equals(
																																					c)) {
																																				if (!a.equals(
																																						x)) {
																																					if (!a.equals(
																																							y)) {
																																						if (!a.equals(
																																								d)) {
																																							if (!a.equals(
																																									i)) {
																																								if (!a.equals(
																																										w2i)) {
																																									if (!a.equals(
																																											v)) {
																																										if (!a.equals(
																																												c2z)) {
																																											if (!a.equals(
																																													w)) {
																																												if (!a.equals(
																																														a2x)) {
																																													if (!a.equals(
																																															b)) {
																																														if (!y.equals(
																																																z)) {
																																															if (!d.equals(
																																																	d2v)) {
																																																if (!d.equals(
																																																		z)) {
																																																	if (!d.equals(
																																																			x)) {
																																																		if (!d.equals(
																																																				y)) {
																																																			if (!d.equals(
																																																					i)) {
																																																				if (!d.equals(
																																																						w2i)) {
																																																					if (!d.equals(
																																																							v)) {
																																																						if (!d.equals(
																																																								w)) {
																																																							if (!i.equals(
																																																									z)) {
																																																								if (!i.equals(
																																																										x)) {
																																																									if (!i.equals(
																																																											y)) {
																																																										if (!i.equals(
																																																												w2i)) {
																																																											if (!i.equals(
																																																													v)) {
																																																												if (!i.equals(
																																																														w)) {
																																																													if (!w2i.equals(
																																																															z)) {
																																																														if (!w2i.equals(
																																																																x)) {
																																																															if (!w2i.equals(
																																																																	y)) {
																																																																if (!v.equals(
																																																																		z)) {
																																																																	if (!v.equals(
																																																																			x)) {
																																																																		if (!v.equals(
																																																																				y)) {
																																																																			if (!v.equals(
																																																																					w2i)) {
																																																																				if (!v.equals(
																																																																						w)) {
																																																																					if (!c2z.equals(
																																																																							d2v)) {
																																																																						if (!c2z.equals(
																																																																								z)) {
																																																																							if (!c2z.equals(
																																																																									x)) {
																																																																								if (!c2z.equals(
																																																																										y)) {
																																																																									if (!c2z.equals(
																																																																											d)) {
																																																																										if (!c2z.equals(
																																																																												i)) {
																																																																											if (!c2z.equals(
																																																																													w2i)) {
																																																																												if (!c2z.equals(
																																																																														v)) {
																																																																													if (!c2z.equals(
																																																																															w)) {
																																																																														if (!w.equals(
																																																																																z)) {
																																																																															if (!w.equals(
																																																																																	x)) {
																																																																																if (!w.equals(
																																																																																		y)) {
																																																																																	if (!w.equals(
																																																																																			w2i)) {
																																																																																		if (!a2x.equals(
																																																																																				b2y)) {
																																																																																			if (!a2x.equals(
																																																																																					d2v)) {
																																																																																				if (!a2x.equals(
																																																																																						z)) {
																																																																																					if (!a2x.equals(
																																																																																							c)) {
																																																																																						if (!a2x.equals(
																																																																																								x)) {
																																																																																							if (!a2x.equals(
																																																																																									y)) {
																																																																																								if (!a2x.equals(
																																																																																										d)) {
																																																																																									if (!a2x.equals(
																																																																																											i)) {
																																																																																										if (!a2x.equals(
																																																																																												w2i)) {
																																																																																											if (!a2x.equals(
																																																																																													v)) {
																																																																																												if (!a2x.equals(
																																																																																														c2z)) {
																																																																																													if (!a2x.equals(
																																																																																															w)) {
																																																																																														if (!a2x.equals(
																																																																																																b)) {
																																																																																															if (!b.equals(
																																																																																																	b2y)) {
																																																																																																if (!b.equals(
																																																																																																		d2v)) {
																																																																																																	if (!b.equals(
																																																																																																			z)) {
																																																																																																		if (!b.equals(
																																																																																																				c)) {
																																																																																																			if (!b.equals(
																																																																																																					x)) {
																																																																																																				if (!b.equals(
																																																																																																						y)) {
																																																																																																					if (!b.equals(
																																																																																																							d)) {
																																																																																																						if (!b.equals(
																																																																																																								i)) {
																																																																																																							if (!b.equals(
																																																																																																									w2i)) {
																																																																																																								if (!b.equals(
																																																																																																										v)) {
																																																																																																									if (!b.equals(
																																																																																																											c2z)) {
																																																																																																										if (!b.equals(
																																																																																																												w)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													b2y,
																																																																																																													d2v,
																																																																																																													z,
																																																																																																													c,
																																																																																																													x,
																																																																																																													a,
																																																																																																													y,
																																																																																																													d,
																																																																																																													i,
																																																																																																													w2i,
																																																																																																													v,
																																																																																																													c2z,
																																																																																																													w,
																																																																																																													a2x,
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
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject b2y, EObject d2v, EObject z, EObject c, EObject x, EObject a,
			EObject y, EObject d, EObject i, EObject v, EObject c2z, EObject w, EObject a2x, EObject b) {
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__v____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__v____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whilelul2branchbub";
		String c__d____last_name_prime = "last";
		String b2y__y____target_name_prime = "target";
		String y__x____next_name_prime = "next";
		String d2v__d____source_name_prime = "source";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String z__v____positive_name_prime = "positive";
		String d2v__v____target_name_prime = "target";
		String c2z__z____target_name_prime = "target";
		String c2z__c____source_name_prime = "source";
		String v__z____next_name_prime = "next";
		String c__d____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String a2x__a____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String w__a____first_name_prime = "first";
		String a__b____last_name_prime = "last";
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		ruleresult.getTranslatedEdges().add(c__d____last);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(y__x____next);
		d2v__d____source.setSrc(d2v);
		d2v__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(d2v__d____source);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		z__v____positive.setSrc(z);
		z__v____positive.setTrg(v);
		ruleresult.getCreatedEdges().add(z__v____positive);
		d2v__v____target.setSrc(d2v);
		d2v__v____target.setTrg(v);
		ruleresult.getCreatedEdges().add(d2v__v____target);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		ruleresult.getCreatedEdges().add(v__z____next);
		c__d____first.setSrc(c);
		c__d____first.setTrg(d);
		ruleresult.getTranslatedEdges().add(c__d____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		c__d____last.setName(c__d____last_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		d2v__d____source.setName(d2v__d____source_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		z__v____positive.setName(z__v____positive_name_prime);
		d2v__v____target.setName(d2v__v____target_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		c__d____first.setName(c__d____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		return new Object[] { ruleresult, b2y, d2v, z, c, x, a, y, d, i, v, c2z, w, a2x, b, c__d____last,
				b2y__y____target, y__x____next, d2v__d____source, i__z____negative, i__x____positive, z__v____positive,
				d2v__v____target, c2z__z____target, c2z__c____source, v__z____next, c__d____first, w__c____next,
				a2x__a____source, a2x__x____target, b2y__b____source, w__a____first, a__b____last };
	}

	public static final void pattern_whilelul2branchbub_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			whilelul2branchbub _this, PerformRuleResult ruleresult, EObject b2y, EObject d2v, EObject z, EObject c,
			EObject x, EObject a, EObject y, EObject d, EObject i, EObject w2i, EObject v, EObject c2z, EObject w,
			EObject a2x, EObject b) {
		_this.registerObjects_FWD(ruleresult, b2y, d2v, z, c, x, a, y, d, i, w2i, v, c2z, w, a2x, b);

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
		EObject _localVariable_0 = match.getObject("c");
		EObject _localVariable_1 = match.getObject("a");
		EObject _localVariable_2 = match.getObject("d");
		EObject _localVariable_3 = match.getObject("w");
		EObject _localVariable_4 = match.getObject("b");
		EObject tmpC = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpD = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpB = _localVariable_4;
		if (tmpC instanceof While) {
			While c = (While) tmpC;
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (tmpD instanceof Assignment) {
					Assignment d = (Assignment) tmpD;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						if (tmpB instanceof Assignment) {
							Assignment b = (Assignment) tmpB;
							return new Object[] { c, a, d, w, b, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilelul2branchbub_2_2_corematch_blackBBBFFBBB(While c, While a,
			Assignment d, While w, Assignment b, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!b.equals(d)) {
						for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class,
								"source")) {
							Branch i = w2i.getTarget();
							if (i != null) {
								_result.add(new Object[] { c, a, d, i, w2i, w, b, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilelul2branchbub_2_3_findcontext_blackBBBBBBB(While c, While a,
			Assignment d, Branch i, S2B w2i, While w, Assignment b) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!b.equals(d)) {
						if (d.equals(c.getLast())) {
							if (i.equals(w2i.getTarget())) {
								if (w.equals(w2i.getSource())) {
									if (d.equals(c.getFirst())) {
										if (c.equals(w.getNext())) {
											if (a.equals(w.getFirst())) {
												if (b.equals(a.getLast())) {
													_result.add(new Object[] { c, a, d, i, w2i, w, b });
												}
											}
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

	public static final Object[] pattern_whilelul2branchbub_2_3_findcontext_greenBBBBBBBFFFFFFFF(While c, While a,
			Assignment d, Branch i, S2B w2i, While w, Assignment b) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c__d____last_name_prime = "last";
		String w2i__i____target_name_prime = "target";
		String w2i__w____source_name_prime = "source";
		String c__d____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String a__b____last_name_prime = "last";
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(b);
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		isApplicableMatch.getAllContextElements().add(c__d____last);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		c__d____first.setSrc(c);
		c__d____first.setTrg(d);
		isApplicableMatch.getAllContextElements().add(c__d____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____last);
		c__d____last.setName(c__d____last_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		c__d____first.setName(c__d____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		return new Object[] { c, a, d, i, w2i, w, b, isApplicableMatch, c__d____last, w2i__i____target,
				w2i__w____source, c__d____first, w__c____next, w__a____first, a__b____last };
	}

	public static final Object[] pattern_whilelul2branchbub_2_4_solveCSP_bindingFBBBBBBBBB(whilelul2branchbub _this,
			IsApplicableMatch isApplicableMatch, While c, While a, Assignment d, Branch i, S2B w2i, While w,
			Assignment b) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, c, a, d, i, w2i, w, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, a, d, i, w2i, w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilelul2branchbub_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			whilelul2branchbub _this, IsApplicableMatch isApplicableMatch, While c, While a, Assignment d, Branch i,
			S2B w2i, While w, Assignment b) {
		Object[] result_pattern_whilelul2branchbub_2_4_solveCSP_binding = pattern_whilelul2branchbub_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, c, a, d, i, w2i, w, b);
		if (result_pattern_whilelul2branchbub_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilelul2branchbub_2_4_solveCSP_binding[0];

			Object[] result_pattern_whilelul2branchbub_2_4_solveCSP_black = pattern_whilelul2branchbub_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whilelul2branchbub_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, a, d, i, w2i, w, b };
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
			Match match, Branch z, Branch x, Command y, Branch i, Command v) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					if (!v.equals(y)) {
						return new Object[] { _this, match, z, x, y, i, v };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_10_2_SolveCSP_bindingFBBBBBBB(whilelul2branchbub _this,
			Match match, Branch z, Branch x, Command y, Branch i, Command v) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, z, x, y, i, v);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, z, x, y, i, v };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilelul2branchbub_10_2_SolveCSP_bindingAndBlackFBBBBBBB(
			whilelul2branchbub _this, Match match, Branch z, Branch x, Command y, Branch i, Command v) {
		Object[] result_pattern_whilelul2branchbub_10_2_SolveCSP_binding = pattern_whilelul2branchbub_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, z, x, y, i, v);
		if (result_pattern_whilelul2branchbub_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilelul2branchbub_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whilelul2branchbub_10_2_SolveCSP_black = pattern_whilelul2branchbub_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whilelul2branchbub_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, z, x, y, i, v };
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
			Branch z, Branch x, Command y, Branch i, Command v) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					if (!v.equals(y)) {
						return new Object[] { match, z, x, y, i, v };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_10_4_collectelementstobetranslated_greenBBBBBBFFFFF(
			Match match, Branch z, Branch x, Command y, Branch i, Command v) {
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__v____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(v);
		String y__x____next_name_prime = "next";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String z__v____positive_name_prime = "positive";
		String v__z____next_name_prime = "next";
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(y__x____next);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		z__v____positive.setSrc(z);
		z__v____positive.setTrg(v);
		match.getToBeTranslatedEdges().add(z__v____positive);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		match.getToBeTranslatedEdges().add(v__z____next);
		y__x____next.setName(y__x____next_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		z__v____positive.setName(z__v____positive_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		return new Object[] { match, z, x, y, i, v, y__x____next, i__z____negative, i__x____positive, z__v____positive,
				v__z____next };
	}

	public static final Object[] pattern_whilelul2branchbub_10_5_collectcontextelements_blackBBBBBB(Match match,
			Branch z, Branch x, Command y, Branch i, Command v) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					if (!v.equals(y)) {
						return new Object[] { match, z, x, y, i, v };
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
			whilelul2branchbub _this, Match match, Branch z, Branch x, Command y, Branch i, Command v) {
		_this.registerObjectsToMatch_BWD(match, z, x, y, i, v);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("z");
		EObject _localVariable_1 = isApplicableMatch.getObject("x");
		EObject _localVariable_2 = isApplicableMatch.getObject("y");
		EObject _localVariable_3 = isApplicableMatch.getObject("i");
		EObject _localVariable_4 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_5 = isApplicableMatch.getObject("v");
		EObject _localVariable_6 = isApplicableMatch.getObject("w");
		EObject tmpZ = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpI = _localVariable_3;
		EObject tmpW2i = _localVariable_4;
		EObject tmpV = _localVariable_5;
		EObject tmpW = _localVariable_6;
		if (tmpZ instanceof Branch) {
			Branch z = (Branch) tmpZ;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpY instanceof Command) {
					Command y = (Command) tmpY;
					if (tmpI instanceof Branch) {
						Branch i = (Branch) tmpI;
						if (tmpW2i instanceof S2B) {
							S2B w2i = (S2B) tmpW2i;
							if (tmpV instanceof Command) {
								Command v = (Command) tmpV;
								if (tmpW instanceof While) {
									While w = (While) tmpW;
									return new Object[] { z, x, y, i, w2i, v, w, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_11_1_performtransformation_blackBBBBBBBFBB(Branch z,
			Branch x, Command y, Branch i, S2B w2i, Command v, While w, whilelul2branchbub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					if (!v.equals(y)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { z, x, y, i, w2i, v, w, csp, _this, isApplicableMatch };
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
			Branch z = (Branch) result_pattern_whilelul2branchbub_11_1_performtransformation_binding[0];
			Branch x = (Branch) result_pattern_whilelul2branchbub_11_1_performtransformation_binding[1];
			Command y = (Command) result_pattern_whilelul2branchbub_11_1_performtransformation_binding[2];
			Branch i = (Branch) result_pattern_whilelul2branchbub_11_1_performtransformation_binding[3];
			S2B w2i = (S2B) result_pattern_whilelul2branchbub_11_1_performtransformation_binding[4];
			Command v = (Command) result_pattern_whilelul2branchbub_11_1_performtransformation_binding[5];
			While w = (While) result_pattern_whilelul2branchbub_11_1_performtransformation_binding[6];

			Object[] result_pattern_whilelul2branchbub_11_1_performtransformation_black = pattern_whilelul2branchbub_11_1_performtransformation_blackBBBBBBBFBB(
					z, x, y, i, w2i, v, w, _this, isApplicableMatch);
			if (result_pattern_whilelul2branchbub_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whilelul2branchbub_11_1_performtransformation_black[7];

				return new Object[] { z, x, y, i, w2i, v, w, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_11_1_performtransformation_greenFFBFBFBFBFBFF(Branch z,
			Branch x, Command y, Command v, While w) {
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment d = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		b2y.setTarget(y);
		d2v.setTarget(v);
		w.setNext(c);
		w.setFirst(a);
		c.setLast(d);
		d2v.setSource(d);
		c.setFirst(d);
		c2z.setTarget(z);
		c2z.setSource(c);
		a2x.setSource(a);
		a2x.setTarget(x);
		b2y.setSource(b);
		a.setLast(b);
		return new Object[] { b2y, d2v, z, c, x, a, y, d, v, c2z, w, a2x, b };
	}

	public static final Object[] pattern_whilelul2branchbub_11_2_collecttranslatedelements_blackBBBBBBBBBBBB(S2N b2y,
			S2N d2v, Branch z, While c, Branch x, While a, Command y, Assignment d, Command v, S2B c2z, S2B a2x,
			Assignment b) {
		if (!b2y.equals(d2v)) {
			if (!x.equals(z)) {
				if (!a.equals(c)) {
					if (!v.equals(y)) {
						if (!a2x.equals(c2z)) {
							if (!b.equals(d)) {
								return new Object[] { b2y, d2v, z, c, x, a, y, d, v, c2z, a2x, b };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_11_2_collecttranslatedelements_greenFBBBBBBBBBBBB(S2N b2y,
			S2N d2v, Branch z, While c, Branch x, While a, Command y, Assignment d, Command v, S2B c2z, S2B a2x,
			Assignment b) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(d2v);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedElements().add(d);
		ruleresult.getTranslatedElements().add(v);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(b);
		return new Object[] { ruleresult, b2y, d2v, z, c, x, a, y, d, v, c2z, a2x, b };
	}

	public static final Object[] pattern_whilelul2branchbub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject b2y, EObject d2v, EObject z, EObject c, EObject x, EObject a,
			EObject y, EObject d, EObject i, EObject w2i, EObject v, EObject c2z, EObject w, EObject a2x, EObject b) {
		if (!b2y.equals(d2v)) {
			if (!b2y.equals(z)) {
				if (!b2y.equals(c)) {
					if (!b2y.equals(x)) {
						if (!b2y.equals(y)) {
							if (!b2y.equals(d)) {
								if (!b2y.equals(i)) {
									if (!b2y.equals(w2i)) {
										if (!b2y.equals(v)) {
											if (!b2y.equals(c2z)) {
												if (!b2y.equals(w)) {
													if (!d2v.equals(z)) {
														if (!d2v.equals(x)) {
															if (!d2v.equals(y)) {
																if (!d2v.equals(i)) {
																	if (!d2v.equals(w2i)) {
																		if (!d2v.equals(v)) {
																			if (!d2v.equals(w)) {
																				if (!c.equals(d2v)) {
																					if (!c.equals(z)) {
																						if (!c.equals(x)) {
																							if (!c.equals(y)) {
																								if (!c.equals(d)) {
																									if (!c.equals(i)) {
																										if (!c.equals(
																												w2i)) {
																											if (!c.equals(
																													v)) {
																												if (!c.equals(
																														c2z)) {
																													if (!c.equals(
																															w)) {
																														if (!x.equals(
																																z)) {
																															if (!x.equals(
																																	y)) {
																																if (!a.equals(
																																		b2y)) {
																																	if (!a.equals(
																																			d2v)) {
																																		if (!a.equals(
																																				z)) {
																																			if (!a.equals(
																																					c)) {
																																				if (!a.equals(
																																						x)) {
																																					if (!a.equals(
																																							y)) {
																																						if (!a.equals(
																																								d)) {
																																							if (!a.equals(
																																									i)) {
																																								if (!a.equals(
																																										w2i)) {
																																									if (!a.equals(
																																											v)) {
																																										if (!a.equals(
																																												c2z)) {
																																											if (!a.equals(
																																													w)) {
																																												if (!a.equals(
																																														a2x)) {
																																													if (!a.equals(
																																															b)) {
																																														if (!y.equals(
																																																z)) {
																																															if (!d.equals(
																																																	d2v)) {
																																																if (!d.equals(
																																																		z)) {
																																																	if (!d.equals(
																																																			x)) {
																																																		if (!d.equals(
																																																				y)) {
																																																			if (!d.equals(
																																																					i)) {
																																																				if (!d.equals(
																																																						w2i)) {
																																																					if (!d.equals(
																																																							v)) {
																																																						if (!d.equals(
																																																								w)) {
																																																							if (!i.equals(
																																																									z)) {
																																																								if (!i.equals(
																																																										x)) {
																																																									if (!i.equals(
																																																											y)) {
																																																										if (!i.equals(
																																																												w2i)) {
																																																											if (!i.equals(
																																																													v)) {
																																																												if (!i.equals(
																																																														w)) {
																																																													if (!w2i.equals(
																																																															z)) {
																																																														if (!w2i.equals(
																																																																x)) {
																																																															if (!w2i.equals(
																																																																	y)) {
																																																																if (!v.equals(
																																																																		z)) {
																																																																	if (!v.equals(
																																																																			x)) {
																																																																		if (!v.equals(
																																																																				y)) {
																																																																			if (!v.equals(
																																																																					w2i)) {
																																																																				if (!v.equals(
																																																																						w)) {
																																																																					if (!c2z.equals(
																																																																							d2v)) {
																																																																						if (!c2z.equals(
																																																																								z)) {
																																																																							if (!c2z.equals(
																																																																									x)) {
																																																																								if (!c2z.equals(
																																																																										y)) {
																																																																									if (!c2z.equals(
																																																																											d)) {
																																																																										if (!c2z.equals(
																																																																												i)) {
																																																																											if (!c2z.equals(
																																																																													w2i)) {
																																																																												if (!c2z.equals(
																																																																														v)) {
																																																																													if (!c2z.equals(
																																																																															w)) {
																																																																														if (!w.equals(
																																																																																z)) {
																																																																															if (!w.equals(
																																																																																	x)) {
																																																																																if (!w.equals(
																																																																																		y)) {
																																																																																	if (!w.equals(
																																																																																			w2i)) {
																																																																																		if (!a2x.equals(
																																																																																				b2y)) {
																																																																																			if (!a2x.equals(
																																																																																					d2v)) {
																																																																																				if (!a2x.equals(
																																																																																						z)) {
																																																																																					if (!a2x.equals(
																																																																																							c)) {
																																																																																						if (!a2x.equals(
																																																																																								x)) {
																																																																																							if (!a2x.equals(
																																																																																									y)) {
																																																																																								if (!a2x.equals(
																																																																																										d)) {
																																																																																									if (!a2x.equals(
																																																																																											i)) {
																																																																																										if (!a2x.equals(
																																																																																												w2i)) {
																																																																																											if (!a2x.equals(
																																																																																													v)) {
																																																																																												if (!a2x.equals(
																																																																																														c2z)) {
																																																																																													if (!a2x.equals(
																																																																																															w)) {
																																																																																														if (!a2x.equals(
																																																																																																b)) {
																																																																																															if (!b.equals(
																																																																																																	b2y)) {
																																																																																																if (!b.equals(
																																																																																																		d2v)) {
																																																																																																	if (!b.equals(
																																																																																																			z)) {
																																																																																																		if (!b.equals(
																																																																																																				c)) {
																																																																																																			if (!b.equals(
																																																																																																					x)) {
																																																																																																				if (!b.equals(
																																																																																																						y)) {
																																																																																																					if (!b.equals(
																																																																																																							d)) {
																																																																																																						if (!b.equals(
																																																																																																								i)) {
																																																																																																							if (!b.equals(
																																																																																																									w2i)) {
																																																																																																								if (!b.equals(
																																																																																																										v)) {
																																																																																																									if (!b.equals(
																																																																																																											c2z)) {
																																																																																																										if (!b.equals(
																																																																																																												w)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													b2y,
																																																																																																													d2v,
																																																																																																													z,
																																																																																																													c,
																																																																																																													x,
																																																																																																													a,
																																																																																																													y,
																																																																																																													d,
																																																																																																													i,
																																																																																																													w2i,
																																																																																																													v,
																																																																																																													c2z,
																																																																																																													w,
																																																																																																													a2x,
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
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject b2y, EObject d2v, EObject z, EObject c, EObject x, EObject a,
			EObject y, EObject d, EObject i, EObject v, EObject c2z, EObject w, EObject a2x, EObject b) {
		EMoflonEdge c__d____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__v____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2v__v____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__d____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whilelul2branchbub";
		String c__d____last_name_prime = "last";
		String b2y__y____target_name_prime = "target";
		String y__x____next_name_prime = "next";
		String d2v__d____source_name_prime = "source";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String z__v____positive_name_prime = "positive";
		String d2v__v____target_name_prime = "target";
		String c2z__z____target_name_prime = "target";
		String c2z__c____source_name_prime = "source";
		String v__z____next_name_prime = "next";
		String c__d____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String a2x__a____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String w__a____first_name_prime = "first";
		String a__b____last_name_prime = "last";
		c__d____last.setSrc(c);
		c__d____last.setTrg(d);
		ruleresult.getCreatedEdges().add(c__d____last);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(y__x____next);
		d2v__d____source.setSrc(d2v);
		d2v__d____source.setTrg(d);
		ruleresult.getCreatedEdges().add(d2v__d____source);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		z__v____positive.setSrc(z);
		z__v____positive.setTrg(v);
		ruleresult.getTranslatedEdges().add(z__v____positive);
		d2v__v____target.setSrc(d2v);
		d2v__v____target.setTrg(v);
		ruleresult.getCreatedEdges().add(d2v__v____target);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		ruleresult.getTranslatedEdges().add(v__z____next);
		c__d____first.setSrc(c);
		c__d____first.setTrg(d);
		ruleresult.getCreatedEdges().add(c__d____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		c__d____last.setName(c__d____last_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		d2v__d____source.setName(d2v__d____source_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		z__v____positive.setName(z__v____positive_name_prime);
		d2v__v____target.setName(d2v__v____target_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		c__d____first.setName(c__d____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		return new Object[] { ruleresult, b2y, d2v, z, c, x, a, y, d, i, v, c2z, w, a2x, b, c__d____last,
				b2y__y____target, y__x____next, d2v__d____source, i__z____negative, i__x____positive, z__v____positive,
				d2v__v____target, c2z__z____target, c2z__c____source, v__z____next, c__d____first, w__c____next,
				a2x__a____source, a2x__x____target, b2y__b____source, w__a____first, a__b____last };
	}

	public static final void pattern_whilelul2branchbub_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			whilelul2branchbub _this, PerformRuleResult ruleresult, EObject b2y, EObject d2v, EObject z, EObject c,
			EObject x, EObject a, EObject y, EObject d, EObject i, EObject w2i, EObject v, EObject c2z, EObject w,
			EObject a2x, EObject b) {
		_this.registerObjects_BWD(ruleresult, b2y, d2v, z, c, x, a, y, d, i, w2i, v, c2z, w, a2x, b);

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
		EObject _localVariable_0 = match.getObject("z");
		EObject _localVariable_1 = match.getObject("x");
		EObject _localVariable_2 = match.getObject("y");
		EObject _localVariable_3 = match.getObject("i");
		EObject _localVariable_4 = match.getObject("v");
		EObject tmpZ = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpI = _localVariable_3;
		EObject tmpV = _localVariable_4;
		if (tmpZ instanceof Branch) {
			Branch z = (Branch) tmpZ;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpY instanceof Command) {
					Command y = (Command) tmpY;
					if (tmpI instanceof Branch) {
						Branch i = (Branch) tmpI;
						if (tmpV instanceof Command) {
							Command v = (Command) tmpV;
							return new Object[] { z, x, y, i, v, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilelul2branchbub_12_2_corematch_blackBBBBFBFB(Branch z, Branch x,
			Command y, Branch i, Command v, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					if (!v.equals(y)) {
						for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class,
								"target")) {
							Statement tmpW = w2i.getSource();
							if (tmpW instanceof While) {
								While w = (While) tmpW;
								_result.add(new Object[] { z, x, y, i, w2i, v, w, match });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilelul2branchbub_12_3_findcontext_blackBBBBBBB(Branch z, Branch x,
			Command y, Branch i, S2B w2i, Command v, While w) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					if (!v.equals(y)) {
						if (x.equals(y.getNext())) {
							if (z.equals(i.getNegative())) {
								if (x.equals(i.getPositive())) {
									if (v.equals(z.getPositive())) {
										if (i.equals(w2i.getTarget())) {
											if (w.equals(w2i.getSource())) {
												if (z.equals(v.getNext())) {
													_result.add(new Object[] { z, x, y, i, w2i, v, w });
												}
											}
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

	public static final Object[] pattern_whilelul2branchbub_12_3_findcontext_greenBBBBBBBFFFFFFFF(Branch z, Branch x,
			Command y, Branch i, S2B w2i, Command v, While w) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__v____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String y__x____next_name_prime = "next";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String z__v____positive_name_prime = "positive";
		String w2i__i____target_name_prime = "target";
		String w2i__w____source_name_prime = "source";
		String v__z____next_name_prime = "next";
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(v);
		isApplicableMatch.getAllContextElements().add(w);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(y__x____next);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		z__v____positive.setSrc(z);
		z__v____positive.setTrg(v);
		isApplicableMatch.getAllContextElements().add(z__v____positive);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		v__z____next.setSrc(v);
		v__z____next.setTrg(z);
		isApplicableMatch.getAllContextElements().add(v__z____next);
		y__x____next.setName(y__x____next_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		z__v____positive.setName(z__v____positive_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		v__z____next.setName(v__z____next_name_prime);
		return new Object[] { z, x, y, i, w2i, v, w, isApplicableMatch, y__x____next, i__z____negative,
				i__x____positive, z__v____positive, w2i__i____target, w2i__w____source, v__z____next };
	}

	public static final Object[] pattern_whilelul2branchbub_12_4_solveCSP_bindingFBBBBBBBBB(whilelul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Branch z, Branch x, Command y, Branch i, S2B w2i, Command v, While w) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, z, x, y, i, w2i, v, w);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, z, x, y, i, w2i, v, w };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilelul2branchbub_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			whilelul2branchbub _this, IsApplicableMatch isApplicableMatch, Branch z, Branch x, Command y, Branch i,
			S2B w2i, Command v, While w) {
		Object[] result_pattern_whilelul2branchbub_12_4_solveCSP_binding = pattern_whilelul2branchbub_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, z, x, y, i, w2i, v, w);
		if (result_pattern_whilelul2branchbub_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilelul2branchbub_12_4_solveCSP_binding[0];

			Object[] result_pattern_whilelul2branchbub_12_4_solveCSP_black = pattern_whilelul2branchbub_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whilelul2branchbub_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, z, x, y, i, w2i, v, w };
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

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_0B(Branch z) {
		for (Graph __DEC_z_root_658718 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_1BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_positive_372556 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_372556)) {
							if (!x.equals(__DEC_z_positive_372556)) {
								if (!i.equals(__DEC_z_positive_372556)) {
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

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_2BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_negative_519272 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_519272)) {
							if (!x.equals(__DEC_z_negative_519272)) {
								if (!i.equals(__DEC_z_negative_519272)) {
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

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_507508 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_4BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_892007 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_892007)) {
							if (!z.equals(__DEC_x_positive_892007)) {
								if (!i.equals(__DEC_x_positive_892007)) {
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

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_5BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_324086 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_324086)) {
							if (!z.equals(__DEC_x_negative_324086)) {
								if (!i.equals(__DEC_x_negative_324086)) {
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

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_6B(Command y) {
		for (Graph __DEC_y_root_22703 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_7BBBB(Command y,
			Branch z, Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_y_positive_677360 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!z.equals(__DEC_y_positive_677360)) {
							if (!x.equals(__DEC_y_positive_677360)) {
								if (!i.equals(__DEC_y_positive_677360)) {
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

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_8BBBB(Command y,
			Branch z, Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_y_negative_255359 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!z.equals(__DEC_y_negative_255359)) {
							if (!x.equals(__DEC_y_negative_255359)) {
								if (!i.equals(__DEC_y_negative_255359)) {
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

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_9B(Command v) {
		for (Graph __DEC_v_root_545187 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(v,
				Graph.class, "root")) {
			return new Object[] { v };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_10BBBB(Command v,
			Branch z, Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_v_positive_77537 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "positive")) {
						if (!z.equals(__DEC_v_positive_77537)) {
							if (!x.equals(__DEC_v_positive_77537)) {
								if (!i.equals(__DEC_v_positive_77537)) {
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

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_11BBBB(Command v,
			Branch z, Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_v_negative_47911 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "negative")) {
						if (!z.equals(__DEC_v_negative_47911)) {
							if (!x.equals(__DEC_v_negative_47911)) {
								if (!i.equals(__DEC_v_negative_47911)) {
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

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_12BB(Branch z,
			Branch x) {
		if (x.equals(z.getPositive())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_13BB(Branch z,
			Branch x) {
		if (x.equals(z.getNegative())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_14BB(Branch z,
			Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_15BB(Branch x,
			Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_16BB(Branch i,
			Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_17BB(Branch z,
			Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_18BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_19BB(Branch i,
			Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_20BB(Branch x,
			Command v) {
		if (v.equals(x.getPositive())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_21BB(Branch i,
			Command v) {
		if (v.equals(i.getPositive())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_22BB(Branch z,
			Command v) {
		if (v.equals(z.getNegative())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_23BB(Branch x,
			Command v) {
		if (v.equals(x.getNegative())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_24BB(Branch i,
			Command v) {
		if (v.equals(i.getNegative())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilelul2branchbub_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpY = _edge_next.getSrc();
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			EObject tmpX = _edge_next.getTrg();
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (x.equals(y.getNext())) {
					if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_6B(y) == null) {
						if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_3B(x) == null) {
							if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_15BB(x, y) == null) {
								if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_18BB(x, y) == null) {
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
																	if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_16BB(
																			i, y) == null) {
																		if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_19BB(
																				i, y) == null) {
																			if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_0B(
																					z) == null) {
																				if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_1BBB(
																						z, x, i) == null) {
																					if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_2BBB(
																							z, x, i) == null) {
																						if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_4BBB(
																								x, z, i) == null) {
																							if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_5BBB(
																									x, z, i) == null) {
																								if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_7BBBB(
																										y, z, x,
																										i) == null) {
																									if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_8BBBB(
																											y, z, x,
																											i) == null) {
																										if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_12BB(
																												z,
																												x) == null) {
																											if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_13BB(
																													z,
																													x) == null) {
																												if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_14BB(
																														z,
																														y) == null) {
																													if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_17BB(
																															z,
																															y) == null) {
																														if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_9B(
																																v) == null) {
																															if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_10BBBB(
																																	v,
																																	z,
																																	x,
																																	i) == null) {
																																if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_11BBBB(
																																		v,
																																		z,
																																		x,
																																		i) == null) {
																																	if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_20BB(
																																			x,
																																			v) == null) {
																																		if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_21BB(
																																				i,
																																				v) == null) {
																																			if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_22BB(
																																					z,
																																					v) == null) {
																																				if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_23BB(
																																						x,
																																						v) == null) {
																																					if (pattern_whilelul2branchbub_20_2_testcorematchandDECs_black_nac_24BB(
																																							i,
																																							v) == null) {
																																						_result.add(
																																								new Object[] {
																																										z,
																																										x,
																																										y,
																																										i,
																																										v,
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

	public static final Object[] pattern_whilelul2branchbub_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whilelul2branchbub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			whilelul2branchbub _this, Match match, Branch z, Branch x, Command y, Branch i, Command v) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, z, x, y, i, v);
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

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_0B(While c) {
		for (Decision __DEC_c_positive_190302 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_1B(While c) {
		for (Decision __DEC_c_negative_809096 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_2BBB(While c, While a,
			While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_first_992262 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "first")) {
						if (!c.equals(__DEC_c_first_992262)) {
							if (!a.equals(__DEC_c_first_992262)) {
								if (!w.equals(__DEC_c_first_992262)) {
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

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_3BBB(While c, While a,
			While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_last_141755 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "last")) {
						if (!c.equals(__DEC_c_last_141755)) {
							if (!a.equals(__DEC_c_last_141755)) {
								if (!w.equals(__DEC_c_last_141755)) {
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

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_4B(While c) {
		for (Program __DEC_c_first_319805 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_5B(While a) {
		for (Decision __DEC_a_positive_715089 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_6B(While a) {
		for (Decision __DEC_a_negative_167183 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_7BBB(While a, While c,
			While w) {
		if (!a.equals(c)) {
			if (!a.equals(w)) {
				if (!c.equals(w)) {
					for (While __DEC_a_last_959312 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, While.class, "last")) {
						if (!a.equals(__DEC_a_last_959312)) {
							if (!c.equals(__DEC_a_last_959312)) {
								if (!w.equals(__DEC_a_last_959312)) {
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

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_8B(While a) {
		for (Program __DEC_a_first_117404 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_9B(Assignment d) {
		for (Decision __DEC_d_positive_483976 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_10B(Assignment d) {
		for (Decision __DEC_d_negative_205147 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_11BBBB(Assignment d,
			While c, While a, While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_d_last_531273 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "last")) {
						if (!c.equals(__DEC_d_last_531273)) {
							if (!a.equals(__DEC_d_last_531273)) {
								if (!w.equals(__DEC_d_last_531273)) {
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

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_12B(Assignment d) {
		for (Program __DEC_d_first_266357 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_13B(Assignment b) {
		for (Decision __DEC_b_positive_804325 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_14B(Assignment b) {
		for (Decision __DEC_b_negative_708347 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_15BBBB(Assignment b,
			While c, While a, While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_b_first_772825 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "first")) {
						if (!c.equals(__DEC_b_first_772825)) {
							if (!a.equals(__DEC_b_first_772825)) {
								if (!w.equals(__DEC_b_first_772825)) {
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

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_16BBBB(Assignment b,
			While c, While a, While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_b_last_10156 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "last")) {
						if (!c.equals(__DEC_b_last_10156)) {
							if (!a.equals(__DEC_b_last_10156)) {
								if (!w.equals(__DEC_b_last_10156)) {
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

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_17B(Assignment b) {
		for (Program __DEC_b_first_464763 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_18BB(While c, While a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_19BB(While a,
			Assignment d) {
		if (d.equals(a.getLast())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_20BB(While w,
			Assignment d) {
		if (d.equals(w.getLast())) {
			return new Object[] { w, d };
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

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_22BB(While a,
			Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_23BB(While w,
			Assignment b) {
		if (b.equals(w.getFirst())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_24BB(While c,
			Assignment b) {
		if (b.equals(c.getLast())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_25BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
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
						if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_0B(c) == null) {
							if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_1B(c) == null) {
								if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_4B(c) == null) {
									if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_9B(d) == null) {
										if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_10B(
												d) == null) {
											if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_12B(
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
																				if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_20BB(
																						w, d) == null) {
																					if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_2BBB(
																							c, a, w) == null) {
																						if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_3BBB(
																								c, a, w) == null) {
																							if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_5B(
																									a) == null) {
																								if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_6B(
																										a) == null) {
																									if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_7BBB(
																											a, c,
																											w) == null) {
																										if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_8B(
																												a) == null) {
																											if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_11BBBB(
																													d,
																													c,
																													a,
																													w) == null) {
																												if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_18BB(
																														c,
																														a) == null) {
																													if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_19BB(
																															a,
																															d) == null) {
																														if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_13B(
																																b) == null) {
																															if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_14B(
																																	b) == null) {
																																if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_15BBBB(
																																		b,
																																		c,
																																		a,
																																		w) == null) {
																																	if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_16BBBB(
																																			b,
																																			c,
																																			a,
																																			w) == null) {
																																		if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_17B(
																																				b) == null) {
																																			if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_21BB(
																																					c,
																																					b) == null) {
																																				if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_22BB(
																																						a,
																																						b) == null) {
																																					if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_23BB(
																																							w,
																																							b) == null) {
																																						if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_24BB(
																																								c,
																																								b) == null) {
																																							if (pattern_whilelul2branchbub_21_2_testcorematchandDECs_black_nac_25BB(
																																									w,
																																									b) == null) {
																																								_result.add(
																																										new Object[] {
																																												c,
																																												a,
																																												d,
																																												w,
																																												b,
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
			whilelul2branchbub _this, Match match, While c, While a, Assignment d, While w, Assignment b) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, c, a, d, w, b);
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
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("z");
		EObject _localVariable_1 = sourceMatch.getObject("c");
		EObject _localVariable_2 = targetMatch.getObject("x");
		EObject _localVariable_3 = sourceMatch.getObject("a");
		EObject _localVariable_4 = targetMatch.getObject("y");
		EObject _localVariable_5 = sourceMatch.getObject("d");
		EObject _localVariable_6 = targetMatch.getObject("i");
		EObject _localVariable_7 = targetMatch.getObject("v");
		EObject _localVariable_8 = sourceMatch.getObject("w");
		EObject _localVariable_9 = sourceMatch.getObject("b");
		EObject tmpZ = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpX = _localVariable_2;
		EObject tmpA = _localVariable_3;
		EObject tmpY = _localVariable_4;
		EObject tmpD = _localVariable_5;
		EObject tmpI = _localVariable_6;
		EObject tmpV = _localVariable_7;
		EObject tmpW = _localVariable_8;
		EObject tmpB = _localVariable_9;
		if (tmpZ instanceof Branch) {
			Branch z = (Branch) tmpZ;
			if (tmpC instanceof While) {
				While c = (While) tmpC;
				if (tmpX instanceof Branch) {
					Branch x = (Branch) tmpX;
					if (tmpA instanceof While) {
						While a = (While) tmpA;
						if (tmpY instanceof Command) {
							Command y = (Command) tmpY;
							if (tmpD instanceof Assignment) {
								Assignment d = (Assignment) tmpD;
								if (tmpI instanceof Branch) {
									Branch i = (Branch) tmpI;
									if (tmpV instanceof Command) {
										Command v = (Command) tmpV;
										if (tmpW instanceof While) {
											While w = (While) tmpW;
											if (tmpB instanceof Assignment) {
												Assignment b = (Assignment) tmpB;
												return new Object[] { z, c, x, a, y, d, i, v, w, b, targetMatch,
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

	public static final Object[] pattern_whilelul2branchbub_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(Branch z, While c,
			Branch x, While a, Command y, Assignment d, Branch i, Command v, While w, Assignment b, Match sourceMatch,
			Match targetMatch) {
		if (!c.equals(w)) {
			if (!x.equals(z)) {
				if (!a.equals(c)) {
					if (!a.equals(w)) {
						if (!i.equals(z)) {
							if (!i.equals(x)) {
								if (!v.equals(y)) {
									if (!b.equals(d)) {
										if (!sourceMatch.equals(targetMatch)) {
											return new Object[] { z, c, x, a, y, d, i, v, w, b, sourceMatch,
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
				targetMatch, sourceMatch);
		if (result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_binding != null) {
			Branch z = (Branch) result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_binding[0];
			While c = (While) result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_binding[1];
			Branch x = (Branch) result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_binding[2];
			While a = (While) result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_binding[3];
			Command y = (Command) result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_binding[4];
			Assignment d = (Assignment) result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_binding[5];
			Branch i = (Branch) result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_binding[6];
			Command v = (Command) result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_binding[7];
			While w = (While) result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_binding[8];
			Assignment b = (Assignment) result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_black = pattern_whilelul2branchbub_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					z, c, x, a, y, d, i, v, w, b, sourceMatch, targetMatch);
			if (result_pattern_whilelul2branchbub_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { z, c, x, a, y, d, i, v, w, b, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
			whilelul2branchbub _this, Branch z, While c, Branch x, While a, Command y, Assignment d, Branch i,
			Command v, While w, Assignment b, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(z, c, x, a, y, d, i, v, w, b, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, z, c, x, a, y, d, i, v, w, b, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilelul2branchbub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			whilelul2branchbub _this, Branch z, While c, Branch x, While a, Command y, Assignment d, Branch i,
			Command v, While w, Assignment b, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whilelul2branchbub_24_3_solvecsp_binding = pattern_whilelul2branchbub_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, z, c, x, a, y, d, i, v, w, b, sourceMatch, targetMatch);
		if (result_pattern_whilelul2branchbub_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whilelul2branchbub_24_3_solvecsp_binding[0];

			Object[] result_pattern_whilelul2branchbub_24_3_solvecsp_black = pattern_whilelul2branchbub_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whilelul2branchbub_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, z, c, x, a, y, d, i, v, w, b, sourceMatch, targetMatch };
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

	public static final Object[] pattern_whilelul2branchbub_24_6_createcorrespondence_blackBBBBBBBBBBB(Branch z,
			While c, Branch x, While a, Command y, Assignment d, Branch i, Command v, While w, Assignment b,
			CCMatch ccMatch) {
		if (!c.equals(w)) {
			if (!x.equals(z)) {
				if (!a.equals(c)) {
					if (!a.equals(w)) {
						if (!i.equals(z)) {
							if (!i.equals(x)) {
								if (!v.equals(y)) {
									if (!b.equals(d)) {
										return new Object[] { z, c, x, a, y, d, i, v, w, b, ccMatch };
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

	public static final Object[] pattern_whilelul2branchbub_24_6_createcorrespondence_greenFFBBBBBBBFFBB(Branch z,
			While c, Branch x, While a, Command y, Assignment d, Command v, Assignment b, CCMatch ccMatch) {
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		d2v.setSource(d);
		d2v.setTarget(v);
		ccMatch.getCreateCorr().add(d2v);
		c2z.setTarget(z);
		c2z.setSource(c);
		ccMatch.getCreateCorr().add(c2z);
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { b2y, d2v, z, c, x, a, y, d, v, c2z, a2x, b, ccMatch };
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

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_0B(While c) {
		for (Decision __DEC_c_positive_57191 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_1B(While c) {
		for (Decision __DEC_c_negative_513408 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_2BBB(While c, While a,
			While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_first_629514 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "first")) {
						if (!c.equals(__DEC_c_first_629514)) {
							if (!a.equals(__DEC_c_first_629514)) {
								if (!w.equals(__DEC_c_first_629514)) {
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

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_3BBB(While c, While a,
			While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_c_last_340469 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(c, While.class, "last")) {
						if (!c.equals(__DEC_c_last_340469)) {
							if (!a.equals(__DEC_c_last_340469)) {
								if (!w.equals(__DEC_c_last_340469)) {
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

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_4B(While c) {
		for (Program __DEC_c_first_594485 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_5B(While a) {
		for (Decision __DEC_a_positive_560205 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_6B(While a) {
		for (Decision __DEC_a_negative_294201 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_7BBB(While a, While c,
			While w) {
		if (!a.equals(c)) {
			if (!a.equals(w)) {
				if (!c.equals(w)) {
					for (While __DEC_a_last_647864 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(a, While.class, "last")) {
						if (!a.equals(__DEC_a_last_647864)) {
							if (!c.equals(__DEC_a_last_647864)) {
								if (!w.equals(__DEC_a_last_647864)) {
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

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_8B(While a) {
		for (Program __DEC_a_first_895845 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_9B(Assignment d) {
		for (Decision __DEC_d_positive_198522 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "positive")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_10B(Assignment d) {
		for (Decision __DEC_d_negative_346120 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Decision.class, "negative")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_11BBBB(Assignment d, While c,
			While a, While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_d_last_749688 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(d, While.class, "last")) {
						if (!c.equals(__DEC_d_last_749688)) {
							if (!a.equals(__DEC_d_last_749688)) {
								if (!w.equals(__DEC_d_last_749688)) {
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

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_12B(Assignment d) {
		for (Program __DEC_d_first_130668 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d,
				Program.class, "first")) {
			return new Object[] { d };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_13B(Assignment b) {
		for (Decision __DEC_b_positive_757316 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_14B(Assignment b) {
		for (Decision __DEC_b_negative_440039 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_15BBBB(Assignment b, While c,
			While a, While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_b_first_364498 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "first")) {
						if (!c.equals(__DEC_b_first_364498)) {
							if (!a.equals(__DEC_b_first_364498)) {
								if (!w.equals(__DEC_b_first_364498)) {
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

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_16BBBB(Assignment b, While c,
			While a, While w) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					for (While __DEC_b_last_929982 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(b, While.class, "last")) {
						if (!c.equals(__DEC_b_last_929982)) {
							if (!a.equals(__DEC_b_last_929982)) {
								if (!w.equals(__DEC_b_last_929982)) {
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

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_17B(Assignment b) {
		for (Program __DEC_b_first_867692 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_18BB(While c, While a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_19BB(While a, Assignment d) {
		if (d.equals(a.getLast())) {
			return new Object[] { a, d };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_20BB(While w, Assignment d) {
		if (d.equals(w.getLast())) {
			return new Object[] { w, d };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_21BB(While c, Assignment b) {
		if (b.equals(c.getFirst())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_22BB(While a, Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_23BB(While w, Assignment b) {
		if (b.equals(w.getFirst())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_24BB(While c, Assignment b) {
		if (b.equals(c.getLast())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_25BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_27_1_matchtggpattern_blackBBBBB(While c, While a,
			Assignment d, While w, Assignment b) {
		if (!c.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w)) {
					if (!b.equals(d)) {
						if (d.equals(c.getLast())) {
							if (d.equals(c.getFirst())) {
								if (c.equals(w.getNext())) {
									if (a.equals(w.getFirst())) {
										if (b.equals(a.getLast())) {
											if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_0B(
													c) == null) {
												if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_1B(
														c) == null) {
													if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_2BBB(
															c, a, w) == null) {
														if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_3BBB(
																c, a, w) == null) {
															if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_4B(
																	c) == null) {
																if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_5B(
																		a) == null) {
																	if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_6B(
																			a) == null) {
																		if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_7BBB(
																				a, c, w) == null) {
																			if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_8B(
																					a) == null) {
																				if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_9B(
																						d) == null) {
																					if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_10B(
																							d) == null) {
																						if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_11BBBB(
																								d, c, a, w) == null) {
																							if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_12B(
																									d) == null) {
																								if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_13B(
																										b) == null) {
																									if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_14B(
																											b) == null) {
																										if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_15BBBB(
																												b, c, a,
																												w) == null) {
																											if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_16BBBB(
																													b,
																													c,
																													a,
																													w) == null) {
																												if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_17B(
																														b) == null) {
																													if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_18BB(
																															c,
																															a) == null) {
																														if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_19BB(
																																a,
																																d) == null) {
																															if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_20BB(
																																	w,
																																	d) == null) {
																																if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_21BB(
																																		c,
																																		b) == null) {
																																	if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_22BB(
																																			a,
																																			b) == null) {
																																		if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_23BB(
																																				w,
																																				b) == null) {
																																			if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_24BB(
																																					c,
																																					b) == null) {
																																				if (pattern_whilelul2branchbub_27_1_matchtggpattern_black_nac_25BB(
																																						w,
																																						b) == null) {
																																					return new Object[] {
																																							c,
																																							a,
																																							d,
																																							w,
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

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_0B(Branch z) {
		for (Graph __DEC_z_root_1945 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_1BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_positive_908378 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_908378)) {
							if (!x.equals(__DEC_z_positive_908378)) {
								if (!i.equals(__DEC_z_positive_908378)) {
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

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_2BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_negative_459790 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_459790)) {
							if (!x.equals(__DEC_z_negative_459790)) {
								if (!i.equals(__DEC_z_negative_459790)) {
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

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_102695 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_4BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_951411 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_951411)) {
							if (!z.equals(__DEC_x_positive_951411)) {
								if (!i.equals(__DEC_x_positive_951411)) {
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

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_5BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_787522 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_787522)) {
							if (!z.equals(__DEC_x_negative_787522)) {
								if (!i.equals(__DEC_x_negative_787522)) {
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

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_6B(Command y) {
		for (Graph __DEC_y_root_850570 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_7BBBB(Command y, Branch z,
			Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_y_positive_794103 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!z.equals(__DEC_y_positive_794103)) {
							if (!x.equals(__DEC_y_positive_794103)) {
								if (!i.equals(__DEC_y_positive_794103)) {
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

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_8BBBB(Command y, Branch z,
			Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_y_negative_136707 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!z.equals(__DEC_y_negative_136707)) {
							if (!x.equals(__DEC_y_negative_136707)) {
								if (!i.equals(__DEC_y_negative_136707)) {
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

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_9B(Command v) {
		for (Graph __DEC_v_root_160564 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(v,
				Graph.class, "root")) {
			return new Object[] { v };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_10BBBB(Command v, Branch z,
			Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_v_positive_491276 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "positive")) {
						if (!z.equals(__DEC_v_positive_491276)) {
							if (!x.equals(__DEC_v_positive_491276)) {
								if (!i.equals(__DEC_v_positive_491276)) {
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

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_11BBBB(Command v, Branch z,
			Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_v_negative_729127 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(v, Branch.class, "negative")) {
						if (!z.equals(__DEC_v_negative_729127)) {
							if (!x.equals(__DEC_v_negative_729127)) {
								if (!i.equals(__DEC_v_negative_729127)) {
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

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_12BB(Branch z, Branch x) {
		if (x.equals(z.getPositive())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_13BB(Branch z, Branch x) {
		if (x.equals(z.getNegative())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_14BB(Branch z, Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_15BB(Branch x, Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_16BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_17BB(Branch z, Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_18BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_19BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_20BB(Branch x, Command v) {
		if (v.equals(x.getPositive())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_21BB(Branch i, Command v) {
		if (v.equals(i.getPositive())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_22BB(Branch z, Command v) {
		if (v.equals(z.getNegative())) {
			return new Object[] { z, v };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_23BB(Branch x, Command v) {
		if (v.equals(x.getNegative())) {
			return new Object[] { x, v };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_24BB(Branch i, Command v) {
		if (v.equals(i.getNegative())) {
			return new Object[] { i, v };
		}
		return null;
	}

	public static final Object[] pattern_whilelul2branchbub_28_1_matchtggpattern_blackBBBBB(Branch z, Branch x,
			Command y, Branch i, Command v) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					if (!v.equals(y)) {
						if (x.equals(y.getNext())) {
							if (z.equals(i.getNegative())) {
								if (x.equals(i.getPositive())) {
									if (v.equals(z.getPositive())) {
										if (z.equals(v.getNext())) {
											if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_0B(
													z) == null) {
												if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_1BBB(z, x,
														i) == null) {
													if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_2BBB(
															z, x, i) == null) {
														if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_3B(
																x) == null) {
															if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_4BBB(
																	x, z, i) == null) {
																if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_5BBB(
																		x, z, i) == null) {
																	if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_6B(
																			y) == null) {
																		if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_7BBBB(
																				y, z, x, i) == null) {
																			if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_8BBBB(
																					y, z, x, i) == null) {
																				if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_9B(
																						v) == null) {
																					if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_10BBBB(
																							v, z, x, i) == null) {
																						if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_11BBBB(
																								v, z, x, i) == null) {
																							if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_12BB(
																									z, x) == null) {
																								if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_13BB(
																										z, x) == null) {
																									if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_14BB(
																											z,
																											y) == null) {
																										if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_15BB(
																												x,
																												y) == null) {
																											if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_16BB(
																													i,
																													y) == null) {
																												if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_17BB(
																														z,
																														y) == null) {
																													if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_18BB(
																															x,
																															y) == null) {
																														if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_19BB(
																																i,
																																y) == null) {
																															if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_20BB(
																																	x,
																																	v) == null) {
																																if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_21BB(
																																		i,
																																		v) == null) {
																																	if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_22BB(
																																			z,
																																			v) == null) {
																																		if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_23BB(
																																				x,
																																				v) == null) {
																																			if (pattern_whilelul2branchbub_28_1_matchtggpattern_black_nac_24BB(
																																					i,
																																					v) == null) {
																																				return new Object[] {
																																						z,
																																						x,
																																						y,
																																						i,
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

	public static final Object[] pattern_whilelul2branchbub_29_6_perform_greenFFFFFFFFBFFBFFB(Branch i, While w,
			ModelgeneratorRuleResult ruleResult) {
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N d2v = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Assignment d = SourcecodeFactory.eINSTANCE.createAssignment();
		Command v = ControlflowFactory.eINSTANCE.createCommand();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(b2y);
		ruleResult.getCorrObjects().add(d2v);
		i.setNegative(z);
		ruleResult.getTargetObjects().add(z);
		w.setNext(c);
		ruleResult.getSourceObjects().add(c);
		i.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		w.setFirst(a);
		ruleResult.getSourceObjects().add(a);
		b2y.setTarget(y);
		y.setNext(x);
		ruleResult.getTargetObjects().add(y);
		c.setLast(d);
		d2v.setSource(d);
		c.setFirst(d);
		ruleResult.getSourceObjects().add(d);
		z.setPositive(v);
		d2v.setTarget(v);
		v.setNext(z);
		ruleResult.getTargetObjects().add(v);
		c2z.setTarget(z);
		c2z.setSource(c);
		ruleResult.getCorrObjects().add(c2z);
		a2x.setSource(a);
		a2x.setTarget(x);
		ruleResult.getCorrObjects().add(a2x);
		b2y.setSource(b);
		a.setLast(b);
		ruleResult.getSourceObjects().add(b);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { b2y, d2v, z, c, x, a, y, d, i, v, c2z, w, a2x, b, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whilelul2branchbub_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whilelul2branchbubImpl
