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
import org.wbsilva.bx.sourcecode2controlflow.Rules.whilela2branchbc;

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
 * An implementation of the model object '<em><b>whilela2branchbc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class whilela2branchbcImpl extends AbstractRuleImpl implements whilela2branchbc {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected whilela2branchbcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getwhilela2branchbc();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, While a, Assignment b, While w, Assignment c) {

		Object[] result1_black = whilela2branchbcImpl.pattern_whilela2branchbc_0_1_initialbindings_blackBBBBBB(this,
				match, a, b, w, c);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[w] = " + w + ", "
					+ "[c] = " + c + ".");
		}

		Object[] result2_bindingAndBlack = whilela2branchbcImpl
				.pattern_whilela2branchbc_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, a, b, w, c);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[w] = " + w + ", "
					+ "[c] = " + c + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whilela2branchbcImpl.pattern_whilela2branchbc_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whilela2branchbcImpl
					.pattern_whilela2branchbc_0_4_collectelementstobetranslated_blackBBBBB(match, a, b, w, c);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[b] = " + b + ", " + "[w] = " + w + ", " + "[c] = " + c + ".");
			}
			whilela2branchbcImpl.pattern_whilela2branchbc_0_4_collectelementstobetranslated_greenBBBBBFFF(match, a, b,
					w, c);
			//nothing EMoflonEdge a__b____last = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[7];

			Object[] result5_black = whilela2branchbcImpl
					.pattern_whilela2branchbc_0_5_collectcontextelements_blackBBBBB(match, a, b, w, c);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[b] = " + b + ", " + "[w] = " + w + ", " + "[c] = " + c + ".");
			}
			whilela2branchbcImpl.pattern_whilela2branchbc_0_5_collectcontextelements_greenBB(match, w);

			// 
			whilela2branchbcImpl.pattern_whilela2branchbc_0_6_registerobjectstomatch_expressionBBBBBB(this, match, a, b,
					w, c);
			return whilela2branchbcImpl.pattern_whilela2branchbc_0_7_expressionF();
		} else {
			return whilela2branchbcImpl.pattern_whilela2branchbc_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whilela2branchbcImpl
				.pattern_whilela2branchbc_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		While a = (While) result1_bindingAndBlack[0];
		Branch i = (Branch) result1_bindingAndBlack[1];
		S2B w2i = (S2B) result1_bindingAndBlack[2];
		Assignment b = (Assignment) result1_bindingAndBlack[3];
		While w = (While) result1_bindingAndBlack[4];
		Assignment c = (Assignment) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whilela2branchbcImpl
				.pattern_whilela2branchbc_1_1_performtransformation_greenBFFBFFBFBF(a, i, b, c);
		Command z = (Command) result1_green[1];
		S2N c2z = (S2N) result1_green[2];
		S2B a2x = (S2B) result1_green[4];
		Branch x = (Branch) result1_green[5];
		S2N b2y = (S2N) result1_green[7];
		Command y = (Command) result1_green[9];

		Object[] result2_black = whilela2branchbcImpl
				.pattern_whilela2branchbc_1_2_collecttranslatedelements_blackBBBBBBBBB(a, z, c2z, a2x, x, b, b2y, c, y);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a] = " + a + ", " + "[z] = " + z
					+ ", " + "[c2z] = " + c2z + ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", " + "[b] = " + b
					+ ", " + "[b2y] = " + b2y + ", " + "[c] = " + c + ", " + "[y] = " + y + ".");
		}
		Object[] result2_green = whilela2branchbcImpl
				.pattern_whilela2branchbc_1_2_collecttranslatedelements_greenFBBBBBBBBB(a, z, c2z, a2x, x, b, b2y, c,
						y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whilela2branchbcImpl
				.pattern_whilela2branchbc_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, a, z, c2z, i, w2i, a2x,
						x, b, w, b2y, c, y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a] = " + a + ", " + "[z] = " + z + ", " + "[c2z] = " + c2z + ", " + "[i] = " + i + ", "
					+ "[w2i] = " + w2i + ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", " + "[b] = " + b + ", "
					+ "[w] = " + w + ", " + "[b2y] = " + b2y + ", " + "[c] = " + c + ", " + "[y] = " + y + ".");
		}
		whilela2branchbcImpl.pattern_whilela2branchbc_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult,
				a, z, c2z, i, a2x, x, b, w, b2y, c, y);
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[23];

		// 
		// 
		whilela2branchbcImpl.pattern_whilela2branchbc_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, a,
				z, c2z, i, w2i, a2x, x, b, w, b2y, c, y);
		return whilela2branchbcImpl.pattern_whilela2branchbc_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = whilela2branchbcImpl
				.pattern_whilela2branchbc_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whilela2branchbcImpl
				.pattern_whilela2branchbc_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whilela2branchbcImpl.pattern_whilela2branchbc_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		While a = (While) result2_binding[0];
		Assignment b = (Assignment) result2_binding[1];
		While w = (While) result2_binding[2];
		Assignment c = (Assignment) result2_binding[3];
		for (Object[] result2_black : whilela2branchbcImpl.pattern_whilela2branchbc_2_2_corematch_blackBFFBBBB(a, b, w,
				c, match)) {
			Branch i = (Branch) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			// ForEach 
			for (Object[] result3_black : whilela2branchbcImpl.pattern_whilela2branchbc_2_3_findcontext_blackBBBBBB(a,
					i, w2i, b, w, c)) {
				Object[] result3_green = whilela2branchbcImpl
						.pattern_whilela2branchbc_2_3_findcontext_greenBBBBBBFFFFFF(a, i, w2i, b, w, c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = whilela2branchbcImpl
						.pattern_whilela2branchbc_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, a, i,
								w2i, b, w, c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[a] = " + a + ", " + "[i] = " + i
							+ ", " + "[w2i] = " + w2i + ", " + "[b] = " + b + ", " + "[w] = " + w + ", " + "[c] = " + c
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whilela2branchbcImpl.pattern_whilela2branchbc_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whilela2branchbcImpl
							.pattern_whilela2branchbc_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whilela2branchbcImpl.pattern_whilela2branchbc_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whilela2branchbcImpl.pattern_whilela2branchbc_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, While a, Assignment b, While w, Assignment c) {
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
	public CSP isAppropriate_solveCsp_FWD(Match match, While a, Assignment b, While w, Assignment c) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, While a, Branch i, S2B w2i, Assignment b,
			While w, Assignment c) {// Create CSP
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
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("w", w);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject a, EObject z, EObject c2z, EObject i,
			EObject w2i, EObject a2x, EObject x, EObject b, EObject w, EObject b2y, EObject c, EObject y) {
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("y", y);

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
	public boolean isAppropriate_BWD(Match match, Command z, Branch i, Branch x, Command y) {

		Object[] result1_black = whilela2branchbcImpl.pattern_whilela2branchbc_10_1_initialbindings_blackBBBBBB(this,
				match, z, i, x, y);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[i] = " + i + ", " + "[x] = " + x + ", "
					+ "[y] = " + y + ".");
		}

		Object[] result2_bindingAndBlack = whilela2branchbcImpl
				.pattern_whilela2branchbc_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, z, i, x, y);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[i] = " + i + ", " + "[x] = " + x + ", "
					+ "[y] = " + y + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whilela2branchbcImpl.pattern_whilela2branchbc_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whilela2branchbcImpl
					.pattern_whilela2branchbc_10_4_collectelementstobetranslated_blackBBBBB(match, z, i, x, y);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[z] = " + z + ", " + "[i] = " + i + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
			}
			whilela2branchbcImpl.pattern_whilela2branchbc_10_4_collectelementstobetranslated_greenBBBBBFFF(match, z, i,
					x, y);
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge y__x____next = (EMoflonEdge) result4_green[7];

			Object[] result5_black = whilela2branchbcImpl
					.pattern_whilela2branchbc_10_5_collectcontextelements_blackBBBBB(match, z, i, x, y);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[z] = " + z + ", " + "[i] = " + i + ", " + "[x] = " + x + ", " + "[y] = " + y + ".");
			}
			whilela2branchbcImpl.pattern_whilela2branchbc_10_5_collectcontextelements_greenBB(match, i);

			// 
			whilela2branchbcImpl.pattern_whilela2branchbc_10_6_registerobjectstomatch_expressionBBBBBB(this, match, z,
					i, x, y);
			return whilela2branchbcImpl.pattern_whilela2branchbc_10_7_expressionF();
		} else {
			return whilela2branchbcImpl.pattern_whilela2branchbc_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whilela2branchbcImpl
				.pattern_whilela2branchbc_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Command z = (Command) result1_bindingAndBlack[0];
		Branch i = (Branch) result1_bindingAndBlack[1];
		S2B w2i = (S2B) result1_bindingAndBlack[2];
		Branch x = (Branch) result1_bindingAndBlack[3];
		While w = (While) result1_bindingAndBlack[4];
		Command y = (Command) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whilela2branchbcImpl
				.pattern_whilela2branchbc_11_1_performtransformation_greenFBFFBFBFFB(z, x, w, y);
		While a = (While) result1_green[0];
		S2N c2z = (S2N) result1_green[2];
		S2B a2x = (S2B) result1_green[3];
		Assignment b = (Assignment) result1_green[5];
		S2N b2y = (S2N) result1_green[7];
		Assignment c = (Assignment) result1_green[8];

		Object[] result2_black = whilela2branchbcImpl
				.pattern_whilela2branchbc_11_2_collecttranslatedelements_blackBBBBBBBBB(a, z, c2z, a2x, x, b, b2y, c,
						y);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a] = " + a + ", " + "[z] = " + z
					+ ", " + "[c2z] = " + c2z + ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", " + "[b] = " + b
					+ ", " + "[b2y] = " + b2y + ", " + "[c] = " + c + ", " + "[y] = " + y + ".");
		}
		Object[] result2_green = whilela2branchbcImpl
				.pattern_whilela2branchbc_11_2_collecttranslatedelements_greenFBBBBBBBBB(a, z, c2z, a2x, x, b, b2y, c,
						y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whilela2branchbcImpl
				.pattern_whilela2branchbc_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, a, z, c2z, i, w2i,
						a2x, x, b, w, b2y, c, y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a] = " + a + ", " + "[z] = " + z + ", " + "[c2z] = " + c2z + ", " + "[i] = " + i + ", "
					+ "[w2i] = " + w2i + ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", " + "[b] = " + b + ", "
					+ "[w] = " + w + ", " + "[b2y] = " + b2y + ", " + "[c] = " + c + ", " + "[y] = " + y + ".");
		}
		whilela2branchbcImpl.pattern_whilela2branchbc_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(ruleresult,
				a, z, c2z, i, a2x, x, b, w, b2y, c, y);
		//nothing EMoflonEdge a__b____last = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[23];

		// 
		// 
		whilela2branchbcImpl.pattern_whilela2branchbc_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, a,
				z, c2z, i, w2i, a2x, x, b, w, b2y, c, y);
		return whilela2branchbcImpl.pattern_whilela2branchbc_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = whilela2branchbcImpl
				.pattern_whilela2branchbc_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whilela2branchbcImpl
				.pattern_whilela2branchbc_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whilela2branchbcImpl.pattern_whilela2branchbc_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Command z = (Command) result2_binding[0];
		Branch i = (Branch) result2_binding[1];
		Branch x = (Branch) result2_binding[2];
		Command y = (Command) result2_binding[3];
		for (Object[] result2_black : whilela2branchbcImpl.pattern_whilela2branchbc_12_2_corematch_blackBBFBFBB(z, i, x,
				y, match)) {
			S2B w2i = (S2B) result2_black[2];
			While w = (While) result2_black[4];
			// ForEach 
			for (Object[] result3_black : whilela2branchbcImpl.pattern_whilela2branchbc_12_3_findcontext_blackBBBBBB(z,
					i, w2i, x, w, y)) {
				Object[] result3_green = whilela2branchbcImpl
						.pattern_whilela2branchbc_12_3_findcontext_greenBBBBBBFFFFFF(z, i, w2i, x, w, y);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge y__x____next = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = whilela2branchbcImpl
						.pattern_whilela2branchbc_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, z, i,
								w2i, x, w, y);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[z] = " + z + ", " + "[i] = " + i
							+ ", " + "[w2i] = " + w2i + ", " + "[x] = " + x + ", " + "[w] = " + w + ", " + "[y] = " + y
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whilela2branchbcImpl.pattern_whilela2branchbc_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whilela2branchbcImpl
							.pattern_whilela2branchbc_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whilela2branchbcImpl.pattern_whilela2branchbc_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whilela2branchbcImpl.pattern_whilela2branchbc_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Command z, Branch i, Branch x, Command y) {
		match.registerObject("z", z);
		match.registerObject("i", i);
		match.registerObject("x", x);
		match.registerObject("y", y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command z, Branch i, Branch x, Command y) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Command z, Branch i, S2B w2i, Branch x,
			While w, Command y) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("w", w);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject a, EObject z, EObject c2z, EObject i,
			EObject w2i, EObject a2x, EObject x, EObject b, EObject w, EObject b2y, EObject c, EObject y) {
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("y", y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_156(EMoflonEdge _edge_negative) {

		Object[] result1_bindingAndBlack = whilela2branchbcImpl
				.pattern_whilela2branchbc_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whilela2branchbcImpl.pattern_whilela2branchbc_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whilela2branchbcImpl
				.pattern_whilela2branchbc_20_2_testcorematchandDECs_blackFFFFB(_edge_negative)) {
			Command z = (Command) result2_black[0];
			Branch i = (Branch) result2_black[1];
			Branch x = (Branch) result2_black[2];
			Command y = (Command) result2_black[3];
			Object[] result2_green = whilela2branchbcImpl
					.pattern_whilela2branchbc_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whilela2branchbcImpl
					.pattern_whilela2branchbc_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, z, i, x, y)) {
				// 
				if (whilela2branchbcImpl
						.pattern_whilela2branchbc_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = whilela2branchbcImpl
							.pattern_whilela2branchbc_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whilela2branchbcImpl.pattern_whilela2branchbc_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whilela2branchbcImpl.pattern_whilela2branchbc_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_156(EMoflonEdge _edge_last) {

		Object[] result1_bindingAndBlack = whilela2branchbcImpl
				.pattern_whilela2branchbc_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whilela2branchbcImpl.pattern_whilela2branchbc_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whilela2branchbcImpl
				.pattern_whilela2branchbc_21_2_testcorematchandDECs_blackFFFFB(_edge_last)) {
			While a = (While) result2_black[0];
			Assignment b = (Assignment) result2_black[1];
			While w = (While) result2_black[2];
			Assignment c = (Assignment) result2_black[3];
			Object[] result2_green = whilela2branchbcImpl
					.pattern_whilela2branchbc_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whilela2branchbcImpl
					.pattern_whilela2branchbc_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, a, b, w, c)) {
				// 
				if (whilela2branchbcImpl
						.pattern_whilela2branchbc_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = whilela2branchbcImpl
							.pattern_whilela2branchbc_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whilela2branchbcImpl.pattern_whilela2branchbc_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whilela2branchbcImpl.pattern_whilela2branchbc_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("whilela2branchbc");
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
		ruleResult.setRule("whilela2branchbc");
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

		Object[] result1_black = whilela2branchbcImpl.pattern_whilela2branchbc_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whilela2branchbcImpl.pattern_whilela2branchbc_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = whilela2branchbcImpl
				.pattern_whilela2branchbc_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		While a = (While) result2_bindingAndBlack[0];
		Command z = (Command) result2_bindingAndBlack[1];
		Branch i = (Branch) result2_bindingAndBlack[2];
		Branch x = (Branch) result2_bindingAndBlack[3];
		Assignment b = (Assignment) result2_bindingAndBlack[4];
		While w = (While) result2_bindingAndBlack[5];
		Assignment c = (Assignment) result2_bindingAndBlack[6];
		Command y = (Command) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = whilela2branchbcImpl
				.pattern_whilela2branchbc_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, a, z, i, x, b, w, c, y,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[a] = " + a + ", " + "[z] = " + z + ", " + "[i] = " + i + ", " + "[x] = " + x + ", " + "[b] = "
					+ b + ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[y] = " + y + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whilela2branchbcImpl.pattern_whilela2branchbc_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whilela2branchbcImpl
					.pattern_whilela2branchbc_24_5_matchcorrcontext_blackBFBBB(i, w, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[1];
				Object[] result5_green = whilela2branchbcImpl
						.pattern_whilela2branchbc_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whilela2branchbcImpl
						.pattern_whilela2branchbc_24_6_createcorrespondence_blackBBBBBBBBB(a, z, i, x, b, w, c, y,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a] = " + a + ", "
							+ "[z] = " + z + ", " + "[i] = " + i + ", " + "[x] = " + x + ", " + "[b] = " + b + ", "
							+ "[w] = " + w + ", " + "[c] = " + c + ", " + "[y] = " + y + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				whilela2branchbcImpl.pattern_whilela2branchbc_24_6_createcorrespondence_greenBBFFBBFBBB(a, z, x, b, c,
						y, ccMatch);
				//nothing S2N c2z = (S2N) result6_green[2];
				//nothing S2B a2x = (S2B) result6_green[3];
				//nothing S2N b2y = (S2N) result6_green[6];

				Object[] result7_black = whilela2branchbcImpl
						.pattern_whilela2branchbc_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whilela2branchbcImpl.pattern_whilela2branchbc_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return whilela2branchbcImpl.pattern_whilela2branchbc_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(While a, Command z, Branch i, Branch x, Assignment b, While w, Assignment c,
			Command y, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(While a, Assignment b, While w, Assignment c) {// 
		Object[] result1_black = whilela2branchbcImpl.pattern_whilela2branchbc_27_1_matchtggpattern_blackBBBB(a, b, w,
				c);
		if (result1_black != null) {
			return whilela2branchbcImpl.pattern_whilela2branchbc_27_2_expressionF();
		} else {
			return whilela2branchbcImpl.pattern_whilela2branchbc_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Command z, Branch i, Branch x, Command y) {// 
		Object[] result1_black = whilela2branchbcImpl.pattern_whilela2branchbc_28_1_matchtggpattern_blackBBBB(z, i, x,
				y);
		if (result1_black != null) {
			return whilela2branchbcImpl.pattern_whilela2branchbc_28_2_expressionF();
		} else {
			return whilela2branchbcImpl.pattern_whilela2branchbc_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B w2iParameter) {

		Object[] result1_black = whilela2branchbcImpl.pattern_whilela2branchbc_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whilela2branchbcImpl.pattern_whilela2branchbc_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : whilela2branchbcImpl
				.pattern_whilela2branchbc_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList w2iList = (RuleEntryList) result2_black[0];
			Branch i = (Branch) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			While w = (While) result2_black[3];

			Object[] result3_bindingAndBlack = whilela2branchbcImpl
					.pattern_whilela2branchbc_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, i, w2i, w,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[i] = " + i + ", " + "[w2i] = " + w2i
						+ ", " + "[w] = " + w + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whilela2branchbcImpl.pattern_whilela2branchbc_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whilela2branchbcImpl.pattern_whilela2branchbc_29_5_checknacs_blackBBB(i, w2i,
						w);
				if (result5_black != null) {

					Object[] result6_black = whilela2branchbcImpl.pattern_whilela2branchbc_29_6_perform_blackBBBB(i,
							w2i, w, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[i] = " + i + ", "
								+ "[w2i] = " + w2i + ", " + "[w] = " + w + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whilela2branchbcImpl.pattern_whilela2branchbc_29_6_perform_greenFFFBFFFBFFFB(i, w, ruleResult);
					//nothing While a = (While) result6_green[0];
					//nothing Command z = (Command) result6_green[1];
					//nothing S2N c2z = (S2N) result6_green[2];
					//nothing S2B a2x = (S2B) result6_green[4];
					//nothing Branch x = (Branch) result6_green[5];
					//nothing Assignment b = (Assignment) result6_green[6];
					//nothing S2N b2y = (S2N) result6_green[8];
					//nothing Assignment c = (Assignment) result6_green[9];
					//nothing Command y = (Command) result6_green[10];

				} else {
				}

			} else {
			}

		}
		return whilela2branchbcImpl.pattern_whilela2branchbc_29_7_expressionFB(ruleResult);
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
		case RulesPackage.WHILELA2BRANCHBC___IS_APPROPRIATE_FWD__MATCH_WHILE_ASSIGNMENT_WHILE_ASSIGNMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(While) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.WHILELA2BRANCHBC___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILELA2BRANCHBC___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILELA2BRANCHBC___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WHILE_ASSIGNMENT_WHILE_ASSIGNMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (Assignment) arguments.get(4));
			return null;
		case RulesPackage.WHILELA2BRANCHBC___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WHILE_ASSIGNMENT_WHILE_ASSIGNMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.WHILELA2BRANCHBC___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILELA2BRANCHBC___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_WHILE_BRANCH_S2B_ASSIGNMENT_WHILE_ASSIGNMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(Branch) arguments.get(2), (S2B) arguments.get(3), (Assignment) arguments.get(4),
					(While) arguments.get(5), (Assignment) arguments.get(6));
		case RulesPackage.WHILELA2BRANCHBC___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILELA2BRANCHBC___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.WHILELA2BRANCHBC___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.WHILELA2BRANCHBC___IS_APPROPRIATE_BWD__MATCH_COMMAND_BRANCH_BRANCH_COMMAND:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4));
		case RulesPackage.WHILELA2BRANCHBC___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILELA2BRANCHBC___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILELA2BRANCHBC___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_BRANCH_BRANCH_COMMAND:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4));
			return null;
		case RulesPackage.WHILELA2BRANCHBC___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_BRANCH_BRANCH_COMMAND:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3), (Command) arguments.get(4));
		case RulesPackage.WHILELA2BRANCHBC___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILELA2BRANCHBC___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMMAND_BRANCH_S2B_BRANCH_WHILE_COMMAND:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (S2B) arguments.get(3), (Branch) arguments.get(4),
					(While) arguments.get(5), (Command) arguments.get(6));
		case RulesPackage.WHILELA2BRANCHBC___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILELA2BRANCHBC___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.WHILELA2BRANCHBC___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.WHILELA2BRANCHBC___IS_APPROPRIATE_BWD_EMOFLON_EDGE_156__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_156((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILELA2BRANCHBC___IS_APPROPRIATE_FWD_EMOFLON_EDGE_156__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_156((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILELA2BRANCHBC___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILELA2BRANCHBC___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILELA2BRANCHBC___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILELA2BRANCHBC___IS_APPLICABLE_SOLVE_CSP_CC__WHILE_COMMAND_BRANCH_BRANCH_ASSIGNMENT_WHILE_ASSIGNMENT_COMMAND_MATCH_MATCH:
			return isApplicable_solveCsp_CC((While) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3), (Assignment) arguments.get(4),
					(While) arguments.get(5), (Assignment) arguments.get(6), (Command) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.WHILELA2BRANCHBC___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILELA2BRANCHBC___CHECK_DEC_FWD__WHILE_ASSIGNMENT_WHILE_ASSIGNMENT:
			return checkDEC_FWD((While) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3));
		case RulesPackage.WHILELA2BRANCHBC___CHECK_DEC_BWD__COMMAND_BRANCH_BRANCH_COMMAND:
			return checkDEC_BWD((Command) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3));
		case RulesPackage.WHILELA2BRANCHBC___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILELA2BRANCHBC___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_S2B_WHILE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (While) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILELA2BRANCHBC___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whilela2branchbc_0_1_initialbindings_blackBBBBBB(whilela2branchbc _this,
			Match match, While a, Assignment b, While w, Assignment c) {
		if (!a.equals(w)) {
			if (!b.equals(c)) {
				return new Object[] { _this, match, a, b, w, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_0_2_SolveCSP_bindingFBBBBBB(whilela2branchbc _this,
			Match match, While a, Assignment b, While w, Assignment c) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, a, b, w, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, a, b, w, c };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilela2branchbc_0_2_SolveCSP_bindingAndBlackFBBBBBB(whilela2branchbc _this,
			Match match, While a, Assignment b, While w, Assignment c) {
		Object[] result_pattern_whilela2branchbc_0_2_SolveCSP_binding = pattern_whilela2branchbc_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, a, b, w, c);
		if (result_pattern_whilela2branchbc_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilela2branchbc_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whilela2branchbc_0_2_SolveCSP_black = pattern_whilela2branchbc_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whilela2branchbc_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, a, b, w, c };
			}
		}
		return null;
	}

	public static final boolean pattern_whilela2branchbc_0_3_CheckCSP_expressionFBB(whilela2branchbc _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilela2branchbc_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			While a, Assignment b, While w, Assignment c) {
		if (!a.equals(w)) {
			if (!b.equals(c)) {
				return new Object[] { match, a, b, w, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_0_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			While a, Assignment b, While w, Assignment c) {
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(c);
		String a__b____last_name_prime = "last";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(a__b____last);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		a__b____last.setName(a__b____last_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		return new Object[] { match, a, b, w, c, a__b____last, w__a____first, w__c____next };
	}

	public static final Object[] pattern_whilela2branchbc_0_5_collectcontextelements_blackBBBBB(Match match, While a,
			Assignment b, While w, Assignment c) {
		if (!a.equals(w)) {
			if (!b.equals(c)) {
				return new Object[] { match, a, b, w, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whilela2branchbc_0_6_registerobjectstomatch_expressionBBBBBB(
			whilela2branchbc _this, Match match, While a, Assignment b, While w, Assignment c) {
		_this.registerObjectsToMatch_FWD(match, a, b, w, c);

	}

	public static final boolean pattern_whilela2branchbc_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whilela2branchbc_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whilela2branchbc_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("a");
		EObject _localVariable_1 = isApplicableMatch.getObject("i");
		EObject _localVariable_2 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_3 = isApplicableMatch.getObject("b");
		EObject _localVariable_4 = isApplicableMatch.getObject("w");
		EObject _localVariable_5 = isApplicableMatch.getObject("c");
		EObject tmpA = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpW2i = _localVariable_2;
		EObject tmpB = _localVariable_3;
		EObject tmpW = _localVariable_4;
		EObject tmpC = _localVariable_5;
		if (tmpA instanceof While) {
			While a = (While) tmpA;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpW2i instanceof S2B) {
					S2B w2i = (S2B) tmpW2i;
					if (tmpB instanceof Assignment) {
						Assignment b = (Assignment) tmpB;
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							if (tmpC instanceof Assignment) {
								Assignment c = (Assignment) tmpC;
								return new Object[] { a, i, w2i, b, w, c, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_1_1_performtransformation_blackBBBBBBFBB(While a, Branch i,
			S2B w2i, Assignment b, While w, Assignment c, whilela2branchbc _this, IsApplicableMatch isApplicableMatch) {
		if (!a.equals(w)) {
			if (!b.equals(c)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { a, i, w2i, b, w, c, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			whilela2branchbc _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whilela2branchbc_1_1_performtransformation_binding = pattern_whilela2branchbc_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_whilela2branchbc_1_1_performtransformation_binding != null) {
			While a = (While) result_pattern_whilela2branchbc_1_1_performtransformation_binding[0];
			Branch i = (Branch) result_pattern_whilela2branchbc_1_1_performtransformation_binding[1];
			S2B w2i = (S2B) result_pattern_whilela2branchbc_1_1_performtransformation_binding[2];
			Assignment b = (Assignment) result_pattern_whilela2branchbc_1_1_performtransformation_binding[3];
			While w = (While) result_pattern_whilela2branchbc_1_1_performtransformation_binding[4];
			Assignment c = (Assignment) result_pattern_whilela2branchbc_1_1_performtransformation_binding[5];

			Object[] result_pattern_whilela2branchbc_1_1_performtransformation_black = pattern_whilela2branchbc_1_1_performtransformation_blackBBBBBBFBB(
					a, i, w2i, b, w, c, _this, isApplicableMatch);
			if (result_pattern_whilela2branchbc_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whilela2branchbc_1_1_performtransformation_black[6];

				return new Object[] { a, i, w2i, b, w, c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_1_1_performtransformation_greenBFFBFFBFBF(While a, Branch i,
			Assignment b, Assignment c) {
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2N c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		i.setNegative(z);
		c2z.setTarget(z);
		c2z.setSource(c);
		a2x.setSource(a);
		a2x.setTarget(x);
		i.setPositive(x);
		b2y.setSource(b);
		b2y.setTarget(y);
		y.setNext(x);
		return new Object[] { a, z, c2z, i, a2x, x, b, b2y, c, y };
	}

	public static final Object[] pattern_whilela2branchbc_1_2_collecttranslatedelements_blackBBBBBBBBB(While a,
			Command z, S2N c2z, S2B a2x, Branch x, Assignment b, S2N b2y, Assignment c, Command y) {
		if (!b.equals(c)) {
			if (!b2y.equals(c2z)) {
				if (!y.equals(z)) {
					return new Object[] { a, z, c2z, a2x, x, b, b2y, c, y };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_1_2_collecttranslatedelements_greenFBBBBBBBBB(While a,
			Command z, S2N c2z, S2B a2x, Branch x, Assignment b, S2N b2y, Assignment c, Command y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedElements().add(y);
		return new Object[] { ruleresult, a, z, c2z, a2x, x, b, b2y, c, y };
	}

	public static final Object[] pattern_whilela2branchbc_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject a, EObject z, EObject c2z, EObject i, EObject w2i, EObject a2x,
			EObject x, EObject b, EObject w, EObject b2y, EObject c, EObject y) {
		if (!a.equals(z)) {
			if (!a.equals(c2z)) {
				if (!a.equals(i)) {
					if (!a.equals(w2i)) {
						if (!a.equals(a2x)) {
							if (!a.equals(x)) {
								if (!a.equals(b)) {
									if (!a.equals(w)) {
										if (!a.equals(b2y)) {
											if (!a.equals(c)) {
												if (!a.equals(y)) {
													if (!c2z.equals(z)) {
														if (!c2z.equals(i)) {
															if (!c2z.equals(w2i)) {
																if (!c2z.equals(x)) {
																	if (!c2z.equals(w)) {
																		if (!c2z.equals(y)) {
																			if (!i.equals(z)) {
																				if (!i.equals(w2i)) {
																					if (!i.equals(x)) {
																						if (!i.equals(w)) {
																							if (!i.equals(y)) {
																								if (!w2i.equals(z)) {
																									if (!w2i.equals(
																											x)) {
																										if (!w2i.equals(
																												y)) {
																											if (!a2x.equals(
																													z)) {
																												if (!a2x.equals(
																														c2z)) {
																													if (!a2x.equals(
																															i)) {
																														if (!a2x.equals(
																																w2i)) {
																															if (!a2x.equals(
																																	x)) {
																																if (!a2x.equals(
																																		b)) {
																																	if (!a2x.equals(
																																			w)) {
																																		if (!a2x.equals(
																																				b2y)) {
																																			if (!a2x.equals(
																																					c)) {
																																				if (!a2x.equals(
																																						y)) {
																																					if (!x.equals(
																																							z)) {
																																						if (!x.equals(
																																								y)) {
																																							if (!b.equals(
																																									z)) {
																																								if (!b.equals(
																																										c2z)) {
																																									if (!b.equals(
																																											i)) {
																																										if (!b.equals(
																																												w2i)) {
																																											if (!b.equals(
																																													x)) {
																																												if (!b.equals(
																																														w)) {
																																													if (!b.equals(
																																															b2y)) {
																																														if (!b.equals(
																																																c)) {
																																															if (!b.equals(
																																																	y)) {
																																																if (!w.equals(
																																																		z)) {
																																																	if (!w.equals(
																																																			w2i)) {
																																																		if (!w.equals(
																																																				x)) {
																																																			if (!w.equals(
																																																					y)) {
																																																				if (!b2y.equals(
																																																						z)) {
																																																					if (!b2y.equals(
																																																							c2z)) {
																																																						if (!b2y.equals(
																																																								i)) {
																																																							if (!b2y.equals(
																																																									w2i)) {
																																																								if (!b2y.equals(
																																																										x)) {
																																																									if (!b2y.equals(
																																																											w)) {
																																																										if (!b2y.equals(
																																																												c)) {
																																																											if (!b2y.equals(
																																																													y)) {
																																																												if (!c.equals(
																																																														z)) {
																																																													if (!c.equals(
																																																															c2z)) {
																																																														if (!c.equals(
																																																																i)) {
																																																															if (!c.equals(
																																																																	w2i)) {
																																																																if (!c.equals(
																																																																		x)) {
																																																																	if (!c.equals(
																																																																			w)) {
																																																																		if (!c.equals(
																																																																				y)) {
																																																																			if (!y.equals(
																																																																					z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						a,
																																																																						z,
																																																																						c2z,
																																																																						i,
																																																																						w2i,
																																																																						a2x,
																																																																						x,
																																																																						b,
																																																																						w,
																																																																						b2y,
																																																																						c,
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
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whilela2branchbc_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject a, EObject z, EObject c2z, EObject i, EObject a2x, EObject x,
			EObject b, EObject w, EObject b2y, EObject c, EObject y) {
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whilela2branchbc";
		String a__b____last_name_prime = "last";
		String i__z____negative_name_prime = "negative";
		String a2x__a____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String w__a____first_name_prime = "first";
		String c2z__z____target_name_prime = "target";
		String w__c____next_name_prime = "next";
		String b2y__b____source_name_prime = "source";
		String c2z__c____source_name_prime = "source";
		String i__x____positive_name_prime = "positive";
		String b2y__y____target_name_prime = "target";
		String y__x____next_name_prime = "next";
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(a__b____last);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getCreatedEdges().add(y__x____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a__b____last.setName(a__b____last_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		return new Object[] { ruleresult, a, z, c2z, i, a2x, x, b, w, b2y, c, y, a__b____last, i__z____negative,
				a2x__a____source, a2x__x____target, w__a____first, c2z__z____target, w__c____next, b2y__b____source,
				c2z__c____source, i__x____positive, b2y__y____target, y__x____next };
	}

	public static final void pattern_whilela2branchbc_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whilela2branchbc _this, PerformRuleResult ruleresult, EObject a, EObject z, EObject c2z, EObject i,
			EObject w2i, EObject a2x, EObject x, EObject b, EObject w, EObject b2y, EObject c, EObject y) {
		_this.registerObjects_FWD(ruleresult, a, z, c2z, i, w2i, a2x, x, b, w, b2y, c, y);

	}

	public static final PerformRuleResult pattern_whilela2branchbc_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whilela2branchbc_2_1_preparereturnvalue_bindingFB(whilela2branchbc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_2_1_preparereturnvalue_blackFBB(EClass eClass,
			whilela2branchbc _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_2_1_preparereturnvalue_bindingAndBlackFFB(
			whilela2branchbc _this) {
		Object[] result_pattern_whilela2branchbc_2_1_preparereturnvalue_binding = pattern_whilela2branchbc_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whilela2branchbc_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whilela2branchbc_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whilela2branchbc_2_1_preparereturnvalue_black = pattern_whilela2branchbc_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whilela2branchbc_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whilela2branchbc_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whilela2branchbc";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whilela2branchbc_2_2_corematch_bindingFFFFB(Match match) {
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
					if (tmpC instanceof Assignment) {
						Assignment c = (Assignment) tmpC;
						return new Object[] { a, b, w, c, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilela2branchbc_2_2_corematch_blackBFFBBBB(While a, Assignment b,
			While w, Assignment c, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			if (!b.equals(c)) {
				for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class,
						"source")) {
					Branch i = w2i.getTarget();
					if (i != null) {
						_result.add(new Object[] { a, i, w2i, b, w, c, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilela2branchbc_2_3_findcontext_blackBBBBBB(While a, Branch i,
			S2B w2i, Assignment b, While w, Assignment c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(w)) {
			if (!b.equals(c)) {
				if (b.equals(a.getLast())) {
					if (i.equals(w2i.getTarget())) {
						if (a.equals(w.getFirst())) {
							if (c.equals(w.getNext())) {
								if (w.equals(w2i.getSource())) {
									_result.add(new Object[] { a, i, w2i, b, w, c });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whilela2branchbc_2_3_findcontext_greenBBBBBBFFFFFF(While a, Branch i, S2B w2i,
			Assignment b, While w, Assignment c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String a__b____last_name_prime = "last";
		String w2i__i____target_name_prime = "target";
		String w__a____first_name_prime = "first";
		String w__c____next_name_prime = "next";
		String w2i__w____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(c);
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(a__b____last);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		a__b____last.setName(a__b____last_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		return new Object[] { a, i, w2i, b, w, c, isApplicableMatch, a__b____last, w2i__i____target, w__a____first,
				w__c____next, w2i__w____source };
	}

	public static final Object[] pattern_whilela2branchbc_2_4_solveCSP_bindingFBBBBBBBB(whilela2branchbc _this,
			IsApplicableMatch isApplicableMatch, While a, Branch i, S2B w2i, Assignment b, While w, Assignment c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, a, i, w2i, b, w, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, a, i, w2i, b, w, c };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilela2branchbc_2_4_solveCSP_bindingAndBlackFBBBBBBBB(whilela2branchbc _this,
			IsApplicableMatch isApplicableMatch, While a, Branch i, S2B w2i, Assignment b, While w, Assignment c) {
		Object[] result_pattern_whilela2branchbc_2_4_solveCSP_binding = pattern_whilela2branchbc_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, a, i, w2i, b, w, c);
		if (result_pattern_whilela2branchbc_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilela2branchbc_2_4_solveCSP_binding[0];

			Object[] result_pattern_whilela2branchbc_2_4_solveCSP_black = pattern_whilela2branchbc_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whilela2branchbc_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, a, i, w2i, b, w, c };
			}
		}
		return null;
	}

	public static final boolean pattern_whilela2branchbc_2_5_checkCSP_expressionFBB(whilela2branchbc _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilela2branchbc_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whilela2branchbc_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whilela2branchbc";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whilela2branchbc_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whilela2branchbc_10_1_initialbindings_blackBBBBBB(whilela2branchbc _this,
			Match match, Command z, Branch i, Branch x, Command y) {
		if (!i.equals(x)) {
			if (!y.equals(z)) {
				return new Object[] { _this, match, z, i, x, y };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_10_2_SolveCSP_bindingFBBBBBB(whilela2branchbc _this,
			Match match, Command z, Branch i, Branch x, Command y) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, z, i, x, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, z, i, x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilela2branchbc_10_2_SolveCSP_bindingAndBlackFBBBBBB(whilela2branchbc _this,
			Match match, Command z, Branch i, Branch x, Command y) {
		Object[] result_pattern_whilela2branchbc_10_2_SolveCSP_binding = pattern_whilela2branchbc_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, z, i, x, y);
		if (result_pattern_whilela2branchbc_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilela2branchbc_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whilela2branchbc_10_2_SolveCSP_black = pattern_whilela2branchbc_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whilela2branchbc_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, z, i, x, y };
			}
		}
		return null;
	}

	public static final boolean pattern_whilela2branchbc_10_3_CheckCSP_expressionFBB(whilela2branchbc _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilela2branchbc_10_4_collectelementstobetranslated_blackBBBBB(Match match,
			Command z, Branch i, Branch x, Command y) {
		if (!i.equals(x)) {
			if (!y.equals(z)) {
				return new Object[] { match, z, i, x, y };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_10_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			Command z, Branch i, Branch x, Command y) {
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(x);
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
		return new Object[] { match, z, i, x, y, i__z____negative, i__x____positive, y__x____next };
	}

	public static final Object[] pattern_whilela2branchbc_10_5_collectcontextelements_blackBBBBB(Match match, Command z,
			Branch i, Branch x, Command y) {
		if (!i.equals(x)) {
			if (!y.equals(z)) {
				return new Object[] { match, z, i, x, y };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_10_5_collectcontextelements_greenBB(Match match, Branch i) {
		match.getContextNodes().add(i);
		return new Object[] { match, i };
	}

	public static final void pattern_whilela2branchbc_10_6_registerobjectstomatch_expressionBBBBBB(
			whilela2branchbc _this, Match match, Command z, Branch i, Branch x, Command y) {
		_this.registerObjectsToMatch_BWD(match, z, i, x, y);

	}

	public static final boolean pattern_whilela2branchbc_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whilela2branchbc_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whilela2branchbc_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("z");
		EObject _localVariable_1 = isApplicableMatch.getObject("i");
		EObject _localVariable_2 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_3 = isApplicableMatch.getObject("x");
		EObject _localVariable_4 = isApplicableMatch.getObject("w");
		EObject _localVariable_5 = isApplicableMatch.getObject("y");
		EObject tmpZ = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpW2i = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpW = _localVariable_4;
		EObject tmpY = _localVariable_5;
		if (tmpZ instanceof Command) {
			Command z = (Command) tmpZ;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpW2i instanceof S2B) {
					S2B w2i = (S2B) tmpW2i;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							if (tmpY instanceof Command) {
								Command y = (Command) tmpY;
								return new Object[] { z, i, w2i, x, w, y, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_11_1_performtransformation_blackBBBBBBFBB(Command z, Branch i,
			S2B w2i, Branch x, While w, Command y, whilela2branchbc _this, IsApplicableMatch isApplicableMatch) {
		if (!i.equals(x)) {
			if (!y.equals(z)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { z, i, w2i, x, w, y, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			whilela2branchbc _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whilela2branchbc_11_1_performtransformation_binding = pattern_whilela2branchbc_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_whilela2branchbc_11_1_performtransformation_binding != null) {
			Command z = (Command) result_pattern_whilela2branchbc_11_1_performtransformation_binding[0];
			Branch i = (Branch) result_pattern_whilela2branchbc_11_1_performtransformation_binding[1];
			S2B w2i = (S2B) result_pattern_whilela2branchbc_11_1_performtransformation_binding[2];
			Branch x = (Branch) result_pattern_whilela2branchbc_11_1_performtransformation_binding[3];
			While w = (While) result_pattern_whilela2branchbc_11_1_performtransformation_binding[4];
			Command y = (Command) result_pattern_whilela2branchbc_11_1_performtransformation_binding[5];

			Object[] result_pattern_whilela2branchbc_11_1_performtransformation_black = pattern_whilela2branchbc_11_1_performtransformation_blackBBBBBBFBB(
					z, i, w2i, x, w, y, _this, isApplicableMatch);
			if (result_pattern_whilela2branchbc_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whilela2branchbc_11_1_performtransformation_black[6];

				return new Object[] { z, i, w2i, x, w, y, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_11_1_performtransformation_greenFBFFBFBFFB(Command z,
			Branch x, While w, Command y) {
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		S2N c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment c = SourcecodeFactory.eINSTANCE.createAssignment();
		w.setFirst(a);
		c2z.setTarget(z);
		a2x.setSource(a);
		a2x.setTarget(x);
		a.setLast(b);
		b2y.setSource(b);
		b2y.setTarget(y);
		w.setNext(c);
		c2z.setSource(c);
		return new Object[] { a, z, c2z, a2x, x, b, w, b2y, c, y };
	}

	public static final Object[] pattern_whilela2branchbc_11_2_collecttranslatedelements_blackBBBBBBBBB(While a,
			Command z, S2N c2z, S2B a2x, Branch x, Assignment b, S2N b2y, Assignment c, Command y) {
		if (!b.equals(c)) {
			if (!b2y.equals(c2z)) {
				if (!y.equals(z)) {
					return new Object[] { a, z, c2z, a2x, x, b, b2y, c, y };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_11_2_collecttranslatedelements_greenFBBBBBBBBB(While a,
			Command z, S2N c2z, S2B a2x, Branch x, Assignment b, S2N b2y, Assignment c, Command y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(a);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getTranslatedElements().add(y);
		return new Object[] { ruleresult, a, z, c2z, a2x, x, b, b2y, c, y };
	}

	public static final Object[] pattern_whilela2branchbc_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject a, EObject z, EObject c2z, EObject i, EObject w2i, EObject a2x,
			EObject x, EObject b, EObject w, EObject b2y, EObject c, EObject y) {
		if (!a.equals(z)) {
			if (!a.equals(c2z)) {
				if (!a.equals(i)) {
					if (!a.equals(w2i)) {
						if (!a.equals(a2x)) {
							if (!a.equals(x)) {
								if (!a.equals(b)) {
									if (!a.equals(w)) {
										if (!a.equals(b2y)) {
											if (!a.equals(c)) {
												if (!a.equals(y)) {
													if (!c2z.equals(z)) {
														if (!c2z.equals(i)) {
															if (!c2z.equals(w2i)) {
																if (!c2z.equals(x)) {
																	if (!c2z.equals(w)) {
																		if (!c2z.equals(y)) {
																			if (!i.equals(z)) {
																				if (!i.equals(w2i)) {
																					if (!i.equals(x)) {
																						if (!i.equals(w)) {
																							if (!i.equals(y)) {
																								if (!w2i.equals(z)) {
																									if (!w2i.equals(
																											x)) {
																										if (!w2i.equals(
																												y)) {
																											if (!a2x.equals(
																													z)) {
																												if (!a2x.equals(
																														c2z)) {
																													if (!a2x.equals(
																															i)) {
																														if (!a2x.equals(
																																w2i)) {
																															if (!a2x.equals(
																																	x)) {
																																if (!a2x.equals(
																																		b)) {
																																	if (!a2x.equals(
																																			w)) {
																																		if (!a2x.equals(
																																				b2y)) {
																																			if (!a2x.equals(
																																					c)) {
																																				if (!a2x.equals(
																																						y)) {
																																					if (!x.equals(
																																							z)) {
																																						if (!x.equals(
																																								y)) {
																																							if (!b.equals(
																																									z)) {
																																								if (!b.equals(
																																										c2z)) {
																																									if (!b.equals(
																																											i)) {
																																										if (!b.equals(
																																												w2i)) {
																																											if (!b.equals(
																																													x)) {
																																												if (!b.equals(
																																														w)) {
																																													if (!b.equals(
																																															b2y)) {
																																														if (!b.equals(
																																																c)) {
																																															if (!b.equals(
																																																	y)) {
																																																if (!w.equals(
																																																		z)) {
																																																	if (!w.equals(
																																																			w2i)) {
																																																		if (!w.equals(
																																																				x)) {
																																																			if (!w.equals(
																																																					y)) {
																																																				if (!b2y.equals(
																																																						z)) {
																																																					if (!b2y.equals(
																																																							c2z)) {
																																																						if (!b2y.equals(
																																																								i)) {
																																																							if (!b2y.equals(
																																																									w2i)) {
																																																								if (!b2y.equals(
																																																										x)) {
																																																									if (!b2y.equals(
																																																											w)) {
																																																										if (!b2y.equals(
																																																												c)) {
																																																											if (!b2y.equals(
																																																													y)) {
																																																												if (!c.equals(
																																																														z)) {
																																																													if (!c.equals(
																																																															c2z)) {
																																																														if (!c.equals(
																																																																i)) {
																																																															if (!c.equals(
																																																																	w2i)) {
																																																																if (!c.equals(
																																																																		x)) {
																																																																	if (!c.equals(
																																																																			w)) {
																																																																		if (!c.equals(
																																																																				y)) {
																																																																			if (!y.equals(
																																																																					z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						a,
																																																																						z,
																																																																						c2z,
																																																																						i,
																																																																						w2i,
																																																																						a2x,
																																																																						x,
																																																																						b,
																																																																						w,
																																																																						b2y,
																																																																						c,
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
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whilela2branchbc_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject a, EObject z, EObject c2z, EObject i, EObject a2x, EObject x,
			EObject b, EObject w, EObject b2y, EObject c, EObject y) {
		EMoflonEdge a__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whilela2branchbc";
		String a__b____last_name_prime = "last";
		String i__z____negative_name_prime = "negative";
		String a2x__a____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String w__a____first_name_prime = "first";
		String c2z__z____target_name_prime = "target";
		String w__c____next_name_prime = "next";
		String b2y__b____source_name_prime = "source";
		String c2z__c____source_name_prime = "source";
		String i__x____positive_name_prime = "positive";
		String b2y__y____target_name_prime = "target";
		String y__x____next_name_prime = "next";
		a__b____last.setSrc(a);
		a__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(a__b____last);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		ruleresult.getTranslatedEdges().add(y__x____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a__b____last.setName(a__b____last_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		return new Object[] { ruleresult, a, z, c2z, i, a2x, x, b, w, b2y, c, y, a__b____last, i__z____negative,
				a2x__a____source, a2x__x____target, w__a____first, c2z__z____target, w__c____next, b2y__b____source,
				c2z__c____source, i__x____positive, b2y__y____target, y__x____next };
	}

	public static final void pattern_whilela2branchbc_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whilela2branchbc _this, PerformRuleResult ruleresult, EObject a, EObject z, EObject c2z, EObject i,
			EObject w2i, EObject a2x, EObject x, EObject b, EObject w, EObject b2y, EObject c, EObject y) {
		_this.registerObjects_BWD(ruleresult, a, z, c2z, i, w2i, a2x, x, b, w, b2y, c, y);

	}

	public static final PerformRuleResult pattern_whilela2branchbc_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whilela2branchbc_12_1_preparereturnvalue_bindingFB(whilela2branchbc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_12_1_preparereturnvalue_blackFBB(EClass eClass,
			whilela2branchbc _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_12_1_preparereturnvalue_bindingAndBlackFFB(
			whilela2branchbc _this) {
		Object[] result_pattern_whilela2branchbc_12_1_preparereturnvalue_binding = pattern_whilela2branchbc_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whilela2branchbc_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whilela2branchbc_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whilela2branchbc_12_1_preparereturnvalue_black = pattern_whilela2branchbc_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whilela2branchbc_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whilela2branchbc_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whilela2branchbc";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whilela2branchbc_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("z");
		EObject _localVariable_1 = match.getObject("i");
		EObject _localVariable_2 = match.getObject("x");
		EObject _localVariable_3 = match.getObject("y");
		EObject tmpZ = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpX = _localVariable_2;
		EObject tmpY = _localVariable_3;
		if (tmpZ instanceof Command) {
			Command z = (Command) tmpZ;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpX instanceof Branch) {
					Branch x = (Branch) tmpX;
					if (tmpY instanceof Command) {
						Command y = (Command) tmpY;
						return new Object[] { z, i, x, y, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilela2branchbc_12_2_corematch_blackBBFBFBB(Command z, Branch i,
			Branch x, Command y, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(x)) {
			if (!y.equals(z)) {
				for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class,
						"target")) {
					Statement tmpW = w2i.getSource();
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						_result.add(new Object[] { z, i, w2i, x, w, y, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilela2branchbc_12_3_findcontext_blackBBBBBB(Command z, Branch i,
			S2B w2i, Branch x, While w, Command y) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(x)) {
			if (!y.equals(z)) {
				if (z.equals(i.getNegative())) {
					if (i.equals(w2i.getTarget())) {
						if (w.equals(w2i.getSource())) {
							if (x.equals(i.getPositive())) {
								if (x.equals(y.getNext())) {
									_result.add(new Object[] { z, i, w2i, x, w, y });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whilela2branchbc_12_3_findcontext_greenBBBBBBFFFFFF(Command z, Branch i,
			S2B w2i, Branch x, While w, Command y) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__x____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String i__z____negative_name_prime = "negative";
		String w2i__i____target_name_prime = "target";
		String w2i__w____source_name_prime = "source";
		String i__x____positive_name_prime = "positive";
		String y__x____next_name_prime = "next";
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(y);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		y__x____next.setSrc(y);
		y__x____next.setTrg(x);
		isApplicableMatch.getAllContextElements().add(y__x____next);
		i__z____negative.setName(i__z____negative_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		y__x____next.setName(y__x____next_name_prime);
		return new Object[] { z, i, w2i, x, w, y, isApplicableMatch, i__z____negative, w2i__i____target,
				w2i__w____source, i__x____positive, y__x____next };
	}

	public static final Object[] pattern_whilela2branchbc_12_4_solveCSP_bindingFBBBBBBBB(whilela2branchbc _this,
			IsApplicableMatch isApplicableMatch, Command z, Branch i, S2B w2i, Branch x, While w, Command y) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, z, i, w2i, x, w, y);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, z, i, w2i, x, w, y };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilela2branchbc_12_4_solveCSP_bindingAndBlackFBBBBBBBB(whilela2branchbc _this,
			IsApplicableMatch isApplicableMatch, Command z, Branch i, S2B w2i, Branch x, While w, Command y) {
		Object[] result_pattern_whilela2branchbc_12_4_solveCSP_binding = pattern_whilela2branchbc_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, z, i, w2i, x, w, y);
		if (result_pattern_whilela2branchbc_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilela2branchbc_12_4_solveCSP_binding[0];

			Object[] result_pattern_whilela2branchbc_12_4_solveCSP_black = pattern_whilela2branchbc_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whilela2branchbc_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, z, i, w2i, x, w, y };
			}
		}
		return null;
	}

	public static final boolean pattern_whilela2branchbc_12_5_checkCSP_expressionFBB(whilela2branchbc _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilela2branchbc_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whilela2branchbc_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whilela2branchbc";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whilela2branchbc_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whilela2branchbc_20_1_preparereturnvalue_bindingFB(whilela2branchbc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whilela2branchbc _this) {
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

	public static final Object[] pattern_whilela2branchbc_20_1_preparereturnvalue_bindingAndBlackFFBF(
			whilela2branchbc _this) {
		Object[] result_pattern_whilela2branchbc_20_1_preparereturnvalue_binding = pattern_whilela2branchbc_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whilela2branchbc_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whilela2branchbc_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whilela2branchbc_20_1_preparereturnvalue_black = pattern_whilela2branchbc_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whilela2branchbc_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whilela2branchbc_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whilela2branchbc_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_0B(Command z) {
		for (Graph __DEC_z_root_353385 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_1BBB(Command z, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_z_positive_784769 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!i.equals(__DEC_z_positive_784769)) {
					if (!x.equals(__DEC_z_positive_784769)) {
						return new Object[] { z, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_2BBB(Command z, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_z_negative_186065 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!i.equals(__DEC_z_negative_186065)) {
					if (!x.equals(__DEC_z_negative_186065)) {
						return new Object[] { z, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_390322 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_4BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_positive_173733 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_173733)) {
					if (!i.equals(__DEC_x_positive_173733)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_5BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_negative_534036 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_534036)) {
					if (!i.equals(__DEC_x_negative_534036)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_6B(Command y) {
		for (Graph __DEC_y_root_155008 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_7BBB(Command y, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_positive_895471 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!i.equals(__DEC_y_positive_895471)) {
					if (!x.equals(__DEC_y_positive_895471)) {
						return new Object[] { y, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_8BBB(Command y, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_negative_7733 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!i.equals(__DEC_y_negative_7733)) {
					if (!x.equals(__DEC_y_negative_7733)) {
						return new Object[] { y, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_9BB(Branch i, Command z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_10BB(Branch x,
			Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_11BB(Branch x,
			Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_12BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_13BB(Branch i,
			Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_14BB(Branch x,
			Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_15BB(Branch i,
			Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_16BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilela2branchbc_20_2_testcorematchandDECs_blackFFFFB(
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
							if (pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_0B(z) == null) {
								if (pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_9BB(i, z) == null) {
									if (pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_1BBB(z, i,
											x) == null) {
										if (pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_2BBB(z, i,
												x) == null) {
											if (pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_3B(
													x) == null) {
												if (pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_4BB(x,
														i) == null) {
													if (pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_5BB(
															x, i) == null) {
														if (pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_10BB(
																x, z) == null) {
															if (pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_11BB(
																	x, z) == null) {
																if (pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_12BB(
																		i, x) == null) {
																	for (Node tmpY : org.moflon.core.utilities.eMoflonEMFUtil
																			.getOppositeReferenceTyped(x, Node.class,
																					"next")) {
																		if (tmpY instanceof Command) {
																			Command y = (Command) tmpY;
																			if (!y.equals(z)) {
																				if (pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_6B(
																						y) == null) {
																					if (pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_7BBB(
																							y, i, x) == null) {
																						if (pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_8BBB(
																								y, i, x) == null) {
																							if (pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_13BB(
																									i, y) == null) {
																								if (pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_14BB(
																										x, y) == null) {
																									if (pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_15BB(
																											i,
																											y) == null) {
																										if (pattern_whilela2branchbc_20_2_testcorematchandDECs_black_nac_16BB(
																												x,
																												y) == null) {
																											_result.add(
																													new Object[] {
																															z,
																															i,
																															x,
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

		return _result;
	}

	public static final Object[] pattern_whilela2branchbc_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whilela2branchbc_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			whilela2branchbc _this, Match match, Command z, Branch i, Branch x, Command y) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, z, i, x, y);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whilela2branchbc_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whilela2branchbc _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilela2branchbc_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whilela2branchbc_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whilela2branchbc_21_1_preparereturnvalue_bindingFB(whilela2branchbc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whilela2branchbc _this) {
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

	public static final Object[] pattern_whilela2branchbc_21_1_preparereturnvalue_bindingAndBlackFFBF(
			whilela2branchbc _this) {
		Object[] result_pattern_whilela2branchbc_21_1_preparereturnvalue_binding = pattern_whilela2branchbc_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whilela2branchbc_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whilela2branchbc_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whilela2branchbc_21_1_preparereturnvalue_black = pattern_whilela2branchbc_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whilela2branchbc_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whilela2branchbc_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whilela2branchbc_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_0B(While a) {
		for (Decision __DEC_a_positive_907488 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_1B(While a) {
		for (Decision __DEC_a_negative_990181 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_2BB(While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_a_last_848291 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_848291)) {
					if (!w.equals(__DEC_a_last_848291)) {
						return new Object[] { a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_3B(While a) {
		for (Program __DEC_a_first_521789 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_4B(Assignment b) {
		for (Decision __DEC_b_positive_296397 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_5B(Assignment b) {
		for (Decision __DEC_b_negative_741157 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_6BBB(Assignment b,
			While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_b_first_309248 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!a.equals(__DEC_b_first_309248)) {
					if (!w.equals(__DEC_b_first_309248)) {
						return new Object[] { b, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_7BBB(Assignment b,
			While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_b_last_301610 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!a.equals(__DEC_b_last_301610)) {
					if (!w.equals(__DEC_b_last_301610)) {
						return new Object[] { b, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_8B(Assignment b) {
		for (Program __DEC_b_first_507972 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_9B(Assignment c) {
		for (Decision __DEC_c_positive_963930 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_10B(Assignment c) {
		for (Decision __DEC_c_negative_54018 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_11BBB(Assignment c,
			While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_c_first_940000 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!a.equals(__DEC_c_first_940000)) {
					if (!w.equals(__DEC_c_first_940000)) {
						return new Object[] { c, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_12BBB(Assignment c,
			While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_c_last_878956 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!a.equals(__DEC_c_last_878956)) {
					if (!w.equals(__DEC_c_last_878956)) {
						return new Object[] { c, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_13B(Assignment c) {
		for (Program __DEC_c_first_417460 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_14BB(While a,
			Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_15BB(While w,
			Assignment b) {
		if (b.equals(w.getFirst())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_16BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_17BB(While a,
			Assignment c) {
		if (c.equals(a.getFirst())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_18BB(While w,
			Assignment c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_19BB(While a,
			Assignment c) {
		if (c.equals(a.getLast())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_20BB(While w,
			Assignment c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilela2branchbc_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_last) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpA = _edge_last.getSrc();
		if (tmpA instanceof While) {
			While a = (While) tmpA;
			EObject tmpB = _edge_last.getTrg();
			if (tmpB instanceof Assignment) {
				Assignment b = (Assignment) tmpB;
				if (b.equals(a.getLast())) {
					if (pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_0B(a) == null) {
						if (pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_1B(a) == null) {
							if (pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_3B(a) == null) {
								if (pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_4B(b) == null) {
									if (pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_5B(b) == null) {
										if (pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_8B(
												b) == null) {
											if (pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_14BB(a,
													b) == null) {
												for (While w : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(a, While.class, "first")) {
													if (!a.equals(w)) {
														Statement tmpC = w.getNext();
														if (tmpC instanceof Assignment) {
															Assignment c = (Assignment) tmpC;
															if (!b.equals(c)) {
																if (pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_2BB(
																		a, w) == null) {
																	if (pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_6BBB(
																			b, a, w) == null) {
																		if (pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_7BBB(
																				b, a, w) == null) {
																			if (pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_15BB(
																					w, b) == null) {
																				if (pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_16BB(
																						w, b) == null) {
																					if (pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_9B(
																							c) == null) {
																						if (pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_10B(
																								c) == null) {
																							if (pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_11BBB(
																									c, a, w) == null) {
																								if (pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_12BBB(
																										c, a,
																										w) == null) {
																									if (pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_13B(
																											c) == null) {
																										if (pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_17BB(
																												a,
																												c) == null) {
																											if (pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_18BB(
																													w,
																													c) == null) {
																												if (pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_19BB(
																														a,
																														c) == null) {
																													if (pattern_whilela2branchbc_21_2_testcorematchandDECs_black_nac_20BB(
																															w,
																															c) == null) {
																														_result.add(
																																new Object[] {
																																		a,
																																		b,
																																		w,
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

		return _result;
	}

	public static final Object[] pattern_whilela2branchbc_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whilela2branchbc_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			whilela2branchbc _this, Match match, While a, Assignment b, While w, Assignment c) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, a, b, w, c);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whilela2branchbc_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whilela2branchbc _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilela2branchbc_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whilela2branchbc_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whilela2branchbc_24_1_prepare_blackB(whilela2branchbc _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whilela2branchbc_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_whilela2branchbc_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("a");
		EObject _localVariable_1 = targetMatch.getObject("z");
		EObject _localVariable_2 = targetMatch.getObject("i");
		EObject _localVariable_3 = targetMatch.getObject("x");
		EObject _localVariable_4 = sourceMatch.getObject("b");
		EObject _localVariable_5 = sourceMatch.getObject("w");
		EObject _localVariable_6 = sourceMatch.getObject("c");
		EObject _localVariable_7 = targetMatch.getObject("y");
		EObject tmpA = _localVariable_0;
		EObject tmpZ = _localVariable_1;
		EObject tmpI = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpB = _localVariable_4;
		EObject tmpW = _localVariable_5;
		EObject tmpC = _localVariable_6;
		EObject tmpY = _localVariable_7;
		if (tmpA instanceof While) {
			While a = (While) tmpA;
			if (tmpZ instanceof Command) {
				Command z = (Command) tmpZ;
				if (tmpI instanceof Branch) {
					Branch i = (Branch) tmpI;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						if (tmpB instanceof Assignment) {
							Assignment b = (Assignment) tmpB;
							if (tmpW instanceof While) {
								While w = (While) tmpW;
								if (tmpC instanceof Assignment) {
									Assignment c = (Assignment) tmpC;
									if (tmpY instanceof Command) {
										Command y = (Command) tmpY;
										return new Object[] { a, z, i, x, b, w, c, y, sourceMatch, targetMatch };
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

	public static final Object[] pattern_whilela2branchbc_24_2_matchsrctrgcontext_blackBBBBBBBBBB(While a, Command z,
			Branch i, Branch x, Assignment b, While w, Assignment c, Command y, Match sourceMatch, Match targetMatch) {
		if (!a.equals(w)) {
			if (!i.equals(x)) {
				if (!b.equals(c)) {
					if (!y.equals(z)) {
						if (!sourceMatch.equals(targetMatch)) {
							return new Object[] { a, z, i, x, b, w, c, y, sourceMatch, targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whilela2branchbc_24_2_matchsrctrgcontext_binding = pattern_whilela2branchbc_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_whilela2branchbc_24_2_matchsrctrgcontext_binding != null) {
			While a = (While) result_pattern_whilela2branchbc_24_2_matchsrctrgcontext_binding[0];
			Command z = (Command) result_pattern_whilela2branchbc_24_2_matchsrctrgcontext_binding[1];
			Branch i = (Branch) result_pattern_whilela2branchbc_24_2_matchsrctrgcontext_binding[2];
			Branch x = (Branch) result_pattern_whilela2branchbc_24_2_matchsrctrgcontext_binding[3];
			Assignment b = (Assignment) result_pattern_whilela2branchbc_24_2_matchsrctrgcontext_binding[4];
			While w = (While) result_pattern_whilela2branchbc_24_2_matchsrctrgcontext_binding[5];
			Assignment c = (Assignment) result_pattern_whilela2branchbc_24_2_matchsrctrgcontext_binding[6];
			Command y = (Command) result_pattern_whilela2branchbc_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_whilela2branchbc_24_2_matchsrctrgcontext_black = pattern_whilela2branchbc_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					a, z, i, x, b, w, c, y, sourceMatch, targetMatch);
			if (result_pattern_whilela2branchbc_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { a, z, i, x, b, w, c, y, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_24_3_solvecsp_bindingFBBBBBBBBBBB(whilela2branchbc _this,
			While a, Command z, Branch i, Branch x, Assignment b, While w, Assignment c, Command y, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(a, z, i, x, b, w, c, y, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, a, z, i, x, b, w, c, y, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilela2branchbc_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			whilela2branchbc _this, While a, Command z, Branch i, Branch x, Assignment b, While w, Assignment c,
			Command y, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whilela2branchbc_24_3_solvecsp_binding = pattern_whilela2branchbc_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, a, z, i, x, b, w, c, y, sourceMatch, targetMatch);
		if (result_pattern_whilela2branchbc_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whilela2branchbc_24_3_solvecsp_binding[0];

			Object[] result_pattern_whilela2branchbc_24_3_solvecsp_black = pattern_whilela2branchbc_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whilela2branchbc_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, a, z, i, x, b, w, c, y, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whilela2branchbc_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whilela2branchbc_24_5_matchcorrcontext_blackBFBBB(Branch i, While w,
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

	public static final Object[] pattern_whilela2branchbc_24_5_matchcorrcontext_greenBBBF(S2B w2i, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "whilela2branchbc";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(w2i);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { w2i, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_whilela2branchbc_24_6_createcorrespondence_blackBBBBBBBBB(While a, Command z,
			Branch i, Branch x, Assignment b, While w, Assignment c, Command y, CCMatch ccMatch) {
		if (!a.equals(w)) {
			if (!i.equals(x)) {
				if (!b.equals(c)) {
					if (!y.equals(z)) {
						return new Object[] { a, z, i, x, b, w, c, y, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_24_6_createcorrespondence_greenBBFFBBFBBB(While a, Command z,
			Branch x, Assignment b, Assignment c, Command y, CCMatch ccMatch) {
		S2N c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		c2z.setTarget(z);
		c2z.setSource(c);
		ccMatch.getCreateCorr().add(c2z);
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		b2y.setSource(b);
		b2y.setTarget(y);
		ccMatch.getCreateCorr().add(b2y);
		return new Object[] { a, z, c2z, a2x, x, b, b2y, c, y, ccMatch };
	}

	public static final Object[] pattern_whilela2branchbc_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_whilela2branchbc_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "whilela2branchbc";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_whilela2branchbc_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_0B(While a) {
		for (Decision __DEC_a_positive_241753 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_1B(While a) {
		for (Decision __DEC_a_negative_447751 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_2BB(While a, While w) {
		if (!a.equals(w)) {
			for (While __DEC_a_last_264075 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!a.equals(__DEC_a_last_264075)) {
					if (!w.equals(__DEC_a_last_264075)) {
						return new Object[] { a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_3B(While a) {
		for (Program __DEC_a_first_499506 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_4B(Assignment b) {
		for (Decision __DEC_b_positive_978223 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_5B(Assignment b) {
		for (Decision __DEC_b_negative_520233 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_6BBB(Assignment b, While a,
			While w) {
		if (!a.equals(w)) {
			for (While __DEC_b_first_774165 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "first")) {
				if (!a.equals(__DEC_b_first_774165)) {
					if (!w.equals(__DEC_b_first_774165)) {
						return new Object[] { b, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_7BBB(Assignment b, While a,
			While w) {
		if (!a.equals(w)) {
			for (While __DEC_b_last_84468 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!a.equals(__DEC_b_last_84468)) {
					if (!w.equals(__DEC_b_last_84468)) {
						return new Object[] { b, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_8B(Assignment b) {
		for (Program __DEC_b_first_355666 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_9B(Assignment c) {
		for (Decision __DEC_c_positive_235333 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_10B(Assignment c) {
		for (Decision __DEC_c_negative_385282 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_11BBB(Assignment c, While a,
			While w) {
		if (!a.equals(w)) {
			for (While __DEC_c_first_535437 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!a.equals(__DEC_c_first_535437)) {
					if (!w.equals(__DEC_c_first_535437)) {
						return new Object[] { c, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_12BBB(Assignment c, While a,
			While w) {
		if (!a.equals(w)) {
			for (While __DEC_c_last_345686 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!a.equals(__DEC_c_last_345686)) {
					if (!w.equals(__DEC_c_last_345686)) {
						return new Object[] { c, a, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_13B(Assignment c) {
		for (Program __DEC_c_first_641264 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_14BB(While a, Assignment b) {
		if (b.equals(a.getFirst())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_15BB(While w, Assignment b) {
		if (b.equals(w.getFirst())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_16BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_17BB(While a, Assignment c) {
		if (c.equals(a.getFirst())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_18BB(While w, Assignment c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_19BB(While a, Assignment c) {
		if (c.equals(a.getLast())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_20BB(While w, Assignment c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_27_1_matchtggpattern_blackBBBB(While a, Assignment b, While w,
			Assignment c) {
		if (!a.equals(w)) {
			if (!b.equals(c)) {
				if (b.equals(a.getLast())) {
					if (a.equals(w.getFirst())) {
						if (c.equals(w.getNext())) {
							if (pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_0B(a) == null) {
								if (pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_1B(a) == null) {
									if (pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_2BB(a, w) == null) {
										if (pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_3B(a) == null) {
											if (pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_4B(b) == null) {
												if (pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_5B(
														b) == null) {
													if (pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_6BBB(b,
															a, w) == null) {
														if (pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_7BBB(
																b, a, w) == null) {
															if (pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_8B(
																	b) == null) {
																if (pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_9B(
																		c) == null) {
																	if (pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_10B(
																			c) == null) {
																		if (pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_11BBB(
																				c, a, w) == null) {
																			if (pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_12BBB(
																					c, a, w) == null) {
																				if (pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_13B(
																						c) == null) {
																					if (pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_14BB(
																							a, b) == null) {
																						if (pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_15BB(
																								w, b) == null) {
																							if (pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_16BB(
																									w, b) == null) {
																								if (pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_17BB(
																										a, c) == null) {
																									if (pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_18BB(
																											w,
																											c) == null) {
																										if (pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_19BB(
																												a,
																												c) == null) {
																											if (pattern_whilela2branchbc_27_1_matchtggpattern_black_nac_20BB(
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
		return null;
	}

	public static final boolean pattern_whilela2branchbc_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whilela2branchbc_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_0B(Command z) {
		for (Graph __DEC_z_root_198757 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_1BBB(Command z, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_z_positive_350245 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!i.equals(__DEC_z_positive_350245)) {
					if (!x.equals(__DEC_z_positive_350245)) {
						return new Object[] { z, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_2BBB(Command z, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_z_negative_977973 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!i.equals(__DEC_z_negative_977973)) {
					if (!x.equals(__DEC_z_negative_977973)) {
						return new Object[] { z, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_3B(Branch x) {
		for (Graph __DEC_x_root_898824 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_4BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_positive_974853 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!x.equals(__DEC_x_positive_974853)) {
					if (!i.equals(__DEC_x_positive_974853)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_5BB(Branch x, Branch i) {
		if (!i.equals(x)) {
			for (Branch __DEC_x_negative_856003 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!x.equals(__DEC_x_negative_856003)) {
					if (!i.equals(__DEC_x_negative_856003)) {
						return new Object[] { x, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_6B(Command y) {
		for (Graph __DEC_y_root_134352 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_7BBB(Command y, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_positive_851056 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!i.equals(__DEC_y_positive_851056)) {
					if (!x.equals(__DEC_y_positive_851056)) {
						return new Object[] { y, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_8BBB(Command y, Branch i,
			Branch x) {
		if (!i.equals(x)) {
			for (Branch __DEC_y_negative_193454 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!i.equals(__DEC_y_negative_193454)) {
					if (!x.equals(__DEC_y_negative_193454)) {
						return new Object[] { y, i, x };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_9BB(Branch i, Command z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_10BB(Branch x, Command z) {
		if (z.equals(x.getPositive())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_11BB(Branch x, Command z) {
		if (z.equals(x.getNegative())) {
			return new Object[] { x, z };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_12BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_13BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_14BB(Branch x, Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_15BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_16BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_28_1_matchtggpattern_blackBBBB(Command z, Branch i, Branch x,
			Command y) {
		if (!i.equals(x)) {
			if (!y.equals(z)) {
				if (z.equals(i.getNegative())) {
					if (x.equals(i.getPositive())) {
						if (x.equals(y.getNext())) {
							if (pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_0B(z) == null) {
								if (pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_1BBB(z, i, x) == null) {
									if (pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_2BBB(z, i, x) == null) {
										if (pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_3B(x) == null) {
											if (pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_4BB(x,
													i) == null) {
												if (pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_5BB(x,
														i) == null) {
													if (pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_6B(
															y) == null) {
														if (pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_7BBB(
																y, i, x) == null) {
															if (pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_8BBB(
																	y, i, x) == null) {
																if (pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_9BB(
																		i, z) == null) {
																	if (pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_10BB(
																			x, z) == null) {
																		if (pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_11BB(
																				x, z) == null) {
																			if (pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_12BB(
																					i, x) == null) {
																				if (pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_13BB(
																						i, y) == null) {
																					if (pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_14BB(
																							x, y) == null) {
																						if (pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_15BB(
																								i, y) == null) {
																							if (pattern_whilela2branchbc_28_1_matchtggpattern_black_nac_16BB(
																									x, y) == null) {
																								return new Object[] { z,
																										i, x, y };
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_whilela2branchbc_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whilela2branchbc_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whilela2branchbc_29_1_createresult_blackB(whilela2branchbc _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whilela2branchbc_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_whilela2branchbc_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whilela2branchbc_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_whilela2branchbc_29_2_isapplicablecore_black_nac_1BB(ruleResult, w2i) == null) {
								if (pattern_whilela2branchbc_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										i) == null) {
									if (pattern_whilela2branchbc_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_whilela2branchbc_29_3_solveCSP_bindingFBBBBBB(whilela2branchbc _this,
			IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, While w, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, i, w2i, w, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, i, w2i, w, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whilela2branchbc_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whilela2branchbc_29_3_solveCSP_bindingAndBlackFBBBBBB(whilela2branchbc _this,
			IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, While w, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whilela2branchbc_29_3_solveCSP_binding = pattern_whilela2branchbc_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, i, w2i, w, ruleResult);
		if (result_pattern_whilela2branchbc_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whilela2branchbc_29_3_solveCSP_binding[0];

			Object[] result_pattern_whilela2branchbc_29_3_solveCSP_black = pattern_whilela2branchbc_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whilela2branchbc_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, i, w2i, w, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whilela2branchbc_29_4_checkCSP_expressionFBB(whilela2branchbc _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whilela2branchbc_29_5_checknacs_blackBBB(Branch i, S2B w2i, While w) {
		return new Object[] { i, w2i, w };
	}

	public static final Object[] pattern_whilela2branchbc_29_6_perform_blackBBBB(Branch i, S2B w2i, While w,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { i, w2i, w, ruleResult };
	}

	public static final Object[] pattern_whilela2branchbc_29_6_perform_greenFFFBFFFBFFFB(Branch i, While w,
			ModelgeneratorRuleResult ruleResult) {
		While a = SourcecodeFactory.eINSTANCE.createWhile();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2N c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment c = SourcecodeFactory.eINSTANCE.createAssignment();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		w.setFirst(a);
		ruleResult.getSourceObjects().add(a);
		i.setNegative(z);
		ruleResult.getTargetObjects().add(z);
		c2z.setTarget(z);
		ruleResult.getCorrObjects().add(c2z);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		a2x.setTarget(x);
		i.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		a.setLast(b);
		ruleResult.getSourceObjects().add(b);
		b2y.setSource(b);
		ruleResult.getCorrObjects().add(b2y);
		w.setNext(c);
		c2z.setSource(c);
		ruleResult.getSourceObjects().add(c);
		b2y.setTarget(y);
		y.setNext(x);
		ruleResult.getTargetObjects().add(y);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { a, z, c2z, i, a2x, x, b, w, b2y, c, y, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whilela2branchbc_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whilela2branchbcImpl
