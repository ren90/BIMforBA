/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcRelAssignsToResource

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcrelassignstoresource extends EIfcrelassigns {

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: RelatingResource
	boolean testRelatingresource(EIfcrelassignstoresource type) throws SdaiException;

	EEntity getRelatingresource(EIfcrelassignstoresource type) throws SdaiException; // case 1

	void setRelatingresource(EIfcrelassignstoresource type, EEntity value) throws SdaiException; // case 1

	void unsetRelatingresource(EIfcrelassignstoresource type) throws SdaiException;

}
