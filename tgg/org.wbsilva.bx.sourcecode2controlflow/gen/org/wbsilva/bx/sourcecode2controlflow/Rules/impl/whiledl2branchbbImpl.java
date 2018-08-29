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
	public boolean isAppropriate_FWD(Match match, Assignment b, While c, While w, Decision a) {

		Object[] result1_black = whiledl2branchbbImpl.pattern_whiledl2branchbb_0_1_initialbindings_blackBBBBBB(this,
				match, b, c, w, a);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[c] = " + c + ", " + "[w] = " + w + ", "
					+ "[a] = " + a + ".");
		}

		Object[] result2_bindingAndBlack = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, b, c, w, a);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[c] = " + c + ", " + "[w] = " + w + ", "
					+ "[a] = " + a + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whiledl2branchbbImpl.pattern_whiledl2branchbb_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whiledl2branchbbImpl
					.pattern_whiledl2branchbb_0_4_collectelementstobetranslated_blackBBBBB(match, b, c, w, a);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[c] = " + c + ", " + "[w] = " + w + ", " + "[a] = " + a + ".");
			}
			whiledl2branchbbImpl.pattern_whiledl2branchbb_0_4_collectelementstobetranslated_greenBBBBBFFF(match, b, c,
					w, a);
			//nothing EMoflonEdge c__b____last = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[7];

			Object[] result5_black = whiledl2branchbbImpl
					.pattern_whiledl2branchbb_0_5_collectcontextelements_blackBBBBB(match, b, c, w, a);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[c] = " + c + ", " + "[w] = " + w + ", " + "[a] = " + a + ".");
			}
			whiledl2branchbbImpl.pattern_whiledl2branchbb_0_5_collectcontextelements_greenBB(match, w);

			// 
			whiledl2branchbbImpl.pattern_whiledl2branchbb_0_6_registerobjectstomatch_expressionBBBBBB(this, match, b, c,
					w, a);
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
		While c = (While) result1_bindingAndBlack[2];
		Branch i = (Branch) result1_bindingAndBlack[3];
		While w = (While) result1_bindingAndBlack[4];
		Decision a = (Decision) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_1_1_performtransformation_greenFBFFBFBBFF(b, c, i, a);
		Branch z = (Branch) result1_green[0];
		S2N b2y = (S2N) result1_green[2];
		Command y = (Command) result1_green[3];
		S2B a2x = (S2B) result1_green[5];
		S2B c2z = (S2B) result1_green[8];
		Branch x = (Branch) result1_green[9];

		Object[] result2_black = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBB(z, b, b2y, y, c, a2x, a, c2z, x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[z] = " + z + ", " + "[b] = " + b
					+ ", " + "[b2y] = " + b2y + ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[a2x] = " + a2x
					+ ", " + "[a] = " + a + ", " + "[c2z] = " + c2z + ", " + "[x] = " + x + ".");
		}
		Object[] result2_green = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBB(z, b, b2y, y, c, a2x, a, c2z,
						x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, z, w2i, b, b2y, y, c,
						a2x, i, w, a, c2z, x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[z] = " + z + ", " + "[w2i] = " + w2i + ", " + "[b] = " + b + ", " + "[b2y] = " + b2y
					+ ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[a2x] = " + a2x + ", " + "[i] = " + i + ", "
					+ "[w] = " + w + ", " + "[a] = " + a + ", " + "[c2z] = " + c2z + ", " + "[x] = " + x + ".");
		}
		whiledl2branchbbImpl.pattern_whiledl2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult,
				z, b, b2y, y, c, a2x, i, w, a, c2z, x);
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge c__b____last = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge y__z____next = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[23];

		// 
		// 
		whiledl2branchbbImpl.pattern_whiledl2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, z,
				w2i, b, b2y, y, c, a2x, i, w, a, c2z, x);
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
		While c = (While) result2_binding[1];
		While w = (While) result2_binding[2];
		Decision a = (Decision) result2_binding[3];
		for (Object[] result2_black : whiledl2branchbbImpl.pattern_whiledl2branchbb_2_2_corematch_blackFBBFBBB(b, c, w,
				a, match)) {
			S2B w2i = (S2B) result2_black[0];
			Branch i = (Branch) result2_black[3];
			// ForEach 
			for (Object[] result3_black : whiledl2branchbbImpl.pattern_whiledl2branchbb_2_3_findcontext_blackBBBBBB(w2i,
					b, c, i, w, a)) {
				Object[] result3_green = whiledl2branchbbImpl
						.pattern_whiledl2branchbb_2_3_findcontext_greenBBBBBBFFFFFF(w2i, b, c, i, w, a);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge c__b____last = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = whiledl2branchbbImpl
						.pattern_whiledl2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, w2i, b,
								c, i, w, a);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w2i] = " + w2i + ", " + "[b] = "
							+ b + ", " + "[c] = " + c + ", " + "[i] = " + i + ", " + "[w] = " + w + ", " + "[a] = " + a
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
	public void registerObjectsToMatch_FWD(Match match, Assignment b, While c, While w, Decision a) {
		match.registerObject("b", b);
		match.registerObject("c", c);
		match.registerObject("w", w);
		match.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment b, While c, While w, Decision a) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, S2B w2i, Assignment b, While c, Branch i,
			While w, Decision a) {// Create CSP
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
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("w", w);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject z, EObject w2i, EObject b, EObject b2y,
			EObject y, EObject c, EObject a2x, EObject i, EObject w, EObject a, EObject c2z, EObject x) {
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.Decision.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch z, Command y, Branch i, Branch x) {

		Object[] result1_black = whiledl2branchbbImpl.pattern_whiledl2branchbb_10_1_initialbindings_blackBBBBBB(this,
				match, z, y, i, x);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[i] = " + i + ", "
					+ "[x] = " + x + ".");
		}

		Object[] result2_bindingAndBlack = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, z, y, i, x);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[i] = " + i + ", "
					+ "[x] = " + x + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whiledl2branchbbImpl.pattern_whiledl2branchbb_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whiledl2branchbbImpl
					.pattern_whiledl2branchbb_10_4_collectelementstobetranslated_blackBBBBB(match, z, y, i, x);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[z] = " + z + ", " + "[y] = " + y + ", " + "[i] = " + i + ", " + "[x] = " + x + ".");
			}
			whiledl2branchbbImpl.pattern_whiledl2branchbb_10_4_collectelementstobetranslated_greenBBBBBFFF(match, z, y,
					i, x);
			//nothing EMoflonEdge y__z____next = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[7];

			Object[] result5_black = whiledl2branchbbImpl
					.pattern_whiledl2branchbb_10_5_collectcontextelements_blackBBBBB(match, z, y, i, x);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[z] = " + z + ", " + "[y] = " + y + ", " + "[i] = " + i + ", " + "[x] = " + x + ".");
			}
			whiledl2branchbbImpl.pattern_whiledl2branchbb_10_5_collectcontextelements_greenBB(match, i);

			// 
			whiledl2branchbbImpl.pattern_whiledl2branchbb_10_6_registerobjectstomatch_expressionBBBBBB(this, match, z,
					y, i, x);
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
		Branch z = (Branch) result1_bindingAndBlack[0];
		S2B w2i = (S2B) result1_bindingAndBlack[1];
		Command y = (Command) result1_bindingAndBlack[2];
		Branch i = (Branch) result1_bindingAndBlack[3];
		While w = (While) result1_bindingAndBlack[4];
		Branch x = (Branch) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_11_1_performtransformation_greenBFFBFFBFFB(z, y, w, x);
		Assignment b = (Assignment) result1_green[1];
		S2N b2y = (S2N) result1_green[2];
		While c = (While) result1_green[4];
		S2B a2x = (S2B) result1_green[5];
		Decision a = (Decision) result1_green[7];
		S2B c2z = (S2B) result1_green[8];

		Object[] result2_black = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBB(z, b, b2y, y, c, a2x, a, c2z,
						x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[z] = " + z + ", " + "[b] = " + b
					+ ", " + "[b2y] = " + b2y + ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[a2x] = " + a2x
					+ ", " + "[a] = " + a + ", " + "[c2z] = " + c2z + ", " + "[x] = " + x + ".");
		}
		Object[] result2_green = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBB(z, b, b2y, y, c, a2x, a, c2z,
						x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, z, w2i, b, b2y, y, c,
						a2x, i, w, a, c2z, x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[z] = " + z + ", " + "[w2i] = " + w2i + ", " + "[b] = " + b + ", " + "[b2y] = " + b2y
					+ ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[a2x] = " + a2x + ", " + "[i] = " + i + ", "
					+ "[w] = " + w + ", " + "[a] = " + a + ", " + "[c2z] = " + c2z + ", " + "[x] = " + x + ".");
		}
		whiledl2branchbbImpl.pattern_whiledl2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult,
				z, b, b2y, y, c, a2x, i, w, a, c2z, x);
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge c__b____last = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge y__z____next = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[23];

		// 
		// 
		whiledl2branchbbImpl.pattern_whiledl2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, z,
				w2i, b, b2y, y, c, a2x, i, w, a, c2z, x);
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
		Command y = (Command) result2_binding[1];
		Branch i = (Branch) result2_binding[2];
		Branch x = (Branch) result2_binding[3];
		for (Object[] result2_black : whiledl2branchbbImpl.pattern_whiledl2branchbb_12_2_corematch_blackBFBBFBB(z, y, i,
				x, match)) {
			S2B w2i = (S2B) result2_black[1];
			While w = (While) result2_black[4];
			// ForEach 
			for (Object[] result3_black : whiledl2branchbbImpl.pattern_whiledl2branchbb_12_3_findcontext_blackBBBBBB(z,
					w2i, y, i, w, x)) {
				Object[] result3_green = whiledl2branchbbImpl
						.pattern_whiledl2branchbb_12_3_findcontext_greenBBBBBBFFFFFF(z, w2i, y, i, w, x);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge y__z____next = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = whiledl2branchbbImpl
						.pattern_whiledl2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, z,
								w2i, y, i, w, x);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[z] = " + z + ", " + "[w2i] = "
							+ w2i + ", " + "[y] = " + y + ", " + "[i] = " + i + ", " + "[w] = " + w + ", " + "[x] = "
							+ x + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Branch z, Command y, Branch i, Branch x) {
		match.registerObject("z", z);
		match.registerObject("y", y);
		match.registerObject("i", i);
		match.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch z, Command y, Branch i, Branch x) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch z, S2B w2i, Command y, Branch i,
			While w, Branch x) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("w", w);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject z, EObject w2i, EObject b, EObject b2y,
			EObject y, EObject c, EObject a2x, EObject i, EObject w, EObject a, EObject c2z, EObject x) {
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("x", x);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_87(EMoflonEdge _edge_next) {

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
			Command y = (Command) result2_black[1];
			Branch i = (Branch) result2_black[2];
			Branch x = (Branch) result2_black[3];
			Object[] result2_green = whiledl2branchbbImpl
					.pattern_whiledl2branchbb_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whiledl2branchbbImpl
					.pattern_whiledl2branchbb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, z, y, i, x)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_87(EMoflonEdge _edge_last) {

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
				.pattern_whiledl2branchbb_21_2_testcorematchandDECs_blackFFFFB(_edge_last)) {
			Assignment b = (Assignment) result2_black[0];
			While c = (While) result2_black[1];
			While w = (While) result2_black[2];
			Decision a = (Decision) result2_black[3];
			Object[] result2_green = whiledl2branchbbImpl
					.pattern_whiledl2branchbb_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whiledl2branchbbImpl
					.pattern_whiledl2branchbb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, b, c, w, a)) {
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
		Branch z = (Branch) result2_bindingAndBlack[0];
		Assignment b = (Assignment) result2_bindingAndBlack[1];
		Command y = (Command) result2_bindingAndBlack[2];
		While c = (While) result2_bindingAndBlack[3];
		Branch i = (Branch) result2_bindingAndBlack[4];
		While w = (While) result2_bindingAndBlack[5];
		Decision a = (Decision) result2_bindingAndBlack[6];
		Branch x = (Branch) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = whiledl2branchbbImpl
				.pattern_whiledl2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, z, b, y, c, i, w, a, x,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[z] = " + z + ", " + "[b] = " + b + ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[i] = "
					+ i + ", " + "[w] = " + w + ", " + "[a] = " + a + ", " + "[x] = " + x + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whiledl2branchbbImpl.pattern_whiledl2branchbb_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whiledl2branchbbImpl
					.pattern_whiledl2branchbb_24_5_matchcorrcontext_blackFBBBB(i, w, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[0];
				Object[] result5_green = whiledl2branchbbImpl
						.pattern_whiledl2branchbb_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whiledl2branchbbImpl
						.pattern_whiledl2branchbb_24_6_createcorrespondence_blackBBBBBBBBB(z, b, y, c, i, w, a, x,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[z] = " + z + ", "
							+ "[b] = " + b + ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[i] = " + i + ", "
							+ "[w] = " + w + ", " + "[a] = " + a + ", " + "[x] = " + x + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				whiledl2branchbbImpl.pattern_whiledl2branchbb_24_6_createcorrespondence_greenBBFBBFBFBB(z, b, y, c, a,
						x, ccMatch);
				//nothing S2N b2y = (S2N) result6_green[2];
				//nothing S2B a2x = (S2B) result6_green[5];
				//nothing S2B c2z = (S2B) result6_green[7];

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
	public CSP isApplicable_solveCsp_CC(Branch z, Assignment b, Command y, While c, Branch i, While w, Decision a,
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
	public boolean checkDEC_FWD(Assignment b, While c, While w, Decision a) {// 
		Object[] result1_black = whiledl2branchbbImpl.pattern_whiledl2branchbb_27_1_matchtggpattern_blackBBBB(b, c, w,
				a);
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
	public boolean checkDEC_BWD(Branch z, Command y, Branch i, Branch x) {// 
		Object[] result1_black = whiledl2branchbbImpl.pattern_whiledl2branchbb_28_1_matchtggpattern_blackBBBB(z, y, i,
				x);
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
					.pattern_whiledl2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, w2i, i, w,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w2i] = " + w2i + ", " + "[i] = " + i
						+ ", " + "[w] = " + w + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whiledl2branchbbImpl.pattern_whiledl2branchbb_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whiledl2branchbbImpl.pattern_whiledl2branchbb_29_5_checknacs_blackBBB(w2i, i,
						w);
				if (result5_black != null) {

					Object[] result6_black = whiledl2branchbbImpl.pattern_whiledl2branchbb_29_6_perform_blackBBBB(w2i,
							i, w, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w2i] = " + w2i + ", "
								+ "[i] = " + i + ", " + "[w] = " + w + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whiledl2branchbbImpl.pattern_whiledl2branchbb_29_6_perform_greenFFFFFFBBFFFB(i, w, ruleResult);
					//nothing Branch z = (Branch) result6_green[0];
					//nothing Assignment b = (Assignment) result6_green[1];
					//nothing S2N b2y = (S2N) result6_green[2];
					//nothing Command y = (Command) result6_green[3];
					//nothing While c = (While) result6_green[4];
					//nothing S2B a2x = (S2B) result6_green[5];
					//nothing Decision a = (Decision) result6_green[8];
					//nothing S2B c2z = (S2B) result6_green[9];
					//nothing Branch x = (Branch) result6_green[10];

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
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_WHILE_WHILE_DECISION:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2),
					(While) arguments.get(3), (Decision) arguments.get(4));
		case RulesPackage.WHILEDL2BRANCHBB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_WHILE_WHILE_DECISION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4));
			return null;
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_WHILE_WHILE_DECISION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4));
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_S2B_ASSIGNMENT_WHILE_BRANCH_WHILE_DECISION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (Branch) arguments.get(4),
					(While) arguments.get(5), (Decision) arguments.get(6));
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
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPROPRIATE_BWD__MATCH_BRANCH_COMMAND_BRANCH_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.WHILEDL2BRANCHBB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_COMMAND_BRANCH_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4));
			return null;
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_COMMAND_BRANCH_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_S2B_COMMAND_BRANCH_WHILE_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (Command) arguments.get(3), (Branch) arguments.get(4),
					(While) arguments.get(5), (Branch) arguments.get(6));
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
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_87__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_87((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_87__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_87((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPLICABLE_SOLVE_CSP_CC__BRANCH_ASSIGNMENT_COMMAND_WHILE_BRANCH_WHILE_DECISION_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Branch) arguments.get(0), (Assignment) arguments.get(1),
					(Command) arguments.get(2), (While) arguments.get(3), (Branch) arguments.get(4),
					(While) arguments.get(5), (Decision) arguments.get(6), (Branch) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.WHILEDL2BRANCHBB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEDL2BRANCHBB___CHECK_DEC_FWD__ASSIGNMENT_WHILE_WHILE_DECISION:
			return checkDEC_FWD((Assignment) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Decision) arguments.get(3));
		case RulesPackage.WHILEDL2BRANCHBB___CHECK_DEC_BWD__BRANCH_COMMAND_BRANCH_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.WHILEDL2BRANCHBB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILEDL2BRANCHBB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_BRANCH_WHILE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Branch) arguments.get(2), (While) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILEDL2BRANCHBB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whiledl2branchbb_0_1_initialbindings_blackBBBBBB(whiledl2branchbb _this,
			Match match, Assignment b, While c, While w, Decision a) {
		if (!c.equals(w)) {
			return new Object[] { _this, match, b, c, w, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_0_2_SolveCSP_bindingFBBBBBB(whiledl2branchbb _this,
			Match match, Assignment b, While c, While w, Decision a) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, b, c, w, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, b, c, w, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledl2branchbb_0_2_SolveCSP_bindingAndBlackFBBBBBB(whiledl2branchbb _this,
			Match match, Assignment b, While c, While w, Decision a) {
		Object[] result_pattern_whiledl2branchbb_0_2_SolveCSP_binding = pattern_whiledl2branchbb_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, b, c, w, a);
		if (result_pattern_whiledl2branchbb_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledl2branchbb_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whiledl2branchbb_0_2_SolveCSP_black = pattern_whiledl2branchbb_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whiledl2branchbb_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, b, c, w, a };
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
			Assignment b, While c, While w, Decision a) {
		if (!c.equals(w)) {
			return new Object[] { match, b, c, w, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_0_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			Assignment b, While c, While w, Decision a) {
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(c);
		match.getToBeTranslatedNodes().add(a);
		String c__b____last_name_prime = "last";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(c__b____last);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		c__b____last.setName(c__b____last_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		return new Object[] { match, b, c, w, a, c__b____last, w__a____first, w__c____next };
	}

	public static final Object[] pattern_whiledl2branchbb_0_5_collectcontextelements_blackBBBBB(Match match,
			Assignment b, While c, While w, Decision a) {
		if (!c.equals(w)) {
			return new Object[] { match, b, c, w, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whiledl2branchbb_0_6_registerobjectstomatch_expressionBBBBBB(
			whiledl2branchbb _this, Match match, Assignment b, While c, While w, Decision a) {
		_this.registerObjectsToMatch_FWD(match, b, c, w, a);

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
		EObject _localVariable_2 = isApplicableMatch.getObject("c");
		EObject _localVariable_3 = isApplicableMatch.getObject("i");
		EObject _localVariable_4 = isApplicableMatch.getObject("w");
		EObject _localVariable_5 = isApplicableMatch.getObject("a");
		EObject tmpW2i = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpI = _localVariable_3;
		EObject tmpW = _localVariable_4;
		EObject tmpA = _localVariable_5;
		if (tmpW2i instanceof S2B) {
			S2B w2i = (S2B) tmpW2i;
			if (tmpB instanceof Assignment) {
				Assignment b = (Assignment) tmpB;
				if (tmpC instanceof While) {
					While c = (While) tmpC;
					if (tmpI instanceof Branch) {
						Branch i = (Branch) tmpI;
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							if (tmpA instanceof Decision) {
								Decision a = (Decision) tmpA;
								return new Object[] { w2i, b, c, i, w, a, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_1_1_performtransformation_blackBBBBBBFBB(S2B w2i,
			Assignment b, While c, Branch i, While w, Decision a, whiledl2branchbb _this,
			IsApplicableMatch isApplicableMatch) {
		if (!c.equals(w)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { w2i, b, c, i, w, a, csp, _this, isApplicableMatch };
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
			While c = (While) result_pattern_whiledl2branchbb_1_1_performtransformation_binding[2];
			Branch i = (Branch) result_pattern_whiledl2branchbb_1_1_performtransformation_binding[3];
			While w = (While) result_pattern_whiledl2branchbb_1_1_performtransformation_binding[4];
			Decision a = (Decision) result_pattern_whiledl2branchbb_1_1_performtransformation_binding[5];

			Object[] result_pattern_whiledl2branchbb_1_1_performtransformation_black = pattern_whiledl2branchbb_1_1_performtransformation_blackBBBBBBFBB(
					w2i, b, c, i, w, a, _this, isApplicableMatch);
			if (result_pattern_whiledl2branchbb_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whiledl2branchbb_1_1_performtransformation_black[6];

				return new Object[] { w2i, b, c, i, w, a, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_1_1_performtransformation_greenFBFFBFBBFF(Assignment b,
			While c, Branch i, Decision a) {
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		i.setNegative(z);
		b2y.setSource(b);
		b2y.setTarget(y);
		y.setNext(z);
		a2x.setSource(a);
		c2z.setSource(c);
		c2z.setTarget(z);
		i.setPositive(x);
		a2x.setTarget(x);
		return new Object[] { z, b, b2y, y, c, a2x, i, a, c2z, x };
	}

	public static final Object[] pattern_whiledl2branchbb_1_2_collecttranslatedelements_blackBBBBBBBBB(Branch z,
			Assignment b, S2N b2y, Command y, While c, S2B a2x, Decision a, S2B c2z, Branch x) {
		if (!a2x.equals(c2z)) {
			if (!x.equals(z)) {
				return new Object[] { z, b, b2y, y, c, a2x, a, c2z, x };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_1_2_collecttranslatedelements_greenFBBBBBBBBB(Branch z,
			Assignment b, S2N b2y, Command y, While c, S2B a2x, Decision a, S2B c2z, Branch x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(z);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedElements().add(x);
		return new Object[] { ruleresult, z, b, b2y, y, c, a2x, a, c2z, x };
	}

	public static final Object[] pattern_whiledl2branchbb_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject z, EObject w2i, EObject b, EObject b2y, EObject y, EObject c,
			EObject a2x, EObject i, EObject w, EObject a, EObject c2z, EObject x) {
		if (!w2i.equals(z)) {
			if (!w2i.equals(y)) {
				if (!w2i.equals(x)) {
					if (!b.equals(z)) {
						if (!b.equals(w2i)) {
							if (!b.equals(b2y)) {
								if (!b.equals(y)) {
									if (!b.equals(c)) {
										if (!b.equals(i)) {
											if (!b.equals(w)) {
												if (!b.equals(c2z)) {
													if (!b.equals(x)) {
														if (!b2y.equals(z)) {
															if (!b2y.equals(w2i)) {
																if (!b2y.equals(y)) {
																	if (!b2y.equals(c)) {
																		if (!b2y.equals(i)) {
																			if (!b2y.equals(w)) {
																				if (!b2y.equals(c2z)) {
																					if (!b2y.equals(x)) {
																						if (!y.equals(z)) {
																							if (!c.equals(z)) {
																								if (!c.equals(w2i)) {
																									if (!c.equals(y)) {
																										if (!c.equals(
																												i)) {
																											if (!c.equals(
																													w)) {
																												if (!c.equals(
																														c2z)) {
																													if (!c.equals(
																															x)) {
																														if (!a2x.equals(
																																z)) {
																															if (!a2x.equals(
																																	w2i)) {
																																if (!a2x.equals(
																																		b)) {
																																	if (!a2x.equals(
																																			b2y)) {
																																		if (!a2x.equals(
																																				y)) {
																																			if (!a2x.equals(
																																					c)) {
																																				if (!a2x.equals(
																																						i)) {
																																					if (!a2x.equals(
																																							w)) {
																																						if (!a2x.equals(
																																								c2z)) {
																																							if (!a2x.equals(
																																									x)) {
																																								if (!i.equals(
																																										z)) {
																																									if (!i.equals(
																																											w2i)) {
																																										if (!i.equals(
																																												y)) {
																																											if (!i.equals(
																																													w)) {
																																												if (!i.equals(
																																														x)) {
																																													if (!w.equals(
																																															z)) {
																																														if (!w.equals(
																																																w2i)) {
																																															if (!w.equals(
																																																	y)) {
																																																if (!w.equals(
																																																		x)) {
																																																	if (!a.equals(
																																																			z)) {
																																																		if (!a.equals(
																																																				w2i)) {
																																																			if (!a.equals(
																																																					b)) {
																																																				if (!a.equals(
																																																						b2y)) {
																																																					if (!a.equals(
																																																							y)) {
																																																						if (!a.equals(
																																																								c)) {
																																																							if (!a.equals(
																																																									a2x)) {
																																																								if (!a.equals(
																																																										i)) {
																																																									if (!a.equals(
																																																											w)) {
																																																										if (!a.equals(
																																																												c2z)) {
																																																											if (!a.equals(
																																																													x)) {
																																																												if (!c2z.equals(
																																																														z)) {
																																																													if (!c2z.equals(
																																																															w2i)) {
																																																														if (!c2z.equals(
																																																																y)) {
																																																															if (!c2z.equals(
																																																																	i)) {
																																																																if (!c2z.equals(
																																																																		w)) {
																																																																	if (!c2z.equals(
																																																																			x)) {
																																																																		if (!x.equals(
																																																																				z)) {
																																																																			if (!x.equals(
																																																																					y)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						z,
																																																																						w2i,
																																																																						b,
																																																																						b2y,
																																																																						y,
																																																																						c,
																																																																						a2x,
																																																																						i,
																																																																						w,
																																																																						a,
																																																																						c2z,
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

	public static final Object[] pattern_whiledl2branchbb_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject z, EObject b, EObject b2y, EObject y, EObject c, EObject a2x,
			EObject i, EObject w, EObject a, EObject c2z, EObject x) {
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whiledl2branchbb";
		String b2y__b____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String c__b____last_name_prime = "last";
		String y__z____next_name_prime = "next";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String a2x__a____source_name_prime = "source";
		String c2z__c____source_name_prime = "source";
		String c2z__z____target_name_prime = "target";
		String a2x__x____target_name_prime = "target";
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(c__b____last);
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		ruleresult.getCreatedEdges().add(y__z____next);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		y__z____next.setName(y__z____next_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		return new Object[] { ruleresult, z, b, b2y, y, c, a2x, i, w, a, c2z, x, b2y__b____source, b2y__y____target,
				c__b____last, y__z____next, i__z____negative, i__x____positive, w__a____first, w__c____next,
				a2x__a____source, c2z__c____source, c2z__z____target, a2x__x____target };
	}

	public static final void pattern_whiledl2branchbb_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whiledl2branchbb _this, PerformRuleResult ruleresult, EObject z, EObject w2i, EObject b, EObject b2y,
			EObject y, EObject c, EObject a2x, EObject i, EObject w, EObject a, EObject c2z, EObject x) {
		_this.registerObjects_FWD(ruleresult, z, w2i, b, b2y, y, c, a2x, i, w, a, c2z, x);

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
		EObject _localVariable_1 = match.getObject("c");
		EObject _localVariable_2 = match.getObject("w");
		EObject _localVariable_3 = match.getObject("a");
		EObject tmpB = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpA = _localVariable_3;
		if (tmpB instanceof Assignment) {
			Assignment b = (Assignment) tmpB;
			if (tmpC instanceof While) {
				While c = (While) tmpC;
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					if (tmpA instanceof Decision) {
						Decision a = (Decision) tmpA;
						return new Object[] { b, c, w, a, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiledl2branchbb_2_2_corematch_blackFBBFBBB(Assignment b, While c,
			While w, Decision a, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(w)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				Branch i = w2i.getTarget();
				if (i != null) {
					_result.add(new Object[] { w2i, b, c, i, w, a, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whiledl2branchbb_2_3_findcontext_blackBBBBBB(S2B w2i, Assignment b,
			While c, Branch i, While w, Decision a) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(w)) {
			if (b.equals(c.getLast())) {
				if (a.equals(w.getFirst())) {
					if (c.equals(w.getNext())) {
						if (w.equals(w2i.getSource())) {
							if (i.equals(w2i.getTarget())) {
								_result.add(new Object[] { w2i, b, c, i, w, a });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whiledl2branchbb_2_3_findcontext_greenBBBBBBFFFFFF(S2B w2i, Assignment b,
			While c, Branch i, While w, Decision a) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c__b____last_name_prime = "last";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String w2i__w____source_name_prime = "source";
		String w2i__i____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(a);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(c__b____last);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		c__b____last.setName(c__b____last_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		return new Object[] { w2i, b, c, i, w, a, isApplicableMatch, c__b____last, w__a____first, w__c____next,
				w2i__w____source, w2i__i____target };
	}

	public static final Object[] pattern_whiledl2branchbb_2_4_solveCSP_bindingFBBBBBBBB(whiledl2branchbb _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, Assignment b, While c, Branch i, While w, Decision a) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, w2i, b, c, i, w, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w2i, b, c, i, w, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledl2branchbb_2_4_solveCSP_bindingAndBlackFBBBBBBBB(whiledl2branchbb _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, Assignment b, While c, Branch i, While w, Decision a) {
		Object[] result_pattern_whiledl2branchbb_2_4_solveCSP_binding = pattern_whiledl2branchbb_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, w2i, b, c, i, w, a);
		if (result_pattern_whiledl2branchbb_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledl2branchbb_2_4_solveCSP_binding[0];

			Object[] result_pattern_whiledl2branchbb_2_4_solveCSP_black = pattern_whiledl2branchbb_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whiledl2branchbb_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w2i, b, c, i, w, a };
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
			Match match, Branch z, Command y, Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					return new Object[] { _this, match, z, y, i, x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_10_2_SolveCSP_bindingFBBBBBB(whiledl2branchbb _this,
			Match match, Branch z, Command y, Branch i, Branch x) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, z, y, i, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, z, y, i, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledl2branchbb_10_2_SolveCSP_bindingAndBlackFBBBBBB(whiledl2branchbb _this,
			Match match, Branch z, Command y, Branch i, Branch x) {
		Object[] result_pattern_whiledl2branchbb_10_2_SolveCSP_binding = pattern_whiledl2branchbb_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, z, y, i, x);
		if (result_pattern_whiledl2branchbb_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledl2branchbb_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whiledl2branchbb_10_2_SolveCSP_black = pattern_whiledl2branchbb_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whiledl2branchbb_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, z, y, i, x };
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
			Branch z, Command y, Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					return new Object[] { match, z, y, i, x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_10_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			Branch z, Command y, Branch i, Branch x) {
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(x);
		String y__z____next_name_prime = "next";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		match.getToBeTranslatedEdges().add(y__z____next);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		y__z____next.setName(y__z____next_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		return new Object[] { match, z, y, i, x, y__z____next, i__z____negative, i__x____positive };
	}

	public static final Object[] pattern_whiledl2branchbb_10_5_collectcontextelements_blackBBBBB(Match match, Branch z,
			Command y, Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					return new Object[] { match, z, y, i, x };
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
			whiledl2branchbb _this, Match match, Branch z, Command y, Branch i, Branch x) {
		_this.registerObjectsToMatch_BWD(match, z, y, i, x);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("z");
		EObject _localVariable_1 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_2 = isApplicableMatch.getObject("y");
		EObject _localVariable_3 = isApplicableMatch.getObject("i");
		EObject _localVariable_4 = isApplicableMatch.getObject("w");
		EObject _localVariable_5 = isApplicableMatch.getObject("x");
		EObject tmpZ = _localVariable_0;
		EObject tmpW2i = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpI = _localVariable_3;
		EObject tmpW = _localVariable_4;
		EObject tmpX = _localVariable_5;
		if (tmpZ instanceof Branch) {
			Branch z = (Branch) tmpZ;
			if (tmpW2i instanceof S2B) {
				S2B w2i = (S2B) tmpW2i;
				if (tmpY instanceof Command) {
					Command y = (Command) tmpY;
					if (tmpI instanceof Branch) {
						Branch i = (Branch) tmpI;
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							if (tmpX instanceof Branch) {
								Branch x = (Branch) tmpX;
								return new Object[] { z, w2i, y, i, w, x, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_11_1_performtransformation_blackBBBBBBFBB(Branch z, S2B w2i,
			Command y, Branch i, While w, Branch x, whiledl2branchbb _this, IsApplicableMatch isApplicableMatch) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { z, w2i, y, i, w, x, csp, _this, isApplicableMatch };
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
			Branch z = (Branch) result_pattern_whiledl2branchbb_11_1_performtransformation_binding[0];
			S2B w2i = (S2B) result_pattern_whiledl2branchbb_11_1_performtransformation_binding[1];
			Command y = (Command) result_pattern_whiledl2branchbb_11_1_performtransformation_binding[2];
			Branch i = (Branch) result_pattern_whiledl2branchbb_11_1_performtransformation_binding[3];
			While w = (While) result_pattern_whiledl2branchbb_11_1_performtransformation_binding[4];
			Branch x = (Branch) result_pattern_whiledl2branchbb_11_1_performtransformation_binding[5];

			Object[] result_pattern_whiledl2branchbb_11_1_performtransformation_black = pattern_whiledl2branchbb_11_1_performtransformation_blackBBBBBBFBB(
					z, w2i, y, i, w, x, _this, isApplicableMatch);
			if (result_pattern_whiledl2branchbb_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whiledl2branchbb_11_1_performtransformation_black[6];

				return new Object[] { z, w2i, y, i, w, x, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_11_1_performtransformation_greenBFFBFFBFFB(Branch z,
			Command y, While w, Branch x) {
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		b2y.setSource(b);
		b2y.setTarget(y);
		c.setLast(b);
		w.setNext(c);
		a2x.setTarget(x);
		w.setFirst(a);
		a2x.setSource(a);
		c2z.setSource(c);
		c2z.setTarget(z);
		return new Object[] { z, b, b2y, y, c, a2x, w, a, c2z, x };
	}

	public static final Object[] pattern_whiledl2branchbb_11_2_collecttranslatedelements_blackBBBBBBBBB(Branch z,
			Assignment b, S2N b2y, Command y, While c, S2B a2x, Decision a, S2B c2z, Branch x) {
		if (!a2x.equals(c2z)) {
			if (!x.equals(z)) {
				return new Object[] { z, b, b2y, y, c, a2x, a, c2z, x };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_11_2_collecttranslatedelements_greenFBBBBBBBBB(Branch z,
			Assignment b, S2N b2y, Command y, While c, S2B a2x, Decision a, S2B c2z, Branch x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getTranslatedElements().add(x);
		return new Object[] { ruleresult, z, b, b2y, y, c, a2x, a, c2z, x };
	}

	public static final Object[] pattern_whiledl2branchbb_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject z, EObject w2i, EObject b, EObject b2y, EObject y, EObject c,
			EObject a2x, EObject i, EObject w, EObject a, EObject c2z, EObject x) {
		if (!w2i.equals(z)) {
			if (!w2i.equals(y)) {
				if (!w2i.equals(x)) {
					if (!b.equals(z)) {
						if (!b.equals(w2i)) {
							if (!b.equals(b2y)) {
								if (!b.equals(y)) {
									if (!b.equals(c)) {
										if (!b.equals(i)) {
											if (!b.equals(w)) {
												if (!b.equals(c2z)) {
													if (!b.equals(x)) {
														if (!b2y.equals(z)) {
															if (!b2y.equals(w2i)) {
																if (!b2y.equals(y)) {
																	if (!b2y.equals(c)) {
																		if (!b2y.equals(i)) {
																			if (!b2y.equals(w)) {
																				if (!b2y.equals(c2z)) {
																					if (!b2y.equals(x)) {
																						if (!y.equals(z)) {
																							if (!c.equals(z)) {
																								if (!c.equals(w2i)) {
																									if (!c.equals(y)) {
																										if (!c.equals(
																												i)) {
																											if (!c.equals(
																													w)) {
																												if (!c.equals(
																														c2z)) {
																													if (!c.equals(
																															x)) {
																														if (!a2x.equals(
																																z)) {
																															if (!a2x.equals(
																																	w2i)) {
																																if (!a2x.equals(
																																		b)) {
																																	if (!a2x.equals(
																																			b2y)) {
																																		if (!a2x.equals(
																																				y)) {
																																			if (!a2x.equals(
																																					c)) {
																																				if (!a2x.equals(
																																						i)) {
																																					if (!a2x.equals(
																																							w)) {
																																						if (!a2x.equals(
																																								c2z)) {
																																							if (!a2x.equals(
																																									x)) {
																																								if (!i.equals(
																																										z)) {
																																									if (!i.equals(
																																											w2i)) {
																																										if (!i.equals(
																																												y)) {
																																											if (!i.equals(
																																													w)) {
																																												if (!i.equals(
																																														x)) {
																																													if (!w.equals(
																																															z)) {
																																														if (!w.equals(
																																																w2i)) {
																																															if (!w.equals(
																																																	y)) {
																																																if (!w.equals(
																																																		x)) {
																																																	if (!a.equals(
																																																			z)) {
																																																		if (!a.equals(
																																																				w2i)) {
																																																			if (!a.equals(
																																																					b)) {
																																																				if (!a.equals(
																																																						b2y)) {
																																																					if (!a.equals(
																																																							y)) {
																																																						if (!a.equals(
																																																								c)) {
																																																							if (!a.equals(
																																																									a2x)) {
																																																								if (!a.equals(
																																																										i)) {
																																																									if (!a.equals(
																																																											w)) {
																																																										if (!a.equals(
																																																												c2z)) {
																																																											if (!a.equals(
																																																													x)) {
																																																												if (!c2z.equals(
																																																														z)) {
																																																													if (!c2z.equals(
																																																															w2i)) {
																																																														if (!c2z.equals(
																																																																y)) {
																																																															if (!c2z.equals(
																																																																	i)) {
																																																																if (!c2z.equals(
																																																																		w)) {
																																																																	if (!c2z.equals(
																																																																			x)) {
																																																																		if (!x.equals(
																																																																				z)) {
																																																																			if (!x.equals(
																																																																					y)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						z,
																																																																						w2i,
																																																																						b,
																																																																						b2y,
																																																																						y,
																																																																						c,
																																																																						a2x,
																																																																						i,
																																																																						w,
																																																																						a,
																																																																						c2z,
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

	public static final Object[] pattern_whiledl2branchbb_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject z, EObject b, EObject b2y, EObject y, EObject c, EObject a2x,
			EObject i, EObject w, EObject a, EObject c2z, EObject x) {
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whiledl2branchbb";
		String b2y__b____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String c__b____last_name_prime = "last";
		String y__z____next_name_prime = "next";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String a2x__a____source_name_prime = "source";
		String c2z__c____source_name_prime = "source";
		String c2z__z____target_name_prime = "target";
		String a2x__x____target_name_prime = "target";
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(c__b____last);
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		ruleresult.getTranslatedEdges().add(y__z____next);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		y__z____next.setName(y__z____next_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		return new Object[] { ruleresult, z, b, b2y, y, c, a2x, i, w, a, c2z, x, b2y__b____source, b2y__y____target,
				c__b____last, y__z____next, i__z____negative, i__x____positive, w__a____first, w__c____next,
				a2x__a____source, c2z__c____source, c2z__z____target, a2x__x____target };
	}

	public static final void pattern_whiledl2branchbb_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whiledl2branchbb _this, PerformRuleResult ruleresult, EObject z, EObject w2i, EObject b, EObject b2y,
			EObject y, EObject c, EObject a2x, EObject i, EObject w, EObject a, EObject c2z, EObject x) {
		_this.registerObjects_BWD(ruleresult, z, w2i, b, b2y, y, c, a2x, i, w, a, c2z, x);

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
		EObject _localVariable_1 = match.getObject("y");
		EObject _localVariable_2 = match.getObject("i");
		EObject _localVariable_3 = match.getObject("x");
		EObject tmpZ = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpI = _localVariable_2;
		EObject tmpX = _localVariable_3;
		if (tmpZ instanceof Branch) {
			Branch z = (Branch) tmpZ;
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (tmpI instanceof Branch) {
					Branch i = (Branch) tmpI;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						return new Object[] { z, y, i, x, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiledl2branchbb_12_2_corematch_blackBFBBFBB(Branch z, Command y,
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
							_result.add(new Object[] { z, w2i, y, i, w, x, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whiledl2branchbb_12_3_findcontext_blackBBBBBB(Branch z, S2B w2i,
			Command y, Branch i, While w, Branch x) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					if (z.equals(y.getNext())) {
						if (z.equals(i.getNegative())) {
							if (x.equals(i.getPositive())) {
								if (w.equals(w2i.getSource())) {
									if (i.equals(w2i.getTarget())) {
										_result.add(new Object[] { z, w2i, y, i, w, x });
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

	public static final Object[] pattern_whiledl2branchbb_12_3_findcontext_greenBBBBBBFFFFFF(Branch z, S2B w2i,
			Command y, Branch i, While w, Branch x) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String y__z____next_name_prime = "next";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String w2i__w____source_name_prime = "source";
		String w2i__i____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(x);
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		isApplicableMatch.getAllContextElements().add(y__z____next);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		y__z____next.setName(y__z____next_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		return new Object[] { z, w2i, y, i, w, x, isApplicableMatch, y__z____next, i__z____negative, i__x____positive,
				w2i__w____source, w2i__i____target };
	}

	public static final Object[] pattern_whiledl2branchbb_12_4_solveCSP_bindingFBBBBBBBB(whiledl2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch z, S2B w2i, Command y, Branch i, While w, Branch x) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, z, w2i, y, i, w, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, z, w2i, y, i, w, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledl2branchbb_12_4_solveCSP_bindingAndBlackFBBBBBBBB(whiledl2branchbb _this,
			IsApplicableMatch isApplicableMatch, Branch z, S2B w2i, Command y, Branch i, While w, Branch x) {
		Object[] result_pattern_whiledl2branchbb_12_4_solveCSP_binding = pattern_whiledl2branchbb_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, z, w2i, y, i, w, x);
		if (result_pattern_whiledl2branchbb_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledl2branchbb_12_4_solveCSP_binding[0];

			Object[] result_pattern_whiledl2branchbb_12_4_solveCSP_black = pattern_whiledl2branchbb_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whiledl2branchbb_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, z, w2i, y, i, w, x };
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
		for (Graph __DEC_z_root_800833 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_1BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_positive_326687 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_326687)) {
							if (!i.equals(__DEC_z_positive_326687)) {
								if (!x.equals(__DEC_z_positive_326687)) {
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

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_2BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_negative_933644 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_933644)) {
							if (!i.equals(__DEC_z_negative_933644)) {
								if (!x.equals(__DEC_z_negative_933644)) {
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

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_880054 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_4BBBB(Command y, Branch z,
			Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_positive_703852 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!z.equals(__DEC_y_positive_703852)) {
							if (!i.equals(__DEC_y_positive_703852)) {
								if (!x.equals(__DEC_y_positive_703852)) {
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

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_5BBBB(Command y, Branch z,
			Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_negative_943289 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!z.equals(__DEC_y_negative_943289)) {
							if (!i.equals(__DEC_y_negative_943289)) {
								if (!x.equals(__DEC_y_negative_943289)) {
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

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_664431 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_7BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_152887 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_152887)) {
							if (!z.equals(__DEC_x_positive_152887)) {
								if (!i.equals(__DEC_x_positive_152887)) {
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

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_8BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_821221 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_821221)) {
							if (!z.equals(__DEC_x_negative_821221)) {
								if (!i.equals(__DEC_x_negative_821221)) {
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

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_9BB(Branch z, Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_10BB(Branch i,
			Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_11BB(Branch x,
			Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_12BB(Branch z,
			Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_13BB(Branch i,
			Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_14BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_15BB(Branch z, Branch x) {
		if (x.equals(z.getPositive())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_16BB(Branch z, Branch x) {
		if (x.equals(z.getNegative())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_17BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
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
					if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_3B(y) == null) {
						if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_0B(z) == null) {
							if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_9BB(z, y) == null) {
								if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_12BB(z, y) == null) {
									for (Branch i : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(z, Branch.class, "negative")) {
										if (!i.equals(z)) {
											Node tmpX = i.getPositive();
											if (tmpX instanceof Branch) {
												Branch x = (Branch) tmpX;
												if (!i.equals(x)) {
													if (!x.equals(z)) {
														if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_10BB(
																i, y) == null) {
															if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_13BB(
																	i, y) == null) {
																if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_1BBB(
																		z, i, x) == null) {
																	if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_2BBB(
																			z, i, x) == null) {
																		if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_4BBBB(
																				y, z, i, x) == null) {
																			if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_5BBBB(
																					y, z, i, x) == null) {
																				if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_6B(
																						x) == null) {
																					if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_7BBB(
																							x, z, i) == null) {
																						if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_8BBB(
																								x, z, i) == null) {
																							if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_11BB(
																									x, y) == null) {
																								if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_14BB(
																										x, y) == null) {
																									if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_15BB(
																											z,
																											x) == null) {
																										if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_16BB(
																												z,
																												x) == null) {
																											if (pattern_whiledl2branchbb_20_2_testcorematchandDECs_black_nac_17BB(
																													i,
																													x) == null) {
																												_result.add(
																														new Object[] {
																																z,
																																y,
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

	public static final Object[] pattern_whiledl2branchbb_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whiledl2branchbb_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			whiledl2branchbb _this, Match match, Branch z, Command y, Branch i, Branch x) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, z, y, i, x);
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
		for (Decision __DEC_b_positive_64252 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_b_positive_64252)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_1BB(Assignment b,
			Decision a) {
		for (Decision __DEC_b_negative_773620 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_b_negative_773620)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_2BBB(Assignment b,
			While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_b_first_556805 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!c.equals(__DEC_b_first_556805)) {
					if (!w.equals(__DEC_b_first_556805)) {
						return new Object[] { b, c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_3BBB(Assignment b,
			While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_b_last_551231 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!c.equals(__DEC_b_last_551231)) {
					if (!w.equals(__DEC_b_last_551231)) {
						return new Object[] { b, c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_4B(Assignment b) {
		for (Program __DEC_b_first_600131 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_5BB(While c, Decision a) {
		for (Decision __DEC_c_positive_36748 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_c_positive_36748)) {
				return new Object[] { c, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_6BB(While c, Decision a) {
		for (Decision __DEC_c_negative_583524 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_c_negative_583524)) {
				return new Object[] { c, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_7BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_first_190082 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!c.equals(__DEC_c_first_190082)) {
					if (!w.equals(__DEC_c_first_190082)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_8BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_last_863104 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!c.equals(__DEC_c_last_863104)) {
					if (!w.equals(__DEC_c_last_863104)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_9B(While c) {
		for (Program __DEC_c_first_529620 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_10B(Decision a) {
		for (Decision __DEC_a_positive_635250 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_a_positive_635250)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_11B(Decision a) {
		for (Decision __DEC_a_negative_545284 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_a_negative_545284)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_12BBB(Decision a, While c,
			While w) {
		if (!c.equals(w)) {
			for (While __DEC_a_last_180120 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!c.equals(__DEC_a_last_180120)) {
					if (!w.equals(__DEC_a_last_180120)) {
						return new Object[] { a, c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_13B(Decision a) {
		for (Program __DEC_a_first_236670 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
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

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_16BB(While c,
			Assignment b) {
		if (b.equals(c.getFirst())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_17BB(While w,
			Assignment b) {
		if (b.equals(w.getFirst())) {
			return new Object[] { w, b };
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

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_19BB(Decision a,
			While c) {
		if (c.equals(a.getPositive())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_20BB(Decision a,
			While c) {
		if (c.equals(a.getNegative())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_21BB(While c,
			Decision a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_22BB(While w,
			Decision a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiledl2branchbb_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_last) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpC = _edge_last.getSrc();
		if (tmpC instanceof While) {
			While c = (While) tmpC;
			EObject tmpB = _edge_last.getTrg();
			if (tmpB instanceof Assignment) {
				Assignment b = (Assignment) tmpB;
				if (b.equals(c.getLast())) {
					if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_9B(c) == null) {
						if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_4B(b) == null) {
							if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_16BB(c, b) == null) {
								for (Statement tmpW : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(c, Statement.class, "next")) {
									if (tmpW instanceof While) {
										While w = (While) tmpW;
										if (!c.equals(w)) {
											Statement tmpA = w.getFirst();
											if (tmpA instanceof Decision) {
												Decision a = (Decision) tmpA;
												if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_2BBB(b,
														c, w) == null) {
													if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_3BBB(
															b, c, w) == null) {
														if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_7BB(
																c, w) == null) {
															if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_8BB(
																	c, w) == null) {
																if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_17BB(
																		w, b) == null) {
																	if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_18BB(
																			w, b) == null) {
																		if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_0BB(
																				b, a) == null) {
																			if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_1BB(
																					b, a) == null) {
																				if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_5BB(
																						c, a) == null) {
																					if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_6BB(
																							c, a) == null) {
																						if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_10B(
																								a) == null) {
																							if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_11B(
																									a) == null) {
																								if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_12BBB(
																										a, c,
																										w) == null) {
																									if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_13B(
																											a) == null) {
																										if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_14BB(
																												a,
																												b) == null) {
																											if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_15BB(
																													a,
																													b) == null) {
																												if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_19BB(
																														a,
																														c) == null) {
																													if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_20BB(
																															a,
																															c) == null) {
																														if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_21BB(
																																c,
																																a) == null) {
																															if (pattern_whiledl2branchbb_21_2_testcorematchandDECs_black_nac_22BB(
																																	w,
																																	a) == null) {
																																_result.add(
																																		new Object[] {
																																				b,
																																				c,
																																				w,
																																				a,
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

	public static final Object[] pattern_whiledl2branchbb_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whiledl2branchbb_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			whiledl2branchbb _this, Match match, Assignment b, While c, While w, Decision a) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, b, c, w, a);
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

	public static final Object[] pattern_whiledl2branchbb_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("z");
		EObject _localVariable_1 = sourceMatch.getObject("b");
		EObject _localVariable_2 = targetMatch.getObject("y");
		EObject _localVariable_3 = sourceMatch.getObject("c");
		EObject _localVariable_4 = targetMatch.getObject("i");
		EObject _localVariable_5 = sourceMatch.getObject("w");
		EObject _localVariable_6 = sourceMatch.getObject("a");
		EObject _localVariable_7 = targetMatch.getObject("x");
		EObject tmpZ = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpI = _localVariable_4;
		EObject tmpW = _localVariable_5;
		EObject tmpA = _localVariable_6;
		EObject tmpX = _localVariable_7;
		if (tmpZ instanceof Branch) {
			Branch z = (Branch) tmpZ;
			if (tmpB instanceof Assignment) {
				Assignment b = (Assignment) tmpB;
				if (tmpY instanceof Command) {
					Command y = (Command) tmpY;
					if (tmpC instanceof While) {
						While c = (While) tmpC;
						if (tmpI instanceof Branch) {
							Branch i = (Branch) tmpI;
							if (tmpW instanceof While) {
								While w = (While) tmpW;
								if (tmpA instanceof Decision) {
									Decision a = (Decision) tmpA;
									if (tmpX instanceof Branch) {
										Branch x = (Branch) tmpX;
										return new Object[] { z, b, y, c, i, w, a, x, targetMatch, sourceMatch };
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

	public static final Object[] pattern_whiledl2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Branch z,
			Assignment b, Command y, While c, Branch i, While w, Decision a, Branch x, Match sourceMatch,
			Match targetMatch) {
		if (!c.equals(w)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					if (!x.equals(z)) {
						if (!sourceMatch.equals(targetMatch)) {
							return new Object[] { z, b, y, c, i, w, a, x, sourceMatch, targetMatch };
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
				targetMatch, sourceMatch);
		if (result_pattern_whiledl2branchbb_24_2_matchsrctrgcontext_binding != null) {
			Branch z = (Branch) result_pattern_whiledl2branchbb_24_2_matchsrctrgcontext_binding[0];
			Assignment b = (Assignment) result_pattern_whiledl2branchbb_24_2_matchsrctrgcontext_binding[1];
			Command y = (Command) result_pattern_whiledl2branchbb_24_2_matchsrctrgcontext_binding[2];
			While c = (While) result_pattern_whiledl2branchbb_24_2_matchsrctrgcontext_binding[3];
			Branch i = (Branch) result_pattern_whiledl2branchbb_24_2_matchsrctrgcontext_binding[4];
			While w = (While) result_pattern_whiledl2branchbb_24_2_matchsrctrgcontext_binding[5];
			Decision a = (Decision) result_pattern_whiledl2branchbb_24_2_matchsrctrgcontext_binding[6];
			Branch x = (Branch) result_pattern_whiledl2branchbb_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_whiledl2branchbb_24_2_matchsrctrgcontext_black = pattern_whiledl2branchbb_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					z, b, y, c, i, w, a, x, sourceMatch, targetMatch);
			if (result_pattern_whiledl2branchbb_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { z, b, y, c, i, w, a, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBB(whiledl2branchbb _this,
			Branch z, Assignment b, Command y, While c, Branch i, While w, Decision a, Branch x, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(z, b, y, c, i, w, a, x, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, z, b, y, c, i, w, a, x, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledl2branchbb_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			whiledl2branchbb _this, Branch z, Assignment b, Command y, While c, Branch i, While w, Decision a, Branch x,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whiledl2branchbb_24_3_solvecsp_binding = pattern_whiledl2branchbb_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, z, b, y, c, i, w, a, x, sourceMatch, targetMatch);
		if (result_pattern_whiledl2branchbb_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whiledl2branchbb_24_3_solvecsp_binding[0];

			Object[] result_pattern_whiledl2branchbb_24_3_solvecsp_black = pattern_whiledl2branchbb_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whiledl2branchbb_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, z, b, y, c, i, w, a, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whiledl2branchbb_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whiledl2branchbb_24_5_matchcorrcontext_blackFBBBB(Branch i, While w,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				if (i.equals(w2i.getTarget())) {
					_result.add(new Object[] { w2i, i, w, sourceMatch, targetMatch });
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

	public static final Object[] pattern_whiledl2branchbb_24_6_createcorrespondence_blackBBBBBBBBB(Branch z,
			Assignment b, Command y, While c, Branch i, While w, Decision a, Branch x, CCMatch ccMatch) {
		if (!c.equals(w)) {
			if (!i.equals(z)) {
				if (!i.equals(x)) {
					if (!x.equals(z)) {
						return new Object[] { z, b, y, c, i, w, a, x, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_24_6_createcorrespondence_greenBBFBBFBFBB(Branch z,
			Assignment b, Command y, While c, Decision a, Branch x, CCMatch ccMatch) {
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		b2y.setSource(b);
		b2y.setTarget(y);
		ccMatch.getCreateCorr().add(b2y);
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		c2z.setSource(c);
		c2z.setTarget(z);
		ccMatch.getCreateCorr().add(c2z);
		return new Object[] { z, b, b2y, y, c, a2x, a, c2z, x, ccMatch };
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
		for (Decision __DEC_b_positive_132750 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_b_positive_132750)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_1BB(Assignment b, Decision a) {
		for (Decision __DEC_b_negative_438336 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_b_negative_438336)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_2BBB(Assignment b, While c,
			While w) {
		if (!c.equals(w)) {
			for (While __DEC_b_first_274919 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!c.equals(__DEC_b_first_274919)) {
					if (!w.equals(__DEC_b_first_274919)) {
						return new Object[] { b, c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_3BBB(Assignment b, While c,
			While w) {
		if (!c.equals(w)) {
			for (While __DEC_b_last_419134 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!c.equals(__DEC_b_last_419134)) {
					if (!w.equals(__DEC_b_last_419134)) {
						return new Object[] { b, c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_4B(Assignment b) {
		for (Program __DEC_b_first_516980 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_5BB(While c, Decision a) {
		for (Decision __DEC_c_positive_489254 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_c_positive_489254)) {
				return new Object[] { c, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_6BB(While c, Decision a) {
		for (Decision __DEC_c_negative_790910 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_c_negative_790910)) {
				return new Object[] { c, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_7BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_first_646232 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!c.equals(__DEC_c_first_646232)) {
					if (!w.equals(__DEC_c_first_646232)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_8BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_last_451618 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!c.equals(__DEC_c_last_451618)) {
					if (!w.equals(__DEC_c_last_451618)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_9B(While c) {
		for (Program __DEC_c_first_154664 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_10B(Decision a) {
		for (Decision __DEC_a_positive_554263 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_a_positive_554263)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_11B(Decision a) {
		for (Decision __DEC_a_negative_789063 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_a_negative_789063)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_12BBB(Decision a, While c,
			While w) {
		if (!c.equals(w)) {
			for (While __DEC_a_last_730579 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!c.equals(__DEC_a_last_730579)) {
					if (!w.equals(__DEC_a_last_730579)) {
						return new Object[] { a, c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_13B(Decision a) {
		for (Program __DEC_a_first_746231 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
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

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_16BB(While c, Assignment b) {
		if (b.equals(c.getFirst())) {
			return new Object[] { c, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_17BB(While w, Assignment b) {
		if (b.equals(w.getFirst())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_18BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_19BB(Decision a, While c) {
		if (c.equals(a.getPositive())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_20BB(Decision a, While c) {
		if (c.equals(a.getNegative())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_21BB(While c, Decision a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_22BB(While w, Decision a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_27_1_matchtggpattern_blackBBBB(Assignment b, While c, While w,
			Decision a) {
		if (!c.equals(w)) {
			if (b.equals(c.getLast())) {
				if (a.equals(w.getFirst())) {
					if (c.equals(w.getNext())) {
						if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_0BB(b, a) == null) {
							if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_1BB(b, a) == null) {
								if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_2BBB(b, c, w) == null) {
									if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_3BBB(b, c, w) == null) {
										if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_4B(b) == null) {
											if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_5BB(c,
													a) == null) {
												if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_6BB(c,
														a) == null) {
													if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_7BB(c,
															w) == null) {
														if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_8BB(
																c, w) == null) {
															if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_9B(
																	c) == null) {
																if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_10B(
																		a) == null) {
																	if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_11B(
																			a) == null) {
																		if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_12BBB(
																				a, c, w) == null) {
																			if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_13B(
																					a) == null) {
																				if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_14BB(
																						a, b) == null) {
																					if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_15BB(
																							a, b) == null) {
																						if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_16BB(
																								c, b) == null) {
																							if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_17BB(
																									w, b) == null) {
																								if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_18BB(
																										w, b) == null) {
																									if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_19BB(
																											a,
																											c) == null) {
																										if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_20BB(
																												a,
																												c) == null) {
																											if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_21BB(
																													c,
																													a) == null) {
																												if (pattern_whiledl2branchbb_27_1_matchtggpattern_black_nac_22BB(
																														w,
																														a) == null) {
																													return new Object[] {
																															b,
																															c,
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
		for (Graph __DEC_z_root_418080 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_1BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_positive_852359 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_852359)) {
							if (!i.equals(__DEC_z_positive_852359)) {
								if (!x.equals(__DEC_z_positive_852359)) {
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

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_2BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_negative_126934 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_126934)) {
							if (!i.equals(__DEC_z_negative_126934)) {
								if (!x.equals(__DEC_z_negative_126934)) {
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

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_489262 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_4BBBB(Command y, Branch z,
			Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_positive_292350 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!z.equals(__DEC_y_positive_292350)) {
							if (!i.equals(__DEC_y_positive_292350)) {
								if (!x.equals(__DEC_y_positive_292350)) {
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

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_5BBBB(Command y, Branch z,
			Branch i, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_negative_749536 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!z.equals(__DEC_y_negative_749536)) {
							if (!i.equals(__DEC_y_negative_749536)) {
								if (!x.equals(__DEC_y_negative_749536)) {
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

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_829988 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_7BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_515533 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_515533)) {
							if (!z.equals(__DEC_x_positive_515533)) {
								if (!i.equals(__DEC_x_positive_515533)) {
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

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_8BBB(Branch x, Branch z,
			Branch i) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_703250 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_703250)) {
							if (!z.equals(__DEC_x_negative_703250)) {
								if (!i.equals(__DEC_x_negative_703250)) {
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

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_9BB(Branch z, Command y) {
		if (y.equals(z.getPositive())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_10BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_11BB(Branch x, Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_12BB(Branch z, Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_13BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_14BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_15BB(Branch z, Branch x) {
		if (x.equals(z.getPositive())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_16BB(Branch z, Branch x) {
		if (x.equals(z.getNegative())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_17BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_28_1_matchtggpattern_blackBBBB(Branch z, Command y, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					if (z.equals(y.getNext())) {
						if (z.equals(i.getNegative())) {
							if (x.equals(i.getPositive())) {
								if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_0B(z) == null) {
									if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_1BBB(z, i, x) == null) {
										if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_2BBB(z, i,
												x) == null) {
											if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_3B(y) == null) {
												if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_4BBBB(y, z,
														i, x) == null) {
													if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_5BBBB(y,
															z, i, x) == null) {
														if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_6B(
																x) == null) {
															if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_7BBB(
																	x, z, i) == null) {
																if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_8BBB(
																		x, z, i) == null) {
																	if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_9BB(
																			z, y) == null) {
																		if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_10BB(
																				i, y) == null) {
																			if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_11BB(
																					x, y) == null) {
																				if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_12BB(
																						z, y) == null) {
																					if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_13BB(
																							i, y) == null) {
																						if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_14BB(
																								x, y) == null) {
																							if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_15BB(
																									z, x) == null) {
																								if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_16BB(
																										z, x) == null) {
																									if (pattern_whiledl2branchbb_28_1_matchtggpattern_black_nac_17BB(
																											i,
																											x) == null) {
																										return new Object[] {
																												z, y, i,
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
			IsApplicableMatch isApplicableMatch, S2B w2i, Branch i, While w, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, w2i, i, w, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w2i, i, w, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whiledl2branchbb_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledl2branchbb_29_3_solveCSP_bindingAndBlackFBBBBBB(whiledl2branchbb _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, Branch i, While w, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whiledl2branchbb_29_3_solveCSP_binding = pattern_whiledl2branchbb_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, w2i, i, w, ruleResult);
		if (result_pattern_whiledl2branchbb_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledl2branchbb_29_3_solveCSP_binding[0];

			Object[] result_pattern_whiledl2branchbb_29_3_solveCSP_black = pattern_whiledl2branchbb_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whiledl2branchbb_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w2i, i, w, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whiledl2branchbb_29_4_checkCSP_expressionFBB(whiledl2branchbb _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiledl2branchbb_29_5_checknacs_blackBBB(S2B w2i, Branch i, While w) {
		return new Object[] { w2i, i, w };
	}

	public static final Object[] pattern_whiledl2branchbb_29_6_perform_blackBBBB(S2B w2i, Branch i, While w,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { w2i, i, w, ruleResult };
	}

	public static final Object[] pattern_whiledl2branchbb_29_6_perform_greenFFFFFFBBFFFB(Branch i, While w,
			ModelgeneratorRuleResult ruleResult) {
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		i.setNegative(z);
		ruleResult.getTargetObjects().add(z);
		ruleResult.getSourceObjects().add(b);
		b2y.setSource(b);
		ruleResult.getCorrObjects().add(b2y);
		b2y.setTarget(y);
		y.setNext(z);
		ruleResult.getTargetObjects().add(y);
		c.setLast(b);
		w.setNext(c);
		ruleResult.getSourceObjects().add(c);
		ruleResult.getCorrObjects().add(a2x);
		w.setFirst(a);
		a2x.setSource(a);
		ruleResult.getSourceObjects().add(a);
		c2z.setSource(c);
		c2z.setTarget(z);
		ruleResult.getCorrObjects().add(c2z);
		i.setPositive(x);
		a2x.setTarget(x);
		ruleResult.getTargetObjects().add(x);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { z, b, b2y, y, c, a2x, i, w, a, c2z, x, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whiledl2branchbb_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whiledl2branchbbImpl
