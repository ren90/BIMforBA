/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcTextLiteralWithExtent

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfctextliteralwithextent extends CIfctextliteral implements EIfctextliteralwithextent {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfctextliteralwithextent.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	// Literal: protected String a0;   Literal - java inheritance - STRING
	// Placement: protected Object a1;   Placement - java inheritance - SELECT IfcAxis2Placement
	// Path: protected int a2;   Path - java inheritance - ENUMERATION IfcTextPath
	protected Object a3; // Extent - current entity - ENTITY IfcPlanarExtent
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected String a4; // BoxAlignment - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// Literal - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected String a0;
	// Placement - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected Object a1;
	// Path - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	// protected int a2;
	// Extent - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected Object a3;
	// BoxAlignment - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected String a4;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a3 == old) {
			a3 = newer;
		}
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a3 == old) {
			a3 = newer;
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
	//going through all the attributes: #6162=EXPLICIT_ATTRIBUTE('Literal',#6160,0,#2613,$,.F.);
	//<01> generating methods for consolidated attribute:  Literal
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #6163=EXPLICIT_ATTRIBUTE('Placement',#6160,1,#3115,$,.F.);
	//<01> generating methods for consolidated attribute:  Placement
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// -1- methods for SELECT attribute: Placement
	public static int usedinPlacement(EIfctextliteral type, EEntity instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a1$, domain, result);
	}
	//going through all the attributes: #6164=EXPLICIT_ATTRIBUTE('Path',#6160,2,#3063,$,.F.);
	//<01> generating methods for consolidated attribute:  Path
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #6167=EXPLICIT_ATTRIBUTE('Extent',#6165,0,#4957,$,.F.);
	//<01> generating methods for consolidated attribute:  Extent
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : Extent, base type: entity IfcPlanarExtent
	public static int usedinExtent(EIfctextliteralwithextent type, EIfcplanarextent instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a3$, domain, result);
	}
	public boolean testExtent(EIfctextliteralwithextent type) throws SdaiException {
		return test_instance(a3);
	}
	public EIfcplanarextent getExtent(EIfctextliteralwithextent type) throws SdaiException {
		return (EIfcplanarextent)get_instance(a3);
	}
	public void setExtent(EIfctextliteralwithextent type, EIfcplanarextent value) throws SdaiException {
		a3 = set_instance(a3, value);
	}
	public void unsetExtent(EIfctextliteralwithextent type) throws SdaiException {
		a3 = unset_instance(a3);
	}
	public static jsdai.dictionary.EAttribute attributeExtent(EIfctextliteralwithextent type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #6168=EXPLICIT_ATTRIBUTE('BoxAlignment',#6165,1,#2461,$,.F.);
	//<01> generating methods for consolidated attribute:  BoxAlignment
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: BoxAlignment, base type: STRING
	public boolean testBoxalignment(EIfctextliteralwithextent type) throws SdaiException {
		return test_string(a4);
	}
	public String getBoxalignment(EIfctextliteralwithextent type) throws SdaiException {
		return get_string(a4);
	}
	public void setBoxalignment(EIfctextliteralwithextent type, String value) throws SdaiException {
		a4 = set_string(value);
	}
	public void unsetBoxalignment(EIfctextliteralwithextent type) throws SdaiException {
		a4 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeBoxalignment(EIfctextliteralwithextent type) throws SdaiException {
		return a4$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = unset_instance(a1);
			a2 = 0;
			a3 = unset_instance(a3);
			a4 = null;
			return;
		}
		a0 = av.entityValues[2].getString(0);
		a1 = av.entityValues[2].getInstance(1, this, a1$);
		a2 = av.entityValues[2].getEnumeration(2, a2$);
		a3 = av.entityValues[3].getInstance(0, this, a3$);
		a4 = av.entityValues[3].getString(1);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = unset_instance(a1);
			a2 = 0;
			a3 = unset_instance(a3);
			a4 = null;
			return;
		}
		a0 = av.entityValues[2].getString(0);
		a1 = av.entityValues[2].getInstance(1, this, a1$);
		a2 = av.entityValues[2].getEnumeration(2, a2$);
		a3 = av.entityValues[3].getInstance(0, this, a3$);
		a4 = av.entityValues[3].getString(1);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
		// partial entity: IfcTextLiteral
		av.entityValues[2].setString(0, a0);
		av.entityValues[2].setInstance(1, a1);
		av.entityValues[2].setEnumeration(2, a2, a2$);
		// partial entity: IfcTextLiteralWithExtent
		av.entityValues[3].setInstance(0, a3);
		av.entityValues[3].setString(1, a4);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
		// partial entity: IfcTextLiteral
		av.entityValues[2].setString(0, a0);
		av.entityValues[2].setInstance(1, a1);
		av.entityValues[2].setEnumeration(2, a2, a2$);
		// partial entity: IfcTextLiteralWithExtent
		av.entityValues[3].setInstance(0, a3);
		av.entityValues[3].setString(1, a4);
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfctextliteralwithextentWr31(SdaiContext _context) throws SdaiException {
	



		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).NOT(Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCPLANARBOX", "IFC4"), Value.alloc(jsdai.SIfc4.CIfcplanarextent.definition).set(_context, get(a3$)).typeOfV(_context)))).getLogical());
	}
}
