/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcElementQuantity

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcelementquantity extends EIfcquantityset {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:MethodOfMeasurement, base type: STRING
	public boolean testMethodofmeasurement(EIfcelementquantity type) throws SdaiException;
	public String getMethodofmeasurement(EIfcelementquantity type) throws SdaiException;
	public void setMethodofmeasurement(EIfcelementquantity type, String value) throws SdaiException;
	public void unsetMethodofmeasurement(EIfcelementquantity type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: Quantities, base type: SET OF ENTITY
	public boolean testQuantities(EIfcelementquantity type) throws SdaiException;
	public AIfcphysicalquantity getQuantities(EIfcelementquantity type) throws SdaiException;
	public AIfcphysicalquantity createQuantities(EIfcelementquantity type) throws SdaiException;
	public void unsetQuantities(EIfcelementquantity type) throws SdaiException;

}
