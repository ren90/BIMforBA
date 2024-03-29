/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcPostalAddress

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcpostaladdress extends EIfcaddress {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:InternalLocation, base type: STRING
	public boolean testInternallocation(EIfcpostaladdress type) throws SdaiException;
	public String getInternallocation(EIfcpostaladdress type) throws SdaiException;
	public void setInternallocation(EIfcpostaladdress type, String value) throws SdaiException;
	public void unsetInternallocation(EIfcpostaladdress type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: AddressLines, base type: LIST OF STRING
	public boolean testAddresslines(EIfcpostaladdress type) throws SdaiException;
	public A_string getAddresslines(EIfcpostaladdress type) throws SdaiException;
	public A_string createAddresslines(EIfcpostaladdress type) throws SdaiException;
	public void unsetAddresslines(EIfcpostaladdress type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:PostalBox, base type: STRING
	public boolean testPostalbox(EIfcpostaladdress type) throws SdaiException;
	public String getPostalbox(EIfcpostaladdress type) throws SdaiException;
	public void setPostalbox(EIfcpostaladdress type, String value) throws SdaiException;
	public void unsetPostalbox(EIfcpostaladdress type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Town, base type: STRING
	public boolean testTown(EIfcpostaladdress type) throws SdaiException;
	public String getTown(EIfcpostaladdress type) throws SdaiException;
	public void setTown(EIfcpostaladdress type, String value) throws SdaiException;
	public void unsetTown(EIfcpostaladdress type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Region, base type: STRING
	public boolean testRegion(EIfcpostaladdress type) throws SdaiException;
	public String getRegion(EIfcpostaladdress type) throws SdaiException;
	public void setRegion(EIfcpostaladdress type, String value) throws SdaiException;
	public void unsetRegion(EIfcpostaladdress type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:PostalCode, base type: STRING
	public boolean testPostalcode(EIfcpostaladdress type) throws SdaiException;
	public String getPostalcode(EIfcpostaladdress type) throws SdaiException;
	public void setPostalcode(EIfcpostaladdress type, String value) throws SdaiException;
	public void unsetPostalcode(EIfcpostaladdress type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Country, base type: STRING
	public boolean testCountry(EIfcpostaladdress type) throws SdaiException;
	public String getCountry(EIfcpostaladdress type) throws SdaiException;
	public void setCountry(EIfcpostaladdress type, String value) throws SdaiException;
	public void unsetCountry(EIfcpostaladdress type) throws SdaiException;

}
