/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcRelConnectsPathElements

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcrelconnectspathelements extends CIfcrelconnectselements implements EIfcrelconnectspathelements {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcrelconnectspathelements.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// GlobalId: protected String a0;   GlobalId - java inheritance - STRING
	// OwnerHistory: protected Object a1;   OwnerHistory - java inheritance - ENTITY IfcOwnerHistory
	// Name: protected String a2;   Name - java inheritance - STRING
	// Description: protected String a3;   Description - java inheritance - STRING
	// ConnectionGeometry: protected Object a4;   ConnectionGeometry - java inheritance - ENTITY IfcConnectionGeometry
	// RelatingElement: protected Object a5;   RelatingElement - java inheritance - ENTITY IfcElement
	// RelatedElement: protected Object a6;   RelatedElement - java inheritance - ENTITY IfcElement
	protected A_double a7; // RelatingPriorities - current entity - LIST OF NUMBER
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	protected A_double a8; // RelatedPriorities - current entity - LIST OF NUMBER
	protected static final jsdai.dictionary.CExplicit_attribute a8$ = CEntity.initExplicitAttribute(definition, 8);
	protected int a9; // RelatedConnectionType - current entity - ENUMERATION IfcConnectionTypeEnum
	protected static final jsdai.dictionary.CExplicit_attribute a9$ = CEntity.initExplicitAttribute(definition, 9);
	protected int a10; // RelatingConnectionType - current entity - ENUMERATION IfcConnectionTypeEnum
	protected static final jsdai.dictionary.CExplicit_attribute a10$ = CEntity.initExplicitAttribute(definition, 10);
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
	// ConnectionGeometry - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	// protected Object a4;
	// RelatingElement - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	// protected Object a5;
	// RelatedElement - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	// protected Object a6;
	// RelatingPriorities - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	protected A_double a7;
	// RelatedPriorities - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a8$ = CEntity.initExplicitAttribute(definition, 8);
	protected A_double a8;
	// RelatedConnectionType - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a9$ = CEntity.initExplicitAttribute(definition, 9);
	protected int a9;
	// RelatingConnectionType - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a10$ = CEntity.initExplicitAttribute(definition, 10);
	protected int a10;

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
	//going through all the attributes: #5401=EXPLICIT_ATTRIBUTE('ConnectionGeometry',#5399,0,#3726,$,.T.);
	//<01> generating methods for consolidated attribute:  ConnectionGeometry
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): ConnectionGeometry, base type: entity IfcConnectionGeometry
	public static int usedinConnectiongeometry(EIfcrelconnectselements type, EIfcconnectiongeometry instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a4$, domain, result);
	}
	//going through all the attributes: #5402=EXPLICIT_ATTRIBUTE('RelatingElement',#5399,1,#4136,$,.F.);
	//<01> generating methods for consolidated attribute:  RelatingElement
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): RelatingElement, base type: entity IfcElement
	public static int usedinRelatingelement(EIfcrelconnectselements type, EIfcelement instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a5$, domain, result);
	}
	//going through all the attributes: #5403=EXPLICIT_ATTRIBUTE('RelatedElement',#5399,2,#4136,$,.F.);
	//<01> generating methods for consolidated attribute:  RelatedElement
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): RelatedElement, base type: entity IfcElement
	public static int usedinRelatedelement(EIfcrelconnectselements type, EIfcelement instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a6$, domain, result);
	}
	//going through all the attributes: #5406=EXPLICIT_ATTRIBUTE('RelatingPriorities',#5404,0,#7085,$,.F.);
	//<01> generating methods for consolidated attribute:  RelatingPriorities
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: RelatingPriorities, base type: LIST OF NUMBER
	public boolean testRelatingpriorities(EIfcrelconnectspathelements type) throws SdaiException {
		return test_aggregate(a7);
	}
	public A_double getRelatingpriorities(EIfcrelconnectspathelements type) throws SdaiException {
		return (A_double)get_aggregate(a7);
	}
	public A_double createRelatingpriorities(EIfcrelconnectspathelements type) throws SdaiException {
		a7 = create_aggregate_double(a7, a7$, 0);
		return a7;
	}
	public void unsetRelatingpriorities(EIfcrelconnectspathelements type) throws SdaiException {
		unset_aggregate(a7);
		a7 = null;
	}
	public static jsdai.dictionary.EAttribute attributeRelatingpriorities(EIfcrelconnectspathelements type) throws SdaiException {
		return a7$;
	}

	//going through all the attributes: #5407=EXPLICIT_ATTRIBUTE('RelatedPriorities',#5404,1,#7086,$,.F.);
	//<01> generating methods for consolidated attribute:  RelatedPriorities
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: RelatedPriorities, base type: LIST OF NUMBER
	public boolean testRelatedpriorities(EIfcrelconnectspathelements type) throws SdaiException {
		return test_aggregate(a8);
	}
	public A_double getRelatedpriorities(EIfcrelconnectspathelements type) throws SdaiException {
		return (A_double)get_aggregate(a8);
	}
	public A_double createRelatedpriorities(EIfcrelconnectspathelements type) throws SdaiException {
		a8 = create_aggregate_double(a8, a8$, 0);
		return a8;
	}
	public void unsetRelatedpriorities(EIfcrelconnectspathelements type) throws SdaiException {
		unset_aggregate(a8);
		a8 = null;
	}
	public static jsdai.dictionary.EAttribute attributeRelatedpriorities(EIfcrelconnectspathelements type) throws SdaiException {
		return a8$;
	}

	//going through all the attributes: #5408=EXPLICIT_ATTRIBUTE('RelatedConnectionType',#5404,2,#2773,$,.F.);
	//<01> generating methods for consolidated attribute:  RelatedConnectionType
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute:RelatedConnectionType, base type: ENUMERATION
	public boolean testRelatedconnectiontype(EIfcrelconnectspathelements type) throws SdaiException {
		return test_enumeration(a9);
	}
	public int getRelatedconnectiontype(EIfcrelconnectspathelements type) throws SdaiException {
		return get_enumeration(a9);
	}
	public void setRelatedconnectiontype(EIfcrelconnectspathelements type, int value) throws SdaiException {
		a9 = set_enumeration(value, a9$);
	}
	public void unsetRelatedconnectiontype(EIfcrelconnectspathelements type) throws SdaiException {
		a9 = unset_enumeration();
	}
	public static jsdai.dictionary.EAttribute attributeRelatedconnectiontype(EIfcrelconnectspathelements type) throws SdaiException {
		return a9$;
	}

	//going through all the attributes: #5409=EXPLICIT_ATTRIBUTE('RelatingConnectionType',#5404,3,#2773,$,.F.);
	//<01> generating methods for consolidated attribute:  RelatingConnectionType
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute:RelatingConnectionType, base type: ENUMERATION
	public boolean testRelatingconnectiontype(EIfcrelconnectspathelements type) throws SdaiException {
		return test_enumeration(a10);
	}
	public int getRelatingconnectiontype(EIfcrelconnectspathelements type) throws SdaiException {
		return get_enumeration(a10);
	}
	public void setRelatingconnectiontype(EIfcrelconnectspathelements type, int value) throws SdaiException {
		a10 = set_enumeration(value, a10$);
	}
	public void unsetRelatingconnectiontype(EIfcrelconnectspathelements type) throws SdaiException {
		a10 = unset_enumeration();
	}
	public static jsdai.dictionary.EAttribute attributeRelatingconnectiontype(EIfcrelconnectspathelements type) throws SdaiException {
		return a10$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a4 = unset_instance(a4);
			a5 = unset_instance(a5);
			a6 = unset_instance(a6);
			a9 = 0;
			a10 = 0;
			a0 = null;
			a1 = unset_instance(a1);
			a2 = null;
			a3 = null;
			return;
		}
		a4 = av.entityValues[2].getInstance(0, this, a4$);
		a5 = av.entityValues[2].getInstance(1, this, a5$);
		a6 = av.entityValues[2].getInstance(2, this, a6$);
		a7 = av.entityValues[3].getDoubleAggregate(0, a7$, this);
		a8 = av.entityValues[3].getDoubleAggregate(1, a8$, this);
		a9 = av.entityValues[3].getEnumeration(2, a9$);
		a10 = av.entityValues[3].getEnumeration(3, a10$);
		a0 = av.entityValues[4].getString(0);
		a1 = av.entityValues[4].getInstance(1, this, a1$);
		a2 = av.entityValues[4].getString(2);
		a3 = av.entityValues[4].getString(3);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a4 = unset_instance(a4);
			a5 = unset_instance(a5);
			a6 = unset_instance(a6);
			a9 = 0;
			a10 = 0;
			a0 = null;
			a1 = unset_instance(a1);
			a2 = null;
			a3 = null;
			return;
		}
		a4 = av.entityValues[2].getInstance(0, this, a4$);
		a5 = av.entityValues[2].getInstance(1, this, a5$);
		a6 = av.entityValues[2].getInstance(2, this, a6$);
		a7 = av.entityValues[3].getDoubleAggregate(0, a7$, this);
		a8 = av.entityValues[3].getDoubleAggregate(1, a8$, this);
		a9 = av.entityValues[3].getEnumeration(2, a9$);
		a10 = av.entityValues[3].getEnumeration(3, a10$);
		a0 = av.entityValues[4].getString(0);
		a1 = av.entityValues[4].getInstance(1, this, a1$);
		a2 = av.entityValues[4].getString(2);
		a3 = av.entityValues[4].getString(3);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcRelationship
		// partial entity: IfcRelConnects
		// partial entity: IfcRelConnectsElements
		av.entityValues[2].setInstance(0, a4);
		av.entityValues[2].setInstance(1, a5);
		av.entityValues[2].setInstance(2, a6);
		// partial entity: IfcRelConnectsPathElements
		av.entityValues[3].setDoubleAggregate(0, a7);
		av.entityValues[3].setDoubleAggregate(1, a8);
		av.entityValues[3].setEnumeration(2, a9, a9$);
		av.entityValues[3].setEnumeration(3, a10, a10$);
		// partial entity: IfcRoot
		av.entityValues[4].setString(0, a0);
		av.entityValues[4].setInstance(1, a1);
		av.entityValues[4].setString(2, a2);
		av.entityValues[4].setString(3, a3);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcRelationship
		// partial entity: IfcRelConnects
		// partial entity: IfcRelConnectsElements
		av.entityValues[2].setInstance(0, a4);
		av.entityValues[2].setInstance(1, a5);
		av.entityValues[2].setInstance(2, a6);
		// partial entity: IfcRelConnectsPathElements
		av.entityValues[3].setDoubleAggregate(0, a7);
		av.entityValues[3].setDoubleAggregate(1, a8);
		av.entityValues[3].setEnumeration(2, a9, a9$);
		av.entityValues[3].setEnumeration(3, a10, a10$);
		// partial entity: IfcRoot
		av.entityValues[4].setString(0, a0);
		av.entityValues[4].setInstance(1, a1);
		av.entityValues[4].setString(2, a2);
		av.entityValues[4].setString(3, a3);
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfcrelconnectspathelementsNormalizedrelatingpriorities(SdaiContext _context) throws SdaiException {
	





											
											Value _internal_aggregate_source239 = Value.alloc(jsdai.SIfc4.SIfc4._st_list_0_number).set(_context, get(a7$));
											Value _result237 = Value.alloc(_internal_aggregate_source239).create();
											if (_internal_aggregate_source239.getActualJavaType() != Value.INDETERMINATE) {
												for (int _i238 = 1; _i238 <= _internal_aggregate_source239.getMemberCount(); _i238++) {
													Value _implicit_56_temp = _internal_aggregate_source239.getByIndex(_i238);
													if (Value.alloc(ExpressTypes.LOGICAL_TYPE).AND(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).lequal(_context, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 0.0), _implicit_56_temp), Value.alloc(ExpressTypes.LOGICAL_TYPE).lequal(_context, _implicit_56_temp, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 1.0))).getLogical() == 2) {
														_result237.addMember(_context, _implicit_56_temp);
													} else
													if (_internal_aggregate_source239.getDeclaredType() instanceof jsdai.dictionary.EArray_type) {
														_implicit_56_temp.unset();
														_result237.addMember(_context, _implicit_56_temp);
													}
												}
											} else {
												_result237.unset();
											}
		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).OR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(Value.alloc(jsdai.SIfc4.SIfc4._st_list_0_number).set(_context, get(a7$))), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 0)), Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(_result237), Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(Value.alloc(jsdai.SIfc4.SIfc4._st_list_0_number).set(_context, get(a7$)))))).getLogical());
	}
	public int rIfcrelconnectspathelementsNormalizedrelatedpriorities(SdaiContext _context) throws SdaiException {
	





											
											Value _internal_aggregate_source243 = Value.alloc(jsdai.SIfc4.SIfc4._st_list_0_number).set(_context, get(a8$));
											Value _result241 = Value.alloc(_internal_aggregate_source243).create();
											if (_internal_aggregate_source243.getActualJavaType() != Value.INDETERMINATE) {
												for (int _i242 = 1; _i242 <= _internal_aggregate_source243.getMemberCount(); _i242++) {
													Value _implicit_57_temp = _internal_aggregate_source243.getByIndex(_i242);
													if (Value.alloc(ExpressTypes.LOGICAL_TYPE).AND(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).lequal(_context, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 0.0), _implicit_57_temp), Value.alloc(ExpressTypes.LOGICAL_TYPE).lequal(_context, _implicit_57_temp, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 1.0))).getLogical() == 2) {
														_result241.addMember(_context, _implicit_57_temp);
													} else
													if (_internal_aggregate_source243.getDeclaredType() instanceof jsdai.dictionary.EArray_type) {
														_implicit_57_temp.unset();
														_result241.addMember(_context, _implicit_57_temp);
													}
												}
											} else {
												_result241.unset();
											}
		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).OR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(Value.alloc(jsdai.SIfc4.SIfc4._st_list_0_number).set(_context, get(a8$))), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 0)), Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(_result241), Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(Value.alloc(jsdai.SIfc4.SIfc4._st_list_0_number).set(_context, get(a8$)))))).getLogical());
	}
}
