/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcDuctSegment

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcductsegment extends EIfcflowsegment {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:PredefinedType, base type: ENUMERATION
	public boolean testPredefinedtype(EIfcductsegment type) throws SdaiException;
	public int getPredefinedtype(EIfcductsegment type) throws SdaiException;
	public void setPredefinedtype(EIfcductsegment type, int value) throws SdaiException;
	public void unsetPredefinedtype(EIfcductsegment type) throws SdaiException;

}
