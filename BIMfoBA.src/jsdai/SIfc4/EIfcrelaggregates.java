/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcRelAggregates

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcrelaggregates extends EIfcreldecomposes {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:RelatingObject, base type: entity IfcObjectDefinition
	public boolean testRelatingobject(EIfcrelaggregates type) throws SdaiException;
	public EIfcobjectdefinition getRelatingobject(EIfcrelaggregates type) throws SdaiException;
	public void setRelatingobject(EIfcrelaggregates type, EIfcobjectdefinition value) throws SdaiException;
	public void unsetRelatingobject(EIfcrelaggregates type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: RelatedObjects, base type: SET OF ENTITY
	public boolean testRelatedobjects(EIfcrelaggregates type) throws SdaiException;
	public AIfcobjectdefinition getRelatedobjects(EIfcrelaggregates type) throws SdaiException;
	public AIfcobjectdefinition createRelatedobjects(EIfcrelaggregates type) throws SdaiException;
	public void unsetRelatedobjects(EIfcrelaggregates type) throws SdaiException;

}
