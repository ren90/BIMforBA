/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcReinforcingBarType

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcreinforcingbartype extends CIfcreinforcingelementtype implements EIfcreinforcingbartype {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcreinforcingbartype.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// GlobalId: protected String a0;   GlobalId - java inheritance - STRING
	// OwnerHistory: protected Object a1;   OwnerHistory - java inheritance - ENTITY IfcOwnerHistory
	// Name: protected String a2;   Name - java inheritance - STRING
	// Description: protected String a3;   Description - java inheritance - STRING
	// HasAssignments: protected Object  - inverse - java inheritance -  ENTITY IfcRelAssigns
	// Nests: protected Object  - inverse - java inheritance -  ENTITY IfcRelNests
	// IsNestedBy: protected Object  - inverse - java inheritance -  ENTITY IfcRelNests
	// HasContext: protected Object  - inverse - java inheritance -  ENTITY IfcRelDeclares
	// IsDecomposedBy: protected Object  - inverse - java inheritance -  ENTITY IfcRelAggregates
	// Decomposes: protected Object  - inverse - java inheritance -  ENTITY IfcRelAggregates
	// HasAssociations: protected Object  - inverse - java inheritance -  ENTITY IfcRelAssociates
	// ApplicableOccurrence: protected String a4;   ApplicableOccurrence - java inheritance - STRING
	// HasPropertySets: protected AIfcpropertysetdefinition a5;   HasPropertySets - java inheritance - SET OF ENTITY
	// Types: protected Object  - inverse - java inheritance -  ENTITY IfcRelDefinesByType
	// RepresentationMaps: protected AIfcrepresentationmap a6;   RepresentationMaps - java inheritance - LIST OF ENTITY
	// Tag: protected String a7;   Tag - java inheritance - STRING
	// ReferencedBy: protected Object  - inverse - java inheritance -  ENTITY IfcRelAssignsToProduct
	// ElementType: protected String a8;   ElementType - java inheritance - STRING
	protected int a9; // PredefinedType - current entity - ENUMERATION IfcReinforcingBarTypeEnum
	protected static final jsdai.dictionary.CExplicit_attribute a9$ = CEntity.initExplicitAttribute(definition, 9);
	protected double a10; // NominalDiameter - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a10$ = CEntity.initExplicitAttribute(definition, 10);
	protected double a11; // CrossSectionArea - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a11$ = CEntity.initExplicitAttribute(definition, 11);
	protected double a12; // BarLength - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a12$ = CEntity.initExplicitAttribute(definition, 12);
	protected int a13; // BarSurface - current entity - ENUMERATION IfcReinforcingBarSurfaceEnum
	protected static final jsdai.dictionary.CExplicit_attribute a13$ = CEntity.initExplicitAttribute(definition, 13);
	protected String a14; // BendingShapeCode - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a14$ = CEntity.initExplicitAttribute(definition, 14);
	protected AIfcbendingparameterselect a15; // BendingParameters - current entity - LIST OF SELECT
	protected static final jsdai.dictionary.CExplicit_attribute a15$ = CEntity.initExplicitAttribute(definition, 15);
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
	// HasAssignments - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// Nests - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// IsNestedBy - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i2$ = CEntity.initInverseAttribute(definition, 2);
	// HasContext - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i3$ = CEntity.initInverseAttribute(definition, 3);
	// IsDecomposedBy - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i4$ = CEntity.initInverseAttribute(definition, 4);
	// Decomposes - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i5$ = CEntity.initInverseAttribute(definition, 5);
	// HasAssociations - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i6$ = CEntity.initInverseAttribute(definition, 6);
	// ApplicableOccurrence - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	// protected String a4;
	// HasPropertySets - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	// protected AIfcpropertysetdefinition a5;
	// Types - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i7$ = CEntity.initInverseAttribute(definition, 7);
	// RepresentationMaps - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	// protected AIfcrepresentationmap a6;
	// Tag - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	// protected String a7;
	// ReferencedBy - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i8$ = CEntity.initInverseAttribute(definition, 8);
	// ElementType - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a8$ = CEntity.initExplicitAttribute(definition, 8);
	// protected String a8;
	// PredefinedType - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a9$ = CEntity.initExplicitAttribute(definition, 9);
	protected int a9;
	// NominalDiameter - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a10$ = CEntity.initExplicitAttribute(definition, 10);
	protected double a10;
	// CrossSectionArea - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a11$ = CEntity.initExplicitAttribute(definition, 11);
	protected double a11;
	// BarLength - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a12$ = CEntity.initExplicitAttribute(definition, 12);
	protected double a12;
	// BarSurface - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a13$ = CEntity.initExplicitAttribute(definition, 13);
	protected int a13;
	// BendingShapeCode - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a14$ = CEntity.initExplicitAttribute(definition, 14);
	protected String a14;
	// BendingParameters - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a15$ = CEntity.initExplicitAttribute(definition, 15);
	protected AIfcbendingparameterselect a15;

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
	//going through all the attributes: #4791=INVERSE_ATTRIBUTE('HasAssignments',#4789,0,#5348,$,#5350,#8672,$,.F.);
	//<01> generating methods for consolidated attribute:  HasAssignments
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4792=INVERSE_ATTRIBUTE('Nests',#4789,1,#5489,$,#5492,#8674,#8675,.F.);
	//<01> generating methods for consolidated attribute:  Nests
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4793=INVERSE_ATTRIBUTE('IsNestedBy',#4789,2,#5489,$,#5491,#8677,$,.F.);
	//<01> generating methods for consolidated attribute:  IsNestedBy
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4794=INVERSE_ATTRIBUTE('HasContext',#4789,3,#5450,$,#5453,#8679,#8680,.F.);
	//<01> generating methods for consolidated attribute:  HasContext
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4795=INVERSE_ATTRIBUTE('IsDecomposedBy',#4789,4,#5344,$,#5346,#8682,$,.F.);
	//<01> generating methods for consolidated attribute:  IsDecomposedBy
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4796=INVERSE_ATTRIBUTE('Decomposes',#4789,5,#5344,$,#5347,#8684,#8685,.F.);
	//<01> generating methods for consolidated attribute:  Decomposes
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4797=INVERSE_ATTRIBUTE('HasAssociations',#4789,6,#5375,$,#5377,#8687,$,.F.);
	//<01> generating methods for consolidated attribute:  HasAssociations
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #6272=EXPLICIT_ATTRIBUTE('ApplicableOccurrence',#6270,0,#2523,$,.T.);
	//<01> generating methods for consolidated attribute:  ApplicableOccurrence
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #6273=EXPLICIT_ATTRIBUTE('HasPropertySets',#6270,1,#7194,$,.T.);
	//<01> generating methods for consolidated attribute:  HasPropertySets
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// methods for attribute: HasPropertySets, base type: SET OF ENTITY
	public static int usedinHaspropertysets(EIfctypeobject type, EIfcpropertysetdefinition instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a5$, domain, result);
	}
	//going through all the attributes: #6274=INVERSE_ATTRIBUTE('Types',#6270,0,#5470,$,#5473,#9713,#9714,.F.);
	//<01> generating methods for consolidated attribute:  Types
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #6283=EXPLICIT_ATTRIBUTE('RepresentationMaps',#6281,0,#7197,$,.T.);
	//<01> generating methods for consolidated attribute:  RepresentationMaps
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// methods for attribute: RepresentationMaps, base type: LIST OF ENTITY
	public static int usedinRepresentationmaps(EIfctypeproduct type, EIfcrepresentationmap instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a6$, domain, result);
	}
	//going through all the attributes: #6284=EXPLICIT_ATTRIBUTE('Tag',#6281,1,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Tag
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #6285=INVERSE_ATTRIBUTE('ReferencedBy',#6281,0,#5369,$,#5371,#9725,$,.F.);
	//<01> generating methods for consolidated attribute:  ReferencedBy
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4167=EXPLICIT_ATTRIBUTE('ElementType',#4165,0,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  ElementType
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5308=EXPLICIT_ATTRIBUTE('PredefinedType',#5306,0,#2993,$,.F.);
	//<01> generating methods for consolidated attribute:  PredefinedType
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute:PredefinedType, base type: ENUMERATION
	public boolean testPredefinedtype(EIfcreinforcingbartype type) throws SdaiException {
		return test_enumeration(a9);
	}
	public int getPredefinedtype(EIfcreinforcingbartype type) throws SdaiException {
		return get_enumeration(a9);
	}
	public void setPredefinedtype(EIfcreinforcingbartype type, int value) throws SdaiException {
		a9 = set_enumeration(value, a9$);
	}
	public void unsetPredefinedtype(EIfcreinforcingbartype type) throws SdaiException {
		a9 = unset_enumeration();
	}
	public static jsdai.dictionary.EAttribute attributePredefinedtype(EIfcreinforcingbartype type) throws SdaiException {
		return a9$;
	}

	//going through all the attributes: #5309=EXPLICIT_ATTRIBUTE('NominalDiameter',#5306,1,#2605,$,.T.);
	//<01> generating methods for consolidated attribute:  NominalDiameter
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: NominalDiameter, base type: REAL
	public boolean testNominaldiameter(EIfcreinforcingbartype type) throws SdaiException {
		return test_double(a10);
	}
	public double getNominaldiameter(EIfcreinforcingbartype type) throws SdaiException {
		return get_double(a10);
	}
	public void setNominaldiameter(EIfcreinforcingbartype type, double value) throws SdaiException {
		a10 = set_double(value);
	}
	public void unsetNominaldiameter(EIfcreinforcingbartype type) throws SdaiException {
		a10 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeNominaldiameter(EIfcreinforcingbartype type) throws SdaiException {
		return a10$;
	}

	//going through all the attributes: #5310=EXPLICIT_ATTRIBUTE('CrossSectionArea',#5306,2,#2457,$,.T.);
	//<01> generating methods for consolidated attribute:  CrossSectionArea
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: CrossSectionArea, base type: REAL
	public boolean testCrosssectionarea(EIfcreinforcingbartype type) throws SdaiException {
		return test_double(a11);
	}
	public double getCrosssectionarea(EIfcreinforcingbartype type) throws SdaiException {
		return get_double(a11);
	}
	public void setCrosssectionarea(EIfcreinforcingbartype type, double value) throws SdaiException {
		a11 = set_double(value);
	}
	public void unsetCrosssectionarea(EIfcreinforcingbartype type) throws SdaiException {
		a11 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeCrosssectionarea(EIfcreinforcingbartype type) throws SdaiException {
		return a11$;
	}

	//going through all the attributes: #5311=EXPLICIT_ATTRIBUTE('BarLength',#5306,3,#2605,$,.T.);
	//<01> generating methods for consolidated attribute:  BarLength
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: BarLength, base type: REAL
	public boolean testBarlength(EIfcreinforcingbartype type) throws SdaiException {
		return test_double(a12);
	}
	public double getBarlength(EIfcreinforcingbartype type) throws SdaiException {
		return get_double(a12);
	}
	public void setBarlength(EIfcreinforcingbartype type, double value) throws SdaiException {
		a12 = set_double(value);
	}
	public void unsetBarlength(EIfcreinforcingbartype type) throws SdaiException {
		a12 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeBarlength(EIfcreinforcingbartype type) throws SdaiException {
		return a12$;
	}

	//going through all the attributes: #5312=EXPLICIT_ATTRIBUTE('BarSurface',#5306,4,#2991,$,.T.);
	//<01> generating methods for consolidated attribute:  BarSurface
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute:BarSurface, base type: ENUMERATION
	public boolean testBarsurface(EIfcreinforcingbartype type) throws SdaiException {
		return test_enumeration(a13);
	}
	public int getBarsurface(EIfcreinforcingbartype type) throws SdaiException {
		return get_enumeration(a13);
	}
	public void setBarsurface(EIfcreinforcingbartype type, int value) throws SdaiException {
		a13 = set_enumeration(value, a13$);
	}
	public void unsetBarsurface(EIfcreinforcingbartype type) throws SdaiException {
		a13 = unset_enumeration();
	}
	public static jsdai.dictionary.EAttribute attributeBarsurface(EIfcreinforcingbartype type) throws SdaiException {
		return a13$;
	}

	//going through all the attributes: #5313=EXPLICIT_ATTRIBUTE('BendingShapeCode',#5306,5,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  BendingShapeCode
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: BendingShapeCode, base type: STRING
	public boolean testBendingshapecode(EIfcreinforcingbartype type) throws SdaiException {
		return test_string(a14);
	}
	public String getBendingshapecode(EIfcreinforcingbartype type) throws SdaiException {
		return get_string(a14);
	}
	public void setBendingshapecode(EIfcreinforcingbartype type, String value) throws SdaiException {
		a14 = set_string(value);
	}
	public void unsetBendingshapecode(EIfcreinforcingbartype type) throws SdaiException {
		a14 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeBendingshapecode(EIfcreinforcingbartype type) throws SdaiException {
		return a14$;
	}

	//going through all the attributes: #5314=EXPLICIT_ATTRIBUTE('BendingParameters',#5306,6,#7071,$,.T.);
	//<01> generating methods for consolidated attribute:  BendingParameters
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: BendingParameters, base type: LIST OF SELECT
	public boolean testBendingparameters(EIfcreinforcingbartype type) throws SdaiException {
		return test_aggregate(a15);
	}
	public AIfcbendingparameterselect getBendingparameters(EIfcreinforcingbartype type) throws SdaiException {
		if (a15 == null)
			throw new SdaiException(SdaiException.VA_NSET);
		return a15;
	}
	public AIfcbendingparameterselect createBendingparameters(EIfcreinforcingbartype type) throws SdaiException {
		a15 = (AIfcbendingparameterselect)create_aggregate_class(a15, a15$, AIfcbendingparameterselect.class, 0);
		return a15;
	}
	public void unsetBendingparameters(EIfcreinforcingbartype type) throws SdaiException {
		unset_aggregate(a15);
		a15 = null;
	}
	public static jsdai.dictionary.EAttribute attributeBendingparameters(EIfcreinforcingbartype type) throws SdaiException {
		return a15$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a8 = null;
			a9 = 0;
			a10 = Double.NaN;
			a11 = Double.NaN;
			a12 = Double.NaN;
			a13 = 0;
			a14 = null;
			if (a15 instanceof CAggregate)
				a15.unsetAll();
			a15 = null;
			a0 = null;
			a1 = unset_instance(a1);
			a2 = null;
			a3 = null;
			a4 = null;
			if (a5 instanceof CAggregate)
				a5.unsetAll();
			a5 = null;
			if (a6 instanceof CAggregate)
				a6.unsetAll();
			a6 = null;
			a7 = null;
			return;
		}
		a8 = av.entityValues[1].getString(0);
		a9 = av.entityValues[3].getEnumeration(0, a9$);
		a10 = av.entityValues[3].getDouble(1);
		a11 = av.entityValues[3].getDouble(2);
		a12 = av.entityValues[3].getDouble(3);
		a13 = av.entityValues[3].getEnumeration(4, a13$);
		a14 = av.entityValues[3].getString(5);
		a15 = (AIfcbendingparameterselect)av.entityValues[3].getMixedAggregate(6, a15$, this);
		a0 = av.entityValues[5].getString(0);
		a1 = av.entityValues[5].getInstance(1, this, a1$);
		a2 = av.entityValues[5].getString(2);
		a3 = av.entityValues[5].getString(3);
		a4 = av.entityValues[6].getString(0);
		a5 = (AIfcpropertysetdefinition)av.entityValues[6].getInstanceAggregate(1, a5$, this);
		a6 = (AIfcrepresentationmap)av.entityValues[7].getInstanceAggregate(0, a6$, this);
		a7 = av.entityValues[7].getString(1);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a8 = null;
			a9 = 0;
			a10 = Double.NaN;
			a11 = Double.NaN;
			a12 = Double.NaN;
			a13 = 0;
			a14 = null;
			if (a15 instanceof CAggregate)
				a15.unsetAll();
			a15 = null;
			a0 = null;
			a1 = unset_instance(a1);
			a2 = null;
			a3 = null;
			a4 = null;
			if (a5 instanceof CAggregate)
				a5.unsetAll();
			a5 = null;
			if (a6 instanceof CAggregate)
				a6.unsetAll();
			a6 = null;
			a7 = null;
			return;
		}
		a8 = av.entityValues[1].getString(0);
		a9 = av.entityValues[3].getEnumeration(0, a9$);
		a10 = av.entityValues[3].getDouble(1);
		a11 = av.entityValues[3].getDouble(2);
		a12 = av.entityValues[3].getDouble(3);
		a13 = av.entityValues[3].getEnumeration(4, a13$);
		a14 = av.entityValues[3].getString(5);
		a15 = (AIfcbendingparameterselect)av.entityValues[3].getMixedAggregate(6, a15$, this);
		a0 = av.entityValues[5].getString(0);
		a1 = av.entityValues[5].getInstance(1, this, a1$);
		a2 = av.entityValues[5].getString(2);
		a3 = av.entityValues[5].getString(3);
		a4 = av.entityValues[6].getString(0);
		a5 = (AIfcpropertysetdefinition)av.entityValues[6].getInstanceAggregate(1, a5$, this);
		a6 = (AIfcrepresentationmap)av.entityValues[7].getInstanceAggregate(0, a6$, this);
		a7 = av.entityValues[7].getString(1);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcElementComponentType
		// partial entity: IfcElementType
		av.entityValues[1].setString(0, a8);
		// partial entity: IfcObjectDefinition
		// partial entity: IfcReinforcingBarType
		av.entityValues[3].setEnumeration(0, a9, a9$);
		av.entityValues[3].setDouble(1, a10);
		av.entityValues[3].setDouble(2, a11);
		av.entityValues[3].setDouble(3, a12);
		av.entityValues[3].setEnumeration(4, a13, a13$);
		av.entityValues[3].setString(5, a14);
		av.entityValues[3].setMixedAggregate(6, a15, a15$);
		// partial entity: IfcReinforcingElementType
		// partial entity: IfcRoot
		av.entityValues[5].setString(0, a0);
		av.entityValues[5].setInstance(1, a1);
		av.entityValues[5].setString(2, a2);
		av.entityValues[5].setString(3, a3);
		// partial entity: IfcTypeObject
		av.entityValues[6].setString(0, a4);
		av.entityValues[6].setInstanceAggregate(1, a5);
		// partial entity: IfcTypeProduct
		av.entityValues[7].setInstanceAggregate(0, a6);
		av.entityValues[7].setString(1, a7);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcElementComponentType
		// partial entity: IfcElementType
		av.entityValues[1].setString(0, a8);
		// partial entity: IfcObjectDefinition
		// partial entity: IfcReinforcingBarType
		av.entityValues[3].setEnumeration(0, a9, a9$);
		av.entityValues[3].setDouble(1, a10);
		av.entityValues[3].setDouble(2, a11);
		av.entityValues[3].setDouble(3, a12);
		av.entityValues[3].setEnumeration(4, a13, a13$);
		av.entityValues[3].setString(5, a14);
		av.entityValues[3].setMixedAggregate(6, a15, a15$);
		// partial entity: IfcReinforcingElementType
		// partial entity: IfcRoot
		av.entityValues[5].setString(0, a0);
		av.entityValues[5].setInstance(1, a1);
		av.entityValues[5].setString(2, a2);
		av.entityValues[5].setString(3, a3);
		// partial entity: IfcTypeObject
		av.entityValues[6].setString(0, a4);
		av.entityValues[6].setInstanceAggregate(1, a5);
		// partial entity: IfcTypeProduct
		av.entityValues[7].setInstanceAggregate(0, a6);
		av.entityValues[7].setString(1, a7);
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfcreinforcingbartypeBendingshapecodeprovided(SdaiContext _context) throws SdaiException {
	




		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).OR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).NOT(Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.SIfc4._st_list_1_ifcbendingparameterselect).set(_context, get(a15$)))), Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.SIfc4._st_IfcLabel).set(_context, get(a14$))))).getLogical());
	}
	public int rIfcreinforcingbartypeCorrectpredefinedtype(SdaiContext _context) throws SdaiException {
	





		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).OR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).nequal(_context, Value.alloc(jsdai.SIfc4.SIfc4._st_IfcReinforcingBarTypeEnum).set(_context, get(a9$)), Value.alloc(jsdai.SIfc4.SIfc4._st_IfcReinforcingBarTypeEnum).setEnum(_context, "USERDEFINED")), Value.alloc(ExpressTypes.LOGICAL_TYPE).AND(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(jsdai.SIfc4.SIfc4._st_IfcReinforcingBarTypeEnum).set(_context, get(a9$)), Value.alloc(jsdai.SIfc4.SIfc4._st_IfcReinforcingBarTypeEnum).setEnum(_context, "USERDEFINED")), Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.CIfcreinforcingbartype.definition).set(_context, this).groupReference(_context, jsdai.SIfc4.CIfcelementtype.class).getAttribute(jsdai.SIfc4.CIfcelementtype.attributeElementtype(null), _context))))).getLogical());
	}
}
