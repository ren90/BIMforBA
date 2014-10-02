/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcSweptDiskSolidPolygonal

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcsweptdisksolidpolygonal extends CIfcsweptdisksolid implements EIfcsweptdisksolidpolygonal {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcsweptdisksolidpolygonal.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	// Dim: protected int  - derived - java inheritance -  INTEGER
	protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
	// Directrix: protected Object a0;   Directrix - java inheritance - ENTITY IfcCurve
	// Radius: protected double a1;   Radius - java inheritance - REAL
	// InnerRadius: protected double a2;   InnerRadius - java inheritance - REAL
	// StartParam: protected double a3;   StartParam - java inheritance - REAL
	// EndParam: protected double a4;   EndParam - java inheritance - REAL
	protected double a5; // FilletRadius - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// Dim - derived - java inheritance
	// protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
	// Directrix - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected Object a0;
	// Radius - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected double a1;
	// InnerRadius - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	// protected double a2;
	// StartParam - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	// protected double a3;
	// EndParam - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	// protected double a4;
	// FilletRadius - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected double a5;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
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
	//going through all the attributes: #5730=DERIVED_ATTRIBUTE('Dim',#5728,0,#2485,$);
	//<01> generating methods for consolidated attribute:  Dim
	//<01-1> supertype, java inheritance
	//<01-1-1> derived
	//<01-1-1-2> NOT explicit-to-derived - generateDerivedSupertypeJavaInheritedMethodsX
	// methods for derived attribute: Dim, base type: INTEGER
	public boolean testDim(EIfcsolidmodel type) throws SdaiException {
			throw new SdaiException(SdaiException.FN_NAVL);
	}
	public Value getDim(EIfcsolidmodel type, SdaiContext _context) throws SdaiException {


//###-01 jc.generated_java: Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 3)
				return (Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 3));
	}
	public int getDim(EIfcsolidmodel type) throws SdaiException {
		SdaiContext _context = this.findEntityInstanceSdaiModel().getRepository().getSession().getSdaiContext();
			return getDim((EIfcsolidmodel)null, _context).getInteger();
	}
	public static jsdai.dictionary.EAttribute attributeDim(EIfcsolidmodel type) throws SdaiException {
		return d0$;
	}

	//going through all the attributes: #6023=EXPLICIT_ATTRIBUTE('Directrix',#6021,0,#3883,$,.F.);
	//<01> generating methods for consolidated attribute:  Directrix
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): Directrix, base type: entity IfcCurve
	public static int usedinDirectrix(EIfcsweptdisksolid type, EIfccurve instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	//going through all the attributes: #6024=EXPLICIT_ATTRIBUTE('Radius',#6021,1,#2605,$,.F.);
	//<01> generating methods for consolidated attribute:  Radius
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #6025=EXPLICIT_ATTRIBUTE('InnerRadius',#6021,2,#2605,$,.T.);
	//<01> generating methods for consolidated attribute:  InnerRadius
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #6026=EXPLICIT_ATTRIBUTE('StartParam',#6021,3,#2599,$,.T.);
	//<01> generating methods for consolidated attribute:  StartParam
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #6027=EXPLICIT_ATTRIBUTE('EndParam',#6021,4,#2599,$,.T.);
	//<01> generating methods for consolidated attribute:  EndParam
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #6030=EXPLICIT_ATTRIBUTE('FilletRadius',#6028,0,#2605,$,.T.);
	//<01> generating methods for consolidated attribute:  FilletRadius
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: FilletRadius, base type: REAL
	public boolean testFilletradius(EIfcsweptdisksolidpolygonal type) throws SdaiException {
		return test_double(a5);
	}
	public double getFilletradius(EIfcsweptdisksolidpolygonal type) throws SdaiException {
		return get_double(a5);
	}
	public void setFilletradius(EIfcsweptdisksolidpolygonal type, double value) throws SdaiException {
		a5 = set_double(value);
	}
	public void unsetFilletradius(EIfcsweptdisksolidpolygonal type) throws SdaiException {
		a5 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeFilletradius(EIfcsweptdisksolidpolygonal type) throws SdaiException {
		return a5$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			a1 = Double.NaN;
			a2 = Double.NaN;
			a3 = Double.NaN;
			a4 = Double.NaN;
			a5 = Double.NaN;
			return;
		}
		a0 = av.entityValues[3].getInstance(0, this, a0$);
		a1 = av.entityValues[3].getDouble(1);
		a2 = av.entityValues[3].getDouble(2);
		a3 = av.entityValues[3].getDouble(3);
		a4 = av.entityValues[3].getDouble(4);
		a5 = av.entityValues[4].getDouble(0);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			a1 = Double.NaN;
			a2 = Double.NaN;
			a3 = Double.NaN;
			a4 = Double.NaN;
			a5 = Double.NaN;
			return;
		}
		a0 = av.entityValues[3].getInstance(0, this, a0$);
		a1 = av.entityValues[3].getDouble(1);
		a2 = av.entityValues[3].getDouble(2);
		a3 = av.entityValues[3].getDouble(3);
		a4 = av.entityValues[3].getDouble(4);
		a5 = av.entityValues[4].getDouble(0);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
		// partial entity: IfcSolidModel
		// partial entity: IfcSweptDiskSolid
		av.entityValues[3].setInstance(0, a0);
		av.entityValues[3].setDouble(1, a1);
		av.entityValues[3].setDouble(2, a2);
		av.entityValues[3].setDouble(3, a3);
		av.entityValues[3].setDouble(4, a4);
		// partial entity: IfcSweptDiskSolidPolygonal
		av.entityValues[4].setDouble(0, a5);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
		// partial entity: IfcSolidModel
		// partial entity: IfcSweptDiskSolid
		av.entityValues[3].setInstance(0, a0);
		av.entityValues[3].setDouble(1, a1);
		av.entityValues[3].setDouble(2, a2);
		av.entityValues[3].setDouble(3, a3);
		av.entityValues[3].setDouble(4, a4);
		// partial entity: IfcSweptDiskSolidPolygonal
		av.entityValues[4].setDouble(0, a5);
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfcsweptdisksolidpolygonalDirectrixispolyline(SdaiContext _context) throws SdaiException {
	



		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCPOLYLINE", "IFC4"), Value.alloc(jsdai.SIfc4.CIfcsweptdisksolidpolygonal.definition).set(_context, this).groupReference(_context, jsdai.SIfc4.CIfcsweptdisksolid.class).getAttribute(jsdai.SIfc4.CIfcsweptdisksolid.attributeDirectrix(null), _context).typeOfV(_context))).getLogical());
	}
	public int rIfcsweptdisksolidpolygonalCorrectradii(SdaiContext _context) throws SdaiException {
	





		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).OR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).NOT(Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.SIfc4._st_IfcPositiveLengthMeasure).set(_context, get(a5$)))), Value.alloc(ExpressTypes.LOGICAL_TYPE).gequal(_context, Value.alloc(jsdai.SIfc4.SIfc4._st_IfcPositiveLengthMeasure).set(_context, get(a5$)), Value.alloc(jsdai.SIfc4.CIfcsweptdisksolidpolygonal.definition).set(_context, this).groupReference(_context, jsdai.SIfc4.CIfcsweptdisksolid.class).getAttribute(jsdai.SIfc4.CIfcsweptdisksolid.attributeRadius(null), _context)))).getLogical());
	}
}