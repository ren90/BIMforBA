/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcBooleanResult

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcbooleanresult extends CIfcgeometricrepresentationitem implements EIfcbooleanresult {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcbooleanresult.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	protected int a0; // Operator - current entity - ENUMERATION IfcBooleanOperator
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected Object a1; // FirstOperand - current entity - SELECT IfcBooleanOperand
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected Object a2; // SecondOperand - current entity - SELECT IfcBooleanOperand
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	// Dim: protected int  - derived - current -  INTEGER
	protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// Operator - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected int a0;
	// FirstOperand - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected Object a1;
	// SecondOperand - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected Object a2;
	// Dim - derived - current entity
	protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a1 == old) {
			a1 = newer;
		}
		if (a2 == old) {
			a2 = newer;
		}
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a1 == old) {
			a1 = newer;
		}
		if (a2 == old) {
			a2 = newer;
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
	//going through all the attributes: #3450=EXPLICIT_ATTRIBUTE('Operator',#3448,0,#2737,$,.F.);
	//<01> generating methods for consolidated attribute:  Operator
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute:Operator, base type: ENUMERATION
	public boolean testOperator(EIfcbooleanresult type) throws SdaiException {
		return test_enumeration(a0);
	}
	public int getOperator(EIfcbooleanresult type) throws SdaiException {
		return get_enumeration(a0);
	}
	public void setOperator(EIfcbooleanresult type, int value) throws SdaiException {
		a0 = set_enumeration(value, a0$);
	}
	public void unsetOperator(EIfcbooleanresult type) throws SdaiException {
		a0 = unset_enumeration();
	}
	public static jsdai.dictionary.EAttribute attributeOperator(EIfcbooleanresult type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #3451=EXPLICIT_ATTRIBUTE('FirstOperand',#3448,1,#3119,$,.F.);
	//<01> generating methods for consolidated attribute:  FirstOperand
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// -2- methods for SELECT attribute: FirstOperand
	public static int usedinFirstoperand(EIfcbooleanresult type, EEntity instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a1$, domain, result);
	}
	public boolean testFirstoperand(EIfcbooleanresult type) throws SdaiException {
		return test_instance(a1);
	}

	public EEntity getFirstoperand(EIfcbooleanresult type) throws SdaiException { // case 1
		return get_instance_select(a1);
	}

	public void setFirstoperand(EIfcbooleanresult type, EEntity value) throws SdaiException { // case 1
		a1 = set_instance(a1, value);
	}

	public void unsetFirstoperand(EIfcbooleanresult type) throws SdaiException {
		a1 = unset_instance(a1);
	}

	public static jsdai.dictionary.EAttribute attributeFirstoperand(EIfcbooleanresult type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #3452=EXPLICIT_ATTRIBUTE('SecondOperand',#3448,2,#3119,$,.F.);
	//<01> generating methods for consolidated attribute:  SecondOperand
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// -2- methods for SELECT attribute: SecondOperand
	public static int usedinSecondoperand(EIfcbooleanresult type, EEntity instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a2$, domain, result);
	}
	public boolean testSecondoperand(EIfcbooleanresult type) throws SdaiException {
		return test_instance(a2);
	}

	public EEntity getSecondoperand(EIfcbooleanresult type) throws SdaiException { // case 1
		return get_instance_select(a2);
	}

	public void setSecondoperand(EIfcbooleanresult type, EEntity value) throws SdaiException { // case 1
		a2 = set_instance(a2, value);
	}

	public void unsetSecondoperand(EIfcbooleanresult type) throws SdaiException {
		a2 = unset_instance(a2);
	}

	public static jsdai.dictionary.EAttribute attributeSecondoperand(EIfcbooleanresult type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #3453=DERIVED_ATTRIBUTE('Dim',#3448,0,#2485,$);
	//<01> generating methods for consolidated attribute:  Dim
	//<01-0> current entity
	//<01-0-1> derived attribute
	//<01-0-1-1> NOT explicit-to-derived - generateDerivedCurrentEntityMethodsX()
	// methods for derived attribute: Dim, base type: INTEGER
	public boolean testDim(EIfcbooleanresult type) throws SdaiException {
			throw new SdaiException(SdaiException.FN_NAVL);
	}
	public Value getDim(EIfcbooleanresult type, SdaiContext _context) throws SdaiException {




//###-01 jc.generated_java: Value.alloc(jsdai.SIfc4.SIfc4._st_IfcBooleanOperand).set(_context, get(a1$)).getAttribute("dim", _context)
				return (Value.alloc(jsdai.SIfc4.SIfc4._st_IfcBooleanOperand).set(_context, get(a1$)).getAttribute("dim", _context));
	}
	public int getDim(EIfcbooleanresult type) throws SdaiException {
		SdaiContext _context = this.findEntityInstanceSdaiModel().getRepository().getSession().getSdaiContext();
			return getDim((EIfcbooleanresult)null, _context).getInteger();
	}
	public static jsdai.dictionary.EAttribute attributeDim(EIfcbooleanresult type) throws SdaiException {
		return d0$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = 0;
			a1 = unset_instance(a1);
			a2 = unset_instance(a2);
			return;
		}
		a0 = av.entityValues[0].getEnumeration(0, a0$);
		a1 = av.entityValues[0].getInstance(1, this, a1$);
		a2 = av.entityValues[0].getInstance(2, this, a2$);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = 0;
			a1 = unset_instance(a1);
			a2 = unset_instance(a2);
			return;
		}
		a0 = av.entityValues[0].getEnumeration(0, a0$);
		a1 = av.entityValues[0].getInstance(1, this, a1$);
		a2 = av.entityValues[0].getInstance(2, this, a2$);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcBooleanResult
		av.entityValues[0].setEnumeration(0, a0, a0$);
		av.entityValues[0].setInstance(1, a1);
		av.entityValues[0].setInstance(2, a2);
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcBooleanResult
		av.entityValues[0].setEnumeration(0, a0, a0$);
		av.entityValues[0].setInstance(1, a1);
		av.entityValues[0].setInstance(2, a2);
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfcbooleanresultSamedim(SdaiContext _context) throws SdaiException {
	






		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(jsdai.SIfc4.SIfc4._st_IfcBooleanOperand).set(_context, get(a1$)).getAttribute("dim", _context), Value.alloc(jsdai.SIfc4.SIfc4._st_IfcBooleanOperand).set(_context, get(a2$)).getAttribute("dim", _context))).getLogical());
	}
}
