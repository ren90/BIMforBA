/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcLightSourceSpot

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfclightsourcespot extends CIfclightsourcepositional implements EIfclightsourcespot {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfclightsourcespot.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	// Name: protected String a0;   Name - java inheritance - STRING
	// LightColour: protected Object a1;   LightColour - java inheritance - ENTITY IfcColourRgb
	// AmbientIntensity: protected double a2;   AmbientIntensity - java inheritance - REAL
	// Intensity: protected double a3;   Intensity - java inheritance - REAL
	// Position: protected Object a4;   Position - java inheritance - ENTITY IfcCartesianPoint
	// Radius: protected double a5;   Radius - java inheritance - REAL
	// ConstantAttenuation: protected double a6;   ConstantAttenuation - java inheritance - REAL
	// DistanceAttenuation: protected double a7;   DistanceAttenuation - java inheritance - REAL
	// QuadricAttenuation: protected double a8;   QuadricAttenuation - java inheritance - REAL
	protected Object a9; // Orientation - current entity - ENTITY IfcDirection
	protected static final jsdai.dictionary.CExplicit_attribute a9$ = CEntity.initExplicitAttribute(definition, 9);
	protected double a10; // ConcentrationExponent - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a10$ = CEntity.initExplicitAttribute(definition, 10);
	protected double a11; // SpreadAngle - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a11$ = CEntity.initExplicitAttribute(definition, 11);
	protected double a12; // BeamWidthAngle - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a12$ = CEntity.initExplicitAttribute(definition, 12);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// Name - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected String a0;
	// LightColour - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected Object a1;
	// AmbientIntensity - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	// protected double a2;
	// Intensity - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	// protected double a3;
	// Position - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	// protected Object a4;
	// Radius - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	// protected double a5;
	// ConstantAttenuation - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	// protected double a6;
	// DistanceAttenuation - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	// protected double a7;
	// QuadricAttenuation - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a8$ = CEntity.initExplicitAttribute(definition, 8);
	// protected double a8;
	// Orientation - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a9$ = CEntity.initExplicitAttribute(definition, 9);
	protected Object a9;
	// ConcentrationExponent - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a10$ = CEntity.initExplicitAttribute(definition, 10);
	protected double a10;
	// SpreadAngle - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a11$ = CEntity.initExplicitAttribute(definition, 11);
	protected double a11;
	// BeamWidthAngle - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a12$ = CEntity.initExplicitAttribute(definition, 12);
	protected double a12;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a9 == old) {
			a9 = newer;
		}
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a9 == old) {
			a9 = newer;
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
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4577=EXPLICIT_ATTRIBUTE('LightColour',#4574,1,#3650,$,.F.);
	//<01> generating methods for consolidated attribute:  LightColour
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): LightColour, base type: entity IfcColourRgb
	public static int usedinLightcolour(EIfclightsource type, EIfccolourrgb instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a1$, domain, result);
	}
	//going through all the attributes: #4578=EXPLICIT_ATTRIBUTE('AmbientIntensity',#4574,2,#2593,$,.T.);
	//<01> generating methods for consolidated attribute:  AmbientIntensity
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4579=EXPLICIT_ATTRIBUTE('Intensity',#4574,3,#2593,$,.T.);
	//<01> generating methods for consolidated attribute:  Intensity
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4595=EXPLICIT_ATTRIBUTE('Position',#4593,0,#3562,$,.F.);
	//<01> generating methods for consolidated attribute:  Position
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): Position, base type: entity IfcCartesianPoint
	public static int usedinPosition(EIfclightsourcepositional type, EIfccartesianpoint instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a4$, domain, result);
	}
	//going through all the attributes: #4596=EXPLICIT_ATTRIBUTE('Radius',#4593,1,#2605,$,.F.);
	//<01> generating methods for consolidated attribute:  Radius
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4597=EXPLICIT_ATTRIBUTE('ConstantAttenuation',#4593,2,#2623,$,.F.);
	//<01> generating methods for consolidated attribute:  ConstantAttenuation
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4598=EXPLICIT_ATTRIBUTE('DistanceAttenuation',#4593,3,#2623,$,.F.);
	//<01> generating methods for consolidated attribute:  DistanceAttenuation
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4599=EXPLICIT_ATTRIBUTE('QuadricAttenuation',#4593,4,#2623,$,.F.);
	//<01> generating methods for consolidated attribute:  QuadricAttenuation
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4602=EXPLICIT_ATTRIBUTE('Orientation',#4600,0,#3948,$,.F.);
	//<01> generating methods for consolidated attribute:  Orientation
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : Orientation, base type: entity IfcDirection
	public static int usedinOrientation(EIfclightsourcespot type, EIfcdirection instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a9$, domain, result);
	}
	public boolean testOrientation(EIfclightsourcespot type) throws SdaiException {
		return test_instance(a9);
	}
	public EIfcdirection getOrientation(EIfclightsourcespot type) throws SdaiException {
		return (EIfcdirection)get_instance(a9);
	}
	public void setOrientation(EIfclightsourcespot type, EIfcdirection value) throws SdaiException {
		a9 = set_instance(a9, value);
	}
	public void unsetOrientation(EIfclightsourcespot type) throws SdaiException {
		a9 = unset_instance(a9);
	}
	public static jsdai.dictionary.EAttribute attributeOrientation(EIfclightsourcespot type) throws SdaiException {
		return a9$;
	}

	//going through all the attributes: #4603=EXPLICIT_ATTRIBUTE('ConcentrationExponent',#4600,1,#2623,$,.T.);
	//<01> generating methods for consolidated attribute:  ConcentrationExponent
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: ConcentrationExponent, base type: REAL
	public boolean testConcentrationexponent(EIfclightsourcespot type) throws SdaiException {
		return test_double(a10);
	}
	public double getConcentrationexponent(EIfclightsourcespot type) throws SdaiException {
		return get_double(a10);
	}
	public void setConcentrationexponent(EIfclightsourcespot type, double value) throws SdaiException {
		a10 = set_double(value);
	}
	public void unsetConcentrationexponent(EIfclightsourcespot type) throws SdaiException {
		a10 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeConcentrationexponent(EIfclightsourcespot type) throws SdaiException {
		return a10$;
	}

	//going through all the attributes: #4604=EXPLICIT_ATTRIBUTE('SpreadAngle',#4600,2,#2607,$,.F.);
	//<01> generating methods for consolidated attribute:  SpreadAngle
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: SpreadAngle, base type: REAL
	public boolean testSpreadangle(EIfclightsourcespot type) throws SdaiException {
		return test_double(a11);
	}
	public double getSpreadangle(EIfclightsourcespot type) throws SdaiException {
		return get_double(a11);
	}
	public void setSpreadangle(EIfclightsourcespot type, double value) throws SdaiException {
		a11 = set_double(value);
	}
	public void unsetSpreadangle(EIfclightsourcespot type) throws SdaiException {
		a11 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeSpreadangle(EIfclightsourcespot type) throws SdaiException {
		return a11$;
	}

	//going through all the attributes: #4605=EXPLICIT_ATTRIBUTE('BeamWidthAngle',#4600,3,#2607,$,.F.);
	//<01> generating methods for consolidated attribute:  BeamWidthAngle
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: BeamWidthAngle, base type: REAL
	public boolean testBeamwidthangle(EIfclightsourcespot type) throws SdaiException {
		return test_double(a12);
	}
	public double getBeamwidthangle(EIfclightsourcespot type) throws SdaiException {
		return get_double(a12);
	}
	public void setBeamwidthangle(EIfclightsourcespot type, double value) throws SdaiException {
		a12 = set_double(value);
	}
	public void unsetBeamwidthangle(EIfclightsourcespot type) throws SdaiException {
		a12 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeBeamwidthangle(EIfclightsourcespot type) throws SdaiException {
		return a12$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = unset_instance(a1);
			a2 = Double.NaN;
			a3 = Double.NaN;
			a4 = unset_instance(a4);
			a5 = Double.NaN;
			a6 = Double.NaN;
			a7 = Double.NaN;
			a8 = Double.NaN;
			a9 = unset_instance(a9);
			a10 = Double.NaN;
			a11 = Double.NaN;
			a12 = Double.NaN;
			return;
		}
		a0 = av.entityValues[1].getString(0);
		a1 = av.entityValues[1].getInstance(1, this, a1$);
		a2 = av.entityValues[1].getDouble(2);
		a3 = av.entityValues[1].getDouble(3);
		a4 = av.entityValues[2].getInstance(0, this, a4$);
		a5 = av.entityValues[2].getDouble(1);
		a6 = av.entityValues[2].getDouble(2);
		a7 = av.entityValues[2].getDouble(3);
		a8 = av.entityValues[2].getDouble(4);
		a9 = av.entityValues[3].getInstance(0, this, a9$);
		a10 = av.entityValues[3].getDouble(1);
		a11 = av.entityValues[3].getDouble(2);
		a12 = av.entityValues[3].getDouble(3);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = unset_instance(a1);
			a2 = Double.NaN;
			a3 = Double.NaN;
			a4 = unset_instance(a4);
			a5 = Double.NaN;
			a6 = Double.NaN;
			a7 = Double.NaN;
			a8 = Double.NaN;
			a9 = unset_instance(a9);
			a10 = Double.NaN;
			a11 = Double.NaN;
			a12 = Double.NaN;
			return;
		}
		a0 = av.entityValues[1].getString(0);
		a1 = av.entityValues[1].getInstance(1, this, a1$);
		a2 = av.entityValues[1].getDouble(2);
		a3 = av.entityValues[1].getDouble(3);
		a4 = av.entityValues[2].getInstance(0, this, a4$);
		a5 = av.entityValues[2].getDouble(1);
		a6 = av.entityValues[2].getDouble(2);
		a7 = av.entityValues[2].getDouble(3);
		a8 = av.entityValues[2].getDouble(4);
		a9 = av.entityValues[3].getInstance(0, this, a9$);
		a10 = av.entityValues[3].getDouble(1);
		a11 = av.entityValues[3].getDouble(2);
		a12 = av.entityValues[3].getDouble(3);
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
		// partial entity: IfcLightSourcePositional
		av.entityValues[2].setInstance(0, a4);
		av.entityValues[2].setDouble(1, a5);
		av.entityValues[2].setDouble(2, a6);
		av.entityValues[2].setDouble(3, a7);
		av.entityValues[2].setDouble(4, a8);
		// partial entity: IfcLightSourceSpot
		av.entityValues[3].setInstance(0, a9);
		av.entityValues[3].setDouble(1, a10);
		av.entityValues[3].setDouble(2, a11);
		av.entityValues[3].setDouble(3, a12);
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
		// partial entity: IfcLightSourcePositional
		av.entityValues[2].setInstance(0, a4);
		av.entityValues[2].setDouble(1, a5);
		av.entityValues[2].setDouble(2, a6);
		av.entityValues[2].setDouble(3, a7);
		av.entityValues[2].setDouble(4, a8);
		// partial entity: IfcLightSourceSpot
		av.entityValues[3].setInstance(0, a9);
		av.entityValues[3].setDouble(1, a10);
		av.entityValues[3].setDouble(2, a11);
		av.entityValues[3].setDouble(3, a12);
		// partial entity: IfcRepresentationItem
	}
}
