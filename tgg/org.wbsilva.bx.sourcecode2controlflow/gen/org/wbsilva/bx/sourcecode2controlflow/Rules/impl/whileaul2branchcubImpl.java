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
	public boolean isAppropriate_FWD(Match match, Assignment a, While w, While c, Assignment b) {

		Object[] result1_black = whileaul2branchcubImpl.pattern_whileaul2branchcub_0_1_initialbindings_blackBBBBBB(this,
				match, a, w, c, b);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[c] = " + c + ", "
					+ "[b] = " + b + ".");
		}

		Object[] result2_bindingAndBlack = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, a, w, c, b);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[c] = " + c + ", "
					+ "[b] = " + b + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileaul2branchcubImpl.pattern_whileaul2branchcub_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileaul2branchcubImpl
					.pattern_whileaul2branchcub_0_4_collectelementstobetranslated_blackBBBBB(match, a, w, c, b);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[b] = " + b + ".");
			}
			whileaul2branchcubImpl.pattern_whileaul2branchcub_0_4_collectelementstobetranslated_greenBBBBBFFFF(match, a,
					w, c, b);
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge c__b____last = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge c__b____first = (EMoflonEdge) result4_green[8];

			Object[] result5_black = whileaul2branchcubImpl
					.pattern_whileaul2branchcub_0_5_collectcontextelements_blackBBBBB(match, a, w, c, b);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[b] = " + b + ".");
			}
			whileaul2branchcubImpl.pattern_whileaul2branchcub_0_5_collectcontextelements_greenBB(match, w);

			// 
			whileaul2branchcubImpl.pattern_whileaul2branchcub_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					a, w, c, b);
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
		While w = (While) result1_bindingAndBlack[1];
		While c = (While) result1_bindingAndBlack[2];
		S2B w2i = (S2B) result1_bindingAndBlack[3];
		Assignment b = (Assignment) result1_bindingAndBlack[4];
		Branch i = (Branch) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_1_1_performtransformation_greenBBFFBFFFFB(a, c, b, i);
		Branch z = (Branch) result1_green[2];
		S2B c2z = (S2B) result1_green[3];
		Command y = (Command) result1_green[5];
		S2N b2y = (S2N) result1_green[6];
		S2N a2x = (S2N) result1_green[7];
		Command x = (Command) result1_green[8];

		Object[] result2_black = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_1_2_collecttranslatedelements_blackBBBBBBBBB(a, c, z, c2z, b, y, b2y, a2x,
						x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a] = " + a + ", " + "[c] = " + c
					+ ", " + "[z] = " + z + ", " + "[c2z] = " + c2z + ", " + "[b] = " + b + ", " + "[y] = " + y + ", "
					+ "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ".");
		}
		Object[] result2_green = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_1_2_collecttranslatedelements_greenFBBBBBBBBB(a, c, z, c2z, b, y, b2y, a2x,
						x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, a, w, c, w2i, z, c2z,
						b, y, b2y, a2x, x, i);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[w2i] = " + w2i + ", "
					+ "[z] = " + z + ", " + "[c2z] = " + c2z + ", " + "[b] = " + b + ", " + "[y] = " + y + ", "
					+ "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", " + "[i] = " + i + ".");
		}
		whileaul2branchcubImpl.pattern_whileaul2branchcub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, a, w, c, z, c2z, b, y, b2y, a2x, x, i);
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge y__z____next = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge z__y____positive = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge c__b____last = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge c__b____first = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[25];

		// 
		// 
		whileaul2branchcubImpl.pattern_whileaul2branchcub_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
				a, w, c, w2i, z, c2z, b, y, b2y, a2x, x, i);
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
		While c = (While) result2_binding[2];
		Assignment b = (Assignment) result2_binding[3];
		for (Object[] result2_black : whileaul2branchcubImpl.pattern_whileaul2branchcub_2_2_corematch_blackBBBFBFB(a, w,
				c, b, match)) {
			S2B w2i = (S2B) result2_black[3];
			Branch i = (Branch) result2_black[5];
			// ForEach 
			for (Object[] result3_black : whileaul2branchcubImpl
					.pattern_whileaul2branchcub_2_3_findcontext_blackBBBBBB(a, w, c, w2i, b, i)) {
				Object[] result3_green = whileaul2branchcubImpl
						.pattern_whileaul2branchcub_2_3_findcontext_greenBBBBBBFFFFFFF(a, w, c, w2i, b, i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge c__b____last = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge c__b____first = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = whileaul2branchcubImpl
						.pattern_whileaul2branchcub_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, a, w,
								c, w2i, b, i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[a] = " + a + ", " + "[w] = " + w
							+ ", " + "[c] = " + c + ", " + "[w2i] = " + w2i + ", " + "[b] = " + b + ", " + "[i] = " + i
							+ ".");
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
	public void registerObjectsToMatch_FWD(Match match, Assignment a, While w, While c, Assignment b) {
		match.registerObject("a", a);
		match.registerObject("w", w);
		match.registerObject("c", c);
		match.registerObject("b", b);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment a, While w, While c, Assignment b) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Assignment a, While w, While c, S2B w2i,
			Assignment b, Branch i) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("b", b);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject a, EObject w, EObject c, EObject w2i,
			EObject z, EObject c2z, EObject b, EObject y, EObject b2y, EObject a2x, EObject x, EObject i) {
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("i", i);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass())
						.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch z, Command y, Command x, Branch i) {

		Object[] result1_black = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_10_1_initialbindings_blackBBBBBB(this, match, z, y, x, i);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[x] = " + x + ", "
					+ "[i] = " + i + ".");
		}

		Object[] result2_bindingAndBlack = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, z, y, x, i);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[x] = " + x + ", "
					+ "[i] = " + i + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileaul2branchcubImpl.pattern_whileaul2branchcub_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileaul2branchcubImpl
					.pattern_whileaul2branchcub_10_4_collectelementstobetranslated_blackBBBBB(match, z, y, x, i);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[z] = " + z + ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[i] = " + i + ".");
			}
			whileaul2branchcubImpl.pattern_whileaul2branchcub_10_4_collectelementstobetranslated_greenBBBBBFFFF(match,
					z, y, x, i);
			//nothing EMoflonEdge y__z____next = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge z__y____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[8];

			Object[] result5_black = whileaul2branchcubImpl
					.pattern_whileaul2branchcub_10_5_collectcontextelements_blackBBBBB(match, z, y, x, i);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[z] = " + z + ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[i] = " + i + ".");
			}
			whileaul2branchcubImpl.pattern_whileaul2branchcub_10_5_collectcontextelements_greenBB(match, i);

			// 
			whileaul2branchcubImpl.pattern_whileaul2branchcub_10_6_registerobjectstomatch_expressionBBBBBB(this, match,
					z, y, x, i);
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
		While w = (While) result1_bindingAndBlack[0];
		S2B w2i = (S2B) result1_bindingAndBlack[1];
		Branch z = (Branch) result1_bindingAndBlack[2];
		Command y = (Command) result1_bindingAndBlack[3];
		Command x = (Command) result1_bindingAndBlack[4];
		Branch i = (Branch) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_11_1_performtransformation_greenFBFBFFBFFB(w, z, y, x);
		Assignment a = (Assignment) result1_green[0];
		While c = (While) result1_green[2];
		S2B c2z = (S2B) result1_green[4];
		Assignment b = (Assignment) result1_green[5];
		S2N b2y = (S2N) result1_green[7];
		S2N a2x = (S2N) result1_green[8];

		Object[] result2_black = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_11_2_collecttranslatedelements_blackBBBBBBBBB(a, c, z, c2z, b, y, b2y, a2x,
						x);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a] = " + a + ", " + "[c] = " + c
					+ ", " + "[z] = " + z + ", " + "[c2z] = " + c2z + ", " + "[b] = " + b + ", " + "[y] = " + y + ", "
					+ "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ".");
		}
		Object[] result2_green = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_11_2_collecttranslatedelements_greenFBBBBBBBBB(a, c, z, c2z, b, y, b2y, a2x,
						x);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, a, w, c, w2i, z,
						c2z, b, y, b2y, a2x, x, i);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a] = " + a + ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[w2i] = " + w2i + ", "
					+ "[z] = " + z + ", " + "[c2z] = " + c2z + ", " + "[b] = " + b + ", " + "[y] = " + y + ", "
					+ "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", " + "[i] = " + i + ".");
		}
		whileaul2branchcubImpl.pattern_whileaul2branchcub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, a, w, c, z, c2z, b, y, b2y, a2x, x, i);
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge y__z____next = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge z__y____positive = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge c__b____last = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge c__b____first = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[25];

		// 
		// 
		whileaul2branchcubImpl.pattern_whileaul2branchcub_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this,
				ruleresult, a, w, c, w2i, z, c2z, b, y, b2y, a2x, x, i);
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
		Branch z = (Branch) result2_binding[0];
		Command y = (Command) result2_binding[1];
		Command x = (Command) result2_binding[2];
		Branch i = (Branch) result2_binding[3];
		for (Object[] result2_black : whileaul2branchcubImpl.pattern_whileaul2branchcub_12_2_corematch_blackFFBBBBB(z,
				y, x, i, match)) {
			While w = (While) result2_black[0];
			S2B w2i = (S2B) result2_black[1];
			// ForEach 
			for (Object[] result3_black : whileaul2branchcubImpl
					.pattern_whileaul2branchcub_12_3_findcontext_blackBBBBBB(w, w2i, z, y, x, i)) {
				Object[] result3_green = whileaul2branchcubImpl
						.pattern_whileaul2branchcub_12_3_findcontext_greenBBBBBBFFFFFFF(w, w2i, z, y, x, i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge y__z____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge z__y____positive = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = whileaul2branchcubImpl
						.pattern_whileaul2branchcub_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, w,
								w2i, z, y, x, i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[w2i] = "
							+ w2i + ", " + "[z] = " + z + ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[i] = "
							+ i + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Branch z, Command y, Command x, Branch i) {
		match.registerObject("z", z);
		match.registerObject("y", y);
		match.registerObject("x", x);
		match.registerObject("i", i);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch z, Command y, Command x, Branch i) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, While w, S2B w2i, Branch z, Command y,
			Command x, Branch i) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("x", x);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject a, EObject w, EObject c, EObject w2i,
			EObject z, EObject c2z, EObject b, EObject y, EObject b2y, EObject a2x, EObject x, EObject i) {
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("x", x);
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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_44(EMoflonEdge _edge_next) {

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
				.pattern_whileaul2branchcub_20_2_testcorematchandDECs_blackFFFFB(_edge_next)) {
			Branch z = (Branch) result2_black[0];
			Command y = (Command) result2_black[1];
			Command x = (Command) result2_black[2];
			Branch i = (Branch) result2_black[3];
			Object[] result2_green = whileaul2branchcubImpl
					.pattern_whileaul2branchcub_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileaul2branchcubImpl
					.pattern_whileaul2branchcub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, z, y, x, i)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_45(EMoflonEdge _edge_next) {

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
			While c = (While) result2_black[2];
			Assignment b = (Assignment) result2_black[3];
			Object[] result2_green = whileaul2branchcubImpl
					.pattern_whileaul2branchcub_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileaul2branchcubImpl
					.pattern_whileaul2branchcub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, a, w, c, b)) {
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
		Assignment a = (Assignment) result2_bindingAndBlack[0];
		While w = (While) result2_bindingAndBlack[1];
		While c = (While) result2_bindingAndBlack[2];
		Branch z = (Branch) result2_bindingAndBlack[3];
		Assignment b = (Assignment) result2_bindingAndBlack[4];
		Command y = (Command) result2_bindingAndBlack[5];
		Command x = (Command) result2_bindingAndBlack[6];
		Branch i = (Branch) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, a, w, c, z, b, y, x, i,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[a] = " + a + ", " + "[w] = " + w + ", " + "[c] = " + c + ", " + "[z] = " + z + ", " + "[b] = "
					+ b + ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[i] = " + i + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whileaul2branchcubImpl.pattern_whileaul2branchcub_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whileaul2branchcubImpl
					.pattern_whileaul2branchcub_24_5_matchcorrcontext_blackBFBBB(w, i, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[1];
				Object[] result5_green = whileaul2branchcubImpl
						.pattern_whileaul2branchcub_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whileaul2branchcubImpl
						.pattern_whileaul2branchcub_24_6_createcorrespondence_blackBBBBBBBBB(a, w, c, z, b, y, x, i,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a] = " + a + ", "
							+ "[w] = " + w + ", " + "[c] = " + c + ", " + "[z] = " + z + ", " + "[b] = " + b + ", "
							+ "[y] = " + y + ", " + "[x] = " + x + ", " + "[i] = " + i + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				whileaul2branchcubImpl.pattern_whileaul2branchcub_24_6_createcorrespondence_greenBBBFBBFFBB(a, c, z, b,
						y, x, ccMatch);
				//nothing S2B c2z = (S2B) result6_green[3];
				//nothing S2N b2y = (S2N) result6_green[6];
				//nothing S2N a2x = (S2N) result6_green[7];

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
	public CSP isApplicable_solveCsp_CC(Assignment a, While w, While c, Branch z, Assignment b, Command y, Command x,
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
	public boolean checkDEC_FWD(Assignment a, While w, While c, Assignment b) {// 
		Object[] result1_black = whileaul2branchcubImpl.pattern_whileaul2branchcub_27_1_matchtggpattern_blackBBBB(a, w,
				c, b);
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
	public boolean checkDEC_BWD(Branch z, Command y, Command x, Branch i) {// 
		Object[] result1_black = whileaul2branchcubImpl.pattern_whileaul2branchcub_28_1_matchtggpattern_blackBBBB(z, y,
				x, i);
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
			While w = (While) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			Branch i = (Branch) result2_black[3];

			Object[] result3_bindingAndBlack = whileaul2branchcubImpl
					.pattern_whileaul2branchcub_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, w, w2i, i,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w] = " + w + ", " + "[w2i] = " + w2i
						+ ", " + "[i] = " + i + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whileaul2branchcubImpl.pattern_whileaul2branchcub_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whileaul2branchcubImpl.pattern_whileaul2branchcub_29_5_checknacs_blackBBB(w,
						w2i, i);
				if (result5_black != null) {

					Object[] result6_black = whileaul2branchcubImpl.pattern_whileaul2branchcub_29_6_perform_blackBBBB(w,
							w2i, i, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w] = " + w + ", "
								+ "[w2i] = " + w2i + ", " + "[i] = " + i + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whileaul2branchcubImpl.pattern_whileaul2branchcub_29_6_perform_greenFBFFFFFFFFBB(w, i, ruleResult);
					//nothing Assignment a = (Assignment) result6_green[0];
					//nothing While c = (While) result6_green[2];
					//nothing Branch z = (Branch) result6_green[3];
					//nothing S2B c2z = (S2B) result6_green[4];
					//nothing Assignment b = (Assignment) result6_green[5];
					//nothing Command y = (Command) result6_green[6];
					//nothing S2N b2y = (S2N) result6_green[7];
					//nothing S2N a2x = (S2N) result6_green[8];
					//nothing Command x = (Command) result6_green[9];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, While w, S2B w2i, Branch i,
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
		isApplicableMatch.registerObject("w2i", w2i);
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
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_WHILE_WHILE_ASSIGNMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2),
					(While) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.WHILEAUL2BRANCHCUB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_WHILE_WHILE_ASSIGNMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (While) arguments.get(3), (Assignment) arguments.get(4));
			return null;
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_WHILE_WHILE_ASSIGNMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (While) arguments.get(3), (Assignment) arguments.get(4));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASSIGNMENT_WHILE_WHILE_S2B_ASSIGNMENT_BRANCH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (While) arguments.get(3), (S2B) arguments.get(4),
					(Assignment) arguments.get(5), (Branch) arguments.get(6));
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
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPROPRIATE_BWD__MATCH_BRANCH_COMMAND_COMMAND_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.WHILEAUL2BRANCHCUB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_COMMAND_COMMAND_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
			return null;
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_COMMAND_COMMAND_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_WHILE_S2B_BRANCH_COMMAND_COMMAND_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(S2B) arguments.get(2), (Branch) arguments.get(3), (Command) arguments.get(4),
					(Command) arguments.get(5), (Branch) arguments.get(6));
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
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_44__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_44((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_45__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_45((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPLICABLE_SOLVE_CSP_CC__ASSIGNMENT_WHILE_WHILE_BRANCH_ASSIGNMENT_COMMAND_COMMAND_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Assignment) arguments.get(0), (While) arguments.get(1),
					(While) arguments.get(2), (Branch) arguments.get(3), (Assignment) arguments.get(4),
					(Command) arguments.get(5), (Command) arguments.get(6), (Branch) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___CHECK_DEC_FWD__ASSIGNMENT_WHILE_WHILE_ASSIGNMENT:
			return checkDEC_FWD((Assignment) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3));
		case RulesPackage.WHILEAUL2BRANCHCUB___CHECK_DEC_BWD__BRANCH_COMMAND_COMMAND_BRANCH:
			return checkDEC_BWD((Branch) arguments.get(0), (Command) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.WHILEAUL2BRANCHCUB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILEAUL2BRANCHCUB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_WHILE_S2B_BRANCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (While) arguments.get(1),
					(S2B) arguments.get(2), (Branch) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILEAUL2BRANCHCUB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whileaul2branchcub_0_1_initialbindings_blackBBBBBB(whileaul2branchcub _this,
			Match match, Assignment a, While w, While c, Assignment b) {
		if (!a.equals(b)) {
			if (!c.equals(w)) {
				return new Object[] { _this, match, a, w, c, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_0_2_SolveCSP_bindingFBBBBBB(whileaul2branchcub _this,
			Match match, Assignment a, While w, While c, Assignment b) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, a, w, c, b);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, a, w, c, b };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileaul2branchcub_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			whileaul2branchcub _this, Match match, Assignment a, While w, While c, Assignment b) {
		Object[] result_pattern_whileaul2branchcub_0_2_SolveCSP_binding = pattern_whileaul2branchcub_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, a, w, c, b);
		if (result_pattern_whileaul2branchcub_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileaul2branchcub_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whileaul2branchcub_0_2_SolveCSP_black = pattern_whileaul2branchcub_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileaul2branchcub_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, a, w, c, b };
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
			Assignment a, While w, While c, Assignment b) {
		if (!a.equals(b)) {
			if (!c.equals(w)) {
				return new Object[] { match, a, w, c, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_0_4_collectelementstobetranslated_greenBBBBBFFFF(
			Match match, Assignment a, While w, While c, Assignment b) {
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(a);
		match.getToBeTranslatedNodes().add(c);
		match.getToBeTranslatedNodes().add(b);
		String w__c____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String c__b____last_name_prime = "last";
		String c__b____first_name_prime = "first";
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(c__b____last);
		c__b____first.setSrc(c);
		c__b____first.setTrg(b);
		match.getToBeTranslatedEdges().add(c__b____first);
		w__c____next.setName(w__c____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		c__b____first.setName(c__b____first_name_prime);
		return new Object[] { match, a, w, c, b, w__c____next, w__a____first, c__b____last, c__b____first };
	}

	public static final Object[] pattern_whileaul2branchcub_0_5_collectcontextelements_blackBBBBB(Match match,
			Assignment a, While w, While c, Assignment b) {
		if (!a.equals(b)) {
			if (!c.equals(w)) {
				return new Object[] { match, a, w, c, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whileaul2branchcub_0_6_registerobjectstomatch_expressionBBBBBB(
			whileaul2branchcub _this, Match match, Assignment a, While w, While c, Assignment b) {
		_this.registerObjectsToMatch_FWD(match, a, w, c, b);

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
		EObject _localVariable_1 = isApplicableMatch.getObject("w");
		EObject _localVariable_2 = isApplicableMatch.getObject("c");
		EObject _localVariable_3 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_4 = isApplicableMatch.getObject("b");
		EObject _localVariable_5 = isApplicableMatch.getObject("i");
		EObject tmpA = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpW2i = _localVariable_3;
		EObject tmpB = _localVariable_4;
		EObject tmpI = _localVariable_5;
		if (tmpA instanceof Assignment) {
			Assignment a = (Assignment) tmpA;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpC instanceof While) {
					While c = (While) tmpC;
					if (tmpW2i instanceof S2B) {
						S2B w2i = (S2B) tmpW2i;
						if (tmpB instanceof Assignment) {
							Assignment b = (Assignment) tmpB;
							if (tmpI instanceof Branch) {
								Branch i = (Branch) tmpI;
								return new Object[] { a, w, c, w2i, b, i, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_1_1_performtransformation_blackBBBBBBFBB(Assignment a,
			While w, While c, S2B w2i, Assignment b, Branch i, whileaul2branchcub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!a.equals(b)) {
			if (!c.equals(w)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { a, w, c, w2i, b, i, csp, _this, isApplicableMatch };
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
			While w = (While) result_pattern_whileaul2branchcub_1_1_performtransformation_binding[1];
			While c = (While) result_pattern_whileaul2branchcub_1_1_performtransformation_binding[2];
			S2B w2i = (S2B) result_pattern_whileaul2branchcub_1_1_performtransformation_binding[3];
			Assignment b = (Assignment) result_pattern_whileaul2branchcub_1_1_performtransformation_binding[4];
			Branch i = (Branch) result_pattern_whileaul2branchcub_1_1_performtransformation_binding[5];

			Object[] result_pattern_whileaul2branchcub_1_1_performtransformation_black = pattern_whileaul2branchcub_1_1_performtransformation_blackBBBBBBFBB(
					a, w, c, w2i, b, i, _this, isApplicableMatch);
			if (result_pattern_whileaul2branchcub_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileaul2branchcub_1_1_performtransformation_black[6];

				return new Object[] { a, w, c, w2i, b, i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_1_1_performtransformation_greenBBFFBFFFFB(Assignment a,
			While c, Assignment b, Branch i) {
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command x = ControlflowFactory.eINSTANCE.createCommand();
		i.setNegative(z);
		c2z.setSource(c);
		c2z.setTarget(z);
		y.setNext(z);
		z.setPositive(y);
		b2y.setSource(b);
		b2y.setTarget(y);
		a2x.setSource(a);
		a2x.setTarget(x);
		i.setPositive(x);
		return new Object[] { a, c, z, c2z, b, y, b2y, a2x, x, i };
	}

	public static final Object[] pattern_whileaul2branchcub_1_2_collecttranslatedelements_blackBBBBBBBBB(Assignment a,
			While c, Branch z, S2B c2z, Assignment b, Command y, S2N b2y, S2N a2x, Command x) {
		if (!a.equals(b)) {
			if (!a2x.equals(b2y)) {
				if (!x.equals(y)) {
					return new Object[] { a, c, z, c2z, b, y, b2y, a2x, x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_1_2_collecttranslatedelements_greenFBBBBBBBBB(Assignment a,
			While c, Branch z, S2B c2z, Assignment b, Command y, S2N b2y, S2N a2x, Command x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(x);
		return new Object[] { ruleresult, a, c, z, c2z, b, y, b2y, a2x, x };
	}

	public static final Object[] pattern_whileaul2branchcub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject a, EObject w, EObject c, EObject w2i, EObject z, EObject c2z,
			EObject b, EObject y, EObject b2y, EObject a2x, EObject x, EObject i) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w2i)) {
					if (!a.equals(z)) {
						if (!a.equals(c2z)) {
							if (!a.equals(b)) {
								if (!a.equals(y)) {
									if (!a.equals(b2y)) {
										if (!a.equals(a2x)) {
											if (!a.equals(x)) {
												if (!a.equals(i)) {
													if (!w.equals(w2i)) {
														if (!w.equals(z)) {
															if (!w.equals(y)) {
																if (!w.equals(x)) {
																	if (!c.equals(w)) {
																		if (!c.equals(w2i)) {
																			if (!c.equals(z)) {
																				if (!c.equals(c2z)) {
																					if (!c.equals(y)) {
																						if (!c.equals(x)) {
																							if (!c.equals(i)) {
																								if (!w2i.equals(z)) {
																									if (!w2i.equals(
																											y)) {
																										if (!w2i.equals(
																												x)) {
																											if (!c2z.equals(
																													w)) {
																												if (!c2z.equals(
																														w2i)) {
																													if (!c2z.equals(
																															z)) {
																														if (!c2z.equals(
																																y)) {
																															if (!c2z.equals(
																																	x)) {
																																if (!c2z.equals(
																																		i)) {
																																	if (!b.equals(
																																			w)) {
																																		if (!b.equals(
																																				c)) {
																																			if (!b.equals(
																																					w2i)) {
																																				if (!b.equals(
																																						z)) {
																																					if (!b.equals(
																																							c2z)) {
																																						if (!b.equals(
																																								y)) {
																																							if (!b.equals(
																																									b2y)) {
																																								if (!b.equals(
																																										x)) {
																																									if (!b.equals(
																																											i)) {
																																										if (!y.equals(
																																												z)) {
																																											if (!b2y.equals(
																																													w)) {
																																												if (!b2y.equals(
																																														c)) {
																																													if (!b2y.equals(
																																															w2i)) {
																																														if (!b2y.equals(
																																																z)) {
																																															if (!b2y.equals(
																																																	c2z)) {
																																																if (!b2y.equals(
																																																		y)) {
																																																	if (!b2y.equals(
																																																			x)) {
																																																		if (!b2y.equals(
																																																				i)) {
																																																			if (!a2x.equals(
																																																					w)) {
																																																				if (!a2x.equals(
																																																						c)) {
																																																					if (!a2x.equals(
																																																							w2i)) {
																																																						if (!a2x.equals(
																																																								z)) {
																																																							if (!a2x.equals(
																																																									c2z)) {
																																																								if (!a2x.equals(
																																																										b)) {
																																																									if (!a2x.equals(
																																																											y)) {
																																																										if (!a2x.equals(
																																																												b2y)) {
																																																											if (!a2x.equals(
																																																													x)) {
																																																												if (!a2x.equals(
																																																														i)) {
																																																													if (!x.equals(
																																																															z)) {
																																																														if (!x.equals(
																																																																y)) {
																																																															if (!i.equals(
																																																																	w)) {
																																																																if (!i.equals(
																																																																		w2i)) {
																																																																	if (!i.equals(
																																																																			z)) {
																																																																		if (!i.equals(
																																																																				y)) {
																																																																			if (!i.equals(
																																																																					x)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						a,
																																																																						w,
																																																																						c,
																																																																						w2i,
																																																																						z,
																																																																						c2z,
																																																																						b,
																																																																						y,
																																																																						b2y,
																																																																						a2x,
																																																																						x,
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

	public static final Object[] pattern_whileaul2branchcub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject a, EObject w, EObject c, EObject z, EObject c2z, EObject b, EObject y,
			EObject b2y, EObject a2x, EObject x, EObject i) {
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileaul2branchcub";
		String w__c____next_name_prime = "next";
		String c2z__c____source_name_prime = "source";
		String w__a____first_name_prime = "first";
		String y__z____next_name_prime = "next";
		String b2y__b____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String z__y____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		String c__b____last_name_prime = "last";
		String a2x__a____source_name_prime = "source";
		String c__b____first_name_prime = "first";
		String c2z__z____target_name_prime = "target";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		ruleresult.getCreatedEdges().add(y__z____next);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		z__y____positive.setSrc(z);
		z__y____positive.setTrg(y);
		ruleresult.getCreatedEdges().add(z__y____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(c__b____last);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		c__b____first.setSrc(c);
		c__b____first.setTrg(b);
		ruleresult.getTranslatedEdges().add(c__b____first);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		w__c____next.setName(w__c____next_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		y__z____next.setName(y__z____next_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		z__y____positive.setName(z__y____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		c__b____first.setName(c__b____first_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		return new Object[] { ruleresult, a, w, c, z, c2z, b, y, b2y, a2x, x, i, w__c____next, c2z__c____source,
				w__a____first, y__z____next, b2y__b____source, b2y__y____target, z__y____positive, a2x__x____target,
				c__b____last, a2x__a____source, c__b____first, c2z__z____target, i__x____positive, i__z____negative };
	}

	public static final void pattern_whileaul2branchcub_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whileaul2branchcub _this, PerformRuleResult ruleresult, EObject a, EObject w, EObject c, EObject w2i,
			EObject z, EObject c2z, EObject b, EObject y, EObject b2y, EObject a2x, EObject x, EObject i) {
		_this.registerObjects_FWD(ruleresult, a, w, c, w2i, z, c2z, b, y, b2y, a2x, x, i);

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
		EObject _localVariable_2 = match.getObject("c");
		EObject _localVariable_3 = match.getObject("b");
		EObject tmpA = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpB = _localVariable_3;
		if (tmpA instanceof Assignment) {
			Assignment a = (Assignment) tmpA;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpC instanceof While) {
					While c = (While) tmpC;
					if (tmpB instanceof Assignment) {
						Assignment b = (Assignment) tmpB;
						return new Object[] { a, w, c, b, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileaul2branchcub_2_2_corematch_blackBBBFBFB(Assignment a, While w,
			While c, Assignment b, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(b)) {
			if (!c.equals(w)) {
				for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class,
						"source")) {
					Branch i = w2i.getTarget();
					if (i != null) {
						_result.add(new Object[] { a, w, c, w2i, b, i, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileaul2branchcub_2_3_findcontext_blackBBBBBB(Assignment a, While w,
			While c, S2B w2i, Assignment b, Branch i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(b)) {
			if (!c.equals(w)) {
				if (w.equals(w2i.getSource())) {
					if (c.equals(w.getNext())) {
						if (a.equals(w.getFirst())) {
							if (b.equals(c.getLast())) {
								if (b.equals(c.getFirst())) {
									if (i.equals(w2i.getTarget())) {
										_result.add(new Object[] { a, w, c, w2i, b, i });
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

	public static final Object[] pattern_whileaul2branchcub_2_3_findcontext_greenBBBBBBFFFFFFF(Assignment a, While w,
			While c, S2B w2i, Assignment b, Branch i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w2i__w____source_name_prime = "source";
		String w__c____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String c__b____last_name_prime = "last";
		String c__b____first_name_prime = "first";
		String w2i__i____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(i);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(c__b____last);
		c__b____first.setSrc(c);
		c__b____first.setTrg(b);
		isApplicableMatch.getAllContextElements().add(c__b____first);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		c__b____first.setName(c__b____first_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		return new Object[] { a, w, c, w2i, b, i, isApplicableMatch, w2i__w____source, w__c____next, w__a____first,
				c__b____last, c__b____first, w2i__i____target };
	}

	public static final Object[] pattern_whileaul2branchcub_2_4_solveCSP_bindingFBBBBBBBB(whileaul2branchcub _this,
			IsApplicableMatch isApplicableMatch, Assignment a, While w, While c, S2B w2i, Assignment b, Branch i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, a, w, c, w2i, b, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, a, w, c, w2i, b, i };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileaul2branchcub_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			whileaul2branchcub _this, IsApplicableMatch isApplicableMatch, Assignment a, While w, While c, S2B w2i,
			Assignment b, Branch i) {
		Object[] result_pattern_whileaul2branchcub_2_4_solveCSP_binding = pattern_whileaul2branchcub_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, a, w, c, w2i, b, i);
		if (result_pattern_whileaul2branchcub_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileaul2branchcub_2_4_solveCSP_binding[0];

			Object[] result_pattern_whileaul2branchcub_2_4_solveCSP_black = pattern_whileaul2branchcub_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileaul2branchcub_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, a, w, c, w2i, b, i };
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
			Match match, Branch z, Command y, Command x, Branch i) {
		if (!x.equals(y)) {
			if (!i.equals(z)) {
				return new Object[] { _this, match, z, y, x, i };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_10_2_SolveCSP_bindingFBBBBBB(whileaul2branchcub _this,
			Match match, Branch z, Command y, Command x, Branch i) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, z, y, x, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, z, y, x, i };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileaul2branchcub_10_2_SolveCSP_bindingAndBlackFBBBBBB(
			whileaul2branchcub _this, Match match, Branch z, Command y, Command x, Branch i) {
		Object[] result_pattern_whileaul2branchcub_10_2_SolveCSP_binding = pattern_whileaul2branchcub_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, z, y, x, i);
		if (result_pattern_whileaul2branchcub_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileaul2branchcub_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whileaul2branchcub_10_2_SolveCSP_black = pattern_whileaul2branchcub_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileaul2branchcub_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, z, y, x, i };
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
			Branch z, Command y, Command x, Branch i) {
		if (!x.equals(y)) {
			if (!i.equals(z)) {
				return new Object[] { match, z, y, x, i };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_10_4_collectelementstobetranslated_greenBBBBBFFFF(
			Match match, Branch z, Command y, Command x, Branch i) {
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(x);
		String y__z____next_name_prime = "next";
		String z__y____positive_name_prime = "positive";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		match.getToBeTranslatedEdges().add(y__z____next);
		z__y____positive.setSrc(z);
		z__y____positive.setTrg(y);
		match.getToBeTranslatedEdges().add(z__y____positive);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		y__z____next.setName(y__z____next_name_prime);
		z__y____positive.setName(z__y____positive_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		return new Object[] { match, z, y, x, i, y__z____next, z__y____positive, i__x____positive, i__z____negative };
	}

	public static final Object[] pattern_whileaul2branchcub_10_5_collectcontextelements_blackBBBBB(Match match,
			Branch z, Command y, Command x, Branch i) {
		if (!x.equals(y)) {
			if (!i.equals(z)) {
				return new Object[] { match, z, y, x, i };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_10_5_collectcontextelements_greenBB(Match match, Branch i) {
		match.getContextNodes().add(i);
		return new Object[] { match, i };
	}

	public static final void pattern_whileaul2branchcub_10_6_registerobjectstomatch_expressionBBBBBB(
			whileaul2branchcub _this, Match match, Branch z, Command y, Command x, Branch i) {
		_this.registerObjectsToMatch_BWD(match, z, y, x, i);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("w");
		EObject _localVariable_1 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_2 = isApplicableMatch.getObject("z");
		EObject _localVariable_3 = isApplicableMatch.getObject("y");
		EObject _localVariable_4 = isApplicableMatch.getObject("x");
		EObject _localVariable_5 = isApplicableMatch.getObject("i");
		EObject tmpW = _localVariable_0;
		EObject tmpW2i = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpY = _localVariable_3;
		EObject tmpX = _localVariable_4;
		EObject tmpI = _localVariable_5;
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			if (tmpW2i instanceof S2B) {
				S2B w2i = (S2B) tmpW2i;
				if (tmpZ instanceof Branch) {
					Branch z = (Branch) tmpZ;
					if (tmpY instanceof Command) {
						Command y = (Command) tmpY;
						if (tmpX instanceof Command) {
							Command x = (Command) tmpX;
							if (tmpI instanceof Branch) {
								Branch i = (Branch) tmpI;
								return new Object[] { w, w2i, z, y, x, i, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_11_1_performtransformation_blackBBBBBBFBB(While w, S2B w2i,
			Branch z, Command y, Command x, Branch i, whileaul2branchcub _this, IsApplicableMatch isApplicableMatch) {
		if (!x.equals(y)) {
			if (!i.equals(z)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { w, w2i, z, y, x, i, csp, _this, isApplicableMatch };
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
			While w = (While) result_pattern_whileaul2branchcub_11_1_performtransformation_binding[0];
			S2B w2i = (S2B) result_pattern_whileaul2branchcub_11_1_performtransformation_binding[1];
			Branch z = (Branch) result_pattern_whileaul2branchcub_11_1_performtransformation_binding[2];
			Command y = (Command) result_pattern_whileaul2branchcub_11_1_performtransformation_binding[3];
			Command x = (Command) result_pattern_whileaul2branchcub_11_1_performtransformation_binding[4];
			Branch i = (Branch) result_pattern_whileaul2branchcub_11_1_performtransformation_binding[5];

			Object[] result_pattern_whileaul2branchcub_11_1_performtransformation_black = pattern_whileaul2branchcub_11_1_performtransformation_blackBBBBBBFBB(
					w, w2i, z, y, x, i, _this, isApplicableMatch);
			if (result_pattern_whileaul2branchcub_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileaul2branchcub_11_1_performtransformation_black[6];

				return new Object[] { w, w2i, z, y, x, i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_11_1_performtransformation_greenFBFBFFBFFB(While w,
			Branch z, Command y, Command x) {
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		w.setFirst(a);
		w.setNext(c);
		c2z.setSource(c);
		c2z.setTarget(z);
		c.setLast(b);
		c.setFirst(b);
		b2y.setSource(b);
		b2y.setTarget(y);
		a2x.setTarget(x);
		a2x.setSource(a);
		return new Object[] { a, w, c, z, c2z, b, y, b2y, a2x, x };
	}

	public static final Object[] pattern_whileaul2branchcub_11_2_collecttranslatedelements_blackBBBBBBBBB(Assignment a,
			While c, Branch z, S2B c2z, Assignment b, Command y, S2N b2y, S2N a2x, Command x) {
		if (!a.equals(b)) {
			if (!a2x.equals(b2y)) {
				if (!x.equals(y)) {
					return new Object[] { a, c, z, c2z, b, y, b2y, a2x, x };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_11_2_collecttranslatedelements_greenFBBBBBBBBB(Assignment a,
			While c, Branch z, S2B c2z, Assignment b, Command y, S2N b2y, S2N a2x, Command x) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(x);
		return new Object[] { ruleresult, a, c, z, c2z, b, y, b2y, a2x, x };
	}

	public static final Object[] pattern_whileaul2branchcub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject a, EObject w, EObject c, EObject w2i, EObject z, EObject c2z,
			EObject b, EObject y, EObject b2y, EObject a2x, EObject x, EObject i) {
		if (!a.equals(w)) {
			if (!a.equals(c)) {
				if (!a.equals(w2i)) {
					if (!a.equals(z)) {
						if (!a.equals(c2z)) {
							if (!a.equals(b)) {
								if (!a.equals(y)) {
									if (!a.equals(b2y)) {
										if (!a.equals(a2x)) {
											if (!a.equals(x)) {
												if (!a.equals(i)) {
													if (!w.equals(w2i)) {
														if (!w.equals(z)) {
															if (!w.equals(y)) {
																if (!w.equals(x)) {
																	if (!c.equals(w)) {
																		if (!c.equals(w2i)) {
																			if (!c.equals(z)) {
																				if (!c.equals(c2z)) {
																					if (!c.equals(y)) {
																						if (!c.equals(x)) {
																							if (!c.equals(i)) {
																								if (!w2i.equals(z)) {
																									if (!w2i.equals(
																											y)) {
																										if (!w2i.equals(
																												x)) {
																											if (!c2z.equals(
																													w)) {
																												if (!c2z.equals(
																														w2i)) {
																													if (!c2z.equals(
																															z)) {
																														if (!c2z.equals(
																																y)) {
																															if (!c2z.equals(
																																	x)) {
																																if (!c2z.equals(
																																		i)) {
																																	if (!b.equals(
																																			w)) {
																																		if (!b.equals(
																																				c)) {
																																			if (!b.equals(
																																					w2i)) {
																																				if (!b.equals(
																																						z)) {
																																					if (!b.equals(
																																							c2z)) {
																																						if (!b.equals(
																																								y)) {
																																							if (!b.equals(
																																									b2y)) {
																																								if (!b.equals(
																																										x)) {
																																									if (!b.equals(
																																											i)) {
																																										if (!y.equals(
																																												z)) {
																																											if (!b2y.equals(
																																													w)) {
																																												if (!b2y.equals(
																																														c)) {
																																													if (!b2y.equals(
																																															w2i)) {
																																														if (!b2y.equals(
																																																z)) {
																																															if (!b2y.equals(
																																																	c2z)) {
																																																if (!b2y.equals(
																																																		y)) {
																																																	if (!b2y.equals(
																																																			x)) {
																																																		if (!b2y.equals(
																																																				i)) {
																																																			if (!a2x.equals(
																																																					w)) {
																																																				if (!a2x.equals(
																																																						c)) {
																																																					if (!a2x.equals(
																																																							w2i)) {
																																																						if (!a2x.equals(
																																																								z)) {
																																																							if (!a2x.equals(
																																																									c2z)) {
																																																								if (!a2x.equals(
																																																										b)) {
																																																									if (!a2x.equals(
																																																											y)) {
																																																										if (!a2x.equals(
																																																												b2y)) {
																																																											if (!a2x.equals(
																																																													x)) {
																																																												if (!a2x.equals(
																																																														i)) {
																																																													if (!x.equals(
																																																															z)) {
																																																														if (!x.equals(
																																																																y)) {
																																																															if (!i.equals(
																																																																	w)) {
																																																																if (!i.equals(
																																																																		w2i)) {
																																																																	if (!i.equals(
																																																																			z)) {
																																																																		if (!i.equals(
																																																																				y)) {
																																																																			if (!i.equals(
																																																																					x)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						a,
																																																																						w,
																																																																						c,
																																																																						w2i,
																																																																						z,
																																																																						c2z,
																																																																						b,
																																																																						y,
																																																																						b2y,
																																																																						a2x,
																																																																						x,
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

	public static final Object[] pattern_whileaul2branchcub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject a, EObject w, EObject c, EObject z, EObject c2z, EObject b, EObject y,
			EObject b2y, EObject a2x, EObject x, EObject i) {
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileaul2branchcub";
		String w__c____next_name_prime = "next";
		String c2z__c____source_name_prime = "source";
		String w__a____first_name_prime = "first";
		String y__z____next_name_prime = "next";
		String b2y__b____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String z__y____positive_name_prime = "positive";
		String a2x__x____target_name_prime = "target";
		String c__b____last_name_prime = "last";
		String a2x__a____source_name_prime = "source";
		String c__b____first_name_prime = "first";
		String c2z__z____target_name_prime = "target";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		ruleresult.getTranslatedEdges().add(y__z____next);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		z__y____positive.setSrc(z);
		z__y____positive.setTrg(y);
		ruleresult.getTranslatedEdges().add(z__y____positive);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(c__b____last);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		c__b____first.setSrc(c);
		c__b____first.setTrg(b);
		ruleresult.getCreatedEdges().add(c__b____first);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		w__c____next.setName(w__c____next_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		y__z____next.setName(y__z____next_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		z__y____positive.setName(z__y____positive_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		c__b____first.setName(c__b____first_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		return new Object[] { ruleresult, a, w, c, z, c2z, b, y, b2y, a2x, x, i, w__c____next, c2z__c____source,
				w__a____first, y__z____next, b2y__b____source, b2y__y____target, z__y____positive, a2x__x____target,
				c__b____last, a2x__a____source, c__b____first, c2z__z____target, i__x____positive, i__z____negative };
	}

	public static final void pattern_whileaul2branchcub_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whileaul2branchcub _this, PerformRuleResult ruleresult, EObject a, EObject w, EObject c, EObject w2i,
			EObject z, EObject c2z, EObject b, EObject y, EObject b2y, EObject a2x, EObject x, EObject i) {
		_this.registerObjects_BWD(ruleresult, a, w, c, w2i, z, c2z, b, y, b2y, a2x, x, i);

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
		EObject _localVariable_0 = match.getObject("z");
		EObject _localVariable_1 = match.getObject("y");
		EObject _localVariable_2 = match.getObject("x");
		EObject _localVariable_3 = match.getObject("i");
		EObject tmpZ = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpX = _localVariable_2;
		EObject tmpI = _localVariable_3;
		if (tmpZ instanceof Branch) {
			Branch z = (Branch) tmpZ;
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (tmpX instanceof Command) {
					Command x = (Command) tmpX;
					if (tmpI instanceof Branch) {
						Branch i = (Branch) tmpI;
						return new Object[] { z, y, x, i, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileaul2branchcub_12_2_corematch_blackFFBBBBB(Branch z, Command y,
			Command x, Branch i, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(y)) {
			if (!i.equals(z)) {
				for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class,
						"target")) {
					Statement tmpW = w2i.getSource();
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						_result.add(new Object[] { w, w2i, z, y, x, i, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileaul2branchcub_12_3_findcontext_blackBBBBBB(While w, S2B w2i,
			Branch z, Command y, Command x, Branch i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(y)) {
			if (!i.equals(z)) {
				if (w.equals(w2i.getSource())) {
					if (z.equals(y.getNext())) {
						if (y.equals(z.getPositive())) {
							if (x.equals(i.getPositive())) {
								if (z.equals(i.getNegative())) {
									if (i.equals(w2i.getTarget())) {
										_result.add(new Object[] { w, w2i, z, y, x, i });
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

	public static final Object[] pattern_whileaul2branchcub_12_3_findcontext_greenBBBBBBFFFFFFF(While w, S2B w2i,
			Branch z, Command y, Command x, Branch i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w2i__w____source_name_prime = "source";
		String y__z____next_name_prime = "next";
		String z__y____positive_name_prime = "positive";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String w2i__i____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(i);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		isApplicableMatch.getAllContextElements().add(y__z____next);
		z__y____positive.setSrc(z);
		z__y____positive.setTrg(y);
		isApplicableMatch.getAllContextElements().add(z__y____positive);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w2i__w____source.setName(w2i__w____source_name_prime);
		y__z____next.setName(y__z____next_name_prime);
		z__y____positive.setName(z__y____positive_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		return new Object[] { w, w2i, z, y, x, i, isApplicableMatch, w2i__w____source, y__z____next, z__y____positive,
				i__x____positive, i__z____negative, w2i__i____target };
	}

	public static final Object[] pattern_whileaul2branchcub_12_4_solveCSP_bindingFBBBBBBBB(whileaul2branchcub _this,
			IsApplicableMatch isApplicableMatch, While w, S2B w2i, Branch z, Command y, Command x, Branch i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, w, w2i, z, y, x, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, w2i, z, y, x, i };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileaul2branchcub_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			whileaul2branchcub _this, IsApplicableMatch isApplicableMatch, While w, S2B w2i, Branch z, Command y,
			Command x, Branch i) {
		Object[] result_pattern_whileaul2branchcub_12_4_solveCSP_binding = pattern_whileaul2branchcub_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, w, w2i, z, y, x, i);
		if (result_pattern_whileaul2branchcub_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileaul2branchcub_12_4_solveCSP_binding[0];

			Object[] result_pattern_whileaul2branchcub_12_4_solveCSP_black = pattern_whileaul2branchcub_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileaul2branchcub_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, w2i, z, y, x, i };
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

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_0B(Branch z) {
		for (Graph __DEC_z_root_115773 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_1BB(Branch z,
			Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_z_positive_448521 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!z.equals(__DEC_z_positive_448521)) {
					if (!i.equals(__DEC_z_positive_448521)) {
						return new Object[] { z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_2BB(Branch z,
			Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_z_negative_137945 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!z.equals(__DEC_z_negative_137945)) {
					if (!i.equals(__DEC_z_negative_137945)) {
						return new Object[] { z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_379440 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_4BBB(Command y,
			Branch z, Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_y_positive_160757 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!z.equals(__DEC_y_positive_160757)) {
					if (!i.equals(__DEC_y_positive_160757)) {
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
			for (Branch __DEC_y_negative_693190 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!z.equals(__DEC_y_negative_693190)) {
					if (!i.equals(__DEC_y_negative_693190)) {
						return new Object[] { y, z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_6B(Command x) {
		for (Graph __DEC_x_root_479707 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_7BBB(Command x,
			Branch z, Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_x_positive_377176 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!z.equals(__DEC_x_positive_377176)) {
					if (!i.equals(__DEC_x_positive_377176)) {
						return new Object[] { x, z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_8BBB(Command x,
			Branch z, Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_x_negative_84966 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!z.equals(__DEC_x_negative_84966)) {
					if (!i.equals(__DEC_x_negative_84966)) {
						return new Object[] { x, z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_9BB(Branch i,
			Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_10BB(Branch z,
			Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_11BB(Branch i,
			Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_12BB(Branch z,
			Command x) {
		if (x.equals(z.getPositive())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_13BB(Branch z,
			Command x) {
		if (x.equals(z.getNegative())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_14BB(Branch i,
			Command x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileaul2branchcub_20_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpY = _edge_next.getSrc();
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			EObject tmpZ = _edge_next.getTrg();
			if (tmpZ instanceof Branch) {
				Branch z = (Branch) tmpZ;
				if (z.equals(y.getNext())) {
					if (y.equals(z.getPositive())) {
						if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_3B(y) == null) {
							if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_0B(z) == null) {
								if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_10BB(z, y) == null) {
									for (Branch i : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(z, Branch.class, "negative")) {
										if (!i.equals(z)) {
											Node tmpX = i.getPositive();
											if (tmpX instanceof Command) {
												Command x = (Command) tmpX;
												if (!x.equals(y)) {
													if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_1BB(
															z, i) == null) {
														if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_2BB(
																z, i) == null) {
															if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_4BBB(
																	y, z, i) == null) {
																if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_5BBB(
																		y, z, i) == null) {
																	if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_9BB(
																			i, y) == null) {
																		if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_11BB(
																				i, y) == null) {
																			if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_6B(
																					x) == null) {
																				if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_7BBB(
																						x, z, i) == null) {
																					if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_8BBB(
																							x, z, i) == null) {
																						if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_12BB(
																								z, x) == null) {
																							if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_13BB(
																									z, x) == null) {
																								if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_14BB(
																										i, x) == null) {
																									_result.add(
																											new Object[] {
																													z,
																													y,
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
			whileaul2branchcub _this, Match match, Branch z, Command y, Command x, Branch i) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, z, y, x, i);
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
		for (Decision __DEC_a_positive_926440 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_1B(Assignment a) {
		for (Decision __DEC_a_negative_101833 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_2BBB(Assignment a,
			While w, While c) {
		if (!c.equals(w)) {
			for (While __DEC_a_last_865733 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!w.equals(__DEC_a_last_865733)) {
					if (!c.equals(__DEC_a_last_865733)) {
						return new Object[] { a, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_3B(Assignment a) {
		for (Program __DEC_a_first_142137 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_4B(While c) {
		for (Decision __DEC_c_positive_798997 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_5B(While c) {
		for (Decision __DEC_c_negative_626689 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_6BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_first_830251 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!c.equals(__DEC_c_first_830251)) {
					if (!w.equals(__DEC_c_first_830251)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_7BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_last_6318 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!c.equals(__DEC_c_last_6318)) {
					if (!w.equals(__DEC_c_last_6318)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_8B(While c) {
		for (Program __DEC_c_first_792219 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_9B(Assignment b) {
		for (Decision __DEC_b_positive_856623 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_10B(Assignment b) {
		for (Decision __DEC_b_negative_323817 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_11BBB(Assignment b,
			While w, While c) {
		if (!c.equals(w)) {
			for (While __DEC_b_last_989389 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!w.equals(__DEC_b_last_989389)) {
					if (!c.equals(__DEC_b_last_989389)) {
						return new Object[] { b, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_12B(Assignment b) {
		for (Program __DEC_b_first_400147 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
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

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_15BB(While w, While c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_16BB(While w, While c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_17BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
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
							Statement tmpB = c.getLast();
							if (tmpB instanceof Assignment) {
								Assignment b = (Assignment) tmpB;
								if (!a.equals(b)) {
									if (b.equals(c.getFirst())) {
										if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_4B(
												c) == null) {
											if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_5B(
													c) == null) {
												if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_6BB(
														c, w) == null) {
													if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_7BB(
															c, w) == null) {
														if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_8B(
																c) == null) {
															if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_15BB(
																	w, c) == null) {
																if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_16BB(
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
																							if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_9B(
																									b) == null) {
																								if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_10B(
																										b) == null) {
																									if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_11BBB(
																											b, w,
																											c) == null) {
																										if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_12B(
																												b) == null) {
																											if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_17BB(
																													w,
																													b) == null) {
																												_result.add(
																														new Object[] {
																																a,
																																w,
																																c,
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
			whileaul2branchcub _this, Match match, Assignment a, While w, While c, Assignment b) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, a, w, c, b);
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

	public static final Object[] pattern_whileaul2branchcub_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("a");
		EObject _localVariable_1 = sourceMatch.getObject("w");
		EObject _localVariable_2 = sourceMatch.getObject("c");
		EObject _localVariable_3 = targetMatch.getObject("z");
		EObject _localVariable_4 = sourceMatch.getObject("b");
		EObject _localVariable_5 = targetMatch.getObject("y");
		EObject _localVariable_6 = targetMatch.getObject("x");
		EObject _localVariable_7 = targetMatch.getObject("i");
		EObject tmpA = _localVariable_0;
		EObject tmpW = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		EObject tmpB = _localVariable_4;
		EObject tmpY = _localVariable_5;
		EObject tmpX = _localVariable_6;
		EObject tmpI = _localVariable_7;
		if (tmpA instanceof Assignment) {
			Assignment a = (Assignment) tmpA;
			if (tmpW instanceof While) {
				While w = (While) tmpW;
				if (tmpC instanceof While) {
					While c = (While) tmpC;
					if (tmpZ instanceof Branch) {
						Branch z = (Branch) tmpZ;
						if (tmpB instanceof Assignment) {
							Assignment b = (Assignment) tmpB;
							if (tmpY instanceof Command) {
								Command y = (Command) tmpY;
								if (tmpX instanceof Command) {
									Command x = (Command) tmpX;
									if (tmpI instanceof Branch) {
										Branch i = (Branch) tmpI;
										return new Object[] { a, w, c, z, b, y, x, i, sourceMatch, targetMatch };
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

	public static final Object[] pattern_whileaul2branchcub_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Assignment a,
			While w, While c, Branch z, Assignment b, Command y, Command x, Branch i, Match sourceMatch,
			Match targetMatch) {
		if (!a.equals(b)) {
			if (!c.equals(w)) {
				if (!x.equals(y)) {
					if (!i.equals(z)) {
						if (!sourceMatch.equals(targetMatch)) {
							return new Object[] { a, w, c, z, b, y, x, i, sourceMatch, targetMatch };
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
				sourceMatch, targetMatch);
		if (result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding != null) {
			Assignment a = (Assignment) result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding[0];
			While w = (While) result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding[1];
			While c = (While) result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding[2];
			Branch z = (Branch) result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding[3];
			Assignment b = (Assignment) result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding[4];
			Command y = (Command) result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding[5];
			Command x = (Command) result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding[6];
			Branch i = (Branch) result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_black = pattern_whileaul2branchcub_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					a, w, c, z, b, y, x, i, sourceMatch, targetMatch);
			if (result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { a, w, c, z, b, y, x, i, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_24_3_solvecsp_bindingFBBBBBBBBBBB(whileaul2branchcub _this,
			Assignment a, While w, While c, Branch z, Assignment b, Command y, Command x, Branch i, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(a, w, c, z, b, y, x, i, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, a, w, c, z, b, y, x, i, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileaul2branchcub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			whileaul2branchcub _this, Assignment a, While w, While c, Branch z, Assignment b, Command y, Command x,
			Branch i, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileaul2branchcub_24_3_solvecsp_binding = pattern_whileaul2branchcub_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, a, w, c, z, b, y, x, i, sourceMatch, targetMatch);
		if (result_pattern_whileaul2branchcub_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whileaul2branchcub_24_3_solvecsp_binding[0];

			Object[] result_pattern_whileaul2branchcub_24_3_solvecsp_black = pattern_whileaul2branchcub_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whileaul2branchcub_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, a, w, c, z, b, y, x, i, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whileaul2branchcub_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileaul2branchcub_24_5_matchcorrcontext_blackBFBBB(While w,
			Branch i, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				if (i.equals(w2i.getTarget())) {
					_result.add(new Object[] { w, w2i, i, sourceMatch, targetMatch });
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

	public static final Object[] pattern_whileaul2branchcub_24_6_createcorrespondence_blackBBBBBBBBB(Assignment a,
			While w, While c, Branch z, Assignment b, Command y, Command x, Branch i, CCMatch ccMatch) {
		if (!a.equals(b)) {
			if (!c.equals(w)) {
				if (!x.equals(y)) {
					if (!i.equals(z)) {
						return new Object[] { a, w, c, z, b, y, x, i, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_24_6_createcorrespondence_greenBBBFBBFFBB(Assignment a,
			While c, Branch z, Assignment b, Command y, Command x, CCMatch ccMatch) {
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		c2z.setSource(c);
		c2z.setTarget(z);
		ccMatch.getCreateCorr().add(c2z);
		b2y.setSource(b);
		b2y.setTarget(y);
		ccMatch.getCreateCorr().add(b2y);
		a2x.setTarget(x);
		a2x.setSource(a);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { a, c, z, c2z, b, y, b2y, a2x, x, ccMatch };
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
		for (Decision __DEC_a_positive_793787 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_1B(Assignment a) {
		for (Decision __DEC_a_negative_480043 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_2BBB(Assignment a, While w,
			While c) {
		if (!c.equals(w)) {
			for (While __DEC_a_last_486489 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!w.equals(__DEC_a_last_486489)) {
					if (!c.equals(__DEC_a_last_486489)) {
						return new Object[] { a, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_3B(Assignment a) {
		for (Program __DEC_a_first_554144 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_4B(While c) {
		for (Decision __DEC_c_positive_183018 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_5B(While c) {
		for (Decision __DEC_c_negative_855108 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_6BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_first_708212 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!c.equals(__DEC_c_first_708212)) {
					if (!w.equals(__DEC_c_first_708212)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_7BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_last_612386 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!c.equals(__DEC_c_last_612386)) {
					if (!w.equals(__DEC_c_last_612386)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_8B(While c) {
		for (Program __DEC_c_first_504965 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_9B(Assignment b) {
		for (Decision __DEC_b_positive_830311 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_10B(Assignment b) {
		for (Decision __DEC_b_negative_343880 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_11BBB(Assignment b, While w,
			While c) {
		if (!c.equals(w)) {
			for (While __DEC_b_last_316190 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!w.equals(__DEC_b_last_316190)) {
					if (!c.equals(__DEC_b_last_316190)) {
						return new Object[] { b, w, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_12B(Assignment b) {
		for (Program __DEC_b_first_118731 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
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

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_15BB(While w, While c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_16BB(While w, While c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_17BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_blackBBBB(Assignment a, While w,
			While c, Assignment b) {
		if (!a.equals(b)) {
			if (!c.equals(w)) {
				if (c.equals(w.getNext())) {
					if (a.equals(w.getFirst())) {
						if (b.equals(c.getLast())) {
							if (b.equals(c.getFirst())) {
								if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_0B(a) == null) {
									if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_1B(a) == null) {
										if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_2BBB(a, w,
												c) == null) {
											if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_3B(
													a) == null) {
												if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_4B(
														c) == null) {
													if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_5B(
															c) == null) {
														if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_6BB(
																c, w) == null) {
															if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_7BB(
																	c, w) == null) {
																if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_8B(
																		c) == null) {
																	if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_9B(
																			b) == null) {
																		if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_10B(
																				b) == null) {
																			if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_11BBB(
																					b, w, c) == null) {
																				if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_12B(
																						b) == null) {
																					if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_13BB(
																							w, a) == null) {
																						if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_14BB(
																								c, a) == null) {
																							if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_15BB(
																									w, c) == null) {
																								if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_16BB(
																										w, c) == null) {
																									if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_17BB(
																											w,
																											b) == null) {
																										return new Object[] {
																												a, w, c,
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

	public static final boolean pattern_whileaul2branchcub_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileaul2branchcub_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_0B(Branch z) {
		for (Graph __DEC_z_root_20006 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_1BB(Branch z, Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_z_positive_417756 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!z.equals(__DEC_z_positive_417756)) {
					if (!i.equals(__DEC_z_positive_417756)) {
						return new Object[] { z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_2BB(Branch z, Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_z_negative_22531 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!z.equals(__DEC_z_negative_22531)) {
					if (!i.equals(__DEC_z_negative_22531)) {
						return new Object[] { z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_3B(Command y) {
		for (Graph __DEC_y_root_967805 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_4BBB(Command y, Branch z,
			Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_y_positive_289649 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!z.equals(__DEC_y_positive_289649)) {
					if (!i.equals(__DEC_y_positive_289649)) {
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
			for (Branch __DEC_y_negative_357842 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!z.equals(__DEC_y_negative_357842)) {
					if (!i.equals(__DEC_y_negative_357842)) {
						return new Object[] { y, z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_6B(Command x) {
		for (Graph __DEC_x_root_403 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x, Graph.class,
				"root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_7BBB(Command x, Branch z,
			Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_x_positive_583003 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!z.equals(__DEC_x_positive_583003)) {
					if (!i.equals(__DEC_x_positive_583003)) {
						return new Object[] { x, z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_8BBB(Command x, Branch z,
			Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_x_negative_254179 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!z.equals(__DEC_x_negative_254179)) {
					if (!i.equals(__DEC_x_negative_254179)) {
						return new Object[] { x, z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_9BB(Branch i, Command y) {
		if (y.equals(i.getPositive())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_10BB(Branch z, Command y) {
		if (y.equals(z.getNegative())) {
			return new Object[] { z, y };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_11BB(Branch i, Command y) {
		if (y.equals(i.getNegative())) {
			return new Object[] { i, y };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_12BB(Branch z, Command x) {
		if (x.equals(z.getPositive())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_13BB(Branch z, Command x) {
		if (x.equals(z.getNegative())) {
			return new Object[] { z, x };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_14BB(Branch i, Command x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_blackBBBB(Branch z, Command y,
			Command x, Branch i) {
		if (!x.equals(y)) {
			if (!i.equals(z)) {
				if (z.equals(y.getNext())) {
					if (y.equals(z.getPositive())) {
						if (x.equals(i.getPositive())) {
							if (z.equals(i.getNegative())) {
								if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_0B(z) == null) {
									if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_1BB(z, i) == null) {
										if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_2BB(z,
												i) == null) {
											if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_3B(
													y) == null) {
												if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_4BBB(y, z,
														i) == null) {
													if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_5BBB(
															y, z, i) == null) {
														if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_6B(
																x) == null) {
															if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_7BBB(
																	x, z, i) == null) {
																if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_8BBB(
																		x, z, i) == null) {
																	if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_9BB(
																			i, y) == null) {
																		if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_10BB(
																				z, y) == null) {
																			if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_11BB(
																					i, y) == null) {
																				if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_12BB(
																						z, x) == null) {
																					if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_13BB(
																							z, x) == null) {
																						if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_14BB(
																								i, x) == null) {
																							return new Object[] { z, y,
																									x, i };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
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
							if (pattern_whileaul2branchcub_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									w2i) == null) {
								if (pattern_whileaul2branchcub_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										w) == null) {
									if (pattern_whileaul2branchcub_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_whileaul2branchcub_29_3_solveCSP_bindingFBBBBBB(whileaul2branchcub _this,
			IsApplicableMatch isApplicableMatch, While w, S2B w2i, Branch i, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, w, w2i, i, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w, w2i, i, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileaul2branchcub_29_3_solveCSP_bindingAndBlackFBBBBBB(
			whileaul2branchcub _this, IsApplicableMatch isApplicableMatch, While w, S2B w2i, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whileaul2branchcub_29_3_solveCSP_binding = pattern_whileaul2branchcub_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, w, w2i, i, ruleResult);
		if (result_pattern_whileaul2branchcub_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileaul2branchcub_29_3_solveCSP_binding[0];

			Object[] result_pattern_whileaul2branchcub_29_3_solveCSP_black = pattern_whileaul2branchcub_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whileaul2branchcub_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w, w2i, i, ruleResult };
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

	public static final Object[] pattern_whileaul2branchcub_29_5_checknacs_blackBBB(While w, S2B w2i, Branch i) {
		return new Object[] { w, w2i, i };
	}

	public static final Object[] pattern_whileaul2branchcub_29_6_perform_blackBBBB(While w, S2B w2i, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { w, w2i, i, ruleResult };
	}

	public static final Object[] pattern_whileaul2branchcub_29_6_perform_greenFBFFFFFFFFBB(While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command x = ControlflowFactory.eINSTANCE.createCommand();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		w.setFirst(a);
		ruleResult.getSourceObjects().add(a);
		w.setNext(c);
		ruleResult.getSourceObjects().add(c);
		i.setNegative(z);
		ruleResult.getTargetObjects().add(z);
		c2z.setSource(c);
		c2z.setTarget(z);
		ruleResult.getCorrObjects().add(c2z);
		c.setLast(b);
		c.setFirst(b);
		ruleResult.getSourceObjects().add(b);
		y.setNext(z);
		z.setPositive(y);
		ruleResult.getTargetObjects().add(y);
		b2y.setSource(b);
		b2y.setTarget(y);
		ruleResult.getCorrObjects().add(b2y);
		a2x.setSource(a);
		ruleResult.getCorrObjects().add(a2x);
		a2x.setTarget(x);
		i.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { a, w, c, z, c2z, b, y, b2y, a2x, x, i, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whileaul2branchcub_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whileaul2branchcubImpl
