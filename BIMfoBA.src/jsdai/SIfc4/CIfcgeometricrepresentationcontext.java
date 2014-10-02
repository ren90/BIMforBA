/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcGeometricRepresentationContext

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcgeometricrepresentationcontext extends CIfcrepresentationcontext implements EIfcgeometricrepresentationcontext {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcgeometricrepresentationcontext.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// ContextIdentifier: protected String a0;   ContextIdentifier - java inheritance - STRING
	// ContextType: protected String a1;   ContextType - java inheritance - STRING
	// RepresentationsInContext: protected Object  - inverse - java inheritance -  ENTITY IfcRepresentation
	protected int a2; // CoordinateSpaceDimension - current entity - INTEGER
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected double a3; // Precision - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected Object a4; // WorldCoordinateSystem - current entity - SELECT IfcAxis2Placement
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected Object a5; // TrueNorth - current entity - ENTITY IfcDirection
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	// HasSubContexts: protected Object  - inverse - current -  ENTITY IfcGeometricRepresentationSubContext
	protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// ContextIdentifier - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected String a0;
	// ContextType - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected String a1;
	// RepresentationsInContext - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// CoordinateSpaceDimension - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected int a2;
	// Precision - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected double a3;
	// WorldCoordinateSystem - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected Object a4;
	// TrueNorth - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected Object a5;
	// HasSubContexts - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a4 == old) {
			a4 = newer;
		}
		if (a5 == old) {
			a5 = newer;
		}
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a4 == old) {
			a4 = newer;
		}
		if (a5 == old) {
			a5 = newer;
		}
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #5547=EXPLICIT_ATTRIBUTE('ContextIdentifier',#5545,0,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  ContextIdentifier
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5548=EXPLICIT_ATTRIBUTE('ContextType',#5545,1,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  ContextType
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5549=INVERSE_ATTRIBUTE('RepresentationsInContext',#5545,0,#5536,$,#5538,#9217,$,.F.);
	//<01> generating methods for consolidated attribute:  RepresentationsInContext
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4406=EXPLICIT_ATTRIBUTE('CoordinateSpaceDimension',#4404,0,#2485,$,.F.);
	//<01> generating methods for consolidated attribute:  CoordinateSpaceDimension
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: CoordinateSpaceDimension, base type: INTEGER
	public boolean testCoordinatespacedimension(EIfcgeometricrepresentationcontext type) throws SdaiException {
		return test_integer(a2);
	}
	public int getCoordinatespacedimension(EIfcgeometricrepresentationcontext type) throws SdaiException {
		return get_integer(a2);
	}
	public void setCoordinatespacedimension(EIfcgeometricrepresentationcontext type, int value) throws SdaiException {
		a2 = set_integer(value);
	}
	public void unsetCoordinatespacedimension(EIfcgeometricrepresentationcontext type) throws SdaiException {
		a2 = unset_integer();
	}
	public static jsdai.dictionary.EAttribute attributeCoordinatespacedimension(EIfcgeometricrepresentationcontext type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #4407=EXPLICIT_ATTRIBUTE('Precision',#4404,1,#3,$,.T.);
	//<01> generating methods for consolidated attribute:  Precision
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Precision, base type: REAL
	public boolean testPrecision(EIfcgeometricrepresentationcontext type) throws SdaiException {
		return test_double(a3);
	}
	public double getPrecision(EIfcgeometricrepresentationcontext type) throws SdaiException {
		return get_double(a3);
	}
	public void setPrecision(EIfcgeometricrepresentationcontext type, double value) throws SdaiException {
		a3 = set_double(value);
	}
	public void unsetPrecision(EIfcgeometricrepresentationcontext type) throws SdaiException {
		a3 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributePrecision(EIfcgeometricrepresentationcontext type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #4408=EXPLICIT_ATTRIBUTE('WorldCoordinateSystem',#4404,2,#3115,$,.F.);
	//<01> generating methods for consolidated attribute:  WorldCoordinateSystem
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// -2- methods for SELECT attribute: WorldCoordinateSystem
	public static int usedinWorldcoordinatesystem(EIfcgeometricrepresentationcontext type, EEntity instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a4$, domain, result);
	}
	public boolean testWorldcoordinatesystem(EIfcgeometricrepresentationcontext type) throws SdaiException {
		return test_instance(a4);
	}

	public EEntity getWorldcoordinatesystem(EIfcgeometricrepresentationcontext type) throws SdaiException { // case 1
		return get_instance_select(a4);
	}

	public void setWorldcoordinatesystem(EIfcgeometricrepresentationcontext type, EEntity value) throws SdaiException { // case 1
		a4 = set_instance(a4, value);
	}

	public void unsetWorldcoordinatesystem(EIfcgeometricrepresentationcontext type) throws SdaiException {
		a4 = unset_instance(a4);
	}

	public static jsdai.dictionary.EAttribute attributeWorldcoordinatesystem(EIfcgeometricrepresentationcontext type) throws SdaiException {
		return a4$;
	}

	//going through all the attributes: #4409=EXPLICIT_ATTRIBUTE('TrueNorth',#4404,3,#3948,$,.T.);
	//<01> generating methods for consolidated attribute:  TrueNorth
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : TrueNorth, base type: entity IfcDirection
	public static int usedinTruenorth(EIfcgeometricrepresentationcontext type, EIfcdirection instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a5$, domain, result);
	}
	public boolean testTruenorth(EIfcgeometricrepresentationcontext type) throws SdaiException {
		return test_instance(a5);
	}
	public EIfcdirection getTruenorth(EIfcgeometricrepresentationcontext type) throws SdaiException {
		return (EIfcdirection)get_instance(a5);
	}
	public void setTruenorth(EIfcgeometricrepresentationcontext type, EIfcdirection value) throws SdaiException {
		a5 = set_instance(a5, value);
	}
	public void unsetTruenorth(EIfcgeometricrepresentationcontext type) throws SdaiException {
		a5 = unset_instance(a5);
	}
	public static jsdai.dictionary.EAttribute attributeTruenorth(EIfcgeometricrepresentationcontext type) throws SdaiException {
		return a5$;
	}

	//going through all the attributes: #4410=INVERSE_ATTRIBUTE('HasSubContexts',#4404,0,#4413,$,#4415,#8458,$,.F.);
	//<01> generating methods for consolidated attribute:  HasSubContexts
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	// Inverse attribute - HasSubContexts : SET[0:-2147483648] OF IfcGeometricRepresentationSubContext FOR ParentContext
	public AIfcgeometricrepresentationsubcontext getHassubcontexts(EIfcgeometricrepresentationcontext type, ASdaiModel domain) throws SdaiException {
		AIfcgeometricrepresentationsubcontext result = (AIfcgeometricrepresentationsubcontext)get_inverse_aggregate(i1$);
		CIfcgeometricrepresentationsubcontext.usedinParentcontext(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributeHassubcontexts(EIfcgeometricrepresentationcontext type) throws SdaiException {
		return i1$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a2 = Integer.MIN_VALUE;
			a3 = Double.NaN;
			a4 = unset_instance(a4);
			a5 = unset_instance(a5);
			a0 = null;
			a1 = null;
			return;
		}
		a2 = av.entityValues[0].getInteger(0);
		a3 = av.entityValues[0].getDouble(1);
		a4 = av.entityValues[0].getInstance(2, this, a4$);
		a5 = av.entityValues[0].getInstance(3, this, a5$);
		a0 = av.entityValues[1].getString(0);
		a1 = av.entityValues[1].getString(1);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a2 = Integer.MIN_VALUE;
			a3 = Double.NaN;
			a4 = unset_instance(a4);
			a5 = unset_instance(a5);
			a0 = null;
			a1 = null;
			return;
		}
		a2 = av.entityValues[0].getInteger(0);
		a3 = av.entityValues[0].getDouble(1);
		a4 = av.entityValues[0].getInstance(2, this, a4$);
		a5 = av.entityValues[0].getInstance(3, this, a5$);
		a0 = av.entityValues[1].getString(0);
		a1 = av.entityValues[1].getString(1);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcGeometricRepresentationContext
		av.entityValues[0].setInteger(0, a2);
		av.entityValues[0].setDouble(1, a3);
		av.entityValues[0].setInstance(2, a4);
		av.entityValues[0].setInstance(3, a5);
		// partial entity: IfcRepresentationContext
		av.entityValues[1].setString(0, a0);
		av.entityValues[1].setString(1, a1);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcGeometricRepresentationContext
		av.entityValues[0].setInteger(0, a2);
		av.entityValues[0].setDouble(1, a3);
		av.entityValues[0].setInstance(2, a4);
		av.entityValues[0].setInstance(3, a5);
		// partial entity: IfcRepresentationContext
		av.entityValues[1].setString(0, a0);
		av.entityValues[1].setString(1, a1);
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfcgeometricrepresentationcontextWr11(SdaiContext _context) throws SdaiException {
	





		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).OR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).NOT(Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.CIfcdirection.definition).set(_context, get(a5$)))), Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).hiIndex(Value.alloc(jsdai.SIfc4.CIfcdirection.definition).set(_context, get(a5$)).getAttribute(jsdai.SIfc4.CIfcdirection.attributeDirectionratios(null), _context)), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 2)))).getLogical());
	}
}