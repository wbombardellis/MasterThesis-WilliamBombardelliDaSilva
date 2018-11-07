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
import org.wbsilva.bx.sourcecode2controlflow.Rules.whileuld2branchubb;

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
 * An implementation of the model object '<em><b>whileuld2branchubb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class whileuld2branchubbImpl extends AbstractRuleImpl implements whileuld2branchubb {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected whileuld2branchubbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getwhileuld2branchubb();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, While w, While a, Decision c, Assignment b) {

		Object[] result1_black = whileuld2branchubbImpl.pattern_whileuld2branchubb_0_1_initialbindings_blackBBBBBB(this,
				match, w, a, c, b);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[a] = " + a + ", " + "[c] = " + c + ", "
					+ "[b] = " + b + ".");
		}

		Object[] result2_bindingAndBlack = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, w, a, c, b);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[a] = " + a + ", " + "[c] = " + c + ", "
					+ "[b] = " + b + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileuld2branchubbImpl.pattern_whileuld2branchubb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileuld2branchubbImpl
					.pattern_whileuld2branchubb_0_4_collectelementstobetranslated_blackBBBBB(match, w, a, c, b);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[w] = " + w + ", " + "[a] = " + a + ", " + "[c] = " + c + ", " + "[b] = " + b + ".");
			}
			whileuld2branchubbImpl.pattern_whileuld2branchubb_0_4_collectelementstobetranslated_greenBBBBBFFFF(match, w,
					a, c, b);
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge a__b____first = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[8];

			Object[] result5_black = whileuld2branchubbImpl
					.pattern_whileuld2branchubb_0_5_collectcontextelements_blackBBBBB(match, w, a, c, b);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[w] = " + w + ", " + "[a] = " + a + ", " + "[c] = " + c + ", " + "[b] = " + b + ".");
			}
			whileuld2branchubbImpl.pattern_whileuld2branchubb_0_5_collectcontextelements_greenBB(match, w);

			// 
			whileuld2branchubbImpl.pattern_whileuld2branchubb_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					w, a, c, b);
			return whileuld2branchubbImpl.pattern_whileuld2branchubb_0_7_expressionF();
		} else {
			return whileuld2branchubbImpl.pattern_whileuld2branchubb_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		S2B w2i = (S2B) result1_bindingAndBlack[0];
		While w = (While) result1_bindingAndBlack[1];
		While a = (While) result1_bindingAndBlack[2];
		Decision c = (Decision) result1_bindingAndBlack[3];
		Assignment b = (Assignment) result1_bindingAndBlack[4];
		Branch i = (Branch) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_1_1_performtransformation_greenFFBFFBBFBF(a, c, b, i);
		S2B c2z = (S2B) result1_green[0];
		Command y = (Command) result1_green[1];
		S2N b2y = (S2N) result1_green[3];
		Branch z = (Branch) result1_green[4];
		S2B a2x = (S2B) result1_green[7];
		Branch x = (Branch) result1_green[9];

		Object[] result2_black = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_1_2_collecttranslatedelements_blackBBBBBBBBB(c2z, y, a, b2y, z, c, b, a2x,
						x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c2z] = " + c2z + ", " + "[y] = "
					+ y + ", " + "[a] = " + a + ", " + "[b2y] = " + b2y + ", " + "[z] = " + z + ", " + "[c] = " + c
					+ ", " + "[b] = " + b + ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ".");
		}
		Object[] result2_green = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_1_2_collecttranslatedelements_greenFBBBBBBBBB(c2z, y, a, b2y, z, c, b, a2x,
						x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, c2z, w2i, w, y, a,
						b2y, z, c, b, a2x, i, x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c2z] = " + c2z + ", " + "[w2i] = " + w2i + ", " + "[w] = " + w + ", " + "[y] = " + y
					+ ", " + "[a] = " + a + ", " + "[b2y] = " + b2y + ", " + "[z] = " + z + ", " + "[c] = " + c + ", "
					+ "[b] = " + b + ", " + "[a2x] = " + a2x + ", " + "[i] = " + i + ", " + "[x] = " + x + ".");
		}
		whileuld2branchubbImpl.pattern_whileuld2branchubb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, c2z, w, y, a, b2y, z, c, b, a2x, i, x);
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[25];

		// 
		// 
		whileuld2branchubbImpl.pattern_whileuld2branchubb_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
				c2z, w2i, w, y, a, b2y, z, c, b, a2x, i, x);
		return whileuld2branchubbImpl.pattern_whileuld2branchubb_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whileuld2branchubbImpl.pattern_whileuld2branchubb_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		While w = (While) result2_binding[0];
		While a = (While) result2_binding[1];
		Decision c = (Decision) result2_binding[2];
		Assignment b = (Assignment) result2_binding[3];
		for (Object[] result2_black : whileuld2branchubbImpl.pattern_whileuld2branchubb_2_2_corematch_blackFBBBBFB(w, a,
				c, b, match)) {
			S2B w2i = (S2B) result2_black[0];
			Branch i = (Branch) result2_black[5];
			// ForEach 
			for (Object[] result3_black : whileuld2branchubbImpl
					.pattern_whileuld2branchubb_2_3_findcontext_blackBBBBBB(w2i, w, a, c, b, i)) {
				Object[] result3_green = whileuld2branchubbImpl
						.pattern_whileuld2branchubb_2_3_findcontext_greenBBBBBBFFFFFFF(w2i, w, a, c, b, i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = whileuld2branchubbImpl
						.pattern_whileuld2branchubb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, w2i,
								w, a, c, b, i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w2i] = " + w2i + ", " + "[w] = "
							+ w + ", " + "[a] = " + a + ", " + "[c] = " + c + ", " + "[b] = " + b + ", " + "[i] = " + i
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whileuld2branchubbImpl.pattern_whileuld2branchubb_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whileuld2branchubbImpl
							.pattern_whileuld2branchubb_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whileuld2branchubbImpl.pattern_whileuld2branchubb_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whileuld2branchubbImpl.pattern_whileuld2branchubb_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, While w, While a, Decision c, Assignment b) {
		match.registerObject("w", w);
		match.registerObject("a", a);
		match.registerObject("c", c);
		match.registerObject("b", b);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, While w, While a, Decision c, Assignment b) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, S2B w2i, While w, While a, Decision c,
			Assignment b, Branch i) {// Create CSP
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
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("b", b);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject c2z, EObject w2i, EObject w, EObject y,
			EObject a, EObject b2y, EObject z, EObject c, EObject b, EObject a2x, EObject i, EObject x) {
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.Decision.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass())
						.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command y, Branch z, Branch i, Branch x) {

		Object[] result1_black = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_10_1_initialbindings_blackBBBBBB(this, match, y, z, i, x);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[i] = " + i + ", "
					+ "[x] = " + x + ".");
		}

		Object[] result2_bindingAndBlack = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, y, z, i, x);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[i] = " + i + ", "
					+ "[x] = " + x + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileuld2branchubbImpl.pattern_whileuld2branchubb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileuld2branchubbImpl
					.pattern_whileuld2branchubb_10_4_collectelementstobetranslated_blackBBBBB(match, y, z, i, x);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[y] = " + y + ", " + "[z] = " + z + ", " + "[i] = " + i + ", " + "[x] = " + x + ".");
			}
			whileuld2branchubbImpl.pattern_whileuld2branchubb_10_4_collectelementstobetranslated_greenBBBBBFFFF(match,
					y, z, i, x);
			//nothing EMoflonEdge y__x____next = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result4_green[8];

			Object[] result5_black = whileuld2branchubbImpl
					.pattern_whileuld2branchubb_10_5_collectcontextelements_blackBBBBB(match, y, z, i, x);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[y] = " + y + ", " + "[z] = " + z + ", " + "[i] = " + i + ", " + "[x] = " + x + ".");
			}
			whileuld2branchubbImpl.pattern_whileuld2branchubb_10_5_collectcontextelements_greenBB(match, i);

			// 
			whileuld2branchubbImpl.pattern_whileuld2branchubb_10_6_registerobjectstomatch_expressionBBBBBB(this, match,
					y, z, i, x);
			return whileuld2branchubbImpl.pattern_whileuld2branchubb_10_7_expressionF();
		} else {
			return whileuld2branchubbImpl.pattern_whileuld2branchubb_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		S2B w2i = (S2B) result1_bindingAndBlack[0];
		While w = (While) result1_bindingAndBlack[1];
		Command y = (Command) result1_bindingAndBlack[2];
		Branch z = (Branch) result1_bindingAndBlack[3];
		Branch i = (Branch) result1_bindingAndBlack[4];
		Branch x = (Branch) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_11_1_performtransformation_greenFBBFFBFFFB(w, y, z, x);
		S2B c2z = (S2B) result1_green[0];
		While a = (While) result1_green[3];
		S2N b2y = (S2N) result1_green[4];
		Decision c = (Decision) result1_green[6];
		Assignment b = (Assignment) result1_green[7];
		S2B a2x = (S2B) result1_green[8];

		Object[] result2_black = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_11_2_collecttranslatedelements_blackBBBBBBBBB(c2z, y, a, b2y, z, c, b, a2x,
						x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c2z] = " + c2z + ", " + "[y] = "
					+ y + ", " + "[a] = " + a + ", " + "[b2y] = " + b2y + ", " + "[z] = " + z + ", " + "[c] = " + c
					+ ", " + "[b] = " + b + ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ".");
		}
		Object[] result2_green = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_11_2_collecttranslatedelements_greenFBBBBBBBBB(c2z, y, a, b2y, z, c, b, a2x,
						x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, c2z, w2i, w, y, a,
						b2y, z, c, b, a2x, i, x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c2z] = " + c2z + ", " + "[w2i] = " + w2i + ", " + "[w] = " + w + ", " + "[y] = " + y
					+ ", " + "[a] = " + a + ", " + "[b2y] = " + b2y + ", " + "[z] = " + z + ", " + "[c] = " + c + ", "
					+ "[b] = " + b + ", " + "[a2x] = " + a2x + ", " + "[i] = " + i + ", " + "[x] = " + x + ".");
		}
		whileuld2branchubbImpl.pattern_whileuld2branchubb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, c2z, w, y, a, b2y, z, c, b, a2x, i, x);
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[25];

		// 
		// 
		whileuld2branchubbImpl.pattern_whileuld2branchubb_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this,
				ruleresult, c2z, w2i, w, y, a, b2y, z, c, b, a2x, i, x);
		return whileuld2branchubbImpl.pattern_whileuld2branchubb_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whileuld2branchubbImpl.pattern_whileuld2branchubb_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Command y = (Command) result2_binding[0];
		Branch z = (Branch) result2_binding[1];
		Branch i = (Branch) result2_binding[2];
		Branch x = (Branch) result2_binding[3];
		for (Object[] result2_black : whileuld2branchubbImpl.pattern_whileuld2branchubb_12_2_corematch_blackFFBBBBB(y,
				z, i, x, match)) {
			S2B w2i = (S2B) result2_black[0];
			While w = (While) result2_black[1];
			// ForEach 
			for (Object[] result3_black : whileuld2branchubbImpl
					.pattern_whileuld2branchubb_12_3_findcontext_blackBBBBBB(w2i, w, y, z, i, x)) {
				Object[] result3_green = whileuld2branchubbImpl
						.pattern_whileuld2branchubb_12_3_findcontext_greenBBBBBBFFFFFFF(w2i, w, y, z, i, x);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = whileuld2branchubbImpl
						.pattern_whileuld2branchubb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, w2i,
								w, y, z, i, x);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w2i] = " + w2i + ", " + "[w] = "
							+ w + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[i] = " + i + ", " + "[x] = " + x
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whileuld2branchubbImpl.pattern_whileuld2branchubb_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whileuld2branchubbImpl
							.pattern_whileuld2branchubb_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whileuld2branchubbImpl.pattern_whileuld2branchubb_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whileuld2branchubbImpl.pattern_whileuld2branchubb_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Command y, Branch z, Branch i, Branch x) {
		match.registerObject("y", y);
		match.registerObject("z", z);
		match.registerObject("i", i);
		match.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command y, Branch z, Branch i, Branch x) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, S2B w2i, While w, Command y, Branch z,
			Branch i, Branch x) {// Create CSP
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
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("x", x);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject c2z, EObject w2i, EObject w, EObject y,
			EObject a, EObject b2y, EObject z, EObject c, EObject b, EObject a2x, EObject i, EObject x) {
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_80(EMoflonEdge _edge_next) {

		Object[] result1_bindingAndBlack = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whileuld2branchubbImpl.pattern_whileuld2branchubb_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whileuld2branchubbImpl
				.pattern_whileuld2branchubb_20_2_testcorematchandDECs_blackFFFFB(_edge_next)) {
			Command y = (Command) result2_black[0];
			Branch z = (Branch) result2_black[1];
			Branch i = (Branch) result2_black[2];
			Branch x = (Branch) result2_black[3];
			Object[] result2_green = whileuld2branchubbImpl
					.pattern_whileuld2branchubb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileuld2branchubbImpl
					.pattern_whileuld2branchubb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, y, z, i, x)) {
				// 
				if (whileuld2branchubbImpl
						.pattern_whileuld2branchubb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = whileuld2branchubbImpl
							.pattern_whileuld2branchubb_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whileuld2branchubbImpl.pattern_whileuld2branchubb_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whileuld2branchubbImpl.pattern_whileuld2branchubb_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_86(EMoflonEdge _edge_last) {

		Object[] result1_bindingAndBlack = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whileuld2branchubbImpl.pattern_whileuld2branchubb_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whileuld2branchubbImpl
				.pattern_whileuld2branchubb_21_2_testcorematchandDECs_blackFFFFB(_edge_last)) {
			While w = (While) result2_black[0];
			While a = (While) result2_black[1];
			Decision c = (Decision) result2_black[2];
			Assignment b = (Assignment) result2_black[3];
			Object[] result2_green = whileuld2branchubbImpl
					.pattern_whileuld2branchubb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileuld2branchubbImpl
					.pattern_whileuld2branchubb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, w, a, c, b)) {
				// 
				if (whileuld2branchubbImpl
						.pattern_whileuld2branchubb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = whileuld2branchubbImpl
							.pattern_whileuld2branchubb_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whileuld2branchubbImpl.pattern_whileuld2branchubb_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whileuld2branchubbImpl.pattern_whileuld2branchubb_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("whileuld2branchubb");
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
		ruleResult.setRule("whileuld2branchubb");
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

		Object[] result1_black = whileuld2branchubbImpl.pattern_whileuld2branchubb_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whileuld2branchubbImpl.pattern_whileuld2branchubb_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		While w = (While) result2_bindingAndBlack[0];
		Command y = (Command) result2_bindingAndBlack[1];
		While a = (While) result2_bindingAndBlack[2];
		Branch z = (Branch) result2_bindingAndBlack[3];
		Decision c = (Decision) result2_bindingAndBlack[4];
		Assignment b = (Assignment) result2_bindingAndBlack[5];
		Branch i = (Branch) result2_bindingAndBlack[6];
		Branch x = (Branch) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, w, y, a, z, c, b, i, x,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[w] = " + w + ", " + "[y] = " + y + ", " + "[a] = " + a + ", " + "[z] = " + z + ", " + "[c] = "
					+ c + ", " + "[b] = " + b + ", " + "[i] = " + i + ", " + "[x] = " + x + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whileuld2branchubbImpl.pattern_whileuld2branchubb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whileuld2branchubbImpl
					.pattern_whileuld2branchubb_24_5_matchcorrcontext_blackFBBBB(w, i, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[0];
				Object[] result5_green = whileuld2branchubbImpl
						.pattern_whileuld2branchubb_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whileuld2branchubbImpl
						.pattern_whileuld2branchubb_24_6_createcorrespondence_blackBBBBBBBBB(w, y, a, z, c, b, i, x,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w] = " + w + ", "
							+ "[y] = " + y + ", " + "[a] = " + a + ", " + "[z] = " + z + ", " + "[c] = " + c + ", "
							+ "[b] = " + b + ", " + "[i] = " + i + ", " + "[x] = " + x + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				whileuld2branchubbImpl.pattern_whileuld2branchubb_24_6_createcorrespondence_greenFBBFBBBFBB(y, a, z, c,
						b, x, ccMatch);
				//nothing S2B c2z = (S2B) result6_green[0];
				//nothing S2N b2y = (S2N) result6_green[3];
				//nothing S2B a2x = (S2B) result6_green[7];

				Object[] result7_black = whileuld2branchubbImpl
						.pattern_whileuld2branchubb_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whileuld2branchubbImpl.pattern_whileuld2branchubb_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return whileuld2branchubbImpl.pattern_whileuld2branchubb_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(While w, Command y, While a, Branch z, Decision c, Assignment b, Branch i,
			Branch x, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(While w, While a, Decision c, Assignment b) {// 
		Object[] result1_black = whileuld2branchubbImpl.pattern_whileuld2branchubb_27_1_matchtggpattern_blackBBBB(w, a,
				c, b);
		if (result1_black != null) {
			return whileuld2branchubbImpl.pattern_whileuld2branchubb_27_2_expressionF();
		} else {
			return whileuld2branchubbImpl.pattern_whileuld2branchubb_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Command y, Branch z, Branch i, Branch x) {// 
		Object[] result1_black = whileuld2branchubbImpl.pattern_whileuld2branchubb_28_1_matchtggpattern_blackBBBB(y, z,
				i, x);
		if (result1_black != null) {
			return whileuld2branchubbImpl.pattern_whileuld2branchubb_28_2_expressionF();
		} else {
			return whileuld2branchubbImpl.pattern_whileuld2branchubb_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B w2iParameter) {

		Object[] result1_black = whileuld2branchubbImpl.pattern_whileuld2branchubb_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whileuld2branchubbImpl.pattern_whileuld2branchubb_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : whileuld2branchubbImpl
				.pattern_whileuld2branchubb_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList w2iList = (RuleEntryList) result2_black[0];
			S2B w2i = (S2B) result2_black[1];
			While w = (While) result2_black[2];
			Branch i = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = whileuld2branchubbImpl
					.pattern_whileuld2branchubb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, w2i, w, i,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w2i] = " + w2i + ", " + "[w] = " + w
						+ ", " + "[i] = " + i + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whileuld2branchubbImpl.pattern_whileuld2branchubb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whileuld2branchubbImpl.pattern_whileuld2branchubb_29_5_checknacs_blackBBB(w2i,
						w, i);
				if (result5_black != null) {

					Object[] result6_black = whileuld2branchubbImpl
							.pattern_whileuld2branchubb_29_6_perform_blackBBBB(w2i, w, i, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w2i] = " + w2i + ", "
								+ "[w] = " + w + ", " + "[i] = " + i + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whileuld2branchubbImpl.pattern_whileuld2branchubb_29_6_perform_greenFBFFFFFFFBFB(w, i, ruleResult);
					//nothing S2B c2z = (S2B) result6_green[0];
					//nothing Command y = (Command) result6_green[2];
					//nothing While a = (While) result6_green[3];
					//nothing S2N b2y = (S2N) result6_green[4];
					//nothing Branch z = (Branch) result6_green[5];
					//nothing Decision c = (Decision) result6_green[6];
					//nothing Assignment b = (Assignment) result6_green[7];
					//nothing S2B a2x = (S2B) result6_green[8];
					//nothing Branch x = (Branch) result6_green[10];

				} else {
				}

			} else {
			}

		}
		return whileuld2branchubbImpl.pattern_whileuld2branchubb_29_7_expressionFB(ruleResult);
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
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPROPRIATE_FWD__MATCH_WHILE_WHILE_DECISION_ASSIGNMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Decision) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.WHILEULD2BRANCHUBB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEULD2BRANCHUBB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WHILE_WHILE_DECISION_ASSIGNMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Decision) arguments.get(3), (Assignment) arguments.get(4));
			return null;
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WHILE_WHILE_DECISION_ASSIGNMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(While) arguments.get(2), (Decision) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_S2B_WHILE_WHILE_DECISION_ASSIGNMENT_BRANCH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(While) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4),
					(Assignment) arguments.get(5), (Branch) arguments.get(6));
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULD2BRANCHUBB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.WHILEULD2BRANCHUBB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPROPRIATE_BWD__MATCH_COMMAND_BRANCH_BRANCH_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.WHILEULD2BRANCHUBB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEULD2BRANCHUBB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_BRANCH_BRANCH_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4));
			return null;
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_BRANCH_BRANCH_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_WHILE_COMMAND_BRANCH_BRANCH_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(While) arguments.get(2), (Command) arguments.get(3), (Branch) arguments.get(4),
					(Branch) arguments.get(5), (Branch) arguments.get(6));
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULD2BRANCHUBB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.WHILEULD2BRANCHUBB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_80__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_80((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_86__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_86((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEULD2BRANCHUBB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEULD2BRANCHUBB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPLICABLE_SOLVE_CSP_CC__WHILE_COMMAND_WHILE_BRANCH_DECISION_ASSIGNMENT_BRANCH_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((While) arguments.get(0), (Command) arguments.get(1),
					(While) arguments.get(2), (Branch) arguments.get(3), (Decision) arguments.get(4),
					(Assignment) arguments.get(5), (Branch) arguments.get(6), (Branch) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEULD2BRANCHUBB___CHECK_DEC_FWD__WHILE_WHILE_DECISION_ASSIGNMENT:
			return checkDEC_FWD((While) arguments.get(0), (While) arguments.get(1), (Decision) arguments.get(2),
					(Assignment) arguments.get(3));
		case RulesPackage.WHILEULD2BRANCHUBB___CHECK_DEC_BWD__COMMAND_BRANCH_BRANCH_BRANCH:
			return checkDEC_BWD((Command) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.WHILEULD2BRANCHUBB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILEULD2BRANCHUBB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_WHILE_BRANCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(While) arguments.get(2), (Branch) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILEULD2BRANCHUBB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whileuld2branchubb_0_1_initialbindings_blackBBBBBB(whileuld2branchubb _this,
			Match match, While w, While a, Decision c, Assignment b) {
		if (!a.equals(w)) {
			return new Object[] { _this, match, w, a, c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_0_2_SolveCSP_bindingFBBBBBB(whileuld2branchubb _this,
			Match match, While w, While a, Decision c, Assignment b) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, w, a, c, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, w, a, c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileuld2branchubb_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			whileuld2branchubb _this, Match match, While w, While a, Decision c, Assignment b) {
		Object[] result_pattern_whileuld2branchubb_0_2_SolveCSP_binding = pattern_whileuld2branchubb_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, w, a, c, b);
		if (result_pattern_whileuld2branchubb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileuld2branchubb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whileuld2branchubb_0_2_SolveCSP_black = pattern_whileuld2branchubb_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileuld2branchubb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, w, a, c, b };
			}
		}
		return null;
	}

	public static final boolean pattern_whileuld2branchubb_0_3_CheckCSP_expressionFBB(whileuld2branchubb _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileuld2branchubb_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			While w, While a, Decision c, Assignment b) {
		if (!a.equals(w)) {
			return new Object[] { match, w, a, c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_0_4_collectelementstobetranslated_greenBBBBBFFFF(
			Match match, While w, While a, Decision c, Assignment b) {
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(c);
		match.getToBeTranslatedNodes().add(b);
		String a__b____last_name_prime = "last";
		String a__b____first_name_prime = "first";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____last);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____first);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		a__b____last.setName(a__b____last_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		return new Object[] { match, w, a, c, b, a__b____last, a__b____first, w__a____first, w__c____next };
	}

	public static final Object[] pattern_whileuld2branchubb_0_5_collectcontextelements_blackBBBBB(Match match, While w,
			While a, Decision c, Assignment b) {
		if (!a.equals(w)) {
			return new Object[] { match, w, a, c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whileuld2branchubb_0_6_registerobjectstomatch_expressionBBBBBB(
			whileuld2branchubb _this, Match match, While w, While a, Decision c, Assignment b) {
		_this.registerObjectsToMatch_FWD(match, w, a, c, b);

	}

	public static final boolean pattern_whileuld2branchubb_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileuld2branchubb_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileuld2branchubb_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_1 = isApplicableMatch.getObject("w");
		EObject _localVariable_2 = isApplicableMatch.getObject("a");
		EObject _localVariable_3 = isApplicableMatch.getObject("c");
		EObject _localVariable_4 = isApplicableMatch.getObject("b");
		EObject _localVariable_5 = isApplicableMatch.getObject("i");
		EObject tmpW2i = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpB = _localVariable_4;
		EObject tmpI = _localVariable_5;
		if (tmpW2i instanceof S2B) {
			S2B w2i = (S2B) tmpW2i;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpC instanceof Decision) {
						Decision c = (Decision) tmpC;
						if (tmpB instanceof Assignment) {
							Assignment b = (Assignment) tmpB;
							if (tmpI instanceof Branch) {
								Branch i = (Branch) tmpI;
								return new Object[] { w2i, w, a, c, b, i, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_1_1_performtransformation_blackBBBBBBFBB(S2B w2i, While w,
			While a, Decision c, Assignment b, Branch i, whileuld2branchubb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!a.equals(w)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { w2i, w, a, c, b, i, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			whileuld2branchubb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whileuld2branchubb_1_1_performtransformation_binding = pattern_whileuld2branchubb_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_whileuld2branchubb_1_1_performtransformation_binding != null) {
			S2B w2i = (S2B) result_pattern_whileuld2branchubb_1_1_performtransformation_binding[0];
			While w = (While) result_pattern_whileuld2branchubb_1_1_performtransformation_binding[1];
			While a = (While) result_pattern_whileuld2branchubb_1_1_performtransformation_binding[2];
			Decision c = (Decision) result_pattern_whileuld2branchubb_1_1_performtransformation_binding[3];
			Assignment b = (Assignment) result_pattern_whileuld2branchubb_1_1_performtransformation_binding[4];
			Branch i = (Branch) result_pattern_whileuld2branchubb_1_1_performtransformation_binding[5];

			Object[] result_pattern_whileuld2branchubb_1_1_performtransformation_black = pattern_whileuld2branchubb_1_1_performtransformation_blackBBBBBBFBB(
					w2i, w, a, c, b, i, _this, isApplicableMatch);
			if (result_pattern_whileuld2branchubb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileuld2branchubb_1_1_performtransformation_black[6];

				return new Object[] { w2i, w, a, c, b, i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_1_1_performtransformation_greenFFBFFBBFBF(While a,
			Decision c, Assignment b, Branch i) {
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		c2z.setSource(c);
		b2y.setSource(b);
		b2y.setTarget(y);
		c2z.setTarget(z);
		i.setNegative(z);
		a2x.setSource(a);
		y.setNext(x);
		i.setPositive(x);
		x.setPositive(y);
		a2x.setTarget(x);
		return new Object[] { c2z, y, a, b2y, z, c, b, a2x, i, x };
	}

	public static final Object[] pattern_whileuld2branchubb_1_2_collecttranslatedelements_blackBBBBBBBBB(S2B c2z,
			Command y, While a, S2N b2y, Branch z, Decision c, Assignment b, S2B a2x, Branch x) {
		if (!a2x.equals(c2z)) {
			if (!x.equals(z)) {
				return new Object[] { c2z, y, a, b2y, z, c, b, a2x, x };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_1_2_collecttranslatedelements_greenFBBBBBBBBB(S2B c2z,
			Command y, While a, S2N b2y, Branch z, Decision c, Assignment b, S2B a2x, Branch x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(x);
		return new Object[] { ruleresult, c2z, y, a, b2y, z, c, b, a2x, x };
	}

	public static final Object[] pattern_whileuld2branchubb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject c2z, EObject w2i, EObject w, EObject y, EObject a, EObject b2y,
			EObject z, EObject c, EObject b, EObject a2x, EObject i, EObject x) {
		if (!c2z.equals(w2i)) {
			if (!c2z.equals(w)) {
				if (!c2z.equals(y)) {
					if (!c2z.equals(z)) {
						if (!c2z.equals(i)) {
							if (!c2z.equals(x)) {
								if (!w2i.equals(y)) {
									if (!w2i.equals(z)) {
										if (!w2i.equals(x)) {
											if (!w.equals(w2i)) {
												if (!w.equals(y)) {
													if (!w.equals(z)) {
														if (!w.equals(x)) {
															if (!y.equals(z)) {
																if (!a.equals(c2z)) {
																	if (!a.equals(w2i)) {
																		if (!a.equals(w)) {
																			if (!a.equals(y)) {
																				if (!a.equals(b2y)) {
																					if (!a.equals(z)) {
																						if (!a.equals(c)) {
																							if (!a.equals(b)) {
																								if (!a.equals(a2x)) {
																									if (!a.equals(i)) {
																										if (!a.equals(
																												x)) {
																											if (!b2y.equals(
																													c2z)) {
																												if (!b2y.equals(
																														w2i)) {
																													if (!b2y.equals(
																															w)) {
																														if (!b2y.equals(
																																y)) {
																															if (!b2y.equals(
																																	z)) {
																																if (!b2y.equals(
																																		c)) {
																																	if (!b2y.equals(
																																			i)) {
																																		if (!b2y.equals(
																																				x)) {
																																			if (!c.equals(
																																					c2z)) {
																																				if (!c.equals(
																																						w2i)) {
																																					if (!c.equals(
																																							w)) {
																																						if (!c.equals(
																																								y)) {
																																							if (!c.equals(
																																									z)) {
																																								if (!c.equals(
																																										i)) {
																																									if (!c.equals(
																																											x)) {
																																										if (!b.equals(
																																												c2z)) {
																																											if (!b.equals(
																																													w2i)) {
																																												if (!b.equals(
																																														w)) {
																																													if (!b.equals(
																																															y)) {
																																														if (!b.equals(
																																																b2y)) {
																																															if (!b.equals(
																																																	z)) {
																																																if (!b.equals(
																																																		c)) {
																																																	if (!b.equals(
																																																			i)) {
																																																		if (!b.equals(
																																																				x)) {
																																																			if (!a2x.equals(
																																																					c2z)) {
																																																				if (!a2x.equals(
																																																						w2i)) {
																																																					if (!a2x.equals(
																																																							w)) {
																																																						if (!a2x.equals(
																																																								y)) {
																																																							if (!a2x.equals(
																																																									b2y)) {
																																																								if (!a2x.equals(
																																																										z)) {
																																																									if (!a2x.equals(
																																																											c)) {
																																																										if (!a2x.equals(
																																																												b)) {
																																																											if (!a2x.equals(
																																																													i)) {
																																																												if (!a2x.equals(
																																																														x)) {
																																																													if (!i.equals(
																																																															w2i)) {
																																																														if (!i.equals(
																																																																w)) {
																																																															if (!i.equals(
																																																																	y)) {
																																																																if (!i.equals(
																																																																		z)) {
																																																																	if (!i.equals(
																																																																			x)) {
																																																																		if (!x.equals(
																																																																				y)) {
																																																																			if (!x.equals(
																																																																					z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						c2z,
																																																																						w2i,
																																																																						w,
																																																																						y,
																																																																						a,
																																																																						b2y,
																																																																						z,
																																																																						c,
																																																																						b,
																																																																						a2x,
																																																																						i,
																																																																						x };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whileuld2branchubb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject c2z, EObject w, EObject y, EObject a, EObject b2y, EObject z,
			EObject c, EObject b, EObject a2x, EObject i, EObject x) {
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileuld2branchubb";
		String y__x____next_name_prime = "next";
		String a__b____last_name_prime = "last";
		String a__b____first_name_prime = "first";
		String w__a____first_name_prime = "first";
		String c2z__z____target_name_prime = "target";
		String c2z__c____source_name_prime = "source";
		String b2y__b____source_name_prime = "source";
		String w__c____next_name_prime = "next";
		String a2x__a____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String x__y____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(y__x____next);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____first);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		ruleresult.getCreatedEdges().add(x__y____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		y__x____next.setName(y__x____next_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		return new Object[] { ruleresult, c2z, w, y, a, b2y, z, c, b, a2x, i, x, y__x____next, a__b____last,
				a__b____first, w__a____first, c2z__z____target, c2z__c____source, b2y__b____source, w__c____next,
				a2x__a____source, b2y__y____target, i__z____negative, i__x____positive, x__y____positive,
				a2x__x____target };
	}

	public static final void pattern_whileuld2branchubb_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whileuld2branchubb _this, PerformRuleResult ruleresult, EObject c2z, EObject w2i, EObject w, EObject y,
			EObject a, EObject b2y, EObject z, EObject c, EObject b, EObject a2x, EObject i, EObject x) {
		_this.registerObjects_FWD(ruleresult, c2z, w2i, w, y, a, b2y, z, c, b, a2x, i, x);

	}

	public static final PerformRuleResult pattern_whileuld2branchubb_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileuld2branchubb_2_1_preparereturnvalue_bindingFB(whileuld2branchubb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_2_1_preparereturnvalue_blackFBB(EClass eClass,
			whileuld2branchubb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_2_1_preparereturnvalue_bindingAndBlackFFB(
			whileuld2branchubb _this) {
		Object[] result_pattern_whileuld2branchubb_2_1_preparereturnvalue_binding = pattern_whileuld2branchubb_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileuld2branchubb_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whileuld2branchubb_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileuld2branchubb_2_1_preparereturnvalue_black = pattern_whileuld2branchubb_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whileuld2branchubb_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whileuld2branchubb_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whileuld2branchubb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whileuld2branchubb_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("w");
		EObject _localVariable_1 = match.getObject("a");
		EObject _localVariable_2 = match.getObject("c");
		EObject _localVariable_3 = match.getObject("b");
		EObject tmpW = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpB = _localVariable_3;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (tmpC instanceof Decision) {
					Decision c = (Decision) tmpC;
					if (tmpB instanceof Assignment) {
						Assignment b = (Assignment) tmpB;
						return new Object[] { w, a, c, b, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileuld2branchubb_2_2_corematch_blackFBBBBFB(While w, While a,
			Decision c, Assignment b, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				Branch i = w2i.getTarget();
				if (i != null) {
					_result.add(new Object[] { w2i, w, a, c, b, i, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileuld2branchubb_2_3_findcontext_blackBBBBBB(S2B w2i, While w,
			While a, Decision c, Assignment b, Branch i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			if (w.equals(w2i.getSource())) {
				if (b.equals(a.getLast())) {
					if (b.equals(a.getFirst())) {
						if (a.equals(w.getFirst())) {
							if (c.equals(w.getNext())) {
								if (i.equals(w2i.getTarget())) {
									_result.add(new Object[] { w2i, w, a, c, b, i });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whileuld2branchubb_2_3_findcontext_greenBBBBBBFFFFFFF(S2B w2i, While w,
			While a, Decision c, Assignment b, Branch i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w2i__w____source_name_prime = "source";
		String a__b____last_name_prime = "last";
		String a__b____first_name_prime = "first";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String w2i__i____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(i);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____last);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____first);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w2i__w____source.setName(w2i__w____source_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		return new Object[] { w2i, w, a, c, b, i, isApplicableMatch, w2i__w____source, a__b____last, a__b____first,
				w__a____first, w__c____next, w2i__i____target };
	}

	public static final Object[] pattern_whileuld2branchubb_2_4_solveCSP_bindingFBBBBBBBB(whileuld2branchubb _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, While w, While a, Decision c, Assignment b, Branch i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, w2i, w, a, c, b, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w2i, w, a, c, b, i };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileuld2branchubb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			whileuld2branchubb _this, IsApplicableMatch isApplicableMatch, S2B w2i, While w, While a, Decision c,
			Assignment b, Branch i) {
		Object[] result_pattern_whileuld2branchubb_2_4_solveCSP_binding = pattern_whileuld2branchubb_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, w2i, w, a, c, b, i);
		if (result_pattern_whileuld2branchubb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileuld2branchubb_2_4_solveCSP_binding[0];

			Object[] result_pattern_whileuld2branchubb_2_4_solveCSP_black = pattern_whileuld2branchubb_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileuld2branchubb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w2i, w, a, c, b, i };
			}
		}
		return null;
	}

	public static final boolean pattern_whileuld2branchubb_2_5_checkCSP_expressionFBB(whileuld2branchubb _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileuld2branchubb_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whileuld2branchubb_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whileuld2branchubb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whileuld2branchubb_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileuld2branchubb_10_1_initialbindings_blackBBBBBB(whileuld2branchubb _this,
			Match match, Command y, Branch z, Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					return new Object[] { _this, match, y, z, i, x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_10_2_SolveCSP_bindingFBBBBBB(whileuld2branchubb _this,
			Match match, Command y, Branch z, Branch i, Branch x) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, y, z, i, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, y, z, i, x };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileuld2branchubb_10_2_SolveCSP_bindingAndBlackFBBBBBB(
			whileuld2branchubb _this, Match match, Command y, Branch z, Branch i, Branch x) {
		Object[] result_pattern_whileuld2branchubb_10_2_SolveCSP_binding = pattern_whileuld2branchubb_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, y, z, i, x);
		if (result_pattern_whileuld2branchubb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileuld2branchubb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whileuld2branchubb_10_2_SolveCSP_black = pattern_whileuld2branchubb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileuld2branchubb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, y, z, i, x };
			}
		}
		return null;
	}

	public static final boolean pattern_whileuld2branchubb_10_3_CheckCSP_expressionFBB(whileuld2branchubb _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileuld2branchubb_10_4_collectelementstobetranslated_blackBBBBB(Match match,
			Command y, Branch z, Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					return new Object[] { match, y, z, i, x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_10_4_collectelementstobetranslated_greenBBBBBFFFF(
			Match match, Command y, Branch z, Branch i, Branch x) {
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(x);
		String y__x____next_name_prime = "next";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String x__y____positive_name_prime = "positive";
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(y__x____next);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		match.getToBeTranslatedEdges().add(x__y____positive);
		y__x____next.setName(y__x____next_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		return new Object[] { match, y, z, i, x, y__x____next, i__z____negative, i__x____positive, x__y____positive };
	}

	public static final Object[] pattern_whileuld2branchubb_10_5_collectcontextelements_blackBBBBB(Match match,
			Command y, Branch z, Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					return new Object[] { match, y, z, i, x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_10_5_collectcontextelements_greenBB(Match match, Branch i) {
		match.getContextNodes().add(i);
		return new Object[] { match, i };
	}

	public static final void pattern_whileuld2branchubb_10_6_registerobjectstomatch_expressionBBBBBB(
			whileuld2branchubb _this, Match match, Command y, Branch z, Branch i, Branch x) {
		_this.registerObjectsToMatch_BWD(match, y, z, i, x);

	}

	public static final boolean pattern_whileuld2branchubb_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileuld2branchubb_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileuld2branchubb_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_1 = isApplicableMatch.getObject("w");
		EObject _localVariable_2 = isApplicableMatch.getObject("y");
		EObject _localVariable_3 = isApplicableMatch.getObject("z");
		EObject _localVariable_4 = isApplicableMatch.getObject("i");
		EObject _localVariable_5 = isApplicableMatch.getObject("x");
		EObject tmpW2i = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		EObject tmpI = _localVariable_4;
		EObject tmpX = _localVariable_5;
		if (tmpW2i instanceof S2B) {
			S2B w2i = (S2B) tmpW2i;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpY instanceof Command) {
					Command y = (Command) tmpY;
					if (tmpZ instanceof Branch) {
						Branch z = (Branch) tmpZ;
						if (tmpI instanceof Branch) {
							Branch i = (Branch) tmpI;
							if (tmpX instanceof Branch) {
								Branch x = (Branch) tmpX;
								return new Object[] { w2i, w, y, z, i, x, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_11_1_performtransformation_blackBBBBBBFBB(S2B w2i, While w,
			Command y, Branch z, Branch i, Branch x, whileuld2branchubb _this, IsApplicableMatch isApplicableMatch) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { w2i, w, y, z, i, x, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			whileuld2branchubb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whileuld2branchubb_11_1_performtransformation_binding = pattern_whileuld2branchubb_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_whileuld2branchubb_11_1_performtransformation_binding != null) {
			S2B w2i = (S2B) result_pattern_whileuld2branchubb_11_1_performtransformation_binding[0];
			While w = (While) result_pattern_whileuld2branchubb_11_1_performtransformation_binding[1];
			Command y = (Command) result_pattern_whileuld2branchubb_11_1_performtransformation_binding[2];
			Branch z = (Branch) result_pattern_whileuld2branchubb_11_1_performtransformation_binding[3];
			Branch i = (Branch) result_pattern_whileuld2branchubb_11_1_performtransformation_binding[4];
			Branch x = (Branch) result_pattern_whileuld2branchubb_11_1_performtransformation_binding[5];

			Object[] result_pattern_whileuld2branchubb_11_1_performtransformation_black = pattern_whileuld2branchubb_11_1_performtransformation_blackBBBBBBFBB(
					w2i, w, y, z, i, x, _this, isApplicableMatch);
			if (result_pattern_whileuld2branchubb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileuld2branchubb_11_1_performtransformation_black[6];

				return new Object[] { w2i, w, y, z, i, x, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_11_1_performtransformation_greenFBBFFBFFFB(While w,
			Command y, Branch z, Branch x) {
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Decision c = SourcecodeFactory.eINSTANCE.createDecision();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		c2z.setTarget(z);
		w.setFirst(a);
		b2y.setTarget(y);
		c2z.setSource(c);
		w.setNext(c);
		a.setLast(b);
		a.setFirst(b);
		b2y.setSource(b);
		a2x.setSource(a);
		a2x.setTarget(x);
		return new Object[] { c2z, w, y, a, b2y, z, c, b, a2x, x };
	}

	public static final Object[] pattern_whileuld2branchubb_11_2_collecttranslatedelements_blackBBBBBBBBB(S2B c2z,
			Command y, While a, S2N b2y, Branch z, Decision c, Assignment b, S2B a2x, Branch x) {
		if (!a2x.equals(c2z)) {
			if (!x.equals(z)) {
				return new Object[] { c2z, y, a, b2y, z, c, b, a2x, x };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_11_2_collecttranslatedelements_greenFBBBBBBBBB(S2B c2z,
			Command y, While a, S2N b2y, Branch z, Decision c, Assignment b, S2B a2x, Branch x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(x);
		return new Object[] { ruleresult, c2z, y, a, b2y, z, c, b, a2x, x };
	}

	public static final Object[] pattern_whileuld2branchubb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject c2z, EObject w2i, EObject w, EObject y, EObject a, EObject b2y,
			EObject z, EObject c, EObject b, EObject a2x, EObject i, EObject x) {
		if (!c2z.equals(w2i)) {
			if (!c2z.equals(w)) {
				if (!c2z.equals(y)) {
					if (!c2z.equals(z)) {
						if (!c2z.equals(i)) {
							if (!c2z.equals(x)) {
								if (!w2i.equals(y)) {
									if (!w2i.equals(z)) {
										if (!w2i.equals(x)) {
											if (!w.equals(w2i)) {
												if (!w.equals(y)) {
													if (!w.equals(z)) {
														if (!w.equals(x)) {
															if (!y.equals(z)) {
																if (!a.equals(c2z)) {
																	if (!a.equals(w2i)) {
																		if (!a.equals(w)) {
																			if (!a.equals(y)) {
																				if (!a.equals(b2y)) {
																					if (!a.equals(z)) {
																						if (!a.equals(c)) {
																							if (!a.equals(b)) {
																								if (!a.equals(a2x)) {
																									if (!a.equals(i)) {
																										if (!a.equals(
																												x)) {
																											if (!b2y.equals(
																													c2z)) {
																												if (!b2y.equals(
																														w2i)) {
																													if (!b2y.equals(
																															w)) {
																														if (!b2y.equals(
																																y)) {
																															if (!b2y.equals(
																																	z)) {
																																if (!b2y.equals(
																																		c)) {
																																	if (!b2y.equals(
																																			i)) {
																																		if (!b2y.equals(
																																				x)) {
																																			if (!c.equals(
																																					c2z)) {
																																				if (!c.equals(
																																						w2i)) {
																																					if (!c.equals(
																																							w)) {
																																						if (!c.equals(
																																								y)) {
																																							if (!c.equals(
																																									z)) {
																																								if (!c.equals(
																																										i)) {
																																									if (!c.equals(
																																											x)) {
																																										if (!b.equals(
																																												c2z)) {
																																											if (!b.equals(
																																													w2i)) {
																																												if (!b.equals(
																																														w)) {
																																													if (!b.equals(
																																															y)) {
																																														if (!b.equals(
																																																b2y)) {
																																															if (!b.equals(
																																																	z)) {
																																																if (!b.equals(
																																																		c)) {
																																																	if (!b.equals(
																																																			i)) {
																																																		if (!b.equals(
																																																				x)) {
																																																			if (!a2x.equals(
																																																					c2z)) {
																																																				if (!a2x.equals(
																																																						w2i)) {
																																																					if (!a2x.equals(
																																																							w)) {
																																																						if (!a2x.equals(
																																																								y)) {
																																																							if (!a2x.equals(
																																																									b2y)) {
																																																								if (!a2x.equals(
																																																										z)) {
																																																									if (!a2x.equals(
																																																											c)) {
																																																										if (!a2x.equals(
																																																												b)) {
																																																											if (!a2x.equals(
																																																													i)) {
																																																												if (!a2x.equals(
																																																														x)) {
																																																													if (!i.equals(
																																																															w2i)) {
																																																														if (!i.equals(
																																																																w)) {
																																																															if (!i.equals(
																																																																	y)) {
																																																																if (!i.equals(
																																																																		z)) {
																																																																	if (!i.equals(
																																																																			x)) {
																																																																		if (!x.equals(
																																																																				y)) {
																																																																			if (!x.equals(
																																																																					z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						c2z,
																																																																						w2i,
																																																																						w,
																																																																						y,
																																																																						a,
																																																																						b2y,
																																																																						z,
																																																																						c,
																																																																						b,
																																																																						a2x,
																																																																						i,
																																																																						x };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whileuld2branchubb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject c2z, EObject w, EObject y, EObject a, EObject b2y, EObject z,
			EObject c, EObject b, EObject a2x, EObject i, EObject x) {
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileuld2branchubb";
		String y__x____next_name_prime = "next";
		String a__b____last_name_prime = "last";
		String a__b____first_name_prime = "first";
		String w__a____first_name_prime = "first";
		String c2z__z____target_name_prime = "target";
		String c2z__c____source_name_prime = "source";
		String b2y__b____source_name_prime = "source";
		String w__c____next_name_prime = "next";
		String a2x__a____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String x__y____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(y__x____next);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____first);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		ruleresult.getTranslatedEdges().add(x__y____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		y__x____next.setName(y__x____next_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		return new Object[] { ruleresult, c2z, w, y, a, b2y, z, c, b, a2x, i, x, y__x____next, a__b____last,
				a__b____first, w__a____first, c2z__z____target, c2z__c____source, b2y__b____source, w__c____next,
				a2x__a____source, b2y__y____target, i__z____negative, i__x____positive, x__y____positive,
				a2x__x____target };
	}

	public static final void pattern_whileuld2branchubb_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whileuld2branchubb _this, PerformRuleResult ruleresult, EObject c2z, EObject w2i, EObject w, EObject y,
			EObject a, EObject b2y, EObject z, EObject c, EObject b, EObject a2x, EObject i, EObject x) {
		_this.registerObjects_BWD(ruleresult, c2z, w2i, w, y, a, b2y, z, c, b, a2x, i, x);

	}

	public static final PerformRuleResult pattern_whileuld2branchubb_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileuld2branchubb_12_1_preparereturnvalue_bindingFB(
			whileuld2branchubb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_12_1_preparereturnvalue_blackFBB(EClass eClass,
			whileuld2branchubb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_12_1_preparereturnvalue_bindingAndBlackFFB(
			whileuld2branchubb _this) {
		Object[] result_pattern_whileuld2branchubb_12_1_preparereturnvalue_binding = pattern_whileuld2branchubb_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileuld2branchubb_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whileuld2branchubb_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileuld2branchubb_12_1_preparereturnvalue_black = pattern_whileuld2branchubb_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whileuld2branchubb_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whileuld2branchubb_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whileuld2branchubb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whileuld2branchubb_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("y");
		EObject _localVariable_1 = match.getObject("z");
		EObject _localVariable_2 = match.getObject("i");
		EObject _localVariable_3 = match.getObject("x");
		EObject tmpY = _localVariable_0;
		EObject tmpZ = _localVariable_1;
		EObject tmpI = _localVariable_2;
		EObject tmpX = _localVariable_3;
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			if (tmpZ instanceof Branch) {
				Branch z = (Branch) tmpZ;
				if (tmpI instanceof Branch) {
					Branch i = (Branch) tmpI;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						return new Object[] { y, z, i, x, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileuld2branchubb_12_2_corematch_blackFFBBBBB(Command y, Branch z,
			Branch i, Branch x, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class,
							"target")) {
						Statement tmpW = w2i.getSource();
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							_result.add(new Object[] { w2i, w, y, z, i, x, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileuld2branchubb_12_3_findcontext_blackBBBBBB(S2B w2i, While w,
			Command y, Branch z, Branch i, Branch x) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					if (x.equals(y.getNext())) {
						if (w.equals(w2i.getSource())) {
							if (z.equals(i.getNegative())) {
								if (x.equals(i.getPositive())) {
									if (i.equals(w2i.getTarget())) {
										if (y.equals(x.getPositive())) {
											_result.add(new Object[] { w2i, w, y, z, i, x });
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

	public static final Object[] pattern_whileuld2branchubb_12_3_findcontext_greenBBBBBBFFFFFFF(S2B w2i, While w,
			Command y, Branch z, Branch i, Branch x) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String y__x____next_name_prime = "next";
		String w2i__w____source_name_prime = "source";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String w2i__i____target_name_prime = "target";
		String x__y____positive_name_prime = "positive";
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(x);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(y__x____next);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		isApplicableMatch.getAllContextElements().add(x__y____positive);
		y__x____next.setName(y__x____next_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		return new Object[] { w2i, w, y, z, i, x, isApplicableMatch, y__x____next, w2i__w____source, i__z____negative,
				i__x____positive, w2i__i____target, x__y____positive };
	}

	public static final Object[] pattern_whileuld2branchubb_12_4_solveCSP_bindingFBBBBBBBB(whileuld2branchubb _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, While w, Command y, Branch z, Branch i, Branch x) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, w2i, w, y, z, i, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w2i, w, y, z, i, x };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileuld2branchubb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			whileuld2branchubb _this, IsApplicableMatch isApplicableMatch, S2B w2i, While w, Command y, Branch z,
			Branch i, Branch x) {
		Object[] result_pattern_whileuld2branchubb_12_4_solveCSP_binding = pattern_whileuld2branchubb_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, w2i, w, y, z, i, x);
		if (result_pattern_whileuld2branchubb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileuld2branchubb_12_4_solveCSP_binding[0];

			Object[] result_pattern_whileuld2branchubb_12_4_solveCSP_black = pattern_whileuld2branchubb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileuld2branchubb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w2i, w, y, z, i, x };
			}
		}
		return null;
	}

	public static final boolean pattern_whileuld2branchubb_12_5_checkCSP_expressionFBB(whileuld2branchubb _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileuld2branchubb_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whileuld2branchubb_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whileuld2branchubb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whileuld2branchubb_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileuld2branchubb_20_1_preparereturnvalue_bindingFB(
			whileuld2branchubb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whileuld2branchubb _this) {
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

	public static final Object[] pattern_whileuld2branchubb_20_1_preparereturnvalue_bindingAndBlackFFBF(
			whileuld2branchubb _this) {
		Object[] result_pattern_whileuld2branchubb_20_1_preparereturnvalue_binding = pattern_whileuld2branchubb_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileuld2branchubb_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whileuld2branchubb_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileuld2branchubb_20_1_preparereturnvalue_black = pattern_whileuld2branchubb_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whileuld2branchubb_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whileuld2branchubb_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whileuld2branchubb_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_0B(Command y) {
		for (Graph __DEC_y_root_568849 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_1BBBB(Command y,
			Branch z, Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_positive_978012 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!z.equals(__DEC_y_positive_978012)) {
							if (!i.equals(__DEC_y_positive_978012)) {
								if (!x.equals(__DEC_y_positive_978012)) {
									return new Object[] { y, z, i, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_2BBBB(Command y,
			Branch z, Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_negative_433524 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!z.equals(__DEC_y_negative_433524)) {
							if (!i.equals(__DEC_y_negative_433524)) {
								if (!x.equals(__DEC_y_negative_433524)) {
									return new Object[] { y, z, i, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_3B(Branch z) {
		for (Graph __DEC_z_root_67147 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_4BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_positive_496416 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_496416)) {
							if (!i.equals(__DEC_z_positive_496416)) {
								if (!x.equals(__DEC_z_positive_496416)) {
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

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_5BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_negative_44777 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_44777)) {
							if (!i.equals(__DEC_z_negative_44777)) {
								if (!x.equals(__DEC_z_negative_44777)) {
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

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_389070 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_7BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_589844 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_589844)) {
							if (!z.equals(__DEC_x_positive_589844)) {
								if (!i.equals(__DEC_x_positive_589844)) {
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

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_8BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_178227 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_178227)) {
							if (!z.equals(__DEC_x_negative_178227)) {
								if (!i.equals(__DEC_x_negative_178227)) {
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

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_9BB(Branch z,
			Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_10BB(Branch i,
			Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_11BB(Branch z,
			Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_12BB(Branch i,
			Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_13BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_14BB(Branch z,
			Branch x) {
		if (x.equals(z.getPositive())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_15BB(Branch z,
			Branch x) {
		if (x.equals(z.getNegative())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_16BB(Branch i,
			Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileuld2branchubb_20_2_testcorematchandDECs_blackFFFFB(
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
						if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_0B(y) == null) {
							if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_6B(x) == null) {
								if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_13BB(x, y) == null) {
									for (Branch i : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(x, Branch.class, "positive")) {
										if (!i.equals(x)) {
											Node tmpZ = i.getNegative();
											if (tmpZ instanceof Branch) {
												Branch z = (Branch) tmpZ;
												if (!i.equals(z)) {
													if (!x.equals(z)) {
														if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_10BB(
																i, y) == null) {
															if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_12BB(
																	i, y) == null) {
																if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_16BB(
																		i, x) == null) {
																	if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_1BBBB(
																			y, z, i, x) == null) {
																		if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_2BBBB(
																				y, z, i, x) == null) {
																			if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_3B(
																					z) == null) {
																				if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_4BBB(
																						z, i, x) == null) {
																					if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_5BBB(
																							z, i, x) == null) {
																						if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_7BBB(
																								x, z, i) == null) {
																							if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_8BBB(
																									x, z, i) == null) {
																								if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_9BB(
																										z, y) == null) {
																									if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_11BB(
																											z,
																											y) == null) {
																										if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_14BB(
																												z,
																												x) == null) {
																											if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_15BB(
																													z,
																													x) == null) {
																												_result.add(
																														new Object[] {
																																y,
																																z,
																																i,
																																x,
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

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whileuld2branchubb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			whileuld2branchubb _this, Match match, Command y, Branch z, Branch i, Branch x) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, y, z, i, x);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whileuld2branchubb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whileuld2branchubb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileuld2branchubb_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whileuld2branchubb_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whileuld2branchubb_21_1_preparereturnvalue_bindingFB(
			whileuld2branchubb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whileuld2branchubb _this) {
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

	public static final Object[] pattern_whileuld2branchubb_21_1_preparereturnvalue_bindingAndBlackFFBF(
			whileuld2branchubb _this) {
		Object[] result_pattern_whileuld2branchubb_21_1_preparereturnvalue_binding = pattern_whileuld2branchubb_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileuld2branchubb_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whileuld2branchubb_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileuld2branchubb_21_1_preparereturnvalue_black = pattern_whileuld2branchubb_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whileuld2branchubb_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whileuld2branchubb_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whileuld2branchubb_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_0BB(While a,
			Decision c) {
		for (Decision __DEC_a_positive_342297 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_a_positive_342297)) {
				return new Object[] { a, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_1BB(While a,
			Decision c) {
		for (Decision __DEC_a_negative_510585 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_a_negative_510585)) {
				return new Object[] { a, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_2BB(While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_a_last_233783 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_233783)) {
					if (!w.equals(__DEC_a_last_233783)) {
						return new Object[] { a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_3B(While a) {
		for (Program __DEC_a_first_134324 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_4B(Decision c) {
		for (Decision __DEC_c_positive_228130 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_c_positive_228130)) {
				return new Object[] { c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_5B(Decision c) {
		for (Decision __DEC_c_negative_423789 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_c_negative_423789)) {
				return new Object[] { c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_6BBB(Decision c,
			While w, While a) {
		if (!a.equals(w)) {
			for (While __DEC_c_first_631492 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!w.equals(__DEC_c_first_631492)) {
					if (!a.equals(__DEC_c_first_631492)) {
						return new Object[] { c, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_7BBB(Decision c,
			While w, While a) {
		if (!a.equals(w)) {
			for (While __DEC_c_last_168459 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!w.equals(__DEC_c_last_168459)) {
					if (!a.equals(__DEC_c_last_168459)) {
						return new Object[] { c, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_8B(Decision c) {
		for (Program __DEC_c_first_211936 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_9BB(Assignment b,
			Decision c) {
		for (Decision __DEC_b_positive_873446 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_b_positive_873446)) {
				return new Object[] { b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_10BB(Assignment b,
			Decision c) {
		for (Decision __DEC_b_negative_751048 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_b_negative_751048)) {
				return new Object[] { b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_11BBB(Assignment b,
			While w, While a) {
		if (!a.equals(w)) {
			for (While __DEC_b_last_113435 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!w.equals(__DEC_b_last_113435)) {
					if (!a.equals(__DEC_b_last_113435)) {
						return new Object[] { b, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_12B(Assignment b) {
		for (Program __DEC_b_first_111240 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_13BB(Decision c,
			While a) {
		if (a.equals(c.getPositive())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_14BB(Decision c,
			While a) {
		if (a.equals(c.getNegative())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_15BB(While w, While a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_16BB(While w,
			Decision c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_17BB(While a,
			Decision c) {
		if (c.equals(a.getFirst())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_18BB(While w,
			Decision c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_19BB(While a,
			Decision c) {
		if (c.equals(a.getLast())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_20BB(Decision c,
			Assignment b) {
		if (b.equals(c.getPositive())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_21BB(Decision c,
			Assignment b) {
		if (b.equals(c.getNegative())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_22BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileuld2branchubb_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_last) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpA = _edge_last.getSrc();
		if (tmpA instanceof While) {
			While a = (While) tmpA;
			EObject tmpB = _edge_last.getTrg();
			if (tmpB instanceof Assignment) {
				Assignment b = (Assignment) tmpB;
				if (b.equals(a.getLast())) {
					if (b.equals(a.getFirst())) {
						if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_3B(a) == null) {
							if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_12B(b) == null) {
								for (While w : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
										While.class, "first")) {
									if (!a.equals(w)) {
										Statement tmpC = w.getNext();
										if (tmpC instanceof Decision) {
											Decision c = (Decision) tmpC;
											if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_2BB(a,
													w) == null) {
												if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_11BBB(
														b, w, a) == null) {
													if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_15BB(
															w, a) == null) {
														if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_22BB(
																w, b) == null) {
															if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_0BB(
																	a, c) == null) {
																if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_1BB(
																		a, c) == null) {
																	if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_4B(
																			c) == null) {
																		if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_5B(
																				c) == null) {
																			if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_6BBB(
																					c, w, a) == null) {
																				if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_7BBB(
																						c, w, a) == null) {
																					if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_8B(
																							c) == null) {
																						if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_9BB(
																								b, c) == null) {
																							if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_10BB(
																									b, c) == null) {
																								if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_13BB(
																										c, a) == null) {
																									if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_14BB(
																											c,
																											a) == null) {
																										if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_16BB(
																												w,
																												c) == null) {
																											if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_17BB(
																													a,
																													c) == null) {
																												if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_18BB(
																														w,
																														c) == null) {
																													if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_19BB(
																															a,
																															c) == null) {
																														if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_20BB(
																																c,
																																b) == null) {
																															if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_21BB(
																																	c,
																																	b) == null) {
																																_result.add(
																																		new Object[] {
																																				w,
																																				a,
																																				c,
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

		return _result;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whileuld2branchubb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			whileuld2branchubb _this, Match match, While w, While a, Decision c, Assignment b) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, w, a, c, b);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whileuld2branchubb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whileuld2branchubb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileuld2branchubb_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whileuld2branchubb_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whileuld2branchubb_24_1_prepare_blackB(whileuld2branchubb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whileuld2branchubb_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_whileuld2branchubb_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("w");
		EObject _localVariable_1 = targetMatch.getObject("y");
		EObject _localVariable_2 = sourceMatch.getObject("a");
		EObject _localVariable_3 = targetMatch.getObject("z");
		EObject _localVariable_4 = sourceMatch.getObject("c");
		EObject _localVariable_5 = sourceMatch.getObject("b");
		EObject _localVariable_6 = targetMatch.getObject("i");
		EObject _localVariable_7 = targetMatch.getObject("x");
		EObject tmpW = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		EObject tmpC = _localVariable_4;
		EObject tmpB = _localVariable_5;
		EObject tmpI = _localVariable_6;
		EObject tmpX = _localVariable_7;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpZ instanceof Branch) {
						Branch z = (Branch) tmpZ;
						if (tmpC instanceof Decision) {
							Decision c = (Decision) tmpC;
							if (tmpB instanceof Assignment) {
								Assignment b = (Assignment) tmpB;
								if (tmpI instanceof Branch) {
									Branch i = (Branch) tmpI;
									if (tmpX instanceof Branch) {
										Branch x = (Branch) tmpX;
										return new Object[] { w, y, a, z, c, b, i, x, sourceMatch, targetMatch };
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

	public static final Object[] pattern_whileuld2branchubb_24_2_matchsrctrgcontext_blackBBBBBBBBBB(While w, Command y,
			While a, Branch z, Decision c, Assignment b, Branch i, Branch x, Match sourceMatch, Match targetMatch) {
		if (!a.equals(w)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					if (!x.equals(z)) {
						if (!sourceMatch.equals(targetMatch)) {
							return new Object[] { w, y, a, z, c, b, i, x, sourceMatch, targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileuld2branchubb_24_2_matchsrctrgcontext_binding = pattern_whileuld2branchubb_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_whileuld2branchubb_24_2_matchsrctrgcontext_binding != null) {
			While w = (While) result_pattern_whileuld2branchubb_24_2_matchsrctrgcontext_binding[0];
			Command y = (Command) result_pattern_whileuld2branchubb_24_2_matchsrctrgcontext_binding[1];
			While a = (While) result_pattern_whileuld2branchubb_24_2_matchsrctrgcontext_binding[2];
			Branch z = (Branch) result_pattern_whileuld2branchubb_24_2_matchsrctrgcontext_binding[3];
			Decision c = (Decision) result_pattern_whileuld2branchubb_24_2_matchsrctrgcontext_binding[4];
			Assignment b = (Assignment) result_pattern_whileuld2branchubb_24_2_matchsrctrgcontext_binding[5];
			Branch i = (Branch) result_pattern_whileuld2branchubb_24_2_matchsrctrgcontext_binding[6];
			Branch x = (Branch) result_pattern_whileuld2branchubb_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_whileuld2branchubb_24_2_matchsrctrgcontext_black = pattern_whileuld2branchubb_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					w, y, a, z, c, b, i, x, sourceMatch, targetMatch);
			if (result_pattern_whileuld2branchubb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { w, y, a, z, c, b, i, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_24_3_solvecsp_bindingFBBBBBBBBBBB(whileuld2branchubb _this,
			While w, Command y, While a, Branch z, Decision c, Assignment b, Branch i, Branch x, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(w, y, a, z, c, b, i, x, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, w, y, a, z, c, b, i, x, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileuld2branchubb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			whileuld2branchubb _this, While w, Command y, While a, Branch z, Decision c, Assignment b, Branch i,
			Branch x, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileuld2branchubb_24_3_solvecsp_binding = pattern_whileuld2branchubb_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, w, y, a, z, c, b, i, x, sourceMatch, targetMatch);
		if (result_pattern_whileuld2branchubb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whileuld2branchubb_24_3_solvecsp_binding[0];

			Object[] result_pattern_whileuld2branchubb_24_3_solvecsp_black = pattern_whileuld2branchubb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whileuld2branchubb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, w, y, a, z, c, b, i, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whileuld2branchubb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileuld2branchubb_24_5_matchcorrcontext_blackFBBBB(While w,
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

	public static final Object[] pattern_whileuld2branchubb_24_5_matchcorrcontext_greenBBBF(S2B w2i, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "whileuld2branchubb";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(w2i);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { w2i, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_whileuld2branchubb_24_6_createcorrespondence_blackBBBBBBBBB(While w, Command y,
			While a, Branch z, Decision c, Assignment b, Branch i, Branch x, CCMatch ccMatch) {
		if (!a.equals(w)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					if (!x.equals(z)) {
						return new Object[] { w, y, a, z, c, b, i, x, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_24_6_createcorrespondence_greenFBBFBBBFBB(Command y,
			While a, Branch z, Decision c, Assignment b, Branch x, CCMatch ccMatch) {
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		c2z.setTarget(z);
		c2z.setSource(c);
		ccMatch.getCreateCorr().add(c2z);
		b2y.setSource(b);
		b2y.setTarget(y);
		ccMatch.getCreateCorr().add(b2y);
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { c2z, y, a, b2y, z, c, b, a2x, x, ccMatch };
	}

	public static final Object[] pattern_whileuld2branchubb_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_whileuld2branchubb_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "whileuld2branchubb";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_whileuld2branchubb_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_0BB(While a, Decision c) {
		for (Decision __DEC_a_positive_888141 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_a_positive_888141)) {
				return new Object[] { a, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_1BB(While a, Decision c) {
		for (Decision __DEC_a_negative_421781 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_a_negative_421781)) {
				return new Object[] { a, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_2BB(While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_a_last_716472 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_716472)) {
					if (!w.equals(__DEC_a_last_716472)) {
						return new Object[] { a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_3B(While a) {
		for (Program __DEC_a_first_508994 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_4B(Decision c) {
		for (Decision __DEC_c_positive_267206 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_c_positive_267206)) {
				return new Object[] { c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_5B(Decision c) {
		for (Decision __DEC_c_negative_324997 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_c_negative_324997)) {
				return new Object[] { c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_6BBB(Decision c, While w,
			While a) {
		if (!a.equals(w)) {
			for (While __DEC_c_first_444364 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!w.equals(__DEC_c_first_444364)) {
					if (!a.equals(__DEC_c_first_444364)) {
						return new Object[] { c, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_7BBB(Decision c, While w,
			While a) {
		if (!a.equals(w)) {
			for (While __DEC_c_last_932202 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!w.equals(__DEC_c_last_932202)) {
					if (!a.equals(__DEC_c_last_932202)) {
						return new Object[] { c, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_8B(Decision c) {
		for (Program __DEC_c_first_510633 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_9BB(Assignment b,
			Decision c) {
		for (Decision __DEC_b_positive_796332 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_b_positive_796332)) {
				return new Object[] { b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_10BB(Assignment b,
			Decision c) {
		for (Decision __DEC_b_negative_767938 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_b_negative_767938)) {
				return new Object[] { b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_11BBB(Assignment b, While w,
			While a) {
		if (!a.equals(w)) {
			for (While __DEC_b_last_460411 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!w.equals(__DEC_b_last_460411)) {
					if (!a.equals(__DEC_b_last_460411)) {
						return new Object[] { b, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_12B(Assignment b) {
		for (Program __DEC_b_first_416553 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_13BB(Decision c, While a) {
		if (a.equals(c.getPositive())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_14BB(Decision c, While a) {
		if (a.equals(c.getNegative())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_15BB(While w, While a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_16BB(While w, Decision c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_17BB(While a, Decision c) {
		if (c.equals(a.getFirst())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_18BB(While w, Decision c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_19BB(While a, Decision c) {
		if (c.equals(a.getLast())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_20BB(Decision c,
			Assignment b) {
		if (b.equals(c.getPositive())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_21BB(Decision c,
			Assignment b) {
		if (b.equals(c.getNegative())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_22BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_blackBBBB(While w, While a, Decision c,
			Assignment b) {
		if (!a.equals(w)) {
			if (b.equals(a.getLast())) {
				if (b.equals(a.getFirst())) {
					if (a.equals(w.getFirst())) {
						if (c.equals(w.getNext())) {
							if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_0BB(a, c) == null) {
								if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_1BB(a, c) == null) {
									if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_2BB(a, w) == null) {
										if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_3B(a) == null) {
											if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_4B(
													c) == null) {
												if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_5B(
														c) == null) {
													if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_6BBB(
															c, w, a) == null) {
														if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_7BBB(
																c, w, a) == null) {
															if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_8B(
																	c) == null) {
																if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_9BB(
																		b, c) == null) {
																	if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_10BB(
																			b, c) == null) {
																		if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_11BBB(
																				b, w, a) == null) {
																			if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_12B(
																					b) == null) {
																				if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_13BB(
																						c, a) == null) {
																					if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_14BB(
																							c, a) == null) {
																						if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_15BB(
																								w, a) == null) {
																							if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_16BB(
																									w, c) == null) {
																								if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_17BB(
																										a, c) == null) {
																									if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_18BB(
																											w,
																											c) == null) {
																										if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_19BB(
																												a,
																												c) == null) {
																											if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_20BB(
																													c,
																													b) == null) {
																												if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_21BB(
																														c,
																														b) == null) {
																													if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_22BB(
																															w,
																															b) == null) {
																														return new Object[] {
																																w,
																																a,
																																c,
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
		return null;
	}

	public static final boolean pattern_whileuld2branchubb_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileuld2branchubb_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_0B(Command y) {
		for (Graph __DEC_y_root_875105 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_1BBBB(Command y, Branch z,
			Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_positive_210972 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!z.equals(__DEC_y_positive_210972)) {
							if (!i.equals(__DEC_y_positive_210972)) {
								if (!x.equals(__DEC_y_positive_210972)) {
									return new Object[] { y, z, i, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_2BBBB(Command y, Branch z,
			Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_negative_450868 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!z.equals(__DEC_y_negative_450868)) {
							if (!i.equals(__DEC_y_negative_450868)) {
								if (!x.equals(__DEC_y_negative_450868)) {
									return new Object[] { y, z, i, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_3B(Branch z) {
		for (Graph __DEC_z_root_803636 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_4BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_positive_73164 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_73164)) {
							if (!i.equals(__DEC_z_positive_73164)) {
								if (!x.equals(__DEC_z_positive_73164)) {
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

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_5BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_negative_297447 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_297447)) {
							if (!i.equals(__DEC_z_negative_297447)) {
								if (!x.equals(__DEC_z_negative_297447)) {
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

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_888596 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_7BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_336155 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_336155)) {
							if (!z.equals(__DEC_x_positive_336155)) {
								if (!i.equals(__DEC_x_positive_336155)) {
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

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_8BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_362314 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_362314)) {
							if (!z.equals(__DEC_x_negative_362314)) {
								if (!i.equals(__DEC_x_negative_362314)) {
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

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_9BB(Branch z, Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_10BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_11BB(Branch z, Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_12BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_13BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_14BB(Branch z, Branch x) {
		if (x.equals(z.getPositive())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_15BB(Branch z, Branch x) {
		if (x.equals(z.getNegative())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_16BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_blackBBBB(Command y, Branch z,
			Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					if (x.equals(y.getNext())) {
						if (z.equals(i.getNegative())) {
							if (x.equals(i.getPositive())) {
								if (y.equals(x.getPositive())) {
									if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_0B(y) == null) {
										if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_1BBBB(y, z, i,
												x) == null) {
											if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_2BBBB(y, z, i,
													x) == null) {
												if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_3B(
														z) == null) {
													if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_4BBB(
															z, i, x) == null) {
														if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_5BBB(
																z, i, x) == null) {
															if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_6B(
																	x) == null) {
																if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_7BBB(
																		x, z, i) == null) {
																	if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_8BBB(
																			x, z, i) == null) {
																		if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_9BB(
																				z, y) == null) {
																			if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_10BB(
																					i, y) == null) {
																				if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_11BB(
																						z, y) == null) {
																					if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_12BB(
																							i, y) == null) {
																						if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_13BB(
																								x, y) == null) {
																							if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_14BB(
																									z, x) == null) {
																								if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_15BB(
																										z, x) == null) {
																									if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_16BB(
																											i,
																											x) == null) {
																										return new Object[] {
																												y, z, i,
																												x };
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_whileuld2branchubb_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileuld2branchubb_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileuld2branchubb_29_1_createresult_blackB(whileuld2branchubb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whileuld2branchubb_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_whileuld2branchubb_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileuld2branchubb_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_whileuld2branchubb_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									w2i) == null) {
								if (pattern_whileuld2branchubb_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										w) == null) {
									if (pattern_whileuld2branchubb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_whileuld2branchubb_29_3_solveCSP_bindingFBBBBBB(whileuld2branchubb _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, While w, Branch i, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, w2i, w, i, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w2i, w, i, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileuld2branchubb_29_3_solveCSP_bindingAndBlackFBBBBBB(
			whileuld2branchubb _this, IsApplicableMatch isApplicableMatch, S2B w2i, While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whileuld2branchubb_29_3_solveCSP_binding = pattern_whileuld2branchubb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, w2i, w, i, ruleResult);
		if (result_pattern_whileuld2branchubb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileuld2branchubb_29_3_solveCSP_binding[0];

			Object[] result_pattern_whileuld2branchubb_29_3_solveCSP_black = pattern_whileuld2branchubb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whileuld2branchubb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w2i, w, i, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whileuld2branchubb_29_4_checkCSP_expressionFBB(whileuld2branchubb _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileuld2branchubb_29_5_checknacs_blackBBB(S2B w2i, While w, Branch i) {
		return new Object[] { w2i, w, i };
	}

	public static final Object[] pattern_whileuld2branchubb_29_6_perform_blackBBBB(S2B w2i, While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { w2i, w, i, ruleResult };
	}

	public static final Object[] pattern_whileuld2branchubb_29_6_perform_greenFBFFFFFFFBFB(While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		Decision c = SourcecodeFactory.eINSTANCE.createDecision();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(c2z);
		ruleResult.getTargetObjects().add(y);
		w.setFirst(a);
		ruleResult.getSourceObjects().add(a);
		b2y.setTarget(y);
		ruleResult.getCorrObjects().add(b2y);
		c2z.setTarget(z);
		i.setNegative(z);
		ruleResult.getTargetObjects().add(z);
		c2z.setSource(c);
		w.setNext(c);
		ruleResult.getSourceObjects().add(c);
		a.setLast(b);
		a.setFirst(b);
		b2y.setSource(b);
		ruleResult.getSourceObjects().add(b);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		y.setNext(x);
		i.setPositive(x);
		x.setPositive(y);
		a2x.setTarget(x);
		ruleResult.getTargetObjects().add(x);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { c2z, w, y, a, b2y, z, c, b, a2x, i, x, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whileuld2branchubb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whileuld2branchubbImpl
