/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcBoundaryNodeConditionWarping

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcboundarynodeconditionwarping extends CIfcboundarynodecondition implements EIfcboundarynodeconditionwarping {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcboundarynodeconditionwarping.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// Name: protected String a0;   Name - java inheritance - STRING
	// TranslationalStiffnessX: protected Object a1;   TranslationalStiffnessX - java inheritance - SELECT IfcTranslationalStiffnessSelect
	// protected int a1$$; // current SELECT path indicator
	// TranslationalStiffnessY: protected Object a2;   TranslationalStiffnessY - java inheritance - SELECT IfcTranslationalStiffnessSelect
	// protected int a2$$; // current SELECT path indicator
	// TranslationalStiffnessZ: protected Object a3;   TranslationalStiffnessZ - java inheritance - SELECT IfcTranslationalStiffnessSelect
	// protected int a3$$; // current SELECT path indicator
	// RotationalStiffnessX: protected Object a4;   RotationalStiffnessX - java inheritance - SELECT IfcRotationalStiffnessSelect
	// protected int a4$$; // current SELECT path indicator
	// RotationalStiffnessY: protected Object a5;   RotationalStiffnessY - java inheritance - SELECT IfcRotationalStiffnessSelect
	// protected int a5$$; // current SELECT path indicator
	// RotationalStiffnessZ: protected Object a6;   RotationalStiffnessZ - java inheritance - SELECT IfcRotationalStiffnessSelect
	// protected int a6$$; // current SELECT path indicator
	protected Object a7; // WarpingStiffness - current entity - SELECT IfcWarpingStiffnessSelect
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	protected int a7$$; // current SELECT path indicator
*/

	/*----------------------------- Attributes (new version) -----------*/

	// Name - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected String a0;
	// TranslationalStiffnessX - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected Object a1;
	// protected int a1$$;
	// TranslationalStiffnessY - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	// protected Object a2;
	// protected int a2$$;
	// TranslationalStiffnessZ - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	// protected Object a3;
	// protected int a3$$;
	// RotationalStiffnessX - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	// protected Object a4;
	// protected int a4$$;
	// RotationalStiffnessY - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	// protected Object a5;
	// protected int a5$$;
	// RotationalStiffnessZ - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	// protected Object a6;
	// protected int a6$$;
	// WarpingStiffness - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	protected Object a7;
	protected int a7$$;

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

	//going through all the attributes: #3456=EXPLICIT_ATTRIBUTE('Name',#3454,0,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3474=EXPLICIT_ATTRIBUTE('TranslationalStiffnessX',#3472,0,#3217,$,.T.);
	//<01> generating methods for consolidated attribute:  TranslationalStiffnessX
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// -1- methods for SELECT attribute: TranslationalStiffnessX
	//going through all the attributes: #3475=EXPLICIT_ATTRIBUTE('TranslationalStiffnessY',#3472,1,#3217,$,.T.);
	//<01> generating methods for consolidated attribute:  TranslationalStiffnessY
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// -1- methods for SELECT attribute: TranslationalStiffnessY
	//going through all the attributes: #3476=EXPLICIT_ATTRIBUTE('TranslationalStiffnessZ',#3472,2,#3217,$,.T.);
	//<01> generating methods for consolidated attribute:  TranslationalStiffnessZ
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// -1- methods for SELECT attribute: TranslationalStiffnessZ
	//going through all the attributes: #3477=EXPLICIT_ATTRIBUTE('RotationalStiffnessX',#3472,3,#3191,$,.T.);
	//<01> generating methods for consolidated attribute:  RotationalStiffnessX
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// -1- methods for SELECT attribute: RotationalStiffnessX
	//going through all the attributes: #3478=EXPLICIT_ATTRIBUTE('RotationalStiffnessY',#3472,4,#3191,$,.T.);
	//<01> generating methods for consolidated attribute:  RotationalStiffnessY
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// -1- methods for SELECT attribute: RotationalStiffnessY
	//going through all the attributes: #3479=EXPLICIT_ATTRIBUTE('RotationalStiffnessZ',#3472,5,#3191,$,.T.);
	//<01> generating methods for consolidated attribute:  RotationalStiffnessZ
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// -1- methods for SELECT attribute: RotationalStiffnessZ
	//going through all the attributes: #3482=EXPLICIT_ATTRIBUTE('WarpingStiffness',#3480,0,#3227,$,.T.);
	//<01> generating methods for consolidated attribute:  WarpingStiffness
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// -2- methods for SELECT attribute: WarpingStiffness
	public int testWarpingstiffness(EIfcboundarynodeconditionwarping type) throws SdaiException {
		return test_select(a7, a7$$);
	}

	public boolean getWarpingstiffness(EIfcboundarynodeconditionwarping type, EIfcboolean node1) throws SdaiException { // case 2
		return get_boolean_select(a7, a7$$, 2);
	}
	public double getWarpingstiffness(EIfcboundarynodeconditionwarping type, EIfcwarpingmomentmeasure node1) throws SdaiException { // case 3
		return get_double_select(a7, a7$$, 3);
	}

	public void setWarpingstiffness(EIfcboundarynodeconditionwarping type, boolean value, EIfcboolean node1) throws SdaiException { // case 2
		a7 = set_boolean_select(value);
		a7$$ = 2;
	}
	public void setWarpingstiffness(EIfcboundarynodeconditionwarping type, double value, EIfcwarpingmomentmeasure node1) throws SdaiException { // case 3
		a7 = set_double_select(value);
		a7$$ = 3;
	}

	public void unsetWarpingstiffness(EIfcboundarynodeconditionwarping type) throws SdaiException {
		a7 = unset_select(a7);
		a7$$ = 0;
	}

	public static jsdai.dictionary.EAttribute attributeWarpingstiffness(EIfcboundarynodeconditionwarping type) throws SdaiException {
		return a7$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = unset_select(a1);
			a1$$ = 0;
			a2 = unset_select(a2);
			a2$$ = 0;
			a3 = unset_select(a3);
			a3$$ = 0;
			a4 = unset_select(a4);
			a4$$ = 0;
			a5 = unset_select(a5);
			a5$$ = 0;
			a6 = unset_select(a6);
			a6$$ = 0;
			a7 = unset_select(a7);
			a7$$ = 0;
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = av.entityValues[1].getMixed(0,a1$, this);
		a1$$ = av.entityValues[1].getSelectNumber();
		a2 = av.entityValues[1].getMixed(1,a2$, this);
		a2$$ = av.entityValues[1].getSelectNumber();
		a3 = av.entityValues[1].getMixed(2,a3$, this);
		a3$$ = av.entityValues[1].getSelectNumber();
		a4 = av.entityValues[1].getMixed(3,a4$, this);
		a4$$ = av.entityValues[1].getSelectNumber();
		a5 = av.entityValues[1].getMixed(4,a5$, this);
		a5$$ = av.entityValues[1].getSelectNumber();
		a6 = av.entityValues[1].getMixed(5,a6$, this);
		a6$$ = av.entityValues[1].getSelectNumber();
		a7 = av.entityValues[2].getMixed(0,a7$, this);
		a7$$ = av.entityValues[2].getSelectNumber();
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = unset_select(a1);
			a1$$ = 0;
			a2 = unset_select(a2);
			a2$$ = 0;
			a3 = unset_select(a3);
			a3$$ = 0;
			a4 = unset_select(a4);
			a4$$ = 0;
			a5 = unset_select(a5);
			a5$$ = 0;
			a6 = unset_select(a6);
			a6$$ = 0;
			a7 = unset_select(a7);
			a7$$ = 0;
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = av.entityValues[1].getMixed(0,a1$, this);
		a1$$ = av.entityValues[1].getSelectNumber();
		a2 = av.entityValues[1].getMixed(1,a2$, this);
		a2$$ = av.entityValues[1].getSelectNumber();
		a3 = av.entityValues[1].getMixed(2,a3$, this);
		a3$$ = av.entityValues[1].getSelectNumber();
		a4 = av.entityValues[1].getMixed(3,a4$, this);
		a4$$ = av.entityValues[1].getSelectNumber();
		a5 = av.entityValues[1].getMixed(4,a5$, this);
		a5$$ = av.entityValues[1].getSelectNumber();
		a6 = av.entityValues[1].getMixed(5,a6$, this);
		a6$$ = av.entityValues[1].getSelectNumber();
		a7 = av.entityValues[2].getMixed(0,a7$, this);
		a7$$ = av.entityValues[2].getSelectNumber();
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcBoundaryCondition
		av.entityValues[0].setString(0, a0);
		// partial entity: IfcBoundaryNodeCondition
		av.entityValues[1].setMixed(0, a1, a1$, a1$$);
		av.entityValues[1].setMixed(1, a2, a2$, a2$$);
		av.entityValues[1].setMixed(2, a3, a3$, a3$$);
		av.entityValues[1].setMixed(3, a4, a4$, a4$$);
		av.entityValues[1].setMixed(4, a5, a5$, a5$$);
		av.entityValues[1].setMixed(5, a6, a6$, a6$$);
		// partial entity: IfcBoundaryNodeConditionWarping
		av.entityValues[2].setMixed(0, a7, a7$, a7$$);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcBoundaryCondition
		av.entityValues[0].setString(0, a0);
		// partial entity: IfcBoundaryNodeCondition
		av.entityValues[1].setMixed(0, a1, a1$, a1$$);
		av.entityValues[1].setMixed(1, a2, a2$, a2$$);
		av.entityValues[1].setMixed(2, a3, a3$, a3$$);
		av.entityValues[1].setMixed(3, a4, a4$, a4$$);
		av.entityValues[1].setMixed(4, a5, a5$, a5$$);
		av.entityValues[1].setMixed(5, a6, a6$, a6$$);
		// partial entity: IfcBoundaryNodeConditionWarping
		av.entityValues[2].setMixed(0, a7, a7$, a7$$);
	}
}
