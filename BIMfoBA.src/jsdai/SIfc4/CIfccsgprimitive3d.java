/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcCsgPrimitive3D

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfccsgprimitive3d extends CIfcgeometricrepresentationitem implements EIfccsgprimitive3d {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfccsgprimitive3d.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	protected Object a0; // Position - current entity - ENTITY IfcAxis2Placement3D
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// Dim: protected int  - derived - current -  INTEGER
	protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// Position - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected Object a0;
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
	//going through all the attributes: #3865=EXPLICIT_ATTRIBUTE('Position',#3863,0,#3382,$,.F.);
	//<01> generating methods for consolidated attribute:  Position
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : Position, base type: entity IfcAxis2Placement3D
	public static int usedinPosition(EIfccsgprimitive3d type, EIfcaxis2placement3d instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	public boolean testPosition(EIfccsgprimitive3d type) throws SdaiException {
		return test_instance(a0);
	}
	public EIfcaxis2placement3d getPosition(EIfccsgprimitive3d type) throws SdaiException {
		return (EIfcaxis2placement3d)get_instance(a0);
	}
	public void setPosition(EIfccsgprimitive3d type, EIfcaxis2placement3d value) throws SdaiException {
		a0 = set_instance(a0, value);
	}
	public void unsetPosition(EIfccsgprimitive3d type) throws SdaiException {
		a0 = unset_instance(a0);
	}
	public static jsdai.dictionary.EAttribute attributePosition(EIfccsgprimitive3d type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #3866=DERIVED_ATTRIBUTE('Dim',#3863,0,#2485,$);
	//<01> generating methods for consolidated attribute:  Dim
	//<01-0> current entity
	//<01-0-1> derived attribute
	//<01-0-1-1> NOT explicit-to-derived - generateDerivedCurrentEntityMethodsX()
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


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			return;
		}
		a0 = av.entityValues[0].getInstance(0, this, a0$);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			return;
		}
		a0 = av.entityValues[0].getInstance(0, this, a0$);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcCsgPrimitive3D
		av.entityValues[0].setInstance(0, a0);
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcCsgPrimitive3D
		av.entityValues[0].setInstance(0, a0);
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
	}
}
