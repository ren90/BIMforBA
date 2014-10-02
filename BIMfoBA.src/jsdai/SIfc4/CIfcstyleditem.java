/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcStyledItem

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcstyleditem extends CIfcrepresentationitem implements EIfcstyleditem {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcstyleditem.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	protected Object a0; // Item - current entity - ENTITY IfcRepresentationItem
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected AIfcstyleassignmentselect a1; // Styles - current entity - SET OF SELECT
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected String a2; // Name - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// Item - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected Object a0;
	// Styles - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected AIfcstyleassignmentselect a1;
	// Name - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected String a2;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a0 == old) {
			a0 = newer;
		}
		changeReferencesAggregate(a1, old, newer);
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a0 == old) {
			a0 = newer;
		}
		changeReferencesAggregate(a1, old, newer);
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #5552=INVERSE_ATTRIBUTE('LayerAssignment',#5550,0,#5023,$,#5027,#9221,#9222,.F.);
	//<01> generating methods for consolidated attribute:  LayerAssignment
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5553=INVERSE_ATTRIBUTE('StyledByItem',#5550,1,#5936,$,#5938,#9224,#9225,.F.);
	//<01> generating methods for consolidated attribute:  StyledByItem
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5938=EXPLICIT_ATTRIBUTE('Item',#5936,0,#5550,$,.T.);
	//<01> generating methods for consolidated attribute:  Item
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : Item, base type: entity IfcRepresentationItem
	public static int usedinItem(EIfcstyleditem type, EIfcrepresentationitem instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	public boolean testItem(EIfcstyleditem type) throws SdaiException {
		return test_instance(a0);
	}
	public EIfcrepresentationitem getItem(EIfcstyleditem type) throws SdaiException {
		return (EIfcrepresentationitem)get_instance(a0);
	}
	public void setItem(EIfcstyleditem type, EIfcrepresentationitem value) throws SdaiException {
		a0 = set_instance(a0, value);
	}
	public void unsetItem(EIfcstyleditem type) throws SdaiException {
		a0 = unset_instance(a0);
	}
	public static jsdai.dictionary.EAttribute attributeItem(EIfcstyleditem type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #5939=EXPLICIT_ATTRIBUTE('Styles',#5936,1,#7149,$,.F.);
	//<01> generating methods for consolidated attribute:  Styles
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: Styles, base type: SET OF SELECT
	public static int usedinStyles(EIfcstyleditem type, EEntity instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a1$, domain, result);
	}
	public boolean testStyles(EIfcstyleditem type) throws SdaiException {
		return test_aggregate(a1);
	}
	public AIfcstyleassignmentselect getStyles(EIfcstyleditem type) throws SdaiException {
		if (a1 == null)
			throw new SdaiException(SdaiException.VA_NSET);
		return a1;
	}
	public AIfcstyleassignmentselect createStyles(EIfcstyleditem type) throws SdaiException {
		a1 = (AIfcstyleassignmentselect)create_aggregate_class(a1, a1$, AIfcstyleassignmentselect.class, 0);
		return a1;
	}
	public void unsetStyles(EIfcstyleditem type) throws SdaiException {
		unset_aggregate(a1);
		a1 = null;
	}
	public static jsdai.dictionary.EAttribute attributeStyles(EIfcstyleditem type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #5940=EXPLICIT_ATTRIBUTE('Name',#5936,2,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Name, base type: STRING
	public boolean testName(EIfcstyleditem type) throws SdaiException {
		return test_string(a2);
	}
	public String getName(EIfcstyleditem type) throws SdaiException {
		return get_string(a2);
	}
	public void setName(EIfcstyleditem type, String value) throws SdaiException {
		a2 = set_string(value);
	}
	public void unsetName(EIfcstyleditem type) throws SdaiException {
		a2 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeName(EIfcstyleditem type) throws SdaiException {
		return a2$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			if (a1 instanceof CAggregate)
				a1.unsetAll();
			a1 = null;
			a2 = null;
			return;
		}
		a0 = av.entityValues[1].getInstance(0, this, a0$);
		a1 = (AIfcstyleassignmentselect)av.entityValues[1].getInstanceAggregate(1, a1$, this);
		a2 = av.entityValues[1].getString(2);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			if (a1 instanceof CAggregate)
				a1.unsetAll();
			a1 = null;
			a2 = null;
			return;
		}
		a0 = av.entityValues[1].getInstance(0, this, a0$);
		a1 = (AIfcstyleassignmentselect)av.entityValues[1].getInstanceAggregate(1, a1$, this);
		a2 = av.entityValues[1].getString(2);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcRepresentationItem
		// partial entity: IfcStyledItem
		av.entityValues[1].setInstance(0, a0);
		av.entityValues[1].setInstanceAggregate(1, a1);
		av.entityValues[1].setString(2, a2);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcRepresentationItem
		// partial entity: IfcStyledItem
		av.entityValues[1].setInstance(0, a0);
		av.entityValues[1].setInstanceAggregate(1, a1);
		av.entityValues[1].setString(2, a2);
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfcstyleditemApplicableitem(SdaiContext _context) throws SdaiException {
	



		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).NOT(Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCSTYLEDITEM", "IFC4"), Value.alloc(jsdai.SIfc4.CIfcrepresentationitem.definition).set(_context, get(a0$)).typeOfV(_context)))).getLogical());
	}
}
