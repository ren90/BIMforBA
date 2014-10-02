/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcLagTime

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfclagtime extends CIfcschedulingtime implements EIfclagtime {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfclagtime.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// Name: protected String a0;   Name - java inheritance - STRING
	// DataOrigin: protected int a1;   DataOrigin - java inheritance - ENUMERATION IfcDataOriginEnum
	// UserDefinedDataOrigin: protected String a2;   UserDefinedDataOrigin - java inheritance - STRING
	protected Object a3; // LagValue - current entity - SELECT IfcTimeOrRatioSelect
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected int a3$$; // current SELECT path indicator
	protected int a4; // DurationType - current entity - ENUMERATION IfcTaskDurationEnum
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// Name - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected String a0;
	// DataOrigin - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected int a1;
	// UserDefinedDataOrigin - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	// protected String a2;
	// LagValue - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected Object a3;
	protected int a3$$;
	// DurationType - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected int a4;

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

	//going through all the attributes: #5638=EXPLICIT_ATTRIBUTE('Name',#5636,0,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5639=EXPLICIT_ATTRIBUTE('DataOrigin',#5636,1,#2803,$,.T.);
	//<01> generating methods for consolidated attribute:  DataOrigin
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5640=EXPLICIT_ATTRIBUTE('UserDefinedDataOrigin',#5636,2,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  UserDefinedDataOrigin
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4535=EXPLICIT_ATTRIBUTE('LagValue',#4533,0,#3215,$,.F.);
	//<01> generating methods for consolidated attribute:  LagValue
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// -2- methods for SELECT attribute: LagValue
	public int testLagvalue(EIfclagtime type) throws SdaiException {
		return test_select(a3, a3$$);
	}

	public String getLagvalue(EIfclagtime type, EIfcduration node1) throws SdaiException { // case 2
		return get_string_select(a3, a3$$, 2);
	}
	public double getLagvalue(EIfclagtime type, EIfcratiomeasure node1) throws SdaiException { // case 3
		return get_double_select(a3, a3$$, 3);
	}

	public void setLagvalue(EIfclagtime type, String value, EIfcduration node1) throws SdaiException { // case 2
		a3 = set_string(value);
		a3$$ = 2;
	}
	public void setLagvalue(EIfclagtime type, double value, EIfcratiomeasure node1) throws SdaiException { // case 3
		a3 = set_double_select(value);
		a3$$ = 3;
	}

	public void unsetLagvalue(EIfclagtime type) throws SdaiException {
		a3 = unset_select(a3);
		a3$$ = 0;
	}

	public static jsdai.dictionary.EAttribute attributeLagvalue(EIfclagtime type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #4536=EXPLICIT_ATTRIBUTE('DurationType',#4533,1,#3055,$,.F.);
	//<01> generating methods for consolidated attribute:  DurationType
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute:DurationType, base type: ENUMERATION
	public boolean testDurationtype(EIfclagtime type) throws SdaiException {
		return test_enumeration(a4);
	}
	public int getDurationtype(EIfclagtime type) throws SdaiException {
		return get_enumeration(a4);
	}
	public void setDurationtype(EIfclagtime type, int value) throws SdaiException {
		a4 = set_enumeration(value, a4$);
	}
	public void unsetDurationtype(EIfclagtime type) throws SdaiException {
		a4 = unset_enumeration();
	}
	public static jsdai.dictionary.EAttribute attributeDurationtype(EIfclagtime type) throws SdaiException {
		return a4$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a3 = unset_select(a3);
			a3$$ = 0;
			a4 = 0;
			a0 = null;
			a1 = 0;
			a2 = null;
			return;
		}
		a3 = av.entityValues[0].getMixed(0,a3$, this);
		a3$$ = av.entityValues[0].getSelectNumber();
		a4 = av.entityValues[0].getEnumeration(1, a4$);
		a0 = av.entityValues[1].getString(0);
		a1 = av.entityValues[1].getEnumeration(1, a1$);
		a2 = av.entityValues[1].getString(2);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a3 = unset_select(a3);
			a3$$ = 0;
			a4 = 0;
			a0 = null;
			a1 = 0;
			a2 = null;
			return;
		}
		a3 = av.entityValues[0].getMixed(0,a3$, this);
		a3$$ = av.entityValues[0].getSelectNumber();
		a4 = av.entityValues[0].getEnumeration(1, a4$);
		a0 = av.entityValues[1].getString(0);
		a1 = av.entityValues[1].getEnumeration(1, a1$);
		a2 = av.entityValues[1].getString(2);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcLagTime
		av.entityValues[0].setMixed(0, a3, a3$, a3$$);
		av.entityValues[0].setEnumeration(1, a4, a4$);
		// partial entity: IfcSchedulingTime
		av.entityValues[1].setString(0, a0);
		av.entityValues[1].setEnumeration(1, a1, a1$);
		av.entityValues[1].setString(2, a2);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcLagTime
		av.entityValues[0].setMixed(0, a3, a3$, a3$$);
		av.entityValues[0].setEnumeration(1, a4, a4$);
		// partial entity: IfcSchedulingTime
		av.entityValues[1].setString(0, a0);
		av.entityValues[1].setEnumeration(1, a1, a1$);
		av.entityValues[1].setString(2, a2);
	}
}