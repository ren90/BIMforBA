/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcRelAssignsToGroup

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcrelassignstogroup extends EIfcrelassigns {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:RelatingGroup, base type: entity IfcGroup
	public boolean testRelatinggroup(EIfcrelassignstogroup type) throws SdaiException;
	public EIfcgroup getRelatinggroup(EIfcrelassignstogroup type) throws SdaiException;
	public void setRelatinggroup(EIfcrelassignstogroup type, EIfcgroup value) throws SdaiException;
	public void unsetRelatinggroup(EIfcrelassignstogroup type) throws SdaiException;

}