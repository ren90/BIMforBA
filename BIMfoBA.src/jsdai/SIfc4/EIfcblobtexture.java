/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcBlobTexture

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcblobtexture extends EIfcsurfacetexture {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:RasterFormat, base type: STRING
	public boolean testRasterformat(EIfcblobtexture type) throws SdaiException;
	public String getRasterformat(EIfcblobtexture type) throws SdaiException;
	public void setRasterformat(EIfcblobtexture type, String value) throws SdaiException;
	public void unsetRasterformat(EIfcblobtexture type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:RasterCode, base type: BINARY
	public boolean testRastercode(EIfcblobtexture type) throws SdaiException;
	public Binary getRastercode(EIfcblobtexture type) throws SdaiException;
	public void setRastercode(EIfcblobtexture type, Binary value) throws SdaiException;
	public void unsetRastercode(EIfcblobtexture type) throws SdaiException;

}