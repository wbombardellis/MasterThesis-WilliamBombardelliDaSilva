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
import org.wbsilva.bx.sourcecode2controlflow.Rules.whiledl2branchbb;

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
 * An implementation of the model object '<em><b>whiledl2branchbb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class whiledl2branchbbImpl extends AbstractRuleImpl implements whiledl2branchbb {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected whiledl2branchbbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getwhiledl2branchbb();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Assignment b, Decision a, While w, While c) {

		Object[] result1_black = whiledl2branchbbImpl.pattern_whiledl2branchbb_0_1_initialbindings_blackBBBBBB(this,
				match, b, a, w, c);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[w] = " + w + ", "
					+ "[c] = " + c + ".");
		}

		Object[] result2_bindingAndBlack = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, b, a, w, c);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[w] = " + w + ", "
					+ "[c] = " + c + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whiledl2branchbbImpl.pattern_whiledl2branchbb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whiledl2branchbbImpl
					.pattern_whiledl2branchbb_0_4_collectelementstobetranslated_blackBBBBB(match, b, a, w, c);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[c] = " + c + ".");
			}
			whiledl2branchbbImpl.pattern_whiledl2branchbb_0_4_collectelementstobetranslated_greenBBBBBFFF(match, b, a,
					w, c);
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge c__b____last = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[7];

			Object[] result5_black = whiledl2branchbbImpl
					.pattern_whiledl2branchbb_0_5_collectcontextelements_blackBBBBB(match, b, a, w, c);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[c] = " + c + ".");
			}
			whiledl2branchbbImpl.pattern_whiledl2branchbb_0_5_collectcontextelements_greenBB(match, w);

			// 
			whiledl2branchbbImpl.pattern_whiledl2branchbb_0_6_registerobjectstomatch_expressionBBBBBB(this, match, b, a,
					w, c);
			return whiledl2branchbbImpl.pattern_whiledl2branchbb_0_7_expressionF();
		} else {
			return whiledl2branchbbImpl.pattern_whiledl2branchbb_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		S2B w2i = (S2B) result1_bindingAndBlack[0];
		Assignment b = (Assignment) result1_bindingAndBlack[1];
		Decision a = (Decision) result1_bindingAndBlack[2];
		While w = (While) result1_bindingAndBlack[3];
		While c = (While) result1_bindingAndBlack[4];
		Branch i = (Branch) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_1_1_performtransformation_greenFBFBFBFFFB(b, a, c, i);
		S2B a2x = (S2B) result1_green[0];
		Branch z = (Branch) result1_green[2];
		S2N b2y = (S2N) result1_green[4];
		S2B c2z = (S2B) result1_green[6];
		Branch x = (Branch) result1_green[7];
		Command y = (Command) result1_green[8];

		Object[] result2_black = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBB(a2x, b, z, a, b2y, c, c2z, x, y);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a2x] = " + a2x + ", " + "[b] = "
					+ b + ", " + "[z] = " + z + ", " + "[a] = " + a + ", " + "[b2y] = " + b2y + ", " + "[c] = " + c
					+ ", " + "[c2z] = " + c2z + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
		}
		Object[] result2_green = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBB(a2x, b, z, a, b2y, c, c2z, x,
						y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, a2x, w2i, b, z, a, w,
						b2y, c, c2z, x, y, i);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a2x] = " + a2x + ", " + "[w2i] = " + w2i + ", " + "[b] = " + b + ", " + "[z] = " + z
					+ ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[b2y] = " + b2y + ", " + "[c] = " + c + ", "
					+ "[c2z] = " + c2z + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[i] = " + i + ".");
		}
		whiledl2branchbbImpl.pattern_whiledl2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult,
				a2x, b, z, a, w, b2y, c, c2z, x, y, i);
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge c__b____last = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge y__z____next = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[23];

		// 
		// 
		whiledl2branchbbImpl.pattern_whiledl2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
				a2x, w2i, b, z, a, w, b2y, c, c2z, x, y, i);
		return whiledl2branchbbImpl.pattern_whiledl2branchbb_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whiledl2branchbbImpl.pattern_whiledl2branchbb_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Assignment b = (Assignment) result2_binding[0];
		Decision a = (Decision) result2_binding[1];
		While w = (While) result2_binding[2];
		While c = (While) result2_binding[3];
		for (Object[] result2_black : whiledl2branchbbImpl.pattern_whiledl2branchbb_2_2_corematch_blackFBBBBFB(b, a, w,
				c, match)) {
			S2B w2i = (S2B) result2_black[0];
			Branch i = (Branch) result2_black[5];
			// ForEach 
			for (Object[] result3_black : whiledl2branchbbImpl.pattern_whiledl2branchbb_2_3_findcontext_blackBBBBBB(w2i,
					b, a, w, c, i)) {
				Object[] result3_green = whiledl2branchbbImpl
						.pattern_whiledl2branchbb_2_3_findcontext_greenBBBBBBFFFFFF(w2i, b, a, w, c, i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge c__b____last = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = whiledl2branchbbImpl
						.pattern_whiledl2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, w2i, b,
								a, w, c, i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w2i] = " + w2i + ", " + "[b] = "
							+ b + ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[i] = " + i
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whiledl2branchbbImpl.pattern_whiledl2branchbb_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whiledl2branchbbImpl
							.pattern_whiledl2branchbb_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whiledl2branchbbImpl.pattern_whiledl2branchbb_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whiledl2branchbbImpl.pattern_whiledl2branchbb_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Assignment b, Decision a, While w, While c) {
		match.registerObject("b", b);
		match.registerObject("a", a);
		match.registerObject("w", w);
		match.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment b, Decision a, While w, While c) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, S2B w2i, Assignment b, Decision a,
			While w, While c, Branch i) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("w", w);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject a2x, EObject w2i, EObject b, EObject z,
			EObject a, EObject w, EObject b2y, EObject c, EObject c2z, EObject x, EObject y, EObject i) {
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("i", i);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.Decision.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.While.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch z, Branch x, Command y, Branch i) {

		Object[] result1_black = whiledl2branchbbImpl.pattern_whiledl2branchbb_10_1_initialbindings_blackBBBBBB(this,
				match, z, x, y, i);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[y] = " + y + ", "
					+ "[i] = " + i + ".");
		}

		Object[] result2_bindingAndBlack = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, z, x, y, i);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[y] = " + y + ", "
					+ "[i] = " + i + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whiledl2branchbbImpl.pattern_whiledl2branchbb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whiledl2branchbbImpl
					.pattern_whiledl2branchbb_10_4_collectelementstobetranslated_blackBBBBB(match, z, x, y, i);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[z] = " + z + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[i] = " + i + ".");
			}
			whiledl2branchbbImpl.pattern_whiledl2branchbb_10_4_collectelementstobetranslated_greenBBBBBFFF(match, z, x,
					y, i);
			//nothing EMoflonEdge y__z____next = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[7];

			Object[] result5_black = whiledl2branchbbImpl
					.pattern_whiledl2branchbb_10_5_collectcontextelements_blackBBBBB(match, z, x, y, i);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[z] = " + z + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[i] = " + i + ".");
			}
			whiledl2branchbbImpl.pattern_whiledl2branchbb_10_5_collectcontextelements_greenBB(match, i);

			// 
			whiledl2branchbbImpl.pattern_whiledl2branchbb_10_6_registerobjectstomatch_expressionBBBBBB(this, match, z,
					x, y, i);
			return whiledl2branchbbImpl.pattern_whiledl2branchbb_10_7_expressionF();
		} else {
			return whiledl2branchbbImpl.pattern_whiledl2branchbb_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		S2B w2i = (S2B) result1_bindingAndBlack[0];
		Branch z = (Branch) result1_bindingAndBlack[1];
		While w = (While) result1_bindingAndBlack[2];
		Branch x = (Branch) result1_bindingAndBlack[3];
		Command y = (Command) result1_bindingAndBlack[4];
		Branch i = (Branch) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_11_1_performtransformation_greenFFBFBFFFBB(z, w, x, y);
		S2B a2x = (S2B) result1_green[0];
		Assignment b = (Assignment) result1_green[1];
		Decision a = (Decision) result1_green[3];
		S2N b2y = (S2N) result1_green[5];
		While c = (While) result1_green[6];
		S2B c2z = (S2B) result1_green[7];

		Object[] result2_black = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBB(a2x, b, z, a, b2y, c, c2z, x,
						y);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a2x] = " + a2x + ", " + "[b] = "
					+ b + ", " + "[z] = " + z + ", " + "[a] = " + a + ", " + "[b2y] = " + b2y + ", " + "[c] = " + c
					+ ", " + "[c2z] = " + c2z + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
		}
		Object[] result2_green = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBB(a2x, b, z, a, b2y, c, c2z, x,
						y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, a2x, w2i, b, z, a, w,
						b2y, c, c2z, x, y, i);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a2x] = " + a2x + ", " + "[w2i] = " + w2i + ", " + "[b] = " + b + ", " + "[z] = " + z
					+ ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[b2y] = " + b2y + ", " + "[c] = " + c + ", "
					+ "[c2z] = " + c2z + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[i] = " + i + ".");
		}
		whiledl2branchbbImpl.pattern_whiledl2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult,
				a2x, b, z, a, w, b2y, c, c2z, x, y, i);
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge c__b____last = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge y__z____next = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[23];

		// 
		// 
		whiledl2branchbbImpl.pattern_whiledl2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
				a2x, w2i, b, z, a, w, b2y, c, c2z, x, y, i);
		return whiledl2branchbbImpl.pattern_whiledl2branchbb_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whiledl2branchbbImpl.pattern_whiledl2branchbb_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Branch z = (Branch) result2_binding[0];
		Branch x = (Branch) result2_binding[1];
		Command y = (Command) result2_binding[2];
		Branch i = (Branch) result2_binding[3];
		for (Object[] result2_black : whiledl2branchbbImpl.pattern_whiledl2branchbb_12_2_corematch_blackFBFBBBB(z, x, y,
				i, match)) {
			S2B w2i = (S2B) result2_black[0];
			While w = (While) result2_black[2];
			// ForEach 
			for (Object[] result3_black : whiledl2branchbbImpl
					.pattern_whiledl2branchbb_12_3_findcontext_blackBBBBBB(w2i, z, w, x, y, i)) {
				Object[] result3_green = whiledl2branchbbImpl
						.pattern_whiledl2branchbb_12_3_findcontext_greenBBBBBBFFFFFF(w2i, z, w, x, y, i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge y__z____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = whiledl2branchbbImpl
						.pattern_whiledl2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, w2i,
								z, w, x, y, i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w2i] = " + w2i + ", " + "[z] = "
							+ z + ", " + "[w] = " + w + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[i] = " + i
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whiledl2branchbbImpl.pattern_whiledl2branchbb_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whiledl2branchbbImpl
							.pattern_whiledl2branchbb_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whiledl2branchbbImpl.pattern_whiledl2branchbb_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whiledl2branchbbImpl.pattern_whiledl2branchbb_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Branch z, Branch x, Command y, Branch i) {
		match.registerObject("z", z);
		match.registerObject("x", x);
		match.registerObject("y", y);
		match.registerObject("i", i);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch z, Branch x, Command y, Branch i) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, S2B w2i, Branch z, While w, Branch x,
			Command y, Branch i) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("x", x);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject a2x, EObject w2i, EObject b, EObject z,
			EObject a, EObject w, EObject b2y, EObject c, EObject c2z, EObject x, EObject y, EObject i) {
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("y", y);
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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_38(EMoflonEdge _edge_next) {

		Object[] result1_bindingAndBlack = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whiledl2branchbbImpl.pattern_whiledl2branchbb_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whiledl2branchbbImpl
				.pattern_whiledl2branchbb_20_2_testcorematchandDECs_blackFFFFB(_edge_next)) {
			Branch z = (Branch) result2_black[0];
			Branch x = (Branch) result2_black[1];
			Command y = (Command) result2_black[2];
			Branch i = (Branch) result2_black[3];
			Object[] result2_green = whiledl2branchbbImpl
					.pattern_whiledl2branchbb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whiledl2branchbbImpl
					.pattern_whiledl2branchbb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, z, x, y, i)) {
				// 
				if (whiledl2branchbbImpl
						.pattern_whiledl2branchbb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = whiledl2branchbbImpl
							.pattern_whiledl2branchbb_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whiledl2branchbbImpl.pattern_whiledl2branchbb_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whiledl2branchbbImpl.pattern_whiledl2branchbb_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_39(EMoflonEdge _edge_next) {

		Object[] result1_bindingAndBlack = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whiledl2branchbbImpl.pattern_whiledl2branchbb_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whiledl2branchbbImpl
				.pattern_whiledl2branchbb_21_2_testcorematchandDECs_blackFFFFB(_edge_next)) {
			Assignment b = (Assignment) result2_black[0];
			Decision a = (Decision) result2_black[1];
			While w = (While) result2_black[2];
			While c = (While) result2_black[3];
			Object[] result2_green = whiledl2branchbbImpl
					.pattern_whiledl2branchbb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whiledl2branchbbImpl
					.pattern_whiledl2branchbb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, b, a, w, c)) {
				// 
				if (whiledl2branchbbImpl
						.pattern_whiledl2branchbb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = whiledl2branchbbImpl
							.pattern_whiledl2branchbb_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whiledl2branchbbImpl.pattern_whiledl2branchbb_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whiledl2branchbbImpl.pattern_whiledl2branchbb_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("whiledl2branchbb");
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
		ruleResult.setRule("whiledl2branchbb");
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

		Object[] result1_black = whiledl2branchbbImpl.pattern_whiledl2branchbb_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whiledl2branchbbImpl.pattern_whiledl2branchbb_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Assignment b = (Assignment) result2_bindingAndBlack[0];
		Branch z = (Branch) result2_bindingAndBlack[1];
		Decision a = (Decision) result2_bindingAndBlack[2];
		While w = (While) result2_bindingAndBlack[3];
		While c = (While) result2_bindingAndBlack[4];
		Branch x = (Branch) result2_bindingAndBlack[5];
		Command y = (Command) result2_bindingAndBlack[6];
		Branch i = (Branch) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, b, z, a, w, c, x, y, i,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[b] = " + b + ", " + "[z] = " + z + ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[c] = "
					+ c + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[i] = " + i + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whiledl2branchbbImpl.pattern_whiledl2branchbb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whiledl2branchbbImpl
					.pattern_whiledl2branchbb_24_5_matchcorrcontext_blackFBBBB(w, i, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[0];
				Object[] result5_green = whiledl2branchbbImpl
						.pattern_whiledl2branchbb_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whiledl2branchbbImpl
						.pattern_whiledl2branchbb_24_6_createcorrespondence_blackBBBBBBBBB(b, z, a, w, c, x, y, i,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[b] = " + b + ", "
							+ "[z] = " + z + ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[c] = " + c + ", "
							+ "[x] = " + x + ", " + "[y] = " + y + ", " + "[i] = " + i + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				whiledl2branchbbImpl.pattern_whiledl2branchbb_24_6_createcorrespondence_greenFBBBFBFBBB(b, z, a, c, x,
						y, ccMatch);
				//nothing S2B a2x = (S2B) result6_green[0];
				//nothing S2N b2y = (S2N) result6_green[4];
				//nothing S2B c2z = (S2B) result6_green[6];

				Object[] result7_black = whiledl2branchbbImpl
						.pattern_whiledl2branchbb_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whiledl2branchbbImpl.pattern_whiledl2branchbb_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return whiledl2branchbbImpl.pattern_whiledl2branchbb_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Assignment b, Branch z, Decision a, While w, While c, Branch x, Command y,
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
	public boolean checkDEC_FWD(Assignment b, Decision a, While w, While c) {// 
		Object[] result1_black = whiledl2branchbbImpl.pattern_whiledl2branchbb_27_1_matchtggpattern_blackBBBB(b, a, w,
				c);
		if (result1_black != null) {
			return whiledl2branchbbImpl.pattern_whiledl2branchbb_27_2_expressionF();
		} else {
			return whiledl2branchbbImpl.pattern_whiledl2branchbb_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Branch z, Branch x, Command y, Branch i) {// 
		Object[] result1_black = whiledl2branchbbImpl.pattern_whiledl2branchbb_28_1_matchtggpattern_blackBBBB(z, x, y,
				i);
		if (result1_black != null) {
			return whiledl2branchbbImpl.pattern_whiledl2branchbb_28_2_expressionF();
		} else {
			return whiledl2branchbbImpl.pattern_whiledl2branchbb_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B w2iParameter) {

		Object[] result1_black = whiledl2branchbbImpl.pattern_whiledl2branchbb_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whiledl2branchbbImpl.pattern_whiledl2branchbb_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : whiledl2branchbbImpl
				.pattern_whiledl2branchbb_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList w2iList = (RuleEntryList) result2_black[0];
			S2B w2i = (S2B) result2_black[1];
			While w = (While) result2_black[2];
			Branch i = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = whiledl2branchbbImpl
					.pattern_whiledl2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, w2i, w, i,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w2i] = " + w2i + ", " + "[w] = " + w
						+ ", " + "[i] = " + i + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whiledl2branchbbImpl.pattern_whiledl2branchbb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whiledl2branchbbImpl.pattern_whiledl2branchbb_29_5_checknacs_blackBBB(w2i, w,
						i);
				if (result5_black != null) {

					Object[] result6_black = whiledl2branchbbImpl.pattern_whiledl2branchbb_29_6_perform_blackBBBB(w2i,
							w, i, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w2i] = " + w2i + ", "
								+ "[w] = " + w + ", " + "[i] = " + i + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whiledl2branchbbImpl.pattern_whiledl2branchbb_29_6_perform_greenFFFFBFFFFFBB(w, i, ruleResult);
					//nothing S2B a2x = (S2B) result6_green[0];
					//nothing Assignment b = (Assignment) result6_green[1];
					//nothing Branch z = (Branch) result6_green[2];
					//nothing Decision a = (Decision) result6_green[3];
					//nothing S2N b2y = (S2N) result6_green[5];
					//nothing While c = (While) result6_green[6];
					//nothing S2B c2z = (S2B) result6_green[7];
					//nothing Branch x = (Branch) result6_green[8];
					//nothing Command y = (Command) result6_green[9];

				} else {
				}

			} else {
			}

		}
		return whiledl2branchbbImpl.pattern_whiledl2branchbb_29_7_expressionFB(ruleResult);
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
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_DECISION_WHILE_WHILE:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Decision) arguments.get(2), (While) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.WHILEDL2BRANCHBB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_DECISION_WHILE_WHILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Decision) arguments.get(2), (While) arguments.get(3), (While) arguments.get(4));
			return null;
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_DECISION_WHILE_WHILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Decision) arguments.get(2), (While) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_S2B_ASSIGNMENT_DECISION_WHILE_WHILE_BRANCH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Assignment) arguments.get(2), (Decision) arguments.get(3), (While) arguments.get(4),
					(While) arguments.get(5), (Branch) arguments.get(6));
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.WHILEDL2BRANCHBB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPROPRIATE_BWD__MATCH_BRANCH_BRANCH_COMMAND_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.WHILEDL2BRANCHBB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_BRANCH_COMMAND_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
			return null;
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_BRANCH_COMMAND_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_BRANCH_WHILE_BRANCH_COMMAND_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Branch) arguments.get(2), (While) arguments.get(3), (Branch) arguments.get(4),
					(Command) arguments.get(5), (Branch) arguments.get(6));
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.WHILEDL2BRANCHBB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_38__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_38((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_39__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_39((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_CC__ASSIGNMENT_BRANCH_DECISION_WHILE_WHILE_BRANCH_COMMAND_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Assignment) arguments.get(0), (Branch) arguments.get(1),
					(Decision) arguments.get(2), (While) arguments.get(3), (While) arguments.get(4),
					(Branch) arguments.get(5), (Command) arguments.get(6), (Branch) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___CHECK_DEC_FWD__ASSIGNMENT_DECISION_WHILE_WHILE:
			return checkDEC_FWD((Assignment) arguments.get(0), (Decision) arguments.get(1), (While) arguments.get(2),
					(While) arguments.get(3));
		case RulesPackage.WHILEDL2BRANCHBB___CHECK_DEC_BWD__BRANCH_BRANCH_COMMAND_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.WHILEDL2BRANCHBB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILEDL2BRANCHBB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_WHILE_BRANCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(While) arguments.get(2), (Branch) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILEDL2BRANCHBB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whiledl2branchbb_0_1_initialbindings_blackBBBBBB(whiledl2branchbb _this,
			Match match, Assignment b, Decision a, While w, While c) {
		if (!c.equals(w)) {
			return new Object[] { _this, match, b, a, w, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_0_2_SolveCSP_bindingFBBBBBB(whiledl2branchbb _this,
			Match match, Assignment b, Decision a, While w, While c) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, b, a, w, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, b, a, w, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledl2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBB(whiledl2branchbb _this,
			Match match, Assignment b, Decision a, While w, While c) {
		Object[] result_pattern_whiledl2branchbb_0_2_SolveCSP_binding = pattern_whiledl2branchbb_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, b, a, w, c);
		if (result_pattern_whiledl2branchbb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledl2branchbb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whiledl2branchbb_0_2_SolveCSP_black = pattern_whiledl2branchbb_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whiledl2branchbb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, b, a, w, c };
			}
		}
		return null;
	}

	public static final boolean pattern_whiledl2branchbb_0_3_CheckCSP_expressionFBB(whiledl2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiledl2branchbb_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			Assignment b, Decision a, While w, While c) {
		if (!c.equals(w)) {
			return new Object[] { match, b, a, w, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_0_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			Assignment b, Decision a, While w, While c) {
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(c);
		String w__c____next_name_prime = "next";
		String c__b____last_name_prime = "last";
		String w__a____first_name_prime = "first";
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(c__b____last);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		w__c____next.setName(w__c____next_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		return new Object[] { match, b, a, w, c, w__c____next, c__b____last, w__a____first };
	}

	public static final Object[] pattern_whiledl2branchbb_0_5_collectcontextelements_blackBBBBB(Match match,
			Assignment b, Decision a, While w, While c) {
		if (!c.equals(w)) {
			return new Object[] { match, b, a, w, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whiledl2branchbb_0_6_registerobjectstomatch_expressionBBBBBB(
			whiledl2branchbb _this, Match match, Assignment b, Decision a, While w, While c) {
		_this.registerObjectsToMatch_FWD(match, b, a, w, c);

	}

	public static final boolean pattern_whiledl2branchbb_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whiledl2branchbb_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whiledl2branchbb_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_1 = isApplicableMatch.getObject("b");
		EObject _localVariable_2 = isApplicableMatch.getObject("a");
		EObject _localVariable_3 = isApplicableMatch.getObject("w");
		EObject _localVariable_4 = isApplicableMatch.getObject("c");
		EObject _localVariable_5 = isApplicableMatch.getObject("i");
		EObject tmpW2i = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpC = _localVariable_4;
		EObject tmpI = _localVariable_5;
		if (tmpW2i instanceof S2B) {
			S2B w2i = (S2B) tmpW2i;
			if (tmpB instanceof Assignment) {
				Assignment b = (Assignment) tmpB;
				if (tmpA instanceof Decision) {
					Decision a = (Decision) tmpA;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						if (tmpC instanceof While) {
							While c = (While) tmpC;
							if (tmpI instanceof Branch) {
								Branch i = (Branch) tmpI;
								return new Object[] { w2i, b, a, w, c, i, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_1_1_performtransformation_blackBBBBBBFBB(S2B w2i,
			Assignment b, Decision a, While w, While c, Branch i, whiledl2branchbb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!c.equals(w)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { w2i, b, a, w, c, i, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			whiledl2branchbb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whiledl2branchbb_1_1_performtransformation_binding = pattern_whiledl2branchbb_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_whiledl2branchbb_1_1_performtransformation_binding != null) {
			S2B w2i = (S2B) result_pattern_whiledl2branchbb_1_1_performtransformation_binding[0];
			Assignment b = (Assignment) result_pattern_whiledl2branchbb_1_1_performtransformation_binding[1];
			Decision a = (Decision) result_pattern_whiledl2branchbb_1_1_performtransformation_binding[2];
			While w = (While) result_pattern_whiledl2branchbb_1_1_performtransformation_binding[3];
			While c = (While) result_pattern_whiledl2branchbb_1_1_performtransformation_binding[4];
			Branch i = (Branch) result_pattern_whiledl2branchbb_1_1_performtransformation_binding[5];

			Object[] result_pattern_whiledl2branchbb_1_1_performtransformation_black = pattern_whiledl2branchbb_1_1_performtransformation_blackBBBBBBFBB(
					w2i, b, a, w, c, i, _this, isApplicableMatch);
			if (result_pattern_whiledl2branchbb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whiledl2branchbb_1_1_performtransformation_black[6];

				return new Object[] { w2i, b, a, w, c, i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_1_1_performtransformation_greenFBFBFBFFFB(Assignment b,
			Decision a, While c, Branch i) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		a2x.setSource(a);
		i.setNegative(z);
		b2y.setSource(b);
		c2z.setSource(c);
		c2z.setTarget(z);
		a2x.setTarget(x);
		i.setPositive(x);
		b2y.setTarget(y);
		y.setNext(z);
		return new Object[] { a2x, b, z, a, b2y, c, c2z, x, y, i };
	}

	public static final Object[] pattern_whiledl2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBB(S2B a2x,
			Assignment b, Branch z, Decision a, S2N b2y, While c, S2B c2z, Branch x, Command y) {
		if (!a2x.equals(c2z)) {
			if (!x.equals(z)) {
				return new Object[] { a2x, b, z, a, b2y, c, c2z, x, y };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBB(S2B a2x,
			Assignment b, Branch z, Decision a, S2N b2y, While c, S2B c2z, Branch x, Command y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedElements().add(y);
		return new Object[] { ruleresult, a2x, b, z, a, b2y, c, c2z, x, y };
	}

	public static final Object[] pattern_whiledl2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject a2x, EObject w2i, EObject b, EObject z, EObject a, EObject w,
			EObject b2y, EObject c, EObject c2z, EObject x, EObject y, EObject i) {
		if (!a2x.equals(w2i)) {
			if (!a2x.equals(b)) {
				if (!a2x.equals(z)) {
					if (!a2x.equals(w)) {
						if (!a2x.equals(b2y)) {
							if (!a2x.equals(c)) {
								if (!a2x.equals(c2z)) {
									if (!a2x.equals(x)) {
										if (!a2x.equals(y)) {
											if (!a2x.equals(i)) {
												if (!w2i.equals(z)) {
													if (!w2i.equals(x)) {
														if (!w2i.equals(y)) {
															if (!b.equals(w2i)) {
																if (!b.equals(z)) {
																	if (!b.equals(w)) {
																		if (!b.equals(b2y)) {
																			if (!b.equals(c)) {
																				if (!b.equals(c2z)) {
																					if (!b.equals(x)) {
																						if (!b.equals(y)) {
																							if (!b.equals(i)) {
																								if (!a.equals(a2x)) {
																									if (!a.equals(
																											w2i)) {
																										if (!a.equals(
																												b)) {
																											if (!a.equals(
																													z)) {
																												if (!a.equals(
																														w)) {
																													if (!a.equals(
																															b2y)) {
																														if (!a.equals(
																																c)) {
																															if (!a.equals(
																																	c2z)) {
																																if (!a.equals(
																																		x)) {
																																	if (!a.equals(
																																			y)) {
																																		if (!a.equals(
																																				i)) {
																																			if (!w.equals(
																																					w2i)) {
																																				if (!w.equals(
																																						z)) {
																																					if (!w.equals(
																																							x)) {
																																						if (!w.equals(
																																								y)) {
																																							if (!b2y.equals(
																																									w2i)) {
																																								if (!b2y.equals(
																																										z)) {
																																									if (!b2y.equals(
																																											w)) {
																																										if (!b2y.equals(
																																												c)) {
																																											if (!b2y.equals(
																																													c2z)) {
																																												if (!b2y.equals(
																																														x)) {
																																													if (!b2y.equals(
																																															y)) {
																																														if (!b2y.equals(
																																																i)) {
																																															if (!c.equals(
																																																	w2i)) {
																																																if (!c.equals(
																																																		z)) {
																																																	if (!c.equals(
																																																			w)) {
																																																		if (!c.equals(
																																																				c2z)) {
																																																			if (!c.equals(
																																																					x)) {
																																																				if (!c.equals(
																																																						y)) {
																																																					if (!c.equals(
																																																							i)) {
																																																						if (!c2z.equals(
																																																								w2i)) {
																																																							if (!c2z.equals(
																																																									z)) {
																																																								if (!c2z.equals(
																																																										w)) {
																																																									if (!c2z.equals(
																																																											x)) {
																																																										if (!c2z.equals(
																																																												y)) {
																																																											if (!c2z.equals(
																																																													i)) {
																																																												if (!x.equals(
																																																														z)) {
																																																													if (!x.equals(
																																																															y)) {
																																																														if (!y.equals(
																																																																z)) {
																																																															if (!i.equals(
																																																																	w2i)) {
																																																																if (!i.equals(
																																																																		z)) {
																																																																	if (!i.equals(
																																																																			w)) {
																																																																		if (!i.equals(
																																																																				x)) {
																																																																			if (!i.equals(
																																																																					y)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						a2x,
																																																																						w2i,
																																																																						b,
																																																																						z,
																																																																						a,
																																																																						w,
																																																																						b2y,
																																																																						c,
																																																																						c2z,
																																																																						x,
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
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whiledl2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject a2x, EObject b, EObject z, EObject a, EObject w, EObject b2y,
			EObject c, EObject c2z, EObject x, EObject y, EObject i) {
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whiledl2branchbb";
		String a2x__a____source_name_prime = "source";
		String w__c____next_name_prime = "next";
		String b2y__b____source_name_prime = "source";
		String c__b____last_name_prime = "last";
		String c2z__c____source_name_prime = "source";
		String c2z__z____target_name_prime = "target";
		String a2x__x____target_name_prime = "target";
		String b2y__y____target_name_prime = "target";
		String y__z____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(c__b____last);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		ruleresult.getCreatedEdges().add(y__z____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		y__z____next.setName(y__z____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		return new Object[] { ruleresult, a2x, b, z, a, w, b2y, c, c2z, x, y, i, a2x__a____source, w__c____next,
				b2y__b____source, c__b____last, c2z__c____source, c2z__z____target, a2x__x____target, b2y__y____target,
				y__z____next, w__a____first, i__x____positive, i__z____negative };
	}

	public static final void pattern_whiledl2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whiledl2branchbb _this, PerformRuleResult ruleresult, EObject a2x, EObject w2i, EObject b, EObject z,
			EObject a, EObject w, EObject b2y, EObject c, EObject c2z, EObject x, EObject y, EObject i) {
		_this.registerObjects_FWD(ruleresult, a2x, w2i, b, z, a, w, b2y, c, c2z, x, y, i);

	}

	public static final PerformRuleResult pattern_whiledl2branchbb_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whiledl2branchbb_2_1_preparereturnvalue_bindingFB(whiledl2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_2_1_preparereturnvalue_blackFBB(EClass eClass,
			whiledl2branchbb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_2_1_preparereturnvalue_bindingAndBlackFFB(
			whiledl2branchbb _this) {
		Object[] result_pattern_whiledl2branchbb_2_1_preparereturnvalue_binding = pattern_whiledl2branchbb_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whiledl2branchbb_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whiledl2branchbb_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whiledl2branchbb_2_1_preparereturnvalue_black = pattern_whiledl2branchbb_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whiledl2branchbb_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whiledl2branchbb_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whiledl2branchbb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whiledl2branchbb_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("b");
		EObject _localVariable_1 = match.getObject("a");
		EObject _localVariable_2 = match.getObject("w");
		EObject _localVariable_3 = match.getObject("c");
		EObject tmpB = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpC = _localVariable_3;
		if (tmpB instanceof Assignment) {
			Assignment b = (Assignment) tmpB;
			if (tmpA instanceof Decision) {
				Decision a = (Decision) tmpA;
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					if (tmpC instanceof While) {
						While c = (While) tmpC;
						return new Object[] { b, a, w, c, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiledl2branchbb_2_2_corematch_blackFBBBBFB(Assignment b, Decision a,
			While w, While c, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(w)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				Branch i = w2i.getTarget();
				if (i != null) {
					_result.add(new Object[] { w2i, b, a, w, c, i, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whiledl2branchbb_2_3_findcontext_blackBBBBBB(S2B w2i, Assignment b,
			Decision a, While w, While c, Branch i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(w)) {
			if (c.equals(w.getNext())) {
				if (b.equals(c.getLast())) {
					if (w.equals(w2i.getSource())) {
						if (a.equals(w.getFirst())) {
							if (i.equals(w2i.getTarget())) {
								_result.add(new Object[] { w2i, b, a, w, c, i });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whiledl2branchbb_2_3_findcontext_greenBBBBBBFFFFFF(S2B w2i, Assignment b,
			Decision a, While w, While c, Branch i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w__c____next_name_prime = "next";
		String c__b____last_name_prime = "last";
		String w2i__w____source_name_prime = "source";
		String w__a____first_name_prime = "first";
		String w2i__i____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(i);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(c__b____last);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w__c____next.setName(w__c____next_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		return new Object[] { w2i, b, a, w, c, i, isApplicableMatch, w__c____next, c__b____last, w2i__w____source,
				w__a____first, w2i__i____target };
	}

	public static final Object[] pattern_whiledl2branchbb_2_4_solveCSP_bindingFBBBBBBBB(whiledl2branchbb _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, Assignment b, Decision a, While w, While c, Branch i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, w2i, b, a, w, c, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w2i, b, a, w, c, i };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledl2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(whiledl2branchbb _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, Assignment b, Decision a, While w, While c, Branch i) {
		Object[] result_pattern_whiledl2branchbb_2_4_solveCSP_binding = pattern_whiledl2branchbb_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, w2i, b, a, w, c, i);
		if (result_pattern_whiledl2branchbb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledl2branchbb_2_4_solveCSP_binding[0];

			Object[] result_pattern_whiledl2branchbb_2_4_solveCSP_black = pattern_whiledl2branchbb_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whiledl2branchbb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w2i, b, a, w, c, i };
			}
		}
		return null;
	}

	public static final boolean pattern_whiledl2branchbb_2_5_checkCSP_expressionFBB(whiledl2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiledl2branchbb_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whiledl2branchbb_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whiledl2branchbb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whiledl2branchbb_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whiledl2branchbb_10_1_initialbindings_blackBBBBBB(whiledl2branchbb _this,
			Match match, Branch z, Branch x, Command y, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					return new Object[] { _this, match, z, x, y, i };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_10_2_SolveCSP_bindingFBBBBBB(whiledl2branchbb _this,
			Match match, Branch z, Branch x, Command y, Branch i) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, z, x, y, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, z, x, y, i };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledl2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBB(whiledl2branchbb _this,
			Match match, Branch z, Branch x, Command y, Branch i) {
		Object[] result_pattern_whiledl2branchbb_10_2_SolveCSP_binding = pattern_whiledl2branchbb_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, z, x, y, i);
		if (result_pattern_whiledl2branchbb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledl2branchbb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whiledl2branchbb_10_2_SolveCSP_black = pattern_whiledl2branchbb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whiledl2branchbb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, z, x, y, i };
			}
		}
		return null;
	}

	public static final boolean pattern_whiledl2branchbb_10_3_CheckCSP_expressionFBB(whiledl2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiledl2branchbb_10_4_collectelementstobetranslated_blackBBBBB(Match match,
			Branch z, Branch x, Command y, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					return new Object[] { match, z, x, y, i };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_10_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			Branch z, Branch x, Command y, Branch i) {
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(y);
		String y__z____next_name_prime = "next";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		match.getToBeTranslatedEdges().add(y__z____next);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		y__z____next.setName(y__z____next_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		return new Object[] { match, z, x, y, i, y__z____next, i__x____positive, i__z____negative };
	}

	public static final Object[] pattern_whiledl2branchbb_10_5_collectcontextelements_blackBBBBB(Match match, Branch z,
			Branch x, Command y, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					return new Object[] { match, z, x, y, i };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_10_5_collectcontextelements_greenBB(Match match, Branch i) {
		match.getContextNodes().add(i);
		return new Object[] { match, i };
	}

	public static final void pattern_whiledl2branchbb_10_6_registerobjectstomatch_expressionBBBBBB(
			whiledl2branchbb _this, Match match, Branch z, Branch x, Command y, Branch i) {
		_this.registerObjectsToMatch_BWD(match, z, x, y, i);

	}

	public static final boolean pattern_whiledl2branchbb_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whiledl2branchbb_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whiledl2branchbb_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_1 = isApplicableMatch.getObject("z");
		EObject _localVariable_2 = isApplicableMatch.getObject("w");
		EObject _localVariable_3 = isApplicableMatch.getObject("x");
		EObject _localVariable_4 = isApplicableMatch.getObject("y");
		EObject _localVariable_5 = isApplicableMatch.getObject("i");
		EObject tmpW2i = _localVariable_0;
		EObject tmpZ = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpY = _localVariable_4;
		EObject tmpI = _localVariable_5;
		if (tmpW2i instanceof S2B) {
			S2B w2i = (S2B) tmpW2i;
			if (tmpZ instanceof Branch) {
				Branch z = (Branch) tmpZ;
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpY instanceof Command) {
							Command y = (Command) tmpY;
							if (tmpI instanceof Branch) {
								Branch i = (Branch) tmpI;
								return new Object[] { w2i, z, w, x, y, i, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_11_1_performtransformation_blackBBBBBBFBB(S2B w2i, Branch z,
			While w, Branch x, Command y, Branch i, whiledl2branchbb _this, IsApplicableMatch isApplicableMatch) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { w2i, z, w, x, y, i, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			whiledl2branchbb _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whiledl2branchbb_11_1_performtransformation_binding = pattern_whiledl2branchbb_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_whiledl2branchbb_11_1_performtransformation_binding != null) {
			S2B w2i = (S2B) result_pattern_whiledl2branchbb_11_1_performtransformation_binding[0];
			Branch z = (Branch) result_pattern_whiledl2branchbb_11_1_performtransformation_binding[1];
			While w = (While) result_pattern_whiledl2branchbb_11_1_performtransformation_binding[2];
			Branch x = (Branch) result_pattern_whiledl2branchbb_11_1_performtransformation_binding[3];
			Command y = (Command) result_pattern_whiledl2branchbb_11_1_performtransformation_binding[4];
			Branch i = (Branch) result_pattern_whiledl2branchbb_11_1_performtransformation_binding[5];

			Object[] result_pattern_whiledl2branchbb_11_1_performtransformation_black = pattern_whiledl2branchbb_11_1_performtransformation_blackBBBBBBFBB(
					w2i, z, w, x, y, i, _this, isApplicableMatch);
			if (result_pattern_whiledl2branchbb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whiledl2branchbb_11_1_performtransformation_black[6];

				return new Object[] { w2i, z, w, x, y, i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_11_1_performtransformation_greenFFBFBFFFBB(Branch z, While w,
			Branch x, Command y) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		a2x.setTarget(x);
		a2x.setSource(a);
		w.setFirst(a);
		b2y.setSource(b);
		b2y.setTarget(y);
		w.setNext(c);
		c.setLast(b);
		c2z.setSource(c);
		c2z.setTarget(z);
		return new Object[] { a2x, b, z, a, w, b2y, c, c2z, x, y };
	}

	public static final Object[] pattern_whiledl2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBB(S2B a2x,
			Assignment b, Branch z, Decision a, S2N b2y, While c, S2B c2z, Branch x, Command y) {
		if (!a2x.equals(c2z)) {
			if (!x.equals(z)) {
				return new Object[] { a2x, b, z, a, b2y, c, c2z, x, y };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBB(S2B a2x,
			Assignment b, Branch z, Decision a, S2N b2y, While c, S2B c2z, Branch x, Command y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getTranslatedElements().add(y);
		return new Object[] { ruleresult, a2x, b, z, a, b2y, c, c2z, x, y };
	}

	public static final Object[] pattern_whiledl2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject a2x, EObject w2i, EObject b, EObject z, EObject a, EObject w,
			EObject b2y, EObject c, EObject c2z, EObject x, EObject y, EObject i) {
		if (!a2x.equals(w2i)) {
			if (!a2x.equals(b)) {
				if (!a2x.equals(z)) {
					if (!a2x.equals(w)) {
						if (!a2x.equals(b2y)) {
							if (!a2x.equals(c)) {
								if (!a2x.equals(c2z)) {
									if (!a2x.equals(x)) {
										if (!a2x.equals(y)) {
											if (!a2x.equals(i)) {
												if (!w2i.equals(z)) {
													if (!w2i.equals(x)) {
														if (!w2i.equals(y)) {
															if (!b.equals(w2i)) {
																if (!b.equals(z)) {
																	if (!b.equals(w)) {
																		if (!b.equals(b2y)) {
																			if (!b.equals(c)) {
																				if (!b.equals(c2z)) {
																					if (!b.equals(x)) {
																						if (!b.equals(y)) {
																							if (!b.equals(i)) {
																								if (!a.equals(a2x)) {
																									if (!a.equals(
																											w2i)) {
																										if (!a.equals(
																												b)) {
																											if (!a.equals(
																													z)) {
																												if (!a.equals(
																														w)) {
																													if (!a.equals(
																															b2y)) {
																														if (!a.equals(
																																c)) {
																															if (!a.equals(
																																	c2z)) {
																																if (!a.equals(
																																		x)) {
																																	if (!a.equals(
																																			y)) {
																																		if (!a.equals(
																																				i)) {
																																			if (!w.equals(
																																					w2i)) {
																																				if (!w.equals(
																																						z)) {
																																					if (!w.equals(
																																							x)) {
																																						if (!w.equals(
																																								y)) {
																																							if (!b2y.equals(
																																									w2i)) {
																																								if (!b2y.equals(
																																										z)) {
																																									if (!b2y.equals(
																																											w)) {
																																										if (!b2y.equals(
																																												c)) {
																																											if (!b2y.equals(
																																													c2z)) {
																																												if (!b2y.equals(
																																														x)) {
																																													if (!b2y.equals(
																																															y)) {
																																														if (!b2y.equals(
																																																i)) {
																																															if (!c.equals(
																																																	w2i)) {
																																																if (!c.equals(
																																																		z)) {
																																																	if (!c.equals(
																																																			w)) {
																																																		if (!c.equals(
																																																				c2z)) {
																																																			if (!c.equals(
																																																					x)) {
																																																				if (!c.equals(
																																																						y)) {
																																																					if (!c.equals(
																																																							i)) {
																																																						if (!c2z.equals(
																																																								w2i)) {
																																																							if (!c2z.equals(
																																																									z)) {
																																																								if (!c2z.equals(
																																																										w)) {
																																																									if (!c2z.equals(
																																																											x)) {
																																																										if (!c2z.equals(
																																																												y)) {
																																																											if (!c2z.equals(
																																																													i)) {
																																																												if (!x.equals(
																																																														z)) {
																																																													if (!x.equals(
																																																															y)) {
																																																														if (!y.equals(
																																																																z)) {
																																																															if (!i.equals(
																																																																	w2i)) {
																																																																if (!i.equals(
																																																																		z)) {
																																																																	if (!i.equals(
																																																																			w)) {
																																																																		if (!i.equals(
																																																																				x)) {
																																																																			if (!i.equals(
																																																																					y)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						a2x,
																																																																						w2i,
																																																																						b,
																																																																						z,
																																																																						a,
																																																																						w,
																																																																						b2y,
																																																																						c,
																																																																						c2z,
																																																																						x,
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
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whiledl2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject a2x, EObject b, EObject z, EObject a, EObject w, EObject b2y,
			EObject c, EObject c2z, EObject x, EObject y, EObject i) {
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whiledl2branchbb";
		String a2x__a____source_name_prime = "source";
		String w__c____next_name_prime = "next";
		String b2y__b____source_name_prime = "source";
		String c__b____last_name_prime = "last";
		String c2z__c____source_name_prime = "source";
		String c2z__z____target_name_prime = "target";
		String a2x__x____target_name_prime = "target";
		String b2y__y____target_name_prime = "target";
		String y__z____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(c__b____last);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		ruleresult.getTranslatedEdges().add(y__z____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		y__z____next.setName(y__z____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		return new Object[] { ruleresult, a2x, b, z, a, w, b2y, c, c2z, x, y, i, a2x__a____source, w__c____next,
				b2y__b____source, c__b____last, c2z__c____source, c2z__z____target, a2x__x____target, b2y__y____target,
				y__z____next, w__a____first, i__x____positive, i__z____negative };
	}

	public static final void pattern_whiledl2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whiledl2branchbb _this, PerformRuleResult ruleresult, EObject a2x, EObject w2i, EObject b, EObject z,
			EObject a, EObject w, EObject b2y, EObject c, EObject c2z, EObject x, EObject y, EObject i) {
		_this.registerObjects_BWD(ruleresult, a2x, w2i, b, z, a, w, b2y, c, c2z, x, y, i);

	}

	public static final PerformRuleResult pattern_whiledl2branchbb_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whiledl2branchbb_12_1_preparereturnvalue_bindingFB(whiledl2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_12_1_preparereturnvalue_blackFBB(EClass eClass,
			whiledl2branchbb _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_12_1_preparereturnvalue_bindingAndBlackFFB(
			whiledl2branchbb _this) {
		Object[] result_pattern_whiledl2branchbb_12_1_preparereturnvalue_binding = pattern_whiledl2branchbb_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whiledl2branchbb_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whiledl2branchbb_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whiledl2branchbb_12_1_preparereturnvalue_black = pattern_whiledl2branchbb_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whiledl2branchbb_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whiledl2branchbb_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whiledl2branchbb";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whiledl2branchbb_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("z");
		EObject _localVariable_1 = match.getObject("x");
		EObject _localVariable_2 = match.getObject("y");
		EObject _localVariable_3 = match.getObject("i");
		EObject tmpZ = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpI = _localVariable_3;
		if (tmpZ instanceof Branch) {
			Branch z = (Branch) tmpZ;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpY instanceof Command) {
					Command y = (Command) tmpY;
					if (tmpI instanceof Branch) {
						Branch i = (Branch) tmpI;
						return new Object[] { z, x, y, i, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiledl2branchbb_12_2_corematch_blackFBFBBBB(Branch z, Branch x,
			Command y, Branch i, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class,
							"target")) {
						Statement tmpW = w2i.getSource();
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							_result.add(new Object[] { w2i, z, w, x, y, i, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whiledl2branchbb_12_3_findcontext_blackBBBBBB(S2B w2i, Branch z,
			While w, Branch x, Command y, Branch i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					if (w.equals(w2i.getSource())) {
						if (z.equals(y.getNext())) {
							if (x.equals(i.getPositive())) {
								if (i.equals(w2i.getTarget())) {
									if (z.equals(i.getNegative())) {
										_result.add(new Object[] { w2i, z, w, x, y, i });
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

	public static final Object[] pattern_whiledl2branchbb_12_3_findcontext_greenBBBBBBFFFFFF(S2B w2i, Branch z, While w,
			Branch x, Command y, Branch i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w2i__w____source_name_prime = "source";
		String y__z____next_name_prime = "next";
		String i__x____positive_name_prime = "positive";
		String w2i__i____target_name_prime = "target";
		String i__z____negative_name_prime = "negative";
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(i);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		isApplicableMatch.getAllContextElements().add(y__z____next);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		w2i__w____source.setName(w2i__w____source_name_prime);
		y__z____next.setName(y__z____next_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		return new Object[] { w2i, z, w, x, y, i, isApplicableMatch, w2i__w____source, y__z____next, i__x____positive,
				w2i__i____target, i__z____negative };
	}

	public static final Object[] pattern_whiledl2branchbb_12_4_solveCSP_bindingFBBBBBBBB(whiledl2branchbb _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, Branch z, While w, Branch x, Command y, Branch i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, w2i, z, w, x, y, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w2i, z, w, x, y, i };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledl2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(whiledl2branchbb _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, Branch z, While w, Branch x, Command y, Branch i) {
		Object[] result_pattern_whiledl2branchbb_12_4_solveCSP_binding = pattern_whiledl2branchbb_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, w2i, z, w, x, y, i);
		if (result_pattern_whiledl2branchbb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledl2branchbb_12_4_solveCSP_binding[0];

			Object[] result_pattern_whiledl2branchbb_12_4_solveCSP_black = pattern_whiledl2branchbb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whiledl2branchbb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w2i, z, w, x, y, i };
			}
		}
		return null;
	}

	public static final boolean pattern_whiledl2branchbb_12_5_checkCSP_expressionFBB(whiledl2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiledl2branchbb_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whiledl2branchbb_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whiledl2branchbb";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whiledl2branchbb_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whiledl2branchbb_20_1_preparereturnvalue_bindingFB(whiledl2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whiledl2branchbb _this) {
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

	public static final Object[] pattern_whiledl2branchbb_20_1_preparereturnvalue_bindingAndBlackFFBF(
			whiledl2branchbb _this) {
		Object[] result_pattern_whiledl2branchbb_20_1_preparereturnvalue_binding = pattern_whiledl2branchbb_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whiledl2branchbb_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whiledl2branchbb_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whiledl2branchbb_20_1_preparereturnvalue_black = pattern_whiledl2branchbb_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whiledl2branchbb_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whiledl2branchbb_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whiledl2branchbb_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_0B(Branch z) {
		for (Graph __DEC_z_root_54810 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_1BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_positive_867687 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_867687)) {
							if (!x.equals(__DEC_z_positive_867687)) {
								if (!i.equals(__DEC_z_positive_867687)) {
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

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_2BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_negative_125383 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_125383)) {
							if (!x.equals(__DEC_z_negative_125383)) {
								if (!i.equals(__DEC_z_negative_125383)) {
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

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_421920 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_4BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_649646 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_649646)) {
							if (!z.equals(__DEC_x_positive_649646)) {
								if (!i.equals(__DEC_x_positive_649646)) {
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

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_5BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_987164 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_987164)) {
							if (!z.equals(__DEC_x_negative_987164)) {
								if (!i.equals(__DEC_x_negative_987164)) {
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

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_6B(Command y) {
		for (Graph __DEC_y_root_154051 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_7BBBB(Command y, Branch z,
			Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_y_positive_137421 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!z.equals(__DEC_y_positive_137421)) {
							if (!x.equals(__DEC_y_positive_137421)) {
								if (!i.equals(__DEC_y_positive_137421)) {
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

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_8BBBB(Command y, Branch z,
			Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_y_negative_967616 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!z.equals(__DEC_y_negative_967616)) {
							if (!x.equals(__DEC_y_negative_967616)) {
								if (!i.equals(__DEC_y_negative_967616)) {
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

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_9BB(Branch z, Branch x) {
		if (x.equals(z.getPositive())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_10BB(Branch z, Branch x) {
		if (x.equals(z.getNegative())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_11BB(Branch z,
			Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_12BB(Branch x,
			Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_13BB(Branch i,
			Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_14BB(Branch z,
			Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_15BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_16BB(Branch i,
			Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiledl2branchbb_20_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpY = _edge_next.getSrc();
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			EObject tmpZ = _edge_next.getTrg();
			if (tmpZ instanceof Branch) {
				Branch z = (Branch) tmpZ;
				if (z.equals(y.getNext())) {
					if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_6B(y) == null) {
						if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_0B(z) == null) {
							if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_11BB(z, y) == null) {
								if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_14BB(z, y) == null) {
									for (Branch i : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(z, Branch.class, "negative")) {
										if (!i.equals(z)) {
											Node tmpX = i.getPositive();
											if (tmpX instanceof Branch) {
												Branch x = (Branch) tmpX;
												if (!x.equals(z)) {
													if (!i.equals(x)) {
														if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_13BB(
																i, y) == null) {
															if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_16BB(
																	i, y) == null) {
																if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_1BBB(
																		z, x, i) == null) {
																	if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_2BBB(
																			z, x, i) == null) {
																		if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_3B(
																				x) == null) {
																			if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_4BBB(
																					x, z, i) == null) {
																				if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_5BBB(
																						x, z, i) == null) {
																					if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_7BBBB(
																							y, z, x, i) == null) {
																						if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_8BBBB(
																								y, z, x, i) == null) {
																							if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_9BB(
																									z, x) == null) {
																								if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_10BB(
																										z, x) == null) {
																									if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_12BB(
																											x,
																											y) == null) {
																										if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_15BB(
																												x,
																												y) == null) {
																											_result.add(
																													new Object[] {
																															z,
																															x,
																															y,
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

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whiledl2branchbb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			whiledl2branchbb _this, Match match, Branch z, Branch x, Command y, Branch i) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, z, x, y, i);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whiledl2branchbb_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whiledl2branchbb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiledl2branchbb_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whiledl2branchbb_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whiledl2branchbb_21_1_preparereturnvalue_bindingFB(whiledl2branchbb _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whiledl2branchbb _this) {
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

	public static final Object[] pattern_whiledl2branchbb_21_1_preparereturnvalue_bindingAndBlackFFBF(
			whiledl2branchbb _this) {
		Object[] result_pattern_whiledl2branchbb_21_1_preparereturnvalue_binding = pattern_whiledl2branchbb_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whiledl2branchbb_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whiledl2branchbb_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whiledl2branchbb_21_1_preparereturnvalue_black = pattern_whiledl2branchbb_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whiledl2branchbb_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whiledl2branchbb_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whiledl2branchbb_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_0BB(Assignment b,
			Decision a) {
		for (Decision __DEC_b_positive_170721 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_b_positive_170721)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_1BB(Assignment b,
			Decision a) {
		for (Decision __DEC_b_negative_272048 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_b_negative_272048)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_2BBB(Assignment b,
			While w, While c) {
		if (!c.equals(w)) {
			for (While __DEC_b_first_20665 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!w.equals(__DEC_b_first_20665)) {
					if (!c.equals(__DEC_b_first_20665)) {
						return new Object[] { b, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_3BBB(Assignment b,
			While w, While c) {
		if (!c.equals(w)) {
			for (While __DEC_b_last_85290 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!w.equals(__DEC_b_last_85290)) {
					if (!c.equals(__DEC_b_last_85290)) {
						return new Object[] { b, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_4B(Assignment b) {
		for (Program __DEC_b_first_672226 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_5B(Decision a) {
		for (Decision __DEC_a_positive_233380 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_a_positive_233380)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_6B(Decision a) {
		for (Decision __DEC_a_negative_417009 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_a_negative_417009)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_7BBB(Decision a, While w,
			While c) {
		if (!c.equals(w)) {
			for (While __DEC_a_last_53559 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!w.equals(__DEC_a_last_53559)) {
					if (!c.equals(__DEC_a_last_53559)) {
						return new Object[] { a, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_8B(Decision a) {
		for (Program __DEC_a_first_782418 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_9BB(While c, Decision a) {
		for (Decision __DEC_c_positive_186505 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_c_positive_186505)) {
				return new Object[] { c, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_10BB(While c,
			Decision a) {
		for (Decision __DEC_c_negative_100539 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_c_negative_100539)) {
				return new Object[] { c, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_11BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_first_914569 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!c.equals(__DEC_c_first_914569)) {
					if (!w.equals(__DEC_c_first_914569)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_12BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_last_133179 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!c.equals(__DEC_c_last_133179)) {
					if (!w.equals(__DEC_c_last_133179)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_13B(While c) {
		for (Program __DEC_c_first_456441 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_14BB(Decision a,
			Assignment b) {
		if (b.equals(a.getPositive())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_15BB(Decision a,
			Assignment b) {
		if (b.equals(a.getNegative())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_16BB(While w,
			Assignment b) {
		if (b.equals(w.getFirst())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_17BB(While c,
			Assignment b) {
		if (b.equals(c.getFirst())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_18BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_19BB(While w,
			Decision a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_20BB(While c,
			Decision a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_21BB(Decision a,
			While c) {
		if (c.equals(a.getPositive())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_22BB(Decision a,
			While c) {
		if (c.equals(a.getNegative())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_23BB(While w, While c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_24BB(While w, While c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiledl2branchbb_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpW = _edge_next.getSrc();
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			EObject tmpC = _edge_next.getTrg();
			if (tmpC instanceof While) {
				While c = (While) tmpC;
				if (!c.equals(w)) {
					if (c.equals(w.getNext())) {
						Statement tmpA = w.getFirst();
						if (tmpA instanceof Decision) {
							Decision a = (Decision) tmpA;
							Statement tmpB = c.getLast();
							if (tmpB instanceof Assignment) {
								Assignment b = (Assignment) tmpB;
								if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_11BB(c, w) == null) {
									if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_12BB(c,
											w) == null) {
										if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_13B(
												c) == null) {
											if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_23BB(w,
													c) == null) {
												if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_24BB(w,
														c) == null) {
													if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_5B(
															a) == null) {
														if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_6B(
																a) == null) {
															if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_7BBB(
																	a, w, c) == null) {
																if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_8B(
																		a) == null) {
																	if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_9BB(
																			c, a) == null) {
																		if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_10BB(
																				c, a) == null) {
																			if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_19BB(
																					w, a) == null) {
																				if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_20BB(
																						c, a) == null) {
																					if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_21BB(
																							a, c) == null) {
																						if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_22BB(
																								a, c) == null) {
																							if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_0BB(
																									b, a) == null) {
																								if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_1BB(
																										b, a) == null) {
																									if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_2BBB(
																											b, w,
																											c) == null) {
																										if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_3BBB(
																												b, w,
																												c) == null) {
																											if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_4B(
																													b) == null) {
																												if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_14BB(
																														a,
																														b) == null) {
																													if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_15BB(
																															a,
																															b) == null) {
																														if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_16BB(
																																w,
																																b) == null) {
																															if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_17BB(
																																	c,
																																	b) == null) {
																																if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_18BB(
																																		w,
																																		b) == null) {
																																	_result.add(
																																			new Object[] {
																																					b,
																																					a,
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

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whiledl2branchbb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			whiledl2branchbb _this, Match match, Assignment b, Decision a, While w, While c) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, b, a, w, c);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whiledl2branchbb_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whiledl2branchbb _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiledl2branchbb_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whiledl2branchbb_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whiledl2branchbb_24_1_prepare_blackB(whiledl2branchbb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whiledl2branchbb_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_whiledl2branchbb_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("b");
		EObject _localVariable_1 = targetMatch.getObject("z");
		EObject _localVariable_2 = sourceMatch.getObject("a");
		EObject _localVariable_3 = sourceMatch.getObject("w");
		EObject _localVariable_4 = sourceMatch.getObject("c");
		EObject _localVariable_5 = targetMatch.getObject("x");
		EObject _localVariable_6 = targetMatch.getObject("y");
		EObject _localVariable_7 = targetMatch.getObject("i");
		EObject tmpB = _localVariable_0;
		EObject tmpZ = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpC = _localVariable_4;
		EObject tmpX = _localVariable_5;
		EObject tmpY = _localVariable_6;
		EObject tmpI = _localVariable_7;
		if (tmpB instanceof Assignment) {
			Assignment b = (Assignment) tmpB;
			if (tmpZ instanceof Branch) {
				Branch z = (Branch) tmpZ;
				if (tmpA instanceof Decision) {
					Decision a = (Decision) tmpA;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						if (tmpC instanceof While) {
							While c = (While) tmpC;
							if (tmpX instanceof Branch) {
								Branch x = (Branch) tmpX;
								if (tmpY instanceof Command) {
									Command y = (Command) tmpY;
									if (tmpI instanceof Branch) {
										Branch i = (Branch) tmpI;
										return new Object[] { b, z, a, w, c, x, y, i, sourceMatch, targetMatch };
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

	public static final Object[] pattern_whiledl2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Assignment b,
			Branch z, Decision a, While w, While c, Branch x, Command y, Branch i, Match sourceMatch,
			Match targetMatch) {
		if (!c.equals(w)) {
			if (!x.equals(z)) {
				if (!i.equals(z)) {
					if (!i.equals(x)) {
						if (!sourceMatch.equals(targetMatch)) {
							return new Object[] { b, z, a, w, c, x, y, i, sourceMatch, targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whiledl2branchbb_24_2_matchsrctrgcontext_binding = pattern_whiledl2branchbb_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_whiledl2branchbb_24_2_matchsrctrgcontext_binding != null) {
			Assignment b = (Assignment) result_pattern_whiledl2branchbb_24_2_matchsrctrgcontext_binding[0];
			Branch z = (Branch) result_pattern_whiledl2branchbb_24_2_matchsrctrgcontext_binding[1];
			Decision a = (Decision) result_pattern_whiledl2branchbb_24_2_matchsrctrgcontext_binding[2];
			While w = (While) result_pattern_whiledl2branchbb_24_2_matchsrctrgcontext_binding[3];
			While c = (While) result_pattern_whiledl2branchbb_24_2_matchsrctrgcontext_binding[4];
			Branch x = (Branch) result_pattern_whiledl2branchbb_24_2_matchsrctrgcontext_binding[5];
			Command y = (Command) result_pattern_whiledl2branchbb_24_2_matchsrctrgcontext_binding[6];
			Branch i = (Branch) result_pattern_whiledl2branchbb_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_whiledl2branchbb_24_2_matchsrctrgcontext_black = pattern_whiledl2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					b, z, a, w, c, x, y, i, sourceMatch, targetMatch);
			if (result_pattern_whiledl2branchbb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { b, z, a, w, c, x, y, i, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBB(whiledl2branchbb _this,
			Assignment b, Branch z, Decision a, While w, While c, Branch x, Command y, Branch i, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(b, z, a, w, c, x, y, i, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, b, z, a, w, c, x, y, i, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledl2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			whiledl2branchbb _this, Assignment b, Branch z, Decision a, While w, While c, Branch x, Command y, Branch i,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whiledl2branchbb_24_3_solvecsp_binding = pattern_whiledl2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, b, z, a, w, c, x, y, i, sourceMatch, targetMatch);
		if (result_pattern_whiledl2branchbb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whiledl2branchbb_24_3_solvecsp_binding[0];

			Object[] result_pattern_whiledl2branchbb_24_3_solvecsp_black = pattern_whiledl2branchbb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whiledl2branchbb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, b, z, a, w, c, x, y, i, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whiledl2branchbb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whiledl2branchbb_24_5_matchcorrcontext_blackFBBBB(While w, Branch i,
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

	public static final Object[] pattern_whiledl2branchbb_24_5_matchcorrcontext_greenBBBF(S2B w2i, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "whiledl2branchbb";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(w2i);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { w2i, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_whiledl2branchbb_24_6_createcorrespondence_blackBBBBBBBBB(Assignment b,
			Branch z, Decision a, While w, While c, Branch x, Command y, Branch i, CCMatch ccMatch) {
		if (!c.equals(w)) {
			if (!x.equals(z)) {
				if (!i.equals(z)) {
					if (!i.equals(x)) {
						return new Object[] { b, z, a, w, c, x, y, i, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_24_6_createcorrespondence_greenFBBBFBFBBB(Assignment b,
			Branch z, Decision a, While c, Branch x, Command y, CCMatch ccMatch) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		b2y.setSource(b);
		b2y.setTarget(y);
		ccMatch.getCreateCorr().add(b2y);
		c2z.setSource(c);
		c2z.setTarget(z);
		ccMatch.getCreateCorr().add(c2z);
		return new Object[] { a2x, b, z, a, b2y, c, c2z, x, y, ccMatch };
	}

	public static final Object[] pattern_whiledl2branchbb_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_whiledl2branchbb_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "whiledl2branchbb";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_whiledl2branchbb_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_0BB(Assignment b, Decision a) {
		for (Decision __DEC_b_positive_699023 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_b_positive_699023)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_1BB(Assignment b, Decision a) {
		for (Decision __DEC_b_negative_376828 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_b_negative_376828)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_2BBB(Assignment b, While w,
			While c) {
		if (!c.equals(w)) {
			for (While __DEC_b_first_902872 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!w.equals(__DEC_b_first_902872)) {
					if (!c.equals(__DEC_b_first_902872)) {
						return new Object[] { b, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_3BBB(Assignment b, While w,
			While c) {
		if (!c.equals(w)) {
			for (While __DEC_b_last_351865 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!w.equals(__DEC_b_last_351865)) {
					if (!c.equals(__DEC_b_last_351865)) {
						return new Object[] { b, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_4B(Assignment b) {
		for (Program __DEC_b_first_729805 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_5B(Decision a) {
		for (Decision __DEC_a_positive_272267 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_a_positive_272267)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_6B(Decision a) {
		for (Decision __DEC_a_negative_222787 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_a_negative_222787)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_7BBB(Decision a, While w,
			While c) {
		if (!c.equals(w)) {
			for (While __DEC_a_last_105059 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!w.equals(__DEC_a_last_105059)) {
					if (!c.equals(__DEC_a_last_105059)) {
						return new Object[] { a, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_8B(Decision a) {
		for (Program __DEC_a_first_75575 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_9BB(While c, Decision a) {
		for (Decision __DEC_c_positive_289068 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_c_positive_289068)) {
				return new Object[] { c, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_10BB(While c, Decision a) {
		for (Decision __DEC_c_negative_989971 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_c_negative_989971)) {
				return new Object[] { c, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_11BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_first_6610 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!c.equals(__DEC_c_first_6610)) {
					if (!w.equals(__DEC_c_first_6610)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_12BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_last_42702 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!c.equals(__DEC_c_last_42702)) {
					if (!w.equals(__DEC_c_last_42702)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_13B(While c) {
		for (Program __DEC_c_first_710292 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_14BB(Decision a,
			Assignment b) {
		if (b.equals(a.getPositive())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_15BB(Decision a,
			Assignment b) {
		if (b.equals(a.getNegative())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_16BB(While w, Assignment b) {
		if (b.equals(w.getFirst())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_17BB(While c, Assignment b) {
		if (b.equals(c.getFirst())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_18BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_19BB(While w, Decision a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_20BB(While c, Decision a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_21BB(Decision a, While c) {
		if (c.equals(a.getPositive())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_22BB(Decision a, While c) {
		if (c.equals(a.getNegative())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_23BB(While w, While c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_24BB(While w, While c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_blackBBBB(Assignment b, Decision a,
			While w, While c) {
		if (!c.equals(w)) {
			if (c.equals(w.getNext())) {
				if (b.equals(c.getLast())) {
					if (a.equals(w.getFirst())) {
						if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_0BB(b, a) == null) {
							if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_1BB(b, a) == null) {
								if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_2BBB(b, w, c) == null) {
									if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_3BBB(b, w, c) == null) {
										if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_4B(b) == null) {
											if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_5B(a) == null) {
												if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_6B(
														a) == null) {
													if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_7BBB(a,
															w, c) == null) {
														if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_8B(
																a) == null) {
															if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_9BB(
																	c, a) == null) {
																if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_10BB(
																		c, a) == null) {
																	if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_11BB(
																			c, w) == null) {
																		if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_12BB(
																				c, w) == null) {
																			if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_13B(
																					c) == null) {
																				if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_14BB(
																						a, b) == null) {
																					if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_15BB(
																							a, b) == null) {
																						if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_16BB(
																								w, b) == null) {
																							if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_17BB(
																									c, b) == null) {
																								if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_18BB(
																										w, b) == null) {
																									if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_19BB(
																											w,
																											a) == null) {
																										if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_20BB(
																												c,
																												a) == null) {
																											if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_21BB(
																													a,
																													c) == null) {
																												if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_22BB(
																														a,
																														c) == null) {
																													if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_23BB(
																															w,
																															c) == null) {
																														if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_24BB(
																																w,
																																c) == null) {
																															return new Object[] {
																																	b,
																																	a,
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

	public static final boolean pattern_whiledl2branchbb_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whiledl2branchbb_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_0B(Branch z) {
		for (Graph __DEC_z_root_249381 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_1BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_positive_950724 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_950724)) {
							if (!x.equals(__DEC_z_positive_950724)) {
								if (!i.equals(__DEC_z_positive_950724)) {
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

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_2BBB(Branch z, Branch x,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_z_negative_906601 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_906601)) {
							if (!x.equals(__DEC_z_negative_906601)) {
								if (!i.equals(__DEC_z_negative_906601)) {
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

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_547021 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_4BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_811930 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_811930)) {
							if (!z.equals(__DEC_x_positive_811930)) {
								if (!i.equals(__DEC_x_positive_811930)) {
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

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_5BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_425691 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_425691)) {
							if (!z.equals(__DEC_x_negative_425691)) {
								if (!i.equals(__DEC_x_negative_425691)) {
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

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_6B(Command y) {
		for (Graph __DEC_y_root_590625 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_7BBBB(Command y, Branch z,
			Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_y_positive_486825 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!z.equals(__DEC_y_positive_486825)) {
							if (!x.equals(__DEC_y_positive_486825)) {
								if (!i.equals(__DEC_y_positive_486825)) {
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

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_8BBBB(Command y, Branch z,
			Branch x, Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					for (Branch __DEC_y_negative_98406 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!z.equals(__DEC_y_negative_98406)) {
							if (!x.equals(__DEC_y_negative_98406)) {
								if (!i.equals(__DEC_y_negative_98406)) {
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

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_9BB(Branch z, Branch x) {
		if (x.equals(z.getPositive())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_10BB(Branch z, Branch x) {
		if (x.equals(z.getNegative())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_11BB(Branch z, Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_12BB(Branch x, Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_13BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_14BB(Branch z, Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_15BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_16BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_blackBBBB(Branch z, Branch x, Command y,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					if (z.equals(y.getNext())) {
						if (x.equals(i.getPositive())) {
							if (z.equals(i.getNegative())) {
								if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_0B(z) == null) {
									if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_1BBB(z, x, i) == null) {
										if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_2BBB(z, x,
												i) == null) {
											if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_3B(x) == null) {
												if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_4BBB(x, z,
														i) == null) {
													if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_5BBB(x,
															z, i) == null) {
														if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_6B(
																y) == null) {
															if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_7BBBB(
																	y, z, x, i) == null) {
																if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_8BBBB(
																		y, z, x, i) == null) {
																	if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_9BB(
																			z, x) == null) {
																		if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_10BB(
																				z, x) == null) {
																			if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_11BB(
																					z, y) == null) {
																				if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_12BB(
																						x, y) == null) {
																					if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_13BB(
																							i, y) == null) {
																						if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_14BB(
																								z, y) == null) {
																							if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_15BB(
																									x, y) == null) {
																								if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_16BB(
																										i, y) == null) {
																									return new Object[] {
																											z, x, y,
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

	public static final boolean pattern_whiledl2branchbb_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whiledl2branchbb_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whiledl2branchbb_29_1_createresult_blackB(whiledl2branchbb _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whiledl2branchbb_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_whiledl2branchbb_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiledl2branchbb_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_whiledl2branchbb_29_2_isapplicablecore_black_nac_0BB(ruleResult, w2i) == null) {
								if (pattern_whiledl2branchbb_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										w) == null) {
									if (pattern_whiledl2branchbb_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_whiledl2branchbb_29_3_solveCSP_bindingFBBBBBB(whiledl2branchbb _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, While w, Branch i, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, w2i, w, i, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w2i, w, i, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledl2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(whiledl2branchbb _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, While w, Branch i, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whiledl2branchbb_29_3_solveCSP_binding = pattern_whiledl2branchbb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, w2i, w, i, ruleResult);
		if (result_pattern_whiledl2branchbb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledl2branchbb_29_3_solveCSP_binding[0];

			Object[] result_pattern_whiledl2branchbb_29_3_solveCSP_black = pattern_whiledl2branchbb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whiledl2branchbb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w2i, w, i, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whiledl2branchbb_29_4_checkCSP_expressionFBB(whiledl2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiledl2branchbb_29_5_checknacs_blackBBB(S2B w2i, While w, Branch i) {
		return new Object[] { w2i, w, i };
	}

	public static final Object[] pattern_whiledl2branchbb_29_6_perform_blackBBBB(S2B w2i, While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { w2i, w, i, ruleResult };
	}

	public static final Object[] pattern_whiledl2branchbb_29_6_perform_greenFFFFBFFFFFBB(While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(a2x);
		ruleResult.getSourceObjects().add(b);
		i.setNegative(z);
		ruleResult.getTargetObjects().add(z);
		a2x.setSource(a);
		w.setFirst(a);
		ruleResult.getSourceObjects().add(a);
		b2y.setSource(b);
		ruleResult.getCorrObjects().add(b2y);
		w.setNext(c);
		c.setLast(b);
		ruleResult.getSourceObjects().add(c);
		c2z.setSource(c);
		c2z.setTarget(z);
		ruleResult.getCorrObjects().add(c2z);
		a2x.setTarget(x);
		i.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		b2y.setTarget(y);
		y.setNext(z);
		ruleResult.getTargetObjects().add(y);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { a2x, b, z, a, w, b2y, c, c2z, x, y, i, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whiledl2branchbb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whiledl2branchbbImpl
