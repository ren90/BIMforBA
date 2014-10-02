/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcSweptSurface

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcsweptsurface extends CIfcsurface implements EIfcsweptsurface {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcsweptsurface.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	// Dim: protected int  - derived - java inheritance -  INTEGER
	protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
	protected Object a0; // SweptCurve - current entity - ENTITY IfcProfileDef
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected Object a1; // Position - current entity - ENTITY IfcAxis2Placement3D
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// Dim - derived - java inheritance
	// protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
	// SweptCurve - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected Object a0;
	// Position - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected Object a1;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a0 == old) {
			a0 = newer;
		}
		if (a1 == old) {
			a1 = newer;
		}
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a0 == old) {
			a0 = newer;
		}
		if (a1 == old) {
			a1 = newer;
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
	//going through all the attributes: #5954=DERIVED_ATTRIBUTE('Dim',#5952,0,#2485,$);
	//<01> generating methods for consolidated attribute:  Dim
	//<01-1> supertype, java inheritance
	//<01-1-1> derived
	//<01-1-1-2> NOT explicit-to-derived - generateDerivedSupertypeJavaInheritedMethodsX
	// methods for derived attribute: Dim, base type: INTEGER
	public boolean testDim(EIfcsurface type) throws SdaiException {
			throw new SdaiException(SdaiException.FN_NAVL);
	}
	public Value getDim(EIfcsurface type, SdaiContext _context) throws SdaiException {


//###-01 jc.generated_java: Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 3)
				return (Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 3));
	}
	public int getDim(EIfcsurface type) throws SdaiException {
		SdaiContext _context = this.findEntityInstanceSdaiModel().getRepository().getSession().getSdaiContext();
			return getDim((EIfcsurface)null, _context).getInteger();
	}
	public static jsdai.dictionary.EAttribute attributeDim(EIfcsurface type) throws SdaiException {
		return d0$;
	}

	//going through all the attributes: #6033=EXPLICIT_ATTRIBUTE('SweptCurve',#6031,0,#5068,$,.F.);
	//<01> generating methods for consolidated attribute:  SweptCurve
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : SweptCurve, base type: entity IfcProfileDef
	public static int usedinSweptcurve(EIfcsweptsurface type, EIfcprofiledef instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	public boolean testSweptcurve(EIfcsweptsurface type) throws SdaiException {
		return test_instance(a0);
	}
	public EIfcprofiledef getSweptcurve(EIfcsweptsurface type) throws SdaiException {
		return (EIfcprofiledef)get_instance(a0);
	}
	public void setSweptcurve(EIfcsweptsurface type, EIfcprofiledef value) throws SdaiException {
		a0 = set_instance(a0, value);
	}
	public void unsetSweptcurve(EIfcsweptsurface type) throws SdaiException {
		a0 = unset_instance(a0);
	}
	public static jsdai.dictionary.EAttribute attributeSweptcurve(EIfcsweptsurface type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #6034=EXPLICIT_ATTRIBUTE('Position',#6031,1,#3382,$,.T.);
	//<01> generating methods for consolidated attribute:  Position
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : Position, base type: entity IfcAxis2Placement3D
	public static int usedinPosition(EIfcsweptsurface type, EIfcaxis2placement3d instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a1$, domain, result);
	}
	public boolean testPosition(EIfcsweptsurface type) throws SdaiException {
		return test_instance(a1);
	}
	public EIfcaxis2placement3d getPosition(EIfcsweptsurface type) throws SdaiException {
		return (EIfcaxis2placement3d)get_instance(a1);
	}
	public void setPosition(EIfcsweptsurface type, EIfcaxis2placement3d value) throws SdaiException {
		a1 = set_instance(a1, value);
	}
	public void unsetPosition(EIfcsweptsurface type) throws SdaiException {
		a1 = unset_instance(a1);
	}
	public static jsdai.dictionary.EAttribute attributePosition(EIfcsweptsurface type) throws SdaiException {
		return a1$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			a1 = unset_instance(a1);
			return;
		}
		a0 = av.entityValues[3].getInstance(0, this, a0$);
		a1 = av.entityValues[3].getInstance(1, this, a1$);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			a1 = unset_instance(a1);
			return;
		}
		a0 = av.entityValues[3].getInstance(0, this, a0$);
		a1 = av.entityValues[3].getInstance(1, this, a1$);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
		// partial entity: IfcSurface
		// partial entity: IfcSweptSurface
		av.entityValues[3].setInstance(0, a0);
		av.entityValues[3].setInstance(1, a1);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
		// partial entity: IfcSurface
		// partial entity: IfcSweptSurface
		av.entityValues[3].setInstance(0, a0);
		av.entityValues[3].setInstance(1, a1);
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfcsweptsurfaceSweptcurvetype(SdaiContext _context) throws SdaiException {
	




		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(jsdai.SIfc4.CIfcprofiledef.definition).set(_context, get(a0$)).getAttribute(jsdai.SIfc4.CIfcprofiledef.attributeProfiletype(null), _context), Value.alloc(jsdai.SIfc4.SIfc4._st_IfcProfileTypeEnum).setEnum(_context, "Curve"))).getLogical());
	}
}
