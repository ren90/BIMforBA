/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcConnectionPointEccentricity

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcconnectionpointeccentricity extends CIfcconnectionpointgeometry implements EIfcconnectionpointeccentricity {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcconnectionpointeccentricity.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// PointOnRelatingElement: protected Object a0;   PointOnRelatingElement - java inheritance - SELECT IfcPointOrVertexPoint
	// PointOnRelatedElement: protected Object a1;   PointOnRelatedElement - java inheritance - SELECT IfcPointOrVertexPoint
	protected double a2; // EccentricityInX - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected double a3; // EccentricityInY - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected double a4; // EccentricityInZ - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// PointOnRelatingElement - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected Object a0;
	// PointOnRelatedElement - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected Object a1;
	// EccentricityInX - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected double a2;
	// EccentricityInY - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected double a3;
	// EccentricityInZ - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected double a4;

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

	//going through all the attributes: #3735=EXPLICIT_ATTRIBUTE('PointOnRelatingElement',#3733,0,#3175,$,.F.);
	//<01> generating methods for consolidated attribute:  PointOnRelatingElement
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// -1- methods for SELECT attribute: PointOnRelatingElement
	public static int usedinPointonrelatingelement(EIfcconnectionpointgeometry type, EEntity instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	//going through all the attributes: #3736=EXPLICIT_ATTRIBUTE('PointOnRelatedElement',#3733,1,#3175,$,.T.);
	//<01> generating methods for consolidated attribute:  PointOnRelatedElement
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// -1- methods for SELECT attribute: PointOnRelatedElement
	public static int usedinPointonrelatedelement(EIfcconnectionpointgeometry type, EEntity instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a1$, domain, result);
	}
	//going through all the attributes: #3730=EXPLICIT_ATTRIBUTE('EccentricityInX',#3728,0,#2543,$,.T.);
	//<01> generating methods for consolidated attribute:  EccentricityInX
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: EccentricityInX, base type: REAL
	public boolean testEccentricityinx(EIfcconnectionpointeccentricity type) throws SdaiException {
		return test_double(a2);
	}
	public double getEccentricityinx(EIfcconnectionpointeccentricity type) throws SdaiException {
		return get_double(a2);
	}
	public void setEccentricityinx(EIfcconnectionpointeccentricity type, double value) throws SdaiException {
		a2 = set_double(value);
	}
	public void unsetEccentricityinx(EIfcconnectionpointeccentricity type) throws SdaiException {
		a2 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeEccentricityinx(EIfcconnectionpointeccentricity type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #3731=EXPLICIT_ATTRIBUTE('EccentricityInY',#3728,1,#2543,$,.T.);
	//<01> generating methods for consolidated attribute:  EccentricityInY
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: EccentricityInY, base type: REAL
	public boolean testEccentricityiny(EIfcconnectionpointeccentricity type) throws SdaiException {
		return test_double(a3);
	}
	public double getEccentricityiny(EIfcconnectionpointeccentricity type) throws SdaiException {
		return get_double(a3);
	}
	public void setEccentricityiny(EIfcconnectionpointeccentricity type, double value) throws SdaiException {
		a3 = set_double(value);
	}
	public void unsetEccentricityiny(EIfcconnectionpointeccentricity type) throws SdaiException {
		a3 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeEccentricityiny(EIfcconnectionpointeccentricity type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #3732=EXPLICIT_ATTRIBUTE('EccentricityInZ',#3728,2,#2543,$,.T.);
	//<01> generating methods for consolidated attribute:  EccentricityInZ
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: EccentricityInZ, base type: REAL
	public boolean testEccentricityinz(EIfcconnectionpointeccentricity type) throws SdaiException {
		return test_double(a4);
	}
	public double getEccentricityinz(EIfcconnectionpointeccentricity type) throws SdaiException {
		return get_double(a4);
	}
	public void setEccentricityinz(EIfcconnectionpointeccentricity type, double value) throws SdaiException {
		a4 = set_double(value);
	}
	public void unsetEccentricityinz(EIfcconnectionpointeccentricity type) throws SdaiException {
		a4 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeEccentricityinz(EIfcconnectionpointeccentricity type) throws SdaiException {
		return a4$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a2 = Double.NaN;
			a3 = Double.NaN;
			a4 = Double.NaN;
			a0 = unset_instance(a0);
			a1 = unset_instance(a1);
			return;
		}
		a2 = av.entityValues[1].getDouble(0);
		a3 = av.entityValues[1].getDouble(1);
		a4 = av.entityValues[1].getDouble(2);
		a0 = av.entityValues[2].getInstance(0, this, a0$);
		a1 = av.entityValues[2].getInstance(1, this, a1$);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a2 = Double.NaN;
			a3 = Double.NaN;
			a4 = Double.NaN;
			a0 = unset_instance(a0);
			a1 = unset_instance(a1);
			return;
		}
		a2 = av.entityValues[1].getDouble(0);
		a3 = av.entityValues[1].getDouble(1);
		a4 = av.entityValues[1].getDouble(2);
		a0 = av.entityValues[2].getInstance(0, this, a0$);
		a1 = av.entityValues[2].getInstance(1, this, a1$);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcConnectionGeometry
		// partial entity: IfcConnectionPointEccentricity
		av.entityValues[1].setDouble(0, a2);
		av.entityValues[1].setDouble(1, a3);
		av.entityValues[1].setDouble(2, a4);
		// partial entity: IfcConnectionPointGeometry
		av.entityValues[2].setInstance(0, a0);
		av.entityValues[2].setInstance(1, a1);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcConnectionGeometry
		// partial entity: IfcConnectionPointEccentricity
		av.entityValues[1].setDouble(0, a2);
		av.entityValues[1].setDouble(1, a3);
		av.entityValues[1].setDouble(2, a4);
		// partial entity: IfcConnectionPointGeometry
		av.entityValues[2].setInstance(0, a0);
		av.entityValues[2].setInstance(1, a1);
	}
}