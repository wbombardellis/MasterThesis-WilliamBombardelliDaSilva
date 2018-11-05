/**
 */
package org.wbsilva.bx.class2database.Rules.impl;

import class_.ClassDiagram;
import class_.ClassFactory;

import database.DB;
import database.DatabaseFactory;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.language.modelgenerator.RuleEntryContainer;

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

import org.wbsilva.bx.class2database.CD2D;
import org.wbsilva.bx.class2database.Class2databaseFactory;

import org.wbsilva.bx.class2database.Rules.RulesPackage;
import org.wbsilva.bx.class2database.Rules.cd2db;
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
 * An implementation of the model object '<em><b>cd2db</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class cd2dbImpl extends AbstractRuleImpl implements cd2db {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected cd2dbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getcd2db();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ClassDiagram cd) {

		Object[] result1_black = cd2dbImpl.pattern_cd2db_0_1_initialbindings_blackBBB(this, match, cd);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cd] = " + cd + ".");
		}

		Object[] result2_bindingAndBlack = cd2dbImpl.pattern_cd2db_0_2_SolveCSP_bindingAndBlackFBBB(this, match, cd);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cd] = " + cd + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (cd2dbImpl.pattern_cd2db_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = cd2dbImpl.pattern_cd2db_0_4_collectelementstobetranslated_blackBB(match, cd);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cd] = " + cd + ".");
			}
			cd2dbImpl.pattern_cd2db_0_4_collectelementstobetranslated_greenBB(match, cd);

			Object[] result5_black = cd2dbImpl.pattern_cd2db_0_5_collectcontextelements_blackBB(match, cd);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cd] = " + cd + ".");
			}
			// 
			cd2dbImpl.pattern_cd2db_0_6_registerobjectstomatch_expressionBBB(this, match, cd);
			return cd2dbImpl.pattern_cd2db_0_7_expressionF();
		} else {
			return cd2dbImpl.pattern_cd2db_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = cd2dbImpl.pattern_cd2db_1_1_performtransformation_bindingAndBlackFFBB(this,
				isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ClassDiagram cd = (ClassDiagram) result1_bindingAndBlack[0];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = cd2dbImpl.pattern_cd2db_1_1_performtransformation_greenBFF(cd);
		CD2D cd2db = (CD2D) result1_green[1];
		DB db = (DB) result1_green[2];

		Object[] result2_black = cd2dbImpl.pattern_cd2db_1_2_collecttranslatedelements_blackBBB(cd, cd2db, db);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[cd] = " + cd + ", "
					+ "[cd2db] = " + cd2db + ", " + "[db] = " + db + ".");
		}
		Object[] result2_green = cd2dbImpl.pattern_cd2db_1_2_collecttranslatedelements_greenFBBB(cd, cd2db, db);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = cd2dbImpl.pattern_cd2db_1_3_bookkeepingforedges_blackBBBB(ruleresult, cd, cd2db, db);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[cd] = " + cd + ", " + "[cd2db] = " + cd2db + ", " + "[db] = " + db + ".");
		}
		cd2dbImpl.pattern_cd2db_1_3_bookkeepingforedges_greenBBBBFF(ruleresult, cd, cd2db, db);
		//nothing EMoflonEdge cd2db__cd____source = (EMoflonEdge) result3_green[4];
		//nothing EMoflonEdge cd2db__db____target = (EMoflonEdge) result3_green[5];

		// 
		// 
		cd2dbImpl.pattern_cd2db_1_5_registerobjects_expressionBBBBB(this, ruleresult, cd, cd2db, db);
		return cd2dbImpl.pattern_cd2db_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = cd2dbImpl.pattern_cd2db_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = cd2dbImpl.pattern_cd2db_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = cd2dbImpl.pattern_cd2db_2_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ClassDiagram cd = (ClassDiagram) result2_binding[0];
		for (Object[] result2_black : cd2dbImpl.pattern_cd2db_2_2_corematch_blackBB(cd, match)) {
			// ForEach 
			for (Object[] result3_black : cd2dbImpl.pattern_cd2db_2_3_findcontext_blackB(cd)) {
				Object[] result3_green = cd2dbImpl.pattern_cd2db_2_3_findcontext_greenBF(cd);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = cd2dbImpl.pattern_cd2db_2_4_solveCSP_bindingAndBlackFBBB(this,
						isApplicableMatch, cd);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[cd] = " + cd + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (cd2dbImpl.pattern_cd2db_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = cd2dbImpl.pattern_cd2db_2_6_addmatchtoruleresult_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					cd2dbImpl.pattern_cd2db_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return cd2dbImpl.pattern_cd2db_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ClassDiagram cd) {
		match.registerObject("cd", cd);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ClassDiagram cd) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ClassDiagram cd) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject cd, EObject cd2db, EObject db) {
		ruleresult.registerObject("cd", cd);
		ruleresult.registerObject("cd2db", cd2db);
		ruleresult.registerObject("db", db);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("cd").eClass()).equals("class.ClassDiagram.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, DB db) {

		Object[] result1_black = cd2dbImpl.pattern_cd2db_10_1_initialbindings_blackBBB(this, match, db);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[db] = " + db + ".");
		}

		Object[] result2_bindingAndBlack = cd2dbImpl.pattern_cd2db_10_2_SolveCSP_bindingAndBlackFBBB(this, match, db);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[db] = " + db + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (cd2dbImpl.pattern_cd2db_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = cd2dbImpl.pattern_cd2db_10_4_collectelementstobetranslated_blackBB(match, db);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[db] = " + db + ".");
			}
			cd2dbImpl.pattern_cd2db_10_4_collectelementstobetranslated_greenBB(match, db);

			Object[] result5_black = cd2dbImpl.pattern_cd2db_10_5_collectcontextelements_blackBB(match, db);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[db] = " + db + ".");
			}
			// 
			cd2dbImpl.pattern_cd2db_10_6_registerobjectstomatch_expressionBBB(this, match, db);
			return cd2dbImpl.pattern_cd2db_10_7_expressionF();
		} else {
			return cd2dbImpl.pattern_cd2db_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = cd2dbImpl.pattern_cd2db_11_1_performtransformation_bindingAndBlackFFBB(this,
				isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		DB db = (DB) result1_bindingAndBlack[0];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = cd2dbImpl.pattern_cd2db_11_1_performtransformation_greenFFB(db);
		ClassDiagram cd = (ClassDiagram) result1_green[0];
		CD2D cd2db = (CD2D) result1_green[1];

		Object[] result2_black = cd2dbImpl.pattern_cd2db_11_2_collecttranslatedelements_blackBBB(cd, cd2db, db);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[cd] = " + cd + ", "
					+ "[cd2db] = " + cd2db + ", " + "[db] = " + db + ".");
		}
		Object[] result2_green = cd2dbImpl.pattern_cd2db_11_2_collecttranslatedelements_greenFBBB(cd, cd2db, db);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = cd2dbImpl.pattern_cd2db_11_3_bookkeepingforedges_blackBBBB(ruleresult, cd, cd2db, db);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[cd] = " + cd + ", " + "[cd2db] = " + cd2db + ", " + "[db] = " + db + ".");
		}
		cd2dbImpl.pattern_cd2db_11_3_bookkeepingforedges_greenBBBBFF(ruleresult, cd, cd2db, db);
		//nothing EMoflonEdge cd2db__cd____source = (EMoflonEdge) result3_green[4];
		//nothing EMoflonEdge cd2db__db____target = (EMoflonEdge) result3_green[5];

		// 
		// 
		cd2dbImpl.pattern_cd2db_11_5_registerobjects_expressionBBBBB(this, ruleresult, cd, cd2db, db);
		return cd2dbImpl.pattern_cd2db_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = cd2dbImpl.pattern_cd2db_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = cd2dbImpl.pattern_cd2db_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = cd2dbImpl.pattern_cd2db_12_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		DB db = (DB) result2_binding[0];
		for (Object[] result2_black : cd2dbImpl.pattern_cd2db_12_2_corematch_blackBB(db, match)) {
			// ForEach 
			for (Object[] result3_black : cd2dbImpl.pattern_cd2db_12_3_findcontext_blackB(db)) {
				Object[] result3_green = cd2dbImpl.pattern_cd2db_12_3_findcontext_greenBF(db);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = cd2dbImpl.pattern_cd2db_12_4_solveCSP_bindingAndBlackFBBB(this,
						isApplicableMatch, db);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[db] = " + db + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (cd2dbImpl.pattern_cd2db_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = cd2dbImpl.pattern_cd2db_12_6_addmatchtoruleresult_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					cd2dbImpl.pattern_cd2db_12_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return cd2dbImpl.pattern_cd2db_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, DB db) {
		match.registerObject("db", db);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, DB db) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, DB db) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("db", db);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject cd, EObject cd2db, EObject db) {
		ruleresult.registerObject("cd", cd);
		ruleresult.registerObject("cd2db", cd2db);
		ruleresult.registerObject("db", db);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("db").eClass()).equals("database.DB.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_DB_1(DB db) {

		Object[] result1_bindingAndBlack = cd2dbImpl.pattern_cd2db_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = cd2dbImpl.pattern_cd2db_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : cd2dbImpl.pattern_cd2db_20_2_testcorematchandDECs_blackB(db)) {
			Object[] result2_green = cd2dbImpl.pattern_cd2db_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (cd2dbImpl.pattern_cd2db_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this, match,
					db)) {
				// 
				if (cd2dbImpl.pattern_cd2db_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
						match)) {

					Object[] result5_black = cd2dbImpl.pattern_cd2db_20_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					cd2dbImpl.pattern_cd2db_20_5_Addmatchtoruleresult_greenBBBB(match, __performOperation, __result,
							isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return cd2dbImpl.pattern_cd2db_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_ClassDiagram_1(ClassDiagram cd) {

		Object[] result1_bindingAndBlack = cd2dbImpl.pattern_cd2db_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = cd2dbImpl.pattern_cd2db_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : cd2dbImpl.pattern_cd2db_21_2_testcorematchandDECs_blackB(cd)) {
			Object[] result2_green = cd2dbImpl.pattern_cd2db_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (cd2dbImpl.pattern_cd2db_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this, match,
					cd)) {
				// 
				if (cd2dbImpl.pattern_cd2db_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
						match)) {

					Object[] result5_black = cd2dbImpl.pattern_cd2db_21_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					cd2dbImpl.pattern_cd2db_21_5_Addmatchtoruleresult_greenBBBB(match, __performOperation, __result,
							isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return cd2dbImpl.pattern_cd2db_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("cd2db");
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
		ruleResult.setRule("cd2db");
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

		Object[] result1_black = cd2dbImpl.pattern_cd2db_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = cd2dbImpl.pattern_cd2db_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = cd2dbImpl
				.pattern_cd2db_24_2_matchsrctrgcontext_bindingAndBlackFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		ClassDiagram cd = (ClassDiagram) result2_bindingAndBlack[0];
		DB db = (DB) result2_bindingAndBlack[1];

		Object[] result3_bindingAndBlack = cd2dbImpl.pattern_cd2db_24_3_solvecsp_bindingAndBlackFBBBBB(this, cd, db,
				sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[cd] = " + cd + ", " + "[db] = " + db + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (cd2dbImpl.pattern_cd2db_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : cd2dbImpl.pattern_cd2db_24_5_matchcorrcontext_blackBB(sourceMatch,
					targetMatch)) {
				Object[] result5_green = cd2dbImpl.pattern_cd2db_24_5_matchcorrcontext_greenBBF(sourceMatch,
						targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = cd2dbImpl.pattern_cd2db_24_6_createcorrespondence_blackBBB(cd, db, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[cd] = " + cd + ", "
							+ "[db] = " + db + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				cd2dbImpl.pattern_cd2db_24_6_createcorrespondence_greenBFBB(cd, db, ccMatch);
				//nothing CD2D cd2db = (CD2D) result6_green[1];

				Object[] result7_black = cd2dbImpl.pattern_cd2db_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				cd2dbImpl.pattern_cd2db_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return cd2dbImpl.pattern_cd2db_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(ClassDiagram cd, DB db, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(ClassDiagram cd) {// 
		Object[] result1_black = cd2dbImpl.pattern_cd2db_27_1_matchtggpattern_blackB(cd);
		if (result1_black != null) {
			return cd2dbImpl.pattern_cd2db_27_2_expressionF();
		} else {
			return cd2dbImpl.pattern_cd2db_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(DB db) {// 
		Object[] result1_black = cd2dbImpl.pattern_cd2db_28_1_matchtggpattern_blackB(db);
		if (result1_black != null) {
			return cd2dbImpl.pattern_cd2db_28_2_expressionF();
		} else {
			return cd2dbImpl.pattern_cd2db_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer) {

		Object[] result1_black = cd2dbImpl.pattern_cd2db_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = cd2dbImpl.pattern_cd2db_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// 
		Object[] result2_black = cd2dbImpl.pattern_cd2db_29_2_isapplicablecore_blackB(this);
		if (result2_black != null) {

			Object[] result3_bindingAndBlack = cd2dbImpl.pattern_cd2db_29_3_solveCSP_bindingAndBlackFBBB(this,
					isApplicableMatch, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (cd2dbImpl.pattern_cd2db_29_4_checkCSP_expressionFBB(this, csp)) {
				// 

				Object[] result6_black = cd2dbImpl.pattern_cd2db_29_6_perform_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[ruleResult] = " + ruleResult + ".");
				}
				cd2dbImpl.pattern_cd2db_29_6_perform_greenFFFB(ruleResult);
				//nothing ClassDiagram cd = (ClassDiagram) result6_green[0];
				//nothing CD2D cd2db = (CD2D) result6_green[1];
				//nothing DB db = (DB) result6_green[2];

			} else {
			}

		} else {
		}
		return cd2dbImpl.pattern_cd2db_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
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
		case RulesPackage.CD2DB___IS_APPROPRIATE_FWD__MATCH_CLASSDIAGRAM:
			return isAppropriate_FWD((Match) arguments.get(0), (ClassDiagram) arguments.get(1));
		case RulesPackage.CD2DB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CD2DB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CD2DB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASSDIAGRAM:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ClassDiagram) arguments.get(1));
			return null;
		case RulesPackage.CD2DB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASSDIAGRAM:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ClassDiagram) arguments.get(1));
		case RulesPackage.CD2DB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CD2DB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLASSDIAGRAM:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ClassDiagram) arguments.get(1));
		case RulesPackage.CD2DB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CD2DB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3));
			return null;
		case RulesPackage.CD2DB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CD2DB___IS_APPROPRIATE_BWD__MATCH_DB:
			return isAppropriate_BWD((Match) arguments.get(0), (DB) arguments.get(1));
		case RulesPackage.CD2DB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CD2DB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CD2DB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_DB:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (DB) arguments.get(1));
			return null;
		case RulesPackage.CD2DB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_DB:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (DB) arguments.get(1));
		case RulesPackage.CD2DB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CD2DB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_DB:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (DB) arguments.get(1));
		case RulesPackage.CD2DB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CD2DB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3));
			return null;
		case RulesPackage.CD2DB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CD2DB___IS_APPROPRIATE_BWD_DB_1__DB:
			return isAppropriate_BWD_DB_1((DB) arguments.get(0));
		case RulesPackage.CD2DB___IS_APPROPRIATE_FWD_CLASS_DIAGRAM_1__CLASSDIAGRAM:
			return isAppropriate_FWD_ClassDiagram_1((ClassDiagram) arguments.get(0));
		case RulesPackage.CD2DB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CD2DB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CD2DB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.CD2DB___IS_APPLICABLE_SOLVE_CSP_CC__CLASSDIAGRAM_DB_MATCH_MATCH:
			return isApplicable_solveCsp_CC((ClassDiagram) arguments.get(0), (DB) arguments.get(1),
					(Match) arguments.get(2), (Match) arguments.get(3));
		case RulesPackage.CD2DB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.CD2DB___CHECK_DEC_FWD__CLASSDIAGRAM:
			return checkDEC_FWD((ClassDiagram) arguments.get(0));
		case RulesPackage.CD2DB___CHECK_DEC_BWD__DB:
			return checkDEC_BWD((DB) arguments.get(0));
		case RulesPackage.CD2DB___GENERATE_MODEL__RULEENTRYCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0));
		case RulesPackage.CD2DB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ModelgeneratorRuleResult) arguments.get(1));
		case RulesPackage.CD2DB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_cd2db_0_1_initialbindings_blackBBB(cd2db _this, Match match, ClassDiagram cd) {
		return new Object[] { _this, match, cd };
	}

	public static final Object[] pattern_cd2db_0_2_SolveCSP_bindingFBBB(cd2db _this, Match match, ClassDiagram cd) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, cd);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, cd };
		}
		return null;
	}

	public static final Object[] pattern_cd2db_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_cd2db_0_2_SolveCSP_bindingAndBlackFBBB(cd2db _this, Match match,
			ClassDiagram cd) {
		Object[] result_pattern_cd2db_0_2_SolveCSP_binding = pattern_cd2db_0_2_SolveCSP_bindingFBBB(_this, match, cd);
		if (result_pattern_cd2db_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_cd2db_0_2_SolveCSP_binding[0];

			Object[] result_pattern_cd2db_0_2_SolveCSP_black = pattern_cd2db_0_2_SolveCSP_blackB(csp);
			if (result_pattern_cd2db_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, cd };
			}
		}
		return null;
	}

	public static final boolean pattern_cd2db_0_3_CheckCSP_expressionFBB(cd2db _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_cd2db_0_4_collectelementstobetranslated_blackBB(Match match, ClassDiagram cd) {
		return new Object[] { match, cd };
	}

	public static final Object[] pattern_cd2db_0_4_collectelementstobetranslated_greenBB(Match match, ClassDiagram cd) {
		match.getToBeTranslatedNodes().add(cd);
		return new Object[] { match, cd };
	}

	public static final Object[] pattern_cd2db_0_5_collectcontextelements_blackBB(Match match, ClassDiagram cd) {
		return new Object[] { match, cd };
	}

	public static final void pattern_cd2db_0_6_registerobjectstomatch_expressionBBB(cd2db _this, Match match,
			ClassDiagram cd) {
		_this.registerObjectsToMatch_FWD(match, cd);

	}

	public static final boolean pattern_cd2db_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_cd2db_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_cd2db_1_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("cd");
		EObject tmpCd = _localVariable_0;
		if (tmpCd instanceof ClassDiagram) {
			ClassDiagram cd = (ClassDiagram) tmpCd;
			return new Object[] { cd, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_cd2db_1_1_performtransformation_blackBFBB(ClassDiagram cd, cd2db _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { cd, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_cd2db_1_1_performtransformation_bindingAndBlackFFBB(cd2db _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_cd2db_1_1_performtransformation_binding = pattern_cd2db_1_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_cd2db_1_1_performtransformation_binding != null) {
			ClassDiagram cd = (ClassDiagram) result_pattern_cd2db_1_1_performtransformation_binding[0];

			Object[] result_pattern_cd2db_1_1_performtransformation_black = pattern_cd2db_1_1_performtransformation_blackBFBB(
					cd, _this, isApplicableMatch);
			if (result_pattern_cd2db_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_cd2db_1_1_performtransformation_black[1];

				return new Object[] { cd, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_cd2db_1_1_performtransformation_greenBFF(ClassDiagram cd) {
		CD2D cd2db = Class2databaseFactory.eINSTANCE.createCD2D();
		DB db = DatabaseFactory.eINSTANCE.createDB();
		cd2db.setSource(cd);
		cd2db.setTarget(db);
		return new Object[] { cd, cd2db, db };
	}

	public static final Object[] pattern_cd2db_1_2_collecttranslatedelements_blackBBB(ClassDiagram cd, CD2D cd2db,
			DB db) {
		return new Object[] { cd, cd2db, db };
	}

	public static final Object[] pattern_cd2db_1_2_collecttranslatedelements_greenFBBB(ClassDiagram cd, CD2D cd2db,
			DB db) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(cd);
		ruleresult.getCreatedLinkElements().add(cd2db);
		ruleresult.getCreatedElements().add(db);
		return new Object[] { ruleresult, cd, cd2db, db };
	}

	public static final Object[] pattern_cd2db_1_3_bookkeepingforedges_blackBBBB(PerformRuleResult ruleresult,
			EObject cd, EObject cd2db, EObject db) {
		if (!cd.equals(cd2db)) {
			if (!cd.equals(db)) {
				if (!cd2db.equals(db)) {
					return new Object[] { ruleresult, cd, cd2db, db };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_cd2db_1_3_bookkeepingforedges_greenBBBBFF(PerformRuleResult ruleresult,
			EObject cd, EObject cd2db, EObject db) {
		EMoflonEdge cd2db__cd____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2db__db____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "cd2db";
		String cd2db__cd____source_name_prime = "source";
		String cd2db__db____target_name_prime = "target";
		cd2db__cd____source.setSrc(cd2db);
		cd2db__cd____source.setTrg(cd);
		ruleresult.getCreatedEdges().add(cd2db__cd____source);
		cd2db__db____target.setSrc(cd2db);
		cd2db__db____target.setTrg(db);
		ruleresult.getCreatedEdges().add(cd2db__db____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		cd2db__cd____source.setName(cd2db__cd____source_name_prime);
		cd2db__db____target.setName(cd2db__db____target_name_prime);
		return new Object[] { ruleresult, cd, cd2db, db, cd2db__cd____source, cd2db__db____target };
	}

	public static final void pattern_cd2db_1_5_registerobjects_expressionBBBBB(cd2db _this,
			PerformRuleResult ruleresult, EObject cd, EObject cd2db, EObject db) {
		_this.registerObjects_FWD(ruleresult, cd, cd2db, db);

	}

	public static final PerformRuleResult pattern_cd2db_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_cd2db_2_1_preparereturnvalue_bindingFB(cd2db _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_cd2db_2_1_preparereturnvalue_blackFBB(EClass eClass, cd2db _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_cd2db_2_1_preparereturnvalue_bindingAndBlackFFB(cd2db _this) {
		Object[] result_pattern_cd2db_2_1_preparereturnvalue_binding = pattern_cd2db_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_cd2db_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_cd2db_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_cd2db_2_1_preparereturnvalue_black = pattern_cd2db_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_cd2db_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_cd2db_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_cd2db_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "cd2db";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_cd2db_2_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("cd");
		EObject tmpCd = _localVariable_0;
		if (tmpCd instanceof ClassDiagram) {
			ClassDiagram cd = (ClassDiagram) tmpCd;
			return new Object[] { cd, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_cd2db_2_2_corematch_blackBB(ClassDiagram cd, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { cd, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_cd2db_2_3_findcontext_blackB(ClassDiagram cd) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { cd });
		return _result;
	}

	public static final Object[] pattern_cd2db_2_3_findcontext_greenBF(ClassDiagram cd) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(cd);
		return new Object[] { cd, isApplicableMatch };
	}

	public static final Object[] pattern_cd2db_2_4_solveCSP_bindingFBBB(cd2db _this,
			IsApplicableMatch isApplicableMatch, ClassDiagram cd) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, cd);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, cd };
		}
		return null;
	}

	public static final Object[] pattern_cd2db_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_cd2db_2_4_solveCSP_bindingAndBlackFBBB(cd2db _this,
			IsApplicableMatch isApplicableMatch, ClassDiagram cd) {
		Object[] result_pattern_cd2db_2_4_solveCSP_binding = pattern_cd2db_2_4_solveCSP_bindingFBBB(_this,
				isApplicableMatch, cd);
		if (result_pattern_cd2db_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_cd2db_2_4_solveCSP_binding[0];

			Object[] result_pattern_cd2db_2_4_solveCSP_black = pattern_cd2db_2_4_solveCSP_blackB(csp);
			if (result_pattern_cd2db_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, cd };
			}
		}
		return null;
	}

	public static final boolean pattern_cd2db_2_5_checkCSP_expressionFBB(cd2db _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_cd2db_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_cd2db_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "cd2db";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_cd2db_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_cd2db_10_1_initialbindings_blackBBB(cd2db _this, Match match, DB db) {
		return new Object[] { _this, match, db };
	}

	public static final Object[] pattern_cd2db_10_2_SolveCSP_bindingFBBB(cd2db _this, Match match, DB db) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, db);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, db };
		}
		return null;
	}

	public static final Object[] pattern_cd2db_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_cd2db_10_2_SolveCSP_bindingAndBlackFBBB(cd2db _this, Match match, DB db) {
		Object[] result_pattern_cd2db_10_2_SolveCSP_binding = pattern_cd2db_10_2_SolveCSP_bindingFBBB(_this, match, db);
		if (result_pattern_cd2db_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_cd2db_10_2_SolveCSP_binding[0];

			Object[] result_pattern_cd2db_10_2_SolveCSP_black = pattern_cd2db_10_2_SolveCSP_blackB(csp);
			if (result_pattern_cd2db_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, db };
			}
		}
		return null;
	}

	public static final boolean pattern_cd2db_10_3_CheckCSP_expressionFBB(cd2db _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_cd2db_10_4_collectelementstobetranslated_blackBB(Match match, DB db) {
		return new Object[] { match, db };
	}

	public static final Object[] pattern_cd2db_10_4_collectelementstobetranslated_greenBB(Match match, DB db) {
		match.getToBeTranslatedNodes().add(db);
		return new Object[] { match, db };
	}

	public static final Object[] pattern_cd2db_10_5_collectcontextelements_blackBB(Match match, DB db) {
		return new Object[] { match, db };
	}

	public static final void pattern_cd2db_10_6_registerobjectstomatch_expressionBBB(cd2db _this, Match match, DB db) {
		_this.registerObjectsToMatch_BWD(match, db);

	}

	public static final boolean pattern_cd2db_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_cd2db_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_cd2db_11_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("db");
		EObject tmpDb = _localVariable_0;
		if (tmpDb instanceof DB) {
			DB db = (DB) tmpDb;
			return new Object[] { db, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_cd2db_11_1_performtransformation_blackBFBB(DB db, cd2db _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { db, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_cd2db_11_1_performtransformation_bindingAndBlackFFBB(cd2db _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_cd2db_11_1_performtransformation_binding = pattern_cd2db_11_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_cd2db_11_1_performtransformation_binding != null) {
			DB db = (DB) result_pattern_cd2db_11_1_performtransformation_binding[0];

			Object[] result_pattern_cd2db_11_1_performtransformation_black = pattern_cd2db_11_1_performtransformation_blackBFBB(
					db, _this, isApplicableMatch);
			if (result_pattern_cd2db_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_cd2db_11_1_performtransformation_black[1];

				return new Object[] { db, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_cd2db_11_1_performtransformation_greenFFB(DB db) {
		ClassDiagram cd = ClassFactory.eINSTANCE.createClassDiagram();
		CD2D cd2db = Class2databaseFactory.eINSTANCE.createCD2D();
		cd2db.setSource(cd);
		cd2db.setTarget(db);
		return new Object[] { cd, cd2db, db };
	}

	public static final Object[] pattern_cd2db_11_2_collecttranslatedelements_blackBBB(ClassDiagram cd, CD2D cd2db,
			DB db) {
		return new Object[] { cd, cd2db, db };
	}

	public static final Object[] pattern_cd2db_11_2_collecttranslatedelements_greenFBBB(ClassDiagram cd, CD2D cd2db,
			DB db) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(cd);
		ruleresult.getCreatedLinkElements().add(cd2db);
		ruleresult.getTranslatedElements().add(db);
		return new Object[] { ruleresult, cd, cd2db, db };
	}

	public static final Object[] pattern_cd2db_11_3_bookkeepingforedges_blackBBBB(PerformRuleResult ruleresult,
			EObject cd, EObject cd2db, EObject db) {
		if (!cd.equals(cd2db)) {
			if (!cd.equals(db)) {
				if (!cd2db.equals(db)) {
					return new Object[] { ruleresult, cd, cd2db, db };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_cd2db_11_3_bookkeepingforedges_greenBBBBFF(PerformRuleResult ruleresult,
			EObject cd, EObject cd2db, EObject db) {
		EMoflonEdge cd2db__cd____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2db__db____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "cd2db";
		String cd2db__cd____source_name_prime = "source";
		String cd2db__db____target_name_prime = "target";
		cd2db__cd____source.setSrc(cd2db);
		cd2db__cd____source.setTrg(cd);
		ruleresult.getCreatedEdges().add(cd2db__cd____source);
		cd2db__db____target.setSrc(cd2db);
		cd2db__db____target.setTrg(db);
		ruleresult.getCreatedEdges().add(cd2db__db____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		cd2db__cd____source.setName(cd2db__cd____source_name_prime);
		cd2db__db____target.setName(cd2db__db____target_name_prime);
		return new Object[] { ruleresult, cd, cd2db, db, cd2db__cd____source, cd2db__db____target };
	}

	public static final void pattern_cd2db_11_5_registerobjects_expressionBBBBB(cd2db _this,
			PerformRuleResult ruleresult, EObject cd, EObject cd2db, EObject db) {
		_this.registerObjects_BWD(ruleresult, cd, cd2db, db);

	}

	public static final PerformRuleResult pattern_cd2db_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_cd2db_12_1_preparereturnvalue_bindingFB(cd2db _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_cd2db_12_1_preparereturnvalue_blackFBB(EClass eClass, cd2db _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_cd2db_12_1_preparereturnvalue_bindingAndBlackFFB(cd2db _this) {
		Object[] result_pattern_cd2db_12_1_preparereturnvalue_binding = pattern_cd2db_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_cd2db_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_cd2db_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_cd2db_12_1_preparereturnvalue_black = pattern_cd2db_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_cd2db_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_cd2db_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_cd2db_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "cd2db";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_cd2db_12_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("db");
		EObject tmpDb = _localVariable_0;
		if (tmpDb instanceof DB) {
			DB db = (DB) tmpDb;
			return new Object[] { db, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_cd2db_12_2_corematch_blackBB(DB db, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { db, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_cd2db_12_3_findcontext_blackB(DB db) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { db });
		return _result;
	}

	public static final Object[] pattern_cd2db_12_3_findcontext_greenBF(DB db) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(db);
		return new Object[] { db, isApplicableMatch };
	}

	public static final Object[] pattern_cd2db_12_4_solveCSP_bindingFBBB(cd2db _this,
			IsApplicableMatch isApplicableMatch, DB db) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, db);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, db };
		}
		return null;
	}

	public static final Object[] pattern_cd2db_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_cd2db_12_4_solveCSP_bindingAndBlackFBBB(cd2db _this,
			IsApplicableMatch isApplicableMatch, DB db) {
		Object[] result_pattern_cd2db_12_4_solveCSP_binding = pattern_cd2db_12_4_solveCSP_bindingFBBB(_this,
				isApplicableMatch, db);
		if (result_pattern_cd2db_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_cd2db_12_4_solveCSP_binding[0];

			Object[] result_pattern_cd2db_12_4_solveCSP_black = pattern_cd2db_12_4_solveCSP_blackB(csp);
			if (result_pattern_cd2db_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, db };
			}
		}
		return null;
	}

	public static final boolean pattern_cd2db_12_5_checkCSP_expressionFBB(cd2db _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_cd2db_12_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_cd2db_12_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "cd2db";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_cd2db_12_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_cd2db_20_1_preparereturnvalue_bindingFB(cd2db _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_cd2db_20_1_preparereturnvalue_blackFBBF(EClass __eClass, cd2db _this) {
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

	public static final Object[] pattern_cd2db_20_1_preparereturnvalue_bindingAndBlackFFBF(cd2db _this) {
		Object[] result_pattern_cd2db_20_1_preparereturnvalue_binding = pattern_cd2db_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_cd2db_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_cd2db_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_cd2db_20_1_preparereturnvalue_black = pattern_cd2db_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_cd2db_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_cd2db_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_cd2db_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_cd2db_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_cd2db_20_2_testcorematchandDECs_blackB(DB db) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { db });
		return _result;
	}

	public static final Object[] pattern_cd2db_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_cd2db_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(cd2db _this,
			Match match, DB db) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, db);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_cd2db_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			cd2db _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_cd2db_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_cd2db_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_cd2db_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_cd2db_21_1_preparereturnvalue_bindingFB(cd2db _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_cd2db_21_1_preparereturnvalue_blackFBBF(EClass __eClass, cd2db _this) {
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

	public static final Object[] pattern_cd2db_21_1_preparereturnvalue_bindingAndBlackFFBF(cd2db _this) {
		Object[] result_pattern_cd2db_21_1_preparereturnvalue_binding = pattern_cd2db_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_cd2db_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_cd2db_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_cd2db_21_1_preparereturnvalue_black = pattern_cd2db_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_cd2db_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_cd2db_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_cd2db_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_cd2db_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_cd2db_21_2_testcorematchandDECs_blackB(ClassDiagram cd) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { cd });
		return _result;
	}

	public static final Object[] pattern_cd2db_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_cd2db_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(cd2db _this,
			Match match, ClassDiagram cd) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, cd);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_cd2db_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			cd2db _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_cd2db_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_cd2db_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_cd2db_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_cd2db_24_1_prepare_blackB(cd2db _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_cd2db_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_cd2db_24_2_matchsrctrgcontext_bindingFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("cd");
		EObject _localVariable_1 = targetMatch.getObject("db");
		EObject tmpCd = _localVariable_0;
		EObject tmpDb = _localVariable_1;
		if (tmpCd instanceof ClassDiagram) {
			ClassDiagram cd = (ClassDiagram) tmpCd;
			if (tmpDb instanceof DB) {
				DB db = (DB) tmpDb;
				return new Object[] { cd, db, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_cd2db_24_2_matchsrctrgcontext_blackBBBB(ClassDiagram cd, DB db,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { cd, db, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_cd2db_24_2_matchsrctrgcontext_bindingAndBlackFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_cd2db_24_2_matchsrctrgcontext_binding = pattern_cd2db_24_2_matchsrctrgcontext_bindingFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_cd2db_24_2_matchsrctrgcontext_binding != null) {
			ClassDiagram cd = (ClassDiagram) result_pattern_cd2db_24_2_matchsrctrgcontext_binding[0];
			DB db = (DB) result_pattern_cd2db_24_2_matchsrctrgcontext_binding[1];

			Object[] result_pattern_cd2db_24_2_matchsrctrgcontext_black = pattern_cd2db_24_2_matchsrctrgcontext_blackBBBB(
					cd, db, sourceMatch, targetMatch);
			if (result_pattern_cd2db_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { cd, db, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_cd2db_24_3_solvecsp_bindingFBBBBB(cd2db _this, ClassDiagram cd, DB db,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_2 = _this.isApplicable_solveCsp_CC(cd, db, sourceMatch, targetMatch);
		CSP csp = _localVariable_2;
		if (csp != null) {
			return new Object[] { csp, _this, cd, db, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_cd2db_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_cd2db_24_3_solvecsp_bindingAndBlackFBBBBB(cd2db _this, ClassDiagram cd, DB db,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_cd2db_24_3_solvecsp_binding = pattern_cd2db_24_3_solvecsp_bindingFBBBBB(_this, cd, db,
				sourceMatch, targetMatch);
		if (result_pattern_cd2db_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_cd2db_24_3_solvecsp_binding[0];

			Object[] result_pattern_cd2db_24_3_solvecsp_black = pattern_cd2db_24_3_solvecsp_blackB(csp);
			if (result_pattern_cd2db_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, cd, db, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_cd2db_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_cd2db_24_5_matchcorrcontext_blackBB(Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_cd2db_24_5_matchcorrcontext_greenBBF(Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "cd2db";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_cd2db_24_6_createcorrespondence_blackBBB(ClassDiagram cd, DB db,
			CCMatch ccMatch) {
		return new Object[] { cd, db, ccMatch };
	}

	public static final Object[] pattern_cd2db_24_6_createcorrespondence_greenBFBB(ClassDiagram cd, DB db,
			CCMatch ccMatch) {
		CD2D cd2db = Class2databaseFactory.eINSTANCE.createCD2D();
		cd2db.setSource(cd);
		cd2db.setTarget(db);
		ccMatch.getCreateCorr().add(cd2db);
		return new Object[] { cd, cd2db, db, ccMatch };
	}

	public static final Object[] pattern_cd2db_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_cd2db_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "cd2db";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_cd2db_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_cd2db_27_1_matchtggpattern_blackB(ClassDiagram cd) {
		return new Object[] { cd };
	}

	public static final boolean pattern_cd2db_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_cd2db_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_cd2db_28_1_matchtggpattern_blackB(DB db) {
		return new Object[] { db };
	}

	public static final boolean pattern_cd2db_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_cd2db_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_cd2db_29_1_createresult_blackB(cd2db _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_cd2db_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_cd2db_29_2_isapplicablecore_blackB(cd2db _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_cd2db_29_3_solveCSP_bindingFBBB(cd2db _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_cd2db_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_cd2db_29_3_solveCSP_bindingAndBlackFBBB(cd2db _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_cd2db_29_3_solveCSP_binding = pattern_cd2db_29_3_solveCSP_bindingFBBB(_this,
				isApplicableMatch, ruleResult);
		if (result_pattern_cd2db_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_cd2db_29_3_solveCSP_binding[0];

			Object[] result_pattern_cd2db_29_3_solveCSP_black = pattern_cd2db_29_3_solveCSP_blackB(csp);
			if (result_pattern_cd2db_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_cd2db_29_4_checkCSP_expressionFBB(cd2db _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_cd2db_29_6_perform_blackB(ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_cd2db_29_6_perform_greenFFFB(ModelgeneratorRuleResult ruleResult) {
		ClassDiagram cd = ClassFactory.eINSTANCE.createClassDiagram();
		CD2D cd2db = Class2databaseFactory.eINSTANCE.createCD2D();
		DB db = DatabaseFactory.eINSTANCE.createDB();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getSourceObjects().add(cd);
		cd2db.setSource(cd);
		ruleResult.getCorrObjects().add(cd2db);
		cd2db.setTarget(db);
		ruleResult.getTargetObjects().add(db);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { cd, cd2db, db, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_cd2db_29_7_expressionFB(ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //cd2dbImpl
