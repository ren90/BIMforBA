/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcFlowInstrument

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcflowinstrument extends EIfcdistributioncontrolelement {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:PredefinedType, base type: ENUMERATION
	public boolean testPredefinedtype(EIfcflowinstrument type) throws SdaiException;
	public int getPredefinedtype(EIfcflowinstrument type) throws SdaiException;
	public void setPredefinedtype(EIfcflowinstrument type, int value) throws SdaiException;
	public void unsetPredefinedtype(EIfcflowinstrument type) throws SdaiException;

}
