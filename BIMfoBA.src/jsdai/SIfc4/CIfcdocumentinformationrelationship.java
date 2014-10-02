/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcDocumentInformationRelationship

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcdocumentinformationrelationship extends CIfcresourcelevelrelationship implements EIfcdocumentinformationrelationship {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcdocumentinformationrelationship.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// Name: protected String a0;   Name - java inheritance - STRING
	// Description: protected String a1;   Description - java inheritance - STRING
	protected Object a2; // RelatingDocument - current entity - ENTITY IfcDocumentInformation
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected AIfcdocumentinformation a3; // RelatedDocuments - current entity - SET OF ENTITY
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected String a4; // RelationshipType - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// Name - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected String a0;
	// Description - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected String a1;
	// RelatingDocument - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected Object a2;
	// RelatedDocuments - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected AIfcdocumentinformation a3;
	// RelationshipType - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected String a4;

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
	//going through all the attributes: #4015=EXPLICIT_ATTRIBUTE('RelatingDocument',#4013,0,#3990,$,.F.);
	//<01> generating methods for consolidated attribute:  RelatingDocument
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : RelatingDocument, base type: entity IfcDocumentInformation
	public static int usedinRelatingdocument(EIfcdocumentinformationrelationship type, EIfcdocumentinformation instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a2$, domain, result);
	}
	public boolean testRelatingdocument(EIfcdocumentinformationrelationship type) throws SdaiException {
		return test_instance(a2);
	}
	public EIfcdocumentinformation getRelatingdocument(EIfcdocumentinformationrelationship type) throws SdaiException {
		return (EIfcdocumentinformation)get_instance(a2);
	}
	public void setRelatingdocument(EIfcdocumentinformationrelationship type, EIfcdocumentinformation value) throws SdaiException {
		a2 = set_instance(a2, value);
	}
	public void unsetRelatingdocument(EIfcdocumentinformationrelationship type) throws SdaiException {
		a2 = unset_instance(a2);
	}
	public static jsdai.dictionary.EAttribute attributeRelatingdocument(EIfcdocumentinformationrelationship type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #4016=EXPLICIT_ATTRIBUTE('RelatedDocuments',#4013,1,#6900,$,.F.);
	//<01> generating methods for consolidated attribute:  RelatedDocuments
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: RelatedDocuments, base type: SET OF ENTITY
	public static int usedinRelateddocuments(EIfcdocumentinformationrelationship type, EIfcdocumentinformation instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a3$, domain, result);
	}
	public boolean testRelateddocuments(EIfcdocumentinformationrelationship type) throws SdaiException {
		return test_aggregate(a3);
	}
	public AIfcdocumentinformation getRelateddocuments(EIfcdocumentinformationrelationship type) throws SdaiException {
		return (AIfcdocumentinformation)get_aggregate(a3);
	}
	public AIfcdocumentinformation createRelateddocuments(EIfcdocumentinformationrelationship type) throws SdaiException {
		a3 = (AIfcdocumentinformation)create_aggregate_class(a3, a3$,  AIfcdocumentinformation.class, 0);
		return a3;
	}
	public void unsetRelateddocuments(EIfcdocumentinformationrelationship type) throws SdaiException {
		unset_aggregate(a3);
		a3 = null;
	}
	public static jsdai.dictionary.EAttribute attributeRelateddocuments(EIfcdocumentinformationrelationship type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #4017=EXPLICIT_ATTRIBUTE('RelationshipType',#4013,2,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  RelationshipType
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: RelationshipType, base type: STRING
	public boolean testRelationshiptype(EIfcdocumentinformationrelationship type) throws SdaiException {
		return test_string(a4);
	}
	public String getRelationshiptype(EIfcdocumentinformationrelationship type) throws SdaiException {
		return get_string(a4);
	}
	public void setRelationshiptype(EIfcdocumentinformationrelationship type, String value) throws SdaiException {
		a4 = set_string(value);
	}
	public void unsetRelationshiptype(EIfcdocumentinformationrelationship type) throws SdaiException {
		a4 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeRelationshiptype(EIfcdocumentinformationrelationship type) throws SdaiException {
		return a4$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a2 = unset_instance(a2);
			if (a3 instanceof CAggregate)
				a3.unsetAll();
			a3 = null;
			a4 = null;
			a0 = null;
			a1 = null;
			return;
		}
		a2 = av.entityValues[0].getInstance(0, this, a2$);
		a3 = (AIfcdocumentinformation)av.entityValues[0].getInstanceAggregate(1, a3$, this);
		a4 = av.entityValues[0].getString(2);
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
			a4 = null;
			a0 = null;
			a1 = null;
			return;
		}
		a2 = av.entityValues[0].getInstance(0, this, a2$);
		a3 = (AIfcdocumentinformation)av.entityValues[0].getInstanceAggregate(1, a3$, this);
		a4 = av.entityValues[0].getString(2);
		a0 = av.entityValues[1].getString(0);
		a1 = av.entityValues[1].getString(1);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcDocumentInformationRelationship
		av.entityValues[0].setInstance(0, a2);
		av.entityValues[0].setInstanceAggregate(1, a3);
		av.entityValues[0].setString(2, a4);
		// partial entity: IfcResourceLevelRelationship
		av.entityValues[1].setString(0, a0);
		av.entityValues[1].setString(1, a1);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcDocumentInformationRelationship
		av.entityValues[0].setInstance(0, a2);
		av.entityValues[0].setInstanceAggregate(1, a3);
		av.entityValues[0].setString(2, a4);
		// partial entity: IfcResourceLevelRelationship
		av.entityValues[1].setString(0, a0);
		av.entityValues[1].setString(1, a1);
	}
}
