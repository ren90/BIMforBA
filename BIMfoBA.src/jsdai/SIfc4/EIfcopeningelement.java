/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcOpeningElement

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcopeningelement extends EIfcfeatureelementsubtraction {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:PredefinedType, base type: ENUMERATION
	public boolean testPredefinedtype(EIfcopeningelement type) throws SdaiException;
	public int getPredefinedtype(EIfcopeningelement type) throws SdaiException;
	public void setPredefinedtype(EIfcopeningelement type, int value) throws SdaiException;
	public void unsetPredefinedtype(EIfcopeningelement type) throws SdaiException;

	// Inverse attribute - HasFillings : SET[0:-2147483648] OF IfcRelFillsElement FOR RelatingOpeningElement
	public AIfcrelfillselement getHasfillings(EIfcopeningelement type, ASdaiModel domain) throws SdaiException;
}
