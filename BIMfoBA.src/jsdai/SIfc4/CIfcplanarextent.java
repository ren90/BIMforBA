/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcPlanarExtent

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcplanarextent extends CIfcgeometricrepresentationitem implements EIfcplanarextent {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcplanarextent.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	protected double a0; // SizeInX - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected double a1; // SizeInY - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// SizeInX - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected double a0;
	// SizeInY - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected double a1;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
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
	//going through all the attributes: #4959=EXPLICIT_ATTRIBUTE('SizeInX',#4957,0,#2543,$,.F.);
	//<01> generating methods for consolidated attribute:  SizeInX
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: SizeInX, base type: REAL
	public boolean testSizeinx(EIfcplanarextent type) throws SdaiException {
		return test_double(a0);
	}
	public double getSizeinx(EIfcplanarextent type) throws SdaiException {
		return get_double(a0);
	}
	public void setSizeinx(EIfcplanarextent type, double value) throws SdaiException {
		a0 = set_double(value);
	}
	public void unsetSizeinx(EIfcplanarextent type) throws SdaiException {
		a0 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeSizeinx(EIfcplanarextent type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #4960=EXPLICIT_ATTRIBUTE('SizeInY',#4957,1,#2543,$,.F.);
	//<01> generating methods for consolidated attribute:  SizeInY
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: SizeInY, base type: REAL
	public boolean testSizeiny(EIfcplanarextent type) throws SdaiException {
		return test_double(a1);
	}
	public double getSizeiny(EIfcplanarextent type) throws SdaiException {
		return get_double(a1);
	}
	public void setSizeiny(EIfcplanarextent type, double value) throws SdaiException {
		a1 = set_double(value);
	}
	public void unsetSizeiny(EIfcplanarextent type) throws SdaiException {
		a1 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeSizeiny(EIfcplanarextent type) throws SdaiException {
		return a1$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = Double.NaN;
			a1 = Double.NaN;
			return;
		}
		a0 = av.entityValues[1].getDouble(0);
		a1 = av.entityValues[1].getDouble(1);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = Double.NaN;
			a1 = Double.NaN;
			return;
		}
		a0 = av.entityValues[1].getDouble(0);
		a1 = av.entityValues[1].getDouble(1);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcPlanarExtent
		av.entityValues[1].setDouble(0, a0);
		av.entityValues[1].setDouble(1, a1);
		// partial entity: IfcRepresentationItem
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcPlanarExtent
		av.entityValues[1].setDouble(0, a0);
		av.entityValues[1].setDouble(1, a1);
		// partial entity: IfcRepresentationItem
	}
}
