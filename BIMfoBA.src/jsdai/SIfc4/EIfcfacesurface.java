/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcFaceSurface

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcfacesurface extends EIfcface {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:FaceSurface, base type: entity IfcSurface
	public boolean testFacesurface(EIfcfacesurface type) throws SdaiException;
	public EIfcsurface getFacesurface(EIfcfacesurface type) throws SdaiException;
	public void setFacesurface(EIfcfacesurface type, EIfcsurface value) throws SdaiException;
	public void unsetFacesurface(EIfcfacesurface type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:SameSense, base type: BOOLEAN
	public boolean testSamesense(EIfcfacesurface type) throws SdaiException;
	public boolean getSamesense(EIfcfacesurface type) throws SdaiException;
	public void setSamesense(EIfcfacesurface type, boolean value) throws SdaiException;
	public void unsetSamesense(EIfcfacesurface type) throws SdaiException;

}