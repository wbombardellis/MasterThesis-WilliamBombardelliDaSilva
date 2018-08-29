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
import org.wbsilva.bx.sourcecode2controlflow.Rules.whileaul2branchcub;

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
 * An implementation of the model object '<em><b>whileaul2branchcub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class whileaul2branchcubImpl extends AbstractRuleImpl implements whileaul2branchcub {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected whileaul2branchcubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getwhileaul2branchcub();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Assignment a, While w, Assignment b, While c) {

		Object[] result1_black = whileaul2branchcubImpl.pattern_whileaul2branchcub_0_1_initialbindings_blackBBBBBB(this,
				match, a, w, b, c);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[b] = " + b + ", "
					+ "[c] = " + c + ".");
		}

		Object[] result2_bindingAndBlack = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, a, w, b, c);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[b] = " + b + ", "
					+ "[c] = " + c + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileaul2branchcubImpl.pattern_whileaul2branchcub_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileaul2branchcubImpl
					.pattern_whileaul2branchcub_0_4_collectelementstobetranslated_blackBBBBB(match, a, w, b, c);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[c] = " + c + ".");
			}
			whileaul2branchcubImpl.pattern_whileaul2branchcub_0_4_collectelementstobetranslated_greenBBBBBFFFF(match, a,
					w, b, c);
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge c__b____first = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge c__b____last = (EMoflonEdge) result4_green[8];

			Object[] result5_black = whileaul2branchcubImpl
					.pattern_whileaul2branchcub_0_5_collectcontextelements_blackBBBBB(match, a, w, b, c);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[c] = " + c + ".");
			}
			whileaul2branchcubImpl.pattern_whileaul2branchcub_0_5_collectcontextelements_greenBB(match, w);

			// 
			whileaul2branchcubImpl.pattern_whileaul2branchcub_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					a, w, b, c);
			return whileaul2branchcubImpl.pattern_whileaul2branchcub_0_7_expressionF();
		} else {
			return whileaul2branchcubImpl.pattern_whileaul2branchcub_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Assignment a = (Assignment) result1_bindingAndBlack[0];
		S2B w2i = (S2B) result1_bindingAndBlack[1];
		While w = (While) result1_bindingAndBlack[2];
		Assignment b = (Assignment) result1_bindingAndBlack[3];
		Branch i = (Branch) result1_bindingAndBlack[4];
		While c = (While) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_1_1_performtransformation_greenFFFBFFFBBB(a, b, i, c);
		S2B c2z = (S2B) result1_green[0];
		S2N b2y = (S2N) result1_green[1];
		Command x = (Command) result1_green[2];
		S2N a2x = (S2N) result1_green[4];
		Command y = (Command) result1_green[5];
		Branch z = (Branch) result1_green[6];

		Object[] result2_black = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_1_2_collecttranslatedelements_blackBBBBBBBBB(c2z, b2y, x, a, a2x, y, z, b,
						c);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c2z] = " + c2z + ", "
					+ "[b2y] = " + b2y + ", " + "[x] = " + x + ", " + "[a] = " + a + ", " + "[a2x] = " + a2x + ", "
					+ "[y] = " + y + ", " + "[z] = " + z + ", " + "[b] = " + b + ", " + "[c] = " + c + ".");
		}
		Object[] result2_green = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_1_2_collecttranslatedelements_greenFBBBBBBBBB(c2z, b2y, x, a, a2x, y, z, b,
						c);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, c2z, b2y, x, a, a2x,
						y, w2i, z, w, b, i, c);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c2z] = " + c2z + ", " + "[b2y] = " + b2y + ", " + "[x] = " + x + ", " + "[a] = " + a
					+ ", " + "[a2x] = " + a2x + ", " + "[y] = " + y + ", " + "[w2i] = " + w2i + ", " + "[z] = " + z
					+ ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[i] = " + i + ", " + "[c] = " + c + ".");
		}
		whileaul2branchcubImpl.pattern_whileaul2branchcub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, c2z, b2y, x, a, a2x, y, z, w, b, i, c);
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge z__y____positive = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge y__z____next = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge c__b____first = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge c__b____last = (EMoflonEdge) result3_green[25];

		// 
		// 
		whileaul2branchcubImpl.pattern_whileaul2branchcub_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
				c2z, b2y, x, a, a2x, y, w2i, z, w, b, i, c);
		return whileaul2branchcubImpl.pattern_whileaul2branchcub_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whileaul2branchcubImpl.pattern_whileaul2branchcub_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Assignment a = (Assignment) result2_binding[0];
		While w = (While) result2_binding[1];
		Assignment b = (Assignment) result2_binding[2];
		While c = (While) result2_binding[3];
		for (Object[] result2_black : whileaul2branchcubImpl.pattern_whileaul2branchcub_2_2_corematch_blackBFBBFBB(a, w,
				b, c, match)) {
			S2B w2i = (S2B) result2_black[1];
			Branch i = (Branch) result2_black[4];
			// ForEach 
			for (Object[] result3_black : whileaul2branchcubImpl
					.pattern_whileaul2branchcub_2_3_findcontext_blackBBBBBB(a, w2i, w, b, i, c)) {
				Object[] result3_green = whileaul2branchcubImpl
						.pattern_whileaul2branchcub_2_3_findcontext_greenBBBBBBFFFFFFF(a, w2i, w, b, i, c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge c__b____first = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge c__b____last = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = whileaul2branchcubImpl
						.pattern_whileaul2branchcub_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, a,
								w2i, w, b, i, c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[a] = " + a + ", " + "[w2i] = "
							+ w2i + ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[i] = " + i + ", " + "[c] = "
							+ c + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whileaul2branchcubImpl.pattern_whileaul2branchcub_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whileaul2branchcubImpl
							.pattern_whileaul2branchcub_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whileaul2branchcubImpl.pattern_whileaul2branchcub_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whileaul2branchcubImpl.pattern_whileaul2branchcub_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Assignment a, While w, Assignment b, While c) {
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
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment a, While w, Assignment b, While c) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Assignment a, S2B w2i, While w,
			Assignment b, Branch i, While c) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("i", i);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject c2z, EObject b2y, EObject x, EObject a,
			EObject a2x, EObject y, EObject w2i, EObject z, EObject w, EObject b, EObject i, EObject c) {
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.While.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command x, Command y, Branch z, Branch i) {

		Object[] result1_black = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_10_1_initialbindings_blackBBBBBB(this, match, x, y, z, i);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[z] = " + z + ", "
					+ "[i] = " + i + ".");
		}

		Object[] result2_bindingAndBlack = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, x, y, z, i);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[y] = " + y + ", " + "[z] = " + z + ", "
					+ "[i] = " + i + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileaul2branchcubImpl.pattern_whileaul2branchcub_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileaul2branchcubImpl
					.pattern_whileaul2branchcub_10_4_collectelementstobetranslated_blackBBBBB(match, x, y, z, i);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[i] = " + i + ".");
			}
			whileaul2branchcubImpl.pattern_whileaul2branchcub_10_4_collectelementstobetranslated_greenBBBBBFFFF(match,
					x, y, z, i);
			//nothing EMoflonEdge z__y____positive = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge y__z____next = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[8];

			Object[] result5_black = whileaul2branchcubImpl
					.pattern_whileaul2branchcub_10_5_collectcontextelements_blackBBBBB(match, x, y, z, i);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[i] = " + i + ".");
			}
			whileaul2branchcubImpl.pattern_whileaul2branchcub_10_5_collectcontextelements_greenBB(match, i);

			// 
			whileaul2branchcubImpl.pattern_whileaul2branchcub_10_6_registerobjectstomatch_expressionBBBBBB(this, match,
					x, y, z, i);
			return whileaul2branchcubImpl.pattern_whileaul2branchcub_10_7_expressionF();
		} else {
			return whileaul2branchcubImpl.pattern_whileaul2branchcub_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Command x = (Command) result1_bindingAndBlack[0];
		Command y = (Command) result1_bindingAndBlack[1];
		S2B w2i = (S2B) result1_bindingAndBlack[2];
		Branch z = (Branch) result1_bindingAndBlack[3];
		While w = (While) result1_bindingAndBlack[4];
		Branch i = (Branch) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_11_1_performtransformation_greenFFBFFBBBFF(x, y, z, w);
		S2B c2z = (S2B) result1_green[0];
		S2N b2y = (S2N) result1_green[1];
		Assignment a = (Assignment) result1_green[3];
		S2N a2x = (S2N) result1_green[4];
		Assignment b = (Assignment) result1_green[8];
		While c = (While) result1_green[9];

		Object[] result2_black = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_11_2_collecttranslatedelements_blackBBBBBBBBB(c2z, b2y, x, a, a2x, y, z, b,
						c);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c2z] = " + c2z + ", "
					+ "[b2y] = " + b2y + ", " + "[x] = " + x + ", " + "[a] = " + a + ", " + "[a2x] = " + a2x + ", "
					+ "[y] = " + y + ", " + "[z] = " + z + ", " + "[b] = " + b + ", " + "[c] = " + c + ".");
		}
		Object[] result2_green = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_11_2_collecttranslatedelements_greenFBBBBBBBBB(c2z, b2y, x, a, a2x, y, z, b,
						c);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, c2z, b2y, x, a, a2x,
						y, w2i, z, w, b, i, c);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c2z] = " + c2z + ", " + "[b2y] = " + b2y + ", " + "[x] = " + x + ", " + "[a] = " + a
					+ ", " + "[a2x] = " + a2x + ", " + "[y] = " + y + ", " + "[w2i] = " + w2i + ", " + "[z] = " + z
					+ ", " + "[w] = " + w + ", " + "[b] = " + b + ", " + "[i] = " + i + ", " + "[c] = " + c + ".");
		}
		whileaul2branchcubImpl.pattern_whileaul2branchcub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, c2z, b2y, x, a, a2x, y, z, w, b, i, c);
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge z__y____positive = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge y__z____next = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge c__b____first = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge c__b____last = (EMoflonEdge) result3_green[25];

		// 
		// 
		whileaul2branchcubImpl.pattern_whileaul2branchcub_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this,
				ruleresult, c2z, b2y, x, a, a2x, y, w2i, z, w, b, i, c);
		return whileaul2branchcubImpl.pattern_whileaul2branchcub_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whileaul2branchcubImpl.pattern_whileaul2branchcub_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Command x = (Command) result2_binding[0];
		Command y = (Command) result2_binding[1];
		Branch z = (Branch) result2_binding[2];
		Branch i = (Branch) result2_binding[3];
		for (Object[] result2_black : whileaul2branchcubImpl.pattern_whileaul2branchcub_12_2_corematch_blackBBFBFBB(x,
				y, z, i, match)) {
			S2B w2i = (S2B) result2_black[2];
			While w = (While) result2_black[4];
			// ForEach 
			for (Object[] result3_black : whileaul2branchcubImpl
					.pattern_whileaul2branchcub_12_3_findcontext_blackBBBBBB(x, y, w2i, z, w, i)) {
				Object[] result3_green = whileaul2branchcubImpl
						.pattern_whileaul2branchcub_12_3_findcontext_greenBBBBBBFFFFFFF(x, y, w2i, z, w, i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge z__y____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge y__z____next = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = whileaul2branchcubImpl
						.pattern_whileaul2branchcub_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, x,
								y, w2i, z, w, i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[x] = " + x + ", " + "[y] = " + y
							+ ", " + "[w2i] = " + w2i + ", " + "[z] = " + z + ", " + "[w] = " + w + ", " + "[i] = " + i
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whileaul2branchcubImpl.pattern_whileaul2branchcub_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whileaul2branchcubImpl
							.pattern_whileaul2branchcub_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whileaul2branchcubImpl.pattern_whileaul2branchcub_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whileaul2branchcubImpl.pattern_whileaul2branchcub_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Command x, Command y, Branch z, Branch i) {
		match.registerObject("x", x);
		match.registerObject("y", y);
		match.registerObject("z", z);
		match.registerObject("i", i);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command x, Command y, Branch z, Branch i) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Command x, Command y, S2B w2i, Branch z,
			While w, Branch i) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("z", z);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject c2z, EObject b2y, EObject x, EObject a,
			EObject a2x, EObject y, EObject w2i, EObject z, EObject w, EObject b, EObject i, EObject c) {
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Branch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_100(EMoflonEdge _edge_positive) {

		Object[] result1_bindingAndBlack = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whileaul2branchcubImpl.pattern_whileaul2branchcub_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whileaul2branchcubImpl
				.pattern_whileaul2branchcub_20_2_testcorematchandDECs_blackFFFFB(_edge_positive)) {
			Command x = (Command) result2_black[0];
			Command y = (Command) result2_black[1];
			Branch z = (Branch) result2_black[2];
			Branch i = (Branch) result2_black[3];
			Object[] result2_green = whileaul2branchcubImpl
					.pattern_whileaul2branchcub_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileaul2branchcubImpl
					.pattern_whileaul2branchcub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, x, y, z, i)) {
				// 
				if (whileaul2branchcubImpl
						.pattern_whileaul2branchcub_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = whileaul2branchcubImpl
							.pattern_whileaul2branchcub_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whileaul2branchcubImpl.pattern_whileaul2branchcub_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whileaul2branchcubImpl.pattern_whileaul2branchcub_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_100(EMoflonEdge _edge_next) {

		Object[] result1_bindingAndBlack = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whileaul2branchcubImpl.pattern_whileaul2branchcub_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whileaul2branchcubImpl
				.pattern_whileaul2branchcub_21_2_testcorematchandDECs_blackFFFFB(_edge_next)) {
			Assignment a = (Assignment) result2_black[0];
			While w = (While) result2_black[1];
			Assignment b = (Assignment) result2_black[2];
			While c = (While) result2_black[3];
			Object[] result2_green = whileaul2branchcubImpl
					.pattern_whileaul2branchcub_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileaul2branchcubImpl
					.pattern_whileaul2branchcub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, a, w, b, c)) {
				// 
				if (whileaul2branchcubImpl
						.pattern_whileaul2branchcub_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = whileaul2branchcubImpl
							.pattern_whileaul2branchcub_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whileaul2branchcubImpl.pattern_whileaul2branchcub_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whileaul2branchcubImpl.pattern_whileaul2branchcub_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("whileaul2branchcub");
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
		ruleResult.setRule("whileaul2branchcub");
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

		Object[] result1_black = whileaul2branchcubImpl.pattern_whileaul2branchcub_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whileaul2branchcubImpl.pattern_whileaul2branchcub_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Command x = (Command) result2_bindingAndBlack[0];
		Assignment a = (Assignment) result2_bindingAndBlack[1];
		Command y = (Command) result2_bindingAndBlack[2];
		Branch z = (Branch) result2_bindingAndBlack[3];
		While w = (While) result2_bindingAndBlack[4];
		Assignment b = (Assignment) result2_bindingAndBlack[5];
		Branch i = (Branch) result2_bindingAndBlack[6];
		While c = (While) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, x, a, y, z, w, b, i, c,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[x] = " + x + ", " + "[a] = " + a + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[w] = "
					+ w + ", " + "[b] = " + b + ", " + "[i] = " + i + ", " + "[c] = " + c + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whileaul2branchcubImpl.pattern_whileaul2branchcub_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whileaul2branchcubImpl
					.pattern_whileaul2branchcub_24_5_matchcorrcontext_blackFBBBB(w, i, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[0];
				Object[] result5_green = whileaul2branchcubImpl
						.pattern_whileaul2branchcub_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whileaul2branchcubImpl
						.pattern_whileaul2branchcub_24_6_createcorrespondence_blackBBBBBBBBB(x, a, y, z, w, b, i, c,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[x] = " + x + ", "
							+ "[a] = " + a + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[w] = " + w + ", "
							+ "[b] = " + b + ", " + "[i] = " + i + ", " + "[c] = " + c + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				whileaul2branchcubImpl.pattern_whileaul2branchcub_24_6_createcorrespondence_greenFFBBFBBBBB(x, a, y, z,
						b, c, ccMatch);
				//nothing S2B c2z = (S2B) result6_green[0];
				//nothing S2N b2y = (S2N) result6_green[1];
				//nothing S2N a2x = (S2N) result6_green[4];

				Object[] result7_black = whileaul2branchcubImpl
						.pattern_whileaul2branchcub_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whileaul2branchcubImpl.pattern_whileaul2branchcub_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return whileaul2branchcubImpl.pattern_whileaul2branchcub_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Command x, Assignment a, Command y, Branch z, While w, Assignment b, Branch i,
			While c, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Assignment a, While w, Assignment b, While c) {// 
		Object[] result1_black = whileaul2branchcubImpl.pattern_whileaul2branchcub_27_1_matchtggpattern_blackBBBB(a, w,
				b, c);
		if (result1_black != null) {
			return whileaul2branchcubImpl.pattern_whileaul2branchcub_27_2_expressionF();
		} else {
			return whileaul2branchcubImpl.pattern_whileaul2branchcub_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Command x, Command y, Branch z, Branch i) {// 
		Object[] result1_black = whileaul2branchcubImpl.pattern_whileaul2branchcub_28_1_matchtggpattern_blackBBBB(x, y,
				z, i);
		if (result1_black != null) {
			return whileaul2branchcubImpl.pattern_whileaul2branchcub_28_2_expressionF();
		} else {
			return whileaul2branchcubImpl.pattern_whileaul2branchcub_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B w2iParameter) {

		Object[] result1_black = whileaul2branchcubImpl.pattern_whileaul2branchcub_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whileaul2branchcubImpl.pattern_whileaul2branchcub_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : whileaul2branchcubImpl
				.pattern_whileaul2branchcub_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList w2iList = (RuleEntryList) result2_black[0];
			S2B w2i = (S2B) result2_black[1];
			While w = (While) result2_black[2];
			Branch i = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = whileaul2branchcubImpl
					.pattern_whileaul2branchcub_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, w2i, w, i,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w2i] = " + w2i + ", " + "[w] = " + w
						+ ", " + "[i] = " + i + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whileaul2branchcubImpl.pattern_whileaul2branchcub_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whileaul2branchcubImpl.pattern_whileaul2branchcub_29_5_checknacs_blackBBB(w2i,
						w, i);
				if (result5_black != null) {

					Object[] result6_black = whileaul2branchcubImpl
							.pattern_whileaul2branchcub_29_6_perform_blackBBBB(w2i, w, i, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w2i] = " + w2i + ", "
								+ "[w] = " + w + ", " + "[i] = " + i + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whileaul2branchcubImpl.pattern_whileaul2branchcub_29_6_perform_greenFFFFFFFBFBFB(w, i, ruleResult);
					//nothing S2B c2z = (S2B) result6_green[0];
					//nothing S2N b2y = (S2N) result6_green[1];
					//nothing Command x = (Command) result6_green[2];
					//nothing Assignment a = (Assignment) result6_green[3];
					//nothing S2N a2x = (S2N) result6_green[4];
					//nothing Command y = (Command) result6_green[5];
					//nothing Branch z = (Branch) result6_green[6];
					//nothing Assignment b = (Assignment) result6_green[8];
					//nothing While c = (While) result6_green[10];

				} else {
				}

			} else {
			}

		}
		return whileaul2branchcubImpl.pattern_whileaul2branchcub_29_7_expressionFB(ruleResult);
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
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_WHILE_ASSIGNMENT_WHILE:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.WHILEAUL2BRANCHCUB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_WHILE_ASSIGNMENT_WHILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4));
			return null;
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_WHILE_ASSIGNMENT_WHILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (While) arguments.get(4));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASSIGNMENT_S2B_WHILE_ASSIGNMENT_BRANCH_WHILE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(S2B) arguments.get(2), (While) arguments.get(3), (Assignment) arguments.get(4),
					(Branch) arguments.get(5), (While) arguments.get(6));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.WHILEAUL2BRANCHCUB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPROPRIATE_BWD__MATCH_COMMAND_COMMAND_BRANCH_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.WHILEAUL2BRANCHCUB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_COMMAND_BRANCH_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Branch) arguments.get(4));
			return null;
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_COMMAND_BRANCH_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMMAND_COMMAND_S2B_BRANCH_WHILE_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Command) arguments.get(1),
					(Command) arguments.get(2), (S2B) arguments.get(3), (Branch) arguments.get(4),
					(While) arguments.get(5), (Branch) arguments.get(6));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.WHILEAUL2BRANCHCUB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_100__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_100((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_100__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_100((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPLICABLE_SOLVE_CSP_CC__COMMAND_ASSIGNMENT_COMMAND_BRANCH_WHILE_ASSIGNMENT_BRANCH_WHILE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Command) arguments.get(0), (Assignment) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (While) arguments.get(4),
					(Assignment) arguments.get(5), (Branch) arguments.get(6), (While) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___CHECK_DEC_FWD__ASSIGNMENT_WHILE_ASSIGNMENT_WHILE:
			return checkDEC_FWD((Assignment) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(While) arguments.get(3));
		case RulesPackage.WHILEAUL2BRANCHCUB___CHECK_DEC_BWD__COMMAND_COMMAND_BRANCH_BRANCH:
			return checkDEC_BWD((Command) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.WHILEAUL2BRANCHCUB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILEAUL2BRANCHCUB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_WHILE_BRANCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(While) arguments.get(2), (Branch) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILEAUL2BRANCHCUB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whileaul2branchcub_0_1_initialbindings_blackBBBBBB(whileaul2branchcub _this,
			Match match, Assignment a, While w, Assignment b, While c) {
		if (!a.equals(b)) {
			if (!c.equals(w)) {
				return new Object[] { _this, match, a, w, b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_0_2_SolveCSP_bindingFBBBBBB(whileaul2branchcub _this,
			Match match, Assignment a, While w, Assignment b, While c) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, a, w, b, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, a, w, b, c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileaul2branchcub_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			whileaul2branchcub _this, Match match, Assignment a, While w, Assignment b, While c) {
		Object[] result_pattern_whileaul2branchcub_0_2_SolveCSP_binding = pattern_whileaul2branchcub_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, a, w, b, c);
		if (result_pattern_whileaul2branchcub_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileaul2branchcub_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whileaul2branchcub_0_2_SolveCSP_black = pattern_whileaul2branchcub_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileaul2branchcub_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, a, w, b, c };
			}
		}
		return null;
	}

	public static final boolean pattern_whileaul2branchcub_0_3_CheckCSP_expressionFBB(whileaul2branchcub _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileaul2branchcub_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			Assignment a, While w, Assignment b, While c) {
		if (!a.equals(b)) {
			if (!c.equals(w)) {
				return new Object[] { match, a, w, b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_0_4_collectelementstobetranslated_greenBBBBBFFFF(
			Match match, Assignment a, While w, Assignment b, While c) {
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(c);
		String w__c____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String c__b____first_name_prime = "first";
		String c__b____last_name_prime = "last";
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		c__b____first.setSrc(c);
		c__b____first.setTrg(b);
		match.getToBeTranslatedEdges().add(c__b____first);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(c__b____last);
		w__c____next.setName(w__c____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		c__b____first.setName(c__b____first_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		return new Object[] { match, a, w, b, c, w__c____next, w__a____first, c__b____first, c__b____last };
	}

	public static final Object[] pattern_whileaul2branchcub_0_5_collectcontextelements_blackBBBBB(Match match,
			Assignment a, While w, Assignment b, While c) {
		if (!a.equals(b)) {
			if (!c.equals(w)) {
				return new Object[] { match, a, w, b, c };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whileaul2branchcub_0_6_registerobjectstomatch_expressionBBBBBB(
			whileaul2branchcub _this, Match match, Assignment a, While w, Assignment b, While c) {
		_this.registerObjectsToMatch_FWD(match, a, w, b, c);

	}

	public static final boolean pattern_whileaul2branchcub_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileaul2branchcub_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileaul2branchcub_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("a");
		EObject _localVariable_1 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_2 = isApplicableMatch.getObject("w");
		EObject _localVariable_3 = isApplicableMatch.getObject("b");
		EObject _localVariable_4 = isApplicableMatch.getObject("i");
		EObject _localVariable_5 = isApplicableMatch.getObject("c");
		EObject tmpA = _localVariable_0;
		EObject tmpW2i = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpB = _localVariable_3;
		EObject tmpI = _localVariable_4;
		EObject tmpC = _localVariable_5;
		if (tmpA instanceof Assignment) {
			Assignment a = (Assignment) tmpA;
			if (tmpW2i instanceof S2B) {
				S2B w2i = (S2B) tmpW2i;
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					if (tmpB instanceof Assignment) {
						Assignment b = (Assignment) tmpB;
						if (tmpI instanceof Branch) {
							Branch i = (Branch) tmpI;
							if (tmpC instanceof While) {
								While c = (While) tmpC;
								return new Object[] { a, w2i, w, b, i, c, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_1_1_performtransformation_blackBBBBBBFBB(Assignment a,
			S2B w2i, While w, Assignment b, Branch i, While c, whileaul2branchcub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!a.equals(b)) {
			if (!c.equals(w)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { a, w2i, w, b, i, c, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			whileaul2branchcub _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whileaul2branchcub_1_1_performtransformation_binding = pattern_whileaul2branchcub_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_whileaul2branchcub_1_1_performtransformation_binding != null) {
			Assignment a = (Assignment) result_pattern_whileaul2branchcub_1_1_performtransformation_binding[0];
			S2B w2i = (S2B) result_pattern_whileaul2branchcub_1_1_performtransformation_binding[1];
			While w = (While) result_pattern_whileaul2branchcub_1_1_performtransformation_binding[2];
			Assignment b = (Assignment) result_pattern_whileaul2branchcub_1_1_performtransformation_binding[3];
			Branch i = (Branch) result_pattern_whileaul2branchcub_1_1_performtransformation_binding[4];
			While c = (While) result_pattern_whileaul2branchcub_1_1_performtransformation_binding[5];

			Object[] result_pattern_whileaul2branchcub_1_1_performtransformation_black = pattern_whileaul2branchcub_1_1_performtransformation_blackBBBBBBFBB(
					a, w2i, w, b, i, c, _this, isApplicableMatch);
			if (result_pattern_whileaul2branchcub_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileaul2branchcub_1_1_performtransformation_black[6];

				return new Object[] { a, w2i, w, b, i, c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_1_1_performtransformation_greenFFFBFFFBBB(Assignment a,
			Assignment b, Branch i, While c) {
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command x = ControlflowFactory.eINSTANCE.createCommand();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		c2z.setSource(c);
		b2y.setSource(b);
		i.setPositive(x);
		a2x.setTarget(x);
		a2x.setSource(a);
		b2y.setTarget(y);
		c2z.setTarget(z);
		z.setPositive(y);
		y.setNext(z);
		i.setNegative(z);
		return new Object[] { c2z, b2y, x, a, a2x, y, z, b, i, c };
	}

	public static final Object[] pattern_whileaul2branchcub_1_2_collecttranslatedelements_blackBBBBBBBBB(S2B c2z,
			S2N b2y, Command x, Assignment a, S2N a2x, Command y, Branch z, Assignment b, While c) {
		if (!x.equals(y)) {
			if (!a.equals(b)) {
				if (!a2x.equals(b2y)) {
					return new Object[] { c2z, b2y, x, a, a2x, y, z, b, c };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_1_2_collecttranslatedelements_greenFBBBBBBBBB(S2B c2z,
			S2N b2y, Command x, Assignment a, S2N a2x, Command y, Branch z, Assignment b, While c) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getTranslatedElements().add(c);
		return new Object[] { ruleresult, c2z, b2y, x, a, a2x, y, z, b, c };
	}

	public static final Object[] pattern_whileaul2branchcub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject c2z, EObject b2y, EObject x, EObject a, EObject a2x, EObject y,
			EObject w2i, EObject z, EObject w, EObject b, EObject i, EObject c) {
		if (!c2z.equals(x)) {
			if (!c2z.equals(y)) {
				if (!c2z.equals(w2i)) {
					if (!c2z.equals(z)) {
						if (!c2z.equals(w)) {
							if (!c2z.equals(i)) {
								if (!b2y.equals(c2z)) {
									if (!b2y.equals(x)) {
										if (!b2y.equals(y)) {
											if (!b2y.equals(w2i)) {
												if (!b2y.equals(z)) {
													if (!b2y.equals(w)) {
														if (!b2y.equals(i)) {
															if (!b2y.equals(c)) {
																if (!x.equals(y)) {
																	if (!x.equals(z)) {
																		if (!a.equals(c2z)) {
																			if (!a.equals(b2y)) {
																				if (!a.equals(x)) {
																					if (!a.equals(a2x)) {
																						if (!a.equals(y)) {
																							if (!a.equals(w2i)) {
																								if (!a.equals(z)) {
																									if (!a.equals(w)) {
																										if (!a.equals(
																												b)) {
																											if (!a.equals(
																													i)) {
																												if (!a.equals(
																														c)) {
																													if (!a2x.equals(
																															c2z)) {
																														if (!a2x.equals(
																																b2y)) {
																															if (!a2x.equals(
																																	x)) {
																																if (!a2x.equals(
																																		y)) {
																																	if (!a2x.equals(
																																			w2i)) {
																																		if (!a2x.equals(
																																				z)) {
																																			if (!a2x.equals(
																																					w)) {
																																				if (!a2x.equals(
																																						b)) {
																																					if (!a2x.equals(
																																							i)) {
																																						if (!a2x.equals(
																																								c)) {
																																							if (!y.equals(
																																									z)) {
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
																																															w2i)) {
																																														if (!w.equals(
																																																z)) {
																																															if (!b.equals(
																																																	c2z)) {
																																																if (!b.equals(
																																																		b2y)) {
																																																	if (!b.equals(
																																																			x)) {
																																																		if (!b.equals(
																																																				y)) {
																																																			if (!b.equals(
																																																					w2i)) {
																																																				if (!b.equals(
																																																						z)) {
																																																					if (!b.equals(
																																																							w)) {
																																																						if (!b.equals(
																																																								i)) {
																																																							if (!b.equals(
																																																									c)) {
																																																								if (!i.equals(
																																																										x)) {
																																																									if (!i.equals(
																																																											y)) {
																																																										if (!i.equals(
																																																												w2i)) {
																																																											if (!i.equals(
																																																													z)) {
																																																												if (!i.equals(
																																																														w)) {
																																																													if (!c.equals(
																																																															c2z)) {
																																																														if (!c.equals(
																																																																x)) {
																																																															if (!c.equals(
																																																																	y)) {
																																																																if (!c.equals(
																																																																		w2i)) {
																																																																	if (!c.equals(
																																																																			z)) {
																																																																		if (!c.equals(
																																																																				w)) {
																																																																			if (!c.equals(
																																																																					i)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						c2z,
																																																																						b2y,
																																																																						x,
																																																																						a,
																																																																						a2x,
																																																																						y,
																																																																						w2i,
																																																																						z,
																																																																						w,
																																																																						b,
																																																																						i,
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
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whileaul2branchcub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject c2z, EObject b2y, EObject x, EObject a, EObject a2x, EObject y,
			EObject z, EObject w, EObject b, EObject i, EObject c) {
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileaul2branchcub";
		String a2x__x____target_name_prime = "target";
		String c2z__z____target_name_prime = "target";
		String b2y__y____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String w__c____next_name_prime = "next";
		String z__y____positive_name_prime = "positive";
		String y__z____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String b2y__b____source_name_prime = "source";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String c2z__c____source_name_prime = "source";
		String c__b____first_name_prime = "first";
		String c__b____last_name_prime = "last";
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		z__y____positive.setSrc(z);
		z__y____positive.setTrg(y);
		ruleresult.getCreatedEdges().add(z__y____positive);
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		ruleresult.getCreatedEdges().add(y__z____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c__b____first.setSrc(c);
		c__b____first.setTrg(b);
		ruleresult.getTranslatedEdges().add(c__b____first);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(c__b____last);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		z__y____positive.setName(z__y____positive_name_prime);
		y__z____next.setName(y__z____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c__b____first.setName(c__b____first_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		return new Object[] { ruleresult, c2z, b2y, x, a, a2x, y, z, w, b, i, c, a2x__x____target, c2z__z____target,
				b2y__y____target, a2x__a____source, w__c____next, z__y____positive, y__z____next, w__a____first,
				b2y__b____source, i__x____positive, i__z____negative, c2z__c____source, c__b____first, c__b____last };
	}

	public static final void pattern_whileaul2branchcub_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whileaul2branchcub _this, PerformRuleResult ruleresult, EObject c2z, EObject b2y, EObject x, EObject a,
			EObject a2x, EObject y, EObject w2i, EObject z, EObject w, EObject b, EObject i, EObject c) {
		_this.registerObjects_FWD(ruleresult, c2z, b2y, x, a, a2x, y, w2i, z, w, b, i, c);

	}

	public static final PerformRuleResult pattern_whileaul2branchcub_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileaul2branchcub_2_1_preparereturnvalue_bindingFB(whileaul2branchcub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_2_1_preparereturnvalue_blackFBB(EClass eClass,
			whileaul2branchcub _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_2_1_preparereturnvalue_bindingAndBlackFFB(
			whileaul2branchcub _this) {
		Object[] result_pattern_whileaul2branchcub_2_1_preparereturnvalue_binding = pattern_whileaul2branchcub_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileaul2branchcub_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whileaul2branchcub_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileaul2branchcub_2_1_preparereturnvalue_black = pattern_whileaul2branchcub_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whileaul2branchcub_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whileaul2branchcub_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whileaul2branchcub";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whileaul2branchcub_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("a");
		EObject _localVariable_1 = match.getObject("w");
		EObject _localVariable_2 = match.getObject("b");
		EObject _localVariable_3 = match.getObject("c");
		EObject tmpA = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpC = _localVariable_3;
		if (tmpA instanceof Assignment) {
			Assignment a = (Assignment) tmpA;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpB instanceof Assignment) {
					Assignment b = (Assignment) tmpB;
					if (tmpC instanceof While) {
						While c = (While) tmpC;
						return new Object[] { a, w, b, c, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileaul2branchcub_2_2_corematch_blackBFBBFBB(Assignment a, While w,
			Assignment b, While c, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(b)) {
			if (!c.equals(w)) {
				for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class,
						"source")) {
					Branch i = w2i.getTarget();
					if (i != null) {
						_result.add(new Object[] { a, w2i, w, b, i, c, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileaul2branchcub_2_3_findcontext_blackBBBBBB(Assignment a, S2B w2i,
			While w, Assignment b, Branch i, While c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(b)) {
			if (!c.equals(w)) {
				if (w.equals(w2i.getSource())) {
					if (c.equals(w.getNext())) {
						if (a.equals(w.getFirst())) {
							if (i.equals(w2i.getTarget())) {
								if (b.equals(c.getFirst())) {
									if (b.equals(c.getLast())) {
										_result.add(new Object[] { a, w2i, w, b, i, c });
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

	public static final Object[] pattern_whileaul2branchcub_2_3_findcontext_greenBBBBBBFFFFFFF(Assignment a, S2B w2i,
			While w, Assignment b, Branch i, While c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w2i__w____source_name_prime = "source";
		String w__c____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String w2i__i____target_name_prime = "target";
		String c__b____first_name_prime = "first";
		String c__b____last_name_prime = "last";
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(c);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		c__b____first.setSrc(c);
		c__b____first.setTrg(b);
		isApplicableMatch.getAllContextElements().add(c__b____first);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(c__b____last);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		c__b____first.setName(c__b____first_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		return new Object[] { a, w2i, w, b, i, c, isApplicableMatch, w2i__w____source, w__c____next, w__a____first,
				w2i__i____target, c__b____first, c__b____last };
	}

	public static final Object[] pattern_whileaul2branchcub_2_4_solveCSP_bindingFBBBBBBBB(whileaul2branchcub _this,
			IsApplicableMatch isApplicableMatch, Assignment a, S2B w2i, While w, Assignment b, Branch i, While c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, a, w2i, w, b, i, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, a, w2i, w, b, i, c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileaul2branchcub_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			whileaul2branchcub _this, IsApplicableMatch isApplicableMatch, Assignment a, S2B w2i, While w, Assignment b,
			Branch i, While c) {
		Object[] result_pattern_whileaul2branchcub_2_4_solveCSP_binding = pattern_whileaul2branchcub_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, a, w2i, w, b, i, c);
		if (result_pattern_whileaul2branchcub_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileaul2branchcub_2_4_solveCSP_binding[0];

			Object[] result_pattern_whileaul2branchcub_2_4_solveCSP_black = pattern_whileaul2branchcub_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileaul2branchcub_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, a, w2i, w, b, i, c };
			}
		}
		return null;
	}

	public static final boolean pattern_whileaul2branchcub_2_5_checkCSP_expressionFBB(whileaul2branchcub _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileaul2branchcub_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whileaul2branchcub_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whileaul2branchcub";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whileaul2branchcub_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileaul2branchcub_10_1_initialbindings_blackBBBBBB(whileaul2branchcub _this,
			Match match, Command x, Command y, Branch z, Branch i) {
		if (!x.equals(y)) {
			if (!i.equals(z)) {
				return new Object[] { _this, match, x, y, z, i };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_10_2_SolveCSP_bindingFBBBBBB(whileaul2branchcub _this,
			Match match, Command x, Command y, Branch z, Branch i) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, x, y, z, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, x, y, z, i };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileaul2branchcub_10_2_SolveCSP_bindingAndBlackFBBBBBB(
			whileaul2branchcub _this, Match match, Command x, Command y, Branch z, Branch i) {
		Object[] result_pattern_whileaul2branchcub_10_2_SolveCSP_binding = pattern_whileaul2branchcub_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, x, y, z, i);
		if (result_pattern_whileaul2branchcub_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileaul2branchcub_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whileaul2branchcub_10_2_SolveCSP_black = pattern_whileaul2branchcub_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileaul2branchcub_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, x, y, z, i };
			}
		}
		return null;
	}

	public static final boolean pattern_whileaul2branchcub_10_3_CheckCSP_expressionFBB(whileaul2branchcub _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileaul2branchcub_10_4_collectelementstobetranslated_blackBBBBB(Match match,
			Command x, Command y, Branch z, Branch i) {
		if (!x.equals(y)) {
			if (!i.equals(z)) {
				return new Object[] { match, x, y, z, i };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_10_4_collectelementstobetranslated_greenBBBBBFFFF(
			Match match, Command x, Command y, Branch z, Branch i) {
		EMoflonEdge z__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(z);
		String z__y____positive_name_prime = "positive";
		String y__z____next_name_prime = "next";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		z__y____positive.setSrc(z);
		z__y____positive.setTrg(y);
		match.getToBeTranslatedEdges().add(z__y____positive);
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		match.getToBeTranslatedEdges().add(y__z____next);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		z__y____positive.setName(z__y____positive_name_prime);
		y__z____next.setName(y__z____next_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		return new Object[] { match, x, y, z, i, z__y____positive, y__z____next, i__x____positive, i__z____negative };
	}

	public static final Object[] pattern_whileaul2branchcub_10_5_collectcontextelements_blackBBBBB(Match match,
			Command x, Command y, Branch z, Branch i) {
		if (!x.equals(y)) {
			if (!i.equals(z)) {
				return new Object[] { match, x, y, z, i };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_10_5_collectcontextelements_greenBB(Match match, Branch i) {
		match.getContextNodes().add(i);
		return new Object[] { match, i };
	}

	public static final void pattern_whileaul2branchcub_10_6_registerobjectstomatch_expressionBBBBBB(
			whileaul2branchcub _this, Match match, Command x, Command y, Branch z, Branch i) {
		_this.registerObjectsToMatch_BWD(match, x, y, z, i);

	}

	public static final boolean pattern_whileaul2branchcub_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileaul2branchcub_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileaul2branchcub_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("x");
		EObject _localVariable_1 = isApplicableMatch.getObject("y");
		EObject _localVariable_2 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_3 = isApplicableMatch.getObject("z");
		EObject _localVariable_4 = isApplicableMatch.getObject("w");
		EObject _localVariable_5 = isApplicableMatch.getObject("i");
		EObject tmpX = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpW2i = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		EObject tmpW = _localVariable_4;
		EObject tmpI = _localVariable_5;
		if (tmpX instanceof Command) {
			Command x = (Command) tmpX;
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (tmpW2i instanceof S2B) {
					S2B w2i = (S2B) tmpW2i;
					if (tmpZ instanceof Branch) {
						Branch z = (Branch) tmpZ;
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							if (tmpI instanceof Branch) {
								Branch i = (Branch) tmpI;
								return new Object[] { x, y, w2i, z, w, i, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_11_1_performtransformation_blackBBBBBBFBB(Command x,
			Command y, S2B w2i, Branch z, While w, Branch i, whileaul2branchcub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!x.equals(y)) {
			if (!i.equals(z)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { x, y, w2i, z, w, i, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			whileaul2branchcub _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whileaul2branchcub_11_1_performtransformation_binding = pattern_whileaul2branchcub_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_whileaul2branchcub_11_1_performtransformation_binding != null) {
			Command x = (Command) result_pattern_whileaul2branchcub_11_1_performtransformation_binding[0];
			Command y = (Command) result_pattern_whileaul2branchcub_11_1_performtransformation_binding[1];
			S2B w2i = (S2B) result_pattern_whileaul2branchcub_11_1_performtransformation_binding[2];
			Branch z = (Branch) result_pattern_whileaul2branchcub_11_1_performtransformation_binding[3];
			While w = (While) result_pattern_whileaul2branchcub_11_1_performtransformation_binding[4];
			Branch i = (Branch) result_pattern_whileaul2branchcub_11_1_performtransformation_binding[5];

			Object[] result_pattern_whileaul2branchcub_11_1_performtransformation_black = pattern_whileaul2branchcub_11_1_performtransformation_blackBBBBBBFBB(
					x, y, w2i, z, w, i, _this, isApplicableMatch);
			if (result_pattern_whileaul2branchcub_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileaul2branchcub_11_1_performtransformation_black[6];

				return new Object[] { x, y, w2i, z, w, i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_11_1_performtransformation_greenFFBFFBBBFF(Command x,
			Command y, Branch z, While w) {
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		c2z.setTarget(z);
		b2y.setTarget(y);
		w.setFirst(a);
		a2x.setTarget(x);
		a2x.setSource(a);
		b2y.setSource(b);
		w.setNext(c);
		c2z.setSource(c);
		c.setFirst(b);
		c.setLast(b);
		return new Object[] { c2z, b2y, x, a, a2x, y, z, w, b, c };
	}

	public static final Object[] pattern_whileaul2branchcub_11_2_collecttranslatedelements_blackBBBBBBBBB(S2B c2z,
			S2N b2y, Command x, Assignment a, S2N a2x, Command y, Branch z, Assignment b, While c) {
		if (!x.equals(y)) {
			if (!a.equals(b)) {
				if (!a2x.equals(b2y)) {
					return new Object[] { c2z, b2y, x, a, a2x, y, z, b, c };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_11_2_collecttranslatedelements_greenFBBBBBBBBB(S2B c2z,
			S2N b2y, Command x, Assignment a, S2N a2x, Command y, Branch z, Assignment b, While c) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getCreatedElements().add(c);
		return new Object[] { ruleresult, c2z, b2y, x, a, a2x, y, z, b, c };
	}

	public static final Object[] pattern_whileaul2branchcub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject c2z, EObject b2y, EObject x, EObject a, EObject a2x, EObject y,
			EObject w2i, EObject z, EObject w, EObject b, EObject i, EObject c) {
		if (!c2z.equals(x)) {
			if (!c2z.equals(y)) {
				if (!c2z.equals(w2i)) {
					if (!c2z.equals(z)) {
						if (!c2z.equals(w)) {
							if (!c2z.equals(i)) {
								if (!b2y.equals(c2z)) {
									if (!b2y.equals(x)) {
										if (!b2y.equals(y)) {
											if (!b2y.equals(w2i)) {
												if (!b2y.equals(z)) {
													if (!b2y.equals(w)) {
														if (!b2y.equals(i)) {
															if (!b2y.equals(c)) {
																if (!x.equals(y)) {
																	if (!x.equals(z)) {
																		if (!a.equals(c2z)) {
																			if (!a.equals(b2y)) {
																				if (!a.equals(x)) {
																					if (!a.equals(a2x)) {
																						if (!a.equals(y)) {
																							if (!a.equals(w2i)) {
																								if (!a.equals(z)) {
																									if (!a.equals(w)) {
																										if (!a.equals(
																												b)) {
																											if (!a.equals(
																													i)) {
																												if (!a.equals(
																														c)) {
																													if (!a2x.equals(
																															c2z)) {
																														if (!a2x.equals(
																																b2y)) {
																															if (!a2x.equals(
																																	x)) {
																																if (!a2x.equals(
																																		y)) {
																																	if (!a2x.equals(
																																			w2i)) {
																																		if (!a2x.equals(
																																				z)) {
																																			if (!a2x.equals(
																																					w)) {
																																				if (!a2x.equals(
																																						b)) {
																																					if (!a2x.equals(
																																							i)) {
																																						if (!a2x.equals(
																																								c)) {
																																							if (!y.equals(
																																									z)) {
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
																																															w2i)) {
																																														if (!w.equals(
																																																z)) {
																																															if (!b.equals(
																																																	c2z)) {
																																																if (!b.equals(
																																																		b2y)) {
																																																	if (!b.equals(
																																																			x)) {
																																																		if (!b.equals(
																																																				y)) {
																																																			if (!b.equals(
																																																					w2i)) {
																																																				if (!b.equals(
																																																						z)) {
																																																					if (!b.equals(
																																																							w)) {
																																																						if (!b.equals(
																																																								i)) {
																																																							if (!b.equals(
																																																									c)) {
																																																								if (!i.equals(
																																																										x)) {
																																																									if (!i.equals(
																																																											y)) {
																																																										if (!i.equals(
																																																												w2i)) {
																																																											if (!i.equals(
																																																													z)) {
																																																												if (!i.equals(
																																																														w)) {
																																																													if (!c.equals(
																																																															c2z)) {
																																																														if (!c.equals(
																																																																x)) {
																																																															if (!c.equals(
																																																																	y)) {
																																																																if (!c.equals(
																																																																		w2i)) {
																																																																	if (!c.equals(
																																																																			z)) {
																																																																		if (!c.equals(
																																																																				w)) {
																																																																			if (!c.equals(
																																																																					i)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						c2z,
																																																																						b2y,
																																																																						x,
																																																																						a,
																																																																						a2x,
																																																																						y,
																																																																						w2i,
																																																																						z,
																																																																						w,
																																																																						b,
																																																																						i,
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
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whileaul2branchcub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject c2z, EObject b2y, EObject x, EObject a, EObject a2x, EObject y,
			EObject z, EObject w, EObject b, EObject i, EObject c) {
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileaul2branchcub";
		String a2x__x____target_name_prime = "target";
		String c2z__z____target_name_prime = "target";
		String b2y__y____target_name_prime = "target";
		String a2x__a____source_name_prime = "source";
		String w__c____next_name_prime = "next";
		String z__y____positive_name_prime = "positive";
		String y__z____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String b2y__b____source_name_prime = "source";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String c2z__c____source_name_prime = "source";
		String c__b____first_name_prime = "first";
		String c__b____last_name_prime = "last";
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		z__y____positive.setSrc(z);
		z__y____positive.setTrg(y);
		ruleresult.getTranslatedEdges().add(z__y____positive);
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		ruleresult.getTranslatedEdges().add(y__z____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c__b____first.setSrc(c);
		c__b____first.setTrg(b);
		ruleresult.getCreatedEdges().add(c__b____first);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(c__b____last);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		z__y____positive.setName(z__y____positive_name_prime);
		y__z____next.setName(y__z____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c__b____first.setName(c__b____first_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		return new Object[] { ruleresult, c2z, b2y, x, a, a2x, y, z, w, b, i, c, a2x__x____target, c2z__z____target,
				b2y__y____target, a2x__a____source, w__c____next, z__y____positive, y__z____next, w__a____first,
				b2y__b____source, i__x____positive, i__z____negative, c2z__c____source, c__b____first, c__b____last };
	}

	public static final void pattern_whileaul2branchcub_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whileaul2branchcub _this, PerformRuleResult ruleresult, EObject c2z, EObject b2y, EObject x, EObject a,
			EObject a2x, EObject y, EObject w2i, EObject z, EObject w, EObject b, EObject i, EObject c) {
		_this.registerObjects_BWD(ruleresult, c2z, b2y, x, a, a2x, y, w2i, z, w, b, i, c);

	}

	public static final PerformRuleResult pattern_whileaul2branchcub_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileaul2branchcub_12_1_preparereturnvalue_bindingFB(
			whileaul2branchcub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_12_1_preparereturnvalue_blackFBB(EClass eClass,
			whileaul2branchcub _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_12_1_preparereturnvalue_bindingAndBlackFFB(
			whileaul2branchcub _this) {
		Object[] result_pattern_whileaul2branchcub_12_1_preparereturnvalue_binding = pattern_whileaul2branchcub_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileaul2branchcub_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whileaul2branchcub_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileaul2branchcub_12_1_preparereturnvalue_black = pattern_whileaul2branchcub_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whileaul2branchcub_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whileaul2branchcub_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whileaul2branchcub";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whileaul2branchcub_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("x");
		EObject _localVariable_1 = match.getObject("y");
		EObject _localVariable_2 = match.getObject("z");
		EObject _localVariable_3 = match.getObject("i");
		EObject tmpX = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpI = _localVariable_3;
		if (tmpX instanceof Command) {
			Command x = (Command) tmpX;
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (tmpZ instanceof Branch) {
					Branch z = (Branch) tmpZ;
					if (tmpI instanceof Branch) {
						Branch i = (Branch) tmpI;
						return new Object[] { x, y, z, i, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileaul2branchcub_12_2_corematch_blackBBFBFBB(Command x, Command y,
			Branch z, Branch i, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(y)) {
			if (!i.equals(z)) {
				for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class,
						"target")) {
					Statement tmpW = w2i.getSource();
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						_result.add(new Object[] { x, y, w2i, z, w, i, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileaul2branchcub_12_3_findcontext_blackBBBBBB(Command x, Command y,
			S2B w2i, Branch z, While w, Branch i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(y)) {
			if (!i.equals(z)) {
				if (w.equals(w2i.getSource())) {
					if (y.equals(z.getPositive())) {
						if (z.equals(y.getNext())) {
							if (x.equals(i.getPositive())) {
								if (i.equals(w2i.getTarget())) {
									if (z.equals(i.getNegative())) {
										_result.add(new Object[] { x, y, w2i, z, w, i });
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

	public static final Object[] pattern_whileaul2branchcub_12_3_findcontext_greenBBBBBBFFFFFFF(Command x, Command y,
			S2B w2i, Branch z, While w, Branch i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w2i__w____source_name_prime = "source";
		String z__y____positive_name_prime = "positive";
		String y__z____next_name_prime = "next";
		String i__x____positive_name_prime = "positive";
		String w2i__i____target_name_prime = "target";
		String i__z____negative_name_prime = "negative";
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(i);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		z__y____positive.setSrc(z);
		z__y____positive.setTrg(y);
		isApplicableMatch.getAllContextElements().add(z__y____positive);
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
		z__y____positive.setName(z__y____positive_name_prime);
		y__z____next.setName(y__z____next_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		return new Object[] { x, y, w2i, z, w, i, isApplicableMatch, w2i__w____source, z__y____positive, y__z____next,
				i__x____positive, w2i__i____target, i__z____negative };
	}

	public static final Object[] pattern_whileaul2branchcub_12_4_solveCSP_bindingFBBBBBBBB(whileaul2branchcub _this,
			IsApplicableMatch isApplicableMatch, Command x, Command y, S2B w2i, Branch z, While w, Branch i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, x, y, w2i, z, w, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, x, y, w2i, z, w, i };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileaul2branchcub_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			whileaul2branchcub _this, IsApplicableMatch isApplicableMatch, Command x, Command y, S2B w2i, Branch z,
			While w, Branch i) {
		Object[] result_pattern_whileaul2branchcub_12_4_solveCSP_binding = pattern_whileaul2branchcub_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, x, y, w2i, z, w, i);
		if (result_pattern_whileaul2branchcub_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileaul2branchcub_12_4_solveCSP_binding[0];

			Object[] result_pattern_whileaul2branchcub_12_4_solveCSP_black = pattern_whileaul2branchcub_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileaul2branchcub_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, x, y, w2i, z, w, i };
			}
		}
		return null;
	}

	public static final boolean pattern_whileaul2branchcub_12_5_checkCSP_expressionFBB(whileaul2branchcub _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileaul2branchcub_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whileaul2branchcub_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whileaul2branchcub";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whileaul2branchcub_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileaul2branchcub_20_1_preparereturnvalue_bindingFB(
			whileaul2branchcub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whileaul2branchcub _this) {
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

	public static final Object[] pattern_whileaul2branchcub_20_1_preparereturnvalue_bindingAndBlackFFBF(
			whileaul2branchcub _this) {
		Object[] result_pattern_whileaul2branchcub_20_1_preparereturnvalue_binding = pattern_whileaul2branchcub_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileaul2branchcub_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whileaul2branchcub_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileaul2branchcub_20_1_preparereturnvalue_black = pattern_whileaul2branchcub_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whileaul2branchcub_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whileaul2branchcub_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whileaul2branchcub_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_0B(Command x) {
		for (Graph __DEC_x_root_288284 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_1BBB(Command x,
			Branch z, Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_x_positive_53672 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!z.equals(__DEC_x_positive_53672)) {
					if (!i.equals(__DEC_x_positive_53672)) {
						return new Object[] { x, z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_2BBB(Command x,
			Branch z, Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_x_negative_555195 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!z.equals(__DEC_x_negative_555195)) {
					if (!i.equals(__DEC_x_negative_555195)) {
						return new Object[] { x, z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_209126 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_4BBB(Command y,
			Branch z, Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_y_positive_239621 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!z.equals(__DEC_y_positive_239621)) {
					if (!i.equals(__DEC_y_positive_239621)) {
						return new Object[] { y, z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_5BBB(Command y,
			Branch z, Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_y_negative_747702 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!z.equals(__DEC_y_negative_747702)) {
					if (!i.equals(__DEC_y_negative_747702)) {
						return new Object[] { y, z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_6B(Branch z) {
		for (Graph __DEC_z_root_150969 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_7BB(Branch z,
			Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_z_positive_32290 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!z.equals(__DEC_z_positive_32290)) {
					if (!i.equals(__DEC_z_positive_32290)) {
						return new Object[] { z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_8BB(Branch z,
			Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_z_negative_472860 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!z.equals(__DEC_z_negative_472860)) {
					if (!i.equals(__DEC_z_negative_472860)) {
						return new Object[] { z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_9BB(Branch z,
			Command x) {
		if (x.equals(z.getPositive())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_10BB(Branch z,
			Command x) {
		if (x.equals(z.getNegative())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_11BB(Branch i,
			Command x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_12BB(Branch i,
			Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_13BB(Branch z,
			Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_14BB(Branch i,
			Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileaul2branchcub_20_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_positive) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpZ = _edge_positive.getSrc();
		if (tmpZ instanceof Branch) {
			Branch z = (Branch) tmpZ;
			EObject tmpY = _edge_positive.getTrg();
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (y.equals(z.getPositive())) {
					if (z.equals(y.getNext())) {
						if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_6B(z) == null) {
							if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_3B(y) == null) {
								if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_13BB(z, y) == null) {
									for (Branch i : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(z, Branch.class, "negative")) {
										if (!i.equals(z)) {
											Node tmpX = i.getPositive();
											if (tmpX instanceof Command) {
												Command x = (Command) tmpX;
												if (!x.equals(y)) {
													if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_4BBB(
															y, z, i) == null) {
														if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_5BBB(
																y, z, i) == null) {
															if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_7BB(
																	z, i) == null) {
																if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_8BB(
																		z, i) == null) {
																	if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_12BB(
																			i, y) == null) {
																		if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_14BB(
																				i, y) == null) {
																			if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_0B(
																					x) == null) {
																				if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_1BBB(
																						x, z, i) == null) {
																					if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_2BBB(
																							x, z, i) == null) {
																						if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_9BB(
																								z, x) == null) {
																							if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_10BB(
																									z, x) == null) {
																								if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_11BB(
																										i, x) == null) {
																									_result.add(
																											new Object[] {
																													x,
																													y,
																													z,
																													i,
																													_edge_positive });
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}

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

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whileaul2branchcub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			whileaul2branchcub _this, Match match, Command x, Command y, Branch z, Branch i) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, x, y, z, i);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whileaul2branchcub_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whileaul2branchcub _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileaul2branchcub_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whileaul2branchcub_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whileaul2branchcub_21_1_preparereturnvalue_bindingFB(
			whileaul2branchcub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whileaul2branchcub _this) {
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

	public static final Object[] pattern_whileaul2branchcub_21_1_preparereturnvalue_bindingAndBlackFFBF(
			whileaul2branchcub _this) {
		Object[] result_pattern_whileaul2branchcub_21_1_preparereturnvalue_binding = pattern_whileaul2branchcub_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileaul2branchcub_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whileaul2branchcub_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileaul2branchcub_21_1_preparereturnvalue_black = pattern_whileaul2branchcub_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whileaul2branchcub_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whileaul2branchcub_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whileaul2branchcub_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_0B(Assignment a) {
		for (Decision __DEC_a_positive_450816 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_1B(Assignment a) {
		for (Decision __DEC_a_negative_961522 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_2BBB(Assignment a,
			While w, While c) {
		if (!c.equals(w)) {
			for (While __DEC_a_last_381887 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!w.equals(__DEC_a_last_381887)) {
					if (!c.equals(__DEC_a_last_381887)) {
						return new Object[] { a, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_3B(Assignment a) {
		for (Program __DEC_a_first_50214 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_4B(Assignment b) {
		for (Decision __DEC_b_positive_409368 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_5B(Assignment b) {
		for (Decision __DEC_b_negative_170100 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_6BBB(Assignment b,
			While w, While c) {
		if (!c.equals(w)) {
			for (While __DEC_b_last_774062 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!w.equals(__DEC_b_last_774062)) {
					if (!c.equals(__DEC_b_last_774062)) {
						return new Object[] { b, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_7B(Assignment b) {
		for (Program __DEC_b_first_805154 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_8B(While c) {
		for (Decision __DEC_c_positive_926963 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_9B(While c) {
		for (Decision __DEC_c_negative_56693 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_10BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_first_920903 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!c.equals(__DEC_c_first_920903)) {
					if (!w.equals(__DEC_c_first_920903)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_11BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_last_673392 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!c.equals(__DEC_c_last_673392)) {
					if (!w.equals(__DEC_c_last_673392)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_12B(While c) {
		for (Program __DEC_c_first_533788 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_13BB(While w,
			Assignment a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_14BB(While c,
			Assignment a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_15BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_16BB(While w, While c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_17BB(While w, While c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileaul2branchcub_21_2_testcorematchandDECs_blackFFFFB(
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
						if (tmpA instanceof Assignment) {
							Assignment a = (Assignment) tmpA;
							Statement tmpB = c.getFirst();
							if (tmpB instanceof Assignment) {
								Assignment b = (Assignment) tmpB;
								if (!a.equals(b)) {
									if (b.equals(c.getLast())) {
										if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_8B(
												c) == null) {
											if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_9B(
													c) == null) {
												if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_10BB(
														c, w) == null) {
													if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_11BB(
															c, w) == null) {
														if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_12B(
																c) == null) {
															if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_16BB(
																	w, c) == null) {
																if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_17BB(
																		w, c) == null) {
																	if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_0B(
																			a) == null) {
																		if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_1B(
																				a) == null) {
																			if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_2BBB(
																					a, w, c) == null) {
																				if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_3B(
																						a) == null) {
																					if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_13BB(
																							w, a) == null) {
																						if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_14BB(
																								c, a) == null) {
																							if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_4B(
																									b) == null) {
																								if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_5B(
																										b) == null) {
																									if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_6BBB(
																											b, w,
																											c) == null) {
																										if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_7B(
																												b) == null) {
																											if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_15BB(
																													w,
																													b) == null) {
																												_result.add(
																														new Object[] {
																																a,
																																w,
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

		return _result;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whileaul2branchcub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			whileaul2branchcub _this, Match match, Assignment a, While w, Assignment b, While c) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, a, w, b, c);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whileaul2branchcub_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whileaul2branchcub _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileaul2branchcub_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whileaul2branchcub_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whileaul2branchcub_24_1_prepare_blackB(whileaul2branchcub _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whileaul2branchcub_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_whileaul2branchcub_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("x");
		EObject _localVariable_1 = sourceMatch.getObject("a");
		EObject _localVariable_2 = targetMatch.getObject("y");
		EObject _localVariable_3 = targetMatch.getObject("z");
		EObject _localVariable_4 = sourceMatch.getObject("w");
		EObject _localVariable_5 = sourceMatch.getObject("b");
		EObject _localVariable_6 = targetMatch.getObject("i");
		EObject _localVariable_7 = sourceMatch.getObject("c");
		EObject tmpX = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpY = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		EObject tmpW = _localVariable_4;
		EObject tmpB = _localVariable_5;
		EObject tmpI = _localVariable_6;
		EObject tmpC = _localVariable_7;
		if (tmpX instanceof Command) {
			Command x = (Command) tmpX;
			if (tmpA instanceof Assignment) {
				Assignment a = (Assignment) tmpA;
				if (tmpY instanceof Command) {
					Command y = (Command) tmpY;
					if (tmpZ instanceof Branch) {
						Branch z = (Branch) tmpZ;
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							if (tmpB instanceof Assignment) {
								Assignment b = (Assignment) tmpB;
								if (tmpI instanceof Branch) {
									Branch i = (Branch) tmpI;
									if (tmpC instanceof While) {
										While c = (While) tmpC;
										return new Object[] { x, a, y, z, w, b, i, c, targetMatch, sourceMatch };
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

	public static final Object[] pattern_whileaul2branchcub_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Command x,
			Assignment a, Command y, Branch z, While w, Assignment b, Branch i, While c, Match sourceMatch,
			Match targetMatch) {
		if (!x.equals(y)) {
			if (!a.equals(b)) {
				if (!i.equals(z)) {
					if (!c.equals(w)) {
						if (!sourceMatch.equals(targetMatch)) {
							return new Object[] { x, a, y, z, w, b, i, c, sourceMatch, targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding = pattern_whileaul2branchcub_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding != null) {
			Command x = (Command) result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding[0];
			Assignment a = (Assignment) result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding[1];
			Command y = (Command) result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding[2];
			Branch z = (Branch) result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding[3];
			While w = (While) result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding[4];
			Assignment b = (Assignment) result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding[5];
			Branch i = (Branch) result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding[6];
			While c = (While) result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_black = pattern_whileaul2branchcub_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					x, a, y, z, w, b, i, c, sourceMatch, targetMatch);
			if (result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { x, a, y, z, w, b, i, c, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_24_3_solvecsp_bindingFBBBBBBBBBBB(whileaul2branchcub _this,
			Command x, Assignment a, Command y, Branch z, While w, Assignment b, Branch i, While c, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(x, a, y, z, w, b, i, c, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, x, a, y, z, w, b, i, c, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileaul2branchcub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			whileaul2branchcub _this, Command x, Assignment a, Command y, Branch z, While w, Assignment b, Branch i,
			While c, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileaul2branchcub_24_3_solvecsp_binding = pattern_whileaul2branchcub_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, x, a, y, z, w, b, i, c, sourceMatch, targetMatch);
		if (result_pattern_whileaul2branchcub_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whileaul2branchcub_24_3_solvecsp_binding[0];

			Object[] result_pattern_whileaul2branchcub_24_3_solvecsp_black = pattern_whileaul2branchcub_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whileaul2branchcub_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, x, a, y, z, w, b, i, c, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whileaul2branchcub_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileaul2branchcub_24_5_matchcorrcontext_blackFBBBB(While w,
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

	public static final Object[] pattern_whileaul2branchcub_24_5_matchcorrcontext_greenBBBF(S2B w2i, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "whileaul2branchcub";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(w2i);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { w2i, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_whileaul2branchcub_24_6_createcorrespondence_blackBBBBBBBBB(Command x,
			Assignment a, Command y, Branch z, While w, Assignment b, Branch i, While c, CCMatch ccMatch) {
		if (!x.equals(y)) {
			if (!a.equals(b)) {
				if (!i.equals(z)) {
					if (!c.equals(w)) {
						return new Object[] { x, a, y, z, w, b, i, c, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_24_6_createcorrespondence_greenFFBBFBBBBB(Command x,
			Assignment a, Command y, Branch z, Assignment b, While c, CCMatch ccMatch) {
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		c2z.setTarget(z);
		c2z.setSource(c);
		ccMatch.getCreateCorr().add(c2z);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { c2z, b2y, x, a, a2x, y, z, b, c, ccMatch };
	}

	public static final Object[] pattern_whileaul2branchcub_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_whileaul2branchcub_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "whileaul2branchcub";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_whileaul2branchcub_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_0B(Assignment a) {
		for (Decision __DEC_a_positive_852857 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_1B(Assignment a) {
		for (Decision __DEC_a_negative_245657 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_2BBB(Assignment a, While w,
			While c) {
		if (!c.equals(w)) {
			for (While __DEC_a_last_72359 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!w.equals(__DEC_a_last_72359)) {
					if (!c.equals(__DEC_a_last_72359)) {
						return new Object[] { a, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_3B(Assignment a) {
		for (Program __DEC_a_first_437284 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_4B(Assignment b) {
		for (Decision __DEC_b_positive_156205 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_5B(Assignment b) {
		for (Decision __DEC_b_negative_515028 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_6BBB(Assignment b, While w,
			While c) {
		if (!c.equals(w)) {
			for (While __DEC_b_last_579381 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!w.equals(__DEC_b_last_579381)) {
					if (!c.equals(__DEC_b_last_579381)) {
						return new Object[] { b, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_7B(Assignment b) {
		for (Program __DEC_b_first_515623 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_8B(While c) {
		for (Decision __DEC_c_positive_770924 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_9B(While c) {
		for (Decision __DEC_c_negative_359598 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_10BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_first_518618 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!c.equals(__DEC_c_first_518618)) {
					if (!w.equals(__DEC_c_first_518618)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_11BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_last_117260 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!c.equals(__DEC_c_last_117260)) {
					if (!w.equals(__DEC_c_last_117260)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_12B(While c) {
		for (Program __DEC_c_first_179225 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_13BB(While w, Assignment a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_14BB(While c, Assignment a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_15BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_16BB(While w, While c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_17BB(While w, While c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_blackBBBB(Assignment a, While w,
			Assignment b, While c) {
		if (!a.equals(b)) {
			if (!c.equals(w)) {
				if (c.equals(w.getNext())) {
					if (a.equals(w.getFirst())) {
						if (b.equals(c.getFirst())) {
							if (b.equals(c.getLast())) {
								if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_0B(a) == null) {
									if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_1B(a) == null) {
										if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_2BBB(a, w,
												c) == null) {
											if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_3B(
													a) == null) {
												if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_4B(
														b) == null) {
													if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_5B(
															b) == null) {
														if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_6BBB(
																b, w, c) == null) {
															if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_7B(
																	b) == null) {
																if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_8B(
																		c) == null) {
																	if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_9B(
																			c) == null) {
																		if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_10BB(
																				c, w) == null) {
																			if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_11BB(
																					c, w) == null) {
																				if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_12B(
																						c) == null) {
																					if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_13BB(
																							w, a) == null) {
																						if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_14BB(
																								c, a) == null) {
																							if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_15BB(
																									w, b) == null) {
																								if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_16BB(
																										w, c) == null) {
																									if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_17BB(
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

	public static final boolean pattern_whileaul2branchcub_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileaul2branchcub_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_0B(Command x) {
		for (Graph __DEC_x_root_623264 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_1BBB(Command x, Branch z,
			Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_x_positive_211554 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!z.equals(__DEC_x_positive_211554)) {
					if (!i.equals(__DEC_x_positive_211554)) {
						return new Object[] { x, z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_2BBB(Command x, Branch z,
			Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_x_negative_554137 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!z.equals(__DEC_x_negative_554137)) {
					if (!i.equals(__DEC_x_negative_554137)) {
						return new Object[] { x, z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_340148 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_4BBB(Command y, Branch z,
			Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_y_positive_686023 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!z.equals(__DEC_y_positive_686023)) {
					if (!i.equals(__DEC_y_positive_686023)) {
						return new Object[] { y, z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_5BBB(Command y, Branch z,
			Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_y_negative_328749 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!z.equals(__DEC_y_negative_328749)) {
					if (!i.equals(__DEC_y_negative_328749)) {
						return new Object[] { y, z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_6B(Branch z) {
		for (Graph __DEC_z_root_305653 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_7BB(Branch z, Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_z_positive_974110 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!z.equals(__DEC_z_positive_974110)) {
					if (!i.equals(__DEC_z_positive_974110)) {
						return new Object[] { z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_8BB(Branch z, Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_z_negative_461920 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!z.equals(__DEC_z_negative_461920)) {
					if (!i.equals(__DEC_z_negative_461920)) {
						return new Object[] { z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_9BB(Branch z, Command x) {
		if (x.equals(z.getPositive())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_10BB(Branch z, Command x) {
		if (x.equals(z.getNegative())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_11BB(Branch i, Command x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_12BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_13BB(Branch z, Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_14BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_blackBBBB(Command x, Command y,
			Branch z, Branch i) {
		if (!x.equals(y)) {
			if (!i.equals(z)) {
				if (y.equals(z.getPositive())) {
					if (z.equals(y.getNext())) {
						if (x.equals(i.getPositive())) {
							if (z.equals(i.getNegative())) {
								if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_0B(x) == null) {
									if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_1BBB(x, z,
											i) == null) {
										if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_2BBB(x, z,
												i) == null) {
											if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_3B(
													y) == null) {
												if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_4BBB(y, z,
														i) == null) {
													if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_5BBB(
															y, z, i) == null) {
														if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_6B(
																z) == null) {
															if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_7BB(
																	z, i) == null) {
																if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_8BB(
																		z, i) == null) {
																	if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_9BB(
																			z, x) == null) {
																		if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_10BB(
																				z, x) == null) {
																			if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_11BB(
																					i, x) == null) {
																				if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_12BB(
																						i, y) == null) {
																					if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_13BB(
																							z, y) == null) {
																						if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_14BB(
																								i, y) == null) {
																							return new Object[] { x, y,
																									z, i };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_whileaul2branchcub_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileaul2branchcub_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileaul2branchcub_29_1_createresult_blackB(whileaul2branchcub _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whileaul2branchcub_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_whileaul2branchcub_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileaul2branchcub_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_whileaul2branchcub_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									w2i) == null) {
								if (pattern_whileaul2branchcub_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										w) == null) {
									if (pattern_whileaul2branchcub_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_whileaul2branchcub_29_3_solveCSP_bindingFBBBBBB(whileaul2branchcub _this,
			IsApplicableMatch isApplicableMatch, S2B w2i, While w, Branch i, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, w2i, w, i, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w2i, w, i, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileaul2branchcub_29_3_solveCSP_bindingAndBlackFBBBBBB(
			whileaul2branchcub _this, IsApplicableMatch isApplicableMatch, S2B w2i, While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whileaul2branchcub_29_3_solveCSP_binding = pattern_whileaul2branchcub_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, w2i, w, i, ruleResult);
		if (result_pattern_whileaul2branchcub_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileaul2branchcub_29_3_solveCSP_binding[0];

			Object[] result_pattern_whileaul2branchcub_29_3_solveCSP_black = pattern_whileaul2branchcub_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whileaul2branchcub_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w2i, w, i, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whileaul2branchcub_29_4_checkCSP_expressionFBB(whileaul2branchcub _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileaul2branchcub_29_5_checknacs_blackBBB(S2B w2i, While w, Branch i) {
		return new Object[] { w2i, w, i };
	}

	public static final Object[] pattern_whileaul2branchcub_29_6_perform_blackBBBB(S2B w2i, While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { w2i, w, i, ruleResult };
	}

	public static final Object[] pattern_whileaul2branchcub_29_6_perform_greenFFFFFFFBFBFB(While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command x = ControlflowFactory.eINSTANCE.createCommand();
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(c2z);
		ruleResult.getCorrObjects().add(b2y);
		i.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		w.setFirst(a);
		ruleResult.getSourceObjects().add(a);
		a2x.setTarget(x);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		b2y.setTarget(y);
		ruleResult.getTargetObjects().add(y);
		c2z.setTarget(z);
		z.setPositive(y);
		y.setNext(z);
		i.setNegative(z);
		ruleResult.getTargetObjects().add(z);
		b2y.setSource(b);
		ruleResult.getSourceObjects().add(b);
		w.setNext(c);
		c2z.setSource(c);
		c.setFirst(b);
		c.setLast(b);
		ruleResult.getSourceObjects().add(c);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { c2z, b2y, x, a, a2x, y, z, w, b, i, c, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whileaul2branchcub_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whileaul2branchcubImpl
