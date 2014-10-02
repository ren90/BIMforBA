/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcShapeAspect

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcshapeaspect extends CEntity implements EIfcshapeaspect {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcshapeaspect.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	protected AIfcshapemodel a0; // ShapeRepresentations - current entity - LIST OF ENTITY
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected String a1; // Name - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected String a2; // Description - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected int a3; // ProductDefinitional - current entity - LOGICAL
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected Object a4; // PartOfProductDefinitionShape - current entity - SELECT IfcProductRepresentationSelect
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// ShapeRepresentations - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected AIfcshapemodel a0;
	// Name - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected String a1;
	// Description - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected String a2;
	// ProductDefinitional - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected int a3;
	// PartOfProductDefinitionShape - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected Object a4;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		changeReferencesAggregate(a0, old, newer);
		if (a4 == old) {
			a4 = newer;
		}
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		changeReferencesAggregate(a0, old, newer);
		if (a4 == old) {
			a4 = newer;
		}
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #5674=EXPLICIT_ATTRIBUTE('ShapeRepresentations',#5672,0,#7125,$,.F.);
	//<01> generating methods for consolidated attribute:  ShapeRepresentations
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: ShapeRepresentations, base type: LIST OF ENTITY
	public static int usedinShaperepresentations(EIfcshapeaspect type, EIfcshapemodel instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	public boolean testShaperepresentations(EIfcshapeaspect type) throws SdaiException {
		return test_aggregate(a0);
	}
	public AIfcshapemodel getShaperepresentations(EIfcshapeaspect type) throws SdaiException {
		return (AIfcshapemodel)get_aggregate(a0);
	}
	public AIfcshapemodel createShaperepresentations(EIfcshapeaspect type) throws SdaiException {
		a0 = (AIfcshapemodel)create_aggregate_class(a0, a0$,  AIfcshapemodel.class, 0);
		return a0;
	}
	public void unsetShaperepresentations(EIfcshapeaspect type) throws SdaiException {
		unset_aggregate(a0);
		a0 = null;
	}
	public static jsdai.dictionary.EAttribute attributeShaperepresentations(EIfcshapeaspect type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #5675=EXPLICIT_ATTRIBUTE('Name',#5672,1,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Name, base type: STRING
	public boolean testName(EIfcshapeaspect type) throws SdaiException {
		return test_string(a1);
	}
	public String getName(EIfcshapeaspect type) throws SdaiException {
		return get_string(a1);
	}
	public void setName(EIfcshapeaspect type, String value) throws SdaiException {
		a1 = set_string(value);
	}
	public void unsetName(EIfcshapeaspect type) throws SdaiException {
		a1 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeName(EIfcshapeaspect type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #5676=EXPLICIT_ATTRIBUTE('Description',#5672,2,#2657,$,.T.);
	//<01> generating methods for consolidated attribute:  Description
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Description, base type: STRING
	public boolean testDescription(EIfcshapeaspect type) throws SdaiException {
		return test_string(a2);
	}
	public String getDescription(EIfcshapeaspect type) throws SdaiException {
		return get_string(a2);
	}
	public void setDescription(EIfcshapeaspect type, String value) throws SdaiException {
		a2 = set_string(value);
	}
	public void unsetDescription(EIfcshapeaspect type) throws SdaiException {
		a2 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeDescription(EIfcshapeaspect type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #5677=EXPLICIT_ATTRIBUTE('ProductDefinitional',#5672,3,#5,$,.F.);
	//<01> generating methods for consolidated attribute:  ProductDefinitional
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: ProductDefinitional, base type: LOGICAL
	public boolean testProductdefinitional(EIfcshapeaspect type) throws SdaiException {
		return test_logical(a3);
	}
	public int getProductdefinitional(EIfcshapeaspect type) throws SdaiException {
		return get_logical(a3);
	}
	public void setProductdefinitional(EIfcshapeaspect type, int value) throws SdaiException {
		a3 = set_logical(value);
	}
	public void unsetProductdefinitional(EIfcshapeaspect type) throws SdaiException {
		a3 = unset_logical();
	}
	public static jsdai.dictionary.EAttribute attributeProductdefinitional(EIfcshapeaspect type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #5678=EXPLICIT_ATTRIBUTE('PartOfProductDefinitionShape',#5672,4,#3181,$,.T.);
	//<01> generating methods for consolidated attribute:  PartOfProductDefinitionShape
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// -2- methods for SELECT attribute: PartOfProductDefinitionShape
	public static int usedinPartofproductdefinitionshape(EIfcshapeaspect type, EEntity instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a4$, domain, result);
	}
	public boolean testPartofproductdefinitionshape(EIfcshapeaspect type) throws SdaiException {
		return test_instance(a4);
	}

	public EEntity getPartofproductdefinitionshape(EIfcshapeaspect type) throws SdaiException { // case 1
		return get_instance_select(a4);
	}

	public void setPartofproductdefinitionshape(EIfcshapeaspect type, EEntity value) throws SdaiException { // case 1
		a4 = set_instance(a4, value);
	}

	public void unsetPartofproductdefinitionshape(EIfcshapeaspect type) throws SdaiException {
		a4 = unset_instance(a4);
	}

	public static jsdai.dictionary.EAttribute attributePartofproductdefinitionshape(EIfcshapeaspect type) throws SdaiException {
		return a4$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			if (a0 instanceof CAggregate)
				a0.unsetAll();
			a0 = null;
			a1 = null;
			a2 = null;
			a3 = 0;
			a4 = unset_instance(a4);
			return;
		}
		a0 = (AIfcshapemodel)av.entityValues[0].getInstanceAggregate(0, a0$, this);
		a1 = av.entityValues[0].getString(1);
		a2 = av.entityValues[0].getString(2);
		a3 = av.entityValues[0].getLogical(3);
		a4 = av.entityValues[0].getInstance(4, this, a4$);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			if (a0 instanceof CAggregate)
				a0.unsetAll();
			a0 = null;
			a1 = null;
			a2 = null;
			a3 = 0;
			a4 = unset_instance(a4);
			return;
		}
		a0 = (AIfcshapemodel)av.entityValues[0].getInstanceAggregate(0, a0$, this);
		a1 = av.entityValues[0].getString(1);
		a2 = av.entityValues[0].getString(2);
		a3 = av.entityValues[0].getLogical(3);
		a4 = av.entityValues[0].getInstance(4, this, a4$);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcShapeAspect
		av.entityValues[0].setInstanceAggregate(0, a0);
		av.entityValues[0].setString(1, a1);
		av.entityValues[0].setString(2, a2);
		av.entityValues[0].setLogical(3, a3);
		av.entityValues[0].setInstance(4, a4);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcShapeAspect
		av.entityValues[0].setInstanceAggregate(0, a0);
		av.entityValues[0].setString(1, a1);
		av.entityValues[0].setString(2, a2);
		av.entityValues[0].setLogical(3, a3);
		av.entityValues[0].setInstance(4, a4);
	}
}