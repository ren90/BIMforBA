/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcResourceConstraintRelationship

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcresourceconstraintrelationship extends CIfcresourcelevelrelationship implements EIfcresourceconstraintrelationship {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcresourceconstraintrelationship.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// Name: protected String a0;   Name - java inheritance - STRING
	// Description: protected String a1;   Description - java inheritance - STRING
	protected Object a2; // RelatingConstraint - current entity - ENTITY IfcConstraint
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected AIfcresourceobjectselect a3; // RelatedResourceObjects - current entity - SET OF SELECT
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// Name - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected String a0;
	// Description - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected String a1;
	// RelatingConstraint - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected Object a2;
	// RelatedResourceObjects - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected AIfcresourceobjectselect a3;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a2 == old) {
			a2 = newer;
		}
		changeReferencesAggregate(a3, old, newer);
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a2 == old) {
			a2 = newer;
		}
		changeReferencesAggregate(a3, old, newer);
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #5575=EXPLICIT_ATTRIBUTE('Name',#5573,0,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5576=EXPLICIT_ATTRIBUTE('Description',#5573,1,#2657,$,.T.);
	//<01> generating methods for consolidated attribute:  Description
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5571=EXPLICIT_ATTRIBUTE('RelatingConstraint',#5569,0,#3745,$,.F.);
	//<01> generating methods for consolidated attribute:  RelatingConstraint
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : RelatingConstraint, base type: entity IfcConstraint
	public static int usedinRelatingconstraint(EIfcresourceconstraintrelationship type, EIfcconstraint instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a2$, domain, result);
	}
	public boolean testRelatingconstraint(EIfcresourceconstraintrelationship type) throws SdaiException {
		return test_instance(a2);
	}
	public EIfcconstraint getRelatingconstraint(EIfcresourceconstraintrelationship type) throws SdaiException {
		return (EIfcconstraint)get_instance(a2);
	}
	public void setRelatingconstraint(EIfcresourceconstraintrelationship type, EIfcconstraint value) throws SdaiException {
		a2 = set_instance(a2, value);
	}
	public void unsetRelatingconstraint(EIfcresourceconstraintrelationship type) throws SdaiException {
		a2 = unset_instance(a2);
	}
	public static jsdai.dictionary.EAttribute attributeRelatingconstraint(EIfcresourceconstraintrelationship type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #5572=EXPLICIT_ATTRIBUTE('RelatedResourceObjects',#5569,1,#7119,$,.F.);
	//<01> generating methods for consolidated attribute:  RelatedResourceObjects
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: RelatedResourceObjects, base type: SET OF SELECT
	public static int usedinRelatedresourceobjects(EIfcresourceconstraintrelationship type, EEntity instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a3$, domain, result);
	}
	public boolean testRelatedresourceobjects(EIfcresourceconstraintrelationship type) throws SdaiException {
		return test_aggregate(a3);
	}
	public AIfcresourceobjectselect getRelatedresourceobjects(EIfcresourceconstraintrelationship type) throws SdaiException {
		if (a3 == null)
			throw new SdaiException(SdaiException.VA_NSET);
		return a3;
	}
	public AIfcresourceobjectselect createRelatedresourceobjects(EIfcresourceconstraintrelationship type) throws SdaiException {
		a3 = (AIfcresourceobjectselect)create_aggregate_class(a3, a3$, AIfcresourceobjectselect.class, 0);
		return a3;
	}
	public void unsetRelatedresourceobjects(EIfcresourceconstraintrelationship type) throws SdaiException {
		unset_aggregate(a3);
		a3 = null;
	}
	public static jsdai.dictionary.EAttribute attributeRelatedresourceobjects(EIfcresourceconstraintrelationship type) throws SdaiException {
		return a3$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a2 = unset_instance(a2);
			if (a3 instanceof CAggregate)
				a3.unsetAll();
			a3 = null;
			a0 = null;
			a1 = null;
			return;
		}
		a2 = av.entityValues[0].getInstance(0, this, a2$);
		a3 = (AIfcresourceobjectselect)av.entityValues[0].getInstanceAggregate(1, a3$, this);
		a0 = av.entityValues[1].getString(0);
		a1 = av.entityValues[1].getString(1);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a2 = unset_instance(a2);
			if (a3 instanceof CAggregate)
				a3.unsetAll();
			a3 = null;
			a0 = null;
			a1 = null;
			return;
		}
		a2 = av.entityValues[0].getInstance(0, this, a2$);
		a3 = (AIfcresourceobjectselect)av.entityValues[0].getInstanceAggregate(1, a3$, this);
		a0 = av.entityValues[1].getString(0);
		a1 = av.entityValues[1].getString(1);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcResourceConstraintRelationship
		av.entityValues[0].setInstance(0, a2);
		av.entityValues[0].setInstanceAggregate(1, a3);
		// partial entity: IfcResourceLevelRelationship
		av.entityValues[1].setString(0, a0);
		av.entityValues[1].setString(1, a1);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcResourceConstraintRelationship
		av.entityValues[0].setInstance(0, a2);
		av.entityValues[0].setInstanceAggregate(1, a3);
		// partial entity: IfcResourceLevelRelationship
		av.entityValues[1].setString(0, a0);
		av.entityValues[1].setString(1, a1);
	}
}