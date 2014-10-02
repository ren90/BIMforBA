/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcBoxedHalfSpace

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcboxedhalfspace extends CIfchalfspacesolid implements EIfcboxedhalfspace {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcboxedhalfspace.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	// BaseSurface: protected Object a0;   BaseSurface - java inheritance - ENTITY IfcSurface
	// AgreementFlag: protected int a1;   AgreementFlag - java inheritance - BOOLEAN
	// Dim: protected int  - derived - java inheritance -  INTEGER
	protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
	protected Object a2; // Enclosure - current entity - ENTITY IfcBoundingBox
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// BaseSurface - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected Object a0;
	// AgreementFlag - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected int a1;
	// Dim - derived - java inheritance
	// protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
	// Enclosure - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected Object a2;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a2 == old) {
			a2 = newer;
		}
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a2 == old) {
			a2 = newer;
		}
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #5552=INVERSE_ATTRIBUTE('LayerAssignment',#5550,0,#5023,$,#5027,#9221,#9222,.F.);
	//<01> generating methods for consolidated attribute:  LayerAssignment
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5553=INVERSE_ATTRIBUTE('StyledByItem',#5550,1,#5936,$,#5938,#9224,#9225,.F.);
	//<01> generating methods for consolidated attribute:  StyledByItem
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4452=EXPLICIT_ATTRIBUTE('BaseSurface',#4450,0,#5952,$,.F.);
	//<01> generating methods for consolidated attribute:  BaseSurface
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): BaseSurface, base type: entity IfcSurface
	public static int usedinBasesurface(EIfchalfspacesolid type, EIfcsurface instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	//going through all the attributes: #4453=EXPLICIT_ATTRIBUTE('AgreementFlag',#4450,1,#6,$,.F.);
	//<01> generating methods for consolidated attribute:  AgreementFlag
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4454=DERIVED_ATTRIBUTE('Dim',#4450,0,#2485,$);
	//<01> generating methods for consolidated attribute:  Dim
	//<01-1> supertype, java inheritance
	//<01-1-1> derived
	//<01-1-1-2> NOT explicit-to-derived - generateDerivedSupertypeJavaInheritedMethodsX
	// methods for derived attribute: Dim, base type: INTEGER
	public boolean testDim(EIfchalfspacesolid type) throws SdaiException {
			throw new SdaiException(SdaiException.FN_NAVL);
	}
	public Value getDim(EIfchalfspacesolid type, SdaiContext _context) throws SdaiException {


//###-01 jc.generated_java: Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 3)
				return (Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 3));
	}
	public int getDim(EIfchalfspacesolid type) throws SdaiException {
		SdaiContext _context = this.findEntityInstanceSdaiModel().getRepository().getSession().getSdaiContext();
			return getDim((EIfchalfspacesolid)null, _context).getInteger();
	}
	public static jsdai.dictionary.EAttribute attributeDim(EIfchalfspacesolid type) throws SdaiException {
		return d0$;
	}

	//going through all the attributes: #3496=EXPLICIT_ATTRIBUTE('Enclosure',#3494,0,#3487,$,.F.);
	//<01> generating methods for consolidated attribute:  Enclosure
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : Enclosure, base type: entity IfcBoundingBox
	public static int usedinEnclosure(EIfcboxedhalfspace type, EIfcboundingbox instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a2$, domain, result);
	}
	public boolean testEnclosure(EIfcboxedhalfspace type) throws SdaiException {
		return test_instance(a2);
	}
	public EIfcboundingbox getEnclosure(EIfcboxedhalfspace type) throws SdaiException {
		return (EIfcboundingbox)get_instance(a2);
	}
	public void setEnclosure(EIfcboxedhalfspace type, EIfcboundingbox value) throws SdaiException {
		a2 = set_instance(a2, value);
	}
	public void unsetEnclosure(EIfcboxedhalfspace type) throws SdaiException {
		a2 = unset_instance(a2);
	}
	public static jsdai.dictionary.EAttribute attributeEnclosure(EIfcboxedhalfspace type) throws SdaiException {
		return a2$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a2 = unset_instance(a2);
			a0 = unset_instance(a0);
			a1 = 0;
			return;
		}
		a2 = av.entityValues[0].getInstance(0, this, a2$);
		a0 = av.entityValues[2].getInstance(0, this, a0$);
		a1 = av.entityValues[2].getBoolean(1);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a2 = unset_instance(a2);
			a0 = unset_instance(a0);
			a1 = 0;
			return;
		}
		a2 = av.entityValues[0].getInstance(0, this, a2$);
		a0 = av.entityValues[2].getInstance(0, this, a0$);
		a1 = av.entityValues[2].getBoolean(1);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcBoxedHalfSpace
		av.entityValues[0].setInstance(0, a2);
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcHalfSpaceSolid
		av.entityValues[2].setInstance(0, a0);
		av.entityValues[2].setBoolean(1, a1);
		// partial entity: IfcRepresentationItem
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcBoxedHalfSpace
		av.entityValues[0].setInstance(0, a2);
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcHalfSpaceSolid
		av.entityValues[2].setInstance(0, a0);
		av.entityValues[2].setBoolean(1, a1);
		// partial entity: IfcRepresentationItem
	}
}
