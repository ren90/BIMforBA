/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcDoor

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcdoor extends EIfcbuildingelement {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:OverallHeight, base type: REAL
	public boolean testOverallheight(EIfcdoor type) throws SdaiException;
	public double getOverallheight(EIfcdoor type) throws SdaiException;
	public void setOverallheight(EIfcdoor type, double value) throws SdaiException;
	public void unsetOverallheight(EIfcdoor type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:OverallWidth, base type: REAL
	public boolean testOverallwidth(EIfcdoor type) throws SdaiException;
	public double getOverallwidth(EIfcdoor type) throws SdaiException;
	public void setOverallwidth(EIfcdoor type, double value) throws SdaiException;
	public void unsetOverallwidth(EIfcdoor type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:PredefinedType, base type: ENUMERATION
	public boolean testPredefinedtype(EIfcdoor type) throws SdaiException;
	public int getPredefinedtype(EIfcdoor type) throws SdaiException;
	public void setPredefinedtype(EIfcdoor type, int value) throws SdaiException;
	public void unsetPredefinedtype(EIfcdoor type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:OperationType, base type: ENUMERATION
	public boolean testOperationtype(EIfcdoor type) throws SdaiException;
	public int getOperationtype(EIfcdoor type) throws SdaiException;
	public void setOperationtype(EIfcdoor type, int value) throws SdaiException;
	public void unsetOperationtype(EIfcdoor type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:UserDefinedOperationType, base type: STRING
	public boolean testUserdefinedoperationtype(EIfcdoor type) throws SdaiException;
	public String getUserdefinedoperationtype(EIfcdoor type) throws SdaiException;
	public void setUserdefinedoperationtype(EIfcdoor type, String value) throws SdaiException;
	public void unsetUserdefinedoperationtype(EIfcdoor type) throws SdaiException;

}
