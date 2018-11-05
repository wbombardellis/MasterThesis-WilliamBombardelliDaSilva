/**
 */
package org.wbsilva.bx.class2database.Rules.impl;

import class_.Association;
import class_.ClassDiagram;
import class_.ClassFactory;
import class_.Clazz;

import database.Column;
import database.DB;
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

import org.wbsilva.bx.class2database.AS2C;
import org.wbsilva.bx.class2database.C2T;
import org.wbsilva.bx.class2database.CD2D;
import org.wbsilva.bx.class2database.Class2databaseFactory;

import org.wbsilva.bx.class2database.Rules.RulesPackage;
import org.wbsilva.bx.class2database.Rules.selfassoc2column;
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
 * An implementation of the model object '<em><b>selfassoc2column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class selfassoc2columnImpl extends AbstractRuleImpl implements selfassoc2column {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected selfassoc2columnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getselfassoc2column();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Clazz c, Association sas, ClassDiagram cd) {

		Object[] result1_black = selfassoc2columnImpl.pattern_selfassoc2column_0_1_initialbindings_blackBBBBB(this,
				match, c, sas, cd);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[c] = " + c + ", " + "[sas] = " + sas + ", " + "[cd] = " + cd + ".");
		}

		Object[] result2_bindingAndBlack = selfassoc2columnImpl
				.pattern_selfassoc2column_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, c, sas, cd);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[c] = " + c + ", " + "[sas] = " + sas + ", " + "[cd] = " + cd + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (selfassoc2columnImpl.pattern_selfassoc2column_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = selfassoc2columnImpl
					.pattern_selfassoc2column_0_4_collectelementstobetranslated_blackBBBB(match, c, sas, cd);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[sas] = " + sas + ", " + "[cd] = " + cd + ".");
			}
			selfassoc2columnImpl.pattern_selfassoc2column_0_4_collectelementstobetranslated_greenBBBBFFF(match, c, sas,
					cd);
			//nothing EMoflonEdge sas__c____source = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge sas__c____target = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge cd__sas____associations = (EMoflonEdge) result4_green[6];

			Object[] result5_black = selfassoc2columnImpl
					.pattern_selfassoc2column_0_5_collectcontextelements_blackBBBB(match, c, sas, cd);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[sas] = " + sas + ", " + "[cd] = " + cd + ".");
			}
			selfassoc2columnImpl.pattern_selfassoc2column_0_5_collectcontextelements_greenBBBF(match, c, cd);
			//nothing EMoflonEdge cd__c____classes = (EMoflonEdge) result5_green[3];

			// 
			selfassoc2columnImpl.pattern_selfassoc2column_0_6_registerobjectstomatch_expressionBBBBB(this, match, c,
					sas, cd);
			return selfassoc2columnImpl.pattern_selfassoc2column_0_7_expressionF();
		} else {
			return selfassoc2columnImpl.pattern_selfassoc2column_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = selfassoc2columnImpl
				.pattern_selfassoc2column_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Table t = (Table) result1_bindingAndBlack[0];
		Clazz c = (Clazz) result1_bindingAndBlack[1];
		C2T c2t = (C2T) result1_bindingAndBlack[2];
		Association sas = (Association) result1_bindingAndBlack[3];
		CD2D cd2db = (CD2D) result1_bindingAndBlack[4];
		DB db = (DB) result1_bindingAndBlack[5];
		ClassDiagram cd = (ClassDiagram) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = selfassoc2columnImpl.pattern_selfassoc2column_1_1_performtransformation_greenBBFF(t,
				sas);
		Column fk = (Column) result1_green[2];
		AS2C sas2fk = (AS2C) result1_green[3];

		Object[] result2_black = selfassoc2columnImpl
				.pattern_selfassoc2column_1_2_collecttranslatedelements_blackBBB(sas, fk, sas2fk);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sas] = " + sas + ", " + "[fk] = "
					+ fk + ", " + "[sas2fk] = " + sas2fk + ".");
		}
		Object[] result2_green = selfassoc2columnImpl
				.pattern_selfassoc2column_1_2_collecttranslatedelements_greenFBBB(sas, fk, sas2fk);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = selfassoc2columnImpl.pattern_selfassoc2column_1_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, t, c, c2t, sas, cd2db, fk, sas2fk, db, cd);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[t] = " + t + ", " + "[c] = " + c + ", " + "[c2t] = " + c2t + ", " + "[sas] = " + sas
					+ ", " + "[cd2db] = " + cd2db + ", " + "[fk] = " + fk + ", " + "[sas2fk] = " + sas2fk + ", "
					+ "[db] = " + db + ", " + "[cd] = " + cd + ".");
		}
		selfassoc2columnImpl.pattern_selfassoc2column_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(ruleresult, t, c, sas,
				fk, sas2fk, cd);
		//nothing EMoflonEdge t__fk____column = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge sas__c____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge sas__c____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge sas2fk__fk____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge sas2fk__sas____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge fk__t____reference = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge cd__sas____associations = (EMoflonEdge) result3_green[13];

		// 
		// 
		selfassoc2columnImpl.pattern_selfassoc2column_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, t, c,
				c2t, sas, cd2db, fk, sas2fk, db, cd);
		return selfassoc2columnImpl.pattern_selfassoc2column_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = selfassoc2columnImpl
				.pattern_selfassoc2column_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = selfassoc2columnImpl
				.pattern_selfassoc2column_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = selfassoc2columnImpl.pattern_selfassoc2column_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Clazz c = (Clazz) result2_binding[0];
		Association sas = (Association) result2_binding[1];
		ClassDiagram cd = (ClassDiagram) result2_binding[2];
		for (Object[] result2_black : selfassoc2columnImpl.pattern_selfassoc2column_2_2_corematch_blackFBFBFFBB(c, sas,
				cd, match)) {
			Table t = (Table) result2_black[0];
			C2T c2t = (C2T) result2_black[2];
			CD2D cd2db = (CD2D) result2_black[4];
			DB db = (DB) result2_black[5];
			// ForEach 
			for (Object[] result3_black : selfassoc2columnImpl.pattern_selfassoc2column_2_3_findcontext_blackBBBBBBB(t,
					c, c2t, sas, cd2db, db, cd)) {
				Object[] result3_green = selfassoc2columnImpl
						.pattern_selfassoc2column_2_3_findcontext_greenBBBBBBBFFFFFFFFFF(t, c, c2t, sas, cd2db, db, cd);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge c2t__c____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge c2t__t____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge sas__c____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge sas__c____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge cd2db__db____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge cd__sas____associations = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge cd__c____classes = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge db__t____table = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge cd2db__cd____source = (EMoflonEdge) result3_green[16];

				Object[] result4_bindingAndBlack = selfassoc2columnImpl
						.pattern_selfassoc2column_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, t, c,
								c2t, sas, cd2db, db, cd);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[t] = " + t + ", " + "[c] = " + c
							+ ", " + "[c2t] = " + c2t + ", " + "[sas] = " + sas + ", " + "[cd2db] = " + cd2db + ", "
							+ "[db] = " + db + ", " + "[cd] = " + cd + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (selfassoc2columnImpl.pattern_selfassoc2column_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = selfassoc2columnImpl
							.pattern_selfassoc2column_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					selfassoc2columnImpl.pattern_selfassoc2column_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return selfassoc2columnImpl.pattern_selfassoc2column_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Clazz c, Association sas, ClassDiagram cd) {
		match.registerObject("c", c);
		match.registerObject("sas", sas);
		match.registerObject("cd", cd);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Clazz c, Association sas, ClassDiagram cd) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Table t, Clazz c, C2T c2t,
			Association sas, CD2D cd2db, DB db, ClassDiagram cd) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("t", t);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("c2t", c2t);
		isApplicableMatch.registerObject("sas", sas);
		isApplicableMatch.registerObject("cd2db", cd2db);
		isApplicableMatch.registerObject("db", db);
		isApplicableMatch.registerObject("cd", cd);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject t, EObject c, EObject c2t, EObject sas,
			EObject cd2db, EObject fk, EObject sas2fk, EObject db, EObject cd) {
		ruleresult.registerObject("t", t);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("c2t", c2t);
		ruleresult.registerObject("sas", sas);
		ruleresult.registerObject("cd2db", cd2db);
		ruleresult.registerObject("fk", fk);
		ruleresult.registerObject("sas2fk", sas2fk);
		ruleresult.registerObject("db", db);
		ruleresult.registerObject("cd", cd);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("sas").eClass()).equals("class.Association.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Table t, Column fk, DB db) {

		Object[] result1_black = selfassoc2columnImpl.pattern_selfassoc2column_10_1_initialbindings_blackBBBBB(this,
				match, t, fk, db);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[t] = " + t + ", " + "[fk] = " + fk + ", " + "[db] = " + db + ".");
		}

		Object[] result2_bindingAndBlack = selfassoc2columnImpl
				.pattern_selfassoc2column_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, t, fk, db);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[t] = " + t + ", " + "[fk] = " + fk + ", " + "[db] = " + db + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (selfassoc2columnImpl.pattern_selfassoc2column_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = selfassoc2columnImpl
					.pattern_selfassoc2column_10_4_collectelementstobetranslated_blackBBBB(match, t, fk, db);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[t] = " + t + ", " + "[fk] = " + fk + ", " + "[db] = " + db + ".");
			}
			selfassoc2columnImpl.pattern_selfassoc2column_10_4_collectelementstobetranslated_greenBBBFF(match, t, fk);
			//nothing EMoflonEdge t__fk____column = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge fk__t____reference = (EMoflonEdge) result4_green[4];

			Object[] result5_black = selfassoc2columnImpl
					.pattern_selfassoc2column_10_5_collectcontextelements_blackBBBB(match, t, fk, db);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[t] = " + t + ", " + "[fk] = " + fk + ", " + "[db] = " + db + ".");
			}
			selfassoc2columnImpl.pattern_selfassoc2column_10_5_collectcontextelements_greenBBBF(match, t, db);
			//nothing EMoflonEdge db__t____table = (EMoflonEdge) result5_green[3];

			// 
			selfassoc2columnImpl.pattern_selfassoc2column_10_6_registerobjectstomatch_expressionBBBBB(this, match, t,
					fk, db);
			return selfassoc2columnImpl.pattern_selfassoc2column_10_7_expressionF();
		} else {
			return selfassoc2columnImpl.pattern_selfassoc2column_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = selfassoc2columnImpl
				.pattern_selfassoc2column_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Table t = (Table) result1_bindingAndBlack[0];
		Clazz c = (Clazz) result1_bindingAndBlack[1];
		C2T c2t = (C2T) result1_bindingAndBlack[2];
		CD2D cd2db = (CD2D) result1_bindingAndBlack[3];
		Column fk = (Column) result1_bindingAndBlack[4];
		DB db = (DB) result1_bindingAndBlack[5];
		ClassDiagram cd = (ClassDiagram) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = selfassoc2columnImpl.pattern_selfassoc2column_11_1_performtransformation_greenBFBFB(c,
				fk, cd);
		Association sas = (Association) result1_green[1];
		AS2C sas2fk = (AS2C) result1_green[3];

		Object[] result2_black = selfassoc2columnImpl
				.pattern_selfassoc2column_11_2_collecttranslatedelements_blackBBB(sas, fk, sas2fk);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sas] = " + sas + ", " + "[fk] = "
					+ fk + ", " + "[sas2fk] = " + sas2fk + ".");
		}
		Object[] result2_green = selfassoc2columnImpl
				.pattern_selfassoc2column_11_2_collecttranslatedelements_greenFBBB(sas, fk, sas2fk);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = selfassoc2columnImpl.pattern_selfassoc2column_11_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, t, c, c2t, sas, cd2db, fk, sas2fk, db, cd);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[t] = " + t + ", " + "[c] = " + c + ", " + "[c2t] = " + c2t + ", " + "[sas] = " + sas
					+ ", " + "[cd2db] = " + cd2db + ", " + "[fk] = " + fk + ", " + "[sas2fk] = " + sas2fk + ", "
					+ "[db] = " + db + ", " + "[cd] = " + cd + ".");
		}
		selfassoc2columnImpl.pattern_selfassoc2column_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(ruleresult, t, c,
				sas, fk, sas2fk, cd);
		//nothing EMoflonEdge t__fk____column = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge sas__c____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge sas__c____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge sas2fk__fk____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge sas2fk__sas____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge fk__t____reference = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge cd__sas____associations = (EMoflonEdge) result3_green[13];

		// 
		// 
		selfassoc2columnImpl.pattern_selfassoc2column_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, t, c,
				c2t, sas, cd2db, fk, sas2fk, db, cd);
		return selfassoc2columnImpl.pattern_selfassoc2column_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = selfassoc2columnImpl
				.pattern_selfassoc2column_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = selfassoc2columnImpl
				.pattern_selfassoc2column_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = selfassoc2columnImpl.pattern_selfassoc2column_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Table t = (Table) result2_binding[0];
		Column fk = (Column) result2_binding[1];
		DB db = (DB) result2_binding[2];
		for (Object[] result2_black : selfassoc2columnImpl.pattern_selfassoc2column_12_2_corematch_blackBFFFBBFB(t, fk,
				db, match)) {
			Clazz c = (Clazz) result2_black[1];
			C2T c2t = (C2T) result2_black[2];
			CD2D cd2db = (CD2D) result2_black[3];
			ClassDiagram cd = (ClassDiagram) result2_black[6];
			// ForEach 
			for (Object[] result3_black : selfassoc2columnImpl.pattern_selfassoc2column_12_3_findcontext_blackBBBBBBB(t,
					c, c2t, cd2db, fk, db, cd)) {
				Object[] result3_green = selfassoc2columnImpl
						.pattern_selfassoc2column_12_3_findcontext_greenBBBBBBBFFFFFFFFF(t, c, c2t, cd2db, fk, db, cd);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge t__fk____column = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge c2t__c____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge c2t__t____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge cd2db__db____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge fk__t____reference = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge cd__c____classes = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge db__t____table = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge cd2db__cd____source = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = selfassoc2columnImpl
						.pattern_selfassoc2column_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, t, c,
								c2t, cd2db, fk, db, cd);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[t] = " + t + ", " + "[c] = " + c
							+ ", " + "[c2t] = " + c2t + ", " + "[cd2db] = " + cd2db + ", " + "[fk] = " + fk + ", "
							+ "[db] = " + db + ", " + "[cd] = " + cd + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (selfassoc2columnImpl.pattern_selfassoc2column_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = selfassoc2columnImpl
							.pattern_selfassoc2column_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					selfassoc2columnImpl.pattern_selfassoc2column_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return selfassoc2columnImpl.pattern_selfassoc2column_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Table t, Column fk, DB db) {
		match.registerObject("t", t);
		match.registerObject("fk", fk);
		match.registerObject("db", db);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Table t, Column fk, DB db) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Table t, Clazz c, C2T c2t, CD2D cd2db,
			Column fk, DB db, ClassDiagram cd) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("t", t);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("c2t", c2t);
		isApplicableMatch.registerObject("cd2db", cd2db);
		isApplicableMatch.registerObject("fk", fk);
		isApplicableMatch.registerObject("db", db);
		isApplicableMatch.registerObject("cd", cd);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject t, EObject c, EObject c2t, EObject sas,
			EObject cd2db, EObject fk, EObject sas2fk, EObject db, EObject cd) {
		ruleresult.registerObject("t", t);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("c2t", c2t);
		ruleresult.registerObject("sas", sas);
		ruleresult.registerObject("cd2db", cd2db);
		ruleresult.registerObject("fk", fk);
		ruleresult.registerObject("sas2fk", sas2fk);
		ruleresult.registerObject("db", db);
		ruleresult.registerObject("cd", cd);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("fk").eClass()).equals("database.Column.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_1(EMoflonEdge _edge_column) {

		Object[] result1_bindingAndBlack = selfassoc2columnImpl
				.pattern_selfassoc2column_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = selfassoc2columnImpl.pattern_selfassoc2column_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : selfassoc2columnImpl
				.pattern_selfassoc2column_20_2_testcorematchandDECs_blackFFFB(_edge_column)) {
			Table t = (Table) result2_black[0];
			Column fk = (Column) result2_black[1];
			DB db = (DB) result2_black[2];
			Object[] result2_green = selfassoc2columnImpl
					.pattern_selfassoc2column_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (selfassoc2columnImpl
					.pattern_selfassoc2column_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, t, fk, db)) {
				// 
				if (selfassoc2columnImpl
						.pattern_selfassoc2column_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = selfassoc2columnImpl
							.pattern_selfassoc2column_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					selfassoc2columnImpl.pattern_selfassoc2column_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return selfassoc2columnImpl.pattern_selfassoc2column_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_2(EMoflonEdge _edge_source) {

		Object[] result1_bindingAndBlack = selfassoc2columnImpl
				.pattern_selfassoc2column_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = selfassoc2columnImpl.pattern_selfassoc2column_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : selfassoc2columnImpl
				.pattern_selfassoc2column_21_2_testcorematchandDECs_blackFFFB(_edge_source)) {
			Clazz c = (Clazz) result2_black[0];
			Association sas = (Association) result2_black[1];
			ClassDiagram cd = (ClassDiagram) result2_black[2];
			Object[] result2_green = selfassoc2columnImpl
					.pattern_selfassoc2column_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (selfassoc2columnImpl
					.pattern_selfassoc2column_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, c, sas, cd)) {
				// 
				if (selfassoc2columnImpl
						.pattern_selfassoc2column_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = selfassoc2columnImpl
							.pattern_selfassoc2column_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					selfassoc2columnImpl.pattern_selfassoc2column_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return selfassoc2columnImpl.pattern_selfassoc2column_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("selfassoc2column");
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
		ruleResult.setRule("selfassoc2column");
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

		Object[] result1_black = selfassoc2columnImpl.pattern_selfassoc2column_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = selfassoc2columnImpl.pattern_selfassoc2column_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = selfassoc2columnImpl
				.pattern_selfassoc2column_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Table t = (Table) result2_bindingAndBlack[0];
		Clazz c = (Clazz) result2_bindingAndBlack[1];
		Association sas = (Association) result2_bindingAndBlack[2];
		Column fk = (Column) result2_bindingAndBlack[3];
		DB db = (DB) result2_bindingAndBlack[4];
		ClassDiagram cd = (ClassDiagram) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = selfassoc2columnImpl
				.pattern_selfassoc2column_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, t, c, sas, fk, db, cd,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[t] = " + t + ", " + "[c] = " + c + ", " + "[sas] = " + sas + ", " + "[fk] = " + fk + ", "
					+ "[db] = " + db + ", " + "[cd] = " + cd + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (selfassoc2columnImpl.pattern_selfassoc2column_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : selfassoc2columnImpl
					.pattern_selfassoc2column_24_5_matchcorrcontext_blackBBFFBBBB(t, c, db, cd, sourceMatch,
							targetMatch)) {
				C2T c2t = (C2T) result5_black[2];
				CD2D cd2db = (CD2D) result5_black[3];
				Object[] result5_green = selfassoc2columnImpl.pattern_selfassoc2column_24_5_matchcorrcontext_greenBBBBF(
						c2t, cd2db, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = selfassoc2columnImpl
						.pattern_selfassoc2column_24_6_createcorrespondence_blackBBBBBBB(t, c, sas, fk, db, cd,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[t] = " + t + ", "
							+ "[c] = " + c + ", " + "[sas] = " + sas + ", " + "[fk] = " + fk + ", " + "[db] = " + db
							+ ", " + "[cd] = " + cd + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				selfassoc2columnImpl.pattern_selfassoc2column_24_6_createcorrespondence_greenBBFB(sas, fk, ccMatch);
				//nothing AS2C sas2fk = (AS2C) result6_green[2];

				Object[] result7_black = selfassoc2columnImpl
						.pattern_selfassoc2column_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				selfassoc2columnImpl.pattern_selfassoc2column_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return selfassoc2columnImpl.pattern_selfassoc2column_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Table t, Clazz c, Association sas, Column fk, DB db, ClassDiagram cd,
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
	public boolean checkDEC_FWD(Clazz c, Association sas, ClassDiagram cd) {// 
		Object[] result1_black = selfassoc2columnImpl.pattern_selfassoc2column_27_1_matchtggpattern_blackBBB(c, sas,
				cd);
		if (result1_black != null) {
			return selfassoc2columnImpl.pattern_selfassoc2column_27_2_expressionF();
		} else {
			return selfassoc2columnImpl.pattern_selfassoc2column_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Table t, Column fk, DB db) {// 
		Object[] result1_black = selfassoc2columnImpl.pattern_selfassoc2column_28_1_matchtggpattern_blackBBB(t, fk, db);
		if (result1_black != null) {
			return selfassoc2columnImpl.pattern_selfassoc2column_28_2_expressionF();
		} else {
			return selfassoc2columnImpl.pattern_selfassoc2column_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, C2T c2tParameter) {

		Object[] result1_black = selfassoc2columnImpl.pattern_selfassoc2column_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = selfassoc2columnImpl.pattern_selfassoc2column_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : selfassoc2columnImpl
				.pattern_selfassoc2column_29_2_isapplicablecore_blackFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList c2tList = (RuleEntryList) result2_black[0];
			Table t = (Table) result2_black[1];
			C2T c2t = (C2T) result2_black[2];
			Clazz c = (Clazz) result2_black[3];
			ClassDiagram cd = (ClassDiagram) result2_black[4];
			CD2D cd2db = (CD2D) result2_black[5];
			DB db = (DB) result2_black[6];

			Object[] result3_bindingAndBlack = selfassoc2columnImpl
					.pattern_selfassoc2column_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, t, c,
							c2t, cd2db, db, cd, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[t] = " + t + ", " + "[c] = " + c
						+ ", " + "[c2t] = " + c2t + ", " + "[cd2db] = " + cd2db + ", " + "[db] = " + db + ", "
						+ "[cd] = " + cd + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (selfassoc2columnImpl.pattern_selfassoc2column_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = selfassoc2columnImpl.pattern_selfassoc2column_29_5_checknacs_blackBBBBBB(t, c,
						c2t, cd2db, db, cd);
				if (result5_black != null) {

					Object[] result6_black = selfassoc2columnImpl.pattern_selfassoc2column_29_6_perform_blackBBBBBBB(t,
							c, c2t, cd2db, db, cd, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[t] = " + t + ", "
								+ "[c] = " + c + ", " + "[c2t] = " + c2t + ", " + "[cd2db] = " + cd2db + ", "
								+ "[db] = " + db + ", " + "[cd] = " + cd + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					selfassoc2columnImpl.pattern_selfassoc2column_29_6_perform_greenBBFFFBB(t, c, cd, ruleResult);
					//nothing Association sas = (Association) result6_green[2];
					//nothing Column fk = (Column) result6_green[3];
					//nothing AS2C sas2fk = (AS2C) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return selfassoc2columnImpl.pattern_selfassoc2column_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Table t, Clazz c, C2T c2t, CD2D cd2db,
			DB db, ClassDiagram cd, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("t", t);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("c2t", c2t);
		isApplicableMatch.registerObject("cd2db", cd2db);
		isApplicableMatch.registerObject("db", db);
		isApplicableMatch.registerObject("cd", cd);
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
		case RulesPackage.SELFASSOC2COLUMN___IS_APPROPRIATE_FWD__MATCH_CLAZZ_ASSOCIATION_CLASSDIAGRAM:
			return isAppropriate_FWD((Match) arguments.get(0), (Clazz) arguments.get(1), (Association) arguments.get(2),
					(ClassDiagram) arguments.get(3));
		case RulesPackage.SELFASSOC2COLUMN___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SELFASSOC2COLUMN___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SELFASSOC2COLUMN___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLAZZ_ASSOCIATION_CLASSDIAGRAM:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Clazz) arguments.get(1),
					(Association) arguments.get(2), (ClassDiagram) arguments.get(3));
			return null;
		case RulesPackage.SELFASSOC2COLUMN___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLAZZ_ASSOCIATION_CLASSDIAGRAM:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Clazz) arguments.get(1),
					(Association) arguments.get(2), (ClassDiagram) arguments.get(3));
		case RulesPackage.SELFASSOC2COLUMN___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SELFASSOC2COLUMN___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TABLE_CLAZZ_C2T_ASSOCIATION_CD2D_DB_CLASSDIAGRAM:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Table) arguments.get(1),
					(Clazz) arguments.get(2), (C2T) arguments.get(3), (Association) arguments.get(4),
					(CD2D) arguments.get(5), (DB) arguments.get(6), (ClassDiagram) arguments.get(7));
		case RulesPackage.SELFASSOC2COLUMN___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SELFASSOC2COLUMN___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.SELFASSOC2COLUMN___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SELFASSOC2COLUMN___IS_APPROPRIATE_BWD__MATCH_TABLE_COLUMN_DB:
			return isAppropriate_BWD((Match) arguments.get(0), (Table) arguments.get(1), (Column) arguments.get(2),
					(DB) arguments.get(3));
		case RulesPackage.SELFASSOC2COLUMN___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SELFASSOC2COLUMN___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SELFASSOC2COLUMN___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABLE_COLUMN_DB:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Table) arguments.get(1), (Column) arguments.get(2),
					(DB) arguments.get(3));
			return null;
		case RulesPackage.SELFASSOC2COLUMN___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABLE_COLUMN_DB:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Table) arguments.get(1),
					(Column) arguments.get(2), (DB) arguments.get(3));
		case RulesPackage.SELFASSOC2COLUMN___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SELFASSOC2COLUMN___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TABLE_CLAZZ_C2T_CD2D_COLUMN_DB_CLASSDIAGRAM:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Table) arguments.get(1),
					(Clazz) arguments.get(2), (C2T) arguments.get(3), (CD2D) arguments.get(4),
					(Column) arguments.get(5), (DB) arguments.get(6), (ClassDiagram) arguments.get(7));
		case RulesPackage.SELFASSOC2COLUMN___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SELFASSOC2COLUMN___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.SELFASSOC2COLUMN___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SELFASSOC2COLUMN___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_1((EMoflonEdge) arguments.get(0));
		case RulesPackage.SELFASSOC2COLUMN___IS_APPROPRIATE_FWD_EMOFLON_EDGE_2__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_2((EMoflonEdge) arguments.get(0));
		case RulesPackage.SELFASSOC2COLUMN___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SELFASSOC2COLUMN___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.SELFASSOC2COLUMN___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.SELFASSOC2COLUMN___IS_APPLICABLE_SOLVE_CSP_CC__TABLE_CLAZZ_ASSOCIATION_COLUMN_DB_CLASSDIAGRAM_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Table) arguments.get(0), (Clazz) arguments.get(1),
					(Association) arguments.get(2), (Column) arguments.get(3), (DB) arguments.get(4),
					(ClassDiagram) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.SELFASSOC2COLUMN___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.SELFASSOC2COLUMN___CHECK_DEC_FWD__CLAZZ_ASSOCIATION_CLASSDIAGRAM:
			return checkDEC_FWD((Clazz) arguments.get(0), (Association) arguments.get(1),
					(ClassDiagram) arguments.get(2));
		case RulesPackage.SELFASSOC2COLUMN___CHECK_DEC_BWD__TABLE_COLUMN_DB:
			return checkDEC_BWD((Table) arguments.get(0), (Column) arguments.get(1), (DB) arguments.get(2));
		case RulesPackage.SELFASSOC2COLUMN___GENERATE_MODEL__RULEENTRYCONTAINER_C2T:
			return generateModel((RuleEntryContainer) arguments.get(0), (C2T) arguments.get(1));
		case RulesPackage.SELFASSOC2COLUMN___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TABLE_CLAZZ_C2T_CD2D_DB_CLASSDIAGRAM_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Table) arguments.get(1),
					(Clazz) arguments.get(2), (C2T) arguments.get(3), (CD2D) arguments.get(4), (DB) arguments.get(5),
					(ClassDiagram) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.SELFASSOC2COLUMN___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_selfassoc2column_0_1_initialbindings_blackBBBBB(selfassoc2column _this,
			Match match, Clazz c, Association sas, ClassDiagram cd) {
		return new Object[] { _this, match, c, sas, cd };
	}

	public static final Object[] pattern_selfassoc2column_0_2_SolveCSP_bindingFBBBBB(selfassoc2column _this,
			Match match, Clazz c, Association sas, ClassDiagram cd) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, c, sas, cd);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, c, sas, cd };
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_selfassoc2column_0_2_SolveCSP_bindingAndBlackFBBBBB(selfassoc2column _this,
			Match match, Clazz c, Association sas, ClassDiagram cd) {
		Object[] result_pattern_selfassoc2column_0_2_SolveCSP_binding = pattern_selfassoc2column_0_2_SolveCSP_bindingFBBBBB(
				_this, match, c, sas, cd);
		if (result_pattern_selfassoc2column_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_selfassoc2column_0_2_SolveCSP_binding[0];

			Object[] result_pattern_selfassoc2column_0_2_SolveCSP_black = pattern_selfassoc2column_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_selfassoc2column_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, c, sas, cd };
			}
		}
		return null;
	}

	public static final boolean pattern_selfassoc2column_0_3_CheckCSP_expressionFBB(selfassoc2column _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_selfassoc2column_0_4_collectelementstobetranslated_blackBBBB(Match match,
			Clazz c, Association sas, ClassDiagram cd) {
		return new Object[] { match, c, sas, cd };
	}

	public static final Object[] pattern_selfassoc2column_0_4_collectelementstobetranslated_greenBBBBFFF(Match match,
			Clazz c, Association sas, ClassDiagram cd) {
		EMoflonEdge sas__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sas__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd__sas____associations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(sas);
		String sas__c____source_name_prime = "source";
		String sas__c____target_name_prime = "target";
		String cd__sas____associations_name_prime = "associations";
		sas__c____source.setSrc(sas);
		sas__c____source.setTrg(c);
		match.getToBeTranslatedEdges().add(sas__c____source);
		sas__c____target.setSrc(sas);
		sas__c____target.setTrg(c);
		match.getToBeTranslatedEdges().add(sas__c____target);
		cd__sas____associations.setSrc(cd);
		cd__sas____associations.setTrg(sas);
		match.getToBeTranslatedEdges().add(cd__sas____associations);
		sas__c____source.setName(sas__c____source_name_prime);
		sas__c____target.setName(sas__c____target_name_prime);
		cd__sas____associations.setName(cd__sas____associations_name_prime);
		return new Object[] { match, c, sas, cd, sas__c____source, sas__c____target, cd__sas____associations };
	}

	public static final Object[] pattern_selfassoc2column_0_5_collectcontextelements_blackBBBB(Match match, Clazz c,
			Association sas, ClassDiagram cd) {
		return new Object[] { match, c, sas, cd };
	}

	public static final Object[] pattern_selfassoc2column_0_5_collectcontextelements_greenBBBF(Match match, Clazz c,
			ClassDiagram cd) {
		EMoflonEdge cd__c____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(c);
		match.getContextNodes().add(cd);
		String cd__c____classes_name_prime = "classes";
		cd__c____classes.setSrc(cd);
		cd__c____classes.setTrg(c);
		match.getContextEdges().add(cd__c____classes);
		cd__c____classes.setName(cd__c____classes_name_prime);
		return new Object[] { match, c, cd, cd__c____classes };
	}

	public static final void pattern_selfassoc2column_0_6_registerobjectstomatch_expressionBBBBB(selfassoc2column _this,
			Match match, Clazz c, Association sas, ClassDiagram cd) {
		_this.registerObjectsToMatch_FWD(match, c, sas, cd);

	}

	public static final boolean pattern_selfassoc2column_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_selfassoc2column_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_selfassoc2column_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("t");
		EObject _localVariable_1 = isApplicableMatch.getObject("c");
		EObject _localVariable_2 = isApplicableMatch.getObject("c2t");
		EObject _localVariable_3 = isApplicableMatch.getObject("sas");
		EObject _localVariable_4 = isApplicableMatch.getObject("cd2db");
		EObject _localVariable_5 = isApplicableMatch.getObject("db");
		EObject _localVariable_6 = isApplicableMatch.getObject("cd");
		EObject tmpT = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpC2t = _localVariable_2;
		EObject tmpSas = _localVariable_3;
		EObject tmpCd2db = _localVariable_4;
		EObject tmpDb = _localVariable_5;
		EObject tmpCd = _localVariable_6;
		if (tmpT instanceof Table) {
			Table t = (Table) tmpT;
			if (tmpC instanceof Clazz) {
				Clazz c = (Clazz) tmpC;
				if (tmpC2t instanceof C2T) {
					C2T c2t = (C2T) tmpC2t;
					if (tmpSas instanceof Association) {
						Association sas = (Association) tmpSas;
						if (tmpCd2db instanceof CD2D) {
							CD2D cd2db = (CD2D) tmpCd2db;
							if (tmpDb instanceof DB) {
								DB db = (DB) tmpDb;
								if (tmpCd instanceof ClassDiagram) {
									ClassDiagram cd = (ClassDiagram) tmpCd;
									return new Object[] { t, c, c2t, sas, cd2db, db, cd, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_1_1_performtransformation_blackBBBBBBBFBB(Table t, Clazz c,
			C2T c2t, Association sas, CD2D cd2db, DB db, ClassDiagram cd, selfassoc2column _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { t, c, c2t, sas, cd2db, db, cd, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			selfassoc2column _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_selfassoc2column_1_1_performtransformation_binding = pattern_selfassoc2column_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_selfassoc2column_1_1_performtransformation_binding != null) {
			Table t = (Table) result_pattern_selfassoc2column_1_1_performtransformation_binding[0];
			Clazz c = (Clazz) result_pattern_selfassoc2column_1_1_performtransformation_binding[1];
			C2T c2t = (C2T) result_pattern_selfassoc2column_1_1_performtransformation_binding[2];
			Association sas = (Association) result_pattern_selfassoc2column_1_1_performtransformation_binding[3];
			CD2D cd2db = (CD2D) result_pattern_selfassoc2column_1_1_performtransformation_binding[4];
			DB db = (DB) result_pattern_selfassoc2column_1_1_performtransformation_binding[5];
			ClassDiagram cd = (ClassDiagram) result_pattern_selfassoc2column_1_1_performtransformation_binding[6];

			Object[] result_pattern_selfassoc2column_1_1_performtransformation_black = pattern_selfassoc2column_1_1_performtransformation_blackBBBBBBBFBB(
					t, c, c2t, sas, cd2db, db, cd, _this, isApplicableMatch);
			if (result_pattern_selfassoc2column_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_selfassoc2column_1_1_performtransformation_black[7];

				return new Object[] { t, c, c2t, sas, cd2db, db, cd, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_1_1_performtransformation_greenBBFF(Table t,
			Association sas) {
		Column fk = DatabaseFactory.eINSTANCE.createColumn();
		AS2C sas2fk = Class2databaseFactory.eINSTANCE.createAS2C();
		t.getColumn().add(fk);
		fk.setReference(t);
		sas2fk.setTarget(fk);
		sas2fk.setSource(sas);
		return new Object[] { t, sas, fk, sas2fk };
	}

	public static final Object[] pattern_selfassoc2column_1_2_collecttranslatedelements_blackBBB(Association sas,
			Column fk, AS2C sas2fk) {
		return new Object[] { sas, fk, sas2fk };
	}

	public static final Object[] pattern_selfassoc2column_1_2_collecttranslatedelements_greenFBBB(Association sas,
			Column fk, AS2C sas2fk) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(sas);
		ruleresult.getCreatedElements().add(fk);
		ruleresult.getCreatedLinkElements().add(sas2fk);
		return new Object[] { ruleresult, sas, fk, sas2fk };
	}

	public static final Object[] pattern_selfassoc2column_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject t, EObject c, EObject c2t, EObject sas, EObject cd2db, EObject fk,
			EObject sas2fk, EObject db, EObject cd) {
		if (!c.equals(t)) {
			if (!c.equals(c2t)) {
				if (!c.equals(sas)) {
					if (!c.equals(cd2db)) {
						if (!c.equals(fk)) {
							if (!c.equals(sas2fk)) {
								if (!c.equals(db)) {
									if (!c.equals(cd)) {
										if (!c2t.equals(t)) {
											if (!c2t.equals(sas)) {
												if (!c2t.equals(cd2db)) {
													if (!c2t.equals(fk)) {
														if (!c2t.equals(sas2fk)) {
															if (!c2t.equals(db)) {
																if (!c2t.equals(cd)) {
																	if (!sas.equals(t)) {
																		if (!sas.equals(sas2fk)) {
																			if (!cd2db.equals(t)) {
																				if (!cd2db.equals(sas)) {
																					if (!cd2db.equals(fk)) {
																						if (!cd2db.equals(sas2fk)) {
																							if (!cd2db.equals(db)) {
																								if (!fk.equals(t)) {
																									if (!fk.equals(
																											sas)) {
																										if (!fk.equals(
																												sas2fk)) {
																											if (!sas2fk
																													.equals(t)) {
																												if (!db.equals(
																														t)) {
																													if (!db.equals(
																															sas)) {
																														if (!db.equals(
																																fk)) {
																															if (!db.equals(
																																	sas2fk)) {
																																if (!cd.equals(
																																		t)) {
																																	if (!cd.equals(
																																			sas)) {
																																		if (!cd.equals(
																																				cd2db)) {
																																			if (!cd.equals(
																																					fk)) {
																																				if (!cd.equals(
																																						sas2fk)) {
																																					if (!cd.equals(
																																							db)) {
																																						return new Object[] {
																																								ruleresult,
																																								t,
																																								c,
																																								c2t,
																																								sas,
																																								cd2db,
																																								fk,
																																								sas2fk,
																																								db,
																																								cd };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_selfassoc2column_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject t, EObject c, EObject sas, EObject fk, EObject sas2fk, EObject cd) {
		EMoflonEdge t__fk____column = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sas__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sas__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sas2fk__fk____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sas2fk__sas____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fk__t____reference = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd__sas____associations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "selfassoc2column";
		String t__fk____column_name_prime = "column";
		String sas__c____source_name_prime = "source";
		String sas__c____target_name_prime = "target";
		String sas2fk__fk____target_name_prime = "target";
		String sas2fk__sas____source_name_prime = "source";
		String fk__t____reference_name_prime = "reference";
		String cd__sas____associations_name_prime = "associations";
		t__fk____column.setSrc(t);
		t__fk____column.setTrg(fk);
		ruleresult.getCreatedEdges().add(t__fk____column);
		sas__c____source.setSrc(sas);
		sas__c____source.setTrg(c);
		ruleresult.getTranslatedEdges().add(sas__c____source);
		sas__c____target.setSrc(sas);
		sas__c____target.setTrg(c);
		ruleresult.getTranslatedEdges().add(sas__c____target);
		sas2fk__fk____target.setSrc(sas2fk);
		sas2fk__fk____target.setTrg(fk);
		ruleresult.getCreatedEdges().add(sas2fk__fk____target);
		sas2fk__sas____source.setSrc(sas2fk);
		sas2fk__sas____source.setTrg(sas);
		ruleresult.getCreatedEdges().add(sas2fk__sas____source);
		fk__t____reference.setSrc(fk);
		fk__t____reference.setTrg(t);
		ruleresult.getCreatedEdges().add(fk__t____reference);
		cd__sas____associations.setSrc(cd);
		cd__sas____associations.setTrg(sas);
		ruleresult.getTranslatedEdges().add(cd__sas____associations);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		t__fk____column.setName(t__fk____column_name_prime);
		sas__c____source.setName(sas__c____source_name_prime);
		sas__c____target.setName(sas__c____target_name_prime);
		sas2fk__fk____target.setName(sas2fk__fk____target_name_prime);
		sas2fk__sas____source.setName(sas2fk__sas____source_name_prime);
		fk__t____reference.setName(fk__t____reference_name_prime);
		cd__sas____associations.setName(cd__sas____associations_name_prime);
		return new Object[] { ruleresult, t, c, sas, fk, sas2fk, cd, t__fk____column, sas__c____source,
				sas__c____target, sas2fk__fk____target, sas2fk__sas____source, fk__t____reference,
				cd__sas____associations };
	}

	public static final void pattern_selfassoc2column_1_5_registerobjects_expressionBBBBBBBBBBB(selfassoc2column _this,
			PerformRuleResult ruleresult, EObject t, EObject c, EObject c2t, EObject sas, EObject cd2db, EObject fk,
			EObject sas2fk, EObject db, EObject cd) {
		_this.registerObjects_FWD(ruleresult, t, c, c2t, sas, cd2db, fk, sas2fk, db, cd);

	}

	public static final PerformRuleResult pattern_selfassoc2column_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_selfassoc2column_2_1_preparereturnvalue_bindingFB(selfassoc2column _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_2_1_preparereturnvalue_blackFBB(EClass eClass,
			selfassoc2column _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_2_1_preparereturnvalue_bindingAndBlackFFB(
			selfassoc2column _this) {
		Object[] result_pattern_selfassoc2column_2_1_preparereturnvalue_binding = pattern_selfassoc2column_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_selfassoc2column_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_selfassoc2column_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_selfassoc2column_2_1_preparereturnvalue_black = pattern_selfassoc2column_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_selfassoc2column_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_selfassoc2column_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "selfassoc2column";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_selfassoc2column_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("c");
		EObject _localVariable_1 = match.getObject("sas");
		EObject _localVariable_2 = match.getObject("cd");
		EObject tmpC = _localVariable_0;
		EObject tmpSas = _localVariable_1;
		EObject tmpCd = _localVariable_2;
		if (tmpC instanceof Clazz) {
			Clazz c = (Clazz) tmpC;
			if (tmpSas instanceof Association) {
				Association sas = (Association) tmpSas;
				if (tmpCd instanceof ClassDiagram) {
					ClassDiagram cd = (ClassDiagram) tmpCd;
					return new Object[] { c, sas, cd, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_selfassoc2column_2_2_corematch_blackFBFBFFBB(Clazz c,
			Association sas, ClassDiagram cd, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (C2T c2t : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, C2T.class, "source")) {
			Table t = c2t.getTarget();
			if (t != null) {
				for (CD2D cd2db : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(cd, CD2D.class,
						"source")) {
					DB db = cd2db.getTarget();
					if (db != null) {
						_result.add(new Object[] { t, c, c2t, sas, cd2db, db, cd, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_selfassoc2column_2_3_findcontext_blackBBBBBBB(Table t, Clazz c,
			C2T c2t, Association sas, CD2D cd2db, DB db, ClassDiagram cd) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (c.equals(c2t.getSource())) {
			if (t.equals(c2t.getTarget())) {
				if (c.equals(sas.getSource())) {
					if (c.equals(sas.getTarget())) {
						if (db.equals(cd2db.getTarget())) {
							if (cd.getAssociations().contains(sas)) {
								if (cd.getClasses().contains(c)) {
									if (db.getTable().contains(t)) {
										if (cd.equals(cd2db.getSource())) {
											_result.add(new Object[] { t, c, c2t, sas, cd2db, db, cd });
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

	public static final Object[] pattern_selfassoc2column_2_3_findcontext_greenBBBBBBBFFFFFFFFFF(Table t, Clazz c,
			C2T c2t, Association sas, CD2D cd2db, DB db, ClassDiagram cd) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c2t__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2t__t____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sas__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sas__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2db__db____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd__sas____associations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd__c____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge db__t____table = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2db__cd____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c2t__c____source_name_prime = "source";
		String c2t__t____target_name_prime = "target";
		String sas__c____source_name_prime = "source";
		String sas__c____target_name_prime = "target";
		String cd2db__db____target_name_prime = "target";
		String cd__sas____associations_name_prime = "associations";
		String cd__c____classes_name_prime = "classes";
		String db__t____table_name_prime = "table";
		String cd2db__cd____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(t);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(c2t);
		isApplicableMatch.getAllContextElements().add(sas);
		isApplicableMatch.getAllContextElements().add(cd2db);
		isApplicableMatch.getAllContextElements().add(db);
		isApplicableMatch.getAllContextElements().add(cd);
		c2t__c____source.setSrc(c2t);
		c2t__c____source.setTrg(c);
		isApplicableMatch.getAllContextElements().add(c2t__c____source);
		c2t__t____target.setSrc(c2t);
		c2t__t____target.setTrg(t);
		isApplicableMatch.getAllContextElements().add(c2t__t____target);
		sas__c____source.setSrc(sas);
		sas__c____source.setTrg(c);
		isApplicableMatch.getAllContextElements().add(sas__c____source);
		sas__c____target.setSrc(sas);
		sas__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(sas__c____target);
		cd2db__db____target.setSrc(cd2db);
		cd2db__db____target.setTrg(db);
		isApplicableMatch.getAllContextElements().add(cd2db__db____target);
		cd__sas____associations.setSrc(cd);
		cd__sas____associations.setTrg(sas);
		isApplicableMatch.getAllContextElements().add(cd__sas____associations);
		cd__c____classes.setSrc(cd);
		cd__c____classes.setTrg(c);
		isApplicableMatch.getAllContextElements().add(cd__c____classes);
		db__t____table.setSrc(db);
		db__t____table.setTrg(t);
		isApplicableMatch.getAllContextElements().add(db__t____table);
		cd2db__cd____source.setSrc(cd2db);
		cd2db__cd____source.setTrg(cd);
		isApplicableMatch.getAllContextElements().add(cd2db__cd____source);
		c2t__c____source.setName(c2t__c____source_name_prime);
		c2t__t____target.setName(c2t__t____target_name_prime);
		sas__c____source.setName(sas__c____source_name_prime);
		sas__c____target.setName(sas__c____target_name_prime);
		cd2db__db____target.setName(cd2db__db____target_name_prime);
		cd__sas____associations.setName(cd__sas____associations_name_prime);
		cd__c____classes.setName(cd__c____classes_name_prime);
		db__t____table.setName(db__t____table_name_prime);
		cd2db__cd____source.setName(cd2db__cd____source_name_prime);
		return new Object[] { t, c, c2t, sas, cd2db, db, cd, isApplicableMatch, c2t__c____source, c2t__t____target,
				sas__c____source, sas__c____target, cd2db__db____target, cd__sas____associations, cd__c____classes,
				db__t____table, cd2db__cd____source };
	}

	public static final Object[] pattern_selfassoc2column_2_4_solveCSP_bindingFBBBBBBBBB(selfassoc2column _this,
			IsApplicableMatch isApplicableMatch, Table t, Clazz c, C2T c2t, Association sas, CD2D cd2db, DB db,
			ClassDiagram cd) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, t, c, c2t, sas, cd2db, db, cd);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, t, c, c2t, sas, cd2db, db, cd };
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_selfassoc2column_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(selfassoc2column _this,
			IsApplicableMatch isApplicableMatch, Table t, Clazz c, C2T c2t, Association sas, CD2D cd2db, DB db,
			ClassDiagram cd) {
		Object[] result_pattern_selfassoc2column_2_4_solveCSP_binding = pattern_selfassoc2column_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, t, c, c2t, sas, cd2db, db, cd);
		if (result_pattern_selfassoc2column_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_selfassoc2column_2_4_solveCSP_binding[0];

			Object[] result_pattern_selfassoc2column_2_4_solveCSP_black = pattern_selfassoc2column_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_selfassoc2column_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, t, c, c2t, sas, cd2db, db, cd };
			}
		}
		return null;
	}

	public static final boolean pattern_selfassoc2column_2_5_checkCSP_expressionFBB(selfassoc2column _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_selfassoc2column_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_selfassoc2column_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "selfassoc2column";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_selfassoc2column_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_selfassoc2column_10_1_initialbindings_blackBBBBB(selfassoc2column _this,
			Match match, Table t, Column fk, DB db) {
		return new Object[] { _this, match, t, fk, db };
	}

	public static final Object[] pattern_selfassoc2column_10_2_SolveCSP_bindingFBBBBB(selfassoc2column _this,
			Match match, Table t, Column fk, DB db) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, t, fk, db);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, t, fk, db };
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_selfassoc2column_10_2_SolveCSP_bindingAndBlackFBBBBB(selfassoc2column _this,
			Match match, Table t, Column fk, DB db) {
		Object[] result_pattern_selfassoc2column_10_2_SolveCSP_binding = pattern_selfassoc2column_10_2_SolveCSP_bindingFBBBBB(
				_this, match, t, fk, db);
		if (result_pattern_selfassoc2column_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_selfassoc2column_10_2_SolveCSP_binding[0];

			Object[] result_pattern_selfassoc2column_10_2_SolveCSP_black = pattern_selfassoc2column_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_selfassoc2column_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, t, fk, db };
			}
		}
		return null;
	}

	public static final boolean pattern_selfassoc2column_10_3_CheckCSP_expressionFBB(selfassoc2column _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_selfassoc2column_10_4_collectelementstobetranslated_blackBBBB(Match match,
			Table t, Column fk, DB db) {
		return new Object[] { match, t, fk, db };
	}

	public static final Object[] pattern_selfassoc2column_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			Table t, Column fk) {
		EMoflonEdge t__fk____column = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fk__t____reference = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(fk);
		String t__fk____column_name_prime = "column";
		String fk__t____reference_name_prime = "reference";
		t__fk____column.setSrc(t);
		t__fk____column.setTrg(fk);
		match.getToBeTranslatedEdges().add(t__fk____column);
		fk__t____reference.setSrc(fk);
		fk__t____reference.setTrg(t);
		match.getToBeTranslatedEdges().add(fk__t____reference);
		t__fk____column.setName(t__fk____column_name_prime);
		fk__t____reference.setName(fk__t____reference_name_prime);
		return new Object[] { match, t, fk, t__fk____column, fk__t____reference };
	}

	public static final Object[] pattern_selfassoc2column_10_5_collectcontextelements_blackBBBB(Match match, Table t,
			Column fk, DB db) {
		return new Object[] { match, t, fk, db };
	}

	public static final Object[] pattern_selfassoc2column_10_5_collectcontextelements_greenBBBF(Match match, Table t,
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

	public static final void pattern_selfassoc2column_10_6_registerobjectstomatch_expressionBBBBB(
			selfassoc2column _this, Match match, Table t, Column fk, DB db) {
		_this.registerObjectsToMatch_BWD(match, t, fk, db);

	}

	public static final boolean pattern_selfassoc2column_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_selfassoc2column_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_selfassoc2column_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("t");
		EObject _localVariable_1 = isApplicableMatch.getObject("c");
		EObject _localVariable_2 = isApplicableMatch.getObject("c2t");
		EObject _localVariable_3 = isApplicableMatch.getObject("cd2db");
		EObject _localVariable_4 = isApplicableMatch.getObject("fk");
		EObject _localVariable_5 = isApplicableMatch.getObject("db");
		EObject _localVariable_6 = isApplicableMatch.getObject("cd");
		EObject tmpT = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpC2t = _localVariable_2;
		EObject tmpCd2db = _localVariable_3;
		EObject tmpFk = _localVariable_4;
		EObject tmpDb = _localVariable_5;
		EObject tmpCd = _localVariable_6;
		if (tmpT instanceof Table) {
			Table t = (Table) tmpT;
			if (tmpC instanceof Clazz) {
				Clazz c = (Clazz) tmpC;
				if (tmpC2t instanceof C2T) {
					C2T c2t = (C2T) tmpC2t;
					if (tmpCd2db instanceof CD2D) {
						CD2D cd2db = (CD2D) tmpCd2db;
						if (tmpFk instanceof Column) {
							Column fk = (Column) tmpFk;
							if (tmpDb instanceof DB) {
								DB db = (DB) tmpDb;
								if (tmpCd instanceof ClassDiagram) {
									ClassDiagram cd = (ClassDiagram) tmpCd;
									return new Object[] { t, c, c2t, cd2db, fk, db, cd, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_11_1_performtransformation_blackBBBBBBBFBB(Table t, Clazz c,
			C2T c2t, CD2D cd2db, Column fk, DB db, ClassDiagram cd, selfassoc2column _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { t, c, c2t, cd2db, fk, db, cd, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			selfassoc2column _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_selfassoc2column_11_1_performtransformation_binding = pattern_selfassoc2column_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_selfassoc2column_11_1_performtransformation_binding != null) {
			Table t = (Table) result_pattern_selfassoc2column_11_1_performtransformation_binding[0];
			Clazz c = (Clazz) result_pattern_selfassoc2column_11_1_performtransformation_binding[1];
			C2T c2t = (C2T) result_pattern_selfassoc2column_11_1_performtransformation_binding[2];
			CD2D cd2db = (CD2D) result_pattern_selfassoc2column_11_1_performtransformation_binding[3];
			Column fk = (Column) result_pattern_selfassoc2column_11_1_performtransformation_binding[4];
			DB db = (DB) result_pattern_selfassoc2column_11_1_performtransformation_binding[5];
			ClassDiagram cd = (ClassDiagram) result_pattern_selfassoc2column_11_1_performtransformation_binding[6];

			Object[] result_pattern_selfassoc2column_11_1_performtransformation_black = pattern_selfassoc2column_11_1_performtransformation_blackBBBBBBBFBB(
					t, c, c2t, cd2db, fk, db, cd, _this, isApplicableMatch);
			if (result_pattern_selfassoc2column_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_selfassoc2column_11_1_performtransformation_black[7];

				return new Object[] { t, c, c2t, cd2db, fk, db, cd, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_11_1_performtransformation_greenBFBFB(Clazz c, Column fk,
			ClassDiagram cd) {
		Association sas = ClassFactory.eINSTANCE.createAssociation();
		AS2C sas2fk = Class2databaseFactory.eINSTANCE.createAS2C();
		sas.setSource(c);
		sas.setTarget(c);
		cd.getAssociations().add(sas);
		sas2fk.setTarget(fk);
		sas2fk.setSource(sas);
		return new Object[] { c, sas, fk, sas2fk, cd };
	}

	public static final Object[] pattern_selfassoc2column_11_2_collecttranslatedelements_blackBBB(Association sas,
			Column fk, AS2C sas2fk) {
		return new Object[] { sas, fk, sas2fk };
	}

	public static final Object[] pattern_selfassoc2column_11_2_collecttranslatedelements_greenFBBB(Association sas,
			Column fk, AS2C sas2fk) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(sas);
		ruleresult.getTranslatedElements().add(fk);
		ruleresult.getCreatedLinkElements().add(sas2fk);
		return new Object[] { ruleresult, sas, fk, sas2fk };
	}

	public static final Object[] pattern_selfassoc2column_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject t, EObject c, EObject c2t, EObject sas, EObject cd2db, EObject fk,
			EObject sas2fk, EObject db, EObject cd) {
		if (!c.equals(t)) {
			if (!c.equals(c2t)) {
				if (!c.equals(sas)) {
					if (!c.equals(cd2db)) {
						if (!c.equals(fk)) {
							if (!c.equals(sas2fk)) {
								if (!c.equals(db)) {
									if (!c.equals(cd)) {
										if (!c2t.equals(t)) {
											if (!c2t.equals(sas)) {
												if (!c2t.equals(cd2db)) {
													if (!c2t.equals(fk)) {
														if (!c2t.equals(sas2fk)) {
															if (!c2t.equals(db)) {
																if (!c2t.equals(cd)) {
																	if (!sas.equals(t)) {
																		if (!sas.equals(sas2fk)) {
																			if (!cd2db.equals(t)) {
																				if (!cd2db.equals(sas)) {
																					if (!cd2db.equals(fk)) {
																						if (!cd2db.equals(sas2fk)) {
																							if (!cd2db.equals(db)) {
																								if (!fk.equals(t)) {
																									if (!fk.equals(
																											sas)) {
																										if (!fk.equals(
																												sas2fk)) {
																											if (!sas2fk
																													.equals(t)) {
																												if (!db.equals(
																														t)) {
																													if (!db.equals(
																															sas)) {
																														if (!db.equals(
																																fk)) {
																															if (!db.equals(
																																	sas2fk)) {
																																if (!cd.equals(
																																		t)) {
																																	if (!cd.equals(
																																			sas)) {
																																		if (!cd.equals(
																																				cd2db)) {
																																			if (!cd.equals(
																																					fk)) {
																																				if (!cd.equals(
																																						sas2fk)) {
																																					if (!cd.equals(
																																							db)) {
																																						return new Object[] {
																																								ruleresult,
																																								t,
																																								c,
																																								c2t,
																																								sas,
																																								cd2db,
																																								fk,
																																								sas2fk,
																																								db,
																																								cd };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_selfassoc2column_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject t, EObject c, EObject sas, EObject fk, EObject sas2fk, EObject cd) {
		EMoflonEdge t__fk____column = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sas__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sas__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sas2fk__fk____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sas2fk__sas____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fk__t____reference = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd__sas____associations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "selfassoc2column";
		String t__fk____column_name_prime = "column";
		String sas__c____source_name_prime = "source";
		String sas__c____target_name_prime = "target";
		String sas2fk__fk____target_name_prime = "target";
		String sas2fk__sas____source_name_prime = "source";
		String fk__t____reference_name_prime = "reference";
		String cd__sas____associations_name_prime = "associations";
		t__fk____column.setSrc(t);
		t__fk____column.setTrg(fk);
		ruleresult.getTranslatedEdges().add(t__fk____column);
		sas__c____source.setSrc(sas);
		sas__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(sas__c____source);
		sas__c____target.setSrc(sas);
		sas__c____target.setTrg(c);
		ruleresult.getCreatedEdges().add(sas__c____target);
		sas2fk__fk____target.setSrc(sas2fk);
		sas2fk__fk____target.setTrg(fk);
		ruleresult.getCreatedEdges().add(sas2fk__fk____target);
		sas2fk__sas____source.setSrc(sas2fk);
		sas2fk__sas____source.setTrg(sas);
		ruleresult.getCreatedEdges().add(sas2fk__sas____source);
		fk__t____reference.setSrc(fk);
		fk__t____reference.setTrg(t);
		ruleresult.getTranslatedEdges().add(fk__t____reference);
		cd__sas____associations.setSrc(cd);
		cd__sas____associations.setTrg(sas);
		ruleresult.getCreatedEdges().add(cd__sas____associations);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		t__fk____column.setName(t__fk____column_name_prime);
		sas__c____source.setName(sas__c____source_name_prime);
		sas__c____target.setName(sas__c____target_name_prime);
		sas2fk__fk____target.setName(sas2fk__fk____target_name_prime);
		sas2fk__sas____source.setName(sas2fk__sas____source_name_prime);
		fk__t____reference.setName(fk__t____reference_name_prime);
		cd__sas____associations.setName(cd__sas____associations_name_prime);
		return new Object[] { ruleresult, t, c, sas, fk, sas2fk, cd, t__fk____column, sas__c____source,
				sas__c____target, sas2fk__fk____target, sas2fk__sas____source, fk__t____reference,
				cd__sas____associations };
	}

	public static final void pattern_selfassoc2column_11_5_registerobjects_expressionBBBBBBBBBBB(selfassoc2column _this,
			PerformRuleResult ruleresult, EObject t, EObject c, EObject c2t, EObject sas, EObject cd2db, EObject fk,
			EObject sas2fk, EObject db, EObject cd) {
		_this.registerObjects_BWD(ruleresult, t, c, c2t, sas, cd2db, fk, sas2fk, db, cd);

	}

	public static final PerformRuleResult pattern_selfassoc2column_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_selfassoc2column_12_1_preparereturnvalue_bindingFB(selfassoc2column _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_12_1_preparereturnvalue_blackFBB(EClass eClass,
			selfassoc2column _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_12_1_preparereturnvalue_bindingAndBlackFFB(
			selfassoc2column _this) {
		Object[] result_pattern_selfassoc2column_12_1_preparereturnvalue_binding = pattern_selfassoc2column_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_selfassoc2column_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_selfassoc2column_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_selfassoc2column_12_1_preparereturnvalue_black = pattern_selfassoc2column_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_selfassoc2column_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_selfassoc2column_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "selfassoc2column";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_selfassoc2column_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("t");
		EObject _localVariable_1 = match.getObject("fk");
		EObject _localVariable_2 = match.getObject("db");
		EObject tmpT = _localVariable_0;
		EObject tmpFk = _localVariable_1;
		EObject tmpDb = _localVariable_2;
		if (tmpT instanceof Table) {
			Table t = (Table) tmpT;
			if (tmpFk instanceof Column) {
				Column fk = (Column) tmpFk;
				if (tmpDb instanceof DB) {
					DB db = (DB) tmpDb;
					return new Object[] { t, fk, db, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_selfassoc2column_12_2_corematch_blackBFFFBBFB(Table t, Column fk,
			DB db, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (C2T c2t : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(t, C2T.class, "target")) {
			Clazz c = c2t.getSource();
			if (c != null) {
				for (CD2D cd2db : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(db, CD2D.class,
						"target")) {
					ClassDiagram cd = cd2db.getSource();
					if (cd != null) {
						_result.add(new Object[] { t, c, c2t, cd2db, fk, db, cd, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_selfassoc2column_12_3_findcontext_blackBBBBBBB(Table t, Clazz c,
			C2T c2t, CD2D cd2db, Column fk, DB db, ClassDiagram cd) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (t.getColumn().contains(fk)) {
			if (c.equals(c2t.getSource())) {
				if (t.equals(c2t.getTarget())) {
					if (db.equals(cd2db.getTarget())) {
						if (t.equals(fk.getReference())) {
							if (cd.getClasses().contains(c)) {
								if (db.getTable().contains(t)) {
									if (cd.equals(cd2db.getSource())) {
										_result.add(new Object[] { t, c, c2t, cd2db, fk, db, cd });
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

	public static final Object[] pattern_selfassoc2column_12_3_findcontext_greenBBBBBBBFFFFFFFFF(Table t, Clazz c,
			C2T c2t, CD2D cd2db, Column fk, DB db, ClassDiagram cd) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge t__fk____column = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2t__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2t__t____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2db__db____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fk__t____reference = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd__c____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge db__t____table = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2db__cd____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String t__fk____column_name_prime = "column";
		String c2t__c____source_name_prime = "source";
		String c2t__t____target_name_prime = "target";
		String cd2db__db____target_name_prime = "target";
		String fk__t____reference_name_prime = "reference";
		String cd__c____classes_name_prime = "classes";
		String db__t____table_name_prime = "table";
		String cd2db__cd____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(t);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(c2t);
		isApplicableMatch.getAllContextElements().add(cd2db);
		isApplicableMatch.getAllContextElements().add(fk);
		isApplicableMatch.getAllContextElements().add(db);
		isApplicableMatch.getAllContextElements().add(cd);
		t__fk____column.setSrc(t);
		t__fk____column.setTrg(fk);
		isApplicableMatch.getAllContextElements().add(t__fk____column);
		c2t__c____source.setSrc(c2t);
		c2t__c____source.setTrg(c);
		isApplicableMatch.getAllContextElements().add(c2t__c____source);
		c2t__t____target.setSrc(c2t);
		c2t__t____target.setTrg(t);
		isApplicableMatch.getAllContextElements().add(c2t__t____target);
		cd2db__db____target.setSrc(cd2db);
		cd2db__db____target.setTrg(db);
		isApplicableMatch.getAllContextElements().add(cd2db__db____target);
		fk__t____reference.setSrc(fk);
		fk__t____reference.setTrg(t);
		isApplicableMatch.getAllContextElements().add(fk__t____reference);
		cd__c____classes.setSrc(cd);
		cd__c____classes.setTrg(c);
		isApplicableMatch.getAllContextElements().add(cd__c____classes);
		db__t____table.setSrc(db);
		db__t____table.setTrg(t);
		isApplicableMatch.getAllContextElements().add(db__t____table);
		cd2db__cd____source.setSrc(cd2db);
		cd2db__cd____source.setTrg(cd);
		isApplicableMatch.getAllContextElements().add(cd2db__cd____source);
		t__fk____column.setName(t__fk____column_name_prime);
		c2t__c____source.setName(c2t__c____source_name_prime);
		c2t__t____target.setName(c2t__t____target_name_prime);
		cd2db__db____target.setName(cd2db__db____target_name_prime);
		fk__t____reference.setName(fk__t____reference_name_prime);
		cd__c____classes.setName(cd__c____classes_name_prime);
		db__t____table.setName(db__t____table_name_prime);
		cd2db__cd____source.setName(cd2db__cd____source_name_prime);
		return new Object[] { t, c, c2t, cd2db, fk, db, cd, isApplicableMatch, t__fk____column, c2t__c____source,
				c2t__t____target, cd2db__db____target, fk__t____reference, cd__c____classes, db__t____table,
				cd2db__cd____source };
	}

	public static final Object[] pattern_selfassoc2column_12_4_solveCSP_bindingFBBBBBBBBB(selfassoc2column _this,
			IsApplicableMatch isApplicableMatch, Table t, Clazz c, C2T c2t, CD2D cd2db, Column fk, DB db,
			ClassDiagram cd) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, t, c, c2t, cd2db, fk, db, cd);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, t, c, c2t, cd2db, fk, db, cd };
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_selfassoc2column_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			selfassoc2column _this, IsApplicableMatch isApplicableMatch, Table t, Clazz c, C2T c2t, CD2D cd2db,
			Column fk, DB db, ClassDiagram cd) {
		Object[] result_pattern_selfassoc2column_12_4_solveCSP_binding = pattern_selfassoc2column_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, t, c, c2t, cd2db, fk, db, cd);
		if (result_pattern_selfassoc2column_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_selfassoc2column_12_4_solveCSP_binding[0];

			Object[] result_pattern_selfassoc2column_12_4_solveCSP_black = pattern_selfassoc2column_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_selfassoc2column_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, t, c, c2t, cd2db, fk, db, cd };
			}
		}
		return null;
	}

	public static final boolean pattern_selfassoc2column_12_5_checkCSP_expressionFBB(selfassoc2column _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_selfassoc2column_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_selfassoc2column_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "selfassoc2column";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_selfassoc2column_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_selfassoc2column_20_1_preparereturnvalue_bindingFB(selfassoc2column _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			selfassoc2column _this) {
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

	public static final Object[] pattern_selfassoc2column_20_1_preparereturnvalue_bindingAndBlackFFBF(
			selfassoc2column _this) {
		Object[] result_pattern_selfassoc2column_20_1_preparereturnvalue_binding = pattern_selfassoc2column_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_selfassoc2column_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_selfassoc2column_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_selfassoc2column_20_1_preparereturnvalue_black = pattern_selfassoc2column_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_selfassoc2column_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_selfassoc2column_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_selfassoc2column_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_selfassoc2column_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_column) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpT = _edge_column.getSrc();
		if (tmpT instanceof Table) {
			Table t = (Table) tmpT;
			EObject tmpFk = _edge_column.getTrg();
			if (tmpFk instanceof Column) {
				Column fk = (Column) tmpFk;
				if (t.getColumn().contains(fk)) {
					if (t.equals(fk.getReference())) {
						for (DB db : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(t, DB.class,
								"table")) {
							_result.add(new Object[] { t, fk, db, _edge_column });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_selfassoc2column_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_selfassoc2column_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			selfassoc2column _this, Match match, Table t, Column fk, DB db) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, t, fk, db);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_selfassoc2column_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			selfassoc2column _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_selfassoc2column_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_selfassoc2column_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_selfassoc2column_21_1_preparereturnvalue_bindingFB(selfassoc2column _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			selfassoc2column _this) {
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

	public static final Object[] pattern_selfassoc2column_21_1_preparereturnvalue_bindingAndBlackFFBF(
			selfassoc2column _this) {
		Object[] result_pattern_selfassoc2column_21_1_preparereturnvalue_binding = pattern_selfassoc2column_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_selfassoc2column_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_selfassoc2column_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_selfassoc2column_21_1_preparereturnvalue_black = pattern_selfassoc2column_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_selfassoc2column_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_selfassoc2column_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_selfassoc2column_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_selfassoc2column_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_source) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSas = _edge_source.getSrc();
		if (tmpSas instanceof Association) {
			Association sas = (Association) tmpSas;
			EObject tmpC = _edge_source.getTrg();
			if (tmpC instanceof Clazz) {
				Clazz c = (Clazz) tmpC;
				if (c.equals(sas.getSource())) {
					if (c.equals(sas.getTarget())) {
						for (ClassDiagram cd : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(sas,
								ClassDiagram.class, "associations")) {
							if (cd.getClasses().contains(c)) {
								_result.add(new Object[] { c, sas, cd, _edge_source });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_selfassoc2column_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_selfassoc2column_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			selfassoc2column _this, Match match, Clazz c, Association sas, ClassDiagram cd) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, c, sas, cd);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_selfassoc2column_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			selfassoc2column _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_selfassoc2column_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_selfassoc2column_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_selfassoc2column_24_1_prepare_blackB(selfassoc2column _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_selfassoc2column_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_selfassoc2column_24_2_matchsrctrgcontext_bindingFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("t");
		EObject _localVariable_1 = sourceMatch.getObject("c");
		EObject _localVariable_2 = sourceMatch.getObject("sas");
		EObject _localVariable_3 = targetMatch.getObject("fk");
		EObject _localVariable_4 = targetMatch.getObject("db");
		EObject _localVariable_5 = sourceMatch.getObject("cd");
		EObject tmpT = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpSas = _localVariable_2;
		EObject tmpFk = _localVariable_3;
		EObject tmpDb = _localVariable_4;
		EObject tmpCd = _localVariable_5;
		if (tmpT instanceof Table) {
			Table t = (Table) tmpT;
			if (tmpC instanceof Clazz) {
				Clazz c = (Clazz) tmpC;
				if (tmpSas instanceof Association) {
					Association sas = (Association) tmpSas;
					if (tmpFk instanceof Column) {
						Column fk = (Column) tmpFk;
						if (tmpDb instanceof DB) {
							DB db = (DB) tmpDb;
							if (tmpCd instanceof ClassDiagram) {
								ClassDiagram cd = (ClassDiagram) tmpCd;
								return new Object[] { t, c, sas, fk, db, cd, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_24_2_matchsrctrgcontext_blackBBBBBBBB(Table t, Clazz c,
			Association sas, Column fk, DB db, ClassDiagram cd, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { t, c, sas, fk, db, cd, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_selfassoc2column_24_2_matchsrctrgcontext_binding = pattern_selfassoc2column_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_selfassoc2column_24_2_matchsrctrgcontext_binding != null) {
			Table t = (Table) result_pattern_selfassoc2column_24_2_matchsrctrgcontext_binding[0];
			Clazz c = (Clazz) result_pattern_selfassoc2column_24_2_matchsrctrgcontext_binding[1];
			Association sas = (Association) result_pattern_selfassoc2column_24_2_matchsrctrgcontext_binding[2];
			Column fk = (Column) result_pattern_selfassoc2column_24_2_matchsrctrgcontext_binding[3];
			DB db = (DB) result_pattern_selfassoc2column_24_2_matchsrctrgcontext_binding[4];
			ClassDiagram cd = (ClassDiagram) result_pattern_selfassoc2column_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_selfassoc2column_24_2_matchsrctrgcontext_black = pattern_selfassoc2column_24_2_matchsrctrgcontext_blackBBBBBBBB(
					t, c, sas, fk, db, cd, sourceMatch, targetMatch);
			if (result_pattern_selfassoc2column_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { t, c, sas, fk, db, cd, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_24_3_solvecsp_bindingFBBBBBBBBB(selfassoc2column _this,
			Table t, Clazz c, Association sas, Column fk, DB db, ClassDiagram cd, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(t, c, sas, fk, db, cd, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, t, c, sas, fk, db, cd, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_selfassoc2column_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			selfassoc2column _this, Table t, Clazz c, Association sas, Column fk, DB db, ClassDiagram cd,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_selfassoc2column_24_3_solvecsp_binding = pattern_selfassoc2column_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, t, c, sas, fk, db, cd, sourceMatch, targetMatch);
		if (result_pattern_selfassoc2column_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_selfassoc2column_24_3_solvecsp_binding[0];

			Object[] result_pattern_selfassoc2column_24_3_solvecsp_black = pattern_selfassoc2column_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_selfassoc2column_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, t, c, sas, fk, db, cd, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_selfassoc2column_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_selfassoc2column_24_5_matchcorrcontext_blackBBFFBBBB(Table t,
			Clazz c, DB db, ClassDiagram cd, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (C2T c2t : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, C2T.class, "source")) {
				if (t.equals(c2t.getTarget())) {
					for (CD2D cd2db : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(db, CD2D.class,
							"target")) {
						if (cd.equals(cd2db.getSource())) {
							_result.add(new Object[] { t, c, c2t, cd2db, db, cd, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_selfassoc2column_24_5_matchcorrcontext_greenBBBBF(C2T c2t, CD2D cd2db,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "selfassoc2column";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(c2t);
		ccMatch.getAllContextElements().add(cd2db);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { c2t, cd2db, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_selfassoc2column_24_6_createcorrespondence_blackBBBBBBB(Table t, Clazz c,
			Association sas, Column fk, DB db, ClassDiagram cd, CCMatch ccMatch) {
		return new Object[] { t, c, sas, fk, db, cd, ccMatch };
	}

	public static final Object[] pattern_selfassoc2column_24_6_createcorrespondence_greenBBFB(Association sas,
			Column fk, CCMatch ccMatch) {
		AS2C sas2fk = Class2databaseFactory.eINSTANCE.createAS2C();
		sas2fk.setTarget(fk);
		sas2fk.setSource(sas);
		ccMatch.getCreateCorr().add(sas2fk);
		return new Object[] { sas, fk, sas2fk, ccMatch };
	}

	public static final Object[] pattern_selfassoc2column_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_selfassoc2column_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "selfassoc2column";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_selfassoc2column_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_selfassoc2column_27_1_matchtggpattern_blackBBB(Clazz c, Association sas,
			ClassDiagram cd) {
		if (c.equals(sas.getSource())) {
			if (c.equals(sas.getTarget())) {
				if (cd.getAssociations().contains(sas)) {
					if (cd.getClasses().contains(c)) {
						return new Object[] { c, sas, cd };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_selfassoc2column_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_selfassoc2column_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_selfassoc2column_28_1_matchtggpattern_blackBBB(Table t, Column fk, DB db) {
		if (t.getColumn().contains(fk)) {
			if (t.equals(fk.getReference())) {
				if (db.getTable().contains(t)) {
					return new Object[] { t, fk, db };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_selfassoc2column_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_selfassoc2column_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_selfassoc2column_29_1_createresult_blackB(selfassoc2column _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_selfassoc2column_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_selfassoc2column_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Table t) {
		if (ruleResult.getTargetObjects().contains(t)) {
			return new Object[] { ruleResult, t };
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, C2T c2t) {
		if (ruleResult.getCorrObjects().contains(c2t)) {
			return new Object[] { ruleResult, c2t };
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Clazz c) {
		if (ruleResult.getSourceObjects().contains(c)) {
			return new Object[] { ruleResult, c };
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, ClassDiagram cd) {
		if (ruleResult.getSourceObjects().contains(cd)) {
			return new Object[] { ruleResult, cd };
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, CD2D cd2db) {
		if (ruleResult.getCorrObjects().contains(cd2db)) {
			return new Object[] { ruleResult, cd2db };
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, DB db) {
		if (ruleResult.getTargetObjects().contains(db)) {
			return new Object[] { ruleResult, db };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_selfassoc2column_29_2_isapplicablecore_blackFFFFFFFBB(
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
							if (pattern_selfassoc2column_29_2_isapplicablecore_black_nac_1BB(ruleResult, c2t) == null) {
								if (pattern_selfassoc2column_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										t) == null) {
									if (pattern_selfassoc2column_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											c) == null) {
										for (DB db : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(t, DB.class, "table")) {
											if (pattern_selfassoc2column_29_2_isapplicablecore_black_nac_5BB(ruleResult,
													db) == null) {
												for (ClassDiagram cd : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(c, ClassDiagram.class, "classes")) {
													if (pattern_selfassoc2column_29_2_isapplicablecore_black_nac_3BB(
															ruleResult, cd) == null) {
														for (CD2D cd2db : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(db, CD2D.class, "target")) {
															if (cd.equals(cd2db.getSource())) {
																if (pattern_selfassoc2column_29_2_isapplicablecore_black_nac_4BB(
																		ruleResult, cd2db) == null) {
																	_result.add(new Object[] { c2tList, t, c2t, c, cd,
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

	public static final Object[] pattern_selfassoc2column_29_3_solveCSP_bindingFBBBBBBBBB(selfassoc2column _this,
			IsApplicableMatch isApplicableMatch, Table t, Clazz c, C2T c2t, CD2D cd2db, DB db, ClassDiagram cd,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, t, c, c2t, cd2db, db, cd,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, t, c, c2t, cd2db, db, cd, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_selfassoc2column_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_selfassoc2column_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			selfassoc2column _this, IsApplicableMatch isApplicableMatch, Table t, Clazz c, C2T c2t, CD2D cd2db, DB db,
			ClassDiagram cd, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_selfassoc2column_29_3_solveCSP_binding = pattern_selfassoc2column_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, t, c, c2t, cd2db, db, cd, ruleResult);
		if (result_pattern_selfassoc2column_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_selfassoc2column_29_3_solveCSP_binding[0];

			Object[] result_pattern_selfassoc2column_29_3_solveCSP_black = pattern_selfassoc2column_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_selfassoc2column_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, t, c, c2t, cd2db, db, cd, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_selfassoc2column_29_4_checkCSP_expressionFBB(selfassoc2column _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_selfassoc2column_29_5_checknacs_blackBBBBBB(Table t, Clazz c, C2T c2t,
			CD2D cd2db, DB db, ClassDiagram cd) {
		return new Object[] { t, c, c2t, cd2db, db, cd };
	}

	public static final Object[] pattern_selfassoc2column_29_6_perform_blackBBBBBBB(Table t, Clazz c, C2T c2t,
			CD2D cd2db, DB db, ClassDiagram cd, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { t, c, c2t, cd2db, db, cd, ruleResult };
	}

	public static final Object[] pattern_selfassoc2column_29_6_perform_greenBBFFFBB(Table t, Clazz c, ClassDiagram cd,
			ModelgeneratorRuleResult ruleResult) {
		Association sas = ClassFactory.eINSTANCE.createAssociation();
		Column fk = DatabaseFactory.eINSTANCE.createColumn();
		AS2C sas2fk = Class2databaseFactory.eINSTANCE.createAS2C();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		sas.setSource(c);
		sas.setTarget(c);
		cd.getAssociations().add(sas);
		ruleResult.getSourceObjects().add(sas);
		t.getColumn().add(fk);
		fk.setReference(t);
		ruleResult.getTargetObjects().add(fk);
		sas2fk.setTarget(fk);
		sas2fk.setSource(sas);
		ruleResult.getCorrObjects().add(sas2fk);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { t, c, sas, fk, sas2fk, cd, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_selfassoc2column_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //selfassoc2columnImpl
