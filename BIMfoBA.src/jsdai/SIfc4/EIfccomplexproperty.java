/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcComplexProperty

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfccomplexproperty extends EIfcproperty {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:UsageName, base type: STRING
	public boolean testUsagename(EIfccomplexproperty type) throws SdaiException;
	public String getUsagename(EIfccomplexproperty type) throws SdaiException;
	public void setUsagename(EIfccomplexproperty type, String value) throws SdaiException;
	public void unsetUsagename(EIfccomplexproperty type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: HasProperties, base type: SET OF ENTITY
	public boolean testHasproperties(EIfccomplexproperty type) throws SdaiException;
	public AIfcproperty getHasproperties(EIfccomplexproperty type) throws SdaiException;
	public AIfcproperty createHasproperties(EIfccomplexproperty type) throws SdaiException;
	public void unsetHasproperties(EIfccomplexproperty type) throws SdaiException;

}