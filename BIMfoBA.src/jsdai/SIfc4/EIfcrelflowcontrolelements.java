/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcRelFlowControlElements

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcrelflowcontrolelements extends EIfcrelconnects {

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: RelatedControlElements, base type: SET OF ENTITY
	public boolean testRelatedcontrolelements(EIfcrelflowcontrolelements type) throws SdaiException;
	public AIfcdistributioncontrolelement getRelatedcontrolelements(EIfcrelflowcontrolelements type) throws SdaiException;
	public AIfcdistributioncontrolelement createRelatedcontrolelements(EIfcrelflowcontrolelements type) throws SdaiException;
	public void unsetRelatedcontrolelements(EIfcrelflowcontrolelements type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:RelatingFlowElement, base type: entity IfcDistributionFlowElement
	public boolean testRelatingflowelement(EIfcrelflowcontrolelements type) throws SdaiException;
	public EIfcdistributionflowelement getRelatingflowelement(EIfcrelflowcontrolelements type) throws SdaiException;
	public void setRelatingflowelement(EIfcrelflowcontrolelements type, EIfcdistributionflowelement value) throws SdaiException;
	public void unsetRelatingflowelement(EIfcrelflowcontrolelements type) throws SdaiException;

}