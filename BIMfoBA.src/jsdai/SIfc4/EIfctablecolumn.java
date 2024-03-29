/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcTableColumn

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfctablecolumn extends EEntity {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Identifier, base type: STRING
	public boolean testIdentifier(EIfctablecolumn type) throws SdaiException;
	public String getIdentifier(EIfctablecolumn type) throws SdaiException;
	public void setIdentifier(EIfctablecolumn type, String value) throws SdaiException;
	public void unsetIdentifier(EIfctablecolumn type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Name, base type: STRING
	public boolean testName(EIfctablecolumn type) throws SdaiException;
	public String getName(EIfctablecolumn type) throws SdaiException;
	public void setName(EIfctablecolumn type, String value) throws SdaiException;
	public void unsetName(EIfctablecolumn type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Description, base type: STRING
	public boolean testDescription(EIfctablecolumn type) throws SdaiException;
	public String getDescription(EIfctablecolumn type) throws SdaiException;
	public void setDescription(EIfctablecolumn type, String value) throws SdaiException;
	public void unsetDescription(EIfctablecolumn type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: Unit
	boolean testUnit(EIfctablecolumn type) throws SdaiException;

	EEntity getUnit(EIfctablecolumn type) throws SdaiException; // case 1

	void setUnit(EIfctablecolumn type, EEntity value) throws SdaiException; // case 1

	void unsetUnit(EIfctablecolumn type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:ReferencePath, base type: entity IfcReference
	public boolean testReferencepath(EIfctablecolumn type) throws SdaiException;
	public EIfcreference getReferencepath(EIfctablecolumn type) throws SdaiException;
	public void setReferencepath(EIfctablecolumn type, EIfcreference value) throws SdaiException;
	public void unsetReferencepath(EIfctablecolumn type) throws SdaiException;

}
