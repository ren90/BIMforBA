/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcAxis2Placement2D

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcaxis2placement2d extends EIfcplacement {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:RefDirection, base type: entity IfcDirection
	public boolean testRefdirection(EIfcaxis2placement2d type) throws SdaiException;
	public EIfcdirection getRefdirection(EIfcaxis2placement2d type) throws SdaiException;
	public void setRefdirection(EIfcaxis2placement2d type, EIfcdirection value) throws SdaiException;
	public void unsetRefdirection(EIfcaxis2placement2d type) throws SdaiException;

	// generateDerivedAttributeMethodDeclarations: 1
	// methods for attribute: P, base type: LIST OF ENTITY
	public boolean testP(EIfcaxis2placement2d type) throws SdaiException;
	public Value getP(EIfcaxis2placement2d type, SdaiContext _context) throws SdaiException;
	public AIfcdirection getP(EIfcaxis2placement2d type) throws SdaiException;

}