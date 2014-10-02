/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcSurfaceStyleLighting

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcsurfacestylelighting extends CIfcpresentationitem implements EIfcsurfacestylelighting {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcsurfacestylelighting.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	protected Object a0; // DiffuseTransmissionColour - current entity - ENTITY IfcColourRgb
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected Object a1; // DiffuseReflectionColour - current entity - ENTITY IfcColourRgb
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected Object a2; // TransmissionColour - current entity - ENTITY IfcColourRgb
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected Object a3; // ReflectanceColour - current entity - ENTITY IfcColourRgb
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// DiffuseTransmissionColour - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected Object a0;
	// DiffuseReflectionColour - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected Object a1;
	// TransmissionColour - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected Object a2;
	// ReflectanceColour - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected Object a3;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a0 == old) {
			a0 = newer;
		}
		if (a1 == old) {
			a1 = newer;
		}
		if (a2 == old) {
			a2 = newer;
		}
		if (a3 == old) {
			a3 = newer;
		}
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a0 == old) {
			a0 = newer;
		}
		if (a1 == old) {
			a1 = newer;
		}
		if (a2 == old) {
			a2 = newer;
		}
		if (a3 == old) {
			a3 = newer;
		}
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #5984=EXPLICIT_ATTRIBUTE('DiffuseTransmissionColour',#5982,0,#3650,$,.F.);
	//<01> generating methods for consolidated attribute:  DiffuseTransmissionColour
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : DiffuseTransmissionColour, base type: entity IfcColourRgb
	public static int usedinDiffusetransmissioncolour(EIfcsurfacestylelighting type, EIfccolourrgb instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	public boolean testDiffusetransmissioncolour(EIfcsurfacestylelighting type) throws SdaiException {
		return test_instance(a0);
	}
	public EIfccolourrgb getDiffusetransmissioncolour(EIfcsurfacestylelighting type) throws SdaiException {
		return (EIfccolourrgb)get_instance(a0);
	}
	public void setDiffusetransmissioncolour(EIfcsurfacestylelighting type, EIfccolourrgb value) throws SdaiException {
		a0 = set_instance(a0, value);
	}
	public void unsetDiffusetransmissioncolour(EIfcsurfacestylelighting type) throws SdaiException {
		a0 = unset_instance(a0);
	}
	public static jsdai.dictionary.EAttribute attributeDiffusetransmissioncolour(EIfcsurfacestylelighting type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #5985=EXPLICIT_ATTRIBUTE('DiffuseReflectionColour',#5982,1,#3650,$,.F.);
	//<01> generating methods for consolidated attribute:  DiffuseReflectionColour
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : DiffuseReflectionColour, base type: entity IfcColourRgb
	public static int usedinDiffusereflectioncolour(EIfcsurfacestylelighting type, EIfccolourrgb instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a1$, domain, result);
	}
	public boolean testDiffusereflectioncolour(EIfcsurfacestylelighting type) throws SdaiException {
		return test_instance(a1);
	}
	public EIfccolourrgb getDiffusereflectioncolour(EIfcsurfacestylelighting type) throws SdaiException {
		return (EIfccolourrgb)get_instance(a1);
	}
	public void setDiffusereflectioncolour(EIfcsurfacestylelighting type, EIfccolourrgb value) throws SdaiException {
		a1 = set_instance(a1, value);
	}
	public void unsetDiffusereflectioncolour(EIfcsurfacestylelighting type) throws SdaiException {
		a1 = unset_instance(a1);
	}
	public static jsdai.dictionary.EAttribute attributeDiffusereflectioncolour(EIfcsurfacestylelighting type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #5986=EXPLICIT_ATTRIBUTE('TransmissionColour',#5982,2,#3650,$,.F.);
	//<01> generating methods for consolidated attribute:  TransmissionColour
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : TransmissionColour, base type: entity IfcColourRgb
	public static int usedinTransmissioncolour(EIfcsurfacestylelighting type, EIfccolourrgb instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a2$, domain, result);
	}
	public boolean testTransmissioncolour(EIfcsurfacestylelighting type) throws SdaiException {
		return test_instance(a2);
	}
	public EIfccolourrgb getTransmissioncolour(EIfcsurfacestylelighting type) throws SdaiException {
		return (EIfccolourrgb)get_instance(a2);
	}
	public void setTransmissioncolour(EIfcsurfacestylelighting type, EIfccolourrgb value) throws SdaiException {
		a2 = set_instance(a2, value);
	}
	public void unsetTransmissioncolour(EIfcsurfacestylelighting type) throws SdaiException {
		a2 = unset_instance(a2);
	}
	public static jsdai.dictionary.EAttribute attributeTransmissioncolour(EIfcsurfacestylelighting type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #5987=EXPLICIT_ATTRIBUTE('ReflectanceColour',#5982,3,#3650,$,.F.);
	//<01> generating methods for consolidated attribute:  ReflectanceColour
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : ReflectanceColour, base type: entity IfcColourRgb
	public static int usedinReflectancecolour(EIfcsurfacestylelighting type, EIfccolourrgb instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a3$, domain, result);
	}
	public boolean testReflectancecolour(EIfcsurfacestylelighting type) throws SdaiException {
		return test_instance(a3);
	}
	public EIfccolourrgb getReflectancecolour(EIfcsurfacestylelighting type) throws SdaiException {
		return (EIfccolourrgb)get_instance(a3);
	}
	public void setReflectancecolour(EIfcsurfacestylelighting type, EIfccolourrgb value) throws SdaiException {
		a3 = set_instance(a3, value);
	}
	public void unsetReflectancecolour(EIfcsurfacestylelighting type) throws SdaiException {
		a3 = unset_instance(a3);
	}
	public static jsdai.dictionary.EAttribute attributeReflectancecolour(EIfcsurfacestylelighting type) throws SdaiException {
		return a3$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			a1 = unset_instance(a1);
			a2 = unset_instance(a2);
			a3 = unset_instance(a3);
			return;
		}
		a0 = av.entityValues[1].getInstance(0, this, a0$);
		a1 = av.entityValues[1].getInstance(1, this, a1$);
		a2 = av.entityValues[1].getInstance(2, this, a2$);
		a3 = av.entityValues[1].getInstance(3, this, a3$);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			a1 = unset_instance(a1);
			a2 = unset_instance(a2);
			a3 = unset_instance(a3);
			return;
		}
		a0 = av.entityValues[1].getInstance(0, this, a0$);
		a1 = av.entityValues[1].getInstance(1, this, a1$);
		a2 = av.entityValues[1].getInstance(2, this, a2$);
		a3 = av.entityValues[1].getInstance(3, this, a3$);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcPresentationItem
		// partial entity: IfcSurfaceStyleLighting
		av.entityValues[1].setInstance(0, a0);
		av.entityValues[1].setInstance(1, a1);
		av.entityValues[1].setInstance(2, a2);
		av.entityValues[1].setInstance(3, a3);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcPresentationItem
		// partial entity: IfcSurfaceStyleLighting
		av.entityValues[1].setInstance(0, a0);
		av.entityValues[1].setInstance(1, a1);
		av.entityValues[1].setInstance(2, a2);
		av.entityValues[1].setInstance(3, a3);
	}
}
