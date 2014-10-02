/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcPostalAddress

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcpostaladdress extends CIfcaddress implements EIfcpostaladdress {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcpostaladdress.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// Purpose: protected int a0;   Purpose - java inheritance - ENUMERATION IfcAddressTypeEnum
	// Description: protected String a1;   Description - java inheritance - STRING
	// UserDefinedPurpose: protected String a2;   UserDefinedPurpose - java inheritance - STRING
	// OfPerson: protected Object  - inverse - java inheritance -  ENTITY IfcPerson
	// OfOrganization: protected Object  - inverse - java inheritance -  ENTITY IfcOrganization
	protected String a3; // InternalLocation - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected A_string a4; // AddressLines - current entity - LIST OF STRING
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected String a5; // PostalBox - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected String a6; // Town - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	protected String a7; // Region - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	protected String a8; // PostalCode - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a8$ = CEntity.initExplicitAttribute(definition, 8);
	protected String a9; // Country - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a9$ = CEntity.initExplicitAttribute(definition, 9);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// Purpose - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected int a0;
	// Description - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected String a1;
	// UserDefinedPurpose - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	// protected String a2;
	// OfPerson - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// OfOrganization - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// InternalLocation - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected String a3;
	// AddressLines - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected A_string a4;
	// PostalBox - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected String a5;
	// Town - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a6$ = CEntity.initExplicitAttribute(definition, 6);
	protected String a6;
	// Region - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a7$ = CEntity.initExplicitAttribute(definition, 7);
	protected String a7;
	// PostalCode - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a8$ = CEntity.initExplicitAttribute(definition, 8);
	protected String a8;
	// Country - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a9$ = CEntity.initExplicitAttribute(definition, 9);
	protected String a9;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #3252=EXPLICIT_ATTRIBUTE('Purpose',#3250,0,#2707,$,.T.);
	//<01> generating methods for consolidated attribute:  Purpose
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3253=EXPLICIT_ATTRIBUTE('Description',#3250,1,#2657,$,.T.);
	//<01> generating methods for consolidated attribute:  Description
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3254=EXPLICIT_ATTRIBUTE('UserDefinedPurpose',#3250,2,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  UserDefinedPurpose
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3255=INVERSE_ATTRIBUTE('OfPerson',#3250,0,#4894,$,#4903,#7536,$,.F.);
	//<01> generating methods for consolidated attribute:  OfPerson
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #3256=INVERSE_ATTRIBUTE('OfOrganization',#3250,1,#4830,$,#4836,#7538,$,.F.);
	//<01> generating methods for consolidated attribute:  OfOrganization
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #5001=EXPLICIT_ATTRIBUTE('InternalLocation',#4999,0,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  InternalLocation
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: InternalLocation, base type: STRING
	public boolean testInternallocation(EIfcpostaladdress type) throws SdaiException {
		return test_string(a3);
	}
	public String getInternallocation(EIfcpostaladdress type) throws SdaiException {
		return get_string(a3);
	}
	public void setInternallocation(EIfcpostaladdress type, String value) throws SdaiException {
		a3 = set_string(value);
	}
	public void unsetInternallocation(EIfcpostaladdress type) throws SdaiException {
		a3 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeInternallocation(EIfcpostaladdress type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #5002=EXPLICIT_ATTRIBUTE('AddressLines',#4999,1,#7014,$,.T.);
	//<01> generating methods for consolidated attribute:  AddressLines
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: AddressLines, base type: LIST OF STRING
	public boolean testAddresslines(EIfcpostaladdress type) throws SdaiException {
		return test_aggregate(a4);
	}
	public A_string getAddresslines(EIfcpostaladdress type) throws SdaiException {
		return (A_string)get_aggregate(a4);
	}
	public A_string createAddresslines(EIfcpostaladdress type) throws SdaiException {
		a4 = create_aggregate_string(a4, a4$, 0);
		return a4;
	}
	public void unsetAddresslines(EIfcpostaladdress type) throws SdaiException {
		unset_aggregate(a4);
		a4 = null;
	}
	public static jsdai.dictionary.EAttribute attributeAddresslines(EIfcpostaladdress type) throws SdaiException {
		return a4$;
	}

	//going through all the attributes: #5003=EXPLICIT_ATTRIBUTE('PostalBox',#4999,2,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  PostalBox
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: PostalBox, base type: STRING
	public boolean testPostalbox(EIfcpostaladdress type) throws SdaiException {
		return test_string(a5);
	}
	public String getPostalbox(EIfcpostaladdress type) throws SdaiException {
		return get_string(a5);
	}
	public void setPostalbox(EIfcpostaladdress type, String value) throws SdaiException {
		a5 = set_string(value);
	}
	public void unsetPostalbox(EIfcpostaladdress type) throws SdaiException {
		a5 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributePostalbox(EIfcpostaladdress type) throws SdaiException {
		return a5$;
	}

	//going through all the attributes: #5004=EXPLICIT_ATTRIBUTE('Town',#4999,3,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Town
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Town, base type: STRING
	public boolean testTown(EIfcpostaladdress type) throws SdaiException {
		return test_string(a6);
	}
	public String getTown(EIfcpostaladdress type) throws SdaiException {
		return get_string(a6);
	}
	public void setTown(EIfcpostaladdress type, String value) throws SdaiException {
		a6 = set_string(value);
	}
	public void unsetTown(EIfcpostaladdress type) throws SdaiException {
		a6 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeTown(EIfcpostaladdress type) throws SdaiException {
		return a6$;
	}

	//going through all the attributes: #5005=EXPLICIT_ATTRIBUTE('Region',#4999,4,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Region
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Region, base type: STRING
	public boolean testRegion(EIfcpostaladdress type) throws SdaiException {
		return test_string(a7);
	}
	public String getRegion(EIfcpostaladdress type) throws SdaiException {
		return get_string(a7);
	}
	public void setRegion(EIfcpostaladdress type, String value) throws SdaiException {
		a7 = set_string(value);
	}
	public void unsetRegion(EIfcpostaladdress type) throws SdaiException {
		a7 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeRegion(EIfcpostaladdress type) throws SdaiException {
		return a7$;
	}

	//going through all the attributes: #5006=EXPLICIT_ATTRIBUTE('PostalCode',#4999,5,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  PostalCode
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: PostalCode, base type: STRING
	public boolean testPostalcode(EIfcpostaladdress type) throws SdaiException {
		return test_string(a8);
	}
	public String getPostalcode(EIfcpostaladdress type) throws SdaiException {
		return get_string(a8);
	}
	public void setPostalcode(EIfcpostaladdress type, String value) throws SdaiException {
		a8 = set_string(value);
	}
	public void unsetPostalcode(EIfcpostaladdress type) throws SdaiException {
		a8 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributePostalcode(EIfcpostaladdress type) throws SdaiException {
		return a8$;
	}

	//going through all the attributes: #5007=EXPLICIT_ATTRIBUTE('Country',#4999,6,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Country
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Country, base type: STRING
	public boolean testCountry(EIfcpostaladdress type) throws SdaiException {
		return test_string(a9);
	}
	public String getCountry(EIfcpostaladdress type) throws SdaiException {
		return get_string(a9);
	}
	public void setCountry(EIfcpostaladdress type, String value) throws SdaiException {
		a9 = set_string(value);
	}
	public void unsetCountry(EIfcpostaladdress type) throws SdaiException {
		a9 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeCountry(EIfcpostaladdress type) throws SdaiException {
		return a9$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = 0;
			a1 = null;
			a2 = null;
			a3 = null;
			if (a4 instanceof CAggregate)
				a4.unsetAll();
			a4 = null;
			a5 = null;
			a6 = null;
			a7 = null;
			a8 = null;
			a9 = null;
			return;
		}
		a0 = av.entityValues[0].getEnumeration(0, a0$);
		a1 = av.entityValues[0].getString(1);
		a2 = av.entityValues[0].getString(2);
		a3 = av.entityValues[1].getString(0);
		a4 = av.entityValues[1].getStringAggregate(1, a4$, this);
		a5 = av.entityValues[1].getString(2);
		a6 = av.entityValues[1].getString(3);
		a7 = av.entityValues[1].getString(4);
		a8 = av.entityValues[1].getString(5);
		a9 = av.entityValues[1].getString(6);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = 0;
			a1 = null;
			a2 = null;
			a3 = null;
			if (a4 instanceof CAggregate)
				a4.unsetAll();
			a4 = null;
			a5 = null;
			a6 = null;
			a7 = null;
			a8 = null;
			a9 = null;
			return;
		}
		a0 = av.entityValues[0].getEnumeration(0, a0$);
		a1 = av.entityValues[0].getString(1);
		a2 = av.entityValues[0].getString(2);
		a3 = av.entityValues[1].getString(0);
		a4 = av.entityValues[1].getStringAggregate(1, a4$, this);
		a5 = av.entityValues[1].getString(2);
		a6 = av.entityValues[1].getString(3);
		a7 = av.entityValues[1].getString(4);
		a8 = av.entityValues[1].getString(5);
		a9 = av.entityValues[1].getString(6);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcAddress
		av.entityValues[0].setEnumeration(0, a0, a0$);
		av.entityValues[0].setString(1, a1);
		av.entityValues[0].setString(2, a2);
		// partial entity: IfcPostalAddress
		av.entityValues[1].setString(0, a3);
		av.entityValues[1].setStringAggregate(1, a4);
		av.entityValues[1].setString(2, a5);
		av.entityValues[1].setString(3, a6);
		av.entityValues[1].setString(4, a7);
		av.entityValues[1].setString(5, a8);
		av.entityValues[1].setString(6, a9);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcAddress
		av.entityValues[0].setEnumeration(0, a0, a0$);
		av.entityValues[0].setString(1, a1);
		av.entityValues[0].setString(2, a2);
		// partial entity: IfcPostalAddress
		av.entityValues[1].setString(0, a3);
		av.entityValues[1].setStringAggregate(1, a4);
		av.entityValues[1].setString(2, a5);
		av.entityValues[1].setString(3, a6);
		av.entityValues[1].setString(4, a7);
		av.entityValues[1].setString(5, a8);
		av.entityValues[1].setString(6, a9);
	}

	/*---------------------- methods to validate WHERE rules --------------------*/

	public int rIfcpostaladdressWr1(SdaiContext _context) throws SdaiException {
	









		return (Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).OR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).OR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).OR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).OR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).OR(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).OR(_context, Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.SIfc4._st_IfcLabel).set(_context, get(a3$))), Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.SIfc4._st_list_1_ifclabel).set(_context, get(a4$)))), Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.SIfc4._st_IfcLabel).set(_context, get(a5$)))), Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.SIfc4._st_IfcLabel).set(_context, get(a8$)))), Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.SIfc4._st_IfcLabel).set(_context, get(a6$)))), Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.SIfc4._st_IfcLabel).set(_context, get(a7$)))), Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(Value.alloc(jsdai.SIfc4.SIfc4._st_IfcLabel).set(_context, get(a9$))))).getLogical());
	}
}