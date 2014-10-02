/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcApprovalRelationship

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcapprovalrelationship extends CIfcresourcelevelrelationship implements EIfcapprovalrelationship {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcapprovalrelationship.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// Name: protected String a0;   Name - java inheritance - STRING
	// Description: protected String a1;   Description - java inheritance - STRING
	protected Object a2; // RelatingApproval - current entity - ENTITY IfcApproval
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected AIfcapproval a3; // RelatedApprovals - current entity - SET OF ENTITY
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// Name - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected String a0;
	// Description - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected String a1;
	// RelatingApproval - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected Object a2;
	// RelatedApprovals - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected AIfcapproval a3;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a2 == old) {
			a2 = newer;
		}
		changeReferencesAggregate(a3, old, newer);
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a2 == old) {
			a2 = newer;
		}
		changeReferencesAggregate(a3, old, newer);
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #5575=EXPLICIT_ATTRIBUTE('Name',#5573,0,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5576=EXPLICIT_ATTRIBUTE('Description',#5573,1,#2657,$,.T.);
	//<01> generating methods for consolidated attribute:  Description
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3332=EXPLICIT_ATTRIBUTE('RelatingApproval',#3330,0,#3314,$,.F.);
	//<01> generating methods for consolidated attribute:  RelatingApproval
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : RelatingApproval, base type: entity IfcApproval
	public static int usedinRelatingapproval(EIfcapprovalrelationship type, EIfcapproval instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a2$, domain, result);
	}
	public boolean testRelatingapproval(EIfcapprovalrelationship type) throws SdaiException {
		return test_instance(a2);
	}
	public EIfcapproval getRelatingapproval(EIfcapprovalrelationship type) throws SdaiException {
		return (EIfcapproval)get_instance(a2);
	}
	public void setRelatingapproval(EIfcapprovalrelationship type, EIfcapproval value) throws SdaiException {
		a2 = set_instance(a2, value);
	}
	public void unsetRelatingapproval(EIfcapprovalrelationship type) throws SdaiException {
		a2 = unset_instance(a2);
	}
	public static jsdai.dictionary.EAttribute attributeRelatingapproval(EIfcapprovalrelationship type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #3333=EXPLICIT_ATTRIBUTE('RelatedApprovals',#3330,1,#6823,$,.F.);
	//<01> generating methods for consolidated attribute:  RelatedApprovals
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: RelatedApprovals, base type: SET OF ENTITY
	public static int usedinRelatedapprovals(EIfcapprovalrelationship type, EIfcapproval instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a3$, domain, result);
	}
	public boolean testRelatedapprovals(EIfcapprovalrelationship type) throws SdaiException {
		return test_aggregate(a3);
	}
	public AIfcapproval getRelatedapprovals(EIfcapprovalrelationship type) throws SdaiException {
		return (AIfcapproval)get_aggregate(a3);
	}
	public AIfcapproval createRelatedapprovals(EIfcapprovalrelationship type) throws SdaiException {
		a3 = (AIfcapproval)create_aggregate_class(a3, a3$,  AIfcapproval.class, 0);
		return a3;
	}
	public void unsetRelatedapprovals(EIfcapprovalrelationship type) throws SdaiException {
		unset_aggregate(a3);
		a3 = null;
	}
	public static jsdai.dictionary.EAttribute attributeRelatedapprovals(EIfcapprovalrelationship type) throws SdaiException {
		return a3$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a2 = unset_instance(a2);
			if (a3 instanceof CAggregate)
				a3.unsetAll();
			a3 = null;
			a0 = null;
			a1 = null;
			return;
		}
		a2 = av.entityValues[0].getInstance(0, this, a2$);
		a3 = (AIfcapproval)av.entityValues[0].getInstanceAggregate(1, a3$, this);
		a0 = av.entityValues[1].getString(0);
		a1 = av.entityValues[1].getString(1);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a2 = unset_instance(a2);
			if (a3 instanceof CAggregate)
				a3.unsetAll();
			a3 = null;
			a0 = null;
			a1 = null;
			return;
		}
		a2 = av.entityValues[0].getInstance(0, this, a2$);
		a3 = (AIfcapproval)av.entityValues[0].getInstanceAggregate(1, a3$, this);
		a0 = av.entityValues[1].getString(0);
		a1 = av.entityValues[1].getString(1);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcApprovalRelationship
		av.entityValues[0].setInstance(0, a2);
		av.entityValues[0].setInstanceAggregate(1, a3);
		// partial entity: IfcResourceLevelRelationship
		av.entityValues[1].setString(0, a0);
		av.entityValues[1].setString(1, a1);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcApprovalRelationship
		av.entityValues[0].setInstance(0, a2);
		av.entityValues[0].setInstanceAggregate(1, a3);
		// partial entity: IfcResourceLevelRelationship
		av.entityValues[1].setString(0, a0);
		av.entityValues[1].setString(1, a1);
	}
}
