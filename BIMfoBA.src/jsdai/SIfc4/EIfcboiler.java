/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcBoiler

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcboiler extends EIfcenergyconversiondevice {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:PredefinedType, base type: ENUMERATION
	public boolean testPredefinedtype(EIfcboiler type) throws SdaiException;
	public int getPredefinedtype(EIfcboiler type) throws SdaiException;
	public void setPredefinedtype(EIfcboiler type, int value) throws SdaiException;
	public void unsetPredefinedtype(EIfcboiler type) throws SdaiException;

}
