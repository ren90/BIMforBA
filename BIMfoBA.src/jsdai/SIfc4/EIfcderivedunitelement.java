/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcDerivedUnitElement

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcderivedunitelement extends EEntity {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:Unit, base type: entity IfcNamedUnit
	public boolean testUnit(EIfcderivedunitelement type) throws SdaiException;
	public EIfcnamedunit getUnit(EIfcderivedunitelement type) throws SdaiException;
	public void setUnit(EIfcderivedunitelement type, EIfcnamedunit value) throws SdaiException;
	public void unsetUnit(EIfcderivedunitelement type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Exponent, base type: INTEGER
	public boolean testExponent(EIfcderivedunitelement type) throws SdaiException;
	public int getExponent(EIfcderivedunitelement type) throws SdaiException;
	public void setExponent(EIfcderivedunitelement type, int value) throws SdaiException;
	public void unsetExponent(EIfcderivedunitelement type) throws SdaiException;

}
