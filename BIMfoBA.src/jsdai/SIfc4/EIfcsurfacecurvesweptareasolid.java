/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcSurfaceCurveSweptAreaSolid

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcsurfacecurvesweptareasolid extends EIfcsweptareasolid {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:Directrix, base type: entity IfcCurve
	public boolean testDirectrix(EIfcsurfacecurvesweptareasolid type) throws SdaiException;
	public EIfccurve getDirectrix(EIfcsurfacecurvesweptareasolid type) throws SdaiException;
	public void setDirectrix(EIfcsurfacecurvesweptareasolid type, EIfccurve value) throws SdaiException;
	public void unsetDirectrix(EIfcsurfacecurvesweptareasolid type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:StartParam, base type: REAL
	public boolean testStartparam(EIfcsurfacecurvesweptareasolid type) throws SdaiException;
	public double getStartparam(EIfcsurfacecurvesweptareasolid type) throws SdaiException;
	public void setStartparam(EIfcsurfacecurvesweptareasolid type, double value) throws SdaiException;
	public void unsetStartparam(EIfcsurfacecurvesweptareasolid type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:EndParam, base type: REAL
	public boolean testEndparam(EIfcsurfacecurvesweptareasolid type) throws SdaiException;
	public double getEndparam(EIfcsurfacecurvesweptareasolid type) throws SdaiException;
	public void setEndparam(EIfcsurfacecurvesweptareasolid type, double value) throws SdaiException;
	public void unsetEndparam(EIfcsurfacecurvesweptareasolid type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:ReferenceSurface, base type: entity IfcSurface
	public boolean testReferencesurface(EIfcsurfacecurvesweptareasolid type) throws SdaiException;
	public EIfcsurface getReferencesurface(EIfcsurfacecurvesweptareasolid type) throws SdaiException;
	public void setReferencesurface(EIfcsurfacecurvesweptareasolid type, EIfcsurface value) throws SdaiException;
	public void unsetReferencesurface(EIfcsurfacecurvesweptareasolid type) throws SdaiException;

}
