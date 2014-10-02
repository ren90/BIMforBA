/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcShapeModel

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcshapemodel extends CIfcrepresentation implements EIfcshapemodel {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcshapemodel.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// ContextOfItems: protected Object a0;   ContextOfItems - java inheritance - ENTITY IfcRepresentationContext
	// RepresentationIdentifier: protected String a1;   RepresentationIdentifier - java inheritance - STRING
	// RepresentationType: protected String a2;   RepresentationType - java inheritance - STRING
	// Items: protected AIfcrepresentationitem a3;   Items - java inheritance - SET OF ENTITY
	// RepresentationMap: protected Object  - inverse - java inheritance -  ENTITY IfcRepresentationMap
	// LayerAssignments: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// OfProductRepresentation: protected Object  - inverse - java inheritance -  ENTITY IfcProductRepresentation
	// OfShapeAspect: protected Object  - inverse - current -  ENTITY IfcShapeAspect
	protected static final jsdai.dictionary.CInverse_attribute i3$ = CEntity.initInverseAttribute(definition, 3);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// ContextOfItems - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected Object a0;
	// RepresentationIdentifier - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected String a1;
	// RepresentationType - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	// protected String a2;
	// Items - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	// protected AIfcrepresentationitem a3;
	// RepresentationMap - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// LayerAssignments - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// OfProductRepresentation - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i2$ = CEntity.initInverseAttribute(definition, 2);
	// OfShapeAspect - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i3$ = CEntity.initInverseAttribute(definition, 3);

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

	//going through all the attributes: #5538=EXPLICIT_ATTRIBUTE('ContextOfItems',#5536,0,#5545,$,.F.);
	//<01> generating methods for consolidated attribute:  ContextOfItems
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): ContextOfItems, base type: entity IfcRepresentationContext
	public static int usedinContextofitems(EIfcrepresentation type, EIfcrepresentationcontext instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	//going through all the attributes: #5539=EXPLICIT_ATTRIBUTE('RepresentationIdentifier',#5536,1,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  RepresentationIdentifier
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5540=EXPLICIT_ATTRIBUTE('RepresentationType',#5536,2,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  RepresentationType
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5541=EXPLICIT_ATTRIBUTE('Items',#5536,3,#7108,$,.F.);
	//<01> generating methods for consolidated attribute:  Items
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// methods for attribute: Items, base type: SET OF ENTITY
	public static int usedinItems(EIfcrepresentation type, EIfcrepresentationitem instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a3$, domain, result);
	}
	//going through all the attributes: #5542=INVERSE_ATTRIBUTE('RepresentationMap',#5536,0,#5554,$,#5557,#9208,#9209,.F.);
	//<01> generating methods for consolidated attribute:  RepresentationMap
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5543=INVERSE_ATTRIBUTE('LayerAssignments',#5536,1,#5023,$,#5027,#9211,$,.F.);
	//<01> generating methods for consolidated attribute:  LayerAssignments
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5544=INVERSE_ATTRIBUTE('OfProductRepresentation',#5536,2,#5063,$,#5067,#9213,$,.F.);
	//<01> generating methods for consolidated attribute:  OfProductRepresentation
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5681=INVERSE_ATTRIBUTE('OfShapeAspect',#5679,0,#5672,$,#5674,#9297,#9298,.F.);
	//<01> generating methods for consolidated attribute:  OfShapeAspect
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	public AIfcshapeaspect getOfshapeaspect(EIfcshapemodel type, ASdaiModel domain) throws SdaiException {
		AIfcshapeaspect result = (AIfcshapeaspect)get_inverse_aggregate(i3$);
		CIfcshapeaspect.usedinShaperepresentations(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributeOfshapeaspect(EIfcshapemodel type) throws SdaiException {
		return i3$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			a1 = null;
			a2 = null;
			if (a3 instanceof CAggregate)
				a3.unsetAll();
			a3 = null;
			return;
		}
		a0 = av.entityValues[0].getInstance(0, this, a0$);
		a1 = av.entityValues[0].getString(1);
		a2 = av.entityValues[0].getString(2);
		a3 = (AIfcrepresentationitem)av.entityValues[0].getInstanceAggregate(3, a3$, this);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			a1 = null;
			a2 = null;
			if (a3 instanceof CAggregate)
				a3.unsetAll();
			a3 = null;
			return;
		}
		a0 = av.entityValues[0].getInstance(0, this, a0$);
		a1 = av.entityValues[0].getString(1);
		a2 = av.entityValues[0].getString(2);
		a3 = (AIfcrepresentationitem)av.entityValues[0].getInstanceAggregate(3, a3$, this);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcRepresentation
		av.entityValues[0].setInstance(0, a0);
		av.entityValues[0].setString(1, a1);
		av.entityValues[0].setString(2, a2);
		av.entityValues[0].setInstanceAggregate(3, a3);
		// partial entity: IfcShapeModel
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcRepresentation
		av.entityValues[0].setInstance(0, a0);
		av.entityValues[0].setString(1, a1);
		av.entityValues[0].setString(2, a2);
		av.entityValues[0].setInstanceAggregate(3, a3);
		// partial entity: IfcShapeModel
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfcshapemodelWr11(SdaiContext _context) throws SdaiException {
	





		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).XOR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).XOR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(Value.alloc(jsdai.SIfc4.CIfcshapemodel.definition).set(_context, this).groupReference(_context, jsdai.SIfc4.CIfcrepresentation.class).getAttribute(jsdai.SIfc4.CIfcrepresentation.attributeOfproductrepresentation(null), _context)), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1)), Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(Value.alloc(jsdai.SIfc4.CIfcshapemodel.definition).set(_context, this).groupReference(_context, jsdai.SIfc4.CIfcrepresentation.class).getAttribute(jsdai.SIfc4.CIfcrepresentation.attributeRepresentationmap(null), _context)), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1))), Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(Value.alloc(ExpressTypes.SET_GENERIC_TYPE).set(_context, get(i3$))), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1)))).getLogical());
	}
}
