/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcCurveStyle

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfccurvestyle extends EIfcpresentationstyle {

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: CurveFont
	boolean testCurvefont(EIfccurvestyle type) throws SdaiException;

	EEntity getCurvefont(EIfccurvestyle type) throws SdaiException; // case 1

	void setCurvefont(EIfccurvestyle type, EEntity value) throws SdaiException; // case 1

	void unsetCurvefont(EIfccurvestyle type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: CurveWidth
	int sCurvewidthIfcdescriptivemeasure = 2;
	int sCurvewidthIfclengthmeasure = 3;
	int sCurvewidthIfcnormalisedratiomeasure = 4;
	int sCurvewidthIfcpositivelengthmeasure = 5;
	int sCurvewidthIfcpositiveratiomeasure = 6;
	int sCurvewidthIfcratiomeasure = 7;

	int testCurvewidth(EIfccurvestyle type) throws SdaiException;

	String getCurvewidth(EIfccurvestyle type, EIfcdescriptivemeasure node1) throws SdaiException; // case 2
	double getCurvewidth(EIfccurvestyle type, EIfclengthmeasure node1) throws SdaiException; // case 3
	double getCurvewidth(EIfccurvestyle type, EIfcnormalisedratiomeasure node1) throws SdaiException; // case 4
	double getCurvewidth(EIfccurvestyle type, EIfcpositivelengthmeasure node1) throws SdaiException; // case 5
	double getCurvewidth(EIfccurvestyle type, EIfcpositiveratiomeasure node1) throws SdaiException; // case 6
	double getCurvewidth(EIfccurvestyle type, EIfcratiomeasure node1) throws SdaiException; // case 7

	void setCurvewidth(EIfccurvestyle type, String value, EIfcdescriptivemeasure node1) throws SdaiException; // case 2
	void setCurvewidth(EIfccurvestyle type, double value, EIfclengthmeasure node1) throws SdaiException; // case 3
	void setCurvewidth(EIfccurvestyle type, double value, EIfcnormalisedratiomeasure node1) throws SdaiException; // case 4
	void setCurvewidth(EIfccurvestyle type, double value, EIfcpositivelengthmeasure node1) throws SdaiException; // case 5
	void setCurvewidth(EIfccurvestyle type, double value, EIfcpositiveratiomeasure node1) throws SdaiException; // case 6
	void setCurvewidth(EIfccurvestyle type, double value, EIfcratiomeasure node1) throws SdaiException; // case 7

	void unsetCurvewidth(EIfccurvestyle type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: CurveColour
	boolean testCurvecolour(EIfccurvestyle type) throws SdaiException;

	EEntity getCurvecolour(EIfccurvestyle type) throws SdaiException; // case 1

	void setCurvecolour(EIfccurvestyle type, EEntity value) throws SdaiException; // case 1

	void unsetCurvecolour(EIfccurvestyle type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:ModelOrDraughting, base type: BOOLEAN
	public boolean testModelordraughting(EIfccurvestyle type) throws SdaiException;
	public boolean getModelordraughting(EIfccurvestyle type) throws SdaiException;
	public void setModelordraughting(EIfccurvestyle type, boolean value) throws SdaiException;
	public void unsetModelordraughting(EIfccurvestyle type) throws SdaiException;

}
