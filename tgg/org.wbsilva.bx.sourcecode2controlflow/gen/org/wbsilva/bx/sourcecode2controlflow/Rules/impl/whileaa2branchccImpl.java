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
import org.wbsilva.bx.sourcecode2controlflow.Rules.whileaa2branchcc;

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
 * An implementation of the model object '<em><b>whileaa2branchcc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class whileaa2branchccImpl extends AbstractRuleImpl implements whileaa2branchcc {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected whileaa2branchccImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getwhileaa2branchcc();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Assignment c, Assignment a, While w) {

		Object[] result1_black = whileaa2branchccImpl.pattern_whileaa2branchcc_0_1_initialbindings_blackBBBBB(this,
				match, c, a, w);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[w] = " + w + ".");
		}

		Object[] result2_bindingAndBlack = whileaa2branchccImpl
				.pattern_whileaa2branchcc_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, c, a, w);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[w] = " + w + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileaa2branchccImpl.pattern_whileaa2branchcc_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileaa2branchccImpl
					.pattern_whileaa2branchcc_0_4_collectelementstobetranslated_blackBBBB(match, c, a, w);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[a] = " + a + ", " + "[w] = " + w + ".");
			}
			whileaa2branchccImpl.pattern_whileaa2branchcc_0_4_collectelementstobetranslated_greenBBBBFF(match, c, a, w);
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[5];

			Object[] result5_black = whileaa2branchccImpl
					.pattern_whileaa2branchcc_0_5_collectcontextelements_blackBBBB(match, c, a, w);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[a] = " + a + ", " + "[w] = " + w + ".");
			}
			whileaa2branchccImpl.pattern_whileaa2branchcc_0_5_collectcontextelements_greenBB(match, w);

			// 
			whileaa2branchccImpl.pattern_whileaa2branchcc_0_6_registerobjectstomatch_expressionBBBBB(this, match, c, a,
					w);
			return whileaa2branchccImpl.pattern_whileaa2branchcc_0_7_expressionF();
		} else {
			return whileaa2branchccImpl.pattern_whileaa2branchcc_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whileaa2branchccImpl
				.pattern_whileaa2branchcc_1_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Branch i = (Branch) result1_bindingAndBlack[0];
		Assignment c = (Assignment) result1_bindingAndBlack[1];
		Assignment a = (Assignment) result1_bindingAndBlack[2];
		S2B w2i = (S2B) result1_bindingAndBlack[3];
		While w = (While) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = whileaa2branchccImpl.pattern_whileaa2branchcc_1_1_performtransformation_greenFFBFBBF(i,
				c, a);
		S2N a2x = (S2N) result1_green[0];
		Command x = (Command) result1_green[1];
		Command z = (Command) result1_green[3];
		S2N c2z = (S2N) result1_green[6];

		Object[] result2_black = whileaa2branchccImpl
				.pattern_whileaa2branchcc_1_2_collecttranslatedelements_blackBBBBBB(a2x, x, z, c, a, c2z);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", "
							+ "[z] = " + z + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[c2z] = " + c2z + ".");
		}
		Object[] result2_green = whileaa2branchccImpl
				.pattern_whileaa2branchcc_1_2_collecttranslatedelements_greenFBBBBBB(a2x, x, z, c, a, c2z);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileaa2branchccImpl.pattern_whileaa2branchcc_1_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, a2x, x, i, z, c, a, w2i, w, c2z);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", " + "[i] = " + i + ", " + "[z] = " + z + ", "
					+ "[c] = " + c + ", " + "[a] = " + a + ", " + "[w2i] = " + w2i + ", " + "[w] = " + w + ", "
					+ "[c2z] = " + c2z + ".");
		}
		whileaa2branchccImpl.pattern_whileaa2branchcc_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult, a2x, x,
				i, z, c, a, w, c2z);
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[16];

		// 
		// 
		whileaa2branchccImpl.pattern_whileaa2branchcc_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, a2x,
				x, i, z, c, a, w2i, w, c2z);
		return whileaa2branchccImpl.pattern_whileaa2branchcc_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = whileaa2branchccImpl
				.pattern_whileaa2branchcc_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whileaa2branchccImpl
				.pattern_whileaa2branchcc_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whileaa2branchccImpl.pattern_whileaa2branchcc_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Assignment c = (Assignment) result2_binding[0];
		Assignment a = (Assignment) result2_binding[1];
		While w = (While) result2_binding[2];
		for (Object[] result2_black : whileaa2branchccImpl.pattern_whileaa2branchcc_2_2_corematch_blackFBBFBB(c, a, w,
				match)) {
			Branch i = (Branch) result2_black[0];
			S2B w2i = (S2B) result2_black[3];
			// ForEach 
			for (Object[] result3_black : whileaa2branchccImpl.pattern_whileaa2branchcc_2_3_findcontext_blackBBBBB(i, c,
					a, w2i, w)) {
				Object[] result3_green = whileaa2branchccImpl
						.pattern_whileaa2branchcc_2_3_findcontext_greenBBBBBFFFFF(i, c, a, w2i, w);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = whileaa2branchccImpl
						.pattern_whileaa2branchcc_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, i, c, a,
								w2i, w);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[i] = " + i + ", " + "[c] = " + c
							+ ", " + "[a] = " + a + ", " + "[w2i] = " + w2i + ", " + "[w] = " + w + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whileaa2branchccImpl.pattern_whileaa2branchcc_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whileaa2branchccImpl
							.pattern_whileaa2branchcc_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whileaa2branchccImpl.pattern_whileaa2branchcc_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whileaa2branchccImpl.pattern_whileaa2branchcc_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Assignment c, Assignment a, While w) {
		match.registerObject("c", c);
		match.registerObject("a", a);
		match.registerObject("w", w);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment c, Assignment a, While w) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Branch i, Assignment c, Assignment a,
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
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("w", w);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject a2x, EObject x, EObject i, EObject z,
			EObject c, EObject a, EObject w2i, EObject w, EObject c2z) {
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("c2z", c2z);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass())
						.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command x, Branch i, Command z) {

		Object[] result1_black = whileaa2branchccImpl.pattern_whileaa2branchcc_10_1_initialbindings_blackBBBBB(this,
				match, x, i, z);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[i] = " + i + ", " + "[z] = " + z + ".");
		}

		Object[] result2_bindingAndBlack = whileaa2branchccImpl
				.pattern_whileaa2branchcc_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, x, i, z);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[x] = " + x + ", " + "[i] = " + i + ", " + "[z] = " + z + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileaa2branchccImpl.pattern_whileaa2branchcc_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileaa2branchccImpl
					.pattern_whileaa2branchcc_10_4_collectelementstobetranslated_blackBBBB(match, x, i, z);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[i] = " + i + ", " + "[z] = " + z + ".");
			}
			whileaa2branchccImpl.pattern_whileaa2branchcc_10_4_collectelementstobetranslated_greenBBBBFF(match, x, i,
					z);
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[5];

			Object[] result5_black = whileaa2branchccImpl
					.pattern_whileaa2branchcc_10_5_collectcontextelements_blackBBBB(match, x, i, z);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[x] = " + x + ", " + "[i] = " + i + ", " + "[z] = " + z + ".");
			}
			whileaa2branchccImpl.pattern_whileaa2branchcc_10_5_collectcontextelements_greenBB(match, i);

			// 
			whileaa2branchccImpl.pattern_whileaa2branchcc_10_6_registerobjectstomatch_expressionBBBBB(this, match, x, i,
					z);
			return whileaa2branchccImpl.pattern_whileaa2branchcc_10_7_expressionF();
		} else {
			return whileaa2branchccImpl.pattern_whileaa2branchcc_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = whileaa2branchccImpl
				.pattern_whileaa2branchcc_11_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Command x = (Command) result1_bindingAndBlack[0];
		Branch i = (Branch) result1_bindingAndBlack[1];
		Command z = (Command) result1_bindingAndBlack[2];
		S2B w2i = (S2B) result1_bindingAndBlack[3];
		While w = (While) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = whileaa2branchccImpl
				.pattern_whileaa2branchcc_11_1_performtransformation_greenFBBFFBF(x, z, w);
		S2N a2x = (S2N) result1_green[0];
		Assignment c = (Assignment) result1_green[3];
		Assignment a = (Assignment) result1_green[4];
		S2N c2z = (S2N) result1_green[6];

		Object[] result2_black = whileaa2branchccImpl
				.pattern_whileaa2branchcc_11_2_collecttranslatedelements_blackBBBBBB(a2x, x, z, c, a, c2z);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", "
							+ "[z] = " + z + ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[c2z] = " + c2z + ".");
		}
		Object[] result2_green = whileaa2branchccImpl
				.pattern_whileaa2branchcc_11_2_collecttranslatedelements_greenFBBBBBB(a2x, x, z, c, a, c2z);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileaa2branchccImpl.pattern_whileaa2branchcc_11_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, a2x, x, i, z, c, a, w2i, w, c2z);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a2x] = " + a2x + ", " + "[x] = " + x + ", " + "[i] = " + i + ", " + "[z] = " + z + ", "
					+ "[c] = " + c + ", " + "[a] = " + a + ", " + "[w2i] = " + w2i + ", " + "[w] = " + w + ", "
					+ "[c2z] = " + c2z + ".");
		}
		whileaa2branchccImpl.pattern_whileaa2branchcc_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult, a2x,
				x, i, z, c, a, w, c2z);
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[16];

		// 
		// 
		whileaa2branchccImpl.pattern_whileaa2branchcc_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, a2x,
				x, i, z, c, a, w2i, w, c2z);
		return whileaa2branchccImpl.pattern_whileaa2branchcc_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = whileaa2branchccImpl
				.pattern_whileaa2branchcc_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = whileaa2branchccImpl
				.pattern_whileaa2branchcc_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = whileaa2branchccImpl.pattern_whileaa2branchcc_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Command x = (Command) result2_binding[0];
		Branch i = (Branch) result2_binding[1];
		Command z = (Command) result2_binding[2];
		for (Object[] result2_black : whileaa2branchccImpl.pattern_whileaa2branchcc_12_2_corematch_blackBBBFFB(x, i, z,
				match)) {
			S2B w2i = (S2B) result2_black[3];
			While w = (While) result2_black[4];
			// ForEach 
			for (Object[] result3_black : whileaa2branchccImpl.pattern_whileaa2branchcc_12_3_findcontext_blackBBBBB(x,
					i, z, w2i, w)) {
				Object[] result3_green = whileaa2branchccImpl
						.pattern_whileaa2branchcc_12_3_findcontext_greenBBBBBFFFFF(x, i, z, w2i, w);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = whileaa2branchccImpl
						.pattern_whileaa2branchcc_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, x, i,
								z, w2i, w);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[x] = " + x + ", " + "[i] = " + i
							+ ", " + "[z] = " + z + ", " + "[w2i] = " + w2i + ", " + "[w] = " + w + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (whileaa2branchccImpl.pattern_whileaa2branchcc_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = whileaa2branchccImpl
							.pattern_whileaa2branchcc_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					whileaa2branchccImpl.pattern_whileaa2branchcc_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return whileaa2branchccImpl.pattern_whileaa2branchcc_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Command x, Branch i, Command z) {
		match.registerObject("x", x);
		match.registerObject("i", i);
		match.registerObject("z", z);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command x, Branch i, Command z) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Command x, Branch i, Command z, S2B w2i,
			While w) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("i", i);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject a2x, EObject x, EObject i, EObject z,
			EObject c, EObject a, EObject w2i, EObject w, EObject c2z) {
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("c2z", c2z);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_84(EMoflonEdge _edge_positive) {

		Object[] result1_bindingAndBlack = whileaa2branchccImpl
				.pattern_whileaa2branchcc_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whileaa2branchccImpl.pattern_whileaa2branchcc_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whileaa2branchccImpl
				.pattern_whileaa2branchcc_20_2_testcorematchandDECs_blackFFFB(_edge_positive)) {
			Command x = (Command) result2_black[0];
			Branch i = (Branch) result2_black[1];
			Command z = (Command) result2_black[2];
			Object[] result2_green = whileaa2branchccImpl
					.pattern_whileaa2branchcc_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileaa2branchccImpl
					.pattern_whileaa2branchcc_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, x, i, z)) {
				// 
				if (whileaa2branchccImpl
						.pattern_whileaa2branchcc_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = whileaa2branchccImpl
							.pattern_whileaa2branchcc_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whileaa2branchccImpl.pattern_whileaa2branchcc_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whileaa2branchccImpl.pattern_whileaa2branchcc_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_84(EMoflonEdge _edge_next) {

		Object[] result1_bindingAndBlack = whileaa2branchccImpl
				.pattern_whileaa2branchcc_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = whileaa2branchccImpl.pattern_whileaa2branchcc_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : whileaa2branchccImpl
				.pattern_whileaa2branchcc_21_2_testcorematchandDECs_blackFFFB(_edge_next)) {
			Assignment c = (Assignment) result2_black[0];
			Assignment a = (Assignment) result2_black[1];
			While w = (While) result2_black[2];
			Object[] result2_green = whileaa2branchccImpl
					.pattern_whileaa2branchcc_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileaa2branchccImpl
					.pattern_whileaa2branchcc_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, c, a, w)) {
				// 
				if (whileaa2branchccImpl
						.pattern_whileaa2branchcc_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = whileaa2branchccImpl
							.pattern_whileaa2branchcc_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					whileaa2branchccImpl.pattern_whileaa2branchcc_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return whileaa2branchccImpl.pattern_whileaa2branchcc_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("whileaa2branchcc");
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
		ruleResult.setRule("whileaa2branchcc");
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

		Object[] result1_black = whileaa2branchccImpl.pattern_whileaa2branchcc_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whileaa2branchccImpl.pattern_whileaa2branchcc_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = whileaa2branchccImpl
				.pattern_whileaa2branchcc_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Command x = (Command) result2_bindingAndBlack[0];
		Branch i = (Branch) result2_bindingAndBlack[1];
		Command z = (Command) result2_bindingAndBlack[2];
		Assignment c = (Assignment) result2_bindingAndBlack[3];
		Assignment a = (Assignment) result2_bindingAndBlack[4];
		While w = (While) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = whileaa2branchccImpl
				.pattern_whileaa2branchcc_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, x, i, z, c, a, w, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[x] = " + x + ", " + "[i] = " + i + ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[a] = "
					+ a + ", " + "[w] = " + w + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whileaa2branchccImpl.pattern_whileaa2branchcc_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whileaa2branchccImpl
					.pattern_whileaa2branchcc_24_5_matchcorrcontext_blackBFBBB(i, w, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[1];
				Object[] result5_green = whileaa2branchccImpl
						.pattern_whileaa2branchcc_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whileaa2branchccImpl
						.pattern_whileaa2branchcc_24_6_createcorrespondence_blackBBBBBBB(x, i, z, c, a, w, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[x] = " + x + ", "
							+ "[i] = " + i + ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[a] = " + a + ", "
							+ "[w] = " + w + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whileaa2branchccImpl.pattern_whileaa2branchcc_24_6_createcorrespondence_greenFBBBBFB(x, z, c, a,
						ccMatch);
				//nothing S2N a2x = (S2N) result6_green[0];
				//nothing S2N c2z = (S2N) result6_green[5];

				Object[] result7_black = whileaa2branchccImpl
						.pattern_whileaa2branchcc_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				whileaa2branchccImpl.pattern_whileaa2branchcc_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return whileaa2branchccImpl.pattern_whileaa2branchcc_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Command x, Branch i, Command z, Assignment c, Assignment a, While w,
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
	public boolean checkDEC_FWD(Assignment c, Assignment a, While w) {// 
		Object[] result1_black = whileaa2branchccImpl.pattern_whileaa2branchcc_27_1_matchtggpattern_blackBBB(c, a, w);
		if (result1_black != null) {
			return whileaa2branchccImpl.pattern_whileaa2branchcc_27_2_expressionF();
		} else {
			return whileaa2branchccImpl.pattern_whileaa2branchcc_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Command x, Branch i, Command z) {// 
		Object[] result1_black = whileaa2branchccImpl.pattern_whileaa2branchcc_28_1_matchtggpattern_blackBBB(x, i, z);
		if (result1_black != null) {
			return whileaa2branchccImpl.pattern_whileaa2branchcc_28_2_expressionF();
		} else {
			return whileaa2branchccImpl.pattern_whileaa2branchcc_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B w2iParameter) {

		Object[] result1_black = whileaa2branchccImpl.pattern_whileaa2branchcc_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = whileaa2branchccImpl.pattern_whileaa2branchcc_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : whileaa2branchccImpl
				.pattern_whileaa2branchcc_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList w2iList = (RuleEntryList) result2_black[0];
			Branch i = (Branch) result2_black[1];
			S2B w2i = (S2B) result2_black[2];
			While w = (While) result2_black[3];

			Object[] result3_bindingAndBlack = whileaa2branchccImpl
					.pattern_whileaa2branchcc_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, i, w2i, w,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[i] = " + i + ", " + "[w2i] = " + w2i
						+ ", " + "[w] = " + w + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whileaa2branchccImpl.pattern_whileaa2branchcc_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whileaa2branchccImpl.pattern_whileaa2branchcc_29_5_checknacs_blackBBB(i, w2i,
						w);
				if (result5_black != null) {

					Object[] result6_black = whileaa2branchccImpl.pattern_whileaa2branchcc_29_6_perform_blackBBBB(i,
							w2i, w, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[i] = " + i + ", "
								+ "[w2i] = " + w2i + ", " + "[w] = " + w + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whileaa2branchccImpl.pattern_whileaa2branchcc_29_6_perform_greenFFBFFFBFB(i, w, ruleResult);
					//nothing S2N a2x = (S2N) result6_green[0];
					//nothing Command x = (Command) result6_green[1];
					//nothing Command z = (Command) result6_green[3];
					//nothing Assignment c = (Assignment) result6_green[4];
					//nothing Assignment a = (Assignment) result6_green[5];
					//nothing S2N c2z = (S2N) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return whileaa2branchccImpl.pattern_whileaa2branchcc_29_7_expressionFB(ruleResult);
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
		case RulesPackage.WHILEAA2BRANCHCC___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_ASSIGNMENT_WHILE:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3));
		case RulesPackage.WHILEAA2BRANCHCC___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEAA2BRANCHCC___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEAA2BRANCHCC___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_ASSIGNMENT_WHILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3));
			return null;
		case RulesPackage.WHILEAA2BRANCHCC___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_ASSIGNMENT_WHILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Assignment) arguments.get(2), (While) arguments.get(3));
		case RulesPackage.WHILEAA2BRANCHCC___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEAA2BRANCHCC___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BRANCH_ASSIGNMENT_ASSIGNMENT_S2B_WHILE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Assignment) arguments.get(2), (Assignment) arguments.get(3), (S2B) arguments.get(4),
					(While) arguments.get(5));
		case RulesPackage.WHILEAA2BRANCHCC___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.WHILEAA2BRANCHCC___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.WHILEAA2BRANCHCC___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.WHILEAA2BRANCHCC___IS_APPROPRIATE_BWD__MATCH_COMMAND_BRANCH_COMMAND:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3));
		case RulesPackage.WHILEAA2BRANCHCC___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEAA2BRANCHCC___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEAA2BRANCHCC___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_BRANCH_COMMAND:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3));
			return null;
		case RulesPackage.WHILEAA2BRANCHCC___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_BRANCH_COMMAND:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3));
		case RulesPackage.WHILEAA2BRANCHCC___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEAA2BRANCHCC___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMMAND_BRANCH_COMMAND_S2B_WHILE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (S2B) arguments.get(4),
					(While) arguments.get(5));
		case RulesPackage.WHILEAA2BRANCHCC___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEAA2BRANCHCC___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.WHILEAA2BRANCHCC___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEAA2BRANCHCC___IS_APPROPRIATE_BWD_EMOFLON_EDGE_84__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_84((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEAA2BRANCHCC___IS_APPROPRIATE_FWD_EMOFLON_EDGE_84__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_84((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEAA2BRANCHCC___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEAA2BRANCHCC___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEAA2BRANCHCC___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEAA2BRANCHCC___IS_APPLICABLE_SOLVE_CSP_CC__COMMAND_BRANCH_COMMAND_ASSIGNMENT_ASSIGNMENT_WHILE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Command) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (Assignment) arguments.get(3), (Assignment) arguments.get(4),
					(While) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.WHILEAA2BRANCHCC___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEAA2BRANCHCC___CHECK_DEC_FWD__ASSIGNMENT_ASSIGNMENT_WHILE:
			return checkDEC_FWD((Assignment) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2));
		case RulesPackage.WHILEAA2BRANCHCC___CHECK_DEC_BWD__COMMAND_BRANCH_COMMAND:
			return checkDEC_BWD((Command) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2));
		case RulesPackage.WHILEAA2BRANCHCC___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILEAA2BRANCHCC___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_S2B_WHILE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(S2B) arguments.get(2), (While) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILEAA2BRANCHCC___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whileaa2branchcc_0_1_initialbindings_blackBBBBB(whileaa2branchcc _this,
			Match match, Assignment c, Assignment a, While w) {
		if (!a.equals(c)) {
			return new Object[] { _this, match, c, a, w };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_0_2_SolveCSP_bindingFBBBBB(whileaa2branchcc _this,
			Match match, Assignment c, Assignment a, While w) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, c, a, w);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, c, a, w };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileaa2branchcc_0_2_SolveCSP_bindingAndBlackFBBBBB(whileaa2branchcc _this,
			Match match, Assignment c, Assignment a, While w) {
		Object[] result_pattern_whileaa2branchcc_0_2_SolveCSP_binding = pattern_whileaa2branchcc_0_2_SolveCSP_bindingFBBBBB(
				_this, match, c, a, w);
		if (result_pattern_whileaa2branchcc_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileaa2branchcc_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whileaa2branchcc_0_2_SolveCSP_black = pattern_whileaa2branchcc_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileaa2branchcc_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, c, a, w };
			}
		}
		return null;
	}

	public static final boolean pattern_whileaa2branchcc_0_3_CheckCSP_expressionFBB(whileaa2branchcc _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileaa2branchcc_0_4_collectelementstobetranslated_blackBBBB(Match match,
			Assignment c, Assignment a, While w) {
		if (!a.equals(c)) {
			return new Object[] { match, c, a, w };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_0_4_collectelementstobetranslated_greenBBBBFF(Match match,
			Assignment c, Assignment a, While w) {
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(c);
		match.getToBeTranslatedNodes().add(a);
		String w__c____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		w__c____next.setName(w__c____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		return new Object[] { match, c, a, w, w__c____next, w__a____first };
	}

	public static final Object[] pattern_whileaa2branchcc_0_5_collectcontextelements_blackBBBB(Match match,
			Assignment c, Assignment a, While w) {
		if (!a.equals(c)) {
			return new Object[] { match, c, a, w };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whileaa2branchcc_0_6_registerobjectstomatch_expressionBBBBB(whileaa2branchcc _this,
			Match match, Assignment c, Assignment a, While w) {
		_this.registerObjectsToMatch_FWD(match, c, a, w);

	}

	public static final boolean pattern_whileaa2branchcc_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileaa2branchcc_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileaa2branchcc_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("i");
		EObject _localVariable_1 = isApplicableMatch.getObject("c");
		EObject _localVariable_2 = isApplicableMatch.getObject("a");
		EObject _localVariable_3 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_4 = isApplicableMatch.getObject("w");
		EObject tmpI = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpW2i = _localVariable_3;
		EObject tmpW = _localVariable_4;
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			if (tmpC instanceof Assignment) {
				Assignment c = (Assignment) tmpC;
				if (tmpA instanceof Assignment) {
					Assignment a = (Assignment) tmpA;
					if (tmpW2i instanceof S2B) {
						S2B w2i = (S2B) tmpW2i;
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							return new Object[] { i, c, a, w2i, w, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_1_1_performtransformation_blackBBBBBFBB(Branch i,
			Assignment c, Assignment a, S2B w2i, While w, whileaa2branchcc _this, IsApplicableMatch isApplicableMatch) {
		if (!a.equals(c)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { i, c, a, w2i, w, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			whileaa2branchcc _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whileaa2branchcc_1_1_performtransformation_binding = pattern_whileaa2branchcc_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_whileaa2branchcc_1_1_performtransformation_binding != null) {
			Branch i = (Branch) result_pattern_whileaa2branchcc_1_1_performtransformation_binding[0];
			Assignment c = (Assignment) result_pattern_whileaa2branchcc_1_1_performtransformation_binding[1];
			Assignment a = (Assignment) result_pattern_whileaa2branchcc_1_1_performtransformation_binding[2];
			S2B w2i = (S2B) result_pattern_whileaa2branchcc_1_1_performtransformation_binding[3];
			While w = (While) result_pattern_whileaa2branchcc_1_1_performtransformation_binding[4];

			Object[] result_pattern_whileaa2branchcc_1_1_performtransformation_black = pattern_whileaa2branchcc_1_1_performtransformation_blackBBBBBFBB(
					i, c, a, w2i, w, _this, isApplicableMatch);
			if (result_pattern_whileaa2branchcc_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileaa2branchcc_1_1_performtransformation_black[5];

				return new Object[] { i, c, a, w2i, w, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_1_1_performtransformation_greenFFBFBBF(Branch i, Assignment c,
			Assignment a) {
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command x = ControlflowFactory.eINSTANCE.createCommand();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		S2N c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2x.setSource(a);
		i.setPositive(x);
		a2x.setTarget(x);
		i.setNegative(z);
		c2z.setSource(c);
		c2z.setTarget(z);
		return new Object[] { a2x, x, i, z, c, a, c2z };
	}

	public static final Object[] pattern_whileaa2branchcc_1_2_collecttranslatedelements_blackBBBBBB(S2N a2x, Command x,
			Command z, Assignment c, Assignment a, S2N c2z) {
		if (!a2x.equals(c2z)) {
			if (!x.equals(z)) {
				if (!a.equals(c)) {
					return new Object[] { a2x, x, z, c, a, c2z };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_1_2_collecttranslatedelements_greenFBBBBBB(S2N a2x, Command x,
			Command z, Assignment c, Assignment a, S2N c2z) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(c2z);
		return new Object[] { ruleresult, a2x, x, z, c, a, c2z };
	}

	public static final Object[] pattern_whileaa2branchcc_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject a2x, EObject x, EObject i, EObject z, EObject c, EObject a,
			EObject w2i, EObject w, EObject c2z) {
		if (!a2x.equals(x)) {
			if (!a2x.equals(i)) {
				if (!a2x.equals(z)) {
					if (!a2x.equals(c)) {
						if (!a2x.equals(w2i)) {
							if (!a2x.equals(w)) {
								if (!a2x.equals(c2z)) {
									if (!x.equals(z)) {
										if (!i.equals(x)) {
											if (!i.equals(z)) {
												if (!i.equals(w2i)) {
													if (!i.equals(w)) {
														if (!c.equals(x)) {
															if (!c.equals(i)) {
																if (!c.equals(z)) {
																	if (!c.equals(w2i)) {
																		if (!c.equals(w)) {
																			if (!c.equals(c2z)) {
																				if (!a.equals(a2x)) {
																					if (!a.equals(x)) {
																						if (!a.equals(i)) {
																							if (!a.equals(z)) {
																								if (!a.equals(c)) {
																									if (!a.equals(
																											w2i)) {
																										if (!a.equals(
																												w)) {
																											if (!a.equals(
																													c2z)) {
																												if (!w2i.equals(
																														x)) {
																													if (!w2i.equals(
																															z)) {
																														if (!w.equals(
																																x)) {
																															if (!w.equals(
																																	z)) {
																																if (!w.equals(
																																		w2i)) {
																																	if (!c2z.equals(
																																			x)) {
																																		if (!c2z.equals(
																																				i)) {
																																			if (!c2z.equals(
																																					z)) {
																																				if (!c2z.equals(
																																						w2i)) {
																																					if (!c2z.equals(
																																							w)) {
																																						return new Object[] {
																																								ruleresult,
																																								a2x,
																																								x,
																																								i,
																																								z,
																																								c,
																																								a,
																																								w2i,
																																								w,
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
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject a2x, EObject x, EObject i, EObject z, EObject c, EObject a, EObject w,
			EObject c2z) {
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileaa2branchcc";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String a2x__a____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String w__c____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String c2z__c____source_name_prime = "source";
		String c2z__z____target_name_prime = "target";
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		return new Object[] { ruleresult, a2x, x, i, z, c, a, w, c2z, i__x____positive, i__z____negative,
				a2x__a____source, a2x__x____target, w__c____next, w__a____first, c2z__c____source, c2z__z____target };
	}

	public static final void pattern_whileaa2branchcc_1_5_registerobjects_expressionBBBBBBBBBBB(whileaa2branchcc _this,
			PerformRuleResult ruleresult, EObject a2x, EObject x, EObject i, EObject z, EObject c, EObject a,
			EObject w2i, EObject w, EObject c2z) {
		_this.registerObjects_FWD(ruleresult, a2x, x, i, z, c, a, w2i, w, c2z);

	}

	public static final PerformRuleResult pattern_whileaa2branchcc_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileaa2branchcc_2_1_preparereturnvalue_bindingFB(whileaa2branchcc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_2_1_preparereturnvalue_blackFBB(EClass eClass,
			whileaa2branchcc _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_2_1_preparereturnvalue_bindingAndBlackFFB(
			whileaa2branchcc _this) {
		Object[] result_pattern_whileaa2branchcc_2_1_preparereturnvalue_binding = pattern_whileaa2branchcc_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileaa2branchcc_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whileaa2branchcc_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileaa2branchcc_2_1_preparereturnvalue_black = pattern_whileaa2branchcc_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whileaa2branchcc_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whileaa2branchcc_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whileaa2branchcc";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whileaa2branchcc_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("c");
		EObject _localVariable_1 = match.getObject("a");
		EObject _localVariable_2 = match.getObject("w");
		EObject tmpC = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpW = _localVariable_2;
		if (tmpC instanceof Assignment) {
			Assignment c = (Assignment) tmpC;
			if (tmpA instanceof Assignment) {
				Assignment a = (Assignment) tmpA;
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					return new Object[] { c, a, w, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileaa2branchcc_2_2_corematch_blackFBBFBB(Assignment c,
			Assignment a, While w, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(c)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class, "source")) {
				Branch i = w2i.getTarget();
				if (i != null) {
					_result.add(new Object[] { i, c, a, w2i, w, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileaa2branchcc_2_3_findcontext_blackBBBBB(Branch i, Assignment c,
			Assignment a, S2B w2i, While w) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(c)) {
			if (i.equals(w2i.getTarget())) {
				if (w.equals(w2i.getSource())) {
					if (c.equals(w.getNext())) {
						if (a.equals(w.getFirst())) {
							_result.add(new Object[] { i, c, a, w2i, w });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whileaa2branchcc_2_3_findcontext_greenBBBBBFFFFF(Branch i, Assignment c,
			Assignment a, S2B w2i, While w) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w2i__i____target_name_prime = "target";
		String w2i__w____source_name_prime = "source";
		String w__c____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(w);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		w2i__i____target.setName(w2i__i____target_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		return new Object[] { i, c, a, w2i, w, isApplicableMatch, w2i__i____target, w2i__w____source, w__c____next,
				w__a____first };
	}

	public static final Object[] pattern_whileaa2branchcc_2_4_solveCSP_bindingFBBBBBBB(whileaa2branchcc _this,
			IsApplicableMatch isApplicableMatch, Branch i, Assignment c, Assignment a, S2B w2i, While w) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, i, c, a, w2i, w);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, i, c, a, w2i, w };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileaa2branchcc_2_4_solveCSP_bindingAndBlackFBBBBBBB(whileaa2branchcc _this,
			IsApplicableMatch isApplicableMatch, Branch i, Assignment c, Assignment a, S2B w2i, While w) {
		Object[] result_pattern_whileaa2branchcc_2_4_solveCSP_binding = pattern_whileaa2branchcc_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, i, c, a, w2i, w);
		if (result_pattern_whileaa2branchcc_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileaa2branchcc_2_4_solveCSP_binding[0];

			Object[] result_pattern_whileaa2branchcc_2_4_solveCSP_black = pattern_whileaa2branchcc_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileaa2branchcc_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, i, c, a, w2i, w };
			}
		}
		return null;
	}

	public static final boolean pattern_whileaa2branchcc_2_5_checkCSP_expressionFBB(whileaa2branchcc _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileaa2branchcc_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whileaa2branchcc_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whileaa2branchcc";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whileaa2branchcc_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileaa2branchcc_10_1_initialbindings_blackBBBBB(whileaa2branchcc _this,
			Match match, Command x, Branch i, Command z) {
		if (!x.equals(z)) {
			return new Object[] { _this, match, x, i, z };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_10_2_SolveCSP_bindingFBBBBB(whileaa2branchcc _this,
			Match match, Command x, Branch i, Command z) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, x, i, z);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, x, i, z };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileaa2branchcc_10_2_SolveCSP_bindingAndBlackFBBBBB(whileaa2branchcc _this,
			Match match, Command x, Branch i, Command z) {
		Object[] result_pattern_whileaa2branchcc_10_2_SolveCSP_binding = pattern_whileaa2branchcc_10_2_SolveCSP_bindingFBBBBB(
				_this, match, x, i, z);
		if (result_pattern_whileaa2branchcc_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileaa2branchcc_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whileaa2branchcc_10_2_SolveCSP_black = pattern_whileaa2branchcc_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileaa2branchcc_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, x, i, z };
			}
		}
		return null;
	}

	public static final boolean pattern_whileaa2branchcc_10_3_CheckCSP_expressionFBB(whileaa2branchcc _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileaa2branchcc_10_4_collectelementstobetranslated_blackBBBB(Match match,
			Command x, Branch i, Command z) {
		if (!x.equals(z)) {
			return new Object[] { match, x, i, z };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_10_4_collectelementstobetranslated_greenBBBBFF(Match match,
			Command x, Branch i, Command z) {
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(z);
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		return new Object[] { match, x, i, z, i__x____positive, i__z____negative };
	}

	public static final Object[] pattern_whileaa2branchcc_10_5_collectcontextelements_blackBBBB(Match match, Command x,
			Branch i, Command z) {
		if (!x.equals(z)) {
			return new Object[] { match, x, i, z };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_10_5_collectcontextelements_greenBB(Match match, Branch i) {
		match.getContextNodes().add(i);
		return new Object[] { match, i };
	}

	public static final void pattern_whileaa2branchcc_10_6_registerobjectstomatch_expressionBBBBB(
			whileaa2branchcc _this, Match match, Command x, Branch i, Command z) {
		_this.registerObjectsToMatch_BWD(match, x, i, z);

	}

	public static final boolean pattern_whileaa2branchcc_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileaa2branchcc_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileaa2branchcc_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("x");
		EObject _localVariable_1 = isApplicableMatch.getObject("i");
		EObject _localVariable_2 = isApplicableMatch.getObject("z");
		EObject _localVariable_3 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_4 = isApplicableMatch.getObject("w");
		EObject tmpX = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpW2i = _localVariable_3;
		EObject tmpW = _localVariable_4;
		if (tmpX instanceof Command) {
			Command x = (Command) tmpX;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpZ instanceof Command) {
					Command z = (Command) tmpZ;
					if (tmpW2i instanceof S2B) {
						S2B w2i = (S2B) tmpW2i;
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							return new Object[] { x, i, z, w2i, w, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_11_1_performtransformation_blackBBBBBFBB(Command x, Branch i,
			Command z, S2B w2i, While w, whileaa2branchcc _this, IsApplicableMatch isApplicableMatch) {
		if (!x.equals(z)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { x, i, z, w2i, w, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			whileaa2branchcc _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_whileaa2branchcc_11_1_performtransformation_binding = pattern_whileaa2branchcc_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_whileaa2branchcc_11_1_performtransformation_binding != null) {
			Command x = (Command) result_pattern_whileaa2branchcc_11_1_performtransformation_binding[0];
			Branch i = (Branch) result_pattern_whileaa2branchcc_11_1_performtransformation_binding[1];
			Command z = (Command) result_pattern_whileaa2branchcc_11_1_performtransformation_binding[2];
			S2B w2i = (S2B) result_pattern_whileaa2branchcc_11_1_performtransformation_binding[3];
			While w = (While) result_pattern_whileaa2branchcc_11_1_performtransformation_binding[4];

			Object[] result_pattern_whileaa2branchcc_11_1_performtransformation_black = pattern_whileaa2branchcc_11_1_performtransformation_blackBBBBBFBB(
					x, i, z, w2i, w, _this, isApplicableMatch);
			if (result_pattern_whileaa2branchcc_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileaa2branchcc_11_1_performtransformation_black[5];

				return new Object[] { x, i, z, w2i, w, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_11_1_performtransformation_greenFBBFFBF(Command x, Command z,
			While w) {
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Assignment c = SourcecodeFactory.eINSTANCE.createAssignment();
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2x.setTarget(x);
		w.setNext(c);
		a2x.setSource(a);
		w.setFirst(a);
		c2z.setSource(c);
		c2z.setTarget(z);
		return new Object[] { a2x, x, z, c, a, w, c2z };
	}

	public static final Object[] pattern_whileaa2branchcc_11_2_collecttranslatedelements_blackBBBBBB(S2N a2x, Command x,
			Command z, Assignment c, Assignment a, S2N c2z) {
		if (!a2x.equals(c2z)) {
			if (!x.equals(z)) {
				if (!a.equals(c)) {
					return new Object[] { a2x, x, z, c, a, c2z };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_11_2_collecttranslatedelements_greenFBBBBBB(S2N a2x,
			Command x, Command z, Assignment c, Assignment a, S2N c2z) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(c2z);
		return new Object[] { ruleresult, a2x, x, z, c, a, c2z };
	}

	public static final Object[] pattern_whileaa2branchcc_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject a2x, EObject x, EObject i, EObject z, EObject c, EObject a,
			EObject w2i, EObject w, EObject c2z) {
		if (!a2x.equals(x)) {
			if (!a2x.equals(i)) {
				if (!a2x.equals(z)) {
					if (!a2x.equals(c)) {
						if (!a2x.equals(w2i)) {
							if (!a2x.equals(w)) {
								if (!a2x.equals(c2z)) {
									if (!x.equals(z)) {
										if (!i.equals(x)) {
											if (!i.equals(z)) {
												if (!i.equals(w2i)) {
													if (!i.equals(w)) {
														if (!c.equals(x)) {
															if (!c.equals(i)) {
																if (!c.equals(z)) {
																	if (!c.equals(w2i)) {
																		if (!c.equals(w)) {
																			if (!c.equals(c2z)) {
																				if (!a.equals(a2x)) {
																					if (!a.equals(x)) {
																						if (!a.equals(i)) {
																							if (!a.equals(z)) {
																								if (!a.equals(c)) {
																									if (!a.equals(
																											w2i)) {
																										if (!a.equals(
																												w)) {
																											if (!a.equals(
																													c2z)) {
																												if (!w2i.equals(
																														x)) {
																													if (!w2i.equals(
																															z)) {
																														if (!w.equals(
																																x)) {
																															if (!w.equals(
																																	z)) {
																																if (!w.equals(
																																		w2i)) {
																																	if (!c2z.equals(
																																			x)) {
																																		if (!c2z.equals(
																																				i)) {
																																			if (!c2z.equals(
																																					z)) {
																																				if (!c2z.equals(
																																						w2i)) {
																																					if (!c2z.equals(
																																							w)) {
																																						return new Object[] {
																																								ruleresult,
																																								a2x,
																																								x,
																																								i,
																																								z,
																																								c,
																																								a,
																																								w2i,
																																								w,
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
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject a2x, EObject x, EObject i, EObject z, EObject c, EObject a, EObject w,
			EObject c2z) {
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileaa2branchcc";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String a2x__a____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String w__c____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		String c2z__c____source_name_prime = "source";
		String c2z__z____target_name_prime = "target";
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		return new Object[] { ruleresult, a2x, x, i, z, c, a, w, c2z, i__x____positive, i__z____negative,
				a2x__a____source, a2x__x____target, w__c____next, w__a____first, c2z__c____source, c2z__z____target };
	}

	public static final void pattern_whileaa2branchcc_11_5_registerobjects_expressionBBBBBBBBBBB(whileaa2branchcc _this,
			PerformRuleResult ruleresult, EObject a2x, EObject x, EObject i, EObject z, EObject c, EObject a,
			EObject w2i, EObject w, EObject c2z) {
		_this.registerObjects_BWD(ruleresult, a2x, x, i, z, c, a, w2i, w, c2z);

	}

	public static final PerformRuleResult pattern_whileaa2branchcc_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileaa2branchcc_12_1_preparereturnvalue_bindingFB(whileaa2branchcc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_12_1_preparereturnvalue_blackFBB(EClass eClass,
			whileaa2branchcc _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_12_1_preparereturnvalue_bindingAndBlackFFB(
			whileaa2branchcc _this) {
		Object[] result_pattern_whileaa2branchcc_12_1_preparereturnvalue_binding = pattern_whileaa2branchcc_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileaa2branchcc_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_whileaa2branchcc_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileaa2branchcc_12_1_preparereturnvalue_black = pattern_whileaa2branchcc_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_whileaa2branchcc_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_whileaa2branchcc_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "whileaa2branchcc";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_whileaa2branchcc_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("x");
		EObject _localVariable_1 = match.getObject("i");
		EObject _localVariable_2 = match.getObject("z");
		EObject tmpX = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		if (tmpX instanceof Command) {
			Command x = (Command) tmpX;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpZ instanceof Command) {
					Command z = (Command) tmpZ;
					return new Object[] { x, i, z, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileaa2branchcc_12_2_corematch_blackBBBFFB(Command x, Branch i,
			Command z, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(z)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class, "target")) {
				Statement tmpW = w2i.getSource();
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					_result.add(new Object[] { x, i, z, w2i, w, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileaa2branchcc_12_3_findcontext_blackBBBBB(Command x, Branch i,
			Command z, S2B w2i, While w) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(z)) {
			if (x.equals(i.getPositive())) {
				if (z.equals(i.getNegative())) {
					if (i.equals(w2i.getTarget())) {
						if (w.equals(w2i.getSource())) {
							_result.add(new Object[] { x, i, z, w2i, w });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_whileaa2branchcc_12_3_findcontext_greenBBBBBFFFFF(Command x, Branch i,
			Command z, S2B w2i, While w) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String w2i__i____target_name_prime = "target";
		String w2i__w____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(i);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(w);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		return new Object[] { x, i, z, w2i, w, isApplicableMatch, i__x____positive, i__z____negative, w2i__i____target,
				w2i__w____source };
	}

	public static final Object[] pattern_whileaa2branchcc_12_4_solveCSP_bindingFBBBBBBB(whileaa2branchcc _this,
			IsApplicableMatch isApplicableMatch, Command x, Branch i, Command z, S2B w2i, While w) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, x, i, z, w2i, w);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, x, i, z, w2i, w };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileaa2branchcc_12_4_solveCSP_bindingAndBlackFBBBBBBB(whileaa2branchcc _this,
			IsApplicableMatch isApplicableMatch, Command x, Branch i, Command z, S2B w2i, While w) {
		Object[] result_pattern_whileaa2branchcc_12_4_solveCSP_binding = pattern_whileaa2branchcc_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, x, i, z, w2i, w);
		if (result_pattern_whileaa2branchcc_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileaa2branchcc_12_4_solveCSP_binding[0];

			Object[] result_pattern_whileaa2branchcc_12_4_solveCSP_black = pattern_whileaa2branchcc_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileaa2branchcc_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, x, i, z, w2i, w };
			}
		}
		return null;
	}

	public static final boolean pattern_whileaa2branchcc_12_5_checkCSP_expressionFBB(whileaa2branchcc _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileaa2branchcc_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_whileaa2branchcc_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "whileaa2branchcc";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_whileaa2branchcc_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_whileaa2branchcc_20_1_preparereturnvalue_bindingFB(whileaa2branchcc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whileaa2branchcc _this) {
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

	public static final Object[] pattern_whileaa2branchcc_20_1_preparereturnvalue_bindingAndBlackFFBF(
			whileaa2branchcc _this) {
		Object[] result_pattern_whileaa2branchcc_20_1_preparereturnvalue_binding = pattern_whileaa2branchcc_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileaa2branchcc_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whileaa2branchcc_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileaa2branchcc_20_1_preparereturnvalue_black = pattern_whileaa2branchcc_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whileaa2branchcc_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whileaa2branchcc_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whileaa2branchcc_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whileaa2branchcc_20_2_testcorematchandDECs_black_nac_0B(Command x) {
		for (Graph __DEC_x_root_170121 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_20_2_testcorematchandDECs_black_nac_1BB(Command x, Branch i) {
		for (Branch __DEC_x_positive_696212 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Branch.class, "positive")) {
			if (!i.equals(__DEC_x_positive_696212)) {
				return new Object[] { x, i };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_20_2_testcorematchandDECs_black_nac_2BB(Command x, Branch i) {
		for (Branch __DEC_x_negative_905109 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Branch.class, "negative")) {
			if (!i.equals(__DEC_x_negative_905109)) {
				return new Object[] { x, i };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_20_2_testcorematchandDECs_black_nac_3B(Command z) {
		for (Graph __DEC_z_root_547104 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_20_2_testcorematchandDECs_black_nac_4BB(Command z, Branch i) {
		for (Branch __DEC_z_positive_493526 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Branch.class, "positive")) {
			if (!i.equals(__DEC_z_positive_493526)) {
				return new Object[] { z, i };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_20_2_testcorematchandDECs_black_nac_5BB(Command z, Branch i) {
		for (Branch __DEC_z_negative_361458 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Branch.class, "negative")) {
			if (!i.equals(__DEC_z_negative_361458)) {
				return new Object[] { z, i };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_20_2_testcorematchandDECs_black_nac_6BB(Branch i, Command x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_20_2_testcorematchandDECs_black_nac_7BB(Branch i, Command z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileaa2branchcc_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_positive) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpI = _edge_positive.getSrc();
		if (tmpI instanceof Branch) {
			Branch i = (Branch) tmpI;
			EObject tmpX = _edge_positive.getTrg();
			if (tmpX instanceof Command) {
				Command x = (Command) tmpX;
				if (x.equals(i.getPositive())) {
					Node tmpZ = i.getNegative();
					if (tmpZ instanceof Command) {
						Command z = (Command) tmpZ;
						if (!x.equals(z)) {
							if (pattern_whileaa2branchcc_20_2_testcorematchandDECs_black_nac_0B(x) == null) {
								if (pattern_whileaa2branchcc_20_2_testcorematchandDECs_black_nac_1BB(x, i) == null) {
									if (pattern_whileaa2branchcc_20_2_testcorematchandDECs_black_nac_2BB(x,
											i) == null) {
										if (pattern_whileaa2branchcc_20_2_testcorematchandDECs_black_nac_6BB(i,
												x) == null) {
											if (pattern_whileaa2branchcc_20_2_testcorematchandDECs_black_nac_3B(
													z) == null) {
												if (pattern_whileaa2branchcc_20_2_testcorematchandDECs_black_nac_4BB(z,
														i) == null) {
													if (pattern_whileaa2branchcc_20_2_testcorematchandDECs_black_nac_5BB(
															z, i) == null) {
														if (pattern_whileaa2branchcc_20_2_testcorematchandDECs_black_nac_7BB(
																i, z) == null) {
															_result.add(new Object[] { x, i, z, _edge_positive });
														}
													}
												}
											}
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

	public static final Object[] pattern_whileaa2branchcc_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whileaa2branchcc_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			whileaa2branchcc _this, Match match, Command x, Branch i, Command z) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, x, i, z);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whileaa2branchcc_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whileaa2branchcc _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileaa2branchcc_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whileaa2branchcc_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whileaa2branchcc_21_1_preparereturnvalue_bindingFB(whileaa2branchcc _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			whileaa2branchcc _this) {
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

	public static final Object[] pattern_whileaa2branchcc_21_1_preparereturnvalue_bindingAndBlackFFBF(
			whileaa2branchcc _this) {
		Object[] result_pattern_whileaa2branchcc_21_1_preparereturnvalue_binding = pattern_whileaa2branchcc_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_whileaa2branchcc_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_whileaa2branchcc_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_whileaa2branchcc_21_1_preparereturnvalue_black = pattern_whileaa2branchcc_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_whileaa2branchcc_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_whileaa2branchcc_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_whileaa2branchcc_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_whileaa2branchcc_21_2_testcorematchandDECs_black_nac_0B(Assignment c) {
		for (Decision __DEC_c_positive_550267 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_21_2_testcorematchandDECs_black_nac_1B(Assignment c) {
		for (Decision __DEC_c_negative_219145 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_21_2_testcorematchandDECs_black_nac_2BB(Assignment c,
			While w) {
		for (While __DEC_c_first_892558 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				While.class, "first")) {
			if (!w.equals(__DEC_c_first_892558)) {
				return new Object[] { c, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_21_2_testcorematchandDECs_black_nac_3BB(Assignment c,
			While w) {
		for (While __DEC_c_last_349895 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				While.class, "last")) {
			if (!w.equals(__DEC_c_last_349895)) {
				return new Object[] { c, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_21_2_testcorematchandDECs_black_nac_4B(Assignment c) {
		for (Program __DEC_c_first_539256 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_21_2_testcorematchandDECs_black_nac_5B(Assignment a) {
		for (Decision __DEC_a_positive_567465 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_21_2_testcorematchandDECs_black_nac_6B(Assignment a) {
		for (Decision __DEC_a_negative_464170 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_21_2_testcorematchandDECs_black_nac_7BB(Assignment a,
			While w) {
		for (While __DEC_a_last_132790 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!w.equals(__DEC_a_last_132790)) {
				return new Object[] { a, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_21_2_testcorematchandDECs_black_nac_8B(Assignment a) {
		for (Program __DEC_a_first_434798 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_21_2_testcorematchandDECs_black_nac_9BB(While w,
			Assignment c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_21_2_testcorematchandDECs_black_nac_10BB(While w,
			Assignment c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_21_2_testcorematchandDECs_black_nac_11BB(While w,
			Assignment a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileaa2branchcc_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpW = _edge_next.getSrc();
		if (tmpW instanceof While) {
			While w = (While) tmpW;
			EObject tmpC = _edge_next.getTrg();
			if (tmpC instanceof Assignment) {
				Assignment c = (Assignment) tmpC;
				if (c.equals(w.getNext())) {
					Statement tmpA = w.getFirst();
					if (tmpA instanceof Assignment) {
						Assignment a = (Assignment) tmpA;
						if (!a.equals(c)) {
							if (pattern_whileaa2branchcc_21_2_testcorematchandDECs_black_nac_0B(c) == null) {
								if (pattern_whileaa2branchcc_21_2_testcorematchandDECs_black_nac_1B(c) == null) {
									if (pattern_whileaa2branchcc_21_2_testcorematchandDECs_black_nac_2BB(c,
											w) == null) {
										if (pattern_whileaa2branchcc_21_2_testcorematchandDECs_black_nac_3BB(c,
												w) == null) {
											if (pattern_whileaa2branchcc_21_2_testcorematchandDECs_black_nac_4B(
													c) == null) {
												if (pattern_whileaa2branchcc_21_2_testcorematchandDECs_black_nac_9BB(w,
														c) == null) {
													if (pattern_whileaa2branchcc_21_2_testcorematchandDECs_black_nac_10BB(
															w, c) == null) {
														if (pattern_whileaa2branchcc_21_2_testcorematchandDECs_black_nac_5B(
																a) == null) {
															if (pattern_whileaa2branchcc_21_2_testcorematchandDECs_black_nac_6B(
																	a) == null) {
																if (pattern_whileaa2branchcc_21_2_testcorematchandDECs_black_nac_7BB(
																		a, w) == null) {
																	if (pattern_whileaa2branchcc_21_2_testcorematchandDECs_black_nac_8B(
																			a) == null) {
																		if (pattern_whileaa2branchcc_21_2_testcorematchandDECs_black_nac_11BB(
																				w, a) == null) {
																			_result.add(new Object[] { c, a, w,
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

		return _result;
	}

	public static final Object[] pattern_whileaa2branchcc_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whileaa2branchcc_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			whileaa2branchcc _this, Match match, Assignment c, Assignment a, While w) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, c, a, w);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_whileaa2branchcc_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			whileaa2branchcc _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileaa2branchcc_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_whileaa2branchcc_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_whileaa2branchcc_24_1_prepare_blackB(whileaa2branchcc _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whileaa2branchcc_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_whileaa2branchcc_24_2_matchsrctrgcontext_bindingFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("x");
		EObject _localVariable_1 = targetMatch.getObject("i");
		EObject _localVariable_2 = targetMatch.getObject("z");
		EObject _localVariable_3 = sourceMatch.getObject("c");
		EObject _localVariable_4 = sourceMatch.getObject("a");
		EObject _localVariable_5 = sourceMatch.getObject("w");
		EObject tmpX = _localVariable_0;
		EObject tmpI = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpW = _localVariable_5;
		if (tmpX instanceof Command) {
			Command x = (Command) tmpX;
			if (tmpI instanceof Branch) {
				Branch i = (Branch) tmpI;
				if (tmpZ instanceof Command) {
					Command z = (Command) tmpZ;
					if (tmpC instanceof Assignment) {
						Assignment c = (Assignment) tmpC;
						if (tmpA instanceof Assignment) {
							Assignment a = (Assignment) tmpA;
							if (tmpW instanceof While) {
								While w = (While) tmpW;
								return new Object[] { x, i, z, c, a, w, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_24_2_matchsrctrgcontext_blackBBBBBBBB(Command x, Branch i,
			Command z, Assignment c, Assignment a, While w, Match sourceMatch, Match targetMatch) {
		if (!x.equals(z)) {
			if (!a.equals(c)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { x, i, z, c, a, w, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileaa2branchcc_24_2_matchsrctrgcontext_binding = pattern_whileaa2branchcc_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_whileaa2branchcc_24_2_matchsrctrgcontext_binding != null) {
			Command x = (Command) result_pattern_whileaa2branchcc_24_2_matchsrctrgcontext_binding[0];
			Branch i = (Branch) result_pattern_whileaa2branchcc_24_2_matchsrctrgcontext_binding[1];
			Command z = (Command) result_pattern_whileaa2branchcc_24_2_matchsrctrgcontext_binding[2];
			Assignment c = (Assignment) result_pattern_whileaa2branchcc_24_2_matchsrctrgcontext_binding[3];
			Assignment a = (Assignment) result_pattern_whileaa2branchcc_24_2_matchsrctrgcontext_binding[4];
			While w = (While) result_pattern_whileaa2branchcc_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_whileaa2branchcc_24_2_matchsrctrgcontext_black = pattern_whileaa2branchcc_24_2_matchsrctrgcontext_blackBBBBBBBB(
					x, i, z, c, a, w, sourceMatch, targetMatch);
			if (result_pattern_whileaa2branchcc_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { x, i, z, c, a, w, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_24_3_solvecsp_bindingFBBBBBBBBB(whileaa2branchcc _this,
			Command x, Branch i, Command z, Assignment c, Assignment a, While w, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(x, i, z, c, a, w, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, x, i, z, c, a, w, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileaa2branchcc_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			whileaa2branchcc _this, Command x, Branch i, Command z, Assignment c, Assignment a, While w,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileaa2branchcc_24_3_solvecsp_binding = pattern_whileaa2branchcc_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, x, i, z, c, a, w, sourceMatch, targetMatch);
		if (result_pattern_whileaa2branchcc_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whileaa2branchcc_24_3_solvecsp_binding[0];

			Object[] result_pattern_whileaa2branchcc_24_3_solvecsp_black = pattern_whileaa2branchcc_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whileaa2branchcc_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, x, i, z, c, a, w, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whileaa2branchcc_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileaa2branchcc_24_5_matchcorrcontext_blackBFBBB(Branch i, While w,
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

	public static final Object[] pattern_whileaa2branchcc_24_5_matchcorrcontext_greenBBBF(S2B w2i, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "whileaa2branchcc";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(w2i);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { w2i, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_whileaa2branchcc_24_6_createcorrespondence_blackBBBBBBB(Command x, Branch i,
			Command z, Assignment c, Assignment a, While w, CCMatch ccMatch) {
		if (!x.equals(z)) {
			if (!a.equals(c)) {
				return new Object[] { x, i, z, c, a, w, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_24_6_createcorrespondence_greenFBBBBFB(Command x, Command z,
			Assignment c, Assignment a, CCMatch ccMatch) {
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		c2z.setSource(c);
		c2z.setTarget(z);
		ccMatch.getCreateCorr().add(c2z);
		return new Object[] { a2x, x, z, c, a, c2z, ccMatch };
	}

	public static final Object[] pattern_whileaa2branchcc_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_whileaa2branchcc_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "whileaa2branchcc";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_whileaa2branchcc_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_whileaa2branchcc_27_1_matchtggpattern_black_nac_0B(Assignment c) {
		for (Decision __DEC_c_positive_406468 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_27_1_matchtggpattern_black_nac_1B(Assignment c) {
		for (Decision __DEC_c_negative_109294 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_27_1_matchtggpattern_black_nac_2BB(Assignment c, While w) {
		for (While __DEC_c_first_827428 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				While.class, "first")) {
			if (!w.equals(__DEC_c_first_827428)) {
				return new Object[] { c, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_27_1_matchtggpattern_black_nac_3BB(Assignment c, While w) {
		for (While __DEC_c_last_557953 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				While.class, "last")) {
			if (!w.equals(__DEC_c_last_557953)) {
				return new Object[] { c, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_27_1_matchtggpattern_black_nac_4B(Assignment c) {
		for (Program __DEC_c_first_12351 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_27_1_matchtggpattern_black_nac_5B(Assignment a) {
		for (Decision __DEC_a_positive_740165 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_27_1_matchtggpattern_black_nac_6B(Assignment a) {
		for (Decision __DEC_a_negative_22943 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_27_1_matchtggpattern_black_nac_7BB(Assignment a, While w) {
		for (While __DEC_a_last_629396 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!w.equals(__DEC_a_last_629396)) {
				return new Object[] { a, w };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_27_1_matchtggpattern_black_nac_8B(Assignment a) {
		for (Program __DEC_a_first_590245 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_27_1_matchtggpattern_black_nac_9BB(While w, Assignment c) {
		if (c.equals(w.getFirst())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_27_1_matchtggpattern_black_nac_10BB(While w, Assignment c) {
		if (c.equals(w.getLast())) {
			return new Object[] { w, c };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_27_1_matchtggpattern_black_nac_11BB(While w, Assignment a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_27_1_matchtggpattern_blackBBB(Assignment c, Assignment a,
			While w) {
		if (!a.equals(c)) {
			if (c.equals(w.getNext())) {
				if (a.equals(w.getFirst())) {
					if (pattern_whileaa2branchcc_27_1_matchtggpattern_black_nac_0B(c) == null) {
						if (pattern_whileaa2branchcc_27_1_matchtggpattern_black_nac_1B(c) == null) {
							if (pattern_whileaa2branchcc_27_1_matchtggpattern_black_nac_2BB(c, w) == null) {
								if (pattern_whileaa2branchcc_27_1_matchtggpattern_black_nac_3BB(c, w) == null) {
									if (pattern_whileaa2branchcc_27_1_matchtggpattern_black_nac_4B(c) == null) {
										if (pattern_whileaa2branchcc_27_1_matchtggpattern_black_nac_5B(a) == null) {
											if (pattern_whileaa2branchcc_27_1_matchtggpattern_black_nac_6B(a) == null) {
												if (pattern_whileaa2branchcc_27_1_matchtggpattern_black_nac_7BB(a,
														w) == null) {
													if (pattern_whileaa2branchcc_27_1_matchtggpattern_black_nac_8B(
															a) == null) {
														if (pattern_whileaa2branchcc_27_1_matchtggpattern_black_nac_9BB(
																w, c) == null) {
															if (pattern_whileaa2branchcc_27_1_matchtggpattern_black_nac_10BB(
																	w, c) == null) {
																if (pattern_whileaa2branchcc_27_1_matchtggpattern_black_nac_11BB(
																		w, a) == null) {
																	return new Object[] { c, a, w };
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_whileaa2branchcc_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileaa2branchcc_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileaa2branchcc_28_1_matchtggpattern_black_nac_0B(Command x) {
		for (Graph __DEC_x_root_225600 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_28_1_matchtggpattern_black_nac_1BB(Command x, Branch i) {
		for (Branch __DEC_x_positive_673449 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Branch.class, "positive")) {
			if (!i.equals(__DEC_x_positive_673449)) {
				return new Object[] { x, i };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_28_1_matchtggpattern_black_nac_2BB(Command x, Branch i) {
		for (Branch __DEC_x_negative_777812 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Branch.class, "negative")) {
			if (!i.equals(__DEC_x_negative_777812)) {
				return new Object[] { x, i };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_28_1_matchtggpattern_black_nac_3B(Command z) {
		for (Graph __DEC_z_root_995734 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_28_1_matchtggpattern_black_nac_4BB(Command z, Branch i) {
		for (Branch __DEC_z_positive_863336 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Branch.class, "positive")) {
			if (!i.equals(__DEC_z_positive_863336)) {
				return new Object[] { z, i };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_28_1_matchtggpattern_black_nac_5BB(Command z, Branch i) {
		for (Branch __DEC_z_negative_275411 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Branch.class, "negative")) {
			if (!i.equals(__DEC_z_negative_275411)) {
				return new Object[] { z, i };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_28_1_matchtggpattern_black_nac_6BB(Branch i, Command x) {
		if (x.equals(i.getNegative())) {
			return new Object[] { i, x };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_28_1_matchtggpattern_black_nac_7BB(Branch i, Command z) {
		if (z.equals(i.getPositive())) {
			return new Object[] { i, z };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_28_1_matchtggpattern_blackBBB(Command x, Branch i,
			Command z) {
		if (!x.equals(z)) {
			if (x.equals(i.getPositive())) {
				if (z.equals(i.getNegative())) {
					if (pattern_whileaa2branchcc_28_1_matchtggpattern_black_nac_0B(x) == null) {
						if (pattern_whileaa2branchcc_28_1_matchtggpattern_black_nac_1BB(x, i) == null) {
							if (pattern_whileaa2branchcc_28_1_matchtggpattern_black_nac_2BB(x, i) == null) {
								if (pattern_whileaa2branchcc_28_1_matchtggpattern_black_nac_3B(z) == null) {
									if (pattern_whileaa2branchcc_28_1_matchtggpattern_black_nac_4BB(z, i) == null) {
										if (pattern_whileaa2branchcc_28_1_matchtggpattern_black_nac_5BB(z, i) == null) {
											if (pattern_whileaa2branchcc_28_1_matchtggpattern_black_nac_6BB(i,
													x) == null) {
												if (pattern_whileaa2branchcc_28_1_matchtggpattern_black_nac_7BB(i,
														z) == null) {
													return new Object[] { x, i, z };
												}
											}
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

	public static final boolean pattern_whileaa2branchcc_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_whileaa2branchcc_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_whileaa2branchcc_29_1_createresult_blackB(whileaa2branchcc _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_whileaa2branchcc_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_whileaa2branchcc_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileaa2branchcc_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_whileaa2branchcc_29_2_isapplicablecore_black_nac_1BB(ruleResult, w2i) == null) {
								if (pattern_whileaa2branchcc_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										i) == null) {
									if (pattern_whileaa2branchcc_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_whileaa2branchcc_29_3_solveCSP_bindingFBBBBBB(whileaa2branchcc _this,
			IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, While w, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, i, w2i, w, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, i, w2i, w, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whileaa2branchcc_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileaa2branchcc_29_3_solveCSP_bindingAndBlackFBBBBBB(whileaa2branchcc _this,
			IsApplicableMatch isApplicableMatch, Branch i, S2B w2i, While w, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whileaa2branchcc_29_3_solveCSP_binding = pattern_whileaa2branchcc_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, i, w2i, w, ruleResult);
		if (result_pattern_whileaa2branchcc_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileaa2branchcc_29_3_solveCSP_binding[0];

			Object[] result_pattern_whileaa2branchcc_29_3_solveCSP_black = pattern_whileaa2branchcc_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whileaa2branchcc_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, i, w2i, w, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_whileaa2branchcc_29_4_checkCSP_expressionFBB(whileaa2branchcc _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_whileaa2branchcc_29_5_checknacs_blackBBB(Branch i, S2B w2i, While w) {
		return new Object[] { i, w2i, w };
	}

	public static final Object[] pattern_whileaa2branchcc_29_6_perform_blackBBBB(Branch i, S2B w2i, While w,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { i, w2i, w, ruleResult };
	}

	public static final Object[] pattern_whileaa2branchcc_29_6_perform_greenFFBFFFBFB(Branch i, While w,
			ModelgeneratorRuleResult ruleResult) {
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command x = ControlflowFactory.eINSTANCE.createCommand();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		Assignment c = SourcecodeFactory.eINSTANCE.createAssignment();
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(a2x);
		i.setPositive(x);
		a2x.setTarget(x);
		ruleResult.getTargetObjects().add(x);
		i.setNegative(z);
		ruleResult.getTargetObjects().add(z);
		w.setNext(c);
		ruleResult.getSourceObjects().add(c);
		a2x.setSource(a);
		w.setFirst(a);
		ruleResult.getSourceObjects().add(a);
		c2z.setSource(c);
		c2z.setTarget(z);
		ruleResult.getCorrObjects().add(c2z);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { a2x, x, i, z, c, a, w, c2z, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whileaa2branchcc_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whileaa2branchccImpl
