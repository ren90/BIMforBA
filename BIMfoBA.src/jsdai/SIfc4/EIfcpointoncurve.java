/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcPointOnCurve

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcpointoncurve extends EIfcpoint {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:BasisCurve, base type: entity IfcCurve
	public boolean testBasiscurve(EIfcpointoncurve type) throws SdaiException;
	public EIfccurve getBasiscurve(EIfcpointoncurve type) throws SdaiException;
	public void setBasiscurve(EIfcpointoncurve type, EIfccurve value) throws SdaiException;
	public void unsetBasiscurve(EIfcpointoncurve type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:PointParameter, base type: REAL
	public boolean testPointparameter(EIfcpointoncurve type) throws SdaiException;
	public double getPointparameter(EIfcpointoncurve type) throws SdaiException;
	public void setPointparameter(EIfcpointoncurve type, double value) throws SdaiException;
	public void unsetPointparameter(EIfcpointoncurve type) throws SdaiException;

	// generateDerivedAttributeMethodDeclarations: 1
	/// methods for derived attribute:Dim, base type: INTEGER
	public boolean testDim(EIfcpointoncurve type) throws SdaiException;
	public int getDim(EIfcpointoncurve type) throws SdaiException;
	public Value getDim(EIfcpointoncurve type, SdaiContext _context) throws SdaiException;

}
