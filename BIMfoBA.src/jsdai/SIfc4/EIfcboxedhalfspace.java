/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcBoxedHalfSpace

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcboxedhalfspace extends EIfchalfspacesolid {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:Enclosure, base type: entity IfcBoundingBox
	public boolean testEnclosure(EIfcboxedhalfspace type) throws SdaiException;
	public EIfcboundingbox getEnclosure(EIfcboxedhalfspace type) throws SdaiException;
	public void setEnclosure(EIfcboxedhalfspace type, EIfcboundingbox value) throws SdaiException;
	public void unsetEnclosure(EIfcboxedhalfspace type) throws SdaiException;

}
