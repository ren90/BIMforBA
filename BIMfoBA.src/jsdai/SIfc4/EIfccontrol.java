/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcControl

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfccontrol extends EIfcobject {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Identification, base type: STRING
	public boolean testIdentification(EIfccontrol type) throws SdaiException;
	public String getIdentification(EIfccontrol type) throws SdaiException;
	public void setIdentification(EIfccontrol type, String value) throws SdaiException;
	public void unsetIdentification(EIfccontrol type) throws SdaiException;

	// Inverse attribute - Controls : SET[0:-2147483648] OF IfcRelAssignsToControl FOR RelatingControl
	public AIfcrelassignstocontrol getControls(EIfccontrol type, ASdaiModel domain) throws SdaiException;
}
