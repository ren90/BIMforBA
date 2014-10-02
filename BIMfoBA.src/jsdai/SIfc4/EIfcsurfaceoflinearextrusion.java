/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcSurfaceOfLinearExtrusion

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcsurfaceoflinearextrusion extends EIfcsweptsurface {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:ExtrudedDirection, base type: entity IfcDirection
	public boolean testExtrudeddirection(EIfcsurfaceoflinearextrusion type) throws SdaiException;
	public EIfcdirection getExtrudeddirection(EIfcsurfaceoflinearextrusion type) throws SdaiException;
	public void setExtrudeddirection(EIfcsurfaceoflinearextrusion type, EIfcdirection value) throws SdaiException;
	public void unsetExtrudeddirection(EIfcsurfaceoflinearextrusion type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Depth, base type: REAL
	public boolean testDepth(EIfcsurfaceoflinearextrusion type) throws SdaiException;
	public double getDepth(EIfcsurfaceoflinearextrusion type) throws SdaiException;
	public void setDepth(EIfcsurfaceoflinearextrusion type, double value) throws SdaiException;
	public void unsetDepth(EIfcsurfaceoflinearextrusion type) throws SdaiException;

	// generateDerivedAttributeMethodDeclarations: 1
	// attribute:ExtrusionAxis, base type: entity IfcVector
	public boolean testExtrusionaxis(EIfcsurfaceoflinearextrusion type) throws SdaiException;
	public EIfcvector getExtrusionaxis(EIfcsurfaceoflinearextrusion type) throws SdaiException;

}
