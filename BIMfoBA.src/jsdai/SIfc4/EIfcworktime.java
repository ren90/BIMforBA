/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcWorkTime

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcworktime extends EIfcschedulingtime {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:RecurrencePattern, base type: entity IfcRecurrencePattern
	public boolean testRecurrencepattern(EIfcworktime type) throws SdaiException;
	public EIfcrecurrencepattern getRecurrencepattern(EIfcworktime type) throws SdaiException;
	public void setRecurrencepattern(EIfcworktime type, EIfcrecurrencepattern value) throws SdaiException;
	public void unsetRecurrencepattern(EIfcworktime type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Start, base type: STRING
	public boolean testStart(EIfcworktime type) throws SdaiException;
	public String getStart(EIfcworktime type) throws SdaiException;
	public void setStart(EIfcworktime type, String value) throws SdaiException;
	public void unsetStart(EIfcworktime type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Finish, base type: STRING
	public boolean testFinish(EIfcworktime type) throws SdaiException;
	public String getFinish(EIfcworktime type) throws SdaiException;
	public void setFinish(EIfcworktime type, String value) throws SdaiException;
	public void unsetFinish(EIfcworktime type) throws SdaiException;

}
