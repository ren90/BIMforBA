/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcRationalBSplineSurfaceWithKnots

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcrationalbsplinesurfacewithknots extends EIfcbsplinesurfacewithknots {

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: WeightsData, base type: LIST OF LIST OF REAL
	public boolean testWeightsdata(EIfcrationalbsplinesurfacewithknots type) throws SdaiException;
	public Aa_double getWeightsdata(EIfcrationalbsplinesurfacewithknots type) throws SdaiException;
	public Aa_double createWeightsdata(EIfcrationalbsplinesurfacewithknots type) throws SdaiException;
	public void unsetWeightsdata(EIfcrationalbsplinesurfacewithknots type) throws SdaiException;

	// generateDerivedAttributeMethodDeclarations: 1
	// methods for attribute: Weights, base type: ARRAY OF ARRAY OF REAL
	public boolean testWeights(EIfcrationalbsplinesurfacewithknots type) throws SdaiException;
	public Value getWeights(EIfcrationalbsplinesurfacewithknots type, SdaiContext _context) throws SdaiException;
	public Aa_double getWeights(EIfcrationalbsplinesurfacewithknots type) throws SdaiException;

}
