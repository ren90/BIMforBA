/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcPropertyListValue

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcpropertylistvalue extends EIfcsimpleproperty {

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: ListValues, base type: LIST OF SELECT
	public boolean testListvalues(EIfcpropertylistvalue type) throws SdaiException;
	public AIfcvalue getListvalues(EIfcpropertylistvalue type) throws SdaiException;
	public AIfcvalue createListvalues(EIfcpropertylistvalue type) throws SdaiException;
	public void unsetListvalues(EIfcpropertylistvalue type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: Unit
	boolean testUnit(EIfcpropertylistvalue type) throws SdaiException;

	EEntity getUnit(EIfcpropertylistvalue type) throws SdaiException; // case 1

	void setUnit(EIfcpropertylistvalue type, EEntity value) throws SdaiException; // case 1

	void unsetUnit(EIfcpropertylistvalue type) throws SdaiException;

}
