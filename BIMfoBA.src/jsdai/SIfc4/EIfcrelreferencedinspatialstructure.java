/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcRelReferencedInSpatialStructure

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcrelreferencedinspatialstructure extends EIfcrelconnects {

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: RelatedElements, base type: SET OF ENTITY
	public boolean testRelatedelements(EIfcrelreferencedinspatialstructure type) throws SdaiException;
	public AIfcproduct getRelatedelements(EIfcrelreferencedinspatialstructure type) throws SdaiException;
	public AIfcproduct createRelatedelements(EIfcrelreferencedinspatialstructure type) throws SdaiException;
	public void unsetRelatedelements(EIfcrelreferencedinspatialstructure type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:RelatingStructure, base type: entity IfcSpatialElement
	public boolean testRelatingstructure(EIfcrelreferencedinspatialstructure type) throws SdaiException;
	public EIfcspatialelement getRelatingstructure(EIfcrelreferencedinspatialstructure type) throws SdaiException;
	public void setRelatingstructure(EIfcrelreferencedinspatialstructure type, EIfcspatialelement value) throws SdaiException;
	public void unsetRelatingstructure(EIfcrelreferencedinspatialstructure type) throws SdaiException;

}
