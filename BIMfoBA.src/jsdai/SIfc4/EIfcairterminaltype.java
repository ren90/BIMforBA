/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcAirTerminalType

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcairterminaltype extends EIfcflowterminaltype {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:PredefinedType, base type: ENUMERATION
	public boolean testPredefinedtype(EIfcairterminaltype type) throws SdaiException;
	public int getPredefinedtype(EIfcairterminaltype type) throws SdaiException;
	public void setPredefinedtype(EIfcairterminaltype type, int value) throws SdaiException;
	public void unsetPredefinedtype(EIfcairterminaltype type) throws SdaiException;

}