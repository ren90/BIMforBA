/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcSubedge

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcsubedge extends CIfcedge implements EIfcsubedge {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcsubedge.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	// EdgeStart: protected Object a0;   EdgeStart - java inheritance - ENTITY IfcVertex
	// EdgeEnd: protected Object a1;   EdgeEnd - java inheritance - ENTITY IfcVertex
	protected Object a2; // ParentEdge - current entity - ENTITY IfcEdge
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// EdgeStart - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected Object a0;
	// EdgeEnd - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected Object a1;
	// ParentEdge - explicit - current entity
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

	//going through all the attributes: #5552=INVERSE_ATTRIBUTE('LayerAssignment',#5550,0,#5023,$,#5027,#9221,#9222,.F.);
	//<01> generating methods for consolidated attribute:  LayerAssignment
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5553=INVERSE_ATTRIBUTE('StyledByItem',#5550,1,#5936,$,#5938,#9224,#9225,.F.);
	//<01> generating methods for consolidated attribute:  StyledByItem
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4090=EXPLICIT_ATTRIBUTE('EdgeStart',#4088,0,#6327,$,.F.);
	//<01> generating methods for consolidated attribute:  EdgeStart
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): EdgeStart, base type: entity IfcVertex
	public static int usedinEdgestart(EIfcedge type, EIfcvertex instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	//going through all the attributes: #4091=EXPLICIT_ATTRIBUTE('EdgeEnd',#4088,1,#6327,$,.F.);
	//<01> generating methods for consolidated attribute:  EdgeEnd
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): EdgeEnd, base type: entity IfcVertex
	public static int usedinEdgeend(EIfcedge type, EIfcvertex instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a1$, domain, result);
	}
	//going through all the attributes: #5951=EXPLICIT_ATTRIBUTE('ParentEdge',#5949,0,#4088,$,.F.);
	//<01> generating methods for consolidated attribute:  ParentEdge
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : ParentEdge, base type: entity IfcEdge
	public static int usedinParentedge(EIfcsubedge type, EIfcedge instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a2$, domain, result);
	}
	public boolean testParentedge(EIfcsubedge type) throws SdaiException {
		return test_instance(a2);
	}
	public EIfcedge getParentedge(EIfcsubedge type) throws SdaiException {
		return (EIfcedge)get_instance(a2);
	}
	public void setParentedge(EIfcsubedge type, EIfcedge value) throws SdaiException {
		a2 = set_instance(a2, value);
	}
	public void unsetParentedge(EIfcsubedge type) throws SdaiException {
		a2 = unset_instance(a2);
	}
	public static jsdai.dictionary.EAttribute attributeParentedge(EIfcsubedge type) throws SdaiException {
		return a2$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			a1 = unset_instance(a1);
			a2 = unset_instance(a2);
			return;
		}
		a0 = av.entityValues[0].getInstance(0, this, a0$);
		a1 = av.entityValues[0].getInstance(1, this, a1$);
		a2 = av.entityValues[2].getInstance(0, this, a2$);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			a1 = unset_instance(a1);
			a2 = unset_instance(a2);
			return;
		}
		a0 = av.entityValues[0].getInstance(0, this, a0$);
		a1 = av.entityValues[0].getInstance(1, this, a1$);
		a2 = av.entityValues[2].getInstance(0, this, a2$);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcEdge
		av.entityValues[0].setInstance(0, a0);
		av.entityValues[0].setInstance(1, a1);
		// partial entity: IfcRepresentationItem
		// partial entity: IfcSubedge
		av.entityValues[2].setInstance(0, a2);
		// partial entity: IfcTopologicalRepresentationItem
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcEdge
		av.entityValues[0].setInstance(0, a0);
		av.entityValues[0].setInstance(1, a1);
		// partial entity: IfcRepresentationItem
		// partial entity: IfcSubedge
		av.entityValues[2].setInstance(0, a2);
		// partial entity: IfcTopologicalRepresentationItem
	}
}
