/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcObjectPlacement

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcobjectplacement extends CEntity implements EIfcobjectplacement {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcobjectplacement.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// PlacesObject: protected Object  - inverse - current -  ENTITY IfcProduct
	protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// ReferencedByPlacements: protected Object  - inverse - current -  ENTITY IfcLocalPlacement
	protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// PlacesObject - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// ReferencedByPlacements - inverse - current entity
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

	//going through all the attributes: #4800=INVERSE_ATTRIBUTE('PlacesObject',#4798,0,#5054,$,#5056,#8691,$,.F.);
	//<01> generating methods for consolidated attribute:  PlacesObject
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	// Inverse attribute - PlacesObject : SET[0:-2147483648] OF IfcProduct FOR ObjectPlacement
	public AIfcproduct getPlacesobject(EIfcobjectplacement type, ASdaiModel domain) throws SdaiException {
		AIfcproduct result = (AIfcproduct)get_inverse_aggregate(i0$);
		CIfcproduct.usedinObjectplacement(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributePlacesobject(EIfcobjectplacement type) throws SdaiException {
		return i0$;
	}

	//going through all the attributes: #4801=INVERSE_ATTRIBUTE('ReferencedByPlacements',#4798,1,#4610,$,#4612,#8693,$,.F.);
	//<01> generating methods for consolidated attribute:  ReferencedByPlacements
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	// Inverse attribute - ReferencedByPlacements : SET[0:-2147483648] OF IfcLocalPlacement FOR PlacementRelTo
	public AIfclocalplacement getReferencedbyplacements(EIfcobjectplacement type, ASdaiModel domain) throws SdaiException {
		AIfclocalplacement result = (AIfclocalplacement)get_inverse_aggregate(i1$);
		CIfclocalplacement.usedinPlacementrelto(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributeReferencedbyplacements(EIfcobjectplacement type) throws SdaiException {
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
		// partial entity: IfcObjectPlacement
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcObjectPlacement
	}
}
