/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcRoot

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcroot extends CEntity implements EIfcroot {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcroot.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	protected String a0; // GlobalId - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected Object a1; // OwnerHistory - current entity - ENTITY IfcOwnerHistory
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected String a2; // Name - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected String a3; // Description - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// GlobalId - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected String a0;
	// OwnerHistory - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected Object a1;
	// Name - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected String a2;
	// Description - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected String a3;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a1 == old) {
			a1 = newer;
		}
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a1 == old) {
			a1 = newer;
		}
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #5618=EXPLICIT_ATTRIBUTE('GlobalId',#5616,0,#2517,$,.F.);
	//<01> generating methods for consolidated attribute:  GlobalId
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: GlobalId, base type: STRING
	public boolean testGlobalid(EIfcroot type) throws SdaiException {
		return test_string(a0);
	}
	public String getGlobalid(EIfcroot type) throws SdaiException {
		return get_string(a0);
	}
	public void setGlobalid(EIfcroot type, String value) throws SdaiException {
		a0 = set_string(value);
	}
	public void unsetGlobalid(EIfcroot type) throws SdaiException {
		a0 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeGlobalid(EIfcroot type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #5619=EXPLICIT_ATTRIBUTE('OwnerHistory',#5616,1,#4858,$,.T.);
	//<01> generating methods for consolidated attribute:  OwnerHistory
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : OwnerHistory, base type: entity IfcOwnerHistory
	public static int usedinOwnerhistory(EIfcroot type, EIfcownerhistory instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a1$, domain, result);
	}
	public boolean testOwnerhistory(EIfcroot type) throws SdaiException {
		return test_instance(a1);
	}
	public EIfcownerhistory getOwnerhistory(EIfcroot type) throws SdaiException {
		return (EIfcownerhistory)get_instance(a1);
	}
	public void setOwnerhistory(EIfcroot type, EIfcownerhistory value) throws SdaiException {
		a1 = set_instance(a1, value);
	}
	public void unsetOwnerhistory(EIfcroot type) throws SdaiException {
		a1 = unset_instance(a1);
	}
	public static jsdai.dictionary.EAttribute attributeOwnerhistory(EIfcroot type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #5620=EXPLICIT_ATTRIBUTE('Name',#5616,2,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Name, base type: STRING
	public boolean testName(EIfcroot type) throws SdaiException {
		return test_string(a2);
	}
	public String getName(EIfcroot type) throws SdaiException {
		return get_string(a2);
	}
	public void setName(EIfcroot type, String value) throws SdaiException {
		a2 = set_string(value);
	}
	public void unsetName(EIfcroot type) throws SdaiException {
		a2 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeName(EIfcroot type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #5621=EXPLICIT_ATTRIBUTE('Description',#5616,3,#2657,$,.T.);
	//<01> generating methods for consolidated attribute:  Description
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Description, base type: STRING
	public boolean testDescription(EIfcroot type) throws SdaiException {
		return test_string(a3);
	}
	public String getDescription(EIfcroot type) throws SdaiException {
		return get_string(a3);
	}
	public void setDescription(EIfcroot type, String value) throws SdaiException {
		a3 = set_string(value);
	}
	public void unsetDescription(EIfcroot type) throws SdaiException {
		a3 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeDescription(EIfcroot type) throws SdaiException {
		return a3$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = unset_instance(a1);
			a2 = null;
			a3 = null;
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = av.entityValues[0].getInstance(1, this, a1$);
		a2 = av.entityValues[0].getString(2);
		a3 = av.entityValues[0].getString(3);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = unset_instance(a1);
			a2 = null;
			a3 = null;
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = av.entityValues[0].getInstance(1, this, a1$);
		a2 = av.entityValues[0].getString(2);
		a3 = av.entityValues[0].getString(3);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcRoot
		av.entityValues[0].setString(0, a0);
		av.entityValues[0].setInstance(1, a1);
		av.entityValues[0].setString(2, a2);
		av.entityValues[0].setString(3, a3);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcRoot
		av.entityValues[0].setString(0, a0);
		av.entityValues[0].setInstance(1, a1);
		av.entityValues[0].setString(2, a2);
		av.entityValues[0].setString(3, a3);
	}
}
