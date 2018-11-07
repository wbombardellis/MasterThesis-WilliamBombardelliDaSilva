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
	public boolean isAppropriate_FWD(Match match, While a, Assignment c, While w, Assignment b) {

		Object[] result1_black = whileula2branchubcImpl.pattern_whileula2branchubc_0_1_initialbindings_blackBBBBBB(this,
				match, a, c, w, b);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[c] = " + c + ", " + "[w] = " + w + ", "
					+ "[b] = " + b + ".");
		}

		Object[] result2_bindingAndBlack = whileula2branchubcImpl
				.pattern_whileula2branchubc_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, a, c, w, b);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[c] = " + c + ", " + "[w] = " + w + ", "
					+ "[b] = " + b + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileula2branchubcImpl.pattern_whileula2branchubc_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileula2branchubcImpl
					.pattern_whileula2branchubc_0_4_collectelementstobetranslated_blackBBBBB(match, a, c, w, b);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[c] = " + c + ", " + "[w] = " + w + ", " + "[b] = " + b + ".");
			}
			whileula2branchubcImpl.pattern_whileula2branchubc_0_4_collectelementstobetranslated_greenBBBBBFFFF(match, a,
					c, w, b);
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge a__b____first = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[8];

			Object[] result5_black = whileula2branchubcImpl
					.pattern_whileula2branchubc_0_5_collectcontextelements_blackBBBBB(match, a, c, w, b);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[c] = " + c + ", " + "[w] = " + w + ", " + "[b] = " + b + ".");
			}
			whileula2branchubcImpl.pattern_whileula2branchubc_0_5_collectcontextelements_greenBB(match, w);

			// 
			whileula2branchubcImpl.pattern_whileula2branchubc_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					a, c, w, b);
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
		While a = (While) result1_bindingAndBlack[0];
		Branch i = (Branch) result1_bindingAndBlack[1];
		Assignment c = (Assignment) result1_bindingAndBlack[2];
		S2B w2i = (S2B) result1_bindingAndBlack[3];
		While w = (While) result1_bindingAndBlack[4];
		Assignment b = (Assignment) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whileula2branchubcImpl
				.pattern_whileula2branchubc_1_1_performtransformation_greenBFBFFBFFBF(a, i, c, b);
		S2B a2x = (S2B) result1_green[1];
		Branch x = (Branch) result1_green[3];
		Command y = (Command) result1_green[4];
		S2N c2z = (S2N) result1_green[6];
		Command z = (Command) result1_green[7];
		S2N b2y = (S2N) result1_green[9];

		Object[] result2_black = whileula2branchubcImpl
				.pattern_whileula2branchubc_1_2_collecttranslatedelements_blackBBBBBBBBB(a, a2x, x, y, c, c2z, z, b,
						b2y);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a] = " + a + ", " + "[a2x] = "
					+ a2x + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[c2z] = " + c2z
					+ ", " + "[z] = " + z + ", " + "[b] = " + b + ", " + "[b2y] = " + b2y + ".");
		}
		Object[] result2_green = whileula2branchubcImpl
				.pattern_whileula2branchubc_1_2_collecttranslatedelements_greenFBBBBBBBBB(a, a2x, x, y, c, c2z, z, b,
						b2y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileula2branchubcImpl
				.pattern_whileula2branchubc_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, a, a2x, i, x, y, c,
						c2z, z, w2i, w, b, b2y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a] = " + a + ", " + "[a2x] = " + a2x + ", " + "[i] = " + i + ", " + "[x] = " + x + ", "
					+ "[y] = " + y + ", " + "[c] = " + c + ", " + "[c2z] = " + c2z + ", " + "[z] = " + z + ", "
					+ "[w2i] = " + w2i + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[b2y] = " + b2y + ".");
		}
		whileula2branchubcImpl.pattern_whileula2branchubc_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, a, a2x, i, x, y, c, c2z, z, w, b, b2y);
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[25];

		// 
		// 
		whileula2branchubcImpl.pattern_whileula2branchubc_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
				a, a2x, i, x, y, c, c2z, z, w2i, w, b, b2y);
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
		Assignment c = (Assignment) result2_binding[1];
		While w = (While) result2_binding[2];
		Assignment b = (Assignment) result2_binding[3];
		for (Object[] result2_black : whileula2branchubcImpl.pattern_whileula2branchubc_2_2_corematch_blackBFBFBBB(a, c,
				w, b, match)) {
			Branch i = (Branch) result2_black[1];
			S2B w2i = (S2B) result2_black[3];
			// ForEach 
			for (Object[] result3_black : whileula2branchubcImpl
					.pattern_whileula2branchubc_2_3_findcontext_blackBBBBBB(a, i, c, w2i, w, b)) {
				Object[] result3_green = whileula2branchubcImpl
						.pattern_whileula2branchubc_2_3_findcontext_greenBBBBBBFFFFFFF(a, i, c, w2i, w, b);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = whileula2branchubcImpl
						.pattern_whileula2branchubc_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, a, i,
								c, w2i, w, b);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[a] = " + a + ", " + "[i] = " + i
							+ ", " + "[c] = " + c + ", " + "[w2i] = " + w2i + ", " + "[w] = " + w + ", " + "[b] = " + b
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
	public void registerObjectsToMatch_FWD(Match match, While a, Assignment c, While w, Assignment b) {
		match.registerObject("a", a);
		match.registerObject("c", c);
		match.registerObject("w", w);
		match.registerObject("b", b);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, While a, Assignment c, While w, Assignment b) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, While a, Branch i, Assignment c, S2B w2i,
			While w, Assignment b) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("c", c);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject a, EObject a2x, EObject i, EObject x,
			EObject y, EObject c, EObject c2z, EObject z, EObject w2i, EObject w, EObject b, EObject b2y) {
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("b2y", b2y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass())
						.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch i, Branch x, Command y, Command z) {

		Object[] result1_black = whileula2branchubcImpl
				.pattern_whileula2branchubc_10_1_initialbindings_blackBBBBBB(this, match, i, x, y, z);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[i] = " + i + ", " + "[x] = " + x + ", " + "[y] = " + y + ", "
					+ "[z] = " + z + ".");
		}

		Object[] result2_bindingAndBlack = whileula2branchubcImpl
				.pattern_whileula2branchubc_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, i, x, y, z);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[i] = " + i + ", " + "[x] = " + x + ", " + "[y] = " + y + ", "
					+ "[z] = " + z + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileula2branchubcImpl.pattern_whileula2branchubc_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileula2branchubcImpl
					.pattern_whileula2branchubc_10_4_collectelementstobetranslated_blackBBBBB(match, i, x, y, z);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[i] = " + i + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[z] = " + z + ".");
			}
			whileula2branchubcImpl.pattern_whileula2branchubc_10_4_collectelementstobetranslated_greenBBBBBFFFF(match,
					i, x, y, z);
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge y__x____next = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result4_green[8];

			Object[] result5_black = whileula2branchubcImpl
					.pattern_whileula2branchubc_10_5_collectcontextelements_blackBBBBB(match, i, x, y, z);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[i] = " + i + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[z] = " + z + ".");
			}
			whileula2branchubcImpl.pattern_whileula2branchubc_10_5_collectcontextelements_greenBB(match, i);

			// 
			whileula2branchubcImpl.pattern_whileula2branchubc_10_6_registerobjectstomatch_expressionBBBBBB(this, match,
					i, x, y, z);
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
		Branch i = (Branch) result1_bindingAndBlack[0];
		Branch x = (Branch) result1_bindingAndBlack[1];
		Command y = (Command) result1_bindingAndBlack[2];
		Command z = (Command) result1_bindingAndBlack[3];
		S2B w2i = (S2B) result1_bindingAndBlack[4];
		While w = (While) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whileula2branchubcImpl
				.pattern_whileula2branchubc_11_1_performtransformation_greenFFBBFFBBFF(x, y, z, w);
		While a = (While) result1_green[0];
		S2B a2x = (S2B) result1_green[1];
		Assignment c = (Assignment) result1_green[4];
		S2N c2z = (S2N) result1_green[5];
		Assignment b = (Assignment) result1_green[8];
		S2N b2y = (S2N) result1_green[9];

		Object[] result2_black = whileula2branchubcImpl
				.pattern_whileula2branchubc_11_2_collecttranslatedelements_blackBBBBBBBBB(a, a2x, x, y, c, c2z, z, b,
						b2y);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a] = " + a + ", " + "[a2x] = "
					+ a2x + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[c] = " + c + ", " + "[c2z] = " + c2z
					+ ", " + "[z] = " + z + ", " + "[b] = " + b + ", " + "[b2y] = " + b2y + ".");
		}
		Object[] result2_green = whileula2branchubcImpl
				.pattern_whileula2branchubc_11_2_collecttranslatedelements_greenFBBBBBBBBB(a, a2x, x, y, c, c2z, z, b,
						b2y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileula2branchubcImpl
				.pattern_whileula2branchubc_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, a, a2x, i, x, y, c,
						c2z, z, w2i, w, b, b2y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a] = " + a + ", " + "[a2x] = " + a2x + ", " + "[i] = " + i + ", " + "[x] = " + x + ", "
					+ "[y] = " + y + ", " + "[c] = " + c + ", " + "[c2z] = " + c2z + ", " + "[z] = " + z + ", "
					+ "[w2i] = " + w2i + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[b2y] = " + b2y + ".");
		}
		whileula2branchubcImpl.pattern_whileula2branchubc_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, a, a2x, i, x, y, c, c2z, z, w, b, b2y);
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge a__b____first = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[25];

		// 
		// 
		whileula2branchubcImpl.pattern_whileula2branchubc_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this,
				ruleresult, a, a2x, i, x, y, c, c2z, z, w2i, w, b, b2y);
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
		Branch x = (Branch) result2_binding[1];
		Command y = (Command) result2_binding[2];
		Command z = (Command) result2_binding[3];
		for (Object[] result2_black : whileula2branchubcImpl.pattern_whileula2branchubc_12_2_corematch_blackBBBBFFB(i,
				x, y, z, match)) {
			S2B w2i = (S2B) result2_black[4];
			While w = (While) result2_black[5];
			// ForEach 
			for (Object[] result3_black : whileula2branchubcImpl
					.pattern_whileula2branchubc_12_3_findcontext_blackBBBBBB(i, x, y, z, w2i, w)) {
				Object[] result3_green = whileula2branchubcImpl
						.pattern_whileula2branchubc_12_3_findcontext_greenBBBBBBFFFFFFF(i, x, y, z, w2i, w);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge x__y____positive = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = whileula2branchubcImpl
						.pattern_whileula2branchubc_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, i,
								x, y, z, w2i, w);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[i] = " + i + ", " + "[x] = " + x
							+ ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[w2i] = " + w2i + ", " + "[w] = " + w
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
	public void registerObjectsToMatch_BWD(Match match, Branch i, Branch x, Command y, Command z) {
		match.registerObject("i", i);
		match.registerObject("x", x);
		match.registerObject("y", y);
		match.registerObject("z", z);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch i, Branch x, Command y, Command z) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch i, Branch x, Command y, Command z,
			S2B w2i, While w) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("w2i", w2i);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject a, EObject a2x, EObject i, EObject x,
			EObject y, EObject c, EObject c2z, EObject z, EObject w2i, EObject w, EObject b, EObject b2y) {
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("b2y", b2y);

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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_76(EMoflonEdge _edge_negative) {

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
			Branch x = (Branch) result2_black[1];
			Command y = (Command) result2_black[2];
			Command z = (Command) result2_black[3];
			Object[] result2_green = whileula2branchubcImpl
					.pattern_whileula2branchubc_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileula2branchubcImpl
					.pattern_whileula2branchubc_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, i, x, y, z)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_82(EMoflonEdge _edge_last) {

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
				.pattern_whileula2branchubc_21_2_testcorematchandDECs_blackFFFFB(_edge_last)) {
			While a = (While) result2_black[0];
			Assignment c = (Assignment) result2_black[1];
			While w = (While) result2_black[2];
			Assignment b = (Assignment) result2_black[3];
			Object[] result2_green = whileula2branchubcImpl
					.pattern_whileula2branchubc_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileula2branchubcImpl
					.pattern_whileula2branchubc_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, a, c, w, b)) {
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
		While a = (While) result2_bindingAndBlack[0];
		Branch i = (Branch) result2_bindingAndBlack[1];
		Branch x = (Branch) result2_bindingAndBlack[2];
		Command y = (Command) result2_bindingAndBlack[3];
		Assignment c = (Assignment) result2_bindingAndBlack[4];
		Command z = (Command) result2_bindingAndBlack[5];
		While w = (While) result2_bindingAndBlack[6];
		Assignment b = (Assignment) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = whileula2branchubcImpl
				.pattern_whileula2branchubc_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, a, i, x, y, c, z, w, b,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[a] = " + a + ", " + "[i] = " + i + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[c] = "
					+ c + ", " + "[z] = " + z + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whileula2branchubcImpl.pattern_whileula2branchubc_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whileula2branchubcImpl
					.pattern_whileula2branchubc_24_5_matchcorrcontext_blackBFBBB(i, w, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[1];
				Object[] result5_green = whileula2branchubcImpl
						.pattern_whileula2branchubc_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whileula2branchubcImpl
						.pattern_whileula2branchubc_24_6_createcorrespondence_blackBBBBBBBBB(a, i, x, y, c, z, w, b,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a] = " + a + ", "
							+ "[i] = " + i + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[c] = " + c + ", "
							+ "[z] = " + z + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				whileula2branchubcImpl.pattern_whileula2branchubc_24_6_createcorrespondence_greenBFBBBFBBFB(a, x, y, c,
						z, b, ccMatch);
				//nothing S2B a2x = (S2B) result6_green[1];
				//nothing S2N c2z = (S2N) result6_green[5];
				//nothing S2N b2y = (S2N) result6_green[8];

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
	public CSP isApplicable_solveCsp_CC(While a, Branch i, Branch x, Command y, Assignment c, Command z, While w,
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
	public boolean checkDEC_FWD(While a, Assignment c, While w, Assignment b) {// 
		Object[] result1_black = whileula2branchubcImpl.pattern_whileula2branchubc_27_1_matchtggpattern_blackBBBB(a, c,
				w, b);
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
	public boolean checkDEC_BWD(Branch i, Branch x, Command y, Command z) {// 
		Object[] result1_black = whileula2branchubcImpl.pattern_whileula2branchubc_28_1_matchtggpattern_blackBBBB(i, x,
				y, z);
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
			Branch i = (Branch) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			While w = (While) result2_black[3];

			Object[] result3_bindingAndBlack = whileula2branchubcImpl
					.pattern_whileula2branchubc_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, i, w2i, w,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[i] = " + i + ", " + "[w2i] = " + w2i
						+ ", " + "[w] = " + w + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whileula2branchubcImpl.pattern_whileula2branchubc_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whileula2branchubcImpl.pattern_whileula2branchubc_29_5_checknacs_blackBBB(i,
						w2i, w);
				if (result5_black != null) {

					Object[] result6_black = whileula2branchubcImpl.pattern_whileula2branchubc_29_6_perform_blackBBBB(i,
							w2i, w, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[i] = " + i + ", "
								+ "[w2i] = " + w2i + ", " + "[w] = " + w + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whileula2branchubcImpl.pattern_whileula2branchubc_29_6_perform_greenFFBFFFFFBFFB(i, w, ruleResult);
					//nothing While a = (While) result6_green[0];
					//nothing S2B a2x = (S2B) result6_green[1];
					//nothing Branch x = (Branch) result6_green[3];
					//nothing Command y = (Command) result6_green[4];
					//nothing Assignment c = (Assignment) result6_green[5];
					//nothing S2N c2z = (S2N) result6_green[6];
					//nothing Command z = (Command) result6_green[7];
					//nothing Assignment b = (Assignment) result6_green[9];
					//nothing S2N b2y = (S2N) result6_green[10];

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
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPROPRIATE_FWD__MATCH_WHILE_ASSIGNMENT_WHILE_ASSIGNMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(While) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.WHILEULA2BRANCHUBC___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WHILE_ASSIGNMENT_WHILE_ASSIGNMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (Assignment) arguments.get(4));
			return null;
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WHILE_ASSIGNMENT_WHILE_ASSIGNMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_WHILE_BRANCH_ASSIGNMENT_S2B_WHILE_ASSIGNMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(Branch) arguments.get(2), (Assignment) arguments.get(3), (S2B) arguments.get(4),
					(While) arguments.get(5), (Assignment) arguments.get(6));
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
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPROPRIATE_BWD__MATCH_BRANCH_BRANCH_COMMAND_COMMAND:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Command) arguments.get(4));
		case RulesPackage.WHILEULA2BRANCHUBC___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_BRANCH_COMMAND_COMMAND:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Command) arguments.get(4));
			return null;
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_BRANCH_COMMAND_COMMAND:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Command) arguments.get(4));
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_BRANCH_COMMAND_COMMAND_S2B_WHILE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Command) arguments.get(4),
					(S2B) arguments.get(5), (While) arguments.get(6));
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
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPROPRIATE_BWD_EMOFLON_EDGE_76__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_76((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPROPRIATE_FWD_EMOFLON_EDGE_82__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_82((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPLICABLE_SOLVE_CSP_CC__WHILE_BRANCH_BRANCH_COMMAND_ASSIGNMENT_COMMAND_WHILE_ASSIGNMENT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((While) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Assignment) arguments.get(4),
					(Command) arguments.get(5), (While) arguments.get(6), (Assignment) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.WHILEULA2BRANCHUBC___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEULA2BRANCHUBC___CHECK_DEC_FWD__WHILE_ASSIGNMENT_WHILE_ASSIGNMENT:
			return checkDEC_FWD((While) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3));
		case RulesPackage.WHILEULA2BRANCHUBC___CHECK_DEC_BWD__BRANCH_BRANCH_COMMAND_COMMAND:
			return checkDEC_BWD((Branch) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Command) arguments.get(3));
		case RulesPackage.WHILEULA2BRANCHUBC___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILEULA2BRANCHUBC___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_S2B_WHILE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (While) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILEULA2BRANCHUBC___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whileula2branchubc_0_1_initialbindings_blackBBBBBB(whileula2branchubc _this,
			Match match, While a, Assignment c, While w, Assignment b) {
		if (!a.equals(w)) {
			if (!b.equals(c)) {
				return new Object[] { _this, match, a, c, w, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_0_2_SolveCSP_bindingFBBBBBB(whileula2branchubc _this,
			Match match, While a, Assignment c, While w, Assignment b) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, a, c, w, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, a, c, w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileula2branchubc_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			whileula2branchubc _this, Match match, While a, Assignment c, While w, Assignment b) {
		Object[] result_pattern_whileula2branchubc_0_2_SolveCSP_binding = pattern_whileula2branchubc_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, a, c, w, b);
		if (result_pattern_whileula2branchubc_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileula2branchubc_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whileula2branchubc_0_2_SolveCSP_black = pattern_whileula2branchubc_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileula2branchubc_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, a, c, w, b };
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
			While a, Assignment c, While w, Assignment b) {
		if (!a.equals(w)) {
			if (!b.equals(c)) {
				return new Object[] { match, a, c, w, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_0_4_collectelementstobetranslated_greenBBBBBFFFF(
			Match match, While a, Assignment c, While w, Assignment b) {
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
		return new Object[] { match, a, c, w, b, a__b____last, a__b____first, w__a____first, w__c____next };
	}

	public static final Object[] pattern_whileula2branchubc_0_5_collectcontextelements_blackBBBBB(Match match, While a,
			Assignment c, While w, Assignment b) {
		if (!a.equals(w)) {
			if (!b.equals(c)) {
				return new Object[] { match, a, c, w, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whileula2branchubc_0_6_registerobjectstomatch_expressionBBBBBB(
			whileula2branchubc _this, Match match, While a, Assignment c, While w, Assignment b) {
		_this.registerObjectsToMatch_FWD(match, a, c, w, b);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("a");
		EObject _localVariable_1 = isApplicableMatch.getObject("i");
		EObject _localVariable_2 = isApplicableMatch.getObject("c");
		EObject _localVariable_3 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_4 = isApplicableMatch.getObject("w");
		EObject _localVariable_5 = isApplicableMatch.getObject("b");
		EObject tmpA = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpW2i = _localVariable_3;
		EObject tmpW = _localVariable_4;
		EObject tmpB = _localVariable_5;
		if (tmpA instanceof While) {
			While a = (While) tmpA;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpC instanceof Assignment) {
					Assignment c = (Assignment) tmpC;
					if (tmpW2i instanceof S2B) {
						S2B w2i = (S2B) tmpW2i;
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							if (tmpB instanceof Assignment) {
								Assignment b = (Assignment) tmpB;
								return new Object[] { a, i, c, w2i, w, b, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_1_1_performtransformation_blackBBBBBBFBB(While a, Branch i,
			Assignment c, S2B w2i, While w, Assignment b, whileula2branchubc _this,
			IsApplicableMatch isApplicableMatch) {
		if (!a.equals(w)) {
			if (!b.equals(c)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { a, i, c, w2i, w, b, csp, _this, isApplicableMatch };
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
			While a = (While) result_pattern_whileula2branchubc_1_1_performtransformation_binding[0];
			Branch i = (Branch) result_pattern_whileula2branchubc_1_1_performtransformation_binding[1];
			Assignment c = (Assignment) result_pattern_whileula2branchubc_1_1_performtransformation_binding[2];
			S2B w2i = (S2B) result_pattern_whileula2branchubc_1_1_performtransformation_binding[3];
			While w = (While) result_pattern_whileula2branchubc_1_1_performtransformation_binding[4];
			Assignment b = (Assignment) result_pattern_whileula2branchubc_1_1_performtransformation_binding[5];

			Object[] result_pattern_whileula2branchubc_1_1_performtransformation_black = pattern_whileula2branchubc_1_1_performtransformation_blackBBBBBBFBB(
					a, i, c, w2i, w, b, _this, isApplicableMatch);
			if (result_pattern_whileula2branchubc_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileula2branchubc_1_1_performtransformation_black[6];

				return new Object[] { a, i, c, w2i, w, b, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_1_1_performtransformation_greenBFBFFBFFBF(While a, Branch i,
			Assignment c, Assignment b) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2N c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2x.setSource(a);
		i.setPositive(x);
		a2x.setTarget(x);
		y.setNext(x);
		x.setPositive(y);
		c2z.setSource(c);
		i.setNegative(z);
		c2z.setTarget(z);
		b2y.setTarget(y);
		b2y.setSource(b);
		return new Object[] { a, a2x, i, x, y, c, c2z, z, b, b2y };
	}

	public static final Object[] pattern_whileula2branchubc_1_2_collecttranslatedelements_blackBBBBBBBBB(While a,
			S2B a2x, Branch x, Command y, Assignment c, S2N c2z, Command z, Assignment b, S2N b2y) {
		if (!y.equals(z)) {
			if (!b.equals(c)) {
				if (!b2y.equals(c2z)) {
					return new Object[] { a, a2x, x, y, c, c2z, z, b, b2y };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_1_2_collecttranslatedelements_greenFBBBBBBBBB(While a,
			S2B a2x, Branch x, Command y, Assignment c, S2N c2z, Command z, Assignment b, S2N b2y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(b2y);
		return new Object[] { ruleresult, a, a2x, x, y, c, c2z, z, b, b2y };
	}

	public static final Object[] pattern_whileula2branchubc_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject a, EObject a2x, EObject i, EObject x, EObject y, EObject c,
			EObject c2z, EObject z, EObject w2i, EObject w, EObject b, EObject b2y) {
		if (!a.equals(a2x)) {
			if (!a.equals(i)) {
				if (!a.equals(x)) {
					if (!a.equals(y)) {
						if (!a.equals(c)) {
							if (!a.equals(c2z)) {
								if (!a.equals(z)) {
									if (!a.equals(w2i)) {
										if (!a.equals(w)) {
											if (!a.equals(b)) {
												if (!a.equals(b2y)) {
													if (!a2x.equals(i)) {
														if (!a2x.equals(x)) {
															if (!a2x.equals(y)) {
																if (!a2x.equals(c)) {
																	if (!a2x.equals(c2z)) {
																		if (!a2x.equals(z)) {
																			if (!a2x.equals(w2i)) {
																				if (!a2x.equals(w)) {
																					if (!a2x.equals(b)) {
																						if (!a2x.equals(b2y)) {
																							if (!i.equals(x)) {
																								if (!i.equals(y)) {
																									if (!i.equals(z)) {
																										if (!i.equals(
																												w2i)) {
																											if (!i.equals(
																													w)) {
																												if (!x.equals(
																														y)) {
																													if (!x.equals(
																															z)) {
																														if (!y.equals(
																																z)) {
																															if (!c.equals(
																																	i)) {
																																if (!c.equals(
																																		x)) {
																																	if (!c.equals(
																																			y)) {
																																		if (!c.equals(
																																				c2z)) {
																																			if (!c.equals(
																																					z)) {
																																				if (!c.equals(
																																						w2i)) {
																																					if (!c.equals(
																																							w)) {
																																						if (!c2z.equals(
																																								i)) {
																																							if (!c2z.equals(
																																									x)) {
																																								if (!c2z.equals(
																																										y)) {
																																									if (!c2z.equals(
																																											z)) {
																																										if (!c2z.equals(
																																												w2i)) {
																																											if (!c2z.equals(
																																													w)) {
																																												if (!w2i.equals(
																																														x)) {
																																													if (!w2i.equals(
																																															y)) {
																																														if (!w2i.equals(
																																																z)) {
																																															if (!w.equals(
																																																	x)) {
																																																if (!w.equals(
																																																		y)) {
																																																	if (!w.equals(
																																																			z)) {
																																																		if (!w.equals(
																																																				w2i)) {
																																																			if (!b.equals(
																																																					i)) {
																																																				if (!b.equals(
																																																						x)) {
																																																					if (!b.equals(
																																																							y)) {
																																																						if (!b.equals(
																																																								c)) {
																																																							if (!b.equals(
																																																									c2z)) {
																																																								if (!b.equals(
																																																										z)) {
																																																									if (!b.equals(
																																																											w2i)) {
																																																										if (!b.equals(
																																																												w)) {
																																																											if (!b.equals(
																																																													b2y)) {
																																																												if (!b2y.equals(
																																																														i)) {
																																																													if (!b2y.equals(
																																																															x)) {
																																																														if (!b2y.equals(
																																																																y)) {
																																																															if (!b2y.equals(
																																																																	c)) {
																																																																if (!b2y.equals(
																																																																		c2z)) {
																																																																	if (!b2y.equals(
																																																																			z)) {
																																																																		if (!b2y.equals(
																																																																				w2i)) {
																																																																			if (!b2y.equals(
																																																																					w)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						a,
																																																																						a2x,
																																																																						i,
																																																																						x,
																																																																						y,
																																																																						c,
																																																																						c2z,
																																																																						z,
																																																																						w2i,
																																																																						w,
																																																																						b,
																																																																						b2y };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject a, EObject a2x, EObject i, EObject x, EObject y, EObject c,
			EObject c2z, EObject z, EObject w, EObject b, EObject b2y) {
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileula2branchubc";
		String a__b____last_name_prime = "last";
		String a2x__a____source_name_prime = "source";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		String a__b____first_name_prime = "first";
		String c2z__c____source_name_prime = "source";
		String c2z__z____target_name_prime = "target";
		String y__x____next_name_prime = "next";
		String x__y____positive_name_prime = "positive";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____first);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(y__x____next);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		ruleresult.getCreatedEdges().add(x__y____positive);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a__b____last.setName(a__b____last_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		return new Object[] { ruleresult, a, a2x, i, x, y, c, c2z, z, w, b, b2y, a__b____last, a2x__a____source,
				i__z____negative, i__x____positive, a2x__x____target, a__b____first, c2z__c____source, c2z__z____target,
				y__x____next, x__y____positive, w__a____first, w__c____next, b2y__y____target, b2y__b____source };
	}

	public static final void pattern_whileula2branchubc_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whileula2branchubc _this, PerformRuleResult ruleresult, EObject a, EObject a2x, EObject i, EObject x,
			EObject y, EObject c, EObject c2z, EObject z, EObject w2i, EObject w, EObject b, EObject b2y) {
		_this.registerObjects_FWD(ruleresult, a, a2x, i, x, y, c, c2z, z, w2i, w, b, b2y);

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
		EObject _localVariable_1 = match.getObject("c");
		EObject _localVariable_2 = match.getObject("w");
		EObject _localVariable_3 = match.getObject("b");
		EObject tmpA = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpB = _localVariable_3;
		if (tmpA instanceof While) {
			While a = (While) tmpA;
			if (tmpC instanceof Assignment) {
				Assignment c = (Assignment) tmpC;
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					if (tmpB instanceof Assignment) {
						Assignment b = (Assignment) tmpB;
						return new Object[] { a, c, w, b, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileula2branchubc_2_2_corematch_blackBFBFBBB(While a, Assignment c,
			While w, Assignment b, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			if (!b.equals(c)) {
				for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class,
						"source")) {
					Branch i = w2i.getTarget();
					if (i != null) {
						_result.add(new Object[] { a, i, c, w2i, w, b, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileula2branchubc_2_3_findcontext_blackBBBBBB(While a, Branch i,
			Assignment c, S2B w2i, While w, Assignment b) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			if (!b.equals(c)) {
				if (b.equals(a.getLast())) {
					if (b.equals(a.getFirst())) {
						if (i.equals(w2i.getTarget())) {
							if (a.equals(w.getFirst())) {
								if (w.equals(w2i.getSource())) {
									if (c.equals(w.getNext())) {
										_result.add(new Object[] { a, i, c, w2i, w, b });
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

	public static final Object[] pattern_whileula2branchubc_2_3_findcontext_greenBBBBBBFFFFFFF(While a, Branch i,
			Assignment c, S2B w2i, While w, Assignment b) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String a__b____last_name_prime = "last";
		String a__b____first_name_prime = "first";
		String w2i__i____target_name_prime = "target";
		String w__a____first_name_prime = "first";
		String w2i__w____source_name_prime = "source";
		String w__c____next_name_prime = "next";
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(b);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____last);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____first);
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
		a__b____last.setName(a__b____last_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		return new Object[] { a, i, c, w2i, w, b, isApplicableMatch, a__b____last, a__b____first, w2i__i____target,
				w__a____first, w2i__w____source, w__c____next };
	}

	public static final Object[] pattern_whileula2branchubc_2_4_solveCSP_bindingFBBBBBBBB(whileula2branchubc _this,
			IsApplicableMatch isApplicableMatch, While a, Branch i, Assignment c, S2B w2i, While w, Assignment b) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, a, i, c, w2i, w, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, a, i, c, w2i, w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileula2branchubc_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			whileula2branchubc _this, IsApplicableMatch isApplicableMatch, While a, Branch i, Assignment c, S2B w2i,
			While w, Assignment b) {
		Object[] result_pattern_whileula2branchubc_2_4_solveCSP_binding = pattern_whileula2branchubc_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, a, i, c, w2i, w, b);
		if (result_pattern_whileula2branchubc_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileula2branchubc_2_4_solveCSP_binding[0];

			Object[] result_pattern_whileula2branchubc_2_4_solveCSP_black = pattern_whileula2branchubc_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileula2branchubc_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, a, i, c, w2i, w, b };
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
			Match match, Branch i, Branch x, Command y, Command z) {
		if (!i.equals(x)) {
			if (!y.equals(z)) {
				return new Object[] { _this, match, i, x, y, z };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_10_2_SolveCSP_bindingFBBBBBB(whileula2branchubc _this,
			Match match, Branch i, Branch x, Command y, Command z) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, i, x, y, z);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, i, x, y, z };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileula2branchubc_10_2_SolveCSP_bindingAndBlackFBBBBBB(
			whileula2branchubc _this, Match match, Branch i, Branch x, Command y, Command z) {
		Object[] result_pattern_whileula2branchubc_10_2_SolveCSP_binding = pattern_whileula2branchubc_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, i, x, y, z);
		if (result_pattern_whileula2branchubc_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileula2branchubc_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whileula2branchubc_10_2_SolveCSP_black = pattern_whileula2branchubc_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileula2branchubc_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, i, x, y, z };
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
			Branch i, Branch x, Command y, Command z) {
		if (!i.equals(x)) {
			if (!y.equals(z)) {
				return new Object[] { match, i, x, y, z };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_10_4_collectelementstobetranslated_greenBBBBBFFFF(
			Match match, Branch i, Branch x, Command y, Command z) {
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(z);
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
		return new Object[] { match, i, x, y, z, i__z____negative, i__x____positive, y__x____next, x__y____positive };
	}

	public static final Object[] pattern_whileula2branchubc_10_5_collectcontextelements_blackBBBBB(Match match,
			Branch i, Branch x, Command y, Command z) {
		if (!i.equals(x)) {
			if (!y.equals(z)) {
				return new Object[] { match, i, x, y, z };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_10_5_collectcontextelements_greenBB(Match match, Branch i) {
		match.getContextNodes().add(i);
		return new Object[] { match, i };
	}

	public static final void pattern_whileula2branchubc_10_6_registerobjectstomatch_expressionBBBBBB(
			whileula2branchubc _this, Match match, Branch i, Branch x, Command y, Command z) {
		_this.registerObjectsToMatch_BWD(match, i, x, y, z);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("i");
		EObject _localVariable_1 = isApplicableMatch.getObject("x");
		EObject _localVariable_2 = isApplicableMatch.getObject("y");
		EObject _localVariable_3 = isApplicableMatch.getObject("z");
		EObject _localVariable_4 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_5 = isApplicableMatch.getObject("w");
		EObject tmpI = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		EObject tmpW2i = _localVariable_4;
		EObject tmpW = _localVariable_5;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpY instanceof Command) {
					Command y = (Command) tmpY;
					if (tmpZ instanceof Command) {
						Command z = (Command) tmpZ;
						if (tmpW2i instanceof S2B) {
							S2B w2i = (S2B) tmpW2i;
							if (tmpW instanceof While) {
								While w = (While) tmpW;
								return new Object[] { i, x, y, z, w2i, w, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_11_1_performtransformation_blackBBBBBBFBB(Branch i,
			Branch x, Command y, Command z, S2B w2i, While w, whileula2branchubc _this,
			IsApplicableMatch isApplicableMatch) {
		if (!i.equals(x)) {
			if (!y.equals(z)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { i, x, y, z, w2i, w, csp, _this, isApplicableMatch };
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
			Branch i = (Branch) result_pattern_whileula2branchubc_11_1_performtransformation_binding[0];
			Branch x = (Branch) result_pattern_whileula2branchubc_11_1_performtransformation_binding[1];
			Command y = (Command) result_pattern_whileula2branchubc_11_1_performtransformation_binding[2];
			Command z = (Command) result_pattern_whileula2branchubc_11_1_performtransformation_binding[3];
			S2B w2i = (S2B) result_pattern_whileula2branchubc_11_1_performtransformation_binding[4];
			While w = (While) result_pattern_whileula2branchubc_11_1_performtransformation_binding[5];

			Object[] result_pattern_whileula2branchubc_11_1_performtransformation_black = pattern_whileula2branchubc_11_1_performtransformation_blackBBBBBBFBB(
					i, x, y, z, w2i, w, _this, isApplicableMatch);
			if (result_pattern_whileula2branchubc_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileula2branchubc_11_1_performtransformation_black[6];

				return new Object[] { i, x, y, z, w2i, w, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_11_1_performtransformation_greenFFBBFFBBFF(Branch x,
			Command y, Command z, While w) {
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment c = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		w.setFirst(a);
		a2x.setSource(a);
		a2x.setTarget(x);
		w.setNext(c);
		c2z.setSource(c);
		c2z.setTarget(z);
		a.setLast(b);
		a.setFirst(b);
		b2y.setTarget(y);
		b2y.setSource(b);
		return new Object[] { a, a2x, x, y, c, c2z, z, w, b, b2y };
	}

	public static final Object[] pattern_whileula2branchubc_11_2_collecttranslatedelements_blackBBBBBBBBB(While a,
			S2B a2x, Branch x, Command y, Assignment c, S2N c2z, Command z, Assignment b, S2N b2y) {
		if (!y.equals(z)) {
			if (!b.equals(c)) {
				if (!b2y.equals(c2z)) {
					return new Object[] { a, a2x, x, y, c, c2z, z, b, b2y };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_11_2_collecttranslatedelements_greenFBBBBBBBBB(While a,
			S2B a2x, Branch x, Command y, Assignment c, S2N c2z, Command z, Assignment b, S2N b2y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(b2y);
		return new Object[] { ruleresult, a, a2x, x, y, c, c2z, z, b, b2y };
	}

	public static final Object[] pattern_whileula2branchubc_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject a, EObject a2x, EObject i, EObject x, EObject y, EObject c,
			EObject c2z, EObject z, EObject w2i, EObject w, EObject b, EObject b2y) {
		if (!a.equals(a2x)) {
			if (!a.equals(i)) {
				if (!a.equals(x)) {
					if (!a.equals(y)) {
						if (!a.equals(c)) {
							if (!a.equals(c2z)) {
								if (!a.equals(z)) {
									if (!a.equals(w2i)) {
										if (!a.equals(w)) {
											if (!a.equals(b)) {
												if (!a.equals(b2y)) {
													if (!a2x.equals(i)) {
														if (!a2x.equals(x)) {
															if (!a2x.equals(y)) {
																if (!a2x.equals(c)) {
																	if (!a2x.equals(c2z)) {
																		if (!a2x.equals(z)) {
																			if (!a2x.equals(w2i)) {
																				if (!a2x.equals(w)) {
																					if (!a2x.equals(b)) {
																						if (!a2x.equals(b2y)) {
																							if (!i.equals(x)) {
																								if (!i.equals(y)) {
																									if (!i.equals(z)) {
																										if (!i.equals(
																												w2i)) {
																											if (!i.equals(
																													w)) {
																												if (!x.equals(
																														y)) {
																													if (!x.equals(
																															z)) {
																														if (!y.equals(
																																z)) {
																															if (!c.equals(
																																	i)) {
																																if (!c.equals(
																																		x)) {
																																	if (!c.equals(
																																			y)) {
																																		if (!c.equals(
																																				c2z)) {
																																			if (!c.equals(
																																					z)) {
																																				if (!c.equals(
																																						w2i)) {
																																					if (!c.equals(
																																							w)) {
																																						if (!c2z.equals(
																																								i)) {
																																							if (!c2z.equals(
																																									x)) {
																																								if (!c2z.equals(
																																										y)) {
																																									if (!c2z.equals(
																																											z)) {
																																										if (!c2z.equals(
																																												w2i)) {
																																											if (!c2z.equals(
																																													w)) {
																																												if (!w2i.equals(
																																														x)) {
																																													if (!w2i.equals(
																																															y)) {
																																														if (!w2i.equals(
																																																z)) {
																																															if (!w.equals(
																																																	x)) {
																																																if (!w.equals(
																																																		y)) {
																																																	if (!w.equals(
																																																			z)) {
																																																		if (!w.equals(
																																																				w2i)) {
																																																			if (!b.equals(
																																																					i)) {
																																																				if (!b.equals(
																																																						x)) {
																																																					if (!b.equals(
																																																							y)) {
																																																						if (!b.equals(
																																																								c)) {
																																																							if (!b.equals(
																																																									c2z)) {
																																																								if (!b.equals(
																																																										z)) {
																																																									if (!b.equals(
																																																											w2i)) {
																																																										if (!b.equals(
																																																												w)) {
																																																											if (!b.equals(
																																																													b2y)) {
																																																												if (!b2y.equals(
																																																														i)) {
																																																													if (!b2y.equals(
																																																															x)) {
																																																														if (!b2y.equals(
																																																																y)) {
																																																															if (!b2y.equals(
																																																																	c)) {
																																																																if (!b2y.equals(
																																																																		c2z)) {
																																																																	if (!b2y.equals(
																																																																			z)) {
																																																																		if (!b2y.equals(
																																																																				w2i)) {
																																																																			if (!b2y.equals(
																																																																					w)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						a,
																																																																						a2x,
																																																																						i,
																																																																						x,
																																																																						y,
																																																																						c,
																																																																						c2z,
																																																																						z,
																																																																						w2i,
																																																																						w,
																																																																						b,
																																																																						b2y };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject a, EObject a2x, EObject i, EObject x, EObject y, EObject c,
			EObject c2z, EObject z, EObject w, EObject b, EObject b2y) {
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileula2branchubc";
		String a__b____last_name_prime = "last";
		String a2x__a____source_name_prime = "source";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		String a__b____first_name_prime = "first";
		String c2z__c____source_name_prime = "source";
		String c2z__z____target_name_prime = "target";
		String y__x____next_name_prime = "next";
		String x__y____positive_name_prime = "positive";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		String b2y__b____source_name_prime = "source";
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		a__b____first.setSrc(a);
		a__b____first.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____first);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(y__x____next);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		ruleresult.getTranslatedEdges().add(x__y____positive);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a__b____last.setName(a__b____last_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		a__b____first.setName(a__b____first_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		return new Object[] { ruleresult, a, a2x, i, x, y, c, c2z, z, w, b, b2y, a__b____last, a2x__a____source,
				i__z____negative, i__x____positive, a2x__x____target, a__b____first, c2z__c____source, c2z__z____target,
				y__x____next, x__y____positive, w__a____first, w__c____next, b2y__y____target, b2y__b____source };
	}

	public static final void pattern_whileula2branchubc_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whileula2branchubc _this, PerformRuleResult ruleresult, EObject a, EObject a2x, EObject i, EObject x,
			EObject y, EObject c, EObject c2z, EObject z, EObject w2i, EObject w, EObject b, EObject b2y) {
		_this.registerObjects_BWD(ruleresult, a, a2x, i, x, y, c, c2z, z, w2i, w, b, b2y);

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
		EObject _localVariable_1 = match.getObject("x");
		EObject _localVariable_2 = match.getObject("y");
		EObject _localVariable_3 = match.getObject("z");
		EObject tmpI = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpX instanceof Branch) {
				Branch x = (Branch) tmpX;
				if (tmpY instanceof Command) {
					Command y = (Command) tmpY;
					if (tmpZ instanceof Command) {
						Command z = (Command) tmpZ;
						return new Object[] { i, x, y, z, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileula2branchubc_12_2_corematch_blackBBBBFFB(Branch i, Branch x,
			Command y, Command z, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(x)) {
			if (!y.equals(z)) {
				for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class,
						"target")) {
					Statement tmpW = w2i.getSource();
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						_result.add(new Object[] { i, x, y, z, w2i, w, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileula2branchubc_12_3_findcontext_blackBBBBBB(Branch i, Branch x,
			Command y, Command z, S2B w2i, While w) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(x)) {
			if (!y.equals(z)) {
				if (z.equals(i.getNegative())) {
					if (x.equals(i.getPositive())) {
						if (x.equals(y.getNext())) {
							if (y.equals(x.getPositive())) {
								if (i.equals(w2i.getTarget())) {
									if (w.equals(w2i.getSource())) {
										_result.add(new Object[] { i, x, y, z, w2i, w });
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

	public static final Object[] pattern_whileula2branchubc_12_3_findcontext_greenBBBBBBFFFFFFF(Branch i, Branch x,
			Command y, Command z, S2B w2i, While w) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge x__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String y__x____next_name_prime = "next";
		String x__y____positive_name_prime = "positive";
		String w2i__i____target_name_prime = "target";
		String w2i__w____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(w);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(y__x____next);
		x__y____positive.setSrc(x);
		x__y____positive.setTrg(y);
		isApplicableMatch.getAllContextElements().add(x__y____positive);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		x__y____positive.setName(x__y____positive_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		return new Object[] { i, x, y, z, w2i, w, isApplicableMatch, i__z____negative, i__x____positive, y__x____next,
				x__y____positive, w2i__i____target, w2i__w____source };
	}

	public static final Object[] pattern_whileula2branchubc_12_4_solveCSP_bindingFBBBBBBBB(whileula2branchubc _this,
			IsApplicableMatch isApplicableMatch, Branch i, Branch x, Command y, Command z, S2B w2i, While w) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, i, x, y, z, w2i, w);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, i, x, y, z, w2i, w };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileula2branchubc_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			whileula2branchubc _this, IsApplicableMatch isApplicableMatch, Branch i, Branch x, Command y, Command z,
			S2B w2i, While w) {
		Object[] result_pattern_whileula2branchubc_12_4_solveCSP_binding = pattern_whileula2branchubc_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, i, x, y, z, w2i, w);
		if (result_pattern_whileula2branchubc_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileula2branchubc_12_4_solveCSP_binding[0];

			Object[] result_pattern_whileula2branchubc_12_4_solveCSP_black = pattern_whileula2branchubc_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileula2branchubc_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, i, x, y, z, w2i, w };
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

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_687785 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_1BB(Branch x,
			Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_positive_812896 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_812896)) {
					if (!i.equals(__DEC_x_positive_812896)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_2BB(Branch x,
			Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_negative_150849 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_150849)) {
					if (!i.equals(__DEC_x_negative_150849)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_553995 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_4BBB(Command y,
			Branch i, Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_positive_376740 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!i.equals(__DEC_y_positive_376740)) {
					if (!x.equals(__DEC_y_positive_376740)) {
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
			for (Branch __DEC_y_negative_8710 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!i.equals(__DEC_y_negative_8710)) {
					if (!x.equals(__DEC_y_negative_8710)) {
						return new Object[] { y, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_6B(Command z) {
		for (Graph __DEC_z_root_931570 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_7BBB(Command z,
			Branch i, Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_z_positive_425146 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!i.equals(__DEC_z_positive_425146)) {
					if (!x.equals(__DEC_z_positive_425146)) {
						return new Object[] { z, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_8BBB(Command z,
			Branch i, Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_z_negative_56054 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!i.equals(__DEC_z_negative_56054)) {
					if (!x.equals(__DEC_z_negative_56054)) {
						return new Object[] { z, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_9BB(Branch i,
			Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_10BB(Branch i,
			Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_11BB(Branch i,
			Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_12BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_13BB(Branch i,
			Command z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_14BB(Branch x,
			Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_15BB(Branch x,
			Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
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
										if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_6B(
												z) == null) {
											if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_13BB(i,
													z) == null) {
												if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_0B(
														x) == null) {
													if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_1BB(
															x, i) == null) {
														if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_2BB(
																x, i) == null) {
															if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_7BBB(
																	z, i, x) == null) {
																if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_8BBB(
																		z, i, x) == null) {
																	if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_9BB(
																			i, x) == null) {
																		if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_14BB(
																				x, z) == null) {
																			if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_15BB(
																					x, z) == null) {
																				if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_3B(
																						y) == null) {
																					if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_4BBB(
																							y, i, x) == null) {
																						if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_5BBB(
																								y, i, x) == null) {
																							if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_10BB(
																									i, y) == null) {
																								if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_11BB(
																										i, y) == null) {
																									if (pattern_whileula2branchubc_20_2_testcorematchandDECs_black_nac_12BB(
																											x,
																											y) == null) {
																										_result.add(
																												new Object[] {
																														i,
																														x,
																														y,
																														z,
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
			whileula2branchubc _this, Match match, Branch i, Branch x, Command y, Command z) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, i, x, y, z);
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
		for (Decision __DEC_a_positive_655798 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_1B(While a) {
		for (Decision __DEC_a_negative_788096 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_2BB(While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_a_last_842923 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_842923)) {
					if (!w.equals(__DEC_a_last_842923)) {
						return new Object[] { a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_3B(While a) {
		for (Program __DEC_a_first_947611 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_4B(Assignment c) {
		for (Decision __DEC_c_positive_92471 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_5B(Assignment c) {
		for (Decision __DEC_c_negative_936088 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_6BBB(Assignment c,
			While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_c_first_956697 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!a.equals(__DEC_c_first_956697)) {
					if (!w.equals(__DEC_c_first_956697)) {
						return new Object[] { c, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_7BBB(Assignment c,
			While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_c_last_379247 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!a.equals(__DEC_c_last_379247)) {
					if (!w.equals(__DEC_c_last_379247)) {
						return new Object[] { c, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_8B(Assignment c) {
		for (Program __DEC_c_first_866309 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_9B(Assignment b) {
		for (Decision __DEC_b_positive_793605 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_10B(Assignment b) {
		for (Decision __DEC_b_negative_509423 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_11BBB(Assignment b,
			While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_b_last_408314 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!a.equals(__DEC_b_last_408314)) {
					if (!w.equals(__DEC_b_last_408314)) {
						return new Object[] { b, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_12B(Assignment b) {
		for (Program __DEC_b_first_815648 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_13BB(While a,
			Assignment c) {
		if (c.equals(a.getFirst())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_14BB(While w,
			Assignment c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_15BB(While a,
			Assignment c) {
		if (c.equals(a.getLast())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_16BB(While w,
			Assignment c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_17BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileula2branchubc_21_2_testcorematchandDECs_blackFFFFB(
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
						if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_0B(a) == null) {
							if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_1B(a) == null) {
								if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_3B(a) == null) {
									if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_9B(b) == null) {
										if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_10B(
												b) == null) {
											if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_12B(
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
																	if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_11BBB(
																			b, a, w) == null) {
																		if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_17BB(
																				w, b) == null) {
																			if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_4B(
																					c) == null) {
																				if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_5B(
																						c) == null) {
																					if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_6BBB(
																							c, a, w) == null) {
																						if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_7BBB(
																								c, a, w) == null) {
																							if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_8B(
																									c) == null) {
																								if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_13BB(
																										a, c) == null) {
																									if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_14BB(
																											w,
																											c) == null) {
																										if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_15BB(
																												a,
																												c) == null) {
																											if (pattern_whileula2branchubc_21_2_testcorematchandDECs_black_nac_16BB(
																													w,
																													c) == null) {
																												_result.add(
																														new Object[] {
																																a,
																																c,
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
			whileula2branchubc _this, Match match, While a, Assignment c, While w, Assignment b) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, a, c, w, b);
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

	public static final Object[] pattern_whileula2branchubc_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("a");
		EObject _localVariable_1 = targetMatch.getObject("i");
		EObject _localVariable_2 = targetMatch.getObject("x");
		EObject _localVariable_3 = targetMatch.getObject("y");
		EObject _localVariable_4 = sourceMatch.getObject("c");
		EObject _localVariable_5 = targetMatch.getObject("z");
		EObject _localVariable_6 = sourceMatch.getObject("w");
		EObject _localVariable_7 = sourceMatch.getObject("b");
		EObject tmpA = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpX = _localVariable_2;
		EObject tmpY = _localVariable_3;
		EObject tmpC = _localVariable_4;
		EObject tmpZ = _localVariable_5;
		EObject tmpW = _localVariable_6;
		EObject tmpB = _localVariable_7;
		if (tmpA instanceof While) {
			While a = (While) tmpA;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpX instanceof Branch) {
					Branch x = (Branch) tmpX;
					if (tmpY instanceof Command) {
						Command y = (Command) tmpY;
						if (tmpC instanceof Assignment) {
							Assignment c = (Assignment) tmpC;
							if (tmpZ instanceof Command) {
								Command z = (Command) tmpZ;
								if (tmpW instanceof While) {
									While w = (While) tmpW;
									if (tmpB instanceof Assignment) {
										Assignment b = (Assignment) tmpB;
										return new Object[] { a, i, x, y, c, z, w, b, sourceMatch, targetMatch };
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

	public static final Object[] pattern_whileula2branchubc_24_2_matchsrctrgcontext_blackBBBBBBBBBB(While a, Branch i,
			Branch x, Command y, Assignment c, Command z, While w, Assignment b, Match sourceMatch, Match targetMatch) {
		if (!a.equals(w)) {
			if (!i.equals(x)) {
				if (!y.equals(z)) {
					if (!b.equals(c)) {
						if (!sourceMatch.equals(targetMatch)) {
							return new Object[] { a, i, x, y, c, z, w, b, sourceMatch, targetMatch };
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
				sourceMatch, targetMatch);
		if (result_pattern_whileula2branchubc_24_2_matchsrctrgcontext_binding != null) {
			While a = (While) result_pattern_whileula2branchubc_24_2_matchsrctrgcontext_binding[0];
			Branch i = (Branch) result_pattern_whileula2branchubc_24_2_matchsrctrgcontext_binding[1];
			Branch x = (Branch) result_pattern_whileula2branchubc_24_2_matchsrctrgcontext_binding[2];
			Command y = (Command) result_pattern_whileula2branchubc_24_2_matchsrctrgcontext_binding[3];
			Assignment c = (Assignment) result_pattern_whileula2branchubc_24_2_matchsrctrgcontext_binding[4];
			Command z = (Command) result_pattern_whileula2branchubc_24_2_matchsrctrgcontext_binding[5];
			While w = (While) result_pattern_whileula2branchubc_24_2_matchsrctrgcontext_binding[6];
			Assignment b = (Assignment) result_pattern_whileula2branchubc_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_whileula2branchubc_24_2_matchsrctrgcontext_black = pattern_whileula2branchubc_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					a, i, x, y, c, z, w, b, sourceMatch, targetMatch);
			if (result_pattern_whileula2branchubc_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { a, i, x, y, c, z, w, b, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_24_3_solvecsp_bindingFBBBBBBBBBBB(whileula2branchubc _this,
			While a, Branch i, Branch x, Command y, Assignment c, Command z, While w, Assignment b, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(a, i, x, y, c, z, w, b, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, a, i, x, y, c, z, w, b, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileula2branchubc_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			whileula2branchubc _this, While a, Branch i, Branch x, Command y, Assignment c, Command z, While w,
			Assignment b, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileula2branchubc_24_3_solvecsp_binding = pattern_whileula2branchubc_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, a, i, x, y, c, z, w, b, sourceMatch, targetMatch);
		if (result_pattern_whileula2branchubc_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whileula2branchubc_24_3_solvecsp_binding[0];

			Object[] result_pattern_whileula2branchubc_24_3_solvecsp_black = pattern_whileula2branchubc_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whileula2branchubc_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, a, i, x, y, c, z, w, b, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whileula2branchubc_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileula2branchubc_24_5_matchcorrcontext_blackBFBBB(Branch i,
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

	public static final Object[] pattern_whileula2branchubc_24_6_createcorrespondence_blackBBBBBBBBB(While a, Branch i,
			Branch x, Command y, Assignment c, Command z, While w, Assignment b, CCMatch ccMatch) {
		if (!a.equals(w)) {
			if (!i.equals(x)) {
				if (!y.equals(z)) {
					if (!b.equals(c)) {
						return new Object[] { a, i, x, y, c, z, w, b, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_24_6_createcorrespondence_greenBFBBBFBBFB(While a, Branch x,
			Command y, Assignment c, Command z, Assignment b, CCMatch ccMatch) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		c2z.setSource(c);
		c2z.setTarget(z);
		ccMatch.getCreateCorr().add(c2z);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		return new Object[] { a, a2x, x, y, c, c2z, z, b, b2y, ccMatch };
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
		for (Decision __DEC_a_positive_662207 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_1B(While a) {
		for (Decision __DEC_a_negative_931145 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_2BB(While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_a_last_16106 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_16106)) {
					if (!w.equals(__DEC_a_last_16106)) {
						return new Object[] { a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_3B(While a) {
		for (Program __DEC_a_first_999531 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_4B(Assignment c) {
		for (Decision __DEC_c_positive_317122 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_5B(Assignment c) {
		for (Decision __DEC_c_negative_225524 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_6BBB(Assignment c, While a,
			While w) {
		if (!a.equals(w)) {
			for (While __DEC_c_first_617547 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!a.equals(__DEC_c_first_617547)) {
					if (!w.equals(__DEC_c_first_617547)) {
						return new Object[] { c, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_7BBB(Assignment c, While a,
			While w) {
		if (!a.equals(w)) {
			for (While __DEC_c_last_805247 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!a.equals(__DEC_c_last_805247)) {
					if (!w.equals(__DEC_c_last_805247)) {
						return new Object[] { c, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_8B(Assignment c) {
		for (Program __DEC_c_first_121408 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_9B(Assignment b) {
		for (Decision __DEC_b_positive_66740 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_10B(Assignment b) {
		for (Decision __DEC_b_negative_513897 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_11BBB(Assignment b, While a,
			While w) {
		if (!a.equals(w)) {
			for (While __DEC_b_last_993251 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!a.equals(__DEC_b_last_993251)) {
					if (!w.equals(__DEC_b_last_993251)) {
						return new Object[] { b, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_12B(Assignment b) {
		for (Program __DEC_b_first_129998 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_13BB(While a, Assignment c) {
		if (c.equals(a.getFirst())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_14BB(While w, Assignment c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_15BB(While a, Assignment c) {
		if (c.equals(a.getLast())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_16BB(While w, Assignment c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_17BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_27_1_matchtggpattern_blackBBBB(While a, Assignment c,
			While w, Assignment b) {
		if (!a.equals(w)) {
			if (!b.equals(c)) {
				if (b.equals(a.getLast())) {
					if (b.equals(a.getFirst())) {
						if (a.equals(w.getFirst())) {
							if (c.equals(w.getNext())) {
								if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_0B(a) == null) {
									if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_1B(a) == null) {
										if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_2BB(a,
												w) == null) {
											if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_3B(
													a) == null) {
												if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_4B(
														c) == null) {
													if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_5B(
															c) == null) {
														if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_6BBB(
																c, a, w) == null) {
															if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_7BBB(
																	c, a, w) == null) {
																if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_8B(
																		c) == null) {
																	if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_9B(
																			b) == null) {
																		if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_10B(
																				b) == null) {
																			if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_11BBB(
																					b, a, w) == null) {
																				if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_12B(
																						b) == null) {
																					if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_13BB(
																							a, c) == null) {
																						if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_14BB(
																								w, c) == null) {
																							if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_15BB(
																									a, c) == null) {
																								if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_16BB(
																										w, c) == null) {
																									if (pattern_whileula2branchubc_27_1_matchtggpattern_black_nac_17BB(
																											w,
																											b) == null) {
																										return new Object[] {
																												a, c, w,
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

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_0B(Branch x) {
		for (Graph __DEC_x_root_596177 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_1BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_positive_528835 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_528835)) {
					if (!i.equals(__DEC_x_positive_528835)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_2BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_negative_339678 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_339678)) {
					if (!i.equals(__DEC_x_negative_339678)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_384789 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_4BBB(Command y, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_positive_118813 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!i.equals(__DEC_y_positive_118813)) {
					if (!x.equals(__DEC_y_positive_118813)) {
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
			for (Branch __DEC_y_negative_596122 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!i.equals(__DEC_y_negative_596122)) {
					if (!x.equals(__DEC_y_negative_596122)) {
						return new Object[] { y, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_6B(Command z) {
		for (Graph __DEC_z_root_732550 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_7BBB(Command z, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_z_positive_827238 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!i.equals(__DEC_z_positive_827238)) {
					if (!x.equals(__DEC_z_positive_827238)) {
						return new Object[] { z, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_8BBB(Command z, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_z_negative_341955 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!i.equals(__DEC_z_negative_341955)) {
					if (!x.equals(__DEC_z_negative_341955)) {
						return new Object[] { z, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_9BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_10BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_11BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_12BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_13BB(Branch i, Command z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_14BB(Branch x, Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_15BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_28_1_matchtggpattern_blackBBBB(Branch i, Branch x,
			Command y, Command z) {
		if (!i.equals(x)) {
			if (!y.equals(z)) {
				if (z.equals(i.getNegative())) {
					if (x.equals(i.getPositive())) {
						if (x.equals(y.getNext())) {
							if (y.equals(x.getPositive())) {
								if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_0B(x) == null) {
									if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_1BB(x, i) == null) {
										if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_2BB(x,
												i) == null) {
											if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_3B(
													y) == null) {
												if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_4BBB(y, i,
														x) == null) {
													if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_5BBB(
															y, i, x) == null) {
														if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_6B(
																z) == null) {
															if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_7BBB(
																	z, i, x) == null) {
																if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_8BBB(
																		z, i, x) == null) {
																	if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_9BB(
																			i, x) == null) {
																		if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_10BB(
																				i, y) == null) {
																			if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_11BB(
																					i, y) == null) {
																				if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_12BB(
																						x, y) == null) {
																					if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_13BB(
																							i, z) == null) {
																						if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_14BB(
																								x, z) == null) {
																							if (pattern_whileula2branchubc_28_1_matchtggpattern_black_nac_15BB(
																									x, z) == null) {
																								return new Object[] { i,
																										x, y, z };
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
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
							if (pattern_whileula2branchubc_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									w2i) == null) {
								if (pattern_whileula2branchubc_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										i) == null) {
									if (pattern_whileula2branchubc_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_whileula2branchubc_29_3_solveCSP_bindingFBBBBBB(whileula2branchubc _this,
			IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, While w, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, i, w2i, w, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, i, w2i, w, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whileula2branchubc_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileula2branchubc_29_3_solveCSP_bindingAndBlackFBBBBBB(
			whileula2branchubc _this, IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, While w,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whileula2branchubc_29_3_solveCSP_binding = pattern_whileula2branchubc_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, i, w2i, w, ruleResult);
		if (result_pattern_whileula2branchubc_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileula2branchubc_29_3_solveCSP_binding[0];

			Object[] result_pattern_whileula2branchubc_29_3_solveCSP_black = pattern_whileula2branchubc_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whileula2branchubc_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, i, w2i, w, ruleResult };
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

	public static final Object[] pattern_whileula2branchubc_29_5_checknacs_blackBBB(Branch i, S2B w2i, While w) {
		return new Object[] { i, w2i, w };
	}

	public static final Object[] pattern_whileula2branchubc_29_6_perform_blackBBBB(Branch i, S2B w2i, While w,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { i, w2i, w, ruleResult };
	}

	public static final Object[] pattern_whileula2branchubc_29_6_perform_greenFFBFFFFFBFFB(Branch i, While w,
			ModelgeneratorRuleResult ruleResult) {
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Assignment c = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		w.setFirst(a);
		ruleResult.getSourceObjects().add(a);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		i.setPositive(x);
		a2x.setTarget(x);
		ruleResult.getTargetObjects().add(x);
		y.setNext(x);
		x.setPositive(y);
		ruleResult.getTargetObjects().add(y);
		w.setNext(c);
		ruleResult.getSourceObjects().add(c);
		c2z.setSource(c);
		ruleResult.getCorrObjects().add(c2z);
		i.setNegative(z);
		c2z.setTarget(z);
		ruleResult.getTargetObjects().add(z);
		a.setLast(b);
		a.setFirst(b);
		ruleResult.getSourceObjects().add(b);
		b2y.setTarget(y);
		b2y.setSource(b);
		ruleResult.getCorrObjects().add(b2y);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { a, a2x, i, x, y, c, c2z, z, w, b, b2y, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whileula2branchubc_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whileula2branchubcImpl
