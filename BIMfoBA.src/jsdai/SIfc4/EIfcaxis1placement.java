/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcAxis1Placement

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcaxis1placement extends EIfcplacement {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:Axis, base type: entity IfcDirection
	public boolean testAxis(EIfcaxis1placement type) throws SdaiException;
	public EIfcdirection getAxis(EIfcaxis1placement type) throws SdaiException;
	public void setAxis(EIfcaxis1placement type, EIfcdirection value) throws SdaiException;
	public void unsetAxis(EIfcaxis1placement type) throws SdaiException;

	// generateDerivedAttributeMethodDeclarations: 1
	// attribute:Z, base type: entity IfcDirection
	public boolean testZ(EIfcaxis1placement type) throws SdaiException;
	public EIfcdirection getZ(EIfcaxis1placement type) throws SdaiException;

}