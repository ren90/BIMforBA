/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcPreDefinedItem

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcpredefineditem extends EIfcpresentationitem {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Name, base type: STRING
	public boolean testName(EIfcpredefineditem type) throws SdaiException;
	public String getName(EIfcpredefineditem type) throws SdaiException;
	public void setName(EIfcpredefineditem type, String value) throws SdaiException;
	public void unsetName(EIfcpredefineditem type) throws SdaiException;

}