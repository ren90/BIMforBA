/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcFace

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcface extends EIfctopologicalrepresentationitem {

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: Bounds, base type: SET OF ENTITY
	public boolean testBounds(EIfcface type) throws SdaiException;
	public AIfcfacebound getBounds(EIfcface type) throws SdaiException;
	public AIfcfacebound createBounds(EIfcface type) throws SdaiException;
	public void unsetBounds(EIfcface type) throws SdaiException;

	// Inverse attribute - HasTextureMaps : SET[0:-2147483648] OF IfcTextureMap FOR MappedTo
	public AIfctexturemap getHastexturemaps(EIfcface type, ASdaiModel domain) throws SdaiException;
}