/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcProjectedCRS

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcprojectedcrs extends CIfccoordinatereferencesystem implements EIfcprojectedcrs {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcprojectedcrs.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// Name: protected String a0;   Name - java inheritance - STRING
	// Description: protected String a1;   Description - java inheritance - STRING
	// GeodeticDatum: protected String a2;   GeodeticDatum - java inheritance - STRING
	// VerticalDatum: protected String a3;   VerticalDatum - java inheritance - STRING
	protected String a4; // MapProjection - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected String a5; // MapZone - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected Object a6; // MapUnit - current entity - ENTITY IfcNamedUnit
	protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// Name - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected String a0;
	// Description - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected String a1;
	// GeodeticDatum - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	// protected String a2;
	// VerticalDatum - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	// protected String a3;
	// MapProjection - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected String a4;
	// MapZone - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected String a5;
	// MapUnit - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	protected Object a6;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a6 == old) {
			a6 = newer;
		}
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a6 == old) {
			a6 = newer;
		}
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #3832=EXPLICIT_ATTRIBUTE('Name',#3830,0,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3833=EXPLICIT_ATTRIBUTE('Description',#3830,1,#2657,$,.T.);
	//<01> generating methods for consolidated attribute:  Description
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3834=EXPLICIT_ATTRIBUTE('GeodeticDatum',#3830,2,#2523,$,.F.);
	//<01> generating methods for consolidated attribute:  GeodeticDatum
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3835=EXPLICIT_ATTRIBUTE('VerticalDatum',#3830,3,#2523,$,.T.);
	//<01> generating methods for consolidated attribute:  VerticalDatum
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5088=EXPLICIT_ATTRIBUTE('MapProjection',#5086,0,#2523,$,.T.);
	//<01> generating methods for consolidated attribute:  MapProjection
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: MapProjection, base type: STRING
	public boolean testMapprojection(EIfcprojectedcrs type) throws SdaiException {
		return test_string(a4);
	}
	public String getMapprojection(EIfcprojectedcrs type) throws SdaiException {
		return get_string(a4);
	}
	public void setMapprojection(EIfcprojectedcrs type, String value) throws SdaiException {
		a4 = set_string(value);
	}
	public void unsetMapprojection(EIfcprojectedcrs type) throws SdaiException {
		a4 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeMapprojection(EIfcprojectedcrs type) throws SdaiException {
		return a4$;
	}

	//going through all the attributes: #5089=EXPLICIT_ATTRIBUTE('MapZone',#5086,1,#2523,$,.T.);
	//<01> generating methods for consolidated attribute:  MapZone
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: MapZone, base type: STRING
	public boolean testMapzone(EIfcprojectedcrs type) throws SdaiException {
		return test_string(a5);
	}
	public String getMapzone(EIfcprojectedcrs type) throws SdaiException {
		return get_string(a5);
	}
	public void setMapzone(EIfcprojectedcrs type, String value) throws SdaiException {
		a5 = set_string(value);
	}
	public void unsetMapzone(EIfcprojectedcrs type) throws SdaiException {
		a5 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeMapzone(EIfcprojectedcrs type) throws SdaiException {
		return a5$;
	}

	//going through all the attributes: #5090=EXPLICIT_ATTRIBUTE('MapUnit',#5086,2,#4778,$,.T.);
	//<01> generating methods for consolidated attribute:  MapUnit
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : MapUnit, base type: entity IfcNamedUnit
	public static int usedinMapunit(EIfcprojectedcrs type, EIfcnamedunit instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a6$, domain, result);
	}
	public boolean testMapunit(EIfcprojectedcrs type) throws SdaiException {
		return test_instance(a6);
	}
	public EIfcnamedunit getMapunit(EIfcprojectedcrs type) throws SdaiException {
		return (EIfcnamedunit)get_instance(a6);
	}
	public void setMapunit(EIfcprojectedcrs type, EIfcnamedunit value) throws SdaiException {
		a6 = set_instance(a6, value);
	}
	public void unsetMapunit(EIfcprojectedcrs type) throws SdaiException {
		a6 = unset_instance(a6);
	}
	public static jsdai.dictionary.EAttribute attributeMapunit(EIfcprojectedcrs type) throws SdaiException {
		return a6$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = null;
			a2 = null;
			a3 = null;
			a4 = null;
			a5 = null;
			a6 = unset_instance(a6);
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = av.entityValues[0].getString(1);
		a2 = av.entityValues[0].getString(2);
		a3 = av.entityValues[0].getString(3);
		a4 = av.entityValues[1].getString(0);
		a5 = av.entityValues[1].getString(1);
		a6 = av.entityValues[1].getInstance(2, this, a6$);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = null;
			a2 = null;
			a3 = null;
			a4 = null;
			a5 = null;
			a6 = unset_instance(a6);
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = av.entityValues[0].getString(1);
		a2 = av.entityValues[0].getString(2);
		a3 = av.entityValues[0].getString(3);
		a4 = av.entityValues[1].getString(0);
		a5 = av.entityValues[1].getString(1);
		a6 = av.entityValues[1].getInstance(2, this, a6$);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcCoordinateReferenceSystem
		av.entityValues[0].setString(0, a0);
		av.entityValues[0].setString(1, a1);
		av.entityValues[0].setString(2, a2);
		av.entityValues[0].setString(3, a3);
		// partial entity: IfcProjectedCRS
		av.entityValues[1].setString(0, a4);
		av.entityValues[1].setString(1, a5);
		av.entityValues[1].setInstance(2, a6);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcCoordinateReferenceSystem
		av.entityValues[0].setString(0, a0);
		av.entityValues[0].setString(1, a1);
		av.entityValues[0].setString(2, a2);
		av.entityValues[0].setString(3, a3);
		// partial entity: IfcProjectedCRS
		av.entityValues[1].setString(0, a4);
		av.entityValues[1].setString(1, a5);
		av.entityValues[1].setInstance(2, a6);
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfcprojectedcrsWr11(SdaiContext _context) throws SdaiException {
	





		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).OR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).NOT(Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.CIfcnamedunit.definition).set(_context, get(a6$)))), Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(jsdai.SIfc4.CIfcnamedunit.definition).set(_context, get(a6$)).getAttribute(jsdai.SIfc4.CIfcnamedunit.attributeUnittype(null), _context), Value.alloc(jsdai.SIfc4.SIfc4._st_IfcUnitEnum).setEnum(_context, "LENGTHUNIT")))).getLogical());
	}
}