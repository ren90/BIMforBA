/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcSurfaceStyleLighting

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcsurfacestylelighting extends EIfcpresentationitem {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:DiffuseTransmissionColour, base type: entity IfcColourRgb
	public boolean testDiffusetransmissioncolour(EIfcsurfacestylelighting type) throws SdaiException;
	public EIfccolourrgb getDiffusetransmissioncolour(EIfcsurfacestylelighting type) throws SdaiException;
	public void setDiffusetransmissioncolour(EIfcsurfacestylelighting type, EIfccolourrgb value) throws SdaiException;
	public void unsetDiffusetransmissioncolour(EIfcsurfacestylelighting type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:DiffuseReflectionColour, base type: entity IfcColourRgb
	public boolean testDiffusereflectioncolour(EIfcsurfacestylelighting type) throws SdaiException;
	public EIfccolourrgb getDiffusereflectioncolour(EIfcsurfacestylelighting type) throws SdaiException;
	public void setDiffusereflectioncolour(EIfcsurfacestylelighting type, EIfccolourrgb value) throws SdaiException;
	public void unsetDiffusereflectioncolour(EIfcsurfacestylelighting type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:TransmissionColour, base type: entity IfcColourRgb
	public boolean testTransmissioncolour(EIfcsurfacestylelighting type) throws SdaiException;
	public EIfccolourrgb getTransmissioncolour(EIfcsurfacestylelighting type) throws SdaiException;
	public void setTransmissioncolour(EIfcsurfacestylelighting type, EIfccolourrgb value) throws SdaiException;
	public void unsetTransmissioncolour(EIfcsurfacestylelighting type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:ReflectanceColour, base type: entity IfcColourRgb
	public boolean testReflectancecolour(EIfcsurfacestylelighting type) throws SdaiException;
	public EIfccolourrgb getReflectancecolour(EIfcsurfacestylelighting type) throws SdaiException;
	public void setReflectancecolour(EIfcsurfacestylelighting type, EIfccolourrgb value) throws SdaiException;
	public void unsetReflectancecolour(EIfcsurfacestylelighting type) throws SdaiException;

}