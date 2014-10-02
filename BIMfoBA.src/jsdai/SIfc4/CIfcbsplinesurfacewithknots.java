/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcBSplineSurfaceWithKnots

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcbsplinesurfacewithknots extends CIfcbsplinesurface implements EIfcbsplinesurfacewithknots {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcbsplinesurfacewithknots.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	// Dim: protected int  - derived - java inheritance -  INTEGER
	protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
	// UDegree: protected int a0;   UDegree - java inheritance - INTEGER
	// VDegree: protected int a1;   VDegree - java inheritance - INTEGER
	// ControlPointsList: protected AaIfccartesianpoint a2;   ControlPointsList - java inheritance - LIST OF LIST OF ENTITY
	// SurfaceForm: protected int a3;   SurfaceForm - java inheritance - ENUMERATION IfcBSplineSurfaceForm
	// UClosed: protected int a4;   UClosed - java inheritance - LOGICAL
	// VClosed: protected int a5;   VClosed - java inheritance - LOGICAL
	// SelfIntersect: protected int a6;   SelfIntersect - java inheritance - LOGICAL
	// UUpper: protected int  - derived - java inheritance -  INTEGER
	protected static final jsdai.dictionary.CDerived_attribute d1$ = CEntity.initDerivedAttribute(definition, 1);
	// VUpper: protected int  - derived - java inheritance -  INTEGER
	protected static final jsdai.dictionary.CDerived_attribute d2$ = CEntity.initDerivedAttribute(definition, 2);
	// ControlPoints: protected AaIfccartesianpoint  - derived - java inheritance -  ARRAY OF ARRAY OF ENTITY
	protected static final jsdai.dictionary.CDerived_attribute d3$ = CEntity.initDerivedAttribute(definition, 3);
	protected A_integer a7; // UMultiplicities - current entity - LIST OF INTEGER
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	protected A_integer a8; // VMultiplicities - current entity - LIST OF INTEGER
	protected static final jsdai.dictionary.CExplicit_attribute a8$ = CEntity.initExplicitAttribute(definition, 8);
	protected A_double a9; // UKnots - current entity - LIST OF REAL
	protected static final jsdai.dictionary.CExplicit_attribute a9$ = CEntity.initExplicitAttribute(definition, 9);
	protected A_double a10; // VKnots - current entity - LIST OF REAL
	protected static final jsdai.dictionary.CExplicit_attribute a10$ = CEntity.initExplicitAttribute(definition, 10);
	protected int a11; // KnotSpec - current entity - ENUMERATION IfcKnotType
	protected static final jsdai.dictionary.CExplicit_attribute a11$ = CEntity.initExplicitAttribute(definition, 11);
	// KnotVUpper: protected int  - derived - current -  INTEGER
	protected static final jsdai.dictionary.CDerived_attribute d4$ = CEntity.initDerivedAttribute(definition, 4);
	// KnotUUpper: protected int  - derived - current -  INTEGER
	protected static final jsdai.dictionary.CDerived_attribute d5$ = CEntity.initDerivedAttribute(definition, 5);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// Dim - derived - java inheritance
	// protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
	// UDegree - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected int a0;
	// VDegree - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected int a1;
	// ControlPointsList - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	// protected AaIfccartesianpoint a2;
	// SurfaceForm - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	// protected int a3;
	// UClosed - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	// protected int a4;
	// VClosed - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	// protected int a5;
	// SelfIntersect - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	// protected int a6;
	// UUpper - derived - java inheritance
	// protected static final jsdai.dictionary.CDerived_attribute d1$ = CEntity.initDerivedAttribute(definition, 1);
	// VUpper - derived - java inheritance
	// protected static final jsdai.dictionary.CDerived_attribute d2$ = CEntity.initDerivedAttribute(definition, 2);
	// ControlPoints - derived - java inheritance
	// protected static final jsdai.dictionary.CDerived_attribute d3$ = CEntity.initDerivedAttribute(definition, 3);
	// UMultiplicities - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	protected A_integer a7;
	// VMultiplicities - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a8$ = CEntity.initExplicitAttribute(definition, 8);
	protected A_integer a8;
	// UKnots - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a9$ = CEntity.initExplicitAttribute(definition, 9);
	protected A_double a9;
	// VKnots - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a10$ = CEntity.initExplicitAttribute(definition, 10);
	protected A_double a10;
	// KnotSpec - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a11$ = CEntity.initExplicitAttribute(definition, 11);
	protected int a11;
	// KnotVUpper - derived - current entity
	protected static final jsdai.dictionary.CDerived_attribute d4$ = CEntity.initDerivedAttribute(definition, 4);
	// KnotUUpper - derived - current entity
	protected static final jsdai.dictionary.CDerived_attribute d5$ = CEntity.initDerivedAttribute(definition, 5);

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

	//going through all the attributes: #3404=EXPLICIT_ATTRIBUTE('UDegree',#3402,0,#2,$,.F.);
	//<01> generating methods for consolidated attribute:  UDegree
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3405=EXPLICIT_ATTRIBUTE('VDegree',#3402,1,#2,$,.F.);
	//<01> generating methods for consolidated attribute:  VDegree
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3406=EXPLICIT_ATTRIBUTE('ControlPointsList',#3402,2,#6834,$,.F.);
	//<01> generating methods for consolidated attribute:  ControlPointsList
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// methods for attribute: ControlPointsList, base type: LIST OF LIST OF ENTITY
	public static int usedinControlpointslist(EIfcbsplinesurface type, EIfccartesianpoint instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a2$, domain, result);
	}
	//going through all the attributes: #3407=EXPLICIT_ATTRIBUTE('SurfaceForm',#3402,3,#2729,$,.F.);
	//<01> generating methods for consolidated attribute:  SurfaceForm
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3408=EXPLICIT_ATTRIBUTE('UClosed',#3402,4,#5,$,.F.);
	//<01> generating methods for consolidated attribute:  UClosed
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3409=EXPLICIT_ATTRIBUTE('VClosed',#3402,5,#5,$,.F.);
	//<01> generating methods for consolidated attribute:  VClosed
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3410=EXPLICIT_ATTRIBUTE('SelfIntersect',#3402,6,#5,$,.F.);
	//<01> generating methods for consolidated attribute:  SelfIntersect
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3411=DERIVED_ATTRIBUTE('UUpper',#3402,0,#2,$);
	//<01> generating methods for consolidated attribute:  UUpper
	//<01-1> supertype, java inheritance
	//<01-1-1> derived
	//<01-1-1-2> NOT explicit-to-derived - generateDerivedSupertypeJavaInheritedMethodsX
	// methods for derived attribute: UUpper, base type: INTEGER
	public boolean testUupper(EIfcbsplinesurface type) throws SdaiException {
			throw new SdaiException(SdaiException.FN_NAVL);
	}
	public Value getUupper(EIfcbsplinesurface type, SdaiContext _context) throws SdaiException {



//###-01 jc.generated_java: Value.alloc().substractOrDifference(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(Value.alloc(jsdai.SIfc4.SIfc4._st_list_2_list_2_ifccartesianpoint).set(_context, get(jsdai.SIfc4.CIfcbsplinesurface.attributeControlpointslist(null)))), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1))
				return (Value.alloc().substractOrDifference(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(Value.alloc(jsdai.SIfc4.SIfc4._st_list_2_list_2_ifccartesianpoint).set(_context, get(jsdai.SIfc4.CIfcbsplinesurface.attributeControlpointslist(null)))), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1)));
	}
	public int getUupper(EIfcbsplinesurface type) throws SdaiException {
		SdaiContext _context = this.findEntityInstanceSdaiModel().getRepository().getSession().getSdaiContext();
			return getUupper((EIfcbsplinesurface)null, _context).getInteger();
	}
	public static jsdai.dictionary.EAttribute attributeUupper(EIfcbsplinesurface type) throws SdaiException {
		return d1$;
	}

	//going through all the attributes: #3412=DERIVED_ATTRIBUTE('VUpper',#3402,1,#2,$);
	//<01> generating methods for consolidated attribute:  VUpper
	//<01-1> supertype, java inheritance
	//<01-1-1> derived
	//<01-1-1-2> NOT explicit-to-derived - generateDerivedSupertypeJavaInheritedMethodsX
	// methods for derived attribute: VUpper, base type: INTEGER
	public boolean testVupper(EIfcbsplinesurface type) throws SdaiException {
			throw new SdaiException(SdaiException.FN_NAVL);
	}
	public Value getVupper(EIfcbsplinesurface type, SdaiContext _context) throws SdaiException {



//###-01 jc.generated_java: Value.alloc().substractOrDifference(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(Value.alloc(jsdai.SIfc4.SIfc4._st_list_2_list_2_ifccartesianpoint).set(_context, get(jsdai.SIfc4.CIfcbsplinesurface.attributeControlpointslist(null))).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null)), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1))
				return (Value.alloc().substractOrDifference(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(Value.alloc(jsdai.SIfc4.SIfc4._st_list_2_list_2_ifccartesianpoint).set(_context, get(jsdai.SIfc4.CIfcbsplinesurface.attributeControlpointslist(null))).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null)), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1)));
	}
	public int getVupper(EIfcbsplinesurface type) throws SdaiException {
		SdaiContext _context = this.findEntityInstanceSdaiModel().getRepository().getSession().getSdaiContext();
			return getVupper((EIfcbsplinesurface)null, _context).getInteger();
	}
	public static jsdai.dictionary.EAttribute attributeVupper(EIfcbsplinesurface type) throws SdaiException {
		return d2$;
	}

	//going through all the attributes: #3413=DERIVED_ATTRIBUTE('ControlPoints',#3402,2,#6836,$);
	//<01> generating methods for consolidated attribute:  ControlPoints
	//<01-1> supertype, java inheritance
	//<01-1-1> derived
	//<01-1-1-2> NOT explicit-to-derived - generateDerivedSupertypeJavaInheritedMethodsX
	// derived attribute: ControlPoints, base type: entity IfcCartesianPoint
	public boolean testControlpoints(EIfcbsplinesurface type) throws SdaiException {
			throw new SdaiException(SdaiException.FN_NAVL);
	}
	public AaIfccartesianpoint getControlpoints(EIfcbsplinesurface type) throws SdaiException {
		SdaiContext _context = this.findEntityInstanceSdaiModel().getRepository().getSession().getSdaiContext();
			return (AaIfccartesianpoint) getControlpoints((EIfcbsplinesurface)null, _context).getInstanceAggregate(this);
	}
	public Value getControlpoints(EIfcbsplinesurface type, SdaiContext _context) throws SdaiException {







//###-01 jc.generated_java: (new jsdai.SIfc4.FIfcmakearrayofarray()).run(_context, Value.alloc(jsdai.SIfc4.SIfc4._st_list_2_list_2_ifccartesianpoint).set(_context, get(jsdai.SIfc4.CIfcbsplinesurface.attributeControlpointslist(null))), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 0), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, get(jsdai.SIfc4.CIfcbsplinesurface.attributeUupper(null))), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 0), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, get(jsdai.SIfc4.CIfcbsplinesurface.attributeVupper(null))))
				return ((new jsdai.SIfc4.FIfcmakearrayofarray()).run(_context, Value.alloc(jsdai.SIfc4.SIfc4._st_list_2_list_2_ifccartesianpoint).set(_context, get(jsdai.SIfc4.CIfcbsplinesurface.attributeControlpointslist(null))), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 0), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, get(jsdai.SIfc4.CIfcbsplinesurface.attributeUupper(null))), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 0), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, get(jsdai.SIfc4.CIfcbsplinesurface.attributeVupper(null)))));
	}
	public static jsdai.dictionary.EAttribute attributeControlpoints(EIfcbsplinesurface type) throws SdaiException {
		return d3$;
	}

	//going through all the attributes: #3416=EXPLICIT_ATTRIBUTE('UMultiplicities',#3414,0,#6838,$,.F.);
	//<01> generating methods for consolidated attribute:  UMultiplicities
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: UMultiplicities, base type: LIST OF INTEGER
	public boolean testUmultiplicities(EIfcbsplinesurfacewithknots type) throws SdaiException {
		return test_aggregate(a7);
	}
	public A_integer getUmultiplicities(EIfcbsplinesurfacewithknots type) throws SdaiException {
		return (A_integer)get_aggregate(a7);
	}
	public A_integer createUmultiplicities(EIfcbsplinesurfacewithknots type) throws SdaiException {
		a7 = create_aggregate_integer(a7, a7$, 0);
		return a7;
	}
	public void unsetUmultiplicities(EIfcbsplinesurfacewithknots type) throws SdaiException {
		unset_aggregate(a7);
		a7 = null;
	}
	public static jsdai.dictionary.EAttribute attributeUmultiplicities(EIfcbsplinesurfacewithknots type) throws SdaiException {
		return a7$;
	}

	//going through all the attributes: #3417=EXPLICIT_ATTRIBUTE('VMultiplicities',#3414,1,#6839,$,.F.);
	//<01> generating methods for consolidated attribute:  VMultiplicities
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: VMultiplicities, base type: LIST OF INTEGER
	public boolean testVmultiplicities(EIfcbsplinesurfacewithknots type) throws SdaiException {
		return test_aggregate(a8);
	}
	public A_integer getVmultiplicities(EIfcbsplinesurfacewithknots type) throws SdaiException {
		return (A_integer)get_aggregate(a8);
	}
	public A_integer createVmultiplicities(EIfcbsplinesurfacewithknots type) throws SdaiException {
		a8 = create_aggregate_integer(a8, a8$, 0);
		return a8;
	}
	public void unsetVmultiplicities(EIfcbsplinesurfacewithknots type) throws SdaiException {
		unset_aggregate(a8);
		a8 = null;
	}
	public static jsdai.dictionary.EAttribute attributeVmultiplicities(EIfcbsplinesurfacewithknots type) throws SdaiException {
		return a8$;
	}

	//going through all the attributes: #3418=EXPLICIT_ATTRIBUTE('UKnots',#3414,2,#6840,$,.F.);
	//<01> generating methods for consolidated attribute:  UKnots
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: UKnots, base type: LIST OF REAL
	public boolean testUknots(EIfcbsplinesurfacewithknots type) throws SdaiException {
		return test_aggregate(a9);
	}
	public A_double getUknots(EIfcbsplinesurfacewithknots type) throws SdaiException {
		return (A_double)get_aggregate(a9);
	}
	public A_double createUknots(EIfcbsplinesurfacewithknots type) throws SdaiException {
		a9 = create_aggregate_double(a9, a9$, 0);
		return a9;
	}
	public void unsetUknots(EIfcbsplinesurfacewithknots type) throws SdaiException {
		unset_aggregate(a9);
		a9 = null;
	}
	public static jsdai.dictionary.EAttribute attributeUknots(EIfcbsplinesurfacewithknots type) throws SdaiException {
		return a9$;
	}

	//going through all the attributes: #3419=EXPLICIT_ATTRIBUTE('VKnots',#3414,3,#6841,$,.F.);
	//<01> generating methods for consolidated attribute:  VKnots
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: VKnots, base type: LIST OF REAL
	public boolean testVknots(EIfcbsplinesurfacewithknots type) throws SdaiException {
		return test_aggregate(a10);
	}
	public A_double getVknots(EIfcbsplinesurfacewithknots type) throws SdaiException {
		return (A_double)get_aggregate(a10);
	}
	public A_double createVknots(EIfcbsplinesurfacewithknots type) throws SdaiException {
		a10 = create_aggregate_double(a10, a10$, 0);
		return a10;
	}
	public void unsetVknots(EIfcbsplinesurfacewithknots type) throws SdaiException {
		unset_aggregate(a10);
		a10 = null;
	}
	public static jsdai.dictionary.EAttribute attributeVknots(EIfcbsplinesurfacewithknots type) throws SdaiException {
		return a10$;
	}

	//going through all the attributes: #3420=EXPLICIT_ATTRIBUTE('KnotSpec',#3414,4,#2905,$,.F.);
	//<01> generating methods for consolidated attribute:  KnotSpec
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute:KnotSpec, base type: ENUMERATION
	public boolean testKnotspec(EIfcbsplinesurfacewithknots type) throws SdaiException {
		return test_enumeration(a11);
	}
	public int getKnotspec(EIfcbsplinesurfacewithknots type) throws SdaiException {
		return get_enumeration(a11);
	}
	public void setKnotspec(EIfcbsplinesurfacewithknots type, int value) throws SdaiException {
		a11 = set_enumeration(value, a11$);
	}
	public void unsetKnotspec(EIfcbsplinesurfacewithknots type) throws SdaiException {
		a11 = unset_enumeration();
	}
	public static jsdai.dictionary.EAttribute attributeKnotspec(EIfcbsplinesurfacewithknots type) throws SdaiException {
		return a11$;
	}

	//going through all the attributes: #3421=DERIVED_ATTRIBUTE('KnotVUpper',#3414,0,#2,$);
	//<01> generating methods for consolidated attribute:  KnotVUpper
	//<01-0> current entity
	//<01-0-1> derived attribute
	//<01-0-1-1> NOT explicit-to-derived - generateDerivedCurrentEntityMethodsX()
	// methods for derived attribute: KnotVUpper, base type: INTEGER
	public boolean testKnotvupper(EIfcbsplinesurfacewithknots type) throws SdaiException {
			throw new SdaiException(SdaiException.FN_NAVL);
	}
	public Value getKnotvupper(EIfcbsplinesurfacewithknots type, SdaiContext _context) throws SdaiException {



//###-01 jc.generated_java: Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(Value.alloc(jsdai.SIfc4.SIfc4._st_list_2_ifcparametervalue).set(_context, get(a10$)))
				return (Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(Value.alloc(jsdai.SIfc4.SIfc4._st_list_2_ifcparametervalue).set(_context, get(a10$))));
	}
	public int getKnotvupper(EIfcbsplinesurfacewithknots type) throws SdaiException {
		SdaiContext _context = this.findEntityInstanceSdaiModel().getRepository().getSession().getSdaiContext();
			return getKnotvupper((EIfcbsplinesurfacewithknots)null, _context).getInteger();
	}
	public static jsdai.dictionary.EAttribute attributeKnotvupper(EIfcbsplinesurfacewithknots type) throws SdaiException {
		return d4$;
	}

	//going through all the attributes: #3422=DERIVED_ATTRIBUTE('KnotUUpper',#3414,1,#2,$);
	//<01> generating methods for consolidated attribute:  KnotUUpper
	//<01-0> current entity
	//<01-0-1> derived attribute
	//<01-0-1-1> NOT explicit-to-derived - generateDerivedCurrentEntityMethodsX()
	// methods for derived attribute: KnotUUpper, base type: INTEGER
	public boolean testKnotuupper(EIfcbsplinesurfacewithknots type) throws SdaiException {
			throw new SdaiException(SdaiException.FN_NAVL);
	}
	public Value getKnotuupper(EIfcbsplinesurfacewithknots type, SdaiContext _context) throws SdaiException {



//###-01 jc.generated_java: Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(Value.alloc(jsdai.SIfc4.SIfc4._st_list_2_ifcparametervalue).set(_context, get(a9$)))
				return (Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(Value.alloc(jsdai.SIfc4.SIfc4._st_list_2_ifcparametervalue).set(_context, get(a9$))));
	}
	public int getKnotuupper(EIfcbsplinesurfacewithknots type) throws SdaiException {
		SdaiContext _context = this.findEntityInstanceSdaiModel().getRepository().getSession().getSdaiContext();
			return getKnotuupper((EIfcbsplinesurfacewithknots)null, _context).getInteger();
	}
	public static jsdai.dictionary.EAttribute attributeKnotuupper(EIfcbsplinesurfacewithknots type) throws SdaiException {
		return d5$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = Integer.MIN_VALUE;
			a1 = Integer.MIN_VALUE;
			if (a2 instanceof CAggregate)
				a2.unsetAll();
			a2 = null;
			a3 = 0;
			a4 = 0;
			a5 = 0;
			a6 = 0;
			a11 = 0;
			return;
		}
		a0 = av.entityValues[1].getInteger(0);
		a1 = av.entityValues[1].getInteger(1);
		a2 = (AaIfccartesianpoint)av.entityValues[1].getInstanceAggregate(2, a2$, this);
		a3 = av.entityValues[1].getEnumeration(3, a3$);
		a4 = av.entityValues[1].getLogical(4);
		a5 = av.entityValues[1].getLogical(5);
		a6 = av.entityValues[1].getLogical(6);
		a7 = av.entityValues[2].getIntegerAggregate(0, a7$, this);
		a8 = av.entityValues[2].getIntegerAggregate(1, a8$, this);
		a9 = av.entityValues[2].getDoubleAggregate(2, a9$, this);
		a10 = av.entityValues[2].getDoubleAggregate(3, a10$, this);
		a11 = av.entityValues[2].getEnumeration(4, a11$);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = Integer.MIN_VALUE;
			a1 = Integer.MIN_VALUE;
			if (a2 instanceof CAggregate)
				a2.unsetAll();
			a2 = null;
			a3 = 0;
			a4 = 0;
			a5 = 0;
			a6 = 0;
			a11 = 0;
			return;
		}
		a0 = av.entityValues[1].getInteger(0);
		a1 = av.entityValues[1].getInteger(1);
		a2 = (AaIfccartesianpoint)av.entityValues[1].getInstanceAggregate(2, a2$, this);
		a3 = av.entityValues[1].getEnumeration(3, a3$);
		a4 = av.entityValues[1].getLogical(4);
		a5 = av.entityValues[1].getLogical(5);
		a6 = av.entityValues[1].getLogical(6);
		a7 = av.entityValues[2].getIntegerAggregate(0, a7$, this);
		a8 = av.entityValues[2].getIntegerAggregate(1, a8$, this);
		a9 = av.entityValues[2].getDoubleAggregate(2, a9$, this);
		a10 = av.entityValues[2].getDoubleAggregate(3, a10$, this);
		a11 = av.entityValues[2].getEnumeration(4, a11$);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcBoundedSurface
		// partial entity: IfcBSplineSurface
		av.entityValues[1].setInteger(0, a0);
		av.entityValues[1].setInteger(1, a1);
		av.entityValues[1].setInstanceAggregate(2, a2);
		av.entityValues[1].setEnumeration(3, a3, a3$);
		av.entityValues[1].setLogical(4, a4);
		av.entityValues[1].setLogical(5, a5);
		av.entityValues[1].setLogical(6, a6);
		// partial entity: IfcBSplineSurfaceWithKnots
		av.entityValues[2].setIntegerAggregate(0, a7);
		av.entityValues[2].setIntegerAggregate(1, a8);
		av.entityValues[2].setDoubleAggregate(2, a9);
		av.entityValues[2].setDoubleAggregate(3, a10);
		av.entityValues[2].setEnumeration(4, a11, a11$);
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
		// partial entity: IfcSurface
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcBoundedSurface
		// partial entity: IfcBSplineSurface
		av.entityValues[1].setInteger(0, a0);
		av.entityValues[1].setInteger(1, a1);
		av.entityValues[1].setInstanceAggregate(2, a2);
		av.entityValues[1].setEnumeration(3, a3, a3$);
		av.entityValues[1].setLogical(4, a4);
		av.entityValues[1].setLogical(5, a5);
		av.entityValues[1].setLogical(6, a6);
		// partial entity: IfcBSplineSurfaceWithKnots
		av.entityValues[2].setIntegerAggregate(0, a7);
		av.entityValues[2].setIntegerAggregate(1, a8);
		av.entityValues[2].setDoubleAggregate(2, a9);
		av.entityValues[2].setDoubleAggregate(3, a10);
		av.entityValues[2].setEnumeration(4, a11, a11$);
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
		// partial entity: IfcSurface
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfcbsplinesurfacewithknotsUdirectionconstraints(SdaiContext _context) throws SdaiException {
	







		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, (new jsdai.SIfc4.FIfcconstraintsparambspline()).run(_context, Value.alloc(jsdai.SIfc4.CIfcbsplinesurfacewithknots.definition).set(_context, this).groupReference(_context, jsdai.SIfc4.CIfcbsplinesurface.class).getAttribute(jsdai.SIfc4.CIfcbsplinesurface.attributeUdegree(null), _context), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, get(d5$)), Value.alloc(jsdai.SIfc4.CIfcbsplinesurfacewithknots.definition).set(_context, this).groupReference(_context, jsdai.SIfc4.CIfcbsplinesurface.class).getAttribute(jsdai.SIfc4.CIfcbsplinesurface.attributeUupper(null), _context), Value.alloc(jsdai.SIfc4.SIfc4._st_list_2_integer).set(_context, get(a7$)), Value.alloc(jsdai.SIfc4.SIfc4._st_list_2_ifcparametervalue).set(_context, get(a9$)))).getLogical());
	}
	public int rIfcbsplinesurfacewithknotsVdirectionconstraints(SdaiContext _context) throws SdaiException {
	







		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, (new jsdai.SIfc4.FIfcconstraintsparambspline()).run(_context, Value.alloc(jsdai.SIfc4.CIfcbsplinesurfacewithknots.definition).set(_context, this).groupReference(_context, jsdai.SIfc4.CIfcbsplinesurface.class).getAttribute(jsdai.SIfc4.CIfcbsplinesurface.attributeVdegree(null), _context), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, get(d4$)), Value.alloc(jsdai.SIfc4.CIfcbsplinesurfacewithknots.definition).set(_context, this).groupReference(_context, jsdai.SIfc4.CIfcbsplinesurface.class).getAttribute(jsdai.SIfc4.CIfcbsplinesurface.attributeVupper(null), _context), Value.alloc(jsdai.SIfc4.SIfc4._st_list_2_integer).set(_context, get(a8$)), Value.alloc(jsdai.SIfc4.SIfc4._st_list_2_ifcparametervalue).set(_context, get(a10$)))).getLogical());
	}
	public int rIfcbsplinesurfacewithknotsCorrespondingulists(SdaiContext _context) throws SdaiException {
	




		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(Value.alloc(jsdai.SIfc4.SIfc4._st_list_2_integer).set(_context, get(a7$))), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, get(d5$)))).getLogical());
	}
	public int rIfcbsplinesurfacewithknotsCorrespondingvlists(SdaiContext _context) throws SdaiException {
	




		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(Value.alloc(jsdai.SIfc4.SIfc4._st_list_2_integer).set(_context, get(a8$))), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, get(d4$)))).getLogical());
	}
}
