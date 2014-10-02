/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcRelInterferesElements

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcrelinterfereselements extends CIfcrelconnects implements EIfcrelinterfereselements {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcrelinterfereselements.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// GlobalId: protected String a0;   GlobalId - java inheritance - STRING
	// OwnerHistory: protected Object a1;   OwnerHistory - java inheritance - ENTITY IfcOwnerHistory
	// Name: protected String a2;   Name - java inheritance - STRING
	// Description: protected String a3;   Description - java inheritance - STRING
	protected Object a4; // RelatingElement - current entity - ENTITY IfcElement
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected Object a5; // RelatedElement - current entity - ENTITY IfcElement
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected Object a6; // InterferenceGeometry - current entity - ENTITY IfcConnectionGeometry
	protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	protected String a7; // InterferenceType - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	protected int a8; // ImpliedOrder - current entity - LOGICAL
	protected static final jsdai.dictionary.CExplicit_attribute a8$ = CEntity.initExplicitAttribute(definition, 8);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// GlobalId - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected String a0;
	// OwnerHistory - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected Object a1;
	// Name - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	// protected String a2;
	// Description - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	// protected String a3;
	// RelatingElement - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected Object a4;
	// RelatedElement - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected Object a5;
	// InterferenceGeometry - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	protected Object a6;
	// InterferenceType - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	protected String a7;
	// ImpliedOrder - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a8$ = CEntity.initExplicitAttribute(definition, 8);
	protected int a8;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a4 == old) {
			a4 = newer;
		}
		if (a5 == old) {
			a5 = newer;
		}
		if (a6 == old) {
			a6 = newer;
		}
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		if (a4 == old) {
			a4 = newer;
		}
		if (a5 == old) {
			a5 = newer;
		}
		if (a6 == old) {
			a6 = newer;
		}
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #5618=EXPLICIT_ATTRIBUTE('GlobalId',#5616,0,#2517,$,.F.);
	//<01> generating methods for consolidated attribute:  GlobalId
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5619=EXPLICIT_ATTRIBUTE('OwnerHistory',#5616,1,#4858,$,.T.);
	//<01> generating methods for consolidated attribute:  OwnerHistory
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): OwnerHistory, base type: entity IfcOwnerHistory
	public static int usedinOwnerhistory(EIfcroot type, EIfcownerhistory instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a1$, domain, result);
	}
	//going through all the attributes: #5620=EXPLICIT_ATTRIBUTE('Name',#5616,2,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5621=EXPLICIT_ATTRIBUTE('Description',#5616,3,#2657,$,.T.);
	//<01> generating methods for consolidated attribute:  Description
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5484=EXPLICIT_ATTRIBUTE('RelatingElement',#5482,0,#4136,$,.F.);
	//<01> generating methods for consolidated attribute:  RelatingElement
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : RelatingElement, base type: entity IfcElement
	public static int usedinRelatingelement(EIfcrelinterfereselements type, EIfcelement instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a4$, domain, result);
	}
	public boolean testRelatingelement(EIfcrelinterfereselements type) throws SdaiException {
		return test_instance(a4);
	}
	public EIfcelement getRelatingelement(EIfcrelinterfereselements type) throws SdaiException {
		return (EIfcelement)get_instance(a4);
	}
	public void setRelatingelement(EIfcrelinterfereselements type, EIfcelement value) throws SdaiException {
		a4 = set_instance(a4, value);
	}
	public void unsetRelatingelement(EIfcrelinterfereselements type) throws SdaiException {
		a4 = unset_instance(a4);
	}
	public static jsdai.dictionary.EAttribute attributeRelatingelement(EIfcrelinterfereselements type) throws SdaiException {
		return a4$;
	}

	//going through all the attributes: #5485=EXPLICIT_ATTRIBUTE('RelatedElement',#5482,1,#4136,$,.F.);
	//<01> generating methods for consolidated attribute:  RelatedElement
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : RelatedElement, base type: entity IfcElement
	public static int usedinRelatedelement(EIfcrelinterfereselements type, EIfcelement instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a5$, domain, result);
	}
	public boolean testRelatedelement(EIfcrelinterfereselements type) throws SdaiException {
		return test_instance(a5);
	}
	public EIfcelement getRelatedelement(EIfcrelinterfereselements type) throws SdaiException {
		return (EIfcelement)get_instance(a5);
	}
	public void setRelatedelement(EIfcrelinterfereselements type, EIfcelement value) throws SdaiException {
		a5 = set_instance(a5, value);
	}
	public void unsetRelatedelement(EIfcrelinterfereselements type) throws SdaiException {
		a5 = unset_instance(a5);
	}
	public static jsdai.dictionary.EAttribute attributeRelatedelement(EIfcrelinterfereselements type) throws SdaiException {
		return a5$;
	}

	//going through all the attributes: #5486=EXPLICIT_ATTRIBUTE('InterferenceGeometry',#5482,2,#3726,$,.T.);
	//<01> generating methods for consolidated attribute:  InterferenceGeometry
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : InterferenceGeometry, base type: entity IfcConnectionGeometry
	public static int usedinInterferencegeometry(EIfcrelinterfereselements type, EIfcconnectiongeometry instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a6$, domain, result);
	}
	public boolean testInterferencegeometry(EIfcrelinterfereselements type) throws SdaiException {
		return test_instance(a6);
	}
	public EIfcconnectiongeometry getInterferencegeometry(EIfcrelinterfereselements type) throws SdaiException {
		return (EIfcconnectiongeometry)get_instance(a6);
	}
	public void setInterferencegeometry(EIfcrelinterfereselements type, EIfcconnectiongeometry value) throws SdaiException {
		a6 = set_instance(a6, value);
	}
	public void unsetInterferencegeometry(EIfcrelinterfereselements type) throws SdaiException {
		a6 = unset_instance(a6);
	}
	public static jsdai.dictionary.EAttribute attributeInterferencegeometry(EIfcrelinterfereselements type) throws SdaiException {
		return a6$;
	}

	//going through all the attributes: #5487=EXPLICIT_ATTRIBUTE('InterferenceType',#5482,3,#2523,$,.T.);
	//<01> generating methods for consolidated attribute:  InterferenceType
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: InterferenceType, base type: STRING
	public boolean testInterferencetype(EIfcrelinterfereselements type) throws SdaiException {
		return test_string(a7);
	}
	public String getInterferencetype(EIfcrelinterfereselements type) throws SdaiException {
		return get_string(a7);
	}
	public void setInterferencetype(EIfcrelinterfereselements type, String value) throws SdaiException {
		a7 = set_string(value);
	}
	public void unsetInterferencetype(EIfcrelinterfereselements type) throws SdaiException {
		a7 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeInterferencetype(EIfcrelinterfereselements type) throws SdaiException {
		return a7$;
	}

	//going through all the attributes: #5488=EXPLICIT_ATTRIBUTE('ImpliedOrder',#5482,4,#5,$,.F.);
	//<01> generating methods for consolidated attribute:  ImpliedOrder
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: ImpliedOrder, base type: LOGICAL
	public boolean testImpliedorder(EIfcrelinterfereselements type) throws SdaiException {
		return test_logical(a8);
	}
	public int getImpliedorder(EIfcrelinterfereselements type) throws SdaiException {
		return get_logical(a8);
	}
	public void setImpliedorder(EIfcrelinterfereselements type, int value) throws SdaiException {
		a8 = set_logical(value);
	}
	public void unsetImpliedorder(EIfcrelinterfereselements type) throws SdaiException {
		a8 = unset_logical();
	}
	public static jsdai.dictionary.EAttribute attributeImpliedorder(EIfcrelinterfereselements type) throws SdaiException {
		return a8$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a4 = unset_instance(a4);
			a5 = unset_instance(a5);
			a6 = unset_instance(a6);
			a7 = null;
			a8 = 0;
			a0 = null;
			a1 = unset_instance(a1);
			a2 = null;
			a3 = null;
			return;
		}
		a4 = av.entityValues[2].getInstance(0, this, a4$);
		a5 = av.entityValues[2].getInstance(1, this, a5$);
		a6 = av.entityValues[2].getInstance(2, this, a6$);
		a7 = av.entityValues[2].getString(3);
		a8 = av.entityValues[2].getLogical(4);
		a0 = av.entityValues[3].getString(0);
		a1 = av.entityValues[3].getInstance(1, this, a1$);
		a2 = av.entityValues[3].getString(2);
		a3 = av.entityValues[3].getString(3);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a4 = unset_instance(a4);
			a5 = unset_instance(a5);
			a6 = unset_instance(a6);
			a7 = null;
			a8 = 0;
			a0 = null;
			a1 = unset_instance(a1);
			a2 = null;
			a3 = null;
			return;
		}
		a4 = av.entityValues[2].getInstance(0, this, a4$);
		a5 = av.entityValues[2].getInstance(1, this, a5$);
		a6 = av.entityValues[2].getInstance(2, this, a6$);
		a7 = av.entityValues[2].getString(3);
		a8 = av.entityValues[2].getLogical(4);
		a0 = av.entityValues[3].getString(0);
		a1 = av.entityValues[3].getInstance(1, this, a1$);
		a2 = av.entityValues[3].getString(2);
		a3 = av.entityValues[3].getString(3);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcRelationship
		// partial entity: IfcRelConnects
		// partial entity: IfcRelInterferesElements
		av.entityValues[2].setInstance(0, a4);
		av.entityValues[2].setInstance(1, a5);
		av.entityValues[2].setInstance(2, a6);
		av.entityValues[2].setString(3, a7);
		av.entityValues[2].setLogical(4, a8);
		// partial entity: IfcRoot
		av.entityValues[3].setString(0, a0);
		av.entityValues[3].setInstance(1, a1);
		av.entityValues[3].setString(2, a2);
		av.entityValues[3].setString(3, a3);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcRelationship
		// partial entity: IfcRelConnects
		// partial entity: IfcRelInterferesElements
		av.entityValues[2].setInstance(0, a4);
		av.entityValues[2].setInstance(1, a5);
		av.entityValues[2].setInstance(2, a6);
		av.entityValues[2].setString(3, a7);
		av.entityValues[2].setLogical(4, a8);
		// partial entity: IfcRoot
		av.entityValues[3].setString(0, a0);
		av.entityValues[3].setInstance(1, a1);
		av.entityValues[3].setString(2, a2);
		av.entityValues[3].setString(3, a3);
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfcrelinterfereselementsNotselfreference(SdaiContext _context) throws SdaiException {
	




		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).instanceNotEqual(_context, Value.alloc(jsdai.SIfc4.CIfcelement.definition).set(_context, get(a4$)), Value.alloc(jsdai.SIfc4.CIfcelement.definition).set(_context, get(a5$)))).getLogical());
	}
}
