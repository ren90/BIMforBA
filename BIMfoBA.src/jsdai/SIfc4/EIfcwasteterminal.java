/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcWasteTerminal

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcwasteterminal extends EIfcflowterminal {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:PredefinedType, base type: ENUMERATION
	public boolean testPredefinedtype(EIfcwasteterminal type) throws SdaiException;
	public int getPredefinedtype(EIfcwasteterminal type) throws SdaiException;
	public void setPredefinedtype(EIfcwasteterminal type, int value) throws SdaiException;
	public void unsetPredefinedtype(EIfcwasteterminal type) throws SdaiException;

}
