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
	public boolean isAppropriate_FWD(Match match, Assignment b, While c, While w, Assignment a) {

		Object[] result1_black = whileaul2branchcubImpl.pattern_whileaul2branchcub_0_1_initialbindings_blackBBBBBB(this,
				match, b, c, w, a);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[c] = " + c + ", " + "[w] = " + w + ", "
					+ "[a] = " + a + ".");
		}

		Object[] result2_bindingAndBlack = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, b, c, w, a);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[b] = " + b + ", " + "[c] = " + c + ", " + "[w] = " + w + ", "
					+ "[a] = " + a + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileaul2branchcubImpl.pattern_whileaul2branchcub_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileaul2branchcubImpl
					.pattern_whileaul2branchcub_0_4_collectelementstobetranslated_blackBBBBB(match, b, c, w, a);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[c] = " + c + ", " + "[w] = " + w + ", " + "[a] = " + a + ".");
			}
			whileaul2branchcubImpl.pattern_whileaul2branchcub_0_4_collectelementstobetranslated_greenBBBBBFFFF(match, b,
					c, w, a);
			//nothing EMoflonEdge c__b____first = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge c__b____last = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge w__c____next = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge w__a____first = (EMoflonEdge) result4_green[8];

			Object[] result5_black = whileaul2branchcubImpl
					.pattern_whileaul2branchcub_0_5_collectcontextelements_blackBBBBB(match, b, c, w, a);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[b] = " + b + ", " + "[c] = " + c + ", " + "[w] = " + w + ", " + "[a] = " + a + ".");
			}
			whileaul2branchcubImpl.pattern_whileaul2branchcub_0_5_collectcontextelements_greenBB(match, w);

			// 
			whileaul2branchcubImpl.pattern_whileaul2branchcub_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					b, c, w, a);
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
		Assignment b = (Assignment) result1_bindingAndBlack[0];
		S2B w2i = (S2B) result1_bindingAndBlack[1];
		While c = (While) result1_bindingAndBlack[2];
		While w = (While) result1_bindingAndBlack[3];
		Assignment a = (Assignment) result1_bindingAndBlack[4];
		Branch i = (Branch) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_1_1_performtransformation_greenBFFBFFBFBF(b, c, a, i);
		Command y = (Command) result1_green[1];
		Branch z = (Branch) result1_green[2];
		Command x = (Command) result1_green[4];
		S2B c2z = (S2B) result1_green[5];
		S2N a2x = (S2N) result1_green[7];
		S2N b2y = (S2N) result1_green[9];

		Object[] result2_black = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_1_2_collecttranslatedelements_blackBBBBBBBBB(b, y, z, c, x, c2z, a, a2x,
						b2y);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[b] = " + b + ", " + "[y] = " + y
					+ ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[x] = " + x + ", " + "[c2z] = " + c2z + ", "
					+ "[a] = " + a + ", " + "[a2x] = " + a2x + ", " + "[b2y] = " + b2y + ".");
		}
		Object[] result2_green = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_1_2_collecttranslatedelements_greenFBBBBBBBBB(b, y, z, c, x, c2z, a, a2x,
						b2y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, b, y, w2i, z, c, x,
						c2z, w, a, a2x, i, b2y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b] = " + b + ", " + "[y] = " + y + ", " + "[w2i] = " + w2i + ", " + "[z] = " + z + ", "
					+ "[c] = " + c + ", " + "[x] = " + x + ", " + "[c2z] = " + c2z + ", " + "[w] = " + w + ", "
					+ "[a] = " + a + ", " + "[a2x] = " + a2x + ", " + "[i] = " + i + ", " + "[b2y] = " + b2y + ".");
		}
		whileaul2branchcubImpl.pattern_whileaul2branchcub_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, b, y, z, c, x, c2z, w, a, a2x, i, b2y);
		//nothing EMoflonEdge c__b____first = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge c__b____last = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge z__y____positive = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge y__z____next = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[25];

		// 
		// 
		whileaul2branchcubImpl.pattern_whileaul2branchcub_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult,
				b, y, w2i, z, c, x, c2z, w, a, a2x, i, b2y);
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
		Assignment b = (Assignment) result2_binding[0];
		While c = (While) result2_binding[1];
		While w = (While) result2_binding[2];
		Assignment a = (Assignment) result2_binding[3];
		for (Object[] result2_black : whileaul2branchcubImpl.pattern_whileaul2branchcub_2_2_corematch_blackBFBBBFB(b, c,
				w, a, match)) {
			S2B w2i = (S2B) result2_black[1];
			Branch i = (Branch) result2_black[5];
			// ForEach 
			for (Object[] result3_black : whileaul2branchcubImpl
					.pattern_whileaul2branchcub_2_3_findcontext_blackBBBBBB(b, w2i, c, w, a, i)) {
				Object[] result3_green = whileaul2branchcubImpl
						.pattern_whileaul2branchcub_2_3_findcontext_greenBBBBBBFFFFFFF(b, w2i, c, w, a, i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge c__b____first = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge c__b____last = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = whileaul2branchcubImpl
						.pattern_whileaul2branchcub_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, b,
								w2i, c, w, a, i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[b] = " + b + ", " + "[w2i] = "
							+ w2i + ", " + "[c] = " + c + ", " + "[w] = " + w + ", " + "[a] = " + a + ", " + "[i] = "
							+ i + ".");
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
	public void registerObjectsToMatch_FWD(Match match, Assignment b, While c, While w, Assignment a) {
		match.registerObject("b", b);
		match.registerObject("c", c);
		match.registerObject("w", w);
		match.registerObject("a", a);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment b, While c, While w, Assignment a) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Assignment b, S2B w2i, While c, While w,
			Assignment a, Branch i) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("b", b);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("w", w);
		isApplicableMatch.registerObject("a", a);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject b, EObject y, EObject w2i, EObject z,
			EObject c, EObject x, EObject c2z, EObject w, EObject a, EObject a2x, EObject i, EObject b2y) {
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("b2y", b2y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("b").eClass()).equals("sourcecode.Assignment.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("sourcecode.While.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass())
						.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command y, Branch z, Command x, Branch i) {

		Object[] result1_black = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_10_1_initialbindings_blackBBBBBB(this, match, y, z, x, i);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[x] = " + x + ", "
					+ "[i] = " + i + ".");
		}

		Object[] result2_bindingAndBlack = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, y, z, x, i);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[x] = " + x + ", "
					+ "[i] = " + i + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (whileaul2branchcubImpl.pattern_whileaul2branchcub_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = whileaul2branchcubImpl
					.pattern_whileaul2branchcub_10_4_collectelementstobetranslated_blackBBBBB(match, y, z, x, i);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[y] = " + y + ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[i] = " + i + ".");
			}
			whileaul2branchcubImpl.pattern_whileaul2branchcub_10_4_collectelementstobetranslated_greenBBBBBFFFF(match,
					y, z, x, i);
			//nothing EMoflonEdge z__y____positive = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge y__z____next = (EMoflonEdge) result4_green[8];

			Object[] result5_black = whileaul2branchcubImpl
					.pattern_whileaul2branchcub_10_5_collectcontextelements_blackBBBBB(match, y, z, x, i);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[y] = " + y + ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[i] = " + i + ".");
			}
			whileaul2branchcubImpl.pattern_whileaul2branchcub_10_5_collectcontextelements_greenBB(match, i);

			// 
			whileaul2branchcubImpl.pattern_whileaul2branchcub_10_6_registerobjectstomatch_expressionBBBBBB(this, match,
					y, z, x, i);
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
		Command y = (Command) result1_bindingAndBlack[0];
		S2B w2i = (S2B) result1_bindingAndBlack[1];
		Branch z = (Branch) result1_bindingAndBlack[2];
		Command x = (Command) result1_bindingAndBlack[3];
		While w = (While) result1_bindingAndBlack[4];
		Branch i = (Branch) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_11_1_performtransformation_greenFBBFBFBFFF(y, z, x, w);
		Assignment b = (Assignment) result1_green[0];
		While c = (While) result1_green[3];
		S2B c2z = (S2B) result1_green[5];
		Assignment a = (Assignment) result1_green[7];
		S2N a2x = (S2N) result1_green[8];
		S2N b2y = (S2N) result1_green[9];

		Object[] result2_black = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_11_2_collecttranslatedelements_blackBBBBBBBBB(b, y, z, c, x, c2z, a, a2x,
						b2y);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[b] = " + b + ", " + "[y] = " + y
					+ ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[x] = " + x + ", " + "[c2z] = " + c2z + ", "
					+ "[a] = " + a + ", " + "[a2x] = " + a2x + ", " + "[b2y] = " + b2y + ".");
		}
		Object[] result2_green = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_11_2_collecttranslatedelements_greenFBBBBBBBBB(b, y, z, c, x, c2z, a, a2x,
						b2y);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, b, y, w2i, z, c, x,
						c2z, w, a, a2x, i, b2y);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b] = " + b + ", " + "[y] = " + y + ", " + "[w2i] = " + w2i + ", " + "[z] = " + z + ", "
					+ "[c] = " + c + ", " + "[x] = " + x + ", " + "[c2z] = " + c2z + ", " + "[w] = " + w + ", "
					+ "[a] = " + a + ", " + "[a2x] = " + a2x + ", " + "[i] = " + i + ", " + "[b2y] = " + b2y + ".");
		}
		whileaul2branchcubImpl.pattern_whileaul2branchcub_11_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFF(
				ruleresult, b, y, z, c, x, c2z, w, a, a2x, i, b2y);
		//nothing EMoflonEdge c__b____first = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge c2z__z____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge c2z__c____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge c__b____last = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge a2x__a____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge a2x__x____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge z__y____positive = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge b2y__b____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge b2y__y____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge w__c____next = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge y__z____next = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge w__a____first = (EMoflonEdge) result3_green[25];

		// 
		// 
		whileaul2branchcubImpl.pattern_whileaul2branchcub_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this,
				ruleresult, b, y, w2i, z, c, x, c2z, w, a, a2x, i, b2y);
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
		Command y = (Command) result2_binding[0];
		Branch z = (Branch) result2_binding[1];
		Command x = (Command) result2_binding[2];
		Branch i = (Branch) result2_binding[3];
		for (Object[] result2_black : whileaul2branchcubImpl.pattern_whileaul2branchcub_12_2_corematch_blackBFBBFBB(y,
				z, x, i, match)) {
			S2B w2i = (S2B) result2_black[1];
			While w = (While) result2_black[4];
			// ForEach 
			for (Object[] result3_black : whileaul2branchcubImpl
					.pattern_whileaul2branchcub_12_3_findcontext_blackBBBBBB(y, w2i, z, x, w, i)) {
				Object[] result3_green = whileaul2branchcubImpl
						.pattern_whileaul2branchcub_12_3_findcontext_greenBBBBBBFFFFFFF(y, w2i, z, x, w, i);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge w2i__i____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge z__y____positive = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge i__x____positive = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge i__z____negative = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge y__z____next = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge w2i__w____source = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = whileaul2branchcubImpl
						.pattern_whileaul2branchcub_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, y,
								w2i, z, x, w, i);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[y] = " + y + ", " + "[w2i] = "
							+ w2i + ", " + "[z] = " + z + ", " + "[x] = " + x + ", " + "[w] = " + w + ", " + "[i] = "
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
	public void registerObjectsToMatch_BWD(Match match, Command y, Branch z, Command x, Branch i) {
		match.registerObject("y", y);
		match.registerObject("z", z);
		match.registerObject("x", x);
		match.registerObject("i", i);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command y, Branch z, Command x, Branch i) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Command y, S2B w2i, Branch z, Command x,
			While w, Branch i) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("y", y);
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("z", z);
		isApplicableMatch.registerObject("x", x);
		isApplicableMatch.registerObject("w", w);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject b, EObject y, EObject w2i, EObject z,
			EObject c, EObject x, EObject c2z, EObject w, EObject a, EObject a2x, EObject i, EObject b2y) {
		ruleresult.registerObject("b", b);
		ruleresult.registerObject("y", y);
		ruleresult.registerObject("w2i", w2i);
		ruleresult.registerObject("z", z);
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("x", x);
		ruleresult.registerObject("c2z", c2z);
		ruleresult.registerObject("w", w);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("a2x", a2x);
		ruleresult.registerObject("i", i);
		ruleresult.registerObject("b2y", b2y);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("y").eClass()).equals("controlflow.Command.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("z").eClass()).equals("controlflow.Branch.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("x").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_94(EMoflonEdge _edge_positive) {

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
				.pattern_whileaul2branchcub_20_2_testcorematchandDECs_blackFFFFB(_edge_positive)) {
			Command y = (Command) result2_black[0];
			Branch z = (Branch) result2_black[1];
			Command x = (Command) result2_black[2];
			Branch i = (Branch) result2_black[3];
			Object[] result2_green = whileaul2branchcubImpl
					.pattern_whileaul2branchcub_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileaul2branchcubImpl
					.pattern_whileaul2branchcub_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, y, z, x, i)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_100(EMoflonEdge _edge_first) {

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
				.pattern_whileaul2branchcub_21_2_testcorematchandDECs_blackFFFFB(_edge_first)) {
			Assignment b = (Assignment) result2_black[0];
			While c = (While) result2_black[1];
			While w = (While) result2_black[2];
			Assignment a = (Assignment) result2_black[3];
			Object[] result2_green = whileaul2branchcubImpl
					.pattern_whileaul2branchcub_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (whileaul2branchcubImpl
					.pattern_whileaul2branchcub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, b, c, w, a)) {
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
		Assignment b = (Assignment) result2_bindingAndBlack[0];
		Command y = (Command) result2_bindingAndBlack[1];
		Branch z = (Branch) result2_bindingAndBlack[2];
		While c = (While) result2_bindingAndBlack[3];
		Command x = (Command) result2_bindingAndBlack[4];
		While w = (While) result2_bindingAndBlack[5];
		Assignment a = (Assignment) result2_bindingAndBlack[6];
		Branch i = (Branch) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = whileaul2branchcubImpl
				.pattern_whileaul2branchcub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, b, y, z, c, x, w, a, i,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[b] = " + b + ", " + "[y] = " + y + ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[x] = "
					+ x + ", " + "[w] = " + w + ", " + "[a] = " + a + ", " + "[i] = " + i + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (whileaul2branchcubImpl.pattern_whileaul2branchcub_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : whileaul2branchcubImpl
					.pattern_whileaul2branchcub_24_5_matchcorrcontext_blackFBBBB(w, i, sourceMatch, targetMatch)) {
				S2B w2i = (S2B) result5_black[0];
				Object[] result5_green = whileaul2branchcubImpl
						.pattern_whileaul2branchcub_24_5_matchcorrcontext_greenBBBF(w2i, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = whileaul2branchcubImpl
						.pattern_whileaul2branchcub_24_6_createcorrespondence_blackBBBBBBBBB(b, y, z, c, x, w, a, i,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[b] = " + b + ", "
							+ "[y] = " + y + ", " + "[z] = " + z + ", " + "[c] = " + c + ", " + "[x] = " + x + ", "
							+ "[w] = " + w + ", " + "[a] = " + a + ", " + "[i] = " + i + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				whileaul2branchcubImpl.pattern_whileaul2branchcub_24_6_createcorrespondence_greenBBBBBFBFFB(b, y, z, c,
						x, a, ccMatch);
				//nothing S2B c2z = (S2B) result6_green[5];
				//nothing S2N a2x = (S2N) result6_green[7];
				//nothing S2N b2y = (S2N) result6_green[8];

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
	public CSP isApplicable_solveCsp_CC(Assignment b, Command y, Branch z, While c, Command x, While w, Assignment a,
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
	public boolean checkDEC_FWD(Assignment b, While c, While w, Assignment a) {// 
		Object[] result1_black = whileaul2branchcubImpl.pattern_whileaul2branchcub_27_1_matchtggpattern_blackBBBB(b, c,
				w, a);
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
	public boolean checkDEC_BWD(Command y, Branch z, Command x, Branch i) {// 
		Object[] result1_black = whileaul2branchcubImpl.pattern_whileaul2branchcub_28_1_matchtggpattern_blackBBBB(y, z,
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
			S2B w2i = (S2B) result2_black[1];
			Branch i = (Branch) result2_black[2];
			While w = (While) result2_black[3];

			Object[] result3_bindingAndBlack = whileaul2branchcubImpl
					.pattern_whileaul2branchcub_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, w2i, w, i,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[w2i] = " + w2i + ", " + "[w] = " + w
						+ ", " + "[i] = " + i + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (whileaul2branchcubImpl.pattern_whileaul2branchcub_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = whileaul2branchcubImpl.pattern_whileaul2branchcub_29_5_checknacs_blackBBB(w2i,
						w, i);
				if (result5_black != null) {

					Object[] result6_black = whileaul2branchcubImpl
							.pattern_whileaul2branchcub_29_6_perform_blackBBBB(w2i, w, i, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[w2i] = " + w2i + ", "
								+ "[w] = " + w + ", " + "[i] = " + i + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					whileaul2branchcubImpl.pattern_whileaul2branchcub_29_6_perform_greenFFFFFFBFFBFB(w, i, ruleResult);
					//nothing Assignment b = (Assignment) result6_green[0];
					//nothing Command y = (Command) result6_green[1];
					//nothing Branch z = (Branch) result6_green[2];
					//nothing While c = (While) result6_green[3];
					//nothing Command x = (Command) result6_green[4];
					//nothing S2B c2z = (S2B) result6_green[5];
					//nothing Assignment a = (Assignment) result6_green[7];
					//nothing S2N a2x = (S2N) result6_green[8];
					//nothing S2N b2y = (S2N) result6_green[10];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, S2B w2i, While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("w2i", w2i);
		isApplicableMatch.registerObject("w", w);
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
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASSIGNMENT_S2B_WHILE_WHILE_ASSIGNMENT_BRANCH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(S2B) arguments.get(2), (While) arguments.get(3), (While) arguments.get(4),
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
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPROPRIATE_BWD__MATCH_COMMAND_BRANCH_COMMAND_BRANCH:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.WHILEAUL2BRANCHCUB___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_BRANCH_COMMAND_BRANCH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Branch) arguments.get(2),
					(Command) arguments.get(3), (Branch) arguments.get(4));
			return null;
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_BRANCH_COMMAND_BRANCH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (Command) arguments.get(3), (Branch) arguments.get(4));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMMAND_S2B_BRANCH_COMMAND_WHILE_BRANCH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Command) arguments.get(1),
					(S2B) arguments.get(2), (Branch) arguments.get(3), (Command) arguments.get(4),
					(While) arguments.get(5), (Branch) arguments.get(6));
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
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPROPRIATE_BWD_EMOFLON_EDGE_94__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_94((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPROPRIATE_FWD_EMOFLON_EDGE_100__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_100((EMoflonEdge) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPLICABLE_SOLVE_CSP_CC__ASSIGNMENT_COMMAND_BRANCH_WHILE_COMMAND_WHILE_ASSIGNMENT_BRANCH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Assignment) arguments.get(0), (Command) arguments.get(1),
					(Branch) arguments.get(2), (While) arguments.get(3), (Command) arguments.get(4),
					(While) arguments.get(5), (Assignment) arguments.get(6), (Branch) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.WHILEAUL2BRANCHCUB___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.WHILEAUL2BRANCHCUB___CHECK_DEC_FWD__ASSIGNMENT_WHILE_WHILE_ASSIGNMENT:
			return checkDEC_FWD((Assignment) arguments.get(0), (While) arguments.get(1), (While) arguments.get(2),
					(Assignment) arguments.get(3));
		case RulesPackage.WHILEAUL2BRANCHCUB___CHECK_DEC_BWD__COMMAND_BRANCH_COMMAND_BRANCH:
			return checkDEC_BWD((Command) arguments.get(0), (Branch) arguments.get(1), (Command) arguments.get(2),
					(Branch) arguments.get(3));
		case RulesPackage.WHILEAUL2BRANCHCUB___GENERATE_MODEL__RULEENTRYCONTAINER_S2B:
			return generateModel((RuleEntryContainer) arguments.get(0), (S2B) arguments.get(1));
		case RulesPackage.WHILEAUL2BRANCHCUB___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_S2B_WHILE_BRANCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (S2B) arguments.get(1),
					(While) arguments.get(2), (Branch) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.WHILEAUL2BRANCHCUB___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_whileaul2branchcub_0_1_initialbindings_blackBBBBBB(whileaul2branchcub _this,
			Match match, Assignment b, While c, While w, Assignment a) {
		if (!c.equals(w)) {
			if (!a.equals(b)) {
				return new Object[] { _this, match, b, c, w, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_0_2_SolveCSP_bindingFBBBBBB(whileaul2branchcub _this,
			Match match, Assignment b, While c, While w, Assignment a) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, b, c, w, a);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, b, c, w, a };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileaul2branchcub_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			whileaul2branchcub _this, Match match, Assignment b, While c, While w, Assignment a) {
		Object[] result_pattern_whileaul2branchcub_0_2_SolveCSP_binding = pattern_whileaul2branchcub_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, b, c, w, a);
		if (result_pattern_whileaul2branchcub_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileaul2branchcub_0_2_SolveCSP_binding[0];

			Object[] result_pattern_whileaul2branchcub_0_2_SolveCSP_black = pattern_whileaul2branchcub_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileaul2branchcub_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, b, c, w, a };
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
			Assignment b, While c, While w, Assignment a) {
		if (!c.equals(w)) {
			if (!a.equals(b)) {
				return new Object[] { match, b, c, w, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_0_4_collectelementstobetranslated_greenBBBBBFFFF(
			Match match, Assignment b, While c, While w, Assignment a) {
		EMoflonEdge c__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(b);
		match.getToBeTranslatedNodes().add(c);
		match.getToBeTranslatedNodes().add(a);
		String c__b____first_name_prime = "first";
		String c__b____last_name_prime = "last";
		String w__c____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		c__b____first.setSrc(c);
		c__b____first.setTrg(b);
		match.getToBeTranslatedEdges().add(c__b____first);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		match.getToBeTranslatedEdges().add(c__b____last);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		match.getToBeTranslatedEdges().add(w__c____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(w__a____first);
		c__b____first.setName(c__b____first_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		return new Object[] { match, b, c, w, a, c__b____first, c__b____last, w__c____next, w__a____first };
	}

	public static final Object[] pattern_whileaul2branchcub_0_5_collectcontextelements_blackBBBBB(Match match,
			Assignment b, While c, While w, Assignment a) {
		if (!c.equals(w)) {
			if (!a.equals(b)) {
				return new Object[] { match, b, c, w, a };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_0_5_collectcontextelements_greenBB(Match match, While w) {
		match.getContextNodes().add(w);
		return new Object[] { match, w };
	}

	public static final void pattern_whileaul2branchcub_0_6_registerobjectstomatch_expressionBBBBBB(
			whileaul2branchcub _this, Match match, Assignment b, While c, While w, Assignment a) {
		_this.registerObjectsToMatch_FWD(match, b, c, w, a);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("b");
		EObject _localVariable_1 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_2 = isApplicableMatch.getObject("c");
		EObject _localVariable_3 = isApplicableMatch.getObject("w");
		EObject _localVariable_4 = isApplicableMatch.getObject("a");
		EObject _localVariable_5 = isApplicableMatch.getObject("i");
		EObject tmpB = _localVariable_0;
		EObject tmpW2i = _localVariable_1;
		EObject tmpC = _localVariable_2;
		EObject tmpW = _localVariable_3;
		EObject tmpA = _localVariable_4;
		EObject tmpI = _localVariable_5;
		if (tmpB instanceof Assignment) {
			Assignment b = (Assignment) tmpB;
			if (tmpW2i instanceof S2B) {
				S2B w2i = (S2B) tmpW2i;
				if (tmpC instanceof While) {
					While c = (While) tmpC;
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						if (tmpA instanceof Assignment) {
							Assignment a = (Assignment) tmpA;
							if (tmpI instanceof Branch) {
								Branch i = (Branch) tmpI;
								return new Object[] { b, w2i, c, w, a, i, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_1_1_performtransformation_blackBBBBBBFBB(Assignment b,
			S2B w2i, While c, While w, Assignment a, Branch i, whileaul2branchcub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!c.equals(w)) {
			if (!a.equals(b)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { b, w2i, c, w, a, i, csp, _this, isApplicableMatch };
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
			Assignment b = (Assignment) result_pattern_whileaul2branchcub_1_1_performtransformation_binding[0];
			S2B w2i = (S2B) result_pattern_whileaul2branchcub_1_1_performtransformation_binding[1];
			While c = (While) result_pattern_whileaul2branchcub_1_1_performtransformation_binding[2];
			While w = (While) result_pattern_whileaul2branchcub_1_1_performtransformation_binding[3];
			Assignment a = (Assignment) result_pattern_whileaul2branchcub_1_1_performtransformation_binding[4];
			Branch i = (Branch) result_pattern_whileaul2branchcub_1_1_performtransformation_binding[5];

			Object[] result_pattern_whileaul2branchcub_1_1_performtransformation_black = pattern_whileaul2branchcub_1_1_performtransformation_blackBBBBBBFBB(
					b, w2i, c, w, a, i, _this, isApplicableMatch);
			if (result_pattern_whileaul2branchcub_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileaul2branchcub_1_1_performtransformation_black[6];

				return new Object[] { b, w2i, c, w, a, i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_1_1_performtransformation_greenBFFBFFBFBF(Assignment b,
			While c, Assignment a, Branch i) {
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		Command x = ControlflowFactory.eINSTANCE.createCommand();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		z.setPositive(y);
		i.setNegative(z);
		y.setNext(z);
		i.setPositive(x);
		c2z.setTarget(z);
		c2z.setSource(c);
		a2x.setSource(a);
		a2x.setTarget(x);
		b2y.setSource(b);
		b2y.setTarget(y);
		return new Object[] { b, y, z, c, x, c2z, a, a2x, i, b2y };
	}

	public static final Object[] pattern_whileaul2branchcub_1_2_collecttranslatedelements_blackBBBBBBBBB(Assignment b,
			Command y, Branch z, While c, Command x, S2B c2z, Assignment a, S2N a2x, S2N b2y) {
		if (!x.equals(y)) {
			if (!a.equals(b)) {
				if (!a2x.equals(b2y)) {
					return new Object[] { b, y, z, c, x, c2z, a, a2x, b2y };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_1_2_collecttranslatedelements_greenFBBBBBBBBB(Assignment b,
			Command y, Branch z, While c, Command x, S2B c2z, Assignment a, S2N a2x, S2N b2y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(b);
		ruleresult.getCreatedElements().add(y);
		ruleresult.getCreatedElements().add(z);
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedLinkElements().add(b2y);
		return new Object[] { ruleresult, b, y, z, c, x, c2z, a, a2x, b2y };
	}

	public static final Object[] pattern_whileaul2branchcub_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject b, EObject y, EObject w2i, EObject z, EObject c, EObject x,
			EObject c2z, EObject w, EObject a, EObject a2x, EObject i, EObject b2y) {
		if (!b.equals(y)) {
			if (!b.equals(w2i)) {
				if (!b.equals(z)) {
					if (!b.equals(c)) {
						if (!b.equals(x)) {
							if (!b.equals(c2z)) {
								if (!b.equals(w)) {
									if (!b.equals(i)) {
										if (!b.equals(b2y)) {
											if (!y.equals(z)) {
												if (!w2i.equals(y)) {
													if (!w2i.equals(z)) {
														if (!w2i.equals(x)) {
															if (!c.equals(y)) {
																if (!c.equals(w2i)) {
																	if (!c.equals(z)) {
																		if (!c.equals(x)) {
																			if (!c.equals(c2z)) {
																				if (!c.equals(w)) {
																					if (!c.equals(i)) {
																						if (!x.equals(y)) {
																							if (!x.equals(z)) {
																								if (!c2z.equals(y)) {
																									if (!c2z.equals(
																											w2i)) {
																										if (!c2z.equals(
																												z)) {
																											if (!c2z.equals(
																													x)) {
																												if (!c2z.equals(
																														w)) {
																													if (!c2z.equals(
																															i)) {
																														if (!w.equals(
																																y)) {
																															if (!w.equals(
																																	w2i)) {
																																if (!w.equals(
																																		z)) {
																																	if (!w.equals(
																																			x)) {
																																		if (!a.equals(
																																				b)) {
																																			if (!a.equals(
																																					y)) {
																																				if (!a.equals(
																																						w2i)) {
																																					if (!a.equals(
																																							z)) {
																																						if (!a.equals(
																																								c)) {
																																							if (!a.equals(
																																									x)) {
																																								if (!a.equals(
																																										c2z)) {
																																									if (!a.equals(
																																											w)) {
																																										if (!a.equals(
																																												a2x)) {
																																											if (!a.equals(
																																													i)) {
																																												if (!a.equals(
																																														b2y)) {
																																													if (!a2x.equals(
																																															b)) {
																																														if (!a2x.equals(
																																																y)) {
																																															if (!a2x.equals(
																																																	w2i)) {
																																																if (!a2x.equals(
																																																		z)) {
																																																	if (!a2x.equals(
																																																			c)) {
																																																		if (!a2x.equals(
																																																				x)) {
																																																			if (!a2x.equals(
																																																					c2z)) {
																																																				if (!a2x.equals(
																																																						w)) {
																																																					if (!a2x.equals(
																																																							i)) {
																																																						if (!a2x.equals(
																																																								b2y)) {
																																																							if (!i.equals(
																																																									y)) {
																																																								if (!i.equals(
																																																										w2i)) {
																																																									if (!i.equals(
																																																											z)) {
																																																										if (!i.equals(
																																																												x)) {
																																																											if (!i.equals(
																																																													w)) {
																																																												if (!b2y.equals(
																																																														y)) {
																																																													if (!b2y.equals(
																																																															w2i)) {
																																																														if (!b2y.equals(
																																																																z)) {
																																																															if (!b2y.equals(
																																																																	c)) {
																																																																if (!b2y.equals(
																																																																		x)) {
																																																																	if (!b2y.equals(
																																																																			c2z)) {
																																																																		if (!b2y.equals(
																																																																				w)) {
																																																																			if (!b2y.equals(
																																																																					i)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						b,
																																																																						y,
																																																																						w2i,
																																																																						z,
																																																																						c,
																																																																						x,
																																																																						c2z,
																																																																						w,
																																																																						a,
																																																																						a2x,
																																																																						i,
																																																																						b2y };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject b, EObject y, EObject z, EObject c, EObject x, EObject c2z, EObject w,
			EObject a, EObject a2x, EObject i, EObject b2y) {
		EMoflonEdge c__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileaul2branchcub";
		String c__b____first_name_prime = "first";
		String c2z__z____target_name_prime = "target";
		String c2z__c____source_name_prime = "source";
		String c__b____last_name_prime = "last";
		String a2x__a____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String z__y____positive_name_prime = "positive";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String b2y__b____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String w__c____next_name_prime = "next";
		String y__z____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		c__b____first.setSrc(c);
		c__b____first.setTrg(b);
		ruleresult.getTranslatedEdges().add(c__b____first);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		ruleresult.getTranslatedEdges().add(c__b____last);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		z__y____positive.setSrc(z);
		z__y____positive.setTrg(y);
		ruleresult.getCreatedEdges().add(z__y____positive);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getCreatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getCreatedEdges().add(i__z____negative);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getTranslatedEdges().add(w__c____next);
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		ruleresult.getCreatedEdges().add(y__z____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(w__a____first);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		c__b____first.setName(c__b____first_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		z__y____positive.setName(z__y____positive_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		y__z____next.setName(y__z____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		return new Object[] { ruleresult, b, y, z, c, x, c2z, w, a, a2x, i, b2y, c__b____first, c2z__z____target,
				c2z__c____source, c__b____last, a2x__a____source, a2x__x____target, z__y____positive, i__x____positive,
				i__z____negative, b2y__b____source, b2y__y____target, w__c____next, y__z____next, w__a____first };
	}

	public static final void pattern_whileaul2branchcub_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whileaul2branchcub _this, PerformRuleResult ruleresult, EObject b, EObject y, EObject w2i, EObject z,
			EObject c, EObject x, EObject c2z, EObject w, EObject a, EObject a2x, EObject i, EObject b2y) {
		_this.registerObjects_FWD(ruleresult, b, y, w2i, z, c, x, c2z, w, a, a2x, i, b2y);

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
		EObject _localVariable_0 = match.getObject("b");
		EObject _localVariable_1 = match.getObject("c");
		EObject _localVariable_2 = match.getObject("w");
		EObject _localVariable_3 = match.getObject("a");
		EObject tmpB = _localVariable_0;
		EObject tmpC = _localVariable_1;
		EObject tmpW = _localVariable_2;
		EObject tmpA = _localVariable_3;
		if (tmpB instanceof Assignment) {
			Assignment b = (Assignment) tmpB;
			if (tmpC instanceof While) {
				While c = (While) tmpC;
				if (tmpW instanceof While) {
					While w = (While) tmpW;
					if (tmpA instanceof Assignment) {
						Assignment a = (Assignment) tmpA;
						return new Object[] { b, c, w, a, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileaul2branchcub_2_2_corematch_blackBFBBBFB(Assignment b, While c,
			While w, Assignment a, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(w)) {
			if (!a.equals(b)) {
				for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(w, S2B.class,
						"source")) {
					Branch i = w2i.getTarget();
					if (i != null) {
						_result.add(new Object[] { b, w2i, c, w, a, i, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileaul2branchcub_2_3_findcontext_blackBBBBBB(Assignment b, S2B w2i,
			While c, While w, Assignment a, Branch i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!c.equals(w)) {
			if (!a.equals(b)) {
				if (b.equals(c.getFirst())) {
					if (b.equals(c.getLast())) {
						if (i.equals(w2i.getTarget())) {
							if (c.equals(w.getNext())) {
								if (w.equals(w2i.getSource())) {
									if (a.equals(w.getFirst())) {
										_result.add(new Object[] { b, w2i, c, w, a, i });
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

	public static final Object[] pattern_whileaul2branchcub_2_3_findcontext_greenBBBBBBFFFFFFF(Assignment b, S2B w2i,
			While c, While w, Assignment a, Branch i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c__b____first_name_prime = "first";
		String c__b____last_name_prime = "last";
		String w2i__i____target_name_prime = "target";
		String w__c____next_name_prime = "next";
		String w2i__w____source_name_prime = "source";
		String w__a____first_name_prime = "first";
		isApplicableMatch.getAllContextElements().add(b);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(i);
		c__b____first.setSrc(c);
		c__b____first.setTrg(b);
		isApplicableMatch.getAllContextElements().add(c__b____first);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		isApplicableMatch.getAllContextElements().add(c__b____last);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		isApplicableMatch.getAllContextElements().add(w__c____next);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(w__a____first);
		c__b____first.setName(c__b____first_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		w2i__i____target.setName(w2i__i____target_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		return new Object[] { b, w2i, c, w, a, i, isApplicableMatch, c__b____first, c__b____last, w2i__i____target,
				w__c____next, w2i__w____source, w__a____first };
	}

	public static final Object[] pattern_whileaul2branchcub_2_4_solveCSP_bindingFBBBBBBBB(whileaul2branchcub _this,
			IsApplicableMatch isApplicableMatch, Assignment b, S2B w2i, While c, While w, Assignment a, Branch i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, b, w2i, c, w, a, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, b, w2i, c, w, a, i };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileaul2branchcub_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			whileaul2branchcub _this, IsApplicableMatch isApplicableMatch, Assignment b, S2B w2i, While c, While w,
			Assignment a, Branch i) {
		Object[] result_pattern_whileaul2branchcub_2_4_solveCSP_binding = pattern_whileaul2branchcub_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, b, w2i, c, w, a, i);
		if (result_pattern_whileaul2branchcub_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileaul2branchcub_2_4_solveCSP_binding[0];

			Object[] result_pattern_whileaul2branchcub_2_4_solveCSP_black = pattern_whileaul2branchcub_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileaul2branchcub_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, b, w2i, c, w, a, i };
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
			Match match, Command y, Branch z, Command x, Branch i) {
		if (!x.equals(y)) {
			if (!i.equals(z)) {
				return new Object[] { _this, match, y, z, x, i };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_10_2_SolveCSP_bindingFBBBBBB(whileaul2branchcub _this,
			Match match, Command y, Branch z, Command x, Branch i) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, y, z, x, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, y, z, x, i };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileaul2branchcub_10_2_SolveCSP_bindingAndBlackFBBBBBB(
			whileaul2branchcub _this, Match match, Command y, Branch z, Command x, Branch i) {
		Object[] result_pattern_whileaul2branchcub_10_2_SolveCSP_binding = pattern_whileaul2branchcub_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, y, z, x, i);
		if (result_pattern_whileaul2branchcub_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileaul2branchcub_10_2_SolveCSP_binding[0];

			Object[] result_pattern_whileaul2branchcub_10_2_SolveCSP_black = pattern_whileaul2branchcub_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_whileaul2branchcub_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, y, z, x, i };
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
			Command y, Branch z, Command x, Branch i) {
		if (!x.equals(y)) {
			if (!i.equals(z)) {
				return new Object[] { match, y, z, x, i };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_10_4_collectelementstobetranslated_greenBBBBBFFFF(
			Match match, Command y, Branch z, Command x, Branch i) {
		EMoflonEdge z__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(y);
		match.getToBeTranslatedNodes().add(z);
		match.getToBeTranslatedNodes().add(x);
		String z__y____positive_name_prime = "positive";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String y__z____next_name_prime = "next";
		z__y____positive.setSrc(z);
		z__y____positive.setTrg(y);
		match.getToBeTranslatedEdges().add(z__y____positive);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		match.getToBeTranslatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		match.getToBeTranslatedEdges().add(i__z____negative);
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		match.getToBeTranslatedEdges().add(y__z____next);
		z__y____positive.setName(z__y____positive_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		y__z____next.setName(y__z____next_name_prime);
		return new Object[] { match, y, z, x, i, z__y____positive, i__x____positive, i__z____negative, y__z____next };
	}

	public static final Object[] pattern_whileaul2branchcub_10_5_collectcontextelements_blackBBBBB(Match match,
			Command y, Branch z, Command x, Branch i) {
		if (!x.equals(y)) {
			if (!i.equals(z)) {
				return new Object[] { match, y, z, x, i };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_10_5_collectcontextelements_greenBB(Match match, Branch i) {
		match.getContextNodes().add(i);
		return new Object[] { match, i };
	}

	public static final void pattern_whileaul2branchcub_10_6_registerobjectstomatch_expressionBBBBBB(
			whileaul2branchcub _this, Match match, Command y, Branch z, Command x, Branch i) {
		_this.registerObjectsToMatch_BWD(match, y, z, x, i);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("y");
		EObject _localVariable_1 = isApplicableMatch.getObject("w2i");
		EObject _localVariable_2 = isApplicableMatch.getObject("z");
		EObject _localVariable_3 = isApplicableMatch.getObject("x");
		EObject _localVariable_4 = isApplicableMatch.getObject("w");
		EObject _localVariable_5 = isApplicableMatch.getObject("i");
		EObject tmpY = _localVariable_0;
		EObject tmpW2i = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpX = _localVariable_3;
		EObject tmpW = _localVariable_4;
		EObject tmpI = _localVariable_5;
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			if (tmpW2i instanceof S2B) {
				S2B w2i = (S2B) tmpW2i;
				if (tmpZ instanceof Branch) {
					Branch z = (Branch) tmpZ;
					if (tmpX instanceof Command) {
						Command x = (Command) tmpX;
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							if (tmpI instanceof Branch) {
								Branch i = (Branch) tmpI;
								return new Object[] { y, w2i, z, x, w, i, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_11_1_performtransformation_blackBBBBBBFBB(Command y,
			S2B w2i, Branch z, Command x, While w, Branch i, whileaul2branchcub _this,
			IsApplicableMatch isApplicableMatch) {
		if (!x.equals(y)) {
			if (!i.equals(z)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { y, w2i, z, x, w, i, csp, _this, isApplicableMatch };
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
			Command y = (Command) result_pattern_whileaul2branchcub_11_1_performtransformation_binding[0];
			S2B w2i = (S2B) result_pattern_whileaul2branchcub_11_1_performtransformation_binding[1];
			Branch z = (Branch) result_pattern_whileaul2branchcub_11_1_performtransformation_binding[2];
			Command x = (Command) result_pattern_whileaul2branchcub_11_1_performtransformation_binding[3];
			While w = (While) result_pattern_whileaul2branchcub_11_1_performtransformation_binding[4];
			Branch i = (Branch) result_pattern_whileaul2branchcub_11_1_performtransformation_binding[5];

			Object[] result_pattern_whileaul2branchcub_11_1_performtransformation_black = pattern_whileaul2branchcub_11_1_performtransformation_blackBBBBBBFBB(
					y, w2i, z, x, w, i, _this, isApplicableMatch);
			if (result_pattern_whileaul2branchcub_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_whileaul2branchcub_11_1_performtransformation_black[6];

				return new Object[] { y, w2i, z, x, w, i, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_11_1_performtransformation_greenFBBFBFBFFF(Command y,
			Branch z, Command x, While w) {
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		c.setFirst(b);
		c.setLast(b);
		w.setNext(c);
		c2z.setTarget(z);
		c2z.setSource(c);
		w.setFirst(a);
		a2x.setSource(a);
		a2x.setTarget(x);
		b2y.setSource(b);
		b2y.setTarget(y);
		return new Object[] { b, y, z, c, x, c2z, w, a, a2x, b2y };
	}

	public static final Object[] pattern_whileaul2branchcub_11_2_collecttranslatedelements_blackBBBBBBBBB(Assignment b,
			Command y, Branch z, While c, Command x, S2B c2z, Assignment a, S2N a2x, S2N b2y) {
		if (!x.equals(y)) {
			if (!a.equals(b)) {
				if (!a2x.equals(b2y)) {
					return new Object[] { b, y, z, c, x, c2z, a, a2x, b2y };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_11_2_collecttranslatedelements_greenFBBBBBBBBB(Assignment b,
			Command y, Branch z, While c, Command x, S2B c2z, Assignment a, S2N a2x, S2N b2y) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(b);
		ruleresult.getTranslatedElements().add(y);
		ruleresult.getTranslatedElements().add(z);
		ruleresult.getCreatedElements().add(c);
		ruleresult.getTranslatedElements().add(x);
		ruleresult.getCreatedLinkElements().add(c2z);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(a2x);
		ruleresult.getCreatedLinkElements().add(b2y);
		return new Object[] { ruleresult, b, y, z, c, x, c2z, a, a2x, b2y };
	}

	public static final Object[] pattern_whileaul2branchcub_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject b, EObject y, EObject w2i, EObject z, EObject c, EObject x,
			EObject c2z, EObject w, EObject a, EObject a2x, EObject i, EObject b2y) {
		if (!b.equals(y)) {
			if (!b.equals(w2i)) {
				if (!b.equals(z)) {
					if (!b.equals(c)) {
						if (!b.equals(x)) {
							if (!b.equals(c2z)) {
								if (!b.equals(w)) {
									if (!b.equals(i)) {
										if (!b.equals(b2y)) {
											if (!y.equals(z)) {
												if (!w2i.equals(y)) {
													if (!w2i.equals(z)) {
														if (!w2i.equals(x)) {
															if (!c.equals(y)) {
																if (!c.equals(w2i)) {
																	if (!c.equals(z)) {
																		if (!c.equals(x)) {
																			if (!c.equals(c2z)) {
																				if (!c.equals(w)) {
																					if (!c.equals(i)) {
																						if (!x.equals(y)) {
																							if (!x.equals(z)) {
																								if (!c2z.equals(y)) {
																									if (!c2z.equals(
																											w2i)) {
																										if (!c2z.equals(
																												z)) {
																											if (!c2z.equals(
																													x)) {
																												if (!c2z.equals(
																														w)) {
																													if (!c2z.equals(
																															i)) {
																														if (!w.equals(
																																y)) {
																															if (!w.equals(
																																	w2i)) {
																																if (!w.equals(
																																		z)) {
																																	if (!w.equals(
																																			x)) {
																																		if (!a.equals(
																																				b)) {
																																			if (!a.equals(
																																					y)) {
																																				if (!a.equals(
																																						w2i)) {
																																					if (!a.equals(
																																							z)) {
																																						if (!a.equals(
																																								c)) {
																																							if (!a.equals(
																																									x)) {
																																								if (!a.equals(
																																										c2z)) {
																																									if (!a.equals(
																																											w)) {
																																										if (!a.equals(
																																												a2x)) {
																																											if (!a.equals(
																																													i)) {
																																												if (!a.equals(
																																														b2y)) {
																																													if (!a2x.equals(
																																															b)) {
																																														if (!a2x.equals(
																																																y)) {
																																															if (!a2x.equals(
																																																	w2i)) {
																																																if (!a2x.equals(
																																																		z)) {
																																																	if (!a2x.equals(
																																																			c)) {
																																																		if (!a2x.equals(
																																																				x)) {
																																																			if (!a2x.equals(
																																																					c2z)) {
																																																				if (!a2x.equals(
																																																						w)) {
																																																					if (!a2x.equals(
																																																							i)) {
																																																						if (!a2x.equals(
																																																								b2y)) {
																																																							if (!i.equals(
																																																									y)) {
																																																								if (!i.equals(
																																																										w2i)) {
																																																									if (!i.equals(
																																																											z)) {
																																																										if (!i.equals(
																																																												x)) {
																																																											if (!i.equals(
																																																													w)) {
																																																												if (!b2y.equals(
																																																														y)) {
																																																													if (!b2y.equals(
																																																															w2i)) {
																																																														if (!b2y.equals(
																																																																z)) {
																																																															if (!b2y.equals(
																																																																	c)) {
																																																																if (!b2y.equals(
																																																																		x)) {
																																																																	if (!b2y.equals(
																																																																			c2z)) {
																																																																		if (!b2y.equals(
																																																																				w)) {
																																																																			if (!b2y.equals(
																																																																					i)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						b,
																																																																						y,
																																																																						w2i,
																																																																						z,
																																																																						c,
																																																																						x,
																																																																						c2z,
																																																																						w,
																																																																						a,
																																																																						a2x,
																																																																						i,
																																																																						b2y };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject b, EObject y, EObject z, EObject c, EObject x, EObject c2z, EObject w,
			EObject a, EObject a2x, EObject i, EObject b2y) {
		EMoflonEdge c__b____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__z____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2z__c____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c__b____last = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2x__x____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__b____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2y__y____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__c____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "whileaul2branchcub";
		String c__b____first_name_prime = "first";
		String c2z__z____target_name_prime = "target";
		String c2z__c____source_name_prime = "source";
		String c__b____last_name_prime = "last";
		String a2x__a____source_name_prime = "source";
		String a2x__x____target_name_prime = "target";
		String z__y____positive_name_prime = "positive";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String b2y__b____source_name_prime = "source";
		String b2y__y____target_name_prime = "target";
		String w__c____next_name_prime = "next";
		String y__z____next_name_prime = "next";
		String w__a____first_name_prime = "first";
		c__b____first.setSrc(c);
		c__b____first.setTrg(b);
		ruleresult.getCreatedEdges().add(c__b____first);
		c2z__z____target.setSrc(c2z);
		c2z__z____target.setTrg(z);
		ruleresult.getCreatedEdges().add(c2z__z____target);
		c2z__c____source.setSrc(c2z);
		c2z__c____source.setTrg(c);
		ruleresult.getCreatedEdges().add(c2z__c____source);
		c__b____last.setSrc(c);
		c__b____last.setTrg(b);
		ruleresult.getCreatedEdges().add(c__b____last);
		a2x__a____source.setSrc(a2x);
		a2x__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(a2x__a____source);
		a2x__x____target.setSrc(a2x);
		a2x__x____target.setTrg(x);
		ruleresult.getCreatedEdges().add(a2x__x____target);
		z__y____positive.setSrc(z);
		z__y____positive.setTrg(y);
		ruleresult.getTranslatedEdges().add(z__y____positive);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		ruleresult.getTranslatedEdges().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		ruleresult.getTranslatedEdges().add(i__z____negative);
		b2y__b____source.setSrc(b2y);
		b2y__b____source.setTrg(b);
		ruleresult.getCreatedEdges().add(b2y__b____source);
		b2y__y____target.setSrc(b2y);
		b2y__y____target.setTrg(y);
		ruleresult.getCreatedEdges().add(b2y__y____target);
		w__c____next.setSrc(w);
		w__c____next.setTrg(c);
		ruleresult.getCreatedEdges().add(w__c____next);
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		ruleresult.getTranslatedEdges().add(y__z____next);
		w__a____first.setSrc(w);
		w__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(w__a____first);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		c__b____first.setName(c__b____first_name_prime);
		c2z__z____target.setName(c2z__z____target_name_prime);
		c2z__c____source.setName(c2z__c____source_name_prime);
		c__b____last.setName(c__b____last_name_prime);
		a2x__a____source.setName(a2x__a____source_name_prime);
		a2x__x____target.setName(a2x__x____target_name_prime);
		z__y____positive.setName(z__y____positive_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		b2y__b____source.setName(b2y__b____source_name_prime);
		b2y__y____target.setName(b2y__y____target_name_prime);
		w__c____next.setName(w__c____next_name_prime);
		y__z____next.setName(y__z____next_name_prime);
		w__a____first.setName(w__a____first_name_prime);
		return new Object[] { ruleresult, b, y, z, c, x, c2z, w, a, a2x, i, b2y, c__b____first, c2z__z____target,
				c2z__c____source, c__b____last, a2x__a____source, a2x__x____target, z__y____positive, i__x____positive,
				i__z____negative, b2y__b____source, b2y__y____target, w__c____next, y__z____next, w__a____first };
	}

	public static final void pattern_whileaul2branchcub_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			whileaul2branchcub _this, PerformRuleResult ruleresult, EObject b, EObject y, EObject w2i, EObject z,
			EObject c, EObject x, EObject c2z, EObject w, EObject a, EObject a2x, EObject i, EObject b2y) {
		_this.registerObjects_BWD(ruleresult, b, y, w2i, z, c, x, c2z, w, a, a2x, i, b2y);

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
		EObject _localVariable_0 = match.getObject("y");
		EObject _localVariable_1 = match.getObject("z");
		EObject _localVariable_2 = match.getObject("x");
		EObject _localVariable_3 = match.getObject("i");
		EObject tmpY = _localVariable_0;
		EObject tmpZ = _localVariable_1;
		EObject tmpX = _localVariable_2;
		EObject tmpI = _localVariable_3;
		if (tmpY instanceof Command) {
			Command y = (Command) tmpY;
			if (tmpZ instanceof Branch) {
				Branch z = (Branch) tmpZ;
				if (tmpX instanceof Command) {
					Command x = (Command) tmpX;
					if (tmpI instanceof Branch) {
						Branch i = (Branch) tmpI;
						return new Object[] { y, z, x, i, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileaul2branchcub_12_2_corematch_blackBFBBFBB(Command y, Branch z,
			Command x, Branch i, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(y)) {
			if (!i.equals(z)) {
				for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class,
						"target")) {
					Statement tmpW = w2i.getSource();
					if (tmpW instanceof While) {
						While w = (While) tmpW;
						_result.add(new Object[] { y, w2i, z, x, w, i, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileaul2branchcub_12_3_findcontext_blackBBBBBB(Command y, S2B w2i,
			Branch z, Command x, While w, Branch i) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!x.equals(y)) {
			if (!i.equals(z)) {
				if (i.equals(w2i.getTarget())) {
					if (y.equals(z.getPositive())) {
						if (x.equals(i.getPositive())) {
							if (z.equals(i.getNegative())) {
								if (z.equals(y.getNext())) {
									if (w.equals(w2i.getSource())) {
										_result.add(new Object[] { y, w2i, z, x, w, i });
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

	public static final Object[] pattern_whileaul2branchcub_12_3_findcontext_greenBBBBBBFFFFFFF(Command y, S2B w2i,
			Branch z, Command x, While w, Branch i) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge w2i__i____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge z__y____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__x____positive = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i__z____negative = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge y__z____next = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge w2i__w____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String w2i__i____target_name_prime = "target";
		String z__y____positive_name_prime = "positive";
		String i__x____positive_name_prime = "positive";
		String i__z____negative_name_prime = "negative";
		String y__z____next_name_prime = "next";
		String w2i__w____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(y);
		isApplicableMatch.getAllContextElements().add(w2i);
		isApplicableMatch.getAllContextElements().add(z);
		isApplicableMatch.getAllContextElements().add(x);
		isApplicableMatch.getAllContextElements().add(w);
		isApplicableMatch.getAllContextElements().add(i);
		w2i__i____target.setSrc(w2i);
		w2i__i____target.setTrg(i);
		isApplicableMatch.getAllContextElements().add(w2i__i____target);
		z__y____positive.setSrc(z);
		z__y____positive.setTrg(y);
		isApplicableMatch.getAllContextElements().add(z__y____positive);
		i__x____positive.setSrc(i);
		i__x____positive.setTrg(x);
		isApplicableMatch.getAllContextElements().add(i__x____positive);
		i__z____negative.setSrc(i);
		i__z____negative.setTrg(z);
		isApplicableMatch.getAllContextElements().add(i__z____negative);
		y__z____next.setSrc(y);
		y__z____next.setTrg(z);
		isApplicableMatch.getAllContextElements().add(y__z____next);
		w2i__w____source.setSrc(w2i);
		w2i__w____source.setTrg(w);
		isApplicableMatch.getAllContextElements().add(w2i__w____source);
		w2i__i____target.setName(w2i__i____target_name_prime);
		z__y____positive.setName(z__y____positive_name_prime);
		i__x____positive.setName(i__x____positive_name_prime);
		i__z____negative.setName(i__z____negative_name_prime);
		y__z____next.setName(y__z____next_name_prime);
		w2i__w____source.setName(w2i__w____source_name_prime);
		return new Object[] { y, w2i, z, x, w, i, isApplicableMatch, w2i__i____target, z__y____positive,
				i__x____positive, i__z____negative, y__z____next, w2i__w____source };
	}

	public static final Object[] pattern_whileaul2branchcub_12_4_solveCSP_bindingFBBBBBBBB(whileaul2branchcub _this,
			IsApplicableMatch isApplicableMatch, Command y, S2B w2i, Branch z, Command x, While w, Branch i) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, y, w2i, z, x, w, i);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, y, w2i, z, x, w, i };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileaul2branchcub_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			whileaul2branchcub _this, IsApplicableMatch isApplicableMatch, Command y, S2B w2i, Branch z, Command x,
			While w, Branch i) {
		Object[] result_pattern_whileaul2branchcub_12_4_solveCSP_binding = pattern_whileaul2branchcub_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, y, w2i, z, x, w, i);
		if (result_pattern_whileaul2branchcub_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileaul2branchcub_12_4_solveCSP_binding[0];

			Object[] result_pattern_whileaul2branchcub_12_4_solveCSP_black = pattern_whileaul2branchcub_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_whileaul2branchcub_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, y, w2i, z, x, w, i };
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

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_0B(Command y) {
		for (Graph __DEC_y_root_611328 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_1BBB(Command y,
			Branch z, Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_y_positive_398675 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!z.equals(__DEC_y_positive_398675)) {
					if (!i.equals(__DEC_y_positive_398675)) {
						return new Object[] { y, z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_2BBB(Command y,
			Branch z, Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_y_negative_942453 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!z.equals(__DEC_y_negative_942453)) {
					if (!i.equals(__DEC_y_negative_942453)) {
						return new Object[] { y, z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_3B(Branch z) {
		for (Graph __DEC_z_root_402671 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_4BB(Branch z,
			Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_z_positive_712948 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!z.equals(__DEC_z_positive_712948)) {
					if (!i.equals(__DEC_z_positive_712948)) {
						return new Object[] { z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_5BB(Branch z,
			Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_z_negative_999820 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!z.equals(__DEC_z_negative_999820)) {
					if (!i.equals(__DEC_z_negative_999820)) {
						return new Object[] { z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_6B(Command x) {
		for (Graph __DEC_x_root_743355 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_7BBB(Command x,
			Branch z, Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_x_positive_571386 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!z.equals(__DEC_x_positive_571386)) {
					if (!i.equals(__DEC_x_positive_571386)) {
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
			for (Branch __DEC_x_negative_715356 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!z.equals(__DEC_x_negative_715356)) {
					if (!i.equals(__DEC_x_negative_715356)) {
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
			EMoflonEdge _edge_positive) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpZ = _edge_positive.getSrc();
		if (tmpZ instanceof Branch) {
			Branch z = (Branch) tmpZ;
			EObject tmpY = _edge_positive.getTrg();
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (y.equals(z.getPositive())) {
					if (z.equals(y.getNext())) {
						if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_3B(z) == null) {
							if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_0B(y) == null) {
								if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_10BB(z, y) == null) {
									for (Branch i : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(z, Branch.class, "negative")) {
										if (!i.equals(z)) {
											Node tmpX = i.getPositive();
											if (tmpX instanceof Command) {
												Command x = (Command) tmpX;
												if (!x.equals(y)) {
													if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_1BBB(
															y, z, i) == null) {
														if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_2BBB(
																y, z, i) == null) {
															if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_4BB(
																	z, i) == null) {
																if (pattern_whileaul2branchcub_20_2_testcorematchandDECs_black_nac_5BB(
																		z, i) == null) {
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
																													y,
																													z,
																													x,
																													i,
																													_edge_positive });
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}

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
			whileaul2branchcub _this, Match match, Command y, Branch z, Command x, Branch i) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, y, z, x, i);
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

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_0B(Assignment b) {
		for (Decision __DEC_b_positive_34776 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_1B(Assignment b) {
		for (Decision __DEC_b_negative_849604 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_2BBB(Assignment b,
			While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_b_last_998900 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!c.equals(__DEC_b_last_998900)) {
					if (!w.equals(__DEC_b_last_998900)) {
						return new Object[] { b, c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_3B(Assignment b) {
		for (Program __DEC_b_first_193386 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_4B(While c) {
		for (Decision __DEC_c_positive_570886 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_5B(While c) {
		for (Decision __DEC_c_negative_416581 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_6BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_first_250872 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!c.equals(__DEC_c_first_250872)) {
					if (!w.equals(__DEC_c_first_250872)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_7BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_last_580566 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!c.equals(__DEC_c_last_580566)) {
					if (!w.equals(__DEC_c_last_580566)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_8B(While c) {
		for (Program __DEC_c_first_333870 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_9B(Assignment a) {
		for (Decision __DEC_a_positive_255576 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_10B(Assignment a) {
		for (Decision __DEC_a_negative_241254 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_11BBB(Assignment a,
			While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_a_last_766975 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!c.equals(__DEC_a_last_766975)) {
					if (!w.equals(__DEC_a_last_766975)) {
						return new Object[] { a, c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_12B(Assignment a) {
		for (Program __DEC_a_first_388031 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_13BB(While w,
			Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
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

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_15BB(While w,
			Assignment a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_whileaul2branchcub_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_first) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpC = _edge_first.getSrc();
		if (tmpC instanceof While) {
			While c = (While) tmpC;
			EObject tmpB = _edge_first.getTrg();
			if (tmpB instanceof Assignment) {
				Assignment b = (Assignment) tmpB;
				if (b.equals(c.getFirst())) {
					if (b.equals(c.getLast())) {
						if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_4B(c) == null) {
							if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_5B(c) == null) {
								if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_8B(c) == null) {
									if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_0B(b) == null) {
										if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_1B(
												b) == null) {
											if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_3B(
													b) == null) {
												for (Statement tmpW : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(c, Statement.class, "next")) {
													if (tmpW instanceof While) {
														While w = (While) tmpW;
														if (!c.equals(w)) {
															Statement tmpA = w.getFirst();
															if (tmpA instanceof Assignment) {
																Assignment a = (Assignment) tmpA;
																if (!a.equals(b)) {
																	if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_2BBB(
																			b, c, w) == null) {
																		if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_6BB(
																				c, w) == null) {
																			if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_7BB(
																					c, w) == null) {
																				if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_13BB(
																						w, b) == null) {
																					if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_9B(
																							a) == null) {
																						if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_10B(
																								a) == null) {
																							if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_11BBB(
																									a, c, w) == null) {
																								if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_12B(
																										a) == null) {
																									if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_14BB(
																											c,
																											a) == null) {
																										if (pattern_whileaul2branchcub_21_2_testcorematchandDECs_black_nac_15BB(
																												w,
																												a) == null) {
																											_result.add(
																													new Object[] {
																															b,
																															c,
																															w,
																															a,
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

	public static final Object[] pattern_whileaul2branchcub_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_whileaul2branchcub_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			whileaul2branchcub _this, Match match, Assignment b, While c, While w, Assignment a) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, b, c, w, a);
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
		EObject _localVariable_0 = sourceMatch.getObject("b");
		EObject _localVariable_1 = targetMatch.getObject("y");
		EObject _localVariable_2 = targetMatch.getObject("z");
		EObject _localVariable_3 = sourceMatch.getObject("c");
		EObject _localVariable_4 = targetMatch.getObject("x");
		EObject _localVariable_5 = sourceMatch.getObject("w");
		EObject _localVariable_6 = sourceMatch.getObject("a");
		EObject _localVariable_7 = targetMatch.getObject("i");
		EObject tmpB = _localVariable_0;
		EObject tmpY = _localVariable_1;
		EObject tmpZ = _localVariable_2;
		EObject tmpC = _localVariable_3;
		EObject tmpX = _localVariable_4;
		EObject tmpW = _localVariable_5;
		EObject tmpA = _localVariable_6;
		EObject tmpI = _localVariable_7;
		if (tmpB instanceof Assignment) {
			Assignment b = (Assignment) tmpB;
			if (tmpY instanceof Command) {
				Command y = (Command) tmpY;
				if (tmpZ instanceof Branch) {
					Branch z = (Branch) tmpZ;
					if (tmpC instanceof While) {
						While c = (While) tmpC;
						if (tmpX instanceof Command) {
							Command x = (Command) tmpX;
							if (tmpW instanceof While) {
								While w = (While) tmpW;
								if (tmpA instanceof Assignment) {
									Assignment a = (Assignment) tmpA;
									if (tmpI instanceof Branch) {
										Branch i = (Branch) tmpI;
										return new Object[] { b, y, z, c, x, w, a, i, sourceMatch, targetMatch };
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

	public static final Object[] pattern_whileaul2branchcub_24_2_matchsrctrgcontext_blackBBBBBBBBBB(Assignment b,
			Command y, Branch z, While c, Command x, While w, Assignment a, Branch i, Match sourceMatch,
			Match targetMatch) {
		if (!c.equals(w)) {
			if (!x.equals(y)) {
				if (!a.equals(b)) {
					if (!i.equals(z)) {
						if (!sourceMatch.equals(targetMatch)) {
							return new Object[] { b, y, z, c, x, w, a, i, sourceMatch, targetMatch };
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
			Assignment b = (Assignment) result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding[0];
			Command y = (Command) result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding[1];
			Branch z = (Branch) result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding[2];
			While c = (While) result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding[3];
			Command x = (Command) result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding[4];
			While w = (While) result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding[5];
			Assignment a = (Assignment) result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding[6];
			Branch i = (Branch) result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_black = pattern_whileaul2branchcub_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					b, y, z, c, x, w, a, i, sourceMatch, targetMatch);
			if (result_pattern_whileaul2branchcub_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { b, y, z, c, x, w, a, i, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_24_3_solvecsp_bindingFBBBBBBBBBBB(whileaul2branchcub _this,
			Assignment b, Command y, Branch z, While c, Command x, While w, Assignment a, Branch i, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(b, y, z, c, x, w, a, i, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, b, y, z, c, x, w, a, i, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileaul2branchcub_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			whileaul2branchcub _this, Assignment b, Command y, Branch z, While c, Command x, While w, Assignment a,
			Branch i, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_whileaul2branchcub_24_3_solvecsp_binding = pattern_whileaul2branchcub_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, b, y, z, c, x, w, a, i, sourceMatch, targetMatch);
		if (result_pattern_whileaul2branchcub_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_whileaul2branchcub_24_3_solvecsp_binding[0];

			Object[] result_pattern_whileaul2branchcub_24_3_solvecsp_black = pattern_whileaul2branchcub_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_whileaul2branchcub_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, b, y, z, c, x, w, a, i, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_whileaul2branchcub_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_whileaul2branchcub_24_5_matchcorrcontext_blackFBBBB(While w,
			Branch i, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (S2B w2i : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(i, S2B.class, "target")) {
				if (w.equals(w2i.getSource())) {
					_result.add(new Object[] { w2i, w, i, sourceMatch, targetMatch });
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

	public static final Object[] pattern_whileaul2branchcub_24_6_createcorrespondence_blackBBBBBBBBB(Assignment b,
			Command y, Branch z, While c, Command x, While w, Assignment a, Branch i, CCMatch ccMatch) {
		if (!c.equals(w)) {
			if (!x.equals(y)) {
				if (!a.equals(b)) {
					if (!i.equals(z)) {
						return new Object[] { b, y, z, c, x, w, a, i, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_24_6_createcorrespondence_greenBBBBBFBFFB(Assignment b,
			Command y, Branch z, While c, Command x, Assignment a, CCMatch ccMatch) {
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		c2z.setTarget(z);
		c2z.setSource(c);
		ccMatch.getCreateCorr().add(c2z);
		a2x.setSource(a);
		a2x.setTarget(x);
		ccMatch.getCreateCorr().add(a2x);
		b2y.setSource(b);
		b2y.setTarget(y);
		ccMatch.getCreateCorr().add(b2y);
		return new Object[] { b, y, z, c, x, c2z, a, a2x, b2y, ccMatch };
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

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_0B(Assignment b) {
		for (Decision __DEC_b_positive_836296 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "positive")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_1B(Assignment b) {
		for (Decision __DEC_b_negative_24776 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Decision.class, "negative")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_2BBB(Assignment b, While c,
			While w) {
		if (!c.equals(w)) {
			for (While __DEC_b_last_234361 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
					While.class, "last")) {
				if (!c.equals(__DEC_b_last_234361)) {
					if (!w.equals(__DEC_b_last_234361)) {
						return new Object[] { b, c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_3B(Assignment b) {
		for (Program __DEC_b_first_806139 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(b,
				Program.class, "first")) {
			return new Object[] { b };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_4B(While c) {
		for (Decision __DEC_c_positive_469556 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_5B(While c) {
		for (Decision __DEC_c_negative_692110 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Decision.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_6BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_first_461654 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "first")) {
				if (!c.equals(__DEC_c_first_461654)) {
					if (!w.equals(__DEC_c_first_461654)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_7BB(While c, While w) {
		if (!c.equals(w)) {
			for (While __DEC_c_last_707150 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
					While.class, "last")) {
				if (!c.equals(__DEC_c_last_707150)) {
					if (!w.equals(__DEC_c_last_707150)) {
						return new Object[] { c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_8B(While c) {
		for (Program __DEC_c_first_301679 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Program.class, "first")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_9B(Assignment a) {
		for (Decision __DEC_a_positive_465271 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_10B(Assignment a) {
		for (Decision __DEC_a_negative_725239 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_11BBB(Assignment a, While c,
			While w) {
		if (!c.equals(w)) {
			for (While __DEC_a_last_624551 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
					While.class, "last")) {
				if (!c.equals(__DEC_a_last_624551)) {
					if (!w.equals(__DEC_a_last_624551)) {
						return new Object[] { a, c, w };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_12B(Assignment a) {
		for (Program __DEC_a_first_276006 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Program.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_13BB(While w, Assignment b) {
		if (b.equals(w.getLast())) {
			return new Object[] { w, b };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_14BB(While c, Assignment a) {
		if (a.equals(c.getLast())) {
			return new Object[] { c, a };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_15BB(While w, Assignment a) {
		if (a.equals(w.getLast())) {
			return new Object[] { w, a };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_27_1_matchtggpattern_blackBBBB(Assignment b, While c,
			While w, Assignment a) {
		if (!c.equals(w)) {
			if (!a.equals(b)) {
				if (b.equals(c.getFirst())) {
					if (b.equals(c.getLast())) {
						if (c.equals(w.getNext())) {
							if (a.equals(w.getFirst())) {
								if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_0B(b) == null) {
									if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_1B(b) == null) {
										if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_2BBB(b, c,
												w) == null) {
											if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_3B(
													b) == null) {
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
																			a) == null) {
																		if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_10B(
																				a) == null) {
																			if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_11BBB(
																					a, c, w) == null) {
																				if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_12B(
																						a) == null) {
																					if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_13BB(
																							w, b) == null) {
																						if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_14BB(
																								c, a) == null) {
																							if (pattern_whileaul2branchcub_27_1_matchtggpattern_black_nac_15BB(
																									w, a) == null) {
																								return new Object[] { b,
																										c, w, a };
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_0B(Command y) {
		for (Graph __DEC_y_root_696038 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
				Graph.class, "root")) {
			return new Object[] { y };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_1BBB(Command y, Branch z,
			Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_y_positive_792266 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "positive")) {
				if (!z.equals(__DEC_y_positive_792266)) {
					if (!i.equals(__DEC_y_positive_792266)) {
						return new Object[] { y, z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_2BBB(Command y, Branch z,
			Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_y_negative_427501 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(y,
					Branch.class, "negative")) {
				if (!z.equals(__DEC_y_negative_427501)) {
					if (!i.equals(__DEC_y_negative_427501)) {
						return new Object[] { y, z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_3B(Branch z) {
		for (Graph __DEC_z_root_174289 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
				Graph.class, "root")) {
			return new Object[] { z };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_4BB(Branch z, Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_z_positive_662167 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "positive")) {
				if (!z.equals(__DEC_z_positive_662167)) {
					if (!i.equals(__DEC_z_positive_662167)) {
						return new Object[] { z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_5BB(Branch z, Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_z_negative_848951 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(z,
					Branch.class, "negative")) {
				if (!z.equals(__DEC_z_negative_848951)) {
					if (!i.equals(__DEC_z_negative_848951)) {
						return new Object[] { z, i };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_6B(Command x) {
		for (Graph __DEC_x_root_962840 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
				Graph.class, "root")) {
			return new Object[] { x };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_7BBB(Command x, Branch z,
			Branch i) {
		if (!i.equals(z)) {
			for (Branch __DEC_x_positive_316542 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "positive")) {
				if (!z.equals(__DEC_x_positive_316542)) {
					if (!i.equals(__DEC_x_positive_316542)) {
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
			for (Branch __DEC_x_negative_370065 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(x,
					Branch.class, "negative")) {
				if (!z.equals(__DEC_x_negative_370065)) {
					if (!i.equals(__DEC_x_negative_370065)) {
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

	public static final Object[] pattern_whileaul2branchcub_28_1_matchtggpattern_blackBBBB(Command y, Branch z,
			Command x, Branch i) {
		if (!x.equals(y)) {
			if (!i.equals(z)) {
				if (y.equals(z.getPositive())) {
					if (x.equals(i.getPositive())) {
						if (z.equals(i.getNegative())) {
							if (z.equals(y.getNext())) {
								if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_0B(y) == null) {
									if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_1BBB(y, z,
											i) == null) {
										if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_2BBB(y, z,
												i) == null) {
											if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_3B(
													z) == null) {
												if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_4BB(z,
														i) == null) {
													if (pattern_whileaul2branchcub_28_1_matchtggpattern_black_nac_5BB(z,
															i) == null) {
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
																							return new Object[] { y, z,
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
			ModelgeneratorRuleResult ruleResult, S2B w2i) {
		if (ruleResult.getCorrObjects().contains(w2i)) {
			return new Object[] { ruleResult, w2i };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Branch i) {
		if (ruleResult.getTargetObjects().contains(i)) {
			return new Object[] { ruleResult, i };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, While w) {
		if (ruleResult.getSourceObjects().contains(w)) {
			return new Object[] { ruleResult, w };
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
					Branch i = w2i.getTarget();
					if (i != null) {
						Statement tmpW = w2i.getSource();
						if (tmpW instanceof While) {
							While w = (While) tmpW;
							if (pattern_whileaul2branchcub_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									w2i) == null) {
								if (pattern_whileaul2branchcub_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										i) == null) {
									if (pattern_whileaul2branchcub_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											w) == null) {
										_result.add(
												new Object[] { w2iList, w2i, i, w, ruleEntryContainer, ruleResult });
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
			IsApplicableMatch isApplicableMatch, S2B w2i, While w, Branch i, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, w2i, w, i, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, w2i, w, i, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_whileaul2branchcub_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_whileaul2branchcub_29_3_solveCSP_bindingAndBlackFBBBBBB(
			whileaul2branchcub _this, IsApplicableMatch isApplicableMatch, S2B w2i, While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_whileaul2branchcub_29_3_solveCSP_binding = pattern_whileaul2branchcub_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, w2i, w, i, ruleResult);
		if (result_pattern_whileaul2branchcub_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_whileaul2branchcub_29_3_solveCSP_binding[0];

			Object[] result_pattern_whileaul2branchcub_29_3_solveCSP_black = pattern_whileaul2branchcub_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_whileaul2branchcub_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, w2i, w, i, ruleResult };
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

	public static final Object[] pattern_whileaul2branchcub_29_5_checknacs_blackBBB(S2B w2i, While w, Branch i) {
		return new Object[] { w2i, w, i };
	}

	public static final Object[] pattern_whileaul2branchcub_29_6_perform_blackBBBB(S2B w2i, While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { w2i, w, i, ruleResult };
	}

	public static final Object[] pattern_whileaul2branchcub_29_6_perform_greenFFFFFFBFFBFB(While w, Branch i,
			ModelgeneratorRuleResult ruleResult) {
		Assignment b = SourcecodeFactory.eINSTANCE.createAssignment();
		Command y = ControlflowFactory.eINSTANCE.createCommand();
		Branch z = ControlflowFactory.eINSTANCE.createBranch();
		While c = SourcecodeFactory.eINSTANCE.createWhile();
		Command x = ControlflowFactory.eINSTANCE.createCommand();
		S2B c2z = Sourcecode2controlflowFactory.eINSTANCE.createS2B();
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N a2x = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		S2N b2y = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getSourceObjects().add(b);
		ruleResult.getTargetObjects().add(y);
		z.setPositive(y);
		i.setNegative(z);
		y.setNext(z);
		ruleResult.getTargetObjects().add(z);
		c.setFirst(b);
		c.setLast(b);
		w.setNext(c);
		ruleResult.getSourceObjects().add(c);
		i.setPositive(x);
		ruleResult.getTargetObjects().add(x);
		c2z.setTarget(z);
		c2z.setSource(c);
		ruleResult.getCorrObjects().add(c2z);
		w.setFirst(a);
		ruleResult.getSourceObjects().add(a);
		a2x.setSource(a);
		a2x.setTarget(x);
		ruleResult.getCorrObjects().add(a2x);
		b2y.setSource(b);
		b2y.setTarget(y);
		ruleResult.getCorrObjects().add(b2y);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { b, y, z, c, x, c2z, w, a, a2x, i, b2y, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_whileaul2branchcub_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //whileaul2branchcubImpl
