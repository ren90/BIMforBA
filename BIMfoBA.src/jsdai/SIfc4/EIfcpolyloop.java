/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcPolyLoop

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcpolyloop extends EIfcloop {

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: Polygon, base type: LIST OF ENTITY
	public boolean testPolygon(EIfcpolyloop type) throws SdaiException;
	public AIfccartesianpoint getPolygon(EIfcpolyloop type) throws SdaiException;
	public AIfccartesianpoint createPolygon(EIfcpolyloop type) throws SdaiException;
	public void unsetPolygon(EIfcpolyloop type) throws SdaiException;

}
