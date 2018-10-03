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
	public boolean isAppropriate_FWD(Match match, While w, While a, Assignment b, Decision c) {

		Object[] result1_black = whileuld2branchubbImpl.pattern_whileuld2branchubb_0_1_initialbindings_blackBBBBBB(this,
				match, w, a, b, c);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[a] = " + a + ", " + "[b] = " + b + ", "
					+ "[c] = " + c + ".");
		}

		Object[] result2_bindingAndBlack = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, w, a, b, c);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[a] = " + a + ", " + "[b] = " + b + ", "
					+ "[c] = " + c + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileuld2branchubbImpl.pattern_whileuld2branchubb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileuld2branchubbImpl
					.pattern_whileuld2branchubb_0_4_collectelementstobetranslated_blackBBBBB(match, w, a, b, c);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[w] = " + w + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[c] = " + c + ".");
			}
			whileuld2branchubbImpl.pattern_whileuld2branchubb_0_4_collectelementstobetranslated_greenBBBBBFFFF(match, w,
					a, b, c);
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge a__b____first = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[8];

			Object[] result5_black = whileuld2branchubbImpl
					.pattern_whileuld2branchubb_0_5_collectcontextelements_blackBBBBB(match, w, a, b, c);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[w] = " + w + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[c] = " + c + ".");
			}
			whileuld2branchubbImpl.pattern_whileuld2branchubb_0_5_collectcontextelements_greenBB(match, w);

			// 
			whileuld2branchubbImpl.pattern_whileuld2branchubb_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					w, a, b, c);
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
		Assignment b = (Assignment) result1_bindingAndBlack[3];
		Decision c = (Decision) result1_bindingAndBlack[4];
		Branch i = (Branch) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_1_1_performtransformation_greenFFFFBFBBBF(a, b, c, i);
		Command y = (Command) result1_green[0];
		Branch z = (Branch) result1_green[1];
		S2B a2x = (S2B) result1_green[2];
		Branch x = (Branch) result1_green[3];
		S2N b2y = (S2N) result1_green[5];
		S2B c2z = (S2B) result1_green[9];

		Object[] result2_black = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_1_2_collecttranslatedelements_blackBBBBBBBBB(y, z, a2x, x, a, b2y, b, c,
						c2z);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[y] = " + y + ", " + "[z] = " + z
					+ ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", " + "[a] = " + a + ", " + "[b2y] = " + b2y
					+ ", " + "[b] = " + b + ", " + "[c] = " + c + ", " + "[c2z] = " + c2z + ".");
		}
		Object[] result2_green = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_1_2_collecttranslatedelements_greenFBBBBBBBBB(y, z, a2x, x, a, b2y, b, c,
						c2z);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, y, w2i, z, a2x, x, w,
						a, b2y, b, c, i, c2z);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[y] = " + y + ", " + "[w2i] = " + w2i + ", " + "[z] = " + z + ", " + "[a2x] = " + a2x
					+ ", " + "[x] = " + x + ", " + "[w] = " + w + ", " + "[a] = " + a + ", " + "[b2y] = " + b2y + ", "
					+ "[b] = " + b + ", " + "[c] = " + c + ", " + "[i] = " + i + ", " + "[c2z] = " + c2z + ".");
		}
		whileuld2branchubbImpl.pattern_whileuld2branchubb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, y, z, a2x, x, w, a, b2y, b, c, i, c2z);
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[25];

		// 
		// 
		whileuld2branchubbImpl.pattern_whileuld2branchubb_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
				y, w2i, z, a2x, x, w, a, b2y, b, c, i, c2z);
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
		Assignment b = (Assignment) result2_binding[2];
		Decision c = (Decision) result2_binding[3];
		for (Object[] result2_black : whileuld2branchubbImpl.pattern_whileuld2branchubb_2_2_corematch_blackFBBBBFB(w, a,
				b, c, match)) {
			S2B w2i = (S2B) result2_black[0];
			Branch i = (Branch) result2_black[5];
			// ForEach 
			for (Object[] result3_black : whileuld2branchubbImpl
					.pattern_whileuld2branchubb_2_3_findcontext_blackBBBBBB(w2i, w, a, b, c, i)) {
				Object[] result3_green = whileuld2branchubbImpl
						.pattern_whileuld2branchubb_2_3_findcontext_greenBBBBBBFFFFFFF(w2i, w, a, b, c, i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = whileuld2branchubbImpl
						.pattern_whileuld2branchubb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, w2i,
								w, a, b, c, i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w2i] = " + w2i + ", " + "[w] = "
							+ w + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[c] = " + c + ", " + "[i] = " + i
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
	public void registerObjectsToMatch_FWD(Match match, While w, While a, Assignment b, Decision c) {
		match.registerObject("w", w);
		match.registerObject("a", a);
		match.registerObject("b", b);
		match.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, While w, While a, Assignment b, Decision c) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, S2B w2i, While w, While a, Assignment b,
			Decision c, Branch i) {// Create CSP
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject y, EObject w2i, EObject z, EObject a2x,
			EObject x, EObject w, EObject a, EObject b2y, EObject b, EObject c, EObject i, EObject c2z) {
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("c2z", c2z);

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
	public boolean isAppropriate_BWD(Match match, Command y, Branch z, Branch x, Branch i) {

		Object[] result1_black = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_10_1_initialbindings_blackBBBBBB(this, match, y, z, x, i);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[x] = " + x + ", "
					+ "[i] = " + i + ".");
		}

		Object[] result2_bindingAndBlack = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, y, z, x, i);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[x] = " + x + ", "
					+ "[i] = " + i + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileuld2branchubbImpl.pattern_whileuld2branchubb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileuld2branchubbImpl
					.pattern_whileuld2branchubb_10_4_collectelementstobetranslated_blackBBBBB(match, y, z, x, i);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[y] = " + y + ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[i] = " + i + ".");
			}
			whileuld2branchubbImpl.pattern_whileuld2branchubb_10_4_collectelementstobetranslated_greenBBBBBFFFF(match,
					y, z, x, i);
			//nothing EMoflonEdge y__x____next = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[8];

			Object[] result5_black = whileuld2branchubbImpl
					.pattern_whileuld2branchubb_10_5_collectcontextelements_blackBBBBB(match, y, z, x, i);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[y] = " + y + ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[i] = " + i + ".");
			}
			whileuld2branchubbImpl.pattern_whileuld2branchubb_10_5_collectcontextelements_greenBB(match, i);

			// 
			whileuld2branchubbImpl.pattern_whileuld2branchubb_10_6_registerobjectstomatch_expressionBBBBBB(this, match,
					y, z, x, i);
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
		Command y = (Command) result1_bindingAndBlack[0];
		S2B w2i = (S2B) result1_bindingAndBlack[1];
		Branch z = (Branch) result1_bindingAndBlack[2];
		Branch x = (Branch) result1_bindingAndBlack[3];
		While w = (While) result1_bindingAndBlack[4];
		Branch i = (Branch) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_11_1_performtransformation_greenBBFBBFFFFF(y, z, x, w);
		S2B a2x = (S2B) result1_green[2];
		While a = (While) result1_green[5];
		S2N b2y = (S2N) result1_green[6];
		Assignment b = (Assignment) result1_green[7];
		Decision c = (Decision) result1_green[8];
		S2B c2z = (S2B) result1_green[9];

		Object[] result2_black = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_11_2_collecttranslatedelements_blackBBBBBBBBB(y, z, a2x, x, a, b2y, b, c,
						c2z);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[y] = " + y + ", " + "[z] = " + z
					+ ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", " + "[a] = " + a + ", " + "[b2y] = " + b2y
					+ ", " + "[b] = " + b + ", " + "[c] = " + c + ", " + "[c2z] = " + c2z + ".");
		}
		Object[] result2_green = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_11_2_collecttranslatedelements_greenFBBBBBBBBB(y, z, a2x, x, a, b2y, b, c,
						c2z);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, y, w2i, z, a2x, x,
						w, a, b2y, b, c, i, c2z);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[y] = " + y + ", " + "[w2i] = " + w2i + ", " + "[z] = " + z + ", " + "[a2x] = " + a2x
					+ ", " + "[x] = " + x + ", " + "[w] = " + w + ", " + "[a] = " + a + ", " + "[b2y] = " + b2y + ", "
					+ "[b] = " + b + ", " + "[c] = " + c + ", " + "[i] = " + i + ", " + "[c2z] = " + c2z + ".");
		}
		whileuld2branchubbImpl.pattern_whileuld2branchubb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, y, z, a2x, x, w, a, b2y, b, c, i, c2z);
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[25];

		// 
		// 
		whileuld2branchubbImpl.pattern_whileuld2branchubb_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this,
				ruleresult, y, w2i, z, a2x, x, w, a, b2y, b, c, i, c2z);
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
		Branch x = (Branch) result2_binding[2];
		Branch i = (Branch) result2_binding[3];
		for (Object[] result2_black : whileuld2branchubbImpl.pattern_whileuld2branchubb_12_2_corematch_blackBFBBFBB(y,
				z, x, i, match)) {
			S2B w2i = (S2B) result2_black[1];
			While w = (While) result2_black[4];
			// ForEach 
			for (Object[] result3_black : whileuld2branchubbImpl
					.pattern_whileuld2branchubb_12_3_findcontext_blackBBBBBB(y, w2i, z, x, w, i)) {
				Object[] result3_green = whileuld2branchubbImpl
						.pattern_whileuld2branchubb_12_3_findcontext_greenBBBBBBFFFFFFF(y, w2i, z, x, w, i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = whileuld2branchubbImpl
						.pattern_whileuld2branchubb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, y,
								w2i, z, x, w, i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[y] = " + y + ", " + "[w2i] = "
							+ w2i + ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[w] = " + w + ", " + "[i] = "
							+ i + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Command y, Branch z, Branch x, Branch i) {
		match.registerObject("y", y);
		match.registerObject("z", z);
		match.registerObject("x", x);
		match.registerObject("i", i);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command y, Branch z, Branch x, Branch i) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Command y, S2B w2i, Branch z, Branch x,
			While w, Branch i) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("x", x);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject y, EObject w2i, EObject z, EObject a2x,
			EObject x, EObject w, EObject a, EObject b2y, EObject b, EObject c, EObject i, EObject c2z) {
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("c2z", c2z);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_40(EMoflonEdge _edge_next) {

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
			Branch x = (Branch) result2_black[2];
			Branch i = (Branch) result2_black[3];
			Object[] result2_green = whileuld2branchubbImpl
					.pattern_whileuld2branchubb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileuld2branchubbImpl
					.pattern_whileuld2branchubb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, y, z, x, i)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_41(EMoflonEdge _edge_last) {

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
			Assignment b = (Assignment) result2_black[2];
			Decision c = (Decision) result2_black[3];
			Object[] result2_green = whileuld2branchubbImpl
					.pattern_whileuld2branchubb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileuld2branchubbImpl
					.pattern_whileuld2branchubb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, w, a, b, c)) {
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
		Command y = (Command) result2_bindingAndBlack[0];
		Branch z = (Branch) result2_bindingAndBlack[1];
		Branch x = (Branch) result2_bindingAndBlack[2];
		While w = (While) result2_bindingAndBlack[3];
		While a = (While) result2_bindingAndBlack[4];
		Assignment b = (Assignment) result2_bindingAndBlack[5];
		Decision c = (Decision) result2_bindingAndBlack[6];
		Branch i = (Branch) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = whileuld2branchubbImpl
				.pattern_whileuld2branchubb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, y, z, x, w, a, b, c, i,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[y] = " + y + ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[w] = " + w + ", " + "[a] = "
					+ a + ", " + "[b] = " + b + ", " + "[c] = " + c + ", " + "[i] = " + i + ", " + "[sourceMatch] = "
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
						.pattern_whileuld2branchubb_24_6_createcorrespondence_blackBBBBBBBBB(y, z, x, w, a, b, c, i,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[y] = " + y + ", "
							+ "[z] = " + z + ", " + "[x] = " + x + ", " + "[w] = " + w + ", " + "[a] = " + a + ", "
							+ "[b] = " + b + ", " + "[c] = " + c + ", " + "[i] = " + i + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				whileuld2branchubbImpl.pattern_whileuld2branchubb_24_6_createcorrespondence_greenBBFBBFBBFB(y, z, x, a,
						b, c, ccMatch);
				//nothing S2B a2x = (S2B) result6_green[2];
				//nothing S2N b2y = (S2N) result6_green[5];
				//nothing S2B c2z = (S2B) result6_green[8];

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
	public CSP isApplicable_solveCsp_CC(Command y, Branch z, Branch x, While w, While a, Assignment b, Decision c,
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
	public boolean checkDEC_FWD(While w, While a, Assignment b, Decision c) {// 
		Object[] result1_black = whileuld2branchubbImpl.pattern_whileuld2branchubb_27_1_matchtggpattern_blackBBBB(w, a,
				b, c);
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
	public boolean checkDEC_BWD(Command y, Branch z, Branch x, Branch i) {// 
		Object[] result1_black = whileuld2branchubbImpl.pattern_whileuld2branchubb_28_1_matchtggpattern_blackBBBB(y, z,
				x, i);
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
					whileuld2branchubbImpl.pattern_whileuld2branchubb_29_6_perform_greenFFFFBFFFFBFB(w, i, ruleResult);
					//nothing Command y = (Command) result6_green[0];
					//nothing Branch z = (Branch) result6_green[1];
					//nothing S2B a2x = (S2B) result6_green[2];
					//nothing Branch x = (Branch) result6_green[3];
					//nothing While a = (While) result6_green[5];
					//nothing S2N b2y = (S2N) result6_green[6];
					//nothing Assignment b = (Assignment) result6_green[7];
					//nothing Decision c = (Decision) result6_green[8];
					//nothing S2B c2z = (S2B) result6_green[10];

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
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPROPRIATE_FWD__MATCH_WHILE_WHILE_ASSIGNMENT_DECISION:
			return isAppropriate_FWD((Match) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (Decision) arguments.get(4));
		case RulesPackage.WHILEULD2BRANCHUBB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEULD2BRANCHUBB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WHILE_WHILE_ASSIGNMENT_DECISION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (Decision) arguments.get(4));
			return null;
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WHILE_WHILE_ASSIGNMENT_DECISION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (Decision) arguments.get(4));
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_S2B_WHILE_WHILE_ASSIGNMENT_DECISION_BRANCH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(While) arguments.get(2), (While) arguments.get(3), (Assignment) arguments.get(4),
					(Decision) arguments.get(5), (Branch) arguments.get(6));
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
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMMAND_S2B_BRANCH_BRANCH_WHILE_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Command) arguments.get(1),
					(S2B) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4),
					(While) arguments.get(5), (Branch) arguments.get(6));
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
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_40__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_40((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_41__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_41((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEULD2BRANCHUBB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEULD2BRANCHUBB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPLICABLE_SOLVE_CSP_CC__COMMAND_BRANCH_BRANCH_WHILE_WHILE_ASSIGNMENT_DECISION_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Command) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (While) arguments.get(3), (While) arguments.get(4),
					(Assignment) arguments.get(5), (Decision) arguments.get(6), (Branch) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.WHILEULD2BRANCHUBB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEULD2BRANCHUBB___CHECK_DEC_FWD__WHILE_WHILE_ASSIGNMENT_DECISION:
			return checkDEC_FWD((While) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(Decision) arguments.get(3));
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
			Match match, While w, While a, Assignment b, Decision c) {
		if (!a.equals(w)) {
			return new Object[] { _this, match, w, a, b, c };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_0_2_SolveCSP_bindingFBBBBBB(whileuld2branchubb _this,
			Match match, While w, While a, Assignment b, Decision c) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, w, a, b, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, w, a, b, c };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileuld2branchubb_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			whileuld2branchubb _this, Match match, While w, While a, Assignment b, Decision c) {
		Object[] result_pattern_whileuld2branchubb_0_2_SolveCSP_binding = pattern_whileuld2branchubb_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, w, a, b, c);
		if (result_pattern_whileuld2branchubb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileuld2branchubb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whileuld2branchubb_0_2_SolveCSP_black = pattern_whileuld2branchubb_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileuld2branchubb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, w, a, b, c };
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
			While w, While a, Assignment b, Decision c) {
		if (!a.equals(w)) {
			return new Object[] { match, w, a, b, c };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_0_4_collectelementstobetranslated_greenBBBBBFFFF(
			Match match, While w, While a, Assignment b, Decision c) {
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(c);
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
		return new Object[] { match, w, a, b, c, a__b____last, a__b____first, w__a____first, w__c____next };
	}

	public static final Object[] pattern_whileuld2branchubb_0_5_collectcontextelements_blackBBBBB(Match match, While w,
			While a, Assignment b, Decision c) {
		if (!a.equals(w)) {
			return new Object[] { match, w, a, b, c };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whileuld2branchubb_0_6_registerobjectstomatch_expressionBBBBBB(
			whileuld2branchubb _this, Match match, While w, While a, Assignment b, Decision c) {
		_this.registerObjectsToMatch_FWD(match, w, a, b, c);

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
		EObject _localVariable_3 = isApplicableMatch.getObject("b");
		EObject _localVariable_4 = isApplicableMatch.getObject("c");
		EObject _localVariable_5 = isApplicableMatch.getObject("i");
		EObject tmpW2i = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpB = _localVariable_3;
		EObject tmpC = _localVariable_4;
		EObject tmpI = _localVariable_5;
		if (tmpW2i instanceof S2B) {
			S2B w2i = (S2B) tmpW2i;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpB instanceof Assignment) {
						Assignment b = (Assignment) tmpB;
						if (tmpC instanceof Decision) {
							Decision c = (Decision) tmpC;
							if (tmpI instanceof Branch) {
								Branch i = (Branch) tmpI;
								return new Object[] { w2i, w, a, b, c, i, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_1_1_performtransformation_blackBBBBBBFBB(S2B w2i, While w,
			While a, Assignment b, Decision c, Branch i, whileuld2branchubb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!a.equals(w)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { w2i, w, a, b, c, i, csp, _this, isApplicableMatch };
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
			Assignment b = (Assignment) result_pattern_whileuld2branchubb_1_1_performtransformation_binding[3];
			Decision c = (Decision) result_pattern_whileuld2branchubb_1_1_performtransformation_binding[4];
			Branch i = (Branch) result_pattern_whileuld2branchubb_1_1_performtransformation_binding[5];

			Object[] result_pattern_whileuld2branchubb_1_1_performtransformation_black = pattern_whileuld2branchubb_1_1_performtransformation_blackBBBBBBFBB(
					w2i, w, a, b, c, i, _this, isApplicableMatch);
			if (result_pattern_whileuld2branchubb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileuld2branchubb_1_1_performtransformation_black[6];

				return new Object[] { w2i, w, a, b, c, i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_1_1_performtransformation_greenFFFFBFBBBF(While a,
			Assignment b, Decision c, Branch i) {
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		i.setNegative(z);
		a2x.setSource(a);
		y.setNext(x);
		a2x.setTarget(x);
		x.setPositive(y);
		i.setPositive(x);
		b2y.setTarget(y);
		b2y.setSource(b);
		c2z.setTarget(z);
		c2z.setSource(c);
		return new Object[] { y, z, a2x, x, a, b2y, b, c, i, c2z };
	}

	public static final Object[] pattern_whileuld2branchubb_1_2_collecttranslatedelements_blackBBBBBBBBB(Command y,
			Branch z, S2B a2x, Branch x, While a, S2N b2y, Assignment b, Decision c, S2B c2z) {
		if (!a2x.equals(c2z)) {
			if (!x.equals(z)) {
				return new Object[] { y, z, a2x, x, a, b2y, b, c, c2z };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_1_2_collecttranslatedelements_greenFBBBBBBBBB(Command y,
			Branch z, S2B a2x, Branch x, While a, S2N b2y, Assignment b, Decision c, S2B c2z) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(c2z);
		return new Object[] { ruleresult, y, z, a2x, x, a, b2y, b, c, c2z };
	}

	public static final Object[] pattern_whileuld2branchubb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject y, EObject w2i, EObject z, EObject a2x, EObject x, EObject w,
			EObject a, EObject b2y, EObject b, EObject c, EObject i, EObject c2z) {
		if (!y.equals(z)) {
			if (!w2i.equals(y)) {
				if (!w2i.equals(z)) {
					if (!w2i.equals(x)) {
						if (!a2x.equals(y)) {
							if (!a2x.equals(w2i)) {
								if (!a2x.equals(z)) {
									if (!a2x.equals(x)) {
										if (!a2x.equals(w)) {
											if (!a2x.equals(b2y)) {
												if (!a2x.equals(b)) {
													if (!a2x.equals(c)) {
														if (!a2x.equals(i)) {
															if (!a2x.equals(c2z)) {
																if (!x.equals(y)) {
																	if (!x.equals(z)) {
																		if (!w.equals(y)) {
																			if (!w.equals(w2i)) {
																				if (!w.equals(z)) {
																					if (!w.equals(x)) {
																						if (!a.equals(y)) {
																							if (!a.equals(w2i)) {
																								if (!a.equals(z)) {
																									if (!a.equals(
																											a2x)) {
																										if (!a.equals(
																												x)) {
																											if (!a.equals(
																													w)) {
																												if (!a.equals(
																														b2y)) {
																													if (!a.equals(
																															b)) {
																														if (!a.equals(
																																c)) {
																															if (!a.equals(
																																	i)) {
																																if (!a.equals(
																																		c2z)) {
																																	if (!b2y.equals(
																																			y)) {
																																		if (!b2y.equals(
																																				w2i)) {
																																			if (!b2y.equals(
																																					z)) {
																																				if (!b2y.equals(
																																						x)) {
																																					if (!b2y.equals(
																																							w)) {
																																						if (!b2y.equals(
																																								c)) {
																																							if (!b2y.equals(
																																									i)) {
																																								if (!b2y.equals(
																																										c2z)) {
																																									if (!b.equals(
																																											y)) {
																																										if (!b.equals(
																																												w2i)) {
																																											if (!b.equals(
																																													z)) {
																																												if (!b.equals(
																																														x)) {
																																													if (!b.equals(
																																															w)) {
																																														if (!b.equals(
																																																b2y)) {
																																															if (!b.equals(
																																																	c)) {
																																																if (!b.equals(
																																																		i)) {
																																																	if (!b.equals(
																																																			c2z)) {
																																																		if (!c.equals(
																																																				y)) {
																																																			if (!c.equals(
																																																					w2i)) {
																																																				if (!c.equals(
																																																						z)) {
																																																					if (!c.equals(
																																																							x)) {
																																																						if (!c.equals(
																																																								w)) {
																																																							if (!c.equals(
																																																									i)) {
																																																								if (!c.equals(
																																																										c2z)) {
																																																									if (!i.equals(
																																																											y)) {
																																																										if (!i.equals(
																																																												w2i)) {
																																																											if (!i.equals(
																																																													z)) {
																																																												if (!i.equals(
																																																														x)) {
																																																													if (!i.equals(
																																																															w)) {
																																																														if (!c2z.equals(
																																																																y)) {
																																																															if (!c2z.equals(
																																																																	w2i)) {
																																																																if (!c2z.equals(
																																																																		z)) {
																																																																	if (!c2z.equals(
																																																																			x)) {
																																																																		if (!c2z.equals(
																																																																				w)) {
																																																																			if (!c2z.equals(
																																																																					i)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						y,
																																																																						w2i,
																																																																						z,
																																																																						a2x,
																																																																						x,
																																																																						w,
																																																																						a,
																																																																						b2y,
																																																																						b,
																																																																						c,
																																																																						i,
																																																																						c2z };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject y, EObject z, EObject a2x, EObject x, EObject w, EObject a,
			EObject b2y, EObject b, EObject c, EObject i, EObject c2z) {
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileuld2branchubb";
		String y__x____next_name_prime = "next";
		String a2x__x____target_name_prime = "target";
		String a__b____last_name_prime = "last";
		String a__b____first_name_prime = "first";
		String w__a____first_name_prime = "first";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String x__y____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String a2x__a____source_name_prime = "source";
		String i__x____positive_name_prime = "positive";
		String w__c____next_name_prime = "next";
		String c2z__z____target_name_prime = "target";
		String c2z__c____source_name_prime = "source";
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(y__x____next);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____first);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		ruleresult.getCreatedEdges().add(x__y____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		y__x____next.setName(y__x____next_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		return new Object[] { ruleresult, y, z, a2x, x, w, a, b2y, b, c, i, c2z, y__x____next, a2x__x____target,
				a__b____last, a__b____first, w__a____first, b2y__y____target, b2y__b____source, x__y____positive,
				i__z____negative, a2x__a____source, i__x____positive, w__c____next, c2z__z____target,
				c2z__c____source };
	}

	public static final void pattern_whileuld2branchubb_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whileuld2branchubb _this, PerformRuleResult ruleresult, EObject y, EObject w2i, EObject z, EObject a2x,
			EObject x, EObject w, EObject a, EObject b2y, EObject b, EObject c, EObject i, EObject c2z) {
		_this.registerObjects_FWD(ruleresult, y, w2i, z, a2x, x, w, a, b2y, b, c, i, c2z);

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
		EObject _localVariable_2 = match.getObject("b");
		EObject _localVariable_3 = match.getObject("c");
		EObject tmpW = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpC = _localVariable_3;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpA instanceof While) {
				While a = (While) tmpA;
				if (tmpB instanceof Assignment) {
					Assignment b = (Assignment) tmpB;
					if (tmpC instanceof Decision) {
						Decision c = (Decision) tmpC;
						return new Object[] { w, a, b, c, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileuld2branchubb_2_2_corematch_blackFBBBBFB(While w, While a,
			Assignment b, Decision c, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				Branch i = w2i.getTarget();
				if (i != null) {
					_result.add(new Object[] { w2i, w, a, b, c, i, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileuld2branchubb_2_3_findcontext_blackBBBBBB(S2B w2i, While w,
			While a, Assignment b, Decision c, Branch i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			if (b.equals(a.getLast())) {
				if (w.equals(w2i.getSource())) {
					if (b.equals(a.getFirst())) {
						if (a.equals(w.getFirst())) {
							if (i.equals(w2i.getTarget())) {
								if (c.equals(w.getNext())) {
									_result.add(new Object[] { w2i, w, a, b, c, i });
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
			While a, Assignment b, Decision c, Branch i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String a__b____last_name_prime = "last";
		String w2i__w____source_name_prime = "source";
		String a__b____first_name_prime = "first";
		String w__a____first_name_prime = "first";
		String w2i__i____target_name_prime = "target";
		String w__c____next_name_prime = "next";
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(i);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____last);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____first);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		a__b____last.setName(a__b____last_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		return new Object[] { w2i, w, a, b, c, i, isApplicableMatch, a__b____last, w2i__w____source, a__b____first,
				w__a____first, w2i__i____target, w__c____next };
	}

	public static final Object[] pattern_whileuld2branchubb_2_4_solveCSP_bindingFBBBBBBBB(whileuld2branchubb _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, While w, While a, Assignment b, Decision c, Branch i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, w2i, w, a, b, c, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w2i, w, a, b, c, i };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileuld2branchubb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			whileuld2branchubb _this, IsApplicableMatch isApplicableMatch, S2B w2i, While w, While a, Assignment b,
			Decision c, Branch i) {
		Object[] result_pattern_whileuld2branchubb_2_4_solveCSP_binding = pattern_whileuld2branchubb_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, w2i, w, a, b, c, i);
		if (result_pattern_whileuld2branchubb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileuld2branchubb_2_4_solveCSP_binding[0];

			Object[] result_pattern_whileuld2branchubb_2_4_solveCSP_black = pattern_whileuld2branchubb_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileuld2branchubb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w2i, w, a, b, c, i };
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
			Match match, Command y, Branch z, Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					return new Object[] { _this, match, y, z, x, i };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_10_2_SolveCSP_bindingFBBBBBB(whileuld2branchubb _this,
			Match match, Command y, Branch z, Branch x, Branch i) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, y, z, x, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, y, z, x, i };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileuld2branchubb_10_2_SolveCSP_bindingAndBlackFBBBBBB(
			whileuld2branchubb _this, Match match, Command y, Branch z, Branch x, Branch i) {
		Object[] result_pattern_whileuld2branchubb_10_2_SolveCSP_binding = pattern_whileuld2branchubb_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, y, z, x, i);
		if (result_pattern_whileuld2branchubb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileuld2branchubb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whileuld2branchubb_10_2_SolveCSP_black = pattern_whileuld2branchubb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileuld2branchubb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, y, z, x, i };
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
			Command y, Branch z, Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					return new Object[] { match, y, z, x, i };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_10_4_collectelementstobetranslated_greenBBBBBFFFF(
			Match match, Command y, Branch z, Branch x, Branch i) {
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(x);
		String y__x____next_name_prime = "next";
		String x__y____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(y__x____next);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		match.getToBeTranslatedEdges().add(x__y____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		y__x____next.setName(y__x____next_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		return new Object[] { match, y, z, x, i, y__x____next, x__y____positive, i__z____negative, i__x____positive };
	}

	public static final Object[] pattern_whileuld2branchubb_10_5_collectcontextelements_blackBBBBB(Match match,
			Command y, Branch z, Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					return new Object[] { match, y, z, x, i };
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
			whileuld2branchubb _this, Match match, Command y, Branch z, Branch x, Branch i) {
		_this.registerObjectsToMatch_BWD(match, y, z, x, i);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("y");
		EObject _localVariable_1 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_2 = isApplicableMatch.getObject("z");
		EObject _localVariable_3 = isApplicableMatch.getObject("x");
		EObject _localVariable_4 = isApplicableMatch.getObject("w");
		EObject _localVariable_5 = isApplicableMatch.getObject("i");
		EObject tmpY = _localVariable_0;
		EObject tmpW2i = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpW = _localVariable_4;
		EObject tmpI = _localVariable_5;
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			if (tmpW2i instanceof S2B) {
				S2B w2i = (S2B) tmpW2i;
				if (tmpZ instanceof Branch) {
					Branch z = (Branch) tmpZ;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							if (tmpI instanceof Branch) {
								Branch i = (Branch) tmpI;
								return new Object[] { y, w2i, z, x, w, i, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_11_1_performtransformation_blackBBBBBBFBB(Command y,
			S2B w2i, Branch z, Branch x, While w, Branch i, whileuld2branchubb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { y, w2i, z, x, w, i, csp, _this, isApplicableMatch };
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
			Command y = (Command) result_pattern_whileuld2branchubb_11_1_performtransformation_binding[0];
			S2B w2i = (S2B) result_pattern_whileuld2branchubb_11_1_performtransformation_binding[1];
			Branch z = (Branch) result_pattern_whileuld2branchubb_11_1_performtransformation_binding[2];
			Branch x = (Branch) result_pattern_whileuld2branchubb_11_1_performtransformation_binding[3];
			While w = (While) result_pattern_whileuld2branchubb_11_1_performtransformation_binding[4];
			Branch i = (Branch) result_pattern_whileuld2branchubb_11_1_performtransformation_binding[5];

			Object[] result_pattern_whileuld2branchubb_11_1_performtransformation_black = pattern_whileuld2branchubb_11_1_performtransformation_blackBBBBBBFBB(
					y, w2i, z, x, w, i, _this, isApplicableMatch);
			if (result_pattern_whileuld2branchubb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileuld2branchubb_11_1_performtransformation_black[6];

				return new Object[] { y, w2i, z, x, w, i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_11_1_performtransformation_greenBBFBBFFFFF(Command y,
			Branch z, Branch x, While w) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		Decision c = SourcecodeFactory.eINSTANCE.createDecision();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		a2x.setTarget(x);
		w.setFirst(a);
		a2x.setSource(a);
		b2y.setTarget(y);
		a.setLast(b);
		a.setFirst(b);
		b2y.setSource(b);
		w.setNext(c);
		c2z.setTarget(z);
		c2z.setSource(c);
		return new Object[] { y, z, a2x, x, w, a, b2y, b, c, c2z };
	}

	public static final Object[] pattern_whileuld2branchubb_11_2_collecttranslatedelements_blackBBBBBBBBB(Command y,
			Branch z, S2B a2x, Branch x, While a, S2N b2y, Assignment b, Decision c, S2B c2z) {
		if (!a2x.equals(c2z)) {
			if (!x.equals(z)) {
				return new Object[] { y, z, a2x, x, a, b2y, b, c, c2z };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_11_2_collecttranslatedelements_greenFBBBBBBBBB(Command y,
			Branch z, S2B a2x, Branch x, While a, S2N b2y, Assignment b, Decision c, S2B c2z) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(c2z);
		return new Object[] { ruleresult, y, z, a2x, x, a, b2y, b, c, c2z };
	}

	public static final Object[] pattern_whileuld2branchubb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject y, EObject w2i, EObject z, EObject a2x, EObject x, EObject w,
			EObject a, EObject b2y, EObject b, EObject c, EObject i, EObject c2z) {
		if (!y.equals(z)) {
			if (!w2i.equals(y)) {
				if (!w2i.equals(z)) {
					if (!w2i.equals(x)) {
						if (!a2x.equals(y)) {
							if (!a2x.equals(w2i)) {
								if (!a2x.equals(z)) {
									if (!a2x.equals(x)) {
										if (!a2x.equals(w)) {
											if (!a2x.equals(b2y)) {
												if (!a2x.equals(b)) {
													if (!a2x.equals(c)) {
														if (!a2x.equals(i)) {
															if (!a2x.equals(c2z)) {
																if (!x.equals(y)) {
																	if (!x.equals(z)) {
																		if (!w.equals(y)) {
																			if (!w.equals(w2i)) {
																				if (!w.equals(z)) {
																					if (!w.equals(x)) {
																						if (!a.equals(y)) {
																							if (!a.equals(w2i)) {
																								if (!a.equals(z)) {
																									if (!a.equals(
																											a2x)) {
																										if (!a.equals(
																												x)) {
																											if (!a.equals(
																													w)) {
																												if (!a.equals(
																														b2y)) {
																													if (!a.equals(
																															b)) {
																														if (!a.equals(
																																c)) {
																															if (!a.equals(
																																	i)) {
																																if (!a.equals(
																																		c2z)) {
																																	if (!b2y.equals(
																																			y)) {
																																		if (!b2y.equals(
																																				w2i)) {
																																			if (!b2y.equals(
																																					z)) {
																																				if (!b2y.equals(
																																						x)) {
																																					if (!b2y.equals(
																																							w)) {
																																						if (!b2y.equals(
																																								c)) {
																																							if (!b2y.equals(
																																									i)) {
																																								if (!b2y.equals(
																																										c2z)) {
																																									if (!b.equals(
																																											y)) {
																																										if (!b.equals(
																																												w2i)) {
																																											if (!b.equals(
																																													z)) {
																																												if (!b.equals(
																																														x)) {
																																													if (!b.equals(
																																															w)) {
																																														if (!b.equals(
																																																b2y)) {
																																															if (!b.equals(
																																																	c)) {
																																																if (!b.equals(
																																																		i)) {
																																																	if (!b.equals(
																																																			c2z)) {
																																																		if (!c.equals(
																																																				y)) {
																																																			if (!c.equals(
																																																					w2i)) {
																																																				if (!c.equals(
																																																						z)) {
																																																					if (!c.equals(
																																																							x)) {
																																																						if (!c.equals(
																																																								w)) {
																																																							if (!c.equals(
																																																									i)) {
																																																								if (!c.equals(
																																																										c2z)) {
																																																									if (!i.equals(
																																																											y)) {
																																																										if (!i.equals(
																																																												w2i)) {
																																																											if (!i.equals(
																																																													z)) {
																																																												if (!i.equals(
																																																														x)) {
																																																													if (!i.equals(
																																																															w)) {
																																																														if (!c2z.equals(
																																																																y)) {
																																																															if (!c2z.equals(
																																																																	w2i)) {
																																																																if (!c2z.equals(
																																																																		z)) {
																																																																	if (!c2z.equals(
																																																																			x)) {
																																																																		if (!c2z.equals(
																																																																				w)) {
																																																																			if (!c2z.equals(
																																																																					i)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						y,
																																																																						w2i,
																																																																						z,
																																																																						a2x,
																																																																						x,
																																																																						w,
																																																																						a,
																																																																						b2y,
																																																																						b,
																																																																						c,
																																																																						i,
																																																																						c2z };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject y, EObject z, EObject a2x, EObject x, EObject w, EObject a,
			EObject b2y, EObject b, EObject c, EObject i, EObject c2z) {
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileuld2branchubb";
		String y__x____next_name_prime = "next";
		String a2x__x____target_name_prime = "target";
		String a__b____last_name_prime = "last";
		String a__b____first_name_prime = "first";
		String w__a____first_name_prime = "first";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		String x__y____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String a2x__a____source_name_prime = "source";
		String i__x____positive_name_prime = "positive";
		String w__c____next_name_prime = "next";
		String c2z__z____target_name_prime = "target";
		String c2z__c____source_name_prime = "source";
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(y__x____next);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____first);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		ruleresult.getTranslatedEdges().add(x__y____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		y__x____next.setName(y__x____next_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		return new Object[] { ruleresult, y, z, a2x, x, w, a, b2y, b, c, i, c2z, y__x____next, a2x__x____target,
				a__b____last, a__b____first, w__a____first, b2y__y____target, b2y__b____source, x__y____positive,
				i__z____negative, a2x__a____source, i__x____positive, w__c____next, c2z__z____target,
				c2z__c____source };
	}

	public static final void pattern_whileuld2branchubb_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whileuld2branchubb _this, PerformRuleResult ruleresult, EObject y, EObject w2i, EObject z, EObject a2x,
			EObject x, EObject w, EObject a, EObject b2y, EObject b, EObject c, EObject i, EObject c2z) {
		_this.registerObjects_BWD(ruleresult, y, w2i, z, a2x, x, w, a, b2y, b, c, i, c2z);

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
		EObject _localVariable_2 = match.getObject("x");
		EObject _localVariable_3 = match.getObject("i");
		EObject tmpY = _localVariable_0;
		EObject tmpZ = _localVariable_1;
		EObject tmpX = _localVariable_2;
		EObject tmpI = _localVariable_3;
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			if (tmpZ instanceof Branch) {
				Branch z = (Branch) tmpZ;
				if (tmpX instanceof Branch) {
					Branch x = (Branch) tmpX;
					if (tmpI instanceof Branch) {
						Branch i = (Branch) tmpI;
						return new Object[] { y, z, x, i, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileuld2branchubb_12_2_corematch_blackBFBBFBB(Command y, Branch z,
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
							_result.add(new Object[] { y, w2i, z, x, w, i, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileuld2branchubb_12_3_findcontext_blackBBBBBB(Command y, S2B w2i,
			Branch z, Branch x, While w, Branch i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					if (x.equals(y.getNext())) {
						if (w.equals(w2i.getSource())) {
							if (y.equals(x.getPositive())) {
								if (z.equals(i.getNegative())) {
									if (i.equals(w2i.getTarget())) {
										if (x.equals(i.getPositive())) {
											_result.add(new Object[] { y, w2i, z, x, w, i });
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

	public static final Object[] pattern_whileuld2branchubb_12_3_findcontext_greenBBBBBBFFFFFFF(Command y, S2B w2i,
			Branch z, Branch x, While w, Branch i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String y__x____next_name_prime = "next";
		String w2i__w____source_name_prime = "source";
		String x__y____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String w2i__i____target_name_prime = "target";
		String i__x____positive_name_prime = "positive";
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(i);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(y__x____next);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		isApplicableMatch.getAllContextElements().add(x__y____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		y__x____next.setName(y__x____next_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		return new Object[] { y, w2i, z, x, w, i, isApplicableMatch, y__x____next, w2i__w____source, x__y____positive,
				i__z____negative, w2i__i____target, i__x____positive };
	}

	public static final Object[] pattern_whileuld2branchubb_12_4_solveCSP_bindingFBBBBBBBB(whileuld2branchubb _this,
			IsApplicableMatch isApplicableMatch, Command y, S2B w2i, Branch z, Branch x, While w, Branch i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, y, w2i, z, x, w, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, y, w2i, z, x, w, i };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileuld2branchubb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			whileuld2branchubb _this, IsApplicableMatch isApplicableMatch, Command y, S2B w2i, Branch z, Branch x,
			While w, Branch i) {
		Object[] result_pattern_whileuld2branchubb_12_4_solveCSP_binding = pattern_whileuld2branchubb_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, y, w2i, z, x, w, i);
		if (result_pattern_whileuld2branchubb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileuld2branchubb_12_4_solveCSP_binding[0];

			Object[] result_pattern_whileuld2branchubb_12_4_solveCSP_black = pattern_whileuld2branchubb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileuld2branchubb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, y, w2i, z, x, w, i };
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
		for (Graph __DEC_y_root_800647 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_1BBBB(Command y,
			Branch z, Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_y_positive_491756 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!z.equals(__DEC_y_positive_491756)) {
							if (!x.equals(__DEC_y_positive_491756)) {
								if (!i.equals(__DEC_y_positive_491756)) {
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

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_2BBBB(Command y,
			Branch z, Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_y_negative_436174 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!z.equals(__DEC_y_negative_436174)) {
							if (!x.equals(__DEC_y_negative_436174)) {
								if (!i.equals(__DEC_y_negative_436174)) {
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

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_3B(Branch z) {
		for (Graph __DEC_z_root_502324 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_4BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_positive_220519 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_220519)) {
							if (!x.equals(__DEC_z_positive_220519)) {
								if (!i.equals(__DEC_z_positive_220519)) {
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

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_5BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_negative_416335 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_416335)) {
							if (!x.equals(__DEC_z_negative_416335)) {
								if (!i.equals(__DEC_z_negative_416335)) {
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

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_691163 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
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
					for (Branch __DEC_x_positive_331586 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_331586)) {
							if (!z.equals(__DEC_x_positive_331586)) {
								if (!i.equals(__DEC_x_positive_331586)) {
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
					for (Branch __DEC_x_negative_783414 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_783414)) {
							if (!z.equals(__DEC_x_negative_783414)) {
								if (!i.equals(__DEC_x_negative_783414)) {
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

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_12BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_13BB(Branch i,
			Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
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
								if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_12BB(x, y) == null) {
									for (Branch i : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(x, Branch.class, "positive")) {
										if (!i.equals(x)) {
											Node tmpZ = i.getNegative();
											if (tmpZ instanceof Branch) {
												Branch z = (Branch) tmpZ;
												if (!x.equals(z)) {
													if (!i.equals(z)) {
														if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_10BB(
																i, y) == null) {
															if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_13BB(
																	i, y) == null) {
																if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_1BBBB(
																		y, z, x, i) == null) {
																	if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_2BBBB(
																			y, z, x, i) == null) {
																		if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_3B(
																				z) == null) {
																			if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_4BBB(
																					z, x, i) == null) {
																				if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_5BBB(
																						z, x, i) == null) {
																					if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_7BBB(
																							x, z, i) == null) {
																						if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_8BBB(
																								x, z, i) == null) {
																							if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_9BB(
																									z, y) == null) {
																								if (pattern_whileuld2branchubb_20_2_testcorematchandDECs_black_nac_11BB(
																										z, y) == null) {
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

	public static final Object[] pattern_whileuld2branchubb_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whileuld2branchubb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			whileuld2branchubb _this, Match match, Command y, Branch z, Branch x, Branch i) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, y, z, x, i);
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
		for (Decision __DEC_a_positive_38121 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_a_positive_38121)) {
				return new Object[] { a, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_1BB(While a,
			Decision c) {
		for (Decision __DEC_a_negative_525210 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_a_negative_525210)) {
				return new Object[] { a, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_2BB(While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_a_last_3269 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_3269)) {
					if (!w.equals(__DEC_a_last_3269)) {
						return new Object[] { a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_3B(While a) {
		for (Program __DEC_a_first_323105 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_4BB(Assignment b,
			Decision c) {
		for (Decision __DEC_b_positive_698004 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_b_positive_698004)) {
				return new Object[] { b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_5BB(Assignment b,
			Decision c) {
		for (Decision __DEC_b_negative_850951 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_b_negative_850951)) {
				return new Object[] { b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_6BBB(Assignment b,
			While w, While a) {
		if (!a.equals(w)) {
			for (While __DEC_b_last_151240 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!w.equals(__DEC_b_last_151240)) {
					if (!a.equals(__DEC_b_last_151240)) {
						return new Object[] { b, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_7B(Assignment b) {
		for (Program __DEC_b_first_613591 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_8B(Decision c) {
		for (Decision __DEC_c_positive_650386 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_c_positive_650386)) {
				return new Object[] { c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_9B(Decision c) {
		for (Decision __DEC_c_negative_566635 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_c_negative_566635)) {
				return new Object[] { c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_10BBB(Decision c,
			While w, While a) {
		if (!a.equals(w)) {
			for (While __DEC_c_first_583828 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!w.equals(__DEC_c_first_583828)) {
					if (!a.equals(__DEC_c_first_583828)) {
						return new Object[] { c, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_11BBB(Decision c,
			While w, While a) {
		if (!a.equals(w)) {
			for (While __DEC_c_last_877702 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!w.equals(__DEC_c_last_877702)) {
					if (!a.equals(__DEC_c_last_877702)) {
						return new Object[] { c, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_12B(Decision c) {
		for (Program __DEC_c_first_214943 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
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

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_16BB(Decision c,
			Assignment b) {
		if (b.equals(c.getPositive())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_17BB(Decision c,
			Assignment b) {
		if (b.equals(c.getNegative())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_18BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_19BB(While w,
			Decision c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_20BB(While a,
			Decision c) {
		if (c.equals(a.getFirst())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_21BB(While w,
			Decision c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_22BB(While a,
			Decision c) {
		if (c.equals(a.getLast())) {
			return new Object[] { a, c };
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
							if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_7B(b) == null) {
								for (While w : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
										While.class, "first")) {
									if (!a.equals(w)) {
										Statement tmpC = w.getNext();
										if (tmpC instanceof Decision) {
											Decision c = (Decision) tmpC;
											if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_2BB(a,
													w) == null) {
												if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_6BBB(
														b, w, a) == null) {
													if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_15BB(
															w, a) == null) {
														if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_18BB(
																w, b) == null) {
															if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_0BB(
																	a, c) == null) {
																if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_1BB(
																		a, c) == null) {
																	if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_4BB(
																			b, c) == null) {
																		if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_5BB(
																				b, c) == null) {
																			if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_8B(
																					c) == null) {
																				if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_9B(
																						c) == null) {
																					if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_10BBB(
																							c, w, a) == null) {
																						if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_11BBB(
																								c, w, a) == null) {
																							if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_12B(
																									c) == null) {
																								if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_13BB(
																										c, a) == null) {
																									if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_14BB(
																											c,
																											a) == null) {
																										if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_16BB(
																												c,
																												b) == null) {
																											if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_17BB(
																													c,
																													b) == null) {
																												if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_19BB(
																														w,
																														c) == null) {
																													if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_20BB(
																															a,
																															c) == null) {
																														if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_21BB(
																																w,
																																c) == null) {
																															if (pattern_whileuld2branchubb_21_2_testcorematchandDECs_black_nac_22BB(
																																	a,
																																	c) == null) {
																																_result.add(
																																		new Object[] {
																																				w,
																																				a,
																																				b,
																																				c,
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
			whileuld2branchubb _this, Match match, While w, While a, Assignment b, Decision c) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, w, a, b, c);
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

	public static final Object[] pattern_whileuld2branchubb_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("y");
		EObject _localVariable_1 = targetMatch.getObject("z");
		EObject _localVariable_2 = targetMatch.getObject("x");
		EObject _localVariable_3 = sourceMatch.getObject("w");
		EObject _localVariable_4 = sourceMatch.getObject("a");
		EObject _localVariable_5 = sourceMatch.getObject("b");
		EObject _localVariable_6 = sourceMatch.getObject("c");
		EObject _localVariable_7 = targetMatch.getObject("i");
		EObject tmpY = _localVariable_0;
		EObject tmpZ = _localVariable_1;
		EObject tmpX = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpB = _localVariable_5;
		EObject tmpC = _localVariable_6;
		EObject tmpI = _localVariable_7;
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			if (tmpZ instanceof Branch) {
				Branch z = (Branch) tmpZ;
				if (tmpX instanceof Branch) {
					Branch x = (Branch) tmpX;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						if (tmpA instanceof While) {
							While a = (While) tmpA;
							if (tmpB instanceof Assignment) {
								Assignment b = (Assignment) tmpB;
								if (tmpC instanceof Decision) {
									Decision c = (Decision) tmpC;
									if (tmpI instanceof Branch) {
										Branch i = (Branch) tmpI;
										return new Object[] { y, z, x, w, a, b, c, i, targetMatch, sourceMatch };
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

	public static final Object[] pattern_whileuld2branchubb_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Command y, Branch z,
			Branch x, While w, While a, Assignment b, Decision c, Branch i, Match sourceMatch, Match targetMatch) {
		if (!x.equals(z)) {
			if (!a.equals(w)) {
				if (!i.equals(z)) {
					if (!i.equals(x)) {
						if (!sourceMatch.equals(targetMatch)) {
							return new Object[] { y, z, x, w, a, b, c, i, sourceMatch, targetMatch };
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
				targetMatch, sourceMatch);
		if (result_pattern_whileuld2branchubb_24_2_matchsrctrgcontext_binding != null) {
			Command y = (Command) result_pattern_whileuld2branchubb_24_2_matchsrctrgcontext_binding[0];
			Branch z = (Branch) result_pattern_whileuld2branchubb_24_2_matchsrctrgcontext_binding[1];
			Branch x = (Branch) result_pattern_whileuld2branchubb_24_2_matchsrctrgcontext_binding[2];
			While w = (While) result_pattern_whileuld2branchubb_24_2_matchsrctrgcontext_binding[3];
			While a = (While) result_pattern_whileuld2branchubb_24_2_matchsrctrgcontext_binding[4];
			Assignment b = (Assignment) result_pattern_whileuld2branchubb_24_2_matchsrctrgcontext_binding[5];
			Decision c = (Decision) result_pattern_whileuld2branchubb_24_2_matchsrctrgcontext_binding[6];
			Branch i = (Branch) result_pattern_whileuld2branchubb_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_whileuld2branchubb_24_2_matchsrctrgcontext_black = pattern_whileuld2branchubb_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					y, z, x, w, a, b, c, i, sourceMatch, targetMatch);
			if (result_pattern_whileuld2branchubb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { y, z, x, w, a, b, c, i, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_24_3_solvecsp_bindingFBBBBBBBBBBB(whileuld2branchubb _this,
			Command y, Branch z, Branch x, While w, While a, Assignment b, Decision c, Branch i, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(y, z, x, w, a, b, c, i, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, y, z, x, w, a, b, c, i, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileuld2branchubb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			whileuld2branchubb _this, Command y, Branch z, Branch x, While w, While a, Assignment b, Decision c,
			Branch i, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileuld2branchubb_24_3_solvecsp_binding = pattern_whileuld2branchubb_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, y, z, x, w, a, b, c, i, sourceMatch, targetMatch);
		if (result_pattern_whileuld2branchubb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whileuld2branchubb_24_3_solvecsp_binding[0];

			Object[] result_pattern_whileuld2branchubb_24_3_solvecsp_black = pattern_whileuld2branchubb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whileuld2branchubb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, y, z, x, w, a, b, c, i, sourceMatch, targetMatch };
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

	public static final Object[] pattern_whileuld2branchubb_24_6_createcorrespondence_blackBBBBBBBBB(Command y,
			Branch z, Branch x, While w, While a, Assignment b, Decision c, Branch i, CCMatch ccMatch) {
		if (!x.equals(z)) {
			if (!a.equals(w)) {
				if (!i.equals(z)) {
					if (!i.equals(x)) {
						return new Object[] { y, z, x, w, a, b, c, i, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_24_6_createcorrespondence_greenBBFBBFBBFB(Command y,
			Branch z, Branch x, While a, Assignment b, Decision c, CCMatch ccMatch) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		c2z.setTarget(z);
		c2z.setSource(c);
		ccMatch.getCreateCorr().add(c2z);
		return new Object[] { y, z, a2x, x, a, b2y, b, c, c2z, ccMatch };
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
		for (Decision __DEC_a_positive_736377 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_a_positive_736377)) {
				return new Object[] { a, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_1BB(While a, Decision c) {
		for (Decision __DEC_a_negative_83997 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_a_negative_83997)) {
				return new Object[] { a, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_2BB(While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_a_last_104358 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_104358)) {
					if (!w.equals(__DEC_a_last_104358)) {
						return new Object[] { a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_3B(While a) {
		for (Program __DEC_a_first_384271 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_4BB(Assignment b,
			Decision c) {
		for (Decision __DEC_b_positive_151302 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_b_positive_151302)) {
				return new Object[] { b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_5BB(Assignment b,
			Decision c) {
		for (Decision __DEC_b_negative_81605 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_b_negative_81605)) {
				return new Object[] { b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_6BBB(Assignment b, While w,
			While a) {
		if (!a.equals(w)) {
			for (While __DEC_b_last_597401 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!w.equals(__DEC_b_last_597401)) {
					if (!a.equals(__DEC_b_last_597401)) {
						return new Object[] { b, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_7B(Assignment b) {
		for (Program __DEC_b_first_475918 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_8B(Decision c) {
		for (Decision __DEC_c_positive_477017 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			if (!c.equals(__DEC_c_positive_477017)) {
				return new Object[] { c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_9B(Decision c) {
		for (Decision __DEC_c_negative_400106 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			if (!c.equals(__DEC_c_negative_400106)) {
				return new Object[] { c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_10BBB(Decision c, While w,
			While a) {
		if (!a.equals(w)) {
			for (While __DEC_c_first_298714 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!w.equals(__DEC_c_first_298714)) {
					if (!a.equals(__DEC_c_first_298714)) {
						return new Object[] { c, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_11BBB(Decision c, While w,
			While a) {
		if (!a.equals(w)) {
			for (While __DEC_c_last_69437 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!w.equals(__DEC_c_last_69437)) {
					if (!a.equals(__DEC_c_last_69437)) {
						return new Object[] { c, w, a };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_12B(Decision c) {
		for (Program __DEC_c_first_398752 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
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

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_16BB(Decision c,
			Assignment b) {
		if (b.equals(c.getPositive())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_17BB(Decision c,
			Assignment b) {
		if (b.equals(c.getNegative())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_18BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_19BB(While w, Decision c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_20BB(While a, Decision c) {
		if (c.equals(a.getFirst())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_21BB(While w, Decision c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_22BB(While a, Decision c) {
		if (c.equals(a.getLast())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_27_1_matchtggpattern_blackBBBB(While w, While a,
			Assignment b, Decision c) {
		if (!a.equals(w)) {
			if (b.equals(a.getLast())) {
				if (b.equals(a.getFirst())) {
					if (a.equals(w.getFirst())) {
						if (c.equals(w.getNext())) {
							if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_0BB(a, c) == null) {
								if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_1BB(a, c) == null) {
									if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_2BB(a, w) == null) {
										if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_3B(a) == null) {
											if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_4BB(b,
													c) == null) {
												if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_5BB(b,
														c) == null) {
													if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_6BBB(
															b, w, a) == null) {
														if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_7B(
																b) == null) {
															if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_8B(
																	c) == null) {
																if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_9B(
																		c) == null) {
																	if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_10BBB(
																			c, w, a) == null) {
																		if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_11BBB(
																				c, w, a) == null) {
																			if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_12B(
																					c) == null) {
																				if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_13BB(
																						c, a) == null) {
																					if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_14BB(
																							c, a) == null) {
																						if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_15BB(
																								w, a) == null) {
																							if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_16BB(
																									c, b) == null) {
																								if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_17BB(
																										c, b) == null) {
																									if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_18BB(
																											w,
																											b) == null) {
																										if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_19BB(
																												w,
																												c) == null) {
																											if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_20BB(
																													a,
																													c) == null) {
																												if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_21BB(
																														w,
																														c) == null) {
																													if (pattern_whileuld2branchubb_27_1_matchtggpattern_black_nac_22BB(
																															a,
																															c) == null) {
																														return new Object[] {
																																w,
																																a,
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
		for (Graph __DEC_y_root_577813 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_1BBBB(Command y, Branch z,
			Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_y_positive_36162 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!z.equals(__DEC_y_positive_36162)) {
							if (!x.equals(__DEC_y_positive_36162)) {
								if (!i.equals(__DEC_y_positive_36162)) {
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

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_2BBBB(Command y, Branch z,
			Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_y_negative_308082 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!z.equals(__DEC_y_negative_308082)) {
							if (!x.equals(__DEC_y_negative_308082)) {
								if (!i.equals(__DEC_y_negative_308082)) {
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

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_3B(Branch z) {
		for (Graph __DEC_z_root_763376 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_4BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_positive_796922 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_796922)) {
							if (!x.equals(__DEC_z_positive_796922)) {
								if (!i.equals(__DEC_z_positive_796922)) {
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

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_5BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_negative_83504 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_83504)) {
							if (!x.equals(__DEC_z_negative_83504)) {
								if (!i.equals(__DEC_z_negative_83504)) {
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

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_107985 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
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
					for (Branch __DEC_x_positive_968470 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_968470)) {
							if (!z.equals(__DEC_x_positive_968470)) {
								if (!i.equals(__DEC_x_positive_968470)) {
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
					for (Branch __DEC_x_negative_466246 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_466246)) {
							if (!z.equals(__DEC_x_negative_466246)) {
								if (!i.equals(__DEC_x_negative_466246)) {
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

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_12BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_13BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
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

	public static final Object[] pattern_whileuld2branchubb_28_1_matchtggpattern_blackBBBB(Command y, Branch z,
			Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					if (x.equals(y.getNext())) {
						if (y.equals(x.getPositive())) {
							if (z.equals(i.getNegative())) {
								if (x.equals(i.getPositive())) {
									if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_0B(y) == null) {
										if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_1BBBB(y, z, x,
												i) == null) {
											if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_2BBBB(y, z, x,
													i) == null) {
												if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_3B(
														z) == null) {
													if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_4BBB(
															z, x, i) == null) {
														if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_5BBB(
																z, x, i) == null) {
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
																							x, y) == null) {
																						if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_13BB(
																								i, y) == null) {
																							if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_14BB(
																									z, x) == null) {
																								if (pattern_whileuld2branchubb_28_1_matchtggpattern_black_nac_15BB(
																										z, x) == null) {
																									return new Object[] {
																											y, z, x,
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

	public static final Object[] pattern_whileuld2branchubb_29_6_perform_greenFFFFBFFFFBFB(While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		Decision c = SourcecodeFactory.eINSTANCE.createDecision();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getTargetObjects().add(y);
		i.setNegative(z);
		ruleResult.getTargetObjects().add(z);
		ruleResult.getCorrObjects().add(a2x);
		y.setNext(x);
		a2x.setTarget(x);
		x.setPositive(y);
		i.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		w.setFirst(a);
		a2x.setSource(a);
		ruleResult.getSourceObjects().add(a);
		b2y.setTarget(y);
		ruleResult.getCorrObjects().add(b2y);
		a.setLast(b);
		a.setFirst(b);
		b2y.setSource(b);
		ruleResult.getSourceObjects().add(b);
		w.setNext(c);
		ruleResult.getSourceObjects().add(c);
		c2z.setTarget(z);
		c2z.setSource(c);
		ruleResult.getCorrObjects().add(c2z);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { y, z, a2x, x, w, a, b2y, b, c, i, c2z, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whileuld2branchubb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whileuld2branchubbImpl
