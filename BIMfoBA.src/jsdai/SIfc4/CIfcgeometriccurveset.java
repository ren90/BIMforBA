/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcGeometricCurveSet

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcgeometriccurveset extends CIfcgeometricset implements EIfcgeometriccurveset {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcgeometriccurveset.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	// Elements: protected AIfcgeometricsetselect a0;   Elements - java inheritance - SET OF SELECT
	// Dim: protected int  - derived - java inheritance -  INTEGER
	protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// Elements - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected AIfcgeometricsetselect a0;
	// Dim - derived - java inheritance
	// protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);

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
	//going through all the attributes: #4425=EXPLICIT_ATTRIBUTE('Elements',#4423,0,#6931,$,.F.);
	//<01> generating methods for consolidated attribute:  Elements
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// methods for attribute: Elements, base type: SET OF SELECT
	public static int usedinElements(EIfcgeometricset type, EEntity instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	//going through all the attributes: #4426=DERIVED_ATTRIBUTE('Dim',#4423,0,#2485,$);
	//<01> generating methods for consolidated attribute:  Dim
	//<01-1> supertype, java inheritance
	//<01-1-1> derived
	//<01-1-1-2> NOT explicit-to-derived - generateDerivedSupertypeJavaInheritedMethodsX
	// methods for derived attribute: Dim, base type: INTEGER
	public boolean testDim(EIfcgeometricset type) throws SdaiException {
			throw new SdaiException(SdaiException.FN_NAVL);
	}
	public Value getDim(EIfcgeometricset type, SdaiContext _context) throws SdaiException {




//###-01 jc.generated_java: Value.alloc(ExpressTypes.SET_GENERIC_TYPE).set(_context, get(jsdai.SIfc4.CIfcgeometricset.attributeElements(null))).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null).getAttribute("dim", _context)
				return (Value.alloc(ExpressTypes.SET_GENERIC_TYPE).set(_context, get(jsdai.SIfc4.CIfcgeometricset.attributeElements(null))).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null).getAttribute("dim", _context));
	}
	public int getDim(EIfcgeometricset type) throws SdaiException {
		SdaiContext _context = this.findEntityInstanceSdaiModel().getRepository().getSession().getSdaiContext();
			return getDim((EIfcgeometricset)null, _context).getInteger();
	}
	public static jsdai.dictionary.EAttribute attributeDim(EIfcgeometricset type) throws SdaiException {
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
		a0 = (AIfcgeometricsetselect)av.entityValues[2].getInstanceAggregate(0, a0$, this);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			if (a0 instanceof CAggregate)
				a0.unsetAll();
			a0 = null;
			return;
		}
		a0 = (AIfcgeometricsetselect)av.entityValues[2].getInstanceAggregate(0, a0$, this);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcGeometricCurveSet
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcGeometricSet
		av.entityValues[2].setInstanceAggregate(0, a0);
		// partial entity: IfcRepresentationItem
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcGeometricCurveSet
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcGeometricSet
		av.entityValues[2].setInstanceAggregate(0, a0);
		// partial entity: IfcRepresentationItem
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfcgeometriccurvesetNosurfaces(SdaiContext _context) throws SdaiException {
	



									
									Value _internal_aggregate_source116 = Value.alloc(jsdai.SIfc4.CIfcgeometriccurveset.definition).set(_context, this).groupReference(_context, jsdai.SIfc4.CIfcgeometricset.class).getAttribute(jsdai.SIfc4.CIfcgeometricset.attributeElements(null), _context);
									Value _result114 = Value.alloc(_internal_aggregate_source116).create();
									if (_internal_aggregate_source116.getActualJavaType() != Value.INDETERMINATE) {
										for (int _i115 = 1; _i115 <= _internal_aggregate_source116.getMemberCount(); _i115++) {
											Value _implicit_27_Temp = _internal_aggregate_source116.getByIndex(_i115);
											if (Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCSURFACE", "IFC4"), _implicit_27_Temp.typeOfV(_context)).getLogical() == 2) {
												_result114.addMember(_context, _implicit_27_Temp);
											} else
											if (_internal_aggregate_source116.getDeclaredType() instanceof jsdai.dictionary.EArray_type) {
												_implicit_27_Temp.unset();
												_result114.addMember(_context, _implicit_27_Temp);
											}
										}
									} else {
										_result114.unset();
									}
		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOfExt0(_context, _result114), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 0))).getLogical());
	}
}