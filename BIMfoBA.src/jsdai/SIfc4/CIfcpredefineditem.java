/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcPreDefinedItem

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcpredefineditem extends CIfcpresentationitem implements EIfcpredefineditem {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcpredefineditem.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	protected String a0; // Name - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// Name - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected String a0;

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

	//going through all the attributes: #5014=EXPLICIT_ATTRIBUTE('Name',#5012,0,#2539,$,.F.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Name, base type: STRING
	public boolean testName(EIfcpredefineditem type) throws SdaiException {
		return test_string(a0);
	}
	public String getName(EIfcpredefineditem type) throws SdaiException {
		return get_string(a0);
	}
	public void setName(EIfcpredefineditem type, String value) throws SdaiException {
		a0 = set_string(value);
	}
	public void unsetName(EIfcpredefineditem type) throws SdaiException {
		a0 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeName(EIfcpredefineditem type) throws SdaiException {
		return a0$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			return;
		}
		a0 = av.entityValues[0].getString(0);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			return;
		}
		a0 = av.entityValues[0].getString(0);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcPreDefinedItem
		av.entityValues[0].setString(0, a0);
		// partial entity: IfcPresentationItem
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcPreDefinedItem
		av.entityValues[0].setString(0, a0);
		// partial entity: IfcPresentationItem
	}
}
