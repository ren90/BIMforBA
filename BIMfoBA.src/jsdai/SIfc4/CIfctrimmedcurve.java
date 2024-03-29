/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcTrimmedCurve

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfctrimmedcurve extends CIfcboundedcurve implements EIfctrimmedcurve {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfctrimmedcurve.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	// Dim: protected int  - derived - java inheritance -  INTEGER
	protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
	protected Object a0; // BasisCurve - current entity - ENTITY IfcCurve
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected AIfctrimmingselect a1; // Trim1 - current entity - SET OF SELECT
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected AIfctrimmingselect a2; // Trim2 - current entity - SET OF SELECT
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected int a3; // SenseAgreement - current entity - BOOLEAN
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected int a4; // MasterRepresentation - current entity - ENUMERATION IfcTrimmingPreference
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// Dim - derived - java inheritance
	// protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
	// BasisCurve - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected Object a0;
	// Trim1 - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected AIfctrimmingselect a1;
	// Trim2 - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected AIfctrimmingselect a2;
	// SenseAgreement - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected int a3;
	// MasterRepresentation - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected int a4;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a0 == old) {
			a0 = newer;
		}
		changeReferencesAggregate(a1, old, newer);
		changeReferencesAggregate(a2, old, newer);
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a0 == old) {
			a0 = newer;
		}
		changeReferencesAggregate(a1, old, newer);
		changeReferencesAggregate(a2, old, newer);
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
	//going through all the attributes: #3885=DERIVED_ATTRIBUTE('Dim',#3883,0,#2485,$);
	//<01> generating methods for consolidated attribute:  Dim
	//<01-1> supertype, java inheritance
	//<01-1-1> derived
	//<01-1-1-2> NOT explicit-to-derived - generateDerivedSupertypeJavaInheritedMethodsX
	// methods for derived attribute: Dim, base type: INTEGER
	public boolean testDim(EIfccurve type) throws SdaiException {
			throw new SdaiException(SdaiException.FN_NAVL);
	}
	public Value getDim(EIfccurve type, SdaiContext _context) throws SdaiException {


//###-01 jc.generated_java: (new jsdai.SIfc4.FIfccurvedim()).run(_context, Value.alloc(jsdai.SIfc4.CIfctrimmedcurve.definition).set(_context, this))
				return ((new jsdai.SIfc4.FIfccurvedim()).run(_context, Value.alloc(jsdai.SIfc4.CIfctrimmedcurve.definition).set(_context, this)));
	}
	public int getDim(EIfccurve type) throws SdaiException {
		SdaiContext _context = this.findEntityInstanceSdaiModel().getRepository().getSession().getSdaiContext();
			return getDim((EIfccurve)null, _context).getInteger();
	}
	public static jsdai.dictionary.EAttribute attributeDim(EIfccurve type) throws SdaiException {
		return d0$;
	}

	//going through all the attributes: #6259=EXPLICIT_ATTRIBUTE('BasisCurve',#6257,0,#3883,$,.F.);
	//<01> generating methods for consolidated attribute:  BasisCurve
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : BasisCurve, base type: entity IfcCurve
	public static int usedinBasiscurve(EIfctrimmedcurve type, EIfccurve instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	public boolean testBasiscurve(EIfctrimmedcurve type) throws SdaiException {
		return test_instance(a0);
	}
	public EIfccurve getBasiscurve(EIfctrimmedcurve type) throws SdaiException {
		return (EIfccurve)get_instance(a0);
	}
	public void setBasiscurve(EIfctrimmedcurve type, EIfccurve value) throws SdaiException {
		a0 = set_instance(a0, value);
	}
	public void unsetBasiscurve(EIfctrimmedcurve type) throws SdaiException {
		a0 = unset_instance(a0);
	}
	public static jsdai.dictionary.EAttribute attributeBasiscurve(EIfctrimmedcurve type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #6260=EXPLICIT_ATTRIBUTE('Trim1',#6257,1,#7192,$,.F.);
	//<01> generating methods for consolidated attribute:  Trim1
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: Trim1, base type: SET OF SELECT
	public static int usedinTrim1(EIfctrimmedcurve type, EIfccartesianpoint instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a1$, domain, result);
	}
	public boolean testTrim1(EIfctrimmedcurve type) throws SdaiException {
		return test_aggregate(a1);
	}
	public AIfctrimmingselect getTrim1(EIfctrimmedcurve type) throws SdaiException {
		if (a1 == null)
			throw new SdaiException(SdaiException.VA_NSET);
		return a1;
	}
	public AIfctrimmingselect createTrim1(EIfctrimmedcurve type) throws SdaiException {
		a1 = (AIfctrimmingselect)create_aggregate_class(a1, a1$, AIfctrimmingselect.class, 0);
		return a1;
	}
	public void unsetTrim1(EIfctrimmedcurve type) throws SdaiException {
		unset_aggregate(a1);
		a1 = null;
	}
	public static jsdai.dictionary.EAttribute attributeTrim1(EIfctrimmedcurve type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #6261=EXPLICIT_ATTRIBUTE('Trim2',#6257,2,#7193,$,.F.);
	//<01> generating methods for consolidated attribute:  Trim2
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: Trim2, base type: SET OF SELECT
	public static int usedinTrim2(EIfctrimmedcurve type, EIfccartesianpoint instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a2$, domain, result);
	}
	public boolean testTrim2(EIfctrimmedcurve type) throws SdaiException {
		return test_aggregate(a2);
	}
	public AIfctrimmingselect getTrim2(EIfctrimmedcurve type) throws SdaiException {
		if (a2 == null)
			throw new SdaiException(SdaiException.VA_NSET);
		return a2;
	}
	public AIfctrimmingselect createTrim2(EIfctrimmedcurve type) throws SdaiException {
		a2 = (AIfctrimmingselect)create_aggregate_class(a2, a2$, AIfctrimmingselect.class, 0);
		return a2;
	}
	public void unsetTrim2(EIfctrimmedcurve type) throws SdaiException {
		unset_aggregate(a2);
		a2 = null;
	}
	public static jsdai.dictionary.EAttribute attributeTrim2(EIfctrimmedcurve type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #6262=EXPLICIT_ATTRIBUTE('SenseAgreement',#6257,3,#6,$,.F.);
	//<01> generating methods for consolidated attribute:  SenseAgreement
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: SenseAgreement, base type: BOOLEAN
	public boolean testSenseagreement(EIfctrimmedcurve type) throws SdaiException {
		return test_boolean(a3);
	}
	public boolean getSenseagreement(EIfctrimmedcurve type) throws SdaiException {
		return get_boolean(a3);
	}
	public void setSenseagreement(EIfctrimmedcurve type, boolean value) throws SdaiException {
		a3 = set_boolean(value);
	}
	public void unsetSenseagreement(EIfctrimmedcurve type) throws SdaiException {
		a3 = unset_boolean();
	}
	public static jsdai.dictionary.EAttribute attributeSenseagreement(EIfctrimmedcurve type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #6263=EXPLICIT_ATTRIBUTE('MasterRepresentation',#6257,4,#3073,$,.F.);
	//<01> generating methods for consolidated attribute:  MasterRepresentation
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute:MasterRepresentation, base type: ENUMERATION
	public boolean testMasterrepresentation(EIfctrimmedcurve type) throws SdaiException {
		return test_enumeration(a4);
	}
	public int getMasterrepresentation(EIfctrimmedcurve type) throws SdaiException {
		return get_enumeration(a4);
	}
	public void setMasterrepresentation(EIfctrimmedcurve type, int value) throws SdaiException {
		a4 = set_enumeration(value, a4$);
	}
	public void unsetMasterrepresentation(EIfctrimmedcurve type) throws SdaiException {
		a4 = unset_enumeration();
	}
	public static jsdai.dictionary.EAttribute attributeMasterrepresentation(EIfctrimmedcurve type) throws SdaiException {
		return a4$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			if (a1 instanceof CAggregate)
				a1.unsetAll();
			a1 = null;
			if (a2 instanceof CAggregate)
				a2.unsetAll();
			a2 = null;
			a3 = 0;
			a4 = 0;
			return;
		}
		a0 = av.entityValues[4].getInstance(0, this, a0$);
		a1 = (AIfctrimmingselect)av.entityValues[4].getMixedAggregate(1, a1$, this);
		a2 = (AIfctrimmingselect)av.entityValues[4].getMixedAggregate(2, a2$, this);
		a3 = av.entityValues[4].getBoolean(3);
		a4 = av.entityValues[4].getEnumeration(4, a4$);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			if (a1 instanceof CAggregate)
				a1.unsetAll();
			a1 = null;
			if (a2 instanceof CAggregate)
				a2.unsetAll();
			a2 = null;
			a3 = 0;
			a4 = 0;
			return;
		}
		a0 = av.entityValues[4].getInstance(0, this, a0$);
		a1 = (AIfctrimmingselect)av.entityValues[4].getMixedAggregate(1, a1$, this);
		a2 = (AIfctrimmingselect)av.entityValues[4].getMixedAggregate(2, a2$, this);
		a3 = av.entityValues[4].getBoolean(3);
		a4 = av.entityValues[4].getEnumeration(4, a4$);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcBoundedCurve
		// partial entity: IfcCurve
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
		// partial entity: IfcTrimmedCurve
		av.entityValues[4].setInstance(0, a0);
		av.entityValues[4].setMixedAggregate(1, a1, a1$);
		av.entityValues[4].setMixedAggregate(2, a2, a2$);
		av.entityValues[4].setBoolean(3, a3);
		av.entityValues[4].setEnumeration(4, a4, a4$);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcBoundedCurve
		// partial entity: IfcCurve
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
		// partial entity: IfcTrimmedCurve
		av.entityValues[4].setInstance(0, a0);
		av.entityValues[4].setMixedAggregate(1, a1, a1$);
		av.entityValues[4].setMixedAggregate(2, a2, a2$);
		av.entityValues[4].setBoolean(3, a3);
		av.entityValues[4].setEnumeration(4, a4, a4$);
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfctrimmedcurveTrim1valuesconsistent(SdaiContext _context) throws SdaiException {
	





		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).OR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).hiIndex(Value.alloc(ExpressTypes.SET_GENERIC_TYPE).set(_context, get(a1$))), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1)), Value.alloc(ExpressTypes.LOGICAL_TYPE).nequal(_context, Value.alloc(ExpressTypes.SET_GENERIC_TYPE).set(_context, get(a1$)).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null).typeOfV(_context), Value.alloc(ExpressTypes.SET_GENERIC_TYPE).set(_context, get(a1$)).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 2), null).typeOfV(_context)))).getLogical());
	}
	public int rIfctrimmedcurveNotrimofboundedcurves(SdaiContext _context) throws SdaiException {
	



		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).NOT(Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCBOUNDEDCURVE", "IFC4"), Value.alloc(jsdai.SIfc4.CIfccurve.definition).set(_context, get(a0$)).typeOfV(_context)))).getLogical());
	}
	public int rIfctrimmedcurveTrim2valuesconsistent(SdaiContext _context) throws SdaiException {
	





		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).OR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).hiIndex(Value.alloc(ExpressTypes.SET_GENERIC_TYPE).set(_context, get(a2$))), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1)), Value.alloc(ExpressTypes.LOGICAL_TYPE).nequal(_context, Value.alloc(ExpressTypes.SET_GENERIC_TYPE).set(_context, get(a2$)).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null).typeOfV(_context), Value.alloc(ExpressTypes.SET_GENERIC_TYPE).set(_context, get(a2$)).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 2), null).typeOfV(_context)))).getLogical());
	}
}
