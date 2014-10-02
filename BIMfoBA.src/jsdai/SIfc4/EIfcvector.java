/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcVector

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcvector extends EIfcgeometricrepresentationitem {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:Orientation, base type: entity IfcDirection
	public boolean testOrientation(EIfcvector type) throws SdaiException;
	public EIfcdirection getOrientation(EIfcvector type) throws SdaiException;
	public void setOrientation(EIfcvector type, EIfcdirection value) throws SdaiException;
	public void unsetOrientation(EIfcvector type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Magnitude, base type: REAL
	public boolean testMagnitude(EIfcvector type) throws SdaiException;
	public double getMagnitude(EIfcvector type) throws SdaiException;
	public void setMagnitude(EIfcvector type, double value) throws SdaiException;
	public void unsetMagnitude(EIfcvector type) throws SdaiException;

	// generateDerivedAttributeMethodDeclarations: 1
	/// methods for derived attribute:Dim, base type: INTEGER
	public boolean testDim(EIfcvector type) throws SdaiException;
	public int getDim(EIfcvector type) throws SdaiException;
	public Value getDim(EIfcvector type, SdaiContext _context) throws SdaiException;

}
