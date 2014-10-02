/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcCurveStyleFontAndScaling

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfccurvestylefontandscaling extends CIfcpresentationitem implements EIfccurvestylefontandscaling {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfccurvestylefontandscaling.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	protected String a0; // Name - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected Object a1; // CurveFont - current entity - SELECT IfcCurveStyleFontSelect
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected double a2; // CurveFontScaling - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// Name - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected String a0;
	// CurveFont - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected Object a1;
	// CurveFontScaling - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected double a2;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a1 == old) {
			a1 = newer;
		}
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a1 == old) {
			a1 = newer;
		}
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #3908=EXPLICIT_ATTRIBUTE('Name',#3906,0,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Name, base type: STRING
	public boolean testName(EIfccurvestylefontandscaling type) throws SdaiException {
		return test_string(a0);
	}
	public String getName(EIfccurvestylefontandscaling type) throws SdaiException {
		return get_string(a0);
	}
	public void setName(EIfccurvestylefontandscaling type, String value) throws SdaiException {
		a0 = set_string(value);
	}
	public void unsetName(EIfccurvestylefontandscaling type) throws SdaiException {
		a0 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeName(EIfccurvestylefontandscaling type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #3909=EXPLICIT_ATTRIBUTE('CurveFont',#3906,1,#3139,$,.F.);
	//<01> generating methods for consolidated attribute:  CurveFont
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// -2- methods for SELECT attribute: CurveFont
	public static int usedinCurvefont(EIfccurvestylefontandscaling type, EEntity instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a1$, domain, result);
	}
	public boolean testCurvefont(EIfccurvestylefontandscaling type) throws SdaiException {
		return test_instance(a1);
	}

	public EEntity getCurvefont(EIfccurvestylefontandscaling type) throws SdaiException { // case 1
		return get_instance_select(a1);
	}

	public void setCurvefont(EIfccurvestylefontandscaling type, EEntity value) throws SdaiException { // case 1
		a1 = set_instance(a1, value);
	}

	public void unsetCurvefont(EIfccurvestylefontandscaling type) throws SdaiException {
		a1 = unset_instance(a1);
	}

	public static jsdai.dictionary.EAttribute attributeCurvefont(EIfccurvestylefontandscaling type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #3910=EXPLICIT_ATTRIBUTE('CurveFontScaling',#3906,2,#2609,$,.F.);
	//<01> generating methods for consolidated attribute:  CurveFontScaling
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: CurveFontScaling, base type: REAL
	public boolean testCurvefontscaling(EIfccurvestylefontandscaling type) throws SdaiException {
		return test_double(a2);
	}
	public double getCurvefontscaling(EIfccurvestylefontandscaling type) throws SdaiException {
		return get_double(a2);
	}
	public void setCurvefontscaling(EIfccurvestylefontandscaling type, double value) throws SdaiException {
		a2 = set_double(value);
	}
	public void unsetCurvefontscaling(EIfccurvestylefontandscaling type) throws SdaiException {
		a2 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeCurvefontscaling(EIfccurvestylefontandscaling type) throws SdaiException {
		return a2$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = unset_instance(a1);
			a2 = Double.NaN;
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = av.entityValues[0].getInstance(1, this, a1$);
		a2 = av.entityValues[0].getDouble(2);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = unset_instance(a1);
			a2 = Double.NaN;
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = av.entityValues[0].getInstance(1, this, a1$);
		a2 = av.entityValues[0].getDouble(2);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcCurveStyleFontAndScaling
		av.entityValues[0].setString(0, a0);
		av.entityValues[0].setInstance(1, a1);
		av.entityValues[0].setDouble(2, a2);
		// partial entity: IfcPresentationItem
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcCurveStyleFontAndScaling
		av.entityValues[0].setString(0, a0);
		av.entityValues[0].setInstance(1, a1);
		av.entityValues[0].setDouble(2, a2);
		// partial entity: IfcPresentationItem
	}
}