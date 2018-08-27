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
import org.wbsilva.bx.sourcecode2controlflow.Rules.whiledul2branchbub;

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
 * An implementation of the model object '<em><b>whiledul2branchbub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class whiledul2branchbubImpl extends AbstractRuleImpl implements whiledul2branchbub {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected whiledul2branchbubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getwhiledul2branchbub();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, While w, Decision a, Assignment b, While c) {

		Object[] result1_black = whiledul2branchbubImpl.pattern_whiledul2branchbub_0_1_initialbindings_blackBBBBBB(this,
				match, w, a, b, c);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[a] = " + a + ", " + "[b] = " + b + ", "
					+ "[c] = " + c + ".");
		}

		Object[] result2_bindingAndBlack = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, w, a, b, c);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[a] = " + a + ", " + "[b] = " + b + ", "
					+ "[c] = " + c + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whiledul2branchbubImpl.pattern_whiledul2branchbub_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whiledul2branchbubImpl
					.pattern_whiledul2branchbub_0_4_collectelementstobetranslated_blackBBBBB(match, w, a, b, c);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[w] = " + w + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[c] = " + c + ".");
			}
			whiledul2branchbubImpl.pattern_whiledul2branchbub_0_4_collectelementstobetranslated_greenBBBBBFFFF(match, w,
					a, b, c);
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge c__b____last = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge c__b____first = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[8];

			Object[] result5_black = whiledul2branchbubImpl
					.pattern_whiledul2branchbub_0_5_collectcontextelements_blackBBBBB(match, w, a, b, c);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[w] = " + w + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[c] = " + c + ".");
			}
			whiledul2branchbubImpl.pattern_whiledul2branchbub_0_5_collectcontextelements_greenBB(match, w);

			// 
			whiledul2branchbubImpl.pattern_whiledul2branchbub_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					w, a, b, c);
			return whiledul2branchbubImpl.pattern_whiledul2branchbub_0_7_expressionF();
		} else {
			return whiledul2branchbubImpl.pattern_whiledul2branchbub_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		While w = (While) result1_bindingAndBlack[0];
		Decision a = (Decision) result1_bindingAndBlack[1];
		Assignment b = (Assignment) result1_bindingAndBlack[2];
		Branch i = (Branch) result1_bindingAndBlack[3];
		While c = (While) result1_bindingAndBlack[4];
		S2B w2i = (S2B) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_1_1_performtransformation_greenBBFBFFBFFF(a, b, i, c);
		Command y = (Command) result1_green[2];
		S2N b2y = (S2N) result1_green[4];
		S2B a2x = (S2B) result1_green[5];
		Branch z = (Branch) result1_green[7];
		Branch x = (Branch) result1_green[8];
		S2B c2z = (S2B) result1_green[9];

		Object[] result2_black = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_1_2_collecttranslatedelements_blackBBBBBBBBB(a, b, y, b2y, a2x, c, z, x,
						c2z);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a] = " + a + ", " + "[b] = " + b
					+ ", " + "[y] = " + y + ", " + "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", " + "[c] = " + c
					+ ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[c2z] = " + c2z + ".");
		}
		Object[] result2_green = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_1_2_collecttranslatedelements_greenFBBBBBBBBB(a, b, y, b2y, a2x, c, z, x,
						c2z);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, w, a, b, y, i, b2y,
						a2x, c, w2i, z, x, c2z);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[w] = " + w + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[y] = " + y + ", "
					+ "[i] = " + i + ", " + "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", " + "[c] = " + c + ", "
					+ "[w2i] = " + w2i + ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[c2z] = " + c2z + ".");
		}
		whiledul2branchbubImpl.pattern_whiledul2branchbub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, w, a, b, y, i, b2y, a2x, c, z, x, c2z);
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge y__z____next = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c__b____last = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge c__b____first = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge z__y____positive = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[25];

		// 
		// 
		whiledul2branchbubImpl.pattern_whiledul2branchbub_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
				w, a, b, y, i, b2y, a2x, c, w2i, z, x, c2z);
		return whiledul2branchbubImpl.pattern_whiledul2branchbub_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whiledul2branchbubImpl.pattern_whiledul2branchbub_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		While w = (While) result2_binding[0];
		Decision a = (Decision) result2_binding[1];
		Assignment b = (Assignment) result2_binding[2];
		While c = (While) result2_binding[3];
		for (Object[] result2_black : whiledul2branchbubImpl.pattern_whiledul2branchbub_2_2_corematch_blackBBBFBFB(w, a,
				b, c, match)) {
			Branch i = (Branch) result2_black[3];
			S2B w2i = (S2B) result2_black[5];
			// ForEach 
			for (Object[] result3_black : whiledul2branchbubImpl
					.pattern_whiledul2branchbub_2_3_findcontext_blackBBBBBB(w, a, b, i, c, w2i)) {
				Object[] result3_green = whiledul2branchbubImpl
						.pattern_whiledul2branchbub_2_3_findcontext_greenBBBBBBFFFFFFF(w, a, b, i, c, w2i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge c__b____last = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge c__b____first = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = whiledul2branchbubImpl
						.pattern_whiledul2branchbub_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, w, a,
								b, i, c, w2i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[a] = " + a
							+ ", " + "[b] = " + b + ", " + "[i] = " + i + ", " + "[c] = " + c + ", " + "[w2i] = " + w2i
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whiledul2branchbubImpl.pattern_whiledul2branchbub_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whiledul2branchbubImpl
							.pattern_whiledul2branchbub_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whiledul2branchbubImpl.pattern_whiledul2branchbub_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whiledul2branchbubImpl.pattern_whiledul2branchbub_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, While w, Decision a, Assignment b, While c) {
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
	public CSP isAppropriate_solveCsp_FWD(Match match, While w, Decision a, Assignment b, While c) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, While w, Decision a, Assignment b,
			Branch i, While c, S2B w2i) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("w2i", w2i);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject w, EObject a, EObject b, EObject y, EObject i,
			EObject b2y, EObject a2x, EObject c, EObject w2i, EObject z, EObject x, EObject c2z) {
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("c2z", c2z);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.Decision.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.While.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command y, Branch i, Branch z, Branch x) {

		Object[] result1_black = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_10_1_initialbindings_blackBBBBBB(this, match, y, i, z, x);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[i] = " + i + ", " + "[z] = " + z + ", "
					+ "[x] = " + x + ".");
		}

		Object[] result2_bindingAndBlack = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, y, i, z, x);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[i] = " + i + ", " + "[z] = " + z + ", "
					+ "[x] = " + x + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whiledul2branchbubImpl.pattern_whiledul2branchbub_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whiledul2branchbubImpl
					.pattern_whiledul2branchbub_10_4_collectelementstobetranslated_blackBBBBB(match, y, i, z, x);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[y] = " + y + ", " + "[i] = " + i + ", " + "[z] = " + z + ", " + "[x] = " + x + ".");
			}
			whiledul2branchbubImpl.pattern_whiledul2branchbub_10_4_collectelementstobetranslated_greenBBBBBFFFF(match,
					y, i, z, x);
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge y__z____next = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge z__y____positive = (EMoflonEdge) result4_green[8];

			Object[] result5_black = whiledul2branchbubImpl
					.pattern_whiledul2branchbub_10_5_collectcontextelements_blackBBBBB(match, y, i, z, x);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[y] = " + y + ", " + "[i] = " + i + ", " + "[z] = " + z + ", " + "[x] = " + x + ".");
			}
			whiledul2branchbubImpl.pattern_whiledul2branchbub_10_5_collectcontextelements_greenBB(match, i);

			// 
			whiledul2branchbubImpl.pattern_whiledul2branchbub_10_6_registerobjectstomatch_expressionBBBBBB(this, match,
					y, i, z, x);
			return whiledul2branchbubImpl.pattern_whiledul2branchbub_10_7_expressionF();
		} else {
			return whiledul2branchbubImpl.pattern_whiledul2branchbub_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		While w = (While) result1_bindingAndBlack[0];
		Command y = (Command) result1_bindingAndBlack[1];
		Branch i = (Branch) result1_bindingAndBlack[2];
		S2B w2i = (S2B) result1_bindingAndBlack[3];
		Branch z = (Branch) result1_bindingAndBlack[4];
		Branch x = (Branch) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_11_1_performtransformation_greenBFFBFFFBBF(w, y, z, x);
		Decision a = (Decision) result1_green[1];
		Assignment b = (Assignment) result1_green[2];
		S2N b2y = (S2N) result1_green[4];
		S2B a2x = (S2B) result1_green[5];
		While c = (While) result1_green[6];
		S2B c2z = (S2B) result1_green[9];

		Object[] result2_black = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_11_2_collecttranslatedelements_blackBBBBBBBBB(a, b, y, b2y, a2x, c, z, x,
						c2z);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a] = " + a + ", " + "[b] = " + b
					+ ", " + "[y] = " + y + ", " + "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", " + "[c] = " + c
					+ ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[c2z] = " + c2z + ".");
		}
		Object[] result2_green = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_11_2_collecttranslatedelements_greenFBBBBBBBBB(a, b, y, b2y, a2x, c, z, x,
						c2z);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, w, a, b, y, i, b2y,
						a2x, c, w2i, z, x, c2z);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[w] = " + w + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[y] = " + y + ", "
					+ "[i] = " + i + ", " + "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", " + "[c] = " + c + ", "
					+ "[w2i] = " + w2i + ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[c2z] = " + c2z + ".");
		}
		whiledul2branchbubImpl.pattern_whiledul2branchbub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, w, a, b, y, i, b2y, a2x, c, z, x, c2z);
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge y__z____next = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c__b____last = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge c__b____first = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge z__y____positive = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[25];

		// 
		// 
		whiledul2branchbubImpl.pattern_whiledul2branchbub_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this,
				ruleresult, w, a, b, y, i, b2y, a2x, c, w2i, z, x, c2z);
		return whiledul2branchbubImpl.pattern_whiledul2branchbub_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whiledul2branchbubImpl.pattern_whiledul2branchbub_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Command y = (Command) result2_binding[0];
		Branch i = (Branch) result2_binding[1];
		Branch z = (Branch) result2_binding[2];
		Branch x = (Branch) result2_binding[3];
		for (Object[] result2_black : whiledul2branchbubImpl.pattern_whiledul2branchbub_12_2_corematch_blackFBBFBBB(y,
				i, z, x, match)) {
			While w = (While) result2_black[0];
			S2B w2i = (S2B) result2_black[3];
			// ForEach 
			for (Object[] result3_black : whiledul2branchbubImpl
					.pattern_whiledul2branchbub_12_3_findcontext_blackBBBBBB(w, y, i, w2i, z, x)) {
				Object[] result3_green = whiledul2branchbubImpl
						.pattern_whiledul2branchbub_12_3_findcontext_greenBBBBBBFFFFFFF(w, y, i, w2i, z, x);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge y__z____next = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge z__y____positive = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = whiledul2branchbubImpl
						.pattern_whiledul2branchbub_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, w,
								y, i, w2i, z, x);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[y] = " + y
							+ ", " + "[i] = " + i + ", " + "[w2i] = " + w2i + ", " + "[z] = " + z + ", " + "[x] = " + x
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whiledul2branchbubImpl.pattern_whiledul2branchbub_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whiledul2branchbubImpl
							.pattern_whiledul2branchbub_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whiledul2branchbubImpl.pattern_whiledul2branchbub_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whiledul2branchbubImpl.pattern_whiledul2branchbub_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Command y, Branch i, Branch z, Branch x) {
		match.registerObject("y", y);
		match.registerObject("i", i);
		match.registerObject("z", z);
		match.registerObject("x", x);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command y, Branch i, Branch z, Branch x) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, While w, Command y, Branch i, S2B w2i,
			Branch z, Branch x) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("i", i);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("z", z);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject w, EObject a, EObject b, EObject y, EObject i,
			EObject b2y, EObject a2x, EObject c, EObject w2i, EObject z, EObject x, EObject c2z) {
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("x", x);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_9(EMoflonEdge _edge_negative) {

		Object[] result1_bindingAndBlack = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whiledul2branchbubImpl.pattern_whiledul2branchbub_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whiledul2branchbubImpl
				.pattern_whiledul2branchbub_20_2_testcorematchandDECs_blackFFFFB(_edge_negative)) {
			Command y = (Command) result2_black[0];
			Branch i = (Branch) result2_black[1];
			Branch z = (Branch) result2_black[2];
			Branch x = (Branch) result2_black[3];
			Object[] result2_green = whiledul2branchbubImpl
					.pattern_whiledul2branchbub_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whiledul2branchbubImpl
					.pattern_whiledul2branchbub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, y, i, z, x)) {
				// 
				if (whiledul2branchbubImpl
						.pattern_whiledul2branchbub_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = whiledul2branchbubImpl
							.pattern_whiledul2branchbub_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whiledul2branchbubImpl.pattern_whiledul2branchbub_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whiledul2branchbubImpl.pattern_whiledul2branchbub_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_9(EMoflonEdge _edge_next) {

		Object[] result1_bindingAndBlack = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whiledul2branchbubImpl.pattern_whiledul2branchbub_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whiledul2branchbubImpl
				.pattern_whiledul2branchbub_21_2_testcorematchandDECs_blackFFFFB(_edge_next)) {
			While w = (While) result2_black[0];
			Decision a = (Decision) result2_black[1];
			Assignment b = (Assignment) result2_black[2];
			While c = (While) result2_black[3];
			Object[] result2_green = whiledul2branchbubImpl
					.pattern_whiledul2branchbub_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whiledul2branchbubImpl
					.pattern_whiledul2branchbub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, w, a, b, c)) {
				// 
				if (whiledul2branchbubImpl
						.pattern_whiledul2branchbub_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = whiledul2branchbubImpl
							.pattern_whiledul2branchbub_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whiledul2branchbubImpl.pattern_whiledul2branchbub_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whiledul2branchbubImpl.pattern_whiledul2branchbub_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("whiledul2branchbub");
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
		ruleResult.setRule("whiledul2branchbub");
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

		Object[] result1_black = whiledul2branchbubImpl.pattern_whiledul2branchbub_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whiledul2branchbubImpl.pattern_whiledul2branchbub_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		While w = (While) result2_bindingAndBlack[0];
		Decision a = (Decision) result2_bindingAndBlack[1];
		Assignment b = (Assignment) result2_bindingAndBlack[2];
		Command y = (Command) result2_bindingAndBlack[3];
		Branch i = (Branch) result2_bindingAndBlack[4];
		While c = (While) result2_bindingAndBlack[5];
		Branch z = (Branch) result2_bindingAndBlack[6];
		Branch x = (Branch) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, w, a, b, y, i, c, z, x,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[w] = " + w + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[y] = " + y + ", " + "[i] = "
					+ i + ", " + "[c] = " + c + ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whiledul2branchbubImpl.pattern_whiledul2branchbub_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whiledul2branchbubImpl
					.pattern_whiledul2branchbub_24_5_matchcorrcontext_blackBBFBB(w, i, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[2];
				Object[] result5_green = whiledul2branchbubImpl
						.pattern_whiledul2branchbub_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whiledul2branchbubImpl
						.pattern_whiledul2branchbub_24_6_createcorrespondence_blackBBBBBBBBB(w, a, b, y, i, c, z, x,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w] = " + w + ", "
							+ "[a] = " + a + ", " + "[b] = " + b + ", " + "[y] = " + y + ", " + "[i] = " + i + ", "
							+ "[c] = " + c + ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				whiledul2branchbubImpl.pattern_whiledul2branchbub_24_6_createcorrespondence_greenBBBFFBBBFB(a, b, y, c,
						z, x, ccMatch);
				//nothing S2N b2y = (S2N) result6_green[3];
				//nothing S2B a2x = (S2B) result6_green[4];
				//nothing S2B c2z = (S2B) result6_green[8];

				Object[] result7_black = whiledul2branchbubImpl
						.pattern_whiledul2branchbub_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whiledul2branchbubImpl.pattern_whiledul2branchbub_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return whiledul2branchbubImpl.pattern_whiledul2branchbub_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(While w, Decision a, Assignment b, Command y, Branch i, While c, Branch z,
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
	public boolean checkDEC_FWD(While w, Decision a, Assignment b, While c) {// 
		Object[] result1_black = whiledul2branchbubImpl.pattern_whiledul2branchbub_27_1_matchtggpattern_blackBBBB(w, a,
				b, c);
		if (result1_black != null) {
			return whiledul2branchbubImpl.pattern_whiledul2branchbub_27_2_expressionF();
		} else {
			return whiledul2branchbubImpl.pattern_whiledul2branchbub_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Command y, Branch i, Branch z, Branch x) {// 
		Object[] result1_black = whiledul2branchbubImpl.pattern_whiledul2branchbub_28_1_matchtggpattern_blackBBBB(y, i,
				z, x);
		if (result1_black != null) {
			return whiledul2branchbubImpl.pattern_whiledul2branchbub_28_2_expressionF();
		} else {
			return whiledul2branchbubImpl.pattern_whiledul2branchbub_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B w2iParameter) {

		Object[] result1_black = whiledul2branchbubImpl.pattern_whiledul2branchbub_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whiledul2branchbubImpl.pattern_whiledul2branchbub_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : whiledul2branchbubImpl
				.pattern_whiledul2branchbub_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList w2iList = (RuleEntryList) result2_black[0];
			While w = (While) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			Branch i = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = whiledul2branchbubImpl
					.pattern_whiledul2branchbub_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, w, i, w2i,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[i] = " + i
						+ ", " + "[w2i] = " + w2i + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whiledul2branchbubImpl.pattern_whiledul2branchbub_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whiledul2branchbubImpl.pattern_whiledul2branchbub_29_5_checknacs_blackBBB(w, i,
						w2i);
				if (result5_black != null) {

					Object[] result6_black = whiledul2branchbubImpl.pattern_whiledul2branchbub_29_6_perform_blackBBBB(w,
							i, w2i, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w] = " + w + ", "
								+ "[i] = " + i + ", " + "[w2i] = " + w2i + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whiledul2branchbubImpl.pattern_whiledul2branchbub_29_6_perform_greenBFFFBFFFFFFB(w, i, ruleResult);
					//nothing Decision a = (Decision) result6_green[1];
					//nothing Assignment b = (Assignment) result6_green[2];
					//nothing Command y = (Command) result6_green[3];
					//nothing S2N b2y = (S2N) result6_green[5];
					//nothing S2B a2x = (S2B) result6_green[6];
					//nothing While c = (While) result6_green[7];
					//nothing Branch z = (Branch) result6_green[8];
					//nothing Branch x = (Branch) result6_green[9];
					//nothing S2B c2z = (S2B) result6_green[10];

				} else {
				}

			} else {
			}

		}
		return whiledul2branchbubImpl.pattern_whiledul2branchbub_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, While w, Branch i, S2B w2i,
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
		isApplicableMatch.registerObject("i", i);
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
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPROPRIATE_FWD__MATCH_WHILE_DECISION_ASSIGNMENT_WHILE:
			return isAppropriate_FWD((Match) arguments.get(0), (While) arguments.get(1), (Decision) arguments.get(2),
					(Assignment) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.WHILEDUL2BRANCHBUB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WHILE_DECISION_ASSIGNMENT_WHILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (While) arguments.get(1), (Decision) arguments.get(2),
					(Assignment) arguments.get(3), (While) arguments.get(4));
			return null;
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WHILE_DECISION_ASSIGNMENT_WHILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(Decision) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_WHILE_DECISION_ASSIGNMENT_BRANCH_WHILE_S2B:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(Decision) arguments.get(2), (Assignment) arguments.get(3), (Branch) arguments.get(4),
					(While) arguments.get(5), (S2B) arguments.get(6));
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.WHILEDUL2BRANCHBUB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPROPRIATE_BWD__MATCH_COMMAND_BRANCH_BRANCH_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.WHILEDUL2BRANCHBUB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_BRANCH_BRANCH_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4));
			return null;
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_BRANCH_BRANCH_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_WHILE_COMMAND_BRANCH_S2B_BRANCH_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (S2B) arguments.get(4),
					(Branch) arguments.get(5), (Branch) arguments.get(6));
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.WHILEDUL2BRANCHBUB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_9__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_9((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_9__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_9((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_CC__WHILE_DECISION_ASSIGNMENT_COMMAND_BRANCH_WHILE_BRANCH_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((While) arguments.get(0), (Decision) arguments.get(1),
					(Assignment) arguments.get(2), (Command) arguments.get(3), (Branch) arguments.get(4),
					(While) arguments.get(5), (Branch) arguments.get(6), (Branch) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___CHECK_DEC_FWD__WHILE_DECISION_ASSIGNMENT_WHILE:
			return checkDEC_FWD((While) arguments.get(0), (Decision) arguments.get(1), (Assignment) arguments.get(2),
					(While) arguments.get(3));
		case RulesPackage.WHILEDUL2BRANCHBUB___CHECK_DEC_BWD__COMMAND_BRANCH_BRANCH_BRANCH:
			return checkDEC_BWD((Command) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.WHILEDUL2BRANCHBUB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILEDUL2BRANCHBUB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_WHILE_BRANCH_S2B_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(Branch) arguments.get(2), (S2B) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILEDUL2BRANCHBUB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whiledul2branchbub_0_1_initialbindings_blackBBBBBB(whiledul2branchbub _this,
			Match match, While w, Decision a, Assignment b, While c) {
		if (!c.equals(w)) {
			return new Object[] { _this, match, w, a, b, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_0_2_SolveCSP_bindingFBBBBBB(whiledul2branchbub _this,
			Match match, While w, Decision a, Assignment b, While c) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, w, a, b, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, w, a, b, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledul2branchbub_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			whiledul2branchbub _this, Match match, While w, Decision a, Assignment b, While c) {
		Object[] result_pattern_whiledul2branchbub_0_2_SolveCSP_binding = pattern_whiledul2branchbub_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, w, a, b, c);
		if (result_pattern_whiledul2branchbub_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledul2branchbub_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whiledul2branchbub_0_2_SolveCSP_black = pattern_whiledul2branchbub_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whiledul2branchbub_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, w, a, b, c };
			}
		}
		return null;
	}

	public static final boolean pattern_whiledul2branchbub_0_3_CheckCSP_expressionFBB(whiledul2branchbub _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiledul2branchbub_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			While w, Decision a, Assignment b, While c) {
		if (!c.equals(w)) {
			return new Object[] { match, w, a, b, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_0_4_collectelementstobetranslated_greenBBBBBFFFF(
			Match match, While w, Decision a, Assignment b, While c) {
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(c);
		String w__c____next_name_prime = "next";
		String c__b____last_name_prime = "last";
		String c__b____first_name_prime = "first";
		String w__a____first_name_prime = "first";
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(c__b____last);
		c__b____first.setSrc(c);
		c__b____first.setTrg(b);
		match.getToBeTranslatedEdges().add(c__b____first);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		w__c____next.setName(w__c____next_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		c__b____first.setName(c__b____first_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		return new Object[] { match, w, a, b, c, w__c____next, c__b____last, c__b____first, w__a____first };
	}

	public static final Object[] pattern_whiledul2branchbub_0_5_collectcontextelements_blackBBBBB(Match match, While w,
			Decision a, Assignment b, While c) {
		if (!c.equals(w)) {
			return new Object[] { match, w, a, b, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whiledul2branchbub_0_6_registerobjectstomatch_expressionBBBBBB(
			whiledul2branchbub _this, Match match, While w, Decision a, Assignment b, While c) {
		_this.registerObjectsToMatch_FWD(match, w, a, b, c);

	}

	public static final boolean pattern_whiledul2branchbub_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whiledul2branchbub_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whiledul2branchbub_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("w");
		EObject _localVariable_1 = isApplicableMatch.getObject("a");
		EObject _localVariable_2 = isApplicableMatch.getObject("b");
		EObject _localVariable_3 = isApplicableMatch.getObject("i");
		EObject _localVariable_4 = isApplicableMatch.getObject("c");
		EObject _localVariable_5 = isApplicableMatch.getObject("w2i");
		EObject tmpW = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpI = _localVariable_3;
		EObject tmpC = _localVariable_4;
		EObject tmpW2i = _localVariable_5;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpA instanceof Decision) {
				Decision a = (Decision) tmpA;
				if (tmpB instanceof Assignment) {
					Assignment b = (Assignment) tmpB;
					if (tmpI instanceof Branch) {
						Branch i = (Branch) tmpI;
						if (tmpC instanceof While) {
							While c = (While) tmpC;
							if (tmpW2i instanceof S2B) {
								S2B w2i = (S2B) tmpW2i;
								return new Object[] { w, a, b, i, c, w2i, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_1_1_performtransformation_blackBBBBBBFBB(While w,
			Decision a, Assignment b, Branch i, While c, S2B w2i, whiledul2branchbub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!c.equals(w)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { w, a, b, i, c, w2i, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			whiledul2branchbub _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whiledul2branchbub_1_1_performtransformation_binding = pattern_whiledul2branchbub_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_whiledul2branchbub_1_1_performtransformation_binding != null) {
			While w = (While) result_pattern_whiledul2branchbub_1_1_performtransformation_binding[0];
			Decision a = (Decision) result_pattern_whiledul2branchbub_1_1_performtransformation_binding[1];
			Assignment b = (Assignment) result_pattern_whiledul2branchbub_1_1_performtransformation_binding[2];
			Branch i = (Branch) result_pattern_whiledul2branchbub_1_1_performtransformation_binding[3];
			While c = (While) result_pattern_whiledul2branchbub_1_1_performtransformation_binding[4];
			S2B w2i = (S2B) result_pattern_whiledul2branchbub_1_1_performtransformation_binding[5];

			Object[] result_pattern_whiledul2branchbub_1_1_performtransformation_black = pattern_whiledul2branchbub_1_1_performtransformation_blackBBBBBBFBB(
					w, a, b, i, c, w2i, _this, isApplicableMatch);
			if (result_pattern_whiledul2branchbub_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whiledul2branchbub_1_1_performtransformation_black[6];

				return new Object[] { w, a, b, i, c, w2i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_1_1_performtransformation_greenBBFBFFBFFF(Decision a,
			Assignment b, Branch i, While c) {
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		b2y.setTarget(y);
		b2y.setSource(b);
		a2x.setSource(a);
		i.setNegative(z);
		y.setNext(z);
		z.setPositive(y);
		i.setPositive(x);
		a2x.setTarget(x);
		c2z.setTarget(z);
		c2z.setSource(c);
		return new Object[] { a, b, y, i, b2y, a2x, c, z, x, c2z };
	}

	public static final Object[] pattern_whiledul2branchbub_1_2_collecttranslatedelements_blackBBBBBBBBB(Decision a,
			Assignment b, Command y, S2N b2y, S2B a2x, While c, Branch z, Branch x, S2B c2z) {
		if (!a2x.equals(c2z)) {
			if (!x.equals(z)) {
				return new Object[] { a, b, y, b2y, a2x, c, z, x, c2z };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_1_2_collecttranslatedelements_greenFBBBBBBBBB(Decision a,
			Assignment b, Command y, S2N b2y, S2B a2x, While c, Branch z, Branch x, S2B c2z) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(c2z);
		return new Object[] { ruleresult, a, b, y, b2y, a2x, c, z, x, c2z };
	}

	public static final Object[] pattern_whiledul2branchbub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject w, EObject a, EObject b, EObject y, EObject i, EObject b2y,
			EObject a2x, EObject c, EObject w2i, EObject z, EObject x, EObject c2z) {
		if (!w.equals(y)) {
			if (!w.equals(w2i)) {
				if (!w.equals(z)) {
					if (!w.equals(x)) {
						if (!a.equals(w)) {
							if (!a.equals(b)) {
								if (!a.equals(y)) {
									if (!a.equals(i)) {
										if (!a.equals(b2y)) {
											if (!a.equals(a2x)) {
												if (!a.equals(c)) {
													if (!a.equals(w2i)) {
														if (!a.equals(z)) {
															if (!a.equals(x)) {
																if (!a.equals(c2z)) {
																	if (!b.equals(w)) {
																		if (!b.equals(y)) {
																			if (!b.equals(i)) {
																				if (!b.equals(b2y)) {
																					if (!b.equals(c)) {
																						if (!b.equals(w2i)) {
																							if (!b.equals(z)) {
																								if (!b.equals(x)) {
																									if (!b.equals(
																											c2z)) {
																										if (!y.equals(
																												z)) {
																											if (!i.equals(
																													w)) {
																												if (!i.equals(
																														y)) {
																													if (!i.equals(
																															w2i)) {
																														if (!i.equals(
																																z)) {
																															if (!i.equals(
																																	x)) {
																																if (!b2y.equals(
																																		w)) {
																																	if (!b2y.equals(
																																			y)) {
																																		if (!b2y.equals(
																																				i)) {
																																			if (!b2y.equals(
																																					c)) {
																																				if (!b2y.equals(
																																						w2i)) {
																																					if (!b2y.equals(
																																							z)) {
																																						if (!b2y.equals(
																																								x)) {
																																							if (!b2y.equals(
																																									c2z)) {
																																								if (!a2x.equals(
																																										w)) {
																																									if (!a2x.equals(
																																											b)) {
																																										if (!a2x.equals(
																																												y)) {
																																											if (!a2x.equals(
																																													i)) {
																																												if (!a2x.equals(
																																														b2y)) {
																																													if (!a2x.equals(
																																															c)) {
																																														if (!a2x.equals(
																																																w2i)) {
																																															if (!a2x.equals(
																																																	z)) {
																																																if (!a2x.equals(
																																																		x)) {
																																																	if (!a2x.equals(
																																																			c2z)) {
																																																		if (!c.equals(
																																																				w)) {
																																																			if (!c.equals(
																																																					y)) {
																																																				if (!c.equals(
																																																						i)) {
																																																					if (!c.equals(
																																																							w2i)) {
																																																						if (!c.equals(
																																																								z)) {
																																																							if (!c.equals(
																																																									x)) {
																																																								if (!c.equals(
																																																										c2z)) {
																																																									if (!w2i.equals(
																																																											y)) {
																																																										if (!w2i.equals(
																																																												z)) {
																																																											if (!w2i.equals(
																																																													x)) {
																																																												if (!x.equals(
																																																														y)) {
																																																													if (!x.equals(
																																																															z)) {
																																																														if (!c2z.equals(
																																																																w)) {
																																																															if (!c2z.equals(
																																																																	y)) {
																																																																if (!c2z.equals(
																																																																		i)) {
																																																																	if (!c2z.equals(
																																																																			w2i)) {
																																																																		if (!c2z.equals(
																																																																				z)) {
																																																																			if (!c2z.equals(
																																																																					x)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						w,
																																																																						a,
																																																																						b,
																																																																						y,
																																																																						i,
																																																																						b2y,
																																																																						a2x,
																																																																						c,
																																																																						w2i,
																																																																						z,
																																																																						x,
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

	public static final Object[] pattern_whiledul2branchbub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject w, EObject a, EObject b, EObject y, EObject i, EObject b2y,
			EObject a2x, EObject c, EObject z, EObject x, EObject c2z) {
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whiledul2branchbub";
		String w__c____next_name_prime = "next";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String b2y__y____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String y__z____next_name_prime = "next";
		String c__b____last_name_prime = "last";
		String c__b____first_name_prime = "first";
		String z__y____positive_name_prime = "positive";
		String b2y__b____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String c2z__z____target_name_prime = "target";
		String c2z__c____source_name_prime = "source";
		String w__a____first_name_prime = "first";
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		ruleresult.getCreatedEdges().add(y__z____next);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(c__b____last);
		c__b____first.setSrc(c);
		c__b____first.setTrg(b);
		ruleresult.getTranslatedEdges().add(c__b____first);
		z__y____positive.setSrc(z);
		z__y____positive.setTrg(y);
		ruleresult.getCreatedEdges().add(z__y____positive);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		w__c____next.setName(w__c____next_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		y__z____next.setName(y__z____next_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		c__b____first.setName(c__b____first_name_prime);
		z__y____positive.setName(z__y____positive_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		return new Object[] { ruleresult, w, a, b, y, i, b2y, a2x, c, z, x, c2z, w__c____next, i__z____negative,
				i__x____positive, b2y__y____target, a2x__a____source, y__z____next, c__b____last, c__b____first,
				z__y____positive, b2y__b____source, a2x__x____target, c2z__z____target, c2z__c____source,
				w__a____first };
	}

	public static final void pattern_whiledul2branchbub_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whiledul2branchbub _this, PerformRuleResult ruleresult, EObject w, EObject a, EObject b, EObject y,
			EObject i, EObject b2y, EObject a2x, EObject c, EObject w2i, EObject z, EObject x, EObject c2z) {
		_this.registerObjects_FWD(ruleresult, w, a, b, y, i, b2y, a2x, c, w2i, z, x, c2z);

	}

	public static final PerformRuleResult pattern_whiledul2branchbub_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whiledul2branchbub_2_1_preparereturnvalue_bindingFB(whiledul2branchbub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_2_1_preparereturnvalue_blackFBB(EClass eClass,
			whiledul2branchbub _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_2_1_preparereturnvalue_bindingAndBlackFFB(
			whiledul2branchbub _this) {
		Object[] result_pattern_whiledul2branchbub_2_1_preparereturnvalue_binding = pattern_whiledul2branchbub_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whiledul2branchbub_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whiledul2branchbub_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whiledul2branchbub_2_1_preparereturnvalue_black = pattern_whiledul2branchbub_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whiledul2branchbub_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whiledul2branchbub_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whiledul2branchbub";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whiledul2branchbub_2_2_corematch_bindingFFFFB(Match match) {
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
			if (tmpA instanceof Decision) {
				Decision a = (Decision) tmpA;
				if (tmpB instanceof Assignment) {
					Assignment b = (Assignment) tmpB;
					if (tmpC instanceof While) {
						While c = (While) tmpC;
						return new Object[] { w, a, b, c, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiledul2branchbub_2_2_corematch_blackBBBFBFB(While w, Decision a,
			Assignment b, While c, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(w)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				Branch i = w2i.getTarget();
				if (i != null) {
					_result.add(new Object[] { w, a, b, i, c, w2i, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whiledul2branchbub_2_3_findcontext_blackBBBBBB(While w, Decision a,
			Assignment b, Branch i, While c, S2B w2i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(w)) {
			if (c.equals(w.getNext())) {
				if (b.equals(c.getLast())) {
					if (b.equals(c.getFirst())) {
						if (i.equals(w2i.getTarget())) {
							if (w.equals(w2i.getSource())) {
								if (a.equals(w.getFirst())) {
									_result.add(new Object[] { w, a, b, i, c, w2i });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whiledul2branchbub_2_3_findcontext_greenBBBBBBFFFFFFF(While w, Decision a,
			Assignment b, Branch i, While c, S2B w2i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w__c____next_name_prime = "next";
		String c__b____last_name_prime = "last";
		String c__b____first_name_prime = "first";
		String w2i__i____target_name_prime = "target";
		String w2i__w____source_name_prime = "source";
		String w__a____first_name_prime = "first";
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(w2i);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(c__b____last);
		c__b____first.setSrc(c);
		c__b____first.setTrg(b);
		isApplicableMatch.getAllContextElements().add(c__b____first);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w__c____next.setName(w__c____next_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		c__b____first.setName(c__b____first_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		return new Object[] { w, a, b, i, c, w2i, isApplicableMatch, w__c____next, c__b____last, c__b____first,
				w2i__i____target, w2i__w____source, w__a____first };
	}

	public static final Object[] pattern_whiledul2branchbub_2_4_solveCSP_bindingFBBBBBBBB(whiledul2branchbub _this,
			IsApplicableMatch isApplicableMatch, While w, Decision a, Assignment b, Branch i, While c, S2B w2i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, w, a, b, i, c, w2i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, a, b, i, c, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledul2branchbub_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			whiledul2branchbub _this, IsApplicableMatch isApplicableMatch, While w, Decision a, Assignment b, Branch i,
			While c, S2B w2i) {
		Object[] result_pattern_whiledul2branchbub_2_4_solveCSP_binding = pattern_whiledul2branchbub_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, w, a, b, i, c, w2i);
		if (result_pattern_whiledul2branchbub_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledul2branchbub_2_4_solveCSP_binding[0];

			Object[] result_pattern_whiledul2branchbub_2_4_solveCSP_black = pattern_whiledul2branchbub_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whiledul2branchbub_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, a, b, i, c, w2i };
			}
		}
		return null;
	}

	public static final boolean pattern_whiledul2branchbub_2_5_checkCSP_expressionFBB(whiledul2branchbub _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiledul2branchbub_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whiledul2branchbub_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whiledul2branchbub";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whiledul2branchbub_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whiledul2branchbub_10_1_initialbindings_blackBBBBBB(whiledul2branchbub _this,
			Match match, Command y, Branch i, Branch z, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					return new Object[] { _this, match, y, i, z, x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_10_2_SolveCSP_bindingFBBBBBB(whiledul2branchbub _this,
			Match match, Command y, Branch i, Branch z, Branch x) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, y, i, z, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, y, i, z, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledul2branchbub_10_2_SolveCSP_bindingAndBlackFBBBBBB(
			whiledul2branchbub _this, Match match, Command y, Branch i, Branch z, Branch x) {
		Object[] result_pattern_whiledul2branchbub_10_2_SolveCSP_binding = pattern_whiledul2branchbub_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, y, i, z, x);
		if (result_pattern_whiledul2branchbub_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledul2branchbub_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whiledul2branchbub_10_2_SolveCSP_black = pattern_whiledul2branchbub_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whiledul2branchbub_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, y, i, z, x };
			}
		}
		return null;
	}

	public static final boolean pattern_whiledul2branchbub_10_3_CheckCSP_expressionFBB(whiledul2branchbub _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiledul2branchbub_10_4_collectelementstobetranslated_blackBBBBB(Match match,
			Command y, Branch i, Branch z, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					return new Object[] { match, y, i, z, x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_10_4_collectelementstobetranslated_greenBBBBBFFFF(
			Match match, Command y, Branch i, Branch z, Branch x) {
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(x);
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String y__z____next_name_prime = "next";
		String z__y____positive_name_prime = "positive";
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		match.getToBeTranslatedEdges().add(y__z____next);
		z__y____positive.setSrc(z);
		z__y____positive.setTrg(y);
		match.getToBeTranslatedEdges().add(z__y____positive);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		y__z____next.setName(y__z____next_name_prime);
		z__y____positive.setName(z__y____positive_name_prime);
		return new Object[] { match, y, i, z, x, i__z____negative, i__x____positive, y__z____next, z__y____positive };
	}

	public static final Object[] pattern_whiledul2branchbub_10_5_collectcontextelements_blackBBBBB(Match match,
			Command y, Branch i, Branch z, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					return new Object[] { match, y, i, z, x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_10_5_collectcontextelements_greenBB(Match match, Branch i) {
		match.getContextNodes().add(i);
		return new Object[] { match, i };
	}

	public static final void pattern_whiledul2branchbub_10_6_registerobjectstomatch_expressionBBBBBB(
			whiledul2branchbub _this, Match match, Command y, Branch i, Branch z, Branch x) {
		_this.registerObjectsToMatch_BWD(match, y, i, z, x);

	}

	public static final boolean pattern_whiledul2branchbub_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whiledul2branchbub_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whiledul2branchbub_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("w");
		EObject _localVariable_1 = isApplicableMatch.getObject("y");
		EObject _localVariable_2 = isApplicableMatch.getObject("i");
		EObject _localVariable_3 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_4 = isApplicableMatch.getObject("z");
		EObject _localVariable_5 = isApplicableMatch.getObject("x");
		EObject tmpW = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpI = _localVariable_2;
		EObject tmpW2i = _localVariable_3;
		EObject tmpZ = _localVariable_4;
		EObject tmpX = _localVariable_5;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (tmpI instanceof Branch) {
					Branch i = (Branch) tmpI;
					if (tmpW2i instanceof S2B) {
						S2B w2i = (S2B) tmpW2i;
						if (tmpZ instanceof Branch) {
							Branch z = (Branch) tmpZ;
							if (tmpX instanceof Branch) {
								Branch x = (Branch) tmpX;
								return new Object[] { w, y, i, w2i, z, x, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_11_1_performtransformation_blackBBBBBBFBB(While w,
			Command y, Branch i, S2B w2i, Branch z, Branch x, whiledul2branchbub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { w, y, i, w2i, z, x, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			whiledul2branchbub _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whiledul2branchbub_11_1_performtransformation_binding = pattern_whiledul2branchbub_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_whiledul2branchbub_11_1_performtransformation_binding != null) {
			While w = (While) result_pattern_whiledul2branchbub_11_1_performtransformation_binding[0];
			Command y = (Command) result_pattern_whiledul2branchbub_11_1_performtransformation_binding[1];
			Branch i = (Branch) result_pattern_whiledul2branchbub_11_1_performtransformation_binding[2];
			S2B w2i = (S2B) result_pattern_whiledul2branchbub_11_1_performtransformation_binding[3];
			Branch z = (Branch) result_pattern_whiledul2branchbub_11_1_performtransformation_binding[4];
			Branch x = (Branch) result_pattern_whiledul2branchbub_11_1_performtransformation_binding[5];

			Object[] result_pattern_whiledul2branchbub_11_1_performtransformation_black = pattern_whiledul2branchbub_11_1_performtransformation_blackBBBBBBFBB(
					w, y, i, w2i, z, x, _this, isApplicableMatch);
			if (result_pattern_whiledul2branchbub_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whiledul2branchbub_11_1_performtransformation_black[6];

				return new Object[] { w, y, i, w2i, z, x, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_11_1_performtransformation_greenBFFBFFFBBF(While w,
			Command y, Branch z, Branch x) {
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		w.setFirst(a);
		b2y.setTarget(y);
		b2y.setSource(b);
		a2x.setSource(a);
		a2x.setTarget(x);
		w.setNext(c);
		c.setLast(b);
		c.setFirst(b);
		c2z.setTarget(z);
		c2z.setSource(c);
		return new Object[] { w, a, b, y, b2y, a2x, c, z, x, c2z };
	}

	public static final Object[] pattern_whiledul2branchbub_11_2_collecttranslatedelements_blackBBBBBBBBB(Decision a,
			Assignment b, Command y, S2N b2y, S2B a2x, While c, Branch z, Branch x, S2B c2z) {
		if (!a2x.equals(c2z)) {
			if (!x.equals(z)) {
				return new Object[] { a, b, y, b2y, a2x, c, z, x, c2z };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_11_2_collecttranslatedelements_greenFBBBBBBBBB(Decision a,
			Assignment b, Command y, S2N b2y, S2B a2x, While c, Branch z, Branch x, S2B c2z) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(c2z);
		return new Object[] { ruleresult, a, b, y, b2y, a2x, c, z, x, c2z };
	}

	public static final Object[] pattern_whiledul2branchbub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject w, EObject a, EObject b, EObject y, EObject i, EObject b2y,
			EObject a2x, EObject c, EObject w2i, EObject z, EObject x, EObject c2z) {
		if (!w.equals(y)) {
			if (!w.equals(w2i)) {
				if (!w.equals(z)) {
					if (!w.equals(x)) {
						if (!a.equals(w)) {
							if (!a.equals(b)) {
								if (!a.equals(y)) {
									if (!a.equals(i)) {
										if (!a.equals(b2y)) {
											if (!a.equals(a2x)) {
												if (!a.equals(c)) {
													if (!a.equals(w2i)) {
														if (!a.equals(z)) {
															if (!a.equals(x)) {
																if (!a.equals(c2z)) {
																	if (!b.equals(w)) {
																		if (!b.equals(y)) {
																			if (!b.equals(i)) {
																				if (!b.equals(b2y)) {
																					if (!b.equals(c)) {
																						if (!b.equals(w2i)) {
																							if (!b.equals(z)) {
																								if (!b.equals(x)) {
																									if (!b.equals(
																											c2z)) {
																										if (!y.equals(
																												z)) {
																											if (!i.equals(
																													w)) {
																												if (!i.equals(
																														y)) {
																													if (!i.equals(
																															w2i)) {
																														if (!i.equals(
																																z)) {
																															if (!i.equals(
																																	x)) {
																																if (!b2y.equals(
																																		w)) {
																																	if (!b2y.equals(
																																			y)) {
																																		if (!b2y.equals(
																																				i)) {
																																			if (!b2y.equals(
																																					c)) {
																																				if (!b2y.equals(
																																						w2i)) {
																																					if (!b2y.equals(
																																							z)) {
																																						if (!b2y.equals(
																																								x)) {
																																							if (!b2y.equals(
																																									c2z)) {
																																								if (!a2x.equals(
																																										w)) {
																																									if (!a2x.equals(
																																											b)) {
																																										if (!a2x.equals(
																																												y)) {
																																											if (!a2x.equals(
																																													i)) {
																																												if (!a2x.equals(
																																														b2y)) {
																																													if (!a2x.equals(
																																															c)) {
																																														if (!a2x.equals(
																																																w2i)) {
																																															if (!a2x.equals(
																																																	z)) {
																																																if (!a2x.equals(
																																																		x)) {
																																																	if (!a2x.equals(
																																																			c2z)) {
																																																		if (!c.equals(
																																																				w)) {
																																																			if (!c.equals(
																																																					y)) {
																																																				if (!c.equals(
																																																						i)) {
																																																					if (!c.equals(
																																																							w2i)) {
																																																						if (!c.equals(
																																																								z)) {
																																																							if (!c.equals(
																																																									x)) {
																																																								if (!c.equals(
																																																										c2z)) {
																																																									if (!w2i.equals(
																																																											y)) {
																																																										if (!w2i.equals(
																																																												z)) {
																																																											if (!w2i.equals(
																																																													x)) {
																																																												if (!x.equals(
																																																														y)) {
																																																													if (!x.equals(
																																																															z)) {
																																																														if (!c2z.equals(
																																																																w)) {
																																																															if (!c2z.equals(
																																																																	y)) {
																																																																if (!c2z.equals(
																																																																		i)) {
																																																																	if (!c2z.equals(
																																																																			w2i)) {
																																																																		if (!c2z.equals(
																																																																				z)) {
																																																																			if (!c2z.equals(
																																																																					x)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						w,
																																																																						a,
																																																																						b,
																																																																						y,
																																																																						i,
																																																																						b2y,
																																																																						a2x,
																																																																						c,
																																																																						w2i,
																																																																						z,
																																																																						x,
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

	public static final Object[] pattern_whiledul2branchbub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject w, EObject a, EObject b, EObject y, EObject i, EObject b2y,
			EObject a2x, EObject c, EObject z, EObject x, EObject c2z) {
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whiledul2branchbub";
		String w__c____next_name_prime = "next";
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String b2y__y____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String y__z____next_name_prime = "next";
		String c__b____last_name_prime = "last";
		String c__b____first_name_prime = "first";
		String z__y____positive_name_prime = "positive";
		String b2y__b____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String c2z__z____target_name_prime = "target";
		String c2z__c____source_name_prime = "source";
		String w__a____first_name_prime = "first";
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		ruleresult.getTranslatedEdges().add(y__z____next);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(c__b____last);
		c__b____first.setSrc(c);
		c__b____first.setTrg(b);
		ruleresult.getCreatedEdges().add(c__b____first);
		z__y____positive.setSrc(z);
		z__y____positive.setTrg(y);
		ruleresult.getTranslatedEdges().add(z__y____positive);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		w__c____next.setName(w__c____next_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		y__z____next.setName(y__z____next_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		c__b____first.setName(c__b____first_name_prime);
		z__y____positive.setName(z__y____positive_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		return new Object[] { ruleresult, w, a, b, y, i, b2y, a2x, c, z, x, c2z, w__c____next, i__z____negative,
				i__x____positive, b2y__y____target, a2x__a____source, y__z____next, c__b____last, c__b____first,
				z__y____positive, b2y__b____source, a2x__x____target, c2z__z____target, c2z__c____source,
				w__a____first };
	}

	public static final void pattern_whiledul2branchbub_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whiledul2branchbub _this, PerformRuleResult ruleresult, EObject w, EObject a, EObject b, EObject y,
			EObject i, EObject b2y, EObject a2x, EObject c, EObject w2i, EObject z, EObject x, EObject c2z) {
		_this.registerObjects_BWD(ruleresult, w, a, b, y, i, b2y, a2x, c, w2i, z, x, c2z);

	}

	public static final PerformRuleResult pattern_whiledul2branchbub_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whiledul2branchbub_12_1_preparereturnvalue_bindingFB(
			whiledul2branchbub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_12_1_preparereturnvalue_blackFBB(EClass eClass,
			whiledul2branchbub _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_12_1_preparereturnvalue_bindingAndBlackFFB(
			whiledul2branchbub _this) {
		Object[] result_pattern_whiledul2branchbub_12_1_preparereturnvalue_binding = pattern_whiledul2branchbub_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whiledul2branchbub_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whiledul2branchbub_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whiledul2branchbub_12_1_preparereturnvalue_black = pattern_whiledul2branchbub_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whiledul2branchbub_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whiledul2branchbub_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whiledul2branchbub";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whiledul2branchbub_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("y");
		EObject _localVariable_1 = match.getObject("i");
		EObject _localVariable_2 = match.getObject("z");
		EObject _localVariable_3 = match.getObject("x");
		EObject tmpY = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpX = _localVariable_3;
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpZ instanceof Branch) {
					Branch z = (Branch) tmpZ;
					if (tmpX instanceof Branch) {
						Branch x = (Branch) tmpX;
						return new Object[] { y, i, z, x, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiledul2branchbub_12_2_corematch_blackFBBFBBB(Command y, Branch i,
			Branch z, Branch x, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class,
							"target")) {
						Statement tmpW = w2i.getSource();
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							_result.add(new Object[] { w, y, i, w2i, z, x, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whiledul2branchbub_12_3_findcontext_blackBBBBBB(While w, Command y,
			Branch i, S2B w2i, Branch z, Branch x) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					if (z.equals(i.getNegative())) {
						if (x.equals(i.getPositive())) {
							if (z.equals(y.getNext())) {
								if (i.equals(w2i.getTarget())) {
									if (w.equals(w2i.getSource())) {
										if (y.equals(z.getPositive())) {
											_result.add(new Object[] { w, y, i, w2i, z, x });
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

	public static final Object[] pattern_whiledul2branchbub_12_3_findcontext_greenBBBBBBFFFFFFF(While w, Command y,
			Branch i, S2B w2i, Branch z, Branch x) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String i__z____negative_name_prime = "negative";
		String i__x____positive_name_prime = "positive";
		String y__z____next_name_prime = "next";
		String w2i__i____target_name_prime = "target";
		String w2i__w____source_name_prime = "source";
		String z__y____positive_name_prime = "positive";
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(x);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		isApplicableMatch.getAllContextElements().add(y__z____next);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		z__y____positive.setSrc(z);
		z__y____positive.setTrg(y);
		isApplicableMatch.getAllContextElements().add(z__y____positive);
		i__z____negative.setName(i__z____negative_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		y__z____next.setName(y__z____next_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		z__y____positive.setName(z__y____positive_name_prime);
		return new Object[] { w, y, i, w2i, z, x, isApplicableMatch, i__z____negative, i__x____positive, y__z____next,
				w2i__i____target, w2i__w____source, z__y____positive };
	}

	public static final Object[] pattern_whiledul2branchbub_12_4_solveCSP_bindingFBBBBBBBB(whiledul2branchbub _this,
			IsApplicableMatch isApplicableMatch, While w, Command y, Branch i, S2B w2i, Branch z, Branch x) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, w, y, i, w2i, z, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, y, i, w2i, z, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledul2branchbub_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			whiledul2branchbub _this, IsApplicableMatch isApplicableMatch, While w, Command y, Branch i, S2B w2i,
			Branch z, Branch x) {
		Object[] result_pattern_whiledul2branchbub_12_4_solveCSP_binding = pattern_whiledul2branchbub_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, w, y, i, w2i, z, x);
		if (result_pattern_whiledul2branchbub_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledul2branchbub_12_4_solveCSP_binding[0];

			Object[] result_pattern_whiledul2branchbub_12_4_solveCSP_black = pattern_whiledul2branchbub_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whiledul2branchbub_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, y, i, w2i, z, x };
			}
		}
		return null;
	}

	public static final boolean pattern_whiledul2branchbub_12_5_checkCSP_expressionFBB(whiledul2branchbub _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiledul2branchbub_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whiledul2branchbub_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whiledul2branchbub";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whiledul2branchbub_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whiledul2branchbub_20_1_preparereturnvalue_bindingFB(
			whiledul2branchbub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whiledul2branchbub _this) {
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

	public static final Object[] pattern_whiledul2branchbub_20_1_preparereturnvalue_bindingAndBlackFFBF(
			whiledul2branchbub _this) {
		Object[] result_pattern_whiledul2branchbub_20_1_preparereturnvalue_binding = pattern_whiledul2branchbub_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whiledul2branchbub_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whiledul2branchbub_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whiledul2branchbub_20_1_preparereturnvalue_black = pattern_whiledul2branchbub_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whiledul2branchbub_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whiledul2branchbub_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whiledul2branchbub_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_0B(Command y) {
		for (Graph __DEC_y_root_489378 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_1BBBB(Command y,
			Branch i, Branch z, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_positive_913032 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!i.equals(__DEC_y_positive_913032)) {
							if (!z.equals(__DEC_y_positive_913032)) {
								if (!x.equals(__DEC_y_positive_913032)) {
									return new Object[] { y, i, z, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_2BBBB(Command y,
			Branch i, Branch z, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_negative_858281 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!i.equals(__DEC_y_negative_858281)) {
							if (!z.equals(__DEC_y_negative_858281)) {
								if (!x.equals(__DEC_y_negative_858281)) {
									return new Object[] { y, i, z, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_3B(Branch z) {
		for (Graph __DEC_z_root_622503 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_4BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_positive_713681 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_713681)) {
							if (!i.equals(__DEC_z_positive_713681)) {
								if (!x.equals(__DEC_z_positive_713681)) {
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

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_5BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_negative_19968 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_19968)) {
							if (!i.equals(__DEC_z_negative_19968)) {
								if (!x.equals(__DEC_z_negative_19968)) {
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

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_558778 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_7BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_261879 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_261879)) {
							if (!i.equals(__DEC_x_positive_261879)) {
								if (!z.equals(__DEC_x_positive_261879)) {
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

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_8BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_626234 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_626234)) {
							if (!i.equals(__DEC_x_negative_626234)) {
								if (!z.equals(__DEC_x_negative_626234)) {
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

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_9BB(Branch i,
			Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_10BB(Branch x,
			Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_11BB(Branch i,
			Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_12BB(Branch z,
			Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_13BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_14BB(Branch i,
			Branch z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_15BB(Branch z,
			Branch x) {
		if (x.equals(z.getPositive())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_16BB(Branch i,
			Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_17BB(Branch z,
			Branch x) {
		if (x.equals(z.getNegative())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiledul2branchbub_20_2_testcorematchandDECs_blackFFFFB(
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
							if (!i.equals(x)) {
								if (!x.equals(z)) {
									Node tmpY = z.getPositive();
									if (tmpY instanceof Command) {
										Command y = (Command) tmpY;
										if (z.equals(y.getNext())) {
											if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_3B(
													z) == null) {
												if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_14BB(
														i, z) == null) {
													if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_4BBB(
															z, i, x) == null) {
														if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_5BBB(
																z, i, x) == null) {
															if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_6B(
																	x) == null) {
																if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_7BBB(
																		x, i, z) == null) {
																	if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_8BBB(
																			x, i, z) == null) {
																		if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_15BB(
																				z, x) == null) {
																			if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_16BB(
																					i, x) == null) {
																				if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_17BB(
																						z, x) == null) {
																					if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_0B(
																							y) == null) {
																						if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_1BBBB(
																								y, i, z, x) == null) {
																							if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_2BBBB(
																									y, i, z,
																									x) == null) {
																								if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_9BB(
																										i, y) == null) {
																									if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_10BB(
																											x,
																											y) == null) {
																										if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_11BB(
																												i,
																												y) == null) {
																											if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_12BB(
																													z,
																													y) == null) {
																												if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_13BB(
																														x,
																														y) == null) {
																													_result.add(
																															new Object[] {
																																	y,
																																	i,
																																	z,
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
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whiledul2branchbub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			whiledul2branchbub _this, Match match, Command y, Branch i, Branch z, Branch x) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, y, i, z, x);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whiledul2branchbub_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whiledul2branchbub _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiledul2branchbub_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whiledul2branchbub_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whiledul2branchbub_21_1_preparereturnvalue_bindingFB(
			whiledul2branchbub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whiledul2branchbub _this) {
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

	public static final Object[] pattern_whiledul2branchbub_21_1_preparereturnvalue_bindingAndBlackFFBF(
			whiledul2branchbub _this) {
		Object[] result_pattern_whiledul2branchbub_21_1_preparereturnvalue_binding = pattern_whiledul2branchbub_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whiledul2branchbub_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whiledul2branchbub_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whiledul2branchbub_21_1_preparereturnvalue_black = pattern_whiledul2branchbub_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whiledul2branchbub_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whiledul2branchbub_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whiledul2branchbub_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_0B(Decision a) {
		for (Decision __DEC_a_positive_13096 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_a_positive_13096)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_1B(Decision a) {
		for (Decision __DEC_a_negative_529485 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_a_negative_529485)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_2BBB(Decision a,
			While w, While c) {
		if (!c.equals(w)) {
			for (While __DEC_a_last_667883 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!w.equals(__DEC_a_last_667883)) {
					if (!c.equals(__DEC_a_last_667883)) {
						return new Object[] { a, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_3B(Decision a) {
		for (Program __DEC_a_first_874382 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_4BB(Assignment b,
			Decision a) {
		for (Decision __DEC_b_positive_466972 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_b_positive_466972)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_5BB(Assignment b,
			Decision a) {
		for (Decision __DEC_b_negative_362395 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_b_negative_362395)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_6BBB(Assignment b,
			While w, While c) {
		if (!c.equals(w)) {
			for (While __DEC_b_last_605304 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!w.equals(__DEC_b_last_605304)) {
					if (!c.equals(__DEC_b_last_605304)) {
						return new Object[] { b, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_7B(Assignment b) {
		for (Program __DEC_b_first_475894 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_8BB(While c,
			Decision a) {
		for (Decision __DEC_c_positive_915167 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_c_positive_915167)) {
				return new Object[] { c, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_9BB(While c,
			Decision a) {
		for (Decision __DEC_c_negative_920427 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_c_negative_920427)) {
				return new Object[] { c, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_10BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_first_763319 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!c.equals(__DEC_c_first_763319)) {
					if (!w.equals(__DEC_c_first_763319)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_11BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_last_132912 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!c.equals(__DEC_c_last_132912)) {
					if (!w.equals(__DEC_c_last_132912)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_12B(While c) {
		for (Program __DEC_c_first_547213 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_13BB(While w,
			Decision a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_14BB(While c,
			Decision a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_15BB(Decision a,
			Assignment b) {
		if (b.equals(a.getPositive())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_16BB(Decision a,
			Assignment b) {
		if (b.equals(a.getNegative())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_17BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_18BB(Decision a,
			While c) {
		if (c.equals(a.getPositive())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_19BB(Decision a,
			While c) {
		if (c.equals(a.getNegative())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_20BB(While w, While c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_21BB(While w, While c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiledul2branchbub_21_2_testcorematchandDECs_blackFFFFB(
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
								if (b.equals(c.getFirst())) {
									if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_10BB(c,
											w) == null) {
										if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_11BB(c,
												w) == null) {
											if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_12B(
													c) == null) {
												if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_20BB(
														w, c) == null) {
													if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_21BB(
															w, c) == null) {
														if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_0B(
																a) == null) {
															if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_1B(
																	a) == null) {
																if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_2BBB(
																		a, w, c) == null) {
																	if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_3B(
																			a) == null) {
																		if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_8BB(
																				c, a) == null) {
																			if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_9BB(
																					c, a) == null) {
																				if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_13BB(
																						w, a) == null) {
																					if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_14BB(
																							c, a) == null) {
																						if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_18BB(
																								a, c) == null) {
																							if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_19BB(
																									a, c) == null) {
																								if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_4BB(
																										b, a) == null) {
																									if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_5BB(
																											b,
																											a) == null) {
																										if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_6BBB(
																												b, w,
																												c) == null) {
																											if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_7B(
																													b) == null) {
																												if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_15BB(
																														a,
																														b) == null) {
																													if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_16BB(
																															a,
																															b) == null) {
																														if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_17BB(
																																w,
																																b) == null) {
																															_result.add(
																																	new Object[] {
																																			w,
																																			a,
																																			b,
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

		return _result;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whiledul2branchbub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			whiledul2branchbub _this, Match match, While w, Decision a, Assignment b, While c) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, w, a, b, c);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whiledul2branchbub_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whiledul2branchbub _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiledul2branchbub_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whiledul2branchbub_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whiledul2branchbub_24_1_prepare_blackB(whiledul2branchbub _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whiledul2branchbub_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_whiledul2branchbub_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("w");
		EObject _localVariable_1 = sourceMatch.getObject("a");
		EObject _localVariable_2 = sourceMatch.getObject("b");
		EObject _localVariable_3 = targetMatch.getObject("y");
		EObject _localVariable_4 = targetMatch.getObject("i");
		EObject _localVariable_5 = sourceMatch.getObject("c");
		EObject _localVariable_6 = targetMatch.getObject("z");
		EObject _localVariable_7 = targetMatch.getObject("x");
		EObject tmpW = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpY = _localVariable_3;
		EObject tmpI = _localVariable_4;
		EObject tmpC = _localVariable_5;
		EObject tmpZ = _localVariable_6;
		EObject tmpX = _localVariable_7;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpA instanceof Decision) {
				Decision a = (Decision) tmpA;
				if (tmpB instanceof Assignment) {
					Assignment b = (Assignment) tmpB;
					if (tmpY instanceof Command) {
						Command y = (Command) tmpY;
						if (tmpI instanceof Branch) {
							Branch i = (Branch) tmpI;
							if (tmpC instanceof While) {
								While c = (While) tmpC;
								if (tmpZ instanceof Branch) {
									Branch z = (Branch) tmpZ;
									if (tmpX instanceof Branch) {
										Branch x = (Branch) tmpX;
										return new Object[] { w, a, b, y, i, c, z, x, sourceMatch, targetMatch };
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

	public static final Object[] pattern_whiledul2branchbub_24_2_matchsrctrgcontext_blackBBBBBBBBBB(While w, Decision a,
			Assignment b, Command y, Branch i, While c, Branch z, Branch x, Match sourceMatch, Match targetMatch) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!c.equals(w)) {
					if (!x.equals(z)) {
						if (!sourceMatch.equals(targetMatch)) {
							return new Object[] { w, a, b, y, i, c, z, x, sourceMatch, targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whiledul2branchbub_24_2_matchsrctrgcontext_binding = pattern_whiledul2branchbub_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_whiledul2branchbub_24_2_matchsrctrgcontext_binding != null) {
			While w = (While) result_pattern_whiledul2branchbub_24_2_matchsrctrgcontext_binding[0];
			Decision a = (Decision) result_pattern_whiledul2branchbub_24_2_matchsrctrgcontext_binding[1];
			Assignment b = (Assignment) result_pattern_whiledul2branchbub_24_2_matchsrctrgcontext_binding[2];
			Command y = (Command) result_pattern_whiledul2branchbub_24_2_matchsrctrgcontext_binding[3];
			Branch i = (Branch) result_pattern_whiledul2branchbub_24_2_matchsrctrgcontext_binding[4];
			While c = (While) result_pattern_whiledul2branchbub_24_2_matchsrctrgcontext_binding[5];
			Branch z = (Branch) result_pattern_whiledul2branchbub_24_2_matchsrctrgcontext_binding[6];
			Branch x = (Branch) result_pattern_whiledul2branchbub_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_whiledul2branchbub_24_2_matchsrctrgcontext_black = pattern_whiledul2branchbub_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					w, a, b, y, i, c, z, x, sourceMatch, targetMatch);
			if (result_pattern_whiledul2branchbub_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { w, a, b, y, i, c, z, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_24_3_solvecsp_bindingFBBBBBBBBBBB(whiledul2branchbub _this,
			While w, Decision a, Assignment b, Command y, Branch i, While c, Branch z, Branch x, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(w, a, b, y, i, c, z, x, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, w, a, b, y, i, c, z, x, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledul2branchbub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			whiledul2branchbub _this, While w, Decision a, Assignment b, Command y, Branch i, While c, Branch z,
			Branch x, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whiledul2branchbub_24_3_solvecsp_binding = pattern_whiledul2branchbub_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, w, a, b, y, i, c, z, x, sourceMatch, targetMatch);
		if (result_pattern_whiledul2branchbub_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whiledul2branchbub_24_3_solvecsp_binding[0];

			Object[] result_pattern_whiledul2branchbub_24_3_solvecsp_black = pattern_whiledul2branchbub_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whiledul2branchbub_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, w, a, b, y, i, c, z, x, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whiledul2branchbub_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whiledul2branchbub_24_5_matchcorrcontext_blackBBFBB(While w,
			Branch i, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class, "target")) {
				if (w.equals(w2i.getSource())) {
					_result.add(new Object[] { w, i, w2i, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whiledul2branchbub_24_5_matchcorrcontext_greenBBBF(S2B w2i, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "whiledul2branchbub";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(w2i);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { w2i, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_whiledul2branchbub_24_6_createcorrespondence_blackBBBBBBBBB(While w,
			Decision a, Assignment b, Command y, Branch i, While c, Branch z, Branch x, CCMatch ccMatch) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!c.equals(w)) {
					if (!x.equals(z)) {
						return new Object[] { w, a, b, y, i, c, z, x, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_24_6_createcorrespondence_greenBBBFFBBBFB(Decision a,
			Assignment b, Command y, While c, Branch z, Branch x, CCMatch ccMatch) {
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		c2z.setTarget(z);
		c2z.setSource(c);
		ccMatch.getCreateCorr().add(c2z);
		return new Object[] { a, b, y, b2y, a2x, c, z, x, c2z, ccMatch };
	}

	public static final Object[] pattern_whiledul2branchbub_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_whiledul2branchbub_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "whiledul2branchbub";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_whiledul2branchbub_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_0B(Decision a) {
		for (Decision __DEC_a_positive_925928 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_a_positive_925928)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_1B(Decision a) {
		for (Decision __DEC_a_negative_348355 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_a_negative_348355)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_2BBB(Decision a, While w,
			While c) {
		if (!c.equals(w)) {
			for (While __DEC_a_last_56120 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!w.equals(__DEC_a_last_56120)) {
					if (!c.equals(__DEC_a_last_56120)) {
						return new Object[] { a, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_3B(Decision a) {
		for (Program __DEC_a_first_90769 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_4BB(Assignment b,
			Decision a) {
		for (Decision __DEC_b_positive_881034 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_b_positive_881034)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_5BB(Assignment b,
			Decision a) {
		for (Decision __DEC_b_negative_239490 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_b_negative_239490)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_6BBB(Assignment b, While w,
			While c) {
		if (!c.equals(w)) {
			for (While __DEC_b_last_505445 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!w.equals(__DEC_b_last_505445)) {
					if (!c.equals(__DEC_b_last_505445)) {
						return new Object[] { b, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_7B(Assignment b) {
		for (Program __DEC_b_first_509450 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_8BB(While c, Decision a) {
		for (Decision __DEC_c_positive_378244 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_c_positive_378244)) {
				return new Object[] { c, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_9BB(While c, Decision a) {
		for (Decision __DEC_c_negative_732645 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_c_negative_732645)) {
				return new Object[] { c, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_10BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_first_245309 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!c.equals(__DEC_c_first_245309)) {
					if (!w.equals(__DEC_c_first_245309)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_11BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_last_818130 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!c.equals(__DEC_c_last_818130)) {
					if (!w.equals(__DEC_c_last_818130)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_12B(While c) {
		for (Program __DEC_c_first_570710 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_13BB(While w, Decision a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_14BB(While c, Decision a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_15BB(Decision a,
			Assignment b) {
		if (b.equals(a.getPositive())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_16BB(Decision a,
			Assignment b) {
		if (b.equals(a.getNegative())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_17BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_18BB(Decision a, While c) {
		if (c.equals(a.getPositive())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_19BB(Decision a, While c) {
		if (c.equals(a.getNegative())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_20BB(While w, While c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_21BB(While w, While c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_blackBBBB(While w, Decision a,
			Assignment b, While c) {
		if (!c.equals(w)) {
			if (c.equals(w.getNext())) {
				if (b.equals(c.getLast())) {
					if (b.equals(c.getFirst())) {
						if (a.equals(w.getFirst())) {
							if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_0B(a) == null) {
								if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_1B(a) == null) {
									if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_2BBB(a, w,
											c) == null) {
										if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_3B(a) == null) {
											if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_4BB(b,
													a) == null) {
												if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_5BB(b,
														a) == null) {
													if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_6BBB(
															b, w, c) == null) {
														if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_7B(
																b) == null) {
															if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_8BB(
																	c, a) == null) {
																if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_9BB(
																		c, a) == null) {
																	if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_10BB(
																			c, w) == null) {
																		if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_11BB(
																				c, w) == null) {
																			if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_12B(
																					c) == null) {
																				if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_13BB(
																						w, a) == null) {
																					if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_14BB(
																							c, a) == null) {
																						if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_15BB(
																								a, b) == null) {
																							if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_16BB(
																									a, b) == null) {
																								if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_17BB(
																										w, b) == null) {
																									if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_18BB(
																											a,
																											c) == null) {
																										if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_19BB(
																												a,
																												c) == null) {
																											if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_20BB(
																													w,
																													c) == null) {
																												if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_21BB(
																														w,
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
		return null;
	}

	public static final boolean pattern_whiledul2branchbub_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whiledul2branchbub_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_0B(Command y) {
		for (Graph __DEC_y_root_172475 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_1BBBB(Command y, Branch i,
			Branch z, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_positive_187008 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!i.equals(__DEC_y_positive_187008)) {
							if (!z.equals(__DEC_y_positive_187008)) {
								if (!x.equals(__DEC_y_positive_187008)) {
									return new Object[] { y, i, z, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_2BBBB(Command y, Branch i,
			Branch z, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_negative_464336 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!i.equals(__DEC_y_negative_464336)) {
							if (!z.equals(__DEC_y_negative_464336)) {
								if (!x.equals(__DEC_y_negative_464336)) {
									return new Object[] { y, i, z, x };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_3B(Branch z) {
		for (Graph __DEC_z_root_596958 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_4BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_positive_765835 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_765835)) {
							if (!i.equals(__DEC_z_positive_765835)) {
								if (!x.equals(__DEC_z_positive_765835)) {
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

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_5BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_negative_571672 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_571672)) {
							if (!i.equals(__DEC_z_negative_571672)) {
								if (!x.equals(__DEC_z_negative_571672)) {
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

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_573853 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_7BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_positive_310953 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_310953)) {
							if (!i.equals(__DEC_x_positive_310953)) {
								if (!z.equals(__DEC_x_positive_310953)) {
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

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_8BBB(Branch x, Branch i,
			Branch z) {
		if (!x.equals(z)) {
			if (!i.equals(x)) {
				if (!i.equals(z)) {
					for (Branch __DEC_x_negative_382067 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_382067)) {
							if (!i.equals(__DEC_x_negative_382067)) {
								if (!z.equals(__DEC_x_negative_382067)) {
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

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_9BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_10BB(Branch x, Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_11BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_12BB(Branch z, Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_13BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_14BB(Branch i, Branch z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_15BB(Branch z, Branch x) {
		if (x.equals(z.getPositive())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_16BB(Branch i, Branch x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_17BB(Branch z, Branch x) {
		if (x.equals(z.getNegative())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_blackBBBB(Command y, Branch i,
			Branch z, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					if (z.equals(i.getNegative())) {
						if (x.equals(i.getPositive())) {
							if (z.equals(y.getNext())) {
								if (y.equals(z.getPositive())) {
									if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_0B(y) == null) {
										if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_1BBBB(y, i, z,
												x) == null) {
											if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_2BBBB(y, i, z,
													x) == null) {
												if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_3B(
														z) == null) {
													if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_4BBB(
															z, i, x) == null) {
														if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_5BBB(
																z, i, x) == null) {
															if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_6B(
																	x) == null) {
																if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_7BBB(
																		x, i, z) == null) {
																	if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_8BBB(
																			x, i, z) == null) {
																		if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_9BB(
																				i, y) == null) {
																			if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_10BB(
																					x, y) == null) {
																				if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_11BB(
																						i, y) == null) {
																					if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_12BB(
																							z, y) == null) {
																						if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_13BB(
																								x, y) == null) {
																							if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_14BB(
																									i, z) == null) {
																								if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_15BB(
																										z, x) == null) {
																									if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_16BB(
																											i,
																											x) == null) {
																										if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_17BB(
																												z,
																												x) == null) {
																											return new Object[] {
																													y,
																													i,
																													z,
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
		return null;
	}

	public static final boolean pattern_whiledul2branchbub_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whiledul2branchbub_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whiledul2branchbub_29_1_createresult_blackB(whiledul2branchbub _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whiledul2branchbub_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_whiledul2branchbub_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiledul2branchbub_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_whiledul2branchbub_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									w2i) == null) {
								if (pattern_whiledul2branchbub_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										w) == null) {
									if (pattern_whiledul2branchbub_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_whiledul2branchbub_29_3_solveCSP_bindingFBBBBBB(whiledul2branchbub _this,
			IsApplicableMatch isApplicableMatch, While w, Branch i, S2B w2i, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, w, i, w2i, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, i, w2i, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledul2branchbub_29_3_solveCSP_bindingAndBlackFBBBBBB(
			whiledul2branchbub _this, IsApplicableMatch isApplicableMatch, While w, Branch i, S2B w2i,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whiledul2branchbub_29_3_solveCSP_binding = pattern_whiledul2branchbub_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, w, i, w2i, ruleResult);
		if (result_pattern_whiledul2branchbub_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledul2branchbub_29_3_solveCSP_binding[0];

			Object[] result_pattern_whiledul2branchbub_29_3_solveCSP_black = pattern_whiledul2branchbub_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whiledul2branchbub_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, i, w2i, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whiledul2branchbub_29_4_checkCSP_expressionFBB(whiledul2branchbub _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whiledul2branchbub_29_5_checknacs_blackBBB(While w, Branch i, S2B w2i) {
		return new Object[] { w, i, w2i };
	}

	public static final Object[] pattern_whiledul2branchbub_29_6_perform_blackBBBB(While w, Branch i, S2B w2i,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { w, i, w2i, ruleResult };
	}

	public static final Object[] pattern_whiledul2branchbub_29_6_perform_greenBFFFBFFFFFFB(While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		w.setFirst(a);
		ruleResult.getSourceObjects().add(a);
		ruleResult.getSourceObjects().add(b);
		ruleResult.getTargetObjects().add(y);
		b2y.setTarget(y);
		b2y.setSource(b);
		ruleResult.getCorrObjects().add(b2y);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		w.setNext(c);
		c.setLast(b);
		c.setFirst(b);
		ruleResult.getSourceObjects().add(c);
		i.setNegative(z);
		y.setNext(z);
		z.setPositive(y);
		ruleResult.getTargetObjects().add(z);
		i.setPositive(x);
		a2x.setTarget(x);
		ruleResult.getTargetObjects().add(x);
		c2z.setTarget(z);
		c2z.setSource(c);
		ruleResult.getCorrObjects().add(c2z);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { w, a, b, y, i, b2y, a2x, c, z, x, c2z, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whiledul2branchbub_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whiledul2branchbubImpl
