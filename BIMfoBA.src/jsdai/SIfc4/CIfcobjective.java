/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcObjective

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcobjective extends CIfcconstraint implements EIfcobjective {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcobjective.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// Name: protected String a0;   Name - java inheritance - STRING
	// Description: protected String a1;   Description - java inheritance - STRING
	// ConstraintGrade: protected int a2;   ConstraintGrade - java inheritance - ENUMERATION IfcConstraintEnum
	// ConstraintSource: protected String a3;   ConstraintSource - java inheritance - STRING
	// CreatingActor: protected Object a4;   CreatingActor - java inheritance - SELECT IfcActorSelect
	// CreationTime: protected String a5;   CreationTime - java inheritance - STRING
	// UserDefinedGrade: protected String a6;   UserDefinedGrade - java inheritance - STRING
	// HasExternalReferences: protected Object  - inverse - java inheritance -  ENTITY IfcExternalReferenceRelationship
	// PropertiesForConstraint: protected Object  - inverse - java inheritance -  ENTITY IfcResourceConstraintRelationship
	protected AIfcconstraint a7; // BenchmarkValues - current entity - LIST OF ENTITY
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	protected int a8; // LogicalAggregator - current entity - ENUMERATION IfcLogicalOperatorEnum
	protected static final jsdai.dictionary.CExplicit_attribute a8$ = CEntity.initExplicitAttribute(definition, 8);
	protected int a9; // ObjectiveQualifier - current entity - ENUMERATION IfcObjectiveEnum
	protected static final jsdai.dictionary.CExplicit_attribute a9$ = CEntity.initExplicitAttribute(definition, 9);
	protected String a10; // UserDefinedQualifier - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a10$ = CEntity.initExplicitAttribute(definition, 10);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// Name - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected String a0;
	// Description - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected String a1;
	// ConstraintGrade - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	// protected int a2;
	// ConstraintSource - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	// protected String a3;
	// CreatingActor - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	// protected Object a4;
	// CreationTime - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	// protected String a5;
	// UserDefinedGrade - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	// protected String a6;
	// HasExternalReferences - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// PropertiesForConstraint - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// BenchmarkValues - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	protected AIfcconstraint a7;
	// LogicalAggregator - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a8$ = CEntity.initExplicitAttribute(definition, 8);
	protected int a8;
	// ObjectiveQualifier - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a9$ = CEntity.initExplicitAttribute(definition, 9);
	protected int a9;
	// UserDefinedQualifier - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a10$ = CEntity.initExplicitAttribute(definition, 10);
	protected String a10;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		changeReferencesAggregate(a7, old, newer);
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		changeReferencesAggregate(a7, old, newer);
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #3747=EXPLICIT_ATTRIBUTE('Name',#3745,0,#2539,$,.F.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3748=EXPLICIT_ATTRIBUTE('Description',#3745,1,#2657,$,.T.);
	//<01> generating methods for consolidated attribute:  Description
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3749=EXPLICIT_ATTRIBUTE('ConstraintGrade',#3745,2,#2775,$,.F.);
	//<01> generating methods for consolidated attribute:  ConstraintGrade
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3750=EXPLICIT_ATTRIBUTE('ConstraintSource',#3745,3,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  ConstraintSource
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3751=EXPLICIT_ATTRIBUTE('CreatingActor',#3745,4,#3111,$,.T.);
	//<01> generating methods for consolidated attribute:  CreatingActor
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// -1- methods for SELECT attribute: CreatingActor
	public static int usedinCreatingactor(EIfcconstraint type, EEntity instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a4$, domain, result);
	}
	//going through all the attributes: #3752=EXPLICIT_ATTRIBUTE('CreationTime',#3745,5,#2477,$,.T.);
	//<01> generating methods for consolidated attribute:  CreationTime
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3753=EXPLICIT_ATTRIBUTE('UserDefinedGrade',#3745,6,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  UserDefinedGrade
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3754=INVERSE_ATTRIBUTE('HasExternalReferences',#3745,0,#4231,$,#4234,#7975,$,.F.);
	//<01> generating methods for consolidated attribute:  HasExternalReferences
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3755=INVERSE_ATTRIBUTE('PropertiesForConstraint',#3745,1,#5569,$,#5571,#7977,$,.F.);
	//<01> generating methods for consolidated attribute:  PropertiesForConstraint
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4804=EXPLICIT_ATTRIBUTE('BenchmarkValues',#4802,0,#6984,$,.T.);
	//<01> generating methods for consolidated attribute:  BenchmarkValues
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: BenchmarkValues, base type: LIST OF ENTITY
	public static int usedinBenchmarkvalues(EIfcobjective type, EIfcconstraint instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a7$, domain, result);
	}
	public boolean testBenchmarkvalues(EIfcobjective type) throws SdaiException {
		return test_aggregate(a7);
	}
	public AIfcconstraint getBenchmarkvalues(EIfcobjective type) throws SdaiException {
		return (AIfcconstraint)get_aggregate(a7);
	}
	public AIfcconstraint createBenchmarkvalues(EIfcobjective type) throws SdaiException {
		a7 = (AIfcconstraint)create_aggregate_class(a7, a7$,  AIfcconstraint.class, 0);
		return a7;
	}
	public void unsetBenchmarkvalues(EIfcobjective type) throws SdaiException {
		unset_aggregate(a7);
		a7 = null;
	}
	public static jsdai.dictionary.EAttribute attributeBenchmarkvalues(EIfcobjective type) throws SdaiException {
		return a7$;
	}

	//going through all the attributes: #4805=EXPLICIT_ATTRIBUTE('LogicalAggregator',#4802,1,#2921,$,.T.);
	//<01> generating methods for consolidated attribute:  LogicalAggregator
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute:LogicalAggregator, base type: ENUMERATION
	public boolean testLogicalaggregator(EIfcobjective type) throws SdaiException {
		return test_enumeration(a8);
	}
	public int getLogicalaggregator(EIfcobjective type) throws SdaiException {
		return get_enumeration(a8);
	}
	public void setLogicalaggregator(EIfcobjective type, int value) throws SdaiException {
		a8 = set_enumeration(value, a8$);
	}
	public void unsetLogicalaggregator(EIfcobjective type) throws SdaiException {
		a8 = unset_enumeration();
	}
	public static jsdai.dictionary.EAttribute attributeLogicalaggregator(EIfcobjective type) throws SdaiException {
		return a8$;
	}

	//going through all the attributes: #4806=EXPLICIT_ATTRIBUTE('ObjectiveQualifier',#4802,2,#2935,$,.F.);
	//<01> generating methods for consolidated attribute:  ObjectiveQualifier
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute:ObjectiveQualifier, base type: ENUMERATION
	public boolean testObjectivequalifier(EIfcobjective type) throws SdaiException {
		return test_enumeration(a9);
	}
	public int getObjectivequalifier(EIfcobjective type) throws SdaiException {
		return get_enumeration(a9);
	}
	public void setObjectivequalifier(EIfcobjective type, int value) throws SdaiException {
		a9 = set_enumeration(value, a9$);
	}
	public void unsetObjectivequalifier(EIfcobjective type) throws SdaiException {
		a9 = unset_enumeration();
	}
	public static jsdai.dictionary.EAttribute attributeObjectivequalifier(EIfcobjective type) throws SdaiException {
		return a9$;
	}

	//going through all the attributes: #4807=EXPLICIT_ATTRIBUTE('UserDefinedQualifier',#4802,3,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  UserDefinedQualifier
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: UserDefinedQualifier, base type: STRING
	public boolean testUserdefinedqualifier(EIfcobjective type) throws SdaiException {
		return test_string(a10);
	}
	public String getUserdefinedqualifier(EIfcobjective type) throws SdaiException {
		return get_string(a10);
	}
	public void setUserdefinedqualifier(EIfcobjective type, String value) throws SdaiException {
		a10 = set_string(value);
	}
	public void unsetUserdefinedqualifier(EIfcobjective type) throws SdaiException {
		a10 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeUserdefinedqualifier(EIfcobjective type) throws SdaiException {
		return a10$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = null;
			a2 = 0;
			a3 = null;
			a4 = unset_instance(a4);
			a5 = null;
			a6 = null;
			if (a7 instanceof CAggregate)
				a7.unsetAll();
			a7 = null;
			a8 = 0;
			a9 = 0;
			a10 = null;
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = av.entityValues[0].getString(1);
		a2 = av.entityValues[0].getEnumeration(2, a2$);
		a3 = av.entityValues[0].getString(3);
		a4 = av.entityValues[0].getInstance(4, this, a4$);
		a5 = av.entityValues[0].getString(5);
		a6 = av.entityValues[0].getString(6);
		a7 = (AIfcconstraint)av.entityValues[1].getInstanceAggregate(0, a7$, this);
		a8 = av.entityValues[1].getEnumeration(1, a8$);
		a9 = av.entityValues[1].getEnumeration(2, a9$);
		a10 = av.entityValues[1].getString(3);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = null;
			a2 = 0;
			a3 = null;
			a4 = unset_instance(a4);
			a5 = null;
			a6 = null;
			if (a7 instanceof CAggregate)
				a7.unsetAll();
			a7 = null;
			a8 = 0;
			a9 = 0;
			a10 = null;
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = av.entityValues[0].getString(1);
		a2 = av.entityValues[0].getEnumeration(2, a2$);
		a3 = av.entityValues[0].getString(3);
		a4 = av.entityValues[0].getInstance(4, this, a4$);
		a5 = av.entityValues[0].getString(5);
		a6 = av.entityValues[0].getString(6);
		a7 = (AIfcconstraint)av.entityValues[1].getInstanceAggregate(0, a7$, this);
		a8 = av.entityValues[1].getEnumeration(1, a8$);
		a9 = av.entityValues[1].getEnumeration(2, a9$);
		a10 = av.entityValues[1].getString(3);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcConstraint
		av.entityValues[0].setString(0, a0);
		av.entityValues[0].setString(1, a1);
		av.entityValues[0].setEnumeration(2, a2, a2$);
		av.entityValues[0].setString(3, a3);
		av.entityValues[0].setInstance(4, a4);
		av.entityValues[0].setString(5, a5);
		av.entityValues[0].setString(6, a6);
		// partial entity: IfcObjective
		av.entityValues[1].setInstanceAggregate(0, a7);
		av.entityValues[1].setEnumeration(1, a8, a8$);
		av.entityValues[1].setEnumeration(2, a9, a9$);
		av.entityValues[1].setString(3, a10);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcConstraint
		av.entityValues[0].setString(0, a0);
		av.entityValues[0].setString(1, a1);
		av.entityValues[0].setEnumeration(2, a2, a2$);
		av.entityValues[0].setString(3, a3);
		av.entityValues[0].setInstance(4, a4);
		av.entityValues[0].setString(5, a5);
		av.entityValues[0].setString(6, a6);
		// partial entity: IfcObjective
		av.entityValues[1].setInstanceAggregate(0, a7);
		av.entityValues[1].setEnumeration(1, a8, a8$);
		av.entityValues[1].setEnumeration(2, a9, a9$);
		av.entityValues[1].setString(3, a10);
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfcobjectiveWr21(SdaiContext _context) throws SdaiException {
	





		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).OR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).nequal(_context, Value.alloc(jsdai.SIfc4.SIfc4._st_IfcObjectiveEnum).set(_context, get(a9$)), Value.alloc(jsdai.SIfc4.SIfc4._st_IfcObjectiveEnum).setEnum(_context, "USERDEFINED")), Value.alloc(ExpressTypes.LOGICAL_TYPE).AND(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(jsdai.SIfc4.SIfc4._st_IfcObjectiveEnum).set(_context, get(a9$)), Value.alloc(jsdai.SIfc4.SIfc4._st_IfcObjectiveEnum).setEnum(_context, "USERDEFINED")), Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.CIfcobjective.definition).set(_context, this).groupReference(_context, jsdai.SIfc4.CIfcobjective.class).getAttribute(a10$, _context))))).getLogical());
	}
}
