/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcProductRepresentation

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcproductrepresentation extends CEntity implements EIfcproductrepresentation {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcproductrepresentation.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	protected String a0; // Name - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected String a1; // Description - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected AIfcrepresentation a2; // Representations - current entity - LIST OF ENTITY
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// Name - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected String a0;
	// Description - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected String a1;
	// Representations - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected AIfcrepresentation a2;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		changeReferencesAggregate(a2, old, newer);
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		changeReferencesAggregate(a2, old, newer);
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #5065=EXPLICIT_ATTRIBUTE('Name',#5063,0,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Name, base type: STRING
	public boolean testName(EIfcproductrepresentation type) throws SdaiException {
		return test_string(a0);
	}
	public String getName(EIfcproductrepresentation type) throws SdaiException {
		return get_string(a0);
	}
	public void setName(EIfcproductrepresentation type, String value) throws SdaiException {
		a0 = set_string(value);
	}
	public void unsetName(EIfcproductrepresentation type) throws SdaiException {
		a0 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeName(EIfcproductrepresentation type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #5066=EXPLICIT_ATTRIBUTE('Description',#5063,1,#2657,$,.T.);
	//<01> generating methods for consolidated attribute:  Description
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Description, base type: STRING
	public boolean testDescription(EIfcproductrepresentation type) throws SdaiException {
		return test_string(a1);
	}
	public String getDescription(EIfcproductrepresentation type) throws SdaiException {
		return get_string(a1);
	}
	public void setDescription(EIfcproductrepresentation type, String value) throws SdaiException {
		a1 = set_string(value);
	}
	public void unsetDescription(EIfcproductrepresentation type) throws SdaiException {
		a1 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeDescription(EIfcproductrepresentation type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #5067=EXPLICIT_ATTRIBUTE('Representations',#5063,2,#7028,$,.F.);
	//<01> generating methods for consolidated attribute:  Representations
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: Representations, base type: LIST OF ENTITY
	public static int usedinRepresentations(EIfcproductrepresentation type, EIfcrepresentation instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a2$, domain, result);
	}
	public boolean testRepresentations(EIfcproductrepresentation type) throws SdaiException {
		return test_aggregate(a2);
	}
	public AIfcrepresentation getRepresentations(EIfcproductrepresentation type) throws SdaiException {
		return (AIfcrepresentation)get_aggregate(a2);
	}
	public AIfcrepresentation createRepresentations(EIfcproductrepresentation type) throws SdaiException {
		a2 = (AIfcrepresentation)create_aggregate_class(a2, a2$,  AIfcrepresentation.class, 0);
		return a2;
	}
	public void unsetRepresentations(EIfcproductrepresentation type) throws SdaiException {
		unset_aggregate(a2);
		a2 = null;
	}
	public static jsdai.dictionary.EAttribute attributeRepresentations(EIfcproductrepresentation type) throws SdaiException {
		return a2$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = null;
			if (a2 instanceof CAggregate)
				a2.unsetAll();
			a2 = null;
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = av.entityValues[0].getString(1);
		a2 = (AIfcrepresentation)av.entityValues[0].getInstanceAggregate(2, a2$, this);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = null;
			if (a2 instanceof CAggregate)
				a2.unsetAll();
			a2 = null;
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = av.entityValues[0].getString(1);
		a2 = (AIfcrepresentation)av.entityValues[0].getInstanceAggregate(2, a2$, this);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcProductRepresentation
		av.entityValues[0].setString(0, a0);
		av.entityValues[0].setString(1, a1);
		av.entityValues[0].setInstanceAggregate(2, a2);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcProductRepresentation
		av.entityValues[0].setString(0, a0);
		av.entityValues[0].setString(1, a1);
		av.entityValues[0].setInstanceAggregate(2, a2);
	}
}
