/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcSweptSurface

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcsweptsurface extends EIfcsurface {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:SweptCurve, base type: entity IfcProfileDef
	public boolean testSweptcurve(EIfcsweptsurface type) throws SdaiException;
	public EIfcprofiledef getSweptcurve(EIfcsweptsurface type) throws SdaiException;
	public void setSweptcurve(EIfcsweptsurface type, EIfcprofiledef value) throws SdaiException;
	public void unsetSweptcurve(EIfcsweptsurface type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:Position, base type: entity IfcAxis2Placement3D
	public boolean testPosition(EIfcsweptsurface type) throws SdaiException;
	public EIfcaxis2placement3d getPosition(EIfcsweptsurface type) throws SdaiException;
	public void setPosition(EIfcsweptsurface type, EIfcaxis2placement3d value) throws SdaiException;
	public void unsetPosition(EIfcsweptsurface type) throws SdaiException;

}
