/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcMappedItem

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcmappeditem extends EIfcrepresentationitem {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:MappingSource, base type: entity IfcRepresentationMap
	public boolean testMappingsource(EIfcmappeditem type) throws SdaiException;
	public EIfcrepresentationmap getMappingsource(EIfcmappeditem type) throws SdaiException;
	public void setMappingsource(EIfcmappeditem type, EIfcrepresentationmap value) throws SdaiException;
	public void unsetMappingsource(EIfcmappeditem type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:MappingTarget, base type: entity IfcCartesianTransformationOperator
	public boolean testMappingtarget(EIfcmappeditem type) throws SdaiException;
	public EIfccartesiantransformationoperator getMappingtarget(EIfcmappeditem type) throws SdaiException;
	public void setMappingtarget(EIfcmappeditem type, EIfccartesiantransformationoperator value) throws SdaiException;
	public void unsetMappingtarget(EIfcmappeditem type) throws SdaiException;

}
