/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcQuantityLength

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcquantitylength extends EIfcphysicalsimplequantity {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:LengthValue, base type: REAL
	public boolean testLengthvalue(EIfcquantitylength type) throws SdaiException;
	public double getLengthvalue(EIfcquantitylength type) throws SdaiException;
	public void setLengthvalue(EIfcquantitylength type, double value) throws SdaiException;
	public void unsetLengthvalue(EIfcquantitylength type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Formula, base type: STRING
	public boolean testFormula(EIfcquantitylength type) throws SdaiException;
	public String getFormula(EIfcquantitylength type) throws SdaiException;
	public void setFormula(EIfcquantitylength type, String value) throws SdaiException;
	public void unsetFormula(EIfcquantitylength type) throws SdaiException;

}
