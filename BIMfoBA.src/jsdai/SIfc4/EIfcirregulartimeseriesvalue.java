/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcIrregularTimeSeriesValue

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcirregulartimeseriesvalue extends EEntity {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:TimeStamp, base type: STRING
	public boolean testTimestamp(EIfcirregulartimeseriesvalue type) throws SdaiException;
	public String getTimestamp(EIfcirregulartimeseriesvalue type) throws SdaiException;
	public void setTimestamp(EIfcirregulartimeseriesvalue type, String value) throws SdaiException;
	public void unsetTimestamp(EIfcirregulartimeseriesvalue type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: ListValues, base type: LIST OF SELECT
	public boolean testListvalues(EIfcirregulartimeseriesvalue type) throws SdaiException;
	public AIfcvalue getListvalues(EIfcirregulartimeseriesvalue type) throws SdaiException;
	public AIfcvalue createListvalues(EIfcirregulartimeseriesvalue type) throws SdaiException;
	public void unsetListvalues(EIfcirregulartimeseriesvalue type) throws SdaiException;

}
