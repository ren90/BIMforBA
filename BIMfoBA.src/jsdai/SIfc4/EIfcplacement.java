/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcPlacement

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcplacement extends EIfcgeometricrepresentationitem {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:Location, base type: entity IfcCartesianPoint
	public boolean testLocation(EIfcplacement type) throws SdaiException;
	public EIfccartesianpoint getLocation(EIfcplacement type) throws SdaiException;
	public void setLocation(EIfcplacement type, EIfccartesianpoint value) throws SdaiException;
	public void unsetLocation(EIfcplacement type) throws SdaiException;

	// generateDerivedAttributeMethodDeclarations: 1
	/// methods for derived attribute:Dim, base type: INTEGER
	public boolean testDim(EIfcplacement type) throws SdaiException;
	public int getDim(EIfcplacement type) throws SdaiException;
	public Value getDim(EIfcplacement type, SdaiContext _context) throws SdaiException;

}