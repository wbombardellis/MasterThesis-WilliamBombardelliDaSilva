/**
 */
package org.wbsilva.bx.sourcecode2controlflow.Rules.impl;

import controlflow.Branch;
import controlflow.Command;
import controlflow.ControlflowFactory;
import controlflow.Graph;

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

import org.wbsilva.bx.sourcecode2controlflow.P2G;

import org.wbsilva.bx.sourcecode2controlflow.Rules.RulesPackage;
import org.wbsilva.bx.sourcecode2controlflow.Rules.firstass2rootcmd;

import org.wbsilva.bx.sourcecode2controlflow.S2N;
import org.wbsilva.bx.sourcecode2controlflow.Sourcecode2controlflowFactory;

import sourcecode.Assignment;
import sourcecode.Decision;
import sourcecode.Program;
import sourcecode.SourcecodeFactory;
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
 * An implementation of the model object '<em><b>firstass2rootcmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class firstass2rootcmdImpl extends AbstractRuleImpl implements firstass2rootcmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected firstass2rootcmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getfirstass2rootcmd();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Assignment a, Program p) {

		Object[] result1_black = firstass2rootcmdImpl.pattern_firstass2rootcmd_0_1_initialbindings_blackBBBB(this,
				match, a, p);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[p] = " + p + ".");
		}

		Object[] result2_bindingAndBlack = firstass2rootcmdImpl
				.pattern_firstass2rootcmd_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, a, p);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[a] = " + a + ", " + "[p] = " + p + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (firstass2rootcmdImpl.pattern_firstass2rootcmd_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = firstass2rootcmdImpl
					.pattern_firstass2rootcmd_0_4_collectelementstobetranslated_blackBBB(match, a, p);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[p] = " + p + ".");
			}
			firstass2rootcmdImpl.pattern_firstass2rootcmd_0_4_collectelementstobetranslated_greenBBBF(match, a, p);
			//nothing EMoflonEdge p__a____first = (EMoflonEdge) result4_green[3];

			Object[] result5_black = firstass2rootcmdImpl
					.pattern_firstass2rootcmd_0_5_collectcontextelements_blackBBB(match, a, p);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[a] = " + a + ", " + "[p] = " + p + ".");
			}
			firstass2rootcmdImpl.pattern_firstass2rootcmd_0_5_collectcontextelements_greenBB(match, p);

			// 
			firstass2rootcmdImpl.pattern_firstass2rootcmd_0_6_registerobjectstomatch_expressionBBBB(this, match, a, p);
			return firstass2rootcmdImpl.pattern_firstass2rootcmd_0_7_expressionF();
		} else {
			return firstass2rootcmdImpl.pattern_firstass2rootcmd_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = firstass2rootcmdImpl
				.pattern_firstass2rootcmd_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Assignment a = (Assignment) result1_bindingAndBlack[0];
		Program p = (Program) result1_bindingAndBlack[1];
		Graph g = (Graph) result1_bindingAndBlack[2];
		P2G p2g = (P2G) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = firstass2rootcmdImpl.pattern_firstass2rootcmd_1_1_performtransformation_greenFBFB(a,
				g);
		Command c = (Command) result1_green[0];
		S2N f2r = (S2N) result1_green[2];

		Object[] result2_black = firstass2rootcmdImpl.pattern_firstass2rootcmd_1_2_collecttranslatedelements_blackBBB(c,
				a, f2r);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", " + "[a] = " + a
					+ ", " + "[f2r] = " + f2r + ".");
		}
		Object[] result2_green = firstass2rootcmdImpl
				.pattern_firstass2rootcmd_1_2_collecttranslatedelements_greenFBBB(c, a, f2r);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = firstass2rootcmdImpl
				.pattern_firstass2rootcmd_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, c, a, f2r, p, g, p2g);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[f2r] = " + f2r + ", " + "[p] = " + p + ", "
					+ "[g] = " + g + ", " + "[p2g] = " + p2g + ".");
		}
		firstass2rootcmdImpl.pattern_firstass2rootcmd_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, c, a, f2r, p,
				g);
		//nothing EMoflonEdge f2r__a____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge f2r__c____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge p__a____first = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge g__c____root = (EMoflonEdge) result3_green[9];

		// 
		// 
		firstass2rootcmdImpl.pattern_firstass2rootcmd_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, c, a,
				f2r, p, g, p2g);
		return firstass2rootcmdImpl.pattern_firstass2rootcmd_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = firstass2rootcmdImpl
				.pattern_firstass2rootcmd_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = firstass2rootcmdImpl
				.pattern_firstass2rootcmd_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = firstass2rootcmdImpl.pattern_firstass2rootcmd_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Assignment a = (Assignment) result2_binding[0];
		Program p = (Program) result2_binding[1];
		for (Object[] result2_black : firstass2rootcmdImpl.pattern_firstass2rootcmd_2_2_corematch_blackBBFFB(a, p,
				match)) {
			Graph g = (Graph) result2_black[2];
			P2G p2g = (P2G) result2_black[3];
			// ForEach 
			for (Object[] result3_black : firstass2rootcmdImpl.pattern_firstass2rootcmd_2_3_findcontext_blackBBBB(a, p,
					g, p2g)) {
				Object[] result3_green = firstass2rootcmdImpl.pattern_firstass2rootcmd_2_3_findcontext_greenBBBBFFFF(a,
						p, g, p2g);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge p__a____first = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge p2g__p____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge p2g__g____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = firstass2rootcmdImpl
						.pattern_firstass2rootcmd_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, a, p, g,
								p2g);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[a] = " + a + ", " + "[p] = " + p
							+ ", " + "[g] = " + g + ", " + "[p2g] = " + p2g + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (firstass2rootcmdImpl.pattern_firstass2rootcmd_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = firstass2rootcmdImpl
							.pattern_firstass2rootcmd_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					firstass2rootcmdImpl.pattern_firstass2rootcmd_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return firstass2rootcmdImpl.pattern_firstass2rootcmd_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Assignment a, Program p) {
		match.registerObject("a", a);
		match.registerObject("p", p);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Assignment a, Program p) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Assignment a, Program p, Graph g,
			P2G p2g) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("a", a);
		isApplicableMatch.registerObject("p", p);
		isApplicableMatch.registerObject("g", g);
		isApplicableMatch.registerObject("p2g", p2g);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject c, EObject a, EObject f2r, EObject p,
			EObject g, EObject p2g) {
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("f2r", f2r);
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("g", g);
		ruleresult.registerObject("p2g", p2g);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("a").eClass())
				.equals("sourcecode.Assignment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Command c, Graph g) {

		Object[] result1_black = firstass2rootcmdImpl.pattern_firstass2rootcmd_10_1_initialbindings_blackBBBB(this,
				match, c, g);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[g] = " + g + ".");
		}

		Object[] result2_bindingAndBlack = firstass2rootcmdImpl
				.pattern_firstass2rootcmd_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, c, g);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[c] = " + c + ", " + "[g] = " + g + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (firstass2rootcmdImpl.pattern_firstass2rootcmd_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = firstass2rootcmdImpl
					.pattern_firstass2rootcmd_10_4_collectelementstobetranslated_blackBBB(match, c, g);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[g] = " + g + ".");
			}
			firstass2rootcmdImpl.pattern_firstass2rootcmd_10_4_collectelementstobetranslated_greenBBBF(match, c, g);
			//nothing EMoflonEdge g__c____root = (EMoflonEdge) result4_green[3];

			Object[] result5_black = firstass2rootcmdImpl
					.pattern_firstass2rootcmd_10_5_collectcontextelements_blackBBB(match, c, g);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[c] = " + c + ", " + "[g] = " + g + ".");
			}
			firstass2rootcmdImpl.pattern_firstass2rootcmd_10_5_collectcontextelements_greenBB(match, g);

			// 
			firstass2rootcmdImpl.pattern_firstass2rootcmd_10_6_registerobjectstomatch_expressionBBBB(this, match, c, g);
			return firstass2rootcmdImpl.pattern_firstass2rootcmd_10_7_expressionF();
		} else {
			return firstass2rootcmdImpl.pattern_firstass2rootcmd_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = firstass2rootcmdImpl
				.pattern_firstass2rootcmd_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Command c = (Command) result1_bindingAndBlack[0];
		Program p = (Program) result1_bindingAndBlack[1];
		Graph g = (Graph) result1_bindingAndBlack[2];
		P2G p2g = (P2G) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = firstass2rootcmdImpl.pattern_firstass2rootcmd_11_1_performtransformation_greenBFFB(c,
				p);
		Assignment a = (Assignment) result1_green[1];
		S2N f2r = (S2N) result1_green[2];

		Object[] result2_black = firstass2rootcmdImpl
				.pattern_firstass2rootcmd_11_2_collecttranslatedelements_blackBBB(c, a, f2r);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c] = " + c + ", " + "[a] = " + a
					+ ", " + "[f2r] = " + f2r + ".");
		}
		Object[] result2_green = firstass2rootcmdImpl
				.pattern_firstass2rootcmd_11_2_collecttranslatedelements_greenFBBB(c, a, f2r);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = firstass2rootcmdImpl
				.pattern_firstass2rootcmd_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, c, a, f2r, p, g, p2g);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[c] = " + c + ", " + "[a] = " + a + ", " + "[f2r] = " + f2r + ", " + "[p] = " + p + ", "
					+ "[g] = " + g + ", " + "[p2g] = " + p2g + ".");
		}
		firstass2rootcmdImpl.pattern_firstass2rootcmd_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, c, a, f2r, p,
				g);
		//nothing EMoflonEdge f2r__a____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge f2r__c____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge p__a____first = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge g__c____root = (EMoflonEdge) result3_green[9];

		// 
		// 
		firstass2rootcmdImpl.pattern_firstass2rootcmd_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, c, a,
				f2r, p, g, p2g);
		return firstass2rootcmdImpl.pattern_firstass2rootcmd_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = firstass2rootcmdImpl
				.pattern_firstass2rootcmd_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = firstass2rootcmdImpl
				.pattern_firstass2rootcmd_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = firstass2rootcmdImpl.pattern_firstass2rootcmd_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Command c = (Command) result2_binding[0];
		Graph g = (Graph) result2_binding[1];
		for (Object[] result2_black : firstass2rootcmdImpl.pattern_firstass2rootcmd_12_2_corematch_blackBFBFB(c, g,
				match)) {
			Program p = (Program) result2_black[1];
			P2G p2g = (P2G) result2_black[3];
			// ForEach 
			for (Object[] result3_black : firstass2rootcmdImpl.pattern_firstass2rootcmd_12_3_findcontext_blackBBBB(c, p,
					g, p2g)) {
				Object[] result3_green = firstass2rootcmdImpl.pattern_firstass2rootcmd_12_3_findcontext_greenBBBBFFFF(c,
						p, g, p2g);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge p2g__p____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge p2g__g____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge g__c____root = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = firstass2rootcmdImpl
						.pattern_firstass2rootcmd_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, c, p, g,
								p2g);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[c] = " + c + ", " + "[p] = " + p
							+ ", " + "[g] = " + g + ", " + "[p2g] = " + p2g + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (firstass2rootcmdImpl.pattern_firstass2rootcmd_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = firstass2rootcmdImpl
							.pattern_firstass2rootcmd_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					firstass2rootcmdImpl.pattern_firstass2rootcmd_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return firstass2rootcmdImpl.pattern_firstass2rootcmd_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Command c, Graph g) {
		match.registerObject("c", c);
		match.registerObject("g", g);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Command c, Graph g) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Command c, Program p, Graph g, P2G p2g) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("c", c);
		isApplicableMatch.registerObject("p", p);
		isApplicableMatch.registerObject("g", g);
		isApplicableMatch.registerObject("p2g", p2g);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject c, EObject a, EObject f2r, EObject p,
			EObject g, EObject p2g) {
		ruleresult.registerObject("c", c);
		ruleresult.registerObject("a", a);
		ruleresult.registerObject("f2r", f2r);
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("g", g);
		ruleresult.registerObject("p2g", p2g);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("c").eClass()).equals("controlflow.Command.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_126(EMoflonEdge _edge_root) {

		Object[] result1_bindingAndBlack = firstass2rootcmdImpl
				.pattern_firstass2rootcmd_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = firstass2rootcmdImpl.pattern_firstass2rootcmd_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : firstass2rootcmdImpl
				.pattern_firstass2rootcmd_20_2_testcorematchandDECs_blackFFB(_edge_root)) {
			Command c = (Command) result2_black[0];
			Graph g = (Graph) result2_black[1];
			Object[] result2_green = firstass2rootcmdImpl
					.pattern_firstass2rootcmd_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (firstass2rootcmdImpl
					.pattern_firstass2rootcmd_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, c, g)) {
				// 
				if (firstass2rootcmdImpl
						.pattern_firstass2rootcmd_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = firstass2rootcmdImpl
							.pattern_firstass2rootcmd_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					firstass2rootcmdImpl.pattern_firstass2rootcmd_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return firstass2rootcmdImpl.pattern_firstass2rootcmd_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_126(EMoflonEdge _edge_first) {

		Object[] result1_bindingAndBlack = firstass2rootcmdImpl
				.pattern_firstass2rootcmd_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = firstass2rootcmdImpl.pattern_firstass2rootcmd_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : firstass2rootcmdImpl
				.pattern_firstass2rootcmd_21_2_testcorematchandDECs_blackFFB(_edge_first)) {
			Assignment a = (Assignment) result2_black[0];
			Program p = (Program) result2_black[1];
			Object[] result2_green = firstass2rootcmdImpl
					.pattern_firstass2rootcmd_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (firstass2rootcmdImpl
					.pattern_firstass2rootcmd_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, a, p)) {
				// 
				if (firstass2rootcmdImpl
						.pattern_firstass2rootcmd_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = firstass2rootcmdImpl
							.pattern_firstass2rootcmd_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					firstass2rootcmdImpl.pattern_firstass2rootcmd_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return firstass2rootcmdImpl.pattern_firstass2rootcmd_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("firstass2rootcmd");
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
		ruleResult.setRule("firstass2rootcmd");
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

		Object[] result1_black = firstass2rootcmdImpl.pattern_firstass2rootcmd_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = firstass2rootcmdImpl.pattern_firstass2rootcmd_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = firstass2rootcmdImpl
				.pattern_firstass2rootcmd_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Command c = (Command) result2_bindingAndBlack[0];
		Assignment a = (Assignment) result2_bindingAndBlack[1];
		Program p = (Program) result2_bindingAndBlack[2];
		Graph g = (Graph) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = firstass2rootcmdImpl
				.pattern_firstass2rootcmd_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, c, a, p, g, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[c] = " + c + ", " + "[a] = " + a + ", " + "[p] = " + p + ", " + "[g] = " + g + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (firstass2rootcmdImpl.pattern_firstass2rootcmd_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : firstass2rootcmdImpl
					.pattern_firstass2rootcmd_24_5_matchcorrcontext_blackBBFBB(p, g, sourceMatch, targetMatch)) {
				P2G p2g = (P2G) result5_black[2];
				Object[] result5_green = firstass2rootcmdImpl
						.pattern_firstass2rootcmd_24_5_matchcorrcontext_greenBBBF(p2g, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = firstass2rootcmdImpl
						.pattern_firstass2rootcmd_24_6_createcorrespondence_blackBBBBB(c, a, p, g, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[c] = " + c + ", " + "[a] = " + a + ", "
									+ "[p] = " + p + ", " + "[g] = " + g + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				firstass2rootcmdImpl.pattern_firstass2rootcmd_24_6_createcorrespondence_greenBBFB(c, a, ccMatch);
				//nothing S2N f2r = (S2N) result6_green[2];

				Object[] result7_black = firstass2rootcmdImpl
						.pattern_firstass2rootcmd_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				firstass2rootcmdImpl.pattern_firstass2rootcmd_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return firstass2rootcmdImpl.pattern_firstass2rootcmd_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Command c, Assignment a, Program p, Graph g, Match sourceMatch,
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
	public boolean checkDEC_FWD(Assignment a, Program p) {// 
		Object[] result1_black = firstass2rootcmdImpl.pattern_firstass2rootcmd_27_1_matchtggpattern_blackBB(a, p);
		if (result1_black != null) {
			return firstass2rootcmdImpl.pattern_firstass2rootcmd_27_2_expressionF();
		} else {
			return firstass2rootcmdImpl.pattern_firstass2rootcmd_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Command c, Graph g) {// 
		Object[] result1_black = firstass2rootcmdImpl.pattern_firstass2rootcmd_28_1_matchtggpattern_blackBB(c, g);
		if (result1_black != null) {
			return firstass2rootcmdImpl.pattern_firstass2rootcmd_28_2_expressionF();
		} else {
			return firstass2rootcmdImpl.pattern_firstass2rootcmd_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, P2G p2gParameter) {

		Object[] result1_black = firstass2rootcmdImpl.pattern_firstass2rootcmd_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = firstass2rootcmdImpl.pattern_firstass2rootcmd_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : firstass2rootcmdImpl
				.pattern_firstass2rootcmd_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList p2gList = (RuleEntryList) result2_black[0];
			Program p = (Program) result2_black[1];
			P2G p2g = (P2G) result2_black[2];
			Graph g = (Graph) result2_black[3];

			Object[] result3_bindingAndBlack = firstass2rootcmdImpl
					.pattern_firstass2rootcmd_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, p, g, p2g,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[p] = " + p + ", " + "[g] = " + g
						+ ", " + "[p2g] = " + p2g + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (firstass2rootcmdImpl.pattern_firstass2rootcmd_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = firstass2rootcmdImpl.pattern_firstass2rootcmd_29_5_checknacs_blackBBB(p, g,
						p2g);
				if (result5_black != null) {

					Object[] result6_black = firstass2rootcmdImpl.pattern_firstass2rootcmd_29_6_perform_blackBBBB(p, g,
							p2g, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[p] = " + p + ", "
								+ "[g] = " + g + ", " + "[p2g] = " + p2g + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					firstass2rootcmdImpl.pattern_firstass2rootcmd_29_6_perform_greenFFFBBB(p, g, ruleResult);
					//nothing Command c = (Command) result6_green[0];
					//nothing Assignment a = (Assignment) result6_green[1];
					//nothing S2N f2r = (S2N) result6_green[2];

				} else {
				}

			} else {
			}

		}
		return firstass2rootcmdImpl.pattern_firstass2rootcmd_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Program p, Graph g, P2G p2g,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("p", p);
		isApplicableMatch.registerObject("g", g);
		isApplicableMatch.registerObject("p2g", p2g);
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
		case RulesPackage.FIRSTASS2ROOTCMD___IS_APPROPRIATE_FWD__MATCH_ASSIGNMENT_PROGRAM:
			return isAppropriate_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Program) arguments.get(2));
		case RulesPackage.FIRSTASS2ROOTCMD___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIRSTASS2ROOTCMD___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.FIRSTASS2ROOTCMD___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ASSIGNMENT_PROGRAM:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Program) arguments.get(2));
			return null;
		case RulesPackage.FIRSTASS2ROOTCMD___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ASSIGNMENT_PROGRAM:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Assignment) arguments.get(1),
					(Program) arguments.get(2));
		case RulesPackage.FIRSTASS2ROOTCMD___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIRSTASS2ROOTCMD___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASSIGNMENT_PROGRAM_GRAPH_P2G:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Assignment) arguments.get(1),
					(Program) arguments.get(2), (Graph) arguments.get(3), (P2G) arguments.get(4));
		case RulesPackage.FIRSTASS2ROOTCMD___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIRSTASS2ROOTCMD___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.FIRSTASS2ROOTCMD___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.FIRSTASS2ROOTCMD___IS_APPROPRIATE_BWD__MATCH_COMMAND_GRAPH:
			return isAppropriate_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Graph) arguments.get(2));
		case RulesPackage.FIRSTASS2ROOTCMD___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIRSTASS2ROOTCMD___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.FIRSTASS2ROOTCMD___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMAND_GRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Command) arguments.get(1), (Graph) arguments.get(2));
			return null;
		case RulesPackage.FIRSTASS2ROOTCMD___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMAND_GRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Command) arguments.get(1),
					(Graph) arguments.get(2));
		case RulesPackage.FIRSTASS2ROOTCMD___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIRSTASS2ROOTCMD___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMMAND_PROGRAM_GRAPH_P2G:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Command) arguments.get(1),
					(Program) arguments.get(2), (Graph) arguments.get(3), (P2G) arguments.get(4));
		case RulesPackage.FIRSTASS2ROOTCMD___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIRSTASS2ROOTCMD___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.FIRSTASS2ROOTCMD___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.FIRSTASS2ROOTCMD___IS_APPROPRIATE_BWD_EMOFLON_EDGE_126__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_126((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIRSTASS2ROOTCMD___IS_APPROPRIATE_FWD_EMOFLON_EDGE_126__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_126((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIRSTASS2ROOTCMD___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIRSTASS2ROOTCMD___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIRSTASS2ROOTCMD___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.FIRSTASS2ROOTCMD___IS_APPLICABLE_SOLVE_CSP_CC__COMMAND_ASSIGNMENT_PROGRAM_GRAPH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Command) arguments.get(0), (Assignment) arguments.get(1),
					(Program) arguments.get(2), (Graph) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.FIRSTASS2ROOTCMD___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.FIRSTASS2ROOTCMD___CHECK_DEC_FWD__ASSIGNMENT_PROGRAM:
			return checkDEC_FWD((Assignment) arguments.get(0), (Program) arguments.get(1));
		case RulesPackage.FIRSTASS2ROOTCMD___CHECK_DEC_BWD__COMMAND_GRAPH:
			return checkDEC_BWD((Command) arguments.get(0), (Graph) arguments.get(1));
		case RulesPackage.FIRSTASS2ROOTCMD___GENERATE_MODEL__RULEENTRYCONTAINER_P2G:
			return generateModel((RuleEntryContainer) arguments.get(0), (P2G) arguments.get(1));
		case RulesPackage.FIRSTASS2ROOTCMD___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROGRAM_GRAPH_P2G_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Program) arguments.get(1),
					(Graph) arguments.get(2), (P2G) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.FIRSTASS2ROOTCMD___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_firstass2rootcmd_0_1_initialbindings_blackBBBB(firstass2rootcmd _this,
			Match match, Assignment a, Program p) {
		return new Object[] { _this, match, a, p };
	}

	public static final Object[] pattern_firstass2rootcmd_0_2_SolveCSP_bindingFBBBB(firstass2rootcmd _this, Match match,
			Assignment a, Program p) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, a, p);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, a, p };
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstass2rootcmd_0_2_SolveCSP_bindingAndBlackFBBBB(firstass2rootcmd _this,
			Match match, Assignment a, Program p) {
		Object[] result_pattern_firstass2rootcmd_0_2_SolveCSP_binding = pattern_firstass2rootcmd_0_2_SolveCSP_bindingFBBBB(
				_this, match, a, p);
		if (result_pattern_firstass2rootcmd_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_firstass2rootcmd_0_2_SolveCSP_binding[0];

			Object[] result_pattern_firstass2rootcmd_0_2_SolveCSP_black = pattern_firstass2rootcmd_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_firstass2rootcmd_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, a, p };
			}
		}
		return null;
	}

	public static final boolean pattern_firstass2rootcmd_0_3_CheckCSP_expressionFBB(firstass2rootcmd _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstass2rootcmd_0_4_collectelementstobetranslated_blackBBB(Match match,
			Assignment a, Program p) {
		return new Object[] { match, a, p };
	}

	public static final Object[] pattern_firstass2rootcmd_0_4_collectelementstobetranslated_greenBBBF(Match match,
			Assignment a, Program p) {
		EMoflonEdge p__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(a);
		String p__a____first_name_prime = "first";
		p__a____first.setSrc(p);
		p__a____first.setTrg(a);
		match.getToBeTranslatedEdges().add(p__a____first);
		p__a____first.setName(p__a____first_name_prime);
		return new Object[] { match, a, p, p__a____first };
	}

	public static final Object[] pattern_firstass2rootcmd_0_5_collectcontextelements_blackBBB(Match match, Assignment a,
			Program p) {
		return new Object[] { match, a, p };
	}

	public static final Object[] pattern_firstass2rootcmd_0_5_collectcontextelements_greenBB(Match match, Program p) {
		match.getContextNodes().add(p);
		return new Object[] { match, p };
	}

	public static final void pattern_firstass2rootcmd_0_6_registerobjectstomatch_expressionBBBB(firstass2rootcmd _this,
			Match match, Assignment a, Program p) {
		_this.registerObjectsToMatch_FWD(match, a, p);

	}

	public static final boolean pattern_firstass2rootcmd_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_firstass2rootcmd_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_firstass2rootcmd_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("a");
		EObject _localVariable_1 = isApplicableMatch.getObject("p");
		EObject _localVariable_2 = isApplicableMatch.getObject("g");
		EObject _localVariable_3 = isApplicableMatch.getObject("p2g");
		EObject tmpA = _localVariable_0;
		EObject tmpP = _localVariable_1;
		EObject tmpG = _localVariable_2;
		EObject tmpP2g = _localVariable_3;
		if (tmpA instanceof Assignment) {
			Assignment a = (Assignment) tmpA;
			if (tmpP instanceof Program) {
				Program p = (Program) tmpP;
				if (tmpG instanceof Graph) {
					Graph g = (Graph) tmpG;
					if (tmpP2g instanceof P2G) {
						P2G p2g = (P2G) tmpP2g;
						return new Object[] { a, p, g, p2g, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_1_1_performtransformation_blackBBBBFBB(Assignment a,
			Program p, Graph g, P2G p2g, firstass2rootcmd _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { a, p, g, p2g, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_1_1_performtransformation_bindingAndBlackFFFFFBB(
			firstass2rootcmd _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_firstass2rootcmd_1_1_performtransformation_binding = pattern_firstass2rootcmd_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_firstass2rootcmd_1_1_performtransformation_binding != null) {
			Assignment a = (Assignment) result_pattern_firstass2rootcmd_1_1_performtransformation_binding[0];
			Program p = (Program) result_pattern_firstass2rootcmd_1_1_performtransformation_binding[1];
			Graph g = (Graph) result_pattern_firstass2rootcmd_1_1_performtransformation_binding[2];
			P2G p2g = (P2G) result_pattern_firstass2rootcmd_1_1_performtransformation_binding[3];

			Object[] result_pattern_firstass2rootcmd_1_1_performtransformation_black = pattern_firstass2rootcmd_1_1_performtransformation_blackBBBBFBB(
					a, p, g, p2g, _this, isApplicableMatch);
			if (result_pattern_firstass2rootcmd_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_firstass2rootcmd_1_1_performtransformation_black[4];

				return new Object[] { a, p, g, p2g, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_1_1_performtransformation_greenFBFB(Assignment a, Graph g) {
		Command c = ControlflowFactory.eINSTANCE.createCommand();
		S2N f2r = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		g.setRoot(c);
		f2r.setSource(a);
		f2r.setTarget(c);
		return new Object[] { c, a, f2r, g };
	}

	public static final Object[] pattern_firstass2rootcmd_1_2_collecttranslatedelements_blackBBB(Command c,
			Assignment a, S2N f2r) {
		return new Object[] { c, a, f2r };
	}

	public static final Object[] pattern_firstass2rootcmd_1_2_collecttranslatedelements_greenFBBB(Command c,
			Assignment a, S2N f2r) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(c);
		ruleresult.getTranslatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(f2r);
		return new Object[] { ruleresult, c, a, f2r };
	}

	public static final Object[] pattern_firstass2rootcmd_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject c, EObject a, EObject f2r, EObject p, EObject g, EObject p2g) {
		if (!c.equals(f2r)) {
			if (!c.equals(p)) {
				if (!c.equals(g)) {
					if (!c.equals(p2g)) {
						if (!a.equals(c)) {
							if (!a.equals(f2r)) {
								if (!a.equals(p)) {
									if (!a.equals(g)) {
										if (!a.equals(p2g)) {
											if (!f2r.equals(p)) {
												if (!f2r.equals(g)) {
													if (!f2r.equals(p2g)) {
														if (!p.equals(p2g)) {
															if (!g.equals(p)) {
																if (!g.equals(p2g)) {
																	return new Object[] { ruleresult, c, a, f2r, p, g,
																			p2g };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_firstass2rootcmd_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject c, EObject a, EObject f2r, EObject p, EObject g) {
		EMoflonEdge f2r__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge f2r__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge g__c____root = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "firstass2rootcmd";
		String f2r__a____source_name_prime = "source";
		String f2r__c____target_name_prime = "target";
		String p__a____first_name_prime = "first";
		String g__c____root_name_prime = "root";
		f2r__a____source.setSrc(f2r);
		f2r__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(f2r__a____source);
		f2r__c____target.setSrc(f2r);
		f2r__c____target.setTrg(c);
		ruleresult.getCreatedEdges().add(f2r__c____target);
		p__a____first.setSrc(p);
		p__a____first.setTrg(a);
		ruleresult.getTranslatedEdges().add(p__a____first);
		g__c____root.setSrc(g);
		g__c____root.setTrg(c);
		ruleresult.getCreatedEdges().add(g__c____root);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		f2r__a____source.setName(f2r__a____source_name_prime);
		f2r__c____target.setName(f2r__c____target_name_prime);
		p__a____first.setName(p__a____first_name_prime);
		g__c____root.setName(g__c____root_name_prime);
		return new Object[] { ruleresult, c, a, f2r, p, g, f2r__a____source, f2r__c____target, p__a____first,
				g__c____root };
	}

	public static final void pattern_firstass2rootcmd_1_5_registerobjects_expressionBBBBBBBB(firstass2rootcmd _this,
			PerformRuleResult ruleresult, EObject c, EObject a, EObject f2r, EObject p, EObject g, EObject p2g) {
		_this.registerObjects_FWD(ruleresult, c, a, f2r, p, g, p2g);

	}

	public static final PerformRuleResult pattern_firstass2rootcmd_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_firstass2rootcmd_2_1_preparereturnvalue_bindingFB(firstass2rootcmd _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_2_1_preparereturnvalue_blackFBB(EClass eClass,
			firstass2rootcmd _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_2_1_preparereturnvalue_bindingAndBlackFFB(
			firstass2rootcmd _this) {
		Object[] result_pattern_firstass2rootcmd_2_1_preparereturnvalue_binding = pattern_firstass2rootcmd_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_firstass2rootcmd_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_firstass2rootcmd_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_firstass2rootcmd_2_1_preparereturnvalue_black = pattern_firstass2rootcmd_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_firstass2rootcmd_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_firstass2rootcmd_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "firstass2rootcmd";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_firstass2rootcmd_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("a");
		EObject _localVariable_1 = match.getObject("p");
		EObject tmpA = _localVariable_0;
		EObject tmpP = _localVariable_1;
		if (tmpA instanceof Assignment) {
			Assignment a = (Assignment) tmpA;
			if (tmpP instanceof Program) {
				Program p = (Program) tmpP;
				return new Object[] { a, p, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_firstass2rootcmd_2_2_corematch_blackBBFFB(Assignment a, Program p,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (P2G p2g : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(p, P2G.class, "source")) {
			Graph g = p2g.getTarget();
			if (g != null) {
				_result.add(new Object[] { a, p, g, p2g, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_firstass2rootcmd_2_3_findcontext_blackBBBB(Assignment a, Program p,
			Graph g, P2G p2g) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (a.equals(p.getFirst())) {
			if (p.equals(p2g.getSource())) {
				if (g.equals(p2g.getTarget())) {
					_result.add(new Object[] { a, p, g, p2g });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_firstass2rootcmd_2_3_findcontext_greenBBBBFFFF(Assignment a, Program p,
			Graph g, P2G p2g) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge p__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2g__p____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2g__g____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String p__a____first_name_prime = "first";
		String p2g__p____source_name_prime = "source";
		String p2g__g____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(a);
		isApplicableMatch.getAllContextElements().add(p);
		isApplicableMatch.getAllContextElements().add(g);
		isApplicableMatch.getAllContextElements().add(p2g);
		p__a____first.setSrc(p);
		p__a____first.setTrg(a);
		isApplicableMatch.getAllContextElements().add(p__a____first);
		p2g__p____source.setSrc(p2g);
		p2g__p____source.setTrg(p);
		isApplicableMatch.getAllContextElements().add(p2g__p____source);
		p2g__g____target.setSrc(p2g);
		p2g__g____target.setTrg(g);
		isApplicableMatch.getAllContextElements().add(p2g__g____target);
		p__a____first.setName(p__a____first_name_prime);
		p2g__p____source.setName(p2g__p____source_name_prime);
		p2g__g____target.setName(p2g__g____target_name_prime);
		return new Object[] { a, p, g, p2g, isApplicableMatch, p__a____first, p2g__p____source, p2g__g____target };
	}

	public static final Object[] pattern_firstass2rootcmd_2_4_solveCSP_bindingFBBBBBB(firstass2rootcmd _this,
			IsApplicableMatch isApplicableMatch, Assignment a, Program p, Graph g, P2G p2g) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, a, p, g, p2g);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, a, p, g, p2g };
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstass2rootcmd_2_4_solveCSP_bindingAndBlackFBBBBBB(firstass2rootcmd _this,
			IsApplicableMatch isApplicableMatch, Assignment a, Program p, Graph g, P2G p2g) {
		Object[] result_pattern_firstass2rootcmd_2_4_solveCSP_binding = pattern_firstass2rootcmd_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, a, p, g, p2g);
		if (result_pattern_firstass2rootcmd_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_firstass2rootcmd_2_4_solveCSP_binding[0];

			Object[] result_pattern_firstass2rootcmd_2_4_solveCSP_black = pattern_firstass2rootcmd_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_firstass2rootcmd_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, a, p, g, p2g };
			}
		}
		return null;
	}

	public static final boolean pattern_firstass2rootcmd_2_5_checkCSP_expressionFBB(firstass2rootcmd _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstass2rootcmd_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_firstass2rootcmd_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "firstass2rootcmd";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_firstass2rootcmd_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_firstass2rootcmd_10_1_initialbindings_blackBBBB(firstass2rootcmd _this,
			Match match, Command c, Graph g) {
		return new Object[] { _this, match, c, g };
	}

	public static final Object[] pattern_firstass2rootcmd_10_2_SolveCSP_bindingFBBBB(firstass2rootcmd _this,
			Match match, Command c, Graph g) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, c, g);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, c, g };
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstass2rootcmd_10_2_SolveCSP_bindingAndBlackFBBBB(firstass2rootcmd _this,
			Match match, Command c, Graph g) {
		Object[] result_pattern_firstass2rootcmd_10_2_SolveCSP_binding = pattern_firstass2rootcmd_10_2_SolveCSP_bindingFBBBB(
				_this, match, c, g);
		if (result_pattern_firstass2rootcmd_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_firstass2rootcmd_10_2_SolveCSP_binding[0];

			Object[] result_pattern_firstass2rootcmd_10_2_SolveCSP_black = pattern_firstass2rootcmd_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_firstass2rootcmd_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, c, g };
			}
		}
		return null;
	}

	public static final boolean pattern_firstass2rootcmd_10_3_CheckCSP_expressionFBB(firstass2rootcmd _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstass2rootcmd_10_4_collectelementstobetranslated_blackBBB(Match match,
			Command c, Graph g) {
		return new Object[] { match, c, g };
	}

	public static final Object[] pattern_firstass2rootcmd_10_4_collectelementstobetranslated_greenBBBF(Match match,
			Command c, Graph g) {
		EMoflonEdge g__c____root = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(c);
		String g__c____root_name_prime = "root";
		g__c____root.setSrc(g);
		g__c____root.setTrg(c);
		match.getToBeTranslatedEdges().add(g__c____root);
		g__c____root.setName(g__c____root_name_prime);
		return new Object[] { match, c, g, g__c____root };
	}

	public static final Object[] pattern_firstass2rootcmd_10_5_collectcontextelements_blackBBB(Match match, Command c,
			Graph g) {
		return new Object[] { match, c, g };
	}

	public static final Object[] pattern_firstass2rootcmd_10_5_collectcontextelements_greenBB(Match match, Graph g) {
		match.getContextNodes().add(g);
		return new Object[] { match, g };
	}

	public static final void pattern_firstass2rootcmd_10_6_registerobjectstomatch_expressionBBBB(firstass2rootcmd _this,
			Match match, Command c, Graph g) {
		_this.registerObjectsToMatch_BWD(match, c, g);

	}

	public static final boolean pattern_firstass2rootcmd_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_firstass2rootcmd_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_firstass2rootcmd_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("c");
		EObject _localVariable_1 = isApplicableMatch.getObject("p");
		EObject _localVariable_2 = isApplicableMatch.getObject("g");
		EObject _localVariable_3 = isApplicableMatch.getObject("p2g");
		EObject tmpC = _localVariable_0;
		EObject tmpP = _localVariable_1;
		EObject tmpG = _localVariable_2;
		EObject tmpP2g = _localVariable_3;
		if (tmpC instanceof Command) {
			Command c = (Command) tmpC;
			if (tmpP instanceof Program) {
				Program p = (Program) tmpP;
				if (tmpG instanceof Graph) {
					Graph g = (Graph) tmpG;
					if (tmpP2g instanceof P2G) {
						P2G p2g = (P2G) tmpP2g;
						return new Object[] { c, p, g, p2g, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_11_1_performtransformation_blackBBBBFBB(Command c, Program p,
			Graph g, P2G p2g, firstass2rootcmd _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { c, p, g, p2g, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_11_1_performtransformation_bindingAndBlackFFFFFBB(
			firstass2rootcmd _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_firstass2rootcmd_11_1_performtransformation_binding = pattern_firstass2rootcmd_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_firstass2rootcmd_11_1_performtransformation_binding != null) {
			Command c = (Command) result_pattern_firstass2rootcmd_11_1_performtransformation_binding[0];
			Program p = (Program) result_pattern_firstass2rootcmd_11_1_performtransformation_binding[1];
			Graph g = (Graph) result_pattern_firstass2rootcmd_11_1_performtransformation_binding[2];
			P2G p2g = (P2G) result_pattern_firstass2rootcmd_11_1_performtransformation_binding[3];

			Object[] result_pattern_firstass2rootcmd_11_1_performtransformation_black = pattern_firstass2rootcmd_11_1_performtransformation_blackBBBBFBB(
					c, p, g, p2g, _this, isApplicableMatch);
			if (result_pattern_firstass2rootcmd_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_firstass2rootcmd_11_1_performtransformation_black[4];

				return new Object[] { c, p, g, p2g, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_11_1_performtransformation_greenBFFB(Command c, Program p) {
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N f2r = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		p.setFirst(a);
		f2r.setSource(a);
		f2r.setTarget(c);
		return new Object[] { c, a, f2r, p };
	}

	public static final Object[] pattern_firstass2rootcmd_11_2_collecttranslatedelements_blackBBB(Command c,
			Assignment a, S2N f2r) {
		return new Object[] { c, a, f2r };
	}

	public static final Object[] pattern_firstass2rootcmd_11_2_collecttranslatedelements_greenFBBB(Command c,
			Assignment a, S2N f2r) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(c);
		ruleresult.getCreatedElements().add(a);
		ruleresult.getCreatedLinkElements().add(f2r);
		return new Object[] { ruleresult, c, a, f2r };
	}

	public static final Object[] pattern_firstass2rootcmd_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject c, EObject a, EObject f2r, EObject p, EObject g, EObject p2g) {
		if (!c.equals(f2r)) {
			if (!c.equals(p)) {
				if (!c.equals(g)) {
					if (!c.equals(p2g)) {
						if (!a.equals(c)) {
							if (!a.equals(f2r)) {
								if (!a.equals(p)) {
									if (!a.equals(g)) {
										if (!a.equals(p2g)) {
											if (!f2r.equals(p)) {
												if (!f2r.equals(g)) {
													if (!f2r.equals(p2g)) {
														if (!p.equals(p2g)) {
															if (!g.equals(p)) {
																if (!g.equals(p2g)) {
																	return new Object[] { ruleresult, c, a, f2r, p, g,
																			p2g };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_firstass2rootcmd_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject c, EObject a, EObject f2r, EObject p, EObject g) {
		EMoflonEdge f2r__a____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge f2r__c____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p__a____first = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge g__c____root = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "firstass2rootcmd";
		String f2r__a____source_name_prime = "source";
		String f2r__c____target_name_prime = "target";
		String p__a____first_name_prime = "first";
		String g__c____root_name_prime = "root";
		f2r__a____source.setSrc(f2r);
		f2r__a____source.setTrg(a);
		ruleresult.getCreatedEdges().add(f2r__a____source);
		f2r__c____target.setSrc(f2r);
		f2r__c____target.setTrg(c);
		ruleresult.getCreatedEdges().add(f2r__c____target);
		p__a____first.setSrc(p);
		p__a____first.setTrg(a);
		ruleresult.getCreatedEdges().add(p__a____first);
		g__c____root.setSrc(g);
		g__c____root.setTrg(c);
		ruleresult.getTranslatedEdges().add(g__c____root);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		f2r__a____source.setName(f2r__a____source_name_prime);
		f2r__c____target.setName(f2r__c____target_name_prime);
		p__a____first.setName(p__a____first_name_prime);
		g__c____root.setName(g__c____root_name_prime);
		return new Object[] { ruleresult, c, a, f2r, p, g, f2r__a____source, f2r__c____target, p__a____first,
				g__c____root };
	}

	public static final void pattern_firstass2rootcmd_11_5_registerobjects_expressionBBBBBBBB(firstass2rootcmd _this,
			PerformRuleResult ruleresult, EObject c, EObject a, EObject f2r, EObject p, EObject g, EObject p2g) {
		_this.registerObjects_BWD(ruleresult, c, a, f2r, p, g, p2g);

	}

	public static final PerformRuleResult pattern_firstass2rootcmd_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_firstass2rootcmd_12_1_preparereturnvalue_bindingFB(firstass2rootcmd _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_12_1_preparereturnvalue_blackFBB(EClass eClass,
			firstass2rootcmd _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_12_1_preparereturnvalue_bindingAndBlackFFB(
			firstass2rootcmd _this) {
		Object[] result_pattern_firstass2rootcmd_12_1_preparereturnvalue_binding = pattern_firstass2rootcmd_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_firstass2rootcmd_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_firstass2rootcmd_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_firstass2rootcmd_12_1_preparereturnvalue_black = pattern_firstass2rootcmd_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_firstass2rootcmd_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_firstass2rootcmd_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "firstass2rootcmd";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_firstass2rootcmd_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("c");
		EObject _localVariable_1 = match.getObject("g");
		EObject tmpC = _localVariable_0;
		EObject tmpG = _localVariable_1;
		if (tmpC instanceof Command) {
			Command c = (Command) tmpC;
			if (tmpG instanceof Graph) {
				Graph g = (Graph) tmpG;
				return new Object[] { c, g, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_firstass2rootcmd_12_2_corematch_blackBFBFB(Command c, Graph g,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (P2G p2g : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(g, P2G.class, "target")) {
			Program p = p2g.getSource();
			if (p != null) {
				_result.add(new Object[] { c, p, g, p2g, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_firstass2rootcmd_12_3_findcontext_blackBBBB(Command c, Program p,
			Graph g, P2G p2g) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (p.equals(p2g.getSource())) {
			if (g.equals(p2g.getTarget())) {
				if (c.equals(g.getRoot())) {
					_result.add(new Object[] { c, p, g, p2g });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_firstass2rootcmd_12_3_findcontext_greenBBBBFFFF(Command c, Program p, Graph g,
			P2G p2g) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge p2g__p____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2g__g____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge g__c____root = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String p2g__p____source_name_prime = "source";
		String p2g__g____target_name_prime = "target";
		String g__c____root_name_prime = "root";
		isApplicableMatch.getAllContextElements().add(c);
		isApplicableMatch.getAllContextElements().add(p);
		isApplicableMatch.getAllContextElements().add(g);
		isApplicableMatch.getAllContextElements().add(p2g);
		p2g__p____source.setSrc(p2g);
		p2g__p____source.setTrg(p);
		isApplicableMatch.getAllContextElements().add(p2g__p____source);
		p2g__g____target.setSrc(p2g);
		p2g__g____target.setTrg(g);
		isApplicableMatch.getAllContextElements().add(p2g__g____target);
		g__c____root.setSrc(g);
		g__c____root.setTrg(c);
		isApplicableMatch.getAllContextElements().add(g__c____root);
		p2g__p____source.setName(p2g__p____source_name_prime);
		p2g__g____target.setName(p2g__g____target_name_prime);
		g__c____root.setName(g__c____root_name_prime);
		return new Object[] { c, p, g, p2g, isApplicableMatch, p2g__p____source, p2g__g____target, g__c____root };
	}

	public static final Object[] pattern_firstass2rootcmd_12_4_solveCSP_bindingFBBBBBB(firstass2rootcmd _this,
			IsApplicableMatch isApplicableMatch, Command c, Program p, Graph g, P2G p2g) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, c, p, g, p2g);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, c, p, g, p2g };
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstass2rootcmd_12_4_solveCSP_bindingAndBlackFBBBBBB(firstass2rootcmd _this,
			IsApplicableMatch isApplicableMatch, Command c, Program p, Graph g, P2G p2g) {
		Object[] result_pattern_firstass2rootcmd_12_4_solveCSP_binding = pattern_firstass2rootcmd_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, c, p, g, p2g);
		if (result_pattern_firstass2rootcmd_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_firstass2rootcmd_12_4_solveCSP_binding[0];

			Object[] result_pattern_firstass2rootcmd_12_4_solveCSP_black = pattern_firstass2rootcmd_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_firstass2rootcmd_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, c, p, g, p2g };
			}
		}
		return null;
	}

	public static final boolean pattern_firstass2rootcmd_12_5_checkCSP_expressionFBB(firstass2rootcmd _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstass2rootcmd_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_firstass2rootcmd_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "firstass2rootcmd";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_firstass2rootcmd_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_firstass2rootcmd_20_1_preparereturnvalue_bindingFB(firstass2rootcmd _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			firstass2rootcmd _this) {
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

	public static final Object[] pattern_firstass2rootcmd_20_1_preparereturnvalue_bindingAndBlackFFBF(
			firstass2rootcmd _this) {
		Object[] result_pattern_firstass2rootcmd_20_1_preparereturnvalue_binding = pattern_firstass2rootcmd_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_firstass2rootcmd_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_firstass2rootcmd_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_firstass2rootcmd_20_1_preparereturnvalue_black = pattern_firstass2rootcmd_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_firstass2rootcmd_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_firstass2rootcmd_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_firstass2rootcmd_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_firstass2rootcmd_20_2_testcorematchandDECs_black_nac_0BB(Command c, Graph g) {
		for (Graph __DEC_c_root_459530 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Graph.class, "root")) {
			if (!g.equals(__DEC_c_root_459530)) {
				return new Object[] { c, g };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_20_2_testcorematchandDECs_black_nac_1B(Command c) {
		for (Branch __DEC_c_positive_385412 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Branch.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_20_2_testcorematchandDECs_black_nac_2B(Command c) {
		for (Branch __DEC_c_negative_71922 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Branch.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_firstass2rootcmd_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_root) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpG = _edge_root.getSrc();
		if (tmpG instanceof Graph) {
			Graph g = (Graph) tmpG;
			EObject tmpC = _edge_root.getTrg();
			if (tmpC instanceof Command) {
				Command c = (Command) tmpC;
				if (c.equals(g.getRoot())) {
					if (pattern_firstass2rootcmd_20_2_testcorematchandDECs_black_nac_0BB(c, g) == null) {
						if (pattern_firstass2rootcmd_20_2_testcorematchandDECs_black_nac_1B(c) == null) {
							if (pattern_firstass2rootcmd_20_2_testcorematchandDECs_black_nac_2B(c) == null) {
								_result.add(new Object[] { c, g, _edge_root });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_firstass2rootcmd_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_firstass2rootcmd_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			firstass2rootcmd _this, Match match, Command c, Graph g) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, c, g);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_firstass2rootcmd_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			firstass2rootcmd _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstass2rootcmd_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_firstass2rootcmd_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_firstass2rootcmd_21_1_preparereturnvalue_bindingFB(firstass2rootcmd _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			firstass2rootcmd _this) {
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

	public static final Object[] pattern_firstass2rootcmd_21_1_preparereturnvalue_bindingAndBlackFFBF(
			firstass2rootcmd _this) {
		Object[] result_pattern_firstass2rootcmd_21_1_preparereturnvalue_binding = pattern_firstass2rootcmd_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_firstass2rootcmd_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_firstass2rootcmd_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_firstass2rootcmd_21_1_preparereturnvalue_black = pattern_firstass2rootcmd_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_firstass2rootcmd_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_firstass2rootcmd_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_firstass2rootcmd_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_firstass2rootcmd_21_2_testcorematchandDECs_black_nac_0B(Assignment a) {
		for (Decision __DEC_a_positive_706914 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_21_2_testcorematchandDECs_black_nac_1B(Assignment a) {
		for (Decision __DEC_a_negative_738124 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_21_2_testcorematchandDECs_black_nac_2B(Assignment a) {
		for (While __DEC_a_first_735382 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_21_2_testcorematchandDECs_black_nac_3B(Assignment a) {
		for (While __DEC_a_last_897596 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_firstass2rootcmd_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_first) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpP = _edge_first.getSrc();
		if (tmpP instanceof Program) {
			Program p = (Program) tmpP;
			EObject tmpA = _edge_first.getTrg();
			if (tmpA instanceof Assignment) {
				Assignment a = (Assignment) tmpA;
				if (a.equals(p.getFirst())) {
					if (pattern_firstass2rootcmd_21_2_testcorematchandDECs_black_nac_0B(a) == null) {
						if (pattern_firstass2rootcmd_21_2_testcorematchandDECs_black_nac_1B(a) == null) {
							if (pattern_firstass2rootcmd_21_2_testcorematchandDECs_black_nac_2B(a) == null) {
								if (pattern_firstass2rootcmd_21_2_testcorematchandDECs_black_nac_3B(a) == null) {
									_result.add(new Object[] { a, p, _edge_first });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_firstass2rootcmd_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_firstass2rootcmd_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			firstass2rootcmd _this, Match match, Assignment a, Program p) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, a, p);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_firstass2rootcmd_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			firstass2rootcmd _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstass2rootcmd_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_firstass2rootcmd_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_firstass2rootcmd_24_1_prepare_blackB(firstass2rootcmd _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_firstass2rootcmd_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_firstass2rootcmd_24_2_matchsrctrgcontext_bindingFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("c");
		EObject _localVariable_1 = sourceMatch.getObject("a");
		EObject _localVariable_2 = sourceMatch.getObject("p");
		EObject _localVariable_3 = targetMatch.getObject("g");
		EObject tmpC = _localVariable_0;
		EObject tmpA = _localVariable_1;
		EObject tmpP = _localVariable_2;
		EObject tmpG = _localVariable_3;
		if (tmpC instanceof Command) {
			Command c = (Command) tmpC;
			if (tmpA instanceof Assignment) {
				Assignment a = (Assignment) tmpA;
				if (tmpP instanceof Program) {
					Program p = (Program) tmpP;
					if (tmpG instanceof Graph) {
						Graph g = (Graph) tmpG;
						return new Object[] { c, a, p, g, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_24_2_matchsrctrgcontext_blackBBBBBB(Command c, Assignment a,
			Program p, Graph g, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { c, a, p, g, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_firstass2rootcmd_24_2_matchsrctrgcontext_binding = pattern_firstass2rootcmd_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_firstass2rootcmd_24_2_matchsrctrgcontext_binding != null) {
			Command c = (Command) result_pattern_firstass2rootcmd_24_2_matchsrctrgcontext_binding[0];
			Assignment a = (Assignment) result_pattern_firstass2rootcmd_24_2_matchsrctrgcontext_binding[1];
			Program p = (Program) result_pattern_firstass2rootcmd_24_2_matchsrctrgcontext_binding[2];
			Graph g = (Graph) result_pattern_firstass2rootcmd_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_firstass2rootcmd_24_2_matchsrctrgcontext_black = pattern_firstass2rootcmd_24_2_matchsrctrgcontext_blackBBBBBB(
					c, a, p, g, sourceMatch, targetMatch);
			if (result_pattern_firstass2rootcmd_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { c, a, p, g, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_24_3_solvecsp_bindingFBBBBBBB(firstass2rootcmd _this,
			Command c, Assignment a, Program p, Graph g, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(c, a, p, g, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, c, a, p, g, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstass2rootcmd_24_3_solvecsp_bindingAndBlackFBBBBBBB(firstass2rootcmd _this,
			Command c, Assignment a, Program p, Graph g, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_firstass2rootcmd_24_3_solvecsp_binding = pattern_firstass2rootcmd_24_3_solvecsp_bindingFBBBBBBB(
				_this, c, a, p, g, sourceMatch, targetMatch);
		if (result_pattern_firstass2rootcmd_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_firstass2rootcmd_24_3_solvecsp_binding[0];

			Object[] result_pattern_firstass2rootcmd_24_3_solvecsp_black = pattern_firstass2rootcmd_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_firstass2rootcmd_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, c, a, p, g, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_firstass2rootcmd_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_firstass2rootcmd_24_5_matchcorrcontext_blackBBFBB(Program p, Graph g,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (P2G p2g : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(p, P2G.class, "source")) {
				if (g.equals(p2g.getTarget())) {
					_result.add(new Object[] { p, g, p2g, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_firstass2rootcmd_24_5_matchcorrcontext_greenBBBF(P2G p2g, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "firstass2rootcmd";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(p2g);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { p2g, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_firstass2rootcmd_24_6_createcorrespondence_blackBBBBB(Command c, Assignment a,
			Program p, Graph g, CCMatch ccMatch) {
		return new Object[] { c, a, p, g, ccMatch };
	}

	public static final Object[] pattern_firstass2rootcmd_24_6_createcorrespondence_greenBBFB(Command c, Assignment a,
			CCMatch ccMatch) {
		S2N f2r = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		f2r.setSource(a);
		f2r.setTarget(c);
		ccMatch.getCreateCorr().add(f2r);
		return new Object[] { c, a, f2r, ccMatch };
	}

	public static final Object[] pattern_firstass2rootcmd_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_firstass2rootcmd_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "firstass2rootcmd";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_firstass2rootcmd_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_firstass2rootcmd_27_1_matchtggpattern_black_nac_0B(Assignment a) {
		for (Decision __DEC_a_positive_861582 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "positive")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_27_1_matchtggpattern_black_nac_1B(Assignment a) {
		for (Decision __DEC_a_negative_230138 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				Decision.class, "negative")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_27_1_matchtggpattern_black_nac_2B(Assignment a) {
		for (While __DEC_a_first_822682 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "first")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_27_1_matchtggpattern_black_nac_3B(Assignment a) {
		for (While __DEC_a_last_809201 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(a,
				While.class, "last")) {
			return new Object[] { a };
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_27_1_matchtggpattern_blackBB(Assignment a, Program p) {
		if (a.equals(p.getFirst())) {
			if (pattern_firstass2rootcmd_27_1_matchtggpattern_black_nac_0B(a) == null) {
				if (pattern_firstass2rootcmd_27_1_matchtggpattern_black_nac_1B(a) == null) {
					if (pattern_firstass2rootcmd_27_1_matchtggpattern_black_nac_2B(a) == null) {
						if (pattern_firstass2rootcmd_27_1_matchtggpattern_black_nac_3B(a) == null) {
							return new Object[] { a, p };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_firstass2rootcmd_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_firstass2rootcmd_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_firstass2rootcmd_28_1_matchtggpattern_black_nac_0BB(Command c, Graph g) {
		for (Graph __DEC_c_root_14176 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Graph.class, "root")) {
			if (!g.equals(__DEC_c_root_14176)) {
				return new Object[] { c, g };
			}
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_28_1_matchtggpattern_black_nac_1B(Command c) {
		for (Branch __DEC_c_positive_326825 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Branch.class, "positive")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_28_1_matchtggpattern_black_nac_2B(Command c) {
		for (Branch __DEC_c_negative_681186 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(c,
				Branch.class, "negative")) {
			return new Object[] { c };
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_28_1_matchtggpattern_blackBB(Command c, Graph g) {
		if (c.equals(g.getRoot())) {
			if (pattern_firstass2rootcmd_28_1_matchtggpattern_black_nac_0BB(c, g) == null) {
				if (pattern_firstass2rootcmd_28_1_matchtggpattern_black_nac_1B(c) == null) {
					if (pattern_firstass2rootcmd_28_1_matchtggpattern_black_nac_2B(c) == null) {
						return new Object[] { c, g };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_firstass2rootcmd_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_firstass2rootcmd_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_firstass2rootcmd_29_1_createresult_blackB(firstass2rootcmd _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_firstass2rootcmd_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_firstass2rootcmd_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Program p) {
		if (ruleResult.getSourceObjects().contains(p)) {
			return new Object[] { ruleResult, p };
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, P2G p2g) {
		if (ruleResult.getCorrObjects().contains(p2g)) {
			return new Object[] { ruleResult, p2g };
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Graph g) {
		if (ruleResult.getTargetObjects().contains(g)) {
			return new Object[] { ruleResult, g };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_firstass2rootcmd_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList p2gList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpP2g : p2gList.getEntryObjects()) {
				if (tmpP2g instanceof P2G) {
					P2G p2g = (P2G) tmpP2g;
					Program p = p2g.getSource();
					if (p != null) {
						Graph g = p2g.getTarget();
						if (g != null) {
							if (pattern_firstass2rootcmd_29_2_isapplicablecore_black_nac_1BB(ruleResult, p2g) == null) {
								if (pattern_firstass2rootcmd_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										p) == null) {
									if (pattern_firstass2rootcmd_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											g) == null) {
										_result.add(
												new Object[] { p2gList, p, p2g, g, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_firstass2rootcmd_29_3_solveCSP_bindingFBBBBBB(firstass2rootcmd _this,
			IsApplicableMatch isApplicableMatch, Program p, Graph g, P2G p2g, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, p, g, p2g, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, p, g, p2g, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_firstass2rootcmd_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_firstass2rootcmd_29_3_solveCSP_bindingAndBlackFBBBBBB(firstass2rootcmd _this,
			IsApplicableMatch isApplicableMatch, Program p, Graph g, P2G p2g, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_firstass2rootcmd_29_3_solveCSP_binding = pattern_firstass2rootcmd_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, p, g, p2g, ruleResult);
		if (result_pattern_firstass2rootcmd_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_firstass2rootcmd_29_3_solveCSP_binding[0];

			Object[] result_pattern_firstass2rootcmd_29_3_solveCSP_black = pattern_firstass2rootcmd_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_firstass2rootcmd_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, p, g, p2g, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_firstass2rootcmd_29_4_checkCSP_expressionFBB(firstass2rootcmd _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_firstass2rootcmd_29_5_checknacs_blackBBB(Program p, Graph g, P2G p2g) {
		return new Object[] { p, g, p2g };
	}

	public static final Object[] pattern_firstass2rootcmd_29_6_perform_blackBBBB(Program p, Graph g, P2G p2g,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { p, g, p2g, ruleResult };
	}

	public static final Object[] pattern_firstass2rootcmd_29_6_perform_greenFFFBBB(Program p, Graph g,
			ModelgeneratorRuleResult ruleResult) {
		Command c = ControlflowFactory.eINSTANCE.createCommand();
		Assignment a = SourcecodeFactory.eINSTANCE.createAssignment();
		S2N f2r = Sourcecode2controlflowFactory.eINSTANCE.createS2N();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		g.setRoot(c);
		ruleResult.getTargetObjects().add(c);
		p.setFirst(a);
		ruleResult.getSourceObjects().add(a);
		f2r.setSource(a);
		f2r.setTarget(c);
		ruleResult.getCorrObjects().add(f2r);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { c, a, f2r, p, g, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_firstass2rootcmd_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //firstass2rootcmdImpl
