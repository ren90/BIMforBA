/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcSurfaceOfLinearExtrusion

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcsurfaceoflinearextrusion extends CIfcsweptsurface implements EIfcsurfaceoflinearextrusion {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcsurfaceoflinearextrusion.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	// Dim: protected int  - derived - java inheritance -  INTEGER
	protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
	// SweptCurve: protected Object a0;   SweptCurve - java inheritance - ENTITY IfcProfileDef
	// Position: protected Object a1;   Position - java inheritance - ENTITY IfcAxis2Placement3D
	protected Object a2; // ExtrudedDirection - current entity - ENTITY IfcDirection
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected double a3; // Depth - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	// ExtrusionAxis: protected Object  - derived - current -  ENTITY IfcVector
	protected static final jsdai.dictionary.CDerived_attribute d1$ = CEntity.initDerivedAttribute(definition, 1);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// Dim - derived - java inheritance
	// protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
	// SweptCurve - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected Object a0;
	// Position - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected Object a1;
	// ExtrudedDirection - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected Object a2;
	// Depth - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected double a3;
	// ExtrusionAxis - derived - current entity
	protected static final jsdai.dictionary.CDerived_attribute d1$ = CEntity.initDerivedAttribute(definition, 1);

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
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): SweptCurve, base type: entity IfcProfileDef
	public static int usedinSweptcurve(EIfcsweptsurface type, EIfcprofiledef instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	//going through all the attributes: #6034=EXPLICIT_ATTRIBUTE('Position',#6031,1,#3382,$,.T.);
	//<01> generating methods for consolidated attribute:  Position
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): Position, base type: entity IfcAxis2Placement3D
	public static int usedinPosition(EIfcsweptsurface type, EIfcaxis2placement3d instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a1$, domain, result);
	}
	//going through all the attributes: #5966=EXPLICIT_ATTRIBUTE('ExtrudedDirection',#5964,0,#3948,$,.F.);
	//<01> generating methods for consolidated attribute:  ExtrudedDirection
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : ExtrudedDirection, base type: entity IfcDirection
	public static int usedinExtrudeddirection(EIfcsurfaceoflinearextrusion type, EIfcdirection instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a2$, domain, result);
	}
	public boolean testExtrudeddirection(EIfcsurfaceoflinearextrusion type) throws SdaiException {
		return test_instance(a2);
	}
	public EIfcdirection getExtrudeddirection(EIfcsurfaceoflinearextrusion type) throws SdaiException {
		return (EIfcdirection)get_instance(a2);
	}
	public void setExtrudeddirection(EIfcsurfaceoflinearextrusion type, EIfcdirection value) throws SdaiException {
		a2 = set_instance(a2, value);
	}
	public void unsetExtrudeddirection(EIfcsurfaceoflinearextrusion type) throws SdaiException {
		a2 = unset_instance(a2);
	}
	public static jsdai.dictionary.EAttribute attributeExtrudeddirection(EIfcsurfaceoflinearextrusion type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #5967=EXPLICIT_ATTRIBUTE('Depth',#5964,1,#2543,$,.F.);
	//<01> generating methods for consolidated attribute:  Depth
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Depth, base type: REAL
	public boolean testDepth(EIfcsurfaceoflinearextrusion type) throws SdaiException {
		return test_double(a3);
	}
	public double getDepth(EIfcsurfaceoflinearextrusion type) throws SdaiException {
		return get_double(a3);
	}
	public void setDepth(EIfcsurfaceoflinearextrusion type, double value) throws SdaiException {
		a3 = set_double(value);
	}
	public void unsetDepth(EIfcsurfaceoflinearextrusion type) throws SdaiException {
		a3 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeDepth(EIfcsurfaceoflinearextrusion type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #5968=DERIVED_ATTRIBUTE('ExtrusionAxis',#5964,0,#6322,$);
	//<01> generating methods for consolidated attribute:  ExtrusionAxis
	//<01-0> current entity
	//<01-0-1> derived attribute
	//<01-0-1-1> NOT explicit-to-derived - generateDerivedCurrentEntityMethodsX()
	// derived attribute (current derived or supertype derived): ExtrusionAxis, base type: entity IfcVector
	public boolean testExtrusionaxis(EIfcsurfaceoflinearextrusion type) throws SdaiException {
			throw new SdaiException(SdaiException.FN_NAVL);
	}
	public Value getExtrusionaxis(EIfcsurfaceoflinearextrusion type, SdaiContext _context) throws SdaiException {




//###-01 jc.generated_java: new jsdai.lang.Value(CIfcrepresentationitem.definition).addComplex(new jsdai.lang.Value(CIfcgeometricrepresentationitem.definition)).addComplex(new jsdai.lang.Value(CIfcvector.definition).addParameter(Value.alloc(jsdai.SIfc4.CIfcdirection.definition).set(_context, get(a2$))).addParameter(Value.alloc(jsdai.SIfc4.SIfc4._st_IfcLengthMeasure).set(_context, get(a3$))))
		return (Value.alloc(jsdai.SIfc4.CIfcvector.definition).set(_context, new jsdai.lang.Value(CIfcrepresentationitem.definition).addComplex(new jsdai.lang.Value(CIfcgeometricrepresentationitem.definition)).addComplex(new jsdai.lang.Value(CIfcvector.definition).addParameter(Value.alloc(jsdai.SIfc4.CIfcdirection.definition).set(_context, get(a2$))).addParameter(Value.alloc(jsdai.SIfc4.SIfc4._st_IfcLengthMeasure).set(_context, get(a3$))))));
	}
	public EIfcvector getExtrusionaxis(EIfcsurfaceoflinearextrusion type) throws SdaiException {
		SdaiContext _context = this.findEntityInstanceSdaiModel().getRepository().getSession().getSdaiContext();
			return (EIfcvector) getExtrusionaxis((EIfcsurfaceoflinearextrusion)null, _context).getInstance();
	}
	public static jsdai.dictionary.EAttribute attributeExtrusionaxis(EIfcsurfaceoflinearextrusion type) throws SdaiException {
		return d1$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a2 = unset_instance(a2);
			a3 = Double.NaN;
			a0 = unset_instance(a0);
			a1 = unset_instance(a1);
			return;
		}
		a2 = av.entityValues[3].getInstance(0, this, a2$);
		a3 = av.entityValues[3].getDouble(1);
		a0 = av.entityValues[4].getInstance(0, this, a0$);
		a1 = av.entityValues[4].getInstance(1, this, a1$);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a2 = unset_instance(a2);
			a3 = Double.NaN;
			a0 = unset_instance(a0);
			a1 = unset_instance(a1);
			return;
		}
		a2 = av.entityValues[3].getInstance(0, this, a2$);
		a3 = av.entityValues[3].getDouble(1);
		a0 = av.entityValues[4].getInstance(0, this, a0$);
		a1 = av.entityValues[4].getInstance(1, this, a1$);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
		// partial entity: IfcSurface
		// partial entity: IfcSurfaceOfLinearExtrusion
		av.entityValues[3].setInstance(0, a2);
		av.entityValues[3].setDouble(1, a3);
		// partial entity: IfcSweptSurface
		av.entityValues[4].setInstance(0, a0);
		av.entityValues[4].setInstance(1, a1);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
		// partial entity: IfcSurface
		// partial entity: IfcSurfaceOfLinearExtrusion
		av.entityValues[3].setInstance(0, a2);
		av.entityValues[3].setDouble(1, a3);
		// partial entity: IfcSweptSurface
		av.entityValues[4].setInstance(0, a0);
		av.entityValues[4].setInstance(1, a1);
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfcsurfaceoflinearextrusionDepthgreaterzero(SdaiContext _context) throws SdaiException {
	



		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).greater(_context, Value.alloc(jsdai.SIfc4.SIfc4._st_IfcLengthMeasure).set(_context, get(a3$)), Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 0.0))).getLogical());
	}
}
