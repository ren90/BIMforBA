/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcFillAreaStyle

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcfillareastyle extends CIfcpresentationstyle implements EIfcfillareastyle {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcfillareastyle.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// Name: protected String a0;   Name - java inheritance - STRING
	protected AIfcfillstyleselect a1; // FillStyles - current entity - SET OF SELECT
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected int a2; // ModelorDraughting - current entity - BOOLEAN
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// Name - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected String a0;
	// FillStyles - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected AIfcfillstyleselect a1;
	// ModelorDraughting - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected int a2;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		changeReferencesAggregate(a1, old, newer);
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		changeReferencesAggregate(a1, old, newer);
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #5037=EXPLICIT_ATTRIBUTE('Name',#5035,0,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4307=EXPLICIT_ATTRIBUTE('FillStyles',#4305,0,#6924,$,.F.);
	//<01> generating methods for consolidated attribute:  FillStyles
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: FillStyles, base type: SET OF SELECT
	public static int usedinFillstyles(EIfcfillareastyle type, EEntity instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a1$, domain, result);
	}
	public boolean testFillstyles(EIfcfillareastyle type) throws SdaiException {
		return test_aggregate(a1);
	}
	public AIfcfillstyleselect getFillstyles(EIfcfillareastyle type) throws SdaiException {
		if (a1 == null)
			throw new SdaiException(SdaiException.VA_NSET);
		return a1;
	}
	public AIfcfillstyleselect createFillstyles(EIfcfillareastyle type) throws SdaiException {
		a1 = (AIfcfillstyleselect)create_aggregate_class(a1, a1$, AIfcfillstyleselect.class, 0);
		return a1;
	}
	public void unsetFillstyles(EIfcfillareastyle type) throws SdaiException {
		unset_aggregate(a1);
		a1 = null;
	}
	public static jsdai.dictionary.EAttribute attributeFillstyles(EIfcfillareastyle type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #4308=EXPLICIT_ATTRIBUTE('ModelorDraughting',#4305,1,#6,$,.T.);
	//<01> generating methods for consolidated attribute:  ModelorDraughting
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: ModelorDraughting, base type: BOOLEAN
	public boolean testModelordraughting(EIfcfillareastyle type) throws SdaiException {
		return test_boolean(a2);
	}
	public boolean getModelordraughting(EIfcfillareastyle type) throws SdaiException {
		return get_boolean(a2);
	}
	public void setModelordraughting(EIfcfillareastyle type, boolean value) throws SdaiException {
		a2 = set_boolean(value);
	}
	public void unsetModelordraughting(EIfcfillareastyle type) throws SdaiException {
		a2 = unset_boolean();
	}
	public static jsdai.dictionary.EAttribute attributeModelordraughting(EIfcfillareastyle type) throws SdaiException {
		return a2$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			if (a1 instanceof CAggregate)
				a1.unsetAll();
			a1 = null;
			a2 = 0;
			a0 = null;
			return;
		}
		a1 = (AIfcfillstyleselect)av.entityValues[0].getInstanceAggregate(0, a1$, this);
		a2 = av.entityValues[0].getBoolean(1);
		a0 = av.entityValues[1].getString(0);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			if (a1 instanceof CAggregate)
				a1.unsetAll();
			a1 = null;
			a2 = 0;
			a0 = null;
			return;
		}
		a1 = (AIfcfillstyleselect)av.entityValues[0].getInstanceAggregate(0, a1$, this);
		a2 = av.entityValues[0].getBoolean(1);
		a0 = av.entityValues[1].getString(0);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcFillAreaStyle
		av.entityValues[0].setInstanceAggregate(0, a1);
		av.entityValues[0].setBoolean(1, a2);
		// partial entity: IfcPresentationStyle
		av.entityValues[1].setString(0, a0);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcFillAreaStyle
		av.entityValues[0].setInstanceAggregate(0, a1);
		av.entityValues[0].setBoolean(1, a2);
		// partial entity: IfcPresentationStyle
		av.entityValues[1].setString(0, a0);
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfcfillareastyleMaxoneexthatchstyle(SdaiContext _context) throws SdaiException {
	



									
									Value _internal_aggregate_source107 = Value.alloc(jsdai.SIfc4.CIfcfillareastyle.definition).set(_context, this).getAttribute(a1$, _context);
									Value _result105 = Value.alloc(_internal_aggregate_source107).create();
									if (_internal_aggregate_source107.getActualJavaType() != Value.INDETERMINATE) {
										for (int _i106 = 1; _i106 <= _internal_aggregate_source107.getMemberCount(); _i106++) {
											Value _implicit_26_Style = _internal_aggregate_source107.getByIndex(_i106);
											if (Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCEXTERNALLYDEFINEDHATCHSTYLE", "IFC4"), _implicit_26_Style.typeOfV(_context)).getLogical() == 2) {
												_result105.addMember(_context, _implicit_26_Style);
											} else
											if (_internal_aggregate_source107.getDeclaredType() instanceof jsdai.dictionary.EArray_type) {
												_implicit_26_Style.unset();
												_result105.addMember(_context, _implicit_26_Style);
											}
										}
									} else {
										_result105.unset();
									}
		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).lequal(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOfExt(_context, _result105), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1))).getLogical());
	}
	public int rIfcfillareastyleMaxonecolour(SdaiContext _context) throws SdaiException {
	



									
									Value _internal_aggregate_source111 = Value.alloc(jsdai.SIfc4.CIfcfillareastyle.definition).set(_context, this).getAttribute(a1$, _context);
									Value _result109 = Value.alloc(_internal_aggregate_source111).create();
									if (_internal_aggregate_source111.getActualJavaType() != Value.INDETERMINATE) {
										for (int _i110 = 1; _i110 <= _internal_aggregate_source111.getMemberCount(); _i110++) {
											Value _implicit_25_Style = _internal_aggregate_source111.getByIndex(_i110);
											if (Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCCOLOUR", "IFC4"), _implicit_25_Style.typeOfV(_context)).getLogical() == 2) {
												_result109.addMember(_context, _implicit_25_Style);
											} else
											if (_internal_aggregate_source111.getDeclaredType() instanceof jsdai.dictionary.EArray_type) {
												_implicit_25_Style.unset();
												_result109.addMember(_context, _implicit_25_Style);
											}
										}
									} else {
										_result109.unset();
									}
		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).lequal(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOfExt(_context, _result109), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1))).getLogical());
	}
	public int rIfcfillareastyleConsistenthatchstyledef(SdaiContext _context) throws SdaiException {
	



		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, (new jsdai.SIfc4.FIfccorrectfillareastyle()).run(_context, Value.alloc(jsdai.SIfc4.CIfcfillareastyle.definition).set(_context, this).getAttribute(a1$, _context))).getLogical());
	}
}
