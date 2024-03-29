/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcBSplineCurveWithKnots

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcbsplinecurvewithknots extends EIfcbsplinecurve {

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: KnotMultiplicities, base type: LIST OF INTEGER
	public boolean testKnotmultiplicities(EIfcbsplinecurvewithknots type) throws SdaiException;
	public A_integer getKnotmultiplicities(EIfcbsplinecurvewithknots type) throws SdaiException;
	public A_integer createKnotmultiplicities(EIfcbsplinecurvewithknots type) throws SdaiException;
	public void unsetKnotmultiplicities(EIfcbsplinecurvewithknots type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: Knots, base type: LIST OF REAL
	public boolean testKnots(EIfcbsplinecurvewithknots type) throws SdaiException;
	public A_double getKnots(EIfcbsplinecurvewithknots type) throws SdaiException;
	public A_double createKnots(EIfcbsplinecurvewithknots type) throws SdaiException;
	public void unsetKnots(EIfcbsplinecurvewithknots type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:KnotSpec, base type: ENUMERATION
	public boolean testKnotspec(EIfcbsplinecurvewithknots type) throws SdaiException;
	public int getKnotspec(EIfcbsplinecurvewithknots type) throws SdaiException;
	public void setKnotspec(EIfcbsplinecurvewithknots type, int value) throws SdaiException;
	public void unsetKnotspec(EIfcbsplinecurvewithknots type) throws SdaiException;

	// generateDerivedAttributeMethodDeclarations: 1
	/// methods for derived attribute:UpperIndexOnKnots, base type: INTEGER
	public boolean testUpperindexonknots(EIfcbsplinecurvewithknots type) throws SdaiException;
	public int getUpperindexonknots(EIfcbsplinecurvewithknots type) throws SdaiException;
	public Value getUpperindexonknots(EIfcbsplinecurvewithknots type, SdaiContext _context) throws SdaiException;

}
