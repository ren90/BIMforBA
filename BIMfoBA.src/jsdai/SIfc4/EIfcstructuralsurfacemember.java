/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcStructuralSurfaceMember

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcstructuralsurfacemember extends EIfcstructuralmember {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:PredefinedType, base type: ENUMERATION
	public boolean testPredefinedtype(EIfcstructuralsurfacemember type) throws SdaiException;
	public int getPredefinedtype(EIfcstructuralsurfacemember type) throws SdaiException;
	public void setPredefinedtype(EIfcstructuralsurfacemember type, int value) throws SdaiException;
	public void unsetPredefinedtype(EIfcstructuralsurfacemember type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Thickness, base type: REAL
	public boolean testThickness(EIfcstructuralsurfacemember type) throws SdaiException;
	public double getThickness(EIfcstructuralsurfacemember type) throws SdaiException;
	public void setThickness(EIfcstructuralsurfacemember type, double value) throws SdaiException;
	public void unsetThickness(EIfcstructuralsurfacemember type) throws SdaiException;

}