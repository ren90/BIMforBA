/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcSensor

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcsensor extends EIfcdistributioncontrolelement {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:PredefinedType, base type: ENUMERATION
	public boolean testPredefinedtype(EIfcsensor type) throws SdaiException;
	public int getPredefinedtype(EIfcsensor type) throws SdaiException;
	public void setPredefinedtype(EIfcsensor type, int value) throws SdaiException;
	public void unsetPredefinedtype(EIfcsensor type) throws SdaiException;

}
