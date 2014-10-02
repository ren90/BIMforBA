/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcArbitraryProfileDefWithVoids

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcarbitraryprofiledefwithvoids extends CIfcarbitraryclosedprofiledef implements EIfcarbitraryprofiledefwithvoids {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcarbitraryprofiledefwithvoids.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// ProfileType: protected int a0;   ProfileType - java inheritance - ENUMERATION IfcProfileTypeEnum
	// ProfileName: protected String a1;   ProfileName - java inheritance - STRING
	// HasExternalReference: protected Object  - inverse - java inheritance -  ENTITY IfcExternalReferenceRelationship
	// HasProperties: protected Object  - inverse - java inheritance -  ENTITY IfcProfileProperties
	// OuterCurve: protected Object a2;   OuterCurve - java inheritance - ENTITY IfcCurve
	protected AIfccurve a3; // InnerCurves - current entity - SET OF ENTITY
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
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
	// OuterCurve - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	// protected Object a2;
	// InnerCurves - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected AIfccurve a3;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		changeReferencesAggregate(a3, old, newer);
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		changeReferencesAggregate(a3, old, newer);
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
	//going through all the attributes: #3336=EXPLICIT_ATTRIBUTE('OuterCurve',#3334,0,#3883,$,.F.);
	//<01> generating methods for consolidated attribute:  OuterCurve
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): OuterCurve, base type: entity IfcCurve
	public static int usedinOutercurve(EIfcarbitraryclosedprofiledef type, EIfccurve instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a2$, domain, result);
	}
	//going through all the attributes: #3342=EXPLICIT_ATTRIBUTE('InnerCurves',#3340,0,#6824,$,.F.);
	//<01> generating methods for consolidated attribute:  InnerCurves
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: InnerCurves, base type: SET OF ENTITY
	public static int usedinInnercurves(EIfcarbitraryprofiledefwithvoids type, EIfccurve instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a3$, domain, result);
	}
	public boolean testInnercurves(EIfcarbitraryprofiledefwithvoids type) throws SdaiException {
		return test_aggregate(a3);
	}
	public AIfccurve getInnercurves(EIfcarbitraryprofiledefwithvoids type) throws SdaiException {
		return (AIfccurve)get_aggregate(a3);
	}
	public AIfccurve createInnercurves(EIfcarbitraryprofiledefwithvoids type) throws SdaiException {
		a3 = (AIfccurve)create_aggregate_class(a3, a3$,  AIfccurve.class, 0);
		return a3;
	}
	public void unsetInnercurves(EIfcarbitraryprofiledefwithvoids type) throws SdaiException {
		unset_aggregate(a3);
		a3 = null;
	}
	public static jsdai.dictionary.EAttribute attributeInnercurves(EIfcarbitraryprofiledefwithvoids type) throws SdaiException {
		return a3$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a2 = unset_instance(a2);
			if (a3 instanceof CAggregate)
				a3.unsetAll();
			a3 = null;
			a0 = 0;
			a1 = null;
			return;
		}
		a2 = av.entityValues[0].getInstance(0, this, a2$);
		a3 = (AIfccurve)av.entityValues[1].getInstanceAggregate(0, a3$, this);
		a0 = av.entityValues[2].getEnumeration(0, a0$);
		a1 = av.entityValues[2].getString(1);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a2 = unset_instance(a2);
			if (a3 instanceof CAggregate)
				a3.unsetAll();
			a3 = null;
			a0 = 0;
			a1 = null;
			return;
		}
		a2 = av.entityValues[0].getInstance(0, this, a2$);
		a3 = (AIfccurve)av.entityValues[1].getInstanceAggregate(0, a3$, this);
		a0 = av.entityValues[2].getEnumeration(0, a0$);
		a1 = av.entityValues[2].getString(1);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcArbitraryClosedProfileDef
		av.entityValues[0].setInstance(0, a2);
		// partial entity: IfcArbitraryProfileDefWithVoids
		av.entityValues[1].setInstanceAggregate(0, a3);
		// partial entity: IfcProfileDef
		av.entityValues[2].setEnumeration(0, a0, a0$);
		av.entityValues[2].setString(1, a1);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcArbitraryClosedProfileDef
		av.entityValues[0].setInstance(0, a2);
		// partial entity: IfcArbitraryProfileDefWithVoids
		av.entityValues[1].setInstanceAggregate(0, a3);
		// partial entity: IfcProfileDef
		av.entityValues[2].setEnumeration(0, a0, a0$);
		av.entityValues[2].setString(1, a1);
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfcarbitraryprofiledefwithvoidsWr2(SdaiContext _context) throws SdaiException {
	



									
									Value _internal_aggregate_source42 = Value.alloc(ExpressTypes.SET_GENERIC_TYPE).set(_context, get(a3$));
									Value _result40 = Value.alloc(_internal_aggregate_source42).create();
									if (_internal_aggregate_source42.getActualJavaType() != Value.INDETERMINATE) {
										for (int _i41 = 1; _i41 <= _internal_aggregate_source42.getMemberCount(); _i41++) {
											Value _implicit_10_temp = _internal_aggregate_source42.getByIndex(_i41);
											if (Value.alloc(ExpressTypes.LOGICAL_TYPE).nequal(_context, _implicit_10_temp.getAttribute("Dim", _context), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 2)).getLogical() == 2) {
												_result40.addMember(_context, _implicit_10_temp);
											} else
											if (_internal_aggregate_source42.getDeclaredType() instanceof jsdai.dictionary.EArray_type) {
												_implicit_10_temp.unset();
												_result40.addMember(_context, _implicit_10_temp);
											}
										}
									} else {
										_result40.unset();
									}
		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOfExt0(_context, _result40), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 0))).getLogical());
	}
	public int rIfcarbitraryprofiledefwithvoidsWr3(SdaiContext _context) throws SdaiException {
	



									
									Value _internal_aggregate_source46 = Value.alloc(ExpressTypes.SET_GENERIC_TYPE).set(_context, get(a3$));
									Value _result44 = Value.alloc(_internal_aggregate_source46).create();
									if (_internal_aggregate_source46.getActualJavaType() != Value.INDETERMINATE) {
										for (int _i45 = 1; _i45 <= _internal_aggregate_source46.getMemberCount(); _i45++) {
											Value _implicit_11_temp = _internal_aggregate_source46.getByIndex(_i45);
											if (Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCLINE", "IFC4"), _implicit_11_temp.typeOfV(_context)).getLogical() == 2) {
												_result44.addMember(_context, _implicit_11_temp);
											} else
											if (_internal_aggregate_source46.getDeclaredType() instanceof jsdai.dictionary.EArray_type) {
												_implicit_11_temp.unset();
												_result44.addMember(_context, _implicit_11_temp);
											}
										}
									} else {
										_result44.unset();
									}
		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOfExt0(_context, _result44), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 0))).getLogical());
	}
	public int rIfcarbitraryprofiledefwithvoidsWr1(SdaiContext _context) throws SdaiException {
	



		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(jsdai.SIfc4.CIfcarbitraryprofiledefwithvoids.definition).set(_context, this).groupReference(_context, jsdai.SIfc4.CIfcprofiledef.class).getAttribute(jsdai.SIfc4.CIfcprofiledef.attributeProfiletype(null), _context), Value.alloc(jsdai.SIfc4.SIfc4._st_IfcProfileTypeEnum).setEnum(_context, "AREA"))).getLogical());
	}
}