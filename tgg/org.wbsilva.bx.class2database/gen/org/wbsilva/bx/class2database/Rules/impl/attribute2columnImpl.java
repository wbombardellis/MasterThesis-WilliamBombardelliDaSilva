/**
 */
package org.wbsilva.bx.class2database.Rules.impl;

import class_.Attribute;
import class_.ClassFactory;
import class_.Clazz;

import database.Column;
import database.DatabaseFactory;
import database.Table;

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

import org.wbsilva.bx.class2database.A2C;
import org.wbsilva.bx.class2database.C2T;
import org.wbsilva.bx.class2database.Class2databaseFactory;

import org.wbsilva.bx.class2database.Rules.RulesPackage;
import org.wbsilva.bx.class2database.Rules.attribute2column;
// <-- [user defined imports]
import org.moflon.tgg.csp.*;
import org.wbsilva.bx.class2database.csp.constraints.*;
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
 * An implementation of the model object '<em><b>attribute2column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class attribute2columnImpl extends AbstractRuleImpl implements attribute2column {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected attribute2columnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getattribute2column();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Attribute a, Clazz c) {

		Object[] result1_black = attribute2columnImpl.pattern_attribute2column_0_1_initialbindings_blackBBBB(this,
				match, a, c);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[c] = " + c + ".");
		}

		Object[] result2_bindingAndBlack = attribute2columnImpl
				.pattern_attribute2column_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, a, c);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[c] = " + c + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (attribute2columnImpl.pattern_attribute2column_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = attribute2columnImpl
					.pattern_attribute2column_0_4_collectelementstobetranslated_blackBBB(match, a, c);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[c] = " + c + ".");
			}
			attribute2columnImpl.pattern_attribute2column_0_4_collectelementstobetranslated_greenBBBF(match, a, c);
			//nothing EMoflonEdge c__a____attribute = (EMoflonEdge) result4_green[3];

			Object[] result5_black = attribute2columnImpl
					.pattern_attribute2column_0_5_collectcontextelements_blackBBB(match, a, c);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[c] = " + c + ".");
			}
			attribute2columnImpl.pattern_attribute2column_0_5_collectcontextelements_greenBB(match, c);

			// 
			attribute2columnImpl.pattern_attribute2column_0_6_registerobjectstomatch_expressionBBBB(this, match, a, c);
			return attribute2columnImpl.pattern_attribute2column_0_7_expressionF();
		} else {
			return attribute2columnImpl.pattern_attribute2column_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = attribute2columnImpl
				.pattern_attribute2column_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Table t = (Table) result1_bindingAndBlack[0];
		C2T c2t = (C2T) result1_bindingAndBlack[1];
		Attribute a = (Attribute) result1_bindingAndBlack[2];
		Clazz c = (Clazz) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = attribute2columnImpl.pattern_attribute2column_1_1_performtransformation_greenFFBB(t,
				a);
		A2C a2co = (A2C) result1_green[0];
		Column co = (Column) result1_green[1];

		Object[] result2_black = attribute2columnImpl
				.pattern_attribute2column_1_2_collecttranslatedelements_blackBBB(a2co, co, a);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a2co] = " + a2co + ", "
					+ "[co] = " + co + ", " + "[a] = " + a + ".");
		}
		Object[] result2_green = attribute2columnImpl
				.pattern_attribute2column_1_2_collecttranslatedelements_greenFBBB(a2co, co, a);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = attribute2columnImpl
				.pattern_attribute2column_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, a2co, co, t, c2t, a, c);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a2co] = " + a2co + ", " + "[co] = " + co + ", " + "[t] = " + t + ", " + "[c2t] = " + c2t
					+ ", " + "[a] = " + a + ", " + "[c] = " + c + ".");
		}
		attribute2columnImpl.pattern_attribute2column_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, a2co, co, t,
				a, c);
		//nothing EMoflonEdge a2co__co____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge a2co__a____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge t__co____column = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge c__a____attribute = (EMoflonEdge) result3_green[9];

		// 
		// 
		attribute2columnImpl.pattern_attribute2column_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, a2co, co,
				t, c2t, a, c);
		return attribute2columnImpl.pattern_attribute2column_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = attribute2columnImpl
				.pattern_attribute2column_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = attribute2columnImpl
				.pattern_attribute2column_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = attribute2columnImpl.pattern_attribute2column_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Attribute a = (Attribute) result2_binding[0];
		Clazz c = (Clazz) result2_binding[1];
		for (Object[] result2_black : attribute2columnImpl.pattern_attribute2column_2_2_corematch_blackFFBBB(a, c,
				match)) {
			Table t = (Table) result2_black[0];
			C2T c2t = (C2T) result2_black[1];
			// ForEach 
			for (Object[] result3_black : attribute2columnImpl.pattern_attribute2column_2_3_findcontext_blackBBBB(t,
					c2t, a, c)) {
				Object[] result3_green = attribute2columnImpl.pattern_attribute2column_2_3_findcontext_greenBBBBFFFF(t,
						c2t, a, c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge c2t__t____target = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge c2t__c____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge c__a____attribute = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = attribute2columnImpl
						.pattern_attribute2column_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, t, c2t,
								a, c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[t] = " + t + ", " + "[c2t] = "
							+ c2t + ", " + "[a] = " + a + ", " + "[c] = " + c + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (attribute2columnImpl.pattern_attribute2column_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = attribute2columnImpl
							.pattern_attribute2column_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					attribute2columnImpl.pattern_attribute2column_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return attribute2columnImpl.pattern_attribute2column_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Attribute a, Clazz c) {
		match.registerObject("a", a);
		match.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Attribute a, Clazz c) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Table t, C2T c2t, Attribute a, Clazz c) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("t", t);
		isApplicableMatch.registerObject("c2t", c2t);
		isApplicableMatch.registerObject("a", a);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject a2co, EObject co, EObject t, EObject c2t,
			EObject a, EObject c) {
		ruleresult.registerObject("a2co", a2co);
		ruleresult.registerObject("co", co);
		ruleresult.registerObject("t", t);
		ruleresult.registerObject("c2t", c2t);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass()).equals("class.Attribute.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Column co, Table t) {

		Object[] result1_black = attribute2columnImpl.pattern_attribute2column_10_1_initialbindings_blackBBBB(this,
				match, co, t);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[co] = " + co + ", " + "[t] = " + t + ".");
		}

		Object[] result2_bindingAndBlack = attribute2columnImpl
				.pattern_attribute2column_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, co, t);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[co] = " + co + ", " + "[t] = " + t + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (attribute2columnImpl.pattern_attribute2column_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = attribute2columnImpl
					.pattern_attribute2column_10_4_collectelementstobetranslated_blackBBB(match, co, t);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[co] = " + co + ", " + "[t] = " + t + ".");
			}
			attribute2columnImpl.pattern_attribute2column_10_4_collectelementstobetranslated_greenBBBF(match, co, t);
			//nothing EMoflonEdge t__co____column = (EMoflonEdge) result4_green[3];

			Object[] result5_black = attribute2columnImpl
					.pattern_attribute2column_10_5_collectcontextelements_blackBBB(match, co, t);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[co] = " + co + ", " + "[t] = " + t + ".");
			}
			attribute2columnImpl.pattern_attribute2column_10_5_collectcontextelements_greenBB(match, t);

			// 
			attribute2columnImpl.pattern_attribute2column_10_6_registerobjectstomatch_expressionBBBB(this, match, co,
					t);
			return attribute2columnImpl.pattern_attribute2column_10_7_expressionF();
		} else {
			return attribute2columnImpl.pattern_attribute2column_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = attribute2columnImpl
				.pattern_attribute2column_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Column co = (Column) result1_bindingAndBlack[0];
		Table t = (Table) result1_bindingAndBlack[1];
		C2T c2t = (C2T) result1_bindingAndBlack[2];
		Clazz c = (Clazz) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = attribute2columnImpl.pattern_attribute2column_11_1_performtransformation_greenFBFB(co,
				c);
		A2C a2co = (A2C) result1_green[0];
		Attribute a = (Attribute) result1_green[2];

		Object[] result2_black = attribute2columnImpl
				.pattern_attribute2column_11_2_collecttranslatedelements_blackBBB(a2co, co, a);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a2co] = " + a2co + ", "
					+ "[co] = " + co + ", " + "[a] = " + a + ".");
		}
		Object[] result2_green = attribute2columnImpl
				.pattern_attribute2column_11_2_collecttranslatedelements_greenFBBB(a2co, co, a);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = attribute2columnImpl
				.pattern_attribute2column_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, a2co, co, t, c2t, a, c);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a2co] = " + a2co + ", " + "[co] = " + co + ", " + "[t] = " + t + ", " + "[c2t] = " + c2t
					+ ", " + "[a] = " + a + ", " + "[c] = " + c + ".");
		}
		attribute2columnImpl.pattern_attribute2column_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, a2co, co, t,
				a, c);
		//nothing EMoflonEdge a2co__co____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge a2co__a____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge t__co____column = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge c__a____attribute = (EMoflonEdge) result3_green[9];

		// 
		// 
		attribute2columnImpl.pattern_attribute2column_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, a2co,
				co, t, c2t, a, c);
		return attribute2columnImpl.pattern_attribute2column_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = attribute2columnImpl
				.pattern_attribute2column_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = attribute2columnImpl
				.pattern_attribute2column_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = attribute2columnImpl.pattern_attribute2column_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Column co = (Column) result2_binding[0];
		Table t = (Table) result2_binding[1];
		for (Object[] result2_black : attribute2columnImpl.pattern_attribute2column_12_2_corematch_blackBBFFB(co, t,
				match)) {
			C2T c2t = (C2T) result2_black[2];
			Clazz c = (Clazz) result2_black[3];
			// ForEach 
			for (Object[] result3_black : attribute2columnImpl.pattern_attribute2column_12_3_findcontext_blackBBBB(co,
					t, c2t, c)) {
				Object[] result3_green = attribute2columnImpl
						.pattern_attribute2column_12_3_findcontext_greenBBBBFFFF(co, t, c2t, c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge t__co____column = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge c2t__t____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge c2t__c____source = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = attribute2columnImpl
						.pattern_attribute2column_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, co, t,
								c2t, c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[co] = " + co + ", " + "[t] = " + t
							+ ", " + "[c2t] = " + c2t + ", " + "[c] = " + c + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (attribute2columnImpl.pattern_attribute2column_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = attribute2columnImpl
							.pattern_attribute2column_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					attribute2columnImpl.pattern_attribute2column_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return attribute2columnImpl.pattern_attribute2column_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Column co, Table t) {
		match.registerObject("co", co);
		match.registerObject("t", t);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Column co, Table t) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Column co, Table t, C2T c2t, Clazz c) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("co", co);
		isApplicableMatch.registerObject("t", t);
		isApplicableMatch.registerObject("c2t", c2t);
		isApplicableMatch.registerObject("c", c);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject a2co, EObject co, EObject t, EObject c2t,
			EObject a, EObject c) {
		ruleresult.registerObject("a2co", a2co);
		ruleresult.registerObject("co", co);
		ruleresult.registerObject("t", t);
		ruleresult.registerObject("c2t", c2t);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("co").eClass()).equals("database.Column.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_0(EMoflonEdge _edge_column) {

		Object[] result1_bindingAndBlack = attribute2columnImpl
				.pattern_attribute2column_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = attribute2columnImpl.pattern_attribute2column_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : attribute2columnImpl
				.pattern_attribute2column_20_2_testcorematchandDECs_blackFFB(_edge_column)) {
			Column co = (Column) result2_black[0];
			Table t = (Table) result2_black[1];
			Object[] result2_green = attribute2columnImpl
					.pattern_attribute2column_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (attribute2columnImpl
					.pattern_attribute2column_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, co, t)) {
				// 
				if (attribute2columnImpl
						.pattern_attribute2column_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = attribute2columnImpl
							.pattern_attribute2column_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					attribute2columnImpl.pattern_attribute2column_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return attribute2columnImpl.pattern_attribute2column_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_0(EMoflonEdge _edge_attribute) {

		Object[] result1_bindingAndBlack = attribute2columnImpl
				.pattern_attribute2column_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = attribute2columnImpl.pattern_attribute2column_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : attribute2columnImpl
				.pattern_attribute2column_21_2_testcorematchandDECs_blackFFB(_edge_attribute)) {
			Attribute a = (Attribute) result2_black[0];
			Clazz c = (Clazz) result2_black[1];
			Object[] result2_green = attribute2columnImpl
					.pattern_attribute2column_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (attribute2columnImpl
					.pattern_attribute2column_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, a, c)) {
				// 
				if (attribute2columnImpl
						.pattern_attribute2column_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = attribute2columnImpl
							.pattern_attribute2column_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					attribute2columnImpl.pattern_attribute2column_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return attribute2columnImpl.pattern_attribute2column_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("attribute2column");
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
		ruleResult.setRule("attribute2column");
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

		Object[] result1_black = attribute2columnImpl.pattern_attribute2column_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = attribute2columnImpl.pattern_attribute2column_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = attribute2columnImpl
				.pattern_attribute2column_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Column co = (Column) result2_bindingAndBlack[0];
		Table t = (Table) result2_bindingAndBlack[1];
		Attribute a = (Attribute) result2_bindingAndBlack[2];
		Clazz c = (Clazz) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = attribute2columnImpl
				.pattern_attribute2column_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, co, t, a, c, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[co] = " + co + ", " + "[t] = " + t + ", " + "[a] = " + a + ", " + "[c] = " + c + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (attribute2columnImpl.pattern_attribute2column_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : attribute2columnImpl
					.pattern_attribute2column_24_5_matchcorrcontext_blackBFBBB(t, c, sourceMatch, targetMatch)) {
				C2T c2t = (C2T) result5_black[1];
				Object[] result5_green = attribute2columnImpl
						.pattern_attribute2column_24_5_matchcorrcontext_greenBBBF(c2t, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = attribute2columnImpl
						.pattern_attribute2column_24_6_createcorrespondence_blackBBBBB(co, t, a, c, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[co] = " + co + ", " + "[t] = " + t + ", "
									+ "[a] = " + a + ", " + "[c] = " + c + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				attribute2columnImpl.pattern_attribute2column_24_6_createcorrespondence_greenFBBB(co, a, ccMatch);
				//nothing A2C a2co = (A2C) result6_green[0];

				Object[] result7_black = attribute2columnImpl
						.pattern_attribute2column_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				attribute2columnImpl.pattern_attribute2column_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return attribute2columnImpl.pattern_attribute2column_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Column co, Table t, Attribute a, Clazz c, Match sourceMatch,
			Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Attribute a, Clazz c) {// 
		Object[] result1_black = attribute2columnImpl.pattern_attribute2column_27_1_matchtggpattern_blackBB(a, c);
		if (result1_black != null) {
			return attribute2columnImpl.pattern_attribute2column_27_2_expressionF();
		} else {
			return attribute2columnImpl.pattern_attribute2column_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Column co, Table t) {// 
		Object[] result1_black = attribute2columnImpl.pattern_attribute2column_28_1_matchtggpattern_blackBB(co, t);
		if (result1_black != null) {
			return attribute2columnImpl.pattern_attribute2column_28_2_expressionF();
		} else {
			return attribute2columnImpl.pattern_attribute2column_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, C2T c2tParameter) {

		Object[] result1_black = attribute2columnImpl.pattern_attribute2column_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = attribute2columnImpl.pattern_attribute2column_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : attribute2columnImpl
				.pattern_attribute2column_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList c2tList = (RuleEntryList) result2_black[0];
			Table t = (Table) result2_black[1];
			C2T c2t = (C2T) result2_black[2];
			Clazz c = (Clazz) result2_black[3];

			Object[] result3_bindingAndBlack = attribute2columnImpl
					.pattern_attribute2column_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, t, c2t, c,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[t] = " + t + ", " + "[c2t] = " + c2t
						+ ", " + "[c] = " + c + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (attribute2columnImpl.pattern_attribute2column_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = attribute2columnImpl.pattern_attribute2column_29_5_checknacs_blackBBB(t, c2t,
						c);
				if (result5_black != null) {

					Object[] result6_black = attribute2columnImpl.pattern_attribute2column_29_6_perform_blackBBBB(t,
							c2t, c, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[t] = " + t + ", "
								+ "[c2t] = " + c2t + ", " + "[c] = " + c + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					attribute2columnImpl.pattern_attribute2column_29_6_perform_greenFFBFBB(t, c, ruleResult);
					//nothing A2C a2co = (A2C) result6_green[0];
					//nothing Column co = (Column) result6_green[1];
					//nothing Attribute a = (Attribute) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return attribute2columnImpl.pattern_attribute2column_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Table t, C2T c2t, Clazz c,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("t", t);
		isApplicableMatch.registerObject("c2t", c2t);
		isApplicableMatch.registerObject("c", c);
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
		case RulesPackage.ATTRIBUTE2COLUMN___IS_APPROPRIATE_FWD__MATCH_ATTRIBUTE_CLAZZ:
			return isAppropriate_FWD((Match) arguments.get(0), (Attribute) arguments.get(1), (Clazz) arguments.get(2));
		case RulesPackage.ATTRIBUTE2COLUMN___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ATTRIBUTE2COLUMN___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ATTRIBUTE2COLUMN___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ATTRIBUTE_CLAZZ:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Attribute) arguments.get(1),
					(Clazz) arguments.get(2));
			return null;
		case RulesPackage.ATTRIBUTE2COLUMN___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ATTRIBUTE_CLAZZ:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Attribute) arguments.get(1),
					(Clazz) arguments.get(2));
		case RulesPackage.ATTRIBUTE2COLUMN___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ATTRIBUTE2COLUMN___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TABLE_C2T_ATTRIBUTE_CLAZZ:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Table) arguments.get(1),
					(C2T) arguments.get(2), (Attribute) arguments.get(3), (Clazz) arguments.get(4));
		case RulesPackage.ATTRIBUTE2COLUMN___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ATTRIBUTE2COLUMN___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.ATTRIBUTE2COLUMN___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ATTRIBUTE2COLUMN___IS_APPROPRIATE_BWD__MATCH_COLUMN_TABLE:
			return isAppropriate_BWD((Match) arguments.get(0), (Column) arguments.get(1), (Table) arguments.get(2));
		case RulesPackage.ATTRIBUTE2COLUMN___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ATTRIBUTE2COLUMN___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ATTRIBUTE2COLUMN___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COLUMN_TABLE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Column) arguments.get(1), (Table) arguments.get(2));
			return null;
		case RulesPackage.ATTRIBUTE2COLUMN___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COLUMN_TABLE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Column) arguments.get(1),
					(Table) arguments.get(2));
		case RulesPackage.ATTRIBUTE2COLUMN___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ATTRIBUTE2COLUMN___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COLUMN_TABLE_C2T_CLAZZ:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Column) arguments.get(1),
					(Table) arguments.get(2), (C2T) arguments.get(3), (Clazz) arguments.get(4));
		case RulesPackage.ATTRIBUTE2COLUMN___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ATTRIBUTE2COLUMN___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.ATTRIBUTE2COLUMN___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ATTRIBUTE2COLUMN___IS_APPROPRIATE_BWD_EMOFLON_EDGE_0__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_0((EMoflonEdge) arguments.get(0));
		case RulesPackage.ATTRIBUTE2COLUMN___IS_APPROPRIATE_FWD_EMOFLON_EDGE_0__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_0((EMoflonEdge) arguments.get(0));
		case RulesPackage.ATTRIBUTE2COLUMN___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ATTRIBUTE2COLUMN___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ATTRIBUTE2COLUMN___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ATTRIBUTE2COLUMN___IS_APPLICABLE_SOLVE_CSP_CC__COLUMN_TABLE_ATTRIBUTE_CLAZZ_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Column) arguments.get(0), (Table) arguments.get(1),
					(Attribute) arguments.get(2), (Clazz) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.ATTRIBUTE2COLUMN___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ATTRIBUTE2COLUMN___CHECK_DEC_FWD__ATTRIBUTE_CLAZZ:
			return checkDEC_FWD((Attribute) arguments.get(0), (Clazz) arguments.get(1));
		case RulesPackage.ATTRIBUTE2COLUMN___CHECK_DEC_BWD__COLUMN_TABLE:
			return checkDEC_BWD((Column) arguments.get(0), (Table) arguments.get(1));
		case RulesPackage.ATTRIBUTE2COLUMN___GENERATE_MODEL__RULEENTRYCONTAINER_C2T:
			return generateModel((RuleEntryContainer) arguments.get(0), (C2T) arguments.get(1));
		case RulesPackage.ATTRIBUTE2COLUMN___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TABLE_C2T_CLAZZ_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Table) arguments.get(1),
					(C2T) arguments.get(2), (Clazz) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.ATTRIBUTE2COLUMN___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_attribute2column_0_1_initialbindings_blackBBBB(attribute2column _this,
			Match match, Attribute a, Clazz c) {
		return new Object[] { _this, match, a, c };
	}

	public static final Object[] pattern_attribute2column_0_2_SolveCSP_bindingFBBBB(attribute2column _this, Match match,
			Attribute a, Clazz c) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, a, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, a, c };
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_attribute2column_0_2_SolveCSP_bindingAndBlackFBBBB(attribute2column _this,
			Match match, Attribute a, Clazz c) {
		Object[] result_pattern_attribute2column_0_2_SolveCSP_binding = pattern_attribute2column_0_2_SolveCSP_bindingFBBBB(
				_this, match, a, c);
		if (result_pattern_attribute2column_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_attribute2column_0_2_SolveCSP_binding[0];

			Object[] result_pattern_attribute2column_0_2_SolveCSP_black = pattern_attribute2column_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_attribute2column_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, a, c };
			}
		}
		return null;
	}

	public static final boolean pattern_attribute2column_0_3_CheckCSP_expressionFBB(attribute2column _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_attribute2column_0_4_collectelementstobetranslated_blackBBB(Match match,
			Attribute a, Clazz c) {
		return new Object[] { match, a, c };
	}

	public static final Object[] pattern_attribute2column_0_4_collectelementstobetranslated_greenBBBF(Match match,
			Attribute a, Clazz c) {
		EMoflonEdge c__a____attribute = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(a);
		String c__a____attribute_name_prime = "attribute";
		c__a____attribute.setSrc(c);
		c__a____attribute.setTrg(a);
		match.getToBeTranslatedEdges().add(c__a____attribute);
		c__a____attribute.setName(c__a____attribute_name_prime);
		return new Object[] { match, a, c, c__a____attribute };
	}

	public static final Object[] pattern_attribute2column_0_5_collectcontextelements_blackBBB(Match match, Attribute a,
			Clazz c) {
		return new Object[] { match, a, c };
	}

	public static final Object[] pattern_attribute2column_0_5_collectcontextelements_greenBB(Match match, Clazz c) {
		match.getContextNodes().add(c);
		return new Object[] { match, c };
	}

	public static final void pattern_attribute2column_0_6_registerobjectstomatch_expressionBBBB(attribute2column _this,
			Match match, Attribute a, Clazz c) {
		_this.registerObjectsToMatch_FWD(match, a, c);

	}

	public static final boolean pattern_attribute2column_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_attribute2column_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_attribute2column_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("t");
		EObject _localVariable_1 = isApplicableMatch.getObject("c2t");
		EObject _localVariable_2 = isApplicableMatch.getObject("a");
		EObject _localVariable_3 = isApplicableMatch.getObject("c");
		EObject tmpT = _localVariable_0;
		EObject tmpC2t = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpC = _localVariable_3;
		if (tmpT instanceof Table) {
			Table t = (Table) tmpT;
			if (tmpC2t instanceof C2T) {
				C2T c2t = (C2T) tmpC2t;
				if (tmpA instanceof Attribute) {
					Attribute a = (Attribute) tmpA;
					if (tmpC instanceof Clazz) {
						Clazz c = (Clazz) tmpC;
						return new Object[] { t, c2t, a, c, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_1_1_performtransformation_blackBBBBFBB(Table t, C2T c2t,
			Attribute a, Clazz c, attribute2column _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { t, c2t, a, c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_1_1_performtransformation_bindingAndBlackFFFFFBB(
			attribute2column _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_attribute2column_1_1_performtransformation_binding = pattern_attribute2column_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_attribute2column_1_1_performtransformation_binding != null) {
			Table t = (Table) result_pattern_attribute2column_1_1_performtransformation_binding[0];
			C2T c2t = (C2T) result_pattern_attribute2column_1_1_performtransformation_binding[1];
			Attribute a = (Attribute) result_pattern_attribute2column_1_1_performtransformation_binding[2];
			Clazz c = (Clazz) result_pattern_attribute2column_1_1_performtransformation_binding[3];

			Object[] result_pattern_attribute2column_1_1_performtransformation_black = pattern_attribute2column_1_1_performtransformation_blackBBBBFBB(
					t, c2t, a, c, _this, isApplicableMatch);
			if (result_pattern_attribute2column_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_attribute2column_1_1_performtransformation_black[4];

				return new Object[] { t, c2t, a, c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_1_1_performtransformation_greenFFBB(Table t, Attribute a) {
		A2C a2co = Class2databaseFactory.eINSTANCE.createA2C();
		Column co = DatabaseFactory.eINSTANCE.createColumn();
		a2co.setSource(a);
		a2co.setTarget(co);
		t.getColumn().add(co);
		return new Object[] { a2co, co, t, a };
	}

	public static final Object[] pattern_attribute2column_1_2_collecttranslatedelements_blackBBB(A2C a2co, Column co,
			Attribute a) {
		return new Object[] { a2co, co, a };
	}

	public static final Object[] pattern_attribute2column_1_2_collecttranslatedelements_greenFBBB(A2C a2co, Column co,
			Attribute a) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2co);
		ruleresult.getCreatedElements().add(co);
		ruleresult.getTranslatedElements().add(a);
		return new Object[] { ruleresult, a2co, co, a };
	}

	public static final Object[] pattern_attribute2column_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject a2co, EObject co, EObject t, EObject c2t, EObject a, EObject c) {
		if (!a2co.equals(co)) {
			if (!a2co.equals(t)) {
				if (!a2co.equals(c2t)) {
					if (!a2co.equals(c)) {
						if (!co.equals(t)) {
							if (!c2t.equals(co)) {
								if (!c2t.equals(t)) {
									if (!a.equals(a2co)) {
										if (!a.equals(co)) {
											if (!a.equals(t)) {
												if (!a.equals(c2t)) {
													if (!a.equals(c)) {
														if (!c.equals(co)) {
															if (!c.equals(t)) {
																if (!c.equals(c2t)) {
																	return new Object[] { ruleresult, a2co, co, t, c2t,
																			a, c };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_attribute2column_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject a2co, EObject co, EObject t, EObject a, EObject c) {
		EMoflonEdge a2co__co____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2co__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t__co____column = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__a____attribute = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "attribute2column";
		String a2co__co____target_name_prime = "target";
		String a2co__a____source_name_prime = "source";
		String t__co____column_name_prime = "column";
		String c__a____attribute_name_prime = "attribute";
		a2co__co____target.setSrc(a2co);
		a2co__co____target.setTrg(co);
		ruleresult.getCreatedEdges().add(a2co__co____target);
		a2co__a____source.setSrc(a2co);
		a2co__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2co__a____source);
		t__co____column.setSrc(t);
		t__co____column.setTrg(co);
		ruleresult.getCreatedEdges().add(t__co____column);
		c__a____attribute.setSrc(c);
		c__a____attribute.setTrg(a);
		ruleresult.getTranslatedEdges().add(c__a____attribute);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a2co__co____target.setName(a2co__co____target_name_prime);
		a2co__a____source.setName(a2co__a____source_name_prime);
		t__co____column.setName(t__co____column_name_prime);
		c__a____attribute.setName(c__a____attribute_name_prime);
		return new Object[] { ruleresult, a2co, co, t, a, c, a2co__co____target, a2co__a____source, t__co____column,
				c__a____attribute };
	}

	public static final void pattern_attribute2column_1_5_registerobjects_expressionBBBBBBBB(attribute2column _this,
			PerformRuleResult ruleresult, EObject a2co, EObject co, EObject t, EObject c2t, EObject a, EObject c) {
		_this.registerObjects_FWD(ruleresult, a2co, co, t, c2t, a, c);

	}

	public static final PerformRuleResult pattern_attribute2column_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_attribute2column_2_1_preparereturnvalue_bindingFB(attribute2column _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_2_1_preparereturnvalue_blackFBB(EClass eClass,
			attribute2column _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_attribute2column_2_1_preparereturnvalue_bindingAndBlackFFB(
			attribute2column _this) {
		Object[] result_pattern_attribute2column_2_1_preparereturnvalue_binding = pattern_attribute2column_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_attribute2column_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_attribute2column_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_attribute2column_2_1_preparereturnvalue_black = pattern_attribute2column_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_attribute2column_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_attribute2column_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "attribute2column";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_attribute2column_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("a");
		EObject _localVariable_1 = match.getObject("c");
		EObject tmpA = _localVariable_0;
		EObject tmpC = _localVariable_1;
		if (tmpA instanceof Attribute) {
			Attribute a = (Attribute) tmpA;
			if (tmpC instanceof Clazz) {
				Clazz c = (Clazz) tmpC;
				return new Object[] { a, c, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_attribute2column_2_2_corematch_blackFFBBB(Attribute a, Clazz c,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (C2T c2t : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, C2T.class, "source")) {
			Table t = c2t.getTarget();
			if (t != null) {
				_result.add(new Object[] { t, c2t, a, c, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_attribute2column_2_3_findcontext_blackBBBB(Table t, C2T c2t,
			Attribute a, Clazz c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (t.equals(c2t.getTarget())) {
			if (c.equals(c2t.getSource())) {
				if (c.getAttribute().contains(a)) {
					_result.add(new Object[] { t, c2t, a, c });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_attribute2column_2_3_findcontext_greenBBBBFFFF(Table t, C2T c2t, Attribute a,
			Clazz c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c2t__t____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2t__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__a____attribute = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c2t__t____target_name_prime = "target";
		String c2t__c____source_name_prime = "source";
		String c__a____attribute_name_prime = "attribute";
		isApplicableMatch.getAllContextElements().add(t);
		isApplicableMatch.getAllContextElements().add(c2t);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(c);
		c2t__t____target.setSrc(c2t);
		c2t__t____target.setTrg(t);
		isApplicableMatch.getAllContextElements().add(c2t__t____target);
		c2t__c____source.setSrc(c2t);
		c2t__c____source.setTrg(c);
		isApplicableMatch.getAllContextElements().add(c2t__c____source);
		c__a____attribute.setSrc(c);
		c__a____attribute.setTrg(a);
		isApplicableMatch.getAllContextElements().add(c__a____attribute);
		c2t__t____target.setName(c2t__t____target_name_prime);
		c2t__c____source.setName(c2t__c____source_name_prime);
		c__a____attribute.setName(c__a____attribute_name_prime);
		return new Object[] { t, c2t, a, c, isApplicableMatch, c2t__t____target, c2t__c____source, c__a____attribute };
	}

	public static final Object[] pattern_attribute2column_2_4_solveCSP_bindingFBBBBBB(attribute2column _this,
			IsApplicableMatch isApplicableMatch, Table t, C2T c2t, Attribute a, Clazz c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, t, c2t, a, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, t, c2t, a, c };
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_attribute2column_2_4_solveCSP_bindingAndBlackFBBBBBB(attribute2column _this,
			IsApplicableMatch isApplicableMatch, Table t, C2T c2t, Attribute a, Clazz c) {
		Object[] result_pattern_attribute2column_2_4_solveCSP_binding = pattern_attribute2column_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, t, c2t, a, c);
		if (result_pattern_attribute2column_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_attribute2column_2_4_solveCSP_binding[0];

			Object[] result_pattern_attribute2column_2_4_solveCSP_black = pattern_attribute2column_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_attribute2column_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, t, c2t, a, c };
			}
		}
		return null;
	}

	public static final boolean pattern_attribute2column_2_5_checkCSP_expressionFBB(attribute2column _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_attribute2column_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_attribute2column_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "attribute2column";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_attribute2column_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_attribute2column_10_1_initialbindings_blackBBBB(attribute2column _this,
			Match match, Column co, Table t) {
		return new Object[] { _this, match, co, t };
	}

	public static final Object[] pattern_attribute2column_10_2_SolveCSP_bindingFBBBB(attribute2column _this,
			Match match, Column co, Table t) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, co, t);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, co, t };
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_attribute2column_10_2_SolveCSP_bindingAndBlackFBBBB(attribute2column _this,
			Match match, Column co, Table t) {
		Object[] result_pattern_attribute2column_10_2_SolveCSP_binding = pattern_attribute2column_10_2_SolveCSP_bindingFBBBB(
				_this, match, co, t);
		if (result_pattern_attribute2column_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_attribute2column_10_2_SolveCSP_binding[0];

			Object[] result_pattern_attribute2column_10_2_SolveCSP_black = pattern_attribute2column_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_attribute2column_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, co, t };
			}
		}
		return null;
	}

	public static final boolean pattern_attribute2column_10_3_CheckCSP_expressionFBB(attribute2column _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_attribute2column_10_4_collectelementstobetranslated_blackBBB(Match match,
			Column co, Table t) {
		return new Object[] { match, co, t };
	}

	public static final Object[] pattern_attribute2column_10_4_collectelementstobetranslated_greenBBBF(Match match,
			Column co, Table t) {
		EMoflonEdge t__co____column = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(co);
		String t__co____column_name_prime = "column";
		t__co____column.setSrc(t);
		t__co____column.setTrg(co);
		match.getToBeTranslatedEdges().add(t__co____column);
		t__co____column.setName(t__co____column_name_prime);
		return new Object[] { match, co, t, t__co____column };
	}

	public static final Object[] pattern_attribute2column_10_5_collectcontextelements_blackBBB(Match match, Column co,
			Table t) {
		return new Object[] { match, co, t };
	}

	public static final Object[] pattern_attribute2column_10_5_collectcontextelements_greenBB(Match match, Table t) {
		match.getContextNodes().add(t);
		return new Object[] { match, t };
	}

	public static final void pattern_attribute2column_10_6_registerobjectstomatch_expressionBBBB(attribute2column _this,
			Match match, Column co, Table t) {
		_this.registerObjectsToMatch_BWD(match, co, t);

	}

	public static final boolean pattern_attribute2column_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_attribute2column_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_attribute2column_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("co");
		EObject _localVariable_1 = isApplicableMatch.getObject("t");
		EObject _localVariable_2 = isApplicableMatch.getObject("c2t");
		EObject _localVariable_3 = isApplicableMatch.getObject("c");
		EObject tmpCo = _localVariable_0;
		EObject tmpT = _localVariable_1;
		EObject tmpC2t = _localVariable_2;
		EObject tmpC = _localVariable_3;
		if (tmpCo instanceof Column) {
			Column co = (Column) tmpCo;
			if (tmpT instanceof Table) {
				Table t = (Table) tmpT;
				if (tmpC2t instanceof C2T) {
					C2T c2t = (C2T) tmpC2t;
					if (tmpC instanceof Clazz) {
						Clazz c = (Clazz) tmpC;
						return new Object[] { co, t, c2t, c, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_11_1_performtransformation_blackBBBBFBB(Column co, Table t,
			C2T c2t, Clazz c, attribute2column _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { co, t, c2t, c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_11_1_performtransformation_bindingAndBlackFFFFFBB(
			attribute2column _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_attribute2column_11_1_performtransformation_binding = pattern_attribute2column_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_attribute2column_11_1_performtransformation_binding != null) {
			Column co = (Column) result_pattern_attribute2column_11_1_performtransformation_binding[0];
			Table t = (Table) result_pattern_attribute2column_11_1_performtransformation_binding[1];
			C2T c2t = (C2T) result_pattern_attribute2column_11_1_performtransformation_binding[2];
			Clazz c = (Clazz) result_pattern_attribute2column_11_1_performtransformation_binding[3];

			Object[] result_pattern_attribute2column_11_1_performtransformation_black = pattern_attribute2column_11_1_performtransformation_blackBBBBFBB(
					co, t, c2t, c, _this, isApplicableMatch);
			if (result_pattern_attribute2column_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_attribute2column_11_1_performtransformation_black[4];

				return new Object[] { co, t, c2t, c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_11_1_performtransformation_greenFBFB(Column co, Clazz c) {
		A2C a2co = Class2databaseFactory.eINSTANCE.createA2C();
		Attribute a = ClassFactory.eINSTANCE.createAttribute();
		a2co.setTarget(co);
		a2co.setSource(a);
		c.getAttribute().add(a);
		return new Object[] { a2co, co, a, c };
	}

	public static final Object[] pattern_attribute2column_11_2_collecttranslatedelements_blackBBB(A2C a2co, Column co,
			Attribute a) {
		return new Object[] { a2co, co, a };
	}

	public static final Object[] pattern_attribute2column_11_2_collecttranslatedelements_greenFBBB(A2C a2co, Column co,
			Attribute a) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2co);
		ruleresult.getTranslatedElements().add(co);
		ruleresult.getCreatedElements().add(a);
		return new Object[] { ruleresult, a2co, co, a };
	}

	public static final Object[] pattern_attribute2column_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject a2co, EObject co, EObject t, EObject c2t, EObject a, EObject c) {
		if (!a2co.equals(co)) {
			if (!a2co.equals(t)) {
				if (!a2co.equals(c2t)) {
					if (!a2co.equals(c)) {
						if (!co.equals(t)) {
							if (!c2t.equals(co)) {
								if (!c2t.equals(t)) {
									if (!a.equals(a2co)) {
										if (!a.equals(co)) {
											if (!a.equals(t)) {
												if (!a.equals(c2t)) {
													if (!a.equals(c)) {
														if (!c.equals(co)) {
															if (!c.equals(t)) {
																if (!c.equals(c2t)) {
																	return new Object[] { ruleresult, a2co, co, t, c2t,
																			a, c };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_attribute2column_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject a2co, EObject co, EObject t, EObject a, EObject c) {
		EMoflonEdge a2co__co____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2co__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t__co____column = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__a____attribute = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "attribute2column";
		String a2co__co____target_name_prime = "target";
		String a2co__a____source_name_prime = "source";
		String t__co____column_name_prime = "column";
		String c__a____attribute_name_prime = "attribute";
		a2co__co____target.setSrc(a2co);
		a2co__co____target.setTrg(co);
		ruleresult.getCreatedEdges().add(a2co__co____target);
		a2co__a____source.setSrc(a2co);
		a2co__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2co__a____source);
		t__co____column.setSrc(t);
		t__co____column.setTrg(co);
		ruleresult.getTranslatedEdges().add(t__co____column);
		c__a____attribute.setSrc(c);
		c__a____attribute.setTrg(a);
		ruleresult.getCreatedEdges().add(c__a____attribute);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a2co__co____target.setName(a2co__co____target_name_prime);
		a2co__a____source.setName(a2co__a____source_name_prime);
		t__co____column.setName(t__co____column_name_prime);
		c__a____attribute.setName(c__a____attribute_name_prime);
		return new Object[] { ruleresult, a2co, co, t, a, c, a2co__co____target, a2co__a____source, t__co____column,
				c__a____attribute };
	}

	public static final void pattern_attribute2column_11_5_registerobjects_expressionBBBBBBBB(attribute2column _this,
			PerformRuleResult ruleresult, EObject a2co, EObject co, EObject t, EObject c2t, EObject a, EObject c) {
		_this.registerObjects_BWD(ruleresult, a2co, co, t, c2t, a, c);

	}

	public static final PerformRuleResult pattern_attribute2column_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_attribute2column_12_1_preparereturnvalue_bindingFB(attribute2column _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_12_1_preparereturnvalue_blackFBB(EClass eClass,
			attribute2column _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_attribute2column_12_1_preparereturnvalue_bindingAndBlackFFB(
			attribute2column _this) {
		Object[] result_pattern_attribute2column_12_1_preparereturnvalue_binding = pattern_attribute2column_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_attribute2column_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_attribute2column_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_attribute2column_12_1_preparereturnvalue_black = pattern_attribute2column_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_attribute2column_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_attribute2column_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "attribute2column";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_attribute2column_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("co");
		EObject _localVariable_1 = match.getObject("t");
		EObject tmpCo = _localVariable_0;
		EObject tmpT = _localVariable_1;
		if (tmpCo instanceof Column) {
			Column co = (Column) tmpCo;
			if (tmpT instanceof Table) {
				Table t = (Table) tmpT;
				return new Object[] { co, t, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_attribute2column_12_2_corematch_blackBBFFB(Column co, Table t,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (C2T c2t : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(t, C2T.class, "target")) {
			Clazz c = c2t.getSource();
			if (c != null) {
				_result.add(new Object[] { co, t, c2t, c, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_attribute2column_12_3_findcontext_blackBBBB(Column co, Table t,
			C2T c2t, Clazz c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (t.getColumn().contains(co)) {
			if (t.equals(c2t.getTarget())) {
				if (c.equals(c2t.getSource())) {
					_result.add(new Object[] { co, t, c2t, c });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_attribute2column_12_3_findcontext_greenBBBBFFFF(Column co, Table t, C2T c2t,
			Clazz c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge t__co____column = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2t__t____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2t__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String t__co____column_name_prime = "column";
		String c2t__t____target_name_prime = "target";
		String c2t__c____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(co);
		isApplicableMatch.getAllContextElements().add(t);
		isApplicableMatch.getAllContextElements().add(c2t);
		isApplicableMatch.getAllContextElements().add(c);
		t__co____column.setSrc(t);
		t__co____column.setTrg(co);
		isApplicableMatch.getAllContextElements().add(t__co____column);
		c2t__t____target.setSrc(c2t);
		c2t__t____target.setTrg(t);
		isApplicableMatch.getAllContextElements().add(c2t__t____target);
		c2t__c____source.setSrc(c2t);
		c2t__c____source.setTrg(c);
		isApplicableMatch.getAllContextElements().add(c2t__c____source);
		t__co____column.setName(t__co____column_name_prime);
		c2t__t____target.setName(c2t__t____target_name_prime);
		c2t__c____source.setName(c2t__c____source_name_prime);
		return new Object[] { co, t, c2t, c, isApplicableMatch, t__co____column, c2t__t____target, c2t__c____source };
	}

	public static final Object[] pattern_attribute2column_12_4_solveCSP_bindingFBBBBBB(attribute2column _this,
			IsApplicableMatch isApplicableMatch, Column co, Table t, C2T c2t, Clazz c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, co, t, c2t, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, co, t, c2t, c };
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_attribute2column_12_4_solveCSP_bindingAndBlackFBBBBBB(attribute2column _this,
			IsApplicableMatch isApplicableMatch, Column co, Table t, C2T c2t, Clazz c) {
		Object[] result_pattern_attribute2column_12_4_solveCSP_binding = pattern_attribute2column_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, co, t, c2t, c);
		if (result_pattern_attribute2column_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_attribute2column_12_4_solveCSP_binding[0];

			Object[] result_pattern_attribute2column_12_4_solveCSP_black = pattern_attribute2column_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_attribute2column_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, co, t, c2t, c };
			}
		}
		return null;
	}

	public static final boolean pattern_attribute2column_12_5_checkCSP_expressionFBB(attribute2column _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_attribute2column_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_attribute2column_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "attribute2column";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_attribute2column_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_attribute2column_20_1_preparereturnvalue_bindingFB(attribute2column _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			attribute2column _this) {
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

	public static final Object[] pattern_attribute2column_20_1_preparereturnvalue_bindingAndBlackFFBF(
			attribute2column _this) {
		Object[] result_pattern_attribute2column_20_1_preparereturnvalue_binding = pattern_attribute2column_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_attribute2column_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_attribute2column_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_attribute2column_20_1_preparereturnvalue_black = pattern_attribute2column_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_attribute2column_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_attribute2column_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_attribute2column_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_attribute2column_20_2_testcorematchandDECs_black_nac_0BB(Column co, Table t) {
		Table __DEC_co_reference_93119 = co.getReference();
		if (__DEC_co_reference_93119 != null) {
			if (!t.equals(__DEC_co_reference_93119)) {
				return new Object[] { co, t };
			}
		}

		return null;
	}

	public static final Object[] pattern_attribute2column_20_2_testcorematchandDECs_black_nac_1BB(Column co, Table t) {
		if (t.equals(co.getReference())) {
			return new Object[] { co, t };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_attribute2column_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_column) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpT = _edge_column.getSrc();
		if (tmpT instanceof Table) {
			Table t = (Table) tmpT;
			EObject tmpCo = _edge_column.getTrg();
			if (tmpCo instanceof Column) {
				Column co = (Column) tmpCo;
				if (t.getColumn().contains(co)) {
					if (pattern_attribute2column_20_2_testcorematchandDECs_black_nac_0BB(co, t) == null) {
						if (pattern_attribute2column_20_2_testcorematchandDECs_black_nac_1BB(co, t) == null) {
							_result.add(new Object[] { co, t, _edge_column });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_attribute2column_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_attribute2column_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			attribute2column _this, Match match, Column co, Table t) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, co, t);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_attribute2column_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			attribute2column _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_attribute2column_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_attribute2column_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_attribute2column_21_1_preparereturnvalue_bindingFB(attribute2column _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			attribute2column _this) {
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

	public static final Object[] pattern_attribute2column_21_1_preparereturnvalue_bindingAndBlackFFBF(
			attribute2column _this) {
		Object[] result_pattern_attribute2column_21_1_preparereturnvalue_binding = pattern_attribute2column_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_attribute2column_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_attribute2column_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_attribute2column_21_1_preparereturnvalue_black = pattern_attribute2column_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_attribute2column_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_attribute2column_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_attribute2column_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_attribute2column_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_attribute) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpC = _edge_attribute.getSrc();
		if (tmpC instanceof Clazz) {
			Clazz c = (Clazz) tmpC;
			EObject tmpA = _edge_attribute.getTrg();
			if (tmpA instanceof Attribute) {
				Attribute a = (Attribute) tmpA;
				if (c.getAttribute().contains(a)) {
					_result.add(new Object[] { a, c, _edge_attribute });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_attribute2column_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_attribute2column_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			attribute2column _this, Match match, Attribute a, Clazz c) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, a, c);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_attribute2column_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			attribute2column _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_attribute2column_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_attribute2column_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_attribute2column_24_1_prepare_blackB(attribute2column _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_attribute2column_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_attribute2column_24_2_matchsrctrgcontext_bindingFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("co");
		EObject _localVariable_1 = targetMatch.getObject("t");
		EObject _localVariable_2 = sourceMatch.getObject("a");
		EObject _localVariable_3 = sourceMatch.getObject("c");
		EObject tmpCo = _localVariable_0;
		EObject tmpT = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpC = _localVariable_3;
		if (tmpCo instanceof Column) {
			Column co = (Column) tmpCo;
			if (tmpT instanceof Table) {
				Table t = (Table) tmpT;
				if (tmpA instanceof Attribute) {
					Attribute a = (Attribute) tmpA;
					if (tmpC instanceof Clazz) {
						Clazz c = (Clazz) tmpC;
						return new Object[] { co, t, a, c, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_24_2_matchsrctrgcontext_blackBBBBBB(Column co, Table t,
			Attribute a, Clazz c, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { co, t, a, c, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_attribute2column_24_2_matchsrctrgcontext_binding = pattern_attribute2column_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_attribute2column_24_2_matchsrctrgcontext_binding != null) {
			Column co = (Column) result_pattern_attribute2column_24_2_matchsrctrgcontext_binding[0];
			Table t = (Table) result_pattern_attribute2column_24_2_matchsrctrgcontext_binding[1];
			Attribute a = (Attribute) result_pattern_attribute2column_24_2_matchsrctrgcontext_binding[2];
			Clazz c = (Clazz) result_pattern_attribute2column_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_attribute2column_24_2_matchsrctrgcontext_black = pattern_attribute2column_24_2_matchsrctrgcontext_blackBBBBBB(
					co, t, a, c, sourceMatch, targetMatch);
			if (result_pattern_attribute2column_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { co, t, a, c, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_24_3_solvecsp_bindingFBBBBBBB(attribute2column _this,
			Column co, Table t, Attribute a, Clazz c, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(co, t, a, c, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, co, t, a, c, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_attribute2column_24_3_solvecsp_bindingAndBlackFBBBBBBB(attribute2column _this,
			Column co, Table t, Attribute a, Clazz c, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_attribute2column_24_3_solvecsp_binding = pattern_attribute2column_24_3_solvecsp_bindingFBBBBBBB(
				_this, co, t, a, c, sourceMatch, targetMatch);
		if (result_pattern_attribute2column_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_attribute2column_24_3_solvecsp_binding[0];

			Object[] result_pattern_attribute2column_24_3_solvecsp_black = pattern_attribute2column_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_attribute2column_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, co, t, a, c, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_attribute2column_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_attribute2column_24_5_matchcorrcontext_blackBFBBB(Table t, Clazz c,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (C2T c2t : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(t, C2T.class, "target")) {
				if (c.equals(c2t.getSource())) {
					_result.add(new Object[] { t, c2t, c, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_attribute2column_24_5_matchcorrcontext_greenBBBF(C2T c2t, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "attribute2column";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(c2t);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { c2t, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_attribute2column_24_6_createcorrespondence_blackBBBBB(Column co, Table t,
			Attribute a, Clazz c, CCMatch ccMatch) {
		return new Object[] { co, t, a, c, ccMatch };
	}

	public static final Object[] pattern_attribute2column_24_6_createcorrespondence_greenFBBB(Column co, Attribute a,
			CCMatch ccMatch) {
		A2C a2co = Class2databaseFactory.eINSTANCE.createA2C();
		a2co.setTarget(co);
		a2co.setSource(a);
		ccMatch.getCreateCorr().add(a2co);
		return new Object[] { a2co, co, a, ccMatch };
	}

	public static final Object[] pattern_attribute2column_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_attribute2column_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "attribute2column";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_attribute2column_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_attribute2column_27_1_matchtggpattern_blackBB(Attribute a, Clazz c) {
		if (c.getAttribute().contains(a)) {
			return new Object[] { a, c };
		}
		return null;
	}

	public static final boolean pattern_attribute2column_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_attribute2column_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_attribute2column_28_1_matchtggpattern_black_nac_0BB(Column co, Table t) {
		Table __DEC_co_reference_930333 = co.getReference();
		if (__DEC_co_reference_930333 != null) {
			if (!t.equals(__DEC_co_reference_930333)) {
				return new Object[] { co, t };
			}
		}

		return null;
	}

	public static final Object[] pattern_attribute2column_28_1_matchtggpattern_black_nac_1BB(Column co, Table t) {
		if (t.equals(co.getReference())) {
			return new Object[] { co, t };
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_28_1_matchtggpattern_blackBB(Column co, Table t) {
		if (t.getColumn().contains(co)) {
			if (pattern_attribute2column_28_1_matchtggpattern_black_nac_0BB(co, t) == null) {
				if (pattern_attribute2column_28_1_matchtggpattern_black_nac_1BB(co, t) == null) {
					return new Object[] { co, t };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_attribute2column_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_attribute2column_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_attribute2column_29_1_createresult_blackB(attribute2column _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_attribute2column_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_attribute2column_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Table t) {
		if (ruleResult.getTargetObjects().contains(t)) {
			return new Object[] { ruleResult, t };
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, C2T c2t) {
		if (ruleResult.getCorrObjects().contains(c2t)) {
			return new Object[] { ruleResult, c2t };
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Clazz c) {
		if (ruleResult.getSourceObjects().contains(c)) {
			return new Object[] { ruleResult, c };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_attribute2column_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList c2tList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpC2t : c2tList.getEntryObjects()) {
				if (tmpC2t instanceof C2T) {
					C2T c2t = (C2T) tmpC2t;
					Table t = c2t.getTarget();
					if (t != null) {
						Clazz c = c2t.getSource();
						if (c != null) {
							if (pattern_attribute2column_29_2_isapplicablecore_black_nac_1BB(ruleResult, c2t) == null) {
								if (pattern_attribute2column_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										t) == null) {
									if (pattern_attribute2column_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											c) == null) {
										_result.add(
												new Object[] { c2tList, t, c2t, c, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_attribute2column_29_3_solveCSP_bindingFBBBBBB(attribute2column _this,
			IsApplicableMatch isApplicableMatch, Table t, C2T c2t, Clazz c, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, t, c2t, c, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, t, c2t, c, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_attribute2column_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_attribute2column_29_3_solveCSP_bindingAndBlackFBBBBBB(attribute2column _this,
			IsApplicableMatch isApplicableMatch, Table t, C2T c2t, Clazz c, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_attribute2column_29_3_solveCSP_binding = pattern_attribute2column_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, t, c2t, c, ruleResult);
		if (result_pattern_attribute2column_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_attribute2column_29_3_solveCSP_binding[0];

			Object[] result_pattern_attribute2column_29_3_solveCSP_black = pattern_attribute2column_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_attribute2column_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, t, c2t, c, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_attribute2column_29_4_checkCSP_expressionFBB(attribute2column _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_attribute2column_29_5_checknacs_blackBBB(Table t, C2T c2t, Clazz c) {
		return new Object[] { t, c2t, c };
	}

	public static final Object[] pattern_attribute2column_29_6_perform_blackBBBB(Table t, C2T c2t, Clazz c,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { t, c2t, c, ruleResult };
	}

	public static final Object[] pattern_attribute2column_29_6_perform_greenFFBFBB(Table t, Clazz c,
			ModelgeneratorRuleResult ruleResult) {
		A2C a2co = Class2databaseFactory.eINSTANCE.createA2C();
		Column co = DatabaseFactory.eINSTANCE.createColumn();
		Attribute a = ClassFactory.eINSTANCE.createAttribute();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(a2co);
		a2co.setTarget(co);
		t.getColumn().add(co);
		ruleResult.getTargetObjects().add(co);
		a2co.setSource(a);
		c.getAttribute().add(a);
		ruleResult.getSourceObjects().add(a);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { a2co, co, t, a, c, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_attribute2column_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //attribute2columnImpl
