/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcDocumentInformation

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcdocumentinformation extends EIfcexternalinformation {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Identification, base type: STRING
	public boolean testIdentification(EIfcdocumentinformation type) throws SdaiException;
	public String getIdentification(EIfcdocumentinformation type) throws SdaiException;
	public void setIdentification(EIfcdocumentinformation type, String value) throws SdaiException;
	public void unsetIdentification(EIfcdocumentinformation type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Name, base type: STRING
	public boolean testName(EIfcdocumentinformation type) throws SdaiException;
	public String getName(EIfcdocumentinformation type) throws SdaiException;
	public void setName(EIfcdocumentinformation type, String value) throws SdaiException;
	public void unsetName(EIfcdocumentinformation type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Description, base type: STRING
	public boolean testDescription(EIfcdocumentinformation type) throws SdaiException;
	public String getDescription(EIfcdocumentinformation type) throws SdaiException;
	public void setDescription(EIfcdocumentinformation type, String value) throws SdaiException;
	public void unsetDescription(EIfcdocumentinformation type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Location, base type: STRING
	public boolean testLocation(EIfcdocumentinformation type) throws SdaiException;
	public String getLocation(EIfcdocumentinformation type) throws SdaiException;
	public void setLocation(EIfcdocumentinformation type, String value) throws SdaiException;
	public void unsetLocation(EIfcdocumentinformation type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Purpose, base type: STRING
	public boolean testPurpose(EIfcdocumentinformation type) throws SdaiException;
	public String getPurpose(EIfcdocumentinformation type) throws SdaiException;
	public void setPurpose(EIfcdocumentinformation type, String value) throws SdaiException;
	public void unsetPurpose(EIfcdocumentinformation type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:IntendedUse, base type: STRING
	public boolean testIntendeduse(EIfcdocumentinformation type) throws SdaiException;
	public String getIntendeduse(EIfcdocumentinformation type) throws SdaiException;
	public void setIntendeduse(EIfcdocumentinformation type, String value) throws SdaiException;
	public void unsetIntendeduse(EIfcdocumentinformation type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Scope, base type: STRING
	public boolean testScope(EIfcdocumentinformation type) throws SdaiException;
	public String getScope(EIfcdocumentinformation type) throws SdaiException;
	public void setScope(EIfcdocumentinformation type, String value) throws SdaiException;
	public void unsetScope(EIfcdocumentinformation type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Revision, base type: STRING
	public boolean testRevision(EIfcdocumentinformation type) throws SdaiException;
	public String getRevision(EIfcdocumentinformation type) throws SdaiException;
	public void setRevision(EIfcdocumentinformation type, String value) throws SdaiException;
	public void unsetRevision(EIfcdocumentinformation type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: DocumentOwner
	boolean testDocumentowner(EIfcdocumentinformation type) throws SdaiException;

	EEntity getDocumentowner(EIfcdocumentinformation type) throws SdaiException; // case 1

	void setDocumentowner(EIfcdocumentinformation type, EEntity value) throws SdaiException; // case 1

	void unsetDocumentowner(EIfcdocumentinformation type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: Editors, base type: SET OF SELECT
	public boolean testEditors(EIfcdocumentinformation type) throws SdaiException;
	public AIfcactorselect getEditors(EIfcdocumentinformation type) throws SdaiException;
	public AIfcactorselect createEditors(EIfcdocumentinformation type) throws SdaiException;
	public void unsetEditors(EIfcdocumentinformation type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:CreationTime, base type: STRING
	public boolean testCreationtime(EIfcdocumentinformation type) throws SdaiException;
	public String getCreationtime(EIfcdocumentinformation type) throws SdaiException;
	public void setCreationtime(EIfcdocumentinformation type, String value) throws SdaiException;
	public void unsetCreationtime(EIfcdocumentinformation type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:LastRevisionTime, base type: STRING
	public boolean testLastrevisiontime(EIfcdocumentinformation type) throws SdaiException;
	public String getLastrevisiontime(EIfcdocumentinformation type) throws SdaiException;
	public void setLastrevisiontime(EIfcdocumentinformation type, String value) throws SdaiException;
	public void unsetLastrevisiontime(EIfcdocumentinformation type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:ElectronicFormat, base type: STRING
	public boolean testElectronicformat(EIfcdocumentinformation type) throws SdaiException;
	public String getElectronicformat(EIfcdocumentinformation type) throws SdaiException;
	public void setElectronicformat(EIfcdocumentinformation type, String value) throws SdaiException;
	public void unsetElectronicformat(EIfcdocumentinformation type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:ValidFrom, base type: STRING
	public boolean testValidfrom(EIfcdocumentinformation type) throws SdaiException;
	public String getValidfrom(EIfcdocumentinformation type) throws SdaiException;
	public void setValidfrom(EIfcdocumentinformation type, String value) throws SdaiException;
	public void unsetValidfrom(EIfcdocumentinformation type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:ValidUntil, base type: STRING
	public boolean testValiduntil(EIfcdocumentinformation type) throws SdaiException;
	public String getValiduntil(EIfcdocumentinformation type) throws SdaiException;
	public void setValiduntil(EIfcdocumentinformation type, String value) throws SdaiException;
	public void unsetValiduntil(EIfcdocumentinformation type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:Confidentiality, base type: ENUMERATION
	public boolean testConfidentiality(EIfcdocumentinformation type) throws SdaiException;
	public int getConfidentiality(EIfcdocumentinformation type) throws SdaiException;
	public void setConfidentiality(EIfcdocumentinformation type, int value) throws SdaiException;
	public void unsetConfidentiality(EIfcdocumentinformation type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:Status, base type: ENUMERATION
	public boolean testStatus(EIfcdocumentinformation type) throws SdaiException;
	public int getStatus(EIfcdocumentinformation type) throws SdaiException;
	public void setStatus(EIfcdocumentinformation type, int value) throws SdaiException;
	public void unsetStatus(EIfcdocumentinformation type) throws SdaiException;

	// Inverse attribute - DocumentInfoForObjects : SET[0:-2147483648] OF IfcRelAssociatesDocument FOR RelatingDocument
	public AIfcrelassociatesdocument getDocumentinfoforobjects(EIfcdocumentinformation type, ASdaiModel domain) throws SdaiException;
	// Inverse attribute - HasDocumentReferences : SET[0:-2147483648] OF IfcDocumentReference FOR ReferencedDocument
	public AIfcdocumentreference getHasdocumentreferences(EIfcdocumentinformation type, ASdaiModel domain) throws SdaiException;
	// Inverse attribute - IsPointedTo : SET[0:-2147483648] OF IfcDocumentInformationRelationship FOR RelatedDocuments
	public AIfcdocumentinformationrelationship getIspointedto(EIfcdocumentinformation type, ASdaiModel domain) throws SdaiException;
	public AIfcdocumentinformationrelationship getIspointer(EIfcdocumentinformation type, ASdaiModel domain) throws SdaiException;
}