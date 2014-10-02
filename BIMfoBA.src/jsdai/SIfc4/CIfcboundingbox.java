/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcBoundingBox

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcboundingbox extends CIfcgeometricrepresentationitem implements EIfcboundingbox {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcboundingbox.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	protected Object a0; // Corner - current entity - ENTITY IfcCartesianPoint
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected double a1; // XDim - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected double a2; // YDim - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected double a3; // ZDim - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	// Dim: protected int  - derived - current -  INTEGER
	protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// Corner - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected Object a0;
	// XDim - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected double a1;
	// YDim - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected double a2;
	// ZDim - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected double a3;
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
	//going through all the attributes: #3489=EXPLICIT_ATTRIBUTE('Corner',#3487,0,#3562,$,.F.);
	//<01> generating methods for consolidated attribute:  Corner
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : Corner, base type: entity IfcCartesianPoint
	public static int usedinCorner(EIfcboundingbox type, EIfccartesianpoint instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	public boolean testCorner(EIfcboundingbox type) throws SdaiException {
		return test_instance(a0);
	}
	public EIfccartesianpoint getCorner(EIfcboundingbox type) throws SdaiException {
		return (EIfccartesianpoint)get_instance(a0);
	}
	public void setCorner(EIfcboundingbox type, EIfccartesianpoint value) throws SdaiException {
		a0 = set_instance(a0, value);
	}
	public void unsetCorner(EIfcboundingbox type) throws SdaiException {
		a0 = unset_instance(a0);
	}
	public static jsdai.dictionary.EAttribute attributeCorner(EIfcboundingbox type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #3490=EXPLICIT_ATTRIBUTE('XDim',#3487,1,#2605,$,.F.);
	//<01> generating methods for consolidated attribute:  XDim
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: XDim, base type: REAL
	public boolean testXdim(EIfcboundingbox type) throws SdaiException {
		return test_double(a1);
	}
	public double getXdim(EIfcboundingbox type) throws SdaiException {
		return get_double(a1);
	}
	public void setXdim(EIfcboundingbox type, double value) throws SdaiException {
		a1 = set_double(value);
	}
	public void unsetXdim(EIfcboundingbox type) throws SdaiException {
		a1 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeXdim(EIfcboundingbox type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #3491=EXPLICIT_ATTRIBUTE('YDim',#3487,2,#2605,$,.F.);
	//<01> generating methods for consolidated attribute:  YDim
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: YDim, base type: REAL
	public boolean testYdim(EIfcboundingbox type) throws SdaiException {
		return test_double(a2);
	}
	public double getYdim(EIfcboundingbox type) throws SdaiException {
		return get_double(a2);
	}
	public void setYdim(EIfcboundingbox type, double value) throws SdaiException {
		a2 = set_double(value);
	}
	public void unsetYdim(EIfcboundingbox type) throws SdaiException {
		a2 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeYdim(EIfcboundingbox type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #3492=EXPLICIT_ATTRIBUTE('ZDim',#3487,3,#2605,$,.F.);
	//<01> generating methods for consolidated attribute:  ZDim
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: ZDim, base type: REAL
	public boolean testZdim(EIfcboundingbox type) throws SdaiException {
		return test_double(a3);
	}
	public double getZdim(EIfcboundingbox type) throws SdaiException {
		return get_double(a3);
	}
	public void setZdim(EIfcboundingbox type, double value) throws SdaiException {
		a3 = set_double(value);
	}
	public void unsetZdim(EIfcboundingbox type) throws SdaiException {
		a3 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeZdim(EIfcboundingbox type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #3493=DERIVED_ATTRIBUTE('Dim',#3487,0,#2485,$);
	//<01> generating methods for consolidated attribute:  Dim
	//<01-0> current entity
	//<01-0-1> derived attribute
	//<01-0-1-1> NOT explicit-to-derived - generateDerivedCurrentEntityMethodsX()
	// methods for derived attribute: Dim, base type: INTEGER
	public boolean testDim(EIfcboundingbox type) throws SdaiException {
			throw new SdaiException(SdaiException.FN_NAVL);
	}
	public Value getDim(EIfcboundingbox type, SdaiContext _context) throws SdaiException {


//###-01 jc.generated_java: Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 3)
				return (Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 3));
	}
	public int getDim(EIfcboundingbox type) throws SdaiException {
		SdaiContext _context = this.findEntityInstanceSdaiModel().getRepository().getSession().getSdaiContext();
			return getDim((EIfcboundingbox)null, _context).getInteger();
	}
	public static jsdai.dictionary.EAttribute attributeDim(EIfcboundingbox type) throws SdaiException {
		return d0$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			a1 = Double.NaN;
			a2 = Double.NaN;
			a3 = Double.NaN;
			return;
		}
		a0 = av.entityValues[0].getInstance(0, this, a0$);
		a1 = av.entityValues[0].getDouble(1);
		a2 = av.entityValues[0].getDouble(2);
		a3 = av.entityValues[0].getDouble(3);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			a1 = Double.NaN;
			a2 = Double.NaN;
			a3 = Double.NaN;
			return;
		}
		a0 = av.entityValues[0].getInstance(0, this, a0$);
		a1 = av.entityValues[0].getDouble(1);
		a2 = av.entityValues[0].getDouble(2);
		a3 = av.entityValues[0].getDouble(3);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcBoundingBox
		av.entityValues[0].setInstance(0, a0);
		av.entityValues[0].setDouble(1, a1);
		av.entityValues[0].setDouble(2, a2);
		av.entityValues[0].setDouble(3, a3);
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcBoundingBox
		av.entityValues[0].setInstance(0, a0);
		av.entityValues[0].setDouble(1, a1);
		av.entityValues[0].setDouble(2, a2);
		av.entityValues[0].setDouble(3, a3);
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
	}
}
