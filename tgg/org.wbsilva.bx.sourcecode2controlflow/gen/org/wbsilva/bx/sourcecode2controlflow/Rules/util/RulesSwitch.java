/**
 */
package org.wbsilva.bx.sourcecode2controlflow.Rules.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.moflon.tgg.runtime.AbstractRule;

import org.wbsilva.bx.sourcecode2controlflow.Rules.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.wbsilva.bx.sourcecode2controlflow.Rules.RulesPackage
 * @generated
 */
public class RulesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesSwitch() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case RulesPackage.WHILEULA2BRANCHUBC: {
			whileula2branchubc whileula2branchubc = (whileula2branchubc) theEObject;
			T result = casewhileula2branchubc(whileula2branchubc);
			if (result == null)
				result = caseAbstractRule(whileula2branchubc);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.WHILE2BRANCH: {
			while2branch while2branch = (while2branch) theEObject;
			T result = casewhile2branch(while2branch);
			if (result == null)
				result = caseAbstractRule(while2branch);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.WHILED2BRANCHB: {
			whiled2branchb whiled2branchb = (whiled2branchb) theEObject;
			T result = casewhiled2branchb(whiled2branchb);
			if (result == null)
				result = caseAbstractRule(whiled2branchb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.WHILEDUL2BRANCHBUB: {
			whiledul2branchbub whiledul2branchbub = (whiledul2branchbub) theEObject;
			T result = casewhiledul2branchbub(whiledul2branchbub);
			if (result == null)
				result = caseAbstractRule(whiledul2branchbub);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.WHILEAUL2BRANCHCUB: {
			whileaul2branchcub whileaul2branchcub = (whileaul2branchcub) theEObject;
			T result = casewhileaul2branchcub(whileaul2branchcub);
			if (result == null)
				result = caseAbstractRule(whileaul2branchcub);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.DECASSASS2BRANCHCMDCMD: {
			decassass2branchcmdcmd decassass2branchcmdcmd = (decassass2branchcmdcmd) theEObject;
			T result = casedecassass2branchcmdcmd(decassass2branchcmdcmd);
			if (result == null)
				result = caseAbstractRule(decassass2branchcmdcmd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.DECLA2BRANCHBC: {
			decla2branchbc decla2branchbc = (decla2branchbc) theEObject;
			T result = casedecla2branchbc(decla2branchbc);
			if (result == null)
				result = caseAbstractRule(decla2branchbc);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH: {
			firstdecision2firstbranch firstdecision2firstbranch = (firstdecision2firstbranch) theEObject;
			T result = casefirstdecision2firstbranch(firstdecision2firstbranch);
			if (result == null)
				result = caseAbstractRule(firstdecision2firstbranch);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD: {
			decdecass2branchbranchcmd decdecass2branchbranchcmd = (decdecass2branchbranchcmd) theEObject;
			T result = casedecdecass2branchbranchcmd(decdecass2branchbranchcmd);
			if (result == null)
				result = caseAbstractRule(decdecass2branchbranchcmd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIRSTWHILE2ROOTBRANCH: {
			firstwhile2rootbranch firstwhile2rootbranch = (firstwhile2rootbranch) theEObject;
			T result = casefirstwhile2rootbranch(firstwhile2rootbranch);
			if (result == null)
				result = caseAbstractRule(firstwhile2rootbranch);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.DECAL2BRANCHCB: {
			decal2branchcb decal2branchcb = (decal2branchcb) theEObject;
			T result = casedecal2branchcb(decal2branchcb);
			if (result == null)
				result = caseAbstractRule(decal2branchcb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.WHILEL2BRANCHB: {
			whilel2branchb whilel2branchb = (whilel2branchb) theEObject;
			T result = casewhilel2branchb(whilel2branchb);
			if (result == null)
				result = caseAbstractRule(whilel2branchb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.DECULL2BRANCHUBB: {
			decull2branchubb decull2branchubb = (decull2branchubb) theEObject;
			T result = casedecull2branchubb(decull2branchubb);
			if (result == null)
				result = caseAbstractRule(decull2branchubb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.WHILEAA2BRANCHCC: {
			whileaa2branchcc whileaa2branchcc = (whileaa2branchcc) theEObject;
			T result = casewhileaa2branchcc(whileaa2branchcc);
			if (result == null)
				result = caseAbstractRule(whileaa2branchcc);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.UWHILE2UBRANCH: {
			uwhile2ubranch uwhile2ubranch = (uwhile2ubranch) theEObject;
			T result = caseuwhile2ubranch(uwhile2ubranch);
			if (result == null)
				result = caseAbstractRule(uwhile2ubranch);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.WHILELL2BRANCHBB: {
			whilell2branchbb whilell2branchbb = (whilell2branchbb) theEObject;
			T result = casewhilell2branchbb(whilell2branchbb);
			if (result == null)
				result = caseAbstractRule(whilell2branchbb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH: {
			decdecdec2branchbranchbranch decdecdec2branchbranchbranch = (decdecdec2branchbranchbranch) theEObject;
			T result = casedecdecdec2branchbranchbranch(decdecdec2branchbranchbranch);
			if (result == null)
				result = caseAbstractRule(decdecdec2branchbranchbranch);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.WHILEDD2BRANCHBB: {
			whiledd2branchbb whiledd2branchbb = (whiledd2branchbb) theEObject;
			T result = casewhiledd2branchbb(whiledd2branchbb);
			if (result == null)
				result = caseAbstractRule(whiledd2branchbb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.DECULUL2BRANCHUBUB: {
			deculul2branchubub deculul2branchubub = (deculul2branchubub) theEObject;
			T result = casedeculul2branchubub(deculul2branchubub);
			if (result == null)
				result = caseAbstractRule(deculul2branchubub);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH: {
			decassdec2branchcmdbranch decassdec2branchcmdbranch = (decassdec2branchcmdbranch) theEObject;
			T result = casedecassdec2branchcmdbranch(decassdec2branchcmdbranch);
			if (result == null)
				result = caseAbstractRule(decassdec2branchcmdbranch);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.WHILEAD2BRANCHCB: {
			whilead2branchcb whilead2branchcb = (whilead2branchcb) theEObject;
			T result = casewhilead2branchcb(whilead2branchcb);
			if (result == null)
				result = caseAbstractRule(whilead2branchcb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.WHILELD2BRANCHBB: {
			whileld2branchbb whileld2branchbb = (whileld2branchbb) theEObject;
			T result = casewhileld2branchbb(whileld2branchbb);
			if (result == null)
				result = caseAbstractRule(whileld2branchbb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.DECLD2BRANCHBB: {
			decld2branchbb decld2branchbb = (decld2branchbb) theEObject;
			T result = casedecld2branchbb(decld2branchbb);
			if (result == null)
				result = caseAbstractRule(decld2branchbb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.DECDUL2BRANCHBUB: {
			decdul2branchbub decdul2branchbub = (decdul2branchbub) theEObject;
			T result = casedecdul2branchbub(decdul2branchbub);
			if (result == null)
				result = caseAbstractRule(decdul2branchbub);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.WHILEA2BRANCHC: {
			whilea2branchc whilea2branchc = (whilea2branchc) theEObject;
			T result = casewhilea2branchc(whilea2branchc);
			if (result == null)
				result = caseAbstractRule(whilea2branchc);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.DECISION2BRANCH: {
			decision2branch decision2branch = (decision2branch) theEObject;
			T result = casedecision2branch(decision2branch);
			if (result == null)
				result = caseAbstractRule(decision2branch);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.DECULA2BRANCHUBC: {
			decula2branchubc decula2branchubc = (decula2branchubc) theEObject;
			T result = casedecula2branchubc(decula2branchubc);
			if (result == null)
				result = caseAbstractRule(decula2branchubc);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.DECAUL2BRANCHCUB: {
			decaul2branchcub decaul2branchcub = (decaul2branchcub) theEObject;
			T result = casedecaul2branchcub(decaul2branchcub);
			if (result == null)
				result = caseAbstractRule(decaul2branchcub);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.DECULD2BRANCHUBB: {
			deculd2branchubb deculd2branchubb = (deculd2branchubb) theEObject;
			T result = casedeculd2branchubb(deculd2branchubb);
			if (result == null)
				result = caseAbstractRule(deculd2branchubb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.ASSIGNMENT2COMMAND: {
			assignment2command assignment2command = (assignment2command) theEObject;
			T result = caseassignment2command(assignment2command);
			if (result == null)
				result = caseAbstractRule(assignment2command);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIRSTASS2ROOTCMD: {
			firstass2rootcmd firstass2rootcmd = (firstass2rootcmd) theEObject;
			T result = casefirstass2rootcmd(firstass2rootcmd);
			if (result == null)
				result = caseAbstractRule(firstass2rootcmd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.WHILEUL2BRANCHUB: {
			whileul2branchub whileul2branchub = (whileul2branchub) theEObject;
			T result = casewhileul2branchub(whileul2branchub);
			if (result == null)
				result = caseAbstractRule(whileul2branchub);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.DECLUL2BRANCHBUB: {
			declul2branchbub declul2branchbub = (declul2branchbub) theEObject;
			T result = casedeclul2branchbub(declul2branchbub);
			if (result == null)
				result = caseAbstractRule(declul2branchbub);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.WHILEULL2BRANCHUBB: {
			whileull2branchubb whileull2branchubb = (whileull2branchubb) theEObject;
			T result = casewhileull2branchubb(whileull2branchubb);
			if (result == null)
				result = caseAbstractRule(whileull2branchubb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.WHILEULD2BRANCHUBB: {
			whileuld2branchubb whileuld2branchubb = (whileuld2branchubb) theEObject;
			T result = casewhileuld2branchubb(whileuld2branchubb);
			if (result == null)
				result = caseAbstractRule(whileuld2branchubb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.WHILELUL2BRANCHBUB: {
			whilelul2branchbub whilelul2branchbub = (whilelul2branchbub) theEObject;
			T result = casewhilelul2branchbub(whilelul2branchbub);
			if (result == null)
				result = caseAbstractRule(whilelul2branchbub);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.NEXT2NEXT: {
			next2next next2next = (next2next) theEObject;
			T result = casenext2next(next2next);
			if (result == null)
				result = caseAbstractRule(next2next);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.WHILEAL2BRANCHCB: {
			whileal2branchcb whileal2branchcb = (whileal2branchcb) theEObject;
			T result = casewhileal2branchcb(whileal2branchcb);
			if (result == null)
				result = caseAbstractRule(whileal2branchcb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH: {
			firstuwhile2rootubranch firstuwhile2rootubranch = (firstuwhile2rootubranch) theEObject;
			T result = casefirstuwhile2rootubranch(firstuwhile2rootubranch);
			if (result == null)
				result = caseAbstractRule(firstuwhile2rootubranch);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.DECLL2BRANCHBB: {
			decll2branchbb decll2branchbb = (decll2branchbb) theEObject;
			T result = casedecll2branchbb(decll2branchbb);
			if (result == null)
				result = caseAbstractRule(decll2branchbb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.WHILELA2BRANCHBC: {
			whilela2branchbc whilela2branchbc = (whilela2branchbc) theEObject;
			T result = casewhilela2branchbc(whilela2branchbc);
			if (result == null)
				result = caseAbstractRule(whilela2branchbc);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.WHILEDL2BRANCHBB: {
			whiledl2branchbb whiledl2branchbb = (whiledl2branchbb) theEObject;
			T result = casewhiledl2branchbb(whiledl2branchbb);
			if (result == null)
				result = caseAbstractRule(whiledl2branchbb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.DECDL2BRANCHBB: {
			decdl2branchbb decdl2branchbb = (decdl2branchbb) theEObject;
			T result = casedecdl2branchbb(decdl2branchbb);
			if (result == null)
				result = caseAbstractRule(decdl2branchbb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PROGRAM2GRAPH: {
			program2graph program2graph = (program2graph) theEObject;
			T result = caseprogram2graph(program2graph);
			if (result == null)
				result = caseAbstractRule(program2graph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.WHILEDA2BRANCHBC: {
			whileda2branchbc whileda2branchbc = (whileda2branchbc) theEObject;
			T result = casewhileda2branchbc(whileda2branchbc);
			if (result == null)
				result = caseAbstractRule(whileda2branchbc);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.WHILEULUL2BRANCHUBUB: {
			whileulul2branchubub whileulul2branchubub = (whileulul2branchubub) theEObject;
			T result = casewhileulul2branchubub(whileulul2branchubub);
			if (result == null)
				result = caseAbstractRule(whileulul2branchubub);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>whileula2branchubc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>whileula2branchubc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewhileula2branchubc(whileula2branchubc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>while2branch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>while2branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewhile2branch(while2branch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>whiled2branchb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>whiled2branchb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewhiled2branchb(whiled2branchb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>whiledul2branchbub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>whiledul2branchbub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewhiledul2branchbub(whiledul2branchbub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>whileaul2branchcub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>whileaul2branchcub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewhileaul2branchcub(whileaul2branchcub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>decassass2branchcmdcmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>decassass2branchcmdcmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedecassass2branchcmdcmd(decassass2branchcmdcmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>decla2branchbc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>decla2branchbc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedecla2branchbc(decla2branchbc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>firstdecision2firstbranch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>firstdecision2firstbranch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casefirstdecision2firstbranch(firstdecision2firstbranch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>decdecass2branchbranchcmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>decdecass2branchbranchcmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedecdecass2branchbranchcmd(decdecass2branchbranchcmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>firstwhile2rootbranch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>firstwhile2rootbranch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casefirstwhile2rootbranch(firstwhile2rootbranch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>decal2branchcb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>decal2branchcb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedecal2branchcb(decal2branchcb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>whilel2branchb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>whilel2branchb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewhilel2branchb(whilel2branchb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>decull2branchubb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>decull2branchubb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedecull2branchubb(decull2branchubb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>whileaa2branchcc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>whileaa2branchcc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewhileaa2branchcc(whileaa2branchcc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uwhile2ubranch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uwhile2ubranch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuwhile2ubranch(uwhile2ubranch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>whilell2branchbb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>whilell2branchbb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewhilell2branchbb(whilell2branchbb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>decdecdec2branchbranchbranch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>decdecdec2branchbranchbranch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedecdecdec2branchbranchbranch(decdecdec2branchbranchbranch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>whiledd2branchbb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>whiledd2branchbb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewhiledd2branchbb(whiledd2branchbb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>deculul2branchubub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>deculul2branchubub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedeculul2branchubub(deculul2branchubub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>decassdec2branchcmdbranch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>decassdec2branchcmdbranch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedecassdec2branchcmdbranch(decassdec2branchcmdbranch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>whilead2branchcb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>whilead2branchcb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewhilead2branchcb(whilead2branchcb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>whileld2branchbb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>whileld2branchbb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewhileld2branchbb(whileld2branchbb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>decld2branchbb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>decld2branchbb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedecld2branchbb(decld2branchbb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>decdul2branchbub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>decdul2branchbub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedecdul2branchbub(decdul2branchbub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>whilea2branchc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>whilea2branchc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewhilea2branchc(whilea2branchc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>decision2branch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>decision2branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedecision2branch(decision2branch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>decula2branchubc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>decula2branchubc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedecula2branchubc(decula2branchubc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>decaul2branchcub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>decaul2branchcub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedecaul2branchcub(decaul2branchcub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>deculd2branchubb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>deculd2branchubb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedeculd2branchubb(deculd2branchubb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>assignment2command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>assignment2command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseassignment2command(assignment2command object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>firstass2rootcmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>firstass2rootcmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casefirstass2rootcmd(firstass2rootcmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>whileul2branchub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>whileul2branchub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewhileul2branchub(whileul2branchub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>declul2branchbub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>declul2branchbub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedeclul2branchbub(declul2branchbub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>whileull2branchubb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>whileull2branchubb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewhileull2branchubb(whileull2branchubb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>whileuld2branchubb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>whileuld2branchubb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewhileuld2branchubb(whileuld2branchubb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>whilelul2branchbub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>whilelul2branchbub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewhilelul2branchbub(whilelul2branchbub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>next2next</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>next2next</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenext2next(next2next object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>whileal2branchcb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>whileal2branchcb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewhileal2branchcb(whileal2branchcb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>firstuwhile2rootubranch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>firstuwhile2rootubranch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casefirstuwhile2rootubranch(firstuwhile2rootubranch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>decll2branchbb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>decll2branchbb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedecll2branchbb(decll2branchbb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>whilela2branchbc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>whilela2branchbc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewhilela2branchbc(whilela2branchbc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>whiledl2branchbb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>whiledl2branchbb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewhiledl2branchbb(whiledl2branchbb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>decdl2branchbb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>decdl2branchbb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedecdl2branchbb(decdl2branchbb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>program2graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>program2graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseprogram2graph(program2graph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>whileda2branchbc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>whileda2branchbc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewhileda2branchbc(whileda2branchbc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>whileulul2branchubub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>whileulul2branchubub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewhileulul2branchubub(whileulul2branchubub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRule(AbstractRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RulesSwitch
