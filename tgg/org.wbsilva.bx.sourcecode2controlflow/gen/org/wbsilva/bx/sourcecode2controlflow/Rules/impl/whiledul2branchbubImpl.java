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
	public boolean isAppropriate_FWD(Match match, While w, While c, Decision a, Assignment b) {

		Object[] result1_black = whiledul2branchbubImpl.pattern_whiledul2branchbub_0_1_initialbindings_blackBBBBBB(this,
				match, w, c, a, b);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[a] = " + a + ", "
					+ "[b] = " + b + ".");
		}

		Object[] result2_bindingAndBlack = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, w, c, a, b);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[a] = " + a + ", "
					+ "[b] = " + b + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whiledul2branchbubImpl.pattern_whiledul2branchbub_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whiledul2branchbubImpl
					.pattern_whiledul2branchbub_0_4_collectelementstobetranslated_blackBBBBB(match, w, c, a, b);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[w] = " + w + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[b] = " + b + ".");
			}
			whiledul2branchbubImpl.pattern_whiledul2branchbub_0_4_collectelementstobetranslated_greenBBBBBFFFF(match, w,
					c, a, b);
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge c__b____first = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge c__b____last = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[8];

			Object[] result5_black = whiledul2branchbubImpl
					.pattern_whiledul2branchbub_0_5_collectcontextelements_blackBBBBB(match, w, c, a, b);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[w] = " + w + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[b] = " + b + ".");
			}
			whiledul2branchbubImpl.pattern_whiledul2branchbub_0_5_collectcontextelements_greenBB(match, w);

			// 
			whiledul2branchbubImpl.pattern_whiledul2branchbub_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					w, c, a, b);
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
		Branch i = (Branch) result1_bindingAndBlack[0];
		While w = (While) result1_bindingAndBlack[1];
		S2B w2i = (S2B) result1_bindingAndBlack[2];
		While c = (While) result1_bindingAndBlack[3];
		Decision a = (Decision) result1_bindingAndBlack[4];
		Assignment b = (Assignment) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_1_1_performtransformation_greenBFFFFFFBBB(i, c, a, b);
		Branch z = (Branch) result1_green[1];
		S2B a2x = (S2B) result1_green[2];
		Command y = (Command) result1_green[3];
		S2B c2z = (S2B) result1_green[4];
		S2N b2y = (S2N) result1_green[5];
		Branch x = (Branch) result1_green[6];

		Object[] result2_black = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_1_2_collecttranslatedelements_blackBBBBBBBBB(z, a2x, y, c2z, b2y, x, c, a,
						b);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[z] = " + z + ", " + "[a2x] = "
					+ a2x + ", " + "[y] = " + y + ", " + "[c2z] = " + c2z + ", " + "[b2y] = " + b2y + ", " + "[x] = "
					+ x + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[b] = " + b + ".");
		}
		Object[] result2_green = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_1_2_collecttranslatedelements_greenFBBBBBBBBB(z, a2x, y, c2z, b2y, x, c, a,
						b);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, i, w, z, a2x, y, c2z,
						b2y, x, w2i, c, a, b);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[i] = " + i + ", " + "[w] = " + w + ", " + "[z] = " + z + ", " + "[a2x] = " + a2x + ", "
					+ "[y] = " + y + ", " + "[c2z] = " + c2z + ", " + "[b2y] = " + b2y + ", " + "[x] = " + x + ", "
					+ "[w2i] = " + w2i + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[b] = " + b + ".");
		}
		whiledul2branchbubImpl.pattern_whiledul2branchbub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, i, w, z, a2x, y, c2z, b2y, x, c, a, b);
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge z__y____positive = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c__b____first = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge y__z____next = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge c__b____last = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[25];

		// 
		// 
		whiledul2branchbubImpl.pattern_whiledul2branchbub_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
				i, w, z, a2x, y, c2z, b2y, x, w2i, c, a, b);
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
		While c = (While) result2_binding[1];
		Decision a = (Decision) result2_binding[2];
		Assignment b = (Assignment) result2_binding[3];
		for (Object[] result2_black : whiledul2branchbubImpl.pattern_whiledul2branchbub_2_2_corematch_blackFBFBBBB(w, c,
				a, b, match)) {
			Branch i = (Branch) result2_black[0];
			S2B w2i = (S2B) result2_black[2];
			// ForEach 
			for (Object[] result3_black : whiledul2branchbubImpl
					.pattern_whiledul2branchbub_2_3_findcontext_blackBBBBBB(i, w, w2i, c, a, b)) {
				Object[] result3_green = whiledul2branchbubImpl
						.pattern_whiledul2branchbub_2_3_findcontext_greenBBBBBBFFFFFFF(i, w, w2i, c, a, b);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge c__b____first = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge c__b____last = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = whiledul2branchbubImpl
						.pattern_whiledul2branchbub_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, i, w,
								w2i, c, a, b);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[i] = " + i + ", " + "[w] = " + w
							+ ", " + "[w2i] = " + w2i + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[b] = " + b
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
	public void registerObjectsToMatch_FWD(Match match, While w, While c, Decision a, Assignment b) {
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
	public CSP isAppropriate_solveCsp_FWD(Match match, While w, While c, Decision a, Assignment b) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Branch i, While w, S2B w2i, While c,
			Decision a, Assignment b) {// Create CSP
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
		isApplicableMatch.registerObject("c", c);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject i, EObject w, EObject z, EObject a2x,
			EObject y, EObject c2z, EObject b2y, EObject x, EObject w2i, EObject c, EObject a, EObject b) {
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("b", b);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.Decision.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass())
						.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch i, Branch z, Command y, Branch x) {

		Object[] result1_black = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_10_1_initialbindings_blackBBBBBB(this, match, i, z, y, x);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[i] = " + i + ", " + "[z] = " + z + ", " + "[y] = " + y + ", "
					+ "[x] = " + x + ".");
		}

		Object[] result2_bindingAndBlack = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, i, z, y, x);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[i] = " + i + ", " + "[z] = " + z + ", " + "[y] = " + y + ", "
					+ "[x] = " + x + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whiledul2branchbubImpl.pattern_whiledul2branchbub_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whiledul2branchbubImpl
					.pattern_whiledul2branchbub_10_4_collectelementstobetranslated_blackBBBBB(match, i, z, y, x);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[i] = " + i + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[x] = " + x + ".");
			}
			whiledul2branchbubImpl.pattern_whiledul2branchbub_10_4_collectelementstobetranslated_greenBBBBBFFFF(match,
					i, z, y, x);
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge z__y____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge y__z____next = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[8];

			Object[] result5_black = whiledul2branchbubImpl
					.pattern_whiledul2branchbub_10_5_collectcontextelements_blackBBBBB(match, i, z, y, x);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[i] = " + i + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[x] = " + x + ".");
			}
			whiledul2branchbubImpl.pattern_whiledul2branchbub_10_5_collectcontextelements_greenBB(match, i);

			// 
			whiledul2branchbubImpl.pattern_whiledul2branchbub_10_6_registerobjectstomatch_expressionBBBBBB(this, match,
					i, z, y, x);
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
		Branch i = (Branch) result1_bindingAndBlack[0];
		While w = (While) result1_bindingAndBlack[1];
		Branch z = (Branch) result1_bindingAndBlack[2];
		Command y = (Command) result1_bindingAndBlack[3];
		Branch x = (Branch) result1_bindingAndBlack[4];
		S2B w2i = (S2B) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_11_1_performtransformation_greenBBFBFFBFFF(w, z, y, x);
		S2B a2x = (S2B) result1_green[2];
		S2B c2z = (S2B) result1_green[4];
		S2N b2y = (S2N) result1_green[5];
		While c = (While) result1_green[7];
		Decision a = (Decision) result1_green[8];
		Assignment b = (Assignment) result1_green[9];

		Object[] result2_black = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_11_2_collecttranslatedelements_blackBBBBBBBBB(z, a2x, y, c2z, b2y, x, c, a,
						b);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[z] = " + z + ", " + "[a2x] = "
					+ a2x + ", " + "[y] = " + y + ", " + "[c2z] = " + c2z + ", " + "[b2y] = " + b2y + ", " + "[x] = "
					+ x + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[b] = " + b + ".");
		}
		Object[] result2_green = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_11_2_collecttranslatedelements_greenFBBBBBBBBB(z, a2x, y, c2z, b2y, x, c, a,
						b);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, i, w, z, a2x, y,
						c2z, b2y, x, w2i, c, a, b);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[i] = " + i + ", " + "[w] = " + w + ", " + "[z] = " + z + ", " + "[a2x] = " + a2x + ", "
					+ "[y] = " + y + ", " + "[c2z] = " + c2z + ", " + "[b2y] = " + b2y + ", " + "[x] = " + x + ", "
					+ "[w2i] = " + w2i + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[b] = " + b + ".");
		}
		whiledul2branchbubImpl.pattern_whiledul2branchbub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, i, w, z, a2x, y, c2z, b2y, x, c, a, b);
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge z__y____positive = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge c__b____first = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge y__z____next = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge c__b____last = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[25];

		// 
		// 
		whiledul2branchbubImpl.pattern_whiledul2branchbub_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this,
				ruleresult, i, w, z, a2x, y, c2z, b2y, x, w2i, c, a, b);
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
		Branch i = (Branch) result2_binding[0];
		Branch z = (Branch) result2_binding[1];
		Command y = (Command) result2_binding[2];
		Branch x = (Branch) result2_binding[3];
		for (Object[] result2_black : whiledul2branchbubImpl.pattern_whiledul2branchbub_12_2_corematch_blackBFBBBFB(i,
				z, y, x, match)) {
			While w = (While) result2_black[1];
			S2B w2i = (S2B) result2_black[5];
			// ForEach 
			for (Object[] result3_black : whiledul2branchbubImpl
					.pattern_whiledul2branchbub_12_3_findcontext_blackBBBBBB(i, w, z, y, x, w2i)) {
				Object[] result3_green = whiledul2branchbubImpl
						.pattern_whiledul2branchbub_12_3_findcontext_greenBBBBBBFFFFFFF(i, w, z, y, x, w2i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge z__y____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge y__z____next = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = whiledul2branchbubImpl
						.pattern_whiledul2branchbub_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, i,
								w, z, y, x, w2i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[i] = " + i + ", " + "[w] = " + w
							+ ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[w2i] = " + w2i
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
	public void registerObjectsToMatch_BWD(Match match, Branch i, Branch z, Command y, Branch x) {
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
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch i, Branch z, Command y, Branch x) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch i, While w, Branch z, Command y,
			Branch x, S2B w2i) {// Create CSP
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
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("w2i", w2i);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject i, EObject w, EObject z, EObject a2x,
			EObject y, EObject c2z, EObject b2y, EObject x, EObject w2i, EObject c, EObject a, EObject b) {
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("b", b);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_80(EMoflonEdge _edge_negative) {

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
			Branch i = (Branch) result2_black[0];
			Branch z = (Branch) result2_black[1];
			Command y = (Command) result2_black[2];
			Branch x = (Branch) result2_black[3];
			Object[] result2_green = whiledul2branchbubImpl
					.pattern_whiledul2branchbub_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whiledul2branchbubImpl
					.pattern_whiledul2branchbub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, i, z, y, x)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_86(EMoflonEdge _edge_next) {

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
			While c = (While) result2_black[1];
			Decision a = (Decision) result2_black[2];
			Assignment b = (Assignment) result2_black[3];
			Object[] result2_green = whiledul2branchbubImpl
					.pattern_whiledul2branchbub_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whiledul2branchbubImpl
					.pattern_whiledul2branchbub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, w, c, a, b)) {
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
		Branch i = (Branch) result2_bindingAndBlack[0];
		While w = (While) result2_bindingAndBlack[1];
		Branch z = (Branch) result2_bindingAndBlack[2];
		Command y = (Command) result2_bindingAndBlack[3];
		Branch x = (Branch) result2_bindingAndBlack[4];
		While c = (While) result2_bindingAndBlack[5];
		Decision a = (Decision) result2_bindingAndBlack[6];
		Assignment b = (Assignment) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = whiledul2branchbubImpl
				.pattern_whiledul2branchbub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, i, w, z, y, x, c, a, b,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[i] = " + i + ", " + "[w] = " + w + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[x] = "
					+ x + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whiledul2branchbubImpl.pattern_whiledul2branchbub_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whiledul2branchbubImpl
					.pattern_whiledul2branchbub_24_5_matchcorrcontext_blackBBFBB(i, w, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[2];
				Object[] result5_green = whiledul2branchbubImpl
						.pattern_whiledul2branchbub_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whiledul2branchbubImpl
						.pattern_whiledul2branchbub_24_6_createcorrespondence_blackBBBBBBBBB(i, w, z, y, x, c, a, b,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[i] = " + i + ", "
							+ "[w] = " + w + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[x] = " + x + ", "
							+ "[c] = " + c + ", " + "[a] = " + a + ", " + "[b] = " + b + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				whiledul2branchbubImpl.pattern_whiledul2branchbub_24_6_createcorrespondence_greenBFBFFBBBBB(z, y, x, c,
						a, b, ccMatch);
				//nothing S2B a2x = (S2B) result6_green[1];
				//nothing S2B c2z = (S2B) result6_green[3];
				//nothing S2N b2y = (S2N) result6_green[4];

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
	public CSP isApplicable_solveCsp_CC(Branch i, While w, Branch z, Command y, Branch x, While c, Decision a,
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
	public boolean checkDEC_FWD(While w, While c, Decision a, Assignment b) {// 
		Object[] result1_black = whiledul2branchbubImpl.pattern_whiledul2branchbub_27_1_matchtggpattern_blackBBBB(w, c,
				a, b);
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
	public boolean checkDEC_BWD(Branch i, Branch z, Command y, Branch x) {// 
		Object[] result1_black = whiledul2branchbubImpl.pattern_whiledul2branchbub_28_1_matchtggpattern_blackBBBB(i, z,
				y, x);
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
			Branch i = (Branch) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			While w = (While) result2_black[3];

			Object[] result3_bindingAndBlack = whiledul2branchbubImpl
					.pattern_whiledul2branchbub_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, i, w, w2i,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[i] = " + i + ", " + "[w] = " + w
						+ ", " + "[w2i] = " + w2i + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whiledul2branchbubImpl.pattern_whiledul2branchbub_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whiledul2branchbubImpl.pattern_whiledul2branchbub_29_5_checknacs_blackBBB(i, w,
						w2i);
				if (result5_black != null) {

					Object[] result6_black = whiledul2branchbubImpl.pattern_whiledul2branchbub_29_6_perform_blackBBBB(i,
							w, w2i, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[i] = " + i + ", "
								+ "[w] = " + w + ", " + "[w2i] = " + w2i + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whiledul2branchbubImpl.pattern_whiledul2branchbub_29_6_perform_greenBBFFFFFFFFFB(i, w, ruleResult);
					//nothing Branch z = (Branch) result6_green[2];
					//nothing S2B a2x = (S2B) result6_green[3];
					//nothing Command y = (Command) result6_green[4];
					//nothing S2B c2z = (S2B) result6_green[5];
					//nothing S2N b2y = (S2N) result6_green[6];
					//nothing Branch x = (Branch) result6_green[7];
					//nothing While c = (While) result6_green[8];
					//nothing Decision a = (Decision) result6_green[9];
					//nothing Assignment b = (Assignment) result6_green[10];

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
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPROPRIATE_FWD__MATCH_WHILE_WHILE_DECISION_ASSIGNMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Decision) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.WHILEDUL2BRANCHBUB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_WHILE_WHILE_DECISION_ASSIGNMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Decision) arguments.get(3), (Assignment) arguments.get(4));
			return null;
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_WHILE_WHILE_DECISION_ASSIGNMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (While) arguments.get(1),
					(While) arguments.get(2), (Decision) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BRANCH_WHILE_S2B_WHILE_DECISION_ASSIGNMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(While) arguments.get(2), (S2B) arguments.get(3), (While) arguments.get(4),
					(Decision) arguments.get(5), (Assignment) arguments.get(6));
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
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPROPRIATE_BWD__MATCH_BRANCH_BRANCH_COMMAND_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.WHILEDUL2BRANCHBUB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_BRANCH_COMMAND_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
			return null;
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_BRANCH_COMMAND_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_WHILE_BRANCH_COMMAND_BRANCH_S2B:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(While) arguments.get(2), (Branch) arguments.get(3), (Command) arguments.get(4),
					(Branch) arguments.get(5), (S2B) arguments.get(6));
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
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_80__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_80((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_86__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_86((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPLICABLE_SOLVE_CSP_CC__BRANCH_WHILE_BRANCH_COMMAND_BRANCH_WHILE_DECISION_ASSIGNMENT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Branch) arguments.get(0), (While) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Branch) arguments.get(4),
					(While) arguments.get(5), (Decision) arguments.get(6), (Assignment) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.WHILEDUL2BRANCHBUB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEDUL2BRANCHBUB___CHECK_DEC_FWD__WHILE_WHILE_DECISION_ASSIGNMENT:
			return checkDEC_FWD((While) arguments.get(0), (While) arguments.get(1), (Decision) arguments.get(2),
					(Assignment) arguments.get(3));
		case RulesPackage.WHILEDUL2BRANCHBUB___CHECK_DEC_BWD__BRANCH_BRANCH_COMMAND_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.WHILEDUL2BRANCHBUB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILEDUL2BRANCHBUB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_WHILE_S2B_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(While) arguments.get(2), (S2B) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILEDUL2BRANCHBUB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whiledul2branchbub_0_1_initialbindings_blackBBBBBB(whiledul2branchbub _this,
			Match match, While w, While c, Decision a, Assignment b) {
		if (!c.equals(w)) {
			return new Object[] { _this, match, w, c, a, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_0_2_SolveCSP_bindingFBBBBBB(whiledul2branchbub _this,
			Match match, While w, While c, Decision a, Assignment b) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, w, c, a, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, w, c, a, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledul2branchbub_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			whiledul2branchbub _this, Match match, While w, While c, Decision a, Assignment b) {
		Object[] result_pattern_whiledul2branchbub_0_2_SolveCSP_binding = pattern_whiledul2branchbub_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, w, c, a, b);
		if (result_pattern_whiledul2branchbub_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledul2branchbub_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whiledul2branchbub_0_2_SolveCSP_black = pattern_whiledul2branchbub_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whiledul2branchbub_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, w, c, a, b };
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
			While w, While c, Decision a, Assignment b) {
		if (!c.equals(w)) {
			return new Object[] { match, w, c, a, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_0_4_collectelementstobetranslated_greenBBBBBFFFF(
			Match match, While w, While c, Decision a, Assignment b) {
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(c);
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(b);
		String w__c____next_name_prime = "next";
		String c__b____first_name_prime = "first";
		String c__b____last_name_prime = "last";
		String w__a____first_name_prime = "first";
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		c__b____first.setSrc(c);
		c__b____first.setTrg(b);
		match.getToBeTranslatedEdges().add(c__b____first);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(c__b____last);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		w__c____next.setName(w__c____next_name_prime);
		c__b____first.setName(c__b____first_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		return new Object[] { match, w, c, a, b, w__c____next, c__b____first, c__b____last, w__a____first };
	}

	public static final Object[] pattern_whiledul2branchbub_0_5_collectcontextelements_blackBBBBB(Match match, While w,
			While c, Decision a, Assignment b) {
		if (!c.equals(w)) {
			return new Object[] { match, w, c, a, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whiledul2branchbub_0_6_registerobjectstomatch_expressionBBBBBB(
			whiledul2branchbub _this, Match match, While w, While c, Decision a, Assignment b) {
		_this.registerObjectsToMatch_FWD(match, w, c, a, b);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("i");
		EObject _localVariable_1 = isApplicableMatch.getObject("w");
		EObject _localVariable_2 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_3 = isApplicableMatch.getObject("c");
		EObject _localVariable_4 = isApplicableMatch.getObject("a");
		EObject _localVariable_5 = isApplicableMatch.getObject("b");
		EObject tmpI = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpW2i = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpB = _localVariable_5;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpW2i instanceof S2B) {
					S2B w2i = (S2B) tmpW2i;
					if (tmpC instanceof While) {
						While c = (While) tmpC;
						if (tmpA instanceof Decision) {
							Decision a = (Decision) tmpA;
							if (tmpB instanceof Assignment) {
								Assignment b = (Assignment) tmpB;
								return new Object[] { i, w, w2i, c, a, b, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_1_1_performtransformation_blackBBBBBBFBB(Branch i, While w,
			S2B w2i, While c, Decision a, Assignment b, whiledul2branchbub _this, IsApplicableMatch isApplicableMatch) {
		if (!c.equals(w)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { i, w, w2i, c, a, b, csp, _this, isApplicableMatch };
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
			Branch i = (Branch) result_pattern_whiledul2branchbub_1_1_performtransformation_binding[0];
			While w = (While) result_pattern_whiledul2branchbub_1_1_performtransformation_binding[1];
			S2B w2i = (S2B) result_pattern_whiledul2branchbub_1_1_performtransformation_binding[2];
			While c = (While) result_pattern_whiledul2branchbub_1_1_performtransformation_binding[3];
			Decision a = (Decision) result_pattern_whiledul2branchbub_1_1_performtransformation_binding[4];
			Assignment b = (Assignment) result_pattern_whiledul2branchbub_1_1_performtransformation_binding[5];

			Object[] result_pattern_whiledul2branchbub_1_1_performtransformation_black = pattern_whiledul2branchbub_1_1_performtransformation_blackBBBBBBFBB(
					i, w, w2i, c, a, b, _this, isApplicableMatch);
			if (result_pattern_whiledul2branchbub_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whiledul2branchbub_1_1_performtransformation_black[6];

				return new Object[] { i, w, w2i, c, a, b, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_1_1_performtransformation_greenBFFFFFFBBB(Branch i, While c,
			Decision a, Assignment b) {
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		i.setNegative(z);
		a2x.setSource(a);
		z.setPositive(y);
		y.setNext(z);
		c2z.setTarget(z);
		c2z.setSource(c);
		b2y.setTarget(y);
		b2y.setSource(b);
		a2x.setTarget(x);
		i.setPositive(x);
		return new Object[] { i, z, a2x, y, c2z, b2y, x, c, a, b };
	}

	public static final Object[] pattern_whiledul2branchbub_1_2_collecttranslatedelements_blackBBBBBBBBB(Branch z,
			S2B a2x, Command y, S2B c2z, S2N b2y, Branch x, While c, Decision a, Assignment b) {
		if (!a2x.equals(c2z)) {
			if (!x.equals(z)) {
				return new Object[] { z, a2x, y, c2z, b2y, x, c, a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_1_2_collecttranslatedelements_greenFBBBBBBBBB(Branch z,
			S2B a2x, Command y, S2B c2z, S2N b2y, Branch x, While c, Decision a, Assignment b) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getTranslatedElements().add(b);
		return new Object[] { ruleresult, z, a2x, y, c2z, b2y, x, c, a, b };
	}

	public static final Object[] pattern_whiledul2branchbub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject i, EObject w, EObject z, EObject a2x, EObject y, EObject c2z,
			EObject b2y, EObject x, EObject w2i, EObject c, EObject a, EObject b) {
		if (!i.equals(w)) {
			if (!i.equals(z)) {
				if (!i.equals(y)) {
					if (!i.equals(x)) {
						if (!i.equals(w2i)) {
							if (!w.equals(z)) {
								if (!w.equals(y)) {
									if (!w.equals(x)) {
										if (!w.equals(w2i)) {
											if (!a2x.equals(i)) {
												if (!a2x.equals(w)) {
													if (!a2x.equals(z)) {
														if (!a2x.equals(y)) {
															if (!a2x.equals(c2z)) {
																if (!a2x.equals(b2y)) {
																	if (!a2x.equals(x)) {
																		if (!a2x.equals(w2i)) {
																			if (!a2x.equals(c)) {
																				if (!a2x.equals(b)) {
																					if (!y.equals(z)) {
																						if (!c2z.equals(i)) {
																							if (!c2z.equals(w)) {
																								if (!c2z.equals(z)) {
																									if (!c2z.equals(
																											y)) {
																										if (!c2z.equals(
																												x)) {
																											if (!c2z.equals(
																													w2i)) {
																												if (!b2y.equals(
																														i)) {
																													if (!b2y.equals(
																															w)) {
																														if (!b2y.equals(
																																z)) {
																															if (!b2y.equals(
																																	y)) {
																																if (!b2y.equals(
																																		c2z)) {
																																	if (!b2y.equals(
																																			x)) {
																																		if (!b2y.equals(
																																				w2i)) {
																																			if (!b2y.equals(
																																					c)) {
																																				if (!x.equals(
																																						z)) {
																																					if (!x.equals(
																																							y)) {
																																						if (!w2i.equals(
																																								z)) {
																																							if (!w2i.equals(
																																									y)) {
																																								if (!w2i.equals(
																																										x)) {
																																									if (!c.equals(
																																											i)) {
																																										if (!c.equals(
																																												w)) {
																																											if (!c.equals(
																																													z)) {
																																												if (!c.equals(
																																														y)) {
																																													if (!c.equals(
																																															c2z)) {
																																														if (!c.equals(
																																																x)) {
																																															if (!c.equals(
																																																	w2i)) {
																																																if (!a.equals(
																																																		i)) {
																																																	if (!a.equals(
																																																			w)) {
																																																		if (!a.equals(
																																																				z)) {
																																																			if (!a.equals(
																																																					a2x)) {
																																																				if (!a.equals(
																																																						y)) {
																																																					if (!a.equals(
																																																							c2z)) {
																																																						if (!a.equals(
																																																								b2y)) {
																																																							if (!a.equals(
																																																									x)) {
																																																								if (!a.equals(
																																																										w2i)) {
																																																									if (!a.equals(
																																																											c)) {
																																																										if (!a.equals(
																																																												b)) {
																																																											if (!b.equals(
																																																													i)) {
																																																												if (!b.equals(
																																																														w)) {
																																																													if (!b.equals(
																																																															z)) {
																																																														if (!b.equals(
																																																																y)) {
																																																															if (!b.equals(
																																																																	c2z)) {
																																																																if (!b.equals(
																																																																		b2y)) {
																																																																	if (!b.equals(
																																																																			x)) {
																																																																		if (!b.equals(
																																																																				w2i)) {
																																																																			if (!b.equals(
																																																																					c)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						i,
																																																																						w,
																																																																						z,
																																																																						a2x,
																																																																						y,
																																																																						c2z,
																																																																						b2y,
																																																																						x,
																																																																						w2i,
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
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject i, EObject w, EObject z, EObject a2x, EObject y, EObject c2z,
			EObject b2y, EObject x, EObject c, EObject a, EObject b) {
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whiledul2branchbub";
		String i__z____negative_name_prime = "negative";
		String c2z__z____target_name_prime = "target";
		String w__c____next_name_prime = "next";
		String a2x__x____target_name_prime = "target";
		String z__y____positive_name_prime = "positive";
		String c2z__c____source_name_prime = "source";
		String c__b____first_name_prime = "first";
		String y__z____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		String c__b____last_name_prime = "last";
		String w__a____first_name_prime = "first";
		String i__x____positive_name_prime = "positive";
		String a2x__a____source_name_prime = "source";
		String b2y__b____source_name_prime = "source";
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		z__y____positive.setSrc(z);
		z__y____positive.setTrg(y);
		ruleresult.getCreatedEdges().add(z__y____positive);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c__b____first.setSrc(c);
		c__b____first.setTrg(b);
		ruleresult.getTranslatedEdges().add(c__b____first);
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		ruleresult.getCreatedEdges().add(y__z____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(c__b____last);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		z__y____positive.setName(z__y____positive_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c__b____first.setName(c__b____first_name_prime);
		y__z____next.setName(y__z____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		return new Object[] { ruleresult, i, w, z, a2x, y, c2z, b2y, x, c, a, b, i__z____negative, c2z__z____target,
				w__c____next, a2x__x____target, z__y____positive, c2z__c____source, c__b____first, y__z____next,
				b2y__y____target, c__b____last, w__a____first, i__x____positive, a2x__a____source, b2y__b____source };
	}

	public static final void pattern_whiledul2branchbub_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whiledul2branchbub _this, PerformRuleResult ruleresult, EObject i, EObject w, EObject z, EObject a2x,
			EObject y, EObject c2z, EObject b2y, EObject x, EObject w2i, EObject c, EObject a, EObject b) {
		_this.registerObjects_FWD(ruleresult, i, w, z, a2x, y, c2z, b2y, x, w2i, c, a, b);

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
		EObject _localVariable_1 = match.getObject("c");
		EObject _localVariable_2 = match.getObject("a");
		EObject _localVariable_3 = match.getObject("b");
		EObject tmpW = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpB = _localVariable_3;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpC instanceof While) {
				While c = (While) tmpC;
				if (tmpA instanceof Decision) {
					Decision a = (Decision) tmpA;
					if (tmpB instanceof Assignment) {
						Assignment b = (Assignment) tmpB;
						return new Object[] { w, c, a, b, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whiledul2branchbub_2_2_corematch_blackFBFBBBB(While w, While c,
			Decision a, Assignment b, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(w)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				Branch i = w2i.getTarget();
				if (i != null) {
					_result.add(new Object[] { i, w, w2i, c, a, b, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whiledul2branchbub_2_3_findcontext_blackBBBBBB(Branch i, While w,
			S2B w2i, While c, Decision a, Assignment b) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(w)) {
			if (c.equals(w.getNext())) {
				if (w.equals(w2i.getSource())) {
					if (i.equals(w2i.getTarget())) {
						if (b.equals(c.getFirst())) {
							if (b.equals(c.getLast())) {
								if (a.equals(w.getFirst())) {
									_result.add(new Object[] { i, w, w2i, c, a, b });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whiledul2branchbub_2_3_findcontext_greenBBBBBBFFFFFFF(Branch i, While w,
			S2B w2i, While c, Decision a, Assignment b) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w__c____next_name_prime = "next";
		String w2i__w____source_name_prime = "source";
		String w2i__i____target_name_prime = "target";
		String c__b____first_name_prime = "first";
		String c__b____last_name_prime = "last";
		String w__a____first_name_prime = "first";
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(b);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		c__b____first.setSrc(c);
		c__b____first.setTrg(b);
		isApplicableMatch.getAllContextElements().add(c__b____first);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(c__b____last);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w__c____next.setName(w__c____next_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		c__b____first.setName(c__b____first_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		return new Object[] { i, w, w2i, c, a, b, isApplicableMatch, w__c____next, w2i__w____source, w2i__i____target,
				c__b____first, c__b____last, w__a____first };
	}

	public static final Object[] pattern_whiledul2branchbub_2_4_solveCSP_bindingFBBBBBBBB(whiledul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Branch i, While w, S2B w2i, While c, Decision a, Assignment b) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, i, w, w2i, c, a, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, i, w, w2i, c, a, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledul2branchbub_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			whiledul2branchbub _this, IsApplicableMatch isApplicableMatch, Branch i, While w, S2B w2i, While c,
			Decision a, Assignment b) {
		Object[] result_pattern_whiledul2branchbub_2_4_solveCSP_binding = pattern_whiledul2branchbub_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, i, w, w2i, c, a, b);
		if (result_pattern_whiledul2branchbub_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledul2branchbub_2_4_solveCSP_binding[0];

			Object[] result_pattern_whiledul2branchbub_2_4_solveCSP_black = pattern_whiledul2branchbub_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whiledul2branchbub_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, i, w, w2i, c, a, b };
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
			Match match, Branch i, Branch z, Command y, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					return new Object[] { _this, match, i, z, y, x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_10_2_SolveCSP_bindingFBBBBBB(whiledul2branchbub _this,
			Match match, Branch i, Branch z, Command y, Branch x) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, i, z, y, x);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, i, z, y, x };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledul2branchbub_10_2_SolveCSP_bindingAndBlackFBBBBBB(
			whiledul2branchbub _this, Match match, Branch i, Branch z, Command y, Branch x) {
		Object[] result_pattern_whiledul2branchbub_10_2_SolveCSP_binding = pattern_whiledul2branchbub_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, i, z, y, x);
		if (result_pattern_whiledul2branchbub_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledul2branchbub_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whiledul2branchbub_10_2_SolveCSP_black = pattern_whiledul2branchbub_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whiledul2branchbub_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, i, z, y, x };
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
			Branch i, Branch z, Command y, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					return new Object[] { match, i, z, y, x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_10_4_collectelementstobetranslated_greenBBBBBFFFF(
			Match match, Branch i, Branch z, Command y, Branch x) {
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(x);
		String i__z____negative_name_prime = "negative";
		String z__y____positive_name_prime = "positive";
		String y__z____next_name_prime = "next";
		String i__x____positive_name_prime = "positive";
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		z__y____positive.setSrc(z);
		z__y____positive.setTrg(y);
		match.getToBeTranslatedEdges().add(z__y____positive);
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		match.getToBeTranslatedEdges().add(y__z____next);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		i__z____negative.setName(i__z____negative_name_prime);
		z__y____positive.setName(z__y____positive_name_prime);
		y__z____next.setName(y__z____next_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		return new Object[] { match, i, z, y, x, i__z____negative, z__y____positive, y__z____next, i__x____positive };
	}

	public static final Object[] pattern_whiledul2branchbub_10_5_collectcontextelements_blackBBBBB(Match match,
			Branch i, Branch z, Command y, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					return new Object[] { match, i, z, y, x };
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
			whiledul2branchbub _this, Match match, Branch i, Branch z, Command y, Branch x) {
		_this.registerObjectsToMatch_BWD(match, i, z, y, x);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("i");
		EObject _localVariable_1 = isApplicableMatch.getObject("w");
		EObject _localVariable_2 = isApplicableMatch.getObject("z");
		EObject _localVariable_3 = isApplicableMatch.getObject("y");
		EObject _localVariable_4 = isApplicableMatch.getObject("x");
		EObject _localVariable_5 = isApplicableMatch.getObject("w2i");
		EObject tmpI = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpY = _localVariable_3;
		EObject tmpX = _localVariable_4;
		EObject tmpW2i = _localVariable_5;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpZ instanceof Branch) {
					Branch z = (Branch) tmpZ;
					if (tmpY instanceof Command) {
						Command y = (Command) tmpY;
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							if (tmpW2i instanceof S2B) {
								S2B w2i = (S2B) tmpW2i;
								return new Object[] { i, w, z, y, x, w2i, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_11_1_performtransformation_blackBBBBBBFBB(Branch i, While w,
			Branch z, Command y, Branch x, S2B w2i, whiledul2branchbub _this, IsApplicableMatch isApplicableMatch) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { i, w, z, y, x, w2i, csp, _this, isApplicableMatch };
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
			Branch i = (Branch) result_pattern_whiledul2branchbub_11_1_performtransformation_binding[0];
			While w = (While) result_pattern_whiledul2branchbub_11_1_performtransformation_binding[1];
			Branch z = (Branch) result_pattern_whiledul2branchbub_11_1_performtransformation_binding[2];
			Command y = (Command) result_pattern_whiledul2branchbub_11_1_performtransformation_binding[3];
			Branch x = (Branch) result_pattern_whiledul2branchbub_11_1_performtransformation_binding[4];
			S2B w2i = (S2B) result_pattern_whiledul2branchbub_11_1_performtransformation_binding[5];

			Object[] result_pattern_whiledul2branchbub_11_1_performtransformation_black = pattern_whiledul2branchbub_11_1_performtransformation_blackBBBBBBFBB(
					i, w, z, y, x, w2i, _this, isApplicableMatch);
			if (result_pattern_whiledul2branchbub_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whiledul2branchbub_11_1_performtransformation_black[6];

				return new Object[] { i, w, z, y, x, w2i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_11_1_performtransformation_greenBBFBFFBFFF(While w,
			Branch z, Command y, Branch x) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		a2x.setTarget(x);
		c2z.setTarget(z);
		b2y.setTarget(y);
		w.setNext(c);
		c2z.setSource(c);
		w.setFirst(a);
		a2x.setSource(a);
		c.setFirst(b);
		c.setLast(b);
		b2y.setSource(b);
		return new Object[] { w, z, a2x, y, c2z, b2y, x, c, a, b };
	}

	public static final Object[] pattern_whiledul2branchbub_11_2_collecttranslatedelements_blackBBBBBBBBB(Branch z,
			S2B a2x, Command y, S2B c2z, S2N b2y, Branch x, While c, Decision a, Assignment b) {
		if (!a2x.equals(c2z)) {
			if (!x.equals(z)) {
				return new Object[] { z, a2x, y, c2z, b2y, x, c, a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_11_2_collecttranslatedelements_greenFBBBBBBBBB(Branch z,
			S2B a2x, Command y, S2B c2z, S2N b2y, Branch x, While c, Decision a, Assignment b) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedElements().add(b);
		return new Object[] { ruleresult, z, a2x, y, c2z, b2y, x, c, a, b };
	}

	public static final Object[] pattern_whiledul2branchbub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject i, EObject w, EObject z, EObject a2x, EObject y, EObject c2z,
			EObject b2y, EObject x, EObject w2i, EObject c, EObject a, EObject b) {
		if (!i.equals(w)) {
			if (!i.equals(z)) {
				if (!i.equals(y)) {
					if (!i.equals(x)) {
						if (!i.equals(w2i)) {
							if (!w.equals(z)) {
								if (!w.equals(y)) {
									if (!w.equals(x)) {
										if (!w.equals(w2i)) {
											if (!a2x.equals(i)) {
												if (!a2x.equals(w)) {
													if (!a2x.equals(z)) {
														if (!a2x.equals(y)) {
															if (!a2x.equals(c2z)) {
																if (!a2x.equals(b2y)) {
																	if (!a2x.equals(x)) {
																		if (!a2x.equals(w2i)) {
																			if (!a2x.equals(c)) {
																				if (!a2x.equals(b)) {
																					if (!y.equals(z)) {
																						if (!c2z.equals(i)) {
																							if (!c2z.equals(w)) {
																								if (!c2z.equals(z)) {
																									if (!c2z.equals(
																											y)) {
																										if (!c2z.equals(
																												x)) {
																											if (!c2z.equals(
																													w2i)) {
																												if (!b2y.equals(
																														i)) {
																													if (!b2y.equals(
																															w)) {
																														if (!b2y.equals(
																																z)) {
																															if (!b2y.equals(
																																	y)) {
																																if (!b2y.equals(
																																		c2z)) {
																																	if (!b2y.equals(
																																			x)) {
																																		if (!b2y.equals(
																																				w2i)) {
																																			if (!b2y.equals(
																																					c)) {
																																				if (!x.equals(
																																						z)) {
																																					if (!x.equals(
																																							y)) {
																																						if (!w2i.equals(
																																								z)) {
																																							if (!w2i.equals(
																																									y)) {
																																								if (!w2i.equals(
																																										x)) {
																																									if (!c.equals(
																																											i)) {
																																										if (!c.equals(
																																												w)) {
																																											if (!c.equals(
																																													z)) {
																																												if (!c.equals(
																																														y)) {
																																													if (!c.equals(
																																															c2z)) {
																																														if (!c.equals(
																																																x)) {
																																															if (!c.equals(
																																																	w2i)) {
																																																if (!a.equals(
																																																		i)) {
																																																	if (!a.equals(
																																																			w)) {
																																																		if (!a.equals(
																																																				z)) {
																																																			if (!a.equals(
																																																					a2x)) {
																																																				if (!a.equals(
																																																						y)) {
																																																					if (!a.equals(
																																																							c2z)) {
																																																						if (!a.equals(
																																																								b2y)) {
																																																							if (!a.equals(
																																																									x)) {
																																																								if (!a.equals(
																																																										w2i)) {
																																																									if (!a.equals(
																																																											c)) {
																																																										if (!a.equals(
																																																												b)) {
																																																											if (!b.equals(
																																																													i)) {
																																																												if (!b.equals(
																																																														w)) {
																																																													if (!b.equals(
																																																															z)) {
																																																														if (!b.equals(
																																																																y)) {
																																																															if (!b.equals(
																																																																	c2z)) {
																																																																if (!b.equals(
																																																																		b2y)) {
																																																																	if (!b.equals(
																																																																			x)) {
																																																																		if (!b.equals(
																																																																				w2i)) {
																																																																			if (!b.equals(
																																																																					c)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						i,
																																																																						w,
																																																																						z,
																																																																						a2x,
																																																																						y,
																																																																						c2z,
																																																																						b2y,
																																																																						x,
																																																																						w2i,
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
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject i, EObject w, EObject z, EObject a2x, EObject y, EObject c2z,
			EObject b2y, EObject x, EObject c, EObject a, EObject b) {
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whiledul2branchbub";
		String i__z____negative_name_prime = "negative";
		String c2z__z____target_name_prime = "target";
		String w__c____next_name_prime = "next";
		String a2x__x____target_name_prime = "target";
		String z__y____positive_name_prime = "positive";
		String c2z__c____source_name_prime = "source";
		String c__b____first_name_prime = "first";
		String y__z____next_name_prime = "next";
		String b2y__y____target_name_prime = "target";
		String c__b____last_name_prime = "last";
		String w__a____first_name_prime = "first";
		String i__x____positive_name_prime = "positive";
		String a2x__a____source_name_prime = "source";
		String b2y__b____source_name_prime = "source";
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		z__y____positive.setSrc(z);
		z__y____positive.setTrg(y);
		ruleresult.getTranslatedEdges().add(z__y____positive);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c__b____first.setSrc(c);
		c__b____first.setTrg(b);
		ruleresult.getCreatedEdges().add(c__b____first);
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		ruleresult.getTranslatedEdges().add(y__z____next);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(c__b____last);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		z__y____positive.setName(z__y____positive_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c__b____first.setName(c__b____first_name_prime);
		y__z____next.setName(y__z____next_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		return new Object[] { ruleresult, i, w, z, a2x, y, c2z, b2y, x, c, a, b, i__z____negative, c2z__z____target,
				w__c____next, a2x__x____target, z__y____positive, c2z__c____source, c__b____first, y__z____next,
				b2y__y____target, c__b____last, w__a____first, i__x____positive, a2x__a____source, b2y__b____source };
	}

	public static final void pattern_whiledul2branchbub_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whiledul2branchbub _this, PerformRuleResult ruleresult, EObject i, EObject w, EObject z, EObject a2x,
			EObject y, EObject c2z, EObject b2y, EObject x, EObject w2i, EObject c, EObject a, EObject b) {
		_this.registerObjects_BWD(ruleresult, i, w, z, a2x, y, c2z, b2y, x, w2i, c, a, b);

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
			if (tmpZ instanceof Branch) {
				Branch z = (Branch) tmpZ;
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

	public static final Iterable<Object[]> pattern_whiledul2branchbub_12_2_corematch_blackBFBBBFB(Branch i, Branch z,
			Command y, Branch x, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class,
							"target")) {
						Statement tmpW = w2i.getSource();
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							_result.add(new Object[] { i, w, z, y, x, w2i, match });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whiledul2branchbub_12_3_findcontext_blackBBBBBB(Branch i, While w,
			Branch z, Command y, Branch x, S2B w2i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					if (z.equals(i.getNegative())) {
						if (y.equals(z.getPositive())) {
							if (w.equals(w2i.getSource())) {
								if (i.equals(w2i.getTarget())) {
									if (z.equals(y.getNext())) {
										if (x.equals(i.getPositive())) {
											_result.add(new Object[] { i, w, z, y, x, w2i });
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

	public static final Object[] pattern_whiledul2branchbub_12_3_findcontext_greenBBBBBBFFFFFFF(Branch i, While w,
			Branch z, Command y, Branch x, S2B w2i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String i__z____negative_name_prime = "negative";
		String z__y____positive_name_prime = "positive";
		String w2i__w____source_name_prime = "source";
		String w2i__i____target_name_prime = "target";
		String y__z____next_name_prime = "next";
		String i__x____positive_name_prime = "positive";
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(w2i);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		z__y____positive.setSrc(z);
		z__y____positive.setTrg(y);
		isApplicableMatch.getAllContextElements().add(z__y____positive);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		isApplicableMatch.getAllContextElements().add(y__z____next);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		i__z____negative.setName(i__z____negative_name_prime);
		z__y____positive.setName(z__y____positive_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		y__z____next.setName(y__z____next_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		return new Object[] { i, w, z, y, x, w2i, isApplicableMatch, i__z____negative, z__y____positive,
				w2i__w____source, w2i__i____target, y__z____next, i__x____positive };
	}

	public static final Object[] pattern_whiledul2branchbub_12_4_solveCSP_bindingFBBBBBBBB(whiledul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Branch i, While w, Branch z, Command y, Branch x, S2B w2i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, i, w, z, y, x, w2i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, i, w, z, y, x, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledul2branchbub_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			whiledul2branchbub _this, IsApplicableMatch isApplicableMatch, Branch i, While w, Branch z, Command y,
			Branch x, S2B w2i) {
		Object[] result_pattern_whiledul2branchbub_12_4_solveCSP_binding = pattern_whiledul2branchbub_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, i, w, z, y, x, w2i);
		if (result_pattern_whiledul2branchbub_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledul2branchbub_12_4_solveCSP_binding[0];

			Object[] result_pattern_whiledul2branchbub_12_4_solveCSP_black = pattern_whiledul2branchbub_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whiledul2branchbub_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, i, w, z, y, x, w2i };
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

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_0B(Branch z) {
		for (Graph __DEC_z_root_393713 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_1BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_positive_740659 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_740659)) {
							if (!i.equals(__DEC_z_positive_740659)) {
								if (!x.equals(__DEC_z_positive_740659)) {
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

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_2BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_negative_287261 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_287261)) {
							if (!i.equals(__DEC_z_negative_287261)) {
								if (!x.equals(__DEC_z_negative_287261)) {
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

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_483122 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_4BBBB(Command y,
			Branch i, Branch z, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_positive_994560 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!i.equals(__DEC_y_positive_994560)) {
							if (!z.equals(__DEC_y_positive_994560)) {
								if (!x.equals(__DEC_y_positive_994560)) {
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

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_5BBBB(Command y,
			Branch i, Branch z, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_negative_68139 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!i.equals(__DEC_y_negative_68139)) {
							if (!z.equals(__DEC_y_negative_68139)) {
								if (!x.equals(__DEC_y_negative_68139)) {
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

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_163407 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
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
					for (Branch __DEC_x_positive_365647 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_365647)) {
							if (!i.equals(__DEC_x_positive_365647)) {
								if (!z.equals(__DEC_x_positive_365647)) {
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
					for (Branch __DEC_x_negative_166711 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_166711)) {
							if (!i.equals(__DEC_x_negative_166711)) {
								if (!z.equals(__DEC_x_negative_166711)) {
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
			Branch z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_10BB(Branch i,
			Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_11BB(Branch x,
			Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_12BB(Branch i,
			Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_13BB(Branch z,
			Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_14BB(Branch x,
			Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
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
											if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_0B(
													z) == null) {
												if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_9BB(
														i, z) == null) {
													if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_1BBB(
															z, i, x) == null) {
														if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_2BBB(
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
																					if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_3B(
																							y) == null) {
																						if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_4BBBB(
																								y, i, z, x) == null) {
																							if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_5BBBB(
																									y, i, z,
																									x) == null) {
																								if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_10BB(
																										i, y) == null) {
																									if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_11BB(
																											x,
																											y) == null) {
																										if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_12BB(
																												i,
																												y) == null) {
																											if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_13BB(
																													z,
																													y) == null) {
																												if (pattern_whiledul2branchbub_20_2_testcorematchandDECs_black_nac_14BB(
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
			whiledul2branchbub _this, Match match, Branch i, Branch z, Command y, Branch x) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, i, z, y, x);
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

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_0BB(While c,
			Decision a) {
		for (Decision __DEC_c_positive_789021 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_c_positive_789021)) {
				return new Object[] { c, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_1BB(While c,
			Decision a) {
		for (Decision __DEC_c_negative_250612 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_c_negative_250612)) {
				return new Object[] { c, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_2BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_first_898600 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!c.equals(__DEC_c_first_898600)) {
					if (!w.equals(__DEC_c_first_898600)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_3BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_last_885089 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!c.equals(__DEC_c_last_885089)) {
					if (!w.equals(__DEC_c_last_885089)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_4B(While c) {
		for (Program __DEC_c_first_413687 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_5B(Decision a) {
		for (Decision __DEC_a_positive_952412 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_a_positive_952412)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_6B(Decision a) {
		for (Decision __DEC_a_negative_210511 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_a_negative_210511)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_7BBB(Decision a,
			While w, While c) {
		if (!c.equals(w)) {
			for (While __DEC_a_last_18997 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!w.equals(__DEC_a_last_18997)) {
					if (!c.equals(__DEC_a_last_18997)) {
						return new Object[] { a, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_8B(Decision a) {
		for (Program __DEC_a_first_693663 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_9BB(Assignment b,
			Decision a) {
		for (Decision __DEC_b_positive_933738 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_b_positive_933738)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_10BB(Assignment b,
			Decision a) {
		for (Decision __DEC_b_negative_360399 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_b_negative_360399)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_11BBB(Assignment b,
			While w, While c) {
		if (!c.equals(w)) {
			for (While __DEC_b_last_32672 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!w.equals(__DEC_b_last_32672)) {
					if (!c.equals(__DEC_b_last_32672)) {
						return new Object[] { b, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_12B(Assignment b) {
		for (Program __DEC_b_first_307756 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_13BB(Decision a,
			While c) {
		if (c.equals(a.getPositive())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_14BB(Decision a,
			While c) {
		if (c.equals(a.getNegative())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_15BB(While w, While c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_16BB(While w, While c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_17BB(While w,
			Decision a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_18BB(While c,
			Decision a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_19BB(Decision a,
			Assignment b) {
		if (b.equals(a.getPositive())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_20BB(Decision a,
			Assignment b) {
		if (b.equals(a.getNegative())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_21BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
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
							Statement tmpB = c.getFirst();
							if (tmpB instanceof Assignment) {
								Assignment b = (Assignment) tmpB;
								if (b.equals(c.getLast())) {
									if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_2BB(c,
											w) == null) {
										if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_3BB(c,
												w) == null) {
											if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_4B(
													c) == null) {
												if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_15BB(
														w, c) == null) {
													if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_16BB(
															w, c) == null) {
														if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_0BB(
																c, a) == null) {
															if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_1BB(
																	c, a) == null) {
																if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_5B(
																		a) == null) {
																	if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_6B(
																			a) == null) {
																		if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_7BBB(
																				a, w, c) == null) {
																			if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_8B(
																					a) == null) {
																				if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_13BB(
																						a, c) == null) {
																					if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_14BB(
																							a, c) == null) {
																						if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_17BB(
																								w, a) == null) {
																							if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_18BB(
																									c, a) == null) {
																								if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_9BB(
																										b, a) == null) {
																									if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_10BB(
																											b,
																											a) == null) {
																										if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_11BBB(
																												b, w,
																												c) == null) {
																											if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_12B(
																													b) == null) {
																												if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_19BB(
																														a,
																														b) == null) {
																													if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_20BB(
																															a,
																															b) == null) {
																														if (pattern_whiledul2branchbub_21_2_testcorematchandDECs_black_nac_21BB(
																																w,
																																b) == null) {
																															_result.add(
																																	new Object[] {
																																			w,
																																			c,
																																			a,
																																			b,
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
			whiledul2branchbub _this, Match match, While w, While c, Decision a, Assignment b) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, w, c, a, b);
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

	public static final Object[] pattern_whiledul2branchbub_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("i");
		EObject _localVariable_1 = sourceMatch.getObject("w");
		EObject _localVariable_2 = targetMatch.getObject("z");
		EObject _localVariable_3 = targetMatch.getObject("y");
		EObject _localVariable_4 = targetMatch.getObject("x");
		EObject _localVariable_5 = sourceMatch.getObject("c");
		EObject _localVariable_6 = sourceMatch.getObject("a");
		EObject _localVariable_7 = sourceMatch.getObject("b");
		EObject tmpI = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpY = _localVariable_3;
		EObject tmpX = _localVariable_4;
		EObject tmpC = _localVariable_5;
		EObject tmpA = _localVariable_6;
		EObject tmpB = _localVariable_7;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpZ instanceof Branch) {
					Branch z = (Branch) tmpZ;
					if (tmpY instanceof Command) {
						Command y = (Command) tmpY;
						if (tmpX instanceof Branch) {
							Branch x = (Branch) tmpX;
							if (tmpC instanceof While) {
								While c = (While) tmpC;
								if (tmpA instanceof Decision) {
									Decision a = (Decision) tmpA;
									if (tmpB instanceof Assignment) {
										Assignment b = (Assignment) tmpB;
										return new Object[] { i, w, z, y, x, c, a, b, targetMatch, sourceMatch };
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

	public static final Object[] pattern_whiledul2branchbub_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Branch i, While w,
			Branch z, Command y, Branch x, While c, Decision a, Assignment b, Match sourceMatch, Match targetMatch) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					if (!c.equals(w)) {
						if (!sourceMatch.equals(targetMatch)) {
							return new Object[] { i, w, z, y, x, c, a, b, sourceMatch, targetMatch };
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
				targetMatch, sourceMatch);
		if (result_pattern_whiledul2branchbub_24_2_matchsrctrgcontext_binding != null) {
			Branch i = (Branch) result_pattern_whiledul2branchbub_24_2_matchsrctrgcontext_binding[0];
			While w = (While) result_pattern_whiledul2branchbub_24_2_matchsrctrgcontext_binding[1];
			Branch z = (Branch) result_pattern_whiledul2branchbub_24_2_matchsrctrgcontext_binding[2];
			Command y = (Command) result_pattern_whiledul2branchbub_24_2_matchsrctrgcontext_binding[3];
			Branch x = (Branch) result_pattern_whiledul2branchbub_24_2_matchsrctrgcontext_binding[4];
			While c = (While) result_pattern_whiledul2branchbub_24_2_matchsrctrgcontext_binding[5];
			Decision a = (Decision) result_pattern_whiledul2branchbub_24_2_matchsrctrgcontext_binding[6];
			Assignment b = (Assignment) result_pattern_whiledul2branchbub_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_whiledul2branchbub_24_2_matchsrctrgcontext_black = pattern_whiledul2branchbub_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					i, w, z, y, x, c, a, b, sourceMatch, targetMatch);
			if (result_pattern_whiledul2branchbub_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { i, w, z, y, x, c, a, b, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_24_3_solvecsp_bindingFBBBBBBBBBBB(whiledul2branchbub _this,
			Branch i, While w, Branch z, Command y, Branch x, While c, Decision a, Assignment b, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(i, w, z, y, x, c, a, b, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, i, w, z, y, x, c, a, b, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledul2branchbub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			whiledul2branchbub _this, Branch i, While w, Branch z, Command y, Branch x, While c, Decision a,
			Assignment b, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whiledul2branchbub_24_3_solvecsp_binding = pattern_whiledul2branchbub_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, i, w, z, y, x, c, a, b, sourceMatch, targetMatch);
		if (result_pattern_whiledul2branchbub_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whiledul2branchbub_24_3_solvecsp_binding[0];

			Object[] result_pattern_whiledul2branchbub_24_3_solvecsp_black = pattern_whiledul2branchbub_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whiledul2branchbub_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, i, w, z, y, x, c, a, b, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whiledul2branchbub_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whiledul2branchbub_24_5_matchcorrcontext_blackBBFBB(Branch i,
			While w, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				if (i.equals(w2i.getTarget())) {
					_result.add(new Object[] { i, w, w2i, sourceMatch, targetMatch });
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

	public static final Object[] pattern_whiledul2branchbub_24_6_createcorrespondence_blackBBBBBBBBB(Branch i, While w,
			Branch z, Command y, Branch x, While c, Decision a, Assignment b, CCMatch ccMatch) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					if (!c.equals(w)) {
						return new Object[] { i, w, z, y, x, c, a, b, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_24_6_createcorrespondence_greenBFBFFBBBBB(Branch z,
			Command y, Branch x, While c, Decision a, Assignment b, CCMatch ccMatch) {
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		c2z.setTarget(z);
		c2z.setSource(c);
		ccMatch.getCreateCorr().add(c2z);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		return new Object[] { z, a2x, y, c2z, b2y, x, c, a, b, ccMatch };
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

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_0BB(While c, Decision a) {
		for (Decision __DEC_c_positive_85893 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_c_positive_85893)) {
				return new Object[] { c, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_1BB(While c, Decision a) {
		for (Decision __DEC_c_negative_728694 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_c_negative_728694)) {
				return new Object[] { c, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_2BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_first_650582 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!c.equals(__DEC_c_first_650582)) {
					if (!w.equals(__DEC_c_first_650582)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_3BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_last_189481 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!c.equals(__DEC_c_last_189481)) {
					if (!w.equals(__DEC_c_last_189481)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_4B(While c) {
		for (Program __DEC_c_first_557739 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_5B(Decision a) {
		for (Decision __DEC_a_positive_8900 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_a_positive_8900)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_6B(Decision a) {
		for (Decision __DEC_a_negative_222832 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_a_negative_222832)) {
				return new Object[] { a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_7BBB(Decision a, While w,
			While c) {
		if (!c.equals(w)) {
			for (While __DEC_a_last_419242 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!w.equals(__DEC_a_last_419242)) {
					if (!c.equals(__DEC_a_last_419242)) {
						return new Object[] { a, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_8B(Decision a) {
		for (Program __DEC_a_first_236158 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_9BB(Assignment b,
			Decision a) {
		for (Decision __DEC_b_positive_779342 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!a.equals(__DEC_b_positive_779342)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_10BB(Assignment b,
			Decision a) {
		for (Decision __DEC_b_negative_495502 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			if (!a.equals(__DEC_b_negative_495502)) {
				return new Object[] { b, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_11BBB(Assignment b, While w,
			While c) {
		if (!c.equals(w)) {
			for (While __DEC_b_last_59537 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!w.equals(__DEC_b_last_59537)) {
					if (!c.equals(__DEC_b_last_59537)) {
						return new Object[] { b, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_12B(Assignment b) {
		for (Program __DEC_b_first_967209 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_13BB(Decision a, While c) {
		if (c.equals(a.getPositive())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_14BB(Decision a, While c) {
		if (c.equals(a.getNegative())) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_15BB(While w, While c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_16BB(While w, While c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_17BB(While w, Decision a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_18BB(While c, Decision a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_19BB(Decision a,
			Assignment b) {
		if (b.equals(a.getPositive())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_20BB(Decision a,
			Assignment b) {
		if (b.equals(a.getNegative())) {
			return new Object[] { a, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_21BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_27_1_matchtggpattern_blackBBBB(While w, While c, Decision a,
			Assignment b) {
		if (!c.equals(w)) {
			if (c.equals(w.getNext())) {
				if (b.equals(c.getFirst())) {
					if (b.equals(c.getLast())) {
						if (a.equals(w.getFirst())) {
							if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_0BB(c, a) == null) {
								if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_1BB(c, a) == null) {
									if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_2BB(c, w) == null) {
										if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_3BB(c,
												w) == null) {
											if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_4B(
													c) == null) {
												if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_5B(
														a) == null) {
													if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_6B(
															a) == null) {
														if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_7BBB(
																a, w, c) == null) {
															if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_8B(
																	a) == null) {
																if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_9BB(
																		b, a) == null) {
																	if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_10BB(
																			b, a) == null) {
																		if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_11BBB(
																				b, w, c) == null) {
																			if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_12B(
																					b) == null) {
																				if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_13BB(
																						a, c) == null) {
																					if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_14BB(
																							a, c) == null) {
																						if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_15BB(
																								w, c) == null) {
																							if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_16BB(
																									w, c) == null) {
																								if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_17BB(
																										w, a) == null) {
																									if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_18BB(
																											c,
																											a) == null) {
																										if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_19BB(
																												a,
																												b) == null) {
																											if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_20BB(
																													a,
																													b) == null) {
																												if (pattern_whiledul2branchbub_27_1_matchtggpattern_black_nac_21BB(
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

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_0B(Branch z) {
		for (Graph __DEC_z_root_178455 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_1BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_positive_394186 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "positive")) {
						if (!z.equals(__DEC_z_positive_394186)) {
							if (!i.equals(__DEC_z_positive_394186)) {
								if (!x.equals(__DEC_z_positive_394186)) {
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

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_2BBB(Branch z, Branch i,
			Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_z_negative_496137 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(z, Branch.class, "negative")) {
						if (!z.equals(__DEC_z_negative_496137)) {
							if (!i.equals(__DEC_z_negative_496137)) {
								if (!x.equals(__DEC_z_negative_496137)) {
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

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_991269 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_4BBBB(Command y, Branch i,
			Branch z, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_positive_705185 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "positive")) {
						if (!i.equals(__DEC_y_positive_705185)) {
							if (!z.equals(__DEC_y_positive_705185)) {
								if (!x.equals(__DEC_y_positive_705185)) {
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

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_5BBBB(Command y, Branch i,
			Branch z, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					for (Branch __DEC_y_negative_721403 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(y, Branch.class, "negative")) {
						if (!i.equals(__DEC_y_negative_721403)) {
							if (!z.equals(__DEC_y_negative_721403)) {
								if (!x.equals(__DEC_y_negative_721403)) {
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

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_6B(Branch x) {
		for (Graph __DEC_x_root_222191 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
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
					for (Branch __DEC_x_positive_162523 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "positive")) {
						if (!x.equals(__DEC_x_positive_162523)) {
							if (!i.equals(__DEC_x_positive_162523)) {
								if (!z.equals(__DEC_x_positive_162523)) {
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
					for (Branch __DEC_x_negative_849461 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(x, Branch.class, "negative")) {
						if (!x.equals(__DEC_x_negative_849461)) {
							if (!i.equals(__DEC_x_negative_849461)) {
								if (!z.equals(__DEC_x_negative_849461)) {
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

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_9BB(Branch i, Branch z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_10BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_11BB(Branch x, Command y) {
		if (y.equals(x.getPositive())) {
			return new Object[] { x, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_12BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_13BB(Branch z, Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_14BB(Branch x, Command y) {
		if (y.equals(x.getNegative())) {
			return new Object[] { x, y };
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

	public static final Object[] pattern_whiledul2branchbub_28_1_matchtggpattern_blackBBBB(Branch i, Branch z,
			Command y, Branch x) {
		if (!i.equals(z)) {
			if (!i.equals(x)) {
				if (!x.equals(z)) {
					if (z.equals(i.getNegative())) {
						if (y.equals(z.getPositive())) {
							if (z.equals(y.getNext())) {
								if (x.equals(i.getPositive())) {
									if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_0B(z) == null) {
										if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_1BBB(z, i,
												x) == null) {
											if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_2BBB(z, i,
													x) == null) {
												if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_3B(
														y) == null) {
													if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_4BBBB(
															y, i, z, x) == null) {
														if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_5BBBB(
																y, i, z, x) == null) {
															if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_6B(
																	x) == null) {
																if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_7BBB(
																		x, i, z) == null) {
																	if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_8BBB(
																			x, i, z) == null) {
																		if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_9BB(
																				i, z) == null) {
																			if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_10BB(
																					i, y) == null) {
																				if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_11BB(
																						x, y) == null) {
																					if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_12BB(
																							i, y) == null) {
																						if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_13BB(
																								z, y) == null) {
																							if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_14BB(
																									x, y) == null) {
																								if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_15BB(
																										z, x) == null) {
																									if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_16BB(
																											i,
																											x) == null) {
																										if (pattern_whiledul2branchbub_28_1_matchtggpattern_black_nac_17BB(
																												z,
																												x) == null) {
																											return new Object[] {
																													i,
																													z,
																													y,
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
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
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
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
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
					Branch i = w2i.getTarget();
					if (i != null) {
						Statement tmpW = w2i.getSource();
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							if (pattern_whiledul2branchbub_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									w2i) == null) {
								if (pattern_whiledul2branchbub_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										i) == null) {
									if (pattern_whiledul2branchbub_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_whiledul2branchbub_29_3_solveCSP_bindingFBBBBBB(whiledul2branchbub _this,
			IsApplicableMatch isApplicableMatch, Branch i, While w, S2B w2i, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, i, w, w2i, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, i, w, w2i, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whiledul2branchbub_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whiledul2branchbub_29_3_solveCSP_bindingAndBlackFBBBBBB(
			whiledul2branchbub _this, IsApplicableMatch isApplicableMatch, Branch i, While w, S2B w2i,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whiledul2branchbub_29_3_solveCSP_binding = pattern_whiledul2branchbub_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, i, w, w2i, ruleResult);
		if (result_pattern_whiledul2branchbub_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whiledul2branchbub_29_3_solveCSP_binding[0];

			Object[] result_pattern_whiledul2branchbub_29_3_solveCSP_black = pattern_whiledul2branchbub_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whiledul2branchbub_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, i, w, w2i, ruleResult };
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

	public static final Object[] pattern_whiledul2branchbub_29_5_checknacs_blackBBB(Branch i, While w, S2B w2i) {
		return new Object[] { i, w, w2i };
	}

	public static final Object[] pattern_whiledul2branchbub_29_6_perform_blackBBBB(Branch i, While w, S2B w2i,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { i, w, w2i, ruleResult };
	}

	public static final Object[] pattern_whiledul2branchbub_29_6_perform_greenBBFFFFFFFFFB(Branch i, While w,
			ModelgeneratorRuleResult ruleResult) {
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		S2B a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Branch x = ControlflowFactory.eINSTANCE.createBranch();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		Decision a = SourcecodeFactory.eINSTANCE.createDecision();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		i.setNegative(z);
		ruleResult.getTargetObjects().add(z);
		ruleResult.getCorrObjects().add(a2x);
		z.setPositive(y);
		y.setNext(z);
		ruleResult.getTargetObjects().add(y);
		c2z.setTarget(z);
		ruleResult.getCorrObjects().add(c2z);
		b2y.setTarget(y);
		ruleResult.getCorrObjects().add(b2y);
		a2x.setTarget(x);
		i.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		w.setNext(c);
		c2z.setSource(c);
		ruleResult.getSourceObjects().add(c);
		w.setFirst(a);
		a2x.setSource(a);
		ruleResult.getSourceObjects().add(a);
		c.setFirst(b);
		c.setLast(b);
		b2y.setSource(b);
		ruleResult.getSourceObjects().add(b);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { i, w, z, a2x, y, c2z, b2y, x, c, a, b, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whiledul2branchbub_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whiledul2branchbubImpl
