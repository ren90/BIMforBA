/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcRelProjectsElement

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcrelprojectselement extends EIfcreldecomposes {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:RelatingElement, base type: entity IfcElement
	public boolean testRelatingelement(EIfcrelprojectselement type) throws SdaiException;
	public EIfcelement getRelatingelement(EIfcrelprojectselement type) throws SdaiException;
	public void setRelatingelement(EIfcrelprojectselement type, EIfcelement value) throws SdaiException;
	public void unsetRelatingelement(EIfcrelprojectselement type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:RelatedFeatureElement, base type: entity IfcFeatureElementAddition
	public boolean testRelatedfeatureelement(EIfcrelprojectselement type) throws SdaiException;
	public EIfcfeatureelementaddition getRelatedfeatureelement(EIfcrelprojectselement type) throws SdaiException;
	public void setRelatedfeatureelement(EIfcrelprojectselement type, EIfcfeatureelementaddition value) throws SdaiException;
	public void unsetRelatedfeatureelement(EIfcrelprojectselement type) throws SdaiException;

}
