/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcLightDistributionData

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfclightdistributiondata extends CEntity implements EIfclightdistributiondata {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfclightdistributiondata.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	protected double a0; // MainPlaneAngle - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected A_double a1; // SecondaryPlaneAngle - current entity - LIST OF REAL
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected A_double a2; // LuminousIntensity - current entity - LIST OF REAL
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// MainPlaneAngle - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected double a0;
	// SecondaryPlaneAngle - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected A_double a1;
	// LuminousIntensity - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected A_double a2;

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

	//going through all the attributes: #4561=EXPLICIT_ATTRIBUTE('MainPlaneAngle',#4559,0,#2603,$,.F.);
	//<01> generating methods for consolidated attribute:  MainPlaneAngle
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: MainPlaneAngle, base type: REAL
	public boolean testMainplaneangle(EIfclightdistributiondata type) throws SdaiException {
		return test_double(a0);
	}
	public double getMainplaneangle(EIfclightdistributiondata type) throws SdaiException {
		return get_double(a0);
	}
	public void setMainplaneangle(EIfclightdistributiondata type, double value) throws SdaiException {
		a0 = set_double(value);
	}
	public void unsetMainplaneangle(EIfclightdistributiondata type) throws SdaiException {
		a0 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeMainplaneangle(EIfclightdistributiondata type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #4562=EXPLICIT_ATTRIBUTE('SecondaryPlaneAngle',#4559,1,#6951,$,.F.);
	//<01> generating methods for consolidated attribute:  SecondaryPlaneAngle
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: SecondaryPlaneAngle, base type: LIST OF REAL
	public boolean testSecondaryplaneangle(EIfclightdistributiondata type) throws SdaiException {
		return test_aggregate(a1);
	}
	public A_double getSecondaryplaneangle(EIfclightdistributiondata type) throws SdaiException {
		return (A_double)get_aggregate(a1);
	}
	public A_double createSecondaryplaneangle(EIfclightdistributiondata type) throws SdaiException {
		a1 = create_aggregate_double(a1, a1$, 0);
		return a1;
	}
	public void unsetSecondaryplaneangle(EIfclightdistributiondata type) throws SdaiException {
		unset_aggregate(a1);
		a1 = null;
	}
	public static jsdai.dictionary.EAttribute attributeSecondaryplaneangle(EIfclightdistributiondata type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #4563=EXPLICIT_ATTRIBUTE('LuminousIntensity',#4559,2,#6952,$,.F.);
	//<01> generating methods for consolidated attribute:  LuminousIntensity
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: LuminousIntensity, base type: LIST OF REAL
	public boolean testLuminousintensity(EIfclightdistributiondata type) throws SdaiException {
		return test_aggregate(a2);
	}
	public A_double getLuminousintensity(EIfclightdistributiondata type) throws SdaiException {
		return (A_double)get_aggregate(a2);
	}
	public A_double createLuminousintensity(EIfclightdistributiondata type) throws SdaiException {
		a2 = create_aggregate_double(a2, a2$, 0);
		return a2;
	}
	public void unsetLuminousintensity(EIfclightdistributiondata type) throws SdaiException {
		unset_aggregate(a2);
		a2 = null;
	}
	public static jsdai.dictionary.EAttribute attributeLuminousintensity(EIfclightdistributiondata type) throws SdaiException {
		return a2$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = Double.NaN;
			return;
		}
		a0 = av.entityValues[0].getDouble(0);
		a1 = av.entityValues[0].getDoubleAggregate(1, a1$, this);
		a2 = av.entityValues[0].getDoubleAggregate(2, a2$, this);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = Double.NaN;
			return;
		}
		a0 = av.entityValues[0].getDouble(0);
		a1 = av.entityValues[0].getDoubleAggregate(1, a1$, this);
		a2 = av.entityValues[0].getDoubleAggregate(2, a2$, this);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcLightDistributionData
		av.entityValues[0].setDouble(0, a0);
		av.entityValues[0].setDoubleAggregate(1, a1);
		av.entityValues[0].setDoubleAggregate(2, a2);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcLightDistributionData
		av.entityValues[0].setDouble(0, a0);
		av.entityValues[0].setDoubleAggregate(1, a1);
		av.entityValues[0].setDoubleAggregate(2, a2);
	}
}
