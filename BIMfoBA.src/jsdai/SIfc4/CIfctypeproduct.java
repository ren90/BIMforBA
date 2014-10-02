/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcTypeProduct

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfctypeproduct extends CIfctypeobject implements EIfctypeproduct {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfctypeproduct.class, SIfc4.ss);

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
	protected AIfcrepresentationmap a6; // RepresentationMaps - current entity - LIST OF ENTITY
	protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	protected String a7; // Tag - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	// ReferencedBy: protected Object  - inverse - current -  ENTITY IfcRelAssignsToProduct
	protected static final jsdai.dictionary.CInverse_attribute i8$ = CEntity.initInverseAttribute(definition, 8);
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
	// RepresentationMaps - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	protected AIfcrepresentationmap a6;
	// Tag - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	protected String a7;
	// ReferencedBy - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i8$ = CEntity.initInverseAttribute(definition, 8);

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		changeReferencesAggregate(a6, old, newer);
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		changeReferencesAggregate(a6, old, newer);
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
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: RepresentationMaps, base type: LIST OF ENTITY
	public static int usedinRepresentationmaps(EIfctypeproduct type, EIfcrepresentationmap instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a6$, domain, result);
	}
	public boolean testRepresentationmaps(EIfctypeproduct type) throws SdaiException {
		return test_aggregate(a6);
	}
	public AIfcrepresentationmap getRepresentationmaps(EIfctypeproduct type) throws SdaiException {
		return (AIfcrepresentationmap)get_aggregate(a6);
	}
	public AIfcrepresentationmap createRepresentationmaps(EIfctypeproduct type) throws SdaiException {
		a6 = (AIfcrepresentationmap)create_aggregate_class(a6, a6$,  AIfcrepresentationmap.class, 0);
		return a6;
	}
	public void unsetRepresentationmaps(EIfctypeproduct type) throws SdaiException {
		unset_aggregate(a6);
		a6 = null;
	}
	public static jsdai.dictionary.EAttribute attributeRepresentationmaps(EIfctypeproduct type) throws SdaiException {
		return a6$;
	}

	//going through all the attributes: #6284=EXPLICIT_ATTRIBUTE('Tag',#6281,1,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Tag
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Tag, base type: STRING
	public boolean testTag(EIfctypeproduct type) throws SdaiException {
		return test_string(a7);
	}
	public String getTag(EIfctypeproduct type) throws SdaiException {
		return get_string(a7);
	}
	public void setTag(EIfctypeproduct type, String value) throws SdaiException {
		a7 = set_string(value);
	}
	public void unsetTag(EIfctypeproduct type) throws SdaiException {
		a7 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeTag(EIfctypeproduct type) throws SdaiException {
		return a7$;
	}

	//going through all the attributes: #6285=INVERSE_ATTRIBUTE('ReferencedBy',#6281,0,#5369,$,#5371,#9725,$,.F.);
	//<01> generating methods for consolidated attribute:  ReferencedBy
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	// Inverse attribute - ReferencedBy : SET[0:-2147483648] OF IfcRelAssignsToProduct FOR RelatingProduct
	public AIfcrelassignstoproduct getReferencedby(EIfctypeproduct type, ASdaiModel domain) throws SdaiException {
		AIfcrelassignstoproduct result = (AIfcrelassignstoproduct)get_inverse_aggregate(i8$);
		CIfcrelassignstoproduct.usedinRelatingproduct(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributeReferencedby(EIfctypeproduct type) throws SdaiException {
		return i8$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
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
		a0 = av.entityValues[1].getString(0);
		a1 = av.entityValues[1].getInstance(1, this, a1$);
		a2 = av.entityValues[1].getString(2);
		a3 = av.entityValues[1].getString(3);
		a4 = av.entityValues[2].getString(0);
		a5 = (AIfcpropertysetdefinition)av.entityValues[2].getInstanceAggregate(1, a5$, this);
		a6 = (AIfcrepresentationmap)av.entityValues[3].getInstanceAggregate(0, a6$, this);
		a7 = av.entityValues[3].getString(1);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
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
		a0 = av.entityValues[1].getString(0);
		a1 = av.entityValues[1].getInstance(1, this, a1$);
		a2 = av.entityValues[1].getString(2);
		a3 = av.entityValues[1].getString(3);
		a4 = av.entityValues[2].getString(0);
		a5 = (AIfcpropertysetdefinition)av.entityValues[2].getInstanceAggregate(1, a5$, this);
		a6 = (AIfcrepresentationmap)av.entityValues[3].getInstanceAggregate(0, a6$, this);
		a7 = av.entityValues[3].getString(1);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcObjectDefinition
		// partial entity: IfcRoot
		av.entityValues[1].setString(0, a0);
		av.entityValues[1].setInstance(1, a1);
		av.entityValues[1].setString(2, a2);
		av.entityValues[1].setString(3, a3);
		// partial entity: IfcTypeObject
		av.entityValues[2].setString(0, a4);
		av.entityValues[2].setInstanceAggregate(1, a5);
		// partial entity: IfcTypeProduct
		av.entityValues[3].setInstanceAggregate(0, a6);
		av.entityValues[3].setString(1, a7);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcObjectDefinition
		// partial entity: IfcRoot
		av.entityValues[1].setString(0, a0);
		av.entityValues[1].setInstance(1, a1);
		av.entityValues[1].setString(2, a2);
		av.entityValues[1].setString(3, a3);
		// partial entity: IfcTypeObject
		av.entityValues[2].setString(0, a4);
		av.entityValues[2].setInstanceAggregate(1, a5);
		// partial entity: IfcTypeProduct
		av.entityValues[3].setInstanceAggregate(0, a6);
		av.entityValues[3].setString(1, a7);
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfctypeproductApplicableoccurrence(SdaiContext _context) throws SdaiException {
	




											
											Value _internal_aggregate_source330 = Value.alloc(jsdai.SIfc4.CIfctypeproduct.definition).set(_context, this).groupReference(_context, jsdai.SIfc4.CIfctypeobject.class).getAttribute(jsdai.SIfc4.CIfctypeobject.attributeTypes(null), _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null).getAttribute("RelatedObjects", _context);
											Value _result328 = Value.alloc(_internal_aggregate_source330).create();
											if (_internal_aggregate_source330.getActualJavaType() != Value.INDETERMINATE) {
												for (int _i329 = 1; _i329 <= _internal_aggregate_source330.getMemberCount(); _i329++) {
													Value _implicit_77_temp = _internal_aggregate_source330.getByIndex(_i329);
													if (Value.alloc(ExpressTypes.LOGICAL_TYPE).NOT(Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCPRODUCT", "IFC4"), _implicit_77_temp.typeOfV(_context))).getLogical() == 2) {
														_result328.addMember(_context, _implicit_77_temp);
													} else
													if (_internal_aggregate_source330.getDeclaredType() instanceof jsdai.dictionary.EArray_type) {
														_implicit_77_temp.unset();
														_result328.addMember(_context, _implicit_77_temp);
													}
												}
											} else {
												_result328.unset();
											}
		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).OR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).NOT(Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.CIfctypeproduct.definition).set(_context, this).groupReference(_context, jsdai.SIfc4.CIfctypeobject.class).getAttribute(jsdai.SIfc4.CIfctypeobject.attributeTypes(null), _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null))), Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(_result328), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 0)))).getLogical());
	}
}
