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
import org.wbsilva.bx.class2database.Rules.association2column;
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
 * An implementation of the model object '<em><b>association2column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class association2columnImpl extends AbstractRuleImpl implements association2column {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected association2columnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getassociation2column();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Clazz c, Clazz b, Association as, ClassDiagram cd) {

		Object[] result1_black = association2columnImpl.pattern_association2column_0_1_initialbindings_blackBBBBBB(this,
				match, c, b, as, cd);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[b] = " + b + ", " + "[as] = " + as + ", "
					+ "[cd] = " + cd + ".");
		}

		Object[] result2_bindingAndBlack = association2columnImpl
				.pattern_association2column_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, c, b, as, cd);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[b] = " + b + ", " + "[as] = " + as + ", "
					+ "[cd] = " + cd + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (association2columnImpl.pattern_association2column_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = association2columnImpl
					.pattern_association2column_0_4_collectelementstobetranslated_blackBBBBB(match, c, b, as, cd);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[b] = " + b + ", " + "[as] = " + as + ", " + "[cd] = " + cd + ".");
			}
			association2columnImpl.pattern_association2column_0_4_collectelementstobetranslated_greenBBBBBFFF(match, c,
					b, as, cd);
			//nothing EMoflonEdge as__c____source = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge cd__as____associations = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge as__b____target = (EMoflonEdge) result4_green[7];

			Object[] result5_black = association2columnImpl
					.pattern_association2column_0_5_collectcontextelements_blackBBBBB(match, c, b, as, cd);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[b] = " + b + ", " + "[as] = " + as + ", " + "[cd] = " + cd + ".");
			}
			association2columnImpl.pattern_association2column_0_5_collectcontextelements_greenBBBBFF(match, c, b, cd);
			//nothing EMoflonEdge cd__c____classes = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge cd__b____classes = (EMoflonEdge) result5_green[5];

			// 
			association2columnImpl.pattern_association2column_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					c, b, as, cd);
			return association2columnImpl.pattern_association2column_0_7_expressionF();
		} else {
			return association2columnImpl.pattern_association2column_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = association2columnImpl
				.pattern_association2column_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		C2T b2u = (C2T) result1_bindingAndBlack[0];
		C2T c2t = (C2T) result1_bindingAndBlack[1];
		Table t = (Table) result1_bindingAndBlack[2];
		DB db = (DB) result1_bindingAndBlack[3];
		Clazz c = (Clazz) result1_bindingAndBlack[4];
		Table u = (Table) result1_bindingAndBlack[5];
		Clazz b = (Clazz) result1_bindingAndBlack[6];
		Association as = (Association) result1_bindingAndBlack[7];
		ClassDiagram cd = (ClassDiagram) result1_bindingAndBlack[8];
		CD2D cd2db = (CD2D) result1_bindingAndBlack[9];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = association2columnImpl
				.pattern_association2column_1_1_performtransformation_greenBFBFB(t, u, as);
		AS2C as2fk = (AS2C) result1_green[1];
		Column fk = (Column) result1_green[3];

		Object[] result2_black = association2columnImpl
				.pattern_association2column_1_2_collecttranslatedelements_blackBBB(as2fk, fk, as);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[as2fk] = " + as2fk + ", "
					+ "[fk] = " + fk + ", " + "[as] = " + as + ".");
		}
		Object[] result2_green = association2columnImpl
				.pattern_association2column_1_2_collecttranslatedelements_greenFBBB(as2fk, fk, as);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = association2columnImpl
				.pattern_association2column_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, b2u, c2t, t, as2fk,
						db, c, u, b, fk, as, cd, cd2db);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b2u] = " + b2u + ", " + "[c2t] = " + c2t + ", " + "[t] = " + t + ", " + "[as2fk] = "
					+ as2fk + ", " + "[db] = " + db + ", " + "[c] = " + c + ", " + "[u] = " + u + ", " + "[b] = " + b
					+ ", " + "[fk] = " + fk + ", " + "[as] = " + as + ", " + "[cd] = " + cd + ", " + "[cd2db] = "
					+ cd2db + ".");
		}
		association2columnImpl.pattern_association2column_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFF(ruleresult, t,
				as2fk, c, u, b, fk, as, cd);
		//nothing EMoflonEdge t__fk____column = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge as2fk__as____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge as2fk__fk____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge fk__u____reference = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge as__c____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge cd__as____associations = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge as__b____target = (EMoflonEdge) result3_green[15];

		// 
		// 
		association2columnImpl.pattern_association2column_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
				b2u, c2t, t, as2fk, db, c, u, b, fk, as, cd, cd2db);
		return association2columnImpl.pattern_association2column_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = association2columnImpl
				.pattern_association2column_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = association2columnImpl
				.pattern_association2column_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = association2columnImpl.pattern_association2column_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Clazz c = (Clazz) result2_binding[0];
		Clazz b = (Clazz) result2_binding[1];
		Association as = (Association) result2_binding[2];
		ClassDiagram cd = (ClassDiagram) result2_binding[3];
		for (Object[] result2_black : association2columnImpl
				.pattern_association2column_2_2_corematch_blackFFFFBFBBBFB(c, b, as, cd, match)) {
			C2T b2u = (C2T) result2_black[0];
			C2T c2t = (C2T) result2_black[1];
			Table t = (Table) result2_black[2];
			DB db = (DB) result2_black[3];
			Table u = (Table) result2_black[5];
			CD2D cd2db = (CD2D) result2_black[9];
			// ForEach 
			for (Object[] result3_black : association2columnImpl
					.pattern_association2column_2_3_findcontext_blackBBBBBBBBBB(b2u, c2t, t, db, c, u, b, as, cd,
							cd2db)) {
				Object[] result3_green = association2columnImpl
						.pattern_association2column_2_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFF(b2u, c2t, t, db, c, u,
								b, as, cd, cd2db);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				//nothing EMoflonEdge db__u____table = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge b2u__u____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge b2u__b____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge db__t____table = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge c2t__t____target = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge c2t__c____source = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge as__c____source = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge cd__c____classes = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge cd__as____associations = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge cd__b____classes = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge cd2db__cd____source = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge as__b____target = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge cd2db__db____target = (EMoflonEdge) result3_green[23];

				Object[] result4_bindingAndBlack = association2columnImpl
						.pattern_association2column_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch,
								b2u, c2t, t, db, c, u, b, as, cd, cd2db);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[b2u] = " + b2u + ", " + "[c2t] = "
							+ c2t + ", " + "[t] = " + t + ", " + "[db] = " + db + ", " + "[c] = " + c + ", " + "[u] = "
							+ u + ", " + "[b] = " + b + ", " + "[as] = " + as + ", " + "[cd] = " + cd + ", "
							+ "[cd2db] = " + cd2db + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (association2columnImpl.pattern_association2column_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = association2columnImpl
							.pattern_association2column_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					association2columnImpl.pattern_association2column_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return association2columnImpl.pattern_association2column_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Clazz c, Clazz b, Association as, ClassDiagram cd) {
		match.registerObject("c", c);
		match.registerObject("b", b);
		match.registerObject("as", as);
		match.registerObject("cd", cd);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Clazz c, Clazz b, Association as, ClassDiagram cd) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, C2T b2u, C2T c2t, Table t, DB db, Clazz c,
			Table u, Clazz b, Association as, ClassDiagram cd, CD2D cd2db) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("b2u", b2u);
		isApplicableMatch.registerObject("c2t", c2t);
		isApplicableMatch.registerObject("t", t);
		isApplicableMatch.registerObject("db", db);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("u", u);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("as", as);
		isApplicableMatch.registerObject("cd", cd);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject b2u, EObject c2t, EObject t, EObject as2fk,
			EObject db, EObject c, EObject u, EObject b, EObject fk, EObject as, EObject cd, EObject cd2db) {
		ruleresult.registerObject("b2u", b2u);
		ruleresult.registerObject("c2t", c2t);
		ruleresult.registerObject("t", t);
		ruleresult.registerObject("as2fk", as2fk);
		ruleresult.registerObject("db", db);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("u", u);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("fk", fk);
		ruleresult.registerObject("as", as);
		ruleresult.registerObject("cd", cd);
		ruleresult.registerObject("cd2db", cd2db);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("as").eClass()).equals("class.Association.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Table t, DB db, Table u, Column fk) {

		Object[] result1_black = association2columnImpl
				.pattern_association2column_10_1_initialbindings_blackBBBBBB(this, match, t, db, u, fk);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[t] = " + t + ", " + "[db] = " + db + ", " + "[u] = " + u + ", "
					+ "[fk] = " + fk + ".");
		}

		Object[] result2_bindingAndBlack = association2columnImpl
				.pattern_association2column_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, t, db, u, fk);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[t] = " + t + ", " + "[db] = " + db + ", " + "[u] = " + u + ", "
					+ "[fk] = " + fk + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (association2columnImpl.pattern_association2column_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = association2columnImpl
					.pattern_association2column_10_4_collectelementstobetranslated_blackBBBBB(match, t, db, u, fk);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[t] = " + t + ", " + "[db] = " + db + ", " + "[u] = " + u + ", " + "[fk] = " + fk + ".");
			}
			association2columnImpl.pattern_association2column_10_4_collectelementstobetranslated_greenBBBBFF(match, t,
					u, fk);
			//nothing EMoflonEdge t__fk____column = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge fk__u____reference = (EMoflonEdge) result4_green[5];

			Object[] result5_black = association2columnImpl
					.pattern_association2column_10_5_collectcontextelements_blackBBBBB(match, t, db, u, fk);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[t] = " + t + ", " + "[db] = " + db + ", " + "[u] = " + u + ", " + "[fk] = " + fk + ".");
			}
			association2columnImpl.pattern_association2column_10_5_collectcontextelements_greenBBBBFF(match, t, db, u);
			//nothing EMoflonEdge db__u____table = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge db__t____table = (EMoflonEdge) result5_green[5];

			// 
			association2columnImpl.pattern_association2column_10_6_registerobjectstomatch_expressionBBBBBB(this, match,
					t, db, u, fk);
			return association2columnImpl.pattern_association2column_10_7_expressionF();
		} else {
			return association2columnImpl.pattern_association2column_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = association2columnImpl
				.pattern_association2column_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		C2T b2u = (C2T) result1_bindingAndBlack[0];
		C2T c2t = (C2T) result1_bindingAndBlack[1];
		Table t = (Table) result1_bindingAndBlack[2];
		DB db = (DB) result1_bindingAndBlack[3];
		Clazz c = (Clazz) result1_bindingAndBlack[4];
		Table u = (Table) result1_bindingAndBlack[5];
		Clazz b = (Clazz) result1_bindingAndBlack[6];
		Column fk = (Column) result1_bindingAndBlack[7];
		ClassDiagram cd = (ClassDiagram) result1_bindingAndBlack[8];
		CD2D cd2db = (CD2D) result1_bindingAndBlack[9];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = association2columnImpl
				.pattern_association2column_11_1_performtransformation_greenFBBBFB(c, b, fk, cd);
		AS2C as2fk = (AS2C) result1_green[0];
		Association as = (Association) result1_green[4];

		Object[] result2_black = association2columnImpl
				.pattern_association2column_11_2_collecttranslatedelements_blackBBB(as2fk, fk, as);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[as2fk] = " + as2fk + ", "
					+ "[fk] = " + fk + ", " + "[as] = " + as + ".");
		}
		Object[] result2_green = association2columnImpl
				.pattern_association2column_11_2_collecttranslatedelements_greenFBBB(as2fk, fk, as);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = association2columnImpl
				.pattern_association2column_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, b2u, c2t, t, as2fk,
						db, c, u, b, fk, as, cd, cd2db);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b2u] = " + b2u + ", " + "[c2t] = " + c2t + ", " + "[t] = " + t + ", " + "[as2fk] = "
					+ as2fk + ", " + "[db] = " + db + ", " + "[c] = " + c + ", " + "[u] = " + u + ", " + "[b] = " + b
					+ ", " + "[fk] = " + fk + ", " + "[as] = " + as + ", " + "[cd] = " + cd + ", " + "[cd2db] = "
					+ cd2db + ".");
		}
		association2columnImpl.pattern_association2column_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFF(ruleresult, t,
				as2fk, c, u, b, fk, as, cd);
		//nothing EMoflonEdge t__fk____column = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge as2fk__as____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge as2fk__fk____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge fk__u____reference = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge as__c____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge cd__as____associations = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge as__b____target = (EMoflonEdge) result3_green[15];

		// 
		// 
		association2columnImpl.pattern_association2column_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this,
				ruleresult, b2u, c2t, t, as2fk, db, c, u, b, fk, as, cd, cd2db);
		return association2columnImpl.pattern_association2column_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = association2columnImpl
				.pattern_association2column_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = association2columnImpl
				.pattern_association2column_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = association2columnImpl.pattern_association2column_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Table t = (Table) result2_binding[0];
		DB db = (DB) result2_binding[1];
		Table u = (Table) result2_binding[2];
		Column fk = (Column) result2_binding[3];
		for (Object[] result2_black : association2columnImpl
				.pattern_association2column_12_2_corematch_blackFFBBFBFBFFB(t, db, u, fk, match)) {
			C2T b2u = (C2T) result2_black[0];
			C2T c2t = (C2T) result2_black[1];
			Clazz c = (Clazz) result2_black[4];
			Clazz b = (Clazz) result2_black[6];
			ClassDiagram cd = (ClassDiagram) result2_black[8];
			CD2D cd2db = (CD2D) result2_black[9];
			// ForEach 
			for (Object[] result3_black : association2columnImpl
					.pattern_association2column_12_3_findcontext_blackBBBBBBBBBB(b2u, c2t, t, db, c, u, b, fk, cd,
							cd2db)) {
				Object[] result3_green = association2columnImpl
						.pattern_association2column_12_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFF(b2u, c2t, t, db, c, u,
								b, fk, cd, cd2db);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				//nothing EMoflonEdge t__fk____column = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge db__u____table = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge b2u__u____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge b2u__b____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge db__t____table = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge c2t__t____target = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge fk__u____reference = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge c2t__c____source = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge cd__c____classes = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge cd__b____classes = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge cd2db__cd____source = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge cd2db__db____target = (EMoflonEdge) result3_green[22];

				Object[] result4_bindingAndBlack = association2columnImpl
						.pattern_association2column_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch,
								b2u, c2t, t, db, c, u, b, fk, cd, cd2db);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[b2u] = " + b2u + ", " + "[c2t] = "
							+ c2t + ", " + "[t] = " + t + ", " + "[db] = " + db + ", " + "[c] = " + c + ", " + "[u] = "
							+ u + ", " + "[b] = " + b + ", " + "[fk] = " + fk + ", " + "[cd] = " + cd + ", "
							+ "[cd2db] = " + cd2db + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (association2columnImpl.pattern_association2column_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = association2columnImpl
							.pattern_association2column_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					association2columnImpl.pattern_association2column_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return association2columnImpl.pattern_association2column_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Table t, DB db, Table u, Column fk) {
		match.registerObject("t", t);
		match.registerObject("db", db);
		match.registerObject("u", u);
		match.registerObject("fk", fk);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Table t, DB db, Table u, Column fk) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, C2T b2u, C2T c2t, Table t, DB db, Clazz c,
			Table u, Clazz b, Column fk, ClassDiagram cd, CD2D cd2db) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("b2u", b2u);
		isApplicableMatch.registerObject("c2t", c2t);
		isApplicableMatch.registerObject("t", t);
		isApplicableMatch.registerObject("db", db);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("u", u);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("fk", fk);
		isApplicableMatch.registerObject("cd", cd);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject b2u, EObject c2t, EObject t, EObject as2fk,
			EObject db, EObject c, EObject u, EObject b, EObject fk, EObject as, EObject cd, EObject cd2db) {
		ruleresult.registerObject("b2u", b2u);
		ruleresult.registerObject("c2t", c2t);
		ruleresult.registerObject("t", t);
		ruleresult.registerObject("as2fk", as2fk);
		ruleresult.registerObject("db", db);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("u", u);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("fk", fk);
		ruleresult.registerObject("as", as);
		ruleresult.registerObject("cd", cd);
		ruleresult.registerObject("cd2db", cd2db);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_2(EMoflonEdge _edge_column) {

		Object[] result1_bindingAndBlack = association2columnImpl
				.pattern_association2column_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = association2columnImpl.pattern_association2column_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : association2columnImpl
				.pattern_association2column_20_2_testcorematchandDECs_blackFFFFB(_edge_column)) {
			Table t = (Table) result2_black[0];
			DB db = (DB) result2_black[1];
			Table u = (Table) result2_black[2];
			Column fk = (Column) result2_black[3];
			Object[] result2_green = association2columnImpl
					.pattern_association2column_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (association2columnImpl
					.pattern_association2column_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, t, db, u, fk)) {
				// 
				if (association2columnImpl
						.pattern_association2column_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = association2columnImpl
							.pattern_association2column_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					association2columnImpl.pattern_association2column_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return association2columnImpl.pattern_association2column_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_3(EMoflonEdge _edge_source) {

		Object[] result1_bindingAndBlack = association2columnImpl
				.pattern_association2column_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = association2columnImpl.pattern_association2column_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : association2columnImpl
				.pattern_association2column_21_2_testcorematchandDECs_blackFFFFB(_edge_source)) {
			Clazz c = (Clazz) result2_black[0];
			Clazz b = (Clazz) result2_black[1];
			Association as = (Association) result2_black[2];
			ClassDiagram cd = (ClassDiagram) result2_black[3];
			Object[] result2_green = association2columnImpl
					.pattern_association2column_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (association2columnImpl
					.pattern_association2column_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, c, b, as, cd)) {
				// 
				if (association2columnImpl
						.pattern_association2column_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = association2columnImpl
							.pattern_association2column_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					association2columnImpl.pattern_association2column_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return association2columnImpl.pattern_association2column_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("association2column");
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
		ruleResult.setRule("association2column");
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

		Object[] result1_black = association2columnImpl.pattern_association2column_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = association2columnImpl.pattern_association2column_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = association2columnImpl
				.pattern_association2column_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Table t = (Table) result2_bindingAndBlack[0];
		DB db = (DB) result2_bindingAndBlack[1];
		Clazz c = (Clazz) result2_bindingAndBlack[2];
		Table u = (Table) result2_bindingAndBlack[3];
		Clazz b = (Clazz) result2_bindingAndBlack[4];
		Column fk = (Column) result2_bindingAndBlack[5];
		Association as = (Association) result2_bindingAndBlack[6];
		ClassDiagram cd = (ClassDiagram) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = association2columnImpl
				.pattern_association2column_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, t, db, c, u, b, fk, as, cd,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[t] = " + t + ", " + "[db] = " + db + ", " + "[c] = " + c + ", " + "[u] = " + u + ", " + "[b] = "
					+ b + ", " + "[fk] = " + fk + ", " + "[as] = " + as + ", " + "[cd] = " + cd + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (association2columnImpl.pattern_association2column_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : association2columnImpl
					.pattern_association2column_24_5_matchcorrcontext_blackFFBBBBBBFBB(t, db, c, u, b, cd, sourceMatch,
							targetMatch)) {
				C2T b2u = (C2T) result5_black[0];
				C2T c2t = (C2T) result5_black[1];
				CD2D cd2db = (CD2D) result5_black[8];
				Object[] result5_green = association2columnImpl
						.pattern_association2column_24_5_matchcorrcontext_greenBBBBBF(b2u, c2t, cd2db, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[5];

				Object[] result6_black = association2columnImpl
						.pattern_association2column_24_6_createcorrespondence_blackBBBBBBBBB(t, db, c, u, b, fk, as, cd,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[t] = " + t + ", "
							+ "[db] = " + db + ", " + "[c] = " + c + ", " + "[u] = " + u + ", " + "[b] = " + b + ", "
							+ "[fk] = " + fk + ", " + "[as] = " + as + ", " + "[cd] = " + cd + ", " + "[ccMatch] = "
							+ ccMatch + ".");
				}
				association2columnImpl.pattern_association2column_24_6_createcorrespondence_greenFBBB(fk, as, ccMatch);
				//nothing AS2C as2fk = (AS2C) result6_green[0];

				Object[] result7_black = association2columnImpl
						.pattern_association2column_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				association2columnImpl.pattern_association2column_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return association2columnImpl.pattern_association2column_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Table t, DB db, Clazz c, Table u, Clazz b, Column fk, Association as,
			ClassDiagram cd, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Clazz c, Clazz b, Association as, ClassDiagram cd) {// 
		Object[] result1_black = association2columnImpl.pattern_association2column_27_1_matchtggpattern_blackBBBB(c, b,
				as, cd);
		if (result1_black != null) {
			return association2columnImpl.pattern_association2column_27_2_expressionF();
		} else {
			return association2columnImpl.pattern_association2column_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Table t, DB db, Table u, Column fk) {// 
		Object[] result1_black = association2columnImpl.pattern_association2column_28_1_matchtggpattern_blackBBBB(t, db,
				u, fk);
		if (result1_black != null) {
			return association2columnImpl.pattern_association2column_28_2_expressionF();
		} else {
			return association2columnImpl.pattern_association2column_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, C2T b2uParameter) {

		Object[] result1_black = association2columnImpl.pattern_association2column_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = association2columnImpl.pattern_association2column_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : association2columnImpl
				.pattern_association2column_29_2_isapplicablecore_blackFFFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList b2uList = (RuleEntryList) result2_black[0];
			C2T b2u = (C2T) result2_black[1];
			Table u = (Table) result2_black[2];
			DB db = (DB) result2_black[3];
			Table t = (Table) result2_black[4];
			C2T c2t = (C2T) result2_black[5];
			Clazz c = (Clazz) result2_black[6];
			ClassDiagram cd = (ClassDiagram) result2_black[7];
			Clazz b = (Clazz) result2_black[8];
			CD2D cd2db = (CD2D) result2_black[9];

			Object[] result3_bindingAndBlack = association2columnImpl
					.pattern_association2column_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch, b2u,
							c2t, t, db, c, u, b, cd, cd2db, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[b2u] = " + b2u + ", " + "[c2t] = "
						+ c2t + ", " + "[t] = " + t + ", " + "[db] = " + db + ", " + "[c] = " + c + ", " + "[u] = " + u
						+ ", " + "[b] = " + b + ", " + "[cd] = " + cd + ", " + "[cd2db] = " + cd2db + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (association2columnImpl.pattern_association2column_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = association2columnImpl
						.pattern_association2column_29_5_checknacs_blackBBBBBBBBB(b2u, c2t, t, db, c, u, b, cd, cd2db);
				if (result5_black != null) {

					Object[] result6_black = association2columnImpl
							.pattern_association2column_29_6_perform_blackBBBBBBBBBB(b2u, c2t, t, db, c, u, b, cd,
									cd2db, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[b2u] = " + b2u + ", "
								+ "[c2t] = " + c2t + ", " + "[t] = " + t + ", " + "[db] = " + db + ", " + "[c] = " + c
								+ ", " + "[u] = " + u + ", " + "[b] = " + b + ", " + "[cd] = " + cd + ", "
								+ "[cd2db] = " + cd2db + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					association2columnImpl.pattern_association2column_29_6_perform_greenBFBBBFFBB(t, c, u, b, cd,
							ruleResult);
					//nothing AS2C as2fk = (AS2C) result6_green[1];
					//nothing Column fk = (Column) result6_green[5];
					//nothing Association as = (Association) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return association2columnImpl.pattern_association2column_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, C2T b2u, C2T c2t, Table t, DB db,
			Clazz c, Table u, Clazz b, ClassDiagram cd, CD2D cd2db, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("b2u", b2u);
		isApplicableMatch.registerObject("c2t", c2t);
		isApplicableMatch.registerObject("t", t);
		isApplicableMatch.registerObject("db", db);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("u", u);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("cd", cd);
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
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPROPRIATE_FWD__MATCH_CLAZZ_CLAZZ_ASSOCIATION_CLASSDIAGRAM:
			return isAppropriate_FWD((Match) arguments.get(0), (Clazz) arguments.get(1), (Clazz) arguments.get(2),
					(Association) arguments.get(3), (ClassDiagram) arguments.get(4));
		case RulesPackage.ASSOCIATION2COLUMN___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLAZZ_CLAZZ_ASSOCIATION_CLASSDIAGRAM:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Clazz) arguments.get(1), (Clazz) arguments.get(2),
					(Association) arguments.get(3), (ClassDiagram) arguments.get(4));
			return null;
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLAZZ_CLAZZ_ASSOCIATION_CLASSDIAGRAM:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Clazz) arguments.get(1),
					(Clazz) arguments.get(2), (Association) arguments.get(3), (ClassDiagram) arguments.get(4));
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_C2T_C2T_TABLE_DB_CLAZZ_TABLE_CLAZZ_ASSOCIATION_CLASSDIAGRAM_CD2D:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (C2T) arguments.get(1),
					(C2T) arguments.get(2), (Table) arguments.get(3), (DB) arguments.get(4), (Clazz) arguments.get(5),
					(Table) arguments.get(6), (Clazz) arguments.get(7), (Association) arguments.get(8),
					(ClassDiagram) arguments.get(9), (CD2D) arguments.get(10));
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.ASSOCIATION2COLUMN___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPROPRIATE_BWD__MATCH_TABLE_DB_TABLE_COLUMN:
			return isAppropriate_BWD((Match) arguments.get(0), (Table) arguments.get(1), (DB) arguments.get(2),
					(Table) arguments.get(3), (Column) arguments.get(4));
		case RulesPackage.ASSOCIATION2COLUMN___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABLE_DB_TABLE_COLUMN:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Table) arguments.get(1), (DB) arguments.get(2),
					(Table) arguments.get(3), (Column) arguments.get(4));
			return null;
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABLE_DB_TABLE_COLUMN:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Table) arguments.get(1), (DB) arguments.get(2),
					(Table) arguments.get(3), (Column) arguments.get(4));
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_C2T_C2T_TABLE_DB_CLAZZ_TABLE_CLAZZ_COLUMN_CLASSDIAGRAM_CD2D:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (C2T) arguments.get(1),
					(C2T) arguments.get(2), (Table) arguments.get(3), (DB) arguments.get(4), (Clazz) arguments.get(5),
					(Table) arguments.get(6), (Clazz) arguments.get(7), (Column) arguments.get(8),
					(ClassDiagram) arguments.get(9), (CD2D) arguments.get(10));
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.ASSOCIATION2COLUMN___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPROPRIATE_BWD_EMOFLON_EDGE_2__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_2((EMoflonEdge) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPROPRIATE_FWD_EMOFLON_EDGE_3__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_3((EMoflonEdge) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPLICABLE_SOLVE_CSP_CC__TABLE_DB_CLAZZ_TABLE_CLAZZ_COLUMN_ASSOCIATION_CLASSDIAGRAM_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Table) arguments.get(0), (DB) arguments.get(1), (Clazz) arguments.get(2),
					(Table) arguments.get(3), (Clazz) arguments.get(4), (Column) arguments.get(5),
					(Association) arguments.get(6), (ClassDiagram) arguments.get(7), (Match) arguments.get(8),
					(Match) arguments.get(9));
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___CHECK_DEC_FWD__CLAZZ_CLAZZ_ASSOCIATION_CLASSDIAGRAM:
			return checkDEC_FWD((Clazz) arguments.get(0), (Clazz) arguments.get(1), (Association) arguments.get(2),
					(ClassDiagram) arguments.get(3));
		case RulesPackage.ASSOCIATION2COLUMN___CHECK_DEC_BWD__TABLE_DB_TABLE_COLUMN:
			return checkDEC_BWD((Table) arguments.get(0), (DB) arguments.get(1), (Table) arguments.get(2),
					(Column) arguments.get(3));
		case RulesPackage.ASSOCIATION2COLUMN___GENERATE_MODEL__RULEENTRYCONTAINER_C2T:
			return generateModel((RuleEntryContainer) arguments.get(0), (C2T) arguments.get(1));
		case RulesPackage.ASSOCIATION2COLUMN___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_C2T_C2T_TABLE_DB_CLAZZ_TABLE_CLAZZ_CLASSDIAGRAM_CD2D_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (C2T) arguments.get(1),
					(C2T) arguments.get(2), (Table) arguments.get(3), (DB) arguments.get(4), (Clazz) arguments.get(5),
					(Table) arguments.get(6), (Clazz) arguments.get(7), (ClassDiagram) arguments.get(8),
					(CD2D) arguments.get(9), (ModelgeneratorRuleResult) arguments.get(10));
		case RulesPackage.ASSOCIATION2COLUMN___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_association2column_0_1_initialbindings_blackBBBBBB(association2column _this,
			Match match, Clazz c, Clazz b, Association as, ClassDiagram cd) {
		if (!b.equals(c)) {
			return new Object[] { _this, match, c, b, as, cd };
		}
		return null;
	}

	public static final Object[] pattern_association2column_0_2_SolveCSP_bindingFBBBBBB(association2column _this,
			Match match, Clazz c, Clazz b, Association as, ClassDiagram cd) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, c, b, as, cd);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, c, b, as, cd };
		}
		return null;
	}

	public static final Object[] pattern_association2column_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_association2column_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			association2column _this, Match match, Clazz c, Clazz b, Association as, ClassDiagram cd) {
		Object[] result_pattern_association2column_0_2_SolveCSP_binding = pattern_association2column_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, c, b, as, cd);
		if (result_pattern_association2column_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_association2column_0_2_SolveCSP_binding[0];

			Object[] result_pattern_association2column_0_2_SolveCSP_black = pattern_association2column_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_association2column_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, c, b, as, cd };
			}
		}
		return null;
	}

	public static final boolean pattern_association2column_0_3_CheckCSP_expressionFBB(association2column _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_association2column_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			Clazz c, Clazz b, Association as, ClassDiagram cd) {
		if (!b.equals(c)) {
			return new Object[] { match, c, b, as, cd };
		}
		return null;
	}

	public static final Object[] pattern_association2column_0_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			Clazz c, Clazz b, Association as, ClassDiagram cd) {
		EMoflonEdge as__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd__as____associations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge as__b____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(as);
		String as__c____source_name_prime = "source";
		String cd__as____associations_name_prime = "associations";
		String as__b____target_name_prime = "target";
		as__c____source.setSrc(as);
		as__c____source.setTrg(c);
		match.getToBeTranslatedEdges().add(as__c____source);
		cd__as____associations.setSrc(cd);
		cd__as____associations.setTrg(as);
		match.getToBeTranslatedEdges().add(cd__as____associations);
		as__b____target.setSrc(as);
		as__b____target.setTrg(b);
		match.getToBeTranslatedEdges().add(as__b____target);
		as__c____source.setName(as__c____source_name_prime);
		cd__as____associations.setName(cd__as____associations_name_prime);
		as__b____target.setName(as__b____target_name_prime);
		return new Object[] { match, c, b, as, cd, as__c____source, cd__as____associations, as__b____target };
	}

	public static final Object[] pattern_association2column_0_5_collectcontextelements_blackBBBBB(Match match, Clazz c,
			Clazz b, Association as, ClassDiagram cd) {
		if (!b.equals(c)) {
			return new Object[] { match, c, b, as, cd };
		}
		return null;
	}

	public static final Object[] pattern_association2column_0_5_collectcontextelements_greenBBBBFF(Match match, Clazz c,
			Clazz b, ClassDiagram cd) {
		EMoflonEdge cd__c____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd__b____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(c);
		match.getContextNodes().add(b);
		match.getContextNodes().add(cd);
		String cd__c____classes_name_prime = "classes";
		String cd__b____classes_name_prime = "classes";
		cd__c____classes.setSrc(cd);
		cd__c____classes.setTrg(c);
		match.getContextEdges().add(cd__c____classes);
		cd__b____classes.setSrc(cd);
		cd__b____classes.setTrg(b);
		match.getContextEdges().add(cd__b____classes);
		cd__c____classes.setName(cd__c____classes_name_prime);
		cd__b____classes.setName(cd__b____classes_name_prime);
		return new Object[] { match, c, b, cd, cd__c____classes, cd__b____classes };
	}

	public static final void pattern_association2column_0_6_registerobjectstomatch_expressionBBBBBB(
			association2column _this, Match match, Clazz c, Clazz b, Association as, ClassDiagram cd) {
		_this.registerObjectsToMatch_FWD(match, c, b, as, cd);

	}

	public static final boolean pattern_association2column_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_association2column_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_association2column_1_1_performtransformation_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("b2u");
		EObject _localVariable_1 = isApplicableMatch.getObject("c2t");
		EObject _localVariable_2 = isApplicableMatch.getObject("t");
		EObject _localVariable_3 = isApplicableMatch.getObject("db");
		EObject _localVariable_4 = isApplicableMatch.getObject("c");
		EObject _localVariable_5 = isApplicableMatch.getObject("u");
		EObject _localVariable_6 = isApplicableMatch.getObject("b");
		EObject _localVariable_7 = isApplicableMatch.getObject("as");
		EObject _localVariable_8 = isApplicableMatch.getObject("cd");
		EObject _localVariable_9 = isApplicableMatch.getObject("cd2db");
		EObject tmpB2u = _localVariable_0;
		EObject tmpC2t = _localVariable_1;
		EObject tmpT = _localVariable_2;
		EObject tmpDb = _localVariable_3;
		EObject tmpC = _localVariable_4;
		EObject tmpU = _localVariable_5;
		EObject tmpB = _localVariable_6;
		EObject tmpAs = _localVariable_7;
		EObject tmpCd = _localVariable_8;
		EObject tmpCd2db = _localVariable_9;
		if (tmpB2u instanceof C2T) {
			C2T b2u = (C2T) tmpB2u;
			if (tmpC2t instanceof C2T) {
				C2T c2t = (C2T) tmpC2t;
				if (tmpT instanceof Table) {
					Table t = (Table) tmpT;
					if (tmpDb instanceof DB) {
						DB db = (DB) tmpDb;
						if (tmpC instanceof Clazz) {
							Clazz c = (Clazz) tmpC;
							if (tmpU instanceof Table) {
								Table u = (Table) tmpU;
								if (tmpB instanceof Clazz) {
									Clazz b = (Clazz) tmpB;
									if (tmpAs instanceof Association) {
										Association as = (Association) tmpAs;
										if (tmpCd instanceof ClassDiagram) {
											ClassDiagram cd = (ClassDiagram) tmpCd;
											if (tmpCd2db instanceof CD2D) {
												CD2D cd2db = (CD2D) tmpCd2db;
												return new Object[] { b2u, c2t, t, db, c, u, b, as, cd, cd2db,
														isApplicableMatch };
											}
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

	public static final Object[] pattern_association2column_1_1_performtransformation_blackBBBBBBBBBBFBB(C2T b2u,
			C2T c2t, Table t, DB db, Clazz c, Table u, Clazz b, Association as, ClassDiagram cd, CD2D cd2db,
			association2column _this, IsApplicableMatch isApplicableMatch) {
		if (!b2u.equals(c2t)) {
			if (!t.equals(u)) {
				if (!b.equals(c)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { b2u, c2t, t, db, c, u, b, as, cd, cd2db, csp, _this,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_association2column_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(
			association2column _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_association2column_1_1_performtransformation_binding = pattern_association2column_1_1_performtransformation_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_association2column_1_1_performtransformation_binding != null) {
			C2T b2u = (C2T) result_pattern_association2column_1_1_performtransformation_binding[0];
			C2T c2t = (C2T) result_pattern_association2column_1_1_performtransformation_binding[1];
			Table t = (Table) result_pattern_association2column_1_1_performtransformation_binding[2];
			DB db = (DB) result_pattern_association2column_1_1_performtransformation_binding[3];
			Clazz c = (Clazz) result_pattern_association2column_1_1_performtransformation_binding[4];
			Table u = (Table) result_pattern_association2column_1_1_performtransformation_binding[5];
			Clazz b = (Clazz) result_pattern_association2column_1_1_performtransformation_binding[6];
			Association as = (Association) result_pattern_association2column_1_1_performtransformation_binding[7];
			ClassDiagram cd = (ClassDiagram) result_pattern_association2column_1_1_performtransformation_binding[8];
			CD2D cd2db = (CD2D) result_pattern_association2column_1_1_performtransformation_binding[9];

			Object[] result_pattern_association2column_1_1_performtransformation_black = pattern_association2column_1_1_performtransformation_blackBBBBBBBBBBFBB(
					b2u, c2t, t, db, c, u, b, as, cd, cd2db, _this, isApplicableMatch);
			if (result_pattern_association2column_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_association2column_1_1_performtransformation_black[10];

				return new Object[] { b2u, c2t, t, db, c, u, b, as, cd, cd2db, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_association2column_1_1_performtransformation_greenBFBFB(Table t, Table u,
			Association as) {
		AS2C as2fk = Class2databaseFactory.eINSTANCE.createAS2C();
		Column fk = DatabaseFactory.eINSTANCE.createColumn();
		as2fk.setSource(as);
		t.getColumn().add(fk);
		as2fk.setTarget(fk);
		fk.setReference(u);
		return new Object[] { t, as2fk, u, fk, as };
	}

	public static final Object[] pattern_association2column_1_2_collecttranslatedelements_blackBBB(AS2C as2fk,
			Column fk, Association as) {
		return new Object[] { as2fk, fk, as };
	}

	public static final Object[] pattern_association2column_1_2_collecttranslatedelements_greenFBBB(AS2C as2fk,
			Column fk, Association as) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(as2fk);
		ruleresult.getCreatedElements().add(fk);
		ruleresult.getTranslatedElements().add(as);
		return new Object[] { ruleresult, as2fk, fk, as };
	}

	public static final Object[] pattern_association2column_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject b2u, EObject c2t, EObject t, EObject as2fk, EObject db, EObject c,
			EObject u, EObject b, EObject fk, EObject as, EObject cd, EObject cd2db) {
		if (!b2u.equals(c2t)) {
			if (!b2u.equals(t)) {
				if (!b2u.equals(db)) {
					if (!b2u.equals(c)) {
						if (!b2u.equals(u)) {
							if (!b2u.equals(fk)) {
								if (!b2u.equals(cd)) {
									if (!b2u.equals(cd2db)) {
										if (!c2t.equals(t)) {
											if (!c2t.equals(db)) {
												if (!c2t.equals(u)) {
													if (!c2t.equals(fk)) {
														if (!c2t.equals(cd)) {
															if (!c2t.equals(cd2db)) {
																if (!t.equals(u)) {
																	if (!as2fk.equals(b2u)) {
																		if (!as2fk.equals(c2t)) {
																			if (!as2fk.equals(t)) {
																				if (!as2fk.equals(db)) {
																					if (!as2fk.equals(c)) {
																						if (!as2fk.equals(u)) {
																							if (!as2fk.equals(b)) {
																								if (!as2fk.equals(fk)) {
																									if (!as2fk.equals(
																											cd)) {
																										if (!as2fk
																												.equals(cd2db)) {
																											if (!db.equals(
																													t)) {
																												if (!db.equals(
																														u)) {
																													if (!db.equals(
																															fk)) {
																														if (!c.equals(
																																c2t)) {
																															if (!c.equals(
																																	t)) {
																																if (!c.equals(
																																		db)) {
																																	if (!c.equals(
																																			u)) {
																																		if (!c.equals(
																																				fk)) {
																																			if (!c.equals(
																																					cd)) {
																																				if (!c.equals(
																																						cd2db)) {
																																					if (!b.equals(
																																							b2u)) {
																																						if (!b.equals(
																																								c2t)) {
																																							if (!b.equals(
																																									t)) {
																																								if (!b.equals(
																																										db)) {
																																									if (!b.equals(
																																											c)) {
																																										if (!b.equals(
																																												u)) {
																																											if (!b.equals(
																																													fk)) {
																																												if (!b.equals(
																																														cd)) {
																																													if (!b.equals(
																																															cd2db)) {
																																														if (!fk.equals(
																																																t)) {
																																															if (!fk.equals(
																																																	u)) {
																																																if (!as.equals(
																																																		b2u)) {
																																																	if (!as.equals(
																																																			c2t)) {
																																																		if (!as.equals(
																																																				t)) {
																																																			if (!as.equals(
																																																					as2fk)) {
																																																				if (!as.equals(
																																																						db)) {
																																																					if (!as.equals(
																																																							c)) {
																																																						if (!as.equals(
																																																								u)) {
																																																							if (!as.equals(
																																																									b)) {
																																																								if (!as.equals(
																																																										fk)) {
																																																									if (!as.equals(
																																																											cd)) {
																																																										if (!as.equals(
																																																												cd2db)) {
																																																											if (!cd.equals(
																																																													t)) {
																																																												if (!cd.equals(
																																																														db)) {
																																																													if (!cd.equals(
																																																															u)) {
																																																														if (!cd.equals(
																																																																fk)) {
																																																															if (!cd.equals(
																																																																	cd2db)) {
																																																																if (!cd2db
																																																																		.equals(t)) {
																																																																	if (!cd2db
																																																																			.equals(db)) {
																																																																		if (!cd2db
																																																																				.equals(u)) {
																																																																			if (!cd2db
																																																																					.equals(fk)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						b2u,
																																																																						c2t,
																																																																						t,
																																																																						as2fk,
																																																																						db,
																																																																						c,
																																																																						u,
																																																																						b,
																																																																						fk,
																																																																						as,
																																																																						cd,
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
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_association2column_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject t, EObject as2fk, EObject c, EObject u, EObject b, EObject fk,
			EObject as, EObject cd) {
		EMoflonEdge t__fk____column = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge as2fk__as____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge as2fk__fk____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fk__u____reference = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge as__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd__as____associations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge as__b____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "association2column";
		String t__fk____column_name_prime = "column";
		String as2fk__as____source_name_prime = "source";
		String as2fk__fk____target_name_prime = "target";
		String fk__u____reference_name_prime = "reference";
		String as__c____source_name_prime = "source";
		String cd__as____associations_name_prime = "associations";
		String as__b____target_name_prime = "target";
		t__fk____column.setSrc(t);
		t__fk____column.setTrg(fk);
		ruleresult.getCreatedEdges().add(t__fk____column);
		as2fk__as____source.setSrc(as2fk);
		as2fk__as____source.setTrg(as);
		ruleresult.getCreatedEdges().add(as2fk__as____source);
		as2fk__fk____target.setSrc(as2fk);
		as2fk__fk____target.setTrg(fk);
		ruleresult.getCreatedEdges().add(as2fk__fk____target);
		fk__u____reference.setSrc(fk);
		fk__u____reference.setTrg(u);
		ruleresult.getCreatedEdges().add(fk__u____reference);
		as__c____source.setSrc(as);
		as__c____source.setTrg(c);
		ruleresult.getTranslatedEdges().add(as__c____source);
		cd__as____associations.setSrc(cd);
		cd__as____associations.setTrg(as);
		ruleresult.getTranslatedEdges().add(cd__as____associations);
		as__b____target.setSrc(as);
		as__b____target.setTrg(b);
		ruleresult.getTranslatedEdges().add(as__b____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		t__fk____column.setName(t__fk____column_name_prime);
		as2fk__as____source.setName(as2fk__as____source_name_prime);
		as2fk__fk____target.setName(as2fk__fk____target_name_prime);
		fk__u____reference.setName(fk__u____reference_name_prime);
		as__c____source.setName(as__c____source_name_prime);
		cd__as____associations.setName(cd__as____associations_name_prime);
		as__b____target.setName(as__b____target_name_prime);
		return new Object[] { ruleresult, t, as2fk, c, u, b, fk, as, cd, t__fk____column, as2fk__as____source,
				as2fk__fk____target, fk__u____reference, as__c____source, cd__as____associations, as__b____target };
	}

	public static final void pattern_association2column_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			association2column _this, PerformRuleResult ruleresult, EObject b2u, EObject c2t, EObject t, EObject as2fk,
			EObject db, EObject c, EObject u, EObject b, EObject fk, EObject as, EObject cd, EObject cd2db) {
		_this.registerObjects_FWD(ruleresult, b2u, c2t, t, as2fk, db, c, u, b, fk, as, cd, cd2db);

	}

	public static final PerformRuleResult pattern_association2column_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_association2column_2_1_preparereturnvalue_bindingFB(association2column _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_association2column_2_1_preparereturnvalue_blackFBB(EClass eClass,
			association2column _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_association2column_2_1_preparereturnvalue_bindingAndBlackFFB(
			association2column _this) {
		Object[] result_pattern_association2column_2_1_preparereturnvalue_binding = pattern_association2column_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_association2column_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_association2column_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_association2column_2_1_preparereturnvalue_black = pattern_association2column_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_association2column_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_association2column_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_association2column_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "association2column";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_association2column_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("c");
		EObject _localVariable_1 = match.getObject("b");
		EObject _localVariable_2 = match.getObject("as");
		EObject _localVariable_3 = match.getObject("cd");
		EObject tmpC = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpAs = _localVariable_2;
		EObject tmpCd = _localVariable_3;
		if (tmpC instanceof Clazz) {
			Clazz c = (Clazz) tmpC;
			if (tmpB instanceof Clazz) {
				Clazz b = (Clazz) tmpB;
				if (tmpAs instanceof Association) {
					Association as = (Association) tmpAs;
					if (tmpCd instanceof ClassDiagram) {
						ClassDiagram cd = (ClassDiagram) tmpCd;
						return new Object[] { c, b, as, cd, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_association2column_2_2_corematch_blackFFFFBFBBBFB(Clazz c, Clazz b,
			Association as, ClassDiagram cd, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(c)) {
			for (C2T b2u : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b, C2T.class, "source")) {
				Table u = b2u.getTarget();
				if (u != null) {
					for (C2T c2t : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, C2T.class,
							"source")) {
						if (!b2u.equals(c2t)) {
							Table t = c2t.getTarget();
							if (t != null) {
								if (!t.equals(u)) {
									for (CD2D cd2db : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(cd, CD2D.class, "source")) {
										DB db = cd2db.getTarget();
										if (db != null) {
											_result.add(
													new Object[] { b2u, c2t, t, db, c, u, b, as, cd, cd2db, match });
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

	public static final Iterable<Object[]> pattern_association2column_2_3_findcontext_blackBBBBBBBBBB(C2T b2u, C2T c2t,
			Table t, DB db, Clazz c, Table u, Clazz b, Association as, ClassDiagram cd, CD2D cd2db) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b2u.equals(c2t)) {
			if (!t.equals(u)) {
				if (!b.equals(c)) {
					if (db.getTable().contains(u)) {
						if (u.equals(b2u.getTarget())) {
							if (b.equals(b2u.getSource())) {
								if (db.getTable().contains(t)) {
									if (t.equals(c2t.getTarget())) {
										if (c.equals(c2t.getSource())) {
											if (c.equals(as.getSource())) {
												if (cd.getClasses().contains(c)) {
													if (cd.getAssociations().contains(as)) {
														if (cd.getClasses().contains(b)) {
															if (cd.equals(cd2db.getSource())) {
																if (b.equals(as.getTarget())) {
																	if (db.equals(cd2db.getTarget())) {
																		_result.add(new Object[] { b2u, c2t, t, db, c,
																				u, b, as, cd, cd2db });
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_association2column_2_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFF(C2T b2u,
			C2T c2t, Table t, DB db, Clazz c, Table u, Clazz b, Association as, ClassDiagram cd, CD2D cd2db) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge db__u____table = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2u__u____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2u__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge db__t____table = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2t__t____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2t__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge as__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd__c____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd__as____associations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd__b____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2db__cd____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge as__b____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2db__db____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String db__u____table_name_prime = "table";
		String b2u__u____target_name_prime = "target";
		String b2u__b____source_name_prime = "source";
		String db__t____table_name_prime = "table";
		String c2t__t____target_name_prime = "target";
		String c2t__c____source_name_prime = "source";
		String as__c____source_name_prime = "source";
		String cd__c____classes_name_prime = "classes";
		String cd__as____associations_name_prime = "associations";
		String cd__b____classes_name_prime = "classes";
		String cd2db__cd____source_name_prime = "source";
		String as__b____target_name_prime = "target";
		String cd2db__db____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(b2u);
		isApplicableMatch.getAllContextElements().add(c2t);
		isApplicableMatch.getAllContextElements().add(t);
		isApplicableMatch.getAllContextElements().add(db);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(u);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(as);
		isApplicableMatch.getAllContextElements().add(cd);
		isApplicableMatch.getAllContextElements().add(cd2db);
		db__u____table.setSrc(db);
		db__u____table.setTrg(u);
		isApplicableMatch.getAllContextElements().add(db__u____table);
		b2u__u____target.setSrc(b2u);
		b2u__u____target.setTrg(u);
		isApplicableMatch.getAllContextElements().add(b2u__u____target);
		b2u__b____source.setSrc(b2u);
		b2u__b____source.setTrg(b);
		isApplicableMatch.getAllContextElements().add(b2u__b____source);
		db__t____table.setSrc(db);
		db__t____table.setTrg(t);
		isApplicableMatch.getAllContextElements().add(db__t____table);
		c2t__t____target.setSrc(c2t);
		c2t__t____target.setTrg(t);
		isApplicableMatch.getAllContextElements().add(c2t__t____target);
		c2t__c____source.setSrc(c2t);
		c2t__c____source.setTrg(c);
		isApplicableMatch.getAllContextElements().add(c2t__c____source);
		as__c____source.setSrc(as);
		as__c____source.setTrg(c);
		isApplicableMatch.getAllContextElements().add(as__c____source);
		cd__c____classes.setSrc(cd);
		cd__c____classes.setTrg(c);
		isApplicableMatch.getAllContextElements().add(cd__c____classes);
		cd__as____associations.setSrc(cd);
		cd__as____associations.setTrg(as);
		isApplicableMatch.getAllContextElements().add(cd__as____associations);
		cd__b____classes.setSrc(cd);
		cd__b____classes.setTrg(b);
		isApplicableMatch.getAllContextElements().add(cd__b____classes);
		cd2db__cd____source.setSrc(cd2db);
		cd2db__cd____source.setTrg(cd);
		isApplicableMatch.getAllContextElements().add(cd2db__cd____source);
		as__b____target.setSrc(as);
		as__b____target.setTrg(b);
		isApplicableMatch.getAllContextElements().add(as__b____target);
		cd2db__db____target.setSrc(cd2db);
		cd2db__db____target.setTrg(db);
		isApplicableMatch.getAllContextElements().add(cd2db__db____target);
		db__u____table.setName(db__u____table_name_prime);
		b2u__u____target.setName(b2u__u____target_name_prime);
		b2u__b____source.setName(b2u__b____source_name_prime);
		db__t____table.setName(db__t____table_name_prime);
		c2t__t____target.setName(c2t__t____target_name_prime);
		c2t__c____source.setName(c2t__c____source_name_prime);
		as__c____source.setName(as__c____source_name_prime);
		cd__c____classes.setName(cd__c____classes_name_prime);
		cd__as____associations.setName(cd__as____associations_name_prime);
		cd__b____classes.setName(cd__b____classes_name_prime);
		cd2db__cd____source.setName(cd2db__cd____source_name_prime);
		as__b____target.setName(as__b____target_name_prime);
		cd2db__db____target.setName(cd2db__db____target_name_prime);
		return new Object[] { b2u, c2t, t, db, c, u, b, as, cd, cd2db, isApplicableMatch, db__u____table,
				b2u__u____target, b2u__b____source, db__t____table, c2t__t____target, c2t__c____source, as__c____source,
				cd__c____classes, cd__as____associations, cd__b____classes, cd2db__cd____source, as__b____target,
				cd2db__db____target };
	}

	public static final Object[] pattern_association2column_2_4_solveCSP_bindingFBBBBBBBBBBBB(association2column _this,
			IsApplicableMatch isApplicableMatch, C2T b2u, C2T c2t, Table t, DB db, Clazz c, Table u, Clazz b,
			Association as, ClassDiagram cd, CD2D cd2db) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, b2u, c2t, t, db, c, u, b, as, cd,
				cd2db);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, b2u, c2t, t, db, c, u, b, as, cd, cd2db };
		}
		return null;
	}

	public static final Object[] pattern_association2column_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_association2column_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			association2column _this, IsApplicableMatch isApplicableMatch, C2T b2u, C2T c2t, Table t, DB db, Clazz c,
			Table u, Clazz b, Association as, ClassDiagram cd, CD2D cd2db) {
		Object[] result_pattern_association2column_2_4_solveCSP_binding = pattern_association2column_2_4_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, b2u, c2t, t, db, c, u, b, as, cd, cd2db);
		if (result_pattern_association2column_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_association2column_2_4_solveCSP_binding[0];

			Object[] result_pattern_association2column_2_4_solveCSP_black = pattern_association2column_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_association2column_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, b2u, c2t, t, db, c, u, b, as, cd, cd2db };
			}
		}
		return null;
	}

	public static final boolean pattern_association2column_2_5_checkCSP_expressionFBB(association2column _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_association2column_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_association2column_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "association2column";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_association2column_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_association2column_10_1_initialbindings_blackBBBBBB(association2column _this,
			Match match, Table t, DB db, Table u, Column fk) {
		if (!t.equals(u)) {
			return new Object[] { _this, match, t, db, u, fk };
		}
		return null;
	}

	public static final Object[] pattern_association2column_10_2_SolveCSP_bindingFBBBBBB(association2column _this,
			Match match, Table t, DB db, Table u, Column fk) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, t, db, u, fk);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, t, db, u, fk };
		}
		return null;
	}

	public static final Object[] pattern_association2column_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_association2column_10_2_SolveCSP_bindingAndBlackFBBBBBB(
			association2column _this, Match match, Table t, DB db, Table u, Column fk) {
		Object[] result_pattern_association2column_10_2_SolveCSP_binding = pattern_association2column_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, t, db, u, fk);
		if (result_pattern_association2column_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_association2column_10_2_SolveCSP_binding[0];

			Object[] result_pattern_association2column_10_2_SolveCSP_black = pattern_association2column_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_association2column_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, t, db, u, fk };
			}
		}
		return null;
	}

	public static final boolean pattern_association2column_10_3_CheckCSP_expressionFBB(association2column _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_association2column_10_4_collectelementstobetranslated_blackBBBBB(Match match,
			Table t, DB db, Table u, Column fk) {
		if (!t.equals(u)) {
			return new Object[] { match, t, db, u, fk };
		}
		return null;
	}

	public static final Object[] pattern_association2column_10_4_collectelementstobetranslated_greenBBBBFF(Match match,
			Table t, Table u, Column fk) {
		EMoflonEdge t__fk____column = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fk__u____reference = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(fk);
		String t__fk____column_name_prime = "column";
		String fk__u____reference_name_prime = "reference";
		t__fk____column.setSrc(t);
		t__fk____column.setTrg(fk);
		match.getToBeTranslatedEdges().add(t__fk____column);
		fk__u____reference.setSrc(fk);
		fk__u____reference.setTrg(u);
		match.getToBeTranslatedEdges().add(fk__u____reference);
		t__fk____column.setName(t__fk____column_name_prime);
		fk__u____reference.setName(fk__u____reference_name_prime);
		return new Object[] { match, t, u, fk, t__fk____column, fk__u____reference };
	}

	public static final Object[] pattern_association2column_10_5_collectcontextelements_blackBBBBB(Match match, Table t,
			DB db, Table u, Column fk) {
		if (!t.equals(u)) {
			return new Object[] { match, t, db, u, fk };
		}
		return null;
	}

	public static final Object[] pattern_association2column_10_5_collectcontextelements_greenBBBBFF(Match match,
			Table t, DB db, Table u) {
		EMoflonEdge db__u____table = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge db__t____table = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(t);
		match.getContextNodes().add(db);
		match.getContextNodes().add(u);
		String db__u____table_name_prime = "table";
		String db__t____table_name_prime = "table";
		db__u____table.setSrc(db);
		db__u____table.setTrg(u);
		match.getContextEdges().add(db__u____table);
		db__t____table.setSrc(db);
		db__t____table.setTrg(t);
		match.getContextEdges().add(db__t____table);
		db__u____table.setName(db__u____table_name_prime);
		db__t____table.setName(db__t____table_name_prime);
		return new Object[] { match, t, db, u, db__u____table, db__t____table };
	}

	public static final void pattern_association2column_10_6_registerobjectstomatch_expressionBBBBBB(
			association2column _this, Match match, Table t, DB db, Table u, Column fk) {
		_this.registerObjectsToMatch_BWD(match, t, db, u, fk);

	}

	public static final boolean pattern_association2column_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_association2column_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_association2column_11_1_performtransformation_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("b2u");
		EObject _localVariable_1 = isApplicableMatch.getObject("c2t");
		EObject _localVariable_2 = isApplicableMatch.getObject("t");
		EObject _localVariable_3 = isApplicableMatch.getObject("db");
		EObject _localVariable_4 = isApplicableMatch.getObject("c");
		EObject _localVariable_5 = isApplicableMatch.getObject("u");
		EObject _localVariable_6 = isApplicableMatch.getObject("b");
		EObject _localVariable_7 = isApplicableMatch.getObject("fk");
		EObject _localVariable_8 = isApplicableMatch.getObject("cd");
		EObject _localVariable_9 = isApplicableMatch.getObject("cd2db");
		EObject tmpB2u = _localVariable_0;
		EObject tmpC2t = _localVariable_1;
		EObject tmpT = _localVariable_2;
		EObject tmpDb = _localVariable_3;
		EObject tmpC = _localVariable_4;
		EObject tmpU = _localVariable_5;
		EObject tmpB = _localVariable_6;
		EObject tmpFk = _localVariable_7;
		EObject tmpCd = _localVariable_8;
		EObject tmpCd2db = _localVariable_9;
		if (tmpB2u instanceof C2T) {
			C2T b2u = (C2T) tmpB2u;
			if (tmpC2t instanceof C2T) {
				C2T c2t = (C2T) tmpC2t;
				if (tmpT instanceof Table) {
					Table t = (Table) tmpT;
					if (tmpDb instanceof DB) {
						DB db = (DB) tmpDb;
						if (tmpC instanceof Clazz) {
							Clazz c = (Clazz) tmpC;
							if (tmpU instanceof Table) {
								Table u = (Table) tmpU;
								if (tmpB instanceof Clazz) {
									Clazz b = (Clazz) tmpB;
									if (tmpFk instanceof Column) {
										Column fk = (Column) tmpFk;
										if (tmpCd instanceof ClassDiagram) {
											ClassDiagram cd = (ClassDiagram) tmpCd;
											if (tmpCd2db instanceof CD2D) {
												CD2D cd2db = (CD2D) tmpCd2db;
												return new Object[] { b2u, c2t, t, db, c, u, b, fk, cd, cd2db,
														isApplicableMatch };
											}
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

	public static final Object[] pattern_association2column_11_1_performtransformation_blackBBBBBBBBBBFBB(C2T b2u,
			C2T c2t, Table t, DB db, Clazz c, Table u, Clazz b, Column fk, ClassDiagram cd, CD2D cd2db,
			association2column _this, IsApplicableMatch isApplicableMatch) {
		if (!b2u.equals(c2t)) {
			if (!t.equals(u)) {
				if (!b.equals(c)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { b2u, c2t, t, db, c, u, b, fk, cd, cd2db, csp, _this,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_association2column_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(
			association2column _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_association2column_11_1_performtransformation_binding = pattern_association2column_11_1_performtransformation_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_association2column_11_1_performtransformation_binding != null) {
			C2T b2u = (C2T) result_pattern_association2column_11_1_performtransformation_binding[0];
			C2T c2t = (C2T) result_pattern_association2column_11_1_performtransformation_binding[1];
			Table t = (Table) result_pattern_association2column_11_1_performtransformation_binding[2];
			DB db = (DB) result_pattern_association2column_11_1_performtransformation_binding[3];
			Clazz c = (Clazz) result_pattern_association2column_11_1_performtransformation_binding[4];
			Table u = (Table) result_pattern_association2column_11_1_performtransformation_binding[5];
			Clazz b = (Clazz) result_pattern_association2column_11_1_performtransformation_binding[6];
			Column fk = (Column) result_pattern_association2column_11_1_performtransformation_binding[7];
			ClassDiagram cd = (ClassDiagram) result_pattern_association2column_11_1_performtransformation_binding[8];
			CD2D cd2db = (CD2D) result_pattern_association2column_11_1_performtransformation_binding[9];

			Object[] result_pattern_association2column_11_1_performtransformation_black = pattern_association2column_11_1_performtransformation_blackBBBBBBBBBBFBB(
					b2u, c2t, t, db, c, u, b, fk, cd, cd2db, _this, isApplicableMatch);
			if (result_pattern_association2column_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_association2column_11_1_performtransformation_black[10];

				return new Object[] { b2u, c2t, t, db, c, u, b, fk, cd, cd2db, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_association2column_11_1_performtransformation_greenFBBBFB(Clazz c, Clazz b,
			Column fk, ClassDiagram cd) {
		AS2C as2fk = Class2databaseFactory.eINSTANCE.createAS2C();
		Association as = ClassFactory.eINSTANCE.createAssociation();
		as2fk.setTarget(fk);
		as2fk.setSource(as);
		as.setSource(c);
		cd.getAssociations().add(as);
		as.setTarget(b);
		return new Object[] { as2fk, c, b, fk, as, cd };
	}

	public static final Object[] pattern_association2column_11_2_collecttranslatedelements_blackBBB(AS2C as2fk,
			Column fk, Association as) {
		return new Object[] { as2fk, fk, as };
	}

	public static final Object[] pattern_association2column_11_2_collecttranslatedelements_greenFBBB(AS2C as2fk,
			Column fk, Association as) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(as2fk);
		ruleresult.getTranslatedElements().add(fk);
		ruleresult.getCreatedElements().add(as);
		return new Object[] { ruleresult, as2fk, fk, as };
	}

	public static final Object[] pattern_association2column_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject b2u, EObject c2t, EObject t, EObject as2fk, EObject db, EObject c,
			EObject u, EObject b, EObject fk, EObject as, EObject cd, EObject cd2db) {
		if (!b2u.equals(c2t)) {
			if (!b2u.equals(t)) {
				if (!b2u.equals(db)) {
					if (!b2u.equals(c)) {
						if (!b2u.equals(u)) {
							if (!b2u.equals(fk)) {
								if (!b2u.equals(cd)) {
									if (!b2u.equals(cd2db)) {
										if (!c2t.equals(t)) {
											if (!c2t.equals(db)) {
												if (!c2t.equals(u)) {
													if (!c2t.equals(fk)) {
														if (!c2t.equals(cd)) {
															if (!c2t.equals(cd2db)) {
																if (!t.equals(u)) {
																	if (!as2fk.equals(b2u)) {
																		if (!as2fk.equals(c2t)) {
																			if (!as2fk.equals(t)) {
																				if (!as2fk.equals(db)) {
																					if (!as2fk.equals(c)) {
																						if (!as2fk.equals(u)) {
																							if (!as2fk.equals(b)) {
																								if (!as2fk.equals(fk)) {
																									if (!as2fk.equals(
																											cd)) {
																										if (!as2fk
																												.equals(cd2db)) {
																											if (!db.equals(
																													t)) {
																												if (!db.equals(
																														u)) {
																													if (!db.equals(
																															fk)) {
																														if (!c.equals(
																																c2t)) {
																															if (!c.equals(
																																	t)) {
																																if (!c.equals(
																																		db)) {
																																	if (!c.equals(
																																			u)) {
																																		if (!c.equals(
																																				fk)) {
																																			if (!c.equals(
																																					cd)) {
																																				if (!c.equals(
																																						cd2db)) {
																																					if (!b.equals(
																																							b2u)) {
																																						if (!b.equals(
																																								c2t)) {
																																							if (!b.equals(
																																									t)) {
																																								if (!b.equals(
																																										db)) {
																																									if (!b.equals(
																																											c)) {
																																										if (!b.equals(
																																												u)) {
																																											if (!b.equals(
																																													fk)) {
																																												if (!b.equals(
																																														cd)) {
																																													if (!b.equals(
																																															cd2db)) {
																																														if (!fk.equals(
																																																t)) {
																																															if (!fk.equals(
																																																	u)) {
																																																if (!as.equals(
																																																		b2u)) {
																																																	if (!as.equals(
																																																			c2t)) {
																																																		if (!as.equals(
																																																				t)) {
																																																			if (!as.equals(
																																																					as2fk)) {
																																																				if (!as.equals(
																																																						db)) {
																																																					if (!as.equals(
																																																							c)) {
																																																						if (!as.equals(
																																																								u)) {
																																																							if (!as.equals(
																																																									b)) {
																																																								if (!as.equals(
																																																										fk)) {
																																																									if (!as.equals(
																																																											cd)) {
																																																										if (!as.equals(
																																																												cd2db)) {
																																																											if (!cd.equals(
																																																													t)) {
																																																												if (!cd.equals(
																																																														db)) {
																																																													if (!cd.equals(
																																																															u)) {
																																																														if (!cd.equals(
																																																																fk)) {
																																																															if (!cd.equals(
																																																																	cd2db)) {
																																																																if (!cd2db
																																																																		.equals(t)) {
																																																																	if (!cd2db
																																																																			.equals(db)) {
																																																																		if (!cd2db
																																																																				.equals(u)) {
																																																																			if (!cd2db
																																																																					.equals(fk)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						b2u,
																																																																						c2t,
																																																																						t,
																																																																						as2fk,
																																																																						db,
																																																																						c,
																																																																						u,
																																																																						b,
																																																																						fk,
																																																																						as,
																																																																						cd,
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
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_association2column_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject t, EObject as2fk, EObject c, EObject u, EObject b, EObject fk,
			EObject as, EObject cd) {
		EMoflonEdge t__fk____column = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge as2fk__as____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge as2fk__fk____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fk__u____reference = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge as__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd__as____associations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge as__b____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "association2column";
		String t__fk____column_name_prime = "column";
		String as2fk__as____source_name_prime = "source";
		String as2fk__fk____target_name_prime = "target";
		String fk__u____reference_name_prime = "reference";
		String as__c____source_name_prime = "source";
		String cd__as____associations_name_prime = "associations";
		String as__b____target_name_prime = "target";
		t__fk____column.setSrc(t);
		t__fk____column.setTrg(fk);
		ruleresult.getTranslatedEdges().add(t__fk____column);
		as2fk__as____source.setSrc(as2fk);
		as2fk__as____source.setTrg(as);
		ruleresult.getCreatedEdges().add(as2fk__as____source);
		as2fk__fk____target.setSrc(as2fk);
		as2fk__fk____target.setTrg(fk);
		ruleresult.getCreatedEdges().add(as2fk__fk____target);
		fk__u____reference.setSrc(fk);
		fk__u____reference.setTrg(u);
		ruleresult.getTranslatedEdges().add(fk__u____reference);
		as__c____source.setSrc(as);
		as__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(as__c____source);
		cd__as____associations.setSrc(cd);
		cd__as____associations.setTrg(as);
		ruleresult.getCreatedEdges().add(cd__as____associations);
		as__b____target.setSrc(as);
		as__b____target.setTrg(b);
		ruleresult.getCreatedEdges().add(as__b____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		t__fk____column.setName(t__fk____column_name_prime);
		as2fk__as____source.setName(as2fk__as____source_name_prime);
		as2fk__fk____target.setName(as2fk__fk____target_name_prime);
		fk__u____reference.setName(fk__u____reference_name_prime);
		as__c____source.setName(as__c____source_name_prime);
		cd__as____associations.setName(cd__as____associations_name_prime);
		as__b____target.setName(as__b____target_name_prime);
		return new Object[] { ruleresult, t, as2fk, c, u, b, fk, as, cd, t__fk____column, as2fk__as____source,
				as2fk__fk____target, fk__u____reference, as__c____source, cd__as____associations, as__b____target };
	}

	public static final void pattern_association2column_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			association2column _this, PerformRuleResult ruleresult, EObject b2u, EObject c2t, EObject t, EObject as2fk,
			EObject db, EObject c, EObject u, EObject b, EObject fk, EObject as, EObject cd, EObject cd2db) {
		_this.registerObjects_BWD(ruleresult, b2u, c2t, t, as2fk, db, c, u, b, fk, as, cd, cd2db);

	}

	public static final PerformRuleResult pattern_association2column_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_association2column_12_1_preparereturnvalue_bindingFB(
			association2column _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_association2column_12_1_preparereturnvalue_blackFBB(EClass eClass,
			association2column _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_association2column_12_1_preparereturnvalue_bindingAndBlackFFB(
			association2column _this) {
		Object[] result_pattern_association2column_12_1_preparereturnvalue_binding = pattern_association2column_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_association2column_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_association2column_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_association2column_12_1_preparereturnvalue_black = pattern_association2column_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_association2column_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_association2column_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_association2column_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "association2column";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_association2column_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("t");
		EObject _localVariable_1 = match.getObject("db");
		EObject _localVariable_2 = match.getObject("u");
		EObject _localVariable_3 = match.getObject("fk");
		EObject tmpT = _localVariable_0;
		EObject tmpDb = _localVariable_1;
		EObject tmpU = _localVariable_2;
		EObject tmpFk = _localVariable_3;
		if (tmpT instanceof Table) {
			Table t = (Table) tmpT;
			if (tmpDb instanceof DB) {
				DB db = (DB) tmpDb;
				if (tmpU instanceof Table) {
					Table u = (Table) tmpU;
					if (tmpFk instanceof Column) {
						Column fk = (Column) tmpFk;
						return new Object[] { t, db, u, fk, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_association2column_12_2_corematch_blackFFBBFBFBFFB(Table t, DB db,
			Table u, Column fk, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!t.equals(u)) {
			for (C2T b2u : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(u, C2T.class, "target")) {
				Clazz b = b2u.getSource();
				if (b != null) {
					for (C2T c2t : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(t, C2T.class,
							"target")) {
						if (!b2u.equals(c2t)) {
							Clazz c = c2t.getSource();
							if (c != null) {
								if (!b.equals(c)) {
									for (CD2D cd2db : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(db, CD2D.class, "target")) {
										ClassDiagram cd = cd2db.getSource();
										if (cd != null) {
											_result.add(
													new Object[] { b2u, c2t, t, db, c, u, b, fk, cd, cd2db, match });
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

	public static final Iterable<Object[]> pattern_association2column_12_3_findcontext_blackBBBBBBBBBB(C2T b2u, C2T c2t,
			Table t, DB db, Clazz c, Table u, Clazz b, Column fk, ClassDiagram cd, CD2D cd2db) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b2u.equals(c2t)) {
			if (!t.equals(u)) {
				if (!b.equals(c)) {
					if (t.getColumn().contains(fk)) {
						if (db.getTable().contains(u)) {
							if (u.equals(b2u.getTarget())) {
								if (b.equals(b2u.getSource())) {
									if (db.getTable().contains(t)) {
										if (t.equals(c2t.getTarget())) {
											if (u.equals(fk.getReference())) {
												if (c.equals(c2t.getSource())) {
													if (cd.getClasses().contains(c)) {
														if (cd.getClasses().contains(b)) {
															if (cd.equals(cd2db.getSource())) {
																if (db.equals(cd2db.getTarget())) {
																	_result.add(new Object[] { b2u, c2t, t, db, c, u, b,
																			fk, cd, cd2db });
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_association2column_12_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFF(C2T b2u,
			C2T c2t, Table t, DB db, Clazz c, Table u, Clazz b, Column fk, ClassDiagram cd, CD2D cd2db) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge t__fk____column = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge db__u____table = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2u__u____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2u__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge db__t____table = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2t__t____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fk__u____reference = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2t__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd__c____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd__b____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2db__cd____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2db__db____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String t__fk____column_name_prime = "column";
		String db__u____table_name_prime = "table";
		String b2u__u____target_name_prime = "target";
		String b2u__b____source_name_prime = "source";
		String db__t____table_name_prime = "table";
		String c2t__t____target_name_prime = "target";
		String fk__u____reference_name_prime = "reference";
		String c2t__c____source_name_prime = "source";
		String cd__c____classes_name_prime = "classes";
		String cd__b____classes_name_prime = "classes";
		String cd2db__cd____source_name_prime = "source";
		String cd2db__db____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(b2u);
		isApplicableMatch.getAllContextElements().add(c2t);
		isApplicableMatch.getAllContextElements().add(t);
		isApplicableMatch.getAllContextElements().add(db);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(u);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(fk);
		isApplicableMatch.getAllContextElements().add(cd);
		isApplicableMatch.getAllContextElements().add(cd2db);
		t__fk____column.setSrc(t);
		t__fk____column.setTrg(fk);
		isApplicableMatch.getAllContextElements().add(t__fk____column);
		db__u____table.setSrc(db);
		db__u____table.setTrg(u);
		isApplicableMatch.getAllContextElements().add(db__u____table);
		b2u__u____target.setSrc(b2u);
		b2u__u____target.setTrg(u);
		isApplicableMatch.getAllContextElements().add(b2u__u____target);
		b2u__b____source.setSrc(b2u);
		b2u__b____source.setTrg(b);
		isApplicableMatch.getAllContextElements().add(b2u__b____source);
		db__t____table.setSrc(db);
		db__t____table.setTrg(t);
		isApplicableMatch.getAllContextElements().add(db__t____table);
		c2t__t____target.setSrc(c2t);
		c2t__t____target.setTrg(t);
		isApplicableMatch.getAllContextElements().add(c2t__t____target);
		fk__u____reference.setSrc(fk);
		fk__u____reference.setTrg(u);
		isApplicableMatch.getAllContextElements().add(fk__u____reference);
		c2t__c____source.setSrc(c2t);
		c2t__c____source.setTrg(c);
		isApplicableMatch.getAllContextElements().add(c2t__c____source);
		cd__c____classes.setSrc(cd);
		cd__c____classes.setTrg(c);
		isApplicableMatch.getAllContextElements().add(cd__c____classes);
		cd__b____classes.setSrc(cd);
		cd__b____classes.setTrg(b);
		isApplicableMatch.getAllContextElements().add(cd__b____classes);
		cd2db__cd____source.setSrc(cd2db);
		cd2db__cd____source.setTrg(cd);
		isApplicableMatch.getAllContextElements().add(cd2db__cd____source);
		cd2db__db____target.setSrc(cd2db);
		cd2db__db____target.setTrg(db);
		isApplicableMatch.getAllContextElements().add(cd2db__db____target);
		t__fk____column.setName(t__fk____column_name_prime);
		db__u____table.setName(db__u____table_name_prime);
		b2u__u____target.setName(b2u__u____target_name_prime);
		b2u__b____source.setName(b2u__b____source_name_prime);
		db__t____table.setName(db__t____table_name_prime);
		c2t__t____target.setName(c2t__t____target_name_prime);
		fk__u____reference.setName(fk__u____reference_name_prime);
		c2t__c____source.setName(c2t__c____source_name_prime);
		cd__c____classes.setName(cd__c____classes_name_prime);
		cd__b____classes.setName(cd__b____classes_name_prime);
		cd2db__cd____source.setName(cd2db__cd____source_name_prime);
		cd2db__db____target.setName(cd2db__db____target_name_prime);
		return new Object[] { b2u, c2t, t, db, c, u, b, fk, cd, cd2db, isApplicableMatch, t__fk____column,
				db__u____table, b2u__u____target, b2u__b____source, db__t____table, c2t__t____target,
				fk__u____reference, c2t__c____source, cd__c____classes, cd__b____classes, cd2db__cd____source,
				cd2db__db____target };
	}

	public static final Object[] pattern_association2column_12_4_solveCSP_bindingFBBBBBBBBBBBB(association2column _this,
			IsApplicableMatch isApplicableMatch, C2T b2u, C2T c2t, Table t, DB db, Clazz c, Table u, Clazz b, Column fk,
			ClassDiagram cd, CD2D cd2db) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, b2u, c2t, t, db, c, u, b, fk, cd,
				cd2db);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, b2u, c2t, t, db, c, u, b, fk, cd, cd2db };
		}
		return null;
	}

	public static final Object[] pattern_association2column_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_association2column_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			association2column _this, IsApplicableMatch isApplicableMatch, C2T b2u, C2T c2t, Table t, DB db, Clazz c,
			Table u, Clazz b, Column fk, ClassDiagram cd, CD2D cd2db) {
		Object[] result_pattern_association2column_12_4_solveCSP_binding = pattern_association2column_12_4_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, b2u, c2t, t, db, c, u, b, fk, cd, cd2db);
		if (result_pattern_association2column_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_association2column_12_4_solveCSP_binding[0];

			Object[] result_pattern_association2column_12_4_solveCSP_black = pattern_association2column_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_association2column_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, b2u, c2t, t, db, c, u, b, fk, cd, cd2db };
			}
		}
		return null;
	}

	public static final boolean pattern_association2column_12_5_checkCSP_expressionFBB(association2column _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_association2column_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_association2column_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "association2column";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_association2column_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_association2column_20_1_preparereturnvalue_bindingFB(
			association2column _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_association2column_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			association2column _this) {
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

	public static final Object[] pattern_association2column_20_1_preparereturnvalue_bindingAndBlackFFBF(
			association2column _this) {
		Object[] result_pattern_association2column_20_1_preparereturnvalue_binding = pattern_association2column_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_association2column_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_association2column_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_association2column_20_1_preparereturnvalue_black = pattern_association2column_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_association2column_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_association2column_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_association2column_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_association2column_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_association2column_20_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_column) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpT = _edge_column.getSrc();
		if (tmpT instanceof Table) {
			Table t = (Table) tmpT;
			EObject tmpFk = _edge_column.getTrg();
			if (tmpFk instanceof Column) {
				Column fk = (Column) tmpFk;
				if (t.getColumn().contains(fk)) {
					Table u = fk.getReference();
					if (u != null) {
						if (!t.equals(u)) {
							for (DB db : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(t, DB.class,
									"table")) {
								if (db.getTable().contains(u)) {
									_result.add(new Object[] { t, db, u, fk, _edge_column });
								}
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_association2column_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_association2column_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			association2column _this, Match match, Table t, DB db, Table u, Column fk) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, t, db, u, fk);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_association2column_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			association2column _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_association2column_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_association2column_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_association2column_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_association2column_21_1_preparereturnvalue_bindingFB(
			association2column _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_association2column_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			association2column _this) {
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

	public static final Object[] pattern_association2column_21_1_preparereturnvalue_bindingAndBlackFFBF(
			association2column _this) {
		Object[] result_pattern_association2column_21_1_preparereturnvalue_binding = pattern_association2column_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_association2column_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_association2column_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_association2column_21_1_preparereturnvalue_black = pattern_association2column_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_association2column_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_association2column_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_association2column_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_association2column_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_association2column_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_source) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpAs = _edge_source.getSrc();
		if (tmpAs instanceof Association) {
			Association as = (Association) tmpAs;
			EObject tmpC = _edge_source.getTrg();
			if (tmpC instanceof Clazz) {
				Clazz c = (Clazz) tmpC;
				if (c.equals(as.getSource())) {
					Clazz b = as.getTarget();
					if (b != null) {
						if (!b.equals(c)) {
							for (ClassDiagram cd : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(as, ClassDiagram.class, "associations")) {
								if (cd.getClasses().contains(c)) {
									if (cd.getClasses().contains(b)) {
										_result.add(new Object[] { c, b, as, cd, _edge_source });
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

	public static final Object[] pattern_association2column_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_association2column_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			association2column _this, Match match, Clazz c, Clazz b, Association as, ClassDiagram cd) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, c, b, as, cd);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_association2column_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			association2column _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_association2column_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_association2column_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_association2column_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_association2column_24_1_prepare_blackB(association2column _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_association2column_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_association2column_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("t");
		EObject _localVariable_1 = targetMatch.getObject("db");
		EObject _localVariable_2 = sourceMatch.getObject("c");
		EObject _localVariable_3 = targetMatch.getObject("u");
		EObject _localVariable_4 = sourceMatch.getObject("b");
		EObject _localVariable_5 = targetMatch.getObject("fk");
		EObject _localVariable_6 = sourceMatch.getObject("as");
		EObject _localVariable_7 = sourceMatch.getObject("cd");
		EObject tmpT = _localVariable_0;
		EObject tmpDb = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpU = _localVariable_3;
		EObject tmpB = _localVariable_4;
		EObject tmpFk = _localVariable_5;
		EObject tmpAs = _localVariable_6;
		EObject tmpCd = _localVariable_7;
		if (tmpT instanceof Table) {
			Table t = (Table) tmpT;
			if (tmpDb instanceof DB) {
				DB db = (DB) tmpDb;
				if (tmpC instanceof Clazz) {
					Clazz c = (Clazz) tmpC;
					if (tmpU instanceof Table) {
						Table u = (Table) tmpU;
						if (tmpB instanceof Clazz) {
							Clazz b = (Clazz) tmpB;
							if (tmpFk instanceof Column) {
								Column fk = (Column) tmpFk;
								if (tmpAs instanceof Association) {
									Association as = (Association) tmpAs;
									if (tmpCd instanceof ClassDiagram) {
										ClassDiagram cd = (ClassDiagram) tmpCd;
										return new Object[] { t, db, c, u, b, fk, as, cd, targetMatch, sourceMatch };
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

	public static final Object[] pattern_association2column_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Table t, DB db,
			Clazz c, Table u, Clazz b, Column fk, Association as, ClassDiagram cd, Match sourceMatch,
			Match targetMatch) {
		if (!t.equals(u)) {
			if (!b.equals(c)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { t, db, c, u, b, fk, as, cd, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_association2column_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_association2column_24_2_matchsrctrgcontext_binding = pattern_association2column_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_association2column_24_2_matchsrctrgcontext_binding != null) {
			Table t = (Table) result_pattern_association2column_24_2_matchsrctrgcontext_binding[0];
			DB db = (DB) result_pattern_association2column_24_2_matchsrctrgcontext_binding[1];
			Clazz c = (Clazz) result_pattern_association2column_24_2_matchsrctrgcontext_binding[2];
			Table u = (Table) result_pattern_association2column_24_2_matchsrctrgcontext_binding[3];
			Clazz b = (Clazz) result_pattern_association2column_24_2_matchsrctrgcontext_binding[4];
			Column fk = (Column) result_pattern_association2column_24_2_matchsrctrgcontext_binding[5];
			Association as = (Association) result_pattern_association2column_24_2_matchsrctrgcontext_binding[6];
			ClassDiagram cd = (ClassDiagram) result_pattern_association2column_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_association2column_24_2_matchsrctrgcontext_black = pattern_association2column_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					t, db, c, u, b, fk, as, cd, sourceMatch, targetMatch);
			if (result_pattern_association2column_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { t, db, c, u, b, fk, as, cd, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_association2column_24_3_solvecsp_bindingFBBBBBBBBBBB(association2column _this,
			Table t, DB db, Clazz c, Table u, Clazz b, Column fk, Association as, ClassDiagram cd, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(t, db, c, u, b, fk, as, cd, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, t, db, c, u, b, fk, as, cd, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_association2column_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_association2column_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			association2column _this, Table t, DB db, Clazz c, Table u, Clazz b, Column fk, Association as,
			ClassDiagram cd, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_association2column_24_3_solvecsp_binding = pattern_association2column_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, t, db, c, u, b, fk, as, cd, sourceMatch, targetMatch);
		if (result_pattern_association2column_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_association2column_24_3_solvecsp_binding[0];

			Object[] result_pattern_association2column_24_3_solvecsp_black = pattern_association2column_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_association2column_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, t, db, c, u, b, fk, as, cd, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_association2column_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_association2column_24_5_matchcorrcontext_blackFFBBBBBBFBB(Table t,
			DB db, Clazz c, Table u, Clazz b, ClassDiagram cd, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!t.equals(u)) {
			if (!b.equals(c)) {
				if (!sourceMatch.equals(targetMatch)) {
					for (C2T b2u : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(u, C2T.class,
							"target")) {
						if (b.equals(b2u.getSource())) {
							for (C2T c2t : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(t,
									C2T.class, "target")) {
								if (!b2u.equals(c2t)) {
									if (c.equals(c2t.getSource())) {
										for (CD2D cd2db : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(cd, CD2D.class, "source")) {
											if (db.equals(cd2db.getTarget())) {
												_result.add(new Object[] { b2u, c2t, t, db, c, u, b, cd, cd2db,
														sourceMatch, targetMatch });
											}
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

	public static final Object[] pattern_association2column_24_5_matchcorrcontext_greenBBBBBF(C2T b2u, C2T c2t,
			CD2D cd2db, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "association2column";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(b2u);
		ccMatch.getAllContextElements().add(c2t);
		ccMatch.getAllContextElements().add(cd2db);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { b2u, c2t, cd2db, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_association2column_24_6_createcorrespondence_blackBBBBBBBBB(Table t, DB db,
			Clazz c, Table u, Clazz b, Column fk, Association as, ClassDiagram cd, CCMatch ccMatch) {
		if (!t.equals(u)) {
			if (!b.equals(c)) {
				return new Object[] { t, db, c, u, b, fk, as, cd, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_association2column_24_6_createcorrespondence_greenFBBB(Column fk,
			Association as, CCMatch ccMatch) {
		AS2C as2fk = Class2databaseFactory.eINSTANCE.createAS2C();
		as2fk.setSource(as);
		as2fk.setTarget(fk);
		ccMatch.getCreateCorr().add(as2fk);
		return new Object[] { as2fk, fk, as, ccMatch };
	}

	public static final Object[] pattern_association2column_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_association2column_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "association2column";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_association2column_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_association2column_27_1_matchtggpattern_blackBBBB(Clazz c, Clazz b,
			Association as, ClassDiagram cd) {
		if (!b.equals(c)) {
			if (c.equals(as.getSource())) {
				if (cd.getClasses().contains(c)) {
					if (cd.getAssociations().contains(as)) {
						if (cd.getClasses().contains(b)) {
							if (b.equals(as.getTarget())) {
								return new Object[] { c, b, as, cd };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_association2column_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_association2column_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_association2column_28_1_matchtggpattern_blackBBBB(Table t, DB db, Table u,
			Column fk) {
		if (!t.equals(u)) {
			if (t.getColumn().contains(fk)) {
				if (db.getTable().contains(u)) {
					if (db.getTable().contains(t)) {
						if (u.equals(fk.getReference())) {
							return new Object[] { t, db, u, fk };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_association2column_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_association2column_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_association2column_29_1_createresult_blackB(association2column _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_association2column_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_association2column_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, C2T b2u) {
		if (ruleResult.getCorrObjects().contains(b2u)) {
			return new Object[] { ruleResult, b2u };
		}
		return null;
	}

	public static final Object[] pattern_association2column_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Table u) {
		if (ruleResult.getTargetObjects().contains(u)) {
			return new Object[] { ruleResult, u };
		}
		return null;
	}

	public static final Object[] pattern_association2column_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, DB db) {
		if (ruleResult.getTargetObjects().contains(db)) {
			return new Object[] { ruleResult, db };
		}
		return null;
	}

	public static final Object[] pattern_association2column_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Table t) {
		if (ruleResult.getTargetObjects().contains(t)) {
			return new Object[] { ruleResult, t };
		}
		return null;
	}

	public static final Object[] pattern_association2column_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, C2T c2t) {
		if (ruleResult.getCorrObjects().contains(c2t)) {
			return new Object[] { ruleResult, c2t };
		}
		return null;
	}

	public static final Object[] pattern_association2column_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Clazz c) {
		if (ruleResult.getSourceObjects().contains(c)) {
			return new Object[] { ruleResult, c };
		}
		return null;
	}

	public static final Object[] pattern_association2column_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, ClassDiagram cd) {
		if (ruleResult.getSourceObjects().contains(cd)) {
			return new Object[] { ruleResult, cd };
		}
		return null;
	}

	public static final Object[] pattern_association2column_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, Clazz b) {
		if (ruleResult.getSourceObjects().contains(b)) {
			return new Object[] { ruleResult, b };
		}
		return null;
	}

	public static final Object[] pattern_association2column_29_2_isapplicablecore_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, CD2D cd2db) {
		if (ruleResult.getCorrObjects().contains(cd2db)) {
			return new Object[] { ruleResult, cd2db };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_association2column_29_2_isapplicablecore_blackFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList b2uList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpB2u : b2uList.getEntryObjects()) {
				if (tmpB2u instanceof C2T) {
					C2T b2u = (C2T) tmpB2u;
					Table u = b2u.getTarget();
					if (u != null) {
						Clazz b = b2u.getSource();
						if (b != null) {
							if (pattern_association2column_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									b2u) == null) {
								if (pattern_association2column_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										u) == null) {
									if (pattern_association2column_29_2_isapplicablecore_black_nac_7BB(ruleResult,
											b) == null) {
										for (DB db : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(u, DB.class, "table")) {
											if (pattern_association2column_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, db) == null) {
												for (Table t : db.getTable()) {
													if (!t.equals(u)) {
														if (pattern_association2column_29_2_isapplicablecore_black_nac_3BB(
																ruleResult, t) == null) {
															for (ClassDiagram cd : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(b, ClassDiagram.class,
																			"classes")) {
																if (pattern_association2column_29_2_isapplicablecore_black_nac_6BB(
																		ruleResult, cd) == null) {
																	for (Clazz c : cd.getClasses()) {
																		if (!b.equals(c)) {
																			if (pattern_association2column_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult, c) == null) {
																				for (CD2D cd2db : org.moflon.core.utilities.eMoflonEMFUtil
																						.getOppositeReferenceTyped(db,
																								CD2D.class, "target")) {
																					if (cd.equals(cd2db.getSource())) {
																						if (pattern_association2column_29_2_isapplicablecore_black_nac_8BB(
																								ruleResult,
																								cd2db) == null) {
																							for (C2T c2t : org.moflon.core.utilities.eMoflonEMFUtil
																									.getOppositeReferenceTyped(
																											t,
																											C2T.class,
																											"target")) {
																								if (!b2u.equals(c2t)) {
																									if (c.equals(c2t
																											.getSource())) {
																										if (pattern_association2column_29_2_isapplicablecore_black_nac_4BB(
																												ruleResult,
																												c2t) == null) {
																											_result.add(
																													new Object[] {
																															b2uList,
																															b2u,
																															u,
																															db,
																															t,
																															c2t,
																															c,
																															cd,
																															b,
																															cd2db,
																															ruleEntryContainer,
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
											}
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

	public static final Object[] pattern_association2column_29_3_solveCSP_bindingFBBBBBBBBBBBB(association2column _this,
			IsApplicableMatch isApplicableMatch, C2T b2u, C2T c2t, Table t, DB db, Clazz c, Table u, Clazz b,
			ClassDiagram cd, CD2D cd2db, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, b2u, c2t, t, db, c, u, b, cd, cd2db,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, b2u, c2t, t, db, c, u, b, cd, cd2db, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_association2column_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_association2column_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			association2column _this, IsApplicableMatch isApplicableMatch, C2T b2u, C2T c2t, Table t, DB db, Clazz c,
			Table u, Clazz b, ClassDiagram cd, CD2D cd2db, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_association2column_29_3_solveCSP_binding = pattern_association2column_29_3_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, b2u, c2t, t, db, c, u, b, cd, cd2db, ruleResult);
		if (result_pattern_association2column_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_association2column_29_3_solveCSP_binding[0];

			Object[] result_pattern_association2column_29_3_solveCSP_black = pattern_association2column_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_association2column_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, b2u, c2t, t, db, c, u, b, cd, cd2db, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_association2column_29_4_checkCSP_expressionFBB(association2column _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_association2column_29_5_checknacs_blackBBBBBBBBB(C2T b2u, C2T c2t, Table t,
			DB db, Clazz c, Table u, Clazz b, ClassDiagram cd, CD2D cd2db) {
		if (!b2u.equals(c2t)) {
			if (!t.equals(u)) {
				if (!b.equals(c)) {
					return new Object[] { b2u, c2t, t, db, c, u, b, cd, cd2db };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_association2column_29_6_perform_blackBBBBBBBBBB(C2T b2u, C2T c2t, Table t,
			DB db, Clazz c, Table u, Clazz b, ClassDiagram cd, CD2D cd2db, ModelgeneratorRuleResult ruleResult) {
		if (!b2u.equals(c2t)) {
			if (!t.equals(u)) {
				if (!b.equals(c)) {
					return new Object[] { b2u, c2t, t, db, c, u, b, cd, cd2db, ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_association2column_29_6_perform_greenBFBBBFFBB(Table t, Clazz c, Table u,
			Clazz b, ClassDiagram cd, ModelgeneratorRuleResult ruleResult) {
		AS2C as2fk = Class2databaseFactory.eINSTANCE.createAS2C();
		Column fk = DatabaseFactory.eINSTANCE.createColumn();
		Association as = ClassFactory.eINSTANCE.createAssociation();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(as2fk);
		t.getColumn().add(fk);
		as2fk.setTarget(fk);
		fk.setReference(u);
		ruleResult.getTargetObjects().add(fk);
		as2fk.setSource(as);
		as.setSource(c);
		cd.getAssociations().add(as);
		as.setTarget(b);
		ruleResult.getSourceObjects().add(as);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { t, as2fk, c, u, b, fk, as, cd, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_association2column_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //association2columnImpl
