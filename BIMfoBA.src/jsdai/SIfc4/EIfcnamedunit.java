/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcNamedUnit

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcnamedunit extends EEntity {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:Dimensions, base type: entity IfcDimensionalExponents
	public boolean testDimensions(EIfcnamedunit type) throws SdaiException;
	public EIfcdimensionalexponents getDimensions(EIfcnamedunit type) throws SdaiException;
	public void setDimensions(EIfcnamedunit type, EIfcdimensionalexponents value) throws SdaiException;
	public void unsetDimensions(EIfcnamedunit type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:UnitType, base type: ENUMERATION
	public boolean testUnittype(EIfcnamedunit type) throws SdaiException;
	public int getUnittype(EIfcnamedunit type) throws SdaiException;
	public void setUnittype(EIfcnamedunit type, int value) throws SdaiException;
	public void unsetUnittype(EIfcnamedunit type) throws SdaiException;

}
