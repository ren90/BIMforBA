/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcLightIntensityDistribution

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfclightintensitydistribution extends EEntity {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:LightDistributionCurve, base type: ENUMERATION
	public boolean testLightdistributioncurve(EIfclightintensitydistribution type) throws SdaiException;
	public int getLightdistributioncurve(EIfclightintensitydistribution type) throws SdaiException;
	public void setLightdistributioncurve(EIfclightintensitydistribution type, int value) throws SdaiException;
	public void unsetLightdistributioncurve(EIfclightintensitydistribution type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: DistributionData, base type: LIST OF ENTITY
	public boolean testDistributiondata(EIfclightintensitydistribution type) throws SdaiException;
	public AIfclightdistributiondata getDistributiondata(EIfclightintensitydistribution type) throws SdaiException;
	public AIfclightdistributiondata createDistributiondata(EIfclightintensitydistribution type) throws SdaiException;
	public void unsetDistributiondata(EIfclightintensitydistribution type) throws SdaiException;

}
