/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcRelServicesBuildings

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcrelservicesbuildings extends EIfcrelconnects {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:RelatingSystem, base type: entity IfcSystem
	public boolean testRelatingsystem(EIfcrelservicesbuildings type) throws SdaiException;
	public EIfcsystem getRelatingsystem(EIfcrelservicesbuildings type) throws SdaiException;
	public void setRelatingsystem(EIfcrelservicesbuildings type, EIfcsystem value) throws SdaiException;
	public void unsetRelatingsystem(EIfcrelservicesbuildings type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: RelatedBuildings, base type: SET OF ENTITY
	public boolean testRelatedbuildings(EIfcrelservicesbuildings type) throws SdaiException;
	public AIfcspatialelement getRelatedbuildings(EIfcrelservicesbuildings type) throws SdaiException;
	public AIfcspatialelement createRelatedbuildings(EIfcrelservicesbuildings type) throws SdaiException;
	public void unsetRelatedbuildings(EIfcrelservicesbuildings type) throws SdaiException;

}
