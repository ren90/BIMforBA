/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcBooleanResult

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcbooleanresult extends EIfcgeometricrepresentationitem {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:Operator, base type: ENUMERATION
	public boolean testOperator(EIfcbooleanresult type) throws SdaiException;
	public int getOperator(EIfcbooleanresult type) throws SdaiException;
	public void setOperator(EIfcbooleanresult type, int value) throws SdaiException;
	public void unsetOperator(EIfcbooleanresult type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: FirstOperand
	boolean testFirstoperand(EIfcbooleanresult type) throws SdaiException;

	EEntity getFirstoperand(EIfcbooleanresult type) throws SdaiException; // case 1

	void setFirstoperand(EIfcbooleanresult type, EEntity value) throws SdaiException; // case 1

	void unsetFirstoperand(EIfcbooleanresult type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: SecondOperand
	boolean testSecondoperand(EIfcbooleanresult type) throws SdaiException;

	EEntity getSecondoperand(EIfcbooleanresult type) throws SdaiException; // case 1

	void setSecondoperand(EIfcbooleanresult type, EEntity value) throws SdaiException; // case 1

	void unsetSecondoperand(EIfcbooleanresult type) throws SdaiException;

	// generateDerivedAttributeMethodDeclarations: 1
	/// methods for derived attribute:Dim, base type: INTEGER
	public boolean testDim(EIfcbooleanresult type) throws SdaiException;
	public int getDim(EIfcbooleanresult type) throws SdaiException;
	public Value getDim(EIfcbooleanresult type, SdaiContext _context) throws SdaiException;

}