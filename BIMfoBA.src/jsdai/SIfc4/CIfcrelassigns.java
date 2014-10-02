/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcRelAssigns

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcrelassigns extends CIfcrelationship implements EIfcrelassigns {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcrelassigns.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// GlobalId: protected String a0;   GlobalId - java inheritance - STRING
	// OwnerHistory: protected Object a1;   OwnerHistory - java inheritance - ENTITY IfcOwnerHistory
	// Name: protected String a2;   Name - java inheritance - STRING
	// Description: protected String a3;   Description - java inheritance - STRING
	protected AIfcobjectdefinition a4; // RelatedObjects - current entity - SET OF ENTITY
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected int a5; // RelatedObjectsType - current entity - ENUMERATION IfcObjectTypeEnum
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
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
	// RelatedObjects - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected AIfcobjectdefinition a4;
	// RelatedObjectsType - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected int a5;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		changeReferencesAggregate(a4, old, newer);
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		changeReferencesAggregate(a4, old, newer);
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
	//going through all the attributes: #5350=EXPLICIT_ATTRIBUTE('RelatedObjects',#5348,0,#7075,$,.F.);
	//<01> generating methods for consolidated attribute:  RelatedObjects
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: RelatedObjects, base type: SET OF ENTITY
	public static int usedinRelatedobjects(EIfcrelassigns type, EIfcobjectdefinition instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a4$, domain, result);
	}
	public boolean testRelatedobjects(EIfcrelassigns type) throws SdaiException {
		return test_aggregate(a4);
	}
	public AIfcobjectdefinition getRelatedobjects(EIfcrelassigns type) throws SdaiException {
		return (AIfcobjectdefinition)get_aggregate(a4);
	}
	public AIfcobjectdefinition createRelatedobjects(EIfcrelassigns type) throws SdaiException {
		a4 = (AIfcobjectdefinition)create_aggregate_class(a4, a4$,  AIfcobjectdefinition.class, 0);
		return a4;
	}
	public void unsetRelatedobjects(EIfcrelassigns type) throws SdaiException {
		unset_aggregate(a4);
		a4 = null;
	}
	public static jsdai.dictionary.EAttribute attributeRelatedobjects(EIfcrelassigns type) throws SdaiException {
		return a4$;
	}

	//going through all the attributes: #5351=EXPLICIT_ATTRIBUTE('RelatedObjectsType',#5348,1,#2933,$,.T.);
	//<01> generating methods for consolidated attribute:  RelatedObjectsType
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute:RelatedObjectsType, base type: ENUMERATION
	public boolean testRelatedobjectstype(EIfcrelassigns type) throws SdaiException {
		return test_enumeration(a5);
	}
	public int getRelatedobjectstype(EIfcrelassigns type) throws SdaiException {
		return get_enumeration(a5);
	}
	public void setRelatedobjectstype(EIfcrelassigns type, int value) throws SdaiException {
		a5 = set_enumeration(value, a5$);
	}
	public void unsetRelatedobjectstype(EIfcrelassigns type) throws SdaiException {
		a5 = unset_enumeration();
	}
	public static jsdai.dictionary.EAttribute attributeRelatedobjectstype(EIfcrelassigns type) throws SdaiException {
		return a5$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			if (a4 instanceof CAggregate)
				a4.unsetAll();
			a4 = null;
			a5 = 0;
			a0 = null;
			a1 = unset_instance(a1);
			a2 = null;
			a3 = null;
			return;
		}
		a4 = (AIfcobjectdefinition)av.entityValues[0].getInstanceAggregate(0, a4$, this);
		a5 = av.entityValues[0].getEnumeration(1, a5$);
		a0 = av.entityValues[2].getString(0);
		a1 = av.entityValues[2].getInstance(1, this, a1$);
		a2 = av.entityValues[2].getString(2);
		a3 = av.entityValues[2].getString(3);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			if (a4 instanceof CAggregate)
				a4.unsetAll();
			a4 = null;
			a5 = 0;
			a0 = null;
			a1 = unset_instance(a1);
			a2 = null;
			a3 = null;
			return;
		}
		a4 = (AIfcobjectdefinition)av.entityValues[0].getInstanceAggregate(0, a4$, this);
		a5 = av.entityValues[0].getEnumeration(1, a5$);
		a0 = av.entityValues[2].getString(0);
		a1 = av.entityValues[2].getInstance(1, this, a1$);
		a2 = av.entityValues[2].getString(2);
		a3 = av.entityValues[2].getString(3);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcRelAssigns
		av.entityValues[0].setInstanceAggregate(0, a4);
		av.entityValues[0].setEnumeration(1, a5, a5$);
		// partial entity: IfcRelationship
		// partial entity: IfcRoot
		av.entityValues[2].setString(0, a0);
		av.entityValues[2].setInstance(1, a1);
		av.entityValues[2].setString(2, a2);
		av.entityValues[2].setString(3, a3);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcRelAssigns
		av.entityValues[0].setInstanceAggregate(0, a4);
		av.entityValues[0].setEnumeration(1, a5, a5$);
		// partial entity: IfcRelationship
		// partial entity: IfcRoot
		av.entityValues[2].setString(0, a0);
		av.entityValues[2].setInstance(1, a1);
		av.entityValues[2].setString(2, a2);
		av.entityValues[2].setString(3, a3);
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfcrelassignsWr1(SdaiContext _context) throws SdaiException {
	




		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, (new jsdai.SIfc4.FIfccorrectobjectassignment()).run(_context, Value.alloc(jsdai.SIfc4.SIfc4._st_IfcObjectTypeEnum).set(_context, get(a5$)), Value.alloc(ExpressTypes.SET_GENERIC_TYPE).set(_context, get(a4$)))).getLogical());
	}
}