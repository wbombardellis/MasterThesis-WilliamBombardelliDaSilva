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
import org.wbsilva.bx.sourcecode2controlflow.Rules.decaul2branchcub;

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
 * An implementation of the model object '<em><b>decaul2branchcub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class decaul2branchcubImpl extends AbstractRuleImpl implements decaul2branchcub {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected decaul2branchcubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getdecaul2branchcub();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Assignment l, While b, Assignment a, Decision d) {

		Object[] result1_black = decaul2branchcubImpl.pattern_decaul2branchcub_0_1_initialbindings_blackBBBBBB(this,
				match, l, b, a, d);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[l] = " + l + ", " + "[b] = " + b + ", " + "[a] = " + a + ", "
					+ "[d] = " + d + ".");
		}

		Object[] result2_bindingAndBlack = decaul2branchcubImpl
				.pattern_decaul2branchcub_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, l, b, a, d);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[l] = " + l + ", " + "[b] = " + b + ", " + "[a] = " + a + ", "
					+ "[d] = " + d + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decaul2branchcubImpl.pattern_decaul2branchcub_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decaul2branchcubImpl
					.pattern_decaul2branchcub_0_4_collectelementstobetranslated_blackBBBBB(match, l, b, a, d);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[l] = " + l + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[d] = " + d + ".");
			}
			decaul2branchcubImpl.pattern_decaul2branchcub_0_4_collectelementstobetranslated_greenBBBBBFFFF(match, l, b,
					a, d);
			//nothing EMoflonEdge b__l____first = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge b__l____last = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result4_green[8];

			Object[] result5_black = decaul2branchcubImpl
					.pattern_decaul2branchcub_0_5_collectcontextelements_blackBBBBB(match, l, b, a, d);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[l] = " + l + ", " + "[b] = " + b + ", " + "[a] = " + a + ", " + "[d] = " + d + ".");
			}
			decaul2branchcubImpl.pattern_decaul2branchcub_0_5_collectcontextelements_greenBB(match, d);

			// 
			decaul2branchcubImpl.pattern_decaul2branchcub_0_6_registerobjectstomatch_expressionBBBBBB(this, match, l, b,
					a, d);
			return decaul2branchcubImpl.pattern_decaul2branchcub_0_7_expressionF();
		} else {
			return decaul2branchcubImpl.pattern_decaul2branchcub_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decaul2branchcubImpl
				.pattern_decaul2branchcub_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Assignment l = (Assignment) result1_bindingAndBlack[0];
		While b = (While) result1_bindingAndBlack[1];
		Assignment a = (Assignment) result1_bindingAndBlack[2];
		S2B d2c = (S2B) result1_bindingAndBlack[3];
		Branch c = (Branch) result1_bindingAndBlack[4];
		Decision d = (Decision) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decaul2branchcubImpl
				.pattern_decaul2branchcub_1_1_performtransformation_greenBFBFBFFBFF(l, b, a, c);
		Branch y = (Branch) result1_green[1];
		Command x = (Command) result1_green[3];
		S2N l2z = (S2N) result1_green[5];
		S2B b2y = (S2B) result1_green[6];
		S2N a2x = (S2N) result1_green[8];
		Command z = (Command) result1_green[9];

		Object[] result2_black = decaul2branchcubImpl
				.pattern_decaul2branchcub_1_2_collecttranslatedelements_blackBBBBBBBBB(l, y, b, x, a, l2z, b2y, a2x, z);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[l] = " + l + ", " + "[y] = " + y
					+ ", " + "[b] = " + b + ", " + "[x] = " + x + ", " + "[a] = " + a + ", " + "[l2z] = " + l2z + ", "
					+ "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", " + "[z] = " + z + ".");
		}
		Object[] result2_green = decaul2branchcubImpl
				.pattern_decaul2branchcub_1_2_collecttranslatedelements_greenFBBBBBBBBB(l, y, b, x, a, l2z, b2y, a2x,
						z);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decaul2branchcubImpl
				.pattern_decaul2branchcub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, l, y, b, x, a, l2z,
						d2c, b2y, c, a2x, d, z);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[l] = " + l + ", " + "[y] = " + y + ", " + "[b] = " + b + ", " + "[x] = " + x + ", "
					+ "[a] = " + a + ", " + "[l2z] = " + l2z + ", " + "[d2c] = " + d2c + ", " + "[b2y] = " + b2y + ", "
					+ "[c] = " + c + ", " + "[a2x] = " + a2x + ", " + "[d] = " + d + ", " + "[z] = " + z + ".");
		}
		decaul2branchcubImpl.pattern_decaul2branchcub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, l, y, b, x, a, l2z, b2y, c, a2x, d, z);
		//nothing EMoflonEdge b__l____first = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge b__l____last = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge y__z____positive = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge z__y____next = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[25];

		// 
		// 
		decaul2branchcubImpl.pattern_decaul2branchcub_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, l,
				y, b, x, a, l2z, d2c, b2y, c, a2x, d, z);
		return decaul2branchcubImpl.pattern_decaul2branchcub_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = decaul2branchcubImpl
				.pattern_decaul2branchcub_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decaul2branchcubImpl
				.pattern_decaul2branchcub_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decaul2branchcubImpl.pattern_decaul2branchcub_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Assignment l = (Assignment) result2_binding[0];
		While b = (While) result2_binding[1];
		Assignment a = (Assignment) result2_binding[2];
		Decision d = (Decision) result2_binding[3];
		for (Object[] result2_black : decaul2branchcubImpl.pattern_decaul2branchcub_2_2_corematch_blackBBBFFBB(l, b, a,
				d, match)) {
			S2B d2c = (S2B) result2_black[3];
			Branch c = (Branch) result2_black[4];
			// ForEach 
			for (Object[] result3_black : decaul2branchcubImpl.pattern_decaul2branchcub_2_3_findcontext_blackBBBBBB(l,
					b, a, d2c, c, d)) {
				Object[] result3_green = decaul2branchcubImpl
						.pattern_decaul2branchcub_2_3_findcontext_greenBBBBBBFFFFFFF(l, b, a, d2c, c, d);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge b__l____first = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge b__l____last = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = decaul2branchcubImpl
						.pattern_decaul2branchcub_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, l, b,
								a, d2c, c, d);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[l] = " + l + ", " + "[b] = " + b
							+ ", " + "[a] = " + a + ", " + "[d2c] = " + d2c + ", " + "[c] = " + c + ", " + "[d] = " + d
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decaul2branchcubImpl.pattern_decaul2branchcub_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = decaul2branchcubImpl
							.pattern_decaul2branchcub_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decaul2branchcubImpl.pattern_decaul2branchcub_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return decaul2branchcubImpl.pattern_decaul2branchcub_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Assignment l, While b, Assignment a, Decision d) {
		match.registerObject("l", l);
		match.registerObject("b", b);
		match.registerObject("a", a);
		match.registerObject("d", d);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment l, While b, Assignment a, Decision d) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Assignment l, While b, Assignment a,
			S2B d2c, Branch c, Decision d) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("l", l);
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d", d);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject l, EObject y, EObject b, EObject x, EObject a,
			EObject l2z, EObject d2c, EObject b2y, EObject c, EObject a2x, EObject d, EObject z) {
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("z", z);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("l").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass())
						.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Branch y, Command x, Branch c, Command z) {

		Object[] result1_black = decaul2branchcubImpl.pattern_decaul2branchcub_10_1_initialbindings_blackBBBBBB(this,
				match, y, x, c, z);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[c] = " + c + ", "
					+ "[z] = " + z + ".");
		}

		Object[] result2_bindingAndBlack = decaul2branchcubImpl
				.pattern_decaul2branchcub_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, y, x, c, z);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[x] = " + x + ", " + "[c] = " + c + ", "
					+ "[z] = " + z + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (decaul2branchcubImpl.pattern_decaul2branchcub_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = decaul2branchcubImpl
					.pattern_decaul2branchcub_10_4_collectelementstobetranslated_blackBBBBB(match, y, x, c, z);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[y] = " + y + ", " + "[x] = " + x + ", " + "[c] = " + c + ", " + "[z] = " + z + ".");
			}
			decaul2branchcubImpl.pattern_decaul2branchcub_10_4_collectelementstobetranslated_greenBBBBBFFFF(match, y, x,
					c, z);
			//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge y__z____positive = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge z__y____next = (EMoflonEdge) result4_green[8];

			Object[] result5_black = decaul2branchcubImpl
					.pattern_decaul2branchcub_10_5_collectcontextelements_blackBBBBB(match, y, x, c, z);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[y] = " + y + ", " + "[x] = " + x + ", " + "[c] = " + c + ", " + "[z] = " + z + ".");
			}
			decaul2branchcubImpl.pattern_decaul2branchcub_10_5_collectcontextelements_greenBB(match, c);

			// 
			decaul2branchcubImpl.pattern_decaul2branchcub_10_6_registerobjectstomatch_expressionBBBBBB(this, match, y,
					x, c, z);
			return decaul2branchcubImpl.pattern_decaul2branchcub_10_7_expressionF();
		} else {
			return decaul2branchcubImpl.pattern_decaul2branchcub_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = decaul2branchcubImpl
				.pattern_decaul2branchcub_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Branch y = (Branch) result1_bindingAndBlack[0];
		Command x = (Command) result1_bindingAndBlack[1];
		S2B d2c = (S2B) result1_bindingAndBlack[2];
		Branch c = (Branch) result1_bindingAndBlack[3];
		Decision d = (Decision) result1_bindingAndBlack[4];
		Command z = (Command) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = decaul2branchcubImpl
				.pattern_decaul2branchcub_11_1_performtransformation_greenFBFBFFFFBB(y, x, d, z);
		Assignment l = (Assignment) result1_green[0];
		While b = (While) result1_green[2];
		Assignment a = (Assignment) result1_green[4];
		S2N l2z = (S2N) result1_green[5];
		S2B b2y = (S2B) result1_green[6];
		S2N a2x = (S2N) result1_green[7];

		Object[] result2_black = decaul2branchcubImpl
				.pattern_decaul2branchcub_11_2_collecttranslatedelements_blackBBBBBBBBB(l, y, b, x, a, l2z, b2y, a2x,
						z);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[l] = " + l + ", " + "[y] = " + y
					+ ", " + "[b] = " + b + ", " + "[x] = " + x + ", " + "[a] = " + a + ", " + "[l2z] = " + l2z + ", "
					+ "[b2y] = " + b2y + ", " + "[a2x] = " + a2x + ", " + "[z] = " + z + ".");
		}
		Object[] result2_green = decaul2branchcubImpl
				.pattern_decaul2branchcub_11_2_collecttranslatedelements_greenFBBBBBBBBB(l, y, b, x, a, l2z, b2y, a2x,
						z);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = decaul2branchcubImpl
				.pattern_decaul2branchcub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, l, y, b, x, a, l2z,
						d2c, b2y, c, a2x, d, z);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[l] = " + l + ", " + "[y] = " + y + ", " + "[b] = " + b + ", " + "[x] = " + x + ", "
					+ "[a] = " + a + ", " + "[l2z] = " + l2z + ", " + "[d2c] = " + d2c + ", " + "[b2y] = " + b2y + ", "
					+ "[c] = " + c + ", " + "[a2x] = " + a2x + ", " + "[d] = " + d + ", " + "[z] = " + z + ".");
		}
		decaul2branchcubImpl.pattern_decaul2branchcub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, l, y, b, x, a, l2z, b2y, c, a2x, d, z);
		//nothing EMoflonEdge b__l____first = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge b__l____last = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge l2z__l____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge d__a____positive = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge y__z____positive = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge l2z__z____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge z__y____next = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge d__b____negative = (EMoflonEdge) result3_green[25];

		// 
		// 
		decaul2branchcubImpl.pattern_decaul2branchcub_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, l,
				y, b, x, a, l2z, d2c, b2y, c, a2x, d, z);
		return decaul2branchcubImpl.pattern_decaul2branchcub_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = decaul2branchcubImpl
				.pattern_decaul2branchcub_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = decaul2branchcubImpl
				.pattern_decaul2branchcub_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = decaul2branchcubImpl.pattern_decaul2branchcub_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Branch y = (Branch) result2_binding[0];
		Command x = (Command) result2_binding[1];
		Branch c = (Branch) result2_binding[2];
		Command z = (Command) result2_binding[3];
		for (Object[] result2_black : decaul2branchcubImpl.pattern_decaul2branchcub_12_2_corematch_blackBBFBFBB(y, x, c,
				z, match)) {
			S2B d2c = (S2B) result2_black[2];
			Decision d = (Decision) result2_black[4];
			// ForEach 
			for (Object[] result3_black : decaul2branchcubImpl.pattern_decaul2branchcub_12_3_findcontext_blackBBBBBB(y,
					x, d2c, c, d, z)) {
				Object[] result3_green = decaul2branchcubImpl
						.pattern_decaul2branchcub_12_3_findcontext_greenBBBBBBFFFFFFF(y, x, d2c, c, d, z);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge d2c__c____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge c__y____negative = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge c__x____positive = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge y__z____positive = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge d2c__d____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge z__y____next = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = decaul2branchcubImpl
						.pattern_decaul2branchcub_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, y, x,
								d2c, c, d, z);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[y] = " + y + ", " + "[x] = " + x
							+ ", " + "[d2c] = " + d2c + ", " + "[c] = " + c + ", " + "[d] = " + d + ", " + "[z] = " + z
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (decaul2branchcubImpl.pattern_decaul2branchcub_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = decaul2branchcubImpl
							.pattern_decaul2branchcub_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					decaul2branchcubImpl.pattern_decaul2branchcub_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return decaul2branchcubImpl.pattern_decaul2branchcub_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Branch y, Command x, Branch c, Command z) {
		match.registerObject("y", y);
		match.registerObject("x", x);
		match.registerObject("c", c);
		match.registerObject("z", z);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Branch y, Command x, Branch c, Command z) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Branch y, Command x, S2B d2c, Branch c,
			Decision d, Command z) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d", d);
		isApplicableMatch.registerObject("z", z);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject l, EObject y, EObject b, EObject x, EObject a,
			EObject l2z, EObject d2c, EObject b2y, EObject c, EObject a2x, EObject d, EObject z) {
		ruleresult.registerObject("l", l);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("l2z", l2z);
		ruleresult.registerObject("d2c", d2c);
		ruleresult.registerObject("b2y", b2y);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("d", d);
		ruleresult.registerObject("z", z);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_123(EMoflonEdge _edge_negative) {

		Object[] result1_bindingAndBlack = decaul2branchcubImpl
				.pattern_decaul2branchcub_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decaul2branchcubImpl.pattern_decaul2branchcub_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decaul2branchcubImpl
				.pattern_decaul2branchcub_20_2_testcorematchandDECs_blackFFFFB(_edge_negative)) {
			Branch y = (Branch) result2_black[0];
			Command x = (Command) result2_black[1];
			Branch c = (Branch) result2_black[2];
			Command z = (Command) result2_black[3];
			Object[] result2_green = decaul2branchcubImpl
					.pattern_decaul2branchcub_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decaul2branchcubImpl
					.pattern_decaul2branchcub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, y, x, c, z)) {
				// 
				if (decaul2branchcubImpl
						.pattern_decaul2branchcub_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = decaul2branchcubImpl
							.pattern_decaul2branchcub_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decaul2branchcubImpl.pattern_decaul2branchcub_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decaul2branchcubImpl.pattern_decaul2branchcub_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_123(EMoflonEdge _edge_first) {

		Object[] result1_bindingAndBlack = decaul2branchcubImpl
				.pattern_decaul2branchcub_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = decaul2branchcubImpl.pattern_decaul2branchcub_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : decaul2branchcubImpl
				.pattern_decaul2branchcub_21_2_testcorematchandDECs_blackFFFFB(_edge_first)) {
			Assignment l = (Assignment) result2_black[0];
			While b = (While) result2_black[1];
			Assignment a = (Assignment) result2_black[2];
			Decision d = (Decision) result2_black[3];
			Object[] result2_green = decaul2branchcubImpl
					.pattern_decaul2branchcub_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (decaul2branchcubImpl
					.pattern_decaul2branchcub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, l, b, a, d)) {
				// 
				if (decaul2branchcubImpl
						.pattern_decaul2branchcub_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = decaul2branchcubImpl
							.pattern_decaul2branchcub_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					decaul2branchcubImpl.pattern_decaul2branchcub_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return decaul2branchcubImpl.pattern_decaul2branchcub_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("decaul2branchcub");
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
		ruleResult.setRule("decaul2branchcub");
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

		Object[] result1_black = decaul2branchcubImpl.pattern_decaul2branchcub_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decaul2branchcubImpl.pattern_decaul2branchcub_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = decaul2branchcubImpl
				.pattern_decaul2branchcub_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Assignment l = (Assignment) result2_bindingAndBlack[0];
		Branch y = (Branch) result2_bindingAndBlack[1];
		While b = (While) result2_bindingAndBlack[2];
		Command x = (Command) result2_bindingAndBlack[3];
		Assignment a = (Assignment) result2_bindingAndBlack[4];
		Branch c = (Branch) result2_bindingAndBlack[5];
		Decision d = (Decision) result2_bindingAndBlack[6];
		Command z = (Command) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = decaul2branchcubImpl
				.pattern_decaul2branchcub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, l, y, b, x, a, c, d, z,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[l] = " + l + ", " + "[y] = " + y + ", " + "[b] = " + b + ", " + "[x] = " + x + ", " + "[a] = "
					+ a + ", " + "[c] = " + c + ", " + "[d] = " + d + ", " + "[z] = " + z + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (decaul2branchcubImpl.pattern_decaul2branchcub_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : decaul2branchcubImpl
					.pattern_decaul2branchcub_24_5_matchcorrcontext_blackFBBBB(c, d, sourceMatch, targetMatch)) {
				S2B d2c = (S2B) result5_black[0];
				Object[] result5_green = decaul2branchcubImpl
						.pattern_decaul2branchcub_24_5_matchcorrcontext_greenBBBF(d2c, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = decaul2branchcubImpl
						.pattern_decaul2branchcub_24_6_createcorrespondence_blackBBBBBBBBB(l, y, b, x, a, c, d, z,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[l] = " + l + ", "
							+ "[y] = " + y + ", " + "[b] = " + b + ", " + "[x] = " + x + ", " + "[a] = " + a + ", "
							+ "[c] = " + c + ", " + "[d] = " + d + ", " + "[z] = " + z + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				decaul2branchcubImpl.pattern_decaul2branchcub_24_6_createcorrespondence_greenBBBBBFFFBB(l, y, b, x, a,
						z, ccMatch);
				//nothing S2N l2z = (S2N) result6_green[5];
				//nothing S2B b2y = (S2B) result6_green[6];
				//nothing S2N a2x = (S2N) result6_green[7];

				Object[] result7_black = decaul2branchcubImpl
						.pattern_decaul2branchcub_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				decaul2branchcubImpl.pattern_decaul2branchcub_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return decaul2branchcubImpl.pattern_decaul2branchcub_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Assignment l, Branch y, While b, Command x, Assignment a, Branch c, Decision d,
			Command z, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Assignment l, While b, Assignment a, Decision d) {// 
		Object[] result1_black = decaul2branchcubImpl.pattern_decaul2branchcub_27_1_matchtggpattern_blackBBBB(l, b, a,
				d);
		if (result1_black != null) {
			return decaul2branchcubImpl.pattern_decaul2branchcub_27_2_expressionF();
		} else {
			return decaul2branchcubImpl.pattern_decaul2branchcub_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Branch y, Command x, Branch c, Command z) {// 
		Object[] result1_black = decaul2branchcubImpl.pattern_decaul2branchcub_28_1_matchtggpattern_blackBBBB(y, x, c,
				z);
		if (result1_black != null) {
			return decaul2branchcubImpl.pattern_decaul2branchcub_28_2_expressionF();
		} else {
			return decaul2branchcubImpl.pattern_decaul2branchcub_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, S2B d2cParameter) {

		Object[] result1_black = decaul2branchcubImpl.pattern_decaul2branchcub_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = decaul2branchcubImpl.pattern_decaul2branchcub_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : decaul2branchcubImpl
				.pattern_decaul2branchcub_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList d2cList = (RuleEntryList) result2_black[0];
			S2B d2c = (S2B) result2_black[1];
			Branch c = (Branch) result2_black[2];
			Decision d = (Decision) result2_black[3];

			Object[] result3_bindingAndBlack = decaul2branchcubImpl
					.pattern_decaul2branchcub_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, d2c, c, d,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[d2c] = " + d2c + ", " + "[c] = " + c
						+ ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (decaul2branchcubImpl.pattern_decaul2branchcub_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = decaul2branchcubImpl.pattern_decaul2branchcub_29_5_checknacs_blackBBB(d2c, c,
						d);
				if (result5_black != null) {

					Object[] result6_black = decaul2branchcubImpl.pattern_decaul2branchcub_29_6_perform_blackBBBB(d2c,
							c, d, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[d2c] = " + d2c + ", "
								+ "[c] = " + c + ", " + "[d] = " + d + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					decaul2branchcubImpl.pattern_decaul2branchcub_29_6_perform_greenFFFFFFFBFBFB(c, d, ruleResult);
					//nothing Assignment l = (Assignment) result6_green[0];
					//nothing Branch y = (Branch) result6_green[1];
					//nothing While b = (While) result6_green[2];
					//nothing Command x = (Command) result6_green[3];
					//nothing Assignment a = (Assignment) result6_green[4];
					//nothing S2N l2z = (S2N) result6_green[5];
					//nothing S2B b2y = (S2B) result6_green[6];
					//nothing S2N a2x = (S2N) result6_green[8];
					//nothing Command z = (Command) result6_green[10];

				} else {
				}

			} else {
			}

		}
		return decaul2branchcubImpl.pattern_decaul2branchcub_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, S2B d2c, Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("d2c", d2c);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("d", d);
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
		case RulesPackage.DECAUL2BRANCHCUB___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_WHILE_ASSIGNMENT_DECISION:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3), (Decision) arguments.get(4));
		case RulesPackage.DECAUL2BRANCHCUB___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECAUL2BRANCHCUB___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.DECAUL2BRANCHCUB___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_WHILE_ASSIGNMENT_DECISION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (Decision) arguments.get(4));
			return null;
		case RulesPackage.DECAUL2BRANCHCUB___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_WHILE_ASSIGNMENT_DECISION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (Decision) arguments.get(4));
		case RulesPackage.DECAUL2BRANCHCUB___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECAUL2BRANCHCUB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASSIGNMENT_WHILE_ASSIGNMENT_S2B_BRANCH_DECISION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(While) arguments.get(2), (Assignment) arguments.get(3), (S2B) arguments.get(4),
					(Branch) arguments.get(5), (Decision) arguments.get(6));
		case RulesPackage.DECAUL2BRANCHCUB___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.DECAUL2BRANCHCUB___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.DECAUL2BRANCHCUB___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.DECAUL2BRANCHCUB___IS_APPROPRIATE_BWD__MATCH_BRANCH_COMMAND_BRANCH_COMMAND:
			return isAppropriate_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4));
		case RulesPackage.DECAUL2BRANCHCUB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.DECAUL2BRANCHCUB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.DECAUL2BRANCHCUB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BRANCH_COMMAND_BRANCH_COMMAND:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3), (Command) arguments.get(4));
			return null;
		case RulesPackage.DECAUL2BRANCHCUB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BRANCH_COMMAND_BRANCH_COMMAND:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (Branch) arguments.get(3), (Command) arguments.get(4));
		case RulesPackage.DECAUL2BRANCHCUB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECAUL2BRANCHCUB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BRANCH_COMMAND_S2B_BRANCH_DECISION_COMMAND:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Branch) arguments.get(1),
					(Command) arguments.get(2), (S2B) arguments.get(3), (Branch) arguments.get(4),
					(Decision) arguments.get(5), (Command) arguments.get(6));
		case RulesPackage.DECAUL2BRANCHCUB___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.DECAUL2BRANCHCUB___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.DECAUL2BRANCHCUB___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.DECAUL2BRANCHCUB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_123__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_123((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECAUL2BRANCHCUB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_123__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_123((EMoflonEdge) arguments.get(0));
		case RulesPackage.DECAUL2BRANCHCUB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECAUL2BRANCHCUB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.DECAUL2BRANCHCUB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.DECAUL2BRANCHCUB___IS_APPLICABLE_SOLVE_CSP_CC__ASSIGNMENT_BRANCH_WHILE_COMMAND_ASSIGNMENT_BRANCH_DECISION_COMMAND_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Assignment) arguments.get(0), (Branch) arguments.get(1),
					(While) arguments.get(2), (Command) arguments.get(3), (Assignment) arguments.get(4),
					(Branch) arguments.get(5), (Decision) arguments.get(6), (Command) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.DECAUL2BRANCHCUB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.DECAUL2BRANCHCUB___CHECK_DEC_FWD__ASSIGNMENT_WHILE_ASSIGNMENT_DECISION:
			return checkDEC_FWD((Assignment) arguments.get(0), (While) arguments.get(1), (Assignment) arguments.get(2),
					(Decision) arguments.get(3));
		case RulesPackage.DECAUL2BRANCHCUB___CHECK_DEC_BWD__BRANCH_COMMAND_BRANCH_COMMAND:
			return checkDEC_BWD((Branch) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3));
		case RulesPackage.DECAUL2BRANCHCUB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.DECAUL2BRANCHCUB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_BRANCH_DECISION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(Branch) arguments.get(2), (Decision) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.DECAUL2BRANCHCUB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_decaul2branchcub_0_1_initialbindings_blackBBBBBB(decaul2branchcub _this,
			Match match, Assignment l, While b, Assignment a, Decision d) {
		if (!a.equals(l)) {
			return new Object[] { _this, match, l, b, a, d };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_0_2_SolveCSP_bindingFBBBBBB(decaul2branchcub _this,
			Match match, Assignment l, While b, Assignment a, Decision d) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, l, b, a, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, l, b, a, d };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decaul2branchcub_0_2_SolveCSP_bindingAndBlackFBBBBBB(decaul2branchcub _this,
			Match match, Assignment l, While b, Assignment a, Decision d) {
		Object[] result_pattern_decaul2branchcub_0_2_SolveCSP_binding = pattern_decaul2branchcub_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, l, b, a, d);
		if (result_pattern_decaul2branchcub_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decaul2branchcub_0_2_SolveCSP_binding[0];

			Object[] result_pattern_decaul2branchcub_0_2_SolveCSP_black = pattern_decaul2branchcub_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decaul2branchcub_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, l, b, a, d };
			}
		}
		return null;
	}

	public static final boolean pattern_decaul2branchcub_0_3_CheckCSP_expressionFBB(decaul2branchcub _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decaul2branchcub_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			Assignment l, While b, Assignment a, Decision d) {
		if (!a.equals(l)) {
			return new Object[] { match, l, b, a, d };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_0_4_collectelementstobetranslated_greenBBBBBFFFF(Match match,
			Assignment l, While b, Assignment a, Decision d) {
		EMoflonEdge b__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(l);
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(a);
		String b__l____first_name_prime = "first";
		String b__l____last_name_prime = "last";
		String d__a____positive_name_prime = "positive";
		String d__b____negative_name_prime = "negative";
		b__l____first.setSrc(b);
		b__l____first.setTrg(l);
		match.getToBeTranslatedEdges().add(b__l____first);
		b__l____last.setSrc(b);
		b__l____last.setTrg(l);
		match.getToBeTranslatedEdges().add(b__l____last);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		match.getToBeTranslatedEdges().add(d__a____positive);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		match.getToBeTranslatedEdges().add(d__b____negative);
		b__l____first.setName(b__l____first_name_prime);
		b__l____last.setName(b__l____last_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		return new Object[] { match, l, b, a, d, b__l____first, b__l____last, d__a____positive, d__b____negative };
	}

	public static final Object[] pattern_decaul2branchcub_0_5_collectcontextelements_blackBBBBB(Match match,
			Assignment l, While b, Assignment a, Decision d) {
		if (!a.equals(l)) {
			return new Object[] { match, l, b, a, d };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_0_5_collectcontextelements_greenBB(Match match, Decision d) {
		match.getContextNodes().add(d);
		return new Object[] { match, d };
	}

	public static final void pattern_decaul2branchcub_0_6_registerobjectstomatch_expressionBBBBBB(
			decaul2branchcub _this, Match match, Assignment l, While b, Assignment a, Decision d) {
		_this.registerObjectsToMatch_FWD(match, l, b, a, d);

	}

	public static final boolean pattern_decaul2branchcub_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decaul2branchcub_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decaul2branchcub_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("l");
		EObject _localVariable_1 = isApplicableMatch.getObject("b");
		EObject _localVariable_2 = isApplicableMatch.getObject("a");
		EObject _localVariable_3 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_4 = isApplicableMatch.getObject("c");
		EObject _localVariable_5 = isApplicableMatch.getObject("d");
		EObject tmpL = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpD2c = _localVariable_3;
		EObject tmpC = _localVariable_4;
		EObject tmpD = _localVariable_5;
		if (tmpL instanceof Assignment) {
			Assignment l = (Assignment) tmpL;
			if (tmpB instanceof While) {
				While b = (While) tmpB;
				if (tmpA instanceof Assignment) {
					Assignment a = (Assignment) tmpA;
					if (tmpD2c instanceof S2B) {
						S2B d2c = (S2B) tmpD2c;
						if (tmpC instanceof Branch) {
							Branch c = (Branch) tmpC;
							if (tmpD instanceof Decision) {
								Decision d = (Decision) tmpD;
								return new Object[] { l, b, a, d2c, c, d, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_1_1_performtransformation_blackBBBBBBFBB(Assignment l,
			While b, Assignment a, S2B d2c, Branch c, Decision d, decaul2branchcub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!a.equals(l)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { l, b, a, d2c, c, d, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			decaul2branchcub _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decaul2branchcub_1_1_performtransformation_binding = pattern_decaul2branchcub_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_decaul2branchcub_1_1_performtransformation_binding != null) {
			Assignment l = (Assignment) result_pattern_decaul2branchcub_1_1_performtransformation_binding[0];
			While b = (While) result_pattern_decaul2branchcub_1_1_performtransformation_binding[1];
			Assignment a = (Assignment) result_pattern_decaul2branchcub_1_1_performtransformation_binding[2];
			S2B d2c = (S2B) result_pattern_decaul2branchcub_1_1_performtransformation_binding[3];
			Branch c = (Branch) result_pattern_decaul2branchcub_1_1_performtransformation_binding[4];
			Decision d = (Decision) result_pattern_decaul2branchcub_1_1_performtransformation_binding[5];

			Object[] result_pattern_decaul2branchcub_1_1_performtransformation_black = pattern_decaul2branchcub_1_1_performtransformation_blackBBBBBBFBB(
					l, b, a, d2c, c, d, _this, isApplicableMatch);
			if (result_pattern_decaul2branchcub_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decaul2branchcub_1_1_performtransformation_black[6];

				return new Object[] { l, b, a, d2c, c, d, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_1_1_performtransformation_greenBFBFBFFBFF(Assignment l,
			While b, Assignment a, Branch c) {
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		Command x = ControlflowFactory.eINSTANCE.createCommand();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		c.setNegative(y);
		c.setPositive(x);
		l2z.setSource(l);
		b2y.setTarget(y);
		b2y.setSource(b);
		a2x.setSource(a);
		a2x.setTarget(x);
		y.setPositive(z);
		l2z.setTarget(z);
		z.setNext(y);
		return new Object[] { l, y, b, x, a, l2z, b2y, c, a2x, z };
	}

	public static final Object[] pattern_decaul2branchcub_1_2_collecttranslatedelements_blackBBBBBBBBB(Assignment l,
			Branch y, While b, Command x, Assignment a, S2N l2z, S2B b2y, S2N a2x, Command z) {
		if (!x.equals(z)) {
			if (!a.equals(l)) {
				if (!a2x.equals(l2z)) {
					return new Object[] { l, y, b, x, a, l2z, b2y, a2x, z };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_1_2_collecttranslatedelements_greenFBBBBBBBBB(Assignment l,
			Branch y, While b, Command x, Assignment a, S2N l2z, S2B b2y, S2N a2x, Command z) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(l);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedElements().add(z);
		return new Object[] { ruleresult, l, y, b, x, a, l2z, b2y, a2x, z };
	}

	public static final Object[] pattern_decaul2branchcub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject l, EObject y, EObject b, EObject x, EObject a, EObject l2z,
			EObject d2c, EObject b2y, EObject c, EObject a2x, EObject d, EObject z) {
		if (!l.equals(y)) {
			if (!l.equals(x)) {
				if (!l.equals(l2z)) {
					if (!l.equals(z)) {
						if (!y.equals(z)) {
							if (!b.equals(l)) {
								if (!b.equals(y)) {
									if (!b.equals(x)) {
										if (!b.equals(l2z)) {
											if (!b.equals(d2c)) {
												if (!b.equals(b2y)) {
													if (!b.equals(c)) {
														if (!b.equals(d)) {
															if (!b.equals(z)) {
																if (!x.equals(y)) {
																	if (!x.equals(z)) {
																		if (!a.equals(l)) {
																			if (!a.equals(y)) {
																				if (!a.equals(b)) {
																					if (!a.equals(x)) {
																						if (!a.equals(l2z)) {
																							if (!a.equals(d2c)) {
																								if (!a.equals(b2y)) {
																									if (!a.equals(c)) {
																										if (!a.equals(
																												a2x)) {
																											if (!a.equals(
																													d)) {
																												if (!a.equals(
																														z)) {
																													if (!l2z.equals(
																															y)) {
																														if (!l2z.equals(
																																x)) {
																															if (!l2z.equals(
																																	z)) {
																																if (!d2c.equals(
																																		l)) {
																																	if (!d2c.equals(
																																			y)) {
																																		if (!d2c.equals(
																																				x)) {
																																			if (!d2c.equals(
																																					l2z)) {
																																				if (!d2c.equals(
																																						z)) {
																																					if (!b2y.equals(
																																							l)) {
																																						if (!b2y.equals(
																																								y)) {
																																							if (!b2y.equals(
																																									x)) {
																																								if (!b2y.equals(
																																										l2z)) {
																																									if (!b2y.equals(
																																											d2c)) {
																																										if (!b2y.equals(
																																												c)) {
																																											if (!b2y.equals(
																																													d)) {
																																												if (!b2y.equals(
																																														z)) {
																																													if (!c.equals(
																																															l)) {
																																														if (!c.equals(
																																																y)) {
																																															if (!c.equals(
																																																	x)) {
																																																if (!c.equals(
																																																		l2z)) {
																																																	if (!c.equals(
																																																			d2c)) {
																																																		if (!c.equals(
																																																				d)) {
																																																			if (!c.equals(
																																																					z)) {
																																																				if (!a2x.equals(
																																																						l)) {
																																																					if (!a2x.equals(
																																																							y)) {
																																																						if (!a2x.equals(
																																																								b)) {
																																																							if (!a2x.equals(
																																																									x)) {
																																																								if (!a2x.equals(
																																																										l2z)) {
																																																									if (!a2x.equals(
																																																											d2c)) {
																																																										if (!a2x.equals(
																																																												b2y)) {
																																																											if (!a2x.equals(
																																																													c)) {
																																																												if (!a2x.equals(
																																																														d)) {
																																																													if (!a2x.equals(
																																																															z)) {
																																																														if (!d.equals(
																																																																l)) {
																																																															if (!d.equals(
																																																																	y)) {
																																																																if (!d.equals(
																																																																		x)) {
																																																																	if (!d.equals(
																																																																			l2z)) {
																																																																		if (!d.equals(
																																																																				d2c)) {
																																																																			if (!d.equals(
																																																																					z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						l,
																																																																						y,
																																																																						b,
																																																																						x,
																																																																						a,
																																																																						l2z,
																																																																						d2c,
																																																																						b2y,
																																																																						c,
																																																																						a2x,
																																																																						d,
																																																																						z };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_decaul2branchcub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject l, EObject y, EObject b, EObject x, EObject a, EObject l2z,
			EObject b2y, EObject c, EObject a2x, EObject d, EObject z) {
		EMoflonEdge b__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decaul2branchcub";
		String b__l____first_name_prime = "first";
		String b__l____last_name_prime = "last";
		String l2z__l____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String a2x__a____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String d__a____positive_name_prime = "positive";
		String y__z____positive_name_prime = "positive";
		String b2y__b____source_name_prime = "source";
		String l2z__z____target_name_prime = "target";
		String z__y____next_name_prime = "next";
		String d__b____negative_name_prime = "negative";
		b__l____first.setSrc(b);
		b__l____first.setTrg(l);
		ruleresult.getTranslatedEdges().add(b__l____first);
		b__l____last.setSrc(b);
		b__l____last.setTrg(l);
		ruleresult.getTranslatedEdges().add(b__l____last);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getCreatedEdges().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(c__x____positive);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getTranslatedEdges().add(d__a____positive);
		y__z____positive.setSrc(y);
		y__z____positive.setTrg(z);
		ruleresult.getCreatedEdges().add(y__z____positive);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		ruleresult.getCreatedEdges().add(z__y____next);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getTranslatedEdges().add(d__b____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b__l____first.setName(b__l____first_name_prime);
		b__l____last.setName(b__l____last_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		y__z____positive.setName(y__z____positive_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		return new Object[] { ruleresult, l, y, b, x, a, l2z, b2y, c, a2x, d, z, b__l____first, b__l____last,
				l2z__l____source, b2y__y____target, c__y____negative, c__x____positive, a2x__a____source,
				a2x__x____target, d__a____positive, y__z____positive, b2y__b____source, l2z__z____target, z__y____next,
				d__b____negative };
	}

	public static final void pattern_decaul2branchcub_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			decaul2branchcub _this, PerformRuleResult ruleresult, EObject l, EObject y, EObject b, EObject x, EObject a,
			EObject l2z, EObject d2c, EObject b2y, EObject c, EObject a2x, EObject d, EObject z) {
		_this.registerObjects_FWD(ruleresult, l, y, b, x, a, l2z, d2c, b2y, c, a2x, d, z);

	}

	public static final PerformRuleResult pattern_decaul2branchcub_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decaul2branchcub_2_1_preparereturnvalue_bindingFB(decaul2branchcub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_2_1_preparereturnvalue_blackFBB(EClass eClass,
			decaul2branchcub _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_2_1_preparereturnvalue_bindingAndBlackFFB(
			decaul2branchcub _this) {
		Object[] result_pattern_decaul2branchcub_2_1_preparereturnvalue_binding = pattern_decaul2branchcub_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decaul2branchcub_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decaul2branchcub_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decaul2branchcub_2_1_preparereturnvalue_black = pattern_decaul2branchcub_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decaul2branchcub_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decaul2branchcub_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decaul2branchcub";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decaul2branchcub_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("l");
		EObject _localVariable_1 = match.getObject("b");
		EObject _localVariable_2 = match.getObject("a");
		EObject _localVariable_3 = match.getObject("d");
		EObject tmpL = _localVariable_0;
		EObject tmpB = _localVariable_1;
		EObject tmpA = _localVariable_2;
		EObject tmpD = _localVariable_3;
		if (tmpL instanceof Assignment) {
			Assignment l = (Assignment) tmpL;
			if (tmpB instanceof While) {
				While b = (While) tmpB;
				if (tmpA instanceof Assignment) {
					Assignment a = (Assignment) tmpA;
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						return new Object[] { l, b, a, d, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decaul2branchcub_2_2_corematch_blackBBBFFBB(Assignment l, While b,
			Assignment a, Decision d, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(l)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(d, S2B.class, "source")) {
				Branch c = d2c.getTarget();
				if (c != null) {
					_result.add(new Object[] { l, b, a, d2c, c, d, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decaul2branchcub_2_3_findcontext_blackBBBBBB(Assignment l, While b,
			Assignment a, S2B d2c, Branch c, Decision d) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a.equals(l)) {
			if (l.equals(b.getFirst())) {
				if (l.equals(b.getLast())) {
					if (c.equals(d2c.getTarget())) {
						if (a.equals(d.getPositive())) {
							if (d.equals(d2c.getSource())) {
								if (b.equals(d.getNegative())) {
									_result.add(new Object[] { l, b, a, d2c, c, d });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decaul2branchcub_2_3_findcontext_greenBBBBBBFFFFFFF(Assignment l, While b,
			Assignment a, S2B d2c, Branch c, Decision d) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge b__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String b__l____first_name_prime = "first";
		String b__l____last_name_prime = "last";
		String d2c__c____target_name_prime = "target";
		String d__a____positive_name_prime = "positive";
		String d2c__d____source_name_prime = "source";
		String d__b____negative_name_prime = "negative";
		isApplicableMatch.getAllContextElements().add(l);
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(d);
		b__l____first.setSrc(b);
		b__l____first.setTrg(l);
		isApplicableMatch.getAllContextElements().add(b__l____first);
		b__l____last.setSrc(b);
		b__l____last.setTrg(l);
		isApplicableMatch.getAllContextElements().add(b__l____last);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		isApplicableMatch.getAllContextElements().add(d__a____positive);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		isApplicableMatch.getAllContextElements().add(d__b____negative);
		b__l____first.setName(b__l____first_name_prime);
		b__l____last.setName(b__l____last_name_prime);
		d2c__c____target.setName(d2c__c____target_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		return new Object[] { l, b, a, d2c, c, d, isApplicableMatch, b__l____first, b__l____last, d2c__c____target,
				d__a____positive, d2c__d____source, d__b____negative };
	}

	public static final Object[] pattern_decaul2branchcub_2_4_solveCSP_bindingFBBBBBBBB(decaul2branchcub _this,
			IsApplicableMatch isApplicableMatch, Assignment l, While b, Assignment a, S2B d2c, Branch c, Decision d) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, l, b, a, d2c, c, d);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, l, b, a, d2c, c, d };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decaul2branchcub_2_4_solveCSP_bindingAndBlackFBBBBBBBB(decaul2branchcub _this,
			IsApplicableMatch isApplicableMatch, Assignment l, While b, Assignment a, S2B d2c, Branch c, Decision d) {
		Object[] result_pattern_decaul2branchcub_2_4_solveCSP_binding = pattern_decaul2branchcub_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, l, b, a, d2c, c, d);
		if (result_pattern_decaul2branchcub_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decaul2branchcub_2_4_solveCSP_binding[0];

			Object[] result_pattern_decaul2branchcub_2_4_solveCSP_black = pattern_decaul2branchcub_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_decaul2branchcub_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, l, b, a, d2c, c, d };
			}
		}
		return null;
	}

	public static final boolean pattern_decaul2branchcub_2_5_checkCSP_expressionFBB(decaul2branchcub _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decaul2branchcub_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decaul2branchcub_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decaul2branchcub";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decaul2branchcub_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decaul2branchcub_10_1_initialbindings_blackBBBBBB(decaul2branchcub _this,
			Match match, Branch y, Command x, Branch c, Command z) {
		if (!x.equals(z)) {
			if (!c.equals(y)) {
				return new Object[] { _this, match, y, x, c, z };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_10_2_SolveCSP_bindingFBBBBBB(decaul2branchcub _this,
			Match match, Branch y, Command x, Branch c, Command z) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, y, x, c, z);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, y, x, c, z };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decaul2branchcub_10_2_SolveCSP_bindingAndBlackFBBBBBB(decaul2branchcub _this,
			Match match, Branch y, Command x, Branch c, Command z) {
		Object[] result_pattern_decaul2branchcub_10_2_SolveCSP_binding = pattern_decaul2branchcub_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, y, x, c, z);
		if (result_pattern_decaul2branchcub_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decaul2branchcub_10_2_SolveCSP_binding[0];

			Object[] result_pattern_decaul2branchcub_10_2_SolveCSP_black = pattern_decaul2branchcub_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_decaul2branchcub_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, y, x, c, z };
			}
		}
		return null;
	}

	public static final boolean pattern_decaul2branchcub_10_3_CheckCSP_expressionFBB(decaul2branchcub _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decaul2branchcub_10_4_collectelementstobetranslated_blackBBBBB(Match match,
			Branch y, Command x, Branch c, Command z) {
		if (!x.equals(z)) {
			if (!c.equals(y)) {
				return new Object[] { match, y, x, c, z };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_10_4_collectelementstobetranslated_greenBBBBBFFFF(Match match,
			Branch y, Command x, Branch c, Command z) {
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(x);
		match.getToBeTranslatedNodes().add(z);
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String y__z____positive_name_prime = "positive";
		String z__y____next_name_prime = "next";
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		match.getToBeTranslatedEdges().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(c__x____positive);
		y__z____positive.setSrc(y);
		y__z____positive.setTrg(z);
		match.getToBeTranslatedEdges().add(y__z____positive);
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		match.getToBeTranslatedEdges().add(z__y____next);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		y__z____positive.setName(y__z____positive_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		return new Object[] { match, y, x, c, z, c__y____negative, c__x____positive, y__z____positive, z__y____next };
	}

	public static final Object[] pattern_decaul2branchcub_10_5_collectcontextelements_blackBBBBB(Match match, Branch y,
			Command x, Branch c, Command z) {
		if (!x.equals(z)) {
			if (!c.equals(y)) {
				return new Object[] { match, y, x, c, z };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_10_5_collectcontextelements_greenBB(Match match, Branch c) {
		match.getContextNodes().add(c);
		return new Object[] { match, c };
	}

	public static final void pattern_decaul2branchcub_10_6_registerobjectstomatch_expressionBBBBBB(
			decaul2branchcub _this, Match match, Branch y, Command x, Branch c, Command z) {
		_this.registerObjectsToMatch_BWD(match, y, x, c, z);

	}

	public static final boolean pattern_decaul2branchcub_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decaul2branchcub_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decaul2branchcub_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("y");
		EObject _localVariable_1 = isApplicableMatch.getObject("x");
		EObject _localVariable_2 = isApplicableMatch.getObject("d2c");
		EObject _localVariable_3 = isApplicableMatch.getObject("c");
		EObject _localVariable_4 = isApplicableMatch.getObject("d");
		EObject _localVariable_5 = isApplicableMatch.getObject("z");
		EObject tmpY = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpD2c = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpD = _localVariable_4;
		EObject tmpZ = _localVariable_5;
		if (tmpY instanceof Branch) {
			Branch y = (Branch) tmpY;
			if (tmpX instanceof Command) {
				Command x = (Command) tmpX;
				if (tmpD2c instanceof S2B) {
					S2B d2c = (S2B) tmpD2c;
					if (tmpC instanceof Branch) {
						Branch c = (Branch) tmpC;
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							if (tmpZ instanceof Command) {
								Command z = (Command) tmpZ;
								return new Object[] { y, x, d2c, c, d, z, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_11_1_performtransformation_blackBBBBBBFBB(Branch y, Command x,
			S2B d2c, Branch c, Decision d, Command z, decaul2branchcub _this, IsApplicableMatch isApplicableMatch) {
		if (!x.equals(z)) {
			if (!c.equals(y)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { y, x, d2c, c, d, z, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			decaul2branchcub _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_decaul2branchcub_11_1_performtransformation_binding = pattern_decaul2branchcub_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_decaul2branchcub_11_1_performtransformation_binding != null) {
			Branch y = (Branch) result_pattern_decaul2branchcub_11_1_performtransformation_binding[0];
			Command x = (Command) result_pattern_decaul2branchcub_11_1_performtransformation_binding[1];
			S2B d2c = (S2B) result_pattern_decaul2branchcub_11_1_performtransformation_binding[2];
			Branch c = (Branch) result_pattern_decaul2branchcub_11_1_performtransformation_binding[3];
			Decision d = (Decision) result_pattern_decaul2branchcub_11_1_performtransformation_binding[4];
			Command z = (Command) result_pattern_decaul2branchcub_11_1_performtransformation_binding[5];

			Object[] result_pattern_decaul2branchcub_11_1_performtransformation_black = pattern_decaul2branchcub_11_1_performtransformation_blackBBBBBBFBB(
					y, x, d2c, c, d, z, _this, isApplicableMatch);
			if (result_pattern_decaul2branchcub_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_decaul2branchcub_11_1_performtransformation_black[6];

				return new Object[] { y, x, d2c, c, d, z, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_11_1_performtransformation_greenFBFBFFFFBB(Branch y,
			Command x, Decision d, Command z) {
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		b.setFirst(l);
		b.setLast(l);
		d.setNegative(b);
		d.setPositive(a);
		l2z.setSource(l);
		l2z.setTarget(z);
		b2y.setTarget(y);
		b2y.setSource(b);
		a2x.setSource(a);
		a2x.setTarget(x);
		return new Object[] { l, y, b, x, a, l2z, b2y, a2x, d, z };
	}

	public static final Object[] pattern_decaul2branchcub_11_2_collecttranslatedelements_blackBBBBBBBBB(Assignment l,
			Branch y, While b, Command x, Assignment a, S2N l2z, S2B b2y, S2N a2x, Command z) {
		if (!x.equals(z)) {
			if (!a.equals(l)) {
				if (!a2x.equals(l2z)) {
					return new Object[] { l, y, b, x, a, l2z, b2y, a2x, z };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_11_2_collecttranslatedelements_greenFBBBBBBBBB(Assignment l,
			Branch y, While b, Command x, Assignment a, S2N l2z, S2B b2y, S2N a2x, Command z) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(l);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getCreatedElements().add(b);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(l2z);
		ruleresult.getCreatedLinkElements().add(b2y);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getTranslatedElements().add(z);
		return new Object[] { ruleresult, l, y, b, x, a, l2z, b2y, a2x, z };
	}

	public static final Object[] pattern_decaul2branchcub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject l, EObject y, EObject b, EObject x, EObject a, EObject l2z,
			EObject d2c, EObject b2y, EObject c, EObject a2x, EObject d, EObject z) {
		if (!l.equals(y)) {
			if (!l.equals(x)) {
				if (!l.equals(l2z)) {
					if (!l.equals(z)) {
						if (!y.equals(z)) {
							if (!b.equals(l)) {
								if (!b.equals(y)) {
									if (!b.equals(x)) {
										if (!b.equals(l2z)) {
											if (!b.equals(d2c)) {
												if (!b.equals(b2y)) {
													if (!b.equals(c)) {
														if (!b.equals(d)) {
															if (!b.equals(z)) {
																if (!x.equals(y)) {
																	if (!x.equals(z)) {
																		if (!a.equals(l)) {
																			if (!a.equals(y)) {
																				if (!a.equals(b)) {
																					if (!a.equals(x)) {
																						if (!a.equals(l2z)) {
																							if (!a.equals(d2c)) {
																								if (!a.equals(b2y)) {
																									if (!a.equals(c)) {
																										if (!a.equals(
																												a2x)) {
																											if (!a.equals(
																													d)) {
																												if (!a.equals(
																														z)) {
																													if (!l2z.equals(
																															y)) {
																														if (!l2z.equals(
																																x)) {
																															if (!l2z.equals(
																																	z)) {
																																if (!d2c.equals(
																																		l)) {
																																	if (!d2c.equals(
																																			y)) {
																																		if (!d2c.equals(
																																				x)) {
																																			if (!d2c.equals(
																																					l2z)) {
																																				if (!d2c.equals(
																																						z)) {
																																					if (!b2y.equals(
																																							l)) {
																																						if (!b2y.equals(
																																								y)) {
																																							if (!b2y.equals(
																																									x)) {
																																								if (!b2y.equals(
																																										l2z)) {
																																									if (!b2y.equals(
																																											d2c)) {
																																										if (!b2y.equals(
																																												c)) {
																																											if (!b2y.equals(
																																													d)) {
																																												if (!b2y.equals(
																																														z)) {
																																													if (!c.equals(
																																															l)) {
																																														if (!c.equals(
																																																y)) {
																																															if (!c.equals(
																																																	x)) {
																																																if (!c.equals(
																																																		l2z)) {
																																																	if (!c.equals(
																																																			d2c)) {
																																																		if (!c.equals(
																																																				d)) {
																																																			if (!c.equals(
																																																					z)) {
																																																				if (!a2x.equals(
																																																						l)) {
																																																					if (!a2x.equals(
																																																							y)) {
																																																						if (!a2x.equals(
																																																								b)) {
																																																							if (!a2x.equals(
																																																									x)) {
																																																								if (!a2x.equals(
																																																										l2z)) {
																																																									if (!a2x.equals(
																																																											d2c)) {
																																																										if (!a2x.equals(
																																																												b2y)) {
																																																											if (!a2x.equals(
																																																													c)) {
																																																												if (!a2x.equals(
																																																														d)) {
																																																													if (!a2x.equals(
																																																															z)) {
																																																														if (!d.equals(
																																																																l)) {
																																																															if (!d.equals(
																																																																	y)) {
																																																																if (!d.equals(
																																																																		x)) {
																																																																	if (!d.equals(
																																																																			l2z)) {
																																																																		if (!d.equals(
																																																																				d2c)) {
																																																																			if (!d.equals(
																																																																					z)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						l,
																																																																						y,
																																																																						b,
																																																																						x,
																																																																						a,
																																																																						l2z,
																																																																						d2c,
																																																																						b2y,
																																																																						c,
																																																																						a2x,
																																																																						d,
																																																																						z };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_decaul2branchcub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject l, EObject y, EObject b, EObject x, EObject a, EObject l2z,
			EObject b2y, EObject c, EObject a2x, EObject d, EObject z) {
		EMoflonEdge b__l____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b__l____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__l____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__a____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge l2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d__b____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "decaul2branchcub";
		String b__l____first_name_prime = "first";
		String b__l____last_name_prime = "last";
		String l2z__l____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String a2x__a____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String d__a____positive_name_prime = "positive";
		String y__z____positive_name_prime = "positive";
		String b2y__b____source_name_prime = "source";
		String l2z__z____target_name_prime = "target";
		String z__y____next_name_prime = "next";
		String d__b____negative_name_prime = "negative";
		b__l____first.setSrc(b);
		b__l____first.setTrg(l);
		ruleresult.getCreatedEdges().add(b__l____first);
		b__l____last.setSrc(b);
		b__l____last.setTrg(l);
		ruleresult.getCreatedEdges().add(b__l____last);
		l2z__l____source.setSrc(l2z);
		l2z__l____source.setTrg(l);
		ruleresult.getCreatedEdges().add(l2z__l____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		ruleresult.getTranslatedEdges().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(c__x____positive);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		d__a____positive.setSrc(d);
		d__a____positive.setTrg(a);
		ruleresult.getCreatedEdges().add(d__a____positive);
		y__z____positive.setSrc(y);
		y__z____positive.setTrg(z);
		ruleresult.getTranslatedEdges().add(y__z____positive);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		l2z__z____target.setSrc(l2z);
		l2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(l2z__z____target);
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		ruleresult.getTranslatedEdges().add(z__y____next);
		d__b____negative.setSrc(d);
		d__b____negative.setTrg(b);
		ruleresult.getCreatedEdges().add(d__b____negative);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b__l____first.setName(b__l____first_name_prime);
		b__l____last.setName(b__l____last_name_prime);
		l2z__l____source.setName(l2z__l____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		d__a____positive.setName(d__a____positive_name_prime);
		y__z____positive.setName(y__z____positive_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		l2z__z____target.setName(l2z__z____target_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		d__b____negative.setName(d__b____negative_name_prime);
		return new Object[] { ruleresult, l, y, b, x, a, l2z, b2y, c, a2x, d, z, b__l____first, b__l____last,
				l2z__l____source, b2y__y____target, c__y____negative, c__x____positive, a2x__a____source,
				a2x__x____target, d__a____positive, y__z____positive, b2y__b____source, l2z__z____target, z__y____next,
				d__b____negative };
	}

	public static final void pattern_decaul2branchcub_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			decaul2branchcub _this, PerformRuleResult ruleresult, EObject l, EObject y, EObject b, EObject x, EObject a,
			EObject l2z, EObject d2c, EObject b2y, EObject c, EObject a2x, EObject d, EObject z) {
		_this.registerObjects_BWD(ruleresult, l, y, b, x, a, l2z, d2c, b2y, c, a2x, d, z);

	}

	public static final PerformRuleResult pattern_decaul2branchcub_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decaul2branchcub_12_1_preparereturnvalue_bindingFB(decaul2branchcub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_12_1_preparereturnvalue_blackFBB(EClass eClass,
			decaul2branchcub _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_12_1_preparereturnvalue_bindingAndBlackFFB(
			decaul2branchcub _this) {
		Object[] result_pattern_decaul2branchcub_12_1_preparereturnvalue_binding = pattern_decaul2branchcub_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decaul2branchcub_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_decaul2branchcub_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decaul2branchcub_12_1_preparereturnvalue_black = pattern_decaul2branchcub_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_decaul2branchcub_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_decaul2branchcub_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "decaul2branchcub";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_decaul2branchcub_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("y");
		EObject _localVariable_1 = match.getObject("x");
		EObject _localVariable_2 = match.getObject("c");
		EObject _localVariable_3 = match.getObject("z");
		EObject tmpY = _localVariable_0;
		EObject tmpX = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpZ = _localVariable_3;
		if (tmpY instanceof Branch) {
			Branch y = (Branch) tmpY;
			if (tmpX instanceof Command) {
				Command x = (Command) tmpX;
				if (tmpC instanceof Branch) {
					Branch c = (Branch) tmpC;
					if (tmpZ instanceof Command) {
						Command z = (Command) tmpZ;
						return new Object[] { y, x, c, z, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decaul2branchcub_12_2_corematch_blackBBFBFBB(Branch y, Command x,
			Branch c, Command z, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(z)) {
			if (!c.equals(y)) {
				for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class,
						"target")) {
					Statement tmpD = d2c.getSource();
					if (tmpD instanceof Decision) {
						Decision d = (Decision) tmpD;
						_result.add(new Object[] { y, x, d2c, c, d, z, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_decaul2branchcub_12_3_findcontext_blackBBBBBB(Branch y, Command x,
			S2B d2c, Branch c, Decision d, Command z) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(z)) {
			if (!c.equals(y)) {
				if (c.equals(d2c.getTarget())) {
					if (y.equals(c.getNegative())) {
						if (x.equals(c.getPositive())) {
							if (z.equals(y.getPositive())) {
								if (d.equals(d2c.getSource())) {
									if (y.equals(z.getNext())) {
										_result.add(new Object[] { y, x, d2c, c, d, z });
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

	public static final Object[] pattern_decaul2branchcub_12_3_findcontext_greenBBBBBBFFFFFFF(Branch y, Command x,
			S2B d2c, Branch c, Decision d, Command z) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge d2c__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__y____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge d2c__d____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String d2c__c____target_name_prime = "target";
		String c__y____negative_name_prime = "negative";
		String c__x____positive_name_prime = "positive";
		String y__z____positive_name_prime = "positive";
		String d2c__d____source_name_prime = "source";
		String z__y____next_name_prime = "next";
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(d2c);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(d);
		isApplicableMatch.getAllContextElements().add(z);
		d2c__c____target.setSrc(d2c);
		d2c__c____target.setTrg(c);
		isApplicableMatch.getAllContextElements().add(d2c__c____target);
		c__y____negative.setSrc(c);
		c__y____negative.setTrg(y);
		isApplicableMatch.getAllContextElements().add(c__y____negative);
		c__x____positive.setSrc(c);
		c__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(c__x____positive);
		y__z____positive.setSrc(y);
		y__z____positive.setTrg(z);
		isApplicableMatch.getAllContextElements().add(y__z____positive);
		d2c__d____source.setSrc(d2c);
		d2c__d____source.setTrg(d);
		isApplicableMatch.getAllContextElements().add(d2c__d____source);
		z__y____next.setSrc(z);
		z__y____next.setTrg(y);
		isApplicableMatch.getAllContextElements().add(z__y____next);
		d2c__c____target.setName(d2c__c____target_name_prime);
		c__y____negative.setName(c__y____negative_name_prime);
		c__x____positive.setName(c__x____positive_name_prime);
		y__z____positive.setName(y__z____positive_name_prime);
		d2c__d____source.setName(d2c__d____source_name_prime);
		z__y____next.setName(z__y____next_name_prime);
		return new Object[] { y, x, d2c, c, d, z, isApplicableMatch, d2c__c____target, c__y____negative,
				c__x____positive, y__z____positive, d2c__d____source, z__y____next };
	}

	public static final Object[] pattern_decaul2branchcub_12_4_solveCSP_bindingFBBBBBBBB(decaul2branchcub _this,
			IsApplicableMatch isApplicableMatch, Branch y, Command x, S2B d2c, Branch c, Decision d, Command z) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, y, x, d2c, c, d, z);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, y, x, d2c, c, d, z };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decaul2branchcub_12_4_solveCSP_bindingAndBlackFBBBBBBBB(decaul2branchcub _this,
			IsApplicableMatch isApplicableMatch, Branch y, Command x, S2B d2c, Branch c, Decision d, Command z) {
		Object[] result_pattern_decaul2branchcub_12_4_solveCSP_binding = pattern_decaul2branchcub_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, y, x, d2c, c, d, z);
		if (result_pattern_decaul2branchcub_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decaul2branchcub_12_4_solveCSP_binding[0];

			Object[] result_pattern_decaul2branchcub_12_4_solveCSP_black = pattern_decaul2branchcub_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_decaul2branchcub_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, y, x, d2c, c, d, z };
			}
		}
		return null;
	}

	public static final boolean pattern_decaul2branchcub_12_5_checkCSP_expressionFBB(decaul2branchcub _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decaul2branchcub_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_decaul2branchcub_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "decaul2branchcub";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_decaul2branchcub_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_decaul2branchcub_20_1_preparereturnvalue_bindingFB(decaul2branchcub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decaul2branchcub _this) {
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

	public static final Object[] pattern_decaul2branchcub_20_1_preparereturnvalue_bindingAndBlackFFBF(
			decaul2branchcub _this) {
		Object[] result_pattern_decaul2branchcub_20_1_preparereturnvalue_binding = pattern_decaul2branchcub_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decaul2branchcub_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decaul2branchcub_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decaul2branchcub_20_1_preparereturnvalue_black = pattern_decaul2branchcub_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decaul2branchcub_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decaul2branchcub_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decaul2branchcub_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_0B(Branch y) {
		for (Graph __DEC_y_root_320778 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_1BB(Branch y, Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_y_positive_944176 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!y.equals(__DEC_y_positive_944176)) {
					if (!c.equals(__DEC_y_positive_944176)) {
						return new Object[] { y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_2BB(Branch y, Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_y_negative_987557 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!y.equals(__DEC_y_negative_987557)) {
					if (!c.equals(__DEC_y_negative_987557)) {
						return new Object[] { y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_3B(Command x) {
		for (Graph __DEC_x_root_63668 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_4BBB(Command x, Branch y,
			Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_x_positive_422250 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!y.equals(__DEC_x_positive_422250)) {
					if (!c.equals(__DEC_x_positive_422250)) {
						return new Object[] { x, y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_5BBB(Command x, Branch y,
			Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_x_negative_41424 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!y.equals(__DEC_x_negative_41424)) {
					if (!c.equals(__DEC_x_negative_41424)) {
						return new Object[] { x, y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_6B(Command z) {
		for (Graph __DEC_z_root_81722 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_7BBB(Command z, Branch y,
			Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_z_positive_952312 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!y.equals(__DEC_z_positive_952312)) {
					if (!c.equals(__DEC_z_positive_952312)) {
						return new Object[] { z, y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_8BBB(Command z, Branch y,
			Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_z_negative_875961 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!y.equals(__DEC_z_negative_875961)) {
					if (!c.equals(__DEC_z_negative_875961)) {
						return new Object[] { z, y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_9BB(Branch y, Command x) {
		if (x.equals(y.getPositive())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_10BB(Branch y,
			Command x) {
		if (x.equals(y.getNegative())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_11BB(Branch c,
			Command x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_12BB(Branch c,
			Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_13BB(Branch y,
			Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_14BB(Branch c,
			Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decaul2branchcub_20_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_negative) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpC = _edge_negative.getSrc();
		if (tmpC instanceof Branch) {
			Branch c = (Branch) tmpC;
			EObject tmpY = _edge_negative.getTrg();
			if (tmpY instanceof Branch) {
				Branch y = (Branch) tmpY;
				if (!c.equals(y)) {
					if (y.equals(c.getNegative())) {
						Node tmpX = c.getPositive();
						if (tmpX instanceof Command) {
							Command x = (Command) tmpX;
							Node tmpZ = y.getPositive();
							if (tmpZ instanceof Command) {
								Command z = (Command) tmpZ;
								if (!x.equals(z)) {
									if (y.equals(z.getNext())) {
										if (pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_0B(
												y) == null) {
											if (pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_1BB(y,
													c) == null) {
												if (pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_2BB(y,
														c) == null) {
													if (pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_3B(
															x) == null) {
														if (pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_4BBB(
																x, y, c) == null) {
															if (pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_5BBB(
																	x, y, c) == null) {
																if (pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_9BB(
																		y, x) == null) {
																	if (pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_10BB(
																			y, x) == null) {
																		if (pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_11BB(
																				c, x) == null) {
																			if (pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_6B(
																					z) == null) {
																				if (pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_7BBB(
																						z, y, c) == null) {
																					if (pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_8BBB(
																							z, y, c) == null) {
																						if (pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_12BB(
																								c, z) == null) {
																							if (pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_13BB(
																									y, z) == null) {
																								if (pattern_decaul2branchcub_20_2_testcorematchandDECs_black_nac_14BB(
																										c, z) == null) {
																									_result.add(
																											new Object[] {
																													y,
																													x,
																													c,
																													z,
																													_edge_negative });
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_decaul2branchcub_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decaul2branchcub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			decaul2branchcub _this, Match match, Branch y, Command x, Branch c, Command z) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, y, x, c, z);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decaul2branchcub_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decaul2branchcub _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decaul2branchcub_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decaul2branchcub_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decaul2branchcub_21_1_preparereturnvalue_bindingFB(decaul2branchcub _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			decaul2branchcub _this) {
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

	public static final Object[] pattern_decaul2branchcub_21_1_preparereturnvalue_bindingAndBlackFFBF(
			decaul2branchcub _this) {
		Object[] result_pattern_decaul2branchcub_21_1_preparereturnvalue_binding = pattern_decaul2branchcub_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_decaul2branchcub_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_decaul2branchcub_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_decaul2branchcub_21_1_preparereturnvalue_black = pattern_decaul2branchcub_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_decaul2branchcub_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_decaul2branchcub_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_decaul2branchcub_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_0BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_positive_535922 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_535922)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_1BB(Assignment l,
			Decision d) {
		for (Decision __DEC_l_negative_876981 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_876981)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_2BB(Assignment l,
			While b) {
		for (While __DEC_l_last_213756 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!b.equals(__DEC_l_last_213756)) {
				return new Object[] { l, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_3B(Assignment l) {
		for (Program __DEC_l_first_443165 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_4BB(While b, Decision d) {
		for (Decision __DEC_b_positive_222479 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_222479)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_5B(While b) {
		for (While __DEC_b_first_128051 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!b.equals(__DEC_b_first_128051)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_6B(While b) {
		for (While __DEC_b_last_974985 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!b.equals(__DEC_b_last_974985)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_7B(While b) {
		for (Program __DEC_b_first_533939 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_8BB(Assignment a,
			Decision d) {
		for (Decision __DEC_a_negative_695630 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_695630)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_9BB(Assignment a,
			While b) {
		for (While __DEC_a_first_135611 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!b.equals(__DEC_a_first_135611)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_10BB(Assignment a,
			While b) {
		for (While __DEC_a_last_608457 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!b.equals(__DEC_a_last_608457)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_11B(Assignment a) {
		for (Program __DEC_a_first_300164 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_12BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_13BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_14BB(Decision d,
			While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_15BB(Decision d,
			Assignment a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_16BB(While b,
			Assignment a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_17BB(While b,
			Assignment a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decaul2branchcub_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_first) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpB = _edge_first.getSrc();
		if (tmpB instanceof While) {
			While b = (While) tmpB;
			EObject tmpL = _edge_first.getTrg();
			if (tmpL instanceof Assignment) {
				Assignment l = (Assignment) tmpL;
				if (l.equals(b.getFirst())) {
					if (l.equals(b.getLast())) {
						if (pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_5B(b) == null) {
							if (pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_6B(b) == null) {
								if (pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_7B(b) == null) {
									if (pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_2BB(l,
											b) == null) {
										if (pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_3B(
												l) == null) {
											for (Decision d : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(b, Decision.class, "negative")) {
												Statement tmpA = d.getPositive();
												if (tmpA instanceof Assignment) {
													Assignment a = (Assignment) tmpA;
													if (!a.equals(l)) {
														if (pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_0BB(
																l, d) == null) {
															if (pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_1BB(
																	l, d) == null) {
																if (pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_4BB(
																		b, d) == null) {
																	if (pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_12BB(
																			d, l) == null) {
																		if (pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_13BB(
																				d, l) == null) {
																			if (pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_14BB(
																					d, b) == null) {
																				if (pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_8BB(
																						a, d) == null) {
																					if (pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_9BB(
																							a, b) == null) {
																						if (pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_10BB(
																								a, b) == null) {
																							if (pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_11B(
																									a) == null) {
																								if (pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_15BB(
																										d, a) == null) {
																									if (pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_16BB(
																											b,
																											a) == null) {
																										if (pattern_decaul2branchcub_21_2_testcorematchandDECs_black_nac_17BB(
																												b,
																												a) == null) {
																											_result.add(
																													new Object[] {
																															l,
																															b,
																															a,
																															d,
																															_edge_first });
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}

											}
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

	public static final Object[] pattern_decaul2branchcub_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_decaul2branchcub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			decaul2branchcub _this, Match match, Assignment l, While b, Assignment a, Decision d) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, l, b, a, d);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_decaul2branchcub_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			decaul2branchcub _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decaul2branchcub_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_decaul2branchcub_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_decaul2branchcub_24_1_prepare_blackB(decaul2branchcub _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decaul2branchcub_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_decaul2branchcub_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("l");
		EObject _localVariable_1 = targetMatch.getObject("y");
		EObject _localVariable_2 = sourceMatch.getObject("b");
		EObject _localVariable_3 = targetMatch.getObject("x");
		EObject _localVariable_4 = sourceMatch.getObject("a");
		EObject _localVariable_5 = targetMatch.getObject("c");
		EObject _localVariable_6 = sourceMatch.getObject("d");
		EObject _localVariable_7 = targetMatch.getObject("z");
		EObject tmpL = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpB = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpC = _localVariable_5;
		EObject tmpD = _localVariable_6;
		EObject tmpZ = _localVariable_7;
		if (tmpL instanceof Assignment) {
			Assignment l = (Assignment) tmpL;
			if (tmpY instanceof Branch) {
				Branch y = (Branch) tmpY;
				if (tmpB instanceof While) {
					While b = (While) tmpB;
					if (tmpX instanceof Command) {
						Command x = (Command) tmpX;
						if (tmpA instanceof Assignment) {
							Assignment a = (Assignment) tmpA;
							if (tmpC instanceof Branch) {
								Branch c = (Branch) tmpC;
								if (tmpD instanceof Decision) {
									Decision d = (Decision) tmpD;
									if (tmpZ instanceof Command) {
										Command z = (Command) tmpZ;
										return new Object[] { l, y, b, x, a, c, d, z, sourceMatch, targetMatch };
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

	public static final Object[] pattern_decaul2branchcub_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Assignment l,
			Branch y, While b, Command x, Assignment a, Branch c, Decision d, Command z, Match sourceMatch,
			Match targetMatch) {
		if (!x.equals(z)) {
			if (!a.equals(l)) {
				if (!c.equals(y)) {
					if (!sourceMatch.equals(targetMatch)) {
						return new Object[] { l, y, b, x, a, c, d, z, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decaul2branchcub_24_2_matchsrctrgcontext_binding = pattern_decaul2branchcub_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_decaul2branchcub_24_2_matchsrctrgcontext_binding != null) {
			Assignment l = (Assignment) result_pattern_decaul2branchcub_24_2_matchsrctrgcontext_binding[0];
			Branch y = (Branch) result_pattern_decaul2branchcub_24_2_matchsrctrgcontext_binding[1];
			While b = (While) result_pattern_decaul2branchcub_24_2_matchsrctrgcontext_binding[2];
			Command x = (Command) result_pattern_decaul2branchcub_24_2_matchsrctrgcontext_binding[3];
			Assignment a = (Assignment) result_pattern_decaul2branchcub_24_2_matchsrctrgcontext_binding[4];
			Branch c = (Branch) result_pattern_decaul2branchcub_24_2_matchsrctrgcontext_binding[5];
			Decision d = (Decision) result_pattern_decaul2branchcub_24_2_matchsrctrgcontext_binding[6];
			Command z = (Command) result_pattern_decaul2branchcub_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_decaul2branchcub_24_2_matchsrctrgcontext_black = pattern_decaul2branchcub_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					l, y, b, x, a, c, d, z, sourceMatch, targetMatch);
			if (result_pattern_decaul2branchcub_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { l, y, b, x, a, c, d, z, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_24_3_solvecsp_bindingFBBBBBBBBBBB(decaul2branchcub _this,
			Assignment l, Branch y, While b, Command x, Assignment a, Branch c, Decision d, Command z,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(l, y, b, x, a, c, d, z, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, l, y, b, x, a, c, d, z, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decaul2branchcub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			decaul2branchcub _this, Assignment l, Branch y, While b, Command x, Assignment a, Branch c, Decision d,
			Command z, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_decaul2branchcub_24_3_solvecsp_binding = pattern_decaul2branchcub_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, l, y, b, x, a, c, d, z, sourceMatch, targetMatch);
		if (result_pattern_decaul2branchcub_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_decaul2branchcub_24_3_solvecsp_binding[0];

			Object[] result_pattern_decaul2branchcub_24_3_solvecsp_black = pattern_decaul2branchcub_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_decaul2branchcub_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, l, y, b, x, a, c, d, z, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_decaul2branchcub_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_decaul2branchcub_24_5_matchcorrcontext_blackFBBBB(Branch c,
			Decision d, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B d2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c, S2B.class, "target")) {
				if (d.equals(d2c.getSource())) {
					_result.add(new Object[] { d2c, c, d, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_decaul2branchcub_24_5_matchcorrcontext_greenBBBF(S2B d2c, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "decaul2branchcub";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(d2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { d2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_decaul2branchcub_24_6_createcorrespondence_blackBBBBBBBBB(Assignment l,
			Branch y, While b, Command x, Assignment a, Branch c, Decision d, Command z, CCMatch ccMatch) {
		if (!x.equals(z)) {
			if (!a.equals(l)) {
				if (!c.equals(y)) {
					return new Object[] { l, y, b, x, a, c, d, z, ccMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_24_6_createcorrespondence_greenBBBBBFFFBB(Assignment l,
			Branch y, While b, Command x, Assignment a, Command z, CCMatch ccMatch) {
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		l2z.setSource(l);
		l2z.setTarget(z);
		ccMatch.getCreateCorr().add(l2z);
		b2y.setTarget(y);
		b2y.setSource(b);
		ccMatch.getCreateCorr().add(b2y);
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		return new Object[] { l, y, b, x, a, l2z, b2y, a2x, z, ccMatch };
	}

	public static final Object[] pattern_decaul2branchcub_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_decaul2branchcub_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "decaul2branchcub";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_decaul2branchcub_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_0BB(Assignment l, Decision d) {
		for (Decision __DEC_l_positive_655266 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_l_positive_655266)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_1BB(Assignment l, Decision d) {
		for (Decision __DEC_l_negative_724285 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_l_negative_724285)) {
				return new Object[] { l, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_2BB(Assignment l, While b) {
		for (While __DEC_l_last_190633 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				While.class, "last")) {
			if (!b.equals(__DEC_l_last_190633)) {
				return new Object[] { l, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_3B(Assignment l) {
		for (Program __DEC_l_first_156419 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(l,
				Program.class, "first")) {
			return new Object[] { l };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_4BB(While b, Decision d) {
		for (Decision __DEC_b_positive_310136 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			if (!d.equals(__DEC_b_positive_310136)) {
				return new Object[] { b, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_5B(While b) {
		for (While __DEC_b_first_363348 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "first")) {
			if (!b.equals(__DEC_b_first_363348)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_6B(While b) {
		for (While __DEC_b_last_651564 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				While.class, "last")) {
			if (!b.equals(__DEC_b_last_651564)) {
				return new Object[] { b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_7B(While b) {
		for (Program __DEC_b_first_290456 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_8BB(Assignment a, Decision d) {
		for (Decision __DEC_a_negative_737899 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			if (!d.equals(__DEC_a_negative_737899)) {
				return new Object[] { a, d };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_9BB(Assignment a, While b) {
		for (While __DEC_a_first_163274 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			if (!b.equals(__DEC_a_first_163274)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_10BB(Assignment a, While b) {
		for (While __DEC_a_last_285454 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			if (!b.equals(__DEC_a_last_285454)) {
				return new Object[] { a, b };
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_11B(Assignment a) {
		for (Program __DEC_a_first_174599 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_12BB(Decision d,
			Assignment l) {
		if (l.equals(d.getPositive())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_13BB(Decision d,
			Assignment l) {
		if (l.equals(d.getNegative())) {
			return new Object[] { d, l };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_14BB(Decision d, While b) {
		if (b.equals(d.getPositive())) {
			return new Object[] { d, b };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_15BB(Decision d,
			Assignment a) {
		if (a.equals(d.getNegative())) {
			return new Object[] { d, a };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_16BB(While b, Assignment a) {
		if (a.equals(b.getFirst())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_17BB(While b, Assignment a) {
		if (a.equals(b.getLast())) {
			return new Object[] { b, a };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_27_1_matchtggpattern_blackBBBB(Assignment l, While b,
			Assignment a, Decision d) {
		if (!a.equals(l)) {
			if (l.equals(b.getFirst())) {
				if (l.equals(b.getLast())) {
					if (a.equals(d.getPositive())) {
						if (b.equals(d.getNegative())) {
							if (pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_0BB(l, d) == null) {
								if (pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_1BB(l, d) == null) {
									if (pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_2BB(l, b) == null) {
										if (pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_3B(l) == null) {
											if (pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_4BB(b,
													d) == null) {
												if (pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_5B(
														b) == null) {
													if (pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_6B(
															b) == null) {
														if (pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_7B(
																b) == null) {
															if (pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_8BB(
																	a, d) == null) {
																if (pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_9BB(
																		a, b) == null) {
																	if (pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_10BB(
																			a, b) == null) {
																		if (pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_11B(
																				a) == null) {
																			if (pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_12BB(
																					d, l) == null) {
																				if (pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_13BB(
																						d, l) == null) {
																					if (pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_14BB(
																							d, b) == null) {
																						if (pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_15BB(
																								d, a) == null) {
																							if (pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_16BB(
																									b, a) == null) {
																								if (pattern_decaul2branchcub_27_1_matchtggpattern_black_nac_17BB(
																										b, a) == null) {
																									return new Object[] {
																											l, b, a,
																											d };
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_decaul2branchcub_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decaul2branchcub_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_0B(Branch y) {
		for (Graph __DEC_y_root_840761 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_1BB(Branch y, Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_y_positive_597331 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!y.equals(__DEC_y_positive_597331)) {
					if (!c.equals(__DEC_y_positive_597331)) {
						return new Object[] { y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_2BB(Branch y, Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_y_negative_69578 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!y.equals(__DEC_y_negative_69578)) {
					if (!c.equals(__DEC_y_negative_69578)) {
						return new Object[] { y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_3B(Command x) {
		for (Graph __DEC_x_root_696169 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_4BBB(Command x, Branch y,
			Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_x_positive_582100 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!y.equals(__DEC_x_positive_582100)) {
					if (!c.equals(__DEC_x_positive_582100)) {
						return new Object[] { x, y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_5BBB(Command x, Branch y,
			Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_x_negative_922857 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!y.equals(__DEC_x_negative_922857)) {
					if (!c.equals(__DEC_x_negative_922857)) {
						return new Object[] { x, y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_6B(Command z) {
		for (Graph __DEC_z_root_528656 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_7BBB(Command z, Branch y,
			Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_z_positive_306764 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!y.equals(__DEC_z_positive_306764)) {
					if (!c.equals(__DEC_z_positive_306764)) {
						return new Object[] { z, y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_8BBB(Command z, Branch y,
			Branch c) {
		if (!c.equals(y)) {
			for (Branch __DEC_z_negative_333218 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!y.equals(__DEC_z_negative_333218)) {
					if (!c.equals(__DEC_z_negative_333218)) {
						return new Object[] { z, y, c };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_9BB(Branch y, Command x) {
		if (x.equals(y.getPositive())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_10BB(Branch y, Command x) {
		if (x.equals(y.getNegative())) {
			return new Object[] { y, x };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_11BB(Branch c, Command x) {
		if (x.equals(c.getNegative())) {
			return new Object[] { c, x };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_12BB(Branch c, Command z) {
		if (z.equals(c.getPositive())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_13BB(Branch y, Command z) {
		if (z.equals(y.getNegative())) {
			return new Object[] { y, z };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_14BB(Branch c, Command z) {
		if (z.equals(c.getNegative())) {
			return new Object[] { c, z };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_28_1_matchtggpattern_blackBBBB(Branch y, Command x, Branch c,
			Command z) {
		if (!x.equals(z)) {
			if (!c.equals(y)) {
				if (y.equals(c.getNegative())) {
					if (x.equals(c.getPositive())) {
						if (z.equals(y.getPositive())) {
							if (y.equals(z.getNext())) {
								if (pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_0B(y) == null) {
									if (pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_1BB(y, c) == null) {
										if (pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_2BB(y, c) == null) {
											if (pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_3B(x) == null) {
												if (pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_4BBB(x, y,
														c) == null) {
													if (pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_5BBB(x,
															y, c) == null) {
														if (pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_6B(
																z) == null) {
															if (pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_7BBB(
																	z, y, c) == null) {
																if (pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_8BBB(
																		z, y, c) == null) {
																	if (pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_9BB(
																			y, x) == null) {
																		if (pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_10BB(
																				y, x) == null) {
																			if (pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_11BB(
																					c, x) == null) {
																				if (pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_12BB(
																						c, z) == null) {
																					if (pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_13BB(
																							y, z) == null) {
																						if (pattern_decaul2branchcub_28_1_matchtggpattern_black_nac_14BB(
																								c, z) == null) {
																							return new Object[] { y, x,
																									c, z };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_decaul2branchcub_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_decaul2branchcub_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_decaul2branchcub_29_1_createresult_blackB(decaul2branchcub _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_decaul2branchcub_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_decaul2branchcub_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, S2B d2c) {
		if (ruleResult.getCorrObjects().contains(d2c)) {
			return new Object[] { ruleResult, d2c };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Branch c) {
		if (ruleResult.getTargetObjects().contains(c)) {
			return new Object[] { ruleResult, c };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Decision d) {
		if (ruleResult.getSourceObjects().contains(d)) {
			return new Object[] { ruleResult, d };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_decaul2branchcub_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList d2cList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpD2c : d2cList.getEntryObjects()) {
				if (tmpD2c instanceof S2B) {
					S2B d2c = (S2B) tmpD2c;
					Branch c = d2c.getTarget();
					if (c != null) {
						Statement tmpD = d2c.getSource();
						if (tmpD instanceof Decision) {
							Decision d = (Decision) tmpD;
							if (pattern_decaul2branchcub_29_2_isapplicablecore_black_nac_0BB(ruleResult, d2c) == null) {
								if (pattern_decaul2branchcub_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										c) == null) {
									if (pattern_decaul2branchcub_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											d) == null) {
										_result.add(
												new Object[] { d2cList, d2c, c, d, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_decaul2branchcub_29_3_solveCSP_bindingFBBBBBB(decaul2branchcub _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Branch c, Decision d, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, d2c, c, d, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, d2c, c, d, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_decaul2branchcub_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_decaul2branchcub_29_3_solveCSP_bindingAndBlackFBBBBBB(decaul2branchcub _this,
			IsApplicableMatch isApplicableMatch, S2B d2c, Branch c, Decision d, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_decaul2branchcub_29_3_solveCSP_binding = pattern_decaul2branchcub_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, d2c, c, d, ruleResult);
		if (result_pattern_decaul2branchcub_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_decaul2branchcub_29_3_solveCSP_binding[0];

			Object[] result_pattern_decaul2branchcub_29_3_solveCSP_black = pattern_decaul2branchcub_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_decaul2branchcub_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, d2c, c, d, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_decaul2branchcub_29_4_checkCSP_expressionFBB(decaul2branchcub _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_decaul2branchcub_29_5_checknacs_blackBBB(S2B d2c, Branch c, Decision d) {
		return new Object[] { d2c, c, d };
	}

	public static final Object[] pattern_decaul2branchcub_29_6_perform_blackBBBB(S2B d2c, Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { d2c, c, d, ruleResult };
	}

	public static final Object[] pattern_decaul2branchcub_29_6_perform_greenFFFFFFFBFBFB(Branch c, Decision d,
			ModelgeneratorRuleResult ruleResult) {
		Assignment l = SourcecodeFactory.eINSTANCE.createAssignment();
		Branch y = ControlflowFactory.eINSTANCE.createBranch();
		While b = SourcecodeFactory.eINSTANCE.createWhile();
		Command x = ControlflowFactory.eINSTANCE.createCommand();
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N l2z = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2B b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		Command z = ControlflowFactory.eINSTANCE.createCommand();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getSourceObjects().add(l);
		c.setNegative(y);
		ruleResult.getTargetObjects().add(y);
		b.setFirst(l);
		b.setLast(l);
		d.setNegative(b);
		ruleResult.getSourceObjects().add(b);
		c.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		d.setPositive(a);
		ruleResult.getSourceObjects().add(a);
		l2z.setSource(l);
		ruleResult.getCorrObjects().add(l2z);
		b2y.setTarget(y);
		b2y.setSource(b);
		ruleResult.getCorrObjects().add(b2y);
		a2x.setSource(a);
		a2x.setTarget(x);
		ruleResult.getCorrObjects().add(a2x);
		y.setPositive(z);
		l2z.setTarget(z);
		z.setNext(y);
		ruleResult.getTargetObjects().add(z);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { l, y, b, x, a, l2z, b2y, c, a2x, d, z, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_decaul2branchcub_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //decaul2branchcubImpl
