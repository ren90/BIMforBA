/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcIndexedColourMap

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcindexedcolourmap extends CIfcpresentationitem implements EIfcindexedcolourmap {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcindexedcolourmap.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	protected Object a0; // MappedTo - current entity - ENTITY IfcTessellatedFaceSet
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected Object a1; // Overrides - current entity - ENTITY IfcSurfaceStyleShading
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected Object a2; // Colours - current entity - ENTITY IfcColourRgbList
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected A_integer a3; // ColourIndex - current entity - LIST OF INTEGER
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// MappedTo - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected Object a0;
	// Overrides - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected Object a1;
	// Colours - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected Object a2;
	// ColourIndex - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected A_integer a3;

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
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #4481=EXPLICIT_ATTRIBUTE('MappedTo',#4479,0,#6151,$,.F.);
	//<01> generating methods for consolidated attribute:  MappedTo
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : MappedTo, base type: entity IfcTessellatedFaceSet
	public static int usedinMappedto(EIfcindexedcolourmap type, EIfctessellatedfaceset instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	public boolean testMappedto(EIfcindexedcolourmap type) throws SdaiException {
		return test_instance(a0);
	}
	public EIfctessellatedfaceset getMappedto(EIfcindexedcolourmap type) throws SdaiException {
		return (EIfctessellatedfaceset)get_instance(a0);
	}
	public void setMappedto(EIfcindexedcolourmap type, EIfctessellatedfaceset value) throws SdaiException {
		a0 = set_instance(a0, value);
	}
	public void unsetMappedto(EIfcindexedcolourmap type) throws SdaiException {
		a0 = unset_instance(a0);
	}
	public static jsdai.dictionary.EAttribute attributeMappedto(EIfcindexedcolourmap type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #4482=EXPLICIT_ATTRIBUTE('Overrides',#4479,1,#6002,$,.T.);
	//<01> generating methods for consolidated attribute:  Overrides
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : Overrides, base type: entity IfcSurfaceStyleShading
	public static int usedinOverrides(EIfcindexedcolourmap type, EIfcsurfacestyleshading instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a1$, domain, result);
	}
	public boolean testOverrides(EIfcindexedcolourmap type) throws SdaiException {
		return test_instance(a1);
	}
	public EIfcsurfacestyleshading getOverrides(EIfcindexedcolourmap type) throws SdaiException {
		return (EIfcsurfacestyleshading)get_instance(a1);
	}
	public void setOverrides(EIfcindexedcolourmap type, EIfcsurfacestyleshading value) throws SdaiException {
		a1 = set_instance(a1, value);
	}
	public void unsetOverrides(EIfcindexedcolourmap type) throws SdaiException {
		a1 = unset_instance(a1);
	}
	public static jsdai.dictionary.EAttribute attributeOverrides(EIfcindexedcolourmap type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #4483=EXPLICIT_ATTRIBUTE('Colours',#4479,2,#3655,$,.F.);
	//<01> generating methods for consolidated attribute:  Colours
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : Colours, base type: entity IfcColourRgbList
	public static int usedinColours(EIfcindexedcolourmap type, EIfccolourrgblist instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a2$, domain, result);
	}
	public boolean testColours(EIfcindexedcolourmap type) throws SdaiException {
		return test_instance(a2);
	}
	public EIfccolourrgblist getColours(EIfcindexedcolourmap type) throws SdaiException {
		return (EIfccolourrgblist)get_instance(a2);
	}
	public void setColours(EIfcindexedcolourmap type, EIfccolourrgblist value) throws SdaiException {
		a2 = set_instance(a2, value);
	}
	public void unsetColours(EIfcindexedcolourmap type) throws SdaiException {
		a2 = unset_instance(a2);
	}
	public static jsdai.dictionary.EAttribute attributeColours(EIfcindexedcolourmap type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #4484=EXPLICIT_ATTRIBUTE('ColourIndex',#4479,3,#6942,$,.F.);
	//<01> generating methods for consolidated attribute:  ColourIndex
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: ColourIndex, base type: LIST OF INTEGER
	public boolean testColourindex(EIfcindexedcolourmap type) throws SdaiException {
		return test_aggregate(a3);
	}
	public A_integer getColourindex(EIfcindexedcolourmap type) throws SdaiException {
		return (A_integer)get_aggregate(a3);
	}
	public A_integer createColourindex(EIfcindexedcolourmap type) throws SdaiException {
		a3 = create_aggregate_integer(a3, a3$, 0);
		return a3;
	}
	public void unsetColourindex(EIfcindexedcolourmap type) throws SdaiException {
		unset_aggregate(a3);
		a3 = null;
	}
	public static jsdai.dictionary.EAttribute attributeColourindex(EIfcindexedcolourmap type) throws SdaiException {
		return a3$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			a1 = unset_instance(a1);
			a2 = unset_instance(a2);
			return;
		}
		a0 = av.entityValues[0].getInstance(0, this, a0$);
		a1 = av.entityValues[0].getInstance(1, this, a1$);
		a2 = av.entityValues[0].getInstance(2, this, a2$);
		a3 = av.entityValues[0].getIntegerAggregate(3, a3$, this);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			a1 = unset_instance(a1);
			a2 = unset_instance(a2);
			return;
		}
		a0 = av.entityValues[0].getInstance(0, this, a0$);
		a1 = av.entityValues[0].getInstance(1, this, a1$);
		a2 = av.entityValues[0].getInstance(2, this, a2$);
		a3 = av.entityValues[0].getIntegerAggregate(3, a3$, this);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcIndexedColourMap
		av.entityValues[0].setInstance(0, a0);
		av.entityValues[0].setInstance(1, a1);
		av.entityValues[0].setInstance(2, a2);
		av.entityValues[0].setIntegerAggregate(3, a3);
		// partial entity: IfcPresentationItem
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcIndexedColourMap
		av.entityValues[0].setInstance(0, a0);
		av.entityValues[0].setInstance(1, a1);
		av.entityValues[0].setInstance(2, a2);
		av.entityValues[0].setIntegerAggregate(3, a3);
		// partial entity: IfcPresentationItem
	}
}
