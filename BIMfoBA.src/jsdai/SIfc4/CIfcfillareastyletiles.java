/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcFillAreaStyleTiles

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcfillareastyletiles extends CIfcgeometricrepresentationitem implements EIfcfillareastyletiles {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcfillareastyletiles.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	protected AIfcvector a0; // TilingPattern - current entity - LIST OF ENTITY
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected AIfcstyleditem a1; // Tiles - current entity - SET OF ENTITY
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected double a2; // TilingScale - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// TilingPattern - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected AIfcvector a0;
	// Tiles - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected AIfcstyleditem a1;
	// TilingScale - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected double a2;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		changeReferencesAggregate(a0, old, newer);
		changeReferencesAggregate(a1, old, newer);
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		changeReferencesAggregate(a0, old, newer);
		changeReferencesAggregate(a1, old, newer);
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
	//going through all the attributes: #4318=EXPLICIT_ATTRIBUTE('TilingPattern',#4316,0,#6927,$,.F.);
	//<01> generating methods for consolidated attribute:  TilingPattern
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: TilingPattern, base type: LIST OF ENTITY
	public static int usedinTilingpattern(EIfcfillareastyletiles type, EIfcvector instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	public boolean testTilingpattern(EIfcfillareastyletiles type) throws SdaiException {
		return test_aggregate(a0);
	}
	public AIfcvector getTilingpattern(EIfcfillareastyletiles type) throws SdaiException {
		return (AIfcvector)get_aggregate(a0);
	}
	public AIfcvector createTilingpattern(EIfcfillareastyletiles type) throws SdaiException {
		a0 = (AIfcvector)create_aggregate_class(a0, a0$,  AIfcvector.class, 0);
		return a0;
	}
	public void unsetTilingpattern(EIfcfillareastyletiles type) throws SdaiException {
		unset_aggregate(a0);
		a0 = null;
	}
	public static jsdai.dictionary.EAttribute attributeTilingpattern(EIfcfillareastyletiles type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #4319=EXPLICIT_ATTRIBUTE('Tiles',#4316,1,#6928,$,.F.);
	//<01> generating methods for consolidated attribute:  Tiles
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: Tiles, base type: SET OF ENTITY
	public static int usedinTiles(EIfcfillareastyletiles type, EIfcstyleditem instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a1$, domain, result);
	}
	public boolean testTiles(EIfcfillareastyletiles type) throws SdaiException {
		return test_aggregate(a1);
	}
	public AIfcstyleditem getTiles(EIfcfillareastyletiles type) throws SdaiException {
		return (AIfcstyleditem)get_aggregate(a1);
	}
	public AIfcstyleditem createTiles(EIfcfillareastyletiles type) throws SdaiException {
		a1 = (AIfcstyleditem)create_aggregate_class(a1, a1$,  AIfcstyleditem.class, 0);
		return a1;
	}
	public void unsetTiles(EIfcfillareastyletiles type) throws SdaiException {
		unset_aggregate(a1);
		a1 = null;
	}
	public static jsdai.dictionary.EAttribute attributeTiles(EIfcfillareastyletiles type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #4320=EXPLICIT_ATTRIBUTE('TilingScale',#4316,2,#2609,$,.F.);
	//<01> generating methods for consolidated attribute:  TilingScale
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: TilingScale, base type: REAL
	public boolean testTilingscale(EIfcfillareastyletiles type) throws SdaiException {
		return test_double(a2);
	}
	public double getTilingscale(EIfcfillareastyletiles type) throws SdaiException {
		return get_double(a2);
	}
	public void setTilingscale(EIfcfillareastyletiles type, double value) throws SdaiException {
		a2 = set_double(value);
	}
	public void unsetTilingscale(EIfcfillareastyletiles type) throws SdaiException {
		a2 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeTilingscale(EIfcfillareastyletiles type) throws SdaiException {
		return a2$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			if (a0 instanceof CAggregate)
				a0.unsetAll();
			a0 = null;
			if (a1 instanceof CAggregate)
				a1.unsetAll();
			a1 = null;
			a2 = Double.NaN;
			return;
		}
		a0 = (AIfcvector)av.entityValues[0].getInstanceAggregate(0, a0$, this);
		a1 = (AIfcstyleditem)av.entityValues[0].getInstanceAggregate(1, a1$, this);
		a2 = av.entityValues[0].getDouble(2);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			if (a0 instanceof CAggregate)
				a0.unsetAll();
			a0 = null;
			if (a1 instanceof CAggregate)
				a1.unsetAll();
			a1 = null;
			a2 = Double.NaN;
			return;
		}
		a0 = (AIfcvector)av.entityValues[0].getInstanceAggregate(0, a0$, this);
		a1 = (AIfcstyleditem)av.entityValues[0].getInstanceAggregate(1, a1$, this);
		a2 = av.entityValues[0].getDouble(2);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcFillAreaStyleTiles
		av.entityValues[0].setInstanceAggregate(0, a0);
		av.entityValues[0].setInstanceAggregate(1, a1);
		av.entityValues[0].setDouble(2, a2);
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcFillAreaStyleTiles
		av.entityValues[0].setInstanceAggregate(0, a0);
		av.entityValues[0].setInstanceAggregate(1, a1);
		av.entityValues[0].setDouble(2, a2);
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
	}
}
