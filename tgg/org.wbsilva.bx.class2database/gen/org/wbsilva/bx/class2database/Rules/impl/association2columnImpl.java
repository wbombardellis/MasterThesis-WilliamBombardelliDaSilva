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
	public boolean isAppropriate_FWD(Match match, ClassDiagram cd, Clazz b, Association as, Clazz c) {

		Object[] result1_black = association2columnImpl.pattern_association2column_0_1_initialbindings_blackBBBBBB(this,
				match, cd, b, as, c);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cd] = " + cd + ", " + "[b] = " + b + ", " + "[as] = " + as + ", "
					+ "[c] = " + c + ".");
		}

		Object[] result2_bindingAndBlack = association2columnImpl
				.pattern_association2column_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, cd, b, as, c);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cd] = " + cd + ", " + "[b] = " + b + ", " + "[as] = " + as + ", "
					+ "[c] = " + c + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (association2columnImpl.pattern_association2column_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = association2columnImpl
					.pattern_association2column_0_4_collectelementstobetranslated_blackBBBBB(match, cd, b, as, c);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cd] = " + cd + ", " + "[b] = " + b + ", " + "[as] = " + as + ", " + "[c] = " + c + ".");
			}
			association2columnImpl.pattern_association2column_0_4_collectelementstobetranslated_greenBBBBBFFF(match, cd,
					b, as, c);
			//nothing EMoflonEdge cd__as____associations = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge as__b____target = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge as__c____source = (EMoflonEdge) result4_green[7];

			Object[] result5_black = association2columnImpl
					.pattern_association2column_0_5_collectcontextelements_blackBBBBB(match, cd, b, as, c);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cd] = " + cd + ", " + "[b] = " + b + ", " + "[as] = " + as + ", " + "[c] = " + c + ".");
			}
			association2columnImpl.pattern_association2column_0_5_collectcontextelements_greenBBBBFF(match, cd, b, c);
			//nothing EMoflonEdge cd__c____classes = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge cd__b____classes = (EMoflonEdge) result5_green[5];

			// 
			association2columnImpl.pattern_association2column_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					cd, b, as, c);
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
		ClassDiagram cd = (ClassDiagram) result1_bindingAndBlack[0];
		Table t = (Table) result1_bindingAndBlack[1];
		C2T b2u = (C2T) result1_bindingAndBlack[2];
		Clazz b = (Clazz) result1_bindingAndBlack[3];
		CD2D cd2db = (CD2D) result1_bindingAndBlack[4];
		C2T c2t = (C2T) result1_bindingAndBlack[5];
		DB db = (DB) result1_bindingAndBlack[6];
		Association as = (Association) result1_bindingAndBlack[7];
		Clazz c = (Clazz) result1_bindingAndBlack[8];
		Table u = (Table) result1_bindingAndBlack[9];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = association2columnImpl
				.pattern_association2column_1_1_performtransformation_greenBFFBB(t, as, u);
		AS2C as2fk = (AS2C) result1_green[1];
		Column fk = (Column) result1_green[2];

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
				.pattern_association2column_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, cd, t, b2u, as2fk, b,
						cd2db, fk, c2t, db, as, c, u);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[cd] = " + cd + ", " + "[t] = " + t + ", " + "[b2u] = " + b2u + ", " + "[as2fk] = "
					+ as2fk + ", " + "[b] = " + b + ", " + "[cd2db] = " + cd2db + ", " + "[fk] = " + fk + ", "
					+ "[c2t] = " + c2t + ", " + "[db] = " + db + ", " + "[as] = " + as + ", " + "[c] = " + c + ", "
					+ "[u] = " + u + ".");
		}
		association2columnImpl.pattern_association2column_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFF(ruleresult, cd,
				t, as2fk, b, fk, as, c, u);
		//nothing EMoflonEdge t__fk____column = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge fk__u____reference = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge cd__as____associations = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge as2fk__fk____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge as__b____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge as__c____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge as2fk__as____source = (EMoflonEdge) result3_green[15];

		// 
		// 
		association2columnImpl.pattern_association2column_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
				cd, t, b2u, as2fk, b, cd2db, fk, c2t, db, as, c, u);
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
		ClassDiagram cd = (ClassDiagram) result2_binding[0];
		Clazz b = (Clazz) result2_binding[1];
		Association as = (Association) result2_binding[2];
		Clazz c = (Clazz) result2_binding[3];
		for (Object[] result2_black : association2columnImpl
				.pattern_association2column_2_2_corematch_blackBFFBFFFBBFB(cd, b, as, c, match)) {
			Table t = (Table) result2_black[1];
			C2T b2u = (C2T) result2_black[2];
			CD2D cd2db = (CD2D) result2_black[4];
			C2T c2t = (C2T) result2_black[5];
			DB db = (DB) result2_black[6];
			Table u = (Table) result2_black[9];
			// ForEach 
			for (Object[] result3_black : association2columnImpl
					.pattern_association2column_2_3_findcontext_blackBBBBBBBBBB(cd, t, b2u, b, cd2db, c2t, db, as, c,
							u)) {
				Object[] result3_green = association2columnImpl
						.pattern_association2column_2_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFF(cd, t, b2u, b, cd2db,
								c2t, db, as, c, u);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				//nothing EMoflonEdge cd__c____classes = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge b2u__b____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge cd2db__cd____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge cd__b____classes = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge cd__as____associations = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge as__b____target = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge as__c____source = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge cd2db__db____target = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge db__u____table = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge db__t____table = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge c2t__t____target = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge c2t__c____source = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge b2u__u____target = (EMoflonEdge) result3_green[23];

				Object[] result4_bindingAndBlack = association2columnImpl
						.pattern_association2column_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch,
								cd, t, b2u, b, cd2db, c2t, db, as, c, u);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[cd] = " + cd + ", " + "[t] = " + t
							+ ", " + "[b2u] = " + b2u + ", " + "[b] = " + b + ", " + "[cd2db] = " + cd2db + ", "
							+ "[c2t] = " + c2t + ", " + "[db] = " + db + ", " + "[as] = " + as + ", " + "[c] = " + c
							+ ", " + "[u] = " + u + ".");
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
	public void registerObjectsToMatch_FWD(Match match, ClassDiagram cd, Clazz b, Association as, Clazz c) {
		match.registerObject("cd", cd);
		match.registerObject("b", b);
		match.registerObject("as", as);
		match.registerObject("c", c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ClassDiagram cd, Clazz b, Association as, Clazz c) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ClassDiagram cd, Table t, C2T b2u,
			Clazz b, CD2D cd2db, C2T c2t, DB db, Association as, Clazz c, Table u) {// Create CSP
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
		isApplicableMatch.registerObject("b2u", b2u);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("cd2db", cd2db);
		isApplicableMatch.registerObject("c2t", c2t);
		isApplicableMatch.registerObject("db", db);
		isApplicableMatch.registerObject("as", as);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("u", u);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject cd, EObject t, EObject b2u, EObject as2fk,
			EObject b, EObject cd2db, EObject fk, EObject c2t, EObject db, EObject as, EObject c, EObject u) {
		ruleresult.registerObject("cd", cd);
		ruleresult.registerObject("t", t);
		ruleresult.registerObject("b2u", b2u);
		ruleresult.registerObject("as2fk", as2fk);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("cd2db", cd2db);
		ruleresult.registerObject("fk", fk);
		ruleresult.registerObject("c2t", c2t);
		ruleresult.registerObject("db", db);
		ruleresult.registerObject("as", as);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("u", u);

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
	public boolean isAppropriate_BWD(Match match, Table t, Column fk, DB db, Table u) {

		Object[] result1_black = association2columnImpl
				.pattern_association2column_10_1_initialbindings_blackBBBBBB(this, match, t, fk, db, u);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[t] = " + t + ", " + "[fk] = " + fk + ", " + "[db] = " + db + ", "
					+ "[u] = " + u + ".");
		}

		Object[] result2_bindingAndBlack = association2columnImpl
				.pattern_association2column_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, t, fk, db, u);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[t] = " + t + ", " + "[fk] = " + fk + ", " + "[db] = " + db + ", "
					+ "[u] = " + u + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (association2columnImpl.pattern_association2column_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = association2columnImpl
					.pattern_association2column_10_4_collectelementstobetranslated_blackBBBBB(match, t, fk, db, u);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[t] = " + t + ", " + "[fk] = " + fk + ", " + "[db] = " + db + ", " + "[u] = " + u + ".");
			}
			association2columnImpl.pattern_association2column_10_4_collectelementstobetranslated_greenBBBBFF(match, t,
					fk, u);
			//nothing EMoflonEdge t__fk____column = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge fk__u____reference = (EMoflonEdge) result4_green[5];

			Object[] result5_black = association2columnImpl
					.pattern_association2column_10_5_collectcontextelements_blackBBBBB(match, t, fk, db, u);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[t] = " + t + ", " + "[fk] = " + fk + ", " + "[db] = " + db + ", " + "[u] = " + u + ".");
			}
			association2columnImpl.pattern_association2column_10_5_collectcontextelements_greenBBBBFF(match, t, db, u);
			//nothing EMoflonEdge db__u____table = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge db__t____table = (EMoflonEdge) result5_green[5];

			// 
			association2columnImpl.pattern_association2column_10_6_registerobjectstomatch_expressionBBBBBB(this, match,
					t, fk, db, u);
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
		ClassDiagram cd = (ClassDiagram) result1_bindingAndBlack[0];
		Table t = (Table) result1_bindingAndBlack[1];
		C2T b2u = (C2T) result1_bindingAndBlack[2];
		Clazz b = (Clazz) result1_bindingAndBlack[3];
		CD2D cd2db = (CD2D) result1_bindingAndBlack[4];
		Column fk = (Column) result1_bindingAndBlack[5];
		C2T c2t = (C2T) result1_bindingAndBlack[6];
		DB db = (DB) result1_bindingAndBlack[7];
		Clazz c = (Clazz) result1_bindingAndBlack[8];
		Table u = (Table) result1_bindingAndBlack[9];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = association2columnImpl
				.pattern_association2column_11_1_performtransformation_greenBFBBFB(cd, b, fk, c);
		AS2C as2fk = (AS2C) result1_green[1];
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
				.pattern_association2column_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, cd, t, b2u, as2fk,
						b, cd2db, fk, c2t, db, as, c, u);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[cd] = " + cd + ", " + "[t] = " + t + ", " + "[b2u] = " + b2u + ", " + "[as2fk] = "
					+ as2fk + ", " + "[b] = " + b + ", " + "[cd2db] = " + cd2db + ", " + "[fk] = " + fk + ", "
					+ "[c2t] = " + c2t + ", " + "[db] = " + db + ", " + "[as] = " + as + ", " + "[c] = " + c + ", "
					+ "[u] = " + u + ".");
		}
		association2columnImpl.pattern_association2column_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFF(ruleresult, cd,
				t, as2fk, b, fk, as, c, u);
		//nothing EMoflonEdge t__fk____column = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge fk__u____reference = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge cd__as____associations = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge as2fk__fk____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge as__b____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge as__c____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge as2fk__as____source = (EMoflonEdge) result3_green[15];

		// 
		// 
		association2columnImpl.pattern_association2column_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this,
				ruleresult, cd, t, b2u, as2fk, b, cd2db, fk, c2t, db, as, c, u);
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
		Column fk = (Column) result2_binding[1];
		DB db = (DB) result2_binding[2];
		Table u = (Table) result2_binding[3];
		for (Object[] result2_black : association2columnImpl
				.pattern_association2column_12_2_corematch_blackFBFFFBFBFBB(t, fk, db, u, match)) {
			ClassDiagram cd = (ClassDiagram) result2_black[0];
			C2T b2u = (C2T) result2_black[2];
			Clazz b = (Clazz) result2_black[3];
			CD2D cd2db = (CD2D) result2_black[4];
			C2T c2t = (C2T) result2_black[6];
			Clazz c = (Clazz) result2_black[8];
			// ForEach 
			for (Object[] result3_black : association2columnImpl
					.pattern_association2column_12_3_findcontext_blackBBBBBBBBBB(cd, t, b2u, b, cd2db, fk, c2t, db, c,
							u)) {
				Object[] result3_green = association2columnImpl
						.pattern_association2column_12_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFF(cd, t, b2u, b, cd2db,
								fk, c2t, db, c, u);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				//nothing EMoflonEdge t__fk____column = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge cd__c____classes = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge b2u__b____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge cd2db__cd____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge fk__u____reference = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge cd__b____classes = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge cd2db__db____target = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge db__u____table = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge db__t____table = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge c2t__t____target = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge c2t__c____source = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge b2u__u____target = (EMoflonEdge) result3_green[22];

				Object[] result4_bindingAndBlack = association2columnImpl
						.pattern_association2column_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch,
								cd, t, b2u, b, cd2db, fk, c2t, db, c, u);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[cd] = " + cd + ", " + "[t] = " + t
							+ ", " + "[b2u] = " + b2u + ", " + "[b] = " + b + ", " + "[cd2db] = " + cd2db + ", "
							+ "[fk] = " + fk + ", " + "[c2t] = " + c2t + ", " + "[db] = " + db + ", " + "[c] = " + c
							+ ", " + "[u] = " + u + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Table t, Column fk, DB db, Table u) {
		match.registerObject("t", t);
		match.registerObject("fk", fk);
		match.registerObject("db", db);
		match.registerObject("u", u);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Table t, Column fk, DB db, Table u) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ClassDiagram cd, Table t, C2T b2u,
			Clazz b, CD2D cd2db, Column fk, C2T c2t, DB db, Clazz c, Table u) {// Create CSP
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
		isApplicableMatch.registerObject("b2u", b2u);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("cd2db", cd2db);
		isApplicableMatch.registerObject("fk", fk);
		isApplicableMatch.registerObject("c2t", c2t);
		isApplicableMatch.registerObject("db", db);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("u", u);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject cd, EObject t, EObject b2u, EObject as2fk,
			EObject b, EObject cd2db, EObject fk, EObject c2t, EObject db, EObject as, EObject c, EObject u) {
		ruleresult.registerObject("cd", cd);
		ruleresult.registerObject("t", t);
		ruleresult.registerObject("b2u", b2u);
		ruleresult.registerObject("as2fk", as2fk);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("cd2db", cd2db);
		ruleresult.registerObject("fk", fk);
		ruleresult.registerObject("c2t", c2t);
		ruleresult.registerObject("db", db);
		ruleresult.registerObject("as", as);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("u", u);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_60(EMoflonEdge _edge_column) {

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
			Column fk = (Column) result2_black[1];
			DB db = (DB) result2_black[2];
			Table u = (Table) result2_black[3];
			Object[] result2_green = association2columnImpl
					.pattern_association2column_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (association2columnImpl
					.pattern_association2column_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, t, fk, db, u)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_65(EMoflonEdge _edge_associations) {

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
				.pattern_association2column_21_2_testcorematchandDECs_blackFFFFB(_edge_associations)) {
			ClassDiagram cd = (ClassDiagram) result2_black[0];
			Clazz b = (Clazz) result2_black[1];
			Association as = (Association) result2_black[2];
			Clazz c = (Clazz) result2_black[3];
			Object[] result2_green = association2columnImpl
					.pattern_association2column_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (association2columnImpl
					.pattern_association2column_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, cd, b, as, c)) {
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
		ClassDiagram cd = (ClassDiagram) result2_bindingAndBlack[0];
		Table t = (Table) result2_bindingAndBlack[1];
		Clazz b = (Clazz) result2_bindingAndBlack[2];
		Column fk = (Column) result2_bindingAndBlack[3];
		DB db = (DB) result2_bindingAndBlack[4];
		Association as = (Association) result2_bindingAndBlack[5];
		Clazz c = (Clazz) result2_bindingAndBlack[6];
		Table u = (Table) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = association2columnImpl
				.pattern_association2column_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, cd, t, b, fk, db, as, c, u,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[cd] = " + cd + ", " + "[t] = " + t + ", " + "[b] = " + b + ", " + "[fk] = " + fk + ", "
					+ "[db] = " + db + ", " + "[as] = " + as + ", " + "[c] = " + c + ", " + "[u] = " + u + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (association2columnImpl.pattern_association2column_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : association2columnImpl
					.pattern_association2column_24_5_matchcorrcontext_blackBBFBFFBBBBB(cd, t, b, db, c, u, sourceMatch,
							targetMatch)) {
				C2T b2u = (C2T) result5_black[2];
				CD2D cd2db = (CD2D) result5_black[4];
				C2T c2t = (C2T) result5_black[5];
				Object[] result5_green = association2columnImpl
						.pattern_association2column_24_5_matchcorrcontext_greenBBBBBF(b2u, cd2db, c2t, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[5];

				Object[] result6_black = association2columnImpl
						.pattern_association2column_24_6_createcorrespondence_blackBBBBBBBBB(cd, t, b, fk, db, as, c, u,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[cd] = " + cd + ", "
							+ "[t] = " + t + ", " + "[b] = " + b + ", " + "[fk] = " + fk + ", " + "[db] = " + db + ", "
							+ "[as] = " + as + ", " + "[c] = " + c + ", " + "[u] = " + u + ", " + "[ccMatch] = "
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
	public CSP isApplicable_solveCsp_CC(ClassDiagram cd, Table t, Clazz b, Column fk, DB db, Association as, Clazz c,
			Table u, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(ClassDiagram cd, Clazz b, Association as, Clazz c) {// 
		Object[] result1_black = association2columnImpl.pattern_association2column_27_1_matchtggpattern_blackBBBB(cd, b,
				as, c);
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
	public boolean checkDEC_BWD(Table t, Column fk, DB db, Table u) {// 
		Object[] result1_black = association2columnImpl.pattern_association2column_28_1_matchtggpattern_blackBBBB(t, fk,
				db, u);
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
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, C2T c2tParameter) {

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
			//nothing RuleEntryList c2tList = (RuleEntryList) result2_black[0];
			ClassDiagram cd = (ClassDiagram) result2_black[1];
			Clazz c = (Clazz) result2_black[2];
			C2T c2t = (C2T) result2_black[3];
			Table t = (Table) result2_black[4];
			DB db = (DB) result2_black[5];
			Table u = (Table) result2_black[6];
			C2T b2u = (C2T) result2_black[7];
			Clazz b = (Clazz) result2_black[8];
			CD2D cd2db = (CD2D) result2_black[9];

			Object[] result3_bindingAndBlack = association2columnImpl
					.pattern_association2column_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch, cd,
							t, b2u, b, cd2db, c2t, db, c, u, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[cd] = " + cd + ", " + "[t] = " + t
						+ ", " + "[b2u] = " + b2u + ", " + "[b] = " + b + ", " + "[cd2db] = " + cd2db + ", "
						+ "[c2t] = " + c2t + ", " + "[db] = " + db + ", " + "[c] = " + c + ", " + "[u] = " + u + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (association2columnImpl.pattern_association2column_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = association2columnImpl
						.pattern_association2column_29_5_checknacs_blackBBBBBBBBB(cd, t, b2u, b, cd2db, c2t, db, c, u);
				if (result5_black != null) {

					Object[] result6_black = association2columnImpl
							.pattern_association2column_29_6_perform_blackBBBBBBBBBB(cd, t, b2u, b, cd2db, c2t, db, c,
									u, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[cd] = " + cd + ", "
								+ "[t] = " + t + ", " + "[b2u] = " + b2u + ", " + "[b] = " + b + ", " + "[cd2db] = "
								+ cd2db + ", " + "[c2t] = " + c2t + ", " + "[db] = " + db + ", " + "[c] = " + c + ", "
								+ "[u] = " + u + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					association2columnImpl.pattern_association2column_29_6_perform_greenBBFBFFBBB(cd, t, b, c, u,
							ruleResult);
					//nothing AS2C as2fk = (AS2C) result6_green[2];
					//nothing Column fk = (Column) result6_green[4];
					//nothing Association as = (Association) result6_green[5];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ClassDiagram cd, Table t, C2T b2u,
			Clazz b, CD2D cd2db, C2T c2t, DB db, Clazz c, Table u, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("b2u", b2u);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("cd2db", cd2db);
		isApplicableMatch.registerObject("c2t", c2t);
		isApplicableMatch.registerObject("db", db);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("u", u);
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
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPROPRIATE_FWD__MATCH_CLASSDIAGRAM_CLAZZ_ASSOCIATION_CLAZZ:
			return isAppropriate_FWD((Match) arguments.get(0), (ClassDiagram) arguments.get(1),
					(Clazz) arguments.get(2), (Association) arguments.get(3), (Clazz) arguments.get(4));
		case RulesPackage.ASSOCIATION2COLUMN___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASSDIAGRAM_CLAZZ_ASSOCIATION_CLAZZ:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ClassDiagram) arguments.get(1),
					(Clazz) arguments.get(2), (Association) arguments.get(3), (Clazz) arguments.get(4));
			return null;
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASSDIAGRAM_CLAZZ_ASSOCIATION_CLAZZ:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ClassDiagram) arguments.get(1),
					(Clazz) arguments.get(2), (Association) arguments.get(3), (Clazz) arguments.get(4));
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLASSDIAGRAM_TABLE_C2T_CLAZZ_CD2D_C2T_DB_ASSOCIATION_CLAZZ_TABLE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ClassDiagram) arguments.get(1),
					(Table) arguments.get(2), (C2T) arguments.get(3), (Clazz) arguments.get(4), (CD2D) arguments.get(5),
					(C2T) arguments.get(6), (DB) arguments.get(7), (Association) arguments.get(8),
					(Clazz) arguments.get(9), (Table) arguments.get(10));
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
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPROPRIATE_BWD__MATCH_TABLE_COLUMN_DB_TABLE:
			return isAppropriate_BWD((Match) arguments.get(0), (Table) arguments.get(1), (Column) arguments.get(2),
					(DB) arguments.get(3), (Table) arguments.get(4));
		case RulesPackage.ASSOCIATION2COLUMN___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABLE_COLUMN_DB_TABLE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Table) arguments.get(1), (Column) arguments.get(2),
					(DB) arguments.get(3), (Table) arguments.get(4));
			return null;
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABLE_COLUMN_DB_TABLE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Table) arguments.get(1),
					(Column) arguments.get(2), (DB) arguments.get(3), (Table) arguments.get(4));
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSDIAGRAM_TABLE_C2T_CLAZZ_CD2D_COLUMN_C2T_DB_CLAZZ_TABLE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ClassDiagram) arguments.get(1),
					(Table) arguments.get(2), (C2T) arguments.get(3), (Clazz) arguments.get(4), (CD2D) arguments.get(5),
					(Column) arguments.get(6), (C2T) arguments.get(7), (DB) arguments.get(8), (Clazz) arguments.get(9),
					(Table) arguments.get(10));
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
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPROPRIATE_BWD_EMOFLON_EDGE_60__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_60((EMoflonEdge) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPROPRIATE_FWD_EMOFLON_EDGE_65__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_65((EMoflonEdge) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPLICABLE_SOLVE_CSP_CC__CLASSDIAGRAM_TABLE_CLAZZ_COLUMN_DB_ASSOCIATION_CLAZZ_TABLE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((ClassDiagram) arguments.get(0), (Table) arguments.get(1),
					(Clazz) arguments.get(2), (Column) arguments.get(3), (DB) arguments.get(4),
					(Association) arguments.get(5), (Clazz) arguments.get(6), (Table) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.ASSOCIATION2COLUMN___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ASSOCIATION2COLUMN___CHECK_DEC_FWD__CLASSDIAGRAM_CLAZZ_ASSOCIATION_CLAZZ:
			return checkDEC_FWD((ClassDiagram) arguments.get(0), (Clazz) arguments.get(1),
					(Association) arguments.get(2), (Clazz) arguments.get(3));
		case RulesPackage.ASSOCIATION2COLUMN___CHECK_DEC_BWD__TABLE_COLUMN_DB_TABLE:
			return checkDEC_BWD((Table) arguments.get(0), (Column) arguments.get(1), (DB) arguments.get(2),
					(Table) arguments.get(3));
		case RulesPackage.ASSOCIATION2COLUMN___GENERATE_MODEL__RULEENTRYCONTAINER_C2T:
			return generateModel((RuleEntryContainer) arguments.get(0), (C2T) arguments.get(1));
		case RulesPackage.ASSOCIATION2COLUMN___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSDIAGRAM_TABLE_C2T_CLAZZ_CD2D_C2T_DB_CLAZZ_TABLE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ClassDiagram) arguments.get(1),
					(Table) arguments.get(2), (C2T) arguments.get(3), (Clazz) arguments.get(4), (CD2D) arguments.get(5),
					(C2T) arguments.get(6), (DB) arguments.get(7), (Clazz) arguments.get(8), (Table) arguments.get(9),
					(ModelgeneratorRuleResult) arguments.get(10));
		case RulesPackage.ASSOCIATION2COLUMN___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_association2column_0_1_initialbindings_blackBBBBBB(association2column _this,
			Match match, ClassDiagram cd, Clazz b, Association as, Clazz c) {
		if (!b.equals(c)) {
			return new Object[] { _this, match, cd, b, as, c };
		}
		return null;
	}

	public static final Object[] pattern_association2column_0_2_SolveCSP_bindingFBBBBBB(association2column _this,
			Match match, ClassDiagram cd, Clazz b, Association as, Clazz c) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, cd, b, as, c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, cd, b, as, c };
		}
		return null;
	}

	public static final Object[] pattern_association2column_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_association2column_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			association2column _this, Match match, ClassDiagram cd, Clazz b, Association as, Clazz c) {
		Object[] result_pattern_association2column_0_2_SolveCSP_binding = pattern_association2column_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, cd, b, as, c);
		if (result_pattern_association2column_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_association2column_0_2_SolveCSP_binding[0];

			Object[] result_pattern_association2column_0_2_SolveCSP_black = pattern_association2column_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_association2column_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, cd, b, as, c };
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
			ClassDiagram cd, Clazz b, Association as, Clazz c) {
		if (!b.equals(c)) {
			return new Object[] { match, cd, b, as, c };
		}
		return null;
	}

	public static final Object[] pattern_association2column_0_4_collectelementstobetranslated_greenBBBBBFFF(Match match,
			ClassDiagram cd, Clazz b, Association as, Clazz c) {
		EMoflonEdge cd__as____associations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge as__b____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge as__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(as);
		String cd__as____associations_name_prime = "associations";
		String as__b____target_name_prime = "target";
		String as__c____source_name_prime = "source";
		cd__as____associations.setSrc(cd);
		cd__as____associations.setTrg(as);
		match.getToBeTranslatedEdges().add(cd__as____associations);
		as__b____target.setSrc(as);
		as__b____target.setTrg(b);
		match.getToBeTranslatedEdges().add(as__b____target);
		as__c____source.setSrc(as);
		as__c____source.setTrg(c);
		match.getToBeTranslatedEdges().add(as__c____source);
		cd__as____associations.setName(cd__as____associations_name_prime);
		as__b____target.setName(as__b____target_name_prime);
		as__c____source.setName(as__c____source_name_prime);
		return new Object[] { match, cd, b, as, c, cd__as____associations, as__b____target, as__c____source };
	}

	public static final Object[] pattern_association2column_0_5_collectcontextelements_blackBBBBB(Match match,
			ClassDiagram cd, Clazz b, Association as, Clazz c) {
		if (!b.equals(c)) {
			return new Object[] { match, cd, b, as, c };
		}
		return null;
	}

	public static final Object[] pattern_association2column_0_5_collectcontextelements_greenBBBBFF(Match match,
			ClassDiagram cd, Clazz b, Clazz c) {
		EMoflonEdge cd__c____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd__b____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(cd);
		match.getContextNodes().add(b);
		match.getContextNodes().add(c);
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
		return new Object[] { match, cd, b, c, cd__c____classes, cd__b____classes };
	}

	public static final void pattern_association2column_0_6_registerobjectstomatch_expressionBBBBBB(
			association2column _this, Match match, ClassDiagram cd, Clazz b, Association as, Clazz c) {
		_this.registerObjectsToMatch_FWD(match, cd, b, as, c);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("cd");
		EObject _localVariable_1 = isApplicableMatch.getObject("t");
		EObject _localVariable_2 = isApplicableMatch.getObject("b2u");
		EObject _localVariable_3 = isApplicableMatch.getObject("b");
		EObject _localVariable_4 = isApplicableMatch.getObject("cd2db");
		EObject _localVariable_5 = isApplicableMatch.getObject("c2t");
		EObject _localVariable_6 = isApplicableMatch.getObject("db");
		EObject _localVariable_7 = isApplicableMatch.getObject("as");
		EObject _localVariable_8 = isApplicableMatch.getObject("c");
		EObject _localVariable_9 = isApplicableMatch.getObject("u");
		EObject tmpCd = _localVariable_0;
		EObject tmpT = _localVariable_1;
		EObject tmpB2u = _localVariable_2;
		EObject tmpB = _localVariable_3;
		EObject tmpCd2db = _localVariable_4;
		EObject tmpC2t = _localVariable_5;
		EObject tmpDb = _localVariable_6;
		EObject tmpAs = _localVariable_7;
		EObject tmpC = _localVariable_8;
		EObject tmpU = _localVariable_9;
		if (tmpCd instanceof ClassDiagram) {
			ClassDiagram cd = (ClassDiagram) tmpCd;
			if (tmpT instanceof Table) {
				Table t = (Table) tmpT;
				if (tmpB2u instanceof C2T) {
					C2T b2u = (C2T) tmpB2u;
					if (tmpB instanceof Clazz) {
						Clazz b = (Clazz) tmpB;
						if (tmpCd2db instanceof CD2D) {
							CD2D cd2db = (CD2D) tmpCd2db;
							if (tmpC2t instanceof C2T) {
								C2T c2t = (C2T) tmpC2t;
								if (tmpDb instanceof DB) {
									DB db = (DB) tmpDb;
									if (tmpAs instanceof Association) {
										Association as = (Association) tmpAs;
										if (tmpC instanceof Clazz) {
											Clazz c = (Clazz) tmpC;
											if (tmpU instanceof Table) {
												Table u = (Table) tmpU;
												return new Object[] { cd, t, b2u, b, cd2db, c2t, db, as, c, u,
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

	public static final Object[] pattern_association2column_1_1_performtransformation_blackBBBBBBBBBBFBB(
			ClassDiagram cd, Table t, C2T b2u, Clazz b, CD2D cd2db, C2T c2t, DB db, Association as, Clazz c, Table u,
			association2column _this, IsApplicableMatch isApplicableMatch) {
		if (!t.equals(u)) {
			if (!b2u.equals(c2t)) {
				if (!b.equals(c)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { cd, t, b2u, b, cd2db, c2t, db, as, c, u, csp, _this,
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
			ClassDiagram cd = (ClassDiagram) result_pattern_association2column_1_1_performtransformation_binding[0];
			Table t = (Table) result_pattern_association2column_1_1_performtransformation_binding[1];
			C2T b2u = (C2T) result_pattern_association2column_1_1_performtransformation_binding[2];
			Clazz b = (Clazz) result_pattern_association2column_1_1_performtransformation_binding[3];
			CD2D cd2db = (CD2D) result_pattern_association2column_1_1_performtransformation_binding[4];
			C2T c2t = (C2T) result_pattern_association2column_1_1_performtransformation_binding[5];
			DB db = (DB) result_pattern_association2column_1_1_performtransformation_binding[6];
			Association as = (Association) result_pattern_association2column_1_1_performtransformation_binding[7];
			Clazz c = (Clazz) result_pattern_association2column_1_1_performtransformation_binding[8];
			Table u = (Table) result_pattern_association2column_1_1_performtransformation_binding[9];

			Object[] result_pattern_association2column_1_1_performtransformation_black = pattern_association2column_1_1_performtransformation_blackBBBBBBBBBBFBB(
					cd, t, b2u, b, cd2db, c2t, db, as, c, u, _this, isApplicableMatch);
			if (result_pattern_association2column_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_association2column_1_1_performtransformation_black[10];

				return new Object[] { cd, t, b2u, b, cd2db, c2t, db, as, c, u, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_association2column_1_1_performtransformation_greenBFFBB(Table t,
			Association as, Table u) {
		AS2C as2fk = Class2databaseFactory.eINSTANCE.createAS2C();
		Column fk = DatabaseFactory.eINSTANCE.createColumn();
		as2fk.setSource(as);
		t.getColumn().add(fk);
		fk.setReference(u);
		as2fk.setTarget(fk);
		return new Object[] { t, as2fk, fk, as, u };
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
			PerformRuleResult ruleresult, EObject cd, EObject t, EObject b2u, EObject as2fk, EObject b, EObject cd2db,
			EObject fk, EObject c2t, EObject db, EObject as, EObject c, EObject u) {
		if (!cd.equals(t)) {
			if (!cd.equals(cd2db)) {
				if (!cd.equals(fk)) {
					if (!cd.equals(db)) {
						if (!cd.equals(u)) {
							if (!t.equals(u)) {
								if (!b2u.equals(cd)) {
									if (!b2u.equals(t)) {
										if (!b2u.equals(cd2db)) {
											if (!b2u.equals(fk)) {
												if (!b2u.equals(c2t)) {
													if (!b2u.equals(db)) {
														if (!b2u.equals(c)) {
															if (!b2u.equals(u)) {
																if (!as2fk.equals(cd)) {
																	if (!as2fk.equals(t)) {
																		if (!as2fk.equals(b2u)) {
																			if (!as2fk.equals(b)) {
																				if (!as2fk.equals(cd2db)) {
																					if (!as2fk.equals(fk)) {
																						if (!as2fk.equals(c2t)) {
																							if (!as2fk.equals(db)) {
																								if (!as2fk.equals(c)) {
																									if (!as2fk.equals(
																											u)) {
																										if (!b.equals(
																												cd)) {
																											if (!b.equals(
																													t)) {
																												if (!b.equals(
																														b2u)) {
																													if (!b.equals(
																															cd2db)) {
																														if (!b.equals(
																																fk)) {
																															if (!b.equals(
																																	c2t)) {
																																if (!b.equals(
																																		db)) {
																																	if (!b.equals(
																																			c)) {
																																		if (!b.equals(
																																				u)) {
																																			if (!cd2db
																																					.equals(t)) {
																																				if (!cd2db
																																						.equals(fk)) {
																																					if (!cd2db
																																							.equals(db)) {
																																						if (!cd2db
																																								.equals(u)) {
																																							if (!fk.equals(
																																									t)) {
																																								if (!fk.equals(
																																										u)) {
																																									if (!c2t.equals(
																																											cd)) {
																																										if (!c2t.equals(
																																												t)) {
																																											if (!c2t.equals(
																																													cd2db)) {
																																												if (!c2t.equals(
																																														fk)) {
																																													if (!c2t.equals(
																																															db)) {
																																														if (!c2t.equals(
																																																u)) {
																																															if (!db.equals(
																																																	t)) {
																																																if (!db.equals(
																																																		fk)) {
																																																	if (!db.equals(
																																																			u)) {
																																																		if (!as.equals(
																																																				cd)) {
																																																			if (!as.equals(
																																																					t)) {
																																																				if (!as.equals(
																																																						b2u)) {
																																																					if (!as.equals(
																																																							as2fk)) {
																																																						if (!as.equals(
																																																								b)) {
																																																							if (!as.equals(
																																																									cd2db)) {
																																																								if (!as.equals(
																																																										fk)) {
																																																									if (!as.equals(
																																																											c2t)) {
																																																										if (!as.equals(
																																																												db)) {
																																																											if (!as.equals(
																																																													c)) {
																																																												if (!as.equals(
																																																														u)) {
																																																													if (!c.equals(
																																																															cd)) {
																																																														if (!c.equals(
																																																																t)) {
																																																															if (!c.equals(
																																																																	cd2db)) {
																																																																if (!c.equals(
																																																																		fk)) {
																																																																	if (!c.equals(
																																																																			c2t)) {
																																																																		if (!c.equals(
																																																																				db)) {
																																																																			if (!c.equals(
																																																																					u)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						cd,
																																																																						t,
																																																																						b2u,
																																																																						as2fk,
																																																																						b,
																																																																						cd2db,
																																																																						fk,
																																																																						c2t,
																																																																						db,
																																																																						as,
																																																																						c,
																																																																						u };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject cd, EObject t, EObject as2fk, EObject b, EObject fk, EObject as,
			EObject c, EObject u) {
		EMoflonEdge t__fk____column = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fk__u____reference = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd__as____associations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge as2fk__fk____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge as__b____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge as__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge as2fk__as____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "association2column";
		String t__fk____column_name_prime = "column";
		String fk__u____reference_name_prime = "reference";
		String cd__as____associations_name_prime = "associations";
		String as2fk__fk____target_name_prime = "target";
		String as__b____target_name_prime = "target";
		String as__c____source_name_prime = "source";
		String as2fk__as____source_name_prime = "source";
		t__fk____column.setSrc(t);
		t__fk____column.setTrg(fk);
		ruleresult.getCreatedEdges().add(t__fk____column);
		fk__u____reference.setSrc(fk);
		fk__u____reference.setTrg(u);
		ruleresult.getCreatedEdges().add(fk__u____reference);
		cd__as____associations.setSrc(cd);
		cd__as____associations.setTrg(as);
		ruleresult.getTranslatedEdges().add(cd__as____associations);
		as2fk__fk____target.setSrc(as2fk);
		as2fk__fk____target.setTrg(fk);
		ruleresult.getCreatedEdges().add(as2fk__fk____target);
		as__b____target.setSrc(as);
		as__b____target.setTrg(b);
		ruleresult.getTranslatedEdges().add(as__b____target);
		as__c____source.setSrc(as);
		as__c____source.setTrg(c);
		ruleresult.getTranslatedEdges().add(as__c____source);
		as2fk__as____source.setSrc(as2fk);
		as2fk__as____source.setTrg(as);
		ruleresult.getCreatedEdges().add(as2fk__as____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		t__fk____column.setName(t__fk____column_name_prime);
		fk__u____reference.setName(fk__u____reference_name_prime);
		cd__as____associations.setName(cd__as____associations_name_prime);
		as2fk__fk____target.setName(as2fk__fk____target_name_prime);
		as__b____target.setName(as__b____target_name_prime);
		as__c____source.setName(as__c____source_name_prime);
		as2fk__as____source.setName(as2fk__as____source_name_prime);
		return new Object[] { ruleresult, cd, t, as2fk, b, fk, as, c, u, t__fk____column, fk__u____reference,
				cd__as____associations, as2fk__fk____target, as__b____target, as__c____source, as2fk__as____source };
	}

	public static final void pattern_association2column_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			association2column _this, PerformRuleResult ruleresult, EObject cd, EObject t, EObject b2u, EObject as2fk,
			EObject b, EObject cd2db, EObject fk, EObject c2t, EObject db, EObject as, EObject c, EObject u) {
		_this.registerObjects_FWD(ruleresult, cd, t, b2u, as2fk, b, cd2db, fk, c2t, db, as, c, u);

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
		EObject _localVariable_0 = match.getObject("cd");
		EObject _localVariable_1 = match.getObject("b");
		EObject _localVariable_2 = match.getObject("as");
		EObject _localVariable_3 = match.getObject("c");
		EObject tmpCd = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpAs = _localVariable_2;
		EObject tmpC = _localVariable_3;
		if (tmpCd instanceof ClassDiagram) {
			ClassDiagram cd = (ClassDiagram) tmpCd;
			if (tmpB instanceof Clazz) {
				Clazz b = (Clazz) tmpB;
				if (tmpAs instanceof Association) {
					Association as = (Association) tmpAs;
					if (tmpC instanceof Clazz) {
						Clazz c = (Clazz) tmpC;
						return new Object[] { cd, b, as, c, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_association2column_2_2_corematch_blackBFFBFFFBBFB(ClassDiagram cd,
			Clazz b, Association as, Clazz c, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b.equals(c)) {
			for (C2T b2u : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b, C2T.class, "source")) {
				Table u = b2u.getTarget();
				if (u != null) {
					for (CD2D cd2db : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(cd, CD2D.class,
							"source")) {
						DB db = cd2db.getTarget();
						if (db != null) {
							for (C2T c2t : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
									C2T.class, "source")) {
								if (!b2u.equals(c2t)) {
									Table t = c2t.getTarget();
									if (t != null) {
										if (!t.equals(u)) {
											_result.add(
													new Object[] { cd, t, b2u, b, cd2db, c2t, db, as, c, u, match });
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

	public static final Iterable<Object[]> pattern_association2column_2_3_findcontext_blackBBBBBBBBBB(ClassDiagram cd,
			Table t, C2T b2u, Clazz b, CD2D cd2db, C2T c2t, DB db, Association as, Clazz c, Table u) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!t.equals(u)) {
			if (!b2u.equals(c2t)) {
				if (!b.equals(c)) {
					if (cd.getClasses().contains(c)) {
						if (b.equals(b2u.getSource())) {
							if (cd.equals(cd2db.getSource())) {
								if (cd.getClasses().contains(b)) {
									if (cd.getAssociations().contains(as)) {
										if (b.equals(as.getTarget())) {
											if (c.equals(as.getSource())) {
												if (db.equals(cd2db.getTarget())) {
													if (db.getTable().contains(u)) {
														if (db.getTable().contains(t)) {
															if (t.equals(c2t.getTarget())) {
																if (c.equals(c2t.getSource())) {
																	if (u.equals(b2u.getTarget())) {
																		_result.add(new Object[] { cd, t, b2u, b, cd2db,
																				c2t, db, as, c, u });
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_association2column_2_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFF(
			ClassDiagram cd, Table t, C2T b2u, Clazz b, CD2D cd2db, C2T c2t, DB db, Association as, Clazz c, Table u) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge cd__c____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2u__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2db__cd____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd__b____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd__as____associations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge as__b____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge as__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2db__db____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge db__u____table = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge db__t____table = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2t__t____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2t__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2u__u____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String cd__c____classes_name_prime = "classes";
		String b2u__b____source_name_prime = "source";
		String cd2db__cd____source_name_prime = "source";
		String cd__b____classes_name_prime = "classes";
		String cd__as____associations_name_prime = "associations";
		String as__b____target_name_prime = "target";
		String as__c____source_name_prime = "source";
		String cd2db__db____target_name_prime = "target";
		String db__u____table_name_prime = "table";
		String db__t____table_name_prime = "table";
		String c2t__t____target_name_prime = "target";
		String c2t__c____source_name_prime = "source";
		String b2u__u____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(cd);
		isApplicableMatch.getAllContextElements().add(t);
		isApplicableMatch.getAllContextElements().add(b2u);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(cd2db);
		isApplicableMatch.getAllContextElements().add(c2t);
		isApplicableMatch.getAllContextElements().add(db);
		isApplicableMatch.getAllContextElements().add(as);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(u);
		cd__c____classes.setSrc(cd);
		cd__c____classes.setTrg(c);
		isApplicableMatch.getAllContextElements().add(cd__c____classes);
		b2u__b____source.setSrc(b2u);
		b2u__b____source.setTrg(b);
		isApplicableMatch.getAllContextElements().add(b2u__b____source);
		cd2db__cd____source.setSrc(cd2db);
		cd2db__cd____source.setTrg(cd);
		isApplicableMatch.getAllContextElements().add(cd2db__cd____source);
		cd__b____classes.setSrc(cd);
		cd__b____classes.setTrg(b);
		isApplicableMatch.getAllContextElements().add(cd__b____classes);
		cd__as____associations.setSrc(cd);
		cd__as____associations.setTrg(as);
		isApplicableMatch.getAllContextElements().add(cd__as____associations);
		as__b____target.setSrc(as);
		as__b____target.setTrg(b);
		isApplicableMatch.getAllContextElements().add(as__b____target);
		as__c____source.setSrc(as);
		as__c____source.setTrg(c);
		isApplicableMatch.getAllContextElements().add(as__c____source);
		cd2db__db____target.setSrc(cd2db);
		cd2db__db____target.setTrg(db);
		isApplicableMatch.getAllContextElements().add(cd2db__db____target);
		db__u____table.setSrc(db);
		db__u____table.setTrg(u);
		isApplicableMatch.getAllContextElements().add(db__u____table);
		db__t____table.setSrc(db);
		db__t____table.setTrg(t);
		isApplicableMatch.getAllContextElements().add(db__t____table);
		c2t__t____target.setSrc(c2t);
		c2t__t____target.setTrg(t);
		isApplicableMatch.getAllContextElements().add(c2t__t____target);
		c2t__c____source.setSrc(c2t);
		c2t__c____source.setTrg(c);
		isApplicableMatch.getAllContextElements().add(c2t__c____source);
		b2u__u____target.setSrc(b2u);
		b2u__u____target.setTrg(u);
		isApplicableMatch.getAllContextElements().add(b2u__u____target);
		cd__c____classes.setName(cd__c____classes_name_prime);
		b2u__b____source.setName(b2u__b____source_name_prime);
		cd2db__cd____source.setName(cd2db__cd____source_name_prime);
		cd__b____classes.setName(cd__b____classes_name_prime);
		cd__as____associations.setName(cd__as____associations_name_prime);
		as__b____target.setName(as__b____target_name_prime);
		as__c____source.setName(as__c____source_name_prime);
		cd2db__db____target.setName(cd2db__db____target_name_prime);
		db__u____table.setName(db__u____table_name_prime);
		db__t____table.setName(db__t____table_name_prime);
		c2t__t____target.setName(c2t__t____target_name_prime);
		c2t__c____source.setName(c2t__c____source_name_prime);
		b2u__u____target.setName(b2u__u____target_name_prime);
		return new Object[] { cd, t, b2u, b, cd2db, c2t, db, as, c, u, isApplicableMatch, cd__c____classes,
				b2u__b____source, cd2db__cd____source, cd__b____classes, cd__as____associations, as__b____target,
				as__c____source, cd2db__db____target, db__u____table, db__t____table, c2t__t____target,
				c2t__c____source, b2u__u____target };
	}

	public static final Object[] pattern_association2column_2_4_solveCSP_bindingFBBBBBBBBBBBB(association2column _this,
			IsApplicableMatch isApplicableMatch, ClassDiagram cd, Table t, C2T b2u, Clazz b, CD2D cd2db, C2T c2t, DB db,
			Association as, Clazz c, Table u) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, cd, t, b2u, b, cd2db, c2t, db, as, c,
				u);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, cd, t, b2u, b, cd2db, c2t, db, as, c, u };
		}
		return null;
	}

	public static final Object[] pattern_association2column_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_association2column_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			association2column _this, IsApplicableMatch isApplicableMatch, ClassDiagram cd, Table t, C2T b2u, Clazz b,
			CD2D cd2db, C2T c2t, DB db, Association as, Clazz c, Table u) {
		Object[] result_pattern_association2column_2_4_solveCSP_binding = pattern_association2column_2_4_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, cd, t, b2u, b, cd2db, c2t, db, as, c, u);
		if (result_pattern_association2column_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_association2column_2_4_solveCSP_binding[0];

			Object[] result_pattern_association2column_2_4_solveCSP_black = pattern_association2column_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_association2column_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, cd, t, b2u, b, cd2db, c2t, db, as, c, u };
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
			Match match, Table t, Column fk, DB db, Table u) {
		if (!t.equals(u)) {
			return new Object[] { _this, match, t, fk, db, u };
		}
		return null;
	}

	public static final Object[] pattern_association2column_10_2_SolveCSP_bindingFBBBBBB(association2column _this,
			Match match, Table t, Column fk, DB db, Table u) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, t, fk, db, u);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, t, fk, db, u };
		}
		return null;
	}

	public static final Object[] pattern_association2column_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_association2column_10_2_SolveCSP_bindingAndBlackFBBBBBB(
			association2column _this, Match match, Table t, Column fk, DB db, Table u) {
		Object[] result_pattern_association2column_10_2_SolveCSP_binding = pattern_association2column_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, t, fk, db, u);
		if (result_pattern_association2column_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_association2column_10_2_SolveCSP_binding[0];

			Object[] result_pattern_association2column_10_2_SolveCSP_black = pattern_association2column_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_association2column_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, t, fk, db, u };
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
			Table t, Column fk, DB db, Table u) {
		if (!t.equals(u)) {
			return new Object[] { match, t, fk, db, u };
		}
		return null;
	}

	public static final Object[] pattern_association2column_10_4_collectelementstobetranslated_greenBBBBFF(Match match,
			Table t, Column fk, Table u) {
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
		return new Object[] { match, t, fk, u, t__fk____column, fk__u____reference };
	}

	public static final Object[] pattern_association2column_10_5_collectcontextelements_blackBBBBB(Match match, Table t,
			Column fk, DB db, Table u) {
		if (!t.equals(u)) {
			return new Object[] { match, t, fk, db, u };
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
			association2column _this, Match match, Table t, Column fk, DB db, Table u) {
		_this.registerObjectsToMatch_BWD(match, t, fk, db, u);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("cd");
		EObject _localVariable_1 = isApplicableMatch.getObject("t");
		EObject _localVariable_2 = isApplicableMatch.getObject("b2u");
		EObject _localVariable_3 = isApplicableMatch.getObject("b");
		EObject _localVariable_4 = isApplicableMatch.getObject("cd2db");
		EObject _localVariable_5 = isApplicableMatch.getObject("fk");
		EObject _localVariable_6 = isApplicableMatch.getObject("c2t");
		EObject _localVariable_7 = isApplicableMatch.getObject("db");
		EObject _localVariable_8 = isApplicableMatch.getObject("c");
		EObject _localVariable_9 = isApplicableMatch.getObject("u");
		EObject tmpCd = _localVariable_0;
		EObject tmpT = _localVariable_1;
		EObject tmpB2u = _localVariable_2;
		EObject tmpB = _localVariable_3;
		EObject tmpCd2db = _localVariable_4;
		EObject tmpFk = _localVariable_5;
		EObject tmpC2t = _localVariable_6;
		EObject tmpDb = _localVariable_7;
		EObject tmpC = _localVariable_8;
		EObject tmpU = _localVariable_9;
		if (tmpCd instanceof ClassDiagram) {
			ClassDiagram cd = (ClassDiagram) tmpCd;
			if (tmpT instanceof Table) {
				Table t = (Table) tmpT;
				if (tmpB2u instanceof C2T) {
					C2T b2u = (C2T) tmpB2u;
					if (tmpB instanceof Clazz) {
						Clazz b = (Clazz) tmpB;
						if (tmpCd2db instanceof CD2D) {
							CD2D cd2db = (CD2D) tmpCd2db;
							if (tmpFk instanceof Column) {
								Column fk = (Column) tmpFk;
								if (tmpC2t instanceof C2T) {
									C2T c2t = (C2T) tmpC2t;
									if (tmpDb instanceof DB) {
										DB db = (DB) tmpDb;
										if (tmpC instanceof Clazz) {
											Clazz c = (Clazz) tmpC;
											if (tmpU instanceof Table) {
												Table u = (Table) tmpU;
												return new Object[] { cd, t, b2u, b, cd2db, fk, c2t, db, c, u,
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

	public static final Object[] pattern_association2column_11_1_performtransformation_blackBBBBBBBBBBFBB(
			ClassDiagram cd, Table t, C2T b2u, Clazz b, CD2D cd2db, Column fk, C2T c2t, DB db, Clazz c, Table u,
			association2column _this, IsApplicableMatch isApplicableMatch) {
		if (!t.equals(u)) {
			if (!b2u.equals(c2t)) {
				if (!b.equals(c)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { cd, t, b2u, b, cd2db, fk, c2t, db, c, u, csp, _this,
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
			ClassDiagram cd = (ClassDiagram) result_pattern_association2column_11_1_performtransformation_binding[0];
			Table t = (Table) result_pattern_association2column_11_1_performtransformation_binding[1];
			C2T b2u = (C2T) result_pattern_association2column_11_1_performtransformation_binding[2];
			Clazz b = (Clazz) result_pattern_association2column_11_1_performtransformation_binding[3];
			CD2D cd2db = (CD2D) result_pattern_association2column_11_1_performtransformation_binding[4];
			Column fk = (Column) result_pattern_association2column_11_1_performtransformation_binding[5];
			C2T c2t = (C2T) result_pattern_association2column_11_1_performtransformation_binding[6];
			DB db = (DB) result_pattern_association2column_11_1_performtransformation_binding[7];
			Clazz c = (Clazz) result_pattern_association2column_11_1_performtransformation_binding[8];
			Table u = (Table) result_pattern_association2column_11_1_performtransformation_binding[9];

			Object[] result_pattern_association2column_11_1_performtransformation_black = pattern_association2column_11_1_performtransformation_blackBBBBBBBBBBFBB(
					cd, t, b2u, b, cd2db, fk, c2t, db, c, u, _this, isApplicableMatch);
			if (result_pattern_association2column_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_association2column_11_1_performtransformation_black[10];

				return new Object[] { cd, t, b2u, b, cd2db, fk, c2t, db, c, u, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_association2column_11_1_performtransformation_greenBFBBFB(ClassDiagram cd,
			Clazz b, Column fk, Clazz c) {
		AS2C as2fk = Class2databaseFactory.eINSTANCE.createAS2C();
		Association as = ClassFactory.eINSTANCE.createAssociation();
		as2fk.setTarget(fk);
		cd.getAssociations().add(as);
		as.setTarget(b);
		as.setSource(c);
		as2fk.setSource(as);
		return new Object[] { cd, as2fk, b, fk, as, c };
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
			PerformRuleResult ruleresult, EObject cd, EObject t, EObject b2u, EObject as2fk, EObject b, EObject cd2db,
			EObject fk, EObject c2t, EObject db, EObject as, EObject c, EObject u) {
		if (!cd.equals(t)) {
			if (!cd.equals(cd2db)) {
				if (!cd.equals(fk)) {
					if (!cd.equals(db)) {
						if (!cd.equals(u)) {
							if (!t.equals(u)) {
								if (!b2u.equals(cd)) {
									if (!b2u.equals(t)) {
										if (!b2u.equals(cd2db)) {
											if (!b2u.equals(fk)) {
												if (!b2u.equals(c2t)) {
													if (!b2u.equals(db)) {
														if (!b2u.equals(c)) {
															if (!b2u.equals(u)) {
																if (!as2fk.equals(cd)) {
																	if (!as2fk.equals(t)) {
																		if (!as2fk.equals(b2u)) {
																			if (!as2fk.equals(b)) {
																				if (!as2fk.equals(cd2db)) {
																					if (!as2fk.equals(fk)) {
																						if (!as2fk.equals(c2t)) {
																							if (!as2fk.equals(db)) {
																								if (!as2fk.equals(c)) {
																									if (!as2fk.equals(
																											u)) {
																										if (!b.equals(
																												cd)) {
																											if (!b.equals(
																													t)) {
																												if (!b.equals(
																														b2u)) {
																													if (!b.equals(
																															cd2db)) {
																														if (!b.equals(
																																fk)) {
																															if (!b.equals(
																																	c2t)) {
																																if (!b.equals(
																																		db)) {
																																	if (!b.equals(
																																			c)) {
																																		if (!b.equals(
																																				u)) {
																																			if (!cd2db
																																					.equals(t)) {
																																				if (!cd2db
																																						.equals(fk)) {
																																					if (!cd2db
																																							.equals(db)) {
																																						if (!cd2db
																																								.equals(u)) {
																																							if (!fk.equals(
																																									t)) {
																																								if (!fk.equals(
																																										u)) {
																																									if (!c2t.equals(
																																											cd)) {
																																										if (!c2t.equals(
																																												t)) {
																																											if (!c2t.equals(
																																													cd2db)) {
																																												if (!c2t.equals(
																																														fk)) {
																																													if (!c2t.equals(
																																															db)) {
																																														if (!c2t.equals(
																																																u)) {
																																															if (!db.equals(
																																																	t)) {
																																																if (!db.equals(
																																																		fk)) {
																																																	if (!db.equals(
																																																			u)) {
																																																		if (!as.equals(
																																																				cd)) {
																																																			if (!as.equals(
																																																					t)) {
																																																				if (!as.equals(
																																																						b2u)) {
																																																					if (!as.equals(
																																																							as2fk)) {
																																																						if (!as.equals(
																																																								b)) {
																																																							if (!as.equals(
																																																									cd2db)) {
																																																								if (!as.equals(
																																																										fk)) {
																																																									if (!as.equals(
																																																											c2t)) {
																																																										if (!as.equals(
																																																												db)) {
																																																											if (!as.equals(
																																																													c)) {
																																																												if (!as.equals(
																																																														u)) {
																																																													if (!c.equals(
																																																															cd)) {
																																																														if (!c.equals(
																																																																t)) {
																																																															if (!c.equals(
																																																																	cd2db)) {
																																																																if (!c.equals(
																																																																		fk)) {
																																																																	if (!c.equals(
																																																																			c2t)) {
																																																																		if (!c.equals(
																																																																				db)) {
																																																																			if (!c.equals(
																																																																					u)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						cd,
																																																																						t,
																																																																						b2u,
																																																																						as2fk,
																																																																						b,
																																																																						cd2db,
																																																																						fk,
																																																																						c2t,
																																																																						db,
																																																																						as,
																																																																						c,
																																																																						u };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject cd, EObject t, EObject as2fk, EObject b, EObject fk, EObject as,
			EObject c, EObject u) {
		EMoflonEdge t__fk____column = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fk__u____reference = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd__as____associations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge as2fk__fk____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge as__b____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge as__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge as2fk__as____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "association2column";
		String t__fk____column_name_prime = "column";
		String fk__u____reference_name_prime = "reference";
		String cd__as____associations_name_prime = "associations";
		String as2fk__fk____target_name_prime = "target";
		String as__b____target_name_prime = "target";
		String as__c____source_name_prime = "source";
		String as2fk__as____source_name_prime = "source";
		t__fk____column.setSrc(t);
		t__fk____column.setTrg(fk);
		ruleresult.getTranslatedEdges().add(t__fk____column);
		fk__u____reference.setSrc(fk);
		fk__u____reference.setTrg(u);
		ruleresult.getTranslatedEdges().add(fk__u____reference);
		cd__as____associations.setSrc(cd);
		cd__as____associations.setTrg(as);
		ruleresult.getCreatedEdges().add(cd__as____associations);
		as2fk__fk____target.setSrc(as2fk);
		as2fk__fk____target.setTrg(fk);
		ruleresult.getCreatedEdges().add(as2fk__fk____target);
		as__b____target.setSrc(as);
		as__b____target.setTrg(b);
		ruleresult.getCreatedEdges().add(as__b____target);
		as__c____source.setSrc(as);
		as__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(as__c____source);
		as2fk__as____source.setSrc(as2fk);
		as2fk__as____source.setTrg(as);
		ruleresult.getCreatedEdges().add(as2fk__as____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		t__fk____column.setName(t__fk____column_name_prime);
		fk__u____reference.setName(fk__u____reference_name_prime);
		cd__as____associations.setName(cd__as____associations_name_prime);
		as2fk__fk____target.setName(as2fk__fk____target_name_prime);
		as__b____target.setName(as__b____target_name_prime);
		as__c____source.setName(as__c____source_name_prime);
		as2fk__as____source.setName(as2fk__as____source_name_prime);
		return new Object[] { ruleresult, cd, t, as2fk, b, fk, as, c, u, t__fk____column, fk__u____reference,
				cd__as____associations, as2fk__fk____target, as__b____target, as__c____source, as2fk__as____source };
	}

	public static final void pattern_association2column_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			association2column _this, PerformRuleResult ruleresult, EObject cd, EObject t, EObject b2u, EObject as2fk,
			EObject b, EObject cd2db, EObject fk, EObject c2t, EObject db, EObject as, EObject c, EObject u) {
		_this.registerObjects_BWD(ruleresult, cd, t, b2u, as2fk, b, cd2db, fk, c2t, db, as, c, u);

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
		EObject _localVariable_1 = match.getObject("fk");
		EObject _localVariable_2 = match.getObject("db");
		EObject _localVariable_3 = match.getObject("u");
		EObject tmpT = _localVariable_0;
		EObject tmpFk = _localVariable_1;
		EObject tmpDb = _localVariable_2;
		EObject tmpU = _localVariable_3;
		if (tmpT instanceof Table) {
			Table t = (Table) tmpT;
			if (tmpFk instanceof Column) {
				Column fk = (Column) tmpFk;
				if (tmpDb instanceof DB) {
					DB db = (DB) tmpDb;
					if (tmpU instanceof Table) {
						Table u = (Table) tmpU;
						return new Object[] { t, fk, db, u, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_association2column_12_2_corematch_blackFBFFFBFBFBB(Table t,
			Column fk, DB db, Table u, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!t.equals(u)) {
			for (CD2D cd2db : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(db, CD2D.class,
					"target")) {
				ClassDiagram cd = cd2db.getSource();
				if (cd != null) {
					for (C2T c2t : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(t, C2T.class,
							"target")) {
						Clazz c = c2t.getSource();
						if (c != null) {
							for (C2T b2u : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(u,
									C2T.class, "target")) {
								if (!b2u.equals(c2t)) {
									Clazz b = b2u.getSource();
									if (b != null) {
										if (!b.equals(c)) {
											_result.add(
													new Object[] { cd, t, b2u, b, cd2db, fk, c2t, db, c, u, match });
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

	public static final Iterable<Object[]> pattern_association2column_12_3_findcontext_blackBBBBBBBBBB(ClassDiagram cd,
			Table t, C2T b2u, Clazz b, CD2D cd2db, Column fk, C2T c2t, DB db, Clazz c, Table u) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!t.equals(u)) {
			if (!b2u.equals(c2t)) {
				if (!b.equals(c)) {
					if (t.getColumn().contains(fk)) {
						if (cd.getClasses().contains(c)) {
							if (b.equals(b2u.getSource())) {
								if (cd.equals(cd2db.getSource())) {
									if (u.equals(fk.getReference())) {
										if (cd.getClasses().contains(b)) {
											if (db.equals(cd2db.getTarget())) {
												if (db.getTable().contains(u)) {
													if (db.getTable().contains(t)) {
														if (t.equals(c2t.getTarget())) {
															if (c.equals(c2t.getSource())) {
																if (u.equals(b2u.getTarget())) {
																	_result.add(new Object[] { cd, t, b2u, b, cd2db, fk,
																			c2t, db, c, u });
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_association2column_12_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFF(
			ClassDiagram cd, Table t, C2T b2u, Clazz b, CD2D cd2db, Column fk, C2T c2t, DB db, Clazz c, Table u) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge t__fk____column = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd__c____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2u__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2db__cd____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fk__u____reference = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd__b____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2db__db____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge db__u____table = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge db__t____table = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2t__t____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2t__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2u__u____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String t__fk____column_name_prime = "column";
		String cd__c____classes_name_prime = "classes";
		String b2u__b____source_name_prime = "source";
		String cd2db__cd____source_name_prime = "source";
		String fk__u____reference_name_prime = "reference";
		String cd__b____classes_name_prime = "classes";
		String cd2db__db____target_name_prime = "target";
		String db__u____table_name_prime = "table";
		String db__t____table_name_prime = "table";
		String c2t__t____target_name_prime = "target";
		String c2t__c____source_name_prime = "source";
		String b2u__u____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(cd);
		isApplicableMatch.getAllContextElements().add(t);
		isApplicableMatch.getAllContextElements().add(b2u);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(cd2db);
		isApplicableMatch.getAllContextElements().add(fk);
		isApplicableMatch.getAllContextElements().add(c2t);
		isApplicableMatch.getAllContextElements().add(db);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(u);
		t__fk____column.setSrc(t);
		t__fk____column.setTrg(fk);
		isApplicableMatch.getAllContextElements().add(t__fk____column);
		cd__c____classes.setSrc(cd);
		cd__c____classes.setTrg(c);
		isApplicableMatch.getAllContextElements().add(cd__c____classes);
		b2u__b____source.setSrc(b2u);
		b2u__b____source.setTrg(b);
		isApplicableMatch.getAllContextElements().add(b2u__b____source);
		cd2db__cd____source.setSrc(cd2db);
		cd2db__cd____source.setTrg(cd);
		isApplicableMatch.getAllContextElements().add(cd2db__cd____source);
		fk__u____reference.setSrc(fk);
		fk__u____reference.setTrg(u);
		isApplicableMatch.getAllContextElements().add(fk__u____reference);
		cd__b____classes.setSrc(cd);
		cd__b____classes.setTrg(b);
		isApplicableMatch.getAllContextElements().add(cd__b____classes);
		cd2db__db____target.setSrc(cd2db);
		cd2db__db____target.setTrg(db);
		isApplicableMatch.getAllContextElements().add(cd2db__db____target);
		db__u____table.setSrc(db);
		db__u____table.setTrg(u);
		isApplicableMatch.getAllContextElements().add(db__u____table);
		db__t____table.setSrc(db);
		db__t____table.setTrg(t);
		isApplicableMatch.getAllContextElements().add(db__t____table);
		c2t__t____target.setSrc(c2t);
		c2t__t____target.setTrg(t);
		isApplicableMatch.getAllContextElements().add(c2t__t____target);
		c2t__c____source.setSrc(c2t);
		c2t__c____source.setTrg(c);
		isApplicableMatch.getAllContextElements().add(c2t__c____source);
		b2u__u____target.setSrc(b2u);
		b2u__u____target.setTrg(u);
		isApplicableMatch.getAllContextElements().add(b2u__u____target);
		t__fk____column.setName(t__fk____column_name_prime);
		cd__c____classes.setName(cd__c____classes_name_prime);
		b2u__b____source.setName(b2u__b____source_name_prime);
		cd2db__cd____source.setName(cd2db__cd____source_name_prime);
		fk__u____reference.setName(fk__u____reference_name_prime);
		cd__b____classes.setName(cd__b____classes_name_prime);
		cd2db__db____target.setName(cd2db__db____target_name_prime);
		db__u____table.setName(db__u____table_name_prime);
		db__t____table.setName(db__t____table_name_prime);
		c2t__t____target.setName(c2t__t____target_name_prime);
		c2t__c____source.setName(c2t__c____source_name_prime);
		b2u__u____target.setName(b2u__u____target_name_prime);
		return new Object[] { cd, t, b2u, b, cd2db, fk, c2t, db, c, u, isApplicableMatch, t__fk____column,
				cd__c____classes, b2u__b____source, cd2db__cd____source, fk__u____reference, cd__b____classes,
				cd2db__db____target, db__u____table, db__t____table, c2t__t____target, c2t__c____source,
				b2u__u____target };
	}

	public static final Object[] pattern_association2column_12_4_solveCSP_bindingFBBBBBBBBBBBB(association2column _this,
			IsApplicableMatch isApplicableMatch, ClassDiagram cd, Table t, C2T b2u, Clazz b, CD2D cd2db, Column fk,
			C2T c2t, DB db, Clazz c, Table u) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, cd, t, b2u, b, cd2db, fk, c2t, db, c,
				u);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, cd, t, b2u, b, cd2db, fk, c2t, db, c, u };
		}
		return null;
	}

	public static final Object[] pattern_association2column_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_association2column_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			association2column _this, IsApplicableMatch isApplicableMatch, ClassDiagram cd, Table t, C2T b2u, Clazz b,
			CD2D cd2db, Column fk, C2T c2t, DB db, Clazz c, Table u) {
		Object[] result_pattern_association2column_12_4_solveCSP_binding = pattern_association2column_12_4_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, cd, t, b2u, b, cd2db, fk, c2t, db, c, u);
		if (result_pattern_association2column_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_association2column_12_4_solveCSP_binding[0];

			Object[] result_pattern_association2column_12_4_solveCSP_black = pattern_association2column_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_association2column_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, cd, t, b2u, b, cd2db, fk, c2t, db, c, u };
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
									_result.add(new Object[] { t, fk, db, u, _edge_column });
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
			association2column _this, Match match, Table t, Column fk, DB db, Table u) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, t, fk, db, u);
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
			EMoflonEdge _edge_associations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCd = _edge_associations.getSrc();
		if (tmpCd instanceof ClassDiagram) {
			ClassDiagram cd = (ClassDiagram) tmpCd;
			EObject tmpAs = _edge_associations.getTrg();
			if (tmpAs instanceof Association) {
				Association as = (Association) tmpAs;
				if (cd.getAssociations().contains(as)) {
					Clazz b = as.getTarget();
					if (b != null) {
						if (cd.getClasses().contains(b)) {
							Clazz c = as.getSource();
							if (c != null) {
								if (!b.equals(c)) {
									if (cd.getClasses().contains(c)) {
										_result.add(new Object[] { cd, b, as, c, _edge_associations });
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
			association2column _this, Match match, ClassDiagram cd, Clazz b, Association as, Clazz c) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, cd, b, as, c);
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

	public static final Object[] pattern_association2column_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("cd");
		EObject _localVariable_1 = targetMatch.getObject("t");
		EObject _localVariable_2 = sourceMatch.getObject("b");
		EObject _localVariable_3 = targetMatch.getObject("fk");
		EObject _localVariable_4 = targetMatch.getObject("db");
		EObject _localVariable_5 = sourceMatch.getObject("as");
		EObject _localVariable_6 = sourceMatch.getObject("c");
		EObject _localVariable_7 = targetMatch.getObject("u");
		EObject tmpCd = _localVariable_0;
		EObject tmpT = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpFk = _localVariable_3;
		EObject tmpDb = _localVariable_4;
		EObject tmpAs = _localVariable_5;
		EObject tmpC = _localVariable_6;
		EObject tmpU = _localVariable_7;
		if (tmpCd instanceof ClassDiagram) {
			ClassDiagram cd = (ClassDiagram) tmpCd;
			if (tmpT instanceof Table) {
				Table t = (Table) tmpT;
				if (tmpB instanceof Clazz) {
					Clazz b = (Clazz) tmpB;
					if (tmpFk instanceof Column) {
						Column fk = (Column) tmpFk;
						if (tmpDb instanceof DB) {
							DB db = (DB) tmpDb;
							if (tmpAs instanceof Association) {
								Association as = (Association) tmpAs;
								if (tmpC instanceof Clazz) {
									Clazz c = (Clazz) tmpC;
									if (tmpU instanceof Table) {
										Table u = (Table) tmpU;
										return new Object[] { cd, t, b, fk, db, as, c, u, sourceMatch, targetMatch };
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

	public static final Object[] pattern_association2column_24_2_matchsrctrgcontext_blackBBBBBBBBBB(ClassDiagram cd,
			Table t, Clazz b, Column fk, DB db, Association as, Clazz c, Table u, Match sourceMatch,
			Match targetMatch) {
		if (!t.equals(u)) {
			if (!b.equals(c)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { cd, t, b, fk, db, as, c, u, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_association2column_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_association2column_24_2_matchsrctrgcontext_binding = pattern_association2column_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_association2column_24_2_matchsrctrgcontext_binding != null) {
			ClassDiagram cd = (ClassDiagram) result_pattern_association2column_24_2_matchsrctrgcontext_binding[0];
			Table t = (Table) result_pattern_association2column_24_2_matchsrctrgcontext_binding[1];
			Clazz b = (Clazz) result_pattern_association2column_24_2_matchsrctrgcontext_binding[2];
			Column fk = (Column) result_pattern_association2column_24_2_matchsrctrgcontext_binding[3];
			DB db = (DB) result_pattern_association2column_24_2_matchsrctrgcontext_binding[4];
			Association as = (Association) result_pattern_association2column_24_2_matchsrctrgcontext_binding[5];
			Clazz c = (Clazz) result_pattern_association2column_24_2_matchsrctrgcontext_binding[6];
			Table u = (Table) result_pattern_association2column_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_association2column_24_2_matchsrctrgcontext_black = pattern_association2column_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					cd, t, b, fk, db, as, c, u, sourceMatch, targetMatch);
			if (result_pattern_association2column_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { cd, t, b, fk, db, as, c, u, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_association2column_24_3_solvecsp_bindingFBBBBBBBBBBB(association2column _this,
			ClassDiagram cd, Table t, Clazz b, Column fk, DB db, Association as, Clazz c, Table u, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(cd, t, b, fk, db, as, c, u, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, cd, t, b, fk, db, as, c, u, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_association2column_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_association2column_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			association2column _this, ClassDiagram cd, Table t, Clazz b, Column fk, DB db, Association as, Clazz c,
			Table u, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_association2column_24_3_solvecsp_binding = pattern_association2column_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, cd, t, b, fk, db, as, c, u, sourceMatch, targetMatch);
		if (result_pattern_association2column_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_association2column_24_3_solvecsp_binding[0];

			Object[] result_pattern_association2column_24_3_solvecsp_black = pattern_association2column_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_association2column_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, cd, t, b, fk, db, as, c, u, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_association2column_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_association2column_24_5_matchcorrcontext_blackBBFBFFBBBBB(
			ClassDiagram cd, Table t, Clazz b, DB db, Clazz c, Table u, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!t.equals(u)) {
			if (!b.equals(c)) {
				if (!sourceMatch.equals(targetMatch)) {
					for (C2T b2u : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b, C2T.class,
							"source")) {
						if (u.equals(b2u.getTarget())) {
							for (CD2D cd2db : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(cd,
									CD2D.class, "source")) {
								if (db.equals(cd2db.getTarget())) {
									for (C2T c2t : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(t,
											C2T.class, "target")) {
										if (!b2u.equals(c2t)) {
											if (c.equals(c2t.getSource())) {
												_result.add(new Object[] { cd, t, b2u, b, cd2db, c2t, db, c, u,
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

	public static final Object[] pattern_association2column_24_5_matchcorrcontext_greenBBBBBF(C2T b2u, CD2D cd2db,
			C2T c2t, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "association2column";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(b2u);
		ccMatch.getAllContextElements().add(cd2db);
		ccMatch.getAllContextElements().add(c2t);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { b2u, cd2db, c2t, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_association2column_24_6_createcorrespondence_blackBBBBBBBBB(ClassDiagram cd,
			Table t, Clazz b, Column fk, DB db, Association as, Clazz c, Table u, CCMatch ccMatch) {
		if (!t.equals(u)) {
			if (!b.equals(c)) {
				return new Object[] { cd, t, b, fk, db, as, c, u, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_association2column_24_6_createcorrespondence_greenFBBB(Column fk,
			Association as, CCMatch ccMatch) {
		AS2C as2fk = Class2databaseFactory.eINSTANCE.createAS2C();
		as2fk.setTarget(fk);
		as2fk.setSource(as);
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

	public static final Object[] pattern_association2column_27_1_matchtggpattern_blackBBBB(ClassDiagram cd, Clazz b,
			Association as, Clazz c) {
		if (!b.equals(c)) {
			if (cd.getClasses().contains(c)) {
				if (cd.getClasses().contains(b)) {
					if (cd.getAssociations().contains(as)) {
						if (b.equals(as.getTarget())) {
							if (c.equals(as.getSource())) {
								return new Object[] { cd, b, as, c };
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

	public static final Object[] pattern_association2column_28_1_matchtggpattern_blackBBBB(Table t, Column fk, DB db,
			Table u) {
		if (!t.equals(u)) {
			if (t.getColumn().contains(fk)) {
				if (u.equals(fk.getReference())) {
					if (db.getTable().contains(u)) {
						if (db.getTable().contains(t)) {
							return new Object[] { t, fk, db, u };
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
			ModelgeneratorRuleResult ruleResult, ClassDiagram cd) {
		if (ruleResult.getSourceObjects().contains(cd)) {
			return new Object[] { ruleResult, cd };
		}
		return null;
	}

	public static final Object[] pattern_association2column_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Clazz c) {
		if (ruleResult.getSourceObjects().contains(c)) {
			return new Object[] { ruleResult, c };
		}
		return null;
	}

	public static final Object[] pattern_association2column_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, C2T c2t) {
		if (ruleResult.getCorrObjects().contains(c2t)) {
			return new Object[] { ruleResult, c2t };
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
			ModelgeneratorRuleResult ruleResult, DB db) {
		if (ruleResult.getTargetObjects().contains(db)) {
			return new Object[] { ruleResult, db };
		}
		return null;
	}

	public static final Object[] pattern_association2column_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Table u) {
		if (ruleResult.getTargetObjects().contains(u)) {
			return new Object[] { ruleResult, u };
		}
		return null;
	}

	public static final Object[] pattern_association2column_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, C2T b2u) {
		if (ruleResult.getCorrObjects().contains(b2u)) {
			return new Object[] { ruleResult, b2u };
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
		for (RuleEntryList c2tList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpC2t : c2tList.getEntryObjects()) {
				if (tmpC2t instanceof C2T) {
					C2T c2t = (C2T) tmpC2t;
					Clazz c = c2t.getSource();
					if (c != null) {
						Table t = c2t.getTarget();
						if (t != null) {
							if (pattern_association2column_29_2_isapplicablecore_black_nac_2BB(ruleResult,
									c2t) == null) {
								if (pattern_association2column_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										c) == null) {
									if (pattern_association2column_29_2_isapplicablecore_black_nac_3BB(ruleResult,
											t) == null) {
										for (ClassDiagram cd : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(c, ClassDiagram.class, "classes")) {
											if (pattern_association2column_29_2_isapplicablecore_black_nac_0BB(
													ruleResult, cd) == null) {
												for (Clazz b : cd.getClasses()) {
													if (!b.equals(c)) {
														if (pattern_association2column_29_2_isapplicablecore_black_nac_7BB(
																ruleResult, b) == null) {
															for (DB db : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(t, DB.class, "table")) {
																if (pattern_association2column_29_2_isapplicablecore_black_nac_4BB(
																		ruleResult, db) == null) {
																	for (Table u : db.getTable()) {
																		if (!t.equals(u)) {
																			if (pattern_association2column_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult, u) == null) {
																				for (CD2D cd2db : org.moflon.core.utilities.eMoflonEMFUtil
																						.getOppositeReferenceTyped(cd,
																								CD2D.class, "source")) {
																					if (db.equals(cd2db.getTarget())) {
																						if (pattern_association2column_29_2_isapplicablecore_black_nac_8BB(
																								ruleResult,
																								cd2db) == null) {
																							for (C2T b2u : org.moflon.core.utilities.eMoflonEMFUtil
																									.getOppositeReferenceTyped(
																											b,
																											C2T.class,
																											"source")) {
																								if (!b2u.equals(c2t)) {
																									if (u.equals(b2u
																											.getTarget())) {
																										if (pattern_association2column_29_2_isapplicablecore_black_nac_6BB(
																												ruleResult,
																												b2u) == null) {
																											_result.add(
																													new Object[] {
																															c2tList,
																															cd,
																															c,
																															c2t,
																															t,
																															db,
																															u,
																															b2u,
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
			IsApplicableMatch isApplicableMatch, ClassDiagram cd, Table t, C2T b2u, Clazz b, CD2D cd2db, C2T c2t, DB db,
			Clazz c, Table u, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, cd, t, b2u, b, cd2db, c2t, db, c, u,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, cd, t, b2u, b, cd2db, c2t, db, c, u, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_association2column_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_association2column_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			association2column _this, IsApplicableMatch isApplicableMatch, ClassDiagram cd, Table t, C2T b2u, Clazz b,
			CD2D cd2db, C2T c2t, DB db, Clazz c, Table u, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_association2column_29_3_solveCSP_binding = pattern_association2column_29_3_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, cd, t, b2u, b, cd2db, c2t, db, c, u, ruleResult);
		if (result_pattern_association2column_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_association2column_29_3_solveCSP_binding[0];

			Object[] result_pattern_association2column_29_3_solveCSP_black = pattern_association2column_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_association2column_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, cd, t, b2u, b, cd2db, c2t, db, c, u, ruleResult };
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

	public static final Object[] pattern_association2column_29_5_checknacs_blackBBBBBBBBB(ClassDiagram cd, Table t,
			C2T b2u, Clazz b, CD2D cd2db, C2T c2t, DB db, Clazz c, Table u) {
		if (!t.equals(u)) {
			if (!b2u.equals(c2t)) {
				if (!b.equals(c)) {
					return new Object[] { cd, t, b2u, b, cd2db, c2t, db, c, u };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_association2column_29_6_perform_blackBBBBBBBBBB(ClassDiagram cd, Table t,
			C2T b2u, Clazz b, CD2D cd2db, C2T c2t, DB db, Clazz c, Table u, ModelgeneratorRuleResult ruleResult) {
		if (!t.equals(u)) {
			if (!b2u.equals(c2t)) {
				if (!b.equals(c)) {
					return new Object[] { cd, t, b2u, b, cd2db, c2t, db, c, u, ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_association2column_29_6_perform_greenBBFBFFBBB(ClassDiagram cd, Table t,
			Clazz b, Clazz c, Table u, ModelgeneratorRuleResult ruleResult) {
		AS2C as2fk = Class2databaseFactory.eINSTANCE.createAS2C();
		Column fk = DatabaseFactory.eINSTANCE.createColumn();
		Association as = ClassFactory.eINSTANCE.createAssociation();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(as2fk);
		t.getColumn().add(fk);
		fk.setReference(u);
		as2fk.setTarget(fk);
		ruleResult.getTargetObjects().add(fk);
		cd.getAssociations().add(as);
		as.setTarget(b);
		as.setSource(c);
		as2fk.setSource(as);
		ruleResult.getSourceObjects().add(as);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { cd, t, as2fk, b, fk, as, c, u, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_association2column_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //association2columnImpl
