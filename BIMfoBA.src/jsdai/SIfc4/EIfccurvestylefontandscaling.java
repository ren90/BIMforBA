/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcCurveStyleFontAndScaling

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfccurvestylefontandscaling extends EIfcpresentationitem {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Name, base type: STRING
	public boolean testName(EIfccurvestylefontandscaling type) throws SdaiException;
	public String getName(EIfccurvestylefontandscaling type) throws SdaiException;
	public void setName(EIfccurvestylefontandscaling type, String value) throws SdaiException;
	public void unsetName(EIfccurvestylefontandscaling type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: CurveFont
	boolean testCurvefont(EIfccurvestylefontandscaling type) throws SdaiException;

	EEntity getCurvefont(EIfccurvestylefontandscaling type) throws SdaiException; // case 1

	void setCurvefont(EIfccurvestylefontandscaling type, EEntity value) throws SdaiException; // case 1

	void unsetCurvefont(EIfccurvestylefontandscaling type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:CurveFontScaling, base type: REAL
	public boolean testCurvefontscaling(EIfccurvestylefontandscaling type) throws SdaiException;
	public double getCurvefontscaling(EIfccurvestylefontandscaling type) throws SdaiException;
	public void setCurvefontscaling(EIfccurvestylefontandscaling type, double value) throws SdaiException;
	public void unsetCurvefontscaling(EIfccurvestylefontandscaling type) throws SdaiException;

}
