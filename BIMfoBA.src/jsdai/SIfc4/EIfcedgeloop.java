/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcEdgeLoop

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcedgeloop extends EIfcloop {

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: EdgeList, base type: LIST OF ENTITY
	public boolean testEdgelist(EIfcedgeloop type) throws SdaiException;
	public AIfcorientededge getEdgelist(EIfcedgeloop type) throws SdaiException;
	public AIfcorientededge createEdgelist(EIfcedgeloop type) throws SdaiException;
	public void unsetEdgelist(EIfcedgeloop type) throws SdaiException;

	// generateDerivedAttributeMethodDeclarations: 1
	/// methods for derived attribute:Ne, base type: INTEGER
	public boolean testNe(EIfcedgeloop type) throws SdaiException;
	public int getNe(EIfcedgeloop type) throws SdaiException;
	public Value getNe(EIfcedgeloop type, SdaiContext _context) throws SdaiException;

}
