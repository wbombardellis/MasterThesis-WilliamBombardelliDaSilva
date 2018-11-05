/**
 */
package org.wbsilva.bx.class2database.Rules.impl;

import class_.ClassDiagram;
import class_.ClassFactory;
import class_.Clazz;

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

import org.wbsilva.bx.class2database.C2T;
import org.wbsilva.bx.class2database.CD2D;
import org.wbsilva.bx.class2database.Class2databaseFactory;

import org.wbsilva.bx.class2database.Rules.RulesPackage;
import org.wbsilva.bx.class2database.Rules.class2table;
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
 * An implementation of the model object '<em><b>class2table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class class2tableImpl extends AbstractRuleImpl implements class2table {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected class2tableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getclass2table();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Clazz c, ClassDiagram cd) {

		Object[] result1_black = class2tableImpl.pattern_class2table_0_1_initialbindings_blackBBBB(this, match, c, cd);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[cd] = " + cd + ".");
		}

		Object[] result2_bindingAndBlack = class2tableImpl.pattern_class2table_0_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, c, cd);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[cd] = " + cd + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (class2tableImpl.pattern_class2table_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = class2tableImpl
					.pattern_class2table_0_4_collectelementstobetranslated_blackBBB(match, c, cd);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[cd] = " + cd + ".");
			}
			class2tableImpl.pattern_class2table_0_4_collectelementstobetranslated_greenBBBF(match, c, cd);
			//nothing EMoflonEdge cd__c____classes = (EMoflonEdge) result4_green[3];

			Object[] result5_black = class2tableImpl.pattern_class2table_0_5_collectcontextelements_blackBBB(match, c,
					cd);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[cd] = " + cd + ".");
			}
			class2tableImpl.pattern_class2table_0_5_collectcontextelements_greenBB(match, cd);

			// 
			class2tableImpl.pattern_class2table_0_6_registerobjectstomatch_expressionBBBB(this, match, c, cd);
			return class2tableImpl.pattern_class2table_0_7_expressionF();
		} else {
			return class2tableImpl.pattern_class2table_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = class2tableImpl
				.pattern_class2table_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Clazz c = (Clazz) result1_bindingAndBlack[0];
		ClassDiagram cd = (ClassDiagram) result1_bindingAndBlack[1];
		DB db = (DB) result1_bindingAndBlack[2];
		CD2D cd2db = (CD2D) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = class2tableImpl.pattern_class2table_1_1_performtransformation_greenBFFB(c, db);
		C2T c2t = (C2T) result1_green[1];
		Table t = (Table) result1_green[2];

		Object[] result2_black = class2tableImpl.pattern_class2table_1_2_collecttranslatedelements_blackBBB(c, c2t, t);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", " + "[c2t] = "
					+ c2t + ", " + "[t] = " + t + ".");
		}
		Object[] result2_green = class2tableImpl.pattern_class2table_1_2_collecttranslatedelements_greenFBBB(c, c2t, t);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = class2tableImpl.pattern_class2table_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, c,
				cd, c2t, t, db, cd2db);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c] = " + c + ", " + "[cd] = " + cd + ", " + "[c2t] = " + c2t + ", " + "[t] = " + t + ", "
					+ "[db] = " + db + ", " + "[cd2db] = " + cd2db + ".");
		}
		class2tableImpl.pattern_class2table_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, c, cd, c2t, t, db);
		//nothing EMoflonEdge cd__c____classes = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge c2t__c____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge c2t__t____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge db__t____table = (EMoflonEdge) result3_green[9];

		// 
		// 
		class2tableImpl.pattern_class2table_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, c, cd, c2t, t, db,
				cd2db);
		return class2tableImpl.pattern_class2table_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = class2tableImpl
				.pattern_class2table_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = class2tableImpl.pattern_class2table_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = class2tableImpl.pattern_class2table_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Clazz c = (Clazz) result2_binding[0];
		ClassDiagram cd = (ClassDiagram) result2_binding[1];
		for (Object[] result2_black : class2tableImpl.pattern_class2table_2_2_corematch_blackBBFFB(c, cd, match)) {
			DB db = (DB) result2_black[2];
			CD2D cd2db = (CD2D) result2_black[3];
			// ForEach 
			for (Object[] result3_black : class2tableImpl.pattern_class2table_2_3_findcontext_blackBBBB(c, cd, db,
					cd2db)) {
				Object[] result3_green = class2tableImpl.pattern_class2table_2_3_findcontext_greenBBBBFFFF(c, cd, db,
						cd2db);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge cd__c____classes = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge cd2db__cd____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge cd2db__db____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = class2tableImpl
						.pattern_class2table_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, c, cd, db,
								cd2db);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[cd] = " + cd
							+ ", " + "[db] = " + db + ", " + "[cd2db] = " + cd2db + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (class2tableImpl.pattern_class2table_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = class2tableImpl
							.pattern_class2table_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					class2tableImpl.pattern_class2table_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return class2tableImpl.pattern_class2table_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Clazz c, ClassDiagram cd) {
		match.registerObject("c", c);
		match.registerObject("cd", cd);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Clazz c, ClassDiagram cd) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Clazz c, ClassDiagram cd, DB db,
			CD2D cd2db) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("cd", cd);
		isApplicableMatch.registerObject("db", db);
		isApplicableMatch.registerObject("cd2db", cd2db);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject c, EObject cd, EObject c2t, EObject t,
			EObject db, EObject cd2db) {
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("cd", cd);
		ruleresult.registerObject("c2t", c2t);
		ruleresult.registerObject("t", t);
		ruleresult.registerObject("db", db);
		ruleresult.registerObject("cd2db", cd2db);

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

		Object[] result1_black = class2tableImpl.pattern_class2table_10_1_initialbindings_blackBBBB(this, match, t, db);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[t] = " + t + ", " + "[db] = " + db + ".");
		}

		Object[] result2_bindingAndBlack = class2tableImpl.pattern_class2table_10_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, t, db);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[t] = " + t + ", " + "[db] = " + db + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (class2tableImpl.pattern_class2table_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = class2tableImpl
					.pattern_class2table_10_4_collectelementstobetranslated_blackBBB(match, t, db);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[t] = " + t + ", " + "[db] = " + db + ".");
			}
			class2tableImpl.pattern_class2table_10_4_collectelementstobetranslated_greenBBBF(match, t, db);
			//nothing EMoflonEdge db__t____table = (EMoflonEdge) result4_green[3];

			Object[] result5_black = class2tableImpl.pattern_class2table_10_5_collectcontextelements_blackBBB(match, t,
					db);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[t] = " + t + ", " + "[db] = " + db + ".");
			}
			class2tableImpl.pattern_class2table_10_5_collectcontextelements_greenBB(match, db);

			// 
			class2tableImpl.pattern_class2table_10_6_registerobjectstomatch_expressionBBBB(this, match, t, db);
			return class2tableImpl.pattern_class2table_10_7_expressionF();
		} else {
			return class2tableImpl.pattern_class2table_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = class2tableImpl
				.pattern_class2table_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ClassDiagram cd = (ClassDiagram) result1_bindingAndBlack[0];
		Table t = (Table) result1_bindingAndBlack[1];
		DB db = (DB) result1_bindingAndBlack[2];
		CD2D cd2db = (CD2D) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = class2tableImpl.pattern_class2table_11_1_performtransformation_greenFBFB(cd, t);
		Clazz c = (Clazz) result1_green[0];
		C2T c2t = (C2T) result1_green[2];

		Object[] result2_black = class2tableImpl.pattern_class2table_11_2_collecttranslatedelements_blackBBB(c, c2t, t);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", " + "[c2t] = "
					+ c2t + ", " + "[t] = " + t + ".");
		}
		Object[] result2_green = class2tableImpl.pattern_class2table_11_2_collecttranslatedelements_greenFBBB(c, c2t,
				t);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = class2tableImpl.pattern_class2table_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
				c, cd, c2t, t, db, cd2db);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c] = " + c + ", " + "[cd] = " + cd + ", " + "[c2t] = " + c2t + ", " + "[t] = " + t + ", "
					+ "[db] = " + db + ", " + "[cd2db] = " + cd2db + ".");
		}
		class2tableImpl.pattern_class2table_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, c, cd, c2t, t, db);
		//nothing EMoflonEdge cd__c____classes = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge c2t__c____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge c2t__t____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge db__t____table = (EMoflonEdge) result3_green[9];

		// 
		// 
		class2tableImpl.pattern_class2table_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, c, cd, c2t, t, db,
				cd2db);
		return class2tableImpl.pattern_class2table_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = class2tableImpl
				.pattern_class2table_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = class2tableImpl.pattern_class2table_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = class2tableImpl.pattern_class2table_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Table t = (Table) result2_binding[0];
		DB db = (DB) result2_binding[1];
		for (Object[] result2_black : class2tableImpl.pattern_class2table_12_2_corematch_blackFBBFB(t, db, match)) {
			ClassDiagram cd = (ClassDiagram) result2_black[0];
			CD2D cd2db = (CD2D) result2_black[3];
			// ForEach 
			for (Object[] result3_black : class2tableImpl.pattern_class2table_12_3_findcontext_blackBBBB(cd, t, db,
					cd2db)) {
				Object[] result3_green = class2tableImpl.pattern_class2table_12_3_findcontext_greenBBBBFFFF(cd, t, db,
						cd2db);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge db__t____table = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge cd2db__cd____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge cd2db__db____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = class2tableImpl
						.pattern_class2table_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, cd, t, db,
								cd2db);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[cd] = " + cd + ", " + "[t] = " + t
							+ ", " + "[db] = " + db + ", " + "[cd2db] = " + cd2db + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (class2tableImpl.pattern_class2table_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = class2tableImpl
							.pattern_class2table_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					class2tableImpl.pattern_class2table_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return class2tableImpl.pattern_class2table_12_7_expressionFB(ruleresult);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ClassDiagram cd, Table t, DB db,
			CD2D cd2db) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("cd", cd);
		isApplicableMatch.registerObject("t", t);
		isApplicableMatch.registerObject("db", db);
		isApplicableMatch.registerObject("cd2db", cd2db);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject c, EObject cd, EObject c2t, EObject t,
			EObject db, EObject cd2db) {
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("cd", cd);
		ruleresult.registerObject("c2t", c2t);
		ruleresult.registerObject("t", t);
		ruleresult.registerObject("db", db);
		ruleresult.registerObject("cd2db", cd2db);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("t").eClass()).equals("database.Table.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_3(EMoflonEdge _edge_table) {

		Object[] result1_bindingAndBlack = class2tableImpl
				.pattern_class2table_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = class2tableImpl.pattern_class2table_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : class2tableImpl
				.pattern_class2table_20_2_testcorematchandDECs_blackFFB(_edge_table)) {
			Table t = (Table) result2_black[0];
			DB db = (DB) result2_black[1];
			Object[] result2_green = class2tableImpl.pattern_class2table_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (class2tableImpl.pattern_class2table_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, t, db)) {
				// 
				if (class2tableImpl
						.pattern_class2table_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = class2tableImpl.pattern_class2table_20_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					class2tableImpl.pattern_class2table_20_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return class2tableImpl.pattern_class2table_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_4(EMoflonEdge _edge_classes) {

		Object[] result1_bindingAndBlack = class2tableImpl
				.pattern_class2table_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = class2tableImpl.pattern_class2table_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : class2tableImpl
				.pattern_class2table_21_2_testcorematchandDECs_blackFFB(_edge_classes)) {
			Clazz c = (Clazz) result2_black[0];
			ClassDiagram cd = (ClassDiagram) result2_black[1];
			Object[] result2_green = class2tableImpl.pattern_class2table_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (class2tableImpl.pattern_class2table_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, c, cd)) {
				// 
				if (class2tableImpl
						.pattern_class2table_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = class2tableImpl.pattern_class2table_21_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					class2tableImpl.pattern_class2table_21_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return class2tableImpl.pattern_class2table_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("class2table");
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
		ruleResult.setRule("class2table");
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

		Object[] result1_black = class2tableImpl.pattern_class2table_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = class2tableImpl.pattern_class2table_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = class2tableImpl
				.pattern_class2table_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Clazz c = (Clazz) result2_bindingAndBlack[0];
		ClassDiagram cd = (ClassDiagram) result2_bindingAndBlack[1];
		Table t = (Table) result2_bindingAndBlack[2];
		DB db = (DB) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = class2tableImpl.pattern_class2table_24_3_solvecsp_bindingAndBlackFBBBBBBB(
				this, c, cd, t, db, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[c] = " + c + ", " + "[cd] = " + cd + ", " + "[t] = " + t + ", " + "[db] = " + db + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (class2tableImpl.pattern_class2table_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : class2tableImpl.pattern_class2table_24_5_matchcorrcontext_blackBBFBB(cd, db,
					sourceMatch, targetMatch)) {
				CD2D cd2db = (CD2D) result5_black[2];
				Object[] result5_green = class2tableImpl.pattern_class2table_24_5_matchcorrcontext_greenBBBF(cd2db,
						sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = class2tableImpl.pattern_class2table_24_6_createcorrespondence_blackBBBBB(c, cd,
						t, db, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[c] = " + c + ", " + "[cd] = " + cd + ", "
									+ "[t] = " + t + ", " + "[db] = " + db + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				class2tableImpl.pattern_class2table_24_6_createcorrespondence_greenBFBB(c, t, ccMatch);
				//nothing C2T c2t = (C2T) result6_green[1];

				Object[] result7_black = class2tableImpl.pattern_class2table_24_7_addtoreturnedresult_blackBB(result,
						ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				class2tableImpl.pattern_class2table_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return class2tableImpl.pattern_class2table_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Clazz c, ClassDiagram cd, Table t, DB db, Match sourceMatch,
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
	public boolean checkDEC_FWD(Clazz c, ClassDiagram cd) {// 
		Object[] result1_black = class2tableImpl.pattern_class2table_27_1_matchtggpattern_blackBB(c, cd);
		if (result1_black != null) {
			return class2tableImpl.pattern_class2table_27_2_expressionF();
		} else {
			return class2tableImpl.pattern_class2table_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Table t, DB db) {// 
		Object[] result1_black = class2tableImpl.pattern_class2table_28_1_matchtggpattern_blackBB(t, db);
		if (result1_black != null) {
			return class2tableImpl.pattern_class2table_28_2_expressionF();
		} else {
			return class2tableImpl.pattern_class2table_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, CD2D cd2dbParameter) {

		Object[] result1_black = class2tableImpl.pattern_class2table_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = class2tableImpl.pattern_class2table_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : class2tableImpl
				.pattern_class2table_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList cd2dbList = (RuleEntryList) result2_black[0];
			ClassDiagram cd = (ClassDiagram) result2_black[1];
			CD2D cd2db = (CD2D) result2_black[2];
			DB db = (DB) result2_black[3];

			Object[] result3_bindingAndBlack = class2tableImpl.pattern_class2table_29_3_solveCSP_bindingAndBlackFBBBBBB(
					this, isApplicableMatch, cd, db, cd2db, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[cd] = " + cd + ", " + "[db] = " + db
						+ ", " + "[cd2db] = " + cd2db + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (class2tableImpl.pattern_class2table_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = class2tableImpl.pattern_class2table_29_5_checknacs_blackBBB(cd, db, cd2db);
				if (result5_black != null) {

					Object[] result6_black = class2tableImpl.pattern_class2table_29_6_perform_blackBBBB(cd, db, cd2db,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[cd] = " + cd + ", " + "[db] = " + db
										+ ", " + "[cd2db] = " + cd2db + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					class2tableImpl.pattern_class2table_29_6_perform_greenFBFFBB(cd, db, ruleResult);
					//nothing Clazz c = (Clazz) result6_green[0];
					//nothing C2T c2t = (C2T) result6_green[2];
					//nothing Table t = (Table) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return class2tableImpl.pattern_class2table_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ClassDiagram cd, DB db, CD2D cd2db,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("cd", cd);
		isApplicableMatch.registerObject("db", db);
		isApplicableMatch.registerObject("cd2db", cd2db);
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
		case RulesPackage.CLASS2TABLE___IS_APPROPRIATE_FWD__MATCH_CLAZZ_CLASSDIAGRAM:
			return isAppropriate_FWD((Match) arguments.get(0), (Clazz) arguments.get(1),
					(ClassDiagram) arguments.get(2));
		case RulesPackage.CLASS2TABLE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS2TABLE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS2TABLE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLAZZ_CLASSDIAGRAM:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Clazz) arguments.get(1),
					(ClassDiagram) arguments.get(2));
			return null;
		case RulesPackage.CLASS2TABLE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLAZZ_CLASSDIAGRAM:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Clazz) arguments.get(1),
					(ClassDiagram) arguments.get(2));
		case RulesPackage.CLASS2TABLE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS2TABLE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLAZZ_CLASSDIAGRAM_DB_CD2D:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Clazz) arguments.get(1),
					(ClassDiagram) arguments.get(2), (DB) arguments.get(3), (CD2D) arguments.get(4));
		case RulesPackage.CLASS2TABLE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS2TABLE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.CLASS2TABLE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS2TABLE___IS_APPROPRIATE_BWD__MATCH_TABLE_DB:
			return isAppropriate_BWD((Match) arguments.get(0), (Table) arguments.get(1), (DB) arguments.get(2));
		case RulesPackage.CLASS2TABLE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS2TABLE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS2TABLE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABLE_DB:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Table) arguments.get(1), (DB) arguments.get(2));
			return null;
		case RulesPackage.CLASS2TABLE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABLE_DB:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Table) arguments.get(1),
					(DB) arguments.get(2));
		case RulesPackage.CLASS2TABLE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS2TABLE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSDIAGRAM_TABLE_DB_CD2D:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ClassDiagram) arguments.get(1),
					(Table) arguments.get(2), (DB) arguments.get(3), (CD2D) arguments.get(4));
		case RulesPackage.CLASS2TABLE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS2TABLE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.CLASS2TABLE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS2TABLE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_3__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_3((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS2TABLE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_4((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS2TABLE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS2TABLE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS2TABLE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.CLASS2TABLE___IS_APPLICABLE_SOLVE_CSP_CC__CLAZZ_CLASSDIAGRAM_TABLE_DB_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Clazz) arguments.get(0), (ClassDiagram) arguments.get(1),
					(Table) arguments.get(2), (DB) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.CLASS2TABLE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.CLASS2TABLE___CHECK_DEC_FWD__CLAZZ_CLASSDIAGRAM:
			return checkDEC_FWD((Clazz) arguments.get(0), (ClassDiagram) arguments.get(1));
		case RulesPackage.CLASS2TABLE___CHECK_DEC_BWD__TABLE_DB:
			return checkDEC_BWD((Table) arguments.get(0), (DB) arguments.get(1));
		case RulesPackage.CLASS2TABLE___GENERATE_MODEL__RULEENTRYCONTAINER_CD2D:
			return generateModel((RuleEntryContainer) arguments.get(0), (CD2D) arguments.get(1));
		case RulesPackage.CLASS2TABLE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSDIAGRAM_DB_CD2D_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ClassDiagram) arguments.get(1),
					(DB) arguments.get(2), (CD2D) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.CLASS2TABLE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_class2table_0_1_initialbindings_blackBBBB(class2table _this, Match match,
			Clazz c, ClassDiagram cd) {
		return new Object[] { _this, match, c, cd };
	}

	public static final Object[] pattern_class2table_0_2_SolveCSP_bindingFBBBB(class2table _this, Match match, Clazz c,
			ClassDiagram cd) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, c, cd);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, c, cd };
		}
		return null;
	}

	public static final Object[] pattern_class2table_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_class2table_0_2_SolveCSP_bindingAndBlackFBBBB(class2table _this, Match match,
			Clazz c, ClassDiagram cd) {
		Object[] result_pattern_class2table_0_2_SolveCSP_binding = pattern_class2table_0_2_SolveCSP_bindingFBBBB(_this,
				match, c, cd);
		if (result_pattern_class2table_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_class2table_0_2_SolveCSP_binding[0];

			Object[] result_pattern_class2table_0_2_SolveCSP_black = pattern_class2table_0_2_SolveCSP_blackB(csp);
			if (result_pattern_class2table_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, c, cd };
			}
		}
		return null;
	}

	public static final boolean pattern_class2table_0_3_CheckCSP_expressionFBB(class2table _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_class2table_0_4_collectelementstobetranslated_blackBBB(Match match, Clazz c,
			ClassDiagram cd) {
		return new Object[] { match, c, cd };
	}

	public static final Object[] pattern_class2table_0_4_collectelementstobetranslated_greenBBBF(Match match, Clazz c,
			ClassDiagram cd) {
		EMoflonEdge cd__c____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(c);
		String cd__c____classes_name_prime = "classes";
		cd__c____classes.setSrc(cd);
		cd__c____classes.setTrg(c);
		match.getToBeTranslatedEdges().add(cd__c____classes);
		cd__c____classes.setName(cd__c____classes_name_prime);
		return new Object[] { match, c, cd, cd__c____classes };
	}

	public static final Object[] pattern_class2table_0_5_collectcontextelements_blackBBB(Match match, Clazz c,
			ClassDiagram cd) {
		return new Object[] { match, c, cd };
	}

	public static final Object[] pattern_class2table_0_5_collectcontextelements_greenBB(Match match, ClassDiagram cd) {
		match.getContextNodes().add(cd);
		return new Object[] { match, cd };
	}

	public static final void pattern_class2table_0_6_registerobjectstomatch_expressionBBBB(class2table _this,
			Match match, Clazz c, ClassDiagram cd) {
		_this.registerObjectsToMatch_FWD(match, c, cd);

	}

	public static final boolean pattern_class2table_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_class2table_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_class2table_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("c");
		EObject _localVariable_1 = isApplicableMatch.getObject("cd");
		EObject _localVariable_2 = isApplicableMatch.getObject("db");
		EObject _localVariable_3 = isApplicableMatch.getObject("cd2db");
		EObject tmpC = _localVariable_0;
		EObject tmpCd = _localVariable_1;
		EObject tmpDb = _localVariable_2;
		EObject tmpCd2db = _localVariable_3;
		if (tmpC instanceof Clazz) {
			Clazz c = (Clazz) tmpC;
			if (tmpCd instanceof ClassDiagram) {
				ClassDiagram cd = (ClassDiagram) tmpCd;
				if (tmpDb instanceof DB) {
					DB db = (DB) tmpDb;
					if (tmpCd2db instanceof CD2D) {
						CD2D cd2db = (CD2D) tmpCd2db;
						return new Object[] { c, cd, db, cd2db, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_class2table_1_1_performtransformation_blackBBBBFBB(Clazz c, ClassDiagram cd,
			DB db, CD2D cd2db, class2table _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { c, cd, db, cd2db, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_class2table_1_1_performtransformation_bindingAndBlackFFFFFBB(class2table _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_class2table_1_1_performtransformation_binding = pattern_class2table_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_class2table_1_1_performtransformation_binding != null) {
			Clazz c = (Clazz) result_pattern_class2table_1_1_performtransformation_binding[0];
			ClassDiagram cd = (ClassDiagram) result_pattern_class2table_1_1_performtransformation_binding[1];
			DB db = (DB) result_pattern_class2table_1_1_performtransformation_binding[2];
			CD2D cd2db = (CD2D) result_pattern_class2table_1_1_performtransformation_binding[3];

			Object[] result_pattern_class2table_1_1_performtransformation_black = pattern_class2table_1_1_performtransformation_blackBBBBFBB(
					c, cd, db, cd2db, _this, isApplicableMatch);
			if (result_pattern_class2table_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_class2table_1_1_performtransformation_black[4];

				return new Object[] { c, cd, db, cd2db, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_class2table_1_1_performtransformation_greenBFFB(Clazz c, DB db) {
		C2T c2t = Class2databaseFactory.eINSTANCE.createC2T();
		Table t = DatabaseFactory.eINSTANCE.createTable();
		c2t.setSource(c);
		c2t.setTarget(t);
		db.getTable().add(t);
		return new Object[] { c, c2t, t, db };
	}

	public static final Object[] pattern_class2table_1_2_collecttranslatedelements_blackBBB(Clazz c, C2T c2t, Table t) {
		return new Object[] { c, c2t, t };
	}

	public static final Object[] pattern_class2table_1_2_collecttranslatedelements_greenFBBB(Clazz c, C2T c2t,
			Table t) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(c2t);
		ruleresult.getCreatedElements().add(t);
		return new Object[] { ruleresult, c, c2t, t };
	}

	public static final Object[] pattern_class2table_1_3_bookkeepingforedges_blackBBBBBBB(PerformRuleResult ruleresult,
			EObject c, EObject cd, EObject c2t, EObject t, EObject db, EObject cd2db) {
		if (!c.equals(cd)) {
			if (!c.equals(c2t)) {
				if (!c.equals(t)) {
					if (!c.equals(db)) {
						if (!c.equals(cd2db)) {
							if (!cd.equals(t)) {
								if (!cd.equals(db)) {
									if (!cd.equals(cd2db)) {
										if (!c2t.equals(cd)) {
											if (!c2t.equals(t)) {
												if (!c2t.equals(db)) {
													if (!c2t.equals(cd2db)) {
														if (!db.equals(t)) {
															if (!cd2db.equals(t)) {
																if (!cd2db.equals(db)) {
																	return new Object[] { ruleresult, c, cd, c2t, t, db,
																			cd2db };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_class2table_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject c, EObject cd, EObject c2t, EObject t, EObject db) {
		EMoflonEdge cd__c____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2t__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2t__t____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge db__t____table = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "class2table";
		String cd__c____classes_name_prime = "classes";
		String c2t__c____source_name_prime = "source";
		String c2t__t____target_name_prime = "target";
		String db__t____table_name_prime = "table";
		cd__c____classes.setSrc(cd);
		cd__c____classes.setTrg(c);
		ruleresult.getTranslatedEdges().add(cd__c____classes);
		c2t__c____source.setSrc(c2t);
		c2t__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2t__c____source);
		c2t__t____target.setSrc(c2t);
		c2t__t____target.setTrg(t);
		ruleresult.getCreatedEdges().add(c2t__t____target);
		db__t____table.setSrc(db);
		db__t____table.setTrg(t);
		ruleresult.getCreatedEdges().add(db__t____table);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		cd__c____classes.setName(cd__c____classes_name_prime);
		c2t__c____source.setName(c2t__c____source_name_prime);
		c2t__t____target.setName(c2t__t____target_name_prime);
		db__t____table.setName(db__t____table_name_prime);
		return new Object[] { ruleresult, c, cd, c2t, t, db, cd__c____classes, c2t__c____source, c2t__t____target,
				db__t____table };
	}

	public static final void pattern_class2table_1_5_registerobjects_expressionBBBBBBBB(class2table _this,
			PerformRuleResult ruleresult, EObject c, EObject cd, EObject c2t, EObject t, EObject db, EObject cd2db) {
		_this.registerObjects_FWD(ruleresult, c, cd, c2t, t, db, cd2db);

	}

	public static final PerformRuleResult pattern_class2table_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_class2table_2_1_preparereturnvalue_bindingFB(class2table _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_class2table_2_1_preparereturnvalue_blackFBB(EClass eClass, class2table _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_class2table_2_1_preparereturnvalue_bindingAndBlackFFB(class2table _this) {
		Object[] result_pattern_class2table_2_1_preparereturnvalue_binding = pattern_class2table_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_class2table_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_class2table_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_class2table_2_1_preparereturnvalue_black = pattern_class2table_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_class2table_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_class2table_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_class2table_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "class2table";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_class2table_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("c");
		EObject _localVariable_1 = match.getObject("cd");
		EObject tmpC = _localVariable_0;
		EObject tmpCd = _localVariable_1;
		if (tmpC instanceof Clazz) {
			Clazz c = (Clazz) tmpC;
			if (tmpCd instanceof ClassDiagram) {
				ClassDiagram cd = (ClassDiagram) tmpCd;
				return new Object[] { c, cd, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_class2table_2_2_corematch_blackBBFFB(Clazz c, ClassDiagram cd,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (CD2D cd2db : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(cd, CD2D.class,
				"source")) {
			DB db = cd2db.getTarget();
			if (db != null) {
				_result.add(new Object[] { c, cd, db, cd2db, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_class2table_2_3_findcontext_blackBBBB(Clazz c, ClassDiagram cd,
			DB db, CD2D cd2db) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (cd.getClasses().contains(c)) {
			if (cd.equals(cd2db.getSource())) {
				if (db.equals(cd2db.getTarget())) {
					_result.add(new Object[] { c, cd, db, cd2db });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_class2table_2_3_findcontext_greenBBBBFFFF(Clazz c, ClassDiagram cd, DB db,
			CD2D cd2db) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge cd__c____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2db__cd____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2db__db____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String cd__c____classes_name_prime = "classes";
		String cd2db__cd____source_name_prime = "source";
		String cd2db__db____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(cd);
		isApplicableMatch.getAllContextElements().add(db);
		isApplicableMatch.getAllContextElements().add(cd2db);
		cd__c____classes.setSrc(cd);
		cd__c____classes.setTrg(c);
		isApplicableMatch.getAllContextElements().add(cd__c____classes);
		cd2db__cd____source.setSrc(cd2db);
		cd2db__cd____source.setTrg(cd);
		isApplicableMatch.getAllContextElements().add(cd2db__cd____source);
		cd2db__db____target.setSrc(cd2db);
		cd2db__db____target.setTrg(db);
		isApplicableMatch.getAllContextElements().add(cd2db__db____target);
		cd__c____classes.setName(cd__c____classes_name_prime);
		cd2db__cd____source.setName(cd2db__cd____source_name_prime);
		cd2db__db____target.setName(cd2db__db____target_name_prime);
		return new Object[] { c, cd, db, cd2db, isApplicableMatch, cd__c____classes, cd2db__cd____source,
				cd2db__db____target };
	}

	public static final Object[] pattern_class2table_2_4_solveCSP_bindingFBBBBBB(class2table _this,
			IsApplicableMatch isApplicableMatch, Clazz c, ClassDiagram cd, DB db, CD2D cd2db) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, c, cd, db, cd2db);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, cd, db, cd2db };
		}
		return null;
	}

	public static final Object[] pattern_class2table_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_class2table_2_4_solveCSP_bindingAndBlackFBBBBBB(class2table _this,
			IsApplicableMatch isApplicableMatch, Clazz c, ClassDiagram cd, DB db, CD2D cd2db) {
		Object[] result_pattern_class2table_2_4_solveCSP_binding = pattern_class2table_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, c, cd, db, cd2db);
		if (result_pattern_class2table_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_class2table_2_4_solveCSP_binding[0];

			Object[] result_pattern_class2table_2_4_solveCSP_black = pattern_class2table_2_4_solveCSP_blackB(csp);
			if (result_pattern_class2table_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, cd, db, cd2db };
			}
		}
		return null;
	}

	public static final boolean pattern_class2table_2_5_checkCSP_expressionFBB(class2table _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_class2table_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_class2table_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "class2table";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_class2table_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_class2table_10_1_initialbindings_blackBBBB(class2table _this, Match match,
			Table t, DB db) {
		return new Object[] { _this, match, t, db };
	}

	public static final Object[] pattern_class2table_10_2_SolveCSP_bindingFBBBB(class2table _this, Match match, Table t,
			DB db) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, t, db);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, t, db };
		}
		return null;
	}

	public static final Object[] pattern_class2table_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_class2table_10_2_SolveCSP_bindingAndBlackFBBBB(class2table _this, Match match,
			Table t, DB db) {
		Object[] result_pattern_class2table_10_2_SolveCSP_binding = pattern_class2table_10_2_SolveCSP_bindingFBBBB(
				_this, match, t, db);
		if (result_pattern_class2table_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_class2table_10_2_SolveCSP_binding[0];

			Object[] result_pattern_class2table_10_2_SolveCSP_black = pattern_class2table_10_2_SolveCSP_blackB(csp);
			if (result_pattern_class2table_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, t, db };
			}
		}
		return null;
	}

	public static final boolean pattern_class2table_10_3_CheckCSP_expressionFBB(class2table _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_class2table_10_4_collectelementstobetranslated_blackBBB(Match match, Table t,
			DB db) {
		return new Object[] { match, t, db };
	}

	public static final Object[] pattern_class2table_10_4_collectelementstobetranslated_greenBBBF(Match match, Table t,
			DB db) {
		EMoflonEdge db__t____table = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(t);
		String db__t____table_name_prime = "table";
		db__t____table.setSrc(db);
		db__t____table.setTrg(t);
		match.getToBeTranslatedEdges().add(db__t____table);
		db__t____table.setName(db__t____table_name_prime);
		return new Object[] { match, t, db, db__t____table };
	}

	public static final Object[] pattern_class2table_10_5_collectcontextelements_blackBBB(Match match, Table t, DB db) {
		return new Object[] { match, t, db };
	}

	public static final Object[] pattern_class2table_10_5_collectcontextelements_greenBB(Match match, DB db) {
		match.getContextNodes().add(db);
		return new Object[] { match, db };
	}

	public static final void pattern_class2table_10_6_registerobjectstomatch_expressionBBBB(class2table _this,
			Match match, Table t, DB db) {
		_this.registerObjectsToMatch_BWD(match, t, db);

	}

	public static final boolean pattern_class2table_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_class2table_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_class2table_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("cd");
		EObject _localVariable_1 = isApplicableMatch.getObject("t");
		EObject _localVariable_2 = isApplicableMatch.getObject("db");
		EObject _localVariable_3 = isApplicableMatch.getObject("cd2db");
		EObject tmpCd = _localVariable_0;
		EObject tmpT = _localVariable_1;
		EObject tmpDb = _localVariable_2;
		EObject tmpCd2db = _localVariable_3;
		if (tmpCd instanceof ClassDiagram) {
			ClassDiagram cd = (ClassDiagram) tmpCd;
			if (tmpT instanceof Table) {
				Table t = (Table) tmpT;
				if (tmpDb instanceof DB) {
					DB db = (DB) tmpDb;
					if (tmpCd2db instanceof CD2D) {
						CD2D cd2db = (CD2D) tmpCd2db;
						return new Object[] { cd, t, db, cd2db, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_class2table_11_1_performtransformation_blackBBBBFBB(ClassDiagram cd, Table t,
			DB db, CD2D cd2db, class2table _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { cd, t, db, cd2db, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_class2table_11_1_performtransformation_bindingAndBlackFFFFFBB(
			class2table _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_class2table_11_1_performtransformation_binding = pattern_class2table_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_class2table_11_1_performtransformation_binding != null) {
			ClassDiagram cd = (ClassDiagram) result_pattern_class2table_11_1_performtransformation_binding[0];
			Table t = (Table) result_pattern_class2table_11_1_performtransformation_binding[1];
			DB db = (DB) result_pattern_class2table_11_1_performtransformation_binding[2];
			CD2D cd2db = (CD2D) result_pattern_class2table_11_1_performtransformation_binding[3];

			Object[] result_pattern_class2table_11_1_performtransformation_black = pattern_class2table_11_1_performtransformation_blackBBBBFBB(
					cd, t, db, cd2db, _this, isApplicableMatch);
			if (result_pattern_class2table_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_class2table_11_1_performtransformation_black[4];

				return new Object[] { cd, t, db, cd2db, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_class2table_11_1_performtransformation_greenFBFB(ClassDiagram cd, Table t) {
		Clazz c = ClassFactory.eINSTANCE.createClazz();
		C2T c2t = Class2databaseFactory.eINSTANCE.createC2T();
		cd.getClasses().add(c);
		c2t.setSource(c);
		c2t.setTarget(t);
		return new Object[] { c, cd, c2t, t };
	}

	public static final Object[] pattern_class2table_11_2_collecttranslatedelements_blackBBB(Clazz c, C2T c2t,
			Table t) {
		return new Object[] { c, c2t, t };
	}

	public static final Object[] pattern_class2table_11_2_collecttranslatedelements_greenFBBB(Clazz c, C2T c2t,
			Table t) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(c);
		ruleresult.getCreatedLinkElements().add(c2t);
		ruleresult.getTranslatedElements().add(t);
		return new Object[] { ruleresult, c, c2t, t };
	}

	public static final Object[] pattern_class2table_11_3_bookkeepingforedges_blackBBBBBBB(PerformRuleResult ruleresult,
			EObject c, EObject cd, EObject c2t, EObject t, EObject db, EObject cd2db) {
		if (!c.equals(cd)) {
			if (!c.equals(c2t)) {
				if (!c.equals(t)) {
					if (!c.equals(db)) {
						if (!c.equals(cd2db)) {
							if (!cd.equals(t)) {
								if (!cd.equals(db)) {
									if (!cd.equals(cd2db)) {
										if (!c2t.equals(cd)) {
											if (!c2t.equals(t)) {
												if (!c2t.equals(db)) {
													if (!c2t.equals(cd2db)) {
														if (!db.equals(t)) {
															if (!cd2db.equals(t)) {
																if (!cd2db.equals(db)) {
																	return new Object[] { ruleresult, c, cd, c2t, t, db,
																			cd2db };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_class2table_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject c, EObject cd, EObject c2t, EObject t, EObject db) {
		EMoflonEdge cd__c____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2t__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2t__t____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge db__t____table = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "class2table";
		String cd__c____classes_name_prime = "classes";
		String c2t__c____source_name_prime = "source";
		String c2t__t____target_name_prime = "target";
		String db__t____table_name_prime = "table";
		cd__c____classes.setSrc(cd);
		cd__c____classes.setTrg(c);
		ruleresult.getCreatedEdges().add(cd__c____classes);
		c2t__c____source.setSrc(c2t);
		c2t__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2t__c____source);
		c2t__t____target.setSrc(c2t);
		c2t__t____target.setTrg(t);
		ruleresult.getCreatedEdges().add(c2t__t____target);
		db__t____table.setSrc(db);
		db__t____table.setTrg(t);
		ruleresult.getTranslatedEdges().add(db__t____table);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		cd__c____classes.setName(cd__c____classes_name_prime);
		c2t__c____source.setName(c2t__c____source_name_prime);
		c2t__t____target.setName(c2t__t____target_name_prime);
		db__t____table.setName(db__t____table_name_prime);
		return new Object[] { ruleresult, c, cd, c2t, t, db, cd__c____classes, c2t__c____source, c2t__t____target,
				db__t____table };
	}

	public static final void pattern_class2table_11_5_registerobjects_expressionBBBBBBBB(class2table _this,
			PerformRuleResult ruleresult, EObject c, EObject cd, EObject c2t, EObject t, EObject db, EObject cd2db) {
		_this.registerObjects_BWD(ruleresult, c, cd, c2t, t, db, cd2db);

	}

	public static final PerformRuleResult pattern_class2table_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_class2table_12_1_preparereturnvalue_bindingFB(class2table _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_class2table_12_1_preparereturnvalue_blackFBB(EClass eClass,
			class2table _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_class2table_12_1_preparereturnvalue_bindingAndBlackFFB(class2table _this) {
		Object[] result_pattern_class2table_12_1_preparereturnvalue_binding = pattern_class2table_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_class2table_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_class2table_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_class2table_12_1_preparereturnvalue_black = pattern_class2table_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_class2table_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_class2table_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_class2table_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "class2table";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_class2table_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("t");
		EObject _localVariable_1 = match.getObject("db");
		EObject tmpT = _localVariable_0;
		EObject tmpDb = _localVariable_1;
		if (tmpT instanceof Table) {
			Table t = (Table) tmpT;
			if (tmpDb instanceof DB) {
				DB db = (DB) tmpDb;
				return new Object[] { t, db, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_class2table_12_2_corematch_blackFBBFB(Table t, DB db, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (CD2D cd2db : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(db, CD2D.class,
				"target")) {
			ClassDiagram cd = cd2db.getSource();
			if (cd != null) {
				_result.add(new Object[] { cd, t, db, cd2db, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_class2table_12_3_findcontext_blackBBBB(ClassDiagram cd, Table t,
			DB db, CD2D cd2db) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (db.getTable().contains(t)) {
			if (cd.equals(cd2db.getSource())) {
				if (db.equals(cd2db.getTarget())) {
					_result.add(new Object[] { cd, t, db, cd2db });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_class2table_12_3_findcontext_greenBBBBFFFF(ClassDiagram cd, Table t, DB db,
			CD2D cd2db) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge db__t____table = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2db__cd____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2db__db____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String db__t____table_name_prime = "table";
		String cd2db__cd____source_name_prime = "source";
		String cd2db__db____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(cd);
		isApplicableMatch.getAllContextElements().add(t);
		isApplicableMatch.getAllContextElements().add(db);
		isApplicableMatch.getAllContextElements().add(cd2db);
		db__t____table.setSrc(db);
		db__t____table.setTrg(t);
		isApplicableMatch.getAllContextElements().add(db__t____table);
		cd2db__cd____source.setSrc(cd2db);
		cd2db__cd____source.setTrg(cd);
		isApplicableMatch.getAllContextElements().add(cd2db__cd____source);
		cd2db__db____target.setSrc(cd2db);
		cd2db__db____target.setTrg(db);
		isApplicableMatch.getAllContextElements().add(cd2db__db____target);
		db__t____table.setName(db__t____table_name_prime);
		cd2db__cd____source.setName(cd2db__cd____source_name_prime);
		cd2db__db____target.setName(cd2db__db____target_name_prime);
		return new Object[] { cd, t, db, cd2db, isApplicableMatch, db__t____table, cd2db__cd____source,
				cd2db__db____target };
	}

	public static final Object[] pattern_class2table_12_4_solveCSP_bindingFBBBBBB(class2table _this,
			IsApplicableMatch isApplicableMatch, ClassDiagram cd, Table t, DB db, CD2D cd2db) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, cd, t, db, cd2db);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, cd, t, db, cd2db };
		}
		return null;
	}

	public static final Object[] pattern_class2table_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_class2table_12_4_solveCSP_bindingAndBlackFBBBBBB(class2table _this,
			IsApplicableMatch isApplicableMatch, ClassDiagram cd, Table t, DB db, CD2D cd2db) {
		Object[] result_pattern_class2table_12_4_solveCSP_binding = pattern_class2table_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, cd, t, db, cd2db);
		if (result_pattern_class2table_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_class2table_12_4_solveCSP_binding[0];

			Object[] result_pattern_class2table_12_4_solveCSP_black = pattern_class2table_12_4_solveCSP_blackB(csp);
			if (result_pattern_class2table_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, cd, t, db, cd2db };
			}
		}
		return null;
	}

	public static final boolean pattern_class2table_12_5_checkCSP_expressionFBB(class2table _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_class2table_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_class2table_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "class2table";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_class2table_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_class2table_20_1_preparereturnvalue_bindingFB(class2table _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_class2table_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			class2table _this) {
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

	public static final Object[] pattern_class2table_20_1_preparereturnvalue_bindingAndBlackFFBF(class2table _this) {
		Object[] result_pattern_class2table_20_1_preparereturnvalue_binding = pattern_class2table_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_class2table_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_class2table_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_class2table_20_1_preparereturnvalue_black = pattern_class2table_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_class2table_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_class2table_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_class2table_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_class2table_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_class2table_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_table) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpDb = _edge_table.getSrc();
		if (tmpDb instanceof DB) {
			DB db = (DB) tmpDb;
			EObject tmpT = _edge_table.getTrg();
			if (tmpT instanceof Table) {
				Table t = (Table) tmpT;
				if (db.getTable().contains(t)) {
					_result.add(new Object[] { t, db, _edge_table });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_class2table_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_class2table_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			class2table _this, Match match, Table t, DB db) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, t, db);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_class2table_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			class2table _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_class2table_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_class2table_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_class2table_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_class2table_21_1_preparereturnvalue_bindingFB(class2table _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_class2table_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			class2table _this) {
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

	public static final Object[] pattern_class2table_21_1_preparereturnvalue_bindingAndBlackFFBF(class2table _this) {
		Object[] result_pattern_class2table_21_1_preparereturnvalue_binding = pattern_class2table_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_class2table_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_class2table_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_class2table_21_1_preparereturnvalue_black = pattern_class2table_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_class2table_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_class2table_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_class2table_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_class2table_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_class2table_21_2_testcorematchandDECs_black_nac_0B(Clazz c) {
		Clazz __DEC_c_super_645648 = c.getSuper();
		if (__DEC_c_super_645648 != null) {
			if (!c.equals(__DEC_c_super_645648)) {
				return new Object[] { c };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_class2table_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_classes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCd = _edge_classes.getSrc();
		if (tmpCd instanceof ClassDiagram) {
			ClassDiagram cd = (ClassDiagram) tmpCd;
			EObject tmpC = _edge_classes.getTrg();
			if (tmpC instanceof Clazz) {
				Clazz c = (Clazz) tmpC;
				if (cd.getClasses().contains(c)) {
					if (pattern_class2table_21_2_testcorematchandDECs_black_nac_0B(c) == null) {
						_result.add(new Object[] { c, cd, _edge_classes });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_class2table_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_class2table_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			class2table _this, Match match, Clazz c, ClassDiagram cd) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, c, cd);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_class2table_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			class2table _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_class2table_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_class2table_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_class2table_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_class2table_24_1_prepare_blackB(class2table _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_class2table_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_class2table_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("c");
		EObject _localVariable_1 = sourceMatch.getObject("cd");
		EObject _localVariable_2 = targetMatch.getObject("t");
		EObject _localVariable_3 = targetMatch.getObject("db");
		EObject tmpC = _localVariable_0;
		EObject tmpCd = _localVariable_1;
		EObject tmpT = _localVariable_2;
		EObject tmpDb = _localVariable_3;
		if (tmpC instanceof Clazz) {
			Clazz c = (Clazz) tmpC;
			if (tmpCd instanceof ClassDiagram) {
				ClassDiagram cd = (ClassDiagram) tmpCd;
				if (tmpT instanceof Table) {
					Table t = (Table) tmpT;
					if (tmpDb instanceof DB) {
						DB db = (DB) tmpDb;
						return new Object[] { c, cd, t, db, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_class2table_24_2_matchsrctrgcontext_blackBBBBBB(Clazz c, ClassDiagram cd,
			Table t, DB db, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { c, cd, t, db, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_class2table_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_class2table_24_2_matchsrctrgcontext_binding = pattern_class2table_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_class2table_24_2_matchsrctrgcontext_binding != null) {
			Clazz c = (Clazz) result_pattern_class2table_24_2_matchsrctrgcontext_binding[0];
			ClassDiagram cd = (ClassDiagram) result_pattern_class2table_24_2_matchsrctrgcontext_binding[1];
			Table t = (Table) result_pattern_class2table_24_2_matchsrctrgcontext_binding[2];
			DB db = (DB) result_pattern_class2table_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_class2table_24_2_matchsrctrgcontext_black = pattern_class2table_24_2_matchsrctrgcontext_blackBBBBBB(
					c, cd, t, db, sourceMatch, targetMatch);
			if (result_pattern_class2table_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { c, cd, t, db, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_class2table_24_3_solvecsp_bindingFBBBBBBB(class2table _this, Clazz c,
			ClassDiagram cd, Table t, DB db, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(c, cd, t, db, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, c, cd, t, db, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_class2table_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_class2table_24_3_solvecsp_bindingAndBlackFBBBBBBB(class2table _this, Clazz c,
			ClassDiagram cd, Table t, DB db, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_class2table_24_3_solvecsp_binding = pattern_class2table_24_3_solvecsp_bindingFBBBBBBB(
				_this, c, cd, t, db, sourceMatch, targetMatch);
		if (result_pattern_class2table_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_class2table_24_3_solvecsp_binding[0];

			Object[] result_pattern_class2table_24_3_solvecsp_black = pattern_class2table_24_3_solvecsp_blackB(csp);
			if (result_pattern_class2table_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, c, cd, t, db, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_class2table_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_class2table_24_5_matchcorrcontext_blackBBFBB(ClassDiagram cd, DB db,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (CD2D cd2db : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(cd, CD2D.class,
					"source")) {
				if (db.equals(cd2db.getTarget())) {
					_result.add(new Object[] { cd, db, cd2db, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_class2table_24_5_matchcorrcontext_greenBBBF(CD2D cd2db, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "class2table";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(cd2db);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { cd2db, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_class2table_24_6_createcorrespondence_blackBBBBB(Clazz c, ClassDiagram cd,
			Table t, DB db, CCMatch ccMatch) {
		return new Object[] { c, cd, t, db, ccMatch };
	}

	public static final Object[] pattern_class2table_24_6_createcorrespondence_greenBFBB(Clazz c, Table t,
			CCMatch ccMatch) {
		C2T c2t = Class2databaseFactory.eINSTANCE.createC2T();
		c2t.setSource(c);
		c2t.setTarget(t);
		ccMatch.getCreateCorr().add(c2t);
		return new Object[] { c, c2t, t, ccMatch };
	}

	public static final Object[] pattern_class2table_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_class2table_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "class2table";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_class2table_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_class2table_27_1_matchtggpattern_black_nac_0B(Clazz c) {
		Clazz __DEC_c_super_275652 = c.getSuper();
		if (__DEC_c_super_275652 != null) {
			if (!c.equals(__DEC_c_super_275652)) {
				return new Object[] { c };
			}
		}

		return null;
	}

	public static final Object[] pattern_class2table_27_1_matchtggpattern_blackBB(Clazz c, ClassDiagram cd) {
		if (cd.getClasses().contains(c)) {
			if (pattern_class2table_27_1_matchtggpattern_black_nac_0B(c) == null) {
				return new Object[] { c, cd };
			}
		}
		return null;
	}

	public static final boolean pattern_class2table_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_class2table_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_class2table_28_1_matchtggpattern_blackBB(Table t, DB db) {
		if (db.getTable().contains(t)) {
			return new Object[] { t, db };
		}
		return null;
	}

	public static final boolean pattern_class2table_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_class2table_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_class2table_29_1_createresult_blackB(class2table _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_class2table_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_class2table_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, ClassDiagram cd) {
		if (ruleResult.getSourceObjects().contains(cd)) {
			return new Object[] { ruleResult, cd };
		}
		return null;
	}

	public static final Object[] pattern_class2table_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, CD2D cd2db) {
		if (ruleResult.getCorrObjects().contains(cd2db)) {
			return new Object[] { ruleResult, cd2db };
		}
		return null;
	}

	public static final Object[] pattern_class2table_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, DB db) {
		if (ruleResult.getTargetObjects().contains(db)) {
			return new Object[] { ruleResult, db };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_class2table_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList cd2dbList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpCd2db : cd2dbList.getEntryObjects()) {
				if (tmpCd2db instanceof CD2D) {
					CD2D cd2db = (CD2D) tmpCd2db;
					ClassDiagram cd = cd2db.getSource();
					if (cd != null) {
						DB db = cd2db.getTarget();
						if (db != null) {
							if (pattern_class2table_29_2_isapplicablecore_black_nac_1BB(ruleResult, cd2db) == null) {
								if (pattern_class2table_29_2_isapplicablecore_black_nac_0BB(ruleResult, cd) == null) {
									if (pattern_class2table_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											db) == null) {
										_result.add(new Object[] { cd2dbList, cd, cd2db, db, ruleEntryContainer,
												ruleResult });
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

	public static final Object[] pattern_class2table_29_3_solveCSP_bindingFBBBBBB(class2table _this,
			IsApplicableMatch isApplicableMatch, ClassDiagram cd, DB db, CD2D cd2db,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, cd, db, cd2db, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, cd, db, cd2db, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_class2table_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_class2table_29_3_solveCSP_bindingAndBlackFBBBBBB(class2table _this,
			IsApplicableMatch isApplicableMatch, ClassDiagram cd, DB db, CD2D cd2db,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_class2table_29_3_solveCSP_binding = pattern_class2table_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, cd, db, cd2db, ruleResult);
		if (result_pattern_class2table_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_class2table_29_3_solveCSP_binding[0];

			Object[] result_pattern_class2table_29_3_solveCSP_black = pattern_class2table_29_3_solveCSP_blackB(csp);
			if (result_pattern_class2table_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, cd, db, cd2db, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_class2table_29_4_checkCSP_expressionFBB(class2table _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_class2table_29_5_checknacs_blackBBB(ClassDiagram cd, DB db, CD2D cd2db) {
		return new Object[] { cd, db, cd2db };
	}

	public static final Object[] pattern_class2table_29_6_perform_blackBBBB(ClassDiagram cd, DB db, CD2D cd2db,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { cd, db, cd2db, ruleResult };
	}

	public static final Object[] pattern_class2table_29_6_perform_greenFBFFBB(ClassDiagram cd, DB db,
			ModelgeneratorRuleResult ruleResult) {
		Clazz c = ClassFactory.eINSTANCE.createClazz();
		C2T c2t = Class2databaseFactory.eINSTANCE.createC2T();
		Table t = DatabaseFactory.eINSTANCE.createTable();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		cd.getClasses().add(c);
		ruleResult.getSourceObjects().add(c);
		c2t.setSource(c);
		ruleResult.getCorrObjects().add(c2t);
		c2t.setTarget(t);
		db.getTable().add(t);
		ruleResult.getTargetObjects().add(t);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { c, cd, c2t, t, db, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_class2table_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //class2tableImpl
