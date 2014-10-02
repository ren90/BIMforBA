/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcSIUnit

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcsiunit extends CIfcnamedunit implements EIfcsiunit {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcsiunit.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// Dimensions: protected Object a0 -  explicit redeclared as derived - java inheritance -  ENTITY IfcDimensionalExponents
	protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
	// UnitType: protected int a1;   UnitType - java inheritance - ENUMERATION IfcUnitEnum
	protected int a2; // Prefix - current entity - ENUMERATION IfcSIPrefix
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected int a3; // Name - current entity - ENUMERATION IfcSIUnitName
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	// Dimensions: protected Object  - derived redeclaring - current -  ENTITY IfcDimensionalExponents
*/

	/*----------------------------- Attributes (new version) -----------*/

	// Dimensions - explicit redeclared as derived - current entity
	protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected Object a0;
	// UnitType - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected int a1;
	// Prefix - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected int a2;
	// Name - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected int a3;

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

	//going through all the attributes: #4780=EXPLICIT_ATTRIBUTE('Dimensions',#4778,0,#3939,$,.F.);
	//<01> generating methods for consolidated attribute:  Dimensions
	//<01-0> current entity
	//<01-0-1> derived attribute
	//<01-0-1-1> explicit-to-derived
	//<01-0-1-1-2> NOT RENAMED: Dimensions - Dimensions - generateExplicit2DerivedCurrentEntityMethodsX(true)
	// generateExplicit2DerivedNonJavaMethodsX: 1
		//#X# 01 - is_original: true
	 //<><> redeclared_owning_entity_name: EIfcnamedunit
	 //<><> owning_entity_name_x: EIfcnamedunit
	// -15C- explicit redeclared as derived attribute: Dimensions, base type: entity IfcDimensionalExponents
	// current_name1: Dimensions
	// current_name2: Dimensions
	public static int usedinDimensions(EIfcnamedunit type, EIfcdimensionalexponents instance, ASdaiModel domain, AEntity result) throws SdaiException {
			// FN_NAVL - 24 - USEDIN
			throw new SdaiException(SdaiException.FN_NAVL);
	}
	public boolean testDimensions(EIfcnamedunit type) throws SdaiException {
			throw new SdaiException(SdaiException.FN_NAVL);
	}
	public Value getDimensions(EIfcnamedunit type, SdaiContext _context) throws SdaiException {
//HOHO invoking expression generation, attr: #5629=DERIVED_ATTRIBUTE('Dimensions',#5625,0,#3939,#4780);, sd: #2446=SCHEMA_DEFINITION('IFC4',$);, _ed: #5625=ENTITY_DEFINITION('IfcSIUnit',$,(#4778),.F.,.T.,.T.,.F.,.F.);, model: SdaiModel: IFC4_DICTIONARY_DATA




//###-01 jc.generated_java: (new jsdai.SIfc4.FIfcdimensionsforsiunit()).run(_context, Value.alloc(jsdai.SIfc4.CIfcsiunit.definition).set(_context, this).getAttribute(a3$, _context))
				return ((new jsdai.SIfc4.FIfcdimensionsforsiunit()).run(_context, Value.alloc(jsdai.SIfc4.CIfcsiunit.definition).set(_context, this).getAttribute(a3$, _context)));
	}
	public EIfcdimensionalexponents getDimensions(EIfcnamedunit type) throws SdaiException {
		SdaiContext _context = this.findEntityInstanceSdaiModel().getRepository().getSession().getSdaiContext();
			return (EIfcdimensionalexponents) getDimensions(null, _context).getInstance();
	}
	public void setDimensions(EIfcnamedunit type, EIfcdimensionalexponents value) throws SdaiException {
			throw new SdaiException(SdaiException.AT_NVLD);
	}
	public void unsetDimensions(EIfcnamedunit type) throws SdaiException {
			throw new SdaiException(SdaiException.AT_NVLD);
	}
	public static jsdai.dictionary.EAttribute attributeDimensions(EIfcnamedunit type) throws SdaiException {
		return d0$;
	}

	//going through all the attributes: #4781=EXPLICIT_ATTRIBUTE('UnitType',#4778,1,#3077,$,.F.);
	//<01> generating methods for consolidated attribute:  UnitType
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5627=EXPLICIT_ATTRIBUTE('Prefix',#5625,0,#3001,$,.T.);
	//<01> generating methods for consolidated attribute:  Prefix
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute:Prefix, base type: ENUMERATION
	public boolean testPrefix(EIfcsiunit type) throws SdaiException {
		return test_enumeration(a2);
	}
	public int getPrefix(EIfcsiunit type) throws SdaiException {
		return get_enumeration(a2);
	}
	public void setPrefix(EIfcsiunit type, int value) throws SdaiException {
		a2 = set_enumeration(value, a2$);
	}
	public void unsetPrefix(EIfcsiunit type) throws SdaiException {
		a2 = unset_enumeration();
	}
	public static jsdai.dictionary.EAttribute attributePrefix(EIfcsiunit type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #5628=EXPLICIT_ATTRIBUTE('Name',#5625,1,#3003,$,.F.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute:Name, base type: ENUMERATION
	public boolean testName(EIfcsiunit type) throws SdaiException {
		return test_enumeration(a3);
	}
	public int getName(EIfcsiunit type) throws SdaiException {
		return get_enumeration(a3);
	}
	public void setName(EIfcsiunit type, int value) throws SdaiException {
		a3 = set_enumeration(value, a3$);
	}
	public void unsetName(EIfcsiunit type) throws SdaiException {
		a3 = unset_enumeration();
	}
	public static jsdai.dictionary.EAttribute attributeName(EIfcsiunit type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #5629=DERIVED_ATTRIBUTE('Dimensions',#5625,0,#3939,#4780);
	//<02> NOT generating methods for NOT consolidated attribute:  Dimensions

	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a1 = 0;
			a2 = 0;
			a3 = 0;
			return;
		}
		a1 = av.entityValues[0].getEnumeration(1, a1$);
		a2 = av.entityValues[1].getEnumeration(0, a2$);
		a3 = av.entityValues[1].getEnumeration(1, a3$);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a1 = 0;
			a2 = 0;
			a3 = 0;
			return;
		}
		av.entityValues[0].values[0].checkRedefine(this, a0$);
		a1 = av.entityValues[0].getEnumeration(1, a1$);
		a2 = av.entityValues[1].getEnumeration(0, a2$);
		a3 = av.entityValues[1].getEnumeration(1, a3$);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcNamedUnit
		av.entityValues[0].values[0].tag = EntityValue.REDEFINE;
		av.entityValues[0].setEnumeration(1, a1, a1$);
		// partial entity: IfcSIUnit
		av.entityValues[1].setEnumeration(0, a2, a2$);
		av.entityValues[1].setEnumeration(1, a3, a3$);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcNamedUnit
		av.entityValues[0].values[0].tag = EntityValue.REDEFINE;
		av.entityValues[0].setEnumeration(1, a1, a1$);
		// partial entity: IfcSIUnit
		av.entityValues[1].setEnumeration(0, a2, a2$);
		av.entityValues[1].setEnumeration(1, a3, a3$);
	}
}