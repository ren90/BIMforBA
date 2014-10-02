/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcSurfaceStyleRendering

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcsurfacestylerendering extends CIfcsurfacestyleshading implements EIfcsurfacestylerendering {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcsurfacestylerendering.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// SurfaceColour: protected Object a0;   SurfaceColour - java inheritance - ENTITY IfcColourRgb
	protected double a1; // Transparency - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected Object a2; // DiffuseColour - current entity - SELECT IfcColourOrFactor
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected int a2$$; // current SELECT path indicator
	protected Object a3; // TransmissionColour - current entity - SELECT IfcColourOrFactor
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected int a3$$; // current SELECT path indicator
	protected Object a4; // DiffuseTransmissionColour - current entity - SELECT IfcColourOrFactor
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected int a4$$; // current SELECT path indicator
	protected Object a5; // ReflectionColour - current entity - SELECT IfcColourOrFactor
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected int a5$$; // current SELECT path indicator
	protected Object a6; // SpecularColour - current entity - SELECT IfcColourOrFactor
	protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	protected int a6$$; // current SELECT path indicator
	protected Object a7; // SpecularHighlight - current entity - SELECT IfcSpecularHighlightSelect
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	protected int a7$$; // current SELECT path indicator
	protected int a8; // ReflectanceMethod - current entity - ENUMERATION IfcReflectanceMethodEnum
	protected static final jsdai.dictionary.CExplicit_attribute a8$ = CEntity.initExplicitAttribute(definition, 8);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// SurfaceColour - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected Object a0;
	// Transparency - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected double a1;
	// DiffuseColour - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected Object a2;
	protected int a2$$;
	// TransmissionColour - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected Object a3;
	protected int a3$$;
	// DiffuseTransmissionColour - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected Object a4;
	protected int a4$$;
	// ReflectionColour - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected Object a5;
	protected int a5$$;
	// SpecularColour - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	protected Object a6;
	protected int a6$$;
	// SpecularHighlight - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	protected Object a7;
	protected int a7$$;
	// ReflectanceMethod - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a8$ = CEntity.initExplicitAttribute(definition, 8);
	protected int a8;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a2 == old) {
			a2 = newer;
		}
		if (a3 == old) {
			a3 = newer;
		}
		if (a4 == old) {
			a4 = newer;
		}
		if (a5 == old) {
			a5 = newer;
		}
		if (a6 == old) {
			a6 = newer;
		}
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a2 == old) {
			a2 = newer;
		}
		if (a3 == old) {
			a3 = newer;
		}
		if (a4 == old) {
			a4 = newer;
		}
		if (a5 == old) {
			a5 = newer;
		}
		if (a6 == old) {
			a6 = newer;
		}
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #6004=EXPLICIT_ATTRIBUTE('SurfaceColour',#6002,0,#3650,$,.F.);
	//<01> generating methods for consolidated attribute:  SurfaceColour
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): SurfaceColour, base type: entity IfcColourRgb
	public static int usedinSurfacecolour(EIfcsurfacestyleshading type, EIfccolourrgb instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	//going through all the attributes: #5994=EXPLICIT_ATTRIBUTE('Transparency',#5992,0,#2593,$,.T.);
	//<01> generating methods for consolidated attribute:  Transparency
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Transparency, base type: REAL
	public boolean testTransparency(EIfcsurfacestylerendering type) throws SdaiException {
		return test_double(a1);
	}
	public double getTransparency(EIfcsurfacestylerendering type) throws SdaiException {
		return get_double(a1);
	}
	public void setTransparency(EIfcsurfacestylerendering type, double value) throws SdaiException {
		a1 = set_double(value);
	}
	public void unsetTransparency(EIfcsurfacestylerendering type) throws SdaiException {
		a1 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeTransparency(EIfcsurfacestylerendering type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #5995=EXPLICIT_ATTRIBUTE('DiffuseColour',#5992,1,#3127,$,.T.);
	//<01> generating methods for consolidated attribute:  DiffuseColour
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// -2- methods for SELECT attribute: DiffuseColour
	public static int usedinDiffusecolour(EIfcsurfacestylerendering type, EIfccolourrgb instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a2$, domain, result);
	}
	public int testDiffusecolour(EIfcsurfacestylerendering type) throws SdaiException {
		return test_select(a2, a2$$);
	}

	public EEntity getDiffusecolour(EIfcsurfacestylerendering type) throws SdaiException { // case 1
		return get_instance_select(a2);
	}
	public double getDiffusecolour(EIfcsurfacestylerendering type, EIfcnormalisedratiomeasure node1) throws SdaiException { // case 2
		return get_double_select(a2, a2$$, 2);
	}

	public void setDiffusecolour(EIfcsurfacestylerendering type, EEntity value) throws SdaiException { // case 1
		a2 = set_instance(a2, value);
	}
	public void setDiffusecolour(EIfcsurfacestylerendering type, double value, EIfcnormalisedratiomeasure node1) throws SdaiException { // case 2
		a2 = set_double_select(value);
		a2$$ = 2;
	}

	public void unsetDiffusecolour(EIfcsurfacestylerendering type) throws SdaiException {
		a2 = unset_select(a2);
		a2$$ = 0;
	}

	public static jsdai.dictionary.EAttribute attributeDiffusecolour(EIfcsurfacestylerendering type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #5996=EXPLICIT_ATTRIBUTE('TransmissionColour',#5992,2,#3127,$,.T.);
	//<01> generating methods for consolidated attribute:  TransmissionColour
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// -2- methods for SELECT attribute: TransmissionColour
	public static int usedinTransmissioncolour(EIfcsurfacestylerendering type, EIfccolourrgb instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a3$, domain, result);
	}
	public int testTransmissioncolour(EIfcsurfacestylerendering type) throws SdaiException {
		return test_select(a3, a3$$);
	}

	public EEntity getTransmissioncolour(EIfcsurfacestylerendering type) throws SdaiException { // case 1
		return get_instance_select(a3);
	}
	public double getTransmissioncolour(EIfcsurfacestylerendering type, EIfcnormalisedratiomeasure node1) throws SdaiException { // case 2
		return get_double_select(a3, a3$$, 2);
	}

	public void setTransmissioncolour(EIfcsurfacestylerendering type, EEntity value) throws SdaiException { // case 1
		a3 = set_instance(a3, value);
	}
	public void setTransmissioncolour(EIfcsurfacestylerendering type, double value, EIfcnormalisedratiomeasure node1) throws SdaiException { // case 2
		a3 = set_double_select(value);
		a3$$ = 2;
	}

	public void unsetTransmissioncolour(EIfcsurfacestylerendering type) throws SdaiException {
		a3 = unset_select(a3);
		a3$$ = 0;
	}

	public static jsdai.dictionary.EAttribute attributeTransmissioncolour(EIfcsurfacestylerendering type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #5997=EXPLICIT_ATTRIBUTE('DiffuseTransmissionColour',#5992,3,#3127,$,.T.);
	//<01> generating methods for consolidated attribute:  DiffuseTransmissionColour
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// -2- methods for SELECT attribute: DiffuseTransmissionColour
	public static int usedinDiffusetransmissioncolour(EIfcsurfacestylerendering type, EIfccolourrgb instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a4$, domain, result);
	}
	public int testDiffusetransmissioncolour(EIfcsurfacestylerendering type) throws SdaiException {
		return test_select(a4, a4$$);
	}

	public EEntity getDiffusetransmissioncolour(EIfcsurfacestylerendering type) throws SdaiException { // case 1
		return get_instance_select(a4);
	}
	public double getDiffusetransmissioncolour(EIfcsurfacestylerendering type, EIfcnormalisedratiomeasure node1) throws SdaiException { // case 2
		return get_double_select(a4, a4$$, 2);
	}

	public void setDiffusetransmissioncolour(EIfcsurfacestylerendering type, EEntity value) throws SdaiException { // case 1
		a4 = set_instance(a4, value);
	}
	public void setDiffusetransmissioncolour(EIfcsurfacestylerendering type, double value, EIfcnormalisedratiomeasure node1) throws SdaiException { // case 2
		a4 = set_double_select(value);
		a4$$ = 2;
	}

	public void unsetDiffusetransmissioncolour(EIfcsurfacestylerendering type) throws SdaiException {
		a4 = unset_select(a4);
		a4$$ = 0;
	}

	public static jsdai.dictionary.EAttribute attributeDiffusetransmissioncolour(EIfcsurfacestylerendering type) throws SdaiException {
		return a4$;
	}

	//going through all the attributes: #5998=EXPLICIT_ATTRIBUTE('ReflectionColour',#5992,4,#3127,$,.T.);
	//<01> generating methods for consolidated attribute:  ReflectionColour
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// -2- methods for SELECT attribute: ReflectionColour
	public static int usedinReflectioncolour(EIfcsurfacestylerendering type, EIfccolourrgb instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a5$, domain, result);
	}
	public int testReflectioncolour(EIfcsurfacestylerendering type) throws SdaiException {
		return test_select(a5, a5$$);
	}

	public EEntity getReflectioncolour(EIfcsurfacestylerendering type) throws SdaiException { // case 1
		return get_instance_select(a5);
	}
	public double getReflectioncolour(EIfcsurfacestylerendering type, EIfcnormalisedratiomeasure node1) throws SdaiException { // case 2
		return get_double_select(a5, a5$$, 2);
	}

	public void setReflectioncolour(EIfcsurfacestylerendering type, EEntity value) throws SdaiException { // case 1
		a5 = set_instance(a5, value);
	}
	public void setReflectioncolour(EIfcsurfacestylerendering type, double value, EIfcnormalisedratiomeasure node1) throws SdaiException { // case 2
		a5 = set_double_select(value);
		a5$$ = 2;
	}

	public void unsetReflectioncolour(EIfcsurfacestylerendering type) throws SdaiException {
		a5 = unset_select(a5);
		a5$$ = 0;
	}

	public static jsdai.dictionary.EAttribute attributeReflectioncolour(EIfcsurfacestylerendering type) throws SdaiException {
		return a5$;
	}

	//going through all the attributes: #5999=EXPLICIT_ATTRIBUTE('SpecularColour',#5992,5,#3127,$,.T.);
	//<01> generating methods for consolidated attribute:  SpecularColour
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// -2- methods for SELECT attribute: SpecularColour
	public static int usedinSpecularcolour(EIfcsurfacestylerendering type, EIfccolourrgb instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a6$, domain, result);
	}
	public int testSpecularcolour(EIfcsurfacestylerendering type) throws SdaiException {
		return test_select(a6, a6$$);
	}

	public EEntity getSpecularcolour(EIfcsurfacestylerendering type) throws SdaiException { // case 1
		return get_instance_select(a6);
	}
	public double getSpecularcolour(EIfcsurfacestylerendering type, EIfcnormalisedratiomeasure node1) throws SdaiException { // case 2
		return get_double_select(a6, a6$$, 2);
	}

	public void setSpecularcolour(EIfcsurfacestylerendering type, EEntity value) throws SdaiException { // case 1
		a6 = set_instance(a6, value);
	}
	public void setSpecularcolour(EIfcsurfacestylerendering type, double value, EIfcnormalisedratiomeasure node1) throws SdaiException { // case 2
		a6 = set_double_select(value);
		a6$$ = 2;
	}

	public void unsetSpecularcolour(EIfcsurfacestylerendering type) throws SdaiException {
		a6 = unset_select(a6);
		a6$$ = 0;
	}

	public static jsdai.dictionary.EAttribute attributeSpecularcolour(EIfcsurfacestylerendering type) throws SdaiException {
		return a6$;
	}

	//going through all the attributes: #6000=EXPLICIT_ATTRIBUTE('SpecularHighlight',#5992,6,#3203,$,.T.);
	//<01> generating methods for consolidated attribute:  SpecularHighlight
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// -2- methods for SELECT attribute: SpecularHighlight
	public int testSpecularhighlight(EIfcsurfacestylerendering type) throws SdaiException {
		return test_select(a7, a7$$);
	}

	public double getSpecularhighlight(EIfcsurfacestylerendering type, EIfcspecularexponent node1) throws SdaiException { // case 2
		return get_double_select(a7, a7$$, 2);
	}
	public double getSpecularhighlight(EIfcsurfacestylerendering type, EIfcspecularroughness node1) throws SdaiException { // case 3
		return get_double_select(a7, a7$$, 3);
	}

	public void setSpecularhighlight(EIfcsurfacestylerendering type, double value, EIfcspecularexponent node1) throws SdaiException { // case 2
		a7 = set_double_select(value);
		a7$$ = 2;
	}
	public void setSpecularhighlight(EIfcsurfacestylerendering type, double value, EIfcspecularroughness node1) throws SdaiException { // case 3
		a7 = set_double_select(value);
		a7$$ = 3;
	}

	public void unsetSpecularhighlight(EIfcsurfacestylerendering type) throws SdaiException {
		a7 = unset_select(a7);
		a7$$ = 0;
	}

	public static jsdai.dictionary.EAttribute attributeSpecularhighlight(EIfcsurfacestylerendering type) throws SdaiException {
		return a7$;
	}

	//going through all the attributes: #6001=EXPLICIT_ATTRIBUTE('ReflectanceMethod',#5992,7,#2987,$,.F.);
	//<01> generating methods for consolidated attribute:  ReflectanceMethod
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute:ReflectanceMethod, base type: ENUMERATION
	public boolean testReflectancemethod(EIfcsurfacestylerendering type) throws SdaiException {
		return test_enumeration(a8);
	}
	public int getReflectancemethod(EIfcsurfacestylerendering type) throws SdaiException {
		return get_enumeration(a8);
	}
	public void setReflectancemethod(EIfcsurfacestylerendering type, int value) throws SdaiException {
		a8 = set_enumeration(value, a8$);
	}
	public void unsetReflectancemethod(EIfcsurfacestylerendering type) throws SdaiException {
		a8 = unset_enumeration();
	}
	public static jsdai.dictionary.EAttribute attributeReflectancemethod(EIfcsurfacestylerendering type) throws SdaiException {
		return a8$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a1 = Double.NaN;
			a2 = unset_select(a2);
			a2$$ = 0;
			a3 = unset_select(a3);
			a3$$ = 0;
			a4 = unset_select(a4);
			a4$$ = 0;
			a5 = unset_select(a5);
			a5$$ = 0;
			a6 = unset_select(a6);
			a6$$ = 0;
			a7 = unset_select(a7);
			a7$$ = 0;
			a8 = 0;
			a0 = unset_instance(a0);
			return;
		}
		a1 = av.entityValues[1].getDouble(0);
		a2 = av.entityValues[1].getMixed(1,a2$, this);
		a2$$ = av.entityValues[1].getSelectNumber();
		a3 = av.entityValues[1].getMixed(2,a3$, this);
		a3$$ = av.entityValues[1].getSelectNumber();
		a4 = av.entityValues[1].getMixed(3,a4$, this);
		a4$$ = av.entityValues[1].getSelectNumber();
		a5 = av.entityValues[1].getMixed(4,a5$, this);
		a5$$ = av.entityValues[1].getSelectNumber();
		a6 = av.entityValues[1].getMixed(5,a6$, this);
		a6$$ = av.entityValues[1].getSelectNumber();
		a7 = av.entityValues[1].getMixed(6,a7$, this);
		a7$$ = av.entityValues[1].getSelectNumber();
		a8 = av.entityValues[1].getEnumeration(7, a8$);
		a0 = av.entityValues[2].getInstance(0, this, a0$);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a1 = Double.NaN;
			a2 = unset_select(a2);
			a2$$ = 0;
			a3 = unset_select(a3);
			a3$$ = 0;
			a4 = unset_select(a4);
			a4$$ = 0;
			a5 = unset_select(a5);
			a5$$ = 0;
			a6 = unset_select(a6);
			a6$$ = 0;
			a7 = unset_select(a7);
			a7$$ = 0;
			a8 = 0;
			a0 = unset_instance(a0);
			return;
		}
		a1 = av.entityValues[1].getDouble(0);
		a2 = av.entityValues[1].getMixed(1,a2$, this);
		a2$$ = av.entityValues[1].getSelectNumber();
		a3 = av.entityValues[1].getMixed(2,a3$, this);
		a3$$ = av.entityValues[1].getSelectNumber();
		a4 = av.entityValues[1].getMixed(3,a4$, this);
		a4$$ = av.entityValues[1].getSelectNumber();
		a5 = av.entityValues[1].getMixed(4,a5$, this);
		a5$$ = av.entityValues[1].getSelectNumber();
		a6 = av.entityValues[1].getMixed(5,a6$, this);
		a6$$ = av.entityValues[1].getSelectNumber();
		a7 = av.entityValues[1].getMixed(6,a7$, this);
		a7$$ = av.entityValues[1].getSelectNumber();
		a8 = av.entityValues[1].getEnumeration(7, a8$);
		a0 = av.entityValues[2].getInstance(0, this, a0$);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcPresentationItem
		// partial entity: IfcSurfaceStyleRendering
		av.entityValues[1].setDouble(0, a1);
		av.entityValues[1].setMixed(1, a2, a2$, a2$$);
		av.entityValues[1].setMixed(2, a3, a3$, a3$$);
		av.entityValues[1].setMixed(3, a4, a4$, a4$$);
		av.entityValues[1].setMixed(4, a5, a5$, a5$$);
		av.entityValues[1].setMixed(5, a6, a6$, a6$$);
		av.entityValues[1].setMixed(6, a7, a7$, a7$$);
		av.entityValues[1].setEnumeration(7, a8, a8$);
		// partial entity: IfcSurfaceStyleShading
		av.entityValues[2].setInstance(0, a0);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcPresentationItem
		// partial entity: IfcSurfaceStyleRendering
		av.entityValues[1].setDouble(0, a1);
		av.entityValues[1].setMixed(1, a2, a2$, a2$$);
		av.entityValues[1].setMixed(2, a3, a3$, a3$$);
		av.entityValues[1].setMixed(3, a4, a4$, a4$$);
		av.entityValues[1].setMixed(4, a5, a5$, a5$$);
		av.entityValues[1].setMixed(5, a6, a6$, a6$$);
		av.entityValues[1].setMixed(6, a7, a7$, a7$$);
		av.entityValues[1].setEnumeration(7, a8, a8$);
		// partial entity: IfcSurfaceStyleShading
		av.entityValues[2].setInstance(0, a0);
	}
}
