/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcExternalSpatialElement

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcexternalspatialelement extends EIfcexternalspatialstructureelement {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:PredefinedType, base type: ENUMERATION
	public boolean testPredefinedtype(EIfcexternalspatialelement type) throws SdaiException;
	public int getPredefinedtype(EIfcexternalspatialelement type) throws SdaiException;
	public void setPredefinedtype(EIfcexternalspatialelement type, int value) throws SdaiException;
	public void unsetPredefinedtype(EIfcexternalspatialelement type) throws SdaiException;

	// Inverse attribute - BoundedBy : SET[0:-2147483648] OF IfcRelSpaceBoundary FOR RelatingSpace
	public AIfcrelspaceboundary getBoundedby(EIfcexternalspatialelement type, ASdaiModel domain) throws SdaiException;
}
