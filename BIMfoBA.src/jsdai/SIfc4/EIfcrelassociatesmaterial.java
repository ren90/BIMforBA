/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcRelAssociatesMaterial

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcrelassociatesmaterial extends EIfcrelassociates {

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: RelatingMaterial
	boolean testRelatingmaterial(EIfcrelassociatesmaterial type) throws SdaiException;

	EEntity getRelatingmaterial(EIfcrelassociatesmaterial type) throws SdaiException; // case 1

	void setRelatingmaterial(EIfcrelassociatesmaterial type, EEntity value) throws SdaiException; // case 1

	void unsetRelatingmaterial(EIfcrelassociatesmaterial type) throws SdaiException;

}
