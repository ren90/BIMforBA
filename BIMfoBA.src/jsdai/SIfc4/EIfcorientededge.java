/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcOrientedEdge

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcorientededge extends EIfcedge {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:EdgeElement, base type: entity IfcEdge
	public boolean testEdgeelement(EIfcorientededge type) throws SdaiException;
	public EIfcedge getEdgeelement(EIfcorientededge type) throws SdaiException;
	public void setEdgeelement(EIfcorientededge type, EIfcedge value) throws SdaiException;
	public void unsetEdgeelement(EIfcorientededge type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Orientation, base type: BOOLEAN
	public boolean testOrientation(EIfcorientededge type) throws SdaiException;
	public boolean getOrientation(EIfcorientededge type) throws SdaiException;
	public void setOrientation(EIfcorientededge type, boolean value) throws SdaiException;
	public void unsetOrientation(EIfcorientededge type) throws SdaiException;

	// derived-redeclaring 1: direct, redeclared: EIfcedge, original: EIfcedge
	// attribute name, current: EdgeStart, previous: EdgeStart, original: EdgeStart
	public Value getEdgestart(EIfcedge type, SdaiContext _context) throws SdaiException;
	// derived-redeclaring 1: direct, redeclared: EIfcedge, original: EIfcedge
	// attribute name, current: EdgeEnd, previous: EdgeEnd, original: EdgeEnd
	public Value getEdgeend(EIfcedge type, SdaiContext _context) throws SdaiException;
}
