/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcController

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfccontroller extends CIfcdistributioncontrolelement implements EIfccontroller {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfccontroller.class, SIfc4.ss);

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
	// Tag: protected String a7;   Tag - java inheritance - STRING
	// FillsVoids: protected Object  - inverse - java inheritance -  ENTITY IfcRelFillsElement
	// ConnectedTo: protected Object  - inverse - java inheritance -  ENTITY IfcRelConnectsElements
	// IsInterferedByElements: protected Object  - inverse - java inheritance -  ENTITY IfcRelInterferesElements
	// InterferesElements: protected Object  - inverse - java inheritance -  ENTITY IfcRelInterferesElements
	// HasProjections: protected Object  - inverse - java inheritance -  ENTITY IfcRelProjectsElement
	// ReferencedInStructures: protected Object  - inverse - java inheritance -  ENTITY IfcRelReferencedInSpatialStructure
	// HasOpenings: protected Object  - inverse - java inheritance -  ENTITY IfcRelVoidsElement
	// IsConnectionRealization: protected Object  - inverse - java inheritance -  ENTITY IfcRelConnectsWithRealizingElements
	// ProvidesBoundaries: protected Object  - inverse - java inheritance -  ENTITY IfcRelSpaceBoundary
	// ConnectedFrom: protected Object  - inverse - java inheritance -  ENTITY IfcRelConnectsElements
	// ContainedInStructure: protected Object  - inverse - java inheritance -  ENTITY IfcRelContainedInSpatialStructure
	// HasPorts: protected Object  - inverse - java inheritance -  ENTITY IfcRelConnectsPortToElement
	// AssignedToFlowElement: protected Object  - inverse - java inheritance -  ENTITY IfcRelFlowControlElements
	protected int a8; // PredefinedType - current entity - ENUMERATION IfcControllerTypeEnum
	protected static final jsdai.dictionary.CExplicit_attribute a8$ = CEntity.initExplicitAttribute(definition, 8);
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
	// Tag - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	// protected String a7;
	// FillsVoids - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i12$ = CEntity.initInverseAttribute(definition, 12);
	// ConnectedTo - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i13$ = CEntity.initInverseAttribute(definition, 13);
	// IsInterferedByElements - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i14$ = CEntity.initInverseAttribute(definition, 14);
	// InterferesElements - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i15$ = CEntity.initInverseAttribute(definition, 15);
	// HasProjections - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i16$ = CEntity.initInverseAttribute(definition, 16);
	// ReferencedInStructures - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i17$ = CEntity.initInverseAttribute(definition, 17);
	// HasOpenings - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i18$ = CEntity.initInverseAttribute(definition, 18);
	// IsConnectionRealization - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i19$ = CEntity.initInverseAttribute(definition, 19);
	// ProvidesBoundaries - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i20$ = CEntity.initInverseAttribute(definition, 20);
	// ConnectedFrom - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i21$ = CEntity.initInverseAttribute(definition, 21);
	// ContainedInStructure - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i22$ = CEntity.initInverseAttribute(definition, 22);
	// HasPorts - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i23$ = CEntity.initInverseAttribute(definition, 23);
	// AssignedToFlowElement - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i24$ = CEntity.initInverseAttribute(definition, 24);
	// PredefinedType - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a8$ = CEntity.initExplicitAttribute(definition, 8);
	protected int a8;

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
	//going through all the attributes: #4138=EXPLICIT_ATTRIBUTE('Tag',#4136,0,#2523,$,.T.);
	//<01> generating methods for consolidated attribute:  Tag
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4139=INVERSE_ATTRIBUTE('FillsVoids',#4136,0,#5474,$,#5477,#8233,#8234,.F.);
	//<01> generating methods for consolidated attribute:  FillsVoids
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4140=INVERSE_ATTRIBUTE('ConnectedTo',#4136,1,#5399,$,#5402,#8236,$,.F.);
	//<01> generating methods for consolidated attribute:  ConnectedTo
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4141=INVERSE_ATTRIBUTE('IsInterferedByElements',#4136,2,#5482,$,#5485,#8238,$,.F.);
	//<01> generating methods for consolidated attribute:  IsInterferedByElements
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4142=INVERSE_ATTRIBUTE('InterferesElements',#4136,3,#5482,$,#5484,#8240,$,.F.);
	//<01> generating methods for consolidated attribute:  InterferesElements
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4143=INVERSE_ATTRIBUTE('HasProjections',#4136,4,#5493,$,#5495,#8242,$,.F.);
	//<01> generating methods for consolidated attribute:  HasProjections
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4144=INVERSE_ATTRIBUTE('ReferencedInStructures',#4136,5,#5497,$,#5499,#8244,$,.F.);
	//<01> generating methods for consolidated attribute:  ReferencedInStructures
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4145=INVERSE_ATTRIBUTE('HasOpenings',#4136,6,#5527,$,#5529,#8246,$,.F.);
	//<01> generating methods for consolidated attribute:  HasOpenings
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4146=INVERSE_ATTRIBUTE('IsConnectionRealization',#4136,7,#5434,$,#5436,#8248,$,.F.);
	//<01> generating methods for consolidated attribute:  IsConnectionRealization
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4147=INVERSE_ATTRIBUTE('ProvidesBoundaries',#4136,8,#5512,$,#5515,#8250,$,.F.);
	//<01> generating methods for consolidated attribute:  ProvidesBoundaries
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4148=INVERSE_ATTRIBUTE('ConnectedFrom',#4136,9,#5399,$,#5403,#8252,$,.F.);
	//<01> generating methods for consolidated attribute:  ConnectedFrom
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4149=INVERSE_ATTRIBUTE('ContainedInStructure',#4136,10,#5438,$,#5440,#8254,#8255,.F.);
	//<01> generating methods for consolidated attribute:  ContainedInStructure
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3973=INVERSE_ATTRIBUTE('HasPorts',#3971,0,#5410,$,#5413,#8119,$,.F.);
	//<01> generating methods for consolidated attribute:  HasPorts
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3968=INVERSE_ATTRIBUTE('AssignedToFlowElement',#3966,0,#5478,$,#5480,#8112,#8113,.F.);
	//<01> generating methods for consolidated attribute:  AssignedToFlowElement
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3802=EXPLICIT_ATTRIBUTE('PredefinedType',#3800,0,#2783,$,.T.);
	//<01> generating methods for consolidated attribute:  PredefinedType
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute:PredefinedType, base type: ENUMERATION
	public boolean testPredefinedtype(EIfccontroller type) throws SdaiException {
		return test_enumeration(a8);
	}
	public int getPredefinedtype(EIfccontroller type) throws SdaiException {
		return get_enumeration(a8);
	}
	public void setPredefinedtype(EIfccontroller type, int value) throws SdaiException {
		a8 = set_enumeration(value, a8$);
	}
	public void unsetPredefinedtype(EIfccontroller type) throws SdaiException {
		a8 = unset_enumeration();
	}
	public static jsdai.dictionary.EAttribute attributePredefinedtype(EIfccontroller type) throws SdaiException {
		return a8$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a8 = 0;
			a7 = null;
			a4 = null;
			a5 = unset_instance(a5);
			a6 = unset_instance(a6);
			a0 = null;
			a1 = unset_instance(a1);
			a2 = null;
			a3 = null;
			return;
		}
		a8 = av.entityValues[0].getEnumeration(0, a8$);
		a7 = av.entityValues[3].getString(0);
		a4 = av.entityValues[4].getString(0);
		a5 = av.entityValues[6].getInstance(0, this, a5$);
		a6 = av.entityValues[6].getInstance(1, this, a6$);
		a0 = av.entityValues[7].getString(0);
		a1 = av.entityValues[7].getInstance(1, this, a1$);
		a2 = av.entityValues[7].getString(2);
		a3 = av.entityValues[7].getString(3);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a8 = 0;
			a7 = null;
			a4 = null;
			a5 = unset_instance(a5);
			a6 = unset_instance(a6);
			a0 = null;
			a1 = unset_instance(a1);
			a2 = null;
			a3 = null;
			return;
		}
		a8 = av.entityValues[0].getEnumeration(0, a8$);
		a7 = av.entityValues[3].getString(0);
		a4 = av.entityValues[4].getString(0);
		a5 = av.entityValues[6].getInstance(0, this, a5$);
		a6 = av.entityValues[6].getInstance(1, this, a6$);
		a0 = av.entityValues[7].getString(0);
		a1 = av.entityValues[7].getInstance(1, this, a1$);
		a2 = av.entityValues[7].getString(2);
		a3 = av.entityValues[7].getString(3);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcController
		av.entityValues[0].setEnumeration(0, a8, a8$);
		// partial entity: IfcDistributionControlElement
		// partial entity: IfcDistributionElement
		// partial entity: IfcElement
		av.entityValues[3].setString(0, a7);
		// partial entity: IfcObject
		av.entityValues[4].setString(0, a4);
		// partial entity: IfcObjectDefinition
		// partial entity: IfcProduct
		av.entityValues[6].setInstance(0, a5);
		av.entityValues[6].setInstance(1, a6);
		// partial entity: IfcRoot
		av.entityValues[7].setString(0, a0);
		av.entityValues[7].setInstance(1, a1);
		av.entityValues[7].setString(2, a2);
		av.entityValues[7].setString(3, a3);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcController
		av.entityValues[0].setEnumeration(0, a8, a8$);
		// partial entity: IfcDistributionControlElement
		// partial entity: IfcDistributionElement
		// partial entity: IfcElement
		av.entityValues[3].setString(0, a7);
		// partial entity: IfcObject
		av.entityValues[4].setString(0, a4);
		// partial entity: IfcObjectDefinition
		// partial entity: IfcProduct
		av.entityValues[6].setInstance(0, a5);
		av.entityValues[6].setInstance(1, a6);
		// partial entity: IfcRoot
		av.entityValues[7].setString(0, a0);
		av.entityValues[7].setInstance(1, a1);
		av.entityValues[7].setString(2, a2);
		av.entityValues[7].setString(3, a3);
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfccontrollerCorrectpredefinedtype(SdaiContext _context) throws SdaiException {
	






		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).OR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).OR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).NOT(Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.SIfc4._st_IfcControllerTypeEnum).set(_context, get(a8$)))), Value.alloc(ExpressTypes.LOGICAL_TYPE).nequal(_context, Value.alloc(jsdai.SIfc4.SIfc4._st_IfcControllerTypeEnum).set(_context, get(a8$)), Value.alloc(jsdai.SIfc4.SIfc4._st_IfcControllerTypeEnum).setEnum(_context, "USERDEFINED"))), Value.alloc(ExpressTypes.LOGICAL_TYPE).AND(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(jsdai.SIfc4.SIfc4._st_IfcControllerTypeEnum).set(_context, get(a8$)), Value.alloc(jsdai.SIfc4.SIfc4._st_IfcControllerTypeEnum).setEnum(_context, "USERDEFINED")), Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.CIfccontroller.definition).set(_context, this).groupReference(_context, jsdai.SIfc4.CIfcobject.class).getAttribute(jsdai.SIfc4.CIfcobject.attributeObjecttype(null), _context))))).getLogical());
	}
	public int rIfccontrollerCorrecttypeassigned(SdaiContext _context) throws SdaiException {
	




		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).OR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(Value.alloc(ExpressTypes.SET_GENERIC_TYPE).set(_context, get(jsdai.SIfc4.CIfcobject.attributeIstypedby(null)))), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 0)), Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCCONTROLLERTYPE", "IFC4"), Value.alloc(jsdai.SIfc4.CIfccontroller.definition).set(_context, this).groupReference(_context, jsdai.SIfc4.CIfcobject.class).getAttribute(jsdai.SIfc4.CIfcobject.attributeIstypedby(null), _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null).getAttribute("RelatingType", _context).typeOfV(_context)))).getLogical());
	}
}
