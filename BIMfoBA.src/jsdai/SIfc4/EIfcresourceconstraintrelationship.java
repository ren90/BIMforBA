/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcResourceConstraintRelationship

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcresourceconstraintrelationship extends EIfcresourcelevelrelationship {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:RelatingConstraint, base type: entity IfcConstraint
	public boolean testRelatingconstraint(EIfcresourceconstraintrelationship type) throws SdaiException;
	public EIfcconstraint getRelatingconstraint(EIfcresourceconstraintrelationship type) throws SdaiException;
	public void setRelatingconstraint(EIfcresourceconstraintrelationship type, EIfcconstraint value) throws SdaiException;
	public void unsetRelatingconstraint(EIfcresourceconstraintrelationship type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: RelatedResourceObjects, base type: SET OF SELECT
	public boolean testRelatedresourceobjects(EIfcresourceconstraintrelationship type) throws SdaiException;
	public AIfcresourceobjectselect getRelatedresourceobjects(EIfcresourceconstraintrelationship type) throws SdaiException;
	public AIfcresourceobjectselect createRelatedresourceobjects(EIfcresourceconstraintrelationship type) throws SdaiException;
	public void unsetRelatedresourceobjects(EIfcresourceconstraintrelationship type) throws SdaiException;

}
