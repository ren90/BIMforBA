/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcColourRgb

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfccolourrgb extends CIfccolourspecification implements EIfccolourrgb {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfccolourrgb.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// Name: protected String a0;   Name - java inheritance - STRING
	protected double a1; // Red - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected double a2; // Green - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected double a3; // Blue - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// Name - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected String a0;
	// Red - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected double a1;
	// Green - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected double a2;
	// Blue - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected double a3;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #3660=EXPLICIT_ATTRIBUTE('Name',#3658,0,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3652=EXPLICIT_ATTRIBUTE('Red',#3650,0,#2593,$,.F.);
	//<01> generating methods for consolidated attribute:  Red
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Red, base type: REAL
	public boolean testRed(EIfccolourrgb type) throws SdaiException {
		return test_double(a1);
	}
	public double getRed(EIfccolourrgb type) throws SdaiException {
		return get_double(a1);
	}
	public void setRed(EIfccolourrgb type, double value) throws SdaiException {
		a1 = set_double(value);
	}
	public void unsetRed(EIfccolourrgb type) throws SdaiException {
		a1 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeRed(EIfccolourrgb type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #3653=EXPLICIT_ATTRIBUTE('Green',#3650,1,#2593,$,.F.);
	//<01> generating methods for consolidated attribute:  Green
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Green, base type: REAL
	public boolean testGreen(EIfccolourrgb type) throws SdaiException {
		return test_double(a2);
	}
	public double getGreen(EIfccolourrgb type) throws SdaiException {
		return get_double(a2);
	}
	public void setGreen(EIfccolourrgb type, double value) throws SdaiException {
		a2 = set_double(value);
	}
	public void unsetGreen(EIfccolourrgb type) throws SdaiException {
		a2 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeGreen(EIfccolourrgb type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #3654=EXPLICIT_ATTRIBUTE('Blue',#3650,2,#2593,$,.F.);
	//<01> generating methods for consolidated attribute:  Blue
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Blue, base type: REAL
	public boolean testBlue(EIfccolourrgb type) throws SdaiException {
		return test_double(a3);
	}
	public double getBlue(EIfccolourrgb type) throws SdaiException {
		return get_double(a3);
	}
	public void setBlue(EIfccolourrgb type, double value) throws SdaiException {
		a3 = set_double(value);
	}
	public void unsetBlue(EIfccolourrgb type) throws SdaiException {
		a3 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeBlue(EIfccolourrgb type) throws SdaiException {
		return a3$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a1 = Double.NaN;
			a2 = Double.NaN;
			a3 = Double.NaN;
			a0 = null;
			return;
		}
		a1 = av.entityValues[0].getDouble(0);
		a2 = av.entityValues[0].getDouble(1);
		a3 = av.entityValues[0].getDouble(2);
		a0 = av.entityValues[1].getString(0);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a1 = Double.NaN;
			a2 = Double.NaN;
			a3 = Double.NaN;
			a0 = null;
			return;
		}
		a1 = av.entityValues[0].getDouble(0);
		a2 = av.entityValues[0].getDouble(1);
		a3 = av.entityValues[0].getDouble(2);
		a0 = av.entityValues[1].getString(0);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcColourRgb
		av.entityValues[0].setDouble(0, a1);
		av.entityValues[0].setDouble(1, a2);
		av.entityValues[0].setDouble(2, a3);
		// partial entity: IfcColourSpecification
		av.entityValues[1].setString(0, a0);
		// partial entity: IfcPresentationItem
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcColourRgb
		av.entityValues[0].setDouble(0, a1);
		av.entityValues[0].setDouble(1, a2);
		av.entityValues[0].setDouble(2, a3);
		// partial entity: IfcColourSpecification
		av.entityValues[1].setString(0, a0);
		// partial entity: IfcPresentationItem
	}
}
