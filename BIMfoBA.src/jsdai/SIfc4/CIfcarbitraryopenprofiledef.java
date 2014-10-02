/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcArbitraryOpenProfileDef

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcarbitraryopenprofiledef extends CIfcprofiledef implements EIfcarbitraryopenprofiledef {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcarbitraryopenprofiledef.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// ProfileType: protected int a0;   ProfileType - java inheritance - ENUMERATION IfcProfileTypeEnum
	// ProfileName: protected String a1;   ProfileName - java inheritance - STRING
	// HasExternalReference: protected Object  - inverse - java inheritance -  ENTITY IfcExternalReferenceRelationship
	// HasProperties: protected Object  - inverse - java inheritance -  ENTITY IfcProfileProperties
	protected Object a2; // Curve - current entity - ENTITY IfcBoundedCurve
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// ProfileType - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected int a0;
	// ProfileName - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected String a1;
	// HasExternalReference - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// HasProperties - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// Curve - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected Object a2;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a2 == old) {
			a2 = newer;
		}
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a2 == old) {
			a2 = newer;
		}
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #5070=EXPLICIT_ATTRIBUTE('ProfileType',#5068,0,#2963,$,.F.);
	//<01> generating methods for consolidated attribute:  ProfileType
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5071=EXPLICIT_ATTRIBUTE('ProfileName',#5068,1,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  ProfileName
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5072=INVERSE_ATTRIBUTE('HasExternalReference',#5068,0,#4231,$,#4234,#8892,$,.F.);
	//<01> generating methods for consolidated attribute:  HasExternalReference
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5073=INVERSE_ATTRIBUTE('HasProperties',#5068,1,#5074,$,#5076,#8894,$,.F.);
	//<01> generating methods for consolidated attribute:  HasProperties
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3339=EXPLICIT_ATTRIBUTE('Curve',#3337,0,#3483,$,.F.);
	//<01> generating methods for consolidated attribute:  Curve
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : Curve, base type: entity IfcBoundedCurve
	public static int usedinCurve(EIfcarbitraryopenprofiledef type, EIfcboundedcurve instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a2$, domain, result);
	}
	public boolean testCurve(EIfcarbitraryopenprofiledef type) throws SdaiException {
		return test_instance(a2);
	}
	public EIfcboundedcurve getCurve(EIfcarbitraryopenprofiledef type) throws SdaiException {
		return (EIfcboundedcurve)get_instance(a2);
	}
	public void setCurve(EIfcarbitraryopenprofiledef type, EIfcboundedcurve value) throws SdaiException {
		a2 = set_instance(a2, value);
	}
	public void unsetCurve(EIfcarbitraryopenprofiledef type) throws SdaiException {
		a2 = unset_instance(a2);
	}
	public static jsdai.dictionary.EAttribute attributeCurve(EIfcarbitraryopenprofiledef type) throws SdaiException {
		return a2$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a2 = unset_instance(a2);
			a0 = 0;
			a1 = null;
			return;
		}
		a2 = av.entityValues[0].getInstance(0, this, a2$);
		a0 = av.entityValues[1].getEnumeration(0, a0$);
		a1 = av.entityValues[1].getString(1);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a2 = unset_instance(a2);
			a0 = 0;
			a1 = null;
			return;
		}
		a2 = av.entityValues[0].getInstance(0, this, a2$);
		a0 = av.entityValues[1].getEnumeration(0, a0$);
		a1 = av.entityValues[1].getString(1);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcArbitraryOpenProfileDef
		av.entityValues[0].setInstance(0, a2);
		// partial entity: IfcProfileDef
		av.entityValues[1].setEnumeration(0, a0, a0$);
		av.entityValues[1].setString(1, a1);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcArbitraryOpenProfileDef
		av.entityValues[0].setInstance(0, a2);
		// partial entity: IfcProfileDef
		av.entityValues[1].setEnumeration(0, a0, a0$);
		av.entityValues[1].setString(1, a1);
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfcarbitraryopenprofiledefWr12(SdaiContext _context) throws SdaiException {
	




		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(jsdai.SIfc4.CIfcboundedcurve.definition).set(_context, get(a2$)).getAttribute(jsdai.SIfc4.CIfccurve.attributeDim(null), _context), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 2))).getLogical());
	}
	public int rIfcarbitraryopenprofiledefWr11(SdaiContext _context) throws SdaiException {
	



		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).OR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCCENTERLINEPROFILEDEF", "IFC4"), Value.alloc(jsdai.SIfc4.CIfcarbitraryopenprofiledef.definition).set(_context, this).typeOfV(_context)), Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(jsdai.SIfc4.CIfcarbitraryopenprofiledef.definition).set(_context, this).groupReference(_context, jsdai.SIfc4.CIfcprofiledef.class).getAttribute(jsdai.SIfc4.CIfcprofiledef.attributeProfiletype(null), _context), Value.alloc(jsdai.SIfc4.SIfc4._st_IfcProfileTypeEnum).setEnum(_context, "CURVE")))).getLogical());
	}
}
