/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcTextureMap

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfctexturemap extends EIfctexturecoordinate {

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: Vertices, base type: LIST OF ENTITY
	public boolean testVertices(EIfctexturemap type) throws SdaiException;
	public AIfctexturevertex getVertices(EIfctexturemap type) throws SdaiException;
	public AIfctexturevertex createVertices(EIfctexturemap type) throws SdaiException;
	public void unsetVertices(EIfctexturemap type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:MappedTo, base type: entity IfcFace
	public boolean testMappedto(EIfctexturemap type) throws SdaiException;
	public EIfcface getMappedto(EIfctexturemap type) throws SdaiException;
	public void setMappedto(EIfctexturemap type, EIfcface value) throws SdaiException;
	public void unsetMappedto(EIfctexturemap type) throws SdaiException;

}
