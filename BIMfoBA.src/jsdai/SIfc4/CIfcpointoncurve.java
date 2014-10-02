/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcPointOnCurve

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcpointoncurve extends CIfcpoint implements EIfcpointoncurve {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcpointoncurve.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	protected Object a0; // BasisCurve - current entity - ENTITY IfcCurve
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected double a1; // PointParameter - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// Dim: protected int  - derived - current -  INTEGER
	protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// BasisCurve - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected Object a0;
	// PointParameter - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected double a1;
	// Dim - derived - current entity
	protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a0 == old) {
			a0 = newer;
		}
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a0 == old) {
			a0 = newer;
		}
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #5552=INVERSE_ATTRIBUTE('LayerAssignment',#5550,0,#5023,$,#5027,#9221,#9222,.F.);
	//<01> generating methods for consolidated attribute:  LayerAssignment
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5553=INVERSE_ATTRIBUTE('StyledByItem',#5550,1,#5936,$,#5938,#9224,#9225,.F.);
	//<01> generating methods for consolidated attribute:  StyledByItem
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4975=EXPLICIT_ATTRIBUTE('BasisCurve',#4973,0,#3883,$,.F.);
	//<01> generating methods for consolidated attribute:  BasisCurve
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : BasisCurve, base type: entity IfcCurve
	public static int usedinBasiscurve(EIfcpointoncurve type, EIfccurve instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	public boolean testBasiscurve(EIfcpointoncurve type) throws SdaiException {
		return test_instance(a0);
	}
	public EIfccurve getBasiscurve(EIfcpointoncurve type) throws SdaiException {
		return (EIfccurve)get_instance(a0);
	}
	public void setBasiscurve(EIfcpointoncurve type, EIfccurve value) throws SdaiException {
		a0 = set_instance(a0, value);
	}
	public void unsetBasiscurve(EIfcpointoncurve type) throws SdaiException {
		a0 = unset_instance(a0);
	}
	public static jsdai.dictionary.EAttribute attributeBasiscurve(EIfcpointoncurve type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #4976=EXPLICIT_ATTRIBUTE('PointParameter',#4973,1,#2599,$,.F.);
	//<01> generating methods for consolidated attribute:  PointParameter
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: PointParameter, base type: REAL
	public boolean testPointparameter(EIfcpointoncurve type) throws SdaiException {
		return test_double(a1);
	}
	public double getPointparameter(EIfcpointoncurve type) throws SdaiException {
		return get_double(a1);
	}
	public void setPointparameter(EIfcpointoncurve type, double value) throws SdaiException {
		a1 = set_double(value);
	}
	public void unsetPointparameter(EIfcpointoncurve type) throws SdaiException {
		a1 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributePointparameter(EIfcpointoncurve type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #4977=DERIVED_ATTRIBUTE('Dim',#4973,0,#2485,$);
	//<01> generating methods for consolidated attribute:  Dim
	//<01-0> current entity
	//<01-0-1> derived attribute
	//<01-0-1-1> NOT explicit-to-derived - generateDerivedCurrentEntityMethodsX()
	// methods for derived attribute: Dim, base type: INTEGER
	public boolean testDim(EIfcpointoncurve type) throws SdaiException {
			throw new SdaiException(SdaiException.FN_NAVL);
	}
	public Value getDim(EIfcpointoncurve type, SdaiContext _context) throws SdaiException {




//###-01 jc.generated_java: Value.alloc(jsdai.SIfc4.CIfccurve.definition).set(_context, get(a0$)).getAttribute(jsdai.SIfc4.CIfccurve.attributeDim(null), _context)
				return (Value.alloc(jsdai.SIfc4.CIfccurve.definition).set(_context, get(a0$)).getAttribute(jsdai.SIfc4.CIfccurve.attributeDim(null), _context));
	}
	public int getDim(EIfcpointoncurve type) throws SdaiException {
		SdaiContext _context = this.findEntityInstanceSdaiModel().getRepository().getSession().getSdaiContext();
			return getDim((EIfcpointoncurve)null, _context).getInteger();
	}
	public static jsdai.dictionary.EAttribute attributeDim(EIfcpointoncurve type) throws SdaiException {
		return d0$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			a1 = Double.NaN;
			return;
		}
		a0 = av.entityValues[2].getInstance(0, this, a0$);
		a1 = av.entityValues[2].getDouble(1);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			a1 = Double.NaN;
			return;
		}
		a0 = av.entityValues[2].getInstance(0, this, a0$);
		a1 = av.entityValues[2].getDouble(1);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcPoint
		// partial entity: IfcPointOnCurve
		av.entityValues[2].setInstance(0, a0);
		av.entityValues[2].setDouble(1, a1);
		// partial entity: IfcRepresentationItem
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcPoint
		// partial entity: IfcPointOnCurve
		av.entityValues[2].setInstance(0, a0);
		av.entityValues[2].setDouble(1, a1);
		// partial entity: IfcRepresentationItem
	}
}
