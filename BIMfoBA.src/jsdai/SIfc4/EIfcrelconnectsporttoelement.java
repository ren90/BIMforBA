/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcRelConnectsPortToElement

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcrelconnectsporttoelement extends EIfcrelconnects {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:RelatingPort, base type: entity IfcPort
	public boolean testRelatingport(EIfcrelconnectsporttoelement type) throws SdaiException;
	public EIfcport getRelatingport(EIfcrelconnectsporttoelement type) throws SdaiException;
	public void setRelatingport(EIfcrelconnectsporttoelement type, EIfcport value) throws SdaiException;
	public void unsetRelatingport(EIfcrelconnectsporttoelement type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:RelatedElement, base type: entity IfcDistributionElement
	public boolean testRelatedelement(EIfcrelconnectsporttoelement type) throws SdaiException;
	public EIfcdistributionelement getRelatedelement(EIfcrelconnectsporttoelement type) throws SdaiException;
	public void setRelatedelement(EIfcrelconnectsporttoelement type, EIfcdistributionelement value) throws SdaiException;
	public void unsetRelatedelement(EIfcrelconnectsporttoelement type) throws SdaiException;

}
