/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcEdgeCurve

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcedgecurve extends EIfcedge {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:EdgeGeometry, base type: entity IfcCurve
	public boolean testEdgegeometry(EIfcedgecurve type) throws SdaiException;
	public EIfccurve getEdgegeometry(EIfcedgecurve type) throws SdaiException;
	public void setEdgegeometry(EIfcedgecurve type, EIfccurve value) throws SdaiException;
	public void unsetEdgegeometry(EIfcedgecurve type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:SameSense, base type: BOOLEAN
	public boolean testSamesense(EIfcedgecurve type) throws SdaiException;
	public boolean getSamesense(EIfcedgecurve type) throws SdaiException;
	public void setSamesense(EIfcedgecurve type, boolean value) throws SdaiException;
	public void unsetSamesense(EIfcedgecurve type) throws SdaiException;

}