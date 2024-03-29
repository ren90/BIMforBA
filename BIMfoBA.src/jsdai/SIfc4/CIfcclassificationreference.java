/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcClassificationReference

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcclassificationreference extends CIfcexternalreference implements EIfcclassificationreference {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcclassificationreference.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// Location: protected String a0;   Location - java inheritance - STRING
	// Identification: protected String a1;   Identification - java inheritance - STRING
	// Name: protected String a2;   Name - java inheritance - STRING
	// ExternalReferenceForResources: protected Object  - inverse - java inheritance -  ENTITY IfcExternalReferenceRelationship
	protected Object a3; // ReferencedSource - current entity - SELECT IfcClassificationReferenceSelect
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected String a4; // Description - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected String a5; // Sort - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	// ClassificationRefForObjects: protected Object  - inverse - current -  ENTITY IfcRelAssociatesClassification
	protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// HasReferences: protected Object  - inverse - current -  ENTITY IfcClassificationReference
	protected static final jsdai.dictionary.CInverse_attribute i2$ = CEntity.initInverseAttribute(definition, 2);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// Location - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected String a0;
	// Identification - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected String a1;
	// Name - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	// protected String a2;
	// ExternalReferenceForResources - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// ReferencedSource - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected Object a3;
	// Description - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected String a4;
	// Sort - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected String a5;
	// ClassificationRefForObjects - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// HasReferences - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i2$ = CEntity.initInverseAttribute(definition, 2);

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a3 == old) {
			a3 = newer;
		}
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a3 == old) {
			a3 = newer;
		}
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #4227=EXPLICIT_ATTRIBUTE('Location',#4225,0,#2687,$,.T.);
	//<01> generating methods for consolidated attribute:  Location
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4228=EXPLICIT_ATTRIBUTE('Identification',#4225,1,#2523,$,.T.);
	//<01> generating methods for consolidated attribute:  Identification
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4229=EXPLICIT_ATTRIBUTE('Name',#4225,2,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4230=INVERSE_ATTRIBUTE('ExternalReferenceForResources',#4225,0,#4231,$,#4233,#8311,$,.F.);
	//<01> generating methods for consolidated attribute:  ExternalReferenceForResources
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3637=EXPLICIT_ATTRIBUTE('ReferencedSource',#3635,0,#3121,$,.T.);
	//<01> generating methods for consolidated attribute:  ReferencedSource
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// -2- methods for SELECT attribute: ReferencedSource
	public static int usedinReferencedsource(EIfcclassificationreference type, EEntity instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a3$, domain, result);
	}
	public boolean testReferencedsource(EIfcclassificationreference type) throws SdaiException {
		return test_instance(a3);
	}

	public EEntity getReferencedsource(EIfcclassificationreference type) throws SdaiException { // case 1
		return get_instance_select(a3);
	}

	public void setReferencedsource(EIfcclassificationreference type, EEntity value) throws SdaiException { // case 1
		a3 = set_instance(a3, value);
	}

	public void unsetReferencedsource(EIfcclassificationreference type) throws SdaiException {
		a3 = unset_instance(a3);
	}

	public static jsdai.dictionary.EAttribute attributeReferencedsource(EIfcclassificationreference type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #3638=EXPLICIT_ATTRIBUTE('Description',#3635,1,#2657,$,.T.);
	//<01> generating methods for consolidated attribute:  Description
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Description, base type: STRING
	public boolean testDescription(EIfcclassificationreference type) throws SdaiException {
		return test_string(a4);
	}
	public String getDescription(EIfcclassificationreference type) throws SdaiException {
		return get_string(a4);
	}
	public void setDescription(EIfcclassificationreference type, String value) throws SdaiException {
		a4 = set_string(value);
	}
	public void unsetDescription(EIfcclassificationreference type) throws SdaiException {
		a4 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeDescription(EIfcclassificationreference type) throws SdaiException {
		return a4$;
	}

	//going through all the attributes: #3639=EXPLICIT_ATTRIBUTE('Sort',#3635,2,#2523,$,.T.);
	//<01> generating methods for consolidated attribute:  Sort
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Sort, base type: STRING
	public boolean testSort(EIfcclassificationreference type) throws SdaiException {
		return test_string(a5);
	}
	public String getSort(EIfcclassificationreference type) throws SdaiException {
		return get_string(a5);
	}
	public void setSort(EIfcclassificationreference type, String value) throws SdaiException {
		a5 = set_string(value);
	}
	public void unsetSort(EIfcclassificationreference type) throws SdaiException {
		a5 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeSort(EIfcclassificationreference type) throws SdaiException {
		return a5$;
	}

	//going through all the attributes: #3640=INVERSE_ATTRIBUTE('ClassificationRefForObjects',#3635,0,#5381,$,#5383,#7883,$,.F.);
	//<01> generating methods for consolidated attribute:  ClassificationRefForObjects
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	// Inverse attribute - ClassificationRefForObjects : SET[0:-2147483648] OF IfcRelAssociatesClassification FOR RelatingClassification
	public AIfcrelassociatesclassification getClassificationrefforobjects(EIfcclassificationreference type, ASdaiModel domain) throws SdaiException {
		AIfcrelassociatesclassification result = (AIfcrelassociatesclassification)get_inverse_aggregate(i1$);
		CIfcrelassociatesclassification.usedinRelatingclassification(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributeClassificationrefforobjects(EIfcclassificationreference type) throws SdaiException {
		return i1$;
	}

	//going through all the attributes: #3641=INVERSE_ATTRIBUTE('HasReferences',#3635,1,#3635,$,#3637,#7885,$,.F.);
	//<01> generating methods for consolidated attribute:  HasReferences
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	// Inverse attribute - HasReferences : SET[0:-2147483648] OF IfcClassificationReference FOR ReferencedSource
	public AIfcclassificationreference getHasreferences(EIfcclassificationreference type, ASdaiModel domain) throws SdaiException {
		AIfcclassificationreference result = (AIfcclassificationreference)get_inverse_aggregate(i2$);
		CIfcclassificationreference.usedinReferencedsource(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributeHasreferences(EIfcclassificationreference type) throws SdaiException {
		return i2$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a3 = unset_instance(a3);
			a4 = null;
			a5 = null;
			a0 = null;
			a1 = null;
			a2 = null;
			return;
		}
		a3 = av.entityValues[0].getInstance(0, this, a3$);
		a4 = av.entityValues[0].getString(1);
		a5 = av.entityValues[0].getString(2);
		a0 = av.entityValues[1].getString(0);
		a1 = av.entityValues[1].getString(1);
		a2 = av.entityValues[1].getString(2);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a3 = unset_instance(a3);
			a4 = null;
			a5 = null;
			a0 = null;
			a1 = null;
			a2 = null;
			return;
		}
		a3 = av.entityValues[0].getInstance(0, this, a3$);
		a4 = av.entityValues[0].getString(1);
		a5 = av.entityValues[0].getString(2);
		a0 = av.entityValues[1].getString(0);
		a1 = av.entityValues[1].getString(1);
		a2 = av.entityValues[1].getString(2);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcClassificationReference
		av.entityValues[0].setInstance(0, a3);
		av.entityValues[0].setString(1, a4);
		av.entityValues[0].setString(2, a5);
		// partial entity: IfcExternalReference
		av.entityValues[1].setString(0, a0);
		av.entityValues[1].setString(1, a1);
		av.entityValues[1].setString(2, a2);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcClassificationReference
		av.entityValues[0].setInstance(0, a3);
		av.entityValues[0].setString(1, a4);
		av.entityValues[0].setString(2, a5);
		// partial entity: IfcExternalReference
		av.entityValues[1].setString(0, a0);
		av.entityValues[1].setString(1, a1);
		av.entityValues[1].setString(2, a2);
	}
}
