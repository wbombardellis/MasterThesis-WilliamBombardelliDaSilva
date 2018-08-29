/**
 */
package org.wbsilva.bx.sourcecode2controlflow.Rules.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.wbsilva.bx.sourcecode2controlflow.Rules.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesFactoryImpl extends EFactoryImpl implements RulesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RulesFactory init() {
		try {
			RulesFactory theRulesFactory = (RulesFactory) EPackage.Registry.INSTANCE.getEFactory(RulesPackage.eNS_URI);
			if (theRulesFactory != null) {
				return theRulesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RulesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RulesPackage.DECLD2BRANCHBB:
			return createdecld2branchbb();
		case RulesPackage.WHILEL2BRANCHB:
			return createwhilel2branchb();
		case RulesPackage.DECISION2BRANCH:
			return createdecision2branch();
		case RulesPackage.WHILEDA2BRANCHBC:
			return createwhileda2branchbc();
		case RulesPackage.FIRSTWHILE2ROOTBRANCH:
			return createfirstwhile2rootbranch();
		case RulesPackage.FIRSTASS2ROOTCMD:
			return createfirstass2rootcmd();
		case RulesPackage.WHILEULA2BRANCHUBC:
			return createwhileula2branchubc();
		case RulesPackage.DECULUL2BRANCHUBUB:
			return createdeculul2branchubub();
		case RulesPackage.FIRSTDECISION2FIRSTBRANCH:
			return createfirstdecision2firstbranch();
		case RulesPackage.WHILELD2BRANCHBB:
			return createwhileld2branchbb();
		case RulesPackage.WHILELL2BRANCHBB:
			return createwhilell2branchbb();
		case RulesPackage.DECLUL2BRANCHBUB:
			return createdeclul2branchbub();
		case RulesPackage.WHILEULD2BRANCHUBB:
			return createwhileuld2branchubb();
		case RulesPackage.DECULL2BRANCHUBB:
			return createdecull2branchubb();
		case RulesPackage.DECASSDEC2BRANCHCMDBRANCH:
			return createdecassdec2branchcmdbranch();
		case RulesPackage.DECDECASS2BRANCHBRANCHCMD:
			return createdecdecass2branchbranchcmd();
		case RulesPackage.WHILEUL2BRANCHUB:
			return createwhileul2branchub();
		case RulesPackage.ASSIGNMENT2COMMAND:
			return createassignment2command();
		case RulesPackage.DECULD2BRANCHUBB:
			return createdeculd2branchubb();
		case RulesPackage.WHILELUL2BRANCHBUB:
			return createwhilelul2branchbub();
		case RulesPackage.FIRSTUWHILE2ROOTUBRANCH:
			return createfirstuwhile2rootubranch();
		case RulesPackage.WHILELA2BRANCHBC:
			return createwhilela2branchbc();
		case RulesPackage.DECAL2BRANCHCB:
			return createdecal2branchcb();
		case RulesPackage.DECASSASS2BRANCHCMDCMD:
			return createdecassass2branchcmdcmd();
		case RulesPackage.UWHILE2UBRANCH:
			return createuwhile2ubranch();
		case RulesPackage.NEXT2NEXT:
			return createnext2next();
		case RulesPackage.DECDECDEC2BRANCHBRANCHBRANCH:
			return createdecdecdec2branchbranchbranch();
		case RulesPackage.WHILEA2BRANCHC:
			return createwhilea2branchc();
		case RulesPackage.WHILEDD2BRANCHBB:
			return createwhiledd2branchbb();
		case RulesPackage.WHILEDUL2BRANCHBUB:
			return createwhiledul2branchbub();
		case RulesPackage.DECULA2BRANCHUBC:
			return createdecula2branchubc();
		case RulesPackage.DECDUL2BRANCHBUB:
			return createdecdul2branchbub();
		case RulesPackage.DECAUL2BRANCHCUB:
			return createdecaul2branchcub();
		case RulesPackage.WHILEAA2BRANCHCC:
			return createwhileaa2branchcc();
		case RulesPackage.WHILEAL2BRANCHCB:
			return createwhileal2branchcb();
		case RulesPackage.WHILEULUL2BRANCHUBUB:
			return createwhileulul2branchubub();
		case RulesPackage.WHILEDL2BRANCHBB:
			return createwhiledl2branchbb();
		case RulesPackage.DECLL2BRANCHBB:
			return createdecll2branchbb();
		case RulesPackage.WHILE2BRANCH:
			return createwhile2branch();
		case RulesPackage.WHILEULL2BRANCHUBB:
			return createwhileull2branchubb();
		case RulesPackage.DECDL2BRANCHBB:
			return createdecdl2branchbb();
		case RulesPackage.DECLA2BRANCHBC:
			return createdecla2branchbc();
		case RulesPackage.PROGRAM2GRAPH:
			return createprogram2graph();
		case RulesPackage.WHILEAD2BRANCHCB:
			return createwhilead2branchcb();
		case RulesPackage.WHILED2BRANCHB:
			return createwhiled2branchb();
		case RulesPackage.WHILEAUL2BRANCHCUB:
			return createwhileaul2branchcub();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public decld2branchbb createdecld2branchbb() {
		decld2branchbbImpl decld2branchbb = new decld2branchbbImpl();
		return decld2branchbb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public whilel2branchb createwhilel2branchb() {
		whilel2branchbImpl whilel2branchb = new whilel2branchbImpl();
		return whilel2branchb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public decision2branch createdecision2branch() {
		decision2branchImpl decision2branch = new decision2branchImpl();
		return decision2branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public whileda2branchbc createwhileda2branchbc() {
		whileda2branchbcImpl whileda2branchbc = new whileda2branchbcImpl();
		return whileda2branchbc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public firstwhile2rootbranch createfirstwhile2rootbranch() {
		firstwhile2rootbranchImpl firstwhile2rootbranch = new firstwhile2rootbranchImpl();
		return firstwhile2rootbranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public firstass2rootcmd createfirstass2rootcmd() {
		firstass2rootcmdImpl firstass2rootcmd = new firstass2rootcmdImpl();
		return firstass2rootcmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public whileula2branchubc createwhileula2branchubc() {
		whileula2branchubcImpl whileula2branchubc = new whileula2branchubcImpl();
		return whileula2branchubc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public deculul2branchubub createdeculul2branchubub() {
		deculul2branchububImpl deculul2branchubub = new deculul2branchububImpl();
		return deculul2branchubub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public firstdecision2firstbranch createfirstdecision2firstbranch() {
		firstdecision2firstbranchImpl firstdecision2firstbranch = new firstdecision2firstbranchImpl();
		return firstdecision2firstbranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public whileld2branchbb createwhileld2branchbb() {
		whileld2branchbbImpl whileld2branchbb = new whileld2branchbbImpl();
		return whileld2branchbb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public whilell2branchbb createwhilell2branchbb() {
		whilell2branchbbImpl whilell2branchbb = new whilell2branchbbImpl();
		return whilell2branchbb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public declul2branchbub createdeclul2branchbub() {
		declul2branchbubImpl declul2branchbub = new declul2branchbubImpl();
		return declul2branchbub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public whileuld2branchubb createwhileuld2branchubb() {
		whileuld2branchubbImpl whileuld2branchubb = new whileuld2branchubbImpl();
		return whileuld2branchubb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public decull2branchubb createdecull2branchubb() {
		decull2branchubbImpl decull2branchubb = new decull2branchubbImpl();
		return decull2branchubb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public decassdec2branchcmdbranch createdecassdec2branchcmdbranch() {
		decassdec2branchcmdbranchImpl decassdec2branchcmdbranch = new decassdec2branchcmdbranchImpl();
		return decassdec2branchcmdbranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public decdecass2branchbranchcmd createdecdecass2branchbranchcmd() {
		decdecass2branchbranchcmdImpl decdecass2branchbranchcmd = new decdecass2branchbranchcmdImpl();
		return decdecass2branchbranchcmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public whileul2branchub createwhileul2branchub() {
		whileul2branchubImpl whileul2branchub = new whileul2branchubImpl();
		return whileul2branchub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public assignment2command createassignment2command() {
		assignment2commandImpl assignment2command = new assignment2commandImpl();
		return assignment2command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public deculd2branchubb createdeculd2branchubb() {
		deculd2branchubbImpl deculd2branchubb = new deculd2branchubbImpl();
		return deculd2branchubb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public whilelul2branchbub createwhilelul2branchbub() {
		whilelul2branchbubImpl whilelul2branchbub = new whilelul2branchbubImpl();
		return whilelul2branchbub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public firstuwhile2rootubranch createfirstuwhile2rootubranch() {
		firstuwhile2rootubranchImpl firstuwhile2rootubranch = new firstuwhile2rootubranchImpl();
		return firstuwhile2rootubranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public whilela2branchbc createwhilela2branchbc() {
		whilela2branchbcImpl whilela2branchbc = new whilela2branchbcImpl();
		return whilela2branchbc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public decal2branchcb createdecal2branchcb() {
		decal2branchcbImpl decal2branchcb = new decal2branchcbImpl();
		return decal2branchcb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public decassass2branchcmdcmd createdecassass2branchcmdcmd() {
		decassass2branchcmdcmdImpl decassass2branchcmdcmd = new decassass2branchcmdcmdImpl();
		return decassass2branchcmdcmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uwhile2ubranch createuwhile2ubranch() {
		uwhile2ubranchImpl uwhile2ubranch = new uwhile2ubranchImpl();
		return uwhile2ubranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public next2next createnext2next() {
		next2nextImpl next2next = new next2nextImpl();
		return next2next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public decdecdec2branchbranchbranch createdecdecdec2branchbranchbranch() {
		decdecdec2branchbranchbranchImpl decdecdec2branchbranchbranch = new decdecdec2branchbranchbranchImpl();
		return decdecdec2branchbranchbranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public whilea2branchc createwhilea2branchc() {
		whilea2branchcImpl whilea2branchc = new whilea2branchcImpl();
		return whilea2branchc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public whiledd2branchbb createwhiledd2branchbb() {
		whiledd2branchbbImpl whiledd2branchbb = new whiledd2branchbbImpl();
		return whiledd2branchbb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public whiledul2branchbub createwhiledul2branchbub() {
		whiledul2branchbubImpl whiledul2branchbub = new whiledul2branchbubImpl();
		return whiledul2branchbub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public decula2branchubc createdecula2branchubc() {
		decula2branchubcImpl decula2branchubc = new decula2branchubcImpl();
		return decula2branchubc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public decdul2branchbub createdecdul2branchbub() {
		decdul2branchbubImpl decdul2branchbub = new decdul2branchbubImpl();
		return decdul2branchbub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public decaul2branchcub createdecaul2branchcub() {
		decaul2branchcubImpl decaul2branchcub = new decaul2branchcubImpl();
		return decaul2branchcub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public whileaa2branchcc createwhileaa2branchcc() {
		whileaa2branchccImpl whileaa2branchcc = new whileaa2branchccImpl();
		return whileaa2branchcc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public whileal2branchcb createwhileal2branchcb() {
		whileal2branchcbImpl whileal2branchcb = new whileal2branchcbImpl();
		return whileal2branchcb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public whileulul2branchubub createwhileulul2branchubub() {
		whileulul2branchububImpl whileulul2branchubub = new whileulul2branchububImpl();
		return whileulul2branchubub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public whiledl2branchbb createwhiledl2branchbb() {
		whiledl2branchbbImpl whiledl2branchbb = new whiledl2branchbbImpl();
		return whiledl2branchbb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public decll2branchbb createdecll2branchbb() {
		decll2branchbbImpl decll2branchbb = new decll2branchbbImpl();
		return decll2branchbb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public while2branch createwhile2branch() {
		while2branchImpl while2branch = new while2branchImpl();
		return while2branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public whileull2branchubb createwhileull2branchubb() {
		whileull2branchubbImpl whileull2branchubb = new whileull2branchubbImpl();
		return whileull2branchubb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public decdl2branchbb createdecdl2branchbb() {
		decdl2branchbbImpl decdl2branchbb = new decdl2branchbbImpl();
		return decdl2branchbb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public decla2branchbc createdecla2branchbc() {
		decla2branchbcImpl decla2branchbc = new decla2branchbcImpl();
		return decla2branchbc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public program2graph createprogram2graph() {
		program2graphImpl program2graph = new program2graphImpl();
		return program2graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public whilead2branchcb createwhilead2branchcb() {
		whilead2branchcbImpl whilead2branchcb = new whilead2branchcbImpl();
		return whilead2branchcb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public whiled2branchb createwhiled2branchb() {
		whiled2branchbImpl whiled2branchb = new whiled2branchbImpl();
		return whiled2branchb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public whileaul2branchcub createwhileaul2branchcub() {
		whileaul2branchcubImpl whileaul2branchcub = new whileaul2branchcubImpl();
		return whileaul2branchcub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesPackage getRulesPackage() {
		return (RulesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RulesPackage getPackage() {
		return RulesPackage.eINSTANCE;
	}

} //RulesFactoryImpl
