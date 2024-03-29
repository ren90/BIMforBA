/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcSurfaceStyleRefraction

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcsurfacestylerefraction extends CIfcpresentationitem implements EIfcsurfacestylerefraction {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcsurfacestylerefraction.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	protected double a0; // RefractionIndex - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected double a1; // DispersionFactor - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// RefractionIndex - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected double a0;
	// DispersionFactor - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected double a1;

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

	//going through all the attributes: #5990=EXPLICIT_ATTRIBUTE('RefractionIndex',#5988,0,#2623,$,.T.);
	//<01> generating methods for consolidated attribute:  RefractionIndex
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: RefractionIndex, base type: REAL
	public boolean testRefractionindex(EIfcsurfacestylerefraction type) throws SdaiException {
		return test_double(a0);
	}
	public double getRefractionindex(EIfcsurfacestylerefraction type) throws SdaiException {
		return get_double(a0);
	}
	public void setRefractionindex(EIfcsurfacestylerefraction type, double value) throws SdaiException {
		a0 = set_double(value);
	}
	public void unsetRefractionindex(EIfcsurfacestylerefraction type) throws SdaiException {
		a0 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeRefractionindex(EIfcsurfacestylerefraction type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #5991=EXPLICIT_ATTRIBUTE('DispersionFactor',#5988,1,#2623,$,.T.);
	//<01> generating methods for consolidated attribute:  DispersionFactor
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: DispersionFactor, base type: REAL
	public boolean testDispersionfactor(EIfcsurfacestylerefraction type) throws SdaiException {
		return test_double(a1);
	}
	public double getDispersionfactor(EIfcsurfacestylerefraction type) throws SdaiException {
		return get_double(a1);
	}
	public void setDispersionfactor(EIfcsurfacestylerefraction type, double value) throws SdaiException {
		a1 = set_double(value);
	}
	public void unsetDispersionfactor(EIfcsurfacestylerefraction type) throws SdaiException {
		a1 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeDispersionfactor(EIfcsurfacestylerefraction type) throws SdaiException {
		return a1$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = Double.NaN;
			a1 = Double.NaN;
			return;
		}
		a0 = av.entityValues[1].getDouble(0);
		a1 = av.entityValues[1].getDouble(1);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = Double.NaN;
			a1 = Double.NaN;
			return;
		}
		a0 = av.entityValues[1].getDouble(0);
		a1 = av.entityValues[1].getDouble(1);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcPresentationItem
		// partial entity: IfcSurfaceStyleRefraction
		av.entityValues[1].setDouble(0, a0);
		av.entityValues[1].setDouble(1, a1);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcPresentationItem
		// partial entity: IfcSurfaceStyleRefraction
		av.entityValues[1].setDouble(0, a0);
		av.entityValues[1].setDouble(1, a1);
	}
}
