/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcRelAssociatesConstraint

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcrelassociatesconstraint extends EIfcrelassociates {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Intent, base type: STRING
	public boolean testIntent(EIfcrelassociatesconstraint type) throws SdaiException;
	public String getIntent(EIfcrelassociatesconstraint type) throws SdaiException;
	public void setIntent(EIfcrelassociatesconstraint type, String value) throws SdaiException;
	public void unsetIntent(EIfcrelassociatesconstraint type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:RelatingConstraint, base type: entity IfcConstraint
	public boolean testRelatingconstraint(EIfcrelassociatesconstraint type) throws SdaiException;
	public EIfcconstraint getRelatingconstraint(EIfcrelassociatesconstraint type) throws SdaiException;
	public void setRelatingconstraint(EIfcrelassociatesconstraint type, EIfcconstraint value) throws SdaiException;
	public void unsetRelatingconstraint(EIfcrelassociatesconstraint type) throws SdaiException;

}
