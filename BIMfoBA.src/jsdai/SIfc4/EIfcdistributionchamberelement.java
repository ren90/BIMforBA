/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcDistributionChamberElement

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcdistributionchamberelement extends EIfcdistributionflowelement {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:PredefinedType, base type: ENUMERATION
	public boolean testPredefinedtype(EIfcdistributionchamberelement type) throws SdaiException;
	public int getPredefinedtype(EIfcdistributionchamberelement type) throws SdaiException;
	public void setPredefinedtype(EIfcdistributionchamberelement type, int value) throws SdaiException;
	public void unsetPredefinedtype(EIfcdistributionchamberelement type) throws SdaiException;

}
