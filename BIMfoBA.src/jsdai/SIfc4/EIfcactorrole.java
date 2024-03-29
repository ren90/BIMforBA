/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcActorRole

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcactorrole extends EEntity {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:Role, base type: ENUMERATION
	public boolean testRole(EIfcactorrole type) throws SdaiException;
	public int getRole(EIfcactorrole type) throws SdaiException;
	public void setRole(EIfcactorrole type, int value) throws SdaiException;
	public void unsetRole(EIfcactorrole type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:UserDefinedRole, base type: STRING
	public boolean testUserdefinedrole(EIfcactorrole type) throws SdaiException;
	public String getUserdefinedrole(EIfcactorrole type) throws SdaiException;
	public void setUserdefinedrole(EIfcactorrole type, String value) throws SdaiException;
	public void unsetUserdefinedrole(EIfcactorrole type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Description, base type: STRING
	public boolean testDescription(EIfcactorrole type) throws SdaiException;
	public String getDescription(EIfcactorrole type) throws SdaiException;
	public void setDescription(EIfcactorrole type, String value) throws SdaiException;
	public void unsetDescription(EIfcactorrole type) throws SdaiException;

	// Inverse attribute - HasExternalReference : SET[0:-2147483648] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
	public AIfcexternalreferencerelationship getHasexternalreference(EIfcactorrole type, ASdaiModel domain) throws SdaiException;
}
