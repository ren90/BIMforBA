/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcTaskType

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfctasktype extends EIfctypeprocess {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:PredefinedType, base type: ENUMERATION
	public boolean testPredefinedtype(EIfctasktype type) throws SdaiException;
	public int getPredefinedtype(EIfctasktype type) throws SdaiException;
	public void setPredefinedtype(EIfctasktype type, int value) throws SdaiException;
	public void unsetPredefinedtype(EIfctasktype type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:WorkMethod, base type: STRING
	public boolean testWorkmethod(EIfctasktype type) throws SdaiException;
	public String getWorkmethod(EIfctasktype type) throws SdaiException;
	public void setWorkmethod(EIfctasktype type, String value) throws SdaiException;
	public void unsetWorkmethod(EIfctasktype type) throws SdaiException;

}
