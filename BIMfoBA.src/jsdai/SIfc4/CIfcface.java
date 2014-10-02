/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcFace

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcface extends CIfctopologicalrepresentationitem implements EIfcface {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcface.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	protected AIfcfacebound a0; // Bounds - current entity - SET OF ENTITY
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// HasTextureMaps: protected Object  - inverse - current -  ENTITY IfcTextureMap
	protected static final jsdai.dictionary.CInverse_attribute i2$ = CEntity.initInverseAttribute(definition, 2);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// Bounds - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected AIfcfacebound a0;
	// HasTextureMaps - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i2$ = CEntity.initInverseAttribute(definition, 2);

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
	//going through all the attributes: #4256=EXPLICIT_ATTRIBUTE('Bounds',#4254,0,#6919,$,.F.);
	//<01> generating methods for consolidated attribute:  Bounds
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: Bounds, base type: SET OF ENTITY
	public static int usedinBounds(EIfcface type, EIfcfacebound instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	public boolean testBounds(EIfcface type) throws SdaiException {
		return test_aggregate(a0);
	}
	public AIfcfacebound getBounds(EIfcface type) throws SdaiException {
		return (AIfcfacebound)get_aggregate(a0);
	}
	public AIfcfacebound createBounds(EIfcface type) throws SdaiException {
		a0 = (AIfcfacebound)create_aggregate_class(a0, a0$,  AIfcfacebound.class, 0);
		return a0;
	}
	public void unsetBounds(EIfcface type) throws SdaiException {
		unset_aggregate(a0);
		a0 = null;
	}
	public static jsdai.dictionary.EAttribute attributeBounds(EIfcface type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #4257=INVERSE_ATTRIBUTE('HasTextureMaps',#4254,0,#6202,$,#6205,#8329,$,.F.);
	//<01> generating methods for consolidated attribute:  HasTextureMaps
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	// Inverse attribute - HasTextureMaps : SET[0:-2147483648] OF IfcTextureMap FOR MappedTo
	public AIfctexturemap getHastexturemaps(EIfcface type, ASdaiModel domain) throws SdaiException {
		AIfctexturemap result = (AIfctexturemap)get_inverse_aggregate(i2$);
		CIfctexturemap.usedinMappedto(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributeHastexturemaps(EIfcface type) throws SdaiException {
		return i2$;
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
		a0 = (AIfcfacebound)av.entityValues[0].getInstanceAggregate(0, a0$, this);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			if (a0 instanceof CAggregate)
				a0.unsetAll();
			a0 = null;
			return;
		}
		a0 = (AIfcfacebound)av.entityValues[0].getInstanceAggregate(0, a0$, this);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcFace
		av.entityValues[0].setInstanceAggregate(0, a0);
		// partial entity: IfcRepresentationItem
		// partial entity: IfcTopologicalRepresentationItem
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcFace
		av.entityValues[0].setInstanceAggregate(0, a0);
		// partial entity: IfcRepresentationItem
		// partial entity: IfcTopologicalRepresentationItem
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfcfaceHasouterbound(SdaiContext _context) throws SdaiException {
	



									
									Value _internal_aggregate_source103 = Value.alloc(ExpressTypes.SET_GENERIC_TYPE).set(_context, get(a0$));
									Value _result101 = Value.alloc(_internal_aggregate_source103).create();
									if (_internal_aggregate_source103.getActualJavaType() != Value.INDETERMINATE) {
										for (int _i102 = 1; _i102 <= _internal_aggregate_source103.getMemberCount(); _i102++) {
											Value _implicit_24_temp = _internal_aggregate_source103.getByIndex(_i102);
											if (Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCFACEOUTERBOUND", "IFC4"), _implicit_24_temp.typeOfV(_context)).getLogical() == 2) {
												_result101.addMember(_context, _implicit_24_temp);
											} else
											if (_internal_aggregate_source103.getDeclaredType() instanceof jsdai.dictionary.EArray_type) {
												_implicit_24_temp.unset();
												_result101.addMember(_context, _implicit_24_temp);
											}
										}
									} else {
										_result101.unset();
									}
		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).lequal(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOfExt(_context, _result101), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1))).getLogical());
	}
}
