/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcConversionBasedUnit

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcconversionbasedunit extends EIfcnamedunit {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Name, base type: STRING
	public boolean testName(EIfcconversionbasedunit type) throws SdaiException;
	public String getName(EIfcconversionbasedunit type) throws SdaiException;
	public void setName(EIfcconversionbasedunit type, String value) throws SdaiException;
	public void unsetName(EIfcconversionbasedunit type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:ConversionFactor, base type: entity IfcMeasureWithUnit
	public boolean testConversionfactor(EIfcconversionbasedunit type) throws SdaiException;
	public EIfcmeasurewithunit getConversionfactor(EIfcconversionbasedunit type) throws SdaiException;
	public void setConversionfactor(EIfcconversionbasedunit type, EIfcmeasurewithunit value) throws SdaiException;
	public void unsetConversionfactor(EIfcconversionbasedunit type) throws SdaiException;

	// Inverse attribute - HasExternalReference : SET[0:-2147483648] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
	public AIfcexternalreferencerelationship getHasexternalreference(EIfcconversionbasedunit type, ASdaiModel domain) throws SdaiException;
}