/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcQuantityVolume

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcquantityvolume extends CIfcphysicalsimplequantity implements EIfcquantityvolume {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcquantityvolume.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// Name: protected String a0;   Name - java inheritance - STRING
	// Description: protected String a1;   Description - java inheritance - STRING
	// HasExternalReferences: protected Object  - inverse - java inheritance -  ENTITY IfcExternalReferenceRelationship
	// PartOfComplex: protected Object  - inverse - java inheritance -  ENTITY IfcPhysicalComplexQuantity
	// Unit: protected Object a2;   Unit - java inheritance - ENTITY IfcNamedUnit
	protected double a3; // VolumeValue - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected String a4; // Formula - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// Name - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected String a0;
	// Description - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected String a1;
	// HasExternalReferences - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// PartOfComplex - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// Unit - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	// protected Object a2;
	// VolumeValue - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected double a3;
	// Formula - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected String a4;

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

	//going through all the attributes: #4918=EXPLICIT_ATTRIBUTE('Name',#4916,0,#2539,$,.F.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4919=EXPLICIT_ATTRIBUTE('Description',#4916,1,#2657,$,.T.);
	//<01> generating methods for consolidated attribute:  Description
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4920=INVERSE_ATTRIBUTE('HasExternalReferences',#4916,0,#4231,$,#4234,#8755,$,.F.);
	//<01> generating methods for consolidated attribute:  HasExternalReferences
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4921=INVERSE_ATTRIBUTE('PartOfComplex',#4916,1,#4910,$,#4912,#8757,#8758,.F.);
	//<01> generating methods for consolidated attribute:  PartOfComplex
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4924=EXPLICIT_ATTRIBUTE('Unit',#4922,0,#4778,$,.T.);
	//<01> generating methods for consolidated attribute:  Unit
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): Unit, base type: entity IfcNamedUnit
	public static int usedinUnit(EIfcphysicalsimplequantity type, EIfcnamedunit instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a2$, domain, result);
	}
	//going through all the attributes: #5211=EXPLICIT_ATTRIBUTE('VolumeValue',#5209,0,#2691,$,.F.);
	//<01> generating methods for consolidated attribute:  VolumeValue
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: VolumeValue, base type: REAL
	public boolean testVolumevalue(EIfcquantityvolume type) throws SdaiException {
		return test_double(a3);
	}
	public double getVolumevalue(EIfcquantityvolume type) throws SdaiException {
		return get_double(a3);
	}
	public void setVolumevalue(EIfcquantityvolume type, double value) throws SdaiException {
		a3 = set_double(value);
	}
	public void unsetVolumevalue(EIfcquantityvolume type) throws SdaiException {
		a3 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributeVolumevalue(EIfcquantityvolume type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #5212=EXPLICIT_ATTRIBUTE('Formula',#5209,1,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Formula
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Formula, base type: STRING
	public boolean testFormula(EIfcquantityvolume type) throws SdaiException {
		return test_string(a4);
	}
	public String getFormula(EIfcquantityvolume type) throws SdaiException {
		return get_string(a4);
	}
	public void setFormula(EIfcquantityvolume type, String value) throws SdaiException {
		a4 = set_string(value);
	}
	public void unsetFormula(EIfcquantityvolume type) throws SdaiException {
		a4 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeFormula(EIfcquantityvolume type) throws SdaiException {
		return a4$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = null;
			a2 = unset_instance(a2);
			a3 = Double.NaN;
			a4 = null;
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = av.entityValues[0].getString(1);
		a2 = av.entityValues[1].getInstance(0, this, a2$);
		a3 = av.entityValues[2].getDouble(0);
		a4 = av.entityValues[2].getString(1);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = null;
			a2 = unset_instance(a2);
			a3 = Double.NaN;
			a4 = null;
			return;
		}
		a0 = av.entityValues[0].getString(0);
		a1 = av.entityValues[0].getString(1);
		a2 = av.entityValues[1].getInstance(0, this, a2$);
		a3 = av.entityValues[2].getDouble(0);
		a4 = av.entityValues[2].getString(1);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcPhysicalQuantity
		av.entityValues[0].setString(0, a0);
		av.entityValues[0].setString(1, a1);
		// partial entity: IfcPhysicalSimpleQuantity
		av.entityValues[1].setInstance(0, a2);
		// partial entity: IfcQuantityVolume
		av.entityValues[2].setDouble(0, a3);
		av.entityValues[2].setString(1, a4);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcPhysicalQuantity
		av.entityValues[0].setString(0, a0);
		av.entityValues[0].setString(1, a1);
		// partial entity: IfcPhysicalSimpleQuantity
		av.entityValues[1].setInstance(0, a2);
		// partial entity: IfcQuantityVolume
		av.entityValues[2].setDouble(0, a3);
		av.entityValues[2].setString(1, a4);
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfcquantityvolumeWr22(SdaiContext _context) throws SdaiException {
	



		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).gequal(_context, Value.alloc(jsdai.SIfc4.SIfc4._st_IfcVolumeMeasure).set(_context, get(a3$)), Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 0.0))).getLogical());
	}
	public int rIfcquantityvolumeWr21(SdaiContext _context) throws SdaiException {
	





		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).OR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).NOT(Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.CIfcquantityvolume.definition).set(_context, this).groupReference(_context, jsdai.SIfc4.CIfcphysicalsimplequantity.class).getAttribute(jsdai.SIfc4.CIfcphysicalsimplequantity.attributeUnit(null), _context))), Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(jsdai.SIfc4.CIfcquantityvolume.definition).set(_context, this).groupReference(_context, jsdai.SIfc4.CIfcphysicalsimplequantity.class).getAttribute(jsdai.SIfc4.CIfcphysicalsimplequantity.attributeUnit(null), _context).getAttribute(jsdai.SIfc4.CIfcnamedunit.attributeUnittype(null), _context), Value.alloc(jsdai.SIfc4.SIfc4._st_IfcUnitEnum).setEnum(_context, "VOLUMEUNIT")))).getLogical());
	}
}
