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
	public boolean isAppropriate_FWD(Match match, While a, Assignment b, While w, Decision c) {

		Object[] result1_black = whileld2branchbbImpl.pattern_whileld2branchbb_0_1_initialbindings_blackBBBBBB(this,
				match, a, b, w, c);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[w] = " + w + ", "
					+ "[c] = " + c + ".");
		}

		Object[] result2_bindingAndBlack = whileld2branchbbImpl
				.pattern_whileld2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, a, b, w, c);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[w] = " + w + ", "
					+ "[c] = " + c + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileld2branchbbImpl.pattern_whileld2branchbb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileld2branchbbImpl
					.pattern_whileld2branchbb_0_4_collectelementstobetranslated_blackBBBBB(match, a, b, w, c);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[b] = " + b + ", " + "[w] = " + w + ", " + "[c] = " + c + ".");
			}
			whileld2branchbbImpl.pattern_whileld2branchbb_0_4_collectelementstobetranslated_greenBBBBBFFF(match, a, b,
					w, c);
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[7];

			Object[] result5_black = whileld2branchbbImpl
					.pattern_whileld2branchbb_0_5_collectcontextelements_blackBBBBB(match, a, b, w, c);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[b] = " + b + ", " + "[w] = " + w + ", " + "[c] = " + c + ".");
			}
			whileld2branchbbImpl.pattern_whileld2branchbb_0_5_collectcontextelements_greenBB(match, w);

			// 
			whileld2branchbbImpl.pattern_whileld2branchbb_0_6_registerobjectstomatch_expressionBBBBBB(this, match, a, b,
					w, c);
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
		While a = (While) result1_bindingAndBlack[0];
		Assignment b = (Assignment) result1_bindingAndBlack[1];
		While w = (While) result1_bindingAndBlack[2];
		Decision c = (Decision) result1_bindingAndBlack[3];
		S2B w2i = (S2B) result1_bindingAndBlack[4];
		Branch i = (Branch) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whileld2branchbbImpl
				.pattern_whileld2branchbb_1_1_performtransformation_greenFFFBBFBFFB(a, b, c, i);
		Branch z = (Branch) result1_green[0];
		S2B a2x = (S2B) result1_green[1];
		Command y = (Command) result1_green[2];
		S2B c2z = (S2B) result1_green[5];
		S2N b2y = (S2N) result1_green[7];
		Branch x = (Branch) result1_green[8];

		Object[] result2_black = whileld2branchbbImpl
				.pattern_whileld2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBB(z, a2x, y, a, b, c2z, c, b2y, x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[z] = " + z + ", " + "[a2x] = "
					+ a2x + ", " + "[y] = " + y + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[c2z] = " + c2z
					+ ", " + "[c] = " + c + ", " + "[b2y] = " + b2y + ", " + "[x] = " + x + ".");
		}
		Object[] result2_green = whileld2branchbbImpl
				.pattern_whileld2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBB(z, a2x, y, a, b, c2z, c, b2y,
						x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileld2branchbbImpl
				.pattern_whileld2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, z, a2x, y, a, b, c2z,
						w, c, b2y, w2i, x, i);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[z] = " + z + ", " + "[a2x] = " + a2x + ", " + "[y] = " + y + ", " + "[a] = " + a + ", "
					+ "[b] = " + b + ", " + "[c2z] = " + c2z + ", " + "[w] = " + w + ", " + "[c] = " + c + ", "
					+ "[b2y] = " + b2y + ", " + "[w2i] = " + w2i + ", " + "[x] = " + x + ", " + "[i] = " + i + ".");
		}
		whileld2branchbbImpl.pattern_whileld2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult,
				z, a2x, y, a, b, c2z, w, c, b2y, x, i);
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[23];

		// 
		// 
		whileld2branchbbImpl.pattern_whileld2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, z,
				a2x, y, a, b, c2z, w, c, b2y, w2i, x, i);
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
		While a = (While) result2_binding[0];
		Assignment b = (Assignment) result2_binding[1];
		While w = (While) result2_binding[2];
		Decision c = (Decision) result2_binding[3];
		for (Object[] result2_black : whileld2branchbbImpl.pattern_whileld2branchbb_2_2_corematch_blackBBBBFFB(a, b, w,
				c, match)) {
			S2B w2i = (S2B) result2_black[4];
			Branch i = (Branch) result2_black[5];
			// ForEach 
			for (Object[] result3_black : whileld2branchbbImpl.pattern_whileld2branchbb_2_3_findcontext_blackBBBBBB(a,
					b, w, c, w2i, i)) {
				Object[] result3_green = whileld2branchbbImpl
						.pattern_whileld2branchbb_2_3_findcontext_greenBBBBBBFFFFFF(a, b, w, c, w2i, i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = whileld2branchbbImpl
						.pattern_whileld2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, a, b,
								w, c, w2i, i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[a] = " + a + ", " + "[b] = " + b
							+ ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[w2i] = " + w2i + ", " + "[i] = " + i
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
	public void registerObjectsToMatch_FWD(Match match, While a, Assignment b, While w, Decision c) {
		match.registerObject("a", a);
		match.registerObject("b", b);
		match.registerObject("w", w);
		match.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, While a, Assignment b, While w, Decision c) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, While a, Assignment b, While w,
			Decision c, S2B w2i, Branch i) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("w2i", w2i);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject z, EObject a2x, EObject y, EObject a,
			EObject b, EObject c2z, EObject w, EObject c, EObject b2y, EObject w2i, EObject x, EObject i) {
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("i", i);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.Decision.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch z, Command y, Branch x, Branch i) {

		Object[] result1_black = whileld2branchbbImpl.pattern_whileld2branchbb_10_1_initialbindings_blackBBBBBB(this,
				match, z, y, x, i);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[x] = " + x + ", "
					+ "[i] = " + i + ".");
		}

		Object[] result2_bindingAndBlack = whileld2branchbbImpl
				.pattern_whileld2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, z, y, x, i);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[x] = " + x + ", "
					+ "[i] = " + i + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileld2branchbbImpl.pattern_whileld2branchbb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileld2branchbbImpl
					.pattern_whileld2branchbb_10_4_collectelementstobetranslated_blackBBBBB(match, z, y, x, i);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[z] = " + z + ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[i] = " + i + ".");
			}
			whileld2branchbbImpl.pattern_whileld2branchbb_10_4_collectelementstobetranslated_greenBBBBBFFF(match, z, y,
					x, i);
			//nothing EMoflonEdge y__x____next = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[7];

			Object[] result5_black = whileld2branchbbImpl
					.pattern_whileld2branchbb_10_5_collectcontextelements_blackBBBBB(match, z, y, x, i);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[z] = " + z + ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[i] = " + i + ".");
			}
			whileld2branchbbImpl.pattern_whileld2branchbb_10_5_collectcontextelements_greenBB(match, i);

			// 
			whileld2branchbbImpl.pattern_whileld2branchbb_10_6_registerobjectstomatch_expressionBBBBBB(this, match, z,
					y, x, i);
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
		Branch z = (Branch) result1_bindingAndBlack[0];
		Command y = (Command) result1_bindingAndBlack[1];
		While w = (While) result1_bindingAndBlack[2];
		S2B w2i = (S2B) result1_bindingAndBlack[3];
		Branch x = (Branch) result1_bindingAndBlack[4];
		Branch i = (Branch) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whileld2branchbbImpl
				.pattern_whileld2branchbb_11_1_performtransformation_greenBFBFFFBFFB(z, y, w, x);
		S2B a2x = (S2B) result1_green[1];
		While a = (While) result1_green[3];
		Assignment b = (Assignment) result1_green[4];
		S2B c2z = (S2B) result1_green[5];
		Decision c = (Decision) result1_green[7];
		S2N b2y = (S2N) result1_green[8];

		Object[] result2_black = whileld2branchbbImpl
				.pattern_whileld2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBB(z, a2x, y, a, b, c2z, c, b2y,
						x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[z] = " + z + ", " + "[a2x] = "
					+ a2x + ", " + "[y] = " + y + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[c2z] = " + c2z
					+ ", " + "[c] = " + c + ", " + "[b2y] = " + b2y + ", " + "[x] = " + x + ".");
		}
		Object[] result2_green = whileld2branchbbImpl
				.pattern_whileld2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBB(z, a2x, y, a, b, c2z, c, b2y,
						x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileld2branchbbImpl
				.pattern_whileld2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, z, a2x, y, a, b, c2z,
						w, c, b2y, w2i, x, i);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[z] = " + z + ", " + "[a2x] = " + a2x + ", " + "[y] = " + y + ", " + "[a] = " + a + ", "
					+ "[b] = " + b + ", " + "[c2z] = " + c2z + ", " + "[w] = " + w + ", " + "[c] = " + c + ", "
					+ "[b2y] = " + b2y + ", " + "[w2i] = " + w2i + ", " + "[x] = " + x + ", " + "[i] = " + i + ".");
		}
		whileld2branchbbImpl.pattern_whileld2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult,
				z, a2x, y, a, b, c2z, w, c, b2y, x, i);
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[23];

		// 
		// 
		whileld2branchbbImpl.pattern_whileld2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, z,
				a2x, y, a, b, c2z, w, c, b2y, w2i, x, i);
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
		Branch z = (Branch) result2_binding[0];
		Command y = (Command) result2_binding[1];
		Branch x = (Branch) result2_binding[2];
		Branch i = (Branch) result2_binding[3];
		for (Object[] result2_black : whileld2branchbbImpl.pattern_whileld2branchbb_12_2_corematch_blackBBFFBBB(z, y, x,
				i, match)) {
			While w = (While) result2_black[2];
			S2B w2i = (S2B) result2_black[3];
			// ForEach 
			for (Object[] result3_black : whileld2branchbbImpl.pattern_whileld2branchbb_12_3_findcontext_blackBBBBBB(z,
					y, w, w2i, x, i)) {
				Object[] result3_green = whileld2branchbbImpl
						.pattern_whileld2branchbb_12_3_findcontext_greenBBBBBBFFFFFF(z, y, w, w2i, x, i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = whileld2branchbbImpl
						.pattern_whileld2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, z, y,
								w, w2i, x, i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[z] = " + z + ", " + "[y] = " + y
							+ ", " + "[w] = " + w + ", " + "[w2i] = " + w2i + ", " + "[x] = " + x + ", " + "[i] = " + i
							+ ".");
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
	public void registerObjectsToMatch_BWD(Match match, Branch z, Command y, Branch x, Branch i) {
		match.registerObject("z", z);
		match.registerObject("y", y);
		match.registerObject("x", x);
		match.registerObject("i", i);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch z, Command y, Branch x, Branch i) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch z, Command y, While w, S2B w2i,
			Branch x, Branch i) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("x", x);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject z, EObject a2x, EObject y, EObject a,
			EObject b, EObject c2z, EObject w, EObject c, EObject b2y, EObject w2i, EObject x, EObject i) {
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("i", i);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_29(EMoflonEdge _edge_next) {

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
			Branch z = (Branch) result2_black[0];
			Command y = (Command) result2_black[1];
			Branch x = (Branch) result2_black[2];
			Branch i = (Branch) result2_black[3];
			Object[] result2_green = whileld2branchbbImpl
					.pattern_whileld2branchbb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileld2branchbbImpl
					.pattern_whileld2branchbb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, z, y, x, i)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_29(EMoflonEdge _edge_next) {

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
			While a = (While) result2_black[0];
			Assignment b = (Assignment) result2_black[1];
			While w = (While) result2_black[2];
			Decision c = (Decision) result2_black[3];
			Object[] result2_green = whileld2branchbbImpl
					.pattern_whileld2branchbb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileld2branchbbImpl
					.pattern_whileld2branchbb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, a, b, w, c)) {
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
		Branch z = (Branch) result2_bindingAndBlack[0];
		Command y = (Command) result2_bindingAndBlack[1];
		While a = (While) result2_bindingAndBlack[2];
		Assignment b = (Assignment) result2_bindingAndBlack[3];
		While w = (While) result2_bindingAndBlack[4];
		Decision c = (Decision) result2_bindingAndBlack[5];
		Branch x = (Branch) result2_bindingAndBlack[6];
		Branch i = (Branch) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = whileld2branchbbImpl
				.pattern_whileld2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, z, y, a, b, w, c, x, i,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[z] = " + z + ", " + "[y] = " + y + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[w] = "
					+ w + ", " + "[c] = " + c + ", " + "[x] = " + x + ", " + "[i] = " + i + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whileld2branchbbImpl.pattern_whileld2branchbb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whileld2branchbbImpl
					.pattern_whileld2branchbb_24_5_matchcorrcontext_blackBFBBB(w, i, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[1];
				Object[] result5_green = whileld2branchbbImpl
						.pattern_whileld2branchbb_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whileld2branchbbImpl
						.pattern_whileld2branchbb_24_6_createcorrespondence_blackBBBBBBBBB(z, y, a, b, w, c, x, i,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[z] = " + z + ", "
							+ "[y] = " + y + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[w] = " + w + ", "
							+ "[c] = " + c + ", " + "[x] = " + x + ", " + "[i] = " + i + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				whileld2branchbbImpl.pattern_whileld2branchbb_24_6_createcorrespondence_greenBFBBBFBFBB(z, y, a, b, c,
						x, ccMatch);
				//nothing S2B a2x = (S2B) result6_green[1];
				//nothing S2B c2z = (S2B) result6_green[5];
				//nothing S2N b2y = (S2N) result6_green[7];

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
	public CSP isApplicable_solveCsp_CC(Branch z, Command y, While a, Assignment b, While w, Decision c, Branch x,
			Branch i, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(While a, Assignment b, While w, Decision c) {// 
		Object[] result1_black = whileld2branchbbImpl.pattern_whileld2branchbb_27_1_matchtggpattern_blackBBBB(a, b, w,
				c);
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
	public boolean checkDEC_BWD(Branch z, Command y, Branch x, Branch i) {// 
		Object[] result1_black = whileld2branchbbImpl.pattern_whileld2branchbb_28_1_matchtggpattern_blackBBBB(z, y, x,
				i);
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
			While w = (While) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			Branch i = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = whileld2branchbbImpl
					.pattern_whileld2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, w, w2i, i,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[w2i] = " + w2i
						+ ", " + "[i] = " + i + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whileld2branchbbImpl.pattern_whileld2branchbb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whileld2branchbbImpl.pattern_whileld2branchbb_29_5_checknacs_blackBBB(w, w2i,
						i);
				if (result5_black != null) {

					Object[] result6_black = whileld2branchbbImpl.pattern_whileld2branchbb_29_6_perform_blackBBBB(w,
							w2i, i, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w] = " + w + ", "
								+ "[w2i] = " + w2i + ", " + "[i] = " + i + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whileld2branchbbImpl.pattern_whileld2branchbb_29_6_perform_greenFFFFFFBFFFBB(w, i, ruleResult);
					//nothing Branch z = (Branch) result6_green[0];
					//nothing S2B a2x = (S2B) result6_green[1];
					//nothing Command y = (Command) result6_green[2];
					//nothing While a = (While) result6_green[3];
					//nothing Assignment b = (Assignment) result6_green[4];
					//nothing S2B c2z = (S2B) result6_green[5];
					//nothing Decision c = (Decision) result6_green[7];
					//nothing S2N b2y = (S2N) result6_green[8];
					//nothing Branch x = (Branch) result6_green[9];

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
		case RulesPackage.WHILELD2BRANCHBB___IS_APPROPRIATE_FWD__MATCH_WHILE_ASSIGNMENT_WHILE_DECISION:
			return isAppropriate_FWD((Match) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(While) arguments.get(3), (Decision) arguments.get(4));
		case RulesPackage.WHILELD2BRANCHBB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WHILE_ASSIGNMENT_WHILE_DECISION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4));
			return null;
		case RulesPackage.WHILELD2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WHILE_ASSIGNMENT_WHILE_DECISION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_WHILE_ASSIGNMENT_WHILE_DECISION_S2B_BRANCH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4),
					(S2B) arguments.get(5), (Branch) arguments.get(6));
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
		case RulesPackage.WHILELD2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_COMMAND_WHILE_S2B_BRANCH_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (While) arguments.get(3), (S2B) arguments.get(4),
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
		case RulesPackage.WHILELD2BRANCHBB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_29__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_29((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_29__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_29((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_CC__BRANCH_COMMAND_WHILE_ASSIGNMENT_WHILE_DECISION_BRANCH_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Branch) arguments.get(0), (Command) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4),
					(Decision) arguments.get(5), (Branch) arguments.get(6), (Branch) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___CHECK_DEC_FWD__WHILE_ASSIGNMENT_WHILE_DECISION:
			return checkDEC_FWD((While) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2),
					(Decision) arguments.get(3));
		case RulesPackage.WHILELD2BRANCHBB___CHECK_DEC_BWD__BRANCH_COMMAND_BRANCH_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.WHILELD2BRANCHBB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILELD2BRANCHBB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_WHILE_S2B_BRANCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(S2B) arguments.get(2), (Branch) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILELD2BRANCHBB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whileld2branchbb_0_1_initialbindings_blackBBBBBB(whileld2branchbb _this,
			Match match, While a, Assignment b, While w, Decision c) {
		if (!a.equals(w)) {
			return new Object[] { _this, match, a, b, w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_0_2_SolveCSP_bindingFBBBBBB(whileld2branchbb _this,
			Match match, While a, Assignment b, While w, Decision c) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, a, b, w, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, a, b, w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileld2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBB(whileld2branchbb _this,
			Match match, While a, Assignment b, While w, Decision c) {
		Object[] result_pattern_whileld2branchbb_0_2_SolveCSP_binding = pattern_whileld2branchbb_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, a, b, w, c);
		if (result_pattern_whileld2branchbb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileld2branchbb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whileld2branchbb_0_2_SolveCSP_black = pattern_whileld2branchbb_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileld2branchbb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, a, b, w, c };
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
			While a, Assignment b, While w, Decision c) {
		if (!a.equals(w)) {
			return new Object[] { match, a, b, w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_0_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			While a, Assignment b, While w, Decision c) {
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(c);
		String w__c____next_name_prime = "next";
		String a__b____last_name_prime = "last";
		String w__a____first_name_prime = "first";
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____last);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		w__c____next.setName(w__c____next_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		return new Object[] { match, a, b, w, c, w__c____next, a__b____last, w__a____first };
	}

	public static final Object[] pattern_whileld2branchbb_0_5_collectcontextelements_blackBBBBB(Match match, While a,
			Assignment b, While w, Decision c) {
		if (!a.equals(w)) {
			return new Object[] { match, a, b, w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whileld2branchbb_0_6_registerobjectstomatch_expressionBBBBBB(
			whileld2branchbb _this, Match match, While a, Assignment b, While w, Decision c) {
		_this.registerObjectsToMatch_FWD(match, a, b, w, c);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("a");
		EObject _localVariable_1 = isApplicableMatch.getObject("b");
		EObject _localVariable_2 = isApplicableMatch.getObject("w");
		EObject _localVariable_3 = isApplicableMatch.getObject("c");
		EObject _localVariable_4 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_5 = isApplicableMatch.getObject("i");
		EObject tmpA = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpW2i = _localVariable_4;
		EObject tmpI = _localVariable_5;
		if (tmpA instanceof While) {
			While a = (While) tmpA;
			if (tmpB instanceof Assignment) {
				Assignment b = (Assignment) tmpB;
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					if (tmpC instanceof Decision) {
						Decision c = (Decision) tmpC;
						if (tmpW2i instanceof S2B) {
							S2B w2i = (S2B) tmpW2i;
							if (tmpI instanceof Branch) {
								Branch i = (Branch) tmpI;
								return new Object[] { a, b, w, c, w2i, i, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_1_1_performtransformation_blackBBBBBBFBB(While a,
			Assignment b, While w, Decision c, S2B w2i, Branch i, whileld2branchbb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!a.equals(w)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { a, b, w, c, w2i, i, csp, _this, isApplicableMatch };
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
			While a = (While) result_pattern_whileld2branchbb_1_1_performtransformation_binding[0];
			Assignment b = (Assignment) result_pattern_whileld2branchbb_1_1_performtransformation_binding[1];
			While w = (While) result_pattern_whileld2branchbb_1_1_performtransformation_binding[2];
			Decision c = (Decision) result_pattern_whileld2branchbb_1_1_performtransformation_binding[3];
			S2B w2i = (S2B) result_pattern_whileld2branchbb_1_1_performtransformation_binding[4];
			Branch i = (Branch) result_pattern_whileld2branchbb_1_1_performtransformation_binding[5];

			Object[] result_pattern_whileld2branchbb_1_1_performtransformation_black = pattern_whileld2branchbb_1_1_performtransformation_blackBBBBBBFBB(
					a, b, w, c, w2i, i, _this, isApplicableMatch);
			if (result_pattern_whileld2branchbb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileld2branchbb_1_1_performtransformation_black[6];

				return new Object[] { a, b, w, c, w2i, i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_1_1_performtransformation_greenFFFBBFBFFB(While a,
			Assignment b, Decision c, Branch i) {
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		i.setNegative(z);
		a2x.setSource(a);
		c2z.setTarget(z);
		c2z.setSource(c);
		b2y.setTarget(y);
		b2y.setSource(b);
		y.setNext(x);
		a2x.setTarget(x);
		i.setPositive(x);
		return new Object[] { z, a2x, y, a, b, c2z, c, b2y, x, i };
	}

	public static final Object[] pattern_whileld2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBB(Branch z,
			S2B a2x, Command y, While a, Assignment b, S2B c2z, Decision c, S2N b2y, Branch x) {
		if (!a2x.equals(c2z)) {
			if (!x.equals(z)) {
				return new Object[] { z, a2x, y, a, b, c2z, c, b2y, x };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBB(Branch z,
			S2B a2x, Command y, While a, Assignment b, S2B c2z, Decision c, S2N b2y, Branch x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(x);
		return new Object[] { ruleresult, z, a2x, y, a, b, c2z, c, b2y, x };
	}

	public static final Object[] pattern_whileld2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject z, EObject a2x, EObject y, EObject a, EObject b, EObject c2z,
			EObject w, EObject c, EObject b2y, EObject w2i, EObject x, EObject i) {
		if (!a2x.equals(z)) {
			if (!a2x.equals(y)) {
				if (!a2x.equals(b)) {
					if (!a2x.equals(c2z)) {
						if (!a2x.equals(w)) {
							if (!a2x.equals(c)) {
								if (!a2x.equals(b2y)) {
									if (!a2x.equals(w2i)) {
										if (!a2x.equals(x)) {
											if (!a2x.equals(i)) {
												if (!y.equals(z)) {
													if (!a.equals(z)) {
														if (!a.equals(a2x)) {
															if (!a.equals(y)) {
																if (!a.equals(b)) {
																	if (!a.equals(c2z)) {
																		if (!a.equals(w)) {
																			if (!a.equals(c)) {
																				if (!a.equals(b2y)) {
																					if (!a.equals(w2i)) {
																						if (!a.equals(x)) {
																							if (!a.equals(i)) {
																								if (!b.equals(z)) {
																									if (!b.equals(y)) {
																										if (!b.equals(
																												c2z)) {
																											if (!b.equals(
																													w)) {
																												if (!b.equals(
																														c)) {
																													if (!b.equals(
																															b2y)) {
																														if (!b.equals(
																																w2i)) {
																															if (!b.equals(
																																	x)) {
																																if (!b.equals(
																																		i)) {
																																	if (!c2z.equals(
																																			z)) {
																																		if (!c2z.equals(
																																				y)) {
																																			if (!c2z.equals(
																																					w)) {
																																				if (!c2z.equals(
																																						w2i)) {
																																					if (!c2z.equals(
																																							x)) {
																																						if (!c2z.equals(
																																								i)) {
																																							if (!w.equals(
																																									z)) {
																																								if (!w.equals(
																																										y)) {
																																									if (!w.equals(
																																											w2i)) {
																																										if (!w.equals(
																																												x)) {
																																											if (!c.equals(
																																													z)) {
																																												if (!c.equals(
																																														y)) {
																																													if (!c.equals(
																																															c2z)) {
																																														if (!c.equals(
																																																w)) {
																																															if (!c.equals(
																																																	w2i)) {
																																																if (!c.equals(
																																																		x)) {
																																																	if (!c.equals(
																																																			i)) {
																																																		if (!b2y.equals(
																																																				z)) {
																																																			if (!b2y.equals(
																																																					y)) {
																																																				if (!b2y.equals(
																																																						c2z)) {
																																																					if (!b2y.equals(
																																																							w)) {
																																																						if (!b2y.equals(
																																																								c)) {
																																																							if (!b2y.equals(
																																																									w2i)) {
																																																								if (!b2y.equals(
																																																										x)) {
																																																									if (!b2y.equals(
																																																											i)) {
																																																										if (!w2i.equals(
																																																												z)) {
																																																											if (!w2i.equals(
																																																													y)) {
																																																												if (!w2i.equals(
																																																														x)) {
																																																													if (!x.equals(
																																																															z)) {
																																																														if (!x.equals(
																																																																y)) {
																																																															if (!i.equals(
																																																																	z)) {
																																																																if (!i.equals(
																																																																		y)) {
																																																																	if (!i.equals(
																																																																			w)) {
																																																																		if (!i.equals(
																																																																				w2i)) {
																																																																			if (!i.equals(
																																																																					x)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						z,
																																																																						a2x,
																																																																						y,
																																																																						a,
																																																																						b,
																																																																						c2z,
																																																																						w,
																																																																						c,
																																																																						b2y,
																																																																						w2i,
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
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject z, EObject a2x, EObject y, EObject a, EObject b, EObject c2z,
			EObject w, EObject c, EObject b2y, EObject x, EObject i) {
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileld2branchbb";
		String y__x____next_name_prime = "next";
		String a2x__a____source_name_prime = "source";
		String c2z__z____target_name_prime = "target";
		String w__c____next_name_prime = "next";
		String a__b____last_name_prime = "last";
		String c2z__c____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String i__x____positive_name_prime = "positive";
		String w__a____first_name_prime = "first";
		String i__z____negative_name_prime = "negative";
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(y__x____next);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		y__x____next.setName(y__x____next_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		return new Object[] { ruleresult, z, a2x, y, a, b, c2z, w, c, b2y, x, i, y__x____next, a2x__a____source,
				c2z__z____target, w__c____next, a__b____last, c2z__c____source, b2y__y____target, b2y__b____source,
				a2x__x____target, i__x____positive, w__a____first, i__z____negative };
	}

	public static final void pattern_whileld2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whileld2branchbb _this, PerformRuleResult ruleresult, EObject z, EObject a2x, EObject y, EObject a,
			EObject b, EObject c2z, EObject w, EObject c, EObject b2y, EObject w2i, EObject x, EObject i) {
		_this.registerObjects_FWD(ruleresult, z, a2x, y, a, b, c2z, w, c, b2y, w2i, x, i);

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
		EObject _localVariable_0 = match.getObject("a");
		EObject _localVariable_1 = match.getObject("b");
		EObject _localVariable_2 = match.getObject("w");
		EObject _localVariable_3 = match.getObject("c");
		EObject tmpA = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpC = _localVariable_3;
		if (tmpA instanceof While) {
			While a = (While) tmpA;
			if (tmpB instanceof Assignment) {
				Assignment b = (Assignment) tmpB;
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					if (tmpC instanceof Decision) {
						Decision c = (Decision) tmpC;
						return new Object[] { a, b, w, c, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileld2branchbb_2_2_corematch_blackBBBBFFB(While a, Assignment b,
			While w, Decision c, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				Branch i = w2i.getTarget();
				if (i != null) {
					_result.add(new Object[] { a, b, w, c, w2i, i, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileld2branchbb_2_3_findcontext_blackBBBBBB(While a, Assignment b,
			While w, Decision c, S2B w2i, Branch i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			if (c.equals(w.getNext())) {
				if (b.equals(a.getLast())) {
					if (a.equals(w.getFirst())) {
						if (w.equals(w2i.getSource())) {
							if (i.equals(w2i.getTarget())) {
								_result.add(new Object[] { a, b, w, c, w2i, i });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whileld2branchbb_2_3_findcontext_greenBBBBBBFFFFFF(While a, Assignment b,
			While w, Decision c, S2B w2i, Branch i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w__c____next_name_prime = "next";
		String a__b____last_name_prime = "last";
		String w__a____first_name_prime = "first";
		String w2i__w____source_name_prime = "source";
		String w2i__i____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(i);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____last);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w__c____next.setName(w__c____next_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		return new Object[] { a, b, w, c, w2i, i, isApplicableMatch, w__c____next, a__b____last, w__a____first,
				w2i__w____source, w2i__i____target };
	}

	public static final Object[] pattern_whileld2branchbb_2_4_solveCSP_bindingFBBBBBBBB(whileld2branchbb _this,
			IsApplicableMatch isApplicableMatch, While a, Assignment b, While w, Decision c, S2B w2i, Branch i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, a, b, w, c, w2i, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, a, b, w, c, w2i, i };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileld2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(whileld2branchbb _this,
			IsApplicableMatch isApplicableMatch, While a, Assignment b, While w, Decision c, S2B w2i, Branch i) {
		Object[] result_pattern_whileld2branchbb_2_4_solveCSP_binding = pattern_whileld2branchbb_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, a, b, w, c, w2i, i);
		if (result_pattern_whileld2branchbb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileld2branchbb_2_4_solveCSP_binding[0];

			Object[] result_pattern_whileld2branchbb_2_4_solveCSP_black = pattern_whileld2branchbb_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileld2branchbb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, a, b, w, c, w2i, i };
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
			Match match, Branch z, Command y, Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					return new Object[] { _this, match, z, y, x, i };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_10_2_SolveCSP_bindingFBBBBBB(whileld2branchbb _this,
			Match match, Branch z, Command y, Branch x, Branch i) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, z, y, x, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, z, y, x, i };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileld2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBB(whileld2branchbb _this,
			Match match, Branch z, Command y, Branch x, Branch i) {
		Object[] result_pattern_whileld2branchbb_10_2_SolveCSP_binding = pattern_whileld2branchbb_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, z, y, x, i);
		if (result_pattern_whileld2branchbb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileld2branchbb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whileld2branchbb_10_2_SolveCSP_black = pattern_whileld2branchbb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileld2branchbb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, z, y, x, i };
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
			Branch z, Command y, Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					return new Object[] { match, z, y, x, i };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_10_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			Branch z, Command y, Branch x, Branch i) {
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(x);
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
		return new Object[] { match, z, y, x, i, y__x____next, i__x____positive, i__z____negative };
	}

	public static final Object[] pattern_whileld2branchbb_10_5_collectcontextelements_blackBBBBB(Match match, Branch z,
			Command y, Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					return new Object[] { match, z, y, x, i };
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
			whileld2branchbb _this, Match match, Branch z, Command y, Branch x, Branch i) {
		_this.registerObjectsToMatch_BWD(match, z, y, x, i);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("z");
		EObject _localVariable_1 = isApplicableMatch.getObject("y");
		EObject _localVariable_2 = isApplicableMatch.getObject("w");
		EObject _localVariable_3 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_4 = isApplicableMatch.getObject("x");
		EObject _localVariable_5 = isApplicableMatch.getObject("i");
		EObject tmpZ = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpW2i = _localVariable_3;
		EObject tmpX = _localVariable_4;
		EObject tmpI = _localVariable_5;
		if (tmpZ instanceof Branch) {
			Branch z = (Branch) tmpZ;
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					if (tmpW2i instanceof S2B) {
						S2B w2i = (S2B) tmpW2i;
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							if (tmpI instanceof Branch) {
								Branch i = (Branch) tmpI;
								return new Object[] { z, y, w, w2i, x, i, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_11_1_performtransformation_blackBBBBBBFBB(Branch z, Command y,
			While w, S2B w2i, Branch x, Branch i, whileld2branchbb _this, IsApplicableMatch isApplicableMatch) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { z, y, w, w2i, x, i, csp, _this, isApplicableMatch };
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
			Branch z = (Branch) result_pattern_whileld2branchbb_11_1_performtransformation_binding[0];
			Command y = (Command) result_pattern_whileld2branchbb_11_1_performtransformation_binding[1];
			While w = (While) result_pattern_whileld2branchbb_11_1_performtransformation_binding[2];
			S2B w2i = (S2B) result_pattern_whileld2branchbb_11_1_performtransformation_binding[3];
			Branch x = (Branch) result_pattern_whileld2branchbb_11_1_performtransformation_binding[4];
			Branch i = (Branch) result_pattern_whileld2branchbb_11_1_performtransformation_binding[5];

			Object[] result_pattern_whileld2branchbb_11_1_performtransformation_black = pattern_whileld2branchbb_11_1_performtransformation_blackBBBBBBFBB(
					z, y, w, w2i, x, i, _this, isApplicableMatch);
			if (result_pattern_whileld2branchbb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileld2branchbb_11_1_performtransformation_black[6];

				return new Object[] { z, y, w, w2i, x, i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_11_1_performtransformation_greenBFBFFFBFFB(Branch z,
			Command y, While w, Branch x) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision c = SourcecodeFactory.eINSTANCE.createDecision();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2x.setTarget(x);
		a2x.setSource(a);
		w.setFirst(a);
		a.setLast(b);
		c2z.setTarget(z);
		w.setNext(c);
		c2z.setSource(c);
		b2y.setTarget(y);
		b2y.setSource(b);
		return new Object[] { z, a2x, y, a, b, c2z, w, c, b2y, x };
	}

	public static final Object[] pattern_whileld2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBB(Branch z,
			S2B a2x, Command y, While a, Assignment b, S2B c2z, Decision c, S2N b2y, Branch x) {
		if (!a2x.equals(c2z)) {
			if (!x.equals(z)) {
				return new Object[] { z, a2x, y, a, b, c2z, c, b2y, x };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBB(Branch z,
			S2B a2x, Command y, While a, Assignment b, S2B c2z, Decision c, S2N b2y, Branch x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(x);
		return new Object[] { ruleresult, z, a2x, y, a, b, c2z, c, b2y, x };
	}

	public static final Object[] pattern_whileld2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject z, EObject a2x, EObject y, EObject a, EObject b, EObject c2z,
			EObject w, EObject c, EObject b2y, EObject w2i, EObject x, EObject i) {
		if (!a2x.equals(z)) {
			if (!a2x.equals(y)) {
				if (!a2x.equals(b)) {
					if (!a2x.equals(c2z)) {
						if (!a2x.equals(w)) {
							if (!a2x.equals(c)) {
								if (!a2x.equals(b2y)) {
									if (!a2x.equals(w2i)) {
										if (!a2x.equals(x)) {
											if (!a2x.equals(i)) {
												if (!y.equals(z)) {
													if (!a.equals(z)) {
														if (!a.equals(a2x)) {
															if (!a.equals(y)) {
																if (!a.equals(b)) {
																	if (!a.equals(c2z)) {
																		if (!a.equals(w)) {
																			if (!a.equals(c)) {
																				if (!a.equals(b2y)) {
																					if (!a.equals(w2i)) {
																						if (!a.equals(x)) {
																							if (!a.equals(i)) {
																								if (!b.equals(z)) {
																									if (!b.equals(y)) {
																										if (!b.equals(
																												c2z)) {
																											if (!b.equals(
																													w)) {
																												if (!b.equals(
																														c)) {
																													if (!b.equals(
																															b2y)) {
																														if (!b.equals(
																																w2i)) {
																															if (!b.equals(
																																	x)) {
																																if (!b.equals(
																																		i)) {
																																	if (!c2z.equals(
																																			z)) {
																																		if (!c2z.equals(
																																				y)) {
																																			if (!c2z.equals(
																																					w)) {
																																				if (!c2z.equals(
																																						w2i)) {
																																					if (!c2z.equals(
																																							x)) {
																																						if (!c2z.equals(
																																								i)) {
																																							if (!w.equals(
																																									z)) {
																																								if (!w.equals(
																																										y)) {
																																									if (!w.equals(
																																											w2i)) {
																																										if (!w.equals(
																																												x)) {
																																											if (!c.equals(
																																													z)) {
																																												if (!c.equals(
																																														y)) {
																																													if (!c.equals(
																																															c2z)) {
																																														if (!c.equals(
																																																w)) {
																																															if (!c.equals(
																																																	w2i)) {
																																																if (!c.equals(
																																																		x)) {
																																																	if (!c.equals(
																																																			i)) {
																																																		if (!b2y.equals(
																																																				z)) {
																																																			if (!b2y.equals(
																																																					y)) {
																																																				if (!b2y.equals(
																																																						c2z)) {
																																																					if (!b2y.equals(
																																																							w)) {
																																																						if (!b2y.equals(
																																																								c)) {
																																																							if (!b2y.equals(
																																																									w2i)) {
																																																								if (!b2y.equals(
																																																										x)) {
																																																									if (!b2y.equals(
																																																											i)) {
																																																										if (!w2i.equals(
																																																												z)) {
																																																											if (!w2i.equals(
																																																													y)) {
																																																												if (!w2i.equals(
																																																														x)) {
																																																													if (!x.equals(
																																																															z)) {
																																																														if (!x.equals(
																																																																y)) {
																																																															if (!i.equals(
																																																																	z)) {
																																																																if (!i.equals(
																																																																		y)) {
																																																																	if (!i.equals(
																																																																			w)) {
																																																																		if (!i.equals(
																																																																				w2i)) {
																																																																			if (!i.equals(
																																																																					x)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						z,
																																																																						a2x,
																																																																						y,
																																																																						a,
																																																																						b,
																																																																						c2z,
																																																																						w,
																																																																						c,
																																																																						b2y,
																																																																						w2i,
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
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject z, EObject a2x, EObject y, EObject a, EObject b, EObject c2z,
			EObject w, EObject c, EObject b2y, EObject x, EObject i) {
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileld2branchbb";
		String y__x____next_name_prime = "next";
		String a2x__a____source_name_prime = "source";
		String c2z__z____target_name_prime = "target";
		String w__c____next_name_prime = "next";
		String a__b____last_name_prime = "last";
		String c2z__c____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String i__x____positive_name_prime = "positive";
		String w__a____first_name_prime = "first";
		String i__z____negative_name_prime = "negative";
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(y__x____next);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		y__x____next.setName(y__x____next_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		return new Object[] { ruleresult, z, a2x, y, a, b, c2z, w, c, b2y, x, i, y__x____next, a2x__a____source,
				c2z__z____target, w__c____next, a__b____last, c2z__c____source, b2y__y____target, b2y__b____source,
				a2x__x____target, i__x____positive, w__a____first, i__z____negative };
	}

	public static final void pattern_whileld2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whileld2branchbb _this, PerformRuleResult ruleresult, EObject z, EObject a2x, EObject y, EObject a,
			EObject b, EObject c2z, EObject w, EObject c, EObject b2y, EObject w2i, EObject x, EObject i) {
		_this.registerObjects_BWD(ruleresult, z, a2x, y, a, b, c2z, w, c, b2y, w2i, x, i);

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
		EObject _localVariable_0 = match.getObject("z");
		EObject _localVariable_1 = match.getObject("y");
		EObject _localVariable_2 = match.getObject("x");
		EObject _localVariable_3 = match.getObject("i");
		EObject tmpZ = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpX = _localVariable_2;
		EObject tmpI = _localVariable_3;
		if (tmpZ instanceof Branch) {
			Branch z = (Branch) tmpZ;
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (tmpX instanceof Branch) {
					Branch x = (Branch) tmpX;
					if (tmpI instanceof Branch) {
						Branch i = (Branch) tmpI;
						return new Object[] { z, y, x, i, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileld2branchbb_12_2_corematch_blackBBFFBBB(Branch z, Command y,
			Branch x, Branch i, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class,
							"target")) {
						Statement tmpW = w2i.getSource();
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							_result.add(new Object[] { z, y, w, w2i, x, i, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileld2branchbb_12_3_findcontext_blackBBBBBB(Branch z, Command y,
			While w, S2B w2i, Branch x, Branch i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					if (x.equals(y.getNext())) {
						if (x.equals(i.getPositive())) {
							if (w.equals(w2i.getSource())) {
								if (i.equals(w2i.getTarget())) {
									if (z.equals(i.getNegative())) {
										_result.add(new Object[] { z, y, w, w2i, x, i });
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

	public static final Object[] pattern_whileld2branchbb_12_3_findcontext_greenBBBBBBFFFFFF(Branch z, Command y,
			While w, S2B w2i, Branch x, Branch i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String y__x____next_name_prime = "next";
		String i__x____positive_name_prime = "positive";
		String w2i__w____source_name_prime = "source";
		String w2i__i____target_name_prime = "target";
		String i__z____negative_name_prime = "negative";
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(i);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(y__x____next);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		y__x____next.setName(y__x____next_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		return new Object[] { z, y, w, w2i, x, i, isApplicableMatch, y__x____next, i__x____positive, w2i__w____source,
				w2i__i____target, i__z____negative };
	}

	public static final Object[] pattern_whileld2branchbb_12_4_solveCSP_bindingFBBBBBBBB(whileld2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch z, Command y, While w, S2B w2i, Branch x, Branch i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, z, y, w, w2i, x, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, z, y, w, w2i, x, i };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileld2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(whileld2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch z, Command y, While w, S2B w2i, Branch x, Branch i) {
		Object[] result_pattern_whileld2branchbb_12_4_solveCSP_binding = pattern_whileld2branchbb_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, z, y, w, w2i, x, i);
		if (result_pattern_whileld2branchbb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileld2branchbb_12_4_solveCSP_binding[0];

			Object[] result_pattern_whileld2branchbb_12_4_solveCSP_black = pattern_whileld2branchbb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileld2branchbb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, z, y, w, w2i, x, i };
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

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_0B(Branch z) {
		for (Graph __DEC_z_root_279064 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_1BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_positive_126878 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_126878)) {
							if (!x.equals(__DEC_z_positive_126878)) {
								if (!i.equals(__DEC_z_positive_126878)) {
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

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_2BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_negative_130822 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_130822)) {
							if (!x.equals(__DEC_z_negative_130822)) {
								if (!i.equals(__DEC_z_negative_130822)) {
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

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_541969 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_4BBBB(Command y, Branch z,
			Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_y_positive_71933 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!z.equals(__DEC_y_positive_71933)) {
							if (!x.equals(__DEC_y_positive_71933)) {
								if (!i.equals(__DEC_y_positive_71933)) {
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

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_5BBBB(Command y, Branch z,
			Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_y_negative_140126 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!z.equals(__DEC_y_negative_140126)) {
							if (!x.equals(__DEC_y_negative_140126)) {
								if (!i.equals(__DEC_y_negative_140126)) {
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

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_652749 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_7BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_667765 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_667765)) {
							if (!z.equals(__DEC_x_positive_667765)) {
								if (!i.equals(__DEC_x_positive_667765)) {
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

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_8BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_779702 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_779702)) {
							if (!z.equals(__DEC_x_negative_779702)) {
								if (!i.equals(__DEC_x_negative_779702)) {
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

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_9BB(Branch z, Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_10BB(Branch x,
			Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_11BB(Branch i,
			Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_12BB(Branch z,
			Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_13BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_14BB(Branch i,
			Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_15BB(Branch z, Branch x) {
		if (x.equals(z.getPositive())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_16BB(Branch z, Branch x) {
		if (x.equals(z.getNegative())) {
			return new Object[] { z, x };
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
						if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_6B(x) == null) {
							if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_10BB(x, y) == null) {
								if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_13BB(x, y) == null) {
									for (Branch i : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(x, Branch.class, "positive")) {
										if (!i.equals(x)) {
											Node tmpZ = i.getNegative();
											if (tmpZ instanceof Branch) {
												Branch z = (Branch) tmpZ;
												if (!x.equals(z)) {
													if (!i.equals(z)) {
														if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_11BB(
																i, y) == null) {
															if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_14BB(
																	i, y) == null) {
																if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_0B(
																		z) == null) {
																	if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_1BBB(
																			z, x, i) == null) {
																		if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_2BBB(
																				z, x, i) == null) {
																			if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_4BBBB(
																					y, z, x, i) == null) {
																				if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_5BBBB(
																						y, z, x, i) == null) {
																					if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_7BBB(
																							x, z, i) == null) {
																						if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_8BBB(
																								x, z, i) == null) {
																							if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_9BB(
																									z, y) == null) {
																								if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_12BB(
																										z, y) == null) {
																									if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_15BB(
																											z,
																											x) == null) {
																										if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_16BB(
																												z,
																												x) == null) {
																											_result.add(
																													new Object[] {
																															z,
																															y,
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
			whileld2branchbb _this, Match match, Branch z, Command y, Branch x, Branch i) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, z, y, x, i);
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

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_0BB(While a, Decision c) {
		for (Decision __DEC_a_positive_736815 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_a_positive_736815)) {
				return new Object[] { a, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_1BB(While a, Decision c) {
		for (Decision __DEC_a_negative_603124 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_a_negative_603124)) {
				return new Object[] { a, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_2BB(While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_a_last_504978 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_504978)) {
					if (!w.equals(__DEC_a_last_504978)) {
						return new Object[] { a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_3B(While a) {
		for (Program __DEC_a_first_204443 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_4BB(Assignment b,
			Decision c) {
		for (Decision __DEC_b_positive_108974 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_b_positive_108974)) {
				return new Object[] { b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_5BB(Assignment b,
			Decision c) {
		for (Decision __DEC_b_negative_967713 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_b_negative_967713)) {
				return new Object[] { b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_6BBB(Assignment b,
			While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_b_first_819810 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!a.equals(__DEC_b_first_819810)) {
					if (!w.equals(__DEC_b_first_819810)) {
						return new Object[] { b, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_7BBB(Assignment b,
			While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_b_last_928341 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!a.equals(__DEC_b_last_928341)) {
					if (!w.equals(__DEC_b_last_928341)) {
						return new Object[] { b, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_8B(Assignment b) {
		for (Program __DEC_b_first_485204 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_9B(Decision c) {
		for (Decision __DEC_c_positive_357584 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_c_positive_357584)) {
				return new Object[] { c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_10B(Decision c) {
		for (Decision __DEC_c_negative_239700 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_c_negative_239700)) {
				return new Object[] { c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_11BBB(Decision c, While a,
			While w) {
		if (!a.equals(w)) {
			for (While __DEC_c_first_643721 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!a.equals(__DEC_c_first_643721)) {
					if (!w.equals(__DEC_c_first_643721)) {
						return new Object[] { c, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_12BBB(Decision c, While a,
			While w) {
		if (!a.equals(w)) {
			for (While __DEC_c_last_749576 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!a.equals(__DEC_c_last_749576)) {
					if (!w.equals(__DEC_c_last_749576)) {
						return new Object[] { c, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_13B(Decision c) {
		for (Program __DEC_c_first_741055 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_14BB(Decision c,
			While a) {
		if (a.equals(c.getPositive())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_15BB(Decision c,
			While a) {
		if (a.equals(c.getNegative())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_16BB(Decision c,
			Assignment b) {
		if (b.equals(c.getPositive())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_17BB(Decision c,
			Assignment b) {
		if (b.equals(c.getNegative())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_18BB(While a,
			Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_19BB(While w,
			Assignment b) {
		if (b.equals(w.getFirst())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_20BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_21BB(While a,
			Decision c) {
		if (c.equals(a.getFirst())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_22BB(While w,
			Decision c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_23BB(While a,
			Decision c) {
		if (c.equals(a.getLast())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_24BB(While w,
			Decision c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
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
								if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_9B(c) == null) {
									if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_10B(c) == null) {
										if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_13B(
												c) == null) {
											if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_22BB(w,
													c) == null) {
												if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_24BB(w,
														c) == null) {
													if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_0BB(
															a, c) == null) {
														if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_1BB(
																a, c) == null) {
															if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_2BB(
																	a, w) == null) {
																if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_3B(
																		a) == null) {
																	if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_11BBB(
																			c, a, w) == null) {
																		if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_12BBB(
																				c, a, w) == null) {
																			if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_14BB(
																					c, a) == null) {
																				if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_15BB(
																						c, a) == null) {
																					if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_21BB(
																							a, c) == null) {
																						if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_23BB(
																								a, c) == null) {
																							if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_4BB(
																									b, c) == null) {
																								if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_5BB(
																										b, c) == null) {
																									if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_6BBB(
																											b, a,
																											w) == null) {
																										if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_7BBB(
																												b, a,
																												w) == null) {
																											if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_8B(
																													b) == null) {
																												if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_16BB(
																														c,
																														b) == null) {
																													if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_17BB(
																															c,
																															b) == null) {
																														if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_18BB(
																																a,
																																b) == null) {
																															if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_19BB(
																																	w,
																																	b) == null) {
																																if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_20BB(
																																		w,
																																		b) == null) {
																																	_result.add(
																																			new Object[] {
																																					a,
																																					b,
																																					w,
																																					c,
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
			whileld2branchbb _this, Match match, While a, Assignment b, While w, Decision c) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, a, b, w, c);
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
		EObject _localVariable_0 = targetMatch.getObject("z");
		EObject _localVariable_1 = targetMatch.getObject("y");
		EObject _localVariable_2 = sourceMatch.getObject("a");
		EObject _localVariable_3 = sourceMatch.getObject("b");
		EObject _localVariable_4 = sourceMatch.getObject("w");
		EObject _localVariable_5 = sourceMatch.getObject("c");
		EObject _localVariable_6 = targetMatch.getObject("x");
		EObject _localVariable_7 = targetMatch.getObject("i");
		EObject tmpZ = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpB = _localVariable_3;
		EObject tmpW = _localVariable_4;
		EObject tmpC = _localVariable_5;
		EObject tmpX = _localVariable_6;
		EObject tmpI = _localVariable_7;
		if (tmpZ instanceof Branch) {
			Branch z = (Branch) tmpZ;
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpB instanceof Assignment) {
						Assignment b = (Assignment) tmpB;
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							if (tmpC instanceof Decision) {
								Decision c = (Decision) tmpC;
								if (tmpX instanceof Branch) {
									Branch x = (Branch) tmpX;
									if (tmpI instanceof Branch) {
										Branch i = (Branch) tmpI;
										return new Object[] { z, y, a, b, w, c, x, i, targetMatch, sourceMatch };
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

	public static final Object[] pattern_whileld2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Branch z, Command y,
			While a, Assignment b, While w, Decision c, Branch x, Branch i, Match sourceMatch, Match targetMatch) {
		if (!a.equals(w)) {
			if (!x.equals(z)) {
				if (!i.equals(z)) {
					if (!i.equals(x)) {
						if (!sourceMatch.equals(targetMatch)) {
							return new Object[] { z, y, a, b, w, c, x, i, sourceMatch, targetMatch };
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
			Branch z = (Branch) result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_binding[0];
			Command y = (Command) result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_binding[1];
			While a = (While) result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_binding[2];
			Assignment b = (Assignment) result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_binding[3];
			While w = (While) result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_binding[4];
			Decision c = (Decision) result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_binding[5];
			Branch x = (Branch) result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_binding[6];
			Branch i = (Branch) result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_black = pattern_whileld2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					z, y, a, b, w, c, x, i, sourceMatch, targetMatch);
			if (result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { z, y, a, b, w, c, x, i, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBB(whileld2branchbb _this,
			Branch z, Command y, While a, Assignment b, While w, Decision c, Branch x, Branch i, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(z, y, a, b, w, c, x, i, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, z, y, a, b, w, c, x, i, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileld2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			whileld2branchbb _this, Branch z, Command y, While a, Assignment b, While w, Decision c, Branch x, Branch i,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileld2branchbb_24_3_solvecsp_binding = pattern_whileld2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, z, y, a, b, w, c, x, i, sourceMatch, targetMatch);
		if (result_pattern_whileld2branchbb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whileld2branchbb_24_3_solvecsp_binding[0];

			Object[] result_pattern_whileld2branchbb_24_3_solvecsp_black = pattern_whileld2branchbb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whileld2branchbb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, z, y, a, b, w, c, x, i, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whileld2branchbb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileld2branchbb_24_5_matchcorrcontext_blackBFBBB(While w, Branch i,
			Match sourceMatch, Match targetMatch) {
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

	public static final Object[] pattern_whileld2branchbb_24_6_createcorrespondence_blackBBBBBBBBB(Branch z, Command y,
			While a, Assignment b, While w, Decision c, Branch x, Branch i, CCMatch ccMatch) {
		if (!a.equals(w)) {
			if (!x.equals(z)) {
				if (!i.equals(z)) {
					if (!i.equals(x)) {
						return new Object[] { z, y, a, b, w, c, x, i, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_24_6_createcorrespondence_greenBFBBBFBFBB(Branch z, Command y,
			While a, Assignment b, Decision c, Branch x, CCMatch ccMatch) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		c2z.setTarget(z);
		c2z.setSource(c);
		ccMatch.getCreateCorr().add(c2z);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		return new Object[] { z, a2x, y, a, b, c2z, c, b2y, x, ccMatch };
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

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_0BB(While a, Decision c) {
		for (Decision __DEC_a_positive_117283 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_a_positive_117283)) {
				return new Object[] { a, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_1BB(While a, Decision c) {
		for (Decision __DEC_a_negative_415672 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_a_negative_415672)) {
				return new Object[] { a, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_2BB(While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_a_last_271106 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_271106)) {
					if (!w.equals(__DEC_a_last_271106)) {
						return new Object[] { a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_3B(While a) {
		for (Program __DEC_a_first_696372 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_4BB(Assignment b, Decision c) {
		for (Decision __DEC_b_positive_36045 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_b_positive_36045)) {
				return new Object[] { b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_5BB(Assignment b, Decision c) {
		for (Decision __DEC_b_negative_730902 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_b_negative_730902)) {
				return new Object[] { b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_6BBB(Assignment b, While a,
			While w) {
		if (!a.equals(w)) {
			for (While __DEC_b_first_480437 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!a.equals(__DEC_b_first_480437)) {
					if (!w.equals(__DEC_b_first_480437)) {
						return new Object[] { b, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_7BBB(Assignment b, While a,
			While w) {
		if (!a.equals(w)) {
			for (While __DEC_b_last_596612 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!a.equals(__DEC_b_last_596612)) {
					if (!w.equals(__DEC_b_last_596612)) {
						return new Object[] { b, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_8B(Assignment b) {
		for (Program __DEC_b_first_324821 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_9B(Decision c) {
		for (Decision __DEC_c_positive_566038 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_c_positive_566038)) {
				return new Object[] { c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_10B(Decision c) {
		for (Decision __DEC_c_negative_52151 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_c_negative_52151)) {
				return new Object[] { c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_11BBB(Decision c, While a,
			While w) {
		if (!a.equals(w)) {
			for (While __DEC_c_first_897818 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!a.equals(__DEC_c_first_897818)) {
					if (!w.equals(__DEC_c_first_897818)) {
						return new Object[] { c, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_12BBB(Decision c, While a,
			While w) {
		if (!a.equals(w)) {
			for (While __DEC_c_last_256177 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!a.equals(__DEC_c_last_256177)) {
					if (!w.equals(__DEC_c_last_256177)) {
						return new Object[] { c, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_13B(Decision c) {
		for (Program __DEC_c_first_651328 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_14BB(Decision c, While a) {
		if (a.equals(c.getPositive())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_15BB(Decision c, While a) {
		if (a.equals(c.getNegative())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_16BB(Decision c,
			Assignment b) {
		if (b.equals(c.getPositive())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_17BB(Decision c,
			Assignment b) {
		if (b.equals(c.getNegative())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_18BB(While a, Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_19BB(While w, Assignment b) {
		if (b.equals(w.getFirst())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_20BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_21BB(While a, Decision c) {
		if (c.equals(a.getFirst())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_22BB(While w, Decision c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_23BB(While a, Decision c) {
		if (c.equals(a.getLast())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_24BB(While w, Decision c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_blackBBBB(While a, Assignment b, While w,
			Decision c) {
		if (!a.equals(w)) {
			if (c.equals(w.getNext())) {
				if (b.equals(a.getLast())) {
					if (a.equals(w.getFirst())) {
						if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_0BB(a, c) == null) {
							if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_1BB(a, c) == null) {
								if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_2BB(a, w) == null) {
									if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_3B(a) == null) {
										if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_4BB(b, c) == null) {
											if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_5BB(b,
													c) == null) {
												if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_6BBB(b, a,
														w) == null) {
													if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_7BBB(b,
															a, w) == null) {
														if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_8B(
																b) == null) {
															if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_9B(
																	c) == null) {
																if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_10B(
																		c) == null) {
																	if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_11BBB(
																			c, a, w) == null) {
																		if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_12BBB(
																				c, a, w) == null) {
																			if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_13B(
																					c) == null) {
																				if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_14BB(
																						c, a) == null) {
																					if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_15BB(
																							c, a) == null) {
																						if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_16BB(
																								c, b) == null) {
																							if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_17BB(
																									c, b) == null) {
																								if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_18BB(
																										a, b) == null) {
																									if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_19BB(
																											w,
																											b) == null) {
																										if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_20BB(
																												w,
																												b) == null) {
																											if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_21BB(
																													a,
																													c) == null) {
																												if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_22BB(
																														w,
																														c) == null) {
																													if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_23BB(
																															a,
																															c) == null) {
																														if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_24BB(
																																w,
																																c) == null) {
																															return new Object[] {
																																	a,
																																	b,
																																	w,
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

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_0B(Branch z) {
		for (Graph __DEC_z_root_263801 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_1BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_positive_511390 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_511390)) {
							if (!x.equals(__DEC_z_positive_511390)) {
								if (!i.equals(__DEC_z_positive_511390)) {
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

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_2BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_negative_208331 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_208331)) {
							if (!x.equals(__DEC_z_negative_208331)) {
								if (!i.equals(__DEC_z_negative_208331)) {
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

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_605159 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_4BBBB(Command y, Branch z,
			Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_y_positive_354620 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!z.equals(__DEC_y_positive_354620)) {
							if (!x.equals(__DEC_y_positive_354620)) {
								if (!i.equals(__DEC_y_positive_354620)) {
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

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_5BBBB(Command y, Branch z,
			Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_y_negative_407247 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!z.equals(__DEC_y_negative_407247)) {
							if (!x.equals(__DEC_y_negative_407247)) {
								if (!i.equals(__DEC_y_negative_407247)) {
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

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_170986 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_7BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_187309 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_187309)) {
							if (!z.equals(__DEC_x_positive_187309)) {
								if (!i.equals(__DEC_x_positive_187309)) {
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

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_8BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_134211 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_134211)) {
							if (!z.equals(__DEC_x_negative_134211)) {
								if (!i.equals(__DEC_x_negative_134211)) {
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

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_9BB(Branch z, Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_10BB(Branch x, Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_11BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_12BB(Branch z, Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_13BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_14BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_15BB(Branch z, Branch x) {
		if (x.equals(z.getPositive())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_16BB(Branch z, Branch x) {
		if (x.equals(z.getNegative())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_blackBBBB(Branch z, Command y, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					if (x.equals(y.getNext())) {
						if (x.equals(i.getPositive())) {
							if (z.equals(i.getNegative())) {
								if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_0B(z) == null) {
									if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_1BBB(z, x, i) == null) {
										if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_2BBB(z, x,
												i) == null) {
											if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_3B(y) == null) {
												if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_4BBBB(y, z,
														x, i) == null) {
													if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_5BBBB(y,
															z, x, i) == null) {
														if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_6B(
																x) == null) {
															if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_7BBB(
																	x, z, i) == null) {
																if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_8BBB(
																		x, z, i) == null) {
																	if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_9BB(
																			z, y) == null) {
																		if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_10BB(
																				x, y) == null) {
																			if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_11BB(
																					i, y) == null) {
																				if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_12BB(
																						z, y) == null) {
																					if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_13BB(
																							x, y) == null) {
																						if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_14BB(
																								i, y) == null) {
																							if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_15BB(
																									z, x) == null) {
																								if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_16BB(
																										z, x) == null) {
																									return new Object[] {
																											z, y, x,
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
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
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
							if (pattern_whileld2branchbb_29_2_isapplicablecore_black_nac_1BB(ruleResult, w2i) == null) {
								if (pattern_whileld2branchbb_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										w) == null) {
									if (pattern_whileld2branchbb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_whileld2branchbb_29_3_solveCSP_bindingFBBBBBB(whileld2branchbb _this,
			IsApplicableMatch isApplicableMatch, While w, S2B w2i, Branch i, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, w, w2i, i, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, w2i, i, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileld2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(whileld2branchbb _this,
			IsApplicableMatch isApplicableMatch, While w, S2B w2i, Branch i, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whileld2branchbb_29_3_solveCSP_binding = pattern_whileld2branchbb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, w, w2i, i, ruleResult);
		if (result_pattern_whileld2branchbb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileld2branchbb_29_3_solveCSP_binding[0];

			Object[] result_pattern_whileld2branchbb_29_3_solveCSP_black = pattern_whileld2branchbb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whileld2branchbb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, w2i, i, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whileld2branchbb_29_4_checkCSP_expressionFBB(whileld2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileld2branchbb_29_5_checknacs_blackBBB(While w, S2B w2i, Branch i) {
		return new Object[] { w, w2i, i };
	}

	public static final Object[] pattern_whileld2branchbb_29_6_perform_blackBBBB(While w, S2B w2i, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { w, w2i, i, ruleResult };
	}

	public static final Object[] pattern_whileld2branchbb_29_6_perform_greenFFFFFFBFFFBB(While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision c = SourcecodeFactory.eINSTANCE.createDecision();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		i.setNegative(z);
		ruleResult.getTargetObjects().add(z);
		ruleResult.getCorrObjects().add(a2x);
		ruleResult.getTargetObjects().add(y);
		a2x.setSource(a);
		w.setFirst(a);
		ruleResult.getSourceObjects().add(a);
		a.setLast(b);
		ruleResult.getSourceObjects().add(b);
		c2z.setTarget(z);
		ruleResult.getCorrObjects().add(c2z);
		w.setNext(c);
		c2z.setSource(c);
		ruleResult.getSourceObjects().add(c);
		b2y.setTarget(y);
		b2y.setSource(b);
		ruleResult.getCorrObjects().add(b2y);
		y.setNext(x);
		a2x.setTarget(x);
		i.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { z, a2x, y, a, b, c2z, w, c, b2y, x, i, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whileld2branchbb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whileld2branchbbImpl
