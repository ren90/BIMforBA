/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcSanitaryTerminal

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcsanitaryterminal extends EIfcflowterminal {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:PredefinedType, base type: ENUMERATION
	public boolean testPredefinedtype(EIfcsanitaryterminal type) throws SdaiException;
	public int getPredefinedtype(EIfcsanitaryterminal type) throws SdaiException;
	public void setPredefinedtype(EIfcsanitaryterminal type, int value) throws SdaiException;
	public void unsetPredefinedtype(EIfcsanitaryterminal type) throws SdaiException;

}