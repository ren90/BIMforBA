/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcTextureCoordinateGenerator

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfctexturecoordinategenerator extends EIfctexturecoordinate {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Mode, base type: STRING
	public boolean testMode(EIfctexturecoordinategenerator type) throws SdaiException;
	public String getMode(EIfctexturecoordinategenerator type) throws SdaiException;
	public void setMode(EIfctexturecoordinategenerator type, String value) throws SdaiException;
	public void unsetMode(EIfctexturecoordinategenerator type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: Parameter, base type: LIST OF REAL
	public boolean testParameter(EIfctexturecoordinategenerator type) throws SdaiException;
	public A_double getParameter(EIfctexturecoordinategenerator type) throws SdaiException;
	public A_double createParameter(EIfctexturecoordinategenerator type) throws SdaiException;
	public void unsetParameter(EIfctexturecoordinategenerator type) throws SdaiException;

}
