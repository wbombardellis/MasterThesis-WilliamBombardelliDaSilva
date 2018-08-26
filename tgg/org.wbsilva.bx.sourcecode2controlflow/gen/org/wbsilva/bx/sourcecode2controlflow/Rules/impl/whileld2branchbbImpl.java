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
import org.wbsilva.bx.sourcecode2controlflow.Rules.whileld2branchbb;

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
 * An implementation of the model object '<em><b>whileld2branchbb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class whileld2branchbbImpl extends AbstractRuleImpl implements whileld2branchbb {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected whileld2branchbbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getwhileld2branchbb();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Decision c, While w, Assignment b, While a) {

		Object[] result1_black = whileld2branchbbImpl.pattern_whileld2branchbb_0_1_initialbindings_blackBBBBBB(this,
				match, c, w, b, a);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[w] = " + w + ", " + "[b] = " + b + ", "
					+ "[a] = " + a + ".");
		}

		Object[] result2_bindingAndBlack = whileld2branchbbImpl
				.pattern_whileld2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, c, w, b, a);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[w] = " + w + ", " + "[b] = " + b + ", "
					+ "[a] = " + a + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileld2branchbbImpl.pattern_whileld2branchbb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileld2branchbbImpl
					.pattern_whileld2branchbb_0_4_collectelementstobetranslated_blackBBBBB(match, c, w, b, a);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[a] = " + a + ".");
			}
			whileld2branchbbImpl.pattern_whileld2branchbb_0_4_collectelementstobetranslated_greenBBBBBFFF(match, c, w,
					b, a);
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[7];

			Object[] result5_black = whileld2branchbbImpl
					.pattern_whileld2branchbb_0_5_collectcontextelements_blackBBBBB(match, c, w, b, a);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[a] = " + a + ".");
			}
			whileld2branchbbImpl.pattern_whileld2branchbb_0_5_collectcontextelements_greenBB(match, w);

			// 
			whileld2branchbbImpl.pattern_whileld2branchbb_0_6_registerobjectstomatch_expressionBBBBBB(this, match, c, w,
					b, a);
			return whileld2branchbbImpl.pattern_whileld2branchbb_0_7_expressionF();
		} else {
			return whileld2branchbbImpl.pattern_whileld2branchbb_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whileld2branchbbImpl
				.pattern_whileld2branchbb_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		S2B w2i = (S2B) result1_bindingAndBlack[0];
		Decision c = (Decision) result1_bindingAndBlack[1];
		While w = (While) result1_bindingAndBlack[2];
		Assignment b = (Assignment) result1_bindingAndBlack[3];
		Branch i = (Branch) result1_bindingAndBlack[4];
		While a = (While) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whileld2branchbbImpl
				.pattern_whileld2branchbb_1_1_performtransformation_greenFFBFFBFBFB(c, b, i, a);
		Branch x = (Branch) result1_green[0];
		S2B a2x = (S2B) result1_green[1];
		S2N b2y = (S2N) result1_green[3];
		Command y = (Command) result1_green[4];
		S2B c2z = (S2B) result1_green[6];
		Branch z = (Branch) result1_green[8];

		Object[] result2_black = whileld2branchbbImpl
				.pattern_whileld2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBB(x, a2x, c, b2y, y, b, c2z, z, a);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[x] = " + x + ", " + "[a2x] = "
					+ a2x + ", " + "[c] = " + c + ", " + "[b2y] = " + b2y + ", " + "[y] = " + y + ", " + "[b] = " + b
					+ ", " + "[c2z] = " + c2z + ", " + "[z] = " + z + ", " + "[a] = " + a + ".");
		}
		Object[] result2_green = whileld2branchbbImpl
				.pattern_whileld2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBB(x, a2x, c, b2y, y, b, c2z, z,
						a);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileld2branchbbImpl
				.pattern_whileld2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, x, a2x, w2i, c, b2y, y,
						w, b, c2z, i, z, a);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[x] = " + x + ", " + "[a2x] = " + a2x + ", " + "[w2i] = " + w2i + ", " + "[c] = " + c
					+ ", " + "[b2y] = " + b2y + ", " + "[y] = " + y + ", " + "[w] = " + w + ", " + "[b] = " + b + ", "
					+ "[c2z] = " + c2z + ", " + "[i] = " + i + ", " + "[z] = " + z + ", " + "[a] = " + a + ".");
		}
		whileld2branchbbImpl.pattern_whileld2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult,
				x, a2x, c, b2y, y, w, b, c2z, i, z, a);
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[23];

		// 
		// 
		whileld2branchbbImpl.pattern_whileld2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, x,
				a2x, w2i, c, b2y, y, w, b, c2z, i, z, a);
		return whileld2branchbbImpl.pattern_whileld2branchbb_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = whileld2branchbbImpl
				.pattern_whileld2branchbb_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whileld2branchbbImpl
				.pattern_whileld2branchbb_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whileld2branchbbImpl.pattern_whileld2branchbb_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Decision c = (Decision) result2_binding[0];
		While w = (While) result2_binding[1];
		Assignment b = (Assignment) result2_binding[2];
		While a = (While) result2_binding[3];
		for (Object[] result2_black : whileld2branchbbImpl.pattern_whileld2branchbb_2_2_corematch_blackFBBBFBB(c, w, b,
				a, match)) {
			S2B w2i = (S2B) result2_black[0];
			Branch i = (Branch) result2_black[4];
			// ForEach 
			for (Object[] result3_black : whileld2branchbbImpl.pattern_whileld2branchbb_2_3_findcontext_blackBBBBBB(w2i,
					c, w, b, i, a)) {
				Object[] result3_green = whileld2branchbbImpl
						.pattern_whileld2branchbb_2_3_findcontext_greenBBBBBBFFFFFF(w2i, c, w, b, i, a);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = whileld2branchbbImpl
						.pattern_whileld2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, w2i, c,
								w, b, i, a);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w2i] = " + w2i + ", " + "[c] = "
							+ c + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[i] = " + i + ", " + "[a] = " + a
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whileld2branchbbImpl.pattern_whileld2branchbb_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whileld2branchbbImpl
							.pattern_whileld2branchbb_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whileld2branchbbImpl.pattern_whileld2branchbb_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whileld2branchbbImpl.pattern_whileld2branchbb_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Decision c, While w, Assignment b, While a) {
		match.registerObject("c", c);
		match.registerObject("w", w);
		match.registerObject("b", b);
		match.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Decision c, While w, Assignment b, While a) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, S2B w2i, Decision c, While w,
			Assignment b, Branch i, While a) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("i", i);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject x, EObject a2x, EObject w2i, EObject c,
			EObject b2y, EObject y, EObject w, EObject b, EObject c2z, EObject i, EObject z, EObject a) {
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.Decision.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch x, Command y, Branch i, Branch z) {

		Object[] result1_black = whileld2branchbbImpl.pattern_whileld2branchbb_10_1_initialbindings_blackBBBBBB(this,
				match, x, y, i, z);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[i] = " + i + ", "
					+ "[z] = " + z + ".");
		}

		Object[] result2_bindingAndBlack = whileld2branchbbImpl
				.pattern_whileld2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, x, y, i, z);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[i] = " + i + ", "
					+ "[z] = " + z + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileld2branchbbImpl.pattern_whileld2branchbb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileld2branchbbImpl
					.pattern_whileld2branchbb_10_4_collectelementstobetranslated_blackBBBBB(match, x, y, i, z);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[y] = " + y + ", " + "[i] = " + i + ", " + "[z] = " + z + ".");
			}
			whileld2branchbbImpl.pattern_whileld2branchbb_10_4_collectelementstobetranslated_greenBBBBBFFF(match, x, y,
					i, z);
			//nothing EMoflonEdge y__x____next = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[7];

			Object[] result5_black = whileld2branchbbImpl
					.pattern_whileld2branchbb_10_5_collectcontextelements_blackBBBBB(match, x, y, i, z);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[y] = " + y + ", " + "[i] = " + i + ", " + "[z] = " + z + ".");
			}
			whileld2branchbbImpl.pattern_whileld2branchbb_10_5_collectcontextelements_greenBB(match, i);

			// 
			whileld2branchbbImpl.pattern_whileld2branchbb_10_6_registerobjectstomatch_expressionBBBBBB(this, match, x,
					y, i, z);
			return whileld2branchbbImpl.pattern_whileld2branchbb_10_7_expressionF();
		} else {
			return whileld2branchbbImpl.pattern_whileld2branchbb_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whileld2branchbbImpl
				.pattern_whileld2branchbb_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Branch x = (Branch) result1_bindingAndBlack[0];
		S2B w2i = (S2B) result1_bindingAndBlack[1];
		Command y = (Command) result1_bindingAndBlack[2];
		While w = (While) result1_bindingAndBlack[3];
		Branch i = (Branch) result1_bindingAndBlack[4];
		Branch z = (Branch) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whileld2branchbbImpl
				.pattern_whileld2branchbb_11_1_performtransformation_greenBFFFBBFFBF(x, y, w, z);
		S2B a2x = (S2B) result1_green[1];
		Decision c = (Decision) result1_green[2];
		S2N b2y = (S2N) result1_green[3];
		Assignment b = (Assignment) result1_green[6];
		S2B c2z = (S2B) result1_green[7];
		While a = (While) result1_green[9];

		Object[] result2_black = whileld2branchbbImpl
				.pattern_whileld2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBB(x, a2x, c, b2y, y, b, c2z, z,
						a);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[x] = " + x + ", " + "[a2x] = "
					+ a2x + ", " + "[c] = " + c + ", " + "[b2y] = " + b2y + ", " + "[y] = " + y + ", " + "[b] = " + b
					+ ", " + "[c2z] = " + c2z + ", " + "[z] = " + z + ", " + "[a] = " + a + ".");
		}
		Object[] result2_green = whileld2branchbbImpl
				.pattern_whileld2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBB(x, a2x, c, b2y, y, b, c2z, z,
						a);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileld2branchbbImpl
				.pattern_whileld2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, x, a2x, w2i, c, b2y,
						y, w, b, c2z, i, z, a);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[x] = " + x + ", " + "[a2x] = " + a2x + ", " + "[w2i] = " + w2i + ", " + "[c] = " + c
					+ ", " + "[b2y] = " + b2y + ", " + "[y] = " + y + ", " + "[w] = " + w + ", " + "[b] = " + b + ", "
					+ "[c2z] = " + c2z + ", " + "[i] = " + i + ", " + "[z] = " + z + ", " + "[a] = " + a + ".");
		}
		whileld2branchbbImpl.pattern_whileld2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult,
				x, a2x, c, b2y, y, w, b, c2z, i, z, a);
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[23];

		// 
		// 
		whileld2branchbbImpl.pattern_whileld2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, x,
				a2x, w2i, c, b2y, y, w, b, c2z, i, z, a);
		return whileld2branchbbImpl.pattern_whileld2branchbb_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = whileld2branchbbImpl
				.pattern_whileld2branchbb_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whileld2branchbbImpl
				.pattern_whileld2branchbb_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whileld2branchbbImpl.pattern_whileld2branchbb_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Branch x = (Branch) result2_binding[0];
		Command y = (Command) result2_binding[1];
		Branch i = (Branch) result2_binding[2];
		Branch z = (Branch) result2_binding[3];
		for (Object[] result2_black : whileld2branchbbImpl.pattern_whileld2branchbb_12_2_corematch_blackBFBFBBB(x, y, i,
				z, match)) {
			S2B w2i = (S2B) result2_black[1];
			While w = (While) result2_black[3];
			// ForEach 
			for (Object[] result3_black : whileld2branchbbImpl.pattern_whileld2branchbb_12_3_findcontext_blackBBBBBB(x,
					w2i, y, w, i, z)) {
				Object[] result3_green = whileld2branchbbImpl
						.pattern_whileld2branchbb_12_3_findcontext_greenBBBBBBFFFFFF(x, w2i, y, w, i, z);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = whileld2branchbbImpl
						.pattern_whileld2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, x,
								w2i, y, w, i, z);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[x] = " + x + ", " + "[w2i] = "
							+ w2i + ", " + "[y] = " + y + ", " + "[w] = " + w + ", " + "[i] = " + i + ", " + "[z] = "
							+ z + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whileld2branchbbImpl.pattern_whileld2branchbb_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whileld2branchbbImpl
							.pattern_whileld2branchbb_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whileld2branchbbImpl.pattern_whileld2branchbb_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whileld2branchbbImpl.pattern_whileld2branchbb_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Branch x, Command y, Branch i, Branch z) {
		match.registerObject("x", x);
		match.registerObject("y", y);
		match.registerObject("i", i);
		match.registerObject("z", z);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch x, Command y, Branch i, Branch z) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch x, S2B w2i, Command y, While w,
			Branch i, Branch z) {// Create CSP
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
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("i", i);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject x, EObject a2x, EObject w2i, EObject c,
			EObject b2y, EObject y, EObject w, EObject b, EObject c2z, EObject i, EObject z, EObject a) {
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a", a);

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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_135(EMoflonEdge _edge_next) {

		Object[] result1_bindingAndBlack = whileld2branchbbImpl
				.pattern_whileld2branchbb_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whileld2branchbbImpl.pattern_whileld2branchbb_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whileld2branchbbImpl
				.pattern_whileld2branchbb_20_2_testcorematchandDECs_blackFFFFB(_edge_next)) {
			Branch x = (Branch) result2_black[0];
			Command y = (Command) result2_black[1];
			Branch i = (Branch) result2_black[2];
			Branch z = (Branch) result2_black[3];
			Object[] result2_green = whileld2branchbbImpl
					.pattern_whileld2branchbb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileld2branchbbImpl
					.pattern_whileld2branchbb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, x, y, i, z)) {
				// 
				if (whileld2branchbbImpl
						.pattern_whileld2branchbb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = whileld2branchbbImpl
							.pattern_whileld2branchbb_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whileld2branchbbImpl.pattern_whileld2branchbb_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whileld2branchbbImpl.pattern_whileld2branchbb_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_135(EMoflonEdge _edge_next) {

		Object[] result1_bindingAndBlack = whileld2branchbbImpl
				.pattern_whileld2branchbb_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whileld2branchbbImpl.pattern_whileld2branchbb_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whileld2branchbbImpl
				.pattern_whileld2branchbb_21_2_testcorematchandDECs_blackFFFFB(_edge_next)) {
			Decision c = (Decision) result2_black[0];
			While w = (While) result2_black[1];
			Assignment b = (Assignment) result2_black[2];
			While a = (While) result2_black[3];
			Object[] result2_green = whileld2branchbbImpl
					.pattern_whileld2branchbb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileld2branchbbImpl
					.pattern_whileld2branchbb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, c, w, b, a)) {
				// 
				if (whileld2branchbbImpl
						.pattern_whileld2branchbb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = whileld2branchbbImpl
							.pattern_whileld2branchbb_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whileld2branchbbImpl.pattern_whileld2branchbb_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whileld2branchbbImpl.pattern_whileld2branchbb_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("whileld2branchbb");
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
		ruleResult.setRule("whileld2branchbb");
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

		Object[] result1_black = whileld2branchbbImpl.pattern_whileld2branchbb_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whileld2branchbbImpl.pattern_whileld2branchbb_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = whileld2branchbbImpl
				.pattern_whileld2branchbb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Branch x = (Branch) result2_bindingAndBlack[0];
		Decision c = (Decision) result2_bindingAndBlack[1];
		Command y = (Command) result2_bindingAndBlack[2];
		While w = (While) result2_bindingAndBlack[3];
		Assignment b = (Assignment) result2_bindingAndBlack[4];
		Branch i = (Branch) result2_bindingAndBlack[5];
		Branch z = (Branch) result2_bindingAndBlack[6];
		While a = (While) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = whileld2branchbbImpl
				.pattern_whileld2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, x, c, y, w, b, i, z, a,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[x] = " + x + ", " + "[c] = " + c + ", " + "[y] = " + y + ", " + "[w] = " + w + ", " + "[b] = "
					+ b + ", " + "[i] = " + i + ", " + "[z] = " + z + ", " + "[a] = " + a + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whileld2branchbbImpl.pattern_whileld2branchbb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whileld2branchbbImpl
					.pattern_whileld2branchbb_24_5_matchcorrcontext_blackFBBBB(w, i, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[0];
				Object[] result5_green = whileld2branchbbImpl
						.pattern_whileld2branchbb_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whileld2branchbbImpl
						.pattern_whileld2branchbb_24_6_createcorrespondence_blackBBBBBBBBB(x, c, y, w, b, i, z, a,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[x] = " + x + ", "
							+ "[c] = " + c + ", " + "[y] = " + y + ", " + "[w] = " + w + ", " + "[b] = " + b + ", "
							+ "[i] = " + i + ", " + "[z] = " + z + ", " + "[a] = " + a + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				whileld2branchbbImpl.pattern_whileld2branchbb_24_6_createcorrespondence_greenBFBFBBFBBB(x, c, y, b, z,
						a, ccMatch);
				//nothing S2B a2x = (S2B) result6_green[1];
				//nothing S2N b2y = (S2N) result6_green[3];
				//nothing S2B c2z = (S2B) result6_green[6];

				Object[] result7_black = whileld2branchbbImpl
						.pattern_whileld2branchbb_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whileld2branchbbImpl.pattern_whileld2branchbb_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return whileld2branchbbImpl.pattern_whileld2branchbb_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Branch x, Decision c, Command y, While w, Assignment b, Branch i, Branch z,
			While a, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Decision c, While w, Assignment b, While a) {// 
		Object[] result1_black = whileld2branchbbImpl.pattern_whileld2branchbb_27_1_matchtggpattern_blackBBBB(c, w, b,
				a);
		if (result1_black != null) {
			return whileld2branchbbImpl.pattern_whileld2branchbb_27_2_expressionF();
		} else {
			return whileld2branchbbImpl.pattern_whileld2branchbb_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Branch x, Command y, Branch i, Branch z) {// 
		Object[] result1_black = whileld2branchbbImpl.pattern_whileld2branchbb_28_1_matchtggpattern_blackBBBB(x, y, i,
				z);
		if (result1_black != null) {
			return whileld2branchbbImpl.pattern_whileld2branchbb_28_2_expressionF();
		} else {
			return whileld2branchbbImpl.pattern_whileld2branchbb_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B w2iParameter) {

		Object[] result1_black = whileld2branchbbImpl.pattern_whileld2branchbb_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whileld2branchbbImpl.pattern_whileld2branchbb_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : whileld2branchbbImpl
				.pattern_whileld2branchbb_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList w2iList = (RuleEntryList) result2_black[0];
			S2B w2i = (S2B) result2_black[1];
			While w = (While) result2_black[2];
			Branch i = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = whileld2branchbbImpl
					.pattern_whileld2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, w2i, w, i,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w2i] = " + w2i + ", " + "[w] = " + w
						+ ", " + "[i] = " + i + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whileld2branchbbImpl.pattern_whileld2branchbb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whileld2branchbbImpl.pattern_whileld2branchbb_29_5_checknacs_blackBBB(w2i, w,
						i);
				if (result5_black != null) {

					Object[] result6_black = whileld2branchbbImpl.pattern_whileld2branchbb_29_6_perform_blackBBBB(w2i,
							w, i, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w2i] = " + w2i + ", "
								+ "[w] = " + w + ", " + "[i] = " + i + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whileld2branchbbImpl.pattern_whileld2branchbb_29_6_perform_greenFFFFFBFFBFFB(w, i, ruleResult);
					//nothing Branch x = (Branch) result6_green[0];
					//nothing S2B a2x = (S2B) result6_green[1];
					//nothing Decision c = (Decision) result6_green[2];
					//nothing S2N b2y = (S2N) result6_green[3];
					//nothing Command y = (Command) result6_green[4];
					//nothing Assignment b = (Assignment) result6_green[6];
					//nothing S2B c2z = (S2B) result6_green[7];
					//nothing Branch z = (Branch) result6_green[9];
					//nothing While a = (While) result6_green[10];

				} else {
				}

			} else {
			}

		}
		return whileld2branchbbImpl.pattern_whileld2branchbb_29_7_expressionFB(ruleResult);
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
		case RulesPackage.WHILELD2BRANCHBB___IS_APPROPRIATE_FWD__MATCH_DECISION_WHILE_ASSIGNMENT_WHILE:
			return isAppropriate_FWD((Match) arguments.get(0), (Decision) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.WHILELD2BRANCHBB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_DECISION_WHILE_ASSIGNMENT_WHILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Decision) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (While) arguments.get(4));
			return null;
		case RulesPackage.WHILELD2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_DECISION_WHILE_ASSIGNMENT_WHILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Decision) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_S2B_DECISION_WHILE_ASSIGNMENT_BRANCH_WHILE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Decision) arguments.get(2), (While) arguments.get(3), (Assignment) arguments.get(4),
					(Branch) arguments.get(5), (While) arguments.get(6));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.WHILELD2BRANCHBB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPROPRIATE_BWD__MATCH_BRANCH_COMMAND_BRANCH_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.WHILELD2BRANCHBB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_COMMAND_BRANCH_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4));
			return null;
		case RulesPackage.WHILELD2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_COMMAND_BRANCH_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_S2B_COMMAND_WHILE_BRANCH_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (Command) arguments.get(3), (While) arguments.get(4),
					(Branch) arguments.get(5), (Branch) arguments.get(6));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.WHILELD2BRANCHBB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_135__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_135((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_135__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_135((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_CC__BRANCH_DECISION_COMMAND_WHILE_ASSIGNMENT_BRANCH_BRANCH_WHILE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Branch) arguments.get(0), (Decision) arguments.get(1),
					(Command) arguments.get(2), (While) arguments.get(3), (Assignment) arguments.get(4),
					(Branch) arguments.get(5), (Branch) arguments.get(6), (While) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___CHECK_DEC_FWD__DECISION_WHILE_ASSIGNMENT_WHILE:
			return checkDEC_FWD((Decision) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(While) arguments.get(3));
		case RulesPackage.WHILELD2BRANCHBB___CHECK_DEC_BWD__BRANCH_COMMAND_BRANCH_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.WHILELD2BRANCHBB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILELD2BRANCHBB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_WHILE_BRANCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(While) arguments.get(2), (Branch) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILELD2BRANCHBB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whileld2branchbb_0_1_initialbindings_blackBBBBBB(whileld2branchbb _this,
			Match match, Decision c, While w, Assignment b, While a) {
		if (!a.equals(w)) {
			return new Object[] { _this, match, c, w, b, a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_0_2_SolveCSP_bindingFBBBBBB(whileld2branchbb _this,
			Match match, Decision c, While w, Assignment b, While a) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, c, w, b, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, c, w, b, a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileld2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBB(whileld2branchbb _this,
			Match match, Decision c, While w, Assignment b, While a) {
		Object[] result_pattern_whileld2branchbb_0_2_SolveCSP_binding = pattern_whileld2branchbb_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, c, w, b, a);
		if (result_pattern_whileld2branchbb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileld2branchbb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whileld2branchbb_0_2_SolveCSP_black = pattern_whileld2branchbb_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileld2branchbb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, c, w, b, a };
			}
		}
		return null;
	}

	public static final boolean pattern_whileld2branchbb_0_3_CheckCSP_expressionFBB(whileld2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileld2branchbb_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			Decision c, While w, Assignment b, While a) {
		if (!a.equals(w)) {
			return new Object[] { match, c, w, b, a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_0_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			Decision c, While w, Assignment b, While a) {
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(c);
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(a);
		String w__c____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String a__b____last_name_prime = "last";
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____last);
		w__c____next.setName(w__c____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		return new Object[] { match, c, w, b, a, w__c____next, w__a____first, a__b____last };
	}

	public static final Object[] pattern_whileld2branchbb_0_5_collectcontextelements_blackBBBBB(Match match, Decision c,
			While w, Assignment b, While a) {
		if (!a.equals(w)) {
			return new Object[] { match, c, w, b, a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whileld2branchbb_0_6_registerobjectstomatch_expressionBBBBBB(
			whileld2branchbb _this, Match match, Decision c, While w, Assignment b, While a) {
		_this.registerObjectsToMatch_FWD(match, c, w, b, a);

	}

	public static final boolean pattern_whileld2branchbb_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileld2branchbb_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileld2branchbb_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_1 = isApplicableMatch.getObject("c");
		EObject _localVariable_2 = isApplicableMatch.getObject("w");
		EObject _localVariable_3 = isApplicableMatch.getObject("b");
		EObject _localVariable_4 = isApplicableMatch.getObject("i");
		EObject _localVariable_5 = isApplicableMatch.getObject("a");
		EObject tmpW2i = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpB = _localVariable_3;
		EObject tmpI = _localVariable_4;
		EObject tmpA = _localVariable_5;
		if (tmpW2i instanceof S2B) {
			S2B w2i = (S2B) tmpW2i;
			if (tmpC instanceof Decision) {
				Decision c = (Decision) tmpC;
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					if (tmpB instanceof Assignment) {
						Assignment b = (Assignment) tmpB;
						if (tmpI instanceof Branch) {
							Branch i = (Branch) tmpI;
							if (tmpA instanceof While) {
								While a = (While) tmpA;
								return new Object[] { w2i, c, w, b, i, a, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_1_1_performtransformation_blackBBBBBBFBB(S2B w2i, Decision c,
			While w, Assignment b, Branch i, While a, whileld2branchbb _this, IsApplicableMatch isApplicableMatch) {
		if (!a.equals(w)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { w2i, c, w, b, i, a, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			whileld2branchbb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whileld2branchbb_1_1_performtransformation_binding = pattern_whileld2branchbb_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_whileld2branchbb_1_1_performtransformation_binding != null) {
			S2B w2i = (S2B) result_pattern_whileld2branchbb_1_1_performtransformation_binding[0];
			Decision c = (Decision) result_pattern_whileld2branchbb_1_1_performtransformation_binding[1];
			While w = (While) result_pattern_whileld2branchbb_1_1_performtransformation_binding[2];
			Assignment b = (Assignment) result_pattern_whileld2branchbb_1_1_performtransformation_binding[3];
			Branch i = (Branch) result_pattern_whileld2branchbb_1_1_performtransformation_binding[4];
			While a = (While) result_pattern_whileld2branchbb_1_1_performtransformation_binding[5];

			Object[] result_pattern_whileld2branchbb_1_1_performtransformation_black = pattern_whileld2branchbb_1_1_performtransformation_blackBBBBBBFBB(
					w2i, c, w, b, i, a, _this, isApplicableMatch);
			if (result_pattern_whileld2branchbb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileld2branchbb_1_1_performtransformation_black[6];

				return new Object[] { w2i, c, w, b, i, a, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_1_1_performtransformation_greenFFBFFBFBFB(Decision c,
			Assignment b, Branch i, While a) {
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		i.setPositive(x);
		a2x.setTarget(x);
		a2x.setSource(a);
		b2y.setSource(b);
		b2y.setTarget(y);
		y.setNext(x);
		c2z.setSource(c);
		i.setNegative(z);
		c2z.setTarget(z);
		return new Object[] { x, a2x, c, b2y, y, b, c2z, i, z, a };
	}

	public static final Object[] pattern_whileld2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBB(Branch x,
			S2B a2x, Decision c, S2N b2y, Command y, Assignment b, S2B c2z, Branch z, While a) {
		if (!x.equals(z)) {
			if (!a2x.equals(c2z)) {
				return new Object[] { x, a2x, c, b2y, y, b, c2z, z, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBB(Branch x,
			S2B a2x, Decision c, S2N b2y, Command y, Assignment b, S2B c2z, Branch z, While a) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getTranslatedElements().add(a);
		return new Object[] { ruleresult, x, a2x, c, b2y, y, b, c2z, z, a };
	}

	public static final Object[] pattern_whileld2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject x, EObject a2x, EObject w2i, EObject c, EObject b2y, EObject y,
			EObject w, EObject b, EObject c2z, EObject i, EObject z, EObject a) {
		if (!x.equals(y)) {
			if (!x.equals(z)) {
				if (!a2x.equals(x)) {
					if (!a2x.equals(w2i)) {
						if (!a2x.equals(c)) {
							if (!a2x.equals(b2y)) {
								if (!a2x.equals(y)) {
									if (!a2x.equals(w)) {
										if (!a2x.equals(b)) {
											if (!a2x.equals(c2z)) {
												if (!a2x.equals(i)) {
													if (!a2x.equals(z)) {
														if (!w2i.equals(x)) {
															if (!w2i.equals(y)) {
																if (!w2i.equals(z)) {
																	if (!c.equals(x)) {
																		if (!c.equals(w2i)) {
																			if (!c.equals(y)) {
																				if (!c.equals(w)) {
																					if (!c.equals(c2z)) {
																						if (!c.equals(i)) {
																							if (!c.equals(z)) {
																								if (!b2y.equals(x)) {
																									if (!b2y.equals(
																											w2i)) {
																										if (!b2y.equals(
																												c)) {
																											if (!b2y.equals(
																													y)) {
																												if (!b2y.equals(
																														w)) {
																													if (!b2y.equals(
																															c2z)) {
																														if (!b2y.equals(
																																i)) {
																															if (!b2y.equals(
																																	z)) {
																																if (!y.equals(
																																		z)) {
																																	if (!w.equals(
																																			x)) {
																																		if (!w.equals(
																																				w2i)) {
																																			if (!w.equals(
																																					y)) {
																																				if (!w.equals(
																																						z)) {
																																					if (!b.equals(
																																							x)) {
																																						if (!b.equals(
																																								w2i)) {
																																							if (!b.equals(
																																									c)) {
																																								if (!b.equals(
																																										b2y)) {
																																									if (!b.equals(
																																											y)) {
																																										if (!b.equals(
																																												w)) {
																																											if (!b.equals(
																																													c2z)) {
																																												if (!b.equals(
																																														i)) {
																																													if (!b.equals(
																																															z)) {
																																														if (!c2z.equals(
																																																x)) {
																																															if (!c2z.equals(
																																																	w2i)) {
																																																if (!c2z.equals(
																																																		y)) {
																																																	if (!c2z.equals(
																																																			w)) {
																																																		if (!c2z.equals(
																																																				i)) {
																																																			if (!c2z.equals(
																																																					z)) {
																																																				if (!i.equals(
																																																						x)) {
																																																					if (!i.equals(
																																																							w2i)) {
																																																						if (!i.equals(
																																																								y)) {
																																																							if (!i.equals(
																																																									w)) {
																																																								if (!i.equals(
																																																										z)) {
																																																									if (!a.equals(
																																																											x)) {
																																																										if (!a.equals(
																																																												a2x)) {
																																																											if (!a.equals(
																																																													w2i)) {
																																																												if (!a.equals(
																																																														c)) {
																																																													if (!a.equals(
																																																															b2y)) {
																																																														if (!a.equals(
																																																																y)) {
																																																															if (!a.equals(
																																																																	w)) {
																																																																if (!a.equals(
																																																																		b)) {
																																																																	if (!a.equals(
																																																																			c2z)) {
																																																																		if (!a.equals(
																																																																				i)) {
																																																																			if (!a.equals(
																																																																					z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						x,
																																																																						a2x,
																																																																						w2i,
																																																																						c,
																																																																						b2y,
																																																																						y,
																																																																						w,
																																																																						b,
																																																																						c2z,
																																																																						i,
																																																																						z,
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
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject x, EObject a2x, EObject c, EObject b2y, EObject y, EObject w,
			EObject b, EObject c2z, EObject i, EObject z, EObject a) {
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileld2branchbb";
		String a2x__x____target_name_prime = "target";
		String b2y__y____target_name_prime = "target";
		String w__c____next_name_prime = "next";
		String b2y__b____source_name_prime = "source";
		String w__a____first_name_prime = "first";
		String y__x____next_name_prime = "next";
		String c2z__c____source_name_prime = "source";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String a2x__a____source_name_prime = "source";
		String a__b____last_name_prime = "last";
		String c2z__z____target_name_prime = "target";
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(y__x____next);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		return new Object[] { ruleresult, x, a2x, c, b2y, y, w, b, c2z, i, z, a, a2x__x____target, b2y__y____target,
				w__c____next, b2y__b____source, w__a____first, y__x____next, c2z__c____source, i__x____positive,
				i__z____negative, a2x__a____source, a__b____last, c2z__z____target };
	}

	public static final void pattern_whileld2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whileld2branchbb _this, PerformRuleResult ruleresult, EObject x, EObject a2x, EObject w2i, EObject c,
			EObject b2y, EObject y, EObject w, EObject b, EObject c2z, EObject i, EObject z, EObject a) {
		_this.registerObjects_FWD(ruleresult, x, a2x, w2i, c, b2y, y, w, b, c2z, i, z, a);

	}

	public static final PerformRuleResult pattern_whileld2branchbb_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileld2branchbb_2_1_preparereturnvalue_bindingFB(whileld2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_2_1_preparereturnvalue_blackFBB(EClass eClass,
			whileld2branchbb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_2_1_preparereturnvalue_bindingAndBlackFFB(
			whileld2branchbb _this) {
		Object[] result_pattern_whileld2branchbb_2_1_preparereturnvalue_binding = pattern_whileld2branchbb_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileld2branchbb_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whileld2branchbb_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileld2branchbb_2_1_preparereturnvalue_black = pattern_whileld2branchbb_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whileld2branchbb_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whileld2branchbb_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whileld2branchbb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whileld2branchbb_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("c");
		EObject _localVariable_1 = match.getObject("w");
		EObject _localVariable_2 = match.getObject("b");
		EObject _localVariable_3 = match.getObject("a");
		EObject tmpC = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpA = _localVariable_3;
		if (tmpC instanceof Decision) {
			Decision c = (Decision) tmpC;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpB instanceof Assignment) {
					Assignment b = (Assignment) tmpB;
					if (tmpA instanceof While) {
						While a = (While) tmpA;
						return new Object[] { c, w, b, a, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileld2branchbb_2_2_corematch_blackFBBBFBB(Decision c, While w,
			Assignment b, While a, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				Branch i = w2i.getTarget();
				if (i != null) {
					_result.add(new Object[] { w2i, c, w, b, i, a, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileld2branchbb_2_3_findcontext_blackBBBBBB(S2B w2i, Decision c,
			While w, Assignment b, Branch i, While a) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			if (w.equals(w2i.getSource())) {
				if (c.equals(w.getNext())) {
					if (a.equals(w.getFirst())) {
						if (i.equals(w2i.getTarget())) {
							if (b.equals(a.getLast())) {
								_result.add(new Object[] { w2i, c, w, b, i, a });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whileld2branchbb_2_3_findcontext_greenBBBBBBFFFFFF(S2B w2i, Decision c,
			While w, Assignment b, Branch i, While a) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w2i__w____source_name_prime = "source";
		String w__c____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String w2i__i____target_name_prime = "target";
		String a__b____last_name_prime = "last";
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(a);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____last);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		return new Object[] { w2i, c, w, b, i, a, isApplicableMatch, w2i__w____source, w__c____next, w__a____first,
				w2i__i____target, a__b____last };
	}

	public static final Object[] pattern_whileld2branchbb_2_4_solveCSP_bindingFBBBBBBBB(whileld2branchbb _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, Decision c, While w, Assignment b, Branch i, While a) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, w2i, c, w, b, i, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w2i, c, w, b, i, a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileld2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(whileld2branchbb _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, Decision c, While w, Assignment b, Branch i, While a) {
		Object[] result_pattern_whileld2branchbb_2_4_solveCSP_binding = pattern_whileld2branchbb_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, w2i, c, w, b, i, a);
		if (result_pattern_whileld2branchbb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileld2branchbb_2_4_solveCSP_binding[0];

			Object[] result_pattern_whileld2branchbb_2_4_solveCSP_black = pattern_whileld2branchbb_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileld2branchbb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w2i, c, w, b, i, a };
			}
		}
		return null;
	}

	public static final boolean pattern_whileld2branchbb_2_5_checkCSP_expressionFBB(whileld2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileld2branchbb_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whileld2branchbb_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whileld2branchbb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whileld2branchbb_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileld2branchbb_10_1_initialbindings_blackBBBBBB(whileld2branchbb _this,
			Match match, Branch x, Command y, Branch i, Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					return new Object[] { _this, match, x, y, i, z };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_10_2_SolveCSP_bindingFBBBBBB(whileld2branchbb _this,
			Match match, Branch x, Command y, Branch i, Branch z) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, x, y, i, z);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, x, y, i, z };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileld2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBB(whileld2branchbb _this,
			Match match, Branch x, Command y, Branch i, Branch z) {
		Object[] result_pattern_whileld2branchbb_10_2_SolveCSP_binding = pattern_whileld2branchbb_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, x, y, i, z);
		if (result_pattern_whileld2branchbb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileld2branchbb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whileld2branchbb_10_2_SolveCSP_black = pattern_whileld2branchbb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileld2branchbb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, x, y, i, z };
			}
		}
		return null;
	}

	public static final boolean pattern_whileld2branchbb_10_3_CheckCSP_expressionFBB(whileld2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileld2branchbb_10_4_collectelementstobetranslated_blackBBBBB(Match match,
			Branch x, Command y, Branch i, Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					return new Object[] { match, x, y, i, z };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_10_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			Branch x, Command y, Branch i, Branch z) {
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(z);
		String y__x____next_name_prime = "next";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(y__x____next);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		y__x____next.setName(y__x____next_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		return new Object[] { match, x, y, i, z, y__x____next, i__x____positive, i__z____negative };
	}

	public static final Object[] pattern_whileld2branchbb_10_5_collectcontextelements_blackBBBBB(Match match, Branch x,
			Command y, Branch i, Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					return new Object[] { match, x, y, i, z };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_10_5_collectcontextelements_greenBB(Match match, Branch i) {
		match.getContextNodes().add(i);
		return new Object[] { match, i };
	}

	public static final void pattern_whileld2branchbb_10_6_registerobjectstomatch_expressionBBBBBB(
			whileld2branchbb _this, Match match, Branch x, Command y, Branch i, Branch z) {
		_this.registerObjectsToMatch_BWD(match, x, y, i, z);

	}

	public static final boolean pattern_whileld2branchbb_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileld2branchbb_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileld2branchbb_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("x");
		EObject _localVariable_1 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_2 = isApplicableMatch.getObject("y");
		EObject _localVariable_3 = isApplicableMatch.getObject("w");
		EObject _localVariable_4 = isApplicableMatch.getObject("i");
		EObject _localVariable_5 = isApplicableMatch.getObject("z");
		EObject tmpX = _localVariable_0;
		EObject tmpW2i = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpI = _localVariable_4;
		EObject tmpZ = _localVariable_5;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpW2i instanceof S2B) {
				S2B w2i = (S2B) tmpW2i;
				if (tmpY instanceof Command) {
					Command y = (Command) tmpY;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						if (tmpI instanceof Branch) {
							Branch i = (Branch) tmpI;
							if (tmpZ instanceof Branch) {
								Branch z = (Branch) tmpZ;
								return new Object[] { x, w2i, y, w, i, z, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_11_1_performtransformation_blackBBBBBBFBB(Branch x, S2B w2i,
			Command y, While w, Branch i, Branch z, whileld2branchbb _this, IsApplicableMatch isApplicableMatch) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { x, w2i, y, w, i, z, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			whileld2branchbb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whileld2branchbb_11_1_performtransformation_binding = pattern_whileld2branchbb_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_whileld2branchbb_11_1_performtransformation_binding != null) {
			Branch x = (Branch) result_pattern_whileld2branchbb_11_1_performtransformation_binding[0];
			S2B w2i = (S2B) result_pattern_whileld2branchbb_11_1_performtransformation_binding[1];
			Command y = (Command) result_pattern_whileld2branchbb_11_1_performtransformation_binding[2];
			While w = (While) result_pattern_whileld2branchbb_11_1_performtransformation_binding[3];
			Branch i = (Branch) result_pattern_whileld2branchbb_11_1_performtransformation_binding[4];
			Branch z = (Branch) result_pattern_whileld2branchbb_11_1_performtransformation_binding[5];

			Object[] result_pattern_whileld2branchbb_11_1_performtransformation_black = pattern_whileld2branchbb_11_1_performtransformation_blackBBBBBBFBB(
					x, w2i, y, w, i, z, _this, isApplicableMatch);
			if (result_pattern_whileld2branchbb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileld2branchbb_11_1_performtransformation_black[6];

				return new Object[] { x, w2i, y, w, i, z, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_11_1_performtransformation_greenBFFFBBFFBF(Branch x,
			Command y, While w, Branch z) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision c = SourcecodeFactory.eINSTANCE.createDecision();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		a2x.setTarget(x);
		w.setNext(c);
		b2y.setTarget(y);
		b2y.setSource(b);
		c2z.setSource(c);
		c2z.setTarget(z);
		w.setFirst(a);
		a2x.setSource(a);
		a.setLast(b);
		return new Object[] { x, a2x, c, b2y, y, w, b, c2z, z, a };
	}

	public static final Object[] pattern_whileld2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBB(Branch x,
			S2B a2x, Decision c, S2N b2y, Command y, Assignment b, S2B c2z, Branch z, While a) {
		if (!x.equals(z)) {
			if (!a2x.equals(c2z)) {
				return new Object[] { x, a2x, c, b2y, y, b, c2z, z, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBB(Branch x,
			S2B a2x, Decision c, S2N b2y, Command y, Assignment b, S2B c2z, Branch z, While a) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedElements().add(a);
		return new Object[] { ruleresult, x, a2x, c, b2y, y, b, c2z, z, a };
	}

	public static final Object[] pattern_whileld2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject x, EObject a2x, EObject w2i, EObject c, EObject b2y, EObject y,
			EObject w, EObject b, EObject c2z, EObject i, EObject z, EObject a) {
		if (!x.equals(y)) {
			if (!x.equals(z)) {
				if (!a2x.equals(x)) {
					if (!a2x.equals(w2i)) {
						if (!a2x.equals(c)) {
							if (!a2x.equals(b2y)) {
								if (!a2x.equals(y)) {
									if (!a2x.equals(w)) {
										if (!a2x.equals(b)) {
											if (!a2x.equals(c2z)) {
												if (!a2x.equals(i)) {
													if (!a2x.equals(z)) {
														if (!w2i.equals(x)) {
															if (!w2i.equals(y)) {
																if (!w2i.equals(z)) {
																	if (!c.equals(x)) {
																		if (!c.equals(w2i)) {
																			if (!c.equals(y)) {
																				if (!c.equals(w)) {
																					if (!c.equals(c2z)) {
																						if (!c.equals(i)) {
																							if (!c.equals(z)) {
																								if (!b2y.equals(x)) {
																									if (!b2y.equals(
																											w2i)) {
																										if (!b2y.equals(
																												c)) {
																											if (!b2y.equals(
																													y)) {
																												if (!b2y.equals(
																														w)) {
																													if (!b2y.equals(
																															c2z)) {
																														if (!b2y.equals(
																																i)) {
																															if (!b2y.equals(
																																	z)) {
																																if (!y.equals(
																																		z)) {
																																	if (!w.equals(
																																			x)) {
																																		if (!w.equals(
																																				w2i)) {
																																			if (!w.equals(
																																					y)) {
																																				if (!w.equals(
																																						z)) {
																																					if (!b.equals(
																																							x)) {
																																						if (!b.equals(
																																								w2i)) {
																																							if (!b.equals(
																																									c)) {
																																								if (!b.equals(
																																										b2y)) {
																																									if (!b.equals(
																																											y)) {
																																										if (!b.equals(
																																												w)) {
																																											if (!b.equals(
																																													c2z)) {
																																												if (!b.equals(
																																														i)) {
																																													if (!b.equals(
																																															z)) {
																																														if (!c2z.equals(
																																																x)) {
																																															if (!c2z.equals(
																																																	w2i)) {
																																																if (!c2z.equals(
																																																		y)) {
																																																	if (!c2z.equals(
																																																			w)) {
																																																		if (!c2z.equals(
																																																				i)) {
																																																			if (!c2z.equals(
																																																					z)) {
																																																				if (!i.equals(
																																																						x)) {
																																																					if (!i.equals(
																																																							w2i)) {
																																																						if (!i.equals(
																																																								y)) {
																																																							if (!i.equals(
																																																									w)) {
																																																								if (!i.equals(
																																																										z)) {
																																																									if (!a.equals(
																																																											x)) {
																																																										if (!a.equals(
																																																												a2x)) {
																																																											if (!a.equals(
																																																													w2i)) {
																																																												if (!a.equals(
																																																														c)) {
																																																													if (!a.equals(
																																																															b2y)) {
																																																														if (!a.equals(
																																																																y)) {
																																																															if (!a.equals(
																																																																	w)) {
																																																																if (!a.equals(
																																																																		b)) {
																																																																	if (!a.equals(
																																																																			c2z)) {
																																																																		if (!a.equals(
																																																																				i)) {
																																																																			if (!a.equals(
																																																																					z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						x,
																																																																						a2x,
																																																																						w2i,
																																																																						c,
																																																																						b2y,
																																																																						y,
																																																																						w,
																																																																						b,
																																																																						c2z,
																																																																						i,
																																																																						z,
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
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject x, EObject a2x, EObject c, EObject b2y, EObject y, EObject w,
			EObject b, EObject c2z, EObject i, EObject z, EObject a) {
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileld2branchbb";
		String a2x__x____target_name_prime = "target";
		String b2y__y____target_name_prime = "target";
		String w__c____next_name_prime = "next";
		String b2y__b____source_name_prime = "source";
		String w__a____first_name_prime = "first";
		String y__x____next_name_prime = "next";
		String c2z__c____source_name_prime = "source";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String a2x__a____source_name_prime = "source";
		String a__b____last_name_prime = "last";
		String c2z__z____target_name_prime = "target";
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(y__x____next);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		return new Object[] { ruleresult, x, a2x, c, b2y, y, w, b, c2z, i, z, a, a2x__x____target, b2y__y____target,
				w__c____next, b2y__b____source, w__a____first, y__x____next, c2z__c____source, i__x____positive,
				i__z____negative, a2x__a____source, a__b____last, c2z__z____target };
	}

	public static final void pattern_whileld2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whileld2branchbb _this, PerformRuleResult ruleresult, EObject x, EObject a2x, EObject w2i, EObject c,
			EObject b2y, EObject y, EObject w, EObject b, EObject c2z, EObject i, EObject z, EObject a) {
		_this.registerObjects_BWD(ruleresult, x, a2x, w2i, c, b2y, y, w, b, c2z, i, z, a);

	}

	public static final PerformRuleResult pattern_whileld2branchbb_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileld2branchbb_12_1_preparereturnvalue_bindingFB(whileld2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_12_1_preparereturnvalue_blackFBB(EClass eClass,
			whileld2branchbb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_12_1_preparereturnvalue_bindingAndBlackFFB(
			whileld2branchbb _this) {
		Object[] result_pattern_whileld2branchbb_12_1_preparereturnvalue_binding = pattern_whileld2branchbb_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileld2branchbb_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whileld2branchbb_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileld2branchbb_12_1_preparereturnvalue_black = pattern_whileld2branchbb_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whileld2branchbb_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whileld2branchbb_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whileld2branchbb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whileld2branchbb_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("x");
		EObject _localVariable_1 = match.getObject("y");
		EObject _localVariable_2 = match.getObject("i");
		EObject _localVariable_3 = match.getObject("z");
		EObject tmpX = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpI = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (tmpI instanceof Branch) {
					Branch i = (Branch) tmpI;
					if (tmpZ instanceof Branch) {
						Branch z = (Branch) tmpZ;
						return new Object[] { x, y, i, z, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileld2branchbb_12_2_corematch_blackBFBFBBB(Branch x, Command y,
			Branch i, Branch z, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class,
							"target")) {
						Statement tmpW = w2i.getSource();
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							_result.add(new Object[] { x, w2i, y, w, i, z, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileld2branchbb_12_3_findcontext_blackBBBBBB(Branch x, S2B w2i,
			Command y, While w, Branch i, Branch z) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (w.equals(w2i.getSource())) {
						if (x.equals(y.getNext())) {
							if (i.equals(w2i.getTarget())) {
								if (x.equals(i.getPositive())) {
									if (z.equals(i.getNegative())) {
										_result.add(new Object[] { x, w2i, y, w, i, z });
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

	public static final Object[] pattern_whileld2branchbb_12_3_findcontext_greenBBBBBBFFFFFF(Branch x, S2B w2i,
			Command y, While w, Branch i, Branch z) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w2i__w____source_name_prime = "source";
		String y__x____next_name_prime = "next";
		String w2i__i____target_name_prime = "target";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(z);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
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
		w2i__w____source.setName(w2i__w____source_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		return new Object[] { x, w2i, y, w, i, z, isApplicableMatch, w2i__w____source, y__x____next, w2i__i____target,
				i__x____positive, i__z____negative };
	}

	public static final Object[] pattern_whileld2branchbb_12_4_solveCSP_bindingFBBBBBBBB(whileld2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch x, S2B w2i, Command y, While w, Branch i, Branch z) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, x, w2i, y, w, i, z);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, x, w2i, y, w, i, z };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileld2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(whileld2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch x, S2B w2i, Command y, While w, Branch i, Branch z) {
		Object[] result_pattern_whileld2branchbb_12_4_solveCSP_binding = pattern_whileld2branchbb_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, x, w2i, y, w, i, z);
		if (result_pattern_whileld2branchbb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileld2branchbb_12_4_solveCSP_binding[0];

			Object[] result_pattern_whileld2branchbb_12_4_solveCSP_black = pattern_whileld2branchbb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileld2branchbb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, x, w2i, y, w, i, z };
			}
		}
		return null;
	}

	public static final boolean pattern_whileld2branchbb_12_5_checkCSP_expressionFBB(whileld2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileld2branchbb_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whileld2branchbb_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whileld2branchbb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whileld2branchbb_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileld2branchbb_20_1_preparereturnvalue_bindingFB(whileld2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whileld2branchbb _this) {
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

	public static final Object[] pattern_whileld2branchbb_20_1_preparereturnvalue_bindingAndBlackFFBF(
			whileld2branchbb _this) {
		Object[] result_pattern_whileld2branchbb_20_1_preparereturnvalue_binding = pattern_whileld2branchbb_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileld2branchbb_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whileld2branchbb_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileld2branchbb_20_1_preparereturnvalue_black = pattern_whileld2branchbb_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whileld2branchbb_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whileld2branchbb_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whileld2branchbb_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_72617 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_1BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_202532 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_202532)) {
							if (!i.equals(__DEC_x_positive_202532)) {
								if (!z.equals(__DEC_x_positive_202532)) {
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

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_2BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_333632 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_333632)) {
							if (!i.equals(__DEC_x_negative_333632)) {
								if (!z.equals(__DEC_x_negative_333632)) {
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

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_539441 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_4BBBB(Command y, Branch x,
			Branch i, Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_y_positive_987284 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!x.equals(__DEC_y_positive_987284)) {
							if (!i.equals(__DEC_y_positive_987284)) {
								if (!z.equals(__DEC_y_positive_987284)) {
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

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_5BBBB(Command y, Branch x,
			Branch i, Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_y_negative_67585 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!x.equals(__DEC_y_negative_67585)) {
							if (!i.equals(__DEC_y_negative_67585)) {
								if (!z.equals(__DEC_y_negative_67585)) {
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

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_6B(Branch z) {
		for (Graph __DEC_z_root_782457 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_7BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_positive_36436 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_36436)) {
							if (!x.equals(__DEC_z_positive_36436)) {
								if (!i.equals(__DEC_z_positive_36436)) {
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

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_8BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_negative_515298 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_515298)) {
							if (!x.equals(__DEC_z_negative_515298)) {
								if (!i.equals(__DEC_z_negative_515298)) {
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

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_9BB(Branch x, Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_10BB(Branch i,
			Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_11BB(Branch z,
			Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_12BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_13BB(Branch i,
			Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_14BB(Branch z,
			Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_15BB(Branch x, Branch z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_16BB(Branch i, Branch z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_17BB(Branch x, Branch z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileld2branchbb_20_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpY = _edge_next.getSrc();
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			EObject tmpX = _edge_next.getTrg();
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (x.equals(y.getNext())) {
					if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_3B(y) == null) {
						if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_0B(x) == null) {
							if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_9BB(x, y) == null) {
								if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_12BB(x, y) == null) {
									for (Branch i : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(x, Branch.class, "positive")) {
										if (!i.equals(x)) {
											Node tmpZ = i.getNegative();
											if (tmpZ instanceof Branch) {
												Branch z = (Branch) tmpZ;
												if (!x.equals(z)) {
													if (!i.equals(z)) {
														if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_10BB(
																i, y) == null) {
															if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_13BB(
																	i, y) == null) {
																if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_1BBB(
																		x, i, z) == null) {
																	if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_2BBB(
																			x, i, z) == null) {
																		if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_4BBBB(
																				y, x, i, z) == null) {
																			if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_5BBBB(
																					y, x, i, z) == null) {
																				if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_6B(
																						z) == null) {
																					if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_7BBB(
																							z, x, i) == null) {
																						if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_8BBB(
																								z, x, i) == null) {
																							if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_11BB(
																									z, y) == null) {
																								if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_14BB(
																										z, y) == null) {
																									if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_15BB(
																											x,
																											z) == null) {
																										if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_16BB(
																												i,
																												z) == null) {
																											if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_17BB(
																													x,
																													z) == null) {
																												_result.add(
																														new Object[] {
																																x,
																																y,
																																i,
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

		return _result;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whileld2branchbb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			whileld2branchbb _this, Match match, Branch x, Command y, Branch i, Branch z) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, x, y, i, z);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whileld2branchbb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whileld2branchbb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileld2branchbb_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whileld2branchbb_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whileld2branchbb_21_1_preparereturnvalue_bindingFB(whileld2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whileld2branchbb _this) {
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

	public static final Object[] pattern_whileld2branchbb_21_1_preparereturnvalue_bindingAndBlackFFBF(
			whileld2branchbb _this) {
		Object[] result_pattern_whileld2branchbb_21_1_preparereturnvalue_binding = pattern_whileld2branchbb_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileld2branchbb_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whileld2branchbb_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileld2branchbb_21_1_preparereturnvalue_black = pattern_whileld2branchbb_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whileld2branchbb_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whileld2branchbb_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whileld2branchbb_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_0B(Decision c) {
		for (Decision __DEC_c_positive_28551 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_c_positive_28551)) {
				return new Object[] { c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_1B(Decision c) {
		for (Decision __DEC_c_negative_925204 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_c_negative_925204)) {
				return new Object[] { c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_2BBB(Decision c, While w,
			While a) {
		if (!a.equals(w)) {
			for (While __DEC_c_first_26134 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!w.equals(__DEC_c_first_26134)) {
					if (!a.equals(__DEC_c_first_26134)) {
						return new Object[] { c, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_3BBB(Decision c, While w,
			While a) {
		if (!a.equals(w)) {
			for (While __DEC_c_last_230225 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!w.equals(__DEC_c_last_230225)) {
					if (!a.equals(__DEC_c_last_230225)) {
						return new Object[] { c, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_4B(Decision c) {
		for (Program __DEC_c_first_85859 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_5BB(Assignment b,
			Decision c) {
		for (Decision __DEC_b_positive_885551 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_b_positive_885551)) {
				return new Object[] { b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_6BB(Assignment b,
			Decision c) {
		for (Decision __DEC_b_negative_524561 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_b_negative_524561)) {
				return new Object[] { b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_7BBB(Assignment b,
			While w, While a) {
		if (!a.equals(w)) {
			for (While __DEC_b_first_822708 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!w.equals(__DEC_b_first_822708)) {
					if (!a.equals(__DEC_b_first_822708)) {
						return new Object[] { b, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_8BBB(Assignment b,
			While w, While a) {
		if (!a.equals(w)) {
			for (While __DEC_b_last_564378 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!w.equals(__DEC_b_last_564378)) {
					if (!a.equals(__DEC_b_last_564378)) {
						return new Object[] { b, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_9B(Assignment b) {
		for (Program __DEC_b_first_320306 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_10BB(While a,
			Decision c) {
		for (Decision __DEC_a_positive_545748 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_a_positive_545748)) {
				return new Object[] { a, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_11BB(While a,
			Decision c) {
		for (Decision __DEC_a_negative_332852 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_a_negative_332852)) {
				return new Object[] { a, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_12BB(While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_a_last_826944 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_826944)) {
					if (!w.equals(__DEC_a_last_826944)) {
						return new Object[] { a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_13B(While a) {
		for (Program __DEC_a_first_190503 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_14BB(While w,
			Decision c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_15BB(While a,
			Decision c) {
		if (c.equals(a.getFirst())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_16BB(While w,
			Decision c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_17BB(While a,
			Decision c) {
		if (c.equals(a.getLast())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_18BB(Decision c,
			Assignment b) {
		if (b.equals(c.getPositive())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_19BB(Decision c,
			Assignment b) {
		if (b.equals(c.getNegative())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_20BB(While w,
			Assignment b) {
		if (b.equals(w.getFirst())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_21BB(While a,
			Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_22BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_23BB(Decision c,
			While a) {
		if (a.equals(c.getPositive())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_24BB(Decision c,
			While a) {
		if (a.equals(c.getNegative())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_25BB(While w, While a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileld2branchbb_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpW = _edge_next.getSrc();
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			EObject tmpC = _edge_next.getTrg();
			if (tmpC instanceof Decision) {
				Decision c = (Decision) tmpC;
				if (c.equals(w.getNext())) {
					Statement tmpA = w.getFirst();
					if (tmpA instanceof While) {
						While a = (While) tmpA;
						if (!a.equals(w)) {
							Statement tmpB = a.getLast();
							if (tmpB instanceof Assignment) {
								Assignment b = (Assignment) tmpB;
								if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_0B(c) == null) {
									if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_1B(c) == null) {
										if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_4B(
												c) == null) {
											if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_14BB(w,
													c) == null) {
												if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_16BB(w,
														c) == null) {
													if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_2BBB(
															c, w, a) == null) {
														if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_3BBB(
																c, w, a) == null) {
															if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_10BB(
																	a, c) == null) {
																if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_11BB(
																		a, c) == null) {
																	if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_12BB(
																			a, w) == null) {
																		if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_13B(
																				a) == null) {
																			if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_15BB(
																					a, c) == null) {
																				if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_17BB(
																						a, c) == null) {
																					if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_23BB(
																							c, a) == null) {
																						if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_24BB(
																								c, a) == null) {
																							if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_25BB(
																									w, a) == null) {
																								if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_5BB(
																										b, c) == null) {
																									if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_6BB(
																											b,
																											c) == null) {
																										if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_7BBB(
																												b, w,
																												a) == null) {
																											if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_8BBB(
																													b,
																													w,
																													a) == null) {
																												if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_9B(
																														b) == null) {
																													if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_18BB(
																															c,
																															b) == null) {
																														if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_19BB(
																																c,
																																b) == null) {
																															if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_20BB(
																																	w,
																																	b) == null) {
																																if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_21BB(
																																		a,
																																		b) == null) {
																																	if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_22BB(
																																			w,
																																			b) == null) {
																																		_result.add(
																																				new Object[] {
																																						c,
																																						w,
																																						b,
																																						a,
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

		return _result;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whileld2branchbb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			whileld2branchbb _this, Match match, Decision c, While w, Assignment b, While a) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, c, w, b, a);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whileld2branchbb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whileld2branchbb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileld2branchbb_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whileld2branchbb_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whileld2branchbb_24_1_prepare_blackB(whileld2branchbb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whileld2branchbb_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_whileld2branchbb_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("x");
		EObject _localVariable_1 = sourceMatch.getObject("c");
		EObject _localVariable_2 = targetMatch.getObject("y");
		EObject _localVariable_3 = sourceMatch.getObject("w");
		EObject _localVariable_4 = sourceMatch.getObject("b");
		EObject _localVariable_5 = targetMatch.getObject("i");
		EObject _localVariable_6 = targetMatch.getObject("z");
		EObject _localVariable_7 = sourceMatch.getObject("a");
		EObject tmpX = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpB = _localVariable_4;
		EObject tmpI = _localVariable_5;
		EObject tmpZ = _localVariable_6;
		EObject tmpA = _localVariable_7;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpC instanceof Decision) {
				Decision c = (Decision) tmpC;
				if (tmpY instanceof Command) {
					Command y = (Command) tmpY;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						if (tmpB instanceof Assignment) {
							Assignment b = (Assignment) tmpB;
							if (tmpI instanceof Branch) {
								Branch i = (Branch) tmpI;
								if (tmpZ instanceof Branch) {
									Branch z = (Branch) tmpZ;
									if (tmpA instanceof While) {
										While a = (While) tmpA;
										return new Object[] { x, c, y, w, b, i, z, a, targetMatch, sourceMatch };
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

	public static final Object[] pattern_whileld2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Branch x, Decision c,
			Command y, While w, Assignment b, Branch i, Branch z, While a, Match sourceMatch, Match targetMatch) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (!a.equals(w)) {
						if (!sourceMatch.equals(targetMatch)) {
							return new Object[] { x, c, y, w, b, i, z, a, sourceMatch, targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_binding = pattern_whileld2branchbb_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_binding != null) {
			Branch x = (Branch) result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_binding[0];
			Decision c = (Decision) result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_binding[1];
			Command y = (Command) result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_binding[2];
			While w = (While) result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_binding[3];
			Assignment b = (Assignment) result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_binding[4];
			Branch i = (Branch) result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_binding[5];
			Branch z = (Branch) result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_binding[6];
			While a = (While) result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_black = pattern_whileld2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					x, c, y, w, b, i, z, a, sourceMatch, targetMatch);
			if (result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { x, c, y, w, b, i, z, a, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBB(whileld2branchbb _this,
			Branch x, Decision c, Command y, While w, Assignment b, Branch i, Branch z, While a, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(x, c, y, w, b, i, z, a, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, x, c, y, w, b, i, z, a, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileld2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			whileld2branchbb _this, Branch x, Decision c, Command y, While w, Assignment b, Branch i, Branch z, While a,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileld2branchbb_24_3_solvecsp_binding = pattern_whileld2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, x, c, y, w, b, i, z, a, sourceMatch, targetMatch);
		if (result_pattern_whileld2branchbb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whileld2branchbb_24_3_solvecsp_binding[0];

			Object[] result_pattern_whileld2branchbb_24_3_solvecsp_black = pattern_whileld2branchbb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whileld2branchbb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, x, c, y, w, b, i, z, a, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whileld2branchbb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileld2branchbb_24_5_matchcorrcontext_blackFBBBB(While w, Branch i,
			Match sourceMatch, Match targetMatch) {
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

	public static final Object[] pattern_whileld2branchbb_24_5_matchcorrcontext_greenBBBF(S2B w2i, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "whileld2branchbb";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(w2i);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { w2i, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_whileld2branchbb_24_6_createcorrespondence_blackBBBBBBBBB(Branch x, Decision c,
			Command y, While w, Assignment b, Branch i, Branch z, While a, CCMatch ccMatch) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (!a.equals(w)) {
						return new Object[] { x, c, y, w, b, i, z, a, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_24_6_createcorrespondence_greenBFBFBBFBBB(Branch x,
			Decision c, Command y, Assignment b, Branch z, While a, CCMatch ccMatch) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		c2z.setSource(c);
		c2z.setTarget(z);
		ccMatch.getCreateCorr().add(c2z);
		return new Object[] { x, a2x, c, b2y, y, b, c2z, z, a, ccMatch };
	}

	public static final Object[] pattern_whileld2branchbb_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_whileld2branchbb_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "whileld2branchbb";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_whileld2branchbb_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_0B(Decision c) {
		for (Decision __DEC_c_positive_697195 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_c_positive_697195)) {
				return new Object[] { c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_1B(Decision c) {
		for (Decision __DEC_c_negative_303051 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_c_negative_303051)) {
				return new Object[] { c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_2BBB(Decision c, While w,
			While a) {
		if (!a.equals(w)) {
			for (While __DEC_c_first_439677 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!w.equals(__DEC_c_first_439677)) {
					if (!a.equals(__DEC_c_first_439677)) {
						return new Object[] { c, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_3BBB(Decision c, While w,
			While a) {
		if (!a.equals(w)) {
			for (While __DEC_c_last_408754 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!w.equals(__DEC_c_last_408754)) {
					if (!a.equals(__DEC_c_last_408754)) {
						return new Object[] { c, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_4B(Decision c) {
		for (Program __DEC_c_first_915651 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_5BB(Assignment b, Decision c) {
		for (Decision __DEC_b_positive_743068 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_b_positive_743068)) {
				return new Object[] { b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_6BB(Assignment b, Decision c) {
		for (Decision __DEC_b_negative_936197 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_b_negative_936197)) {
				return new Object[] { b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_7BBB(Assignment b, While w,
			While a) {
		if (!a.equals(w)) {
			for (While __DEC_b_first_847634 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!w.equals(__DEC_b_first_847634)) {
					if (!a.equals(__DEC_b_first_847634)) {
						return new Object[] { b, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_8BBB(Assignment b, While w,
			While a) {
		if (!a.equals(w)) {
			for (While __DEC_b_last_831795 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!w.equals(__DEC_b_last_831795)) {
					if (!a.equals(__DEC_b_last_831795)) {
						return new Object[] { b, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_9B(Assignment b) {
		for (Program __DEC_b_first_282276 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_10BB(While a, Decision c) {
		for (Decision __DEC_a_positive_973081 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_a_positive_973081)) {
				return new Object[] { a, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_11BB(While a, Decision c) {
		for (Decision __DEC_a_negative_224818 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_a_negative_224818)) {
				return new Object[] { a, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_12BB(While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_a_last_764830 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_764830)) {
					if (!w.equals(__DEC_a_last_764830)) {
						return new Object[] { a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_13B(While a) {
		for (Program __DEC_a_first_460527 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_14BB(While w, Decision c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_15BB(While a, Decision c) {
		if (c.equals(a.getFirst())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_16BB(While w, Decision c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_17BB(While a, Decision c) {
		if (c.equals(a.getLast())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_18BB(Decision c,
			Assignment b) {
		if (b.equals(c.getPositive())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_19BB(Decision c,
			Assignment b) {
		if (b.equals(c.getNegative())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_20BB(While w, Assignment b) {
		if (b.equals(w.getFirst())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_21BB(While a, Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_22BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_23BB(Decision c, While a) {
		if (a.equals(c.getPositive())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_24BB(Decision c, While a) {
		if (a.equals(c.getNegative())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_25BB(While w, While a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_blackBBBB(Decision c, While w,
			Assignment b, While a) {
		if (!a.equals(w)) {
			if (c.equals(w.getNext())) {
				if (a.equals(w.getFirst())) {
					if (b.equals(a.getLast())) {
						if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_0B(c) == null) {
							if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_1B(c) == null) {
								if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_2BBB(c, w, a) == null) {
									if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_3BBB(c, w, a) == null) {
										if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_4B(c) == null) {
											if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_5BB(b,
													c) == null) {
												if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_6BB(b,
														c) == null) {
													if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_7BBB(b,
															w, a) == null) {
														if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_8BBB(
																b, w, a) == null) {
															if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_9B(
																	b) == null) {
																if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_10BB(
																		a, c) == null) {
																	if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_11BB(
																			a, c) == null) {
																		if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_12BB(
																				a, w) == null) {
																			if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_13B(
																					a) == null) {
																				if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_14BB(
																						w, c) == null) {
																					if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_15BB(
																							a, c) == null) {
																						if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_16BB(
																								w, c) == null) {
																							if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_17BB(
																									a, c) == null) {
																								if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_18BB(
																										c, b) == null) {
																									if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_19BB(
																											c,
																											b) == null) {
																										if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_20BB(
																												w,
																												b) == null) {
																											if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_21BB(
																													a,
																													b) == null) {
																												if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_22BB(
																														w,
																														b) == null) {
																													if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_23BB(
																															c,
																															a) == null) {
																														if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_24BB(
																																c,
																																a) == null) {
																															if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_25BB(
																																	w,
																																	a) == null) {
																																return new Object[] {
																																		c,
																																		w,
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
		return null;
	}

	public static final boolean pattern_whileld2branchbb_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileld2branchbb_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_940016 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_1BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_776228 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_776228)) {
							if (!i.equals(__DEC_x_positive_776228)) {
								if (!z.equals(__DEC_x_positive_776228)) {
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

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_2BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_772813 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_772813)) {
							if (!i.equals(__DEC_x_negative_772813)) {
								if (!z.equals(__DEC_x_negative_772813)) {
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

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_565478 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_4BBBB(Command y, Branch x,
			Branch i, Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_y_positive_750188 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!x.equals(__DEC_y_positive_750188)) {
							if (!i.equals(__DEC_y_positive_750188)) {
								if (!z.equals(__DEC_y_positive_750188)) {
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

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_5BBBB(Command y, Branch x,
			Branch i, Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_y_negative_289721 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!x.equals(__DEC_y_negative_289721)) {
							if (!i.equals(__DEC_y_negative_289721)) {
								if (!z.equals(__DEC_y_negative_289721)) {
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

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_6B(Branch z) {
		for (Graph __DEC_z_root_897656 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_7BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_positive_502805 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_502805)) {
							if (!x.equals(__DEC_z_positive_502805)) {
								if (!i.equals(__DEC_z_positive_502805)) {
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

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_8BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_negative_405444 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_405444)) {
							if (!x.equals(__DEC_z_negative_405444)) {
								if (!i.equals(__DEC_z_negative_405444)) {
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

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_9BB(Branch x, Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_10BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_11BB(Branch z, Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_12BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_13BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_14BB(Branch z, Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_15BB(Branch x, Branch z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_16BB(Branch i, Branch z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_17BB(Branch x, Branch z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_blackBBBB(Branch x, Command y, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (x.equals(y.getNext())) {
						if (x.equals(i.getPositive())) {
							if (z.equals(i.getNegative())) {
								if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_0B(x) == null) {
									if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_1BBB(x, i, z) == null) {
										if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_2BBB(x, i,
												z) == null) {
											if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_3B(y) == null) {
												if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_4BBBB(y, x,
														i, z) == null) {
													if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_5BBBB(y,
															x, i, z) == null) {
														if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_6B(
																z) == null) {
															if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_7BBB(
																	z, x, i) == null) {
																if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_8BBB(
																		z, x, i) == null) {
																	if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_9BB(
																			x, y) == null) {
																		if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_10BB(
																				i, y) == null) {
																			if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_11BB(
																					z, y) == null) {
																				if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_12BB(
																						x, y) == null) {
																					if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_13BB(
																							i, y) == null) {
																						if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_14BB(
																								z, y) == null) {
																							if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_15BB(
																									x, z) == null) {
																								if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_16BB(
																										i, z) == null) {
																									if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_17BB(
																											x,
																											z) == null) {
																										return new Object[] {
																												x, y, i,
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
		return null;
	}

	public static final boolean pattern_whileld2branchbb_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileld2branchbb_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileld2branchbb_29_1_createresult_blackB(whileld2branchbb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whileld2branchbb_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_whileld2branchbb_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileld2branchbb_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_whileld2branchbb_29_2_isapplicablecore_black_nac_0BB(ruleResult, w2i) == null) {
								if (pattern_whileld2branchbb_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										w) == null) {
									if (pattern_whileld2branchbb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_whileld2branchbb_29_3_solveCSP_bindingFBBBBBB(whileld2branchbb _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, While w, Branch i, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, w2i, w, i, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w2i, w, i, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileld2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(whileld2branchbb _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, While w, Branch i, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whileld2branchbb_29_3_solveCSP_binding = pattern_whileld2branchbb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, w2i, w, i, ruleResult);
		if (result_pattern_whileld2branchbb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileld2branchbb_29_3_solveCSP_binding[0];

			Object[] result_pattern_whileld2branchbb_29_3_solveCSP_black = pattern_whileld2branchbb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whileld2branchbb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w2i, w, i, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whileld2branchbb_29_4_checkCSP_expressionFBB(whileld2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileld2branchbb_29_5_checknacs_blackBBB(S2B w2i, While w, Branch i) {
		return new Object[] { w2i, w, i };
	}

	public static final Object[] pattern_whileld2branchbb_29_6_perform_blackBBBB(S2B w2i, While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { w2i, w, i, ruleResult };
	}

	public static final Object[] pattern_whileld2branchbb_29_6_perform_greenFFFFFBFFBFFB(While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision c = SourcecodeFactory.eINSTANCE.createDecision();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		i.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		a2x.setTarget(x);
		ruleResult.getCorrObjects().add(a2x);
		w.setNext(c);
		ruleResult.getSourceObjects().add(c);
		ruleResult.getCorrObjects().add(b2y);
		b2y.setTarget(y);
		y.setNext(x);
		ruleResult.getTargetObjects().add(y);
		b2y.setSource(b);
		ruleResult.getSourceObjects().add(b);
		c2z.setSource(c);
		ruleResult.getCorrObjects().add(c2z);
		i.setNegative(z);
		c2z.setTarget(z);
		ruleResult.getTargetObjects().add(z);
		w.setFirst(a);
		a2x.setSource(a);
		a.setLast(b);
		ruleResult.getSourceObjects().add(a);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { x, a2x, c, b2y, y, w, b, c2z, i, z, a, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whileld2branchbb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whileld2branchbbImpl
