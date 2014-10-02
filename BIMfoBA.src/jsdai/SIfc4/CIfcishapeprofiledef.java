/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcIShapeProfileDef

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcishapeprofiledef extends CIfcparameterizedprofiledef implements EIfcishapeprofiledef {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcishapeprofiledef.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// ProfileType: protected int a0;   ProfileType - java inheritance - ENUMERATION IfcProfileTypeEnum
	// ProfileName: protected String a1;   ProfileName - java inheritance - STRING
	// HasExternalReference: protected Object  - inverse - java inheritance -  ENTITY IfcExternalReferenceRelationship
	// HasProperties: protected Object  - inverse - java inheritance -  ENTITY IfcProfileProperties
	// Position: protected Object a2;   Position - java inheritance - ENTITY IfcAxis2Placement2D
	protected double a3; // OverallWidth - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected double a4; // OverallDepth - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected double a5; // WebThickness - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected double a6; // FlangeThickness - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	protected double a7; // FilletRadius - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	protected double a8; // FlangeEdgeRadius - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a8$ = CEntity.initExplicitAttribute(definition, 8);
	protected double a9; // FlangeSlope - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a9$ = CEntity.initExplicitAttribute(definition, 9);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// ProfileType - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected int a0;
	// ProfileName - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected String a1;
	// HasExternalReference - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// HasProperties - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// Position - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	// protected Object a2;
	// OverallWidth - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected double a3;
	// OverallDepth - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected double a4;
	// WebThickness - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected double a5;
	// FlangeThickness - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	protected double a6;
	// FilletRadius - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	protected double a7;
	// FlangeEdgeRadius - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a8$ = CEntity.initExplicitAttribute(definition, 8);
	protected double a8;
	// FlangeSlope - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a9$ = CEntity.initExplicitAttribute(definition, 9);
	protected double a9;

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

	//going through all the attributes: #5070=EXPLICIT_ATTRIBUTE('ProfileType',#5068,0,#2963,$,.F.);
	//<01> generating methods for consolidated attribute:  ProfileType
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5071=EXPLICIT_ATTRIBUTE('ProfileName',#5068,1,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  ProfileName
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5072=INVERSE_ATTRIBUTE('HasExternalReference',#5068,0,#4231,$,#4234,#8892,$,.F.);
	//<01> generating methods for consolidated attribute:  HasExternalReference
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5073=INVERSE_ATTRIBUTE('HasProperties',#5068,1,#5074,$,#5076,#8894,$,.F.);
	//<01> generating methods for consolidated attribute:  HasProperties
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4870=EXPLICIT_ATTRIBUTE('Position',#4868,0,#3378,$,.T.);
	//<01> generating methods for consolidated attribute:  Position
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): Position, base type: entity IfcAxis2Placement2D
	public static int usedinPosition(EIfcparameterizedprofiledef type, EIfcaxis2placement2d instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a2$, domain, result);
	}
	//going through all the attributes: #4469=EXPLICIT_ATTRIBUTE('OverallWidth',#4467,0,#2605,$,.F.);
	//<01> generating methods for consolidated attribute:  OverallWidth
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: OverallWidth, base type: REAL
	public boolean testOverallwidth(EIfcishapeprofiledef type) throws SdaiException {
		return test_double(a3);
	}
	public double getOverallwidth(EIfcishapeprofiledef type) throws SdaiException {
		return get_double(a3);
	}
	public void setOverallwidth(EIfcishapeprofiledef type, double value) throws SdaiException {
		a3 = set_double(value);
	}
	public void unsetOverallwidth(EIfcishapeprofiledef type) throws SdaiException {
		a3 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeOverallwidth(EIfcishapeprofiledef type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #4470=EXPLICIT_ATTRIBUTE('OverallDepth',#4467,1,#2605,$,.F.);
	//<01> generating methods for consolidated attribute:  OverallDepth
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: OverallDepth, base type: REAL
	public boolean testOveralldepth(EIfcishapeprofiledef type) throws SdaiException {
		return test_double(a4);
	}
	public double getOveralldepth(EIfcishapeprofiledef type) throws SdaiException {
		return get_double(a4);
	}
	public void setOveralldepth(EIfcishapeprofiledef type, double value) throws SdaiException {
		a4 = set_double(value);
	}
	public void unsetOveralldepth(EIfcishapeprofiledef type) throws SdaiException {
		a4 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeOveralldepth(EIfcishapeprofiledef type) throws SdaiException {
		return a4$;
	}

	//going through all the attributes: #4471=EXPLICIT_ATTRIBUTE('WebThickness',#4467,2,#2605,$,.F.);
	//<01> generating methods for consolidated attribute:  WebThickness
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: WebThickness, base type: REAL
	public boolean testWebthickness(EIfcishapeprofiledef type) throws SdaiException {
		return test_double(a5);
	}
	public double getWebthickness(EIfcishapeprofiledef type) throws SdaiException {
		return get_double(a5);
	}
	public void setWebthickness(EIfcishapeprofiledef type, double value) throws SdaiException {
		a5 = set_double(value);
	}
	public void unsetWebthickness(EIfcishapeprofiledef type) throws SdaiException {
		a5 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeWebthickness(EIfcishapeprofiledef type) throws SdaiException {
		return a5$;
	}

	//going through all the attributes: #4472=EXPLICIT_ATTRIBUTE('FlangeThickness',#4467,3,#2605,$,.F.);
	//<01> generating methods for consolidated attribute:  FlangeThickness
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: FlangeThickness, base type: REAL
	public boolean testFlangethickness(EIfcishapeprofiledef type) throws SdaiException {
		return test_double(a6);
	}
	public double getFlangethickness(EIfcishapeprofiledef type) throws SdaiException {
		return get_double(a6);
	}
	public void setFlangethickness(EIfcishapeprofiledef type, double value) throws SdaiException {
		a6 = set_double(value);
	}
	public void unsetFlangethickness(EIfcishapeprofiledef type) throws SdaiException {
		a6 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeFlangethickness(EIfcishapeprofiledef type) throws SdaiException {
		return a6$;
	}

	//going through all the attributes: #4473=EXPLICIT_ATTRIBUTE('FilletRadius',#4467,4,#2591,$,.T.);
	//<01> generating methods for consolidated attribute:  FilletRadius
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: FilletRadius, base type: REAL
	public boolean testFilletradius(EIfcishapeprofiledef type) throws SdaiException {
		return test_double(a7);
	}
	public double getFilletradius(EIfcishapeprofiledef type) throws SdaiException {
		return get_double(a7);
	}
	public void setFilletradius(EIfcishapeprofiledef type, double value) throws SdaiException {
		a7 = set_double(value);
	}
	public void unsetFilletradius(EIfcishapeprofiledef type) throws SdaiException {
		a7 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeFilletradius(EIfcishapeprofiledef type) throws SdaiException {
		return a7$;
	}

	//going through all the attributes: #4474=EXPLICIT_ATTRIBUTE('FlangeEdgeRadius',#4467,5,#2591,$,.T.);
	//<01> generating methods for consolidated attribute:  FlangeEdgeRadius
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: FlangeEdgeRadius, base type: REAL
	public boolean testFlangeedgeradius(EIfcishapeprofiledef type) throws SdaiException {
		return test_double(a8);
	}
	public double getFlangeedgeradius(EIfcishapeprofiledef type) throws SdaiException {
		return get_double(a8);
	}
	public void setFlangeedgeradius(EIfcishapeprofiledef type, double value) throws SdaiException {
		a8 = set_double(value);
	}
	public void unsetFlangeedgeradius(EIfcishapeprofiledef type) throws SdaiException {
		a8 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeFlangeedgeradius(EIfcishapeprofiledef type) throws SdaiException {
		return a8$;
	}

	//going through all the attributes: #4475=EXPLICIT_ATTRIBUTE('FlangeSlope',#4467,6,#2603,$,.T.);
	//<01> generating methods for consolidated attribute:  FlangeSlope
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: FlangeSlope, base type: REAL
	public boolean testFlangeslope(EIfcishapeprofiledef type) throws SdaiException {
		return test_double(a9);
	}
	public double getFlangeslope(EIfcishapeprofiledef type) throws SdaiException {
		return get_double(a9);
	}
	public void setFlangeslope(EIfcishapeprofiledef type, double value) throws SdaiException {
		a9 = set_double(value);
	}
	public void unsetFlangeslope(EIfcishapeprofiledef type) throws SdaiException {
		a9 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeFlangeslope(EIfcishapeprofiledef type) throws SdaiException {
		return a9$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a3 = Double.NaN;
			a4 = Double.NaN;
			a5 = Double.NaN;
			a6 = Double.NaN;
			a7 = Double.NaN;
			a8 = Double.NaN;
			a9 = Double.NaN;
			a2 = unset_instance(a2);
			a0 = 0;
			a1 = null;
			return;
		}
		a3 = av.entityValues[0].getDouble(0);
		a4 = av.entityValues[0].getDouble(1);
		a5 = av.entityValues[0].getDouble(2);
		a6 = av.entityValues[0].getDouble(3);
		a7 = av.entityValues[0].getDouble(4);
		a8 = av.entityValues[0].getDouble(5);
		a9 = av.entityValues[0].getDouble(6);
		a2 = av.entityValues[1].getInstance(0, this, a2$);
		a0 = av.entityValues[2].getEnumeration(0, a0$);
		a1 = av.entityValues[2].getString(1);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a3 = Double.NaN;
			a4 = Double.NaN;
			a5 = Double.NaN;
			a6 = Double.NaN;
			a7 = Double.NaN;
			a8 = Double.NaN;
			a9 = Double.NaN;
			a2 = unset_instance(a2);
			a0 = 0;
			a1 = null;
			return;
		}
		a3 = av.entityValues[0].getDouble(0);
		a4 = av.entityValues[0].getDouble(1);
		a5 = av.entityValues[0].getDouble(2);
		a6 = av.entityValues[0].getDouble(3);
		a7 = av.entityValues[0].getDouble(4);
		a8 = av.entityValues[0].getDouble(5);
		a9 = av.entityValues[0].getDouble(6);
		a2 = av.entityValues[1].getInstance(0, this, a2$);
		a0 = av.entityValues[2].getEnumeration(0, a0$);
		a1 = av.entityValues[2].getString(1);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcIShapeProfileDef
		av.entityValues[0].setDouble(0, a3);
		av.entityValues[0].setDouble(1, a4);
		av.entityValues[0].setDouble(2, a5);
		av.entityValues[0].setDouble(3, a6);
		av.entityValues[0].setDouble(4, a7);
		av.entityValues[0].setDouble(5, a8);
		av.entityValues[0].setDouble(6, a9);
		// partial entity: IfcParameterizedProfileDef
		av.entityValues[1].setInstance(0, a2);
		// partial entity: IfcProfileDef
		av.entityValues[2].setEnumeration(0, a0, a0$);
		av.entityValues[2].setString(1, a1);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcIShapeProfileDef
		av.entityValues[0].setDouble(0, a3);
		av.entityValues[0].setDouble(1, a4);
		av.entityValues[0].setDouble(2, a5);
		av.entityValues[0].setDouble(3, a6);
		av.entityValues[0].setDouble(4, a7);
		av.entityValues[0].setDouble(5, a8);
		av.entityValues[0].setDouble(6, a9);
		// partial entity: IfcParameterizedProfileDef
		av.entityValues[1].setInstance(0, a2);
		// partial entity: IfcProfileDef
		av.entityValues[2].setEnumeration(0, a0, a0$);
		av.entityValues[2].setString(1, a1);
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfcishapeprofiledefValidflangethickness(SdaiContext _context) throws SdaiException {
	




		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).less(_context, Value.alloc().mulOrIntersect(_context, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 2.0), Value.alloc(jsdai.SIfc4.SIfc4._st_IfcPositiveLengthMeasure).set(_context, get(a6$))), Value.alloc(jsdai.SIfc4.SIfc4._st_IfcPositiveLengthMeasure).set(_context, get(a4$)))).getLogical());
	}
	public int rIfcishapeprofiledefValidfilletradius(SdaiContext _context) throws SdaiException {
	









		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).OR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).NOT(Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.SIfc4._st_IfcNonNegativeLengthMeasure).set(_context, get(a7$)))), Value.alloc(ExpressTypes.LOGICAL_TYPE).AND(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).lequal(_context, Value.alloc(jsdai.SIfc4.SIfc4._st_IfcNonNegativeLengthMeasure).set(_context, get(a7$)), Value.alloc(ExpressTypes.NUMBER_TYPE).divide(_context, Value.alloc().substractOrDifference(_context, Value.alloc(jsdai.SIfc4.SIfc4._st_IfcPositiveLengthMeasure).set(_context, get(a3$)), Value.alloc(jsdai.SIfc4.SIfc4._st_IfcPositiveLengthMeasure).set(_context, get(a5$))), Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 2.0))), Value.alloc(ExpressTypes.LOGICAL_TYPE).lequal(_context, Value.alloc(jsdai.SIfc4.SIfc4._st_IfcNonNegativeLengthMeasure).set(_context, get(a7$)), Value.alloc(ExpressTypes.NUMBER_TYPE).divide(_context, Value.alloc().substractOrDifference(_context, Value.alloc(jsdai.SIfc4.SIfc4._st_IfcPositiveLengthMeasure).set(_context, get(a4$)), Value.alloc().mulOrIntersect(_context, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 2.0), Value.alloc(jsdai.SIfc4.SIfc4._st_IfcPositiveLengthMeasure).set(_context, get(a6$)))), Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 2.0)))))).getLogical());
	}
	public int rIfcishapeprofiledefValidwebthickness(SdaiContext _context) throws SdaiException {
	




		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).less(_context, Value.alloc(jsdai.SIfc4.SIfc4._st_IfcPositiveLengthMeasure).set(_context, get(a5$)), Value.alloc(jsdai.SIfc4.SIfc4._st_IfcPositiveLengthMeasure).set(_context, get(a3$)))).getLogical());
	}
}