/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcRepresentationItem

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcrepresentationitem extends CEntity implements EIfcrepresentationitem {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcrepresentationitem.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - current -  ENTITY IfcPresentationLayerAssignment
	protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem: protected Object  - inverse - current -  ENTITY IfcStyledItem
	protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #5552=INVERSE_ATTRIBUTE('LayerAssignment',#5550,0,#5023,$,#5027,#9221,#9222,.F.);
	//<01> generating methods for consolidated attribute:  LayerAssignment
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	public AIfcpresentationlayerassignment getLayerassignment(EIfcrepresentationitem type, ASdaiModel domain) throws SdaiException {
		AIfcpresentationlayerassignment result = (AIfcpresentationlayerassignment)get_inverse_aggregate(i0$);
		CIfcpresentationlayerassignment.usedinAssigneditems(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributeLayerassignment(EIfcrepresentationitem type) throws SdaiException {
		return i0$;
	}

	//going through all the attributes: #5553=INVERSE_ATTRIBUTE('StyledByItem',#5550,1,#5936,$,#5938,#9224,#9225,.F.);
	//<01> generating methods for consolidated attribute:  StyledByItem
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	public AIfcstyleditem getStyledbyitem(EIfcrepresentationitem type, ASdaiModel domain) throws SdaiException {
		AIfcstyleditem result = (AIfcstyleditem)get_inverse_aggregate(i1$);
		CIfcstyleditem.usedinItem(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributeStyledbyitem(EIfcrepresentationitem type) throws SdaiException {
		return i1$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			return;
		}
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			return;
		}
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcRepresentationItem
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcRepresentationItem
	}
}
