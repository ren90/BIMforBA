/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcTypeProcess

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfctypeprocess extends EIfctypeobject {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Identification, base type: STRING
	public boolean testIdentification(EIfctypeprocess type) throws SdaiException;
	public String getIdentification(EIfctypeprocess type) throws SdaiException;
	public void setIdentification(EIfctypeprocess type, String value) throws SdaiException;
	public void unsetIdentification(EIfctypeprocess type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:LongDescription, base type: STRING
	public boolean testLongdescription(EIfctypeprocess type) throws SdaiException;
	public String getLongdescription(EIfctypeprocess type) throws SdaiException;
	public void setLongdescription(EIfctypeprocess type, String value) throws SdaiException;
	public void unsetLongdescription(EIfctypeprocess type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:ProcessType, base type: STRING
	public boolean testProcesstype(EIfctypeprocess type) throws SdaiException;
	public String getProcesstype(EIfctypeprocess type) throws SdaiException;
	public void setProcesstype(EIfctypeprocess type, String value) throws SdaiException;
	public void unsetProcesstype(EIfctypeprocess type) throws SdaiException;

	// Inverse attribute - OperatesOn : SET[0:-2147483648] OF IfcRelAssignsToProcess FOR RelatingProcess
	public AIfcrelassignstoprocess getOperateson(EIfctypeprocess type, ASdaiModel domain) throws SdaiException;
}
