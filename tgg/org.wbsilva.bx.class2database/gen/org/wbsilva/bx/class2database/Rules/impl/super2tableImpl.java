/**
 */
package org.wbsilva.bx.class2database.Rules.impl;

import class_.ClassDiagram;
import class_.ClassFactory;
import class_.Clazz;

import database.DB;
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

import org.wbsilva.bx.class2database.C2T;
import org.wbsilva.bx.class2database.CD2D;
import org.wbsilva.bx.class2database.Class2databaseFactory;

import org.wbsilva.bx.class2database.Rules.RulesPackage;
import org.wbsilva.bx.class2database.Rules.super2table;
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
 * An implementation of the model object '<em><b>super2table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class super2tableImpl extends AbstractRuleImpl implements super2table {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected super2tableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getsuper2table();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ClassDiagram cd, Clazz c, Clazz p) {

		Object[] result1_black = super2tableImpl.pattern_super2table_0_1_initialbindings_blackBBBBB(this, match, cd, c,
				p);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cd] = " + cd + ", " + "[c] = " + c + ", " + "[p] = " + p + ".");
		}

		Object[] result2_bindingAndBlack = super2tableImpl.pattern_super2table_0_2_SolveCSP_bindingAndBlackFBBBBB(this,
				match, cd, c, p);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cd] = " + cd + ", " + "[c] = " + c + ", " + "[p] = " + p + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (super2tableImpl.pattern_super2table_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = super2tableImpl
					.pattern_super2table_0_4_collectelementstobetranslated_blackBBBB(match, cd, c, p);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cd] = " + cd + ", " + "[c] = " + c + ", " + "[p] = " + p + ".");
			}
			super2tableImpl.pattern_super2table_0_4_collectelementstobetranslated_greenBBBBFF(match, cd, c, p);
			//nothing EMoflonEdge cd__c____classes = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge c__p____super = (EMoflonEdge) result4_green[5];

			Object[] result5_black = super2tableImpl.pattern_super2table_0_5_collectcontextelements_blackBBBB(match, cd,
					c, p);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cd] = " + cd + ", " + "[c] = " + c + ", " + "[p] = " + p + ".");
			}
			super2tableImpl.pattern_super2table_0_5_collectcontextelements_greenBBBF(match, cd, p);
			//nothing EMoflonEdge cd__p____classes = (EMoflonEdge) result5_green[3];

			// 
			super2tableImpl.pattern_super2table_0_6_registerobjectstomatch_expressionBBBBB(this, match, cd, c, p);
			return super2tableImpl.pattern_super2table_0_7_expressionF();
		} else {
			return super2tableImpl.pattern_super2table_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = super2tableImpl
				.pattern_super2table_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Table t = (Table) result1_bindingAndBlack[0];
		C2T p2t = (C2T) result1_bindingAndBlack[1];
		CD2D cd2db = (CD2D) result1_bindingAndBlack[2];
		ClassDiagram cd = (ClassDiagram) result1_bindingAndBlack[3];
		DB db = (DB) result1_bindingAndBlack[4];
		Clazz c = (Clazz) result1_bindingAndBlack[5];
		Clazz p = (Clazz) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = super2tableImpl.pattern_super2table_1_1_performtransformation_greenBFB(t, c);
		C2T c2t = (C2T) result1_green[1];

		Object[] result2_black = super2tableImpl.pattern_super2table_1_2_collecttranslatedelements_blackBB(c2t, c);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[c2t] = " + c2t + ", " + "[c] = " + c + ".");
		}
		Object[] result2_green = super2tableImpl.pattern_super2table_1_2_collecttranslatedelements_greenFBB(c2t, c);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = super2tableImpl.pattern_super2table_1_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult,
				t, p2t, c2t, cd2db, cd, db, c, p);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[t] = " + t
							+ ", " + "[p2t] = " + p2t + ", " + "[c2t] = " + c2t + ", " + "[cd2db] = " + cd2db + ", "
							+ "[cd] = " + cd + ", " + "[db] = " + db + ", " + "[c] = " + c + ", " + "[p] = " + p + ".");
		}
		super2tableImpl.pattern_super2table_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, t, c2t, cd, c, p);
		//nothing EMoflonEdge c2t__t____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge c2t__c____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge cd__c____classes = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge c__p____super = (EMoflonEdge) result3_green[9];

		// 
		// 
		super2tableImpl.pattern_super2table_1_5_registerobjects_expressionBBBBBBBBBB(this, ruleresult, t, p2t, c2t,
				cd2db, cd, db, c, p);
		return super2tableImpl.pattern_super2table_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = super2tableImpl
				.pattern_super2table_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = super2tableImpl.pattern_super2table_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = super2tableImpl.pattern_super2table_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ClassDiagram cd = (ClassDiagram) result2_binding[0];
		Clazz c = (Clazz) result2_binding[1];
		Clazz p = (Clazz) result2_binding[2];
		for (Object[] result2_black : super2tableImpl.pattern_super2table_2_2_corematch_blackFFFBFBBB(cd, c, p,
				match)) {
			Table t = (Table) result2_black[0];
			C2T p2t = (C2T) result2_black[1];
			CD2D cd2db = (CD2D) result2_black[2];
			DB db = (DB) result2_black[4];
			// ForEach 
			for (Object[] result3_black : super2tableImpl.pattern_super2table_2_3_findcontext_blackBBBBBBB(t, p2t,
					cd2db, cd, db, c, p)) {
				Object[] result3_green = super2tableImpl.pattern_super2table_2_3_findcontext_greenBBBBBBBFFFFFFFFF(t,
						p2t, cd2db, cd, db, c, p);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge p2t__t____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge cd__p____classes = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge cd2db__db____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge db__t____table = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge cd2db__cd____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge cd__c____classes = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge c__p____super = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge p2t__p____source = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = super2tableImpl
						.pattern_super2table_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, t, p2t,
								cd2db, cd, db, c, p);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[t] = " + t + ", " + "[p2t] = "
							+ p2t + ", " + "[cd2db] = " + cd2db + ", " + "[cd] = " + cd + ", " + "[db] = " + db + ", "
							+ "[c] = " + c + ", " + "[p] = " + p + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (super2tableImpl.pattern_super2table_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = super2tableImpl
							.pattern_super2table_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					super2tableImpl.pattern_super2table_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return super2tableImpl.pattern_super2table_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ClassDiagram cd, Clazz c, Clazz p) {
		match.registerObject("cd", cd);
		match.registerObject("c", c);
		match.registerObject("p", p);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ClassDiagram cd, Clazz c, Clazz p) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Table t, C2T p2t, CD2D cd2db,
			ClassDiagram cd, DB db, Clazz c, Clazz p) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("t", t);
		isApplicableMatch.registerObject("p2t", p2t);
		isApplicableMatch.registerObject("cd2db", cd2db);
		isApplicableMatch.registerObject("cd", cd);
		isApplicableMatch.registerObject("db", db);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("p", p);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject t, EObject p2t, EObject c2t, EObject cd2db,
			EObject cd, EObject db, EObject c, EObject p) {
		ruleresult.registerObject("t", t);
		ruleresult.registerObject("p2t", p2t);
		ruleresult.registerObject("c2t", c2t);
		ruleresult.registerObject("cd2db", cd2db);
		ruleresult.registerObject("cd", cd);
		ruleresult.registerObject("db", db);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("p", p);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("class.Clazz.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Table t, DB db) {

		Object[] result1_black = super2tableImpl.pattern_super2table_10_1_initialbindings_blackBBBB(this, match, t, db);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[t] = " + t + ", " + "[db] = " + db + ".");
		}

		Object[] result2_bindingAndBlack = super2tableImpl.pattern_super2table_10_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, t, db);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[t] = " + t + ", " + "[db] = " + db + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (super2tableImpl.pattern_super2table_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = super2tableImpl
					.pattern_super2table_10_4_collectelementstobetranslated_blackBBB(match, t, db);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[t] = " + t + ", " + "[db] = " + db + ".");
			}

			Object[] result5_black = super2tableImpl.pattern_super2table_10_5_collectcontextelements_blackBBB(match, t,
					db);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[t] = " + t + ", " + "[db] = " + db + ".");
			}
			super2tableImpl.pattern_super2table_10_5_collectcontextelements_greenBBBF(match, t, db);
			//nothing EMoflonEdge db__t____table = (EMoflonEdge) result5_green[3];

			// 
			super2tableImpl.pattern_super2table_10_6_registerobjectstomatch_expressionBBBB(this, match, t, db);
			return super2tableImpl.pattern_super2table_10_7_expressionF();
		} else {
			return super2tableImpl.pattern_super2table_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Table t, DB db) {
		match.registerObject("t", t);
		match.registerObject("db", db);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Table t, DB db) {// Create CSP
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
	public boolean checkTypes_BWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_Table_1(Table t) {

		Object[] result1_bindingAndBlack = super2tableImpl
				.pattern_super2table_17_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = super2tableImpl.pattern_super2table_17_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : super2tableImpl.pattern_super2table_17_2_testcorematchandDECs_blackBF(t)) {
			DB db = (DB) result2_black[1];
			Object[] result2_green = super2tableImpl.pattern_super2table_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (super2tableImpl.pattern_super2table_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, t, db)) {
				// 
				if (super2tableImpl
						.pattern_super2table_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = super2tableImpl.pattern_super2table_17_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					super2tableImpl.pattern_super2table_17_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return super2tableImpl.pattern_super2table_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_66(EMoflonEdge _edge_classes) {

		Object[] result1_bindingAndBlack = super2tableImpl
				.pattern_super2table_18_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = super2tableImpl.pattern_super2table_18_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : super2tableImpl
				.pattern_super2table_18_2_testcorematchandDECs_blackFFFB(_edge_classes)) {
			ClassDiagram cd = (ClassDiagram) result2_black[0];
			Clazz c = (Clazz) result2_black[1];
			Clazz p = (Clazz) result2_black[2];
			Object[] result2_green = super2tableImpl.pattern_super2table_18_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (super2tableImpl.pattern_super2table_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
					this, match, cd, c, p)) {
				// 
				if (super2tableImpl
						.pattern_super2table_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = super2tableImpl.pattern_super2table_18_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					super2tableImpl.pattern_super2table_18_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return super2tableImpl.pattern_super2table_18_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("super2table");
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
		ruleResult.setRule("super2table");
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

		Object[] result1_black = super2tableImpl.pattern_super2table_21_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = super2tableImpl.pattern_super2table_21_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = super2tableImpl
				.pattern_super2table_21_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Table t = (Table) result2_bindingAndBlack[0];
		ClassDiagram cd = (ClassDiagram) result2_bindingAndBlack[1];
		DB db = (DB) result2_bindingAndBlack[2];
		Clazz c = (Clazz) result2_bindingAndBlack[3];
		Clazz p = (Clazz) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = super2tableImpl.pattern_super2table_21_3_solvecsp_bindingAndBlackFBBBBBBBB(
				this, t, cd, db, c, p, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[t] = " + t + ", "
							+ "[cd] = " + cd + ", " + "[db] = " + db + ", " + "[c] = " + c + ", " + "[p] = " + p + ", "
							+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (super2tableImpl.pattern_super2table_21_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : super2tableImpl.pattern_super2table_21_5_matchcorrcontext_blackBFFBBBBB(t, cd,
					db, p, sourceMatch, targetMatch)) {
				C2T p2t = (C2T) result5_black[1];
				CD2D cd2db = (CD2D) result5_black[2];
				Object[] result5_green = super2tableImpl.pattern_super2table_21_5_matchcorrcontext_greenBBBBF(p2t,
						cd2db, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = super2tableImpl.pattern_super2table_21_6_createcorrespondence_blackBBBBBB(t,
						cd, db, c, p, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[t] = " + t + ", "
							+ "[cd] = " + cd + ", " + "[db] = " + db + ", " + "[c] = " + c + ", " + "[p] = " + p + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				super2tableImpl.pattern_super2table_21_6_createcorrespondence_greenBFBB(t, c, ccMatch);
				//nothing C2T c2t = (C2T) result6_green[1];

				Object[] result7_black = super2tableImpl.pattern_super2table_21_7_addtoreturnedresult_blackBB(result,
						ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				super2tableImpl.pattern_super2table_21_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return super2tableImpl.pattern_super2table_21_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Table t, ClassDiagram cd, DB db, Clazz c, Clazz p, Match sourceMatch,
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
	public boolean checkDEC_FWD(ClassDiagram cd, Clazz c, Clazz p) {// 
		Object[] result1_black = super2tableImpl.pattern_super2table_24_1_matchtggpattern_blackBBB(cd, c, p);
		if (result1_black != null) {
			return super2tableImpl.pattern_super2table_24_2_expressionF();
		} else {
			return super2tableImpl.pattern_super2table_24_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Table t, DB db) {// 
		Object[] result1_black = super2tableImpl.pattern_super2table_25_1_matchtggpattern_blackBB(t, db);
		if (result1_black != null) {
			return super2tableImpl.pattern_super2table_25_2_expressionF();
		} else {
			return super2tableImpl.pattern_super2table_25_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, C2T p2tParameter) {

		Object[] result1_black = super2tableImpl.pattern_super2table_26_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = super2tableImpl.pattern_super2table_26_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : super2tableImpl
				.pattern_super2table_26_2_isapplicablecore_blackFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList p2tList = (RuleEntryList) result2_black[0];
			Table t = (Table) result2_black[1];
			C2T p2t = (C2T) result2_black[2];
			Clazz p = (Clazz) result2_black[3];
			ClassDiagram cd = (ClassDiagram) result2_black[4];
			CD2D cd2db = (CD2D) result2_black[5];
			DB db = (DB) result2_black[6];

			Object[] result3_bindingAndBlack = super2tableImpl
					.pattern_super2table_26_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, t, p2t, cd2db,
							cd, db, p, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[t] = " + t + ", " + "[p2t] = " + p2t
						+ ", " + "[cd2db] = " + cd2db + ", " + "[cd] = " + cd + ", " + "[db] = " + db + ", " + "[p] = "
						+ p + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (super2tableImpl.pattern_super2table_26_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = super2tableImpl.pattern_super2table_26_5_checknacs_blackBBBBBB(t, p2t, cd2db,
						cd, db, p);
				if (result5_black != null) {

					Object[] result6_black = super2tableImpl.pattern_super2table_26_6_perform_blackBBBBBBB(t, p2t,
							cd2db, cd, db, p, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[t] = " + t + ", "
								+ "[p2t] = " + p2t + ", " + "[cd2db] = " + cd2db + ", " + "[cd] = " + cd + ", "
								+ "[db] = " + db + ", " + "[p] = " + p + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					super2tableImpl.pattern_super2table_26_6_perform_greenBFBFBB(t, cd, p, ruleResult);
					//nothing C2T c2t = (C2T) result6_green[1];
					//nothing Clazz c = (Clazz) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return super2tableImpl.pattern_super2table_26_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Table t, C2T p2t, CD2D cd2db,
			ClassDiagram cd, DB db, Clazz p, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("t", t);
		isApplicableMatch.registerObject("p2t", p2t);
		isApplicableMatch.registerObject("cd2db", cd2db);
		isApplicableMatch.registerObject("cd", cd);
		isApplicableMatch.registerObject("db", db);
		isApplicableMatch.registerObject("p", p);
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
		case RulesPackage.SUPER2TABLE___IS_APPROPRIATE_FWD__MATCH_CLASSDIAGRAM_CLAZZ_CLAZZ:
			return isAppropriate_FWD((Match) arguments.get(0), (ClassDiagram) arguments.get(1),
					(Clazz) arguments.get(2), (Clazz) arguments.get(3));
		case RulesPackage.SUPER2TABLE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SUPER2TABLE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SUPER2TABLE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASSDIAGRAM_CLAZZ_CLAZZ:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ClassDiagram) arguments.get(1),
					(Clazz) arguments.get(2), (Clazz) arguments.get(3));
			return null;
		case RulesPackage.SUPER2TABLE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASSDIAGRAM_CLAZZ_CLAZZ:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ClassDiagram) arguments.get(1),
					(Clazz) arguments.get(2), (Clazz) arguments.get(3));
		case RulesPackage.SUPER2TABLE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SUPER2TABLE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TABLE_C2T_CD2D_CLASSDIAGRAM_DB_CLAZZ_CLAZZ:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Table) arguments.get(1),
					(C2T) arguments.get(2), (CD2D) arguments.get(3), (ClassDiagram) arguments.get(4),
					(DB) arguments.get(5), (Clazz) arguments.get(6), (Clazz) arguments.get(7));
		case RulesPackage.SUPER2TABLE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SUPER2TABLE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.SUPER2TABLE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SUPER2TABLE___IS_APPROPRIATE_BWD__MATCH_TABLE_DB:
			return isAppropriate_BWD((Match) arguments.get(0), (Table) arguments.get(1), (DB) arguments.get(2));
		case RulesPackage.SUPER2TABLE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SUPER2TABLE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SUPER2TABLE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABLE_DB:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Table) arguments.get(1), (DB) arguments.get(2));
			return null;
		case RulesPackage.SUPER2TABLE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABLE_DB:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Table) arguments.get(1),
					(DB) arguments.get(2));
		case RulesPackage.SUPER2TABLE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SUPER2TABLE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SUPER2TABLE___IS_APPROPRIATE_BWD_TABLE_1__TABLE:
			return isAppropriate_BWD_Table_1((Table) arguments.get(0));
		case RulesPackage.SUPER2TABLE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_66__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_66((EMoflonEdge) arguments.get(0));
		case RulesPackage.SUPER2TABLE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SUPER2TABLE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.SUPER2TABLE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.SUPER2TABLE___IS_APPLICABLE_SOLVE_CSP_CC__TABLE_CLASSDIAGRAM_DB_CLAZZ_CLAZZ_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Table) arguments.get(0), (ClassDiagram) arguments.get(1),
					(DB) arguments.get(2), (Clazz) arguments.get(3), (Clazz) arguments.get(4), (Match) arguments.get(5),
					(Match) arguments.get(6));
		case RulesPackage.SUPER2TABLE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.SUPER2TABLE___CHECK_DEC_FWD__CLASSDIAGRAM_CLAZZ_CLAZZ:
			return checkDEC_FWD((ClassDiagram) arguments.get(0), (Clazz) arguments.get(1), (Clazz) arguments.get(2));
		case RulesPackage.SUPER2TABLE___CHECK_DEC_BWD__TABLE_DB:
			return checkDEC_BWD((Table) arguments.get(0), (DB) arguments.get(1));
		case RulesPackage.SUPER2TABLE___GENERATE_MODEL__RULEENTRYCONTAINER_C2T:
			return generateModel((RuleEntryContainer) arguments.get(0), (C2T) arguments.get(1));
		case RulesPackage.SUPER2TABLE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TABLE_C2T_CD2D_CLASSDIAGRAM_DB_CLAZZ_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Table) arguments.get(1),
					(C2T) arguments.get(2), (CD2D) arguments.get(3), (ClassDiagram) arguments.get(4),
					(DB) arguments.get(5), (Clazz) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.SUPER2TABLE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_super2table_0_1_initialbindings_blackBBBBB(super2table _this, Match match,
			ClassDiagram cd, Clazz c, Clazz p) {
		if (!c.equals(p)) {
			return new Object[] { _this, match, cd, c, p };
		}
		return null;
	}

	public static final Object[] pattern_super2table_0_2_SolveCSP_bindingFBBBBB(super2table _this, Match match,
			ClassDiagram cd, Clazz c, Clazz p) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, cd, c, p);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, cd, c, p };
		}
		return null;
	}

	public static final Object[] pattern_super2table_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_super2table_0_2_SolveCSP_bindingAndBlackFBBBBB(super2table _this, Match match,
			ClassDiagram cd, Clazz c, Clazz p) {
		Object[] result_pattern_super2table_0_2_SolveCSP_binding = pattern_super2table_0_2_SolveCSP_bindingFBBBBB(_this,
				match, cd, c, p);
		if (result_pattern_super2table_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_super2table_0_2_SolveCSP_binding[0];

			Object[] result_pattern_super2table_0_2_SolveCSP_black = pattern_super2table_0_2_SolveCSP_blackB(csp);
			if (result_pattern_super2table_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, cd, c, p };
			}
		}
		return null;
	}

	public static final boolean pattern_super2table_0_3_CheckCSP_expressionFBB(super2table _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_super2table_0_4_collectelementstobetranslated_blackBBBB(Match match,
			ClassDiagram cd, Clazz c, Clazz p) {
		if (!c.equals(p)) {
			return new Object[] { match, cd, c, p };
		}
		return null;
	}

	public static final Object[] pattern_super2table_0_4_collectelementstobetranslated_greenBBBBFF(Match match,
			ClassDiagram cd, Clazz c, Clazz p) {
		EMoflonEdge cd__c____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__p____super = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(c);
		String cd__c____classes_name_prime = "classes";
		String c__p____super_name_prime = "super";
		cd__c____classes.setSrc(cd);
		cd__c____classes.setTrg(c);
		match.getToBeTranslatedEdges().add(cd__c____classes);
		c__p____super.setSrc(c);
		c__p____super.setTrg(p);
		match.getToBeTranslatedEdges().add(c__p____super);
		cd__c____classes.setName(cd__c____classes_name_prime);
		c__p____super.setName(c__p____super_name_prime);
		return new Object[] { match, cd, c, p, cd__c____classes, c__p____super };
	}

	public static final Object[] pattern_super2table_0_5_collectcontextelements_blackBBBB(Match match, ClassDiagram cd,
			Clazz c, Clazz p) {
		if (!c.equals(p)) {
			return new Object[] { match, cd, c, p };
		}
		return null;
	}

	public static final Object[] pattern_super2table_0_5_collectcontextelements_greenBBBF(Match match, ClassDiagram cd,
			Clazz p) {
		EMoflonEdge cd__p____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(cd);
		match.getContextNodes().add(p);
		String cd__p____classes_name_prime = "classes";
		cd__p____classes.setSrc(cd);
		cd__p____classes.setTrg(p);
		match.getContextEdges().add(cd__p____classes);
		cd__p____classes.setName(cd__p____classes_name_prime);
		return new Object[] { match, cd, p, cd__p____classes };
	}

	public static final void pattern_super2table_0_6_registerobjectstomatch_expressionBBBBB(super2table _this,
			Match match, ClassDiagram cd, Clazz c, Clazz p) {
		_this.registerObjectsToMatch_FWD(match, cd, c, p);

	}

	public static final boolean pattern_super2table_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_super2table_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_super2table_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("t");
		EObject _localVariable_1 = isApplicableMatch.getObject("p2t");
		EObject _localVariable_2 = isApplicableMatch.getObject("cd2db");
		EObject _localVariable_3 = isApplicableMatch.getObject("cd");
		EObject _localVariable_4 = isApplicableMatch.getObject("db");
		EObject _localVariable_5 = isApplicableMatch.getObject("c");
		EObject _localVariable_6 = isApplicableMatch.getObject("p");
		EObject tmpT = _localVariable_0;
		EObject tmpP2t = _localVariable_1;
		EObject tmpCd2db = _localVariable_2;
		EObject tmpCd = _localVariable_3;
		EObject tmpDb = _localVariable_4;
		EObject tmpC = _localVariable_5;
		EObject tmpP = _localVariable_6;
		if (tmpT instanceof Table) {
			Table t = (Table) tmpT;
			if (tmpP2t instanceof C2T) {
				C2T p2t = (C2T) tmpP2t;
				if (tmpCd2db instanceof CD2D) {
					CD2D cd2db = (CD2D) tmpCd2db;
					if (tmpCd instanceof ClassDiagram) {
						ClassDiagram cd = (ClassDiagram) tmpCd;
						if (tmpDb instanceof DB) {
							DB db = (DB) tmpDb;
							if (tmpC instanceof Clazz) {
								Clazz c = (Clazz) tmpC;
								if (tmpP instanceof Clazz) {
									Clazz p = (Clazz) tmpP;
									return new Object[] { t, p2t, cd2db, cd, db, c, p, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_super2table_1_1_performtransformation_blackBBBBBBBFBB(Table t, C2T p2t,
			CD2D cd2db, ClassDiagram cd, DB db, Clazz c, Clazz p, super2table _this,
			IsApplicableMatch isApplicableMatch) {
		if (!c.equals(p)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { t, p2t, cd2db, cd, db, c, p, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_super2table_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			super2table _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_super2table_1_1_performtransformation_binding = pattern_super2table_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_super2table_1_1_performtransformation_binding != null) {
			Table t = (Table) result_pattern_super2table_1_1_performtransformation_binding[0];
			C2T p2t = (C2T) result_pattern_super2table_1_1_performtransformation_binding[1];
			CD2D cd2db = (CD2D) result_pattern_super2table_1_1_performtransformation_binding[2];
			ClassDiagram cd = (ClassDiagram) result_pattern_super2table_1_1_performtransformation_binding[3];
			DB db = (DB) result_pattern_super2table_1_1_performtransformation_binding[4];
			Clazz c = (Clazz) result_pattern_super2table_1_1_performtransformation_binding[5];
			Clazz p = (Clazz) result_pattern_super2table_1_1_performtransformation_binding[6];

			Object[] result_pattern_super2table_1_1_performtransformation_black = pattern_super2table_1_1_performtransformation_blackBBBBBBBFBB(
					t, p2t, cd2db, cd, db, c, p, _this, isApplicableMatch);
			if (result_pattern_super2table_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_super2table_1_1_performtransformation_black[7];

				return new Object[] { t, p2t, cd2db, cd, db, c, p, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_super2table_1_1_performtransformation_greenBFB(Table t, Clazz c) {
		C2T c2t = Class2databaseFactory.eINSTANCE.createC2T();
		c2t.setTarget(t);
		c2t.setSource(c);
		return new Object[] { t, c2t, c };
	}

	public static final Object[] pattern_super2table_1_2_collecttranslatedelements_blackBB(C2T c2t, Clazz c) {
		return new Object[] { c2t, c };
	}

	public static final Object[] pattern_super2table_1_2_collecttranslatedelements_greenFBB(C2T c2t, Clazz c) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(c2t);
		ruleresult.getTranslatedElements().add(c);
		return new Object[] { ruleresult, c2t, c };
	}

	public static final Object[] pattern_super2table_1_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject t, EObject p2t, EObject c2t, EObject cd2db, EObject cd, EObject db,
			EObject c, EObject p) {
		if (!p2t.equals(t)) {
			if (!c2t.equals(t)) {
				if (!c2t.equals(p2t)) {
					if (!c2t.equals(cd2db)) {
						if (!c2t.equals(cd)) {
							if (!c2t.equals(db)) {
								if (!c2t.equals(p)) {
									if (!cd2db.equals(t)) {
										if (!cd2db.equals(p2t)) {
											if (!cd2db.equals(db)) {
												if (!cd2db.equals(p)) {
													if (!cd.equals(t)) {
														if (!cd.equals(p2t)) {
															if (!cd.equals(cd2db)) {
																if (!cd.equals(db)) {
																	if (!cd.equals(p)) {
																		if (!db.equals(t)) {
																			if (!db.equals(p2t)) {
																				if (!db.equals(p)) {
																					if (!c.equals(t)) {
																						if (!c.equals(p2t)) {
																							if (!c.equals(c2t)) {
																								if (!c.equals(cd2db)) {
																									if (!c.equals(cd)) {
																										if (!c.equals(
																												db)) {
																											if (!c.equals(
																													p)) {
																												if (!p.equals(
																														t)) {
																													if (!p.equals(
																															p2t)) {
																														return new Object[] {
																																ruleresult,
																																t,
																																p2t,
																																c2t,
																																cd2db,
																																cd,
																																db,
																																c,
																																p };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_super2table_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject t, EObject c2t, EObject cd, EObject c, EObject p) {
		EMoflonEdge c2t__t____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2t__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd__c____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__p____super = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "super2table";
		String c2t__t____target_name_prime = "target";
		String c2t__c____source_name_prime = "source";
		String cd__c____classes_name_prime = "classes";
		String c__p____super_name_prime = "super";
		c2t__t____target.setSrc(c2t);
		c2t__t____target.setTrg(t);
		ruleresult.getCreatedEdges().add(c2t__t____target);
		c2t__c____source.setSrc(c2t);
		c2t__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2t__c____source);
		cd__c____classes.setSrc(cd);
		cd__c____classes.setTrg(c);
		ruleresult.getTranslatedEdges().add(cd__c____classes);
		c__p____super.setSrc(c);
		c__p____super.setTrg(p);
		ruleresult.getTranslatedEdges().add(c__p____super);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		c2t__t____target.setName(c2t__t____target_name_prime);
		c2t__c____source.setName(c2t__c____source_name_prime);
		cd__c____classes.setName(cd__c____classes_name_prime);
		c__p____super.setName(c__p____super_name_prime);
		return new Object[] { ruleresult, t, c2t, cd, c, p, c2t__t____target, c2t__c____source, cd__c____classes,
				c__p____super };
	}

	public static final void pattern_super2table_1_5_registerobjects_expressionBBBBBBBBBB(super2table _this,
			PerformRuleResult ruleresult, EObject t, EObject p2t, EObject c2t, EObject cd2db, EObject cd, EObject db,
			EObject c, EObject p) {
		_this.registerObjects_FWD(ruleresult, t, p2t, c2t, cd2db, cd, db, c, p);

	}

	public static final PerformRuleResult pattern_super2table_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_super2table_2_1_preparereturnvalue_bindingFB(super2table _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_super2table_2_1_preparereturnvalue_blackFBB(EClass eClass, super2table _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_super2table_2_1_preparereturnvalue_bindingAndBlackFFB(super2table _this) {
		Object[] result_pattern_super2table_2_1_preparereturnvalue_binding = pattern_super2table_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_super2table_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_super2table_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_super2table_2_1_preparereturnvalue_black = pattern_super2table_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_super2table_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_super2table_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_super2table_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "super2table";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_super2table_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("cd");
		EObject _localVariable_1 = match.getObject("c");
		EObject _localVariable_2 = match.getObject("p");
		EObject tmpCd = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpP = _localVariable_2;
		if (tmpCd instanceof ClassDiagram) {
			ClassDiagram cd = (ClassDiagram) tmpCd;
			if (tmpC instanceof Clazz) {
				Clazz c = (Clazz) tmpC;
				if (tmpP instanceof Clazz) {
					Clazz p = (Clazz) tmpP;
					return new Object[] { cd, c, p, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_super2table_2_2_corematch_blackFFFBFBBB(ClassDiagram cd, Clazz c,
			Clazz p, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(p)) {
			for (CD2D cd2db : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(cd, CD2D.class,
					"source")) {
				DB db = cd2db.getTarget();
				if (db != null) {
					for (C2T p2t : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(p, C2T.class,
							"source")) {
						Table t = p2t.getTarget();
						if (t != null) {
							_result.add(new Object[] { t, p2t, cd2db, cd, db, c, p, match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_super2table_2_3_findcontext_blackBBBBBBB(Table t, C2T p2t,
			CD2D cd2db, ClassDiagram cd, DB db, Clazz c, Clazz p) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(p)) {
			if (t.equals(p2t.getTarget())) {
				if (cd.getClasses().contains(p)) {
					if (db.equals(cd2db.getTarget())) {
						if (db.getTable().contains(t)) {
							if (cd.equals(cd2db.getSource())) {
								if (cd.getClasses().contains(c)) {
									if (p.equals(c.getSuper())) {
										if (p.equals(p2t.getSource())) {
											_result.add(new Object[] { t, p2t, cd2db, cd, db, c, p });
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

	public static final Object[] pattern_super2table_2_3_findcontext_greenBBBBBBBFFFFFFFFF(Table t, C2T p2t, CD2D cd2db,
			ClassDiagram cd, DB db, Clazz c, Clazz p) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge p2t__t____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd__p____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2db__db____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge db__t____table = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2db__cd____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd__c____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__p____super = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2t__p____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String p2t__t____target_name_prime = "target";
		String cd__p____classes_name_prime = "classes";
		String cd2db__db____target_name_prime = "target";
		String db__t____table_name_prime = "table";
		String cd2db__cd____source_name_prime = "source";
		String cd__c____classes_name_prime = "classes";
		String c__p____super_name_prime = "super";
		String p2t__p____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(t);
		isApplicableMatch.getAllContextElements().add(p2t);
		isApplicableMatch.getAllContextElements().add(cd2db);
		isApplicableMatch.getAllContextElements().add(cd);
		isApplicableMatch.getAllContextElements().add(db);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(p);
		p2t__t____target.setSrc(p2t);
		p2t__t____target.setTrg(t);
		isApplicableMatch.getAllContextElements().add(p2t__t____target);
		cd__p____classes.setSrc(cd);
		cd__p____classes.setTrg(p);
		isApplicableMatch.getAllContextElements().add(cd__p____classes);
		cd2db__db____target.setSrc(cd2db);
		cd2db__db____target.setTrg(db);
		isApplicableMatch.getAllContextElements().add(cd2db__db____target);
		db__t____table.setSrc(db);
		db__t____table.setTrg(t);
		isApplicableMatch.getAllContextElements().add(db__t____table);
		cd2db__cd____source.setSrc(cd2db);
		cd2db__cd____source.setTrg(cd);
		isApplicableMatch.getAllContextElements().add(cd2db__cd____source);
		cd__c____classes.setSrc(cd);
		cd__c____classes.setTrg(c);
		isApplicableMatch.getAllContextElements().add(cd__c____classes);
		c__p____super.setSrc(c);
		c__p____super.setTrg(p);
		isApplicableMatch.getAllContextElements().add(c__p____super);
		p2t__p____source.setSrc(p2t);
		p2t__p____source.setTrg(p);
		isApplicableMatch.getAllContextElements().add(p2t__p____source);
		p2t__t____target.setName(p2t__t____target_name_prime);
		cd__p____classes.setName(cd__p____classes_name_prime);
		cd2db__db____target.setName(cd2db__db____target_name_prime);
		db__t____table.setName(db__t____table_name_prime);
		cd2db__cd____source.setName(cd2db__cd____source_name_prime);
		cd__c____classes.setName(cd__c____classes_name_prime);
		c__p____super.setName(c__p____super_name_prime);
		p2t__p____source.setName(p2t__p____source_name_prime);
		return new Object[] { t, p2t, cd2db, cd, db, c, p, isApplicableMatch, p2t__t____target, cd__p____classes,
				cd2db__db____target, db__t____table, cd2db__cd____source, cd__c____classes, c__p____super,
				p2t__p____source };
	}

	public static final Object[] pattern_super2table_2_4_solveCSP_bindingFBBBBBBBBB(super2table _this,
			IsApplicableMatch isApplicableMatch, Table t, C2T p2t, CD2D cd2db, ClassDiagram cd, DB db, Clazz c,
			Clazz p) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, t, p2t, cd2db, cd, db, c, p);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, t, p2t, cd2db, cd, db, c, p };
		}
		return null;
	}

	public static final Object[] pattern_super2table_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_super2table_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(super2table _this,
			IsApplicableMatch isApplicableMatch, Table t, C2T p2t, CD2D cd2db, ClassDiagram cd, DB db, Clazz c,
			Clazz p) {
		Object[] result_pattern_super2table_2_4_solveCSP_binding = pattern_super2table_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, t, p2t, cd2db, cd, db, c, p);
		if (result_pattern_super2table_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_super2table_2_4_solveCSP_binding[0];

			Object[] result_pattern_super2table_2_4_solveCSP_black = pattern_super2table_2_4_solveCSP_blackB(csp);
			if (result_pattern_super2table_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, t, p2t, cd2db, cd, db, c, p };
			}
		}
		return null;
	}

	public static final boolean pattern_super2table_2_5_checkCSP_expressionFBB(super2table _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_super2table_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_super2table_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "super2table";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_super2table_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_super2table_10_1_initialbindings_blackBBBB(super2table _this, Match match,
			Table t, DB db) {
		return new Object[] { _this, match, t, db };
	}

	public static final Object[] pattern_super2table_10_2_SolveCSP_bindingFBBBB(super2table _this, Match match, Table t,
			DB db) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, t, db);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, t, db };
		}
		return null;
	}

	public static final Object[] pattern_super2table_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_super2table_10_2_SolveCSP_bindingAndBlackFBBBB(super2table _this, Match match,
			Table t, DB db) {
		Object[] result_pattern_super2table_10_2_SolveCSP_binding = pattern_super2table_10_2_SolveCSP_bindingFBBBB(
				_this, match, t, db);
		if (result_pattern_super2table_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_super2table_10_2_SolveCSP_binding[0];

			Object[] result_pattern_super2table_10_2_SolveCSP_black = pattern_super2table_10_2_SolveCSP_blackB(csp);
			if (result_pattern_super2table_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, t, db };
			}
		}
		return null;
	}

	public static final boolean pattern_super2table_10_3_CheckCSP_expressionFBB(super2table _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_super2table_10_4_collectelementstobetranslated_blackBBB(Match match, Table t,
			DB db) {
		return new Object[] { match, t, db };
	}

	public static final Object[] pattern_super2table_10_5_collectcontextelements_blackBBB(Match match, Table t, DB db) {
		return new Object[] { match, t, db };
	}

	public static final Object[] pattern_super2table_10_5_collectcontextelements_greenBBBF(Match match, Table t,
			DB db) {
		EMoflonEdge db__t____table = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(t);
		match.getContextNodes().add(db);
		String db__t____table_name_prime = "table";
		db__t____table.setSrc(db);
		db__t____table.setTrg(t);
		match.getContextEdges().add(db__t____table);
		db__t____table.setName(db__t____table_name_prime);
		return new Object[] { match, t, db, db__t____table };
	}

	public static final void pattern_super2table_10_6_registerobjectstomatch_expressionBBBB(super2table _this,
			Match match, Table t, DB db) {
		_this.registerObjectsToMatch_BWD(match, t, db);

	}

	public static final boolean pattern_super2table_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_super2table_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_super2table_17_1_preparereturnvalue_bindingFB(super2table _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_super2table_17_1_preparereturnvalue_blackFBBF(EClass __eClass,
			super2table _this) {
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

	public static final Object[] pattern_super2table_17_1_preparereturnvalue_bindingAndBlackFFBF(super2table _this) {
		Object[] result_pattern_super2table_17_1_preparereturnvalue_binding = pattern_super2table_17_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_super2table_17_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_super2table_17_1_preparereturnvalue_binding[0];

			Object[] result_pattern_super2table_17_1_preparereturnvalue_black = pattern_super2table_17_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_super2table_17_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_super2table_17_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_super2table_17_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_super2table_17_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_super2table_17_2_testcorematchandDECs_blackBF(Table t) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (DB db : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(t, DB.class, "table")) {
			_result.add(new Object[] { t, db });
		}
		return _result;
	}

	public static final Object[] pattern_super2table_17_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_super2table_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			super2table _this, Match match, Table t, DB db) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, t, db);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_super2table_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			super2table _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_super2table_17_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_super2table_17_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_super2table_17_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_super2table_18_1_preparereturnvalue_bindingFB(super2table _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_super2table_18_1_preparereturnvalue_blackFBBF(EClass __eClass,
			super2table _this) {
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

	public static final Object[] pattern_super2table_18_1_preparereturnvalue_bindingAndBlackFFBF(super2table _this) {
		Object[] result_pattern_super2table_18_1_preparereturnvalue_binding = pattern_super2table_18_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_super2table_18_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_super2table_18_1_preparereturnvalue_binding[0];

			Object[] result_pattern_super2table_18_1_preparereturnvalue_black = pattern_super2table_18_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_super2table_18_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_super2table_18_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_super2table_18_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_super2table_18_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_super2table_18_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_classes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCd = _edge_classes.getSrc();
		if (tmpCd instanceof ClassDiagram) {
			ClassDiagram cd = (ClassDiagram) tmpCd;
			EObject tmpC = _edge_classes.getTrg();
			if (tmpC instanceof Clazz) {
				Clazz c = (Clazz) tmpC;
				if (cd.getClasses().contains(c)) {
					Clazz p = c.getSuper();
					if (p != null) {
						if (!c.equals(p)) {
							if (cd.getClasses().contains(p)) {
								_result.add(new Object[] { cd, c, p, _edge_classes });
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_super2table_18_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_super2table_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			super2table _this, Match match, ClassDiagram cd, Clazz c, Clazz p) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, cd, c, p);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_super2table_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			super2table _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_super2table_18_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_super2table_18_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_super2table_18_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_super2table_21_1_prepare_blackB(super2table _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_super2table_21_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_super2table_21_2_matchsrctrgcontext_bindingFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("t");
		EObject _localVariable_1 = sourceMatch.getObject("cd");
		EObject _localVariable_2 = targetMatch.getObject("db");
		EObject _localVariable_3 = sourceMatch.getObject("c");
		EObject _localVariable_4 = sourceMatch.getObject("p");
		EObject tmpT = _localVariable_0;
		EObject tmpCd = _localVariable_1;
		EObject tmpDb = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpP = _localVariable_4;
		if (tmpT instanceof Table) {
			Table t = (Table) tmpT;
			if (tmpCd instanceof ClassDiagram) {
				ClassDiagram cd = (ClassDiagram) tmpCd;
				if (tmpDb instanceof DB) {
					DB db = (DB) tmpDb;
					if (tmpC instanceof Clazz) {
						Clazz c = (Clazz) tmpC;
						if (tmpP instanceof Clazz) {
							Clazz p = (Clazz) tmpP;
							return new Object[] { t, cd, db, c, p, targetMatch, sourceMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_super2table_21_2_matchsrctrgcontext_blackBBBBBBB(Table t, ClassDiagram cd,
			DB db, Clazz c, Clazz p, Match sourceMatch, Match targetMatch) {
		if (!c.equals(p)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { t, cd, db, c, p, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_super2table_21_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_super2table_21_2_matchsrctrgcontext_binding = pattern_super2table_21_2_matchsrctrgcontext_bindingFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_super2table_21_2_matchsrctrgcontext_binding != null) {
			Table t = (Table) result_pattern_super2table_21_2_matchsrctrgcontext_binding[0];
			ClassDiagram cd = (ClassDiagram) result_pattern_super2table_21_2_matchsrctrgcontext_binding[1];
			DB db = (DB) result_pattern_super2table_21_2_matchsrctrgcontext_binding[2];
			Clazz c = (Clazz) result_pattern_super2table_21_2_matchsrctrgcontext_binding[3];
			Clazz p = (Clazz) result_pattern_super2table_21_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_super2table_21_2_matchsrctrgcontext_black = pattern_super2table_21_2_matchsrctrgcontext_blackBBBBBBB(
					t, cd, db, c, p, sourceMatch, targetMatch);
			if (result_pattern_super2table_21_2_matchsrctrgcontext_black != null) {

				return new Object[] { t, cd, db, c, p, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_super2table_21_3_solvecsp_bindingFBBBBBBBB(super2table _this, Table t,
			ClassDiagram cd, DB db, Clazz c, Clazz p, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(t, cd, db, c, p, sourceMatch, targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, t, cd, db, c, p, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_super2table_21_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_super2table_21_3_solvecsp_bindingAndBlackFBBBBBBBB(super2table _this, Table t,
			ClassDiagram cd, DB db, Clazz c, Clazz p, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_super2table_21_3_solvecsp_binding = pattern_super2table_21_3_solvecsp_bindingFBBBBBBBB(
				_this, t, cd, db, c, p, sourceMatch, targetMatch);
		if (result_pattern_super2table_21_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_super2table_21_3_solvecsp_binding[0];

			Object[] result_pattern_super2table_21_3_solvecsp_black = pattern_super2table_21_3_solvecsp_blackB(csp);
			if (result_pattern_super2table_21_3_solvecsp_black != null) {

				return new Object[] { csp, _this, t, cd, db, c, p, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_super2table_21_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_super2table_21_5_matchcorrcontext_blackBFFBBBBB(Table t,
			ClassDiagram cd, DB db, Clazz p, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (C2T p2t : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(t, C2T.class, "target")) {
				if (p.equals(p2t.getSource())) {
					for (CD2D cd2db : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(db, CD2D.class,
							"target")) {
						if (cd.equals(cd2db.getSource())) {
							_result.add(new Object[] { t, p2t, cd2db, cd, db, p, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_super2table_21_5_matchcorrcontext_greenBBBBF(C2T p2t, CD2D cd2db,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "super2table";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(p2t);
		ccMatch.getAllContextElements().add(cd2db);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { p2t, cd2db, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_super2table_21_6_createcorrespondence_blackBBBBBB(Table t, ClassDiagram cd,
			DB db, Clazz c, Clazz p, CCMatch ccMatch) {
		if (!c.equals(p)) {
			return new Object[] { t, cd, db, c, p, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_super2table_21_6_createcorrespondence_greenBFBB(Table t, Clazz c,
			CCMatch ccMatch) {
		C2T c2t = Class2databaseFactory.eINSTANCE.createC2T();
		c2t.setTarget(t);
		c2t.setSource(c);
		ccMatch.getCreateCorr().add(c2t);
		return new Object[] { t, c2t, c, ccMatch };
	}

	public static final Object[] pattern_super2table_21_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_super2table_21_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "super2table";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_super2table_21_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_super2table_24_1_matchtggpattern_blackBBB(ClassDiagram cd, Clazz c, Clazz p) {
		if (!c.equals(p)) {
			if (cd.getClasses().contains(p)) {
				if (cd.getClasses().contains(c)) {
					if (p.equals(c.getSuper())) {
						return new Object[] { cd, c, p };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_super2table_24_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_super2table_24_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_super2table_25_1_matchtggpattern_blackBB(Table t, DB db) {
		if (db.getTable().contains(t)) {
			return new Object[] { t, db };
		}
		return null;
	}

	public static final boolean pattern_super2table_25_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_super2table_25_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_super2table_26_1_createresult_blackB(super2table _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_super2table_26_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_super2table_26_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Table t) {
		if (ruleResult.getTargetObjects().contains(t)) {
			return new Object[] { ruleResult, t };
		}
		return null;
	}

	public static final Object[] pattern_super2table_26_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, C2T p2t) {
		if (ruleResult.getCorrObjects().contains(p2t)) {
			return new Object[] { ruleResult, p2t };
		}
		return null;
	}

	public static final Object[] pattern_super2table_26_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Clazz p) {
		if (ruleResult.getSourceObjects().contains(p)) {
			return new Object[] { ruleResult, p };
		}
		return null;
	}

	public static final Object[] pattern_super2table_26_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, ClassDiagram cd) {
		if (ruleResult.getSourceObjects().contains(cd)) {
			return new Object[] { ruleResult, cd };
		}
		return null;
	}

	public static final Object[] pattern_super2table_26_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, CD2D cd2db) {
		if (ruleResult.getCorrObjects().contains(cd2db)) {
			return new Object[] { ruleResult, cd2db };
		}
		return null;
	}

	public static final Object[] pattern_super2table_26_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, DB db) {
		if (ruleResult.getTargetObjects().contains(db)) {
			return new Object[] { ruleResult, db };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_super2table_26_2_isapplicablecore_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList p2tList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpP2t : p2tList.getEntryObjects()) {
				if (tmpP2t instanceof C2T) {
					C2T p2t = (C2T) tmpP2t;
					Table t = p2t.getTarget();
					if (t != null) {
						Clazz p = p2t.getSource();
						if (p != null) {
							if (pattern_super2table_26_2_isapplicablecore_black_nac_1BB(ruleResult, p2t) == null) {
								if (pattern_super2table_26_2_isapplicablecore_black_nac_0BB(ruleResult, t) == null) {
									if (pattern_super2table_26_2_isapplicablecore_black_nac_2BB(ruleResult,
											p) == null) {
										for (DB db : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(t, DB.class, "table")) {
											if (pattern_super2table_26_2_isapplicablecore_black_nac_5BB(ruleResult,
													db) == null) {
												for (ClassDiagram cd : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(p, ClassDiagram.class, "classes")) {
													if (pattern_super2table_26_2_isapplicablecore_black_nac_3BB(
															ruleResult, cd) == null) {
														for (CD2D cd2db : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(db, CD2D.class, "target")) {
															if (cd.equals(cd2db.getSource())) {
																if (pattern_super2table_26_2_isapplicablecore_black_nac_4BB(
																		ruleResult, cd2db) == null) {
																	_result.add(new Object[] { p2tList, t, p2t, p, cd,
																			cd2db, db, ruleEntryContainer,
																			ruleResult });
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_super2table_26_3_solveCSP_bindingFBBBBBBBBB(super2table _this,
			IsApplicableMatch isApplicableMatch, Table t, C2T p2t, CD2D cd2db, ClassDiagram cd, DB db, Clazz p,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, t, p2t, cd2db, cd, db, p,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, t, p2t, cd2db, cd, db, p, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_super2table_26_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_super2table_26_3_solveCSP_bindingAndBlackFBBBBBBBBB(super2table _this,
			IsApplicableMatch isApplicableMatch, Table t, C2T p2t, CD2D cd2db, ClassDiagram cd, DB db, Clazz p,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_super2table_26_3_solveCSP_binding = pattern_super2table_26_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, t, p2t, cd2db, cd, db, p, ruleResult);
		if (result_pattern_super2table_26_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_super2table_26_3_solveCSP_binding[0];

			Object[] result_pattern_super2table_26_3_solveCSP_black = pattern_super2table_26_3_solveCSP_blackB(csp);
			if (result_pattern_super2table_26_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, t, p2t, cd2db, cd, db, p, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_super2table_26_4_checkCSP_expressionFBB(super2table _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_super2table_26_5_checknacs_blackBBBBBB(Table t, C2T p2t, CD2D cd2db,
			ClassDiagram cd, DB db, Clazz p) {
		return new Object[] { t, p2t, cd2db, cd, db, p };
	}

	public static final Object[] pattern_super2table_26_6_perform_blackBBBBBBB(Table t, C2T p2t, CD2D cd2db,
			ClassDiagram cd, DB db, Clazz p, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { t, p2t, cd2db, cd, db, p, ruleResult };
	}

	public static final Object[] pattern_super2table_26_6_perform_greenBFBFBB(Table t, ClassDiagram cd, Clazz p,
			ModelgeneratorRuleResult ruleResult) {
		C2T c2t = Class2databaseFactory.eINSTANCE.createC2T();
		Clazz c = ClassFactory.eINSTANCE.createClazz();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		c2t.setTarget(t);
		ruleResult.getCorrObjects().add(c2t);
		c2t.setSource(c);
		cd.getClasses().add(c);
		c.setSuper(p);
		ruleResult.getSourceObjects().add(c);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { t, c2t, cd, c, p, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_super2table_26_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //super2tableImpl
