/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcPhysicalQuantity

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcphysicalquantity extends EEntity {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Name, base type: STRING
	public boolean testName(EIfcphysicalquantity type) throws SdaiException;
	public String getName(EIfcphysicalquantity type) throws SdaiException;
	public void setName(EIfcphysicalquantity type, String value) throws SdaiException;
	public void unsetName(EIfcphysicalquantity type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Description, base type: STRING
	public boolean testDescription(EIfcphysicalquantity type) throws SdaiException;
	public String getDescription(EIfcphysicalquantity type) throws SdaiException;
	public void setDescription(EIfcphysicalquantity type, String value) throws SdaiException;
	public void unsetDescription(EIfcphysicalquantity type) throws SdaiException;

	// Inverse attribute - HasExternalReferences : SET[0:-2147483648] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
	public AIfcexternalreferencerelationship getHasexternalreferences(EIfcphysicalquantity type, ASdaiModel domain) throws SdaiException;
	public AIfcphysicalcomplexquantity getPartofcomplex(EIfcphysicalquantity type, ASdaiModel domain) throws SdaiException;
}
