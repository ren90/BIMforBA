/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcReference

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcreference extends CEntity implements EIfcreference {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcreference.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	protected String a0; // TypeIdentifier - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected String a1; // AttributeIdentifier - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected String a2; // InstanceName - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected A_integer a3; // ListPositions - current entity - LIST OF INTEGER
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected Object a4; // InnerReference - current entity - ENTITY IfcReference
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// TypeIdentifier - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected String a0;
	// AttributeIdentifier - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected String a1;
	// InstanceName - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected String a2;
	// ListPositions - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected A_integer a3;
	// InnerReference - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected Object a4;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a4 == old) {
			a4 = newer;
		}
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a4 == old) {
			a4 = newer;
		}
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #5278=EXPLICIT_ATTRIBUTE('TypeIdentifier',#5276,0,#2523,$,.T.);
	//<01> generating methods for consolidated attribute:  TypeIdentifier
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: TypeIdentifier, base type: STRING
	public boolean testTypeidentifier(EIfcreference type) throws SdaiException {
		return test_string(a0);
	}
	public String getTypeidentifier(EIfcreference type) throws SdaiException {
		return get_string(a0);
	}
	public void setTypeidentifier(EIfcreference type, String value) throws SdaiException {
		a0 = set_string(value);
	}
	public void unsetTypeidentifier(EIfcreference type) throws SdaiException {
		a0 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeTypeidentifier(EIfcreference type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #5279=EXPLICIT_ATTRIBUTE('AttributeIdentifier',#5276,1,#2523,$,.T.);
	//<01> generating methods for consolidated attribute:  AttributeIdentifier
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: AttributeIdentifier, base type: STRING
	public boolean testAttributeidentifier(EIfcreference type) throws SdaiException {
		return test_string(a1);
	}
	public String getAttributeidentifier(EIfcreference type) throws SdaiException {
		return get_string(a1);
	}
	public void setAttributeidentifier(EIfcreference type, String value) throws SdaiException {
		a1 = set_string(value);
	}
	public void unsetAttributeidentifier(EIfcreference type) throws SdaiException {
		a1 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeAttributeidentifier(EIfcreference type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #5280=EXPLICIT_ATTRIBUTE('InstanceName',#5276,2,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  InstanceName
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: InstanceName, base type: STRING
	public boolean testInstancename(EIfcreference type) throws SdaiException {
		return test_string(a2);
	}
	public String getInstancename(EIfcreference type) throws SdaiException {
		return get_string(a2);
	}
	public void setInstancename(EIfcreference type, String value) throws SdaiException {
		a2 = set_string(value);
	}
	public void unsetInstancename(EIfcreference type) throws SdaiException {
		a2 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeInstancename(EIfcreference type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #5281=EXPLICIT_ATTRIBUTE('ListPositions',#5276,3,#7068,$,.T.);
	//<01> generating methods for consolidated attribute:  ListPositions
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: ListPositions, base type: LIST OF INTEGER
	public boolean testListpositions(EIfcreference type) throws SdaiException {
		return test_aggregate(a3);
	}
	public A_integer getListpositions(EIfcreference type) throws SdaiException {
		return (A_integer)get_aggregate(a3);
	}
	public A_integer createListpositions(EIfcreference type) throws SdaiException {
		a3 = create_aggregate_integer(a3, a3$, 0);
		return a3;
	}
	public void unsetListpositions(EIfcreference type) throws SdaiException {
		unset_aggregate(a3);
		a3 = null;
	}
	public static jsdai.dictionary.EAttribute attributeListpositions(EIfcreference type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #5282=EXPLICIT_ATTRIBUTE('InnerReference',#5276,4,#5276,$,.T.);
	//<01> generating methods for consolidated attribute:  InnerReference
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : InnerReference, base type: entity IfcReference
	public static int usedinInnerreference(EIfcreference type, EIfcreference instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a4$, domain, result);
	}
	public boolean testInnerreference(EIfcreference type) throws SdaiException {
		return test_instance(a4);
	}
	public EIfcreference getInnerreference(EIfcreference type) throws SdaiException {
		return (EIfcreference)get_instance(a4);
	}
	public void setInnerreference(EIfcreference type, EIfcreference value) throws SdaiException {
		a4 = set_instance(a4, value);
	}
	public void unsetInnerreference(EIfcreference type) throws SdaiException {
		a4 = unset_instance(a4);
	}
	public static jsdai.dictionary.EAttribute attributeInnerreference(EIfcreference type) throws SdaiException {
		return a4$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = null;
			a2 = null;
			a4 = unset_instance(a4);
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = av.entityValues[0].getString(1);
		a2 = av.entityValues[0].getString(2);
		a3 = av.entityValues[0].getIntegerAggregate(3, a3$, this);
		a4 = av.entityValues[0].getInstance(4, this, a4$);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = null;
			a2 = null;
			a4 = unset_instance(a4);
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = av.entityValues[0].getString(1);
		a2 = av.entityValues[0].getString(2);
		a3 = av.entityValues[0].getIntegerAggregate(3, a3$, this);
		a4 = av.entityValues[0].getInstance(4, this, a4$);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcReference
		av.entityValues[0].setString(0, a0);
		av.entityValues[0].setString(1, a1);
		av.entityValues[0].setString(2, a2);
		av.entityValues[0].setIntegerAggregate(3, a3);
		av.entityValues[0].setInstance(4, a4);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcReference
		av.entityValues[0].setString(0, a0);
		av.entityValues[0].setString(1, a1);
		av.entityValues[0].setString(2, a2);
		av.entityValues[0].setIntegerAggregate(3, a3);
		av.entityValues[0].setInstance(4, a4);
	}
}
