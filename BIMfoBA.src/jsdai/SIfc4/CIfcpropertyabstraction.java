/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcPropertyAbstraction

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcpropertyabstraction extends CEntity implements EIfcpropertyabstraction {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcpropertyabstraction.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// HasExternalReferences: protected Object  - inverse - current -  ENTITY IfcExternalReferenceRelationship
	protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// HasExternalReferences - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #5104=INVERSE_ATTRIBUTE('HasExternalReferences',#5102,0,#4231,$,#4234,#8918,$,.F.);
	//<01> generating methods for consolidated attribute:  HasExternalReferences
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	// Inverse attribute - HasExternalReferences : SET[0:-2147483648] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
	public AIfcexternalreferencerelationship getHasexternalreferences(EIfcpropertyabstraction type, ASdaiModel domain) throws SdaiException {
		AIfcexternalreferencerelationship result = (AIfcexternalreferencerelationship)get_inverse_aggregate(i0$);
		CIfcexternalreferencerelationship.usedinRelatedresourceobjects(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributeHasexternalreferences(EIfcpropertyabstraction type) throws SdaiException {
		return i0$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			return;
		}
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			return;
		}
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcPropertyAbstraction
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcPropertyAbstraction
	}
}
