/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcLightSourceGoniometric

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfclightsourcegoniometric extends EIfclightsource {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:Position, base type: entity IfcAxis2Placement3D
	public boolean testPosition(EIfclightsourcegoniometric type) throws SdaiException;
	public EIfcaxis2placement3d getPosition(EIfclightsourcegoniometric type) throws SdaiException;
	public void setPosition(EIfclightsourcegoniometric type, EIfcaxis2placement3d value) throws SdaiException;
	public void unsetPosition(EIfclightsourcegoniometric type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:ColourAppearance, base type: entity IfcColourRgb
	public boolean testColourappearance(EIfclightsourcegoniometric type) throws SdaiException;
	public EIfccolourrgb getColourappearance(EIfclightsourcegoniometric type) throws SdaiException;
	public void setColourappearance(EIfclightsourcegoniometric type, EIfccolourrgb value) throws SdaiException;
	public void unsetColourappearance(EIfclightsourcegoniometric type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:ColourTemperature, base type: REAL
	public boolean testColourtemperature(EIfclightsourcegoniometric type) throws SdaiException;
	public double getColourtemperature(EIfclightsourcegoniometric type) throws SdaiException;
	public void setColourtemperature(EIfclightsourcegoniometric type, double value) throws SdaiException;
	public void unsetColourtemperature(EIfclightsourcegoniometric type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:LuminousFlux, base type: REAL
	public boolean testLuminousflux(EIfclightsourcegoniometric type) throws SdaiException;
	public double getLuminousflux(EIfclightsourcegoniometric type) throws SdaiException;
	public void setLuminousflux(EIfclightsourcegoniometric type, double value) throws SdaiException;
	public void unsetLuminousflux(EIfclightsourcegoniometric type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:LightEmissionSource, base type: ENUMERATION
	public boolean testLightemissionsource(EIfclightsourcegoniometric type) throws SdaiException;
	public int getLightemissionsource(EIfclightsourcegoniometric type) throws SdaiException;
	public void setLightemissionsource(EIfclightsourcegoniometric type, int value) throws SdaiException;
	public void unsetLightemissionsource(EIfclightsourcegoniometric type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: LightDistributionDataSource
	boolean testLightdistributiondatasource(EIfclightsourcegoniometric type) throws SdaiException;

	EEntity getLightdistributiondatasource(EIfclightsourcegoniometric type) throws SdaiException; // case 1

	void setLightdistributiondatasource(EIfclightsourcegoniometric type, EEntity value) throws SdaiException; // case 1

	void unsetLightdistributiondatasource(EIfclightsourcegoniometric type) throws SdaiException;

}