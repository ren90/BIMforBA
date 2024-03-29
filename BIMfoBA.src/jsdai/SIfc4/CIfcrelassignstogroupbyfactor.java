/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcRelAssignsToGroupByFactor

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcrelassignstogroupbyfactor extends CIfcrelassignstogroup implements EIfcrelassignstogroupbyfactor {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcrelassignstogroupbyfactor.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// GlobalId: protected String a0;   GlobalId - java inheritance - STRING
	// OwnerHistory: protected Object a1;   OwnerHistory - java inheritance - ENTITY IfcOwnerHistory
	// Name: protected String a2;   Name - java inheritance - STRING
	// Description: protected String a3;   Description - java inheritance - STRING
	// RelatedObjects: protected AIfcobjectdefinition a4;   RelatedObjects - java inheritance - SET OF ENTITY
	// RelatedObjectsType: protected int a5;   RelatedObjectsType - java inheritance - ENUMERATION IfcObjectTypeEnum
	// RelatingGroup: protected Object a6;   RelatingGroup - java inheritance - ENTITY IfcGroup
	protected double a7; // Factor - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
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
	// RelatedObjects - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	// protected AIfcobjectdefinition a4;
	// RelatedObjectsType - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	// protected int a5;
	// RelatingGroup - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	// protected Object a6;
	// Factor - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	protected double a7;

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
	//going through all the attributes: #5350=EXPLICIT_ATTRIBUTE('RelatedObjects',#5348,0,#7075,$,.F.);
	//<01> generating methods for consolidated attribute:  RelatedObjects
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// methods for attribute: RelatedObjects, base type: SET OF ENTITY
	public static int usedinRelatedobjects(EIfcrelassigns type, EIfcobjectdefinition instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a4$, domain, result);
	}
	//going through all the attributes: #5351=EXPLICIT_ATTRIBUTE('RelatedObjectsType',#5348,1,#2933,$,.T.);
	//<01> generating methods for consolidated attribute:  RelatedObjectsType
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5361=EXPLICIT_ATTRIBUTE('RelatingGroup',#5359,0,#4447,$,.F.);
	//<01> generating methods for consolidated attribute:  RelatingGroup
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): RelatingGroup, base type: entity IfcGroup
	public static int usedinRelatinggroup(EIfcrelassignstogroup type, EIfcgroup instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a6$, domain, result);
	}
	//going through all the attributes: #5364=EXPLICIT_ATTRIBUTE('Factor',#5362,0,#2621,$,.F.);
	//<01> generating methods for consolidated attribute:  Factor
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Factor, base type: REAL
	public boolean testFactor(EIfcrelassignstogroupbyfactor type) throws SdaiException {
		return test_double(a7);
	}
	public double getFactor(EIfcrelassignstogroupbyfactor type) throws SdaiException {
		return get_double(a7);
	}
	public void setFactor(EIfcrelassignstogroupbyfactor type, double value) throws SdaiException {
		a7 = set_double(value);
	}
	public void unsetFactor(EIfcrelassignstogroupbyfactor type) throws SdaiException {
		a7 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeFactor(EIfcrelassignstogroupbyfactor type) throws SdaiException {
		return a7$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			if (a4 instanceof CAggregate)
				a4.unsetAll();
			a4 = null;
			a5 = 0;
			a6 = unset_instance(a6);
			a7 = Double.NaN;
			a0 = null;
			a1 = unset_instance(a1);
			a2 = null;
			a3 = null;
			return;
		}
		a4 = (AIfcobjectdefinition)av.entityValues[0].getInstanceAggregate(0, a4$, this);
		a5 = av.entityValues[0].getEnumeration(1, a5$);
		a6 = av.entityValues[1].getInstance(0, this, a6$);
		a7 = av.entityValues[2].getDouble(0);
		a0 = av.entityValues[4].getString(0);
		a1 = av.entityValues[4].getInstance(1, this, a1$);
		a2 = av.entityValues[4].getString(2);
		a3 = av.entityValues[4].getString(3);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			if (a4 instanceof CAggregate)
				a4.unsetAll();
			a4 = null;
			a5 = 0;
			a6 = unset_instance(a6);
			a7 = Double.NaN;
			a0 = null;
			a1 = unset_instance(a1);
			a2 = null;
			a3 = null;
			return;
		}
		a4 = (AIfcobjectdefinition)av.entityValues[0].getInstanceAggregate(0, a4$, this);
		a5 = av.entityValues[0].getEnumeration(1, a5$);
		a6 = av.entityValues[1].getInstance(0, this, a6$);
		a7 = av.entityValues[2].getDouble(0);
		a0 = av.entityValues[4].getString(0);
		a1 = av.entityValues[4].getInstance(1, this, a1$);
		a2 = av.entityValues[4].getString(2);
		a3 = av.entityValues[4].getString(3);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcRelAssigns
		av.entityValues[0].setInstanceAggregate(0, a4);
		av.entityValues[0].setEnumeration(1, a5, a5$);
		// partial entity: IfcRelAssignsToGroup
		av.entityValues[1].setInstance(0, a6);
		// partial entity: IfcRelAssignsToGroupByFactor
		av.entityValues[2].setDouble(0, a7);
		// partial entity: IfcRelationship
		// partial entity: IfcRoot
		av.entityValues[4].setString(0, a0);
		av.entityValues[4].setInstance(1, a1);
		av.entityValues[4].setString(2, a2);
		av.entityValues[4].setString(3, a3);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcRelAssigns
		av.entityValues[0].setInstanceAggregate(0, a4);
		av.entityValues[0].setEnumeration(1, a5, a5$);
		// partial entity: IfcRelAssignsToGroup
		av.entityValues[1].setInstance(0, a6);
		// partial entity: IfcRelAssignsToGroupByFactor
		av.entityValues[2].setDouble(0, a7);
		// partial entity: IfcRelationship
		// partial entity: IfcRoot
		av.entityValues[4].setString(0, a0);
		av.entityValues[4].setInstance(1, a1);
		av.entityValues[4].setString(2, a2);
		av.entityValues[4].setString(3, a3);
	}
}
