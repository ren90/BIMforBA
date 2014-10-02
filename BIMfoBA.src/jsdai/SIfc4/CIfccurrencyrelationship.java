/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcCurrencyRelationship

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfccurrencyrelationship extends CIfcresourcelevelrelationship implements EIfccurrencyrelationship {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfccurrencyrelationship.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// Name: protected String a0;   Name - java inheritance - STRING
	// Description: protected String a1;   Description - java inheritance - STRING
	protected Object a2; // RelatingMonetaryUnit - current entity - ENTITY IfcMonetaryUnit
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected Object a3; // RelatedMonetaryUnit - current entity - ENTITY IfcMonetaryUnit
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected double a4; // ExchangeRate - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected String a5; // RateDateTime - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected Object a6; // RateSource - current entity - ENTITY IfcLibraryInformation
	protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// Name - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected String a0;
	// Description - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected String a1;
	// RelatingMonetaryUnit - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected Object a2;
	// RelatedMonetaryUnit - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected Object a3;
	// ExchangeRate - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected double a4;
	// RateDateTime - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected String a5;
	// RateSource - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	protected Object a6;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a2 == old) {
			a2 = newer;
		}
		if (a3 == old) {
			a3 = newer;
		}
		if (a6 == old) {
			a6 = newer;
		}
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a2 == old) {
			a2 = newer;
		}
		if (a3 == old) {
			a3 = newer;
		}
		if (a6 == old) {
			a6 = newer;
		}
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #5575=EXPLICIT_ATTRIBUTE('Name',#5573,0,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5576=EXPLICIT_ATTRIBUTE('Description',#5573,1,#2657,$,.T.);
	//<01> generating methods for consolidated attribute:  Description
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3872=EXPLICIT_ATTRIBUTE('RelatingMonetaryUnit',#3870,0,#4769,$,.F.);
	//<01> generating methods for consolidated attribute:  RelatingMonetaryUnit
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : RelatingMonetaryUnit, base type: entity IfcMonetaryUnit
	public static int usedinRelatingmonetaryunit(EIfccurrencyrelationship type, EIfcmonetaryunit instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a2$, domain, result);
	}
	public boolean testRelatingmonetaryunit(EIfccurrencyrelationship type) throws SdaiException {
		return test_instance(a2);
	}
	public EIfcmonetaryunit getRelatingmonetaryunit(EIfccurrencyrelationship type) throws SdaiException {
		return (EIfcmonetaryunit)get_instance(a2);
	}
	public void setRelatingmonetaryunit(EIfccurrencyrelationship type, EIfcmonetaryunit value) throws SdaiException {
		a2 = set_instance(a2, value);
	}
	public void unsetRelatingmonetaryunit(EIfccurrencyrelationship type) throws SdaiException {
		a2 = unset_instance(a2);
	}
	public static jsdai.dictionary.EAttribute attributeRelatingmonetaryunit(EIfccurrencyrelationship type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #3873=EXPLICIT_ATTRIBUTE('RelatedMonetaryUnit',#3870,1,#4769,$,.F.);
	//<01> generating methods for consolidated attribute:  RelatedMonetaryUnit
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : RelatedMonetaryUnit, base type: entity IfcMonetaryUnit
	public static int usedinRelatedmonetaryunit(EIfccurrencyrelationship type, EIfcmonetaryunit instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a3$, domain, result);
	}
	public boolean testRelatedmonetaryunit(EIfccurrencyrelationship type) throws SdaiException {
		return test_instance(a3);
	}
	public EIfcmonetaryunit getRelatedmonetaryunit(EIfccurrencyrelationship type) throws SdaiException {
		return (EIfcmonetaryunit)get_instance(a3);
	}
	public void setRelatedmonetaryunit(EIfccurrencyrelationship type, EIfcmonetaryunit value) throws SdaiException {
		a3 = set_instance(a3, value);
	}
	public void unsetRelatedmonetaryunit(EIfccurrencyrelationship type) throws SdaiException {
		a3 = unset_instance(a3);
	}
	public static jsdai.dictionary.EAttribute attributeRelatedmonetaryunit(EIfccurrencyrelationship type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #3874=EXPLICIT_ATTRIBUTE('ExchangeRate',#3870,2,#2609,$,.F.);
	//<01> generating methods for consolidated attribute:  ExchangeRate
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: ExchangeRate, base type: REAL
	public boolean testExchangerate(EIfccurrencyrelationship type) throws SdaiException {
		return test_double(a4);
	}
	public double getExchangerate(EIfccurrencyrelationship type) throws SdaiException {
		return get_double(a4);
	}
	public void setExchangerate(EIfccurrencyrelationship type, double value) throws SdaiException {
		a4 = set_double(value);
	}
	public void unsetExchangerate(EIfccurrencyrelationship type) throws SdaiException {
		a4 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeExchangerate(EIfccurrencyrelationship type) throws SdaiException {
		return a4$;
	}

	//going through all the attributes: #3875=EXPLICIT_ATTRIBUTE('RateDateTime',#3870,3,#2477,$,.T.);
	//<01> generating methods for consolidated attribute:  RateDateTime
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: RateDateTime, base type: STRING
	public boolean testRatedatetime(EIfccurrencyrelationship type) throws SdaiException {
		return test_string(a5);
	}
	public String getRatedatetime(EIfccurrencyrelationship type) throws SdaiException {
		return get_string(a5);
	}
	public void setRatedatetime(EIfccurrencyrelationship type, String value) throws SdaiException {
		a5 = set_string(value);
	}
	public void unsetRatedatetime(EIfccurrencyrelationship type) throws SdaiException {
		a5 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeRatedatetime(EIfccurrencyrelationship type) throws SdaiException {
		return a5$;
	}

	//going through all the attributes: #3876=EXPLICIT_ATTRIBUTE('RateSource',#3870,4,#4543,$,.T.);
	//<01> generating methods for consolidated attribute:  RateSource
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : RateSource, base type: entity IfcLibraryInformation
	public static int usedinRatesource(EIfccurrencyrelationship type, EIfclibraryinformation instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a6$, domain, result);
	}
	public boolean testRatesource(EIfccurrencyrelationship type) throws SdaiException {
		return test_instance(a6);
	}
	public EIfclibraryinformation getRatesource(EIfccurrencyrelationship type) throws SdaiException {
		return (EIfclibraryinformation)get_instance(a6);
	}
	public void setRatesource(EIfccurrencyrelationship type, EIfclibraryinformation value) throws SdaiException {
		a6 = set_instance(a6, value);
	}
	public void unsetRatesource(EIfccurrencyrelationship type) throws SdaiException {
		a6 = unset_instance(a6);
	}
	public static jsdai.dictionary.EAttribute attributeRatesource(EIfccurrencyrelationship type) throws SdaiException {
		return a6$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a2 = unset_instance(a2);
			a3 = unset_instance(a3);
			a4 = Double.NaN;
			a5 = null;
			a6 = unset_instance(a6);
			a0 = null;
			a1 = null;
			return;
		}
		a2 = av.entityValues[0].getInstance(0, this, a2$);
		a3 = av.entityValues[0].getInstance(1, this, a3$);
		a4 = av.entityValues[0].getDouble(2);
		a5 = av.entityValues[0].getString(3);
		a6 = av.entityValues[0].getInstance(4, this, a6$);
		a0 = av.entityValues[1].getString(0);
		a1 = av.entityValues[1].getString(1);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a2 = unset_instance(a2);
			a3 = unset_instance(a3);
			a4 = Double.NaN;
			a5 = null;
			a6 = unset_instance(a6);
			a0 = null;
			a1 = null;
			return;
		}
		a2 = av.entityValues[0].getInstance(0, this, a2$);
		a3 = av.entityValues[0].getInstance(1, this, a3$);
		a4 = av.entityValues[0].getDouble(2);
		a5 = av.entityValues[0].getString(3);
		a6 = av.entityValues[0].getInstance(4, this, a6$);
		a0 = av.entityValues[1].getString(0);
		a1 = av.entityValues[1].getString(1);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcCurrencyRelationship
		av.entityValues[0].setInstance(0, a2);
		av.entityValues[0].setInstance(1, a3);
		av.entityValues[0].setDouble(2, a4);
		av.entityValues[0].setString(3, a5);
		av.entityValues[0].setInstance(4, a6);
		// partial entity: IfcResourceLevelRelationship
		av.entityValues[1].setString(0, a0);
		av.entityValues[1].setString(1, a1);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcCurrencyRelationship
		av.entityValues[0].setInstance(0, a2);
		av.entityValues[0].setInstance(1, a3);
		av.entityValues[0].setDouble(2, a4);
		av.entityValues[0].setString(3, a5);
		av.entityValues[0].setInstance(4, a6);
		// partial entity: IfcResourceLevelRelationship
		av.entityValues[1].setString(0, a0);
		av.entityValues[1].setString(1, a1);
	}
}
