/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcFailureConnectionCondition

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcfailureconnectioncondition extends CIfcstructuralconnectioncondition implements EIfcfailureconnectioncondition {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcfailureconnectioncondition.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// Name: protected String a0;   Name - java inheritance - STRING
	protected double a1; // TensionFailureX - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected double a2; // TensionFailureY - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected double a3; // TensionFailureZ - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected double a4; // CompressionFailureX - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected double a5; // CompressionFailureY - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected double a6; // CompressionFailureZ - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// Name - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected String a0;
	// TensionFailureX - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected double a1;
	// TensionFailureY - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected double a2;
	// TensionFailureZ - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected double a3;
	// CompressionFailureX - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected double a4;
	// CompressionFailureY - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected double a5;
	// CompressionFailureZ - explicit - current entity
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

	//going through all the attributes: #5814=EXPLICIT_ATTRIBUTE('Name',#5812,0,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4279=EXPLICIT_ATTRIBUTE('TensionFailureX',#4277,0,#2513,$,.T.);
	//<01> generating methods for consolidated attribute:  TensionFailureX
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: TensionFailureX, base type: REAL
	public boolean testTensionfailurex(EIfcfailureconnectioncondition type) throws SdaiException {
		return test_double(a1);
	}
	public double getTensionfailurex(EIfcfailureconnectioncondition type) throws SdaiException {
		return get_double(a1);
	}
	public void setTensionfailurex(EIfcfailureconnectioncondition type, double value) throws SdaiException {
		a1 = set_double(value);
	}
	public void unsetTensionfailurex(EIfcfailureconnectioncondition type) throws SdaiException {
		a1 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeTensionfailurex(EIfcfailureconnectioncondition type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #4280=EXPLICIT_ATTRIBUTE('TensionFailureY',#4277,1,#2513,$,.T.);
	//<01> generating methods for consolidated attribute:  TensionFailureY
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: TensionFailureY, base type: REAL
	public boolean testTensionfailurey(EIfcfailureconnectioncondition type) throws SdaiException {
		return test_double(a2);
	}
	public double getTensionfailurey(EIfcfailureconnectioncondition type) throws SdaiException {
		return get_double(a2);
	}
	public void setTensionfailurey(EIfcfailureconnectioncondition type, double value) throws SdaiException {
		a2 = set_double(value);
	}
	public void unsetTensionfailurey(EIfcfailureconnectioncondition type) throws SdaiException {
		a2 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeTensionfailurey(EIfcfailureconnectioncondition type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #4281=EXPLICIT_ATTRIBUTE('TensionFailureZ',#4277,2,#2513,$,.T.);
	//<01> generating methods for consolidated attribute:  TensionFailureZ
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: TensionFailureZ, base type: REAL
	public boolean testTensionfailurez(EIfcfailureconnectioncondition type) throws SdaiException {
		return test_double(a3);
	}
	public double getTensionfailurez(EIfcfailureconnectioncondition type) throws SdaiException {
		return get_double(a3);
	}
	public void setTensionfailurez(EIfcfailureconnectioncondition type, double value) throws SdaiException {
		a3 = set_double(value);
	}
	public void unsetTensionfailurez(EIfcfailureconnectioncondition type) throws SdaiException {
		a3 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeTensionfailurez(EIfcfailureconnectioncondition type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #4282=EXPLICIT_ATTRIBUTE('CompressionFailureX',#4277,3,#2513,$,.T.);
	//<01> generating methods for consolidated attribute:  CompressionFailureX
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: CompressionFailureX, base type: REAL
	public boolean testCompressionfailurex(EIfcfailureconnectioncondition type) throws SdaiException {
		return test_double(a4);
	}
	public double getCompressionfailurex(EIfcfailureconnectioncondition type) throws SdaiException {
		return get_double(a4);
	}
	public void setCompressionfailurex(EIfcfailureconnectioncondition type, double value) throws SdaiException {
		a4 = set_double(value);
	}
	public void unsetCompressionfailurex(EIfcfailureconnectioncondition type) throws SdaiException {
		a4 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeCompressionfailurex(EIfcfailureconnectioncondition type) throws SdaiException {
		return a4$;
	}

	//going through all the attributes: #4283=EXPLICIT_ATTRIBUTE('CompressionFailureY',#4277,4,#2513,$,.T.);
	//<01> generating methods for consolidated attribute:  CompressionFailureY
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: CompressionFailureY, base type: REAL
	public boolean testCompressionfailurey(EIfcfailureconnectioncondition type) throws SdaiException {
		return test_double(a5);
	}
	public double getCompressionfailurey(EIfcfailureconnectioncondition type) throws SdaiException {
		return get_double(a5);
	}
	public void setCompressionfailurey(EIfcfailureconnectioncondition type, double value) throws SdaiException {
		a5 = set_double(value);
	}
	public void unsetCompressionfailurey(EIfcfailureconnectioncondition type) throws SdaiException {
		a5 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeCompressionfailurey(EIfcfailureconnectioncondition type) throws SdaiException {
		return a5$;
	}

	//going through all the attributes: #4284=EXPLICIT_ATTRIBUTE('CompressionFailureZ',#4277,5,#2513,$,.T.);
	//<01> generating methods for consolidated attribute:  CompressionFailureZ
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: CompressionFailureZ, base type: REAL
	public boolean testCompressionfailurez(EIfcfailureconnectioncondition type) throws SdaiException {
		return test_double(a6);
	}
	public double getCompressionfailurez(EIfcfailureconnectioncondition type) throws SdaiException {
		return get_double(a6);
	}
	public void setCompressionfailurez(EIfcfailureconnectioncondition type, double value) throws SdaiException {
		a6 = set_double(value);
	}
	public void unsetCompressionfailurez(EIfcfailureconnectioncondition type) throws SdaiException {
		a6 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeCompressionfailurez(EIfcfailureconnectioncondition type) throws SdaiException {
		return a6$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a1 = Double.NaN;
			a2 = Double.NaN;
			a3 = Double.NaN;
			a4 = Double.NaN;
			a5 = Double.NaN;
			a6 = Double.NaN;
			a0 = null;
			return;
		}
		a1 = av.entityValues[0].getDouble(0);
		a2 = av.entityValues[0].getDouble(1);
		a3 = av.entityValues[0].getDouble(2);
		a4 = av.entityValues[0].getDouble(3);
		a5 = av.entityValues[0].getDouble(4);
		a6 = av.entityValues[0].getDouble(5);
		a0 = av.entityValues[1].getString(0);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a1 = Double.NaN;
			a2 = Double.NaN;
			a3 = Double.NaN;
			a4 = Double.NaN;
			a5 = Double.NaN;
			a6 = Double.NaN;
			a0 = null;
			return;
		}
		a1 = av.entityValues[0].getDouble(0);
		a2 = av.entityValues[0].getDouble(1);
		a3 = av.entityValues[0].getDouble(2);
		a4 = av.entityValues[0].getDouble(3);
		a5 = av.entityValues[0].getDouble(4);
		a6 = av.entityValues[0].getDouble(5);
		a0 = av.entityValues[1].getString(0);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcFailureConnectionCondition
		av.entityValues[0].setDouble(0, a1);
		av.entityValues[0].setDouble(1, a2);
		av.entityValues[0].setDouble(2, a3);
		av.entityValues[0].setDouble(3, a4);
		av.entityValues[0].setDouble(4, a5);
		av.entityValues[0].setDouble(5, a6);
		// partial entity: IfcStructuralConnectionCondition
		av.entityValues[1].setString(0, a0);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcFailureConnectionCondition
		av.entityValues[0].setDouble(0, a1);
		av.entityValues[0].setDouble(1, a2);
		av.entityValues[0].setDouble(2, a3);
		av.entityValues[0].setDouble(3, a4);
		av.entityValues[0].setDouble(4, a5);
		av.entityValues[0].setDouble(5, a6);
		// partial entity: IfcStructuralConnectionCondition
		av.entityValues[1].setString(0, a0);
	}
}