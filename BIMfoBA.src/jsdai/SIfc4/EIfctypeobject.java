/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcTypeObject

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfctypeobject extends EIfcobjectdefinition {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:ApplicableOccurrence, base type: STRING
	public boolean testApplicableoccurrence(EIfctypeobject type) throws SdaiException;
	public String getApplicableoccurrence(EIfctypeobject type) throws SdaiException;
	public void setApplicableoccurrence(EIfctypeobject type, String value) throws SdaiException;
	public void unsetApplicableoccurrence(EIfctypeobject type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: HasPropertySets, base type: SET OF ENTITY
	public boolean testHaspropertysets(EIfctypeobject type) throws SdaiException;
	public AIfcpropertysetdefinition getHaspropertysets(EIfctypeobject type) throws SdaiException;
	public AIfcpropertysetdefinition createHaspropertysets(EIfctypeobject type) throws SdaiException;
	public void unsetHaspropertysets(EIfctypeobject type) throws SdaiException;

	public AIfcreldefinesbytype getTypes(EIfctypeobject type, ASdaiModel domain) throws SdaiException;
}