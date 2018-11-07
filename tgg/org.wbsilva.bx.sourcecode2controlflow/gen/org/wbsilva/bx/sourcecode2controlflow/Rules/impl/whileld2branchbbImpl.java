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
	public boolean isAppropriate_FWD(Match match, While w, Decision c, While a, Assignment b) {

		Object[] result1_black = whileld2branchbbImpl.pattern_whileld2branchbb_0_1_initialbindings_blackBBBBBB(this,
				match, w, c, a, b);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[a] = " + a + ", "
					+ "[b] = " + b + ".");
		}

		Object[] result2_bindingAndBlack = whileld2branchbbImpl
				.pattern_whileld2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, w, c, a, b);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[a] = " + a + ", "
					+ "[b] = " + b + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileld2branchbbImpl.pattern_whileld2branchbb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileld2branchbbImpl
					.pattern_whileld2branchbb_0_4_collectelementstobetranslated_blackBBBBB(match, w, c, a, b);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[w] = " + w + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[b] = " + b + ".");
			}
			whileld2branchbbImpl.pattern_whileld2branchbb_0_4_collectelementstobetranslated_greenBBBBBFFF(match, w, c,
					a, b);
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[7];

			Object[] result5_black = whileld2branchbbImpl
					.pattern_whileld2branchbb_0_5_collectcontextelements_blackBBBBB(match, w, c, a, b);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[w] = " + w + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[b] = " + b + ".");
			}
			whileld2branchbbImpl.pattern_whileld2branchbb_0_5_collectcontextelements_greenBB(match, w);

			// 
			whileld2branchbbImpl.pattern_whileld2branchbb_0_6_registerobjectstomatch_expressionBBBBBB(this, match, w, c,
					a, b);
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
		Branch i = (Branch) result1_bindingAndBlack[0];
		While w = (While) result1_bindingAndBlack[1];
		Decision c = (Decision) result1_bindingAndBlack[2];
		S2B w2i = (S2B) result1_bindingAndBlack[3];
		While a = (While) result1_bindingAndBlack[4];
		Assignment b = (Assignment) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whileld2branchbbImpl
				.pattern_whileld2branchbb_1_1_performtransformation_greenFBFBBFFFFB(i, c, a, b);
		Branch x = (Branch) result1_green[0];
		S2B a2x = (S2B) result1_green[2];
		S2N b2y = (S2N) result1_green[5];
		Branch z = (Branch) result1_green[6];
		Command y = (Command) result1_green[7];
		S2B c2z = (S2B) result1_green[8];

		Object[] result2_black = whileld2branchbbImpl
				.pattern_whileld2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBB(x, a2x, c, a, b2y, z, y, c2z, b);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[x] = " + x + ", " + "[a2x] = "
					+ a2x + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[b2y] = " + b2y + ", " + "[z] = " + z
					+ ", " + "[y] = " + y + ", " + "[c2z] = " + c2z + ", " + "[b] = " + b + ".");
		}
		Object[] result2_green = whileld2branchbbImpl
				.pattern_whileld2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBB(x, a2x, c, a, b2y, z, y, c2z,
						b);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileld2branchbbImpl
				.pattern_whileld2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, x, i, a2x, w, c, w2i,
						a, b2y, z, y, c2z, b);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[x] = " + x + ", " + "[i] = " + i + ", " + "[a2x] = " + a2x + ", " + "[w] = " + w + ", "
					+ "[c] = " + c + ", " + "[w2i] = " + w2i + ", " + "[a] = " + a + ", " + "[b2y] = " + b2y + ", "
					+ "[z] = " + z + ", " + "[y] = " + y + ", " + "[c2z] = " + c2z + ", " + "[b] = " + b + ".");
		}
		whileld2branchbbImpl.pattern_whileld2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult,
				x, i, a2x, w, c, a, b2y, z, y, c2z, b);
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[23];

		// 
		// 
		whileld2branchbbImpl.pattern_whileld2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, x,
				i, a2x, w, c, w2i, a, b2y, z, y, c2z, b);
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
		While w = (While) result2_binding[0];
		Decision c = (Decision) result2_binding[1];
		While a = (While) result2_binding[2];
		Assignment b = (Assignment) result2_binding[3];
		for (Object[] result2_black : whileld2branchbbImpl.pattern_whileld2branchbb_2_2_corematch_blackFBBFBBB(w, c, a,
				b, match)) {
			Branch i = (Branch) result2_black[0];
			S2B w2i = (S2B) result2_black[3];
			// ForEach 
			for (Object[] result3_black : whileld2branchbbImpl.pattern_whileld2branchbb_2_3_findcontext_blackBBBBBB(i,
					w, c, w2i, a, b)) {
				Object[] result3_green = whileld2branchbbImpl
						.pattern_whileld2branchbb_2_3_findcontext_greenBBBBBBFFFFFF(i, w, c, w2i, a, b);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = whileld2branchbbImpl
						.pattern_whileld2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, i, w,
								c, w2i, a, b);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[i] = " + i + ", " + "[w] = " + w
							+ ", " + "[c] = " + c + ", " + "[w2i] = " + w2i + ", " + "[a] = " + a + ", " + "[b] = " + b
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
	public void registerObjectsToMatch_FWD(Match match, While w, Decision c, While a, Assignment b) {
		match.registerObject("w", w);
		match.registerObject("c", c);
		match.registerObject("a", a);
		match.registerObject("b", b);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, While w, Decision c, While a, Assignment b) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Branch i, While w, Decision c, S2B w2i,
			While a, Assignment b) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("a", a);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject x, EObject i, EObject a2x, EObject w,
			EObject c, EObject w2i, EObject a, EObject b2y, EObject z, EObject y, EObject c2z, EObject b) {
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("b", b);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.Decision.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass())
						.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch x, Branch i, Branch z, Command y) {

		Object[] result1_black = whileld2branchbbImpl.pattern_whileld2branchbb_10_1_initialbindings_blackBBBBBB(this,
				match, x, i, z, y);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[i] = " + i + ", " + "[z] = " + z + ", "
					+ "[y] = " + y + ".");
		}

		Object[] result2_bindingAndBlack = whileld2branchbbImpl
				.pattern_whileld2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, x, i, z, y);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[i] = " + i + ", " + "[z] = " + z + ", "
					+ "[y] = " + y + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileld2branchbbImpl.pattern_whileld2branchbb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileld2branchbbImpl
					.pattern_whileld2branchbb_10_4_collectelementstobetranslated_blackBBBBB(match, x, i, z, y);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[i] = " + i + ", " + "[z] = " + z + ", " + "[y] = " + y + ".");
			}
			whileld2branchbbImpl.pattern_whileld2branchbb_10_4_collectelementstobetranslated_greenBBBBBFFF(match, x, i,
					z, y);
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge y__x____next = (EMoflonEdge) result4_green[7];

			Object[] result5_black = whileld2branchbbImpl
					.pattern_whileld2branchbb_10_5_collectcontextelements_blackBBBBB(match, x, i, z, y);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[i] = " + i + ", " + "[z] = " + z + ", " + "[y] = " + y + ".");
			}
			whileld2branchbbImpl.pattern_whileld2branchbb_10_5_collectcontextelements_greenBB(match, i);

			// 
			whileld2branchbbImpl.pattern_whileld2branchbb_10_6_registerobjectstomatch_expressionBBBBBB(this, match, x,
					i, z, y);
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
		Branch i = (Branch) result1_bindingAndBlack[1];
		While w = (While) result1_bindingAndBlack[2];
		S2B w2i = (S2B) result1_bindingAndBlack[3];
		Branch z = (Branch) result1_bindingAndBlack[4];
		Command y = (Command) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whileld2branchbbImpl
				.pattern_whileld2branchbb_11_1_performtransformation_greenBFBFFFBBFF(x, w, z, y);
		S2B a2x = (S2B) result1_green[1];
		Decision c = (Decision) result1_green[3];
		While a = (While) result1_green[4];
		S2N b2y = (S2N) result1_green[5];
		S2B c2z = (S2B) result1_green[8];
		Assignment b = (Assignment) result1_green[9];

		Object[] result2_black = whileld2branchbbImpl
				.pattern_whileld2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBB(x, a2x, c, a, b2y, z, y, c2z,
						b);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[x] = " + x + ", " + "[a2x] = "
					+ a2x + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[b2y] = " + b2y + ", " + "[z] = " + z
					+ ", " + "[y] = " + y + ", " + "[c2z] = " + c2z + ", " + "[b] = " + b + ".");
		}
		Object[] result2_green = whileld2branchbbImpl
				.pattern_whileld2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBB(x, a2x, c, a, b2y, z, y, c2z,
						b);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileld2branchbbImpl
				.pattern_whileld2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, x, i, a2x, w, c, w2i,
						a, b2y, z, y, c2z, b);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[x] = " + x + ", " + "[i] = " + i + ", " + "[a2x] = " + a2x + ", " + "[w] = " + w + ", "
					+ "[c] = " + c + ", " + "[w2i] = " + w2i + ", " + "[a] = " + a + ", " + "[b2y] = " + b2y + ", "
					+ "[z] = " + z + ", " + "[y] = " + y + ", " + "[c2z] = " + c2z + ", " + "[b] = " + b + ".");
		}
		whileld2branchbbImpl.pattern_whileld2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult,
				x, i, a2x, w, c, a, b2y, z, y, c2z, b);
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[23];

		// 
		// 
		whileld2branchbbImpl.pattern_whileld2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, x,
				i, a2x, w, c, w2i, a, b2y, z, y, c2z, b);
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
		Branch i = (Branch) result2_binding[1];
		Branch z = (Branch) result2_binding[2];
		Command y = (Command) result2_binding[3];
		for (Object[] result2_black : whileld2branchbbImpl.pattern_whileld2branchbb_12_2_corematch_blackBBFFBBB(x, i, z,
				y, match)) {
			While w = (While) result2_black[2];
			S2B w2i = (S2B) result2_black[3];
			// ForEach 
			for (Object[] result3_black : whileld2branchbbImpl.pattern_whileld2branchbb_12_3_findcontext_blackBBBBBB(x,
					i, w, w2i, z, y)) {
				Object[] result3_green = whileld2branchbbImpl
						.pattern_whileld2branchbb_12_3_findcontext_greenBBBBBBFFFFFF(x, i, w, w2i, z, y);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = whileld2branchbbImpl
						.pattern_whileld2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, x, i,
								w, w2i, z, y);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[x] = " + x + ", " + "[i] = " + i
							+ ", " + "[w] = " + w + ", " + "[w2i] = " + w2i + ", " + "[z] = " + z + ", " + "[y] = " + y
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
	public void registerObjectsToMatch_BWD(Match match, Branch x, Branch i, Branch z, Command y) {
		match.registerObject("x", x);
		match.registerObject("i", i);
		match.registerObject("z", z);
		match.registerObject("y", y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch x, Branch i, Branch z, Command y) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch x, Branch i, While w, S2B w2i,
			Branch z, Command y) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("z", z);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject x, EObject i, EObject a2x, EObject w,
			EObject c, EObject w2i, EObject a, EObject b2y, EObject z, EObject y, EObject c2z, EObject b) {
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("b", b);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_64(EMoflonEdge _edge_negative) {

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
				.pattern_whileld2branchbb_20_2_testcorematchandDECs_blackFFFFB(_edge_negative)) {
			Branch x = (Branch) result2_black[0];
			Branch i = (Branch) result2_black[1];
			Branch z = (Branch) result2_black[2];
			Command y = (Command) result2_black[3];
			Object[] result2_green = whileld2branchbbImpl
					.pattern_whileld2branchbb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileld2branchbbImpl
					.pattern_whileld2branchbb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, x, i, z, y)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_70(EMoflonEdge _edge_first) {

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
				.pattern_whileld2branchbb_21_2_testcorematchandDECs_blackFFFFB(_edge_first)) {
			While w = (While) result2_black[0];
			Decision c = (Decision) result2_black[1];
			While a = (While) result2_black[2];
			Assignment b = (Assignment) result2_black[3];
			Object[] result2_green = whileld2branchbbImpl
					.pattern_whileld2branchbb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileld2branchbbImpl
					.pattern_whileld2branchbb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, w, c, a, b)) {
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
		Branch i = (Branch) result2_bindingAndBlack[1];
		While w = (While) result2_bindingAndBlack[2];
		Decision c = (Decision) result2_bindingAndBlack[3];
		While a = (While) result2_bindingAndBlack[4];
		Branch z = (Branch) result2_bindingAndBlack[5];
		Command y = (Command) result2_bindingAndBlack[6];
		Assignment b = (Assignment) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = whileld2branchbbImpl
				.pattern_whileld2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, x, i, w, c, a, z, y, b,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[x] = " + x + ", " + "[i] = " + i + ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[a] = "
					+ a + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[b] = " + b + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whileld2branchbbImpl.pattern_whileld2branchbb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whileld2branchbbImpl
					.pattern_whileld2branchbb_24_5_matchcorrcontext_blackBBFBB(i, w, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[2];
				Object[] result5_green = whileld2branchbbImpl
						.pattern_whileld2branchbb_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whileld2branchbbImpl
						.pattern_whileld2branchbb_24_6_createcorrespondence_blackBBBBBBBBB(x, i, w, c, a, z, y, b,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[x] = " + x + ", "
							+ "[i] = " + i + ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[a] = " + a + ", "
							+ "[z] = " + z + ", " + "[y] = " + y + ", " + "[b] = " + b + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				whileld2branchbbImpl.pattern_whileld2branchbb_24_6_createcorrespondence_greenBFBBFBBFBB(x, c, a, z, y,
						b, ccMatch);
				//nothing S2B a2x = (S2B) result6_green[1];
				//nothing S2N b2y = (S2N) result6_green[4];
				//nothing S2B c2z = (S2B) result6_green[7];

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
	public CSP isApplicable_solveCsp_CC(Branch x, Branch i, While w, Decision c, While a, Branch z, Command y,
			Assignment b, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(While w, Decision c, While a, Assignment b) {// 
		Object[] result1_black = whileld2branchbbImpl.pattern_whileld2branchbb_27_1_matchtggpattern_blackBBBB(w, c, a,
				b);
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
	public boolean checkDEC_BWD(Branch x, Branch i, Branch z, Command y) {// 
		Object[] result1_black = whileld2branchbbImpl.pattern_whileld2branchbb_28_1_matchtggpattern_blackBBBB(x, i, z,
				y);
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
			Branch i = (Branch) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			While w = (While) result2_black[3];

			Object[] result3_bindingAndBlack = whileld2branchbbImpl
					.pattern_whileld2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, i, w, w2i,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[i] = " + i + ", " + "[w] = " + w
						+ ", " + "[w2i] = " + w2i + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whileld2branchbbImpl.pattern_whileld2branchbb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whileld2branchbbImpl.pattern_whileld2branchbb_29_5_checknacs_blackBBB(i, w,
						w2i);
				if (result5_black != null) {

					Object[] result6_black = whileld2branchbbImpl.pattern_whileld2branchbb_29_6_perform_blackBBBB(i, w,
							w2i, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[i] = " + i + ", "
								+ "[w] = " + w + ", " + "[w2i] = " + w2i + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whileld2branchbbImpl.pattern_whileld2branchbb_29_6_perform_greenFBFBFFFFFFFB(i, w, ruleResult);
					//nothing Branch x = (Branch) result6_green[0];
					//nothing S2B a2x = (S2B) result6_green[2];
					//nothing Decision c = (Decision) result6_green[4];
					//nothing While a = (While) result6_green[5];
					//nothing S2N b2y = (S2N) result6_green[6];
					//nothing Branch z = (Branch) result6_green[7];
					//nothing Command y = (Command) result6_green[8];
					//nothing S2B c2z = (S2B) result6_green[9];
					//nothing Assignment b = (Assignment) result6_green[10];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch i, While w, S2B w2i,
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
		isApplicableMatch.registerObject("w", w);
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
		case RulesPackage.WHILELD2BRANCHBB___IS_APPROPRIATE_FWD__MATCH_WHILE_DECISION_WHILE_ASSIGNMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (While) arguments.get(1), (Decision) arguments.get(2),
					(While) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.WHILELD2BRANCHBB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WHILE_DECISION_WHILE_ASSIGNMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (While) arguments.get(1), (Decision) arguments.get(2),
					(While) arguments.get(3), (Assignment) arguments.get(4));
			return null;
		case RulesPackage.WHILELD2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WHILE_DECISION_WHILE_ASSIGNMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(Decision) arguments.get(2), (While) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BRANCH_WHILE_DECISION_S2B_WHILE_ASSIGNMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(While) arguments.get(2), (Decision) arguments.get(3), (S2B) arguments.get(4),
					(While) arguments.get(5), (Assignment) arguments.get(6));
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
		case RulesPackage.WHILELD2BRANCHBB___IS_APPROPRIATE_BWD__MATCH_BRANCH_BRANCH_BRANCH_COMMAND:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4));
		case RulesPackage.WHILELD2BRANCHBB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_BRANCH_BRANCH_COMMAND:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4));
			return null;
		case RulesPackage.WHILELD2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_BRANCH_BRANCH_COMMAND:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3), (Command) arguments.get(4));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_BRANCH_WHILE_S2B_BRANCH_COMMAND:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (While) arguments.get(3), (S2B) arguments.get(4),
					(Branch) arguments.get(5), (Command) arguments.get(6));
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
		case RulesPackage.WHILELD2BRANCHBB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_64__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_64((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_70__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_70((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_CC__BRANCH_BRANCH_WHILE_DECISION_WHILE_BRANCH_COMMAND_ASSIGNMENT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Branch) arguments.get(0), (Branch) arguments.get(1),
					(While) arguments.get(2), (Decision) arguments.get(3), (While) arguments.get(4),
					(Branch) arguments.get(5), (Command) arguments.get(6), (Assignment) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.WHILELD2BRANCHBB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILELD2BRANCHBB___CHECK_DEC_FWD__WHILE_DECISION_WHILE_ASSIGNMENT:
			return checkDEC_FWD((While) arguments.get(0), (Decision) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3));
		case RulesPackage.WHILELD2BRANCHBB___CHECK_DEC_BWD__BRANCH_BRANCH_BRANCH_COMMAND:
			return checkDEC_BWD((Branch) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3));
		case RulesPackage.WHILELD2BRANCHBB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILELD2BRANCHBB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_WHILE_S2B_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(While) arguments.get(2), (S2B) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILELD2BRANCHBB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whileld2branchbb_0_1_initialbindings_blackBBBBBB(whileld2branchbb _this,
			Match match, While w, Decision c, While a, Assignment b) {
		if (!a.equals(w)) {
			return new Object[] { _this, match, w, c, a, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_0_2_SolveCSP_bindingFBBBBBB(whileld2branchbb _this,
			Match match, While w, Decision c, While a, Assignment b) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, w, c, a, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, w, c, a, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileld2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBB(whileld2branchbb _this,
			Match match, While w, Decision c, While a, Assignment b) {
		Object[] result_pattern_whileld2branchbb_0_2_SolveCSP_binding = pattern_whileld2branchbb_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, w, c, a, b);
		if (result_pattern_whileld2branchbb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileld2branchbb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whileld2branchbb_0_2_SolveCSP_black = pattern_whileld2branchbb_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileld2branchbb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, w, c, a, b };
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
			While w, Decision c, While a, Assignment b) {
		if (!a.equals(w)) {
			return new Object[] { match, w, c, a, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_0_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			While w, Decision c, While a, Assignment b) {
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(c);
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(b);
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String a__b____last_name_prime = "last";
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____last);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		return new Object[] { match, w, c, a, b, w__a____first, w__c____next, a__b____last };
	}

	public static final Object[] pattern_whileld2branchbb_0_5_collectcontextelements_blackBBBBB(Match match, While w,
			Decision c, While a, Assignment b) {
		if (!a.equals(w)) {
			return new Object[] { match, w, c, a, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whileld2branchbb_0_6_registerobjectstomatch_expressionBBBBBB(
			whileld2branchbb _this, Match match, While w, Decision c, While a, Assignment b) {
		_this.registerObjectsToMatch_FWD(match, w, c, a, b);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("i");
		EObject _localVariable_1 = isApplicableMatch.getObject("w");
		EObject _localVariable_2 = isApplicableMatch.getObject("c");
		EObject _localVariable_3 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_4 = isApplicableMatch.getObject("a");
		EObject _localVariable_5 = isApplicableMatch.getObject("b");
		EObject tmpI = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpW2i = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpB = _localVariable_5;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpC instanceof Decision) {
					Decision c = (Decision) tmpC;
					if (tmpW2i instanceof S2B) {
						S2B w2i = (S2B) tmpW2i;
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							if (tmpB instanceof Assignment) {
								Assignment b = (Assignment) tmpB;
								return new Object[] { i, w, c, w2i, a, b, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_1_1_performtransformation_blackBBBBBBFBB(Branch i, While w,
			Decision c, S2B w2i, While a, Assignment b, whileld2branchbb _this, IsApplicableMatch isApplicableMatch) {
		if (!a.equals(w)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { i, w, c, w2i, a, b, csp, _this, isApplicableMatch };
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
			Branch i = (Branch) result_pattern_whileld2branchbb_1_1_performtransformation_binding[0];
			While w = (While) result_pattern_whileld2branchbb_1_1_performtransformation_binding[1];
			Decision c = (Decision) result_pattern_whileld2branchbb_1_1_performtransformation_binding[2];
			S2B w2i = (S2B) result_pattern_whileld2branchbb_1_1_performtransformation_binding[3];
			While a = (While) result_pattern_whileld2branchbb_1_1_performtransformation_binding[4];
			Assignment b = (Assignment) result_pattern_whileld2branchbb_1_1_performtransformation_binding[5];

			Object[] result_pattern_whileld2branchbb_1_1_performtransformation_black = pattern_whileld2branchbb_1_1_performtransformation_blackBBBBBBFBB(
					i, w, c, w2i, a, b, _this, isApplicableMatch);
			if (result_pattern_whileld2branchbb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileld2branchbb_1_1_performtransformation_black[6];

				return new Object[] { i, w, c, w2i, a, b, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_1_1_performtransformation_greenFBFBBFFFFB(Branch i,
			Decision c, While a, Assignment b) {
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		i.setPositive(x);
		a2x.setTarget(x);
		a2x.setSource(a);
		b2y.setSource(b);
		i.setNegative(z);
		b2y.setTarget(y);
		y.setNext(x);
		c2z.setSource(c);
		c2z.setTarget(z);
		return new Object[] { x, i, a2x, c, a, b2y, z, y, c2z, b };
	}

	public static final Object[] pattern_whileld2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBB(Branch x,
			S2B a2x, Decision c, While a, S2N b2y, Branch z, Command y, S2B c2z, Assignment b) {
		if (!x.equals(z)) {
			if (!a2x.equals(c2z)) {
				return new Object[] { x, a2x, c, a, b2y, z, y, c2z, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBB(Branch x,
			S2B a2x, Decision c, While a, S2N b2y, Branch z, Command y, S2B c2z, Assignment b) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getTranslatedElements().add(b);
		return new Object[] { ruleresult, x, a2x, c, a, b2y, z, y, c2z, b };
	}

	public static final Object[] pattern_whileld2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject x, EObject i, EObject a2x, EObject w, EObject c, EObject w2i,
			EObject a, EObject b2y, EObject z, EObject y, EObject c2z, EObject b) {
		if (!x.equals(z)) {
			if (!x.equals(y)) {
				if (!i.equals(x)) {
					if (!i.equals(w)) {
						if (!i.equals(w2i)) {
							if (!i.equals(z)) {
								if (!i.equals(y)) {
									if (!a2x.equals(x)) {
										if (!a2x.equals(i)) {
											if (!a2x.equals(w)) {
												if (!a2x.equals(c)) {
													if (!a2x.equals(w2i)) {
														if (!a2x.equals(b2y)) {
															if (!a2x.equals(z)) {
																if (!a2x.equals(y)) {
																	if (!a2x.equals(c2z)) {
																		if (!a2x.equals(b)) {
																			if (!w.equals(x)) {
																				if (!w.equals(w2i)) {
																					if (!w.equals(z)) {
																						if (!w.equals(y)) {
																							if (!c.equals(x)) {
																								if (!c.equals(i)) {
																									if (!c.equals(w)) {
																										if (!c.equals(
																												w2i)) {
																											if (!c.equals(
																													z)) {
																												if (!c.equals(
																														y)) {
																													if (!c.equals(
																															c2z)) {
																														if (!w2i.equals(
																																x)) {
																															if (!w2i.equals(
																																	z)) {
																																if (!w2i.equals(
																																		y)) {
																																	if (!a.equals(
																																			x)) {
																																		if (!a.equals(
																																				i)) {
																																			if (!a.equals(
																																					a2x)) {
																																				if (!a.equals(
																																						w)) {
																																					if (!a.equals(
																																							c)) {
																																						if (!a.equals(
																																								w2i)) {
																																							if (!a.equals(
																																									b2y)) {
																																								if (!a.equals(
																																										z)) {
																																									if (!a.equals(
																																											y)) {
																																										if (!a.equals(
																																												c2z)) {
																																											if (!a.equals(
																																													b)) {
																																												if (!b2y.equals(
																																														x)) {
																																													if (!b2y.equals(
																																															i)) {
																																														if (!b2y.equals(
																																																w)) {
																																															if (!b2y.equals(
																																																	c)) {
																																																if (!b2y.equals(
																																																		w2i)) {
																																																	if (!b2y.equals(
																																																			z)) {
																																																		if (!b2y.equals(
																																																				y)) {
																																																			if (!b2y.equals(
																																																					c2z)) {
																																																				if (!y.equals(
																																																						z)) {
																																																					if (!c2z.equals(
																																																							x)) {
																																																						if (!c2z.equals(
																																																								i)) {
																																																							if (!c2z.equals(
																																																									w)) {
																																																								if (!c2z.equals(
																																																										w2i)) {
																																																									if (!c2z.equals(
																																																											z)) {
																																																										if (!c2z.equals(
																																																												y)) {
																																																											if (!b.equals(
																																																													x)) {
																																																												if (!b.equals(
																																																														i)) {
																																																													if (!b.equals(
																																																															w)) {
																																																														if (!b.equals(
																																																																c)) {
																																																															if (!b.equals(
																																																																	w2i)) {
																																																																if (!b.equals(
																																																																		b2y)) {
																																																																	if (!b.equals(
																																																																			z)) {
																																																																		if (!b.equals(
																																																																				y)) {
																																																																			if (!b.equals(
																																																																					c2z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						x,
																																																																						i,
																																																																						a2x,
																																																																						w,
																																																																						c,
																																																																						w2i,
																																																																						a,
																																																																						b2y,
																																																																						z,
																																																																						y,
																																																																						c2z,
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
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject x, EObject i, EObject a2x, EObject w, EObject c, EObject a,
			EObject b2y, EObject z, EObject y, EObject c2z, EObject b) {
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileld2branchbb";
		String i__z____negative_name_prime = "negative";
		String a2x__x____target_name_prime = "target";
		String w__a____first_name_prime = "first";
		String i__x____positive_name_prime = "positive";
		String w__c____next_name_prime = "next";
		String a2x__a____source_name_prime = "source";
		String a__b____last_name_prime = "last";
		String b2y__y____target_name_prime = "target";
		String y__x____next_name_prime = "next";
		String c2z__c____source_name_prime = "source";
		String c2z__z____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(y__x____next);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		return new Object[] { ruleresult, x, i, a2x, w, c, a, b2y, z, y, c2z, b, i__z____negative, a2x__x____target,
				w__a____first, i__x____positive, w__c____next, a2x__a____source, a__b____last, b2y__y____target,
				y__x____next, c2z__c____source, c2z__z____target, b2y__b____source };
	}

	public static final void pattern_whileld2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whileld2branchbb _this, PerformRuleResult ruleresult, EObject x, EObject i, EObject a2x, EObject w,
			EObject c, EObject w2i, EObject a, EObject b2y, EObject z, EObject y, EObject c2z, EObject b) {
		_this.registerObjects_FWD(ruleresult, x, i, a2x, w, c, w2i, a, b2y, z, y, c2z, b);

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
		EObject _localVariable_0 = match.getObject("w");
		EObject _localVariable_1 = match.getObject("c");
		EObject _localVariable_2 = match.getObject("a");
		EObject _localVariable_3 = match.getObject("b");
		EObject tmpW = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpB = _localVariable_3;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpC instanceof Decision) {
				Decision c = (Decision) tmpC;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpB instanceof Assignment) {
						Assignment b = (Assignment) tmpB;
						return new Object[] { w, c, a, b, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileld2branchbb_2_2_corematch_blackFBBFBBB(While w, Decision c,
			While a, Assignment b, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				Branch i = w2i.getTarget();
				if (i != null) {
					_result.add(new Object[] { i, w, c, w2i, a, b, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileld2branchbb_2_3_findcontext_blackBBBBBB(Branch i, While w,
			Decision c, S2B w2i, While a, Assignment b) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			if (a.equals(w.getFirst())) {
				if (c.equals(w.getNext())) {
					if (i.equals(w2i.getTarget())) {
						if (w.equals(w2i.getSource())) {
							if (b.equals(a.getLast())) {
								_result.add(new Object[] { i, w, c, w2i, a, b });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whileld2branchbb_2_3_findcontext_greenBBBBBBFFFFFF(Branch i, While w,
			Decision c, S2B w2i, While a, Assignment b) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String w2i__i____target_name_prime = "target";
		String w2i__w____source_name_prime = "source";
		String a__b____last_name_prime = "last";
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(b);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____last);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		return new Object[] { i, w, c, w2i, a, b, isApplicableMatch, w__a____first, w__c____next, w2i__i____target,
				w2i__w____source, a__b____last };
	}

	public static final Object[] pattern_whileld2branchbb_2_4_solveCSP_bindingFBBBBBBBB(whileld2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch i, While w, Decision c, S2B w2i, While a, Assignment b) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, i, w, c, w2i, a, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, i, w, c, w2i, a, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileld2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(whileld2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch i, While w, Decision c, S2B w2i, While a, Assignment b) {
		Object[] result_pattern_whileld2branchbb_2_4_solveCSP_binding = pattern_whileld2branchbb_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, i, w, c, w2i, a, b);
		if (result_pattern_whileld2branchbb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileld2branchbb_2_4_solveCSP_binding[0];

			Object[] result_pattern_whileld2branchbb_2_4_solveCSP_black = pattern_whileld2branchbb_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileld2branchbb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, i, w, c, w2i, a, b };
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
			Match match, Branch x, Branch i, Branch z, Command y) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					return new Object[] { _this, match, x, i, z, y };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_10_2_SolveCSP_bindingFBBBBBB(whileld2branchbb _this,
			Match match, Branch x, Branch i, Branch z, Command y) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, x, i, z, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, x, i, z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileld2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBB(whileld2branchbb _this,
			Match match, Branch x, Branch i, Branch z, Command y) {
		Object[] result_pattern_whileld2branchbb_10_2_SolveCSP_binding = pattern_whileld2branchbb_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, x, i, z, y);
		if (result_pattern_whileld2branchbb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileld2branchbb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whileld2branchbb_10_2_SolveCSP_black = pattern_whileld2branchbb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileld2branchbb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, x, i, z, y };
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
			Branch x, Branch i, Branch z, Command y) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					return new Object[] { match, x, i, z, y };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_10_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			Branch x, Branch i, Branch z, Command y) {
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(y);
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String y__x____next_name_prime = "next";
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(y__x____next);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		return new Object[] { match, x, i, z, y, i__z____negative, i__x____positive, y__x____next };
	}

	public static final Object[] pattern_whileld2branchbb_10_5_collectcontextelements_blackBBBBB(Match match, Branch x,
			Branch i, Branch z, Command y) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					return new Object[] { match, x, i, z, y };
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
			whileld2branchbb _this, Match match, Branch x, Branch i, Branch z, Command y) {
		_this.registerObjectsToMatch_BWD(match, x, i, z, y);

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
		EObject _localVariable_1 = isApplicableMatch.getObject("i");
		EObject _localVariable_2 = isApplicableMatch.getObject("w");
		EObject _localVariable_3 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_4 = isApplicableMatch.getObject("z");
		EObject _localVariable_5 = isApplicableMatch.getObject("y");
		EObject tmpX = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpW2i = _localVariable_3;
		EObject tmpZ = _localVariable_4;
		EObject tmpY = _localVariable_5;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					if (tmpW2i instanceof S2B) {
						S2B w2i = (S2B) tmpW2i;
						if (tmpZ instanceof Branch) {
							Branch z = (Branch) tmpZ;
							if (tmpY instanceof Command) {
								Command y = (Command) tmpY;
								return new Object[] { x, i, w, w2i, z, y, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_11_1_performtransformation_blackBBBBBBFBB(Branch x, Branch i,
			While w, S2B w2i, Branch z, Command y, whileld2branchbb _this, IsApplicableMatch isApplicableMatch) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { x, i, w, w2i, z, y, csp, _this, isApplicableMatch };
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
			Branch i = (Branch) result_pattern_whileld2branchbb_11_1_performtransformation_binding[1];
			While w = (While) result_pattern_whileld2branchbb_11_1_performtransformation_binding[2];
			S2B w2i = (S2B) result_pattern_whileld2branchbb_11_1_performtransformation_binding[3];
			Branch z = (Branch) result_pattern_whileld2branchbb_11_1_performtransformation_binding[4];
			Command y = (Command) result_pattern_whileld2branchbb_11_1_performtransformation_binding[5];

			Object[] result_pattern_whileld2branchbb_11_1_performtransformation_black = pattern_whileld2branchbb_11_1_performtransformation_blackBBBBBBFBB(
					x, i, w, w2i, z, y, _this, isApplicableMatch);
			if (result_pattern_whileld2branchbb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileld2branchbb_11_1_performtransformation_black[6];

				return new Object[] { x, i, w, w2i, z, y, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_11_1_performtransformation_greenBFBFFFBBFF(Branch x, While w,
			Branch z, Command y) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision c = SourcecodeFactory.eINSTANCE.createDecision();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		a2x.setTarget(x);
		w.setNext(c);
		w.setFirst(a);
		a2x.setSource(a);
		b2y.setTarget(y);
		c2z.setSource(c);
		c2z.setTarget(z);
		a.setLast(b);
		b2y.setSource(b);
		return new Object[] { x, a2x, w, c, a, b2y, z, y, c2z, b };
	}

	public static final Object[] pattern_whileld2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBB(Branch x,
			S2B a2x, Decision c, While a, S2N b2y, Branch z, Command y, S2B c2z, Assignment b) {
		if (!x.equals(z)) {
			if (!a2x.equals(c2z)) {
				return new Object[] { x, a2x, c, a, b2y, z, y, c2z, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBB(Branch x,
			S2B a2x, Decision c, While a, S2N b2y, Branch z, Command y, S2B c2z, Assignment b) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedElements().add(b);
		return new Object[] { ruleresult, x, a2x, c, a, b2y, z, y, c2z, b };
	}

	public static final Object[] pattern_whileld2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject x, EObject i, EObject a2x, EObject w, EObject c, EObject w2i,
			EObject a, EObject b2y, EObject z, EObject y, EObject c2z, EObject b) {
		if (!x.equals(z)) {
			if (!x.equals(y)) {
				if (!i.equals(x)) {
					if (!i.equals(w)) {
						if (!i.equals(w2i)) {
							if (!i.equals(z)) {
								if (!i.equals(y)) {
									if (!a2x.equals(x)) {
										if (!a2x.equals(i)) {
											if (!a2x.equals(w)) {
												if (!a2x.equals(c)) {
													if (!a2x.equals(w2i)) {
														if (!a2x.equals(b2y)) {
															if (!a2x.equals(z)) {
																if (!a2x.equals(y)) {
																	if (!a2x.equals(c2z)) {
																		if (!a2x.equals(b)) {
																			if (!w.equals(x)) {
																				if (!w.equals(w2i)) {
																					if (!w.equals(z)) {
																						if (!w.equals(y)) {
																							if (!c.equals(x)) {
																								if (!c.equals(i)) {
																									if (!c.equals(w)) {
																										if (!c.equals(
																												w2i)) {
																											if (!c.equals(
																													z)) {
																												if (!c.equals(
																														y)) {
																													if (!c.equals(
																															c2z)) {
																														if (!w2i.equals(
																																x)) {
																															if (!w2i.equals(
																																	z)) {
																																if (!w2i.equals(
																																		y)) {
																																	if (!a.equals(
																																			x)) {
																																		if (!a.equals(
																																				i)) {
																																			if (!a.equals(
																																					a2x)) {
																																				if (!a.equals(
																																						w)) {
																																					if (!a.equals(
																																							c)) {
																																						if (!a.equals(
																																								w2i)) {
																																							if (!a.equals(
																																									b2y)) {
																																								if (!a.equals(
																																										z)) {
																																									if (!a.equals(
																																											y)) {
																																										if (!a.equals(
																																												c2z)) {
																																											if (!a.equals(
																																													b)) {
																																												if (!b2y.equals(
																																														x)) {
																																													if (!b2y.equals(
																																															i)) {
																																														if (!b2y.equals(
																																																w)) {
																																															if (!b2y.equals(
																																																	c)) {
																																																if (!b2y.equals(
																																																		w2i)) {
																																																	if (!b2y.equals(
																																																			z)) {
																																																		if (!b2y.equals(
																																																				y)) {
																																																			if (!b2y.equals(
																																																					c2z)) {
																																																				if (!y.equals(
																																																						z)) {
																																																					if (!c2z.equals(
																																																							x)) {
																																																						if (!c2z.equals(
																																																								i)) {
																																																							if (!c2z.equals(
																																																									w)) {
																																																								if (!c2z.equals(
																																																										w2i)) {
																																																									if (!c2z.equals(
																																																											z)) {
																																																										if (!c2z.equals(
																																																												y)) {
																																																											if (!b.equals(
																																																													x)) {
																																																												if (!b.equals(
																																																														i)) {
																																																													if (!b.equals(
																																																															w)) {
																																																														if (!b.equals(
																																																																c)) {
																																																															if (!b.equals(
																																																																	w2i)) {
																																																																if (!b.equals(
																																																																		b2y)) {
																																																																	if (!b.equals(
																																																																			z)) {
																																																																		if (!b.equals(
																																																																				y)) {
																																																																			if (!b.equals(
																																																																					c2z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						x,
																																																																						i,
																																																																						a2x,
																																																																						w,
																																																																						c,
																																																																						w2i,
																																																																						a,
																																																																						b2y,
																																																																						z,
																																																																						y,
																																																																						c2z,
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
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject x, EObject i, EObject a2x, EObject w, EObject c, EObject a,
			EObject b2y, EObject z, EObject y, EObject c2z, EObject b) {
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileld2branchbb";
		String i__z____negative_name_prime = "negative";
		String a2x__x____target_name_prime = "target";
		String w__a____first_name_prime = "first";
		String i__x____positive_name_prime = "positive";
		String w__c____next_name_prime = "next";
		String a2x__a____source_name_prime = "source";
		String a__b____last_name_prime = "last";
		String b2y__y____target_name_prime = "target";
		String y__x____next_name_prime = "next";
		String c2z__c____source_name_prime = "source";
		String c2z__z____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(y__x____next);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		return new Object[] { ruleresult, x, i, a2x, w, c, a, b2y, z, y, c2z, b, i__z____negative, a2x__x____target,
				w__a____first, i__x____positive, w__c____next, a2x__a____source, a__b____last, b2y__y____target,
				y__x____next, c2z__c____source, c2z__z____target, b2y__b____source };
	}

	public static final void pattern_whileld2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whileld2branchbb _this, PerformRuleResult ruleresult, EObject x, EObject i, EObject a2x, EObject w,
			EObject c, EObject w2i, EObject a, EObject b2y, EObject z, EObject y, EObject c2z, EObject b) {
		_this.registerObjects_BWD(ruleresult, x, i, a2x, w, c, w2i, a, b2y, z, y, c2z, b);

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
		EObject _localVariable_1 = match.getObject("i");
		EObject _localVariable_2 = match.getObject("z");
		EObject _localVariable_3 = match.getObject("y");
		EObject tmpX = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpY = _localVariable_3;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpZ instanceof Branch) {
					Branch z = (Branch) tmpZ;
					if (tmpY instanceof Command) {
						Command y = (Command) tmpY;
						return new Object[] { x, i, z, y, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileld2branchbb_12_2_corematch_blackBBFFBBB(Branch x, Branch i,
			Branch z, Command y, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class,
							"target")) {
						Statement tmpW = w2i.getSource();
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							_result.add(new Object[] { x, i, w, w2i, z, y, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileld2branchbb_12_3_findcontext_blackBBBBBB(Branch x, Branch i,
			While w, S2B w2i, Branch z, Command y) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (z.equals(i.getNegative())) {
						if (x.equals(i.getPositive())) {
							if (i.equals(w2i.getTarget())) {
								if (w.equals(w2i.getSource())) {
									if (x.equals(y.getNext())) {
										_result.add(new Object[] { x, i, w, w2i, z, y });
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

	public static final Object[] pattern_whileld2branchbb_12_3_findcontext_greenBBBBBBFFFFFF(Branch x, Branch i,
			While w, S2B w2i, Branch z, Command y) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String w2i__i____target_name_prime = "target";
		String w2i__w____source_name_prime = "source";
		String y__x____next_name_prime = "next";
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(y);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(y__x____next);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		return new Object[] { x, i, w, w2i, z, y, isApplicableMatch, i__z____negative, i__x____positive,
				w2i__i____target, w2i__w____source, y__x____next };
	}

	public static final Object[] pattern_whileld2branchbb_12_4_solveCSP_bindingFBBBBBBBB(whileld2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch x, Branch i, While w, S2B w2i, Branch z, Command y) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, x, i, w, w2i, z, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, x, i, w, w2i, z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileld2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(whileld2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch x, Branch i, While w, S2B w2i, Branch z, Command y) {
		Object[] result_pattern_whileld2branchbb_12_4_solveCSP_binding = pattern_whileld2branchbb_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, x, i, w, w2i, z, y);
		if (result_pattern_whileld2branchbb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileld2branchbb_12_4_solveCSP_binding[0];

			Object[] result_pattern_whileld2branchbb_12_4_solveCSP_black = pattern_whileld2branchbb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileld2branchbb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, x, i, w, w2i, z, y };
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
		for (Graph __DEC_x_root_810029 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
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
					for (Branch __DEC_x_positive_190613 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_190613)) {
							if (!i.equals(__DEC_x_positive_190613)) {
								if (!z.equals(__DEC_x_positive_190613)) {
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
					for (Branch __DEC_x_negative_782849 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_782849)) {
							if (!i.equals(__DEC_x_negative_782849)) {
								if (!z.equals(__DEC_x_negative_782849)) {
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

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_3B(Branch z) {
		for (Graph __DEC_z_root_744372 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_4BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_positive_172610 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_172610)) {
							if (!x.equals(__DEC_z_positive_172610)) {
								if (!i.equals(__DEC_z_positive_172610)) {
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

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_5BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_negative_2665 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_2665)) {
							if (!x.equals(__DEC_z_negative_2665)) {
								if (!i.equals(__DEC_z_negative_2665)) {
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

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_6B(Command y) {
		for (Graph __DEC_y_root_592141 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_7BBBB(Command y, Branch x,
			Branch i, Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_y_positive_497515 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!x.equals(__DEC_y_positive_497515)) {
							if (!i.equals(__DEC_y_positive_497515)) {
								if (!z.equals(__DEC_y_positive_497515)) {
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

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_8BBBB(Command y, Branch x,
			Branch i, Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_y_negative_727092 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!x.equals(__DEC_y_negative_727092)) {
							if (!i.equals(__DEC_y_negative_727092)) {
								if (!z.equals(__DEC_y_negative_727092)) {
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

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_9BB(Branch x, Branch z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_10BB(Branch i, Branch z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_11BB(Branch x, Branch z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_12BB(Branch x,
			Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_13BB(Branch i,
			Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_14BB(Branch z,
			Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_15BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_16BB(Branch i,
			Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_17BB(Branch z,
			Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileld2branchbb_20_2_testcorematchandDECs_blackFFFFB(
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
							if (!x.equals(z)) {
								if (!i.equals(x)) {
									if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_3B(z) == null) {
										if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_10BB(i,
												z) == null) {
											if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_0B(
													x) == null) {
												if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_1BBB(x,
														i, z) == null) {
													if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_2BBB(
															x, i, z) == null) {
														if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_4BBB(
																z, x, i) == null) {
															if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_5BBB(
																	z, x, i) == null) {
																if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_9BB(
																		x, z) == null) {
																	if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_11BB(
																			x, z) == null) {
																		for (Node tmpY : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(x,
																						Node.class, "next")) {
																			if (tmpY instanceof Command) {
																				Command y = (Command) tmpY;
																				if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_6B(
																						y) == null) {
																					if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_7BBBB(
																							y, x, i, z) == null) {
																						if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_8BBBB(
																								y, x, i, z) == null) {
																							if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_12BB(
																									x, y) == null) {
																								if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_13BB(
																										i, y) == null) {
																									if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_14BB(
																											z,
																											y) == null) {
																										if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_15BB(
																												x,
																												y) == null) {
																											if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_16BB(
																													i,
																													y) == null) {
																												if (pattern_whileld2branchbb_20_2_testcorematchandDECs_black_nac_17BB(
																														z,
																														y) == null) {
																													_result.add(
																															new Object[] {
																																	x,
																																	i,
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
			whileld2branchbb _this, Match match, Branch x, Branch i, Branch z, Command y) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, x, i, z, y);
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
		for (Decision __DEC_c_positive_598981 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_c_positive_598981)) {
				return new Object[] { c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_1B(Decision c) {
		for (Decision __DEC_c_negative_972639 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_c_negative_972639)) {
				return new Object[] { c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_2BBB(Decision c, While w,
			While a) {
		if (!a.equals(w)) {
			for (While __DEC_c_first_946639 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!w.equals(__DEC_c_first_946639)) {
					if (!a.equals(__DEC_c_first_946639)) {
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
			for (While __DEC_c_last_896204 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!w.equals(__DEC_c_last_896204)) {
					if (!a.equals(__DEC_c_last_896204)) {
						return new Object[] { c, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_4B(Decision c) {
		for (Program __DEC_c_first_278571 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_5BB(While a, Decision c) {
		for (Decision __DEC_a_positive_699332 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_a_positive_699332)) {
				return new Object[] { a, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_6BB(While a, Decision c) {
		for (Decision __DEC_a_negative_313762 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_a_negative_313762)) {
				return new Object[] { a, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_7BB(While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_a_last_755876 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_755876)) {
					if (!w.equals(__DEC_a_last_755876)) {
						return new Object[] { a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_8B(While a) {
		for (Program __DEC_a_first_54494 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_9BB(Assignment b,
			Decision c) {
		for (Decision __DEC_b_positive_123187 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_b_positive_123187)) {
				return new Object[] { b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_10BB(Assignment b,
			Decision c) {
		for (Decision __DEC_b_negative_43386 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_b_negative_43386)) {
				return new Object[] { b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_11BBB(Assignment b,
			While w, While a) {
		if (!a.equals(w)) {
			for (While __DEC_b_first_101611 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!w.equals(__DEC_b_first_101611)) {
					if (!a.equals(__DEC_b_first_101611)) {
						return new Object[] { b, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_12BBB(Assignment b,
			While w, While a) {
		if (!a.equals(w)) {
			for (While __DEC_b_last_183930 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!w.equals(__DEC_b_last_183930)) {
					if (!a.equals(__DEC_b_last_183930)) {
						return new Object[] { b, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_13B(Assignment b) {
		for (Program __DEC_b_first_301865 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
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
			While a) {
		if (a.equals(c.getPositive())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_19BB(Decision c,
			While a) {
		if (a.equals(c.getNegative())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_20BB(While w, While a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_21BB(Decision c,
			Assignment b) {
		if (b.equals(c.getPositive())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_22BB(Decision c,
			Assignment b) {
		if (b.equals(c.getNegative())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_23BB(While w,
			Assignment b) {
		if (b.equals(w.getFirst())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_24BB(While a,
			Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_25BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileld2branchbb_21_2_testcorematchandDECs_blackFFFFB(
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
						if (tmpC instanceof Decision) {
							Decision c = (Decision) tmpC;
							Statement tmpB = a.getLast();
							if (tmpB instanceof Assignment) {
								Assignment b = (Assignment) tmpB;
								if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_7BB(a, w) == null) {
									if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_8B(a) == null) {
										if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_20BB(w,
												a) == null) {
											if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_0B(
													c) == null) {
												if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_1B(
														c) == null) {
													if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_2BBB(
															c, w, a) == null) {
														if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_3BBB(
																c, w, a) == null) {
															if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_4B(
																	c) == null) {
																if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_5BB(
																		a, c) == null) {
																	if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_6BB(
																			a, c) == null) {
																		if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_14BB(
																				w, c) == null) {
																			if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_15BB(
																					a, c) == null) {
																				if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_16BB(
																						w, c) == null) {
																					if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_17BB(
																							a, c) == null) {
																						if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_18BB(
																								c, a) == null) {
																							if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_19BB(
																									c, a) == null) {
																								if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_9BB(
																										b, c) == null) {
																									if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_10BB(
																											b,
																											c) == null) {
																										if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_11BBB(
																												b, w,
																												a) == null) {
																											if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_12BBB(
																													b,
																													w,
																													a) == null) {
																												if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_13B(
																														b) == null) {
																													if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_21BB(
																															c,
																															b) == null) {
																														if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_22BB(
																																c,
																																b) == null) {
																															if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_23BB(
																																	w,
																																	b) == null) {
																																if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_24BB(
																																		a,
																																		b) == null) {
																																	if (pattern_whileld2branchbb_21_2_testcorematchandDECs_black_nac_25BB(
																																			w,
																																			b) == null) {
																																		_result.add(
																																				new Object[] {
																																						w,
																																						c,
																																						a,
																																						b,
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
			whileld2branchbb _this, Match match, While w, Decision c, While a, Assignment b) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, w, c, a, b);
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
		EObject _localVariable_1 = targetMatch.getObject("i");
		EObject _localVariable_2 = sourceMatch.getObject("w");
		EObject _localVariable_3 = sourceMatch.getObject("c");
		EObject _localVariable_4 = sourceMatch.getObject("a");
		EObject _localVariable_5 = targetMatch.getObject("z");
		EObject _localVariable_6 = targetMatch.getObject("y");
		EObject _localVariable_7 = sourceMatch.getObject("b");
		EObject tmpX = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpZ = _localVariable_5;
		EObject tmpY = _localVariable_6;
		EObject tmpB = _localVariable_7;
		if (tmpX instanceof Branch) {
			Branch x = (Branch) tmpX;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					if (tmpC instanceof Decision) {
						Decision c = (Decision) tmpC;
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							if (tmpZ instanceof Branch) {
								Branch z = (Branch) tmpZ;
								if (tmpY instanceof Command) {
									Command y = (Command) tmpY;
									if (tmpB instanceof Assignment) {
										Assignment b = (Assignment) tmpB;
										return new Object[] { x, i, w, c, a, z, y, b, targetMatch, sourceMatch };
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

	public static final Object[] pattern_whileld2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Branch x, Branch i,
			While w, Decision c, While a, Branch z, Command y, Assignment b, Match sourceMatch, Match targetMatch) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (!a.equals(w)) {
						if (!sourceMatch.equals(targetMatch)) {
							return new Object[] { x, i, w, c, a, z, y, b, sourceMatch, targetMatch };
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
			Branch i = (Branch) result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_binding[1];
			While w = (While) result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_binding[2];
			Decision c = (Decision) result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_binding[3];
			While a = (While) result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_binding[4];
			Branch z = (Branch) result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_binding[5];
			Command y = (Command) result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_binding[6];
			Assignment b = (Assignment) result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_black = pattern_whileld2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					x, i, w, c, a, z, y, b, sourceMatch, targetMatch);
			if (result_pattern_whileld2branchbb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { x, i, w, c, a, z, y, b, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBB(whileld2branchbb _this,
			Branch x, Branch i, While w, Decision c, While a, Branch z, Command y, Assignment b, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(x, i, w, c, a, z, y, b, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, x, i, w, c, a, z, y, b, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileld2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			whileld2branchbb _this, Branch x, Branch i, While w, Decision c, While a, Branch z, Command y, Assignment b,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileld2branchbb_24_3_solvecsp_binding = pattern_whileld2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, x, i, w, c, a, z, y, b, sourceMatch, targetMatch);
		if (result_pattern_whileld2branchbb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whileld2branchbb_24_3_solvecsp_binding[0];

			Object[] result_pattern_whileld2branchbb_24_3_solvecsp_black = pattern_whileld2branchbb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whileld2branchbb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, x, i, w, c, a, z, y, b, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whileld2branchbb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileld2branchbb_24_5_matchcorrcontext_blackBBFBB(Branch i, While w,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class, "target")) {
				if (w.equals(w2i.getSource())) {
					_result.add(new Object[] { i, w, w2i, sourceMatch, targetMatch });
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

	public static final Object[] pattern_whileld2branchbb_24_6_createcorrespondence_blackBBBBBBBBB(Branch x, Branch i,
			While w, Decision c, While a, Branch z, Command y, Assignment b, CCMatch ccMatch) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (!a.equals(w)) {
						return new Object[] { x, i, w, c, a, z, y, b, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_24_6_createcorrespondence_greenBFBBFBBFBB(Branch x,
			Decision c, While a, Branch z, Command y, Assignment b, CCMatch ccMatch) {
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
		return new Object[] { x, a2x, c, a, b2y, z, y, c2z, b, ccMatch };
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
		for (Decision __DEC_c_positive_722284 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_c_positive_722284)) {
				return new Object[] { c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_1B(Decision c) {
		for (Decision __DEC_c_negative_213671 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_c_negative_213671)) {
				return new Object[] { c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_2BBB(Decision c, While w,
			While a) {
		if (!a.equals(w)) {
			for (While __DEC_c_first_916377 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!w.equals(__DEC_c_first_916377)) {
					if (!a.equals(__DEC_c_first_916377)) {
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
			for (While __DEC_c_last_671984 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!w.equals(__DEC_c_last_671984)) {
					if (!a.equals(__DEC_c_last_671984)) {
						return new Object[] { c, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_4B(Decision c) {
		for (Program __DEC_c_first_169624 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_5BB(While a, Decision c) {
		for (Decision __DEC_a_positive_594449 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_a_positive_594449)) {
				return new Object[] { a, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_6BB(While a, Decision c) {
		for (Decision __DEC_a_negative_985882 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_a_negative_985882)) {
				return new Object[] { a, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_7BB(While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_a_last_128393 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_128393)) {
					if (!w.equals(__DEC_a_last_128393)) {
						return new Object[] { a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_8B(While a) {
		for (Program __DEC_a_first_609920 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_9BB(Assignment b, Decision c) {
		for (Decision __DEC_b_positive_505453 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_b_positive_505453)) {
				return new Object[] { b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_10BB(Assignment b,
			Decision c) {
		for (Decision __DEC_b_negative_418699 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_b_negative_418699)) {
				return new Object[] { b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_11BBB(Assignment b, While w,
			While a) {
		if (!a.equals(w)) {
			for (While __DEC_b_first_963219 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!w.equals(__DEC_b_first_963219)) {
					if (!a.equals(__DEC_b_first_963219)) {
						return new Object[] { b, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_12BBB(Assignment b, While w,
			While a) {
		if (!a.equals(w)) {
			for (While __DEC_b_last_455069 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!w.equals(__DEC_b_last_455069)) {
					if (!a.equals(__DEC_b_last_455069)) {
						return new Object[] { b, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_13B(Assignment b) {
		for (Program __DEC_b_first_30542 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
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

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_18BB(Decision c, While a) {
		if (a.equals(c.getPositive())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_19BB(Decision c, While a) {
		if (a.equals(c.getNegative())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_20BB(While w, While a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_21BB(Decision c,
			Assignment b) {
		if (b.equals(c.getPositive())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_22BB(Decision c,
			Assignment b) {
		if (b.equals(c.getNegative())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_23BB(While w, Assignment b) {
		if (b.equals(w.getFirst())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_24BB(While a, Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_25BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_27_1_matchtggpattern_blackBBBB(While w, Decision c, While a,
			Assignment b) {
		if (!a.equals(w)) {
			if (a.equals(w.getFirst())) {
				if (c.equals(w.getNext())) {
					if (b.equals(a.getLast())) {
						if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_0B(c) == null) {
							if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_1B(c) == null) {
								if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_2BBB(c, w, a) == null) {
									if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_3BBB(c, w, a) == null) {
										if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_4B(c) == null) {
											if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_5BB(a,
													c) == null) {
												if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_6BB(a,
														c) == null) {
													if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_7BB(a,
															w) == null) {
														if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_8B(
																a) == null) {
															if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_9BB(
																	b, c) == null) {
																if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_10BB(
																		b, c) == null) {
																	if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_11BBB(
																			b, w, a) == null) {
																		if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_12BBB(
																				b, w, a) == null) {
																			if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_13B(
																					b) == null) {
																				if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_14BB(
																						w, c) == null) {
																					if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_15BB(
																							a, c) == null) {
																						if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_16BB(
																								w, c) == null) {
																							if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_17BB(
																									a, c) == null) {
																								if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_18BB(
																										c, a) == null) {
																									if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_19BB(
																											c,
																											a) == null) {
																										if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_20BB(
																												w,
																												a) == null) {
																											if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_21BB(
																													c,
																													b) == null) {
																												if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_22BB(
																														c,
																														b) == null) {
																													if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_23BB(
																															w,
																															b) == null) {
																														if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_24BB(
																																a,
																																b) == null) {
																															if (pattern_whileld2branchbb_27_1_matchtggpattern_black_nac_25BB(
																																	w,
																																	b) == null) {
																																return new Object[] {
																																		w,
																																		c,
																																		a,
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
		for (Graph __DEC_x_root_780574 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
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
					for (Branch __DEC_x_positive_89349 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_89349)) {
							if (!i.equals(__DEC_x_positive_89349)) {
								if (!z.equals(__DEC_x_positive_89349)) {
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
					for (Branch __DEC_x_negative_749401 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_749401)) {
							if (!i.equals(__DEC_x_negative_749401)) {
								if (!z.equals(__DEC_x_negative_749401)) {
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

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_3B(Branch z) {
		for (Graph __DEC_z_root_622973 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_4BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_positive_496023 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_496023)) {
							if (!x.equals(__DEC_z_positive_496023)) {
								if (!i.equals(__DEC_z_positive_496023)) {
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

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_5BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_negative_310362 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_310362)) {
							if (!x.equals(__DEC_z_negative_310362)) {
								if (!i.equals(__DEC_z_negative_310362)) {
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

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_6B(Command y) {
		for (Graph __DEC_y_root_737358 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_7BBBB(Command y, Branch x,
			Branch i, Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_y_positive_143348 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!x.equals(__DEC_y_positive_143348)) {
							if (!i.equals(__DEC_y_positive_143348)) {
								if (!z.equals(__DEC_y_positive_143348)) {
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

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_8BBBB(Command y, Branch x,
			Branch i, Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_y_negative_659422 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!x.equals(__DEC_y_negative_659422)) {
							if (!i.equals(__DEC_y_negative_659422)) {
								if (!z.equals(__DEC_y_negative_659422)) {
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

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_9BB(Branch x, Branch z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_10BB(Branch i, Branch z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_11BB(Branch x, Branch z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_12BB(Branch x, Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_13BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_14BB(Branch z, Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_15BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_16BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_17BB(Branch z, Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_28_1_matchtggpattern_blackBBBB(Branch x, Branch i, Branch z,
			Command y) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					if (z.equals(i.getNegative())) {
						if (x.equals(i.getPositive())) {
							if (x.equals(y.getNext())) {
								if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_0B(x) == null) {
									if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_1BBB(x, i, z) == null) {
										if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_2BBB(x, i,
												z) == null) {
											if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_3B(z) == null) {
												if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_4BBB(z, x,
														i) == null) {
													if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_5BBB(z,
															x, i) == null) {
														if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_6B(
																y) == null) {
															if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_7BBBB(
																	y, x, i, z) == null) {
																if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_8BBBB(
																		y, x, i, z) == null) {
																	if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_9BB(
																			x, z) == null) {
																		if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_10BB(
																				i, z) == null) {
																			if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_11BB(
																					x, z) == null) {
																				if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_12BB(
																						x, y) == null) {
																					if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_13BB(
																							i, y) == null) {
																						if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_14BB(
																								z, y) == null) {
																							if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_15BB(
																									x, y) == null) {
																								if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_16BB(
																										i, y) == null) {
																									if (pattern_whileld2branchbb_28_1_matchtggpattern_black_nac_17BB(
																											z,
																											y) == null) {
																										return new Object[] {
																												x, i, z,
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
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
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
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
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
					Branch i = w2i.getTarget();
					if (i != null) {
						Statement tmpW = w2i.getSource();
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							if (pattern_whileld2branchbb_29_2_isapplicablecore_black_nac_1BB(ruleResult, w2i) == null) {
								if (pattern_whileld2branchbb_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										i) == null) {
									if (pattern_whileld2branchbb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_whileld2branchbb_29_3_solveCSP_bindingFBBBBBB(whileld2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch i, While w, S2B w2i, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, i, w, w2i, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, i, w, w2i, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whileld2branchbb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileld2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(whileld2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch i, While w, S2B w2i, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whileld2branchbb_29_3_solveCSP_binding = pattern_whileld2branchbb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, i, w, w2i, ruleResult);
		if (result_pattern_whileld2branchbb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileld2branchbb_29_3_solveCSP_binding[0];

			Object[] result_pattern_whileld2branchbb_29_3_solveCSP_black = pattern_whileld2branchbb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whileld2branchbb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, i, w, w2i, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whileld2branchbb_29_4_checkCSP_expressionFBB(whileld2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileld2branchbb_29_5_checknacs_blackBBB(Branch i, While w, S2B w2i) {
		return new Object[] { i, w, w2i };
	}

	public static final Object[] pattern_whileld2branchbb_29_6_perform_blackBBBB(Branch i, While w, S2B w2i,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { i, w, w2i, ruleResult };
	}

	public static final Object[] pattern_whileld2branchbb_29_6_perform_greenFBFBFFFFFFFB(Branch i, While w,
			ModelgeneratorRuleResult ruleResult) {
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision c = SourcecodeFactory.eINSTANCE.createDecision();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		i.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		a2x.setTarget(x);
		ruleResult.getCorrObjects().add(a2x);
		w.setNext(c);
		ruleResult.getSourceObjects().add(c);
		w.setFirst(a);
		a2x.setSource(a);
		ruleResult.getSourceObjects().add(a);
		ruleResult.getCorrObjects().add(b2y);
		i.setNegative(z);
		ruleResult.getTargetObjects().add(z);
		b2y.setTarget(y);
		y.setNext(x);
		ruleResult.getTargetObjects().add(y);
		c2z.setSource(c);
		c2z.setTarget(z);
		ruleResult.getCorrObjects().add(c2z);
		a.setLast(b);
		b2y.setSource(b);
		ruleResult.getSourceObjects().add(b);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { x, i, a2x, w, c, a, b2y, z, y, c2z, b, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whileld2branchbb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whileld2branchbbImpl
