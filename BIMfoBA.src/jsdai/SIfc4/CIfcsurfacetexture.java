/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcSurfaceTexture

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcsurfacetexture extends CIfcpresentationitem implements EIfcsurfacetexture {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcsurfacetexture.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	protected int a0; // RepeatS - current entity - BOOLEAN
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected int a1; // RepeatT - current entity - BOOLEAN
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected String a2; // Mode - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected Object a3; // TextureTransform - current entity - ENTITY IfcCartesianTransformationOperator2D
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected A_string a4; // Parameter - current entity - LIST OF STRING
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	// IsMappedBy: protected Object  - inverse - current -  ENTITY IfcTextureCoordinate
	protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// UsedInStyles: protected Object  - inverse - current -  ENTITY IfcSurfaceStyleWithTextures
	protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// RepeatS - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected int a0;
	// RepeatT - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected int a1;
	// Mode - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected String a2;
	// TextureTransform - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected Object a3;
	// Parameter - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected A_string a4;
	// IsMappedBy - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// UsedInStyles - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a3 == old) {
			a3 = newer;
		}
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a3 == old) {
			a3 = newer;
		}
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #6010=EXPLICIT_ATTRIBUTE('RepeatS',#6008,0,#6,$,.F.);
	//<01> generating methods for consolidated attribute:  RepeatS
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: RepeatS, base type: BOOLEAN
	public boolean testRepeats(EIfcsurfacetexture type) throws SdaiException {
		return test_boolean(a0);
	}
	public boolean getRepeats(EIfcsurfacetexture type) throws SdaiException {
		return get_boolean(a0);
	}
	public void setRepeats(EIfcsurfacetexture type, boolean value) throws SdaiException {
		a0 = set_boolean(value);
	}
	public void unsetRepeats(EIfcsurfacetexture type) throws SdaiException {
		a0 = unset_boolean();
	}
	public static jsdai.dictionary.EAttribute attributeRepeats(EIfcsurfacetexture type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #6011=EXPLICIT_ATTRIBUTE('RepeatT',#6008,1,#6,$,.F.);
	//<01> generating methods for consolidated attribute:  RepeatT
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: RepeatT, base type: BOOLEAN
	public boolean testRepeatt(EIfcsurfacetexture type) throws SdaiException {
		return test_boolean(a1);
	}
	public boolean getRepeatt(EIfcsurfacetexture type) throws SdaiException {
		return get_boolean(a1);
	}
	public void setRepeatt(EIfcsurfacetexture type, boolean value) throws SdaiException {
		a1 = set_boolean(value);
	}
	public void unsetRepeatt(EIfcsurfacetexture type) throws SdaiException {
		a1 = unset_boolean();
	}
	public static jsdai.dictionary.EAttribute attributeRepeatt(EIfcsurfacetexture type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #6012=EXPLICIT_ATTRIBUTE('Mode',#6008,2,#2523,$,.T.);
	//<01> generating methods for consolidated attribute:  Mode
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Mode, base type: STRING
	public boolean testMode(EIfcsurfacetexture type) throws SdaiException {
		return test_string(a2);
	}
	public String getMode(EIfcsurfacetexture type) throws SdaiException {
		return get_string(a2);
	}
	public void setMode(EIfcsurfacetexture type, String value) throws SdaiException {
		a2 = set_string(value);
	}
	public void unsetMode(EIfcsurfacetexture type) throws SdaiException {
		a2 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeMode(EIfcsurfacetexture type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #6013=EXPLICIT_ATTRIBUTE('TextureTransform',#6008,3,#3579,$,.T.);
	//<01> generating methods for consolidated attribute:  TextureTransform
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : TextureTransform, base type: entity IfcCartesianTransformationOperator2D
	public static int usedinTexturetransform(EIfcsurfacetexture type, EIfccartesiantransformationoperator2d instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a3$, domain, result);
	}
	public boolean testTexturetransform(EIfcsurfacetexture type) throws SdaiException {
		return test_instance(a3);
	}
	public EIfccartesiantransformationoperator2d getTexturetransform(EIfcsurfacetexture type) throws SdaiException {
		return (EIfccartesiantransformationoperator2d)get_instance(a3);
	}
	public void setTexturetransform(EIfcsurfacetexture type, EIfccartesiantransformationoperator2d value) throws SdaiException {
		a3 = set_instance(a3, value);
	}
	public void unsetTexturetransform(EIfcsurfacetexture type) throws SdaiException {
		a3 = unset_instance(a3);
	}
	public static jsdai.dictionary.EAttribute attributeTexturetransform(EIfcsurfacetexture type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #6014=EXPLICIT_ATTRIBUTE('Parameter',#6008,4,#7160,$,.T.);
	//<01> generating methods for consolidated attribute:  Parameter
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: Parameter, base type: LIST OF STRING
	public boolean testParameter(EIfcsurfacetexture type) throws SdaiException {
		return test_aggregate(a4);
	}
	public A_string getParameter(EIfcsurfacetexture type) throws SdaiException {
		return (A_string)get_aggregate(a4);
	}
	public A_string createParameter(EIfcsurfacetexture type) throws SdaiException {
		a4 = create_aggregate_string(a4, a4$, 0);
		return a4;
	}
	public void unsetParameter(EIfcsurfacetexture type) throws SdaiException {
		unset_aggregate(a4);
		a4 = null;
	}
	public static jsdai.dictionary.EAttribute attributeParameter(EIfcsurfacetexture type) throws SdaiException {
		return a4$;
	}

	//going through all the attributes: #6015=INVERSE_ATTRIBUTE('IsMappedBy',#6008,0,#6195,$,#6197,#9546,$,.F.);
	//<01> generating methods for consolidated attribute:  IsMappedBy
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	// Inverse attribute - IsMappedBy : SET[0:-2147483648] OF IfcTextureCoordinate FOR Maps
	public AIfctexturecoordinate getIsmappedby(EIfcsurfacetexture type, ASdaiModel domain) throws SdaiException {
		AIfctexturecoordinate result = (AIfctexturecoordinate)get_inverse_aggregate(i0$);
		CIfctexturecoordinate.usedinMaps(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributeIsmappedby(EIfcsurfacetexture type) throws SdaiException {
		return i0$;
	}

	//going through all the attributes: #6016=INVERSE_ATTRIBUTE('UsedInStyles',#6008,1,#6005,$,#6007,#9548,$,.F.);
	//<01> generating methods for consolidated attribute:  UsedInStyles
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	// Inverse attribute - UsedInStyles : SET[0:-2147483648] OF IfcSurfaceStyleWithTextures FOR Textures
	public AIfcsurfacestylewithtextures getUsedinstyles(EIfcsurfacetexture type, ASdaiModel domain) throws SdaiException {
		AIfcsurfacestylewithtextures result = (AIfcsurfacestylewithtextures)get_inverse_aggregate(i1$);
		CIfcsurfacestylewithtextures.usedinTextures(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributeUsedinstyles(EIfcsurfacetexture type) throws SdaiException {
		return i1$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = 0;
			a1 = 0;
			a2 = null;
			a3 = unset_instance(a3);
			if (a4 instanceof CAggregate)
				a4.unsetAll();
			a4 = null;
			return;
		}
		a0 = av.entityValues[1].getBoolean(0);
		a1 = av.entityValues[1].getBoolean(1);
		a2 = av.entityValues[1].getString(2);
		a3 = av.entityValues[1].getInstance(3, this, a3$);
		a4 = av.entityValues[1].getStringAggregate(4, a4$, this);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = 0;
			a1 = 0;
			a2 = null;
			a3 = unset_instance(a3);
			if (a4 instanceof CAggregate)
				a4.unsetAll();
			a4 = null;
			return;
		}
		a0 = av.entityValues[1].getBoolean(0);
		a1 = av.entityValues[1].getBoolean(1);
		a2 = av.entityValues[1].getString(2);
		a3 = av.entityValues[1].getInstance(3, this, a3$);
		a4 = av.entityValues[1].getStringAggregate(4, a4$, this);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcPresentationItem
		// partial entity: IfcSurfaceTexture
		av.entityValues[1].setBoolean(0, a0);
		av.entityValues[1].setBoolean(1, a1);
		av.entityValues[1].setString(2, a2);
		av.entityValues[1].setInstance(3, a3);
		av.entityValues[1].setStringAggregate(4, a4);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcPresentationItem
		// partial entity: IfcSurfaceTexture
		av.entityValues[1].setBoolean(0, a0);
		av.entityValues[1].setBoolean(1, a1);
		av.entityValues[1].setString(2, a2);
		av.entityValues[1].setInstance(3, a3);
		av.entityValues[1].setStringAggregate(4, a4);
	}
}
