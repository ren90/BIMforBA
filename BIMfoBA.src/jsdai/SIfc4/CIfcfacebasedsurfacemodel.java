/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcFaceBasedSurfaceModel

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcfacebasedsurfacemodel extends CIfcgeometricrepresentationitem implements EIfcfacebasedsurfacemodel {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcfacebasedsurfacemodel.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	protected AIfcconnectedfaceset a0; // FbsmFaces - current entity - SET OF ENTITY
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// Dim: protected int  - derived - current -  INTEGER
	protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// FbsmFaces - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected AIfcconnectedfaceset a0;
	// Dim - derived - current entity
	protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		changeReferencesAggregate(a0, old, newer);
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		changeReferencesAggregate(a0, old, newer);
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
	//going through all the attributes: #4260=EXPLICIT_ATTRIBUTE('FbsmFaces',#4258,0,#6922,$,.F.);
	//<01> generating methods for consolidated attribute:  FbsmFaces
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: FbsmFaces, base type: SET OF ENTITY
	public static int usedinFbsmfaces(EIfcfacebasedsurfacemodel type, EIfcconnectedfaceset instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	public boolean testFbsmfaces(EIfcfacebasedsurfacemodel type) throws SdaiException {
		return test_aggregate(a0);
	}
	public AIfcconnectedfaceset getFbsmfaces(EIfcfacebasedsurfacemodel type) throws SdaiException {
		return (AIfcconnectedfaceset)get_aggregate(a0);
	}
	public AIfcconnectedfaceset createFbsmfaces(EIfcfacebasedsurfacemodel type) throws SdaiException {
		a0 = (AIfcconnectedfaceset)create_aggregate_class(a0, a0$,  AIfcconnectedfaceset.class, 0);
		return a0;
	}
	public void unsetFbsmfaces(EIfcfacebasedsurfacemodel type) throws SdaiException {
		unset_aggregate(a0);
		a0 = null;
	}
	public static jsdai.dictionary.EAttribute attributeFbsmfaces(EIfcfacebasedsurfacemodel type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #4261=DERIVED_ATTRIBUTE('Dim',#4258,0,#2485,$);
	//<01> generating methods for consolidated attribute:  Dim
	//<01-0> current entity
	//<01-0-1> derived attribute
	//<01-0-1-1> NOT explicit-to-derived - generateDerivedCurrentEntityMethodsX()
	// methods for derived attribute: Dim, base type: INTEGER
	public boolean testDim(EIfcfacebasedsurfacemodel type) throws SdaiException {
			throw new SdaiException(SdaiException.FN_NAVL);
	}
	public Value getDim(EIfcfacebasedsurfacemodel type, SdaiContext _context) throws SdaiException {


//###-01 jc.generated_java: Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 3)
				return (Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 3));
	}
	public int getDim(EIfcfacebasedsurfacemodel type) throws SdaiException {
		SdaiContext _context = this.findEntityInstanceSdaiModel().getRepository().getSession().getSdaiContext();
			return getDim((EIfcfacebasedsurfacemodel)null, _context).getInteger();
	}
	public static jsdai.dictionary.EAttribute attributeDim(EIfcfacebasedsurfacemodel type) throws SdaiException {
		return d0$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			if (a0 instanceof CAggregate)
				a0.unsetAll();
			a0 = null;
			return;
		}
		a0 = (AIfcconnectedfaceset)av.entityValues[0].getInstanceAggregate(0, a0$, this);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			if (a0 instanceof CAggregate)
				a0.unsetAll();
			a0 = null;
			return;
		}
		a0 = (AIfcconnectedfaceset)av.entityValues[0].getInstanceAggregate(0, a0$, this);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcFaceBasedSurfaceModel
		av.entityValues[0].setInstanceAggregate(0, a0);
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcFaceBasedSurfaceModel
		av.entityValues[0].setInstanceAggregate(0, a0);
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
	}
}
