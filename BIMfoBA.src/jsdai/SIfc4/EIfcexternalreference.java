/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcExternalReference

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcexternalreference extends EEntity {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Location, base type: STRING
	public boolean testLocation(EIfcexternalreference type) throws SdaiException;
	public String getLocation(EIfcexternalreference type) throws SdaiException;
	public void setLocation(EIfcexternalreference type, String value) throws SdaiException;
	public void unsetLocation(EIfcexternalreference type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Identification, base type: STRING
	public boolean testIdentification(EIfcexternalreference type) throws SdaiException;
	public String getIdentification(EIfcexternalreference type) throws SdaiException;
	public void setIdentification(EIfcexternalreference type, String value) throws SdaiException;
	public void unsetIdentification(EIfcexternalreference type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Name, base type: STRING
	public boolean testName(EIfcexternalreference type) throws SdaiException;
	public String getName(EIfcexternalreference type) throws SdaiException;
	public void setName(EIfcexternalreference type, String value) throws SdaiException;
	public void unsetName(EIfcexternalreference type) throws SdaiException;

	// Inverse attribute - ExternalReferenceForResources : SET[0:-2147483648] OF IfcExternalReferenceRelationship FOR RelatingReference
	public AIfcexternalreferencerelationship getExternalreferenceforresources(EIfcexternalreference type, ASdaiModel domain) throws SdaiException;
}
