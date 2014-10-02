/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcSphere

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcsphere extends CIfccsgprimitive3d implements EIfcsphere {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcsphere.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	// Position: protected Object a0;   Position - java inheritance - ENTITY IfcAxis2Placement3D
	// Dim: protected int  - derived - java inheritance -  INTEGER
	protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
	protected double a1; // Radius - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// Position - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected Object a0;
	// Dim - derived - java inheritance
	// protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
	// Radius - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected double a1;

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

	//going through all the attributes: #5552=INVERSE_ATTRIBUTE('LayerAssignment',#5550,0,#5023,$,#5027,#9221,#9222,.F.);
	//<01> generating methods for consolidated attribute:  LayerAssignment
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5553=INVERSE_ATTRIBUTE('StyledByItem',#5550,1,#5936,$,#5938,#9224,#9225,.F.);
	//<01> generating methods for consolidated attribute:  StyledByItem
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3865=EXPLICIT_ATTRIBUTE('Position',#3863,0,#3382,$,.F.);
	//<01> generating methods for consolidated attribute:  Position
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): Position, base type: entity IfcAxis2Placement3D
	public static int usedinPosition(EIfccsgprimitive3d type, EIfcaxis2placement3d instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	//going through all the attributes: #3866=DERIVED_ATTRIBUTE('Dim',#3863,0,#2485,$);
	//<01> generating methods for consolidated attribute:  Dim
	//<01-1> supertype, java inheritance
	//<01-1-1> derived
	//<01-1-1-2> NOT explicit-to-derived - generateDerivedSupertypeJavaInheritedMethodsX
	// methods for derived attribute: Dim, base type: INTEGER
	public boolean testDim(EIfccsgprimitive3d type) throws SdaiException {
			throw new SdaiException(SdaiException.FN_NAVL);
	}
	public Value getDim(EIfccsgprimitive3d type, SdaiContext _context) throws SdaiException {


//###-01 jc.generated_java: Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 3)
				return (Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 3));
	}
	public int getDim(EIfccsgprimitive3d type) throws SdaiException {
		SdaiContext _context = this.findEntityInstanceSdaiModel().getRepository().getSession().getSdaiContext();
			return getDim((EIfccsgprimitive3d)null, _context).getInteger();
	}
	public static jsdai.dictionary.EAttribute attributeDim(EIfccsgprimitive3d type) throws SdaiException {
		return d0$;
	}

	//going through all the attributes: #5770=EXPLICIT_ATTRIBUTE('Radius',#5768,0,#2605,$,.F.);
	//<01> generating methods for consolidated attribute:  Radius
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Radius, base type: REAL
	public boolean testRadius(EIfcsphere type) throws SdaiException {
		return test_double(a1);
	}
	public double getRadius(EIfcsphere type) throws SdaiException {
		return get_double(a1);
	}
	public void setRadius(EIfcsphere type, double value) throws SdaiException {
		a1 = set_double(value);
	}
	public void unsetRadius(EIfcsphere type) throws SdaiException {
		a1 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeRadius(EIfcsphere type) throws SdaiException {
		return a1$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			a1 = Double.NaN;
			return;
		}
		a0 = av.entityValues[0].getInstance(0, this, a0$);
		a1 = av.entityValues[3].getDouble(0);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			a1 = Double.NaN;
			return;
		}
		a0 = av.entityValues[0].getInstance(0, this, a0$);
		a1 = av.entityValues[3].getDouble(0);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcCsgPrimitive3D
		av.entityValues[0].setInstance(0, a0);
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
		// partial entity: IfcSphere
		av.entityValues[3].setDouble(0, a1);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcCsgPrimitive3D
		av.entityValues[0].setInstance(0, a0);
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
		// partial entity: IfcSphere
		av.entityValues[3].setDouble(0, a1);
	}
}
