/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcSectionReinforcementProperties

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcsectionreinforcementproperties extends CIfcpredefinedproperties implements EIfcsectionreinforcementproperties {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcsectionreinforcementproperties.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// HasExternalReferences: protected Object  - inverse - java inheritance -  ENTITY IfcExternalReferenceRelationship
	protected double a0; // LongitudinalStartPosition - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected double a1; // LongitudinalEndPosition - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected double a2; // TransversePosition - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected int a3; // ReinforcementRole - current entity - ENUMERATION IfcReinforcingBarRoleEnum
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected Object a4; // SectionDefinition - current entity - ENTITY IfcSectionProperties
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected AIfcreinforcementbarproperties a5; // CrossSectionReinforcementDefinitions - current entity - SET OF ENTITY
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// HasExternalReferences - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// LongitudinalStartPosition - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected double a0;
	// LongitudinalEndPosition - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected double a1;
	// TransversePosition - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected double a2;
	// ReinforcementRole - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected int a3;
	// SectionDefinition - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected Object a4;
	// CrossSectionReinforcementDefinitions - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected AIfcreinforcementbarproperties a5;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a4 == old) {
			a4 = newer;
		}
		changeReferencesAggregate(a5, old, newer);
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a4 == old) {
			a4 = newer;
		}
		changeReferencesAggregate(a5, old, newer);
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #5104=INVERSE_ATTRIBUTE('HasExternalReferences',#5102,0,#4231,$,#4234,#8918,$,.F.);
	//<01> generating methods for consolidated attribute:  HasExternalReferences
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5648=EXPLICIT_ATTRIBUTE('LongitudinalStartPosition',#5646,0,#2543,$,.F.);
	//<01> generating methods for consolidated attribute:  LongitudinalStartPosition
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: LongitudinalStartPosition, base type: REAL
	public boolean testLongitudinalstartposition(EIfcsectionreinforcementproperties type) throws SdaiException {
		return test_double(a0);
	}
	public double getLongitudinalstartposition(EIfcsectionreinforcementproperties type) throws SdaiException {
		return get_double(a0);
	}
	public void setLongitudinalstartposition(EIfcsectionreinforcementproperties type, double value) throws SdaiException {
		a0 = set_double(value);
	}
	public void unsetLongitudinalstartposition(EIfcsectionreinforcementproperties type) throws SdaiException {
		a0 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeLongitudinalstartposition(EIfcsectionreinforcementproperties type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #5649=EXPLICIT_ATTRIBUTE('LongitudinalEndPosition',#5646,1,#2543,$,.F.);
	//<01> generating methods for consolidated attribute:  LongitudinalEndPosition
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: LongitudinalEndPosition, base type: REAL
	public boolean testLongitudinalendposition(EIfcsectionreinforcementproperties type) throws SdaiException {
		return test_double(a1);
	}
	public double getLongitudinalendposition(EIfcsectionreinforcementproperties type) throws SdaiException {
		return get_double(a1);
	}
	public void setLongitudinalendposition(EIfcsectionreinforcementproperties type, double value) throws SdaiException {
		a1 = set_double(value);
	}
	public void unsetLongitudinalendposition(EIfcsectionreinforcementproperties type) throws SdaiException {
		a1 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeLongitudinalendposition(EIfcsectionreinforcementproperties type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #5650=EXPLICIT_ATTRIBUTE('TransversePosition',#5646,2,#2543,$,.T.);
	//<01> generating methods for consolidated attribute:  TransversePosition
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: TransversePosition, base type: REAL
	public boolean testTransverseposition(EIfcsectionreinforcementproperties type) throws SdaiException {
		return test_double(a2);
	}
	public double getTransverseposition(EIfcsectionreinforcementproperties type) throws SdaiException {
		return get_double(a2);
	}
	public void setTransverseposition(EIfcsectionreinforcementproperties type, double value) throws SdaiException {
		a2 = set_double(value);
	}
	public void unsetTransverseposition(EIfcsectionreinforcementproperties type) throws SdaiException {
		a2 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeTransverseposition(EIfcsectionreinforcementproperties type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #5651=EXPLICIT_ATTRIBUTE('ReinforcementRole',#5646,3,#2989,$,.F.);
	//<01> generating methods for consolidated attribute:  ReinforcementRole
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute:ReinforcementRole, base type: ENUMERATION
	public boolean testReinforcementrole(EIfcsectionreinforcementproperties type) throws SdaiException {
		return test_enumeration(a3);
	}
	public int getReinforcementrole(EIfcsectionreinforcementproperties type) throws SdaiException {
		return get_enumeration(a3);
	}
	public void setReinforcementrole(EIfcsectionreinforcementproperties type, int value) throws SdaiException {
		a3 = set_enumeration(value, a3$);
	}
	public void unsetReinforcementrole(EIfcsectionreinforcementproperties type) throws SdaiException {
		a3 = unset_enumeration();
	}
	public static jsdai.dictionary.EAttribute attributeReinforcementrole(EIfcsectionreinforcementproperties type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #5652=EXPLICIT_ATTRIBUTE('SectionDefinition',#5646,4,#5641,$,.F.);
	//<01> generating methods for consolidated attribute:  SectionDefinition
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : SectionDefinition, base type: entity IfcSectionProperties
	public static int usedinSectiondefinition(EIfcsectionreinforcementproperties type, EIfcsectionproperties instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a4$, domain, result);
	}
	public boolean testSectiondefinition(EIfcsectionreinforcementproperties type) throws SdaiException {
		return test_instance(a4);
	}
	public EIfcsectionproperties getSectiondefinition(EIfcsectionreinforcementproperties type) throws SdaiException {
		return (EIfcsectionproperties)get_instance(a4);
	}
	public void setSectiondefinition(EIfcsectionreinforcementproperties type, EIfcsectionproperties value) throws SdaiException {
		a4 = set_instance(a4, value);
	}
	public void unsetSectiondefinition(EIfcsectionreinforcementproperties type) throws SdaiException {
		a4 = unset_instance(a4);
	}
	public static jsdai.dictionary.EAttribute attributeSectiondefinition(EIfcsectionreinforcementproperties type) throws SdaiException {
		return a4$;
	}

	//going through all the attributes: #5653=EXPLICIT_ATTRIBUTE('CrossSectionReinforcementDefinitions',#5646,5,#7121,$,.F.);
	//<01> generating methods for consolidated attribute:  CrossSectionReinforcementDefinitions
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: CrossSectionReinforcementDefinitions, base type: SET OF ENTITY
	public static int usedinCrosssectionreinforcementdefinitions(EIfcsectionreinforcementproperties type, EIfcreinforcementbarproperties instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a5$, domain, result);
	}
	public boolean testCrosssectionreinforcementdefinitions(EIfcsectionreinforcementproperties type) throws SdaiException {
		return test_aggregate(a5);
	}
	public AIfcreinforcementbarproperties getCrosssectionreinforcementdefinitions(EIfcsectionreinforcementproperties type) throws SdaiException {
		return (AIfcreinforcementbarproperties)get_aggregate(a5);
	}
	public AIfcreinforcementbarproperties createCrosssectionreinforcementdefinitions(EIfcsectionreinforcementproperties type) throws SdaiException {
		a5 = (AIfcreinforcementbarproperties)create_aggregate_class(a5, a5$,  AIfcreinforcementbarproperties.class, 0);
		return a5;
	}
	public void unsetCrosssectionreinforcementdefinitions(EIfcsectionreinforcementproperties type) throws SdaiException {
		unset_aggregate(a5);
		a5 = null;
	}
	public static jsdai.dictionary.EAttribute attributeCrosssectionreinforcementdefinitions(EIfcsectionreinforcementproperties type) throws SdaiException {
		return a5$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = Double.NaN;
			a1 = Double.NaN;
			a2 = Double.NaN;
			a3 = 0;
			a4 = unset_instance(a4);
			if (a5 instanceof CAggregate)
				a5.unsetAll();
			a5 = null;
			return;
		}
		a0 = av.entityValues[2].getDouble(0);
		a1 = av.entityValues[2].getDouble(1);
		a2 = av.entityValues[2].getDouble(2);
		a3 = av.entityValues[2].getEnumeration(3, a3$);
		a4 = av.entityValues[2].getInstance(4, this, a4$);
		a5 = (AIfcreinforcementbarproperties)av.entityValues[2].getInstanceAggregate(5, a5$, this);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = Double.NaN;
			a1 = Double.NaN;
			a2 = Double.NaN;
			a3 = 0;
			a4 = unset_instance(a4);
			if (a5 instanceof CAggregate)
				a5.unsetAll();
			a5 = null;
			return;
		}
		a0 = av.entityValues[2].getDouble(0);
		a1 = av.entityValues[2].getDouble(1);
		a2 = av.entityValues[2].getDouble(2);
		a3 = av.entityValues[2].getEnumeration(3, a3$);
		a4 = av.entityValues[2].getInstance(4, this, a4$);
		a5 = (AIfcreinforcementbarproperties)av.entityValues[2].getInstanceAggregate(5, a5$, this);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcPreDefinedProperties
		// partial entity: IfcPropertyAbstraction
		// partial entity: IfcSectionReinforcementProperties
		av.entityValues[2].setDouble(0, a0);
		av.entityValues[2].setDouble(1, a1);
		av.entityValues[2].setDouble(2, a2);
		av.entityValues[2].setEnumeration(3, a3, a3$);
		av.entityValues[2].setInstance(4, a4);
		av.entityValues[2].setInstanceAggregate(5, a5);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcPreDefinedProperties
		// partial entity: IfcPropertyAbstraction
		// partial entity: IfcSectionReinforcementProperties
		av.entityValues[2].setDouble(0, a0);
		av.entityValues[2].setDouble(1, a1);
		av.entityValues[2].setDouble(2, a2);
		av.entityValues[2].setEnumeration(3, a3, a3$);
		av.entityValues[2].setInstance(4, a4);
		av.entityValues[2].setInstanceAggregate(5, a5);
	}
}
