/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcApplication

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcapplication extends EEntity {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:ApplicationDeveloper, base type: entity IfcOrganization
	public boolean testApplicationdeveloper(EIfcapplication type) throws SdaiException;
	public EIfcorganization getApplicationdeveloper(EIfcapplication type) throws SdaiException;
	public void setApplicationdeveloper(EIfcapplication type, EIfcorganization value) throws SdaiException;
	public void unsetApplicationdeveloper(EIfcapplication type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Version, base type: STRING
	public boolean testVersion(EIfcapplication type) throws SdaiException;
	public String getVersion(EIfcapplication type) throws SdaiException;
	public void setVersion(EIfcapplication type, String value) throws SdaiException;
	public void unsetVersion(EIfcapplication type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:ApplicationFullName, base type: STRING
	public boolean testApplicationfullname(EIfcapplication type) throws SdaiException;
	public String getApplicationfullname(EIfcapplication type) throws SdaiException;
	public void setApplicationfullname(EIfcapplication type, String value) throws SdaiException;
	public void unsetApplicationfullname(EIfcapplication type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:ApplicationIdentifier, base type: STRING
	public boolean testApplicationidentifier(EIfcapplication type) throws SdaiException;
	public String getApplicationidentifier(EIfcapplication type) throws SdaiException;
	public void setApplicationidentifier(EIfcapplication type, String value) throws SdaiException;
	public void unsetApplicationidentifier(EIfcapplication type) throws SdaiException;

}
