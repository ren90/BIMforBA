/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcPlanarBox

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcplanarbox extends EIfcplanarextent {

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: Placement
	boolean testPlacement(EIfcplanarbox type) throws SdaiException;

	EEntity getPlacement(EIfcplanarbox type) throws SdaiException; // case 1

	void setPlacement(EIfcplanarbox type, EEntity value) throws SdaiException; // case 1

	void unsetPlacement(EIfcplanarbox type) throws SdaiException;

}
