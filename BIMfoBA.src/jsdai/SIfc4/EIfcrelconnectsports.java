/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcRelConnectsPorts

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcrelconnectsports extends EIfcrelconnects {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:RelatingPort, base type: entity IfcPort
	public boolean testRelatingport(EIfcrelconnectsports type) throws SdaiException;
	public EIfcport getRelatingport(EIfcrelconnectsports type) throws SdaiException;
	public void setRelatingport(EIfcrelconnectsports type, EIfcport value) throws SdaiException;
	public void unsetRelatingport(EIfcrelconnectsports type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:RelatedPort, base type: entity IfcPort
	public boolean testRelatedport(EIfcrelconnectsports type) throws SdaiException;
	public EIfcport getRelatedport(EIfcrelconnectsports type) throws SdaiException;
	public void setRelatedport(EIfcrelconnectsports type, EIfcport value) throws SdaiException;
	public void unsetRelatedport(EIfcrelconnectsports type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:RealizingElement, base type: entity IfcElement
	public boolean testRealizingelement(EIfcrelconnectsports type) throws SdaiException;
	public EIfcelement getRealizingelement(EIfcrelconnectsports type) throws SdaiException;
	public void setRealizingelement(EIfcrelconnectsports type, EIfcelement value) throws SdaiException;
	public void unsetRealizingelement(EIfcrelconnectsports type) throws SdaiException;

}
