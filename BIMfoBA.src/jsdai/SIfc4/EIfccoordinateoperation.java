/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcCoordinateOperation

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfccoordinateoperation extends EEntity {

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: SourceCRS
	boolean testSourcecrs(EIfccoordinateoperation type) throws SdaiException;

	EEntity getSourcecrs(EIfccoordinateoperation type) throws SdaiException; // case 1

	void setSourcecrs(EIfccoordinateoperation type, EEntity value) throws SdaiException; // case 1

	void unsetSourcecrs(EIfccoordinateoperation type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:TargetCRS, base type: entity IfcCoordinateReferenceSystem
	public boolean testTargetcrs(EIfccoordinateoperation type) throws SdaiException;
	public EIfccoordinatereferencesystem getTargetcrs(EIfccoordinateoperation type) throws SdaiException;
	public void setTargetcrs(EIfccoordinateoperation type, EIfccoordinatereferencesystem value) throws SdaiException;
	public void unsetTargetcrs(EIfccoordinateoperation type) throws SdaiException;

}