/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcEllipseProfileDef

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcellipseprofiledef extends CIfcparameterizedprofiledef implements EIfcellipseprofiledef {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcellipseprofiledef.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// ProfileType: protected int a0;   ProfileType - java inheritance - ENUMERATION IfcProfileTypeEnum
	// ProfileName: protected String a1;   ProfileName - java inheritance - STRING
	// HasExternalReference: protected Object  - inverse - java inheritance -  ENTITY IfcExternalReferenceRelationship
	// HasProperties: protected Object  - inverse - java inheritance -  ENTITY IfcProfileProperties
	// Position: protected Object a2;   Position - java inheritance - ENTITY IfcAxis2Placement2D
	protected double a3; // SemiAxis1 - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected double a4; // SemiAxis2 - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// ProfileType - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected int a0;
	// ProfileName - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected String a1;
	// HasExternalReference - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// HasProperties - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// Position - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	// protected Object a2;
	// SemiAxis1 - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected double a3;
	// SemiAxis2 - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected double a4;

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

	//going through all the attributes: #5070=EXPLICIT_ATTRIBUTE('ProfileType',#5068,0,#2963,$,.F.);
	//<01> generating methods for consolidated attribute:  ProfileType
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5071=EXPLICIT_ATTRIBUTE('ProfileName',#5068,1,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  ProfileName
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5072=INVERSE_ATTRIBUTE('HasExternalReference',#5068,0,#4231,$,#4234,#8892,$,.F.);
	//<01> generating methods for consolidated attribute:  HasExternalReference
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5073=INVERSE_ATTRIBUTE('HasProperties',#5068,1,#5074,$,#5076,#8894,$,.F.);
	//<01> generating methods for consolidated attribute:  HasProperties
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4870=EXPLICIT_ATTRIBUTE('Position',#4868,0,#3378,$,.T.);
	//<01> generating methods for consolidated attribute:  Position
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): Position, base type: entity IfcAxis2Placement2D
	public static int usedinPosition(EIfcparameterizedprofiledef type, EIfcaxis2placement2d instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a2$, domain, result);
	}
	//going through all the attributes: #4177=EXPLICIT_ATTRIBUTE('SemiAxis1',#4175,0,#2605,$,.F.);
	//<01> generating methods for consolidated attribute:  SemiAxis1
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: SemiAxis1, base type: REAL
	public boolean testSemiaxis1(EIfcellipseprofiledef type) throws SdaiException {
		return test_double(a3);
	}
	public double getSemiaxis1(EIfcellipseprofiledef type) throws SdaiException {
		return get_double(a3);
	}
	public void setSemiaxis1(EIfcellipseprofiledef type, double value) throws SdaiException {
		a3 = set_double(value);
	}
	public void unsetSemiaxis1(EIfcellipseprofiledef type) throws SdaiException {
		a3 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeSemiaxis1(EIfcellipseprofiledef type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #4178=EXPLICIT_ATTRIBUTE('SemiAxis2',#4175,1,#2605,$,.F.);
	//<01> generating methods for consolidated attribute:  SemiAxis2
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: SemiAxis2, base type: REAL
	public boolean testSemiaxis2(EIfcellipseprofiledef type) throws SdaiException {
		return test_double(a4);
	}
	public double getSemiaxis2(EIfcellipseprofiledef type) throws SdaiException {
		return get_double(a4);
	}
	public void setSemiaxis2(EIfcellipseprofiledef type, double value) throws SdaiException {
		a4 = set_double(value);
	}
	public void unsetSemiaxis2(EIfcellipseprofiledef type) throws SdaiException {
		a4 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeSemiaxis2(EIfcellipseprofiledef type) throws SdaiException {
		return a4$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a3 = Double.NaN;
			a4 = Double.NaN;
			a2 = unset_instance(a2);
			a0 = 0;
			a1 = null;
			return;
		}
		a3 = av.entityValues[0].getDouble(0);
		a4 = av.entityValues[0].getDouble(1);
		a2 = av.entityValues[1].getInstance(0, this, a2$);
		a0 = av.entityValues[2].getEnumeration(0, a0$);
		a1 = av.entityValues[2].getString(1);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a3 = Double.NaN;
			a4 = Double.NaN;
			a2 = unset_instance(a2);
			a0 = 0;
			a1 = null;
			return;
		}
		a3 = av.entityValues[0].getDouble(0);
		a4 = av.entityValues[0].getDouble(1);
		a2 = av.entityValues[1].getInstance(0, this, a2$);
		a0 = av.entityValues[2].getEnumeration(0, a0$);
		a1 = av.entityValues[2].getString(1);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcEllipseProfileDef
		av.entityValues[0].setDouble(0, a3);
		av.entityValues[0].setDouble(1, a4);
		// partial entity: IfcParameterizedProfileDef
		av.entityValues[1].setInstance(0, a2);
		// partial entity: IfcProfileDef
		av.entityValues[2].setEnumeration(0, a0, a0$);
		av.entityValues[2].setString(1, a1);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcEllipseProfileDef
		av.entityValues[0].setDouble(0, a3);
		av.entityValues[0].setDouble(1, a4);
		// partial entity: IfcParameterizedProfileDef
		av.entityValues[1].setInstance(0, a2);
		// partial entity: IfcProfileDef
		av.entityValues[2].setEnumeration(0, a0, a0$);
		av.entityValues[2].setString(1, a1);
	}
}