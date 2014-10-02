/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcPropertyReferenceValue

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcpropertyreferencevalue extends CIfcsimpleproperty implements EIfcpropertyreferencevalue {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcpropertyreferencevalue.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// HasExternalReferences: protected Object  - inverse - java inheritance -  ENTITY IfcExternalReferenceRelationship
	// Name: protected String a0;   Name - java inheritance - STRING
	// Description: protected String a1;   Description - java inheritance - STRING
	// PartOfPset: protected Object  - inverse - java inheritance -  ENTITY IfcPropertySet
	// PropertyForDependance: protected Object  - inverse - java inheritance -  ENTITY IfcPropertyDependencyRelationship
	// PropertyDependsOn: protected Object  - inverse - java inheritance -  ENTITY IfcPropertyDependencyRelationship
	// PartOfComplex: protected Object  - inverse - java inheritance -  ENTITY IfcComplexProperty
	protected String a2; // UsageName - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected Object a3; // PropertyReference - current entity - SELECT IfcObjectReferenceSelect
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// HasExternalReferences - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// Name - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected String a0;
	// Description - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected String a1;
	// PartOfPset - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// PropertyForDependance - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i2$ = CEntity.initInverseAttribute(definition, 2);
	// PropertyDependsOn - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i3$ = CEntity.initInverseAttribute(definition, 3);
	// PartOfComplex - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i4$ = CEntity.initInverseAttribute(definition, 4);
	// UsageName - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected String a2;
	// PropertyReference - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected Object a3;

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

	//going through all the attributes: #5104=INVERSE_ATTRIBUTE('HasExternalReferences',#5102,0,#4231,$,#4234,#8918,$,.F.);
	//<01> generating methods for consolidated attribute:  HasExternalReferences
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5096=EXPLICIT_ATTRIBUTE('Name',#5094,0,#2523,$,.F.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5097=EXPLICIT_ATTRIBUTE('Description',#5094,1,#2657,$,.T.);
	//<01> generating methods for consolidated attribute:  Description
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5098=INVERSE_ATTRIBUTE('PartOfPset',#5094,0,#5137,$,#5139,#8908,$,.F.);
	//<01> generating methods for consolidated attribute:  PartOfPset
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5099=INVERSE_ATTRIBUTE('PropertyForDependance',#5094,1,#5115,$,#5117,#8910,$,.F.);
	//<01> generating methods for consolidated attribute:  PropertyForDependance
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5100=INVERSE_ATTRIBUTE('PropertyDependsOn',#5094,2,#5115,$,#5118,#8912,$,.F.);
	//<01> generating methods for consolidated attribute:  PropertyDependsOn
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5101=INVERSE_ATTRIBUTE('PartOfComplex',#5094,3,#3675,$,#3678,#8914,$,.F.);
	//<01> generating methods for consolidated attribute:  PartOfComplex
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5135=EXPLICIT_ATTRIBUTE('UsageName',#5133,0,#2657,$,.T.);
	//<01> generating methods for consolidated attribute:  UsageName
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: UsageName, base type: STRING
	public boolean testUsagename(EIfcpropertyreferencevalue type) throws SdaiException {
		return test_string(a2);
	}
	public String getUsagename(EIfcpropertyreferencevalue type) throws SdaiException {
		return get_string(a2);
	}
	public void setUsagename(EIfcpropertyreferencevalue type, String value) throws SdaiException {
		a2 = set_string(value);
	}
	public void unsetUsagename(EIfcpropertyreferencevalue type) throws SdaiException {
		a2 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeUsagename(EIfcpropertyreferencevalue type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #5136=EXPLICIT_ATTRIBUTE('PropertyReference',#5133,1,#3173,$,.T.);
	//<01> generating methods for consolidated attribute:  PropertyReference
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// -2- methods for SELECT attribute: PropertyReference
	public static int usedinPropertyreference(EIfcpropertyreferencevalue type, EEntity instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a3$, domain, result);
	}
	public boolean testPropertyreference(EIfcpropertyreferencevalue type) throws SdaiException {
		return test_instance(a3);
	}

	public EEntity getPropertyreference(EIfcpropertyreferencevalue type) throws SdaiException { // case 1
		return get_instance_select(a3);
	}

	public void setPropertyreference(EIfcpropertyreferencevalue type, EEntity value) throws SdaiException { // case 1
		a3 = set_instance(a3, value);
	}

	public void unsetPropertyreference(EIfcpropertyreferencevalue type) throws SdaiException {
		a3 = unset_instance(a3);
	}

	public static jsdai.dictionary.EAttribute attributePropertyreference(EIfcpropertyreferencevalue type) throws SdaiException {
		return a3$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = null;
			a2 = null;
			a3 = unset_instance(a3);
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = av.entityValues[0].getString(1);
		a2 = av.entityValues[2].getString(0);
		a3 = av.entityValues[2].getInstance(1, this, a3$);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = null;
			a2 = null;
			a3 = unset_instance(a3);
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = av.entityValues[0].getString(1);
		a2 = av.entityValues[2].getString(0);
		a3 = av.entityValues[2].getInstance(1, this, a3$);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcProperty
		av.entityValues[0].setString(0, a0);
		av.entityValues[0].setString(1, a1);
		// partial entity: IfcPropertyAbstraction
		// partial entity: IfcPropertyReferenceValue
		av.entityValues[2].setString(0, a2);
		av.entityValues[2].setInstance(1, a3);
		// partial entity: IfcSimpleProperty
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcProperty
		av.entityValues[0].setString(0, a0);
		av.entityValues[0].setString(1, a1);
		// partial entity: IfcPropertyAbstraction
		// partial entity: IfcPropertyReferenceValue
		av.entityValues[2].setString(0, a2);
		av.entityValues[2].setInstance(1, a3);
		// partial entity: IfcSimpleProperty
	}
}
