/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcProperty

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcproperty extends CIfcpropertyabstraction implements EIfcproperty {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcproperty.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// HasExternalReferences: protected Object  - inverse - java inheritance -  ENTITY IfcExternalReferenceRelationship
	protected String a0; // Name - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected String a1; // Description - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// PartOfPset: protected Object  - inverse - current -  ENTITY IfcPropertySet
	protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// PropertyForDependance: protected Object  - inverse - current -  ENTITY IfcPropertyDependencyRelationship
	protected static final jsdai.dictionary.CInverse_attribute i2$ = CEntity.initInverseAttribute(definition, 2);
	// PropertyDependsOn: protected Object  - inverse - current -  ENTITY IfcPropertyDependencyRelationship
	protected static final jsdai.dictionary.CInverse_attribute i3$ = CEntity.initInverseAttribute(definition, 3);
	// PartOfComplex: protected Object  - inverse - current -  ENTITY IfcComplexProperty
	protected static final jsdai.dictionary.CInverse_attribute i4$ = CEntity.initInverseAttribute(definition, 4);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// HasExternalReferences - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// Name - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected String a0;
	// Description - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected String a1;
	// PartOfPset - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// PropertyForDependance - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i2$ = CEntity.initInverseAttribute(definition, 2);
	// PropertyDependsOn - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i3$ = CEntity.initInverseAttribute(definition, 3);
	// PartOfComplex - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i4$ = CEntity.initInverseAttribute(definition, 4);

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
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5096=EXPLICIT_ATTRIBUTE('Name',#5094,0,#2523,$,.F.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Name, base type: STRING
	public boolean testName(EIfcproperty type) throws SdaiException {
		return test_string(a0);
	}
	public String getName(EIfcproperty type) throws SdaiException {
		return get_string(a0);
	}
	public void setName(EIfcproperty type, String value) throws SdaiException {
		a0 = set_string(value);
	}
	public void unsetName(EIfcproperty type) throws SdaiException {
		a0 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeName(EIfcproperty type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #5097=EXPLICIT_ATTRIBUTE('Description',#5094,1,#2657,$,.T.);
	//<01> generating methods for consolidated attribute:  Description
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Description, base type: STRING
	public boolean testDescription(EIfcproperty type) throws SdaiException {
		return test_string(a1);
	}
	public String getDescription(EIfcproperty type) throws SdaiException {
		return get_string(a1);
	}
	public void setDescription(EIfcproperty type, String value) throws SdaiException {
		a1 = set_string(value);
	}
	public void unsetDescription(EIfcproperty type) throws SdaiException {
		a1 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeDescription(EIfcproperty type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #5098=INVERSE_ATTRIBUTE('PartOfPset',#5094,0,#5137,$,#5139,#8908,$,.F.);
	//<01> generating methods for consolidated attribute:  PartOfPset
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	// Inverse attribute - PartOfPset : SET[0:-2147483648] OF IfcPropertySet FOR HasProperties
	public AIfcpropertyset getPartofpset(EIfcproperty type, ASdaiModel domain) throws SdaiException {
		AIfcpropertyset result = (AIfcpropertyset)get_inverse_aggregate(i1$);
		CIfcpropertyset.usedinHasproperties(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributePartofpset(EIfcproperty type) throws SdaiException {
		return i1$;
	}

	//going through all the attributes: #5099=INVERSE_ATTRIBUTE('PropertyForDependance',#5094,1,#5115,$,#5117,#8910,$,.F.);
	//<01> generating methods for consolidated attribute:  PropertyForDependance
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	// Inverse attribute - PropertyForDependance : SET[0:-2147483648] OF IfcPropertyDependencyRelationship FOR DependingProperty
	public AIfcpropertydependencyrelationship getPropertyfordependance(EIfcproperty type, ASdaiModel domain) throws SdaiException {
		AIfcpropertydependencyrelationship result = (AIfcpropertydependencyrelationship)get_inverse_aggregate(i2$);
		CIfcpropertydependencyrelationship.usedinDependingproperty(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributePropertyfordependance(EIfcproperty type) throws SdaiException {
		return i2$;
	}

	//going through all the attributes: #5100=INVERSE_ATTRIBUTE('PropertyDependsOn',#5094,2,#5115,$,#5118,#8912,$,.F.);
	//<01> generating methods for consolidated attribute:  PropertyDependsOn
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	// Inverse attribute - PropertyDependsOn : SET[0:-2147483648] OF IfcPropertyDependencyRelationship FOR DependantProperty
	public AIfcpropertydependencyrelationship getPropertydependson(EIfcproperty type, ASdaiModel domain) throws SdaiException {
		AIfcpropertydependencyrelationship result = (AIfcpropertydependencyrelationship)get_inverse_aggregate(i3$);
		CIfcpropertydependencyrelationship.usedinDependantproperty(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributePropertydependson(EIfcproperty type) throws SdaiException {
		return i3$;
	}

	//going through all the attributes: #5101=INVERSE_ATTRIBUTE('PartOfComplex',#5094,3,#3675,$,#3678,#8914,$,.F.);
	//<01> generating methods for consolidated attribute:  PartOfComplex
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	// Inverse attribute - PartOfComplex : SET[0:-2147483648] OF IfcComplexProperty FOR HasProperties
	public AIfccomplexproperty getPartofcomplex(EIfcproperty type, ASdaiModel domain) throws SdaiException {
		AIfccomplexproperty result = (AIfccomplexproperty)get_inverse_aggregate(i4$);
		CIfccomplexproperty.usedinHasproperties(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributePartofcomplex(EIfcproperty type) throws SdaiException {
		return i4$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = null;
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = av.entityValues[0].getString(1);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = null;
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = av.entityValues[0].getString(1);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcProperty
		av.entityValues[0].setString(0, a0);
		av.entityValues[0].setString(1, a1);
		// partial entity: IfcPropertyAbstraction
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcProperty
		av.entityValues[0].setString(0, a0);
		av.entityValues[0].setString(1, a1);
		// partial entity: IfcPropertyAbstraction
	}
}
