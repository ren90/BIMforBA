/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcRelConnectsWithEccentricity

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcrelconnectswitheccentricity extends EIfcrelconnectsstructuralmember {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:ConnectionConstraint, base type: entity IfcConnectionGeometry
	public boolean testConnectionconstraint(EIfcrelconnectswitheccentricity type) throws SdaiException;
	public EIfcconnectiongeometry getConnectionconstraint(EIfcrelconnectswitheccentricity type) throws SdaiException;
	public void setConnectionconstraint(EIfcrelconnectswitheccentricity type, EIfcconnectiongeometry value) throws SdaiException;
	public void unsetConnectionconstraint(EIfcrelconnectswitheccentricity type) throws SdaiException;

}