/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcCoil

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfccoil extends EIfcenergyconversiondevice {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:PredefinedType, base type: ENUMERATION
	public boolean testPredefinedtype(EIfccoil type) throws SdaiException;
	public int getPredefinedtype(EIfccoil type) throws SdaiException;
	public void setPredefinedtype(EIfccoil type, int value) throws SdaiException;
	public void unsetPredefinedtype(EIfccoil type) throws SdaiException;

}
