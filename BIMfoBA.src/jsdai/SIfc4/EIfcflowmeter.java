/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcFlowMeter

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcflowmeter extends EIfcflowcontroller {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:PredefinedType, base type: ENUMERATION
	public boolean testPredefinedtype(EIfcflowmeter type) throws SdaiException;
	public int getPredefinedtype(EIfcflowmeter type) throws SdaiException;
	public void setPredefinedtype(EIfcflowmeter type, int value) throws SdaiException;
	public void unsetPredefinedtype(EIfcflowmeter type) throws SdaiException;

}