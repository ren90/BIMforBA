/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcMaterialConstituentSet

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcmaterialconstituentset extends EIfcmaterialdefinition {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Name, base type: STRING
	public boolean testName(EIfcmaterialconstituentset type) throws SdaiException;
	public String getName(EIfcmaterialconstituentset type) throws SdaiException;
	public void setName(EIfcmaterialconstituentset type, String value) throws SdaiException;
	public void unsetName(EIfcmaterialconstituentset type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Description, base type: STRING
	public boolean testDescription(EIfcmaterialconstituentset type) throws SdaiException;
	public String getDescription(EIfcmaterialconstituentset type) throws SdaiException;
	public void setDescription(EIfcmaterialconstituentset type, String value) throws SdaiException;
	public void unsetDescription(EIfcmaterialconstituentset type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: MaterialConstituents, base type: SET OF ENTITY
	public boolean testMaterialconstituents(EIfcmaterialconstituentset type) throws SdaiException;
	public AIfcmaterialconstituent getMaterialconstituents(EIfcmaterialconstituentset type) throws SdaiException;
	public AIfcmaterialconstituent createMaterialconstituents(EIfcmaterialconstituentset type) throws SdaiException;
	public void unsetMaterialconstituents(EIfcmaterialconstituentset type) throws SdaiException;

}
