/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcLightSource

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfclightsource extends CIfcgeometricrepresentationitem implements EIfclightsource {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfclightsource.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	protected String a0; // Name - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected Object a1; // LightColour - current entity - ENTITY IfcColourRgb
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected double a2; // AmbientIntensity - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected double a3; // Intensity - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// Name - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected String a0;
	// LightColour - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected Object a1;
	// AmbientIntensity - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected double a2;
	// Intensity - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected double a3;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a1 == old) {
			a1 = newer;
		}
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a1 == old) {
			a1 = newer;
		}
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #5552=INVERSE_ATTRIBUTE('LayerAssignment',#5550,0,#5023,$,#5027,#9221,#9222,.F.);
	//<01> generating methods for consolidated attribute:  LayerAssignment
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5553=INVERSE_ATTRIBUTE('StyledByItem',#5550,1,#5936,$,#5938,#9224,#9225,.F.);
	//<01> generating methods for consolidated attribute:  StyledByItem
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4576=EXPLICIT_ATTRIBUTE('Name',#4574,0,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Name, base type: STRING
	public boolean testName(EIfclightsource type) throws SdaiException {
		return test_string(a0);
	}
	public String getName(EIfclightsource type) throws SdaiException {
		return get_string(a0);
	}
	public void setName(EIfclightsource type, String value) throws SdaiException {
		a0 = set_string(value);
	}
	public void unsetName(EIfclightsource type) throws SdaiException {
		a0 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeName(EIfclightsource type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #4577=EXPLICIT_ATTRIBUTE('LightColour',#4574,1,#3650,$,.F.);
	//<01> generating methods for consolidated attribute:  LightColour
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : LightColour, base type: entity IfcColourRgb
	public static int usedinLightcolour(EIfclightsource type, EIfccolourrgb instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a1$, domain, result);
	}
	public boolean testLightcolour(EIfclightsource type) throws SdaiException {
		return test_instance(a1);
	}
	public EIfccolourrgb getLightcolour(EIfclightsource type) throws SdaiException {
		return (EIfccolourrgb)get_instance(a1);
	}
	public void setLightcolour(EIfclightsource type, EIfccolourrgb value) throws SdaiException {
		a1 = set_instance(a1, value);
	}
	public void unsetLightcolour(EIfclightsource type) throws SdaiException {
		a1 = unset_instance(a1);
	}
	public static jsdai.dictionary.EAttribute attributeLightcolour(EIfclightsource type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #4578=EXPLICIT_ATTRIBUTE('AmbientIntensity',#4574,2,#2593,$,.T.);
	//<01> generating methods for consolidated attribute:  AmbientIntensity
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: AmbientIntensity, base type: REAL
	public boolean testAmbientintensity(EIfclightsource type) throws SdaiException {
		return test_double(a2);
	}
	public double getAmbientintensity(EIfclightsource type) throws SdaiException {
		return get_double(a2);
	}
	public void setAmbientintensity(EIfclightsource type, double value) throws SdaiException {
		a2 = set_double(value);
	}
	public void unsetAmbientintensity(EIfclightsource type) throws SdaiException {
		a2 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeAmbientintensity(EIfclightsource type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #4579=EXPLICIT_ATTRIBUTE('Intensity',#4574,3,#2593,$,.T.);
	//<01> generating methods for consolidated attribute:  Intensity
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Intensity, base type: REAL
	public boolean testIntensity(EIfclightsource type) throws SdaiException {
		return test_double(a3);
	}
	public double getIntensity(EIfclightsource type) throws SdaiException {
		return get_double(a3);
	}
	public void setIntensity(EIfclightsource type, double value) throws SdaiException {
		a3 = set_double(value);
	}
	public void unsetIntensity(EIfclightsource type) throws SdaiException {
		a3 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeIntensity(EIfclightsource type) throws SdaiException {
		return a3$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = unset_instance(a1);
			a2 = Double.NaN;
			a3 = Double.NaN;
			return;
		}
		a0 = av.entityValues[1].getString(0);
		a1 = av.entityValues[1].getInstance(1, this, a1$);
		a2 = av.entityValues[1].getDouble(2);
		a3 = av.entityValues[1].getDouble(3);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = unset_instance(a1);
			a2 = Double.NaN;
			a3 = Double.NaN;
			return;
		}
		a0 = av.entityValues[1].getString(0);
		a1 = av.entityValues[1].getInstance(1, this, a1$);
		a2 = av.entityValues[1].getDouble(2);
		a3 = av.entityValues[1].getDouble(3);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcLightSource
		av.entityValues[1].setString(0, a0);
		av.entityValues[1].setInstance(1, a1);
		av.entityValues[1].setDouble(2, a2);
		av.entityValues[1].setDouble(3, a3);
		// partial entity: IfcRepresentationItem
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcLightSource
		av.entityValues[1].setString(0, a0);
		av.entityValues[1].setInstance(1, a1);
		av.entityValues[1].setDouble(2, a2);
		av.entityValues[1].setDouble(3, a3);
		// partial entity: IfcRepresentationItem
	}
}
