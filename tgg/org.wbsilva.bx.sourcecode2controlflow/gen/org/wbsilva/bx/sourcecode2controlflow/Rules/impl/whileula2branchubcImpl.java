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
import org.wbsilva.bx.sourcecode2controlflow.Rules.whileula2branchubc;

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
 * An implementation of the model object '<em><b>whileula2branchubc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class whileula2branchubcImpl extends AbstractRuleImpl implements whileula2branchubc {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected whileula2branchubcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getwhileula2branchubc();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, While a, While w, Assignment b, Assignment c) {

		Object[] result1_black = whileula2branchubcImpl.pattern_whileula2branchubc_0_1_initialbindings_blackBBBBBB(this,
				match, a, w, b, c);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[b] = " + b + ", "
					+ "[c] = " + c + ".");
		}

		Object[] result2_bindingAndBlack = whileula2branchubcImpl
				.pattern_whileula2branchubc_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, a, w, b, c);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[b] = " + b + ", "
					+ "[c] = " + c + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileula2branchubcImpl.pattern_whileula2branchubc_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileula2branchubcImpl
					.pattern_whileula2branchubc_0_4_collectelementstobetranslated_blackBBBBB(match, a, w, b, c);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[c] = " + c + ".");
			}
			whileula2branchubcImpl.pattern_whileula2branchubc_0_4_collectelementstobetranslated_greenBBBBBFFFF(match, a,
					w, b, c);
			//nothing EMoflonEdge a__b____first = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[8];

			Object[] result5_black = whileula2branchubcImpl
					.pattern_whileula2branchubc_0_5_collectcontextelements_blackBBBBB(match, a, w, b, c);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[c] = " + c + ".");
			}
			whileula2branchubcImpl.pattern_whileula2branchubc_0_5_collectcontextelements_greenBB(match, w);

			// 
			whileula2branchubcImpl.pattern_whileula2branchubc_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					a, w, b, c);
			return whileula2branchubcImpl.pattern_whileula2branchubc_0_7_expressionF();
		} else {
			return whileula2branchubcImpl.pattern_whileula2branchubc_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whileula2branchubcImpl
				.pattern_whileula2branchubc_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		S2B w2i = (S2B) result1_bindingAndBlack[0];
		Branch i = (Branch) result1_bindingAndBlack[1];
		While a = (While) result1_bindingAndBlack[2];
		While w = (While) result1_bindingAndBlack[3];
		Assignment b = (Assignment) result1_bindingAndBlack[4];
		Assignment c = (Assignment) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whileula2branchubcImpl
				.pattern_whileula2branchubc_1_1_performtransformation_greenFFBFBFBFBF(i, a, b, c);
		S2N c2z = (S2N) result1_green[0];
		S2N b2y = (S2N) result1_green[1];
		Command z = (Command) result1_green[3];
		S2B a2x = (S2B) result1_green[5];
		Command y = (Command) result1_green[7];
		Branch x = (Branch) result1_green[9];

		Object[] result2_black = whileula2branchubcImpl
				.pattern_whileula2branchubc_1_2_collecttranslatedelements_blackBBBBBBBBB(c2z, b2y, z, a, a2x, b, y, c,
						x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c2z] = " + c2z + ", "
					+ "[b2y] = " + b2y + ", " + "[z] = " + z + ", " + "[a] = " + a + ", " + "[a2x] = " + a2x + ", "
					+ "[b] = " + b + ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[x] = " + x + ".");
		}
		Object[] result2_green = whileula2branchubcImpl
				.pattern_whileula2branchubc_1_2_collecttranslatedelements_greenFBBBBBBBBB(c2z, b2y, z, a, a2x, b, y, c,
						x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileula2branchubcImpl
				.pattern_whileula2branchubc_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, w2i, c2z, b2y, i, z,
						a, w, a2x, b, y, c, x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[w2i] = " + w2i + ", " + "[c2z] = " + c2z + ", " + "[b2y] = " + b2y + ", " + "[i] = " + i
					+ ", " + "[z] = " + z + ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[a2x] = " + a2x + ", "
					+ "[b] = " + b + ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[x] = " + x + ".");
		}
		whileula2branchubcImpl.pattern_whileula2branchubc_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, c2z, b2y, i, z, a, w, a2x, b, y, c, x);
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[25];

		// 
		// 
		whileula2branchubcImpl.pattern_whileula2branchubc_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
				w2i, c2z, b2y, i, z, a, w, a2x, b, y, c, x);
		return whileula2branchubcImpl.pattern_whileula2branchubc_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = whileula2branchubcImpl
				.pattern_whileula2branchubc_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whileula2branchubcImpl
				.pattern_whileula2branchubc_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whileula2branchubcImpl.pattern_whileula2branchubc_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		While a = (While) result2_binding[0];
		While w = (While) result2_binding[1];
		Assignment b = (Assignment) result2_binding[2];
		Assignment c = (Assignment) result2_binding[3];
		for (Object[] result2_black : whileula2branchubcImpl.pattern_whileula2branchubc_2_2_corematch_blackFFBBBBB(a, w,
				b, c, match)) {
			S2B w2i = (S2B) result2_black[0];
			Branch i = (Branch) result2_black[1];
			// ForEach 
			for (Object[] result3_black : whileula2branchubcImpl
					.pattern_whileula2branchubc_2_3_findcontext_blackBBBBBB(w2i, i, a, w, b, c)) {
				Object[] result3_green = whileula2branchubcImpl
						.pattern_whileula2branchubc_2_3_findcontext_greenBBBBBBFFFFFFF(w2i, i, a, w, b, c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = whileula2branchubcImpl
						.pattern_whileula2branchubc_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, w2i,
								i, a, w, b, c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w2i] = " + w2i + ", " + "[i] = "
							+ i + ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[c] = " + c
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whileula2branchubcImpl.pattern_whileula2branchubc_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whileula2branchubcImpl
							.pattern_whileula2branchubc_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whileula2branchubcImpl.pattern_whileula2branchubc_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whileula2branchubcImpl.pattern_whileula2branchubc_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, While a, While w, Assignment b, Assignment c) {
		match.registerObject("a", a);
		match.registerObject("w", w);
		match.registerObject("b", b);
		match.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, While a, While w, Assignment b, Assignment c) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, S2B w2i, Branch i, While a, While w,
			Assignment b, Assignment c) {// Create CSP
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
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("c", c);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject w2i, EObject c2z, EObject b2y, EObject i,
			EObject z, EObject a, EObject w, EObject a2x, EObject b, EObject y, EObject c, EObject x) {
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass())
						.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch i, Command z, Command y, Branch x) {

		Object[] result1_black = whileula2branchubcImpl
				.pattern_whileula2branchubc_10_1_initialbindings_blackBBBBBB(this, match, i, z, y, x);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[i] = " + i + ", " + "[z] = " + z + ", " + "[y] = " + y + ", "
					+ "[x] = " + x + ".");
		}

		Object[] result2_bindingAndBlack = whileula2branchubcImpl
				.pattern_whileula2branchubc_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, i, z, y, x);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[i] = " + i + ", " + "[z] = " + z + ", " + "[y] = " + y + ", "
					+ "[x] = " + x + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileula2branchubcImpl.pattern_whileula2branchubc_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileula2branchubcImpl
					.pattern_whileula2branchubc_10_4_collectelementstobetranslated_blackBBBBB(match, i, z, y, x);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[i] = " + i + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[x] = " + x + ".");
			}
			whileula2branchubcImpl.pattern_whileula2branchubc_10_4_collectelementstobetranslated_greenBBBBBFFFF(match,
					i, z, y, x);
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge y__x____next = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result4_green[8];

			Object[] result5_black = whileula2branchubcImpl
					.pattern_whileula2branchubc_10_5_collectcontextelements_blackBBBBB(match, i, z, y, x);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[i] = " + i + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[x] = " + x + ".");
			}
			whileula2branchubcImpl.pattern_whileula2branchubc_10_5_collectcontextelements_greenBB(match, i);

			// 
			whileula2branchubcImpl.pattern_whileula2branchubc_10_6_registerobjectstomatch_expressionBBBBBB(this, match,
					i, z, y, x);
			return whileula2branchubcImpl.pattern_whileula2branchubc_10_7_expressionF();
		} else {
			return whileula2branchubcImpl.pattern_whileula2branchubc_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whileula2branchubcImpl
				.pattern_whileula2branchubc_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		S2B w2i = (S2B) result1_bindingAndBlack[0];
		Branch i = (Branch) result1_bindingAndBlack[1];
		Command z = (Command) result1_bindingAndBlack[2];
		While w = (While) result1_bindingAndBlack[3];
		Command y = (Command) result1_bindingAndBlack[4];
		Branch x = (Branch) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whileula2branchubcImpl
				.pattern_whileula2branchubc_11_1_performtransformation_greenFFBFBFFBFB(z, w, y, x);
		S2N c2z = (S2N) result1_green[0];
		S2N b2y = (S2N) result1_green[1];
		While a = (While) result1_green[3];
		S2B a2x = (S2B) result1_green[5];
		Assignment b = (Assignment) result1_green[6];
		Assignment c = (Assignment) result1_green[8];

		Object[] result2_black = whileula2branchubcImpl
				.pattern_whileula2branchubc_11_2_collecttranslatedelements_blackBBBBBBBBB(c2z, b2y, z, a, a2x, b, y, c,
						x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c2z] = " + c2z + ", "
					+ "[b2y] = " + b2y + ", " + "[z] = " + z + ", " + "[a] = " + a + ", " + "[a2x] = " + a2x + ", "
					+ "[b] = " + b + ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[x] = " + x + ".");
		}
		Object[] result2_green = whileula2branchubcImpl
				.pattern_whileula2branchubc_11_2_collecttranslatedelements_greenFBBBBBBBBB(c2z, b2y, z, a, a2x, b, y, c,
						x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileula2branchubcImpl
				.pattern_whileula2branchubc_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, w2i, c2z, b2y, i, z,
						a, w, a2x, b, y, c, x);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[w2i] = " + w2i + ", " + "[c2z] = " + c2z + ", " + "[b2y] = " + b2y + ", " + "[i] = " + i
					+ ", " + "[z] = " + z + ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[a2x] = " + a2x + ", "
					+ "[b] = " + b + ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[x] = " + x + ".");
		}
		whileula2branchubcImpl.pattern_whileula2branchubc_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, c2z, b2y, i, z, a, w, a2x, b, y, c, x);
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[25];

		// 
		// 
		whileula2branchubcImpl.pattern_whileula2branchubc_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this,
				ruleresult, w2i, c2z, b2y, i, z, a, w, a2x, b, y, c, x);
		return whileula2branchubcImpl.pattern_whileula2branchubc_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = whileula2branchubcImpl
				.pattern_whileula2branchubc_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whileula2branchubcImpl
				.pattern_whileula2branchubc_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whileula2branchubcImpl.pattern_whileula2branchubc_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Branch i = (Branch) result2_binding[0];
		Command z = (Command) result2_binding[1];
		Command y = (Command) result2_binding[2];
		Branch x = (Branch) result2_binding[3];
		for (Object[] result2_black : whileula2branchubcImpl.pattern_whileula2branchubc_12_2_corematch_blackFBBFBBB(i,
				z, y, x, match)) {
			S2B w2i = (S2B) result2_black[0];
			While w = (While) result2_black[3];
			// ForEach 
			for (Object[] result3_black : whileula2branchubcImpl
					.pattern_whileula2branchubc_12_3_findcontext_blackBBBBBB(w2i, i, z, w, y, x)) {
				Object[] result3_green = whileula2branchubcImpl
						.pattern_whileula2branchubc_12_3_findcontext_greenBBBBBBFFFFFFF(w2i, i, z, w, y, x);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = whileula2branchubcImpl
						.pattern_whileula2branchubc_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, w2i,
								i, z, w, y, x);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w2i] = " + w2i + ", " + "[i] = "
							+ i + ", " + "[z] = " + z + ", " + "[w] = " + w + ", " + "[y] = " + y + ", " + "[x] = " + x
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whileula2branchubcImpl.pattern_whileula2branchubc_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whileula2branchubcImpl
							.pattern_whileula2branchubc_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whileula2branchubcImpl.pattern_whileula2branchubc_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whileula2branchubcImpl.pattern_whileula2branchubc_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Branch i, Command z, Command y, Branch x) {
		match.registerObject("i", i);
		match.registerObject("z", z);
		match.registerObject("y", y);
		match.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch i, Command z, Command y, Branch x) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, S2B w2i, Branch i, Command z, While w,
			Command y, Branch x) {// Create CSP
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
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("y", y);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject w2i, EObject c2z, EObject b2y, EObject i,
			EObject z, EObject a, EObject w, EObject a2x, EObject b, EObject y, EObject c, EObject x) {
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("c", c);
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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_22(EMoflonEdge _edge_negative) {

		Object[] result1_bindingAndBlack = whileula2branchubcImpl
				.pattern_whileula2branchubc_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whileula2branchubcImpl.pattern_whileula2branchubc_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whileula2branchubcImpl
				.pattern_whileula2branchubc_20_2_testcorematchandDECs_blackFFFFB(_edge_negative)) {
			Branch i = (Branch) result2_black[0];
			Command z = (Command) result2_black[1];
			Command y = (Command) result2_black[2];
			Branch x = (Branch) result2_black[3];
			Object[] result2_green = whileula2branchubcImpl
					.pattern_whileula2branchubc_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileula2branchubcImpl
					.pattern_whileula2branchubc_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, i, z, y, x)) {
				// 
				if (whileula2branchubcImpl
						.pattern_whileula2branchubc_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = whileula2branchubcImpl
							.pattern_whileula2branchubc_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whileula2branchubcImpl.pattern_whileula2branchubc_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whileula2branchubcImpl.pattern_whileula2branchubc_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_23(EMoflonEdge _edge_first) {

		Object[] result1_bindingAndBlack = whileula2branchubcImpl
				.pattern_whileula2branchubc_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whileula2branchubcImpl.pattern_whileula2branchubc_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whileula2branchubcImpl
				.pattern_whileula2branchubc_21_2_testcorematchandDECs_blackFFFFB(_edge_first)) {
			While a = (While) result2_black[0];
			While w = (While) result2_black[1];
			Assignment b = (Assignment) result2_black[2];
			Assignment c = (Assignment) result2_black[3];
			Object[] result2_green = whileula2branchubcImpl
					.pattern_whileula2branchubc_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileula2branchubcImpl
					.pattern_whileula2branchubc_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, a, w, b, c)) {
				// 
				if (whileula2branchubcImpl
						.pattern_whileula2branchubc_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = whileula2branchubcImpl
							.pattern_whileula2branchubc_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whileula2branchubcImpl.pattern_whileula2branchubc_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whileula2branchubcImpl.pattern_whileula2branchubc_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("whileula2branchubc");
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
		ruleResult.setRule("whileula2branchubc");
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

		Object[] result1_black = whileula2branchubcImpl.pattern_whileula2branchubc_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whileula2branchubcImpl.pattern_whileula2branchubc_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = whileula2branchubcImpl
				.pattern_whileula2branchubc_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Branch i = (Branch) result2_bindingAndBlack[0];
		Command z = (Command) result2_bindingAndBlack[1];
		While a = (While) result2_bindingAndBlack[2];
		While w = (While) result2_bindingAndBlack[3];
		Assignment b = (Assignment) result2_bindingAndBlack[4];
		Command y = (Command) result2_bindingAndBlack[5];
		Assignment c = (Assignment) result2_bindingAndBlack[6];
		Branch x = (Branch) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = whileula2branchubcImpl
				.pattern_whileula2branchubc_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, i, z, a, w, b, y, c, x,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[i] = " + i + ", " + "[z] = " + z + ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[b] = "
					+ b + ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[x] = " + x + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whileula2branchubcImpl.pattern_whileula2branchubc_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whileula2branchubcImpl
					.pattern_whileula2branchubc_24_5_matchcorrcontext_blackFBBBB(i, w, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[0];
				Object[] result5_green = whileula2branchubcImpl
						.pattern_whileula2branchubc_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whileula2branchubcImpl
						.pattern_whileula2branchubc_24_6_createcorrespondence_blackBBBBBBBBB(i, z, a, w, b, y, c, x,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[i] = " + i + ", "
							+ "[z] = " + z + ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[b] = " + b + ", "
							+ "[y] = " + y + ", " + "[c] = " + c + ", " + "[x] = " + x + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				whileula2branchubcImpl.pattern_whileula2branchubc_24_6_createcorrespondence_greenFFBBFBBBBB(z, a, b, y,
						c, x, ccMatch);
				//nothing S2N c2z = (S2N) result6_green[0];
				//nothing S2N b2y = (S2N) result6_green[1];
				//nothing S2B a2x = (S2B) result6_green[4];

				Object[] result7_black = whileula2branchubcImpl
						.pattern_whileula2branchubc_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whileula2branchubcImpl.pattern_whileula2branchubc_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return whileula2branchubcImpl.pattern_whileula2branchubc_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Branch i, Command z, While a, While w, Assignment b, Command y, Assignment c,
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
	public boolean checkDEC_FWD(While a, While w, Assignment b, Assignment c) {// 
		Object[] result1_black = whileula2branchubcImpl.pattern_whileula2branchubc_27_1_matchtggpattern_blackBBBB(a, w,
				b, c);
		if (result1_black != null) {
			return whileula2branchubcImpl.pattern_whileula2branchubc_27_2_expressionF();
		} else {
			return whileula2branchubcImpl.pattern_whileula2branchubc_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Branch i, Command z, Command y, Branch x) {// 
		Object[] result1_black = whileula2branchubcImpl.pattern_whileula2branchubc_28_1_matchtggpattern_blackBBBB(i, z,
				y, x);
		if (result1_black != null) {
			return whileula2branchubcImpl.pattern_whileula2branchubc_28_2_expressionF();
		} else {
			return whileula2branchubcImpl.pattern_whileula2branchubc_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B w2iParameter) {

		Object[] result1_black = whileula2branchubcImpl.pattern_whileula2branchubc_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whileula2branchubcImpl.pattern_whileula2branchubc_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : whileula2branchubcImpl
				.pattern_whileula2branchubc_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList w2iList = (RuleEntryList) result2_black[0];
			S2B w2i = (S2B) result2_black[1];
			Branch i = (Branch) result2_black[2];
			While w = (While) result2_black[3];

			Object[] result3_bindingAndBlack = whileula2branchubcImpl
					.pattern_whileula2branchubc_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, w2i, i, w,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w2i] = " + w2i + ", " + "[i] = " + i
						+ ", " + "[w] = " + w + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whileula2branchubcImpl.pattern_whileula2branchubc_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whileula2branchubcImpl.pattern_whileula2branchubc_29_5_checknacs_blackBBB(w2i,
						i, w);
				if (result5_black != null) {

					Object[] result6_black = whileula2branchubcImpl
							.pattern_whileula2branchubc_29_6_perform_blackBBBB(w2i, i, w, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w2i] = " + w2i + ", "
								+ "[i] = " + i + ", " + "[w] = " + w + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whileula2branchubcImpl.pattern_whileula2branchubc_29_6_perform_greenFFBFFBFFFFFB(i, w, ruleResult);
					//nothing S2N c2z = (S2N) result6_green[0];
					//nothing S2N b2y = (S2N) result6_green[1];
					//nothing Command z = (Command) result6_green[3];
					//nothing While a = (While) result6_green[4];
					//nothing S2B a2x = (S2B) result6_green[6];
					//nothing Assignment b = (Assignment) result6_green[7];
					//nothing Command y = (Command) result6_green[8];
					//nothing Assignment c = (Assignment) result6_green[9];
					//nothing Branch x = (Branch) result6_green[10];

				} else {
				}

			} else {
			}

		}
		return whileula2branchubcImpl.pattern_whileula2branchubc_29_7_expressionFB(ruleResult);
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
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPROPRIATE_FWD__MATCH_WHILE_WHILE_ASSIGNMENT_ASSIGNMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.WHILEULA2BRANCHUBC___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WHILE_WHILE_ASSIGNMENT_ASSIGNMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (Assignment) arguments.get(4));
			return null;
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WHILE_WHILE_ASSIGNMENT_ASSIGNMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_S2B_BRANCH_WHILE_WHILE_ASSIGNMENT_ASSIGNMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Branch) arguments.get(2), (While) arguments.get(3), (While) arguments.get(4),
					(Assignment) arguments.get(5), (Assignment) arguments.get(6));
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.WHILEULA2BRANCHUBC___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPROPRIATE_BWD__MATCH_BRANCH_COMMAND_COMMAND_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.WHILEULA2BRANCHUBC___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_COMMAND_COMMAND_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
			return null;
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_COMMAND_COMMAND_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_BRANCH_COMMAND_WHILE_COMMAND_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (While) arguments.get(4),
					(Command) arguments.get(5), (Branch) arguments.get(6));
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.WHILEULA2BRANCHUBC___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPROPRIATE_BWD_EMOFLON_EDGE_22__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_22((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPROPRIATE_FWD_EMOFLON_EDGE_23__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_23((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPLICABLE_SOLVE_CSP_CC__BRANCH_COMMAND_WHILE_WHILE_ASSIGNMENT_COMMAND_ASSIGNMENT_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Branch) arguments.get(0), (Command) arguments.get(1),
					(While) arguments.get(2), (While) arguments.get(3), (Assignment) arguments.get(4),
					(Command) arguments.get(5), (Assignment) arguments.get(6), (Branch) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___CHECK_DEC_FWD__WHILE_WHILE_ASSIGNMENT_ASSIGNMENT:
			return checkDEC_FWD((While) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(Assignment) arguments.get(3));
		case RulesPackage.WHILEULA2BRANCHUBC___CHECK_DEC_BWD__BRANCH_COMMAND_COMMAND_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Command) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.WHILEULA2BRANCHUBC___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILEULA2BRANCHUBC___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_BRANCH_WHILE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Branch) arguments.get(2), (While) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILEULA2BRANCHUBC___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whileula2branchubc_0_1_initialbindings_blackBBBBBB(whileula2branchubc _this,
			Match match, While a, While w, Assignment b, Assignment c) {
		if (!a.equals(w)) {
			if (!b.equals(c)) {
				return new Object[] { _this, match, a, w, b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_0_2_SolveCSP_bindingFBBBBBB(whileula2branchubc _this,
			Match match, While a, While w, Assignment b, Assignment c) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, a, w, b, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, a, w, b, c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileula2branchubc_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			whileula2branchubc _this, Match match, While a, While w, Assignment b, Assignment c) {
		Object[] result_pattern_whileula2branchubc_0_2_SolveCSP_binding = pattern_whileula2branchubc_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, a, w, b, c);
		if (result_pattern_whileula2branchubc_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileula2branchubc_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whileula2branchubc_0_2_SolveCSP_black = pattern_whileula2branchubc_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileula2branchubc_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, a, w, b, c };
			}
		}
		return null;
	}

	public static final boolean pattern_whileula2branchubc_0_3_CheckCSP_expressionFBB(whileula2branchubc _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileula2branchubc_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			While a, While w, Assignment b, Assignment c) {
		if (!a.equals(w)) {
			if (!b.equals(c)) {
				return new Object[] { match, a, w, b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_0_4_collectelementstobetranslated_greenBBBBBFFFF(
			Match match, While a, While w, Assignment b, Assignment c) {
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(c);
		String a__b____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String a__b____last_name_prime = "last";
		String w__a____first_name_prime = "first";
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____last);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		a__b____first.setName(a__b____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		return new Object[] { match, a, w, b, c, a__b____first, w__c____next, a__b____last, w__a____first };
	}

	public static final Object[] pattern_whileula2branchubc_0_5_collectcontextelements_blackBBBBB(Match match, While a,
			While w, Assignment b, Assignment c) {
		if (!a.equals(w)) {
			if (!b.equals(c)) {
				return new Object[] { match, a, w, b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whileula2branchubc_0_6_registerobjectstomatch_expressionBBBBBB(
			whileula2branchubc _this, Match match, While a, While w, Assignment b, Assignment c) {
		_this.registerObjectsToMatch_FWD(match, a, w, b, c);

	}

	public static final boolean pattern_whileula2branchubc_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileula2branchubc_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileula2branchubc_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_1 = isApplicableMatch.getObject("i");
		EObject _localVariable_2 = isApplicableMatch.getObject("a");
		EObject _localVariable_3 = isApplicableMatch.getObject("w");
		EObject _localVariable_4 = isApplicableMatch.getObject("b");
		EObject _localVariable_5 = isApplicableMatch.getObject("c");
		EObject tmpW2i = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpB = _localVariable_4;
		EObject tmpC = _localVariable_5;
		if (tmpW2i instanceof S2B) {
			S2B w2i = (S2B) tmpW2i;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						if (tmpB instanceof Assignment) {
							Assignment b = (Assignment) tmpB;
							if (tmpC instanceof Assignment) {
								Assignment c = (Assignment) tmpC;
								return new Object[] { w2i, i, a, w, b, c, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_1_1_performtransformation_blackBBBBBBFBB(S2B w2i, Branch i,
			While a, While w, Assignment b, Assignment c, whileula2branchubc _this,
			IsApplicableMatch isApplicableMatch) {
		if (!a.equals(w)) {
			if (!b.equals(c)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { w2i, i, a, w, b, c, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			whileula2branchubc _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whileula2branchubc_1_1_performtransformation_binding = pattern_whileula2branchubc_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_whileula2branchubc_1_1_performtransformation_binding != null) {
			S2B w2i = (S2B) result_pattern_whileula2branchubc_1_1_performtransformation_binding[0];
			Branch i = (Branch) result_pattern_whileula2branchubc_1_1_performtransformation_binding[1];
			While a = (While) result_pattern_whileula2branchubc_1_1_performtransformation_binding[2];
			While w = (While) result_pattern_whileula2branchubc_1_1_performtransformation_binding[3];
			Assignment b = (Assignment) result_pattern_whileula2branchubc_1_1_performtransformation_binding[4];
			Assignment c = (Assignment) result_pattern_whileula2branchubc_1_1_performtransformation_binding[5];

			Object[] result_pattern_whileula2branchubc_1_1_performtransformation_black = pattern_whileula2branchubc_1_1_performtransformation_blackBBBBBBFBB(
					w2i, i, a, w, b, c, _this, isApplicableMatch);
			if (result_pattern_whileula2branchubc_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileula2branchubc_1_1_performtransformation_black[6];

				return new Object[] { w2i, i, a, w, b, c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_1_1_performtransformation_greenFFBFBFBFBF(Branch i, While a,
			Assignment b, Assignment c) {
		S2N c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		c2z.setSource(c);
		b2y.setSource(b);
		i.setNegative(z);
		c2z.setTarget(z);
		a2x.setSource(a);
		b2y.setTarget(y);
		i.setPositive(x);
		y.setNext(x);
		a2x.setTarget(x);
		x.setPositive(y);
		return new Object[] { c2z, b2y, i, z, a, a2x, b, y, c, x };
	}

	public static final Object[] pattern_whileula2branchubc_1_2_collecttranslatedelements_blackBBBBBBBBB(S2N c2z,
			S2N b2y, Command z, While a, S2B a2x, Assignment b, Command y, Assignment c, Branch x) {
		if (!b2y.equals(c2z)) {
			if (!b.equals(c)) {
				if (!y.equals(z)) {
					return new Object[] { c2z, b2y, z, a, a2x, b, y, c, x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_1_2_collecttranslatedelements_greenFBBBBBBBBB(S2N c2z,
			S2N b2y, Command z, While a, S2B a2x, Assignment b, Command y, Assignment c, Branch x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedElements().add(x);
		return new Object[] { ruleresult, c2z, b2y, z, a, a2x, b, y, c, x };
	}

	public static final Object[] pattern_whileula2branchubc_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject w2i, EObject c2z, EObject b2y, EObject i, EObject z, EObject a,
			EObject w, EObject a2x, EObject b, EObject y, EObject c, EObject x) {
		if (!w2i.equals(z)) {
			if (!w2i.equals(y)) {
				if (!w2i.equals(x)) {
					if (!c2z.equals(w2i)) {
						if (!c2z.equals(i)) {
							if (!c2z.equals(z)) {
								if (!c2z.equals(w)) {
									if (!c2z.equals(y)) {
										if (!c2z.equals(x)) {
											if (!b2y.equals(w2i)) {
												if (!b2y.equals(c2z)) {
													if (!b2y.equals(i)) {
														if (!b2y.equals(z)) {
															if (!b2y.equals(w)) {
																if (!b2y.equals(y)) {
																	if (!b2y.equals(c)) {
																		if (!b2y.equals(x)) {
																			if (!i.equals(w2i)) {
																				if (!i.equals(z)) {
																					if (!i.equals(w)) {
																						if (!i.equals(y)) {
																							if (!i.equals(x)) {
																								if (!a.equals(w2i)) {
																									if (!a.equals(
																											c2z)) {
																										if (!a.equals(
																												b2y)) {
																											if (!a.equals(
																													i)) {
																												if (!a.equals(
																														z)) {
																													if (!a.equals(
																															w)) {
																														if (!a.equals(
																																a2x)) {
																															if (!a.equals(
																																	b)) {
																																if (!a.equals(
																																		y)) {
																																	if (!a.equals(
																																			c)) {
																																		if (!a.equals(
																																				x)) {
																																			if (!w.equals(
																																					w2i)) {
																																				if (!w.equals(
																																						z)) {
																																					if (!w.equals(
																																							y)) {
																																						if (!w.equals(
																																								x)) {
																																							if (!a2x.equals(
																																									w2i)) {
																																								if (!a2x.equals(
																																										c2z)) {
																																									if (!a2x.equals(
																																											b2y)) {
																																										if (!a2x.equals(
																																												i)) {
																																											if (!a2x.equals(
																																													z)) {
																																												if (!a2x.equals(
																																														w)) {
																																													if (!a2x.equals(
																																															b)) {
																																														if (!a2x.equals(
																																																y)) {
																																															if (!a2x.equals(
																																																	c)) {
																																																if (!a2x.equals(
																																																		x)) {
																																																	if (!b.equals(
																																																			w2i)) {
																																																		if (!b.equals(
																																																				c2z)) {
																																																			if (!b.equals(
																																																					b2y)) {
																																																				if (!b.equals(
																																																						i)) {
																																																					if (!b.equals(
																																																							z)) {
																																																						if (!b.equals(
																																																								w)) {
																																																							if (!b.equals(
																																																									y)) {
																																																								if (!b.equals(
																																																										c)) {
																																																									if (!b.equals(
																																																											x)) {
																																																										if (!y.equals(
																																																												z)) {
																																																											if (!c.equals(
																																																													w2i)) {
																																																												if (!c.equals(
																																																														c2z)) {
																																																													if (!c.equals(
																																																															i)) {
																																																														if (!c.equals(
																																																																z)) {
																																																															if (!c.equals(
																																																																	w)) {
																																																																if (!c.equals(
																																																																		y)) {
																																																																	if (!c.equals(
																																																																			x)) {
																																																																		if (!x.equals(
																																																																				z)) {
																																																																			if (!x.equals(
																																																																					y)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						w2i,
																																																																						c2z,
																																																																						b2y,
																																																																						i,
																																																																						z,
																																																																						a,
																																																																						w,
																																																																						a2x,
																																																																						b,
																																																																						y,
																																																																						c,
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

	public static final Object[] pattern_whileula2branchubc_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject c2z, EObject b2y, EObject i, EObject z, EObject a, EObject w,
			EObject a2x, EObject b, EObject y, EObject c, EObject x) {
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileula2branchubc";
		String i__z____negative_name_prime = "negative";
		String c2z__z____target_name_prime = "target";
		String a__b____first_name_prime = "first";
		String i__x____positive_name_prime = "positive";
		String a2x__a____source_name_prime = "source";
		String w__c____next_name_prime = "next";
		String a__b____last_name_prime = "last";
		String w__a____first_name_prime = "first";
		String b2y__b____source_name_prime = "source";
		String y__x____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		String c2z__c____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String x__y____positive_name_prime = "positive";
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____first);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(y__x____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		ruleresult.getCreatedEdges().add(x__y____positive);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		return new Object[] { ruleresult, c2z, b2y, i, z, a, w, a2x, b, y, c, x, i__z____negative, c2z__z____target,
				a__b____first, i__x____positive, a2x__a____source, w__c____next, a__b____last, w__a____first,
				b2y__b____source, y__x____next, b2y__y____target, c2z__c____source, a2x__x____target,
				x__y____positive };
	}

	public static final void pattern_whileula2branchubc_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whileula2branchubc _this, PerformRuleResult ruleresult, EObject w2i, EObject c2z, EObject b2y, EObject i,
			EObject z, EObject a, EObject w, EObject a2x, EObject b, EObject y, EObject c, EObject x) {
		_this.registerObjects_FWD(ruleresult, w2i, c2z, b2y, i, z, a, w, a2x, b, y, c, x);

	}

	public static final PerformRuleResult pattern_whileula2branchubc_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileula2branchubc_2_1_preparereturnvalue_bindingFB(whileula2branchubc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_2_1_preparereturnvalue_blackFBB(EClass eClass,
			whileula2branchubc _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_2_1_preparereturnvalue_bindingAndBlackFFB(
			whileula2branchubc _this) {
		Object[] result_pattern_whileula2branchubc_2_1_preparereturnvalue_binding = pattern_whileula2branchubc_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileula2branchubc_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whileula2branchubc_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileula2branchubc_2_1_preparereturnvalue_black = pattern_whileula2branchubc_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whileula2branchubc_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whileula2branchubc_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whileula2branchubc";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whileula2branchubc_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("a");
		EObject _localVariable_1 = match.getObject("w");
		EObject _localVariable_2 = match.getObject("b");
		EObject _localVariable_3 = match.getObject("c");
		EObject tmpA = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpC = _localVariable_3;
		if (tmpA instanceof While) {
			While a = (While) tmpA;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpB instanceof Assignment) {
					Assignment b = (Assignment) tmpB;
					if (tmpC instanceof Assignment) {
						Assignment c = (Assignment) tmpC;
						return new Object[] { a, w, b, c, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileula2branchubc_2_2_corematch_blackFFBBBBB(While a, While w,
			Assignment b, Assignment c, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			if (!b.equals(c)) {
				for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class,
						"source")) {
					Branch i = w2i.getTarget();
					if (i != null) {
						_result.add(new Object[] { w2i, i, a, w, b, c, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileula2branchubc_2_3_findcontext_blackBBBBBB(S2B w2i, Branch i,
			While a, While w, Assignment b, Assignment c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			if (!b.equals(c)) {
				if (i.equals(w2i.getTarget())) {
					if (b.equals(a.getFirst())) {
						if (c.equals(w.getNext())) {
							if (b.equals(a.getLast())) {
								if (a.equals(w.getFirst())) {
									if (w.equals(w2i.getSource())) {
										_result.add(new Object[] { w2i, i, a, w, b, c });
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

	public static final Object[] pattern_whileula2branchubc_2_3_findcontext_greenBBBBBBFFFFFFF(S2B w2i, Branch i,
			While a, While w, Assignment b, Assignment c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w2i__i____target_name_prime = "target";
		String a__b____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String a__b____last_name_prime = "last";
		String w__a____first_name_prime = "first";
		String w2i__w____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(c);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____first);
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
		w2i__i____target.setName(w2i__i____target_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		return new Object[] { w2i, i, a, w, b, c, isApplicableMatch, w2i__i____target, a__b____first, w__c____next,
				a__b____last, w__a____first, w2i__w____source };
	}

	public static final Object[] pattern_whileula2branchubc_2_4_solveCSP_bindingFBBBBBBBB(whileula2branchubc _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, Branch i, While a, While w, Assignment b, Assignment c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, w2i, i, a, w, b, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w2i, i, a, w, b, c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileula2branchubc_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			whileula2branchubc _this, IsApplicableMatch isApplicableMatch, S2B w2i, Branch i, While a, While w,
			Assignment b, Assignment c) {
		Object[] result_pattern_whileula2branchubc_2_4_solveCSP_binding = pattern_whileula2branchubc_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, w2i, i, a, w, b, c);
		if (result_pattern_whileula2branchubc_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileula2branchubc_2_4_solveCSP_binding[0];

			Object[] result_pattern_whileula2branchubc_2_4_solveCSP_black = pattern_whileula2branchubc_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileula2branchubc_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w2i, i, a, w, b, c };
			}
		}
		return null;
	}

	public static final boolean pattern_whileula2branchubc_2_5_checkCSP_expressionFBB(whileula2branchubc _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileula2branchubc_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whileula2branchubc_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whileula2branchubc";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whileula2branchubc_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileula2branchubc_10_1_initialbindings_blackBBBBBB(whileula2branchubc _this,
			Match match, Branch i, Command z, Command y, Branch x) {
		if (!i.equals(x)) {
			if (!y.equals(z)) {
				return new Object[] { _this, match, i, z, y, x };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_10_2_SolveCSP_bindingFBBBBBB(whileula2branchubc _this,
			Match match, Branch i, Command z, Command y, Branch x) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, i, z, y, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, i, z, y, x };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileula2branchubc_10_2_SolveCSP_bindingAndBlackFBBBBBB(
			whileula2branchubc _this, Match match, Branch i, Command z, Command y, Branch x) {
		Object[] result_pattern_whileula2branchubc_10_2_SolveCSP_binding = pattern_whileula2branchubc_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, i, z, y, x);
		if (result_pattern_whileula2branchubc_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileula2branchubc_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whileula2branchubc_10_2_SolveCSP_black = pattern_whileula2branchubc_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileula2branchubc_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, i, z, y, x };
			}
		}
		return null;
	}

	public static final boolean pattern_whileula2branchubc_10_3_CheckCSP_expressionFBB(whileula2branchubc _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileula2branchubc_10_4_collectelementstobetranslated_blackBBBBB(Match match,
			Branch i, Command z, Command y, Branch x) {
		if (!i.equals(x)) {
			if (!y.equals(z)) {
				return new Object[] { match, i, z, y, x };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_10_4_collectelementstobetranslated_greenBBBBBFFFF(
			Match match, Branch i, Command z, Command y, Branch x) {
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(x);
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String y__x____next_name_prime = "next";
		String x__y____positive_name_prime = "positive";
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		match.getToBeTranslatedEdges().add(y__x____next);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		match.getToBeTranslatedEdges().add(x__y____positive);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		return new Object[] { match, i, z, y, x, i__z____negative, i__x____positive, y__x____next, x__y____positive };
	}

	public static final Object[] pattern_whileula2branchubc_10_5_collectcontextelements_blackBBBBB(Match match,
			Branch i, Command z, Command y, Branch x) {
		if (!i.equals(x)) {
			if (!y.equals(z)) {
				return new Object[] { match, i, z, y, x };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_10_5_collectcontextelements_greenBB(Match match, Branch i) {
		match.getContextNodes().add(i);
		return new Object[] { match, i };
	}

	public static final void pattern_whileula2branchubc_10_6_registerobjectstomatch_expressionBBBBBB(
			whileula2branchubc _this, Match match, Branch i, Command z, Command y, Branch x) {
		_this.registerObjectsToMatch_BWD(match, i, z, y, x);

	}

	public static final boolean pattern_whileula2branchubc_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileula2branchubc_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileula2branchubc_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_1 = isApplicableMatch.getObject("i");
		EObject _localVariable_2 = isApplicableMatch.getObject("z");
		EObject _localVariable_3 = isApplicableMatch.getObject("w");
		EObject _localVariable_4 = isApplicableMatch.getObject("y");
		EObject _localVariable_5 = isApplicableMatch.getObject("x");
		EObject tmpW2i = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpY = _localVariable_4;
		EObject tmpX = _localVariable_5;
		if (tmpW2i instanceof S2B) {
			S2B w2i = (S2B) tmpW2i;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpZ instanceof Command) {
					Command z = (Command) tmpZ;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						if (tmpY instanceof Command) {
							Command y = (Command) tmpY;
							if (tmpX instanceof Branch) {
								Branch x = (Branch) tmpX;
								return new Object[] { w2i, i, z, w, y, x, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_11_1_performtransformation_blackBBBBBBFBB(S2B w2i, Branch i,
			Command z, While w, Command y, Branch x, whileula2branchubc _this, IsApplicableMatch isApplicableMatch) {
		if (!i.equals(x)) {
			if (!y.equals(z)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { w2i, i, z, w, y, x, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			whileula2branchubc _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whileula2branchubc_11_1_performtransformation_binding = pattern_whileula2branchubc_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_whileula2branchubc_11_1_performtransformation_binding != null) {
			S2B w2i = (S2B) result_pattern_whileula2branchubc_11_1_performtransformation_binding[0];
			Branch i = (Branch) result_pattern_whileula2branchubc_11_1_performtransformation_binding[1];
			Command z = (Command) result_pattern_whileula2branchubc_11_1_performtransformation_binding[2];
			While w = (While) result_pattern_whileula2branchubc_11_1_performtransformation_binding[3];
			Command y = (Command) result_pattern_whileula2branchubc_11_1_performtransformation_binding[4];
			Branch x = (Branch) result_pattern_whileula2branchubc_11_1_performtransformation_binding[5];

			Object[] result_pattern_whileula2branchubc_11_1_performtransformation_black = pattern_whileula2branchubc_11_1_performtransformation_blackBBBBBBFBB(
					w2i, i, z, w, y, x, _this, isApplicableMatch);
			if (result_pattern_whileula2branchubc_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileula2branchubc_11_1_performtransformation_black[6];

				return new Object[] { w2i, i, z, w, y, x, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_11_1_performtransformation_greenFFBFBFFBFB(Command z,
			While w, Command y, Branch x) {
		S2N c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		Assignment c = SourcecodeFactory.eINSTANCE.createAssignment();
		c2z.setTarget(z);
		b2y.setTarget(y);
		w.setFirst(a);
		a2x.setSource(a);
		a2x.setTarget(x);
		a.setFirst(b);
		a.setLast(b);
		b2y.setSource(b);
		w.setNext(c);
		c2z.setSource(c);
		return new Object[] { c2z, b2y, z, a, w, a2x, b, y, c, x };
	}

	public static final Object[] pattern_whileula2branchubc_11_2_collecttranslatedelements_blackBBBBBBBBB(S2N c2z,
			S2N b2y, Command z, While a, S2B a2x, Assignment b, Command y, Assignment c, Branch x) {
		if (!b2y.equals(c2z)) {
			if (!b.equals(c)) {
				if (!y.equals(z)) {
					return new Object[] { c2z, b2y, z, a, a2x, b, y, c, x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_11_2_collecttranslatedelements_greenFBBBBBBBBB(S2N c2z,
			S2N b2y, Command z, While a, S2B a2x, Assignment b, Command y, Assignment c, Branch x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getTranslatedElements().add(x);
		return new Object[] { ruleresult, c2z, b2y, z, a, a2x, b, y, c, x };
	}

	public static final Object[] pattern_whileula2branchubc_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject w2i, EObject c2z, EObject b2y, EObject i, EObject z, EObject a,
			EObject w, EObject a2x, EObject b, EObject y, EObject c, EObject x) {
		if (!w2i.equals(z)) {
			if (!w2i.equals(y)) {
				if (!w2i.equals(x)) {
					if (!c2z.equals(w2i)) {
						if (!c2z.equals(i)) {
							if (!c2z.equals(z)) {
								if (!c2z.equals(w)) {
									if (!c2z.equals(y)) {
										if (!c2z.equals(x)) {
											if (!b2y.equals(w2i)) {
												if (!b2y.equals(c2z)) {
													if (!b2y.equals(i)) {
														if (!b2y.equals(z)) {
															if (!b2y.equals(w)) {
																if (!b2y.equals(y)) {
																	if (!b2y.equals(c)) {
																		if (!b2y.equals(x)) {
																			if (!i.equals(w2i)) {
																				if (!i.equals(z)) {
																					if (!i.equals(w)) {
																						if (!i.equals(y)) {
																							if (!i.equals(x)) {
																								if (!a.equals(w2i)) {
																									if (!a.equals(
																											c2z)) {
																										if (!a.equals(
																												b2y)) {
																											if (!a.equals(
																													i)) {
																												if (!a.equals(
																														z)) {
																													if (!a.equals(
																															w)) {
																														if (!a.equals(
																																a2x)) {
																															if (!a.equals(
																																	b)) {
																																if (!a.equals(
																																		y)) {
																																	if (!a.equals(
																																			c)) {
																																		if (!a.equals(
																																				x)) {
																																			if (!w.equals(
																																					w2i)) {
																																				if (!w.equals(
																																						z)) {
																																					if (!w.equals(
																																							y)) {
																																						if (!w.equals(
																																								x)) {
																																							if (!a2x.equals(
																																									w2i)) {
																																								if (!a2x.equals(
																																										c2z)) {
																																									if (!a2x.equals(
																																											b2y)) {
																																										if (!a2x.equals(
																																												i)) {
																																											if (!a2x.equals(
																																													z)) {
																																												if (!a2x.equals(
																																														w)) {
																																													if (!a2x.equals(
																																															b)) {
																																														if (!a2x.equals(
																																																y)) {
																																															if (!a2x.equals(
																																																	c)) {
																																																if (!a2x.equals(
																																																		x)) {
																																																	if (!b.equals(
																																																			w2i)) {
																																																		if (!b.equals(
																																																				c2z)) {
																																																			if (!b.equals(
																																																					b2y)) {
																																																				if (!b.equals(
																																																						i)) {
																																																					if (!b.equals(
																																																							z)) {
																																																						if (!b.equals(
																																																								w)) {
																																																							if (!b.equals(
																																																									y)) {
																																																								if (!b.equals(
																																																										c)) {
																																																									if (!b.equals(
																																																											x)) {
																																																										if (!y.equals(
																																																												z)) {
																																																											if (!c.equals(
																																																													w2i)) {
																																																												if (!c.equals(
																																																														c2z)) {
																																																													if (!c.equals(
																																																															i)) {
																																																														if (!c.equals(
																																																																z)) {
																																																															if (!c.equals(
																																																																	w)) {
																																																																if (!c.equals(
																																																																		y)) {
																																																																	if (!c.equals(
																																																																			x)) {
																																																																		if (!x.equals(
																																																																				z)) {
																																																																			if (!x.equals(
																																																																					y)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						w2i,
																																																																						c2z,
																																																																						b2y,
																																																																						i,
																																																																						z,
																																																																						a,
																																																																						w,
																																																																						a2x,
																																																																						b,
																																																																						y,
																																																																						c,
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

	public static final Object[] pattern_whileula2branchubc_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject c2z, EObject b2y, EObject i, EObject z, EObject a, EObject w,
			EObject a2x, EObject b, EObject y, EObject c, EObject x) {
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileula2branchubc";
		String i__z____negative_name_prime = "negative";
		String c2z__z____target_name_prime = "target";
		String a__b____first_name_prime = "first";
		String i__x____positive_name_prime = "positive";
		String a2x__a____source_name_prime = "source";
		String w__c____next_name_prime = "next";
		String a__b____last_name_prime = "last";
		String w__a____first_name_prime = "first";
		String b2y__b____source_name_prime = "source";
		String y__x____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		String c2z__c____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String x__y____positive_name_prime = "positive";
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____first);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(y__x____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		ruleresult.getTranslatedEdges().add(x__y____positive);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		a__b____last.setName(a__b____last_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		return new Object[] { ruleresult, c2z, b2y, i, z, a, w, a2x, b, y, c, x, i__z____negative, c2z__z____target,
				a__b____first, i__x____positive, a2x__a____source, w__c____next, a__b____last, w__a____first,
				b2y__b____source, y__x____next, b2y__y____target, c2z__c____source, a2x__x____target,
				x__y____positive };
	}

	public static final void pattern_whileula2branchubc_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whileula2branchubc _this, PerformRuleResult ruleresult, EObject w2i, EObject c2z, EObject b2y, EObject i,
			EObject z, EObject a, EObject w, EObject a2x, EObject b, EObject y, EObject c, EObject x) {
		_this.registerObjects_BWD(ruleresult, w2i, c2z, b2y, i, z, a, w, a2x, b, y, c, x);

	}

	public static final PerformRuleResult pattern_whileula2branchubc_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileula2branchubc_12_1_preparereturnvalue_bindingFB(
			whileula2branchubc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_12_1_preparereturnvalue_blackFBB(EClass eClass,
			whileula2branchubc _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_12_1_preparereturnvalue_bindingAndBlackFFB(
			whileula2branchubc _this) {
		Object[] result_pattern_whileula2branchubc_12_1_preparereturnvalue_binding = pattern_whileula2branchubc_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileula2branchubc_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whileula2branchubc_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileula2branchubc_12_1_preparereturnvalue_black = pattern_whileula2branchubc_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whileula2branchubc_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whileula2branchubc_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whileula2branchubc";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whileula2branchubc_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("i");
		EObject _localVariable_1 = match.getObject("z");
		EObject _localVariable_2 = match.getObject("y");
		EObject _localVariable_3 = match.getObject("x");
		EObject tmpI = _localVariable_0;
		EObject tmpZ = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpX = _localVariable_3;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpZ instanceof Command) {
				Command z = (Command) tmpZ;
				if (tmpY instanceof Command) {
					Command y = (Command) tmpY;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						return new Object[] { i, z, y, x, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileula2branchubc_12_2_corematch_blackFBBFBBB(Branch i, Command z,
			Command y, Branch x, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(x)) {
			if (!y.equals(z)) {
				for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class,
						"target")) {
					Statement tmpW = w2i.getSource();
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						_result.add(new Object[] { w2i, i, z, w, y, x, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileula2branchubc_12_3_findcontext_blackBBBBBB(S2B w2i, Branch i,
			Command z, While w, Command y, Branch x) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(x)) {
			if (!y.equals(z)) {
				if (z.equals(i.getNegative())) {
					if (i.equals(w2i.getTarget())) {
						if (x.equals(i.getPositive())) {
							if (w.equals(w2i.getSource())) {
								if (x.equals(y.getNext())) {
									if (y.equals(x.getPositive())) {
										_result.add(new Object[] { w2i, i, z, w, y, x });
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

	public static final Object[] pattern_whileula2branchubc_12_3_findcontext_greenBBBBBBFFFFFFF(S2B w2i, Branch i,
			Command z, While w, Command y, Branch x) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String i__z____negative_name_prime = "negative";
		String w2i__i____target_name_prime = "target";
		String i__x____positive_name_prime = "positive";
		String w2i__w____source_name_prime = "source";
		String y__x____next_name_prime = "next";
		String x__y____positive_name_prime = "positive";
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(y);
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
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(y__x____next);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		isApplicableMatch.getAllContextElements().add(x__y____positive);
		i__z____negative.setName(i__z____negative_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		return new Object[] { w2i, i, z, w, y, x, isApplicableMatch, i__z____negative, w2i__i____target,
				i__x____positive, w2i__w____source, y__x____next, x__y____positive };
	}

	public static final Object[] pattern_whileula2branchubc_12_4_solveCSP_bindingFBBBBBBBB(whileula2branchubc _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, Branch i, Command z, While w, Command y, Branch x) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, w2i, i, z, w, y, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w2i, i, z, w, y, x };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileula2branchubc_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			whileula2branchubc _this, IsApplicableMatch isApplicableMatch, S2B w2i, Branch i, Command z, While w,
			Command y, Branch x) {
		Object[] result_pattern_whileula2branchubc_12_4_solveCSP_binding = pattern_whileula2branchubc_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, w2i, i, z, w, y, x);
		if (result_pattern_whileula2branchubc_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileula2branchubc_12_4_solveCSP_binding[0];

			Object[] result_pattern_whileula2branchubc_12_4_solveCSP_black = pattern_whileula2branchubc_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileula2branchubc_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w2i, i, z, w, y, x };
			}
		}
		return null;
	}

	public static final boolean pattern_whileula2branchubc_12_5_checkCSP_expressionFBB(whileula2branchubc _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileula2branchubc_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whileula2branchubc_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whileula2branchubc";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whileula2branchubc_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileula2branchubc_20_1_preparereturnvalue_bindingFB(
			whileula2branchubc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whileula2branchubc _this) {
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

	public static final Object[] pattern_whileula2branchubc_20_1_preparereturnvalue_bindingAndBlackFFBF(
			whileula2branchubc _this) {
		Object[] result_pattern_whileula2branchubc_20_1_preparereturnvalue_binding = pattern_whileula2branchubc_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileula2branchubc_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whileula2branchubc_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileula2branchubc_20_1_preparereturnvalue_black = pattern_whileula2branchubc_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whileula2branchubc_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whileula2branchubc_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whileula2branchubc_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_0B(Command z) {
		for (Graph __DEC_z_root_499547 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_1BBB(Command z,
			Branch i, Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_z_positive_268612 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!i.equals(__DEC_z_positive_268612)) {
					if (!x.equals(__DEC_z_positive_268612)) {
						return new Object[] { z, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_2BBB(Command z,
			Branch i, Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_z_negative_639354 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!i.equals(__DEC_z_negative_639354)) {
					if (!x.equals(__DEC_z_negative_639354)) {
						return new Object[] { z, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_184110 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_4BBB(Command y,
			Branch i, Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_positive_943333 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!i.equals(__DEC_y_positive_943333)) {
					if (!x.equals(__DEC_y_positive_943333)) {
						return new Object[] { y, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_5BBB(Command y,
			Branch i, Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_negative_616340 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!i.equals(__DEC_y_negative_616340)) {
					if (!x.equals(__DEC_y_negative_616340)) {
						return new Object[] { y, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_186436 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_7BB(Branch x,
			Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_positive_226742 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_226742)) {
					if (!i.equals(__DEC_x_positive_226742)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_8BB(Branch x,
			Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_negative_542927 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_542927)) {
					if (!i.equals(__DEC_x_negative_542927)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_9BB(Branch i,
			Command z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_10BB(Branch x,
			Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_11BB(Branch x,
			Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_12BB(Branch i,
			Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_13BB(Branch i,
			Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_14BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_15BB(Branch i,
			Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileula2branchubc_20_2_testcorematchandDECs_blackFFFFB(
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
							Node tmpY = x.getPositive();
							if (tmpY instanceof Command) {
								Command y = (Command) tmpY;
								if (!y.equals(z)) {
									if (x.equals(y.getNext())) {
										if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_0B(
												z) == null) {
											if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_9BB(i,
													z) == null) {
												if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_1BBB(
														z, i, x) == null) {
													if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_2BBB(
															z, i, x) == null) {
														if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_6B(
																x) == null) {
															if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_7BB(
																	x, i) == null) {
																if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_8BB(
																		x, i) == null) {
																	if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_10BB(
																			x, z) == null) {
																		if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_11BB(
																				x, z) == null) {
																			if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_15BB(
																					i, x) == null) {
																				if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_3B(
																						y) == null) {
																					if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_4BBB(
																							y, i, x) == null) {
																						if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_5BBB(
																								y, i, x) == null) {
																							if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_12BB(
																									i, y) == null) {
																								if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_13BB(
																										i, y) == null) {
																									if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_14BB(
																											x,
																											y) == null) {
																										_result.add(
																												new Object[] {
																														i,
																														z,
																														y,
																														x,
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

		return _result;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whileula2branchubc_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			whileula2branchubc _this, Match match, Branch i, Command z, Command y, Branch x) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, i, z, y, x);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whileula2branchubc_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whileula2branchubc _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileula2branchubc_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whileula2branchubc_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whileula2branchubc_21_1_preparereturnvalue_bindingFB(
			whileula2branchubc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whileula2branchubc _this) {
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

	public static final Object[] pattern_whileula2branchubc_21_1_preparereturnvalue_bindingAndBlackFFBF(
			whileula2branchubc _this) {
		Object[] result_pattern_whileula2branchubc_21_1_preparereturnvalue_binding = pattern_whileula2branchubc_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileula2branchubc_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whileula2branchubc_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileula2branchubc_21_1_preparereturnvalue_black = pattern_whileula2branchubc_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whileula2branchubc_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whileula2branchubc_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whileula2branchubc_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_0B(While a) {
		for (Decision __DEC_a_positive_261558 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_1B(While a) {
		for (Decision __DEC_a_negative_247534 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_2BB(While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_a_last_112852 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_112852)) {
					if (!w.equals(__DEC_a_last_112852)) {
						return new Object[] { a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_3B(While a) {
		for (Program __DEC_a_first_674333 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_4B(Assignment b) {
		for (Decision __DEC_b_positive_183386 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_5B(Assignment b) {
		for (Decision __DEC_b_negative_838715 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_6BBB(Assignment b,
			While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_b_last_10901 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!a.equals(__DEC_b_last_10901)) {
					if (!w.equals(__DEC_b_last_10901)) {
						return new Object[] { b, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_7B(Assignment b) {
		for (Program __DEC_b_first_467360 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_8B(Assignment c) {
		for (Decision __DEC_c_positive_784231 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_9B(Assignment c) {
		for (Decision __DEC_c_negative_538525 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_10BBB(Assignment c,
			While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_c_first_723772 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!a.equals(__DEC_c_first_723772)) {
					if (!w.equals(__DEC_c_first_723772)) {
						return new Object[] { c, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_11BBB(Assignment c,
			While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_c_last_452905 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!a.equals(__DEC_c_last_452905)) {
					if (!w.equals(__DEC_c_last_452905)) {
						return new Object[] { c, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_12B(Assignment c) {
		for (Program __DEC_c_first_29015 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_13BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_14BB(While a,
			Assignment c) {
		if (c.equals(a.getFirst())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_15BB(While w,
			Assignment c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_16BB(While a,
			Assignment c) {
		if (c.equals(a.getLast())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_17BB(While w,
			Assignment c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileula2branchubc_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_first) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpA = _edge_first.getSrc();
		if (tmpA instanceof While) {
			While a = (While) tmpA;
			EObject tmpB = _edge_first.getTrg();
			if (tmpB instanceof Assignment) {
				Assignment b = (Assignment) tmpB;
				if (b.equals(a.getFirst())) {
					if (b.equals(a.getLast())) {
						if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_0B(a) == null) {
							if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_1B(a) == null) {
								if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_3B(a) == null) {
									if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_4B(b) == null) {
										if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_5B(
												b) == null) {
											if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_7B(
													b) == null) {
												for (While w : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(a, While.class, "first")) {
													if (!a.equals(w)) {
														Statement tmpC = w.getNext();
														if (tmpC instanceof Assignment) {
															Assignment c = (Assignment) tmpC;
															if (!b.equals(c)) {
																if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_2BB(
																		a, w) == null) {
																	if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_6BBB(
																			b, a, w) == null) {
																		if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_13BB(
																				w, b) == null) {
																			if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_8B(
																					c) == null) {
																				if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_9B(
																						c) == null) {
																					if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_10BBB(
																							c, a, w) == null) {
																						if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_11BBB(
																								c, a, w) == null) {
																							if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_12B(
																									c) == null) {
																								if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_14BB(
																										a, c) == null) {
																									if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_15BB(
																											w,
																											c) == null) {
																										if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_16BB(
																												a,
																												c) == null) {
																											if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_17BB(
																													w,
																													c) == null) {
																												_result.add(
																														new Object[] {
																																a,
																																w,
																																b,
																																c,
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

		return _result;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whileula2branchubc_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			whileula2branchubc _this, Match match, While a, While w, Assignment b, Assignment c) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, a, w, b, c);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whileula2branchubc_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whileula2branchubc _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileula2branchubc_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whileula2branchubc_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whileula2branchubc_24_1_prepare_blackB(whileula2branchubc _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whileula2branchubc_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_whileula2branchubc_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("i");
		EObject _localVariable_1 = targetMatch.getObject("z");
		EObject _localVariable_2 = sourceMatch.getObject("a");
		EObject _localVariable_3 = sourceMatch.getObject("w");
		EObject _localVariable_4 = sourceMatch.getObject("b");
		EObject _localVariable_5 = targetMatch.getObject("y");
		EObject _localVariable_6 = sourceMatch.getObject("c");
		EObject _localVariable_7 = targetMatch.getObject("x");
		EObject tmpI = _localVariable_0;
		EObject tmpZ = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpB = _localVariable_4;
		EObject tmpY = _localVariable_5;
		EObject tmpC = _localVariable_6;
		EObject tmpX = _localVariable_7;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpZ instanceof Command) {
				Command z = (Command) tmpZ;
				if (tmpA instanceof While) {
					While a = (While) tmpA;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						if (tmpB instanceof Assignment) {
							Assignment b = (Assignment) tmpB;
							if (tmpY instanceof Command) {
								Command y = (Command) tmpY;
								if (tmpC instanceof Assignment) {
									Assignment c = (Assignment) tmpC;
									if (tmpX instanceof Branch) {
										Branch x = (Branch) tmpX;
										return new Object[] { i, z, a, w, b, y, c, x, targetMatch, sourceMatch };
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

	public static final Object[] pattern_whileula2branchubc_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Branch i, Command z,
			While a, While w, Assignment b, Command y, Assignment c, Branch x, Match sourceMatch, Match targetMatch) {
		if (!i.equals(x)) {
			if (!a.equals(w)) {
				if (!b.equals(c)) {
					if (!y.equals(z)) {
						if (!sourceMatch.equals(targetMatch)) {
							return new Object[] { i, z, a, w, b, y, c, x, sourceMatch, targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileula2branchubc_24_2_matchsrctrgcontext_binding = pattern_whileula2branchubc_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_whileula2branchubc_24_2_matchsrctrgcontext_binding != null) {
			Branch i = (Branch) result_pattern_whileula2branchubc_24_2_matchsrctrgcontext_binding[0];
			Command z = (Command) result_pattern_whileula2branchubc_24_2_matchsrctrgcontext_binding[1];
			While a = (While) result_pattern_whileula2branchubc_24_2_matchsrctrgcontext_binding[2];
			While w = (While) result_pattern_whileula2branchubc_24_2_matchsrctrgcontext_binding[3];
			Assignment b = (Assignment) result_pattern_whileula2branchubc_24_2_matchsrctrgcontext_binding[4];
			Command y = (Command) result_pattern_whileula2branchubc_24_2_matchsrctrgcontext_binding[5];
			Assignment c = (Assignment) result_pattern_whileula2branchubc_24_2_matchsrctrgcontext_binding[6];
			Branch x = (Branch) result_pattern_whileula2branchubc_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_whileula2branchubc_24_2_matchsrctrgcontext_black = pattern_whileula2branchubc_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					i, z, a, w, b, y, c, x, sourceMatch, targetMatch);
			if (result_pattern_whileula2branchubc_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { i, z, a, w, b, y, c, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_24_3_solvecsp_bindingFBBBBBBBBBBB(whileula2branchubc _this,
			Branch i, Command z, While a, While w, Assignment b, Command y, Assignment c, Branch x, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(i, z, a, w, b, y, c, x, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, i, z, a, w, b, y, c, x, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileula2branchubc_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			whileula2branchubc _this, Branch i, Command z, While a, While w, Assignment b, Command y, Assignment c,
			Branch x, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileula2branchubc_24_3_solvecsp_binding = pattern_whileula2branchubc_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, i, z, a, w, b, y, c, x, sourceMatch, targetMatch);
		if (result_pattern_whileula2branchubc_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whileula2branchubc_24_3_solvecsp_binding[0];

			Object[] result_pattern_whileula2branchubc_24_3_solvecsp_black = pattern_whileula2branchubc_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whileula2branchubc_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, i, z, a, w, b, y, c, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whileula2branchubc_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileula2branchubc_24_5_matchcorrcontext_blackFBBBB(Branch i,
			While w, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class, "target")) {
				if (w.equals(w2i.getSource())) {
					_result.add(new Object[] { w2i, i, w, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whileula2branchubc_24_5_matchcorrcontext_greenBBBF(S2B w2i, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "whileula2branchubc";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(w2i);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { w2i, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_whileula2branchubc_24_6_createcorrespondence_blackBBBBBBBBB(Branch i,
			Command z, While a, While w, Assignment b, Command y, Assignment c, Branch x, CCMatch ccMatch) {
		if (!i.equals(x)) {
			if (!a.equals(w)) {
				if (!b.equals(c)) {
					if (!y.equals(z)) {
						return new Object[] { i, z, a, w, b, y, c, x, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_24_6_createcorrespondence_greenFFBBFBBBBB(Command z,
			While a, Assignment b, Command y, Assignment c, Branch x, CCMatch ccMatch) {
		S2N c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
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
		return new Object[] { c2z, b2y, z, a, a2x, b, y, c, x, ccMatch };
	}

	public static final Object[] pattern_whileula2branchubc_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_whileula2branchubc_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "whileula2branchubc";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_whileula2branchubc_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_0B(While a) {
		for (Decision __DEC_a_positive_814203 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_1B(While a) {
		for (Decision __DEC_a_negative_283545 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_2BB(While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_a_last_307008 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_307008)) {
					if (!w.equals(__DEC_a_last_307008)) {
						return new Object[] { a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_3B(While a) {
		for (Program __DEC_a_first_701231 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_4B(Assignment b) {
		for (Decision __DEC_b_positive_153519 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_5B(Assignment b) {
		for (Decision __DEC_b_negative_484037 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_6BBB(Assignment b, While a,
			While w) {
		if (!a.equals(w)) {
			for (While __DEC_b_last_741861 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!a.equals(__DEC_b_last_741861)) {
					if (!w.equals(__DEC_b_last_741861)) {
						return new Object[] { b, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_7B(Assignment b) {
		for (Program __DEC_b_first_890820 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_8B(Assignment c) {
		for (Decision __DEC_c_positive_417937 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_9B(Assignment c) {
		for (Decision __DEC_c_negative_802590 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_10BBB(Assignment c, While a,
			While w) {
		if (!a.equals(w)) {
			for (While __DEC_c_first_133592 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!a.equals(__DEC_c_first_133592)) {
					if (!w.equals(__DEC_c_first_133592)) {
						return new Object[] { c, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_11BBB(Assignment c, While a,
			While w) {
		if (!a.equals(w)) {
			for (While __DEC_c_last_209846 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!a.equals(__DEC_c_last_209846)) {
					if (!w.equals(__DEC_c_last_209846)) {
						return new Object[] { c, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_12B(Assignment c) {
		for (Program __DEC_c_first_303563 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_13BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_14BB(While a, Assignment c) {
		if (c.equals(a.getFirst())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_15BB(While w, Assignment c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_16BB(While a, Assignment c) {
		if (c.equals(a.getLast())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_17BB(While w, Assignment c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_blackBBBB(While a, While w,
			Assignment b, Assignment c) {
		if (!a.equals(w)) {
			if (!b.equals(c)) {
				if (b.equals(a.getFirst())) {
					if (c.equals(w.getNext())) {
						if (b.equals(a.getLast())) {
							if (a.equals(w.getFirst())) {
								if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_0B(a) == null) {
									if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_1B(a) == null) {
										if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_2BB(a,
												w) == null) {
											if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_3B(
													a) == null) {
												if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_4B(
														b) == null) {
													if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_5B(
															b) == null) {
														if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_6BBB(
																b, a, w) == null) {
															if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_7B(
																	b) == null) {
																if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_8B(
																		c) == null) {
																	if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_9B(
																			c) == null) {
																		if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_10BBB(
																				c, a, w) == null) {
																			if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_11BBB(
																					c, a, w) == null) {
																				if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_12B(
																						c) == null) {
																					if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_13BB(
																							w, b) == null) {
																						if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_14BB(
																								a, c) == null) {
																							if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_15BB(
																									w, c) == null) {
																								if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_16BB(
																										a, c) == null) {
																									if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_17BB(
																											w,
																											c) == null) {
																										return new Object[] {
																												a, w, b,
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
		return null;
	}

	public static final boolean pattern_whileula2branchubc_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileula2branchubc_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_0B(Command z) {
		for (Graph __DEC_z_root_437772 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_1BBB(Command z, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_z_positive_148575 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!i.equals(__DEC_z_positive_148575)) {
					if (!x.equals(__DEC_z_positive_148575)) {
						return new Object[] { z, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_2BBB(Command z, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_z_negative_797103 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!i.equals(__DEC_z_negative_797103)) {
					if (!x.equals(__DEC_z_negative_797103)) {
						return new Object[] { z, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_36176 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_4BBB(Command y, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_positive_561361 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!i.equals(__DEC_y_positive_561361)) {
					if (!x.equals(__DEC_y_positive_561361)) {
						return new Object[] { y, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_5BBB(Command y, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_negative_694593 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!i.equals(__DEC_y_negative_694593)) {
					if (!x.equals(__DEC_y_negative_694593)) {
						return new Object[] { y, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_383142 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_7BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_positive_98688 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_98688)) {
					if (!i.equals(__DEC_x_positive_98688)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_8BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_negative_192935 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_192935)) {
					if (!i.equals(__DEC_x_negative_192935)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_9BB(Branch i, Command z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_10BB(Branch x, Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_11BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_12BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_13BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_14BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_15BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_blackBBBB(Branch i, Command z,
			Command y, Branch x) {
		if (!i.equals(x)) {
			if (!y.equals(z)) {
				if (z.equals(i.getNegative())) {
					if (x.equals(i.getPositive())) {
						if (x.equals(y.getNext())) {
							if (y.equals(x.getPositive())) {
								if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_0B(z) == null) {
									if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_1BBB(z, i,
											x) == null) {
										if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_2BBB(z, i,
												x) == null) {
											if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_3B(
													y) == null) {
												if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_4BBB(y, i,
														x) == null) {
													if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_5BBB(
															y, i, x) == null) {
														if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_6B(
																x) == null) {
															if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_7BB(
																	x, i) == null) {
																if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_8BB(
																		x, i) == null) {
																	if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_9BB(
																			i, z) == null) {
																		if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_10BB(
																				x, z) == null) {
																			if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_11BB(
																					x, z) == null) {
																				if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_12BB(
																						i, y) == null) {
																					if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_13BB(
																							i, y) == null) {
																						if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_14BB(
																								x, y) == null) {
																							if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_15BB(
																									i, x) == null) {
																								return new Object[] { i,
																										z, y, x };
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_whileula2branchubc_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileula2branchubc_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileula2branchubc_29_1_createresult_blackB(whileula2branchubc _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whileula2branchubc_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_whileula2branchubc_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileula2branchubc_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_whileula2branchubc_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									w2i) == null) {
								if (pattern_whileula2branchubc_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										i) == null) {
									if (pattern_whileula2branchubc_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											w) == null) {
										_result.add(
												new Object[] { w2iList, w2i, i, w, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_whileula2branchubc_29_3_solveCSP_bindingFBBBBBB(whileula2branchubc _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, Branch i, While w, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, w2i, i, w, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w2i, i, w, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileula2branchubc_29_3_solveCSP_bindingAndBlackFBBBBBB(
			whileula2branchubc _this, IsApplicableMatch isApplicableMatch, S2B w2i, Branch i, While w,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whileula2branchubc_29_3_solveCSP_binding = pattern_whileula2branchubc_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, w2i, i, w, ruleResult);
		if (result_pattern_whileula2branchubc_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileula2branchubc_29_3_solveCSP_binding[0];

			Object[] result_pattern_whileula2branchubc_29_3_solveCSP_black = pattern_whileula2branchubc_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whileula2branchubc_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w2i, i, w, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whileula2branchubc_29_4_checkCSP_expressionFBB(whileula2branchubc _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileula2branchubc_29_5_checknacs_blackBBB(S2B w2i, Branch i, While w) {
		return new Object[] { w2i, i, w };
	}

	public static final Object[] pattern_whileula2branchubc_29_6_perform_blackBBBB(S2B w2i, Branch i, While w,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { w2i, i, w, ruleResult };
	}

	public static final Object[] pattern_whileula2branchubc_29_6_perform_greenFFBFFBFFFFFB(Branch i, While w,
			ModelgeneratorRuleResult ruleResult) {
		S2N c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Assignment c = SourcecodeFactory.eINSTANCE.createAssignment();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(c2z);
		ruleResult.getCorrObjects().add(b2y);
		i.setNegative(z);
		c2z.setTarget(z);
		ruleResult.getTargetObjects().add(z);
		w.setFirst(a);
		ruleResult.getSourceObjects().add(a);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		a.setFirst(b);
		a.setLast(b);
		b2y.setSource(b);
		ruleResult.getSourceObjects().add(b);
		b2y.setTarget(y);
		ruleResult.getTargetObjects().add(y);
		w.setNext(c);
		c2z.setSource(c);
		ruleResult.getSourceObjects().add(c);
		i.setPositive(x);
		y.setNext(x);
		a2x.setTarget(x);
		x.setPositive(y);
		ruleResult.getTargetObjects().add(x);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { c2z, b2y, i, z, a, w, a2x, b, y, c, x, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whileula2branchubc_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whileula2branchubcImpl
