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
import org.wbsilva.bx.sourcecode2controlflow.Rules.whileda2branchbc;

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
 * An implementation of the model object '<em><b>whileda2branchbc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class whileda2branchbcImpl extends AbstractRuleImpl implements whileda2branchbc {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected whileda2branchbcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getwhileda2branchbc();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Assignment c, While w, Decision a) {

		Object[] result1_black = whileda2branchbcImpl.pattern_whileda2branchbc_0_1_initialbindings_blackBBBBB(this,
				match, c, w, a);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[w] = " + w + ", " + "[a] = " + a + ".");
		}

		Object[] result2_bindingAndBlack = whileda2branchbcImpl
				.pattern_whileda2branchbc_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, c, w, a);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[w] = " + w + ", " + "[a] = " + a + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileda2branchbcImpl.pattern_whileda2branchbc_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileda2branchbcImpl
					.pattern_whileda2branchbc_0_4_collectelementstobetranslated_blackBBBB(match, c, w, a);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[w] = " + w + ", " + "[a] = " + a + ".");
			}
			whileda2branchbcImpl.pattern_whileda2branchbc_0_4_collectelementstobetranslated_greenBBBBFF(match, c, w, a);
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[5];

			Object[] result5_black = whileda2branchbcImpl
					.pattern_whileda2branchbc_0_5_collectcontextelements_blackBBBB(match, c, w, a);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[w] = " + w + ", " + "[a] = " + a + ".");
			}
			whileda2branchbcImpl.pattern_whileda2branchbc_0_5_collectcontextelements_greenBB(match, w);

			// 
			whileda2branchbcImpl.pattern_whileda2branchbc_0_6_registerobjectstomatch_expressionBBBBB(this, match, c, w,
					a);
			return whileda2branchbcImpl.pattern_whileda2branchbc_0_7_expressionF();
		} else {
			return whileda2branchbcImpl.pattern_whileda2branchbc_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whileda2branchbcImpl
				.pattern_whileda2branchbc_1_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Assignment c = (Assignment) result1_bindingAndBlack[0];
		Branch i = (Branch) result1_bindingAndBlack[1];
		S2B w2i = (S2B) result1_bindingAndBlack[2];
		While w = (While) result1_bindingAndBlack[3];
		Decision a = (Decision) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = whileda2branchbcImpl.pattern_whileda2branchbc_1_1_performtransformation_greenBFBFFBF(c,
				i, a);
		S2B a2x = (S2B) result1_green[1];
		Command z = (Command) result1_green[3];
		S2N c2z = (S2N) result1_green[4];
		Branch x = (Branch) result1_green[6];

		Object[] result2_black = whileda2branchbcImpl
				.pattern_whileda2branchbc_1_2_collecttranslatedelements_blackBBBBBB(c, a2x, z, c2z, a, x);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[c] = " + c + ", " + "[a2x] = " + a2x + ", "
							+ "[z] = " + z + ", " + "[c2z] = " + c2z + ", " + "[a] = " + a + ", " + "[x] = " + x + ".");
		}
		Object[] result2_green = whileda2branchbcImpl
				.pattern_whileda2branchbc_1_2_collecttranslatedelements_greenFBBBBBB(c, a2x, z, c2z, a, x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileda2branchbcImpl.pattern_whileda2branchbc_1_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, c, a2x, i, z, w2i, w, c2z, a, x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c] = " + c + ", " + "[a2x] = " + a2x + ", " + "[i] = " + i + ", " + "[z] = " + z + ", "
					+ "[w2i] = " + w2i + ", " + "[w] = " + w + ", " + "[c2z] = " + c2z + ", " + "[a] = " + a + ", "
					+ "[x] = " + x + ".");
		}
		whileda2branchbcImpl.pattern_whileda2branchbc_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult, c, a2x,
				i, z, w, c2z, a, x);
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[16];

		// 
		// 
		whileda2branchbcImpl.pattern_whileda2branchbc_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, c,
				a2x, i, z, w2i, w, c2z, a, x);
		return whileda2branchbcImpl.pattern_whileda2branchbc_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = whileda2branchbcImpl
				.pattern_whileda2branchbc_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whileda2branchbcImpl
				.pattern_whileda2branchbc_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whileda2branchbcImpl.pattern_whileda2branchbc_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Assignment c = (Assignment) result2_binding[0];
		While w = (While) result2_binding[1];
		Decision a = (Decision) result2_binding[2];
		for (Object[] result2_black : whileda2branchbcImpl.pattern_whileda2branchbc_2_2_corematch_blackBFFBBB(c, w, a,
				match)) {
			Branch i = (Branch) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			// ForEach 
			for (Object[] result3_black : whileda2branchbcImpl.pattern_whileda2branchbc_2_3_findcontext_blackBBBBB(c, i,
					w2i, w, a)) {
				Object[] result3_green = whileda2branchbcImpl
						.pattern_whileda2branchbc_2_3_findcontext_greenBBBBBFFFFF(c, i, w2i, w, a);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = whileda2branchbcImpl
						.pattern_whileda2branchbc_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, c, i,
								w2i, w, a);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[i] = " + i
							+ ", " + "[w2i] = " + w2i + ", " + "[w] = " + w + ", " + "[a] = " + a + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whileda2branchbcImpl.pattern_whileda2branchbc_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whileda2branchbcImpl
							.pattern_whileda2branchbc_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whileda2branchbcImpl.pattern_whileda2branchbc_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whileda2branchbcImpl.pattern_whileda2branchbc_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Assignment c, While w, Decision a) {
		match.registerObject("c", c);
		match.registerObject("w", w);
		match.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment c, While w, Decision a) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Assignment c, Branch i, S2B w2i, While w,
			Decision a) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("w2i", w2i);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject c, EObject a2x, EObject i, EObject z,
			EObject w2i, EObject w, EObject c2z, EObject a, EObject x) {
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.Decision.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch i, Command z, Branch x) {

		Object[] result1_black = whileda2branchbcImpl.pattern_whileda2branchbc_10_1_initialbindings_blackBBBBB(this,
				match, i, z, x);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[i] = " + i + ", " + "[z] = " + z + ", " + "[x] = " + x + ".");
		}

		Object[] result2_bindingAndBlack = whileda2branchbcImpl
				.pattern_whileda2branchbc_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, i, z, x);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[i] = " + i + ", " + "[z] = " + z + ", " + "[x] = " + x + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileda2branchbcImpl.pattern_whileda2branchbc_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileda2branchbcImpl
					.pattern_whileda2branchbc_10_4_collectelementstobetranslated_blackBBBB(match, i, z, x);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[i] = " + i + ", " + "[z] = " + z + ", " + "[x] = " + x + ".");
			}
			whileda2branchbcImpl.pattern_whileda2branchbc_10_4_collectelementstobetranslated_greenBBBBFF(match, i, z,
					x);
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[5];

			Object[] result5_black = whileda2branchbcImpl
					.pattern_whileda2branchbc_10_5_collectcontextelements_blackBBBB(match, i, z, x);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[i] = " + i + ", " + "[z] = " + z + ", " + "[x] = " + x + ".");
			}
			whileda2branchbcImpl.pattern_whileda2branchbc_10_5_collectcontextelements_greenBB(match, i);

			// 
			whileda2branchbcImpl.pattern_whileda2branchbc_10_6_registerobjectstomatch_expressionBBBBB(this, match, i, z,
					x);
			return whileda2branchbcImpl.pattern_whileda2branchbc_10_7_expressionF();
		} else {
			return whileda2branchbcImpl.pattern_whileda2branchbc_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whileda2branchbcImpl
				.pattern_whileda2branchbc_11_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Branch i = (Branch) result1_bindingAndBlack[0];
		Command z = (Command) result1_bindingAndBlack[1];
		S2B w2i = (S2B) result1_bindingAndBlack[2];
		While w = (While) result1_bindingAndBlack[3];
		Branch x = (Branch) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = whileda2branchbcImpl
				.pattern_whileda2branchbc_11_1_performtransformation_greenFFBBFFB(z, w, x);
		Assignment c = (Assignment) result1_green[0];
		S2B a2x = (S2B) result1_green[1];
		S2N c2z = (S2N) result1_green[4];
		Decision a = (Decision) result1_green[5];

		Object[] result2_black = whileda2branchbcImpl
				.pattern_whileda2branchbc_11_2_collecttranslatedelements_blackBBBBBB(c, a2x, z, c2z, a, x);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[c] = " + c + ", " + "[a2x] = " + a2x + ", "
							+ "[z] = " + z + ", " + "[c2z] = " + c2z + ", " + "[a] = " + a + ", " + "[x] = " + x + ".");
		}
		Object[] result2_green = whileda2branchbcImpl
				.pattern_whileda2branchbc_11_2_collecttranslatedelements_greenFBBBBBB(c, a2x, z, c2z, a, x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileda2branchbcImpl.pattern_whileda2branchbc_11_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, c, a2x, i, z, w2i, w, c2z, a, x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c] = " + c + ", " + "[a2x] = " + a2x + ", " + "[i] = " + i + ", " + "[z] = " + z + ", "
					+ "[w2i] = " + w2i + ", " + "[w] = " + w + ", " + "[c2z] = " + c2z + ", " + "[a] = " + a + ", "
					+ "[x] = " + x + ".");
		}
		whileda2branchbcImpl.pattern_whileda2branchbc_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult, c,
				a2x, i, z, w, c2z, a, x);
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[16];

		// 
		// 
		whileda2branchbcImpl.pattern_whileda2branchbc_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, c,
				a2x, i, z, w2i, w, c2z, a, x);
		return whileda2branchbcImpl.pattern_whileda2branchbc_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = whileda2branchbcImpl
				.pattern_whileda2branchbc_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whileda2branchbcImpl
				.pattern_whileda2branchbc_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whileda2branchbcImpl.pattern_whileda2branchbc_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Branch i = (Branch) result2_binding[0];
		Command z = (Command) result2_binding[1];
		Branch x = (Branch) result2_binding[2];
		for (Object[] result2_black : whileda2branchbcImpl.pattern_whileda2branchbc_12_2_corematch_blackBBFFBB(i, z, x,
				match)) {
			S2B w2i = (S2B) result2_black[2];
			While w = (While) result2_black[3];
			// ForEach 
			for (Object[] result3_black : whileda2branchbcImpl.pattern_whileda2branchbc_12_3_findcontext_blackBBBBB(i,
					z, w2i, w, x)) {
				Object[] result3_green = whileda2branchbcImpl
						.pattern_whileda2branchbc_12_3_findcontext_greenBBBBBFFFFF(i, z, w2i, w, x);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = whileda2branchbcImpl
						.pattern_whileda2branchbc_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, i, z,
								w2i, w, x);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[i] = " + i + ", " + "[z] = " + z
							+ ", " + "[w2i] = " + w2i + ", " + "[w] = " + w + ", " + "[x] = " + x + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whileda2branchbcImpl.pattern_whileda2branchbc_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whileda2branchbcImpl
							.pattern_whileda2branchbc_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whileda2branchbcImpl.pattern_whileda2branchbc_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whileda2branchbcImpl.pattern_whileda2branchbc_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Branch i, Command z, Branch x) {
		match.registerObject("i", i);
		match.registerObject("z", z);
		match.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch i, Command z, Branch x) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch i, Command z, S2B w2i, While w,
			Branch x) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("w2i", w2i);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject c, EObject a2x, EObject i, EObject z,
			EObject w2i, EObject w, EObject c2z, EObject a, EObject x) {
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_122(EMoflonEdge _edge_negative) {

		Object[] result1_bindingAndBlack = whileda2branchbcImpl
				.pattern_whileda2branchbc_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whileda2branchbcImpl.pattern_whileda2branchbc_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whileda2branchbcImpl
				.pattern_whileda2branchbc_20_2_testcorematchandDECs_blackFFFB(_edge_negative)) {
			Branch i = (Branch) result2_black[0];
			Command z = (Command) result2_black[1];
			Branch x = (Branch) result2_black[2];
			Object[] result2_green = whileda2branchbcImpl
					.pattern_whileda2branchbc_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileda2branchbcImpl
					.pattern_whileda2branchbc_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, i, z, x)) {
				// 
				if (whileda2branchbcImpl
						.pattern_whileda2branchbc_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = whileda2branchbcImpl
							.pattern_whileda2branchbc_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whileda2branchbcImpl.pattern_whileda2branchbc_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whileda2branchbcImpl.pattern_whileda2branchbc_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_122(EMoflonEdge _edge_first) {

		Object[] result1_bindingAndBlack = whileda2branchbcImpl
				.pattern_whileda2branchbc_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whileda2branchbcImpl.pattern_whileda2branchbc_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whileda2branchbcImpl
				.pattern_whileda2branchbc_21_2_testcorematchandDECs_blackFFFB(_edge_first)) {
			Assignment c = (Assignment) result2_black[0];
			While w = (While) result2_black[1];
			Decision a = (Decision) result2_black[2];
			Object[] result2_green = whileda2branchbcImpl
					.pattern_whileda2branchbc_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileda2branchbcImpl
					.pattern_whileda2branchbc_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, c, w, a)) {
				// 
				if (whileda2branchbcImpl
						.pattern_whileda2branchbc_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = whileda2branchbcImpl
							.pattern_whileda2branchbc_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whileda2branchbcImpl.pattern_whileda2branchbc_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whileda2branchbcImpl.pattern_whileda2branchbc_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("whileda2branchbc");
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
		ruleResult.setRule("whileda2branchbc");
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

		Object[] result1_black = whileda2branchbcImpl.pattern_whileda2branchbc_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whileda2branchbcImpl.pattern_whileda2branchbc_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = whileda2branchbcImpl
				.pattern_whileda2branchbc_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Assignment c = (Assignment) result2_bindingAndBlack[0];
		Branch i = (Branch) result2_bindingAndBlack[1];
		Command z = (Command) result2_bindingAndBlack[2];
		While w = (While) result2_bindingAndBlack[3];
		Decision a = (Decision) result2_bindingAndBlack[4];
		Branch x = (Branch) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = whileda2branchbcImpl
				.pattern_whileda2branchbc_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, c, i, z, w, a, x, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[c] = " + c + ", " + "[i] = " + i + ", " + "[z] = " + z + ", " + "[w] = " + w + ", " + "[a] = "
					+ a + ", " + "[x] = " + x + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whileda2branchbcImpl.pattern_whileda2branchbc_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whileda2branchbcImpl
					.pattern_whileda2branchbc_24_5_matchcorrcontext_blackBFBBB(i, w, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[1];
				Object[] result5_green = whileda2branchbcImpl
						.pattern_whileda2branchbc_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whileda2branchbcImpl
						.pattern_whileda2branchbc_24_6_createcorrespondence_blackBBBBBBB(c, i, z, w, a, x, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", "
							+ "[i] = " + i + ", " + "[z] = " + z + ", " + "[w] = " + w + ", " + "[a] = " + a + ", "
							+ "[x] = " + x + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whileda2branchbcImpl.pattern_whileda2branchbc_24_6_createcorrespondence_greenBFBFBBB(c, z, a, x,
						ccMatch);
				//nothing S2B a2x = (S2B) result6_green[1];
				//nothing S2N c2z = (S2N) result6_green[3];

				Object[] result7_black = whileda2branchbcImpl
						.pattern_whileda2branchbc_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whileda2branchbcImpl.pattern_whileda2branchbc_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return whileda2branchbcImpl.pattern_whileda2branchbc_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Assignment c, Branch i, Command z, While w, Decision a, Branch x,
			Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Assignment c, While w, Decision a) {// 
		Object[] result1_black = whileda2branchbcImpl.pattern_whileda2branchbc_27_1_matchtggpattern_blackBBB(c, w, a);
		if (result1_black != null) {
			return whileda2branchbcImpl.pattern_whileda2branchbc_27_2_expressionF();
		} else {
			return whileda2branchbcImpl.pattern_whileda2branchbc_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Branch i, Command z, Branch x) {// 
		Object[] result1_black = whileda2branchbcImpl.pattern_whileda2branchbc_28_1_matchtggpattern_blackBBB(i, z, x);
		if (result1_black != null) {
			return whileda2branchbcImpl.pattern_whileda2branchbc_28_2_expressionF();
		} else {
			return whileda2branchbcImpl.pattern_whileda2branchbc_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B w2iParameter) {

		Object[] result1_black = whileda2branchbcImpl.pattern_whileda2branchbc_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whileda2branchbcImpl.pattern_whileda2branchbc_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : whileda2branchbcImpl
				.pattern_whileda2branchbc_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList w2iList = (RuleEntryList) result2_black[0];
			Branch i = (Branch) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			While w = (While) result2_black[3];

			Object[] result3_bindingAndBlack = whileda2branchbcImpl
					.pattern_whileda2branchbc_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, i, w2i, w,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[i] = " + i + ", " + "[w2i] = " + w2i
						+ ", " + "[w] = " + w + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whileda2branchbcImpl.pattern_whileda2branchbc_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whileda2branchbcImpl.pattern_whileda2branchbc_29_5_checknacs_blackBBB(i, w2i,
						w);
				if (result5_black != null) {

					Object[] result6_black = whileda2branchbcImpl.pattern_whileda2branchbc_29_6_perform_blackBBBB(i,
							w2i, w, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[i] = " + i + ", "
								+ "[w2i] = " + w2i + ", " + "[w] = " + w + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whileda2branchbcImpl.pattern_whileda2branchbc_29_6_perform_greenFFBFBFFFB(i, w, ruleResult);
					//nothing Assignment c = (Assignment) result6_green[0];
					//nothing S2B a2x = (S2B) result6_green[1];
					//nothing Command z = (Command) result6_green[3];
					//nothing S2N c2z = (S2N) result6_green[5];
					//nothing Decision a = (Decision) result6_green[6];
					//nothing Branch x = (Branch) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return whileda2branchbcImpl.pattern_whileda2branchbc_29_7_expressionFB(ruleResult);
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
		case RulesPackage.WHILEDA2BRANCHBC___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_WHILE_DECISION:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2),
					(Decision) arguments.get(3));
		case RulesPackage.WHILEDA2BRANCHBC___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEDA2BRANCHBC___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEDA2BRANCHBC___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_WHILE_DECISION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Decision) arguments.get(3));
			return null;
		case RulesPackage.WHILEDA2BRANCHBC___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_WHILE_DECISION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Decision) arguments.get(3));
		case RulesPackage.WHILEDA2BRANCHBC___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEDA2BRANCHBC___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASSIGNMENT_BRANCH_S2B_WHILE_DECISION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(Branch) arguments.get(2), (S2B) arguments.get(3), (While) arguments.get(4),
					(Decision) arguments.get(5));
		case RulesPackage.WHILEDA2BRANCHBC___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEDA2BRANCHBC___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.WHILEDA2BRANCHBC___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEDA2BRANCHBC___IS_APPROPRIATE_BWD__MATCH_BRANCH_COMMAND_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.WHILEDA2BRANCHBC___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEDA2BRANCHBC___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEDA2BRANCHBC___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_COMMAND_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3));
			return null;
		case RulesPackage.WHILEDA2BRANCHBC___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_COMMAND_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3));
		case RulesPackage.WHILEDA2BRANCHBC___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEDA2BRANCHBC___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_COMMAND_S2B_WHILE_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (S2B) arguments.get(3), (While) arguments.get(4),
					(Branch) arguments.get(5));
		case RulesPackage.WHILEDA2BRANCHBC___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEDA2BRANCHBC___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.WHILEDA2BRANCHBC___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEDA2BRANCHBC___IS_APPROPRIATE_BWD_EMOFLON_EDGE_122__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_122((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEDA2BRANCHBC___IS_APPROPRIATE_FWD_EMOFLON_EDGE_122__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_122((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEDA2BRANCHBC___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEDA2BRANCHBC___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEDA2BRANCHBC___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEDA2BRANCHBC___IS_APPLICABLE_SOLVE_CSP_CC__ASSIGNMENT_BRANCH_COMMAND_WHILE_DECISION_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Assignment) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (While) arguments.get(3), (Decision) arguments.get(4),
					(Branch) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.WHILEDA2BRANCHBC___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEDA2BRANCHBC___CHECK_DEC_FWD__ASSIGNMENT_WHILE_DECISION:
			return checkDEC_FWD((Assignment) arguments.get(0), (While) arguments.get(1), (Decision) arguments.get(2));
		case RulesPackage.WHILEDA2BRANCHBC___CHECK_DEC_BWD__BRANCH_COMMAND_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2));
		case RulesPackage.WHILEDA2BRANCHBC___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILEDA2BRANCHBC___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_S2B_WHILE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (While) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILEDA2BRANCHBC___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whileda2branchbc_0_1_initialbindings_blackBBBBB(whileda2branchbc _this,
			Match match, Assignment c, While w, Decision a) {
		return new Object[] { _this, match, c, w, a };
	}

	public static final Object[] pattern_whileda2branchbc_0_2_SolveCSP_bindingFBBBBB(whileda2branchbc _this,
			Match match, Assignment c, While w, Decision a) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, c, w, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, c, w, a };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileda2branchbc_0_2_SolveCSP_bindingAndBlackFBBBBB(whileda2branchbc _this,
			Match match, Assignment c, While w, Decision a) {
		Object[] result_pattern_whileda2branchbc_0_2_SolveCSP_binding = pattern_whileda2branchbc_0_2_SolveCSP_bindingFBBBBB(
				_this, match, c, w, a);
		if (result_pattern_whileda2branchbc_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileda2branchbc_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whileda2branchbc_0_2_SolveCSP_black = pattern_whileda2branchbc_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileda2branchbc_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, c, w, a };
			}
		}
		return null;
	}

	public static final boolean pattern_whileda2branchbc_0_3_CheckCSP_expressionFBB(whileda2branchbc _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileda2branchbc_0_4_collectelementstobetranslated_blackBBBB(Match match,
			Assignment c, While w, Decision a) {
		return new Object[] { match, c, w, a };
	}

	public static final Object[] pattern_whileda2branchbc_0_4_collectelementstobetranslated_greenBBBBFF(Match match,
			Assignment c, While w, Decision a) {
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(c);
		match.getToBeTranslatedNodes().add(a);
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		return new Object[] { match, c, w, a, w__a____first, w__c____next };
	}

	public static final Object[] pattern_whileda2branchbc_0_5_collectcontextelements_blackBBBB(Match match,
			Assignment c, While w, Decision a) {
		return new Object[] { match, c, w, a };
	}

	public static final Object[] pattern_whileda2branchbc_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whileda2branchbc_0_6_registerobjectstomatch_expressionBBBBB(whileda2branchbc _this,
			Match match, Assignment c, While w, Decision a) {
		_this.registerObjectsToMatch_FWD(match, c, w, a);

	}

	public static final boolean pattern_whileda2branchbc_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileda2branchbc_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileda2branchbc_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("c");
		EObject _localVariable_1 = isApplicableMatch.getObject("i");
		EObject _localVariable_2 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_3 = isApplicableMatch.getObject("w");
		EObject _localVariable_4 = isApplicableMatch.getObject("a");
		EObject tmpC = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpW2i = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpA = _localVariable_4;
		if (tmpC instanceof Assignment) {
			Assignment c = (Assignment) tmpC;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpW2i instanceof S2B) {
					S2B w2i = (S2B) tmpW2i;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						if (tmpA instanceof Decision) {
							Decision a = (Decision) tmpA;
							return new Object[] { c, i, w2i, w, a, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_1_1_performtransformation_blackBBBBBFBB(Assignment c,
			Branch i, S2B w2i, While w, Decision a, whileda2branchbc _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { c, i, w2i, w, a, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			whileda2branchbc _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whileda2branchbc_1_1_performtransformation_binding = pattern_whileda2branchbc_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_whileda2branchbc_1_1_performtransformation_binding != null) {
			Assignment c = (Assignment) result_pattern_whileda2branchbc_1_1_performtransformation_binding[0];
			Branch i = (Branch) result_pattern_whileda2branchbc_1_1_performtransformation_binding[1];
			S2B w2i = (S2B) result_pattern_whileda2branchbc_1_1_performtransformation_binding[2];
			While w = (While) result_pattern_whileda2branchbc_1_1_performtransformation_binding[3];
			Decision a = (Decision) result_pattern_whileda2branchbc_1_1_performtransformation_binding[4];

			Object[] result_pattern_whileda2branchbc_1_1_performtransformation_black = pattern_whileda2branchbc_1_1_performtransformation_blackBBBBBFBB(
					c, i, w2i, w, a, _this, isApplicableMatch);
			if (result_pattern_whileda2branchbc_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileda2branchbc_1_1_performtransformation_black[5];

				return new Object[] { c, i, w2i, w, a, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_1_1_performtransformation_greenBFBFFBF(Assignment c, Branch i,
			Decision a) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2N c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		a2x.setSource(a);
		i.setNegative(z);
		c2z.setTarget(z);
		c2z.setSource(c);
		i.setPositive(x);
		a2x.setTarget(x);
		return new Object[] { c, a2x, i, z, c2z, a, x };
	}

	public static final Object[] pattern_whileda2branchbc_1_2_collecttranslatedelements_blackBBBBBB(Assignment c,
			S2B a2x, Command z, S2N c2z, Decision a, Branch x) {
		return new Object[] { c, a2x, z, c2z, a, x };
	}

	public static final Object[] pattern_whileda2branchbc_1_2_collecttranslatedelements_greenFBBBBBB(Assignment c,
			S2B a2x, Command z, S2N c2z, Decision a, Branch x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(x);
		return new Object[] { ruleresult, c, a2x, z, c2z, a, x };
	}

	public static final Object[] pattern_whileda2branchbc_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject c, EObject a2x, EObject i, EObject z, EObject w2i, EObject w,
			EObject c2z, EObject a, EObject x) {
		if (!c.equals(i)) {
			if (!c.equals(z)) {
				if (!c.equals(w2i)) {
					if (!c.equals(w)) {
						if (!c.equals(c2z)) {
							if (!c.equals(x)) {
								if (!a2x.equals(c)) {
									if (!a2x.equals(i)) {
										if (!a2x.equals(z)) {
											if (!a2x.equals(w2i)) {
												if (!a2x.equals(w)) {
													if (!a2x.equals(c2z)) {
														if (!a2x.equals(x)) {
															if (!i.equals(z)) {
																if (!i.equals(w2i)) {
																	if (!i.equals(w)) {
																		if (!i.equals(x)) {
																			if (!w2i.equals(z)) {
																				if (!w2i.equals(x)) {
																					if (!w.equals(z)) {
																						if (!w.equals(w2i)) {
																							if (!w.equals(x)) {
																								if (!c2z.equals(i)) {
																									if (!c2z.equals(
																											z)) {
																										if (!c2z.equals(
																												w2i)) {
																											if (!c2z.equals(
																													w)) {
																												if (!c2z.equals(
																														x)) {
																													if (!a.equals(
																															c)) {
																														if (!a.equals(
																																a2x)) {
																															if (!a.equals(
																																	i)) {
																																if (!a.equals(
																																		z)) {
																																	if (!a.equals(
																																			w2i)) {
																																		if (!a.equals(
																																				w)) {
																																			if (!a.equals(
																																					c2z)) {
																																				if (!a.equals(
																																						x)) {
																																					if (!x.equals(
																																							z)) {
																																						return new Object[] {
																																								ruleresult,
																																								c,
																																								a2x,
																																								i,
																																								z,
																																								w2i,
																																								w,
																																								c2z,
																																								a,
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
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject c, EObject a2x, EObject i, EObject z, EObject w, EObject c2z,
			EObject a, EObject x) {
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileda2branchbc";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String c2z__z____target_name_prime = "target";
		String c2z__c____source_name_prime = "source";
		String a2x__a____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
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
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		return new Object[] { ruleresult, c, a2x, i, z, w, c2z, a, x, i__z____negative, i__x____positive, w__a____first,
				w__c____next, c2z__z____target, c2z__c____source, a2x__a____source, a2x__x____target };
	}

	public static final void pattern_whileda2branchbc_1_5_registerobjects_expressionBBBBBBBBBBB(whileda2branchbc _this,
			PerformRuleResult ruleresult, EObject c, EObject a2x, EObject i, EObject z, EObject w2i, EObject w,
			EObject c2z, EObject a, EObject x) {
		_this.registerObjects_FWD(ruleresult, c, a2x, i, z, w2i, w, c2z, a, x);

	}

	public static final PerformRuleResult pattern_whileda2branchbc_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileda2branchbc_2_1_preparereturnvalue_bindingFB(whileda2branchbc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_2_1_preparereturnvalue_blackFBB(EClass eClass,
			whileda2branchbc _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_2_1_preparereturnvalue_bindingAndBlackFFB(
			whileda2branchbc _this) {
		Object[] result_pattern_whileda2branchbc_2_1_preparereturnvalue_binding = pattern_whileda2branchbc_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileda2branchbc_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whileda2branchbc_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileda2branchbc_2_1_preparereturnvalue_black = pattern_whileda2branchbc_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whileda2branchbc_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whileda2branchbc_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whileda2branchbc";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whileda2branchbc_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("c");
		EObject _localVariable_1 = match.getObject("w");
		EObject _localVariable_2 = match.getObject("a");
		EObject tmpC = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpA = _localVariable_2;
		if (tmpC instanceof Assignment) {
			Assignment c = (Assignment) tmpC;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpA instanceof Decision) {
					Decision a = (Decision) tmpA;
					return new Object[] { c, w, a, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileda2branchbc_2_2_corematch_blackBFFBBB(Assignment c, While w,
			Decision a, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
			Branch i = w2i.getTarget();
			if (i != null) {
				_result.add(new Object[] { c, i, w2i, w, a, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileda2branchbc_2_3_findcontext_blackBBBBB(Assignment c, Branch i,
			S2B w2i, While w, Decision a) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (i.equals(w2i.getTarget())) {
			if (a.equals(w.getFirst())) {
				if (w.equals(w2i.getSource())) {
					if (c.equals(w.getNext())) {
						_result.add(new Object[] { c, i, w2i, w, a });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whileda2branchbc_2_3_findcontext_greenBBBBBFFFFF(Assignment c, Branch i,
			S2B w2i, While w, Decision a) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w2i__i____target_name_prime = "target";
		String w__a____first_name_prime = "first";
		String w2i__w____source_name_prime = "source";
		String w__c____next_name_prime = "next";
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(a);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
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
		w__a____first.setName(w__a____first_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		return new Object[] { c, i, w2i, w, a, isApplicableMatch, w2i__i____target, w__a____first, w2i__w____source,
				w__c____next };
	}

	public static final Object[] pattern_whileda2branchbc_2_4_solveCSP_bindingFBBBBBBB(whileda2branchbc _this,
			IsApplicableMatch isApplicableMatch, Assignment c, Branch i, S2B w2i, While w, Decision a) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, c, i, w2i, w, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, i, w2i, w, a };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileda2branchbc_2_4_solveCSP_bindingAndBlackFBBBBBBB(whileda2branchbc _this,
			IsApplicableMatch isApplicableMatch, Assignment c, Branch i, S2B w2i, While w, Decision a) {
		Object[] result_pattern_whileda2branchbc_2_4_solveCSP_binding = pattern_whileda2branchbc_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, c, i, w2i, w, a);
		if (result_pattern_whileda2branchbc_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileda2branchbc_2_4_solveCSP_binding[0];

			Object[] result_pattern_whileda2branchbc_2_4_solveCSP_black = pattern_whileda2branchbc_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileda2branchbc_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, i, w2i, w, a };
			}
		}
		return null;
	}

	public static final boolean pattern_whileda2branchbc_2_5_checkCSP_expressionFBB(whileda2branchbc _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileda2branchbc_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whileda2branchbc_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whileda2branchbc";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whileda2branchbc_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileda2branchbc_10_1_initialbindings_blackBBBBB(whileda2branchbc _this,
			Match match, Branch i, Command z, Branch x) {
		if (!i.equals(x)) {
			return new Object[] { _this, match, i, z, x };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_10_2_SolveCSP_bindingFBBBBB(whileda2branchbc _this,
			Match match, Branch i, Command z, Branch x) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, i, z, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, i, z, x };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileda2branchbc_10_2_SolveCSP_bindingAndBlackFBBBBB(whileda2branchbc _this,
			Match match, Branch i, Command z, Branch x) {
		Object[] result_pattern_whileda2branchbc_10_2_SolveCSP_binding = pattern_whileda2branchbc_10_2_SolveCSP_bindingFBBBBB(
				_this, match, i, z, x);
		if (result_pattern_whileda2branchbc_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileda2branchbc_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whileda2branchbc_10_2_SolveCSP_black = pattern_whileda2branchbc_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileda2branchbc_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, i, z, x };
			}
		}
		return null;
	}

	public static final boolean pattern_whileda2branchbc_10_3_CheckCSP_expressionFBB(whileda2branchbc _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileda2branchbc_10_4_collectelementstobetranslated_blackBBBB(Match match,
			Branch i, Command z, Branch x) {
		if (!i.equals(x)) {
			return new Object[] { match, i, z, x };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_10_4_collectelementstobetranslated_greenBBBBFF(Match match,
			Branch i, Command z, Branch x) {
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(x);
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		return new Object[] { match, i, z, x, i__z____negative, i__x____positive };
	}

	public static final Object[] pattern_whileda2branchbc_10_5_collectcontextelements_blackBBBB(Match match, Branch i,
			Command z, Branch x) {
		if (!i.equals(x)) {
			return new Object[] { match, i, z, x };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_10_5_collectcontextelements_greenBB(Match match, Branch i) {
		match.getContextNodes().add(i);
		return new Object[] { match, i };
	}

	public static final void pattern_whileda2branchbc_10_6_registerobjectstomatch_expressionBBBBB(
			whileda2branchbc _this, Match match, Branch i, Command z, Branch x) {
		_this.registerObjectsToMatch_BWD(match, i, z, x);

	}

	public static final boolean pattern_whileda2branchbc_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileda2branchbc_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileda2branchbc_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("i");
		EObject _localVariable_1 = isApplicableMatch.getObject("z");
		EObject _localVariable_2 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_3 = isApplicableMatch.getObject("w");
		EObject _localVariable_4 = isApplicableMatch.getObject("x");
		EObject tmpI = _localVariable_0;
		EObject tmpZ = _localVariable_1;
		EObject tmpW2i = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpX = _localVariable_4;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpZ instanceof Command) {
				Command z = (Command) tmpZ;
				if (tmpW2i instanceof S2B) {
					S2B w2i = (S2B) tmpW2i;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							return new Object[] { i, z, w2i, w, x, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_11_1_performtransformation_blackBBBBBFBB(Branch i, Command z,
			S2B w2i, While w, Branch x, whileda2branchbc _this, IsApplicableMatch isApplicableMatch) {
		if (!i.equals(x)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { i, z, w2i, w, x, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			whileda2branchbc _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whileda2branchbc_11_1_performtransformation_binding = pattern_whileda2branchbc_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_whileda2branchbc_11_1_performtransformation_binding != null) {
			Branch i = (Branch) result_pattern_whileda2branchbc_11_1_performtransformation_binding[0];
			Command z = (Command) result_pattern_whileda2branchbc_11_1_performtransformation_binding[1];
			S2B w2i = (S2B) result_pattern_whileda2branchbc_11_1_performtransformation_binding[2];
			While w = (While) result_pattern_whileda2branchbc_11_1_performtransformation_binding[3];
			Branch x = (Branch) result_pattern_whileda2branchbc_11_1_performtransformation_binding[4];

			Object[] result_pattern_whileda2branchbc_11_1_performtransformation_black = pattern_whileda2branchbc_11_1_performtransformation_blackBBBBBFBB(
					i, z, w2i, w, x, _this, isApplicableMatch);
			if (result_pattern_whileda2branchbc_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileda2branchbc_11_1_performtransformation_black[5];

				return new Object[] { i, z, w2i, w, x, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_11_1_performtransformation_greenFFBBFFB(Command z, While w,
			Branch x) {
		Assignment c = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		w.setNext(c);
		a2x.setTarget(x);
		c2z.setTarget(z);
		c2z.setSource(c);
		w.setFirst(a);
		a2x.setSource(a);
		return new Object[] { c, a2x, z, w, c2z, a, x };
	}

	public static final Object[] pattern_whileda2branchbc_11_2_collecttranslatedelements_blackBBBBBB(Assignment c,
			S2B a2x, Command z, S2N c2z, Decision a, Branch x) {
		return new Object[] { c, a2x, z, c2z, a, x };
	}

	public static final Object[] pattern_whileda2branchbc_11_2_collecttranslatedelements_greenFBBBBBB(Assignment c,
			S2B a2x, Command z, S2N c2z, Decision a, Branch x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(x);
		return new Object[] { ruleresult, c, a2x, z, c2z, a, x };
	}

	public static final Object[] pattern_whileda2branchbc_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject c, EObject a2x, EObject i, EObject z, EObject w2i, EObject w,
			EObject c2z, EObject a, EObject x) {
		if (!c.equals(i)) {
			if (!c.equals(z)) {
				if (!c.equals(w2i)) {
					if (!c.equals(w)) {
						if (!c.equals(c2z)) {
							if (!c.equals(x)) {
								if (!a2x.equals(c)) {
									if (!a2x.equals(i)) {
										if (!a2x.equals(z)) {
											if (!a2x.equals(w2i)) {
												if (!a2x.equals(w)) {
													if (!a2x.equals(c2z)) {
														if (!a2x.equals(x)) {
															if (!i.equals(z)) {
																if (!i.equals(w2i)) {
																	if (!i.equals(w)) {
																		if (!i.equals(x)) {
																			if (!w2i.equals(z)) {
																				if (!w2i.equals(x)) {
																					if (!w.equals(z)) {
																						if (!w.equals(w2i)) {
																							if (!w.equals(x)) {
																								if (!c2z.equals(i)) {
																									if (!c2z.equals(
																											z)) {
																										if (!c2z.equals(
																												w2i)) {
																											if (!c2z.equals(
																													w)) {
																												if (!c2z.equals(
																														x)) {
																													if (!a.equals(
																															c)) {
																														if (!a.equals(
																																a2x)) {
																															if (!a.equals(
																																	i)) {
																																if (!a.equals(
																																		z)) {
																																	if (!a.equals(
																																			w2i)) {
																																		if (!a.equals(
																																				w)) {
																																			if (!a.equals(
																																					c2z)) {
																																				if (!a.equals(
																																						x)) {
																																					if (!x.equals(
																																							z)) {
																																						return new Object[] {
																																								ruleresult,
																																								c,
																																								a2x,
																																								i,
																																								z,
																																								w2i,
																																								w,
																																								c2z,
																																								a,
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
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject c, EObject a2x, EObject i, EObject z, EObject w, EObject c2z,
			EObject a, EObject x) {
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileda2branchbc";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String c2z__z____target_name_prime = "target";
		String c2z__c____source_name_prime = "source";
		String a2x__a____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
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
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		return new Object[] { ruleresult, c, a2x, i, z, w, c2z, a, x, i__z____negative, i__x____positive, w__a____first,
				w__c____next, c2z__z____target, c2z__c____source, a2x__a____source, a2x__x____target };
	}

	public static final void pattern_whileda2branchbc_11_5_registerobjects_expressionBBBBBBBBBBB(whileda2branchbc _this,
			PerformRuleResult ruleresult, EObject c, EObject a2x, EObject i, EObject z, EObject w2i, EObject w,
			EObject c2z, EObject a, EObject x) {
		_this.registerObjects_BWD(ruleresult, c, a2x, i, z, w2i, w, c2z, a, x);

	}

	public static final PerformRuleResult pattern_whileda2branchbc_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileda2branchbc_12_1_preparereturnvalue_bindingFB(whileda2branchbc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_12_1_preparereturnvalue_blackFBB(EClass eClass,
			whileda2branchbc _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_12_1_preparereturnvalue_bindingAndBlackFFB(
			whileda2branchbc _this) {
		Object[] result_pattern_whileda2branchbc_12_1_preparereturnvalue_binding = pattern_whileda2branchbc_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileda2branchbc_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whileda2branchbc_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileda2branchbc_12_1_preparereturnvalue_black = pattern_whileda2branchbc_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whileda2branchbc_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whileda2branchbc_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whileda2branchbc";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whileda2branchbc_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("i");
		EObject _localVariable_1 = match.getObject("z");
		EObject _localVariable_2 = match.getObject("x");
		EObject tmpI = _localVariable_0;
		EObject tmpZ = _localVariable_1;
		EObject tmpX = _localVariable_2;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpZ instanceof Command) {
				Command z = (Command) tmpZ;
				if (tmpX instanceof Branch) {
					Branch x = (Branch) tmpX;
					return new Object[] { i, z, x, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileda2branchbc_12_2_corematch_blackBBFFBB(Branch i, Command z,
			Branch x, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(x)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class, "target")) {
				Statement tmpW = w2i.getSource();
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					_result.add(new Object[] { i, z, w2i, w, x, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileda2branchbc_12_3_findcontext_blackBBBBB(Branch i, Command z,
			S2B w2i, While w, Branch x) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(x)) {
			if (z.equals(i.getNegative())) {
				if (i.equals(w2i.getTarget())) {
					if (x.equals(i.getPositive())) {
						if (w.equals(w2i.getSource())) {
							_result.add(new Object[] { i, z, w2i, w, x });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whileda2branchbc_12_3_findcontext_greenBBBBBFFFFF(Branch i, Command z, S2B w2i,
			While w, Branch x) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String i__z____negative_name_prime = "negative";
		String w2i__i____target_name_prime = "target";
		String i__x____positive_name_prime = "positive";
		String w2i__w____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(x);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		i__z____negative.setName(i__z____negative_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		return new Object[] { i, z, w2i, w, x, isApplicableMatch, i__z____negative, w2i__i____target, i__x____positive,
				w2i__w____source };
	}

	public static final Object[] pattern_whileda2branchbc_12_4_solveCSP_bindingFBBBBBBB(whileda2branchbc _this,
			IsApplicableMatch isApplicableMatch, Branch i, Command z, S2B w2i, While w, Branch x) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, i, z, w2i, w, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, i, z, w2i, w, x };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileda2branchbc_12_4_solveCSP_bindingAndBlackFBBBBBBB(whileda2branchbc _this,
			IsApplicableMatch isApplicableMatch, Branch i, Command z, S2B w2i, While w, Branch x) {
		Object[] result_pattern_whileda2branchbc_12_4_solveCSP_binding = pattern_whileda2branchbc_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, i, z, w2i, w, x);
		if (result_pattern_whileda2branchbc_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileda2branchbc_12_4_solveCSP_binding[0];

			Object[] result_pattern_whileda2branchbc_12_4_solveCSP_black = pattern_whileda2branchbc_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileda2branchbc_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, i, z, w2i, w, x };
			}
		}
		return null;
	}

	public static final boolean pattern_whileda2branchbc_12_5_checkCSP_expressionFBB(whileda2branchbc _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileda2branchbc_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whileda2branchbc_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whileda2branchbc";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whileda2branchbc_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileda2branchbc_20_1_preparereturnvalue_bindingFB(whileda2branchbc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whileda2branchbc _this) {
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

	public static final Object[] pattern_whileda2branchbc_20_1_preparereturnvalue_bindingAndBlackFFBF(
			whileda2branchbc _this) {
		Object[] result_pattern_whileda2branchbc_20_1_preparereturnvalue_binding = pattern_whileda2branchbc_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileda2branchbc_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whileda2branchbc_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileda2branchbc_20_1_preparereturnvalue_black = pattern_whileda2branchbc_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whileda2branchbc_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whileda2branchbc_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whileda2branchbc_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whileda2branchbc_20_2_testcorematchandDECs_black_nac_0B(Command z) {
		for (Graph __DEC_z_root_984428 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_20_2_testcorematchandDECs_black_nac_1BBB(Command z, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_z_positive_711254 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!i.equals(__DEC_z_positive_711254)) {
					if (!x.equals(__DEC_z_positive_711254)) {
						return new Object[] { z, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_20_2_testcorematchandDECs_black_nac_2BBB(Command z, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_z_negative_975407 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!i.equals(__DEC_z_negative_975407)) {
					if (!x.equals(__DEC_z_negative_975407)) {
						return new Object[] { z, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_20_2_testcorematchandDECs_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_636064 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_20_2_testcorematchandDECs_black_nac_4BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_positive_938733 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_938733)) {
					if (!i.equals(__DEC_x_positive_938733)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_20_2_testcorematchandDECs_black_nac_5BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_negative_128419 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_128419)) {
					if (!i.equals(__DEC_x_negative_128419)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_20_2_testcorematchandDECs_black_nac_6BB(Branch i, Command z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_20_2_testcorematchandDECs_black_nac_7BB(Branch x, Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_20_2_testcorematchandDECs_black_nac_8BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_20_2_testcorematchandDECs_black_nac_9BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileda2branchbc_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_negative) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpI = _edge_negative.getSrc();
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			EObject tmpZ = _edge_negative.getTrg();
			if (tmpZ instanceof Command) {
				Command z = (Command) tmpZ;
				if (z.equals(i.getNegative())) {
					Node tmpX = i.getPositive();
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (!i.equals(x)) {
							if (pattern_whileda2branchbc_20_2_testcorematchandDECs_black_nac_0B(z) == null) {
								if (pattern_whileda2branchbc_20_2_testcorematchandDECs_black_nac_6BB(i, z) == null) {
									if (pattern_whileda2branchbc_20_2_testcorematchandDECs_black_nac_1BBB(z, i,
											x) == null) {
										if (pattern_whileda2branchbc_20_2_testcorematchandDECs_black_nac_2BBB(z, i,
												x) == null) {
											if (pattern_whileda2branchbc_20_2_testcorematchandDECs_black_nac_3B(
													x) == null) {
												if (pattern_whileda2branchbc_20_2_testcorematchandDECs_black_nac_4BB(x,
														i) == null) {
													if (pattern_whileda2branchbc_20_2_testcorematchandDECs_black_nac_5BB(
															x, i) == null) {
														if (pattern_whileda2branchbc_20_2_testcorematchandDECs_black_nac_7BB(
																x, z) == null) {
															if (pattern_whileda2branchbc_20_2_testcorematchandDECs_black_nac_8BB(
																	x, z) == null) {
																if (pattern_whileda2branchbc_20_2_testcorematchandDECs_black_nac_9BB(
																		i, x) == null) {
																	_result.add(
																			new Object[] { i, z, x, _edge_negative });
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whileda2branchbc_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whileda2branchbc_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			whileda2branchbc _this, Match match, Branch i, Command z, Branch x) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, i, z, x);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whileda2branchbc_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whileda2branchbc _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileda2branchbc_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whileda2branchbc_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whileda2branchbc_21_1_preparereturnvalue_bindingFB(whileda2branchbc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whileda2branchbc _this) {
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

	public static final Object[] pattern_whileda2branchbc_21_1_preparereturnvalue_bindingAndBlackFFBF(
			whileda2branchbc _this) {
		Object[] result_pattern_whileda2branchbc_21_1_preparereturnvalue_binding = pattern_whileda2branchbc_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileda2branchbc_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whileda2branchbc_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileda2branchbc_21_1_preparereturnvalue_black = pattern_whileda2branchbc_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whileda2branchbc_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whileda2branchbc_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whileda2branchbc_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_0BB(Assignment c,
			Decision a) {
		for (Decision __DEC_c_positive_812929 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_c_positive_812929)) {
				return new Object[] { c, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_1BB(Assignment c,
			Decision a) {
		for (Decision __DEC_c_negative_189530 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_c_negative_189530)) {
				return new Object[] { c, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_2BB(Assignment c,
			While w) {
		for (While __DEC_c_first_118044 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				While.class, "first")) {
			if (!w.equals(__DEC_c_first_118044)) {
				return new Object[] { c, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_3BB(Assignment c,
			While w) {
		for (While __DEC_c_last_896636 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				While.class, "last")) {
			if (!w.equals(__DEC_c_last_896636)) {
				return new Object[] { c, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_4B(Assignment c) {
		for (Program __DEC_c_first_956121 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_5B(Decision a) {
		for (Decision __DEC_a_positive_27096 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_a_positive_27096)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_6B(Decision a) {
		for (Decision __DEC_a_negative_460577 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_a_negative_460577)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_7BB(Decision a, While w) {
		for (While __DEC_a_last_108804 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!w.equals(__DEC_a_last_108804)) {
				return new Object[] { a, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_8B(Decision a) {
		for (Program __DEC_a_first_145688 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_9BB(Decision a,
			Assignment c) {
		if (c.equals(a.getPositive())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_10BB(Decision a,
			Assignment c) {
		if (c.equals(a.getNegative())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_11BB(While w,
			Assignment c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_12BB(While w,
			Assignment c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_13BB(While w,
			Decision a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileda2branchbc_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_first) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpW = _edge_first.getSrc();
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			EObject tmpA = _edge_first.getTrg();
			if (tmpA instanceof Decision) {
				Decision a = (Decision) tmpA;
				if (a.equals(w.getFirst())) {
					Statement tmpC = w.getNext();
					if (tmpC instanceof Assignment) {
						Assignment c = (Assignment) tmpC;
						if (pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_5B(a) == null) {
							if (pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_6B(a) == null) {
								if (pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_7BB(a, w) == null) {
									if (pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_8B(a) == null) {
										if (pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_13BB(w,
												a) == null) {
											if (pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_0BB(c,
													a) == null) {
												if (pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_1BB(c,
														a) == null) {
													if (pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_2BB(
															c, w) == null) {
														if (pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_3BB(
																c, w) == null) {
															if (pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_4B(
																	c) == null) {
																if (pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_9BB(
																		a, c) == null) {
																	if (pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_10BB(
																			a, c) == null) {
																		if (pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_11BB(
																				w, c) == null) {
																			if (pattern_whileda2branchbc_21_2_testcorematchandDECs_black_nac_12BB(
																					w, c) == null) {
																				_result.add(new Object[] { c, w, a,
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

		return _result;
	}

	public static final Object[] pattern_whileda2branchbc_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whileda2branchbc_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			whileda2branchbc _this, Match match, Assignment c, While w, Decision a) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, c, w, a);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whileda2branchbc_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whileda2branchbc _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileda2branchbc_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whileda2branchbc_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whileda2branchbc_24_1_prepare_blackB(whileda2branchbc _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whileda2branchbc_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_whileda2branchbc_24_2_matchsrctrgcontext_bindingFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("c");
		EObject _localVariable_1 = targetMatch.getObject("i");
		EObject _localVariable_2 = targetMatch.getObject("z");
		EObject _localVariable_3 = sourceMatch.getObject("w");
		EObject _localVariable_4 = sourceMatch.getObject("a");
		EObject _localVariable_5 = targetMatch.getObject("x");
		EObject tmpC = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpX = _localVariable_5;
		if (tmpC instanceof Assignment) {
			Assignment c = (Assignment) tmpC;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpZ instanceof Command) {
					Command z = (Command) tmpZ;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						if (tmpA instanceof Decision) {
							Decision a = (Decision) tmpA;
							if (tmpX instanceof Branch) {
								Branch x = (Branch) tmpX;
								return new Object[] { c, i, z, w, a, x, sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_24_2_matchsrctrgcontext_blackBBBBBBBB(Assignment c, Branch i,
			Command z, While w, Decision a, Branch x, Match sourceMatch, Match targetMatch) {
		if (!i.equals(x)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { c, i, z, w, a, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileda2branchbc_24_2_matchsrctrgcontext_binding = pattern_whileda2branchbc_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_whileda2branchbc_24_2_matchsrctrgcontext_binding != null) {
			Assignment c = (Assignment) result_pattern_whileda2branchbc_24_2_matchsrctrgcontext_binding[0];
			Branch i = (Branch) result_pattern_whileda2branchbc_24_2_matchsrctrgcontext_binding[1];
			Command z = (Command) result_pattern_whileda2branchbc_24_2_matchsrctrgcontext_binding[2];
			While w = (While) result_pattern_whileda2branchbc_24_2_matchsrctrgcontext_binding[3];
			Decision a = (Decision) result_pattern_whileda2branchbc_24_2_matchsrctrgcontext_binding[4];
			Branch x = (Branch) result_pattern_whileda2branchbc_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_whileda2branchbc_24_2_matchsrctrgcontext_black = pattern_whileda2branchbc_24_2_matchsrctrgcontext_blackBBBBBBBB(
					c, i, z, w, a, x, sourceMatch, targetMatch);
			if (result_pattern_whileda2branchbc_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { c, i, z, w, a, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_24_3_solvecsp_bindingFBBBBBBBBB(whileda2branchbc _this,
			Assignment c, Branch i, Command z, While w, Decision a, Branch x, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(c, i, z, w, a, x, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, c, i, z, w, a, x, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileda2branchbc_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			whileda2branchbc _this, Assignment c, Branch i, Command z, While w, Decision a, Branch x, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_whileda2branchbc_24_3_solvecsp_binding = pattern_whileda2branchbc_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, c, i, z, w, a, x, sourceMatch, targetMatch);
		if (result_pattern_whileda2branchbc_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whileda2branchbc_24_3_solvecsp_binding[0];

			Object[] result_pattern_whileda2branchbc_24_3_solvecsp_black = pattern_whileda2branchbc_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whileda2branchbc_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, c, i, z, w, a, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whileda2branchbc_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileda2branchbc_24_5_matchcorrcontext_blackBFBBB(Branch i, While w,
			Match sourceMatch, Match targetMatch) {
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

	public static final Object[] pattern_whileda2branchbc_24_5_matchcorrcontext_greenBBBF(S2B w2i, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "whileda2branchbc";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(w2i);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { w2i, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_whileda2branchbc_24_6_createcorrespondence_blackBBBBBBB(Assignment c, Branch i,
			Command z, While w, Decision a, Branch x, CCMatch ccMatch) {
		if (!i.equals(x)) {
			return new Object[] { c, i, z, w, a, x, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_24_6_createcorrespondence_greenBFBFBBB(Assignment c,
			Command z, Decision a, Branch x, CCMatch ccMatch) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		c2z.setTarget(z);
		c2z.setSource(c);
		ccMatch.getCreateCorr().add(c2z);
		return new Object[] { c, a2x, z, c2z, a, x, ccMatch };
	}

	public static final Object[] pattern_whileda2branchbc_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_whileda2branchbc_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "whileda2branchbc";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_whileda2branchbc_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_0BB(Assignment c, Decision a) {
		for (Decision __DEC_c_positive_657928 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_c_positive_657928)) {
				return new Object[] { c, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_1BB(Assignment c, Decision a) {
		for (Decision __DEC_c_negative_861519 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_c_negative_861519)) {
				return new Object[] { c, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_2BB(Assignment c, While w) {
		for (While __DEC_c_first_977636 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				While.class, "first")) {
			if (!w.equals(__DEC_c_first_977636)) {
				return new Object[] { c, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_3BB(Assignment c, While w) {
		for (While __DEC_c_last_115588 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				While.class, "last")) {
			if (!w.equals(__DEC_c_last_115588)) {
				return new Object[] { c, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_4B(Assignment c) {
		for (Program __DEC_c_first_257454 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_5B(Decision a) {
		for (Decision __DEC_a_positive_239326 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_a_positive_239326)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_6B(Decision a) {
		for (Decision __DEC_a_negative_718675 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_a_negative_718675)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_7BB(Decision a, While w) {
		for (While __DEC_a_last_26066 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!w.equals(__DEC_a_last_26066)) {
				return new Object[] { a, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_8B(Decision a) {
		for (Program __DEC_a_first_880214 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_9BB(Decision a, Assignment c) {
		if (c.equals(a.getPositive())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_10BB(Decision a,
			Assignment c) {
		if (c.equals(a.getNegative())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_11BB(While w, Assignment c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_12BB(While w, Assignment c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_13BB(While w, Decision a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_27_1_matchtggpattern_blackBBB(Assignment c, While w,
			Decision a) {
		if (a.equals(w.getFirst())) {
			if (c.equals(w.getNext())) {
				if (pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_0BB(c, a) == null) {
					if (pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_1BB(c, a) == null) {
						if (pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_2BB(c, w) == null) {
							if (pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_3BB(c, w) == null) {
								if (pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_4B(c) == null) {
									if (pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_5B(a) == null) {
										if (pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_6B(a) == null) {
											if (pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_7BB(a,
													w) == null) {
												if (pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_8B(
														a) == null) {
													if (pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_9BB(a,
															c) == null) {
														if (pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_10BB(
																a, c) == null) {
															if (pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_11BB(
																	w, c) == null) {
																if (pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_12BB(
																		w, c) == null) {
																	if (pattern_whileda2branchbc_27_1_matchtggpattern_black_nac_13BB(
																			w, a) == null) {
																		return new Object[] { c, w, a };
																	}
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_whileda2branchbc_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileda2branchbc_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileda2branchbc_28_1_matchtggpattern_black_nac_0B(Command z) {
		for (Graph __DEC_z_root_268009 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_28_1_matchtggpattern_black_nac_1BBB(Command z, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_z_positive_696581 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!i.equals(__DEC_z_positive_696581)) {
					if (!x.equals(__DEC_z_positive_696581)) {
						return new Object[] { z, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_28_1_matchtggpattern_black_nac_2BBB(Command z, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_z_negative_689487 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!i.equals(__DEC_z_negative_689487)) {
					if (!x.equals(__DEC_z_negative_689487)) {
						return new Object[] { z, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_28_1_matchtggpattern_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_119610 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_28_1_matchtggpattern_black_nac_4BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_positive_410835 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_410835)) {
					if (!i.equals(__DEC_x_positive_410835)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_28_1_matchtggpattern_black_nac_5BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_negative_687860 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_687860)) {
					if (!i.equals(__DEC_x_negative_687860)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_28_1_matchtggpattern_black_nac_6BB(Branch i, Command z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_28_1_matchtggpattern_black_nac_7BB(Branch x, Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_28_1_matchtggpattern_black_nac_8BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_28_1_matchtggpattern_black_nac_9BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_28_1_matchtggpattern_blackBBB(Branch i, Command z, Branch x) {
		if (!i.equals(x)) {
			if (z.equals(i.getNegative())) {
				if (x.equals(i.getPositive())) {
					if (pattern_whileda2branchbc_28_1_matchtggpattern_black_nac_0B(z) == null) {
						if (pattern_whileda2branchbc_28_1_matchtggpattern_black_nac_1BBB(z, i, x) == null) {
							if (pattern_whileda2branchbc_28_1_matchtggpattern_black_nac_2BBB(z, i, x) == null) {
								if (pattern_whileda2branchbc_28_1_matchtggpattern_black_nac_3B(x) == null) {
									if (pattern_whileda2branchbc_28_1_matchtggpattern_black_nac_4BB(x, i) == null) {
										if (pattern_whileda2branchbc_28_1_matchtggpattern_black_nac_5BB(x, i) == null) {
											if (pattern_whileda2branchbc_28_1_matchtggpattern_black_nac_6BB(i,
													z) == null) {
												if (pattern_whileda2branchbc_28_1_matchtggpattern_black_nac_7BB(x,
														z) == null) {
													if (pattern_whileda2branchbc_28_1_matchtggpattern_black_nac_8BB(x,
															z) == null) {
														if (pattern_whileda2branchbc_28_1_matchtggpattern_black_nac_9BB(
																i, x) == null) {
															return new Object[] { i, z, x };
														}
													}
												}
											}
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

	public static final boolean pattern_whileda2branchbc_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileda2branchbc_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileda2branchbc_29_1_createresult_blackB(whileda2branchbc _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whileda2branchbc_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_whileda2branchbc_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileda2branchbc_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_whileda2branchbc_29_2_isapplicablecore_black_nac_1BB(ruleResult, w2i) == null) {
								if (pattern_whileda2branchbc_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										i) == null) {
									if (pattern_whileda2branchbc_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_whileda2branchbc_29_3_solveCSP_bindingFBBBBBB(whileda2branchbc _this,
			IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, While w, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, i, w2i, w, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, i, w2i, w, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whileda2branchbc_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileda2branchbc_29_3_solveCSP_bindingAndBlackFBBBBBB(whileda2branchbc _this,
			IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, While w, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whileda2branchbc_29_3_solveCSP_binding = pattern_whileda2branchbc_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, i, w2i, w, ruleResult);
		if (result_pattern_whileda2branchbc_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileda2branchbc_29_3_solveCSP_binding[0];

			Object[] result_pattern_whileda2branchbc_29_3_solveCSP_black = pattern_whileda2branchbc_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whileda2branchbc_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, i, w2i, w, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whileda2branchbc_29_4_checkCSP_expressionFBB(whileda2branchbc _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileda2branchbc_29_5_checknacs_blackBBB(Branch i, S2B w2i, While w) {
		return new Object[] { i, w2i, w };
	}

	public static final Object[] pattern_whileda2branchbc_29_6_perform_blackBBBB(Branch i, S2B w2i, While w,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { i, w2i, w, ruleResult };
	}

	public static final Object[] pattern_whileda2branchbc_29_6_perform_greenFFBFBFFFB(Branch i, While w,
			ModelgeneratorRuleResult ruleResult) {
		Assignment c = SourcecodeFactory.eINSTANCE.createAssignment();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2N c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		w.setNext(c);
		ruleResult.getSourceObjects().add(c);
		ruleResult.getCorrObjects().add(a2x);
		i.setNegative(z);
		ruleResult.getTargetObjects().add(z);
		c2z.setTarget(z);
		c2z.setSource(c);
		ruleResult.getCorrObjects().add(c2z);
		w.setFirst(a);
		a2x.setSource(a);
		ruleResult.getSourceObjects().add(a);
		i.setPositive(x);
		a2x.setTarget(x);
		ruleResult.getTargetObjects().add(x);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { c, a2x, i, z, w, c2z, a, x, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whileda2branchbc_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whileda2branchbcImpl
