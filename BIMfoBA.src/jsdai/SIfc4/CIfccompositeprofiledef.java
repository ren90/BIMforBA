/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcCompositeProfileDef

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfccompositeprofiledef extends CIfcprofiledef implements EIfccompositeprofiledef {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfccompositeprofiledef.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// ProfileType: protected int a0;   ProfileType - java inheritance - ENUMERATION IfcProfileTypeEnum
	// ProfileName: protected String a1;   ProfileName - java inheritance - STRING
	// HasExternalReference: protected Object  - inverse - java inheritance -  ENTITY IfcExternalReferenceRelationship
	// HasProperties: protected Object  - inverse - java inheritance -  ENTITY IfcProfileProperties
	protected AIfcprofiledef a2; // Profiles - current entity - SET OF ENTITY
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected String a3; // Label - current entity - STRING
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
	// Profiles - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected AIfcprofiledef a2;
	// Label - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected String a3;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		changeReferencesAggregate(a2, old, newer);
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		changeReferencesAggregate(a2, old, newer);
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
	//going through all the attributes: #3702=EXPLICIT_ATTRIBUTE('Profiles',#3700,0,#6868,$,.F.);
	//<01> generating methods for consolidated attribute:  Profiles
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: Profiles, base type: SET OF ENTITY
	public static int usedinProfiles(EIfccompositeprofiledef type, EIfcprofiledef instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a2$, domain, result);
	}
	public boolean testProfiles(EIfccompositeprofiledef type) throws SdaiException {
		return test_aggregate(a2);
	}
	public AIfcprofiledef getProfiles(EIfccompositeprofiledef type) throws SdaiException {
		return (AIfcprofiledef)get_aggregate(a2);
	}
	public AIfcprofiledef createProfiles(EIfccompositeprofiledef type) throws SdaiException {
		a2 = (AIfcprofiledef)create_aggregate_class(a2, a2$,  AIfcprofiledef.class, 0);
		return a2;
	}
	public void unsetProfiles(EIfccompositeprofiledef type) throws SdaiException {
		unset_aggregate(a2);
		a2 = null;
	}
	public static jsdai.dictionary.EAttribute attributeProfiles(EIfccompositeprofiledef type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #3703=EXPLICIT_ATTRIBUTE('Label',#3700,1,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Label
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Label, base type: STRING
	public boolean testLabel(EIfccompositeprofiledef type) throws SdaiException {
		return test_string(a3);
	}
	public String getLabel(EIfccompositeprofiledef type) throws SdaiException {
		return get_string(a3);
	}
	public void setLabel(EIfccompositeprofiledef type, String value) throws SdaiException {
		a3 = set_string(value);
	}
	public void unsetLabel(EIfccompositeprofiledef type) throws SdaiException {
		a3 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeLabel(EIfccompositeprofiledef type) throws SdaiException {
		return a3$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			if (a2 instanceof CAggregate)
				a2.unsetAll();
			a2 = null;
			a3 = null;
			a0 = 0;
			a1 = null;
			return;
		}
		a2 = (AIfcprofiledef)av.entityValues[0].getInstanceAggregate(0, a2$, this);
		a3 = av.entityValues[0].getString(1);
		a0 = av.entityValues[1].getEnumeration(0, a0$);
		a1 = av.entityValues[1].getString(1);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			if (a2 instanceof CAggregate)
				a2.unsetAll();
			a2 = null;
			a3 = null;
			a0 = 0;
			a1 = null;
			return;
		}
		a2 = (AIfcprofiledef)av.entityValues[0].getInstanceAggregate(0, a2$, this);
		a3 = av.entityValues[0].getString(1);
		a0 = av.entityValues[1].getEnumeration(0, a0$);
		a1 = av.entityValues[1].getString(1);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcCompositeProfileDef
		av.entityValues[0].setInstanceAggregate(0, a2);
		av.entityValues[0].setString(1, a3);
		// partial entity: IfcProfileDef
		av.entityValues[1].setEnumeration(0, a0, a0$);
		av.entityValues[1].setString(1, a1);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcCompositeProfileDef
		av.entityValues[0].setInstanceAggregate(0, a2);
		av.entityValues[0].setString(1, a3);
		// partial entity: IfcProfileDef
		av.entityValues[1].setEnumeration(0, a0, a0$);
		av.entityValues[1].setString(1, a1);
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfccompositeprofiledefNorecursion(SdaiContext _context) throws SdaiException {
	



									
									Value _internal_aggregate_source88 = Value.alloc(ExpressTypes.SET_GENERIC_TYPE).set(_context, get(a2$));
									Value _result86 = Value.alloc(_internal_aggregate_source88).create();
									if (_internal_aggregate_source88.getActualJavaType() != Value.INDETERMINATE) {
										for (int _i87 = 1; _i87 <= _internal_aggregate_source88.getMemberCount(); _i87++) {
											Value _implicit_22_temp = _internal_aggregate_source88.getByIndex(_i87);
											if (Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCCOMPOSITEPROFILEDEF", "IFC4"), _implicit_22_temp.typeOfV(_context)).getLogical() == 2) {
												_result86.addMember(_context, _implicit_22_temp);
											} else
											if (_internal_aggregate_source88.getDeclaredType() instanceof jsdai.dictionary.EArray_type) {
												_implicit_22_temp.unset();
												_result86.addMember(_context, _implicit_22_temp);
											}
										}
									} else {
										_result86.unset();
									}
		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOfExt0(_context, _result86), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 0))).getLogical());
	}
	public int rIfccompositeprofiledefInvariantprofiletype(SdaiContext _context) throws SdaiException {
	






									
									Value _internal_aggregate_source92 = Value.alloc(ExpressTypes.SET_GENERIC_TYPE).set(_context, get(a2$));
									Value _result90 = Value.alloc(_internal_aggregate_source92).create();
									if (_internal_aggregate_source92.getActualJavaType() != Value.INDETERMINATE) {
										for (int _i91 = 1; _i91 <= _internal_aggregate_source92.getMemberCount(); _i91++) {
											Value _implicit_21_temp = _internal_aggregate_source92.getByIndex(_i91);
											if (Value.alloc(ExpressTypes.LOGICAL_TYPE).nequal(_context, _implicit_21_temp.getAttribute("profiletype", _context), Value.alloc(ExpressTypes.SET_GENERIC_TYPE).set(_context, get(a2$)).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null).getAttribute("profiletype", _context)).getLogical() == 2) {
												_result90.addMember(_context, _implicit_21_temp);
											} else
											if (_internal_aggregate_source92.getDeclaredType() instanceof jsdai.dictionary.EArray_type) {
												_implicit_21_temp.unset();
												_result90.addMember(_context, _implicit_21_temp);
											}
										}
									} else {
										_result90.unset();
									}
		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOfExt0(_context, _result90), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 0))).getLogical());
	}
}
