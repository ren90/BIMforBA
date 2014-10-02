/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcObjectDefinition

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcobjectdefinition extends CIfcroot implements EIfcobjectdefinition {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcobjectdefinition.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// GlobalId: protected String a0;   GlobalId - java inheritance - STRING
	// OwnerHistory: protected Object a1;   OwnerHistory - java inheritance - ENTITY IfcOwnerHistory
	// Name: protected String a2;   Name - java inheritance - STRING
	// Description: protected String a3;   Description - java inheritance - STRING
	// HasAssignments: protected Object  - inverse - current -  ENTITY IfcRelAssigns
	protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// Nests: protected Object  - inverse - current -  ENTITY IfcRelNests
	protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// IsNestedBy: protected Object  - inverse - current -  ENTITY IfcRelNests
	protected static final jsdai.dictionary.CInverse_attribute i2$ = CEntity.initInverseAttribute(definition, 2);
	// HasContext: protected Object  - inverse - current -  ENTITY IfcRelDeclares
	protected static final jsdai.dictionary.CInverse_attribute i3$ = CEntity.initInverseAttribute(definition, 3);
	// IsDecomposedBy: protected Object  - inverse - current -  ENTITY IfcRelAggregates
	protected static final jsdai.dictionary.CInverse_attribute i4$ = CEntity.initInverseAttribute(definition, 4);
	// Decomposes: protected Object  - inverse - current -  ENTITY IfcRelAggregates
	protected static final jsdai.dictionary.CInverse_attribute i5$ = CEntity.initInverseAttribute(definition, 5);
	// HasAssociations: protected Object  - inverse - current -  ENTITY IfcRelAssociates
	protected static final jsdai.dictionary.CInverse_attribute i6$ = CEntity.initInverseAttribute(definition, 6);
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
	// HasAssignments - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// Nests - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// IsNestedBy - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i2$ = CEntity.initInverseAttribute(definition, 2);
	// HasContext - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i3$ = CEntity.initInverseAttribute(definition, 3);
	// IsDecomposedBy - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i4$ = CEntity.initInverseAttribute(definition, 4);
	// Decomposes - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i5$ = CEntity.initInverseAttribute(definition, 5);
	// HasAssociations - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i6$ = CEntity.initInverseAttribute(definition, 6);

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
	//going through all the attributes: #4791=INVERSE_ATTRIBUTE('HasAssignments',#4789,0,#5348,$,#5350,#8672,$,.F.);
	//<01> generating methods for consolidated attribute:  HasAssignments
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	// Inverse attribute - HasAssignments : SET[0:-2147483648] OF IfcRelAssigns FOR RelatedObjects
	public AIfcrelassigns getHasassignments(EIfcobjectdefinition type, ASdaiModel domain) throws SdaiException {
		AIfcrelassigns result = (AIfcrelassigns)get_inverse_aggregate(i0$);
		CIfcrelassigns.usedinRelatedobjects(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributeHasassignments(EIfcobjectdefinition type) throws SdaiException {
		return i0$;
	}

	//going through all the attributes: #4792=INVERSE_ATTRIBUTE('Nests',#4789,1,#5489,$,#5492,#8674,#8675,.F.);
	//<01> generating methods for consolidated attribute:  Nests
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	public AIfcrelnests getNests(EIfcobjectdefinition type, ASdaiModel domain) throws SdaiException {
		AIfcrelnests result = (AIfcrelnests)get_inverse_aggregate(i1$);
		CIfcrelnests.usedinRelatedobjects(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributeNests(EIfcobjectdefinition type) throws SdaiException {
		return i1$;
	}

	//going through all the attributes: #4793=INVERSE_ATTRIBUTE('IsNestedBy',#4789,2,#5489,$,#5491,#8677,$,.F.);
	//<01> generating methods for consolidated attribute:  IsNestedBy
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	// Inverse attribute - IsNestedBy : SET[0:-2147483648] OF IfcRelNests FOR RelatingObject
	public AIfcrelnests getIsnestedby(EIfcobjectdefinition type, ASdaiModel domain) throws SdaiException {
		AIfcrelnests result = (AIfcrelnests)get_inverse_aggregate(i2$);
		CIfcrelnests.usedinRelatingobject(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributeIsnestedby(EIfcobjectdefinition type) throws SdaiException {
		return i2$;
	}

	//going through all the attributes: #4794=INVERSE_ATTRIBUTE('HasContext',#4789,3,#5450,$,#5453,#8679,#8680,.F.);
	//<01> generating methods for consolidated attribute:  HasContext
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	public AIfcreldeclares getHascontext(EIfcobjectdefinition type, ASdaiModel domain) throws SdaiException {
		AIfcreldeclares result = (AIfcreldeclares)get_inverse_aggregate(i3$);
		CIfcreldeclares.usedinRelateddefinitions(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributeHascontext(EIfcobjectdefinition type) throws SdaiException {
		return i3$;
	}

	//going through all the attributes: #4795=INVERSE_ATTRIBUTE('IsDecomposedBy',#4789,4,#5344,$,#5346,#8682,$,.F.);
	//<01> generating methods for consolidated attribute:  IsDecomposedBy
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	// Inverse attribute - IsDecomposedBy : SET[0:-2147483648] OF IfcRelAggregates FOR RelatingObject
	public AIfcrelaggregates getIsdecomposedby(EIfcobjectdefinition type, ASdaiModel domain) throws SdaiException {
		AIfcrelaggregates result = (AIfcrelaggregates)get_inverse_aggregate(i4$);
		CIfcrelaggregates.usedinRelatingobject(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributeIsdecomposedby(EIfcobjectdefinition type) throws SdaiException {
		return i4$;
	}

	//going through all the attributes: #4796=INVERSE_ATTRIBUTE('Decomposes',#4789,5,#5344,$,#5347,#8684,#8685,.F.);
	//<01> generating methods for consolidated attribute:  Decomposes
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	public AIfcrelaggregates getDecomposes(EIfcobjectdefinition type, ASdaiModel domain) throws SdaiException {
		AIfcrelaggregates result = (AIfcrelaggregates)get_inverse_aggregate(i5$);
		CIfcrelaggregates.usedinRelatedobjects(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributeDecomposes(EIfcobjectdefinition type) throws SdaiException {
		return i5$;
	}

	//going through all the attributes: #4797=INVERSE_ATTRIBUTE('HasAssociations',#4789,6,#5375,$,#5377,#8687,$,.F.);
	//<01> generating methods for consolidated attribute:  HasAssociations
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	// Inverse attribute - HasAssociations : SET[0:-2147483648] OF IfcRelAssociates FOR RelatedObjects
	public AIfcrelassociates getHasassociations(EIfcobjectdefinition type, ASdaiModel domain) throws SdaiException {
		AIfcrelassociates result = (AIfcrelassociates)get_inverse_aggregate(i6$);
		CIfcrelassociates.usedinRelatedobjects(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributeHasassociations(EIfcobjectdefinition type) throws SdaiException {
		return i6$;
	}


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
		a0 = av.entityValues[1].getString(0);
		a1 = av.entityValues[1].getInstance(1, this, a1$);
		a2 = av.entityValues[1].getString(2);
		a3 = av.entityValues[1].getString(3);
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
		a0 = av.entityValues[1].getString(0);
		a1 = av.entityValues[1].getInstance(1, this, a1$);
		a2 = av.entityValues[1].getString(2);
		a3 = av.entityValues[1].getString(3);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcObjectDefinition
		// partial entity: IfcRoot
		av.entityValues[1].setString(0, a0);
		av.entityValues[1].setInstance(1, a1);
		av.entityValues[1].setString(2, a2);
		av.entityValues[1].setString(3, a3);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcObjectDefinition
		// partial entity: IfcRoot
		av.entityValues[1].setString(0, a0);
		av.entityValues[1].setInstance(1, a1);
		av.entityValues[1].setString(2, a2);
		av.entityValues[1].setString(3, a3);
	}
}
