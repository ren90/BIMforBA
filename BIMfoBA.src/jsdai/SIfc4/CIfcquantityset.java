/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcQuantitySet

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcquantityset extends CIfcpropertysetdefinition implements EIfcquantityset {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcquantityset.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// GlobalId: protected String a0;   GlobalId - java inheritance - STRING
	// OwnerHistory: protected Object a1;   OwnerHistory - java inheritance - ENTITY IfcOwnerHistory
	// Name: protected String a2;   Name - java inheritance - STRING
	// Description: protected String a3;   Description - java inheritance - STRING
	// HasContext: protected Object  - inverse - java inheritance -  ENTITY IfcRelDeclares
	// HasAssociations: protected Object  - inverse - java inheritance -  ENTITY IfcRelAssociates
	// DefinesType: protected Object  - inverse - java inheritance -  ENTITY IfcTypeObject
	// IsDefinedBy: protected Object  - inverse - java inheritance -  ENTITY IfcRelDefinesByTemplate
	// DefinesOccurrence: protected Object  - inverse - java inheritance -  ENTITY IfcRelDefinesByProperties
*/

	/*----------------------------- Attributes (new version) -----------*/

	// GlobalId - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected String a0;
	// OwnerHistory - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected Object a1;
	// Name - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	// protected String a2;
	// Description - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	// protected String a3;
	// HasContext - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// HasAssociations - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// DefinesType - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i2$ = CEntity.initInverseAttribute(definition, 2);
	// IsDefinedBy - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i3$ = CEntity.initInverseAttribute(definition, 3);
	// DefinesOccurrence - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i4$ = CEntity.initInverseAttribute(definition, 4);

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

	//going through all the attributes: #5618=EXPLICIT_ATTRIBUTE('GlobalId',#5616,0,#2517,$,.F.);
	//<01> generating methods for consolidated attribute:  GlobalId
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5619=EXPLICIT_ATTRIBUTE('OwnerHistory',#5616,1,#4858,$,.T.);
	//<01> generating methods for consolidated attribute:  OwnerHistory
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): OwnerHistory, base type: entity IfcOwnerHistory
	public static int usedinOwnerhistory(EIfcroot type, EIfcownerhistory instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a1$, domain, result);
	}
	//going through all the attributes: #5620=EXPLICIT_ATTRIBUTE('Name',#5616,2,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5621=EXPLICIT_ATTRIBUTE('Description',#5616,3,#2657,$,.T.);
	//<01> generating methods for consolidated attribute:  Description
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5113=INVERSE_ATTRIBUTE('HasContext',#5111,0,#5450,$,#5453,#8928,#8929,.F.);
	//<01> generating methods for consolidated attribute:  HasContext
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5114=INVERSE_ATTRIBUTE('HasAssociations',#5111,1,#5375,$,#5377,#8931,$,.F.);
	//<01> generating methods for consolidated attribute:  HasAssociations
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5142=INVERSE_ATTRIBUTE('DefinesType',#5140,0,#6270,$,#6273,#8952,$,.F.);
	//<01> generating methods for consolidated attribute:  DefinesType
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5143=INVERSE_ATTRIBUTE('IsDefinedBy',#5140,1,#5466,$,#5468,#8954,$,.F.);
	//<01> generating methods for consolidated attribute:  IsDefinedBy
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5144=INVERSE_ATTRIBUTE('DefinesOccurrence',#5140,2,#5462,$,#5465,#8956,#8957,.F.);
	//<01> generating methods for consolidated attribute:  DefinesOccurrence
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()

	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = unset_instance(a1);
			a2 = null;
			a3 = null;
			return;
		}
		a0 = av.entityValues[3].getString(0);
		a1 = av.entityValues[3].getInstance(1, this, a1$);
		a2 = av.entityValues[3].getString(2);
		a3 = av.entityValues[3].getString(3);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = unset_instance(a1);
			a2 = null;
			a3 = null;
			return;
		}
		a0 = av.entityValues[3].getString(0);
		a1 = av.entityValues[3].getInstance(1, this, a1$);
		a2 = av.entityValues[3].getString(2);
		a3 = av.entityValues[3].getString(3);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcPropertyDefinition
		// partial entity: IfcPropertySetDefinition
		// partial entity: IfcQuantitySet
		// partial entity: IfcRoot
		av.entityValues[3].setString(0, a0);
		av.entityValues[3].setInstance(1, a1);
		av.entityValues[3].setString(2, a2);
		av.entityValues[3].setString(3, a3);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcPropertyDefinition
		// partial entity: IfcPropertySetDefinition
		// partial entity: IfcQuantitySet
		// partial entity: IfcRoot
		av.entityValues[3].setString(0, a0);
		av.entityValues[3].setInstance(1, a1);
		av.entityValues[3].setString(2, a2);
		av.entityValues[3].setString(3, a3);
	}
}
