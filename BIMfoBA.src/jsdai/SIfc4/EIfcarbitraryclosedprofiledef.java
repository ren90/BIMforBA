/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcArbitraryClosedProfileDef

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcarbitraryclosedprofiledef extends EIfcprofiledef {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:OuterCurve, base type: entity IfcCurve
	public boolean testOutercurve(EIfcarbitraryclosedprofiledef type) throws SdaiException;
	public EIfccurve getOutercurve(EIfcarbitraryclosedprofiledef type) throws SdaiException;
	public void setOutercurve(EIfcarbitraryclosedprofiledef type, EIfccurve value) throws SdaiException;
	public void unsetOutercurve(EIfcarbitraryclosedprofiledef type) throws SdaiException;

}
