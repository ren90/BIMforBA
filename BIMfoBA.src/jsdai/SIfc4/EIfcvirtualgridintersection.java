/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcVirtualGridIntersection

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcvirtualgridintersection extends EEntity {

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: IntersectingAxes, base type: LIST OF ENTITY
	public boolean testIntersectingaxes(EIfcvirtualgridintersection type) throws SdaiException;
	public AIfcgridaxis getIntersectingaxes(EIfcvirtualgridintersection type) throws SdaiException;
	public AIfcgridaxis createIntersectingaxes(EIfcvirtualgridintersection type) throws SdaiException;
	public void unsetIntersectingaxes(EIfcvirtualgridintersection type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: OffsetDistances, base type: LIST OF REAL
	public boolean testOffsetdistances(EIfcvirtualgridintersection type) throws SdaiException;
	public A_double getOffsetdistances(EIfcvirtualgridintersection type) throws SdaiException;
	public A_double createOffsetdistances(EIfcvirtualgridintersection type) throws SdaiException;
	public void unsetOffsetdistances(EIfcvirtualgridintersection type) throws SdaiException;

}
