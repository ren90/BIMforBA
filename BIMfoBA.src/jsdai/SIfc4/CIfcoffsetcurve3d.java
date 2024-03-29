/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcOffsetCurve3D

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcoffsetcurve3d extends CIfccurve implements EIfcoffsetcurve3d {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcoffsetcurve3d.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	// Dim: protected int  - derived - java inheritance -  INTEGER
	protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
	protected Object a0; // BasisCurve - current entity - ENTITY IfcCurve
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected double a1; // Distance - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected int a2; // SelfIntersect - current entity - LOGICAL
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected Object a3; // RefDirection - current entity - ENTITY IfcDirection
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// Dim - derived - java inheritance
	// protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
	// BasisCurve - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected Object a0;
	// Distance - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected double a1;
	// SelfIntersect - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected int a2;
	// RefDirection - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected Object a3;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a0 == old) {
			a0 = newer;
		}
		if (a3 == old) {
			a3 = newer;
		}
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a0 == old) {
			a0 = newer;
		}
		if (a3 == old) {
			a3 = newer;
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
	//going through all the attributes: #3885=DERIVED_ATTRIBUTE('Dim',#3883,0,#2485,$);
	//<01> generating methods for consolidated attribute:  Dim
	//<01-1> supertype, java inheritance
	//<01-1-1> derived
	//<01-1-1-2> NOT explicit-to-derived - generateDerivedSupertypeJavaInheritedMethodsX
	// methods for derived attribute: Dim, base type: INTEGER
	public boolean testDim(EIfccurve type) throws SdaiException {
			throw new SdaiException(SdaiException.FN_NAVL);
	}
	public Value getDim(EIfccurve type, SdaiContext _context) throws SdaiException {


//###-01 jc.generated_java: (new jsdai.SIfc4.FIfccurvedim()).run(_context, Value.alloc(jsdai.SIfc4.CIfcoffsetcurve3d.definition).set(_context, this))
				return ((new jsdai.SIfc4.FIfccurvedim()).run(_context, Value.alloc(jsdai.SIfc4.CIfcoffsetcurve3d.definition).set(_context, this)));
	}
	public int getDim(EIfccurve type) throws SdaiException {
		SdaiContext _context = this.findEntityInstanceSdaiModel().getRepository().getSession().getSdaiContext();
			return getDim((EIfccurve)null, _context).getInteger();
	}
	public static jsdai.dictionary.EAttribute attributeDim(EIfccurve type) throws SdaiException {
		return d0$;
	}

	//going through all the attributes: #4818=EXPLICIT_ATTRIBUTE('BasisCurve',#4816,0,#3883,$,.F.);
	//<01> generating methods for consolidated attribute:  BasisCurve
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : BasisCurve, base type: entity IfcCurve
	public static int usedinBasiscurve(EIfcoffsetcurve3d type, EIfccurve instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	public boolean testBasiscurve(EIfcoffsetcurve3d type) throws SdaiException {
		return test_instance(a0);
	}
	public EIfccurve getBasiscurve(EIfcoffsetcurve3d type) throws SdaiException {
		return (EIfccurve)get_instance(a0);
	}
	public void setBasiscurve(EIfcoffsetcurve3d type, EIfccurve value) throws SdaiException {
		a0 = set_instance(a0, value);
	}
	public void unsetBasiscurve(EIfcoffsetcurve3d type) throws SdaiException {
		a0 = unset_instance(a0);
	}
	public static jsdai.dictionary.EAttribute attributeBasiscurve(EIfcoffsetcurve3d type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #4819=EXPLICIT_ATTRIBUTE('Distance',#4816,1,#2543,$,.F.);
	//<01> generating methods for consolidated attribute:  Distance
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Distance, base type: REAL
	public boolean testDistance(EIfcoffsetcurve3d type) throws SdaiException {
		return test_double(a1);
	}
	public double getDistance(EIfcoffsetcurve3d type) throws SdaiException {
		return get_double(a1);
	}
	public void setDistance(EIfcoffsetcurve3d type, double value) throws SdaiException {
		a1 = set_double(value);
	}
	public void unsetDistance(EIfcoffsetcurve3d type) throws SdaiException {
		a1 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeDistance(EIfcoffsetcurve3d type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #4820=EXPLICIT_ATTRIBUTE('SelfIntersect',#4816,2,#5,$,.F.);
	//<01> generating methods for consolidated attribute:  SelfIntersect
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: SelfIntersect, base type: LOGICAL
	public boolean testSelfintersect(EIfcoffsetcurve3d type) throws SdaiException {
		return test_logical(a2);
	}
	public int getSelfintersect(EIfcoffsetcurve3d type) throws SdaiException {
		return get_logical(a2);
	}
	public void setSelfintersect(EIfcoffsetcurve3d type, int value) throws SdaiException {
		a2 = set_logical(value);
	}
	public void unsetSelfintersect(EIfcoffsetcurve3d type) throws SdaiException {
		a2 = unset_logical();
	}
	public static jsdai.dictionary.EAttribute attributeSelfintersect(EIfcoffsetcurve3d type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #4821=EXPLICIT_ATTRIBUTE('RefDirection',#4816,3,#3948,$,.F.);
	//<01> generating methods for consolidated attribute:  RefDirection
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : RefDirection, base type: entity IfcDirection
	public static int usedinRefdirection(EIfcoffsetcurve3d type, EIfcdirection instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a3$, domain, result);
	}
	public boolean testRefdirection(EIfcoffsetcurve3d type) throws SdaiException {
		return test_instance(a3);
	}
	public EIfcdirection getRefdirection(EIfcoffsetcurve3d type) throws SdaiException {
		return (EIfcdirection)get_instance(a3);
	}
	public void setRefdirection(EIfcoffsetcurve3d type, EIfcdirection value) throws SdaiException {
		a3 = set_instance(a3, value);
	}
	public void unsetRefdirection(EIfcoffsetcurve3d type) throws SdaiException {
		a3 = unset_instance(a3);
	}
	public static jsdai.dictionary.EAttribute attributeRefdirection(EIfcoffsetcurve3d type) throws SdaiException {
		return a3$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			a1 = Double.NaN;
			a2 = 0;
			a3 = unset_instance(a3);
			return;
		}
		a0 = av.entityValues[2].getInstance(0, this, a0$);
		a1 = av.entityValues[2].getDouble(1);
		a2 = av.entityValues[2].getLogical(2);
		a3 = av.entityValues[2].getInstance(3, this, a3$);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			a1 = Double.NaN;
			a2 = 0;
			a3 = unset_instance(a3);
			return;
		}
		a0 = av.entityValues[2].getInstance(0, this, a0$);
		a1 = av.entityValues[2].getDouble(1);
		a2 = av.entityValues[2].getLogical(2);
		a3 = av.entityValues[2].getInstance(3, this, a3$);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcCurve
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcOffsetCurve3D
		av.entityValues[2].setInstance(0, a0);
		av.entityValues[2].setDouble(1, a1);
		av.entityValues[2].setLogical(2, a2);
		av.entityValues[2].setInstance(3, a3);
		// partial entity: IfcRepresentationItem
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcCurve
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcOffsetCurve3D
		av.entityValues[2].setInstance(0, a0);
		av.entityValues[2].setDouble(1, a1);
		av.entityValues[2].setLogical(2, a2);
		av.entityValues[2].setInstance(3, a3);
		// partial entity: IfcRepresentationItem
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfcoffsetcurve3dDimis2d(SdaiContext _context) throws SdaiException {
	




		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(jsdai.SIfc4.CIfccurve.definition).set(_context, get(a0$)).getAttribute(jsdai.SIfc4.CIfccurve.attributeDim(null), _context), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 3))).getLogical());
	}
}
