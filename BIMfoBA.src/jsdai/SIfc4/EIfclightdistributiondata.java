/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcLightDistributionData

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfclightdistributiondata extends EEntity {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:MainPlaneAngle, base type: REAL
	public boolean testMainplaneangle(EIfclightdistributiondata type) throws SdaiException;
	public double getMainplaneangle(EIfclightdistributiondata type) throws SdaiException;
	public void setMainplaneangle(EIfclightdistributiondata type, double value) throws SdaiException;
	public void unsetMainplaneangle(EIfclightdistributiondata type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: SecondaryPlaneAngle, base type: LIST OF REAL
	public boolean testSecondaryplaneangle(EIfclightdistributiondata type) throws SdaiException;
	public A_double getSecondaryplaneangle(EIfclightdistributiondata type) throws SdaiException;
	public A_double createSecondaryplaneangle(EIfclightdistributiondata type) throws SdaiException;
	public void unsetSecondaryplaneangle(EIfclightdistributiondata type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: LuminousIntensity, base type: LIST OF REAL
	public boolean testLuminousintensity(EIfclightdistributiondata type) throws SdaiException;
	public A_double getLuminousintensity(EIfclightdistributiondata type) throws SdaiException;
	public A_double createLuminousintensity(EIfclightdistributiondata type) throws SdaiException;
	public void unsetLuminousintensity(EIfclightdistributiondata type) throws SdaiException;

}
