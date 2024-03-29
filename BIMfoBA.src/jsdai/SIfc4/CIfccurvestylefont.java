/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcCurveStyleFont

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfccurvestylefont extends CIfcpresentationitem implements EIfccurvestylefont {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfccurvestylefont.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	protected String a0; // Name - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected AIfccurvestylefontpattern a1; // PatternList - current entity - LIST OF ENTITY
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// Name - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected String a0;
	// PatternList - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected AIfccurvestylefontpattern a1;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		changeReferencesAggregate(a1, old, newer);
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		changeReferencesAggregate(a1, old, newer);
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #3904=EXPLICIT_ATTRIBUTE('Name',#3902,0,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Name, base type: STRING
	public boolean testName(EIfccurvestylefont type) throws SdaiException {
		return test_string(a0);
	}
	public String getName(EIfccurvestylefont type) throws SdaiException {
		return get_string(a0);
	}
	public void setName(EIfccurvestylefont type, String value) throws SdaiException {
		a0 = set_string(value);
	}
	public void unsetName(EIfccurvestylefont type) throws SdaiException {
		a0 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeName(EIfccurvestylefont type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #3905=EXPLICIT_ATTRIBUTE('PatternList',#3902,1,#6888,$,.F.);
	//<01> generating methods for consolidated attribute:  PatternList
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: PatternList, base type: LIST OF ENTITY
	public static int usedinPatternlist(EIfccurvestylefont type, EIfccurvestylefontpattern instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a1$, domain, result);
	}
	public boolean testPatternlist(EIfccurvestylefont type) throws SdaiException {
		return test_aggregate(a1);
	}
	public AIfccurvestylefontpattern getPatternlist(EIfccurvestylefont type) throws SdaiException {
		return (AIfccurvestylefontpattern)get_aggregate(a1);
	}
	public AIfccurvestylefontpattern createPatternlist(EIfccurvestylefont type) throws SdaiException {
		a1 = (AIfccurvestylefontpattern)create_aggregate_class(a1, a1$,  AIfccurvestylefontpattern.class, 0);
		return a1;
	}
	public void unsetPatternlist(EIfccurvestylefont type) throws SdaiException {
		unset_aggregate(a1);
		a1 = null;
	}
	public static jsdai.dictionary.EAttribute attributePatternlist(EIfccurvestylefont type) throws SdaiException {
		return a1$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			if (a1 instanceof CAggregate)
				a1.unsetAll();
			a1 = null;
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = (AIfccurvestylefontpattern)av.entityValues[0].getInstanceAggregate(1, a1$, this);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			if (a1 instanceof CAggregate)
				a1.unsetAll();
			a1 = null;
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = (AIfccurvestylefontpattern)av.entityValues[0].getInstanceAggregate(1, a1$, this);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcCurveStyleFont
		av.entityValues[0].setString(0, a0);
		av.entityValues[0].setInstanceAggregate(1, a1);
		// partial entity: IfcPresentationItem
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcCurveStyleFont
		av.entityValues[0].setString(0, a0);
		av.entityValues[0].setInstanceAggregate(1, a1);
		// partial entity: IfcPresentationItem
	}
}
