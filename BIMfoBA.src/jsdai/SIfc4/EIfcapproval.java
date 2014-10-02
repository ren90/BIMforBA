/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcApproval

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcapproval extends EEntity {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Identifier, base type: STRING
	public boolean testIdentifier(EIfcapproval type) throws SdaiException;
	public String getIdentifier(EIfcapproval type) throws SdaiException;
	public void setIdentifier(EIfcapproval type, String value) throws SdaiException;
	public void unsetIdentifier(EIfcapproval type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Name, base type: STRING
	public boolean testName(EIfcapproval type) throws SdaiException;
	public String getName(EIfcapproval type) throws SdaiException;
	public void setName(EIfcapproval type, String value) throws SdaiException;
	public void unsetName(EIfcapproval type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Description, base type: STRING
	public boolean testDescription(EIfcapproval type) throws SdaiException;
	public String getDescription(EIfcapproval type) throws SdaiException;
	public void setDescription(EIfcapproval type, String value) throws SdaiException;
	public void unsetDescription(EIfcapproval type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:TimeOfApproval, base type: STRING
	public boolean testTimeofapproval(EIfcapproval type) throws SdaiException;
	public String getTimeofapproval(EIfcapproval type) throws SdaiException;
	public void setTimeofapproval(EIfcapproval type, String value) throws SdaiException;
	public void unsetTimeofapproval(EIfcapproval type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Status, base type: STRING
	public boolean testStatus(EIfcapproval type) throws SdaiException;
	public String getStatus(EIfcapproval type) throws SdaiException;
	public void setStatus(EIfcapproval type, String value) throws SdaiException;
	public void unsetStatus(EIfcapproval type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Level, base type: STRING
	public boolean testLevel(EIfcapproval type) throws SdaiException;
	public String getLevel(EIfcapproval type) throws SdaiException;
	public void setLevel(EIfcapproval type, String value) throws SdaiException;
	public void unsetLevel(EIfcapproval type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Qualifier, base type: STRING
	public boolean testQualifier(EIfcapproval type) throws SdaiException;
	public String getQualifier(EIfcapproval type) throws SdaiException;
	public void setQualifier(EIfcapproval type, String value) throws SdaiException;
	public void unsetQualifier(EIfcapproval type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: RequestingApproval
	boolean testRequestingapproval(EIfcapproval type) throws SdaiException;

	EEntity getRequestingapproval(EIfcapproval type) throws SdaiException; // case 1

	void setRequestingapproval(EIfcapproval type, EEntity value) throws SdaiException; // case 1

	void unsetRequestingapproval(EIfcapproval type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: GivingApproval
	boolean testGivingapproval(EIfcapproval type) throws SdaiException;

	EEntity getGivingapproval(EIfcapproval type) throws SdaiException; // case 1

	void setGivingapproval(EIfcapproval type, EEntity value) throws SdaiException; // case 1

	void unsetGivingapproval(EIfcapproval type) throws SdaiException;

	// Inverse attribute - HasExternalReferences : SET[0:-2147483648] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
	public AIfcexternalreferencerelationship getHasexternalreferences(EIfcapproval type, ASdaiModel domain) throws SdaiException;
	// Inverse attribute - ApprovedObjects : SET[0:-2147483648] OF IfcRelAssociatesApproval FOR RelatingApproval
	public AIfcrelassociatesapproval getApprovedobjects(EIfcapproval type, ASdaiModel domain) throws SdaiException;
	// Inverse attribute - ApprovedResources : SET[0:-2147483648] OF IfcResourceApprovalRelationship FOR RelatingApproval
	public AIfcresourceapprovalrelationship getApprovedresources(EIfcapproval type, ASdaiModel domain) throws SdaiException;
	// Inverse attribute - IsRelatedWith : SET[0:-2147483648] OF IfcApprovalRelationship FOR RelatedApprovals
	public AIfcapprovalrelationship getIsrelatedwith(EIfcapproval type, ASdaiModel domain) throws SdaiException;
	// Inverse attribute - Relates : SET[0:-2147483648] OF IfcApprovalRelationship FOR RelatingApproval
	public AIfcapprovalrelationship getRelates(EIfcapproval type, ASdaiModel domain) throws SdaiException;
}