/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcStructuralSurfaceConnection

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcstructuralsurfaceconnection extends CIfcstructuralconnection implements EIfcstructuralsurfaceconnection {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcstructuralsurfaceconnection.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// GlobalId: protected String a0;   GlobalId - java inheritance - STRING
	// OwnerHistory: protected Object a1;   OwnerHistory - java inheritance - ENTITY IfcOwnerHistory
	// Name: protected String a2;   Name - java inheritance - STRING
	// Description: protected String a3;   Description - java inheritance - STRING
	// HasAssignments: protected Object  - inverse - java inheritance -  ENTITY IfcRelAssigns
	// Nests: protected Object  - inverse - java inheritance -  ENTITY IfcRelNests
	// IsNestedBy: protected Object  - inverse - java inheritance -  ENTITY IfcRelNests
	// HasContext: protected Object  - inverse - java inheritance -  ENTITY IfcRelDeclares
	// IsDecomposedBy: protected Object  - inverse - java inheritance -  ENTITY IfcRelAggregates
	// Decomposes: protected Object  - inverse - java inheritance -  ENTITY IfcRelAggregates
	// HasAssociations: protected Object  - inverse - java inheritance -  ENTITY IfcRelAssociates
	// ObjectType: protected String a4;   ObjectType - java inheritance - STRING
	// IsDeclaredBy: protected Object  - inverse - java inheritance -  ENTITY IfcRelDefinesByObject
	// Declares: protected Object  - inverse - java inheritance -  ENTITY IfcRelDefinesByObject
	// IsTypedBy: protected Object  - inverse - java inheritance -  ENTITY IfcRelDefinesByType
	// IsDefinedBy: protected Object  - inverse - java inheritance -  ENTITY IfcRelDefinesByProperties
	// ObjectPlacement: protected Object a5;   ObjectPlacement - java inheritance - ENTITY IfcObjectPlacement
	// Representation: protected Object a6;   Representation - java inheritance - ENTITY IfcProductRepresentation
	// ReferencedBy: protected Object  - inverse - java inheritance -  ENTITY IfcRelAssignsToProduct
	// AssignedStructuralActivity: protected Object  - inverse - java inheritance -  ENTITY IfcRelConnectsStructuralActivity
	// AppliedCondition: protected Object a7;   AppliedCondition - java inheritance - ENTITY IfcBoundaryCondition
	// ConnectsStructuralMembers: protected Object  - inverse - java inheritance -  ENTITY IfcRelConnectsStructuralMember
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
	// HasAssignments - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// Nests - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// IsNestedBy - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i2$ = CEntity.initInverseAttribute(definition, 2);
	// HasContext - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i3$ = CEntity.initInverseAttribute(definition, 3);
	// IsDecomposedBy - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i4$ = CEntity.initInverseAttribute(definition, 4);
	// Decomposes - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i5$ = CEntity.initInverseAttribute(definition, 5);
	// HasAssociations - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i6$ = CEntity.initInverseAttribute(definition, 6);
	// ObjectType - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	// protected String a4;
	// IsDeclaredBy - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i7$ = CEntity.initInverseAttribute(definition, 7);
	// Declares - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i8$ = CEntity.initInverseAttribute(definition, 8);
	// IsTypedBy - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i9$ = CEntity.initInverseAttribute(definition, 9);
	// IsDefinedBy - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i10$ = CEntity.initInverseAttribute(definition, 10);
	// ObjectPlacement - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	// protected Object a5;
	// Representation - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	// protected Object a6;
	// ReferencedBy - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i11$ = CEntity.initInverseAttribute(definition, 11);
	// AssignedStructuralActivity - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i12$ = CEntity.initInverseAttribute(definition, 12);
	// AppliedCondition - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	// protected Object a7;
	// ConnectsStructuralMembers - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i13$ = CEntity.initInverseAttribute(definition, 13);

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
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4792=INVERSE_ATTRIBUTE('Nests',#4789,1,#5489,$,#5492,#8674,#8675,.F.);
	//<01> generating methods for consolidated attribute:  Nests
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4793=INVERSE_ATTRIBUTE('IsNestedBy',#4789,2,#5489,$,#5491,#8677,$,.F.);
	//<01> generating methods for consolidated attribute:  IsNestedBy
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4794=INVERSE_ATTRIBUTE('HasContext',#4789,3,#5450,$,#5453,#8679,#8680,.F.);
	//<01> generating methods for consolidated attribute:  HasContext
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4795=INVERSE_ATTRIBUTE('IsDecomposedBy',#4789,4,#5344,$,#5346,#8682,$,.F.);
	//<01> generating methods for consolidated attribute:  IsDecomposedBy
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4796=INVERSE_ATTRIBUTE('Decomposes',#4789,5,#5344,$,#5347,#8684,#8685,.F.);
	//<01> generating methods for consolidated attribute:  Decomposes
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4797=INVERSE_ATTRIBUTE('HasAssociations',#4789,6,#5375,$,#5377,#8687,$,.F.);
	//<01> generating methods for consolidated attribute:  HasAssociations
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4784=EXPLICIT_ATTRIBUTE('ObjectType',#4782,0,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  ObjectType
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4785=INVERSE_ATTRIBUTE('IsDeclaredBy',#4782,0,#5458,$,#5460,#8660,#8661,.F.);
	//<01> generating methods for consolidated attribute:  IsDeclaredBy
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4786=INVERSE_ATTRIBUTE('Declares',#4782,1,#5458,$,#5461,#8663,$,.F.);
	//<01> generating methods for consolidated attribute:  Declares
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4787=INVERSE_ATTRIBUTE('IsTypedBy',#4782,2,#5470,$,#5472,#8665,#8666,.F.);
	//<01> generating methods for consolidated attribute:  IsTypedBy
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4788=INVERSE_ATTRIBUTE('IsDefinedBy',#4782,3,#5462,$,#5464,#8668,$,.F.);
	//<01> generating methods for consolidated attribute:  IsDefinedBy
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5056=EXPLICIT_ATTRIBUTE('ObjectPlacement',#5054,0,#4798,$,.T.);
	//<01> generating methods for consolidated attribute:  ObjectPlacement
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): ObjectPlacement, base type: entity IfcObjectPlacement
	public static int usedinObjectplacement(EIfcproduct type, EIfcobjectplacement instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a5$, domain, result);
	}
	//going through all the attributes: #5057=EXPLICIT_ATTRIBUTE('Representation',#5054,1,#5063,$,.T.);
	//<01> generating methods for consolidated attribute:  Representation
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): Representation, base type: entity IfcProductRepresentation
	public static int usedinRepresentation(EIfcproduct type, EIfcproductrepresentation instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a6$, domain, result);
	}
	//going through all the attributes: #5058=INVERSE_ATTRIBUTE('ReferencedBy',#5054,0,#5369,$,#5371,#8877,$,.F.);
	//<01> generating methods for consolidated attribute:  ReferencedBy
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5833=INVERSE_ATTRIBUTE('AssignedStructuralActivity',#5831,0,#5419,$,#5421,#9428,$,.F.);
	//<01> generating methods for consolidated attribute:  AssignedStructuralActivity
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5810=EXPLICIT_ATTRIBUTE('AppliedCondition',#5808,0,#3454,$,.T.);
	//<01> generating methods for consolidated attribute:  AppliedCondition
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): AppliedCondition, base type: entity IfcBoundaryCondition
	public static int usedinAppliedcondition(EIfcstructuralconnection type, EIfcboundarycondition instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a7$, domain, result);
	}
	//going through all the attributes: #5811=INVERSE_ATTRIBUTE('ConnectsStructuralMembers',#5808,0,#5423,$,#5426,#9406,$,.F.);
	//<01> generating methods for consolidated attribute:  ConnectsStructuralMembers
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()

	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a4 = null;
			a5 = unset_instance(a5);
			a6 = unset_instance(a6);
			a0 = null;
			a1 = unset_instance(a1);
			a2 = null;
			a3 = null;
			a7 = unset_instance(a7);
			return;
		}
		a4 = av.entityValues[0].getString(0);
		a5 = av.entityValues[2].getInstance(0, this, a5$);
		a6 = av.entityValues[2].getInstance(1, this, a6$);
		a0 = av.entityValues[3].getString(0);
		a1 = av.entityValues[3].getInstance(1, this, a1$);
		a2 = av.entityValues[3].getString(2);
		a3 = av.entityValues[3].getString(3);
		a7 = av.entityValues[4].getInstance(0, this, a7$);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a4 = null;
			a5 = unset_instance(a5);
			a6 = unset_instance(a6);
			a0 = null;
			a1 = unset_instance(a1);
			a2 = null;
			a3 = null;
			a7 = unset_instance(a7);
			return;
		}
		a4 = av.entityValues[0].getString(0);
		a5 = av.entityValues[2].getInstance(0, this, a5$);
		a6 = av.entityValues[2].getInstance(1, this, a6$);
		a0 = av.entityValues[3].getString(0);
		a1 = av.entityValues[3].getInstance(1, this, a1$);
		a2 = av.entityValues[3].getString(2);
		a3 = av.entityValues[3].getString(3);
		a7 = av.entityValues[4].getInstance(0, this, a7$);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcObject
		av.entityValues[0].setString(0, a4);
		// partial entity: IfcObjectDefinition
		// partial entity: IfcProduct
		av.entityValues[2].setInstance(0, a5);
		av.entityValues[2].setInstance(1, a6);
		// partial entity: IfcRoot
		av.entityValues[3].setString(0, a0);
		av.entityValues[3].setInstance(1, a1);
		av.entityValues[3].setString(2, a2);
		av.entityValues[3].setString(3, a3);
		// partial entity: IfcStructuralConnection
		av.entityValues[4].setInstance(0, a7);
		// partial entity: IfcStructuralItem
		// partial entity: IfcStructuralSurfaceConnection
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcObject
		av.entityValues[0].setString(0, a4);
		// partial entity: IfcObjectDefinition
		// partial entity: IfcProduct
		av.entityValues[2].setInstance(0, a5);
		av.entityValues[2].setInstance(1, a6);
		// partial entity: IfcRoot
		av.entityValues[3].setString(0, a0);
		av.entityValues[3].setInstance(1, a1);
		av.entityValues[3].setString(2, a2);
		av.entityValues[3].setString(3, a3);
		// partial entity: IfcStructuralConnection
		av.entityValues[4].setInstance(0, a7);
		// partial entity: IfcStructuralItem
		// partial entity: IfcStructuralSurfaceConnection
	}
}
