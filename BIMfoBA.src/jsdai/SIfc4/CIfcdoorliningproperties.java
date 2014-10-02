/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcDoorLiningProperties

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcdoorliningproperties extends CIfcpredefinedpropertyset implements EIfcdoorliningproperties {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcdoorliningproperties.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// GlobalId: protected String a0;   GlobalId - java inheritance - STRING
	// OwnerHistory: protected Object a1;   OwnerHistory - java inheritance - ENTITY IfcOwnerHistory
	// Name: protected String a2;   Name - java inheritance - STRING
	// Description: protected String a3;   Description - java inheritance - STRING
	// HasContext: protected Object  - inverse - java inheritance -  ENTITY IfcRelDeclares
	// HasAssociations: protected Object  - inverse - java inheritance -  ENTITY IfcRelAssociates
	// DefinesType: protected Object  - inverse - java inheritance -  ENTITY IfcTypeObject
	// IsDefinedBy: protected Object  - inverse - java inheritance -  ENTITY IfcRelDefinesByTemplate
	// DefinesOccurrence: protected Object  - inverse - java inheritance -  ENTITY IfcRelDefinesByProperties
	protected double a4; // LiningDepth - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected double a5; // LiningThickness - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected double a6; // ThresholdDepth - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	protected double a7; // ThresholdThickness - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	protected double a8; // TransomThickness - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a8$ = CEntity.initExplicitAttribute(definition, 8);
	protected double a9; // TransomOffset - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a9$ = CEntity.initExplicitAttribute(definition, 9);
	protected double a10; // LiningOffset - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a10$ = CEntity.initExplicitAttribute(definition, 10);
	protected double a11; // ThresholdOffset - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a11$ = CEntity.initExplicitAttribute(definition, 11);
	protected double a12; // CasingThickness - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a12$ = CEntity.initExplicitAttribute(definition, 12);
	protected double a13; // CasingDepth - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a13$ = CEntity.initExplicitAttribute(definition, 13);
	protected Object a14; // ShapeAspectStyle - current entity - ENTITY IfcShapeAspect
	protected static final jsdai.dictionary.CExplicit_attribute a14$ = CEntity.initExplicitAttribute(definition, 14);
	protected double a15; // LiningToPanelOffsetX - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a15$ = CEntity.initExplicitAttribute(definition, 15);
	protected double a16; // LiningToPanelOffsetY - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a16$ = CEntity.initExplicitAttribute(definition, 16);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// GlobalId - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected String a0;
	// OwnerHistory - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected Object a1;
	// Name - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	// protected String a2;
	// Description - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	// protected String a3;
	// HasContext - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// HasAssociations - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// DefinesType - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i2$ = CEntity.initInverseAttribute(definition, 2);
	// IsDefinedBy - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i3$ = CEntity.initInverseAttribute(definition, 3);
	// DefinesOccurrence - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i4$ = CEntity.initInverseAttribute(definition, 4);
	// LiningDepth - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected double a4;
	// LiningThickness - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected double a5;
	// ThresholdDepth - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	protected double a6;
	// ThresholdThickness - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	protected double a7;
	// TransomThickness - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a8$ = CEntity.initExplicitAttribute(definition, 8);
	protected double a8;
	// TransomOffset - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a9$ = CEntity.initExplicitAttribute(definition, 9);
	protected double a9;
	// LiningOffset - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a10$ = CEntity.initExplicitAttribute(definition, 10);
	protected double a10;
	// ThresholdOffset - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a11$ = CEntity.initExplicitAttribute(definition, 11);
	protected double a11;
	// CasingThickness - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a12$ = CEntity.initExplicitAttribute(definition, 12);
	protected double a12;
	// CasingDepth - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a13$ = CEntity.initExplicitAttribute(definition, 13);
	protected double a13;
	// ShapeAspectStyle - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a14$ = CEntity.initExplicitAttribute(definition, 14);
	protected Object a14;
	// LiningToPanelOffsetX - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a15$ = CEntity.initExplicitAttribute(definition, 15);
	protected double a15;
	// LiningToPanelOffsetY - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a16$ = CEntity.initExplicitAttribute(definition, 16);
	protected double a16;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a14 == old) {
			a14 = newer;
		}
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a14 == old) {
			a14 = newer;
		}
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #5618=EXPLICIT_ATTRIBUTE('GlobalId',#5616,0,#2517,$,.F.);
	//<01> generating methods for consolidated attribute:  GlobalId
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5619=EXPLICIT_ATTRIBUTE('OwnerHistory',#5616,1,#4858,$,.T.);
	//<01> generating methods for consolidated attribute:  OwnerHistory
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): OwnerHistory, base type: entity IfcOwnerHistory
	public static int usedinOwnerhistory(EIfcroot type, EIfcownerhistory instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a1$, domain, result);
	}
	//going through all the attributes: #5620=EXPLICIT_ATTRIBUTE('Name',#5616,2,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5621=EXPLICIT_ATTRIBUTE('Description',#5616,3,#2657,$,.T.);
	//<01> generating methods for consolidated attribute:  Description
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5113=INVERSE_ATTRIBUTE('HasContext',#5111,0,#5450,$,#5453,#8928,#8929,.F.);
	//<01> generating methods for consolidated attribute:  HasContext
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5114=INVERSE_ATTRIBUTE('HasAssociations',#5111,1,#5375,$,#5377,#8931,$,.F.);
	//<01> generating methods for consolidated attribute:  HasAssociations
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5142=INVERSE_ATTRIBUTE('DefinesType',#5140,0,#6270,$,#6273,#8952,$,.F.);
	//<01> generating methods for consolidated attribute:  DefinesType
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5143=INVERSE_ATTRIBUTE('IsDefinedBy',#5140,1,#5466,$,#5468,#8954,$,.F.);
	//<01> generating methods for consolidated attribute:  IsDefinedBy
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5144=INVERSE_ATTRIBUTE('DefinesOccurrence',#5140,2,#5462,$,#5465,#8956,#8957,.F.);
	//<01> generating methods for consolidated attribute:  DefinesOccurrence
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4032=EXPLICIT_ATTRIBUTE('LiningDepth',#4030,0,#2605,$,.T.);
	//<01> generating methods for consolidated attribute:  LiningDepth
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: LiningDepth, base type: REAL
	public boolean testLiningdepth(EIfcdoorliningproperties type) throws SdaiException {
		return test_double(a4);
	}
	public double getLiningdepth(EIfcdoorliningproperties type) throws SdaiException {
		return get_double(a4);
	}
	public void setLiningdepth(EIfcdoorliningproperties type, double value) throws SdaiException {
		a4 = set_double(value);
	}
	public void unsetLiningdepth(EIfcdoorliningproperties type) throws SdaiException {
		a4 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeLiningdepth(EIfcdoorliningproperties type) throws SdaiException {
		return a4$;
	}

	//going through all the attributes: #4033=EXPLICIT_ATTRIBUTE('LiningThickness',#4030,1,#2591,$,.T.);
	//<01> generating methods for consolidated attribute:  LiningThickness
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: LiningThickness, base type: REAL
	public boolean testLiningthickness(EIfcdoorliningproperties type) throws SdaiException {
		return test_double(a5);
	}
	public double getLiningthickness(EIfcdoorliningproperties type) throws SdaiException {
		return get_double(a5);
	}
	public void setLiningthickness(EIfcdoorliningproperties type, double value) throws SdaiException {
		a5 = set_double(value);
	}
	public void unsetLiningthickness(EIfcdoorliningproperties type) throws SdaiException {
		a5 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeLiningthickness(EIfcdoorliningproperties type) throws SdaiException {
		return a5$;
	}

	//going through all the attributes: #4034=EXPLICIT_ATTRIBUTE('ThresholdDepth',#4030,2,#2605,$,.T.);
	//<01> generating methods for consolidated attribute:  ThresholdDepth
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: ThresholdDepth, base type: REAL
	public boolean testThresholddepth(EIfcdoorliningproperties type) throws SdaiException {
		return test_double(a6);
	}
	public double getThresholddepth(EIfcdoorliningproperties type) throws SdaiException {
		return get_double(a6);
	}
	public void setThresholddepth(EIfcdoorliningproperties type, double value) throws SdaiException {
		a6 = set_double(value);
	}
	public void unsetThresholddepth(EIfcdoorliningproperties type) throws SdaiException {
		a6 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeThresholddepth(EIfcdoorliningproperties type) throws SdaiException {
		return a6$;
	}

	//going through all the attributes: #4035=EXPLICIT_ATTRIBUTE('ThresholdThickness',#4030,3,#2591,$,.T.);
	//<01> generating methods for consolidated attribute:  ThresholdThickness
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: ThresholdThickness, base type: REAL
	public boolean testThresholdthickness(EIfcdoorliningproperties type) throws SdaiException {
		return test_double(a7);
	}
	public double getThresholdthickness(EIfcdoorliningproperties type) throws SdaiException {
		return get_double(a7);
	}
	public void setThresholdthickness(EIfcdoorliningproperties type, double value) throws SdaiException {
		a7 = set_double(value);
	}
	public void unsetThresholdthickness(EIfcdoorliningproperties type) throws SdaiException {
		a7 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeThresholdthickness(EIfcdoorliningproperties type) throws SdaiException {
		return a7$;
	}

	//going through all the attributes: #4036=EXPLICIT_ATTRIBUTE('TransomThickness',#4030,4,#2591,$,.T.);
	//<01> generating methods for consolidated attribute:  TransomThickness
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: TransomThickness, base type: REAL
	public boolean testTransomthickness(EIfcdoorliningproperties type) throws SdaiException {
		return test_double(a8);
	}
	public double getTransomthickness(EIfcdoorliningproperties type) throws SdaiException {
		return get_double(a8);
	}
	public void setTransomthickness(EIfcdoorliningproperties type, double value) throws SdaiException {
		a8 = set_double(value);
	}
	public void unsetTransomthickness(EIfcdoorliningproperties type) throws SdaiException {
		a8 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeTransomthickness(EIfcdoorliningproperties type) throws SdaiException {
		return a8$;
	}

	//going through all the attributes: #4037=EXPLICIT_ATTRIBUTE('TransomOffset',#4030,5,#2543,$,.T.);
	//<01> generating methods for consolidated attribute:  TransomOffset
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: TransomOffset, base type: REAL
	public boolean testTransomoffset(EIfcdoorliningproperties type) throws SdaiException {
		return test_double(a9);
	}
	public double getTransomoffset(EIfcdoorliningproperties type) throws SdaiException {
		return get_double(a9);
	}
	public void setTransomoffset(EIfcdoorliningproperties type, double value) throws SdaiException {
		a9 = set_double(value);
	}
	public void unsetTransomoffset(EIfcdoorliningproperties type) throws SdaiException {
		a9 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeTransomoffset(EIfcdoorliningproperties type) throws SdaiException {
		return a9$;
	}

	//going through all the attributes: #4038=EXPLICIT_ATTRIBUTE('LiningOffset',#4030,6,#2543,$,.T.);
	//<01> generating methods for consolidated attribute:  LiningOffset
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: LiningOffset, base type: REAL
	public boolean testLiningoffset(EIfcdoorliningproperties type) throws SdaiException {
		return test_double(a10);
	}
	public double getLiningoffset(EIfcdoorliningproperties type) throws SdaiException {
		return get_double(a10);
	}
	public void setLiningoffset(EIfcdoorliningproperties type, double value) throws SdaiException {
		a10 = set_double(value);
	}
	public void unsetLiningoffset(EIfcdoorliningproperties type) throws SdaiException {
		a10 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeLiningoffset(EIfcdoorliningproperties type) throws SdaiException {
		return a10$;
	}

	//going through all the attributes: #4039=EXPLICIT_ATTRIBUTE('ThresholdOffset',#4030,7,#2543,$,.T.);
	//<01> generating methods for consolidated attribute:  ThresholdOffset
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: ThresholdOffset, base type: REAL
	public boolean testThresholdoffset(EIfcdoorliningproperties type) throws SdaiException {
		return test_double(a11);
	}
	public double getThresholdoffset(EIfcdoorliningproperties type) throws SdaiException {
		return get_double(a11);
	}
	public void setThresholdoffset(EIfcdoorliningproperties type, double value) throws SdaiException {
		a11 = set_double(value);
	}
	public void unsetThresholdoffset(EIfcdoorliningproperties type) throws SdaiException {
		a11 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeThresholdoffset(EIfcdoorliningproperties type) throws SdaiException {
		return a11$;
	}

	//going through all the attributes: #4040=EXPLICIT_ATTRIBUTE('CasingThickness',#4030,8,#2605,$,.T.);
	//<01> generating methods for consolidated attribute:  CasingThickness
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: CasingThickness, base type: REAL
	public boolean testCasingthickness(EIfcdoorliningproperties type) throws SdaiException {
		return test_double(a12);
	}
	public double getCasingthickness(EIfcdoorliningproperties type) throws SdaiException {
		return get_double(a12);
	}
	public void setCasingthickness(EIfcdoorliningproperties type, double value) throws SdaiException {
		a12 = set_double(value);
	}
	public void unsetCasingthickness(EIfcdoorliningproperties type) throws SdaiException {
		a12 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeCasingthickness(EIfcdoorliningproperties type) throws SdaiException {
		return a12$;
	}

	//going through all the attributes: #4041=EXPLICIT_ATTRIBUTE('CasingDepth',#4030,9,#2605,$,.T.);
	//<01> generating methods for consolidated attribute:  CasingDepth
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: CasingDepth, base type: REAL
	public boolean testCasingdepth(EIfcdoorliningproperties type) throws SdaiException {
		return test_double(a13);
	}
	public double getCasingdepth(EIfcdoorliningproperties type) throws SdaiException {
		return get_double(a13);
	}
	public void setCasingdepth(EIfcdoorliningproperties type, double value) throws SdaiException {
		a13 = set_double(value);
	}
	public void unsetCasingdepth(EIfcdoorliningproperties type) throws SdaiException {
		a13 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeCasingdepth(EIfcdoorliningproperties type) throws SdaiException {
		return a13$;
	}

	//going through all the attributes: #4042=EXPLICIT_ATTRIBUTE('ShapeAspectStyle',#4030,10,#5672,$,.T.);
	//<01> generating methods for consolidated attribute:  ShapeAspectStyle
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : ShapeAspectStyle, base type: entity IfcShapeAspect
	public static int usedinShapeaspectstyle(EIfcdoorliningproperties type, EIfcshapeaspect instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a14$, domain, result);
	}
	public boolean testShapeaspectstyle(EIfcdoorliningproperties type) throws SdaiException {
		return test_instance(a14);
	}
	public EIfcshapeaspect getShapeaspectstyle(EIfcdoorliningproperties type) throws SdaiException {
		return (EIfcshapeaspect)get_instance(a14);
	}
	public void setShapeaspectstyle(EIfcdoorliningproperties type, EIfcshapeaspect value) throws SdaiException {
		a14 = set_instance(a14, value);
	}
	public void unsetShapeaspectstyle(EIfcdoorliningproperties type) throws SdaiException {
		a14 = unset_instance(a14);
	}
	public static jsdai.dictionary.EAttribute attributeShapeaspectstyle(EIfcdoorliningproperties type) throws SdaiException {
		return a14$;
	}

	//going through all the attributes: #4043=EXPLICIT_ATTRIBUTE('LiningToPanelOffsetX',#4030,11,#2543,$,.T.);
	//<01> generating methods for consolidated attribute:  LiningToPanelOffsetX
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: LiningToPanelOffsetX, base type: REAL
	public boolean testLiningtopaneloffsetx(EIfcdoorliningproperties type) throws SdaiException {
		return test_double(a15);
	}
	public double getLiningtopaneloffsetx(EIfcdoorliningproperties type) throws SdaiException {
		return get_double(a15);
	}
	public void setLiningtopaneloffsetx(EIfcdoorliningproperties type, double value) throws SdaiException {
		a15 = set_double(value);
	}
	public void unsetLiningtopaneloffsetx(EIfcdoorliningproperties type) throws SdaiException {
		a15 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeLiningtopaneloffsetx(EIfcdoorliningproperties type) throws SdaiException {
		return a15$;
	}

	//going through all the attributes: #4044=EXPLICIT_ATTRIBUTE('LiningToPanelOffsetY',#4030,12,#2543,$,.T.);
	//<01> generating methods for consolidated attribute:  LiningToPanelOffsetY
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: LiningToPanelOffsetY, base type: REAL
	public boolean testLiningtopaneloffsety(EIfcdoorliningproperties type) throws SdaiException {
		return test_double(a16);
	}
	public double getLiningtopaneloffsety(EIfcdoorliningproperties type) throws SdaiException {
		return get_double(a16);
	}
	public void setLiningtopaneloffsety(EIfcdoorliningproperties type, double value) throws SdaiException {
		a16 = set_double(value);
	}
	public void unsetLiningtopaneloffsety(EIfcdoorliningproperties type) throws SdaiException {
		a16 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeLiningtopaneloffsety(EIfcdoorliningproperties type) throws SdaiException {
		return a16$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a4 = Double.NaN;
			a5 = Double.NaN;
			a6 = Double.NaN;
			a7 = Double.NaN;
			a8 = Double.NaN;
			a9 = Double.NaN;
			a10 = Double.NaN;
			a11 = Double.NaN;
			a12 = Double.NaN;
			a13 = Double.NaN;
			a14 = unset_instance(a14);
			a15 = Double.NaN;
			a16 = Double.NaN;
			a0 = null;
			a1 = unset_instance(a1);
			a2 = null;
			a3 = null;
			return;
		}
		a4 = av.entityValues[0].getDouble(0);
		a5 = av.entityValues[0].getDouble(1);
		a6 = av.entityValues[0].getDouble(2);
		a7 = av.entityValues[0].getDouble(3);
		a8 = av.entityValues[0].getDouble(4);
		a9 = av.entityValues[0].getDouble(5);
		a10 = av.entityValues[0].getDouble(6);
		a11 = av.entityValues[0].getDouble(7);
		a12 = av.entityValues[0].getDouble(8);
		a13 = av.entityValues[0].getDouble(9);
		a14 = av.entityValues[0].getInstance(10, this, a14$);
		a15 = av.entityValues[0].getDouble(11);
		a16 = av.entityValues[0].getDouble(12);
		a0 = av.entityValues[4].getString(0);
		a1 = av.entityValues[4].getInstance(1, this, a1$);
		a2 = av.entityValues[4].getString(2);
		a3 = av.entityValues[4].getString(3);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a4 = Double.NaN;
			a5 = Double.NaN;
			a6 = Double.NaN;
			a7 = Double.NaN;
			a8 = Double.NaN;
			a9 = Double.NaN;
			a10 = Double.NaN;
			a11 = Double.NaN;
			a12 = Double.NaN;
			a13 = Double.NaN;
			a14 = unset_instance(a14);
			a15 = Double.NaN;
			a16 = Double.NaN;
			a0 = null;
			a1 = unset_instance(a1);
			a2 = null;
			a3 = null;
			return;
		}
		a4 = av.entityValues[0].getDouble(0);
		a5 = av.entityValues[0].getDouble(1);
		a6 = av.entityValues[0].getDouble(2);
		a7 = av.entityValues[0].getDouble(3);
		a8 = av.entityValues[0].getDouble(4);
		a9 = av.entityValues[0].getDouble(5);
		a10 = av.entityValues[0].getDouble(6);
		a11 = av.entityValues[0].getDouble(7);
		a12 = av.entityValues[0].getDouble(8);
		a13 = av.entityValues[0].getDouble(9);
		a14 = av.entityValues[0].getInstance(10, this, a14$);
		a15 = av.entityValues[0].getDouble(11);
		a16 = av.entityValues[0].getDouble(12);
		a0 = av.entityValues[4].getString(0);
		a1 = av.entityValues[4].getInstance(1, this, a1$);
		a2 = av.entityValues[4].getString(2);
		a3 = av.entityValues[4].getString(3);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcDoorLiningProperties
		av.entityValues[0].setDouble(0, a4);
		av.entityValues[0].setDouble(1, a5);
		av.entityValues[0].setDouble(2, a6);
		av.entityValues[0].setDouble(3, a7);
		av.entityValues[0].setDouble(4, a8);
		av.entityValues[0].setDouble(5, a9);
		av.entityValues[0].setDouble(6, a10);
		av.entityValues[0].setDouble(7, a11);
		av.entityValues[0].setDouble(8, a12);
		av.entityValues[0].setDouble(9, a13);
		av.entityValues[0].setInstance(10, a14);
		av.entityValues[0].setDouble(11, a15);
		av.entityValues[0].setDouble(12, a16);
		// partial entity: IfcPreDefinedPropertySet
		// partial entity: IfcPropertyDefinition
		// partial entity: IfcPropertySetDefinition
		// partial entity: IfcRoot
		av.entityValues[4].setString(0, a0);
		av.entityValues[4].setInstance(1, a1);
		av.entityValues[4].setString(2, a2);
		av.entityValues[4].setString(3, a3);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcDoorLiningProperties
		av.entityValues[0].setDouble(0, a4);
		av.entityValues[0].setDouble(1, a5);
		av.entityValues[0].setDouble(2, a6);
		av.entityValues[0].setDouble(3, a7);
		av.entityValues[0].setDouble(4, a8);
		av.entityValues[0].setDouble(5, a9);
		av.entityValues[0].setDouble(6, a10);
		av.entityValues[0].setDouble(7, a11);
		av.entityValues[0].setDouble(8, a12);
		av.entityValues[0].setDouble(9, a13);
		av.entityValues[0].setInstance(10, a14);
		av.entityValues[0].setDouble(11, a15);
		av.entityValues[0].setDouble(12, a16);
		// partial entity: IfcPreDefinedPropertySet
		// partial entity: IfcPropertyDefinition
		// partial entity: IfcPropertySetDefinition
		// partial entity: IfcRoot
		av.entityValues[4].setString(0, a0);
		av.entityValues[4].setInstance(1, a1);
		av.entityValues[4].setString(2, a2);
		av.entityValues[4].setString(3, a3);
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfcdoorliningpropertiesWr34(SdaiContext _context) throws SdaiException {
	






		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).XOR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).AND(_context, Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.SIfc4._st_IfcPositiveLengthMeasure).set(_context, get(a13$))), Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.SIfc4._st_IfcPositiveLengthMeasure).set(_context, get(a12$)))), Value.alloc(ExpressTypes.LOGICAL_TYPE).AND(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).NOT(Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.SIfc4._st_IfcPositiveLengthMeasure).set(_context, get(a13$)))), Value.alloc(ExpressTypes.LOGICAL_TYPE).NOT(Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.SIfc4._st_IfcPositiveLengthMeasure).set(_context, get(a12$))))))).getLogical());
	}
	public int rIfcdoorliningpropertiesWr32(SdaiContext _context) throws SdaiException {
	




		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).NOT(Value.alloc(ExpressTypes.LOGICAL_TYPE).AND(_context, Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.SIfc4._st_IfcPositiveLengthMeasure).set(_context, get(a6$))), Value.alloc(ExpressTypes.LOGICAL_TYPE).NOT(Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.SIfc4._st_IfcNonNegativeLengthMeasure).set(_context, get(a7$))))))).getLogical());
	}
	public int rIfcdoorliningpropertiesWr33(SdaiContext _context) throws SdaiException {
	






		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).XOR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).AND(_context, Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.SIfc4._st_IfcLengthMeasure).set(_context, get(a9$))), Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.SIfc4._st_IfcNonNegativeLengthMeasure).set(_context, get(a8$)))), Value.alloc(ExpressTypes.LOGICAL_TYPE).AND(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).NOT(Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.SIfc4._st_IfcLengthMeasure).set(_context, get(a9$)))), Value.alloc(ExpressTypes.LOGICAL_TYPE).NOT(Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.SIfc4._st_IfcNonNegativeLengthMeasure).set(_context, get(a8$))))))).getLogical());
	}
	public int rIfcdoorliningpropertiesWr35(SdaiContext _context) throws SdaiException {
	





		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).AND(_context, Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.CIfcdoorliningproperties.definition).set(_context, this).groupReference(_context, jsdai.SIfc4.CIfcpropertysetdefinition.class).getAttribute(jsdai.SIfc4.CIfcpropertysetdefinition.attributeDefinestype(null), _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null)), Value.alloc(ExpressTypes.LOGICAL_TYPE).OR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCDOORTYPE", "IFC4"), Value.alloc(jsdai.SIfc4.CIfcdoorliningproperties.definition).set(_context, this).groupReference(_context, jsdai.SIfc4.CIfcpropertysetdefinition.class).getAttribute(jsdai.SIfc4.CIfcpropertysetdefinition.attributeDefinestype(null), _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null).typeOfV(_context)), Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCDOORSTYLE", "IFC4"), Value.alloc(jsdai.SIfc4.CIfcdoorliningproperties.definition).set(_context, this).groupReference(_context, jsdai.SIfc4.CIfcpropertysetdefinition.class).getAttribute(jsdai.SIfc4.CIfcpropertysetdefinition.attributeDefinestype(null), _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null).typeOfV(_context))))).getLogical());
	}
	public int rIfcdoorliningpropertiesWr31(SdaiContext _context) throws SdaiException {
	




		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).NOT(Value.alloc(ExpressTypes.LOGICAL_TYPE).AND(_context, Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.SIfc4._st_IfcPositiveLengthMeasure).set(_context, get(a4$))), Value.alloc(ExpressTypes.LOGICAL_TYPE).NOT(Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.SIfc4._st_IfcNonNegativeLengthMeasure).set(_context, get(a5$))))))).getLogical());
	}
}
