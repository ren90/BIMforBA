/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcLightSourceSpot

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfclightsourcespot extends EIfclightsourcepositional {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:Orientation, base type: entity IfcDirection
	public boolean testOrientation(EIfclightsourcespot type) throws SdaiException;
	public EIfcdirection getOrientation(EIfclightsourcespot type) throws SdaiException;
	public void setOrientation(EIfclightsourcespot type, EIfcdirection value) throws SdaiException;
	public void unsetOrientation(EIfclightsourcespot type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:ConcentrationExponent, base type: REAL
	public boolean testConcentrationexponent(EIfclightsourcespot type) throws SdaiException;
	public double getConcentrationexponent(EIfclightsourcespot type) throws SdaiException;
	public void setConcentrationexponent(EIfclightsourcespot type, double value) throws SdaiException;
	public void unsetConcentrationexponent(EIfclightsourcespot type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:SpreadAngle, base type: REAL
	public boolean testSpreadangle(EIfclightsourcespot type) throws SdaiException;
	public double getSpreadangle(EIfclightsourcespot type) throws SdaiException;
	public void setSpreadangle(EIfclightsourcespot type, double value) throws SdaiException;
	public void unsetSpreadangle(EIfclightsourcespot type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:BeamWidthAngle, base type: REAL
	public boolean testBeamwidthangle(EIfclightsourcespot type) throws SdaiException;
	public double getBeamwidthangle(EIfclightsourcespot type) throws SdaiException;
	public void setBeamwidthangle(EIfclightsourcespot type, double value) throws SdaiException;
	public void unsetBeamwidthangle(EIfclightsourcespot type) throws SdaiException;

}
