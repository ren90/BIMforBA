/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcTimePeriod

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfctimeperiod extends CEntity implements EIfctimeperiod {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfctimeperiod.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	protected String a0; // StartTime - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected String a1; // EndTime - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// StartTime - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected String a0;
	// EndTime - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected String a1;

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

	//going through all the attributes: #6214=EXPLICIT_ATTRIBUTE('StartTime',#6212,0,#2679,$,.F.);
	//<01> generating methods for consolidated attribute:  StartTime
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: StartTime, base type: STRING
	public boolean testStarttime(EIfctimeperiod type) throws SdaiException {
		return test_string(a0);
	}
	public String getStarttime(EIfctimeperiod type) throws SdaiException {
		return get_string(a0);
	}
	public void setStarttime(EIfctimeperiod type, String value) throws SdaiException {
		a0 = set_string(value);
	}
	public void unsetStarttime(EIfctimeperiod type) throws SdaiException {
		a0 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeStarttime(EIfctimeperiod type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #6215=EXPLICIT_ATTRIBUTE('EndTime',#6212,1,#2679,$,.F.);
	//<01> generating methods for consolidated attribute:  EndTime
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: EndTime, base type: STRING
	public boolean testEndtime(EIfctimeperiod type) throws SdaiException {
		return test_string(a1);
	}
	public String getEndtime(EIfctimeperiod type) throws SdaiException {
		return get_string(a1);
	}
	public void setEndtime(EIfctimeperiod type, String value) throws SdaiException {
		a1 = set_string(value);
	}
	public void unsetEndtime(EIfctimeperiod type) throws SdaiException {
		a1 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeEndtime(EIfctimeperiod type) throws SdaiException {
		return a1$;
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
		// partial entity: IfcTimePeriod
		av.entityValues[0].setString(0, a0);
		av.entityValues[0].setString(1, a1);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcTimePeriod
		av.entityValues[0].setString(0, a0);
		av.entityValues[0].setString(1, a1);
	}
}