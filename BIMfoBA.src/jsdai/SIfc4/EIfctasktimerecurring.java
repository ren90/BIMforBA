/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcTaskTimeRecurring

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfctasktimerecurring extends EIfctasktime {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:Recurrance, base type: entity IfcRecurrencePattern
	public boolean testRecurrance(EIfctasktimerecurring type) throws SdaiException;
	public EIfcrecurrencepattern getRecurrance(EIfctasktimerecurring type) throws SdaiException;
	public void setRecurrance(EIfctasktimerecurring type, EIfcrecurrencepattern value) throws SdaiException;
	public void unsetRecurrance(EIfctasktimerecurring type) throws SdaiException;

}
