/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcCurveStyleFont

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfccurvestylefont extends EIfcpresentationitem {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Name, base type: STRING
	public boolean testName(EIfccurvestylefont type) throws SdaiException;
	public String getName(EIfccurvestylefont type) throws SdaiException;
	public void setName(EIfccurvestylefont type, String value) throws SdaiException;
	public void unsetName(EIfccurvestylefont type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: PatternList, base type: LIST OF ENTITY
	public boolean testPatternlist(EIfccurvestylefont type) throws SdaiException;
	public AIfccurvestylefontpattern getPatternlist(EIfccurvestylefont type) throws SdaiException;
	public AIfccurvestylefontpattern createPatternlist(EIfccurvestylefont type) throws SdaiException;
	public void unsetPatternlist(EIfccurvestylefont type) throws SdaiException;

}
