/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcTimeSeriesValue

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfctimeseriesvalue extends CEntity implements EIfctimeseriesvalue {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfctimeseriesvalue.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	protected AIfcvalue a0; // ListValues - current entity - LIST OF SELECT
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// ListValues - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected AIfcvalue a0;

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

	//going through all the attributes: #6229=EXPLICIT_ATTRIBUTE('ListValues',#6227,0,#7186,$,.F.);
	//<01> generating methods for consolidated attribute:  ListValues
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: ListValues, base type: LIST OF SELECT
	public boolean testListvalues(EIfctimeseriesvalue type) throws SdaiException {
		return test_aggregate(a0);
	}
	public AIfcvalue getListvalues(EIfctimeseriesvalue type) throws SdaiException {
		if (a0 == null)
			throw new SdaiException(SdaiException.VA_NSET);
		return a0;
	}
	public AIfcvalue createListvalues(EIfctimeseriesvalue type) throws SdaiException {
		a0 = (AIfcvalue)create_aggregate_class(a0, a0$, AIfcvalue.class, 0);
		return a0;
	}
	public void unsetListvalues(EIfctimeseriesvalue type) throws SdaiException {
		unset_aggregate(a0);
		a0 = null;
	}
	public static jsdai.dictionary.EAttribute attributeListvalues(EIfctimeseriesvalue type) throws SdaiException {
		return a0$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			if (a0 instanceof CAggregate)
				a0.unsetAll();
			a0 = null;
			return;
		}
		a0 = (AIfcvalue)av.entityValues[0].getMixedAggregate(0, a0$, this);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			if (a0 instanceof CAggregate)
				a0.unsetAll();
			a0 = null;
			return;
		}
		a0 = (AIfcvalue)av.entityValues[0].getMixedAggregate(0, a0$, this);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcTimeSeriesValue
		av.entityValues[0].setMixedAggregate(0, a0, a0$);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcTimeSeriesValue
		av.entityValues[0].setMixedAggregate(0, a0, a0$);
	}
}
