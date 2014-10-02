/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcBSplineSurface

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcbsplinesurface extends CIfcboundedsurface implements EIfcbsplinesurface {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcbsplinesurface.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	// Dim: protected int  - derived - java inheritance -  INTEGER
	protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
	protected int a0; // UDegree - current entity - INTEGER
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected int a1; // VDegree - current entity - INTEGER
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected AaIfccartesianpoint a2; // ControlPointsList - current entity - LIST OF LIST OF ENTITY
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected int a3; // SurfaceForm - current entity - ENUMERATION IfcBSplineSurfaceForm
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected int a4; // UClosed - current entity - LOGICAL
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected int a5; // VClosed - current entity - LOGICAL
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected int a6; // SelfIntersect - current entity - LOGICAL
	protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	// UUpper: protected int  - derived - current -  INTEGER
	protected static final jsdai.dictionary.CDerived_attribute d1$ = CEntity.initDerivedAttribute(definition, 1);
	// VUpper: protected int  - derived - current -  INTEGER
	protected static final jsdai.dictionary.CDerived_attribute d2$ = CEntity.initDerivedAttribute(definition, 2);
	// ControlPoints: protected AaIfccartesianpoint  - derived - current -  ARRAY OF ARRAY OF ENTITY
	protected static final jsdai.dictionary.CDerived_attribute d3$ = CEntity.initDerivedAttribute(definition, 3);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// Dim - derived - java inheritance
	// protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
	// UDegree - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected int a0;
	// VDegree - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected int a1;
	// ControlPointsList - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected AaIfccartesianpoint a2;
	// SurfaceForm - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected int a3;
	// UClosed - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected int a4;
	// VClosed - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected int a5;
	// SelfIntersect - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	protected int a6;
	// UUpper - derived - current entity
	protected static final jsdai.dictionary.CDerived_attribute d1$ = CEntity.initDerivedAttribute(definition, 1);
	// VUpper - derived - current entity
	protected static final jsdai.dictionary.CDerived_attribute d2$ = CEntity.initDerivedAttribute(definition, 2);
	// ControlPoints - derived - current entity
	protected static final jsdai.dictionary.CDerived_attribute d3$ = CEntity.initDerivedAttribute(definition, 3);

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		changeReferencesAggregate(a2, old, newer);
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		changeReferencesAggregate(a2, old, newer);
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
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: UDegree, base type: INTEGER
	public boolean testUdegree(EIfcbsplinesurface type) throws SdaiException {
		return test_integer(a0);
	}
	public int getUdegree(EIfcbsplinesurface type) throws SdaiException {
		return get_integer(a0);
	}
	public void setUdegree(EIfcbsplinesurface type, int value) throws SdaiException {
		a0 = set_integer(value);
	}
	public void unsetUdegree(EIfcbsplinesurface type) throws SdaiException {
		a0 = unset_integer();
	}
	public static jsdai.dictionary.EAttribute attributeUdegree(EIfcbsplinesurface type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #3405=EXPLICIT_ATTRIBUTE('VDegree',#3402,1,#2,$,.F.);
	//<01> generating methods for consolidated attribute:  VDegree
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: VDegree, base type: INTEGER
	public boolean testVdegree(EIfcbsplinesurface type) throws SdaiException {
		return test_integer(a1);
	}
	public int getVdegree(EIfcbsplinesurface type) throws SdaiException {
		return get_integer(a1);
	}
	public void setVdegree(EIfcbsplinesurface type, int value) throws SdaiException {
		a1 = set_integer(value);
	}
	public void unsetVdegree(EIfcbsplinesurface type) throws SdaiException {
		a1 = unset_integer();
	}
	public static jsdai.dictionary.EAttribute attributeVdegree(EIfcbsplinesurface type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #3406=EXPLICIT_ATTRIBUTE('ControlPointsList',#3402,2,#6834,$,.F.);
	//<01> generating methods for consolidated attribute:  ControlPointsList
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: ControlPointsList, base type: LIST OF LIST OF ENTITY
	public static int usedinControlpointslist(EIfcbsplinesurface type, EIfccartesianpoint instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a2$, domain, result);
	}
	public boolean testControlpointslist(EIfcbsplinesurface type) throws SdaiException {
		return test_aggregate(a2);
	}
	public AaIfccartesianpoint getControlpointslist(EIfcbsplinesurface type) throws SdaiException {
		return (AaIfccartesianpoint)get_aggregate(a2);
	}
	public AaIfccartesianpoint createControlpointslist(EIfcbsplinesurface type) throws SdaiException {
		a2 = (AaIfccartesianpoint)create_aggregate_class(a2, a2$,  AaIfccartesianpoint.class, 0);
		return a2;
	}
	public void unsetControlpointslist(EIfcbsplinesurface type) throws SdaiException {
		unset_aggregate(a2);
		a2 = null;
	}
	public static jsdai.dictionary.EAttribute attributeControlpointslist(EIfcbsplinesurface type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #3407=EXPLICIT_ATTRIBUTE('SurfaceForm',#3402,3,#2729,$,.F.);
	//<01> generating methods for consolidated attribute:  SurfaceForm
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute:SurfaceForm, base type: ENUMERATION
	public boolean testSurfaceform(EIfcbsplinesurface type) throws SdaiException {
		return test_enumeration(a3);
	}
	public int getSurfaceform(EIfcbsplinesurface type) throws SdaiException {
		return get_enumeration(a3);
	}
	public void setSurfaceform(EIfcbsplinesurface type, int value) throws SdaiException {
		a3 = set_enumeration(value, a3$);
	}
	public void unsetSurfaceform(EIfcbsplinesurface type) throws SdaiException {
		a3 = unset_enumeration();
	}
	public static jsdai.dictionary.EAttribute attributeSurfaceform(EIfcbsplinesurface type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #3408=EXPLICIT_ATTRIBUTE('UClosed',#3402,4,#5,$,.F.);
	//<01> generating methods for consolidated attribute:  UClosed
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: UClosed, base type: LOGICAL
	public boolean testUclosed(EIfcbsplinesurface type) throws SdaiException {
		return test_logical(a4);
	}
	public int getUclosed(EIfcbsplinesurface type) throws SdaiException {
		return get_logical(a4);
	}
	public void setUclosed(EIfcbsplinesurface type, int value) throws SdaiException {
		a4 = set_logical(value);
	}
	public void unsetUclosed(EIfcbsplinesurface type) throws SdaiException {
		a4 = unset_logical();
	}
	public static jsdai.dictionary.EAttribute attributeUclosed(EIfcbsplinesurface type) throws SdaiException {
		return a4$;
	}

	//going through all the attributes: #3409=EXPLICIT_ATTRIBUTE('VClosed',#3402,5,#5,$,.F.);
	//<01> generating methods for consolidated attribute:  VClosed
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: VClosed, base type: LOGICAL
	public boolean testVclosed(EIfcbsplinesurface type) throws SdaiException {
		return test_logical(a5);
	}
	public int getVclosed(EIfcbsplinesurface type) throws SdaiException {
		return get_logical(a5);
	}
	public void setVclosed(EIfcbsplinesurface type, int value) throws SdaiException {
		a5 = set_logical(value);
	}
	public void unsetVclosed(EIfcbsplinesurface type) throws SdaiException {
		a5 = unset_logical();
	}
	public static jsdai.dictionary.EAttribute attributeVclosed(EIfcbsplinesurface type) throws SdaiException {
		return a5$;
	}

	//going through all the attributes: #3410=EXPLICIT_ATTRIBUTE('SelfIntersect',#3402,6,#5,$,.F.);
	//<01> generating methods for consolidated attribute:  SelfIntersect
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: SelfIntersect, base type: LOGICAL
	public boolean testSelfintersect(EIfcbsplinesurface type) throws SdaiException {
		return test_logical(a6);
	}
	public int getSelfintersect(EIfcbsplinesurface type) throws SdaiException {
		return get_logical(a6);
	}
	public void setSelfintersect(EIfcbsplinesurface type, int value) throws SdaiException {
		a6 = set_logical(value);
	}
	public void unsetSelfintersect(EIfcbsplinesurface type) throws SdaiException {
		a6 = unset_logical();
	}
	public static jsdai.dictionary.EAttribute attributeSelfintersect(EIfcbsplinesurface type) throws SdaiException {
		return a6$;
	}

	//going through all the attributes: #3411=DERIVED_ATTRIBUTE('UUpper',#3402,0,#2,$);
	//<01> generating methods for consolidated attribute:  UUpper
	//<01-0> current entity
	//<01-0-1> derived attribute
	//<01-0-1-1> NOT explicit-to-derived - generateDerivedCurrentEntityMethodsX()
	// methods for derived attribute: UUpper, base type: INTEGER
	public boolean testUupper(EIfcbsplinesurface type) throws SdaiException {
			throw new SdaiException(SdaiException.FN_NAVL);
	}
	public Value getUupper(EIfcbsplinesurface type, SdaiContext _context) throws SdaiException {



//###-01 jc.generated_java: Value.alloc().substractOrDifference(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(Value.alloc(jsdai.SIfc4.SIfc4._st_list_2_list_2_ifccartesianpoint).set(_context, get(a2$))), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1))
				return (Value.alloc().substractOrDifference(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(Value.alloc(jsdai.SIfc4.SIfc4._st_list_2_list_2_ifccartesianpoint).set(_context, get(a2$))), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1)));
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
	//<01-0> current entity
	//<01-0-1> derived attribute
	//<01-0-1-1> NOT explicit-to-derived - generateDerivedCurrentEntityMethodsX()
	// methods for derived attribute: VUpper, base type: INTEGER
	public boolean testVupper(EIfcbsplinesurface type) throws SdaiException {
			throw new SdaiException(SdaiException.FN_NAVL);
	}
	public Value getVupper(EIfcbsplinesurface type, SdaiContext _context) throws SdaiException {



//###-01 jc.generated_java: Value.alloc().substractOrDifference(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(Value.alloc(jsdai.SIfc4.SIfc4._st_list_2_list_2_ifccartesianpoint).set(_context, get(a2$)).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null)), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1))
				return (Value.alloc().substractOrDifference(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(Value.alloc(jsdai.SIfc4.SIfc4._st_list_2_list_2_ifccartesianpoint).set(_context, get(a2$)).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null)), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1)));
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
	//<01-0> current entity
	//<01-0-1> derived attribute
	//<01-0-1-1> NOT explicit-to-derived - generateDerivedCurrentEntityMethodsX()
	// derived attribute: ControlPoints, base type: entity IfcCartesianPoint
	public boolean testControlpoints(EIfcbsplinesurface type) throws SdaiException {
			throw new SdaiException(SdaiException.FN_NAVL);
	}
	public AaIfccartesianpoint getControlpoints(EIfcbsplinesurface type) throws SdaiException {
		SdaiContext _context = this.findEntityInstanceSdaiModel().getRepository().getSession().getSdaiContext();
			return (AaIfccartesianpoint) getControlpoints((EIfcbsplinesurface)null, _context).getInstanceAggregate(this);
	}
	public Value getControlpoints(EIfcbsplinesurface type, SdaiContext _context) throws SdaiException {







//###-01 jc.generated_java: (new jsdai.SIfc4.FIfcmakearrayofarray()).run(_context, Value.alloc(jsdai.SIfc4.SIfc4._st_list_2_list_2_ifccartesianpoint).set(_context, get(a2$)), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 0), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, get(d1$)), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 0), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, get(d2$)))
				return ((new jsdai.SIfc4.FIfcmakearrayofarray()).run(_context, Value.alloc(jsdai.SIfc4.SIfc4._st_list_2_list_2_ifccartesianpoint).set(_context, get(a2$)), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 0), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, get(d1$)), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 0), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, get(d2$))));
	}
	public static jsdai.dictionary.EAttribute attributeControlpoints(EIfcbsplinesurface type) throws SdaiException {
		return d3$;
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
			return;
		}
		a0 = av.entityValues[1].getInteger(0);
		a1 = av.entityValues[1].getInteger(1);
		a2 = (AaIfccartesianpoint)av.entityValues[1].getInstanceAggregate(2, a2$, this);
		a3 = av.entityValues[1].getEnumeration(3, a3$);
		a4 = av.entityValues[1].getLogical(4);
		a5 = av.entityValues[1].getLogical(5);
		a6 = av.entityValues[1].getLogical(6);
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
			return;
		}
		a0 = av.entityValues[1].getInteger(0);
		a1 = av.entityValues[1].getInteger(1);
		a2 = (AaIfccartesianpoint)av.entityValues[1].getInstanceAggregate(2, a2$, this);
		a3 = av.entityValues[1].getEnumeration(3, a3$);
		a4 = av.entityValues[1].getLogical(4);
		a5 = av.entityValues[1].getLogical(5);
		a6 = av.entityValues[1].getLogical(6);
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
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
		// partial entity: IfcSurface
	}

	/*---- population dependent bound*/

	/*---- population dependent bound*/
}