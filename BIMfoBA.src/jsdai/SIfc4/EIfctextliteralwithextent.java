/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcTextLiteralWithExtent

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfctextliteralwithextent extends EIfctextliteral {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:Extent, base type: entity IfcPlanarExtent
	public boolean testExtent(EIfctextliteralwithextent type) throws SdaiException;
	public EIfcplanarextent getExtent(EIfctextliteralwithextent type) throws SdaiException;
	public void setExtent(EIfctextliteralwithextent type, EIfcplanarextent value) throws SdaiException;
	public void unsetExtent(EIfctextliteralwithextent type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:BoxAlignment, base type: STRING
	public boolean testBoxalignment(EIfctextliteralwithextent type) throws SdaiException;
	public String getBoxalignment(EIfctextliteralwithextent type) throws SdaiException;
	public void setBoxalignment(EIfctextliteralwithextent type, String value) throws SdaiException;
	public void unsetBoxalignment(EIfctextliteralwithextent type) throws SdaiException;

}
