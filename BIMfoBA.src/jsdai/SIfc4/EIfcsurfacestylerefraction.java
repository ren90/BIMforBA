/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcSurfaceStyleRefraction

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcsurfacestylerefraction extends EIfcpresentationitem {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:RefractionIndex, base type: REAL
	public boolean testRefractionindex(EIfcsurfacestylerefraction type) throws SdaiException;
	public double getRefractionindex(EIfcsurfacestylerefraction type) throws SdaiException;
	public void setRefractionindex(EIfcsurfacestylerefraction type, double value) throws SdaiException;
	public void unsetRefractionindex(EIfcsurfacestylerefraction type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:DispersionFactor, base type: REAL
	public boolean testDispersionfactor(EIfcsurfacestylerefraction type) throws SdaiException;
	public double getDispersionfactor(EIfcsurfacestylerefraction type) throws SdaiException;
	public void setDispersionfactor(EIfcsurfacestylerefraction type, double value) throws SdaiException;
	public void unsetDispersionfactor(EIfcsurfacestylerefraction type) throws SdaiException;

}