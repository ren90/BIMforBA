/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcStructuralMember

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcstructuralmember extends EIfcstructuralitem {

	// Inverse attribute - ConnectedBy : SET[0:-2147483648] OF IfcRelConnectsStructuralMember FOR RelatingStructuralMember
	public AIfcrelconnectsstructuralmember getConnectedby(EIfcstructuralmember type, ASdaiModel domain) throws SdaiException;
}