/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcQuantityCount

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcquantitycount extends EIfcphysicalsimplequantity {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:CountValue, base type: NUMBER
	public boolean testCountvalue(EIfcquantitycount type) throws SdaiException;
	public double getCountvalue(EIfcquantitycount type) throws SdaiException;
	public void setCountvalue(EIfcquantitycount type, double value) throws SdaiException;
	public void unsetCountvalue(EIfcquantitycount type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Formula, base type: STRING
	public boolean testFormula(EIfcquantitycount type) throws SdaiException;
	public String getFormula(EIfcquantitycount type) throws SdaiException;
	public void setFormula(EIfcquantitycount type, String value) throws SdaiException;
	public void unsetFormula(EIfcquantitycount type) throws SdaiException;

}
