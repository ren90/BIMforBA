/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcStructuralLoadSingleForce

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcstructuralloadsingleforce extends CIfcstructuralloadstatic implements EIfcstructuralloadsingleforce {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcstructuralloadsingleforce.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// Name: protected String a0;   Name - java inheritance - STRING
	protected double a1; // ForceX - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected double a2; // ForceY - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected double a3; // ForceZ - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected double a4; // MomentX - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected double a5; // MomentY - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected double a6; // MomentZ - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// Name - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected String a0;
	// ForceX - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected double a1;
	// ForceY - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected double a2;
	// ForceZ - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected double a3;
	// MomentX - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected double a4;
	// MomentY - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected double a5;
	// MomentZ - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	protected double a6;

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

	//going through all the attributes: #5838=EXPLICIT_ATTRIBUTE('Name',#5836,0,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5883=EXPLICIT_ATTRIBUTE('ForceX',#5881,0,#2513,$,.T.);
	//<01> generating methods for consolidated attribute:  ForceX
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: ForceX, base type: REAL
	public boolean testForcex(EIfcstructuralloadsingleforce type) throws SdaiException {
		return test_double(a1);
	}
	public double getForcex(EIfcstructuralloadsingleforce type) throws SdaiException {
		return get_double(a1);
	}
	public void setForcex(EIfcstructuralloadsingleforce type, double value) throws SdaiException {
		a1 = set_double(value);
	}
	public void unsetForcex(EIfcstructuralloadsingleforce type) throws SdaiException {
		a1 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeForcex(EIfcstructuralloadsingleforce type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #5884=EXPLICIT_ATTRIBUTE('ForceY',#5881,1,#2513,$,.T.);
	//<01> generating methods for consolidated attribute:  ForceY
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: ForceY, base type: REAL
	public boolean testForcey(EIfcstructuralloadsingleforce type) throws SdaiException {
		return test_double(a2);
	}
	public double getForcey(EIfcstructuralloadsingleforce type) throws SdaiException {
		return get_double(a2);
	}
	public void setForcey(EIfcstructuralloadsingleforce type, double value) throws SdaiException {
		a2 = set_double(value);
	}
	public void unsetForcey(EIfcstructuralloadsingleforce type) throws SdaiException {
		a2 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeForcey(EIfcstructuralloadsingleforce type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #5885=EXPLICIT_ATTRIBUTE('ForceZ',#5881,2,#2513,$,.T.);
	//<01> generating methods for consolidated attribute:  ForceZ
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: ForceZ, base type: REAL
	public boolean testForcez(EIfcstructuralloadsingleforce type) throws SdaiException {
		return test_double(a3);
	}
	public double getForcez(EIfcstructuralloadsingleforce type) throws SdaiException {
		return get_double(a3);
	}
	public void setForcez(EIfcstructuralloadsingleforce type, double value) throws SdaiException {
		a3 = set_double(value);
	}
	public void unsetForcez(EIfcstructuralloadsingleforce type) throws SdaiException {
		a3 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeForcez(EIfcstructuralloadsingleforce type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #5886=EXPLICIT_ATTRIBUTE('MomentX',#5881,3,#2685,$,.T.);
	//<01> generating methods for consolidated attribute:  MomentX
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: MomentX, base type: REAL
	public boolean testMomentx(EIfcstructuralloadsingleforce type) throws SdaiException {
		return test_double(a4);
	}
	public double getMomentx(EIfcstructuralloadsingleforce type) throws SdaiException {
		return get_double(a4);
	}
	public void setMomentx(EIfcstructuralloadsingleforce type, double value) throws SdaiException {
		a4 = set_double(value);
	}
	public void unsetMomentx(EIfcstructuralloadsingleforce type) throws SdaiException {
		a4 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeMomentx(EIfcstructuralloadsingleforce type) throws SdaiException {
		return a4$;
	}

	//going through all the attributes: #5887=EXPLICIT_ATTRIBUTE('MomentY',#5881,4,#2685,$,.T.);
	//<01> generating methods for consolidated attribute:  MomentY
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: MomentY, base type: REAL
	public boolean testMomenty(EIfcstructuralloadsingleforce type) throws SdaiException {
		return test_double(a5);
	}
	public double getMomenty(EIfcstructuralloadsingleforce type) throws SdaiException {
		return get_double(a5);
	}
	public void setMomenty(EIfcstructuralloadsingleforce type, double value) throws SdaiException {
		a5 = set_double(value);
	}
	public void unsetMomenty(EIfcstructuralloadsingleforce type) throws SdaiException {
		a5 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeMomenty(EIfcstructuralloadsingleforce type) throws SdaiException {
		return a5$;
	}

	//going through all the attributes: #5888=EXPLICIT_ATTRIBUTE('MomentZ',#5881,5,#2685,$,.T.);
	//<01> generating methods for consolidated attribute:  MomentZ
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: MomentZ, base type: REAL
	public boolean testMomentz(EIfcstructuralloadsingleforce type) throws SdaiException {
		return test_double(a6);
	}
	public double getMomentz(EIfcstructuralloadsingleforce type) throws SdaiException {
		return get_double(a6);
	}
	public void setMomentz(EIfcstructuralloadsingleforce type, double value) throws SdaiException {
		a6 = set_double(value);
	}
	public void unsetMomentz(EIfcstructuralloadsingleforce type) throws SdaiException {
		a6 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeMomentz(EIfcstructuralloadsingleforce type) throws SdaiException {
		return a6$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = Double.NaN;
			a2 = Double.NaN;
			a3 = Double.NaN;
			a4 = Double.NaN;
			a5 = Double.NaN;
			a6 = Double.NaN;
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = av.entityValues[2].getDouble(0);
		a2 = av.entityValues[2].getDouble(1);
		a3 = av.entityValues[2].getDouble(2);
		a4 = av.entityValues[2].getDouble(3);
		a5 = av.entityValues[2].getDouble(4);
		a6 = av.entityValues[2].getDouble(5);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = Double.NaN;
			a2 = Double.NaN;
			a3 = Double.NaN;
			a4 = Double.NaN;
			a5 = Double.NaN;
			a6 = Double.NaN;
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = av.entityValues[2].getDouble(0);
		a2 = av.entityValues[2].getDouble(1);
		a3 = av.entityValues[2].getDouble(2);
		a4 = av.entityValues[2].getDouble(3);
		a5 = av.entityValues[2].getDouble(4);
		a6 = av.entityValues[2].getDouble(5);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcStructuralLoad
		av.entityValues[0].setString(0, a0);
		// partial entity: IfcStructuralLoadOrResult
		// partial entity: IfcStructuralLoadSingleForce
		av.entityValues[2].setDouble(0, a1);
		av.entityValues[2].setDouble(1, a2);
		av.entityValues[2].setDouble(2, a3);
		av.entityValues[2].setDouble(3, a4);
		av.entityValues[2].setDouble(4, a5);
		av.entityValues[2].setDouble(5, a6);
		// partial entity: IfcStructuralLoadStatic
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcStructuralLoad
		av.entityValues[0].setString(0, a0);
		// partial entity: IfcStructuralLoadOrResult
		// partial entity: IfcStructuralLoadSingleForce
		av.entityValues[2].setDouble(0, a1);
		av.entityValues[2].setDouble(1, a2);
		av.entityValues[2].setDouble(2, a3);
		av.entityValues[2].setDouble(3, a4);
		av.entityValues[2].setDouble(4, a5);
		av.entityValues[2].setDouble(5, a6);
		// partial entity: IfcStructuralLoadStatic
	}
}
