/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcDocumentInformationRelationship

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcdocumentinformationrelationship extends EIfcresourcelevelrelationship {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:RelatingDocument, base type: entity IfcDocumentInformation
	public boolean testRelatingdocument(EIfcdocumentinformationrelationship type) throws SdaiException;
	public EIfcdocumentinformation getRelatingdocument(EIfcdocumentinformationrelationship type) throws SdaiException;
	public void setRelatingdocument(EIfcdocumentinformationrelationship type, EIfcdocumentinformation value) throws SdaiException;
	public void unsetRelatingdocument(EIfcdocumentinformationrelationship type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: RelatedDocuments, base type: SET OF ENTITY
	public boolean testRelateddocuments(EIfcdocumentinformationrelationship type) throws SdaiException;
	public AIfcdocumentinformation getRelateddocuments(EIfcdocumentinformationrelationship type) throws SdaiException;
	public AIfcdocumentinformation createRelateddocuments(EIfcdocumentinformationrelationship type) throws SdaiException;
	public void unsetRelateddocuments(EIfcdocumentinformationrelationship type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:RelationshipType, base type: STRING
	public boolean testRelationshiptype(EIfcdocumentinformationrelationship type) throws SdaiException;
	public String getRelationshiptype(EIfcdocumentinformationrelationship type) throws SdaiException;
	public void setRelationshiptype(EIfcdocumentinformationrelationship type, String value) throws SdaiException;
	public void unsetRelationshiptype(EIfcdocumentinformationrelationship type) throws SdaiException;

}
