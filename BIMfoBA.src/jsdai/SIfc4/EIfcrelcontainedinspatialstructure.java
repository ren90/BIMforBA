/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcRelContainedInSpatialStructure

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcrelcontainedinspatialstructure extends EIfcrelconnects {

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: RelatedElements, base type: SET OF ENTITY
	public boolean testRelatedelements(EIfcrelcontainedinspatialstructure type) throws SdaiException;
	public AIfcproduct getRelatedelements(EIfcrelcontainedinspatialstructure type) throws SdaiException;
	public AIfcproduct createRelatedelements(EIfcrelcontainedinspatialstructure type) throws SdaiException;
	public void unsetRelatedelements(EIfcrelcontainedinspatialstructure type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:RelatingStructure, base type: entity IfcSpatialElement
	public boolean testRelatingstructure(EIfcrelcontainedinspatialstructure type) throws SdaiException;
	public EIfcspatialelement getRelatingstructure(EIfcrelcontainedinspatialstructure type) throws SdaiException;
	public void setRelatingstructure(EIfcrelcontainedinspatialstructure type, EIfcspatialelement value) throws SdaiException;
	public void unsetRelatingstructure(EIfcrelcontainedinspatialstructure type) throws SdaiException;

}
