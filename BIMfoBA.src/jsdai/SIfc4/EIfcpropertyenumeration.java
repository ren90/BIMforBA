/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcPropertyEnumeration

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcpropertyenumeration extends EIfcpropertyabstraction {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Name, base type: STRING
	public boolean testName(EIfcpropertyenumeration type) throws SdaiException;
	public String getName(EIfcpropertyenumeration type) throws SdaiException;
	public void setName(EIfcpropertyenumeration type, String value) throws SdaiException;
	public void unsetName(EIfcpropertyenumeration type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: EnumerationValues, base type: LIST OF SELECT
	public boolean testEnumerationvalues(EIfcpropertyenumeration type) throws SdaiException;
	public AIfcvalue getEnumerationvalues(EIfcpropertyenumeration type) throws SdaiException;
	public AIfcvalue createEnumerationvalues(EIfcpropertyenumeration type) throws SdaiException;
	public void unsetEnumerationvalues(EIfcpropertyenumeration type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: Unit
	boolean testUnit(EIfcpropertyenumeration type) throws SdaiException;

	EEntity getUnit(EIfcpropertyenumeration type) throws SdaiException; // case 1

	void setUnit(EIfcpropertyenumeration type, EEntity value) throws SdaiException; // case 1

	void unsetUnit(EIfcpropertyenumeration type) throws SdaiException;

}
