/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcSimplePropertyTemplate

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcsimplepropertytemplate extends CIfcpropertytemplate implements EIfcsimplepropertytemplate {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcsimplepropertytemplate.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// GlobalId: protected String a0;   GlobalId - java inheritance - STRING
	// OwnerHistory: protected Object a1;   OwnerHistory - java inheritance - ENTITY IfcOwnerHistory
	// Name: protected String a2;   Name - java inheritance - STRING
	// Description: protected String a3;   Description - java inheritance - STRING
	// HasContext: protected Object  - inverse - java inheritance -  ENTITY IfcRelDeclares
	// HasAssociations: protected Object  - inverse - java inheritance -  ENTITY IfcRelAssociates
	// PartOfComplexTemplate: protected Object  - inverse - java inheritance -  ENTITY IfcComplexPropertyTemplate
	// PartOfPsetTemplate: protected Object  - inverse - java inheritance -  ENTITY IfcPropertySetTemplate
	protected int a4; // TemplateType - current entity - ENUMERATION IfcSimplePropertyTemplateTypeEnum
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected String a5; // PrimaryMeasureType - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected String a6; // SecondaryMeasureType - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	protected Object a7; // Enumerators - current entity - ENTITY IfcPropertyEnumeration
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	protected Object a8; // PrimaryUnit - current entity - SELECT IfcUnit
	protected static final jsdai.dictionary.CExplicit_attribute a8$ = CEntity.initExplicitAttribute(definition, 8);
	protected Object a9; // SecondaryUnit - current entity - SELECT IfcUnit
	protected static final jsdai.dictionary.CExplicit_attribute a9$ = CEntity.initExplicitAttribute(definition, 9);
	protected String a10; // Expression - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a10$ = CEntity.initExplicitAttribute(definition, 10);
	protected int a11; // AccessState - current entity - ENUMERATION IfcStateEnum
	protected static final jsdai.dictionary.CExplicit_attribute a11$ = CEntity.initExplicitAttribute(definition, 11);
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
	// HasContext - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// HasAssociations - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// PartOfComplexTemplate - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i2$ = CEntity.initInverseAttribute(definition, 2);
	// PartOfPsetTemplate - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i3$ = CEntity.initInverseAttribute(definition, 3);
	// TemplateType - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected int a4;
	// PrimaryMeasureType - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected String a5;
	// SecondaryMeasureType - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	protected String a6;
	// Enumerators - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	protected Object a7;
	// PrimaryUnit - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a8$ = CEntity.initExplicitAttribute(definition, 8);
	protected Object a8;
	// SecondaryUnit - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a9$ = CEntity.initExplicitAttribute(definition, 9);
	protected Object a9;
	// Expression - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a10$ = CEntity.initExplicitAttribute(definition, 10);
	protected String a10;
	// AccessState - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a11$ = CEntity.initExplicitAttribute(definition, 11);
	protected int a11;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a7 == old) {
			a7 = newer;
		}
		if (a8 == old) {
			a8 = newer;
		}
		if (a9 == old) {
			a9 = newer;
		}
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a7 == old) {
			a7 = newer;
		}
		if (a8 == old) {
			a8 = newer;
		}
		if (a9 == old) {
			a9 = newer;
		}
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
	//going through all the attributes: #5113=INVERSE_ATTRIBUTE('HasContext',#5111,0,#5450,$,#5453,#8928,#8929,.F.);
	//<01> generating methods for consolidated attribute:  HasContext
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5114=INVERSE_ATTRIBUTE('HasAssociations',#5111,1,#5375,$,#5377,#8931,$,.F.);
	//<01> generating methods for consolidated attribute:  HasAssociations
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5165=INVERSE_ATTRIBUTE('PartOfComplexTemplate',#5163,0,#3679,$,#3683,#8976,$,.F.);
	//<01> generating methods for consolidated attribute:  PartOfComplexTemplate
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5166=INVERSE_ATTRIBUTE('PartOfPsetTemplate',#5163,1,#5145,$,#5149,#8978,$,.F.);
	//<01> generating methods for consolidated attribute:  PartOfPsetTemplate
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5692=EXPLICIT_ATTRIBUTE('TemplateType',#5690,0,#3015,$,.T.);
	//<01> generating methods for consolidated attribute:  TemplateType
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute:TemplateType, base type: ENUMERATION
	public boolean testTemplatetype(EIfcsimplepropertytemplate type) throws SdaiException {
		return test_enumeration(a4);
	}
	public int getTemplatetype(EIfcsimplepropertytemplate type) throws SdaiException {
		return get_enumeration(a4);
	}
	public void setTemplatetype(EIfcsimplepropertytemplate type, int value) throws SdaiException {
		a4 = set_enumeration(value, a4$);
	}
	public void unsetTemplatetype(EIfcsimplepropertytemplate type) throws SdaiException {
		a4 = unset_enumeration();
	}
	public static jsdai.dictionary.EAttribute attributeTemplatetype(EIfcsimplepropertytemplate type) throws SdaiException {
		return a4$;
	}

	//going through all the attributes: #5693=EXPLICIT_ATTRIBUTE('PrimaryMeasureType',#5690,1,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  PrimaryMeasureType
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: PrimaryMeasureType, base type: STRING
	public boolean testPrimarymeasuretype(EIfcsimplepropertytemplate type) throws SdaiException {
		return test_string(a5);
	}
	public String getPrimarymeasuretype(EIfcsimplepropertytemplate type) throws SdaiException {
		return get_string(a5);
	}
	public void setPrimarymeasuretype(EIfcsimplepropertytemplate type, String value) throws SdaiException {
		a5 = set_string(value);
	}
	public void unsetPrimarymeasuretype(EIfcsimplepropertytemplate type) throws SdaiException {
		a5 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributePrimarymeasuretype(EIfcsimplepropertytemplate type) throws SdaiException {
		return a5$;
	}

	//going through all the attributes: #5694=EXPLICIT_ATTRIBUTE('SecondaryMeasureType',#5690,2,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  SecondaryMeasureType
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: SecondaryMeasureType, base type: STRING
	public boolean testSecondarymeasuretype(EIfcsimplepropertytemplate type) throws SdaiException {
		return test_string(a6);
	}
	public String getSecondarymeasuretype(EIfcsimplepropertytemplate type) throws SdaiException {
		return get_string(a6);
	}
	public void setSecondarymeasuretype(EIfcsimplepropertytemplate type, String value) throws SdaiException {
		a6 = set_string(value);
	}
	public void unsetSecondarymeasuretype(EIfcsimplepropertytemplate type) throws SdaiException {
		a6 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeSecondarymeasuretype(EIfcsimplepropertytemplate type) throws SdaiException {
		return a6$;
	}

	//going through all the attributes: #5695=EXPLICIT_ATTRIBUTE('Enumerators',#5690,3,#5124,$,.T.);
	//<01> generating methods for consolidated attribute:  Enumerators
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : Enumerators, base type: entity IfcPropertyEnumeration
	public static int usedinEnumerators(EIfcsimplepropertytemplate type, EIfcpropertyenumeration instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a7$, domain, result);
	}
	public boolean testEnumerators(EIfcsimplepropertytemplate type) throws SdaiException {
		return test_instance(a7);
	}
	public EIfcpropertyenumeration getEnumerators(EIfcsimplepropertytemplate type) throws SdaiException {
		return (EIfcpropertyenumeration)get_instance(a7);
	}
	public void setEnumerators(EIfcsimplepropertytemplate type, EIfcpropertyenumeration value) throws SdaiException {
		a7 = set_instance(a7, value);
	}
	public void unsetEnumerators(EIfcsimplepropertytemplate type) throws SdaiException {
		a7 = unset_instance(a7);
	}
	public static jsdai.dictionary.EAttribute attributeEnumerators(EIfcsimplepropertytemplate type) throws SdaiException {
		return a7$;
	}

	//going through all the attributes: #5696=EXPLICIT_ATTRIBUTE('PrimaryUnit',#5690,4,#3221,$,.T.);
	//<01> generating methods for consolidated attribute:  PrimaryUnit
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// -2- methods for SELECT attribute: PrimaryUnit
	public static int usedinPrimaryunit(EIfcsimplepropertytemplate type, EEntity instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a8$, domain, result);
	}
	public boolean testPrimaryunit(EIfcsimplepropertytemplate type) throws SdaiException {
		return test_instance(a8);
	}

	public EEntity getPrimaryunit(EIfcsimplepropertytemplate type) throws SdaiException { // case 1
		return get_instance_select(a8);
	}

	public void setPrimaryunit(EIfcsimplepropertytemplate type, EEntity value) throws SdaiException { // case 1
		a8 = set_instance(a8, value);
	}

	public void unsetPrimaryunit(EIfcsimplepropertytemplate type) throws SdaiException {
		a8 = unset_instance(a8);
	}

	public static jsdai.dictionary.EAttribute attributePrimaryunit(EIfcsimplepropertytemplate type) throws SdaiException {
		return a8$;
	}

	//going through all the attributes: #5697=EXPLICIT_ATTRIBUTE('SecondaryUnit',#5690,5,#3221,$,.T.);
	//<01> generating methods for consolidated attribute:  SecondaryUnit
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// -2- methods for SELECT attribute: SecondaryUnit
	public static int usedinSecondaryunit(EIfcsimplepropertytemplate type, EEntity instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a9$, domain, result);
	}
	public boolean testSecondaryunit(EIfcsimplepropertytemplate type) throws SdaiException {
		return test_instance(a9);
	}

	public EEntity getSecondaryunit(EIfcsimplepropertytemplate type) throws SdaiException { // case 1
		return get_instance_select(a9);
	}

	public void setSecondaryunit(EIfcsimplepropertytemplate type, EEntity value) throws SdaiException { // case 1
		a9 = set_instance(a9, value);
	}

	public void unsetSecondaryunit(EIfcsimplepropertytemplate type) throws SdaiException {
		a9 = unset_instance(a9);
	}

	public static jsdai.dictionary.EAttribute attributeSecondaryunit(EIfcsimplepropertytemplate type) throws SdaiException {
		return a9$;
	}

	//going through all the attributes: #5698=EXPLICIT_ATTRIBUTE('Expression',#5690,6,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Expression
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Expression, base type: STRING
	public boolean testExpression(EIfcsimplepropertytemplate type) throws SdaiException {
		return test_string(a10);
	}
	public String getExpression(EIfcsimplepropertytemplate type) throws SdaiException {
		return get_string(a10);
	}
	public void setExpression(EIfcsimplepropertytemplate type, String value) throws SdaiException {
		a10 = set_string(value);
	}
	public void unsetExpression(EIfcsimplepropertytemplate type) throws SdaiException {
		a10 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeExpression(EIfcsimplepropertytemplate type) throws SdaiException {
		return a10$;
	}

	//going through all the attributes: #5699=EXPLICIT_ATTRIBUTE('AccessState',#5690,7,#3033,$,.T.);
	//<01> generating methods for consolidated attribute:  AccessState
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute:AccessState, base type: ENUMERATION
	public boolean testAccessstate(EIfcsimplepropertytemplate type) throws SdaiException {
		return test_enumeration(a11);
	}
	public int getAccessstate(EIfcsimplepropertytemplate type) throws SdaiException {
		return get_enumeration(a11);
	}
	public void setAccessstate(EIfcsimplepropertytemplate type, int value) throws SdaiException {
		a11 = set_enumeration(value, a11$);
	}
	public void unsetAccessstate(EIfcsimplepropertytemplate type) throws SdaiException {
		a11 = unset_enumeration();
	}
	public static jsdai.dictionary.EAttribute attributeAccessstate(EIfcsimplepropertytemplate type) throws SdaiException {
		return a11$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = unset_instance(a1);
			a2 = null;
			a3 = null;
			a4 = 0;
			a5 = null;
			a6 = null;
			a7 = unset_instance(a7);
			a8 = unset_instance(a8);
			a9 = unset_instance(a9);
			a10 = null;
			a11 = 0;
			return;
		}
		a0 = av.entityValues[3].getString(0);
		a1 = av.entityValues[3].getInstance(1, this, a1$);
		a2 = av.entityValues[3].getString(2);
		a3 = av.entityValues[3].getString(3);
		a4 = av.entityValues[4].getEnumeration(0, a4$);
		a5 = av.entityValues[4].getString(1);
		a6 = av.entityValues[4].getString(2);
		a7 = av.entityValues[4].getInstance(3, this, a7$);
		a8 = av.entityValues[4].getInstance(4, this, a8$);
		a9 = av.entityValues[4].getInstance(5, this, a9$);
		a10 = av.entityValues[4].getString(6);
		a11 = av.entityValues[4].getEnumeration(7, a11$);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = unset_instance(a1);
			a2 = null;
			a3 = null;
			a4 = 0;
			a5 = null;
			a6 = null;
			a7 = unset_instance(a7);
			a8 = unset_instance(a8);
			a9 = unset_instance(a9);
			a10 = null;
			a11 = 0;
			return;
		}
		a0 = av.entityValues[3].getString(0);
		a1 = av.entityValues[3].getInstance(1, this, a1$);
		a2 = av.entityValues[3].getString(2);
		a3 = av.entityValues[3].getString(3);
		a4 = av.entityValues[4].getEnumeration(0, a4$);
		a5 = av.entityValues[4].getString(1);
		a6 = av.entityValues[4].getString(2);
		a7 = av.entityValues[4].getInstance(3, this, a7$);
		a8 = av.entityValues[4].getInstance(4, this, a8$);
		a9 = av.entityValues[4].getInstance(5, this, a9$);
		a10 = av.entityValues[4].getString(6);
		a11 = av.entityValues[4].getEnumeration(7, a11$);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcPropertyDefinition
		// partial entity: IfcPropertyTemplate
		// partial entity: IfcPropertyTemplateDefinition
		// partial entity: IfcRoot
		av.entityValues[3].setString(0, a0);
		av.entityValues[3].setInstance(1, a1);
		av.entityValues[3].setString(2, a2);
		av.entityValues[3].setString(3, a3);
		// partial entity: IfcSimplePropertyTemplate
		av.entityValues[4].setEnumeration(0, a4, a4$);
		av.entityValues[4].setString(1, a5);
		av.entityValues[4].setString(2, a6);
		av.entityValues[4].setInstance(3, a7);
		av.entityValues[4].setInstance(4, a8);
		av.entityValues[4].setInstance(5, a9);
		av.entityValues[4].setString(6, a10);
		av.entityValues[4].setEnumeration(7, a11, a11$);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcPropertyDefinition
		// partial entity: IfcPropertyTemplate
		// partial entity: IfcPropertyTemplateDefinition
		// partial entity: IfcRoot
		av.entityValues[3].setString(0, a0);
		av.entityValues[3].setInstance(1, a1);
		av.entityValues[3].setString(2, a2);
		av.entityValues[3].setString(3, a3);
		// partial entity: IfcSimplePropertyTemplate
		av.entityValues[4].setEnumeration(0, a4, a4$);
		av.entityValues[4].setString(1, a5);
		av.entityValues[4].setString(2, a6);
		av.entityValues[4].setInstance(3, a7);
		av.entityValues[4].setInstance(4, a8);
		av.entityValues[4].setInstance(5, a9);
		av.entityValues[4].setString(6, a10);
		av.entityValues[4].setEnumeration(7, a11, a11$);
	}
}
