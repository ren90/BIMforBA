/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcSystemFurnitureElement

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcsystemfurnitureelement extends EIfcfurnishingelement {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:PredefinedType, base type: ENUMERATION
	public boolean testPredefinedtype(EIfcsystemfurnitureelement type) throws SdaiException;
	public int getPredefinedtype(EIfcsystemfurnitureelement type) throws SdaiException;
	public void setPredefinedtype(EIfcsystemfurnitureelement type, int value) throws SdaiException;
	public void unsetPredefinedtype(EIfcsystemfurnitureelement type) throws SdaiException;

}
