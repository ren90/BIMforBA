/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcSpatialZoneType

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcspatialzonetype extends EIfcspatialelementtype {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:PredefinedType, base type: ENUMERATION
	public boolean testPredefinedtype(EIfcspatialzonetype type) throws SdaiException;
	public int getPredefinedtype(EIfcspatialzonetype type) throws SdaiException;
	public void setPredefinedtype(EIfcspatialzonetype type, int value) throws SdaiException;
	public void unsetPredefinedtype(EIfcspatialzonetype type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:LongName, base type: STRING
	public boolean testLongname(EIfcspatialzonetype type) throws SdaiException;
	public String getLongname(EIfcspatialzonetype type) throws SdaiException;
	public void setLongname(EIfcspatialzonetype type, String value) throws SdaiException;
	public void unsetLongname(EIfcspatialzonetype type) throws SdaiException;

}