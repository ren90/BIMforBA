/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcSchedulingTime

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcschedulingtime extends CEntity implements EIfcschedulingtime {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcschedulingtime.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	protected String a0; // Name - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected int a1; // DataOrigin - current entity - ENUMERATION IfcDataOriginEnum
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected String a2; // UserDefinedDataOrigin - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// Name - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected String a0;
	// DataOrigin - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected int a1;
	// UserDefinedDataOrigin - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected String a2;

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

	//going through all the attributes: #5638=EXPLICIT_ATTRIBUTE('Name',#5636,0,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Name, base type: STRING
	public boolean testName(EIfcschedulingtime type) throws SdaiException {
		return test_string(a0);
	}
	public String getName(EIfcschedulingtime type) throws SdaiException {
		return get_string(a0);
	}
	public void setName(EIfcschedulingtime type, String value) throws SdaiException {
		a0 = set_string(value);
	}
	public void unsetName(EIfcschedulingtime type) throws SdaiException {
		a0 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeName(EIfcschedulingtime type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #5639=EXPLICIT_ATTRIBUTE('DataOrigin',#5636,1,#2803,$,.T.);
	//<01> generating methods for consolidated attribute:  DataOrigin
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute:DataOrigin, base type: ENUMERATION
	public boolean testDataorigin(EIfcschedulingtime type) throws SdaiException {
		return test_enumeration(a1);
	}
	public int getDataorigin(EIfcschedulingtime type) throws SdaiException {
		return get_enumeration(a1);
	}
	public void setDataorigin(EIfcschedulingtime type, int value) throws SdaiException {
		a1 = set_enumeration(value, a1$);
	}
	public void unsetDataorigin(EIfcschedulingtime type) throws SdaiException {
		a1 = unset_enumeration();
	}
	public static jsdai.dictionary.EAttribute attributeDataorigin(EIfcschedulingtime type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #5640=EXPLICIT_ATTRIBUTE('UserDefinedDataOrigin',#5636,2,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  UserDefinedDataOrigin
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: UserDefinedDataOrigin, base type: STRING
	public boolean testUserdefineddataorigin(EIfcschedulingtime type) throws SdaiException {
		return test_string(a2);
	}
	public String getUserdefineddataorigin(EIfcschedulingtime type) throws SdaiException {
		return get_string(a2);
	}
	public void setUserdefineddataorigin(EIfcschedulingtime type, String value) throws SdaiException {
		a2 = set_string(value);
	}
	public void unsetUserdefineddataorigin(EIfcschedulingtime type) throws SdaiException {
		a2 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeUserdefineddataorigin(EIfcschedulingtime type) throws SdaiException {
		return a2$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = 0;
			a2 = null;
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = av.entityValues[0].getEnumeration(1, a1$);
		a2 = av.entityValues[0].getString(2);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = 0;
			a2 = null;
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = av.entityValues[0].getEnumeration(1, a1$);
		a2 = av.entityValues[0].getString(2);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcSchedulingTime
		av.entityValues[0].setString(0, a0);
		av.entityValues[0].setEnumeration(1, a1, a1$);
		av.entityValues[0].setString(2, a2);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcSchedulingTime
		av.entityValues[0].setString(0, a0);
		av.entityValues[0].setEnumeration(1, a1, a1$);
		av.entityValues[0].setString(2, a2);
	}
}
