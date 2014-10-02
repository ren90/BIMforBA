/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcConversionBasedUnit

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcconversionbasedunit extends CIfcnamedunit implements EIfcconversionbasedunit {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcconversionbasedunit.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// Dimensions: protected Object a0;   Dimensions - java inheritance - ENTITY IfcDimensionalExponents
	// UnitType: protected int a1;   UnitType - java inheritance - ENUMERATION IfcUnitEnum
	protected String a2; // Name - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected Object a3; // ConversionFactor - current entity - ENTITY IfcMeasureWithUnit
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	// HasExternalReference: protected Object  - inverse - current -  ENTITY IfcExternalReferenceRelationship
	protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// Dimensions - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected Object a0;
	// UnitType - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected int a1;
	// Name - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected String a2;
	// ConversionFactor - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected Object a3;
	// HasExternalReference - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);

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

	//going through all the attributes: #4780=EXPLICIT_ATTRIBUTE('Dimensions',#4778,0,#3939,$,.F.);
	//<01> generating methods for consolidated attribute:  Dimensions
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): Dimensions, base type: entity IfcDimensionalExponents
	public static int usedinDimensions(EIfcnamedunit type, EIfcdimensionalexponents instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	//going through all the attributes: #4781=EXPLICIT_ATTRIBUTE('UnitType',#4778,1,#3077,$,.F.);
	//<01> generating methods for consolidated attribute:  UnitType
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3808=EXPLICIT_ATTRIBUTE('Name',#3806,0,#2539,$,.F.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Name, base type: STRING
	public boolean testName(EIfcconversionbasedunit type) throws SdaiException {
		return test_string(a2);
	}
	public String getName(EIfcconversionbasedunit type) throws SdaiException {
		return get_string(a2);
	}
	public void setName(EIfcconversionbasedunit type, String value) throws SdaiException {
		a2 = set_string(value);
	}
	public void unsetName(EIfcconversionbasedunit type) throws SdaiException {
		a2 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeName(EIfcconversionbasedunit type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #3809=EXPLICIT_ATTRIBUTE('ConversionFactor',#3806,1,#4732,$,.F.);
	//<01> generating methods for consolidated attribute:  ConversionFactor
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : ConversionFactor, base type: entity IfcMeasureWithUnit
	public static int usedinConversionfactor(EIfcconversionbasedunit type, EIfcmeasurewithunit instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a3$, domain, result);
	}
	public boolean testConversionfactor(EIfcconversionbasedunit type) throws SdaiException {
		return test_instance(a3);
	}
	public EIfcmeasurewithunit getConversionfactor(EIfcconversionbasedunit type) throws SdaiException {
		return (EIfcmeasurewithunit)get_instance(a3);
	}
	public void setConversionfactor(EIfcconversionbasedunit type, EIfcmeasurewithunit value) throws SdaiException {
		a3 = set_instance(a3, value);
	}
	public void unsetConversionfactor(EIfcconversionbasedunit type) throws SdaiException {
		a3 = unset_instance(a3);
	}
	public static jsdai.dictionary.EAttribute attributeConversionfactor(EIfcconversionbasedunit type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #3810=INVERSE_ATTRIBUTE('HasExternalReference',#3806,0,#4231,$,#4234,#8020,$,.F.);
	//<01> generating methods for consolidated attribute:  HasExternalReference
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	// Inverse attribute - HasExternalReference : SET[0:-2147483648] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
	public AIfcexternalreferencerelationship getHasexternalreference(EIfcconversionbasedunit type, ASdaiModel domain) throws SdaiException {
		AIfcexternalreferencerelationship result = (AIfcexternalreferencerelationship)get_inverse_aggregate(i0$);
		CIfcexternalreferencerelationship.usedinRelatedresourceobjects(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributeHasexternalreference(EIfcconversionbasedunit type) throws SdaiException {
		return i0$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a2 = null;
			a3 = unset_instance(a3);
			a0 = unset_instance(a0);
			a1 = 0;
			return;
		}
		a2 = av.entityValues[0].getString(0);
		a3 = av.entityValues[0].getInstance(1, this, a3$);
		a0 = av.entityValues[1].getInstance(0, this, a0$);
		a1 = av.entityValues[1].getEnumeration(1, a1$);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a2 = null;
			a3 = unset_instance(a3);
			a0 = unset_instance(a0);
			a1 = 0;
			return;
		}
		a2 = av.entityValues[0].getString(0);
		a3 = av.entityValues[0].getInstance(1, this, a3$);
		a0 = av.entityValues[1].getInstance(0, this, a0$);
		a1 = av.entityValues[1].getEnumeration(1, a1$);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcConversionBasedUnit
		av.entityValues[0].setString(0, a2);
		av.entityValues[0].setInstance(1, a3);
		// partial entity: IfcNamedUnit
		av.entityValues[1].setInstance(0, a0);
		av.entityValues[1].setEnumeration(1, a1, a1$);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcConversionBasedUnit
		av.entityValues[0].setString(0, a2);
		av.entityValues[0].setInstance(1, a3);
		// partial entity: IfcNamedUnit
		av.entityValues[1].setInstance(0, a0);
		av.entityValues[1].setEnumeration(1, a1, a1$);
	}
}
