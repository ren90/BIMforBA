/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcRelSequence

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcrelsequence extends CIfcrelconnects implements EIfcrelsequence {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcrelsequence.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// GlobalId: protected String a0;   GlobalId - java inheritance - STRING
	// OwnerHistory: protected Object a1;   OwnerHistory - java inheritance - ENTITY IfcOwnerHistory
	// Name: protected String a2;   Name - java inheritance - STRING
	// Description: protected String a3;   Description - java inheritance - STRING
	protected Object a4; // RelatingProcess - current entity - ENTITY IfcProcess
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected Object a5; // RelatedProcess - current entity - ENTITY IfcProcess
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected Object a6; // TimeLag - current entity - ENTITY IfcLagTime
	protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	protected int a7; // SequenceType - current entity - ENUMERATION IfcSequenceEnum
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	protected String a8; // UserDefinedSequenceType - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a8$ = CEntity.initExplicitAttribute(definition, 8);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// GlobalId - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected String a0;
	// OwnerHistory - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected Object a1;
	// Name - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	// protected String a2;
	// Description - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	// protected String a3;
	// RelatingProcess - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected Object a4;
	// RelatedProcess - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected Object a5;
	// TimeLag - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	protected Object a6;
	// SequenceType - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	protected int a7;
	// UserDefinedSequenceType - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a8$ = CEntity.initExplicitAttribute(definition, 8);
	protected String a8;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
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

	//going through all the attributes: #5618=EXPLICIT_ATTRIBUTE('GlobalId',#5616,0,#2517,$,.F.);
	//<01> generating methods for consolidated attribute:  GlobalId
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5619=EXPLICIT_ATTRIBUTE('OwnerHistory',#5616,1,#4858,$,.T.);
	//<01> generating methods for consolidated attribute:  OwnerHistory
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): OwnerHistory, base type: entity IfcOwnerHistory
	public static int usedinOwnerhistory(EIfcroot type, EIfcownerhistory instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a1$, domain, result);
	}
	//going through all the attributes: #5620=EXPLICIT_ATTRIBUTE('Name',#5616,2,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5621=EXPLICIT_ATTRIBUTE('Description',#5616,3,#2657,$,.T.);
	//<01> generating methods for consolidated attribute:  Description
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5503=EXPLICIT_ATTRIBUTE('RelatingProcess',#5501,0,#5047,$,.F.);
	//<01> generating methods for consolidated attribute:  RelatingProcess
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : RelatingProcess, base type: entity IfcProcess
	public static int usedinRelatingprocess(EIfcrelsequence type, EIfcprocess instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a4$, domain, result);
	}
	public boolean testRelatingprocess(EIfcrelsequence type) throws SdaiException {
		return test_instance(a4);
	}
	public EIfcprocess getRelatingprocess(EIfcrelsequence type) throws SdaiException {
		return (EIfcprocess)get_instance(a4);
	}
	public void setRelatingprocess(EIfcrelsequence type, EIfcprocess value) throws SdaiException {
		a4 = set_instance(a4, value);
	}
	public void unsetRelatingprocess(EIfcrelsequence type) throws SdaiException {
		a4 = unset_instance(a4);
	}
	public static jsdai.dictionary.EAttribute attributeRelatingprocess(EIfcrelsequence type) throws SdaiException {
		return a4$;
	}

	//going through all the attributes: #5504=EXPLICIT_ATTRIBUTE('RelatedProcess',#5501,1,#5047,$,.F.);
	//<01> generating methods for consolidated attribute:  RelatedProcess
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : RelatedProcess, base type: entity IfcProcess
	public static int usedinRelatedprocess(EIfcrelsequence type, EIfcprocess instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a5$, domain, result);
	}
	public boolean testRelatedprocess(EIfcrelsequence type) throws SdaiException {
		return test_instance(a5);
	}
	public EIfcprocess getRelatedprocess(EIfcrelsequence type) throws SdaiException {
		return (EIfcprocess)get_instance(a5);
	}
	public void setRelatedprocess(EIfcrelsequence type, EIfcprocess value) throws SdaiException {
		a5 = set_instance(a5, value);
	}
	public void unsetRelatedprocess(EIfcrelsequence type) throws SdaiException {
		a5 = unset_instance(a5);
	}
	public static jsdai.dictionary.EAttribute attributeRelatedprocess(EIfcrelsequence type) throws SdaiException {
		return a5$;
	}

	//going through all the attributes: #5505=EXPLICIT_ATTRIBUTE('TimeLag',#5501,2,#4533,$,.T.);
	//<01> generating methods for consolidated attribute:  TimeLag
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : TimeLag, base type: entity IfcLagTime
	public static int usedinTimelag(EIfcrelsequence type, EIfclagtime instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a6$, domain, result);
	}
	public boolean testTimelag(EIfcrelsequence type) throws SdaiException {
		return test_instance(a6);
	}
	public EIfclagtime getTimelag(EIfcrelsequence type) throws SdaiException {
		return (EIfclagtime)get_instance(a6);
	}
	public void setTimelag(EIfcrelsequence type, EIfclagtime value) throws SdaiException {
		a6 = set_instance(a6, value);
	}
	public void unsetTimelag(EIfcrelsequence type) throws SdaiException {
		a6 = unset_instance(a6);
	}
	public static jsdai.dictionary.EAttribute attributeTimelag(EIfcrelsequence type) throws SdaiException {
		return a6$;
	}

	//going through all the attributes: #5506=EXPLICIT_ATTRIBUTE('SequenceType',#5501,3,#3011,$,.T.);
	//<01> generating methods for consolidated attribute:  SequenceType
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute:SequenceType, base type: ENUMERATION
	public boolean testSequencetype(EIfcrelsequence type) throws SdaiException {
		return test_enumeration(a7);
	}
	public int getSequencetype(EIfcrelsequence type) throws SdaiException {
		return get_enumeration(a7);
	}
	public void setSequencetype(EIfcrelsequence type, int value) throws SdaiException {
		a7 = set_enumeration(value, a7$);
	}
	public void unsetSequencetype(EIfcrelsequence type) throws SdaiException {
		a7 = unset_enumeration();
	}
	public static jsdai.dictionary.EAttribute attributeSequencetype(EIfcrelsequence type) throws SdaiException {
		return a7$;
	}

	//going through all the attributes: #5507=EXPLICIT_ATTRIBUTE('UserDefinedSequenceType',#5501,4,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  UserDefinedSequenceType
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: UserDefinedSequenceType, base type: STRING
	public boolean testUserdefinedsequencetype(EIfcrelsequence type) throws SdaiException {
		return test_string(a8);
	}
	public String getUserdefinedsequencetype(EIfcrelsequence type) throws SdaiException {
		return get_string(a8);
	}
	public void setUserdefinedsequencetype(EIfcrelsequence type, String value) throws SdaiException {
		a8 = set_string(value);
	}
	public void unsetUserdefinedsequencetype(EIfcrelsequence type) throws SdaiException {
		a8 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeUserdefinedsequencetype(EIfcrelsequence type) throws SdaiException {
		return a8$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a4 = unset_instance(a4);
			a5 = unset_instance(a5);
			a6 = unset_instance(a6);
			a7 = 0;
			a8 = null;
			a0 = null;
			a1 = unset_instance(a1);
			a2 = null;
			a3 = null;
			return;
		}
		a4 = av.entityValues[2].getInstance(0, this, a4$);
		a5 = av.entityValues[2].getInstance(1, this, a5$);
		a6 = av.entityValues[2].getInstance(2, this, a6$);
		a7 = av.entityValues[2].getEnumeration(3, a7$);
		a8 = av.entityValues[2].getString(4);
		a0 = av.entityValues[3].getString(0);
		a1 = av.entityValues[3].getInstance(1, this, a1$);
		a2 = av.entityValues[3].getString(2);
		a3 = av.entityValues[3].getString(3);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a4 = unset_instance(a4);
			a5 = unset_instance(a5);
			a6 = unset_instance(a6);
			a7 = 0;
			a8 = null;
			a0 = null;
			a1 = unset_instance(a1);
			a2 = null;
			a3 = null;
			return;
		}
		a4 = av.entityValues[2].getInstance(0, this, a4$);
		a5 = av.entityValues[2].getInstance(1, this, a5$);
		a6 = av.entityValues[2].getInstance(2, this, a6$);
		a7 = av.entityValues[2].getEnumeration(3, a7$);
		a8 = av.entityValues[2].getString(4);
		a0 = av.entityValues[3].getString(0);
		a1 = av.entityValues[3].getInstance(1, this, a1$);
		a2 = av.entityValues[3].getString(2);
		a3 = av.entityValues[3].getString(3);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcRelationship
		// partial entity: IfcRelConnects
		// partial entity: IfcRelSequence
		av.entityValues[2].setInstance(0, a4);
		av.entityValues[2].setInstance(1, a5);
		av.entityValues[2].setInstance(2, a6);
		av.entityValues[2].setEnumeration(3, a7, a7$);
		av.entityValues[2].setString(4, a8);
		// partial entity: IfcRoot
		av.entityValues[3].setString(0, a0);
		av.entityValues[3].setInstance(1, a1);
		av.entityValues[3].setString(2, a2);
		av.entityValues[3].setString(3, a3);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcRelationship
		// partial entity: IfcRelConnects
		// partial entity: IfcRelSequence
		av.entityValues[2].setInstance(0, a4);
		av.entityValues[2].setInstance(1, a5);
		av.entityValues[2].setInstance(2, a6);
		av.entityValues[2].setEnumeration(3, a7, a7$);
		av.entityValues[2].setString(4, a8);
		// partial entity: IfcRoot
		av.entityValues[3].setString(0, a0);
		av.entityValues[3].setInstance(1, a1);
		av.entityValues[3].setString(2, a2);
		av.entityValues[3].setString(3, a3);
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfcrelsequenceAvoidinconsistentsequence(SdaiContext _context) throws SdaiException {
	




		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).instanceNotEqual(_context, Value.alloc(jsdai.SIfc4.CIfcprocess.definition).set(_context, get(a4$)), Value.alloc(jsdai.SIfc4.CIfcprocess.definition).set(_context, get(a5$)))).getLogical());
	}
	public int rIfcrelsequenceCorrectsequencetype(SdaiContext _context) throws SdaiException {
	





		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).OR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).nequal(_context, Value.alloc(jsdai.SIfc4.SIfc4._st_IfcSequenceEnum).set(_context, get(a7$)), Value.alloc(jsdai.SIfc4.SIfc4._st_IfcSequenceEnum).setEnum(_context, "USERDEFINED")), Value.alloc(ExpressTypes.LOGICAL_TYPE).AND(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(jsdai.SIfc4.SIfc4._st_IfcSequenceEnum).set(_context, get(a7$)), Value.alloc(jsdai.SIfc4.SIfc4._st_IfcSequenceEnum).setEnum(_context, "USERDEFINED")), Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.SIfc4._st_IfcLabel).set(_context, get(a8$)))))).getLogical());
	}
}
