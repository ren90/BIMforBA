/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcMaterialProfile

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcmaterialprofile extends CIfcmaterialdefinition implements EIfcmaterialprofile {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcmaterialprofile.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// AssociatedTo: protected Object  - inverse - java inheritance -  ENTITY IfcRelAssociatesMaterial
	// HasExternalReferences: protected Object  - inverse - java inheritance -  ENTITY IfcExternalReferenceRelationship
	// HasProperties: protected Object  - inverse - java inheritance -  ENTITY IfcMaterialProperties
	protected String a0; // Name - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected String a1; // Description - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected Object a2; // Material - current entity - ENTITY IfcMaterial
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected Object a3; // Profile - current entity - ENTITY IfcProfileDef
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected double a4; // Priority - current entity - REAL
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected String a5; // Category - current entity - STRING
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	// ToMaterialProfileSet: protected Object  - inverse - current -  ENTITY IfcMaterialProfileSet
	protected static final jsdai.dictionary.CInverse_attribute i3$ = CEntity.initInverseAttribute(definition, 3);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// AssociatedTo - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// HasExternalReferences - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// HasProperties - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i2$ = CEntity.initInverseAttribute(definition, 2);
	// Name - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected String a0;
	// Description - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected String a1;
	// Material - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected Object a2;
	// Profile - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected Object a3;
	// Priority - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected double a4;
	// Category - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a5$ = CEntity.initExplicitAttribute(definition, 5);
	protected String a5;
	// ToMaterialProfileSet - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i3$ = CEntity.initInverseAttribute(definition, 3);

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a2 == old) {
			a2 = newer;
		}
		if (a3 == old) {
			a3 = newer;
		}
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a2 == old) {
			a2 = newer;
		}
		if (a3 == old) {
			a3 = newer;
		}
	}

	/*----------- Methods for attribute access -----------*/


	/*----------- Methods for attribute access (new)-----------*/

	//going through all the attributes: #4658=INVERSE_ATTRIBUTE('AssociatedTo',#4656,0,#5394,$,#5396,#8598,$,.F.);
	//<01> generating methods for consolidated attribute:  AssociatedTo
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4659=INVERSE_ATTRIBUTE('HasExternalReferences',#4656,1,#4231,$,#4234,#8600,$,.F.);
	//<01> generating methods for consolidated attribute:  HasExternalReferences
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4660=INVERSE_ATTRIBUTE('HasProperties',#4656,2,#4721,$,#4723,#8602,$,.F.);
	//<01> generating methods for consolidated attribute:  HasProperties
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #4696=EXPLICIT_ATTRIBUTE('Name',#4694,0,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Name, base type: STRING
	public boolean testName(EIfcmaterialprofile type) throws SdaiException {
		return test_string(a0);
	}
	public String getName(EIfcmaterialprofile type) throws SdaiException {
		return get_string(a0);
	}
	public void setName(EIfcmaterialprofile type, String value) throws SdaiException {
		a0 = set_string(value);
	}
	public void unsetName(EIfcmaterialprofile type) throws SdaiException {
		a0 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeName(EIfcmaterialprofile type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #4697=EXPLICIT_ATTRIBUTE('Description',#4694,1,#2657,$,.T.);
	//<01> generating methods for consolidated attribute:  Description
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Description, base type: STRING
	public boolean testDescription(EIfcmaterialprofile type) throws SdaiException {
		return test_string(a1);
	}
	public String getDescription(EIfcmaterialprofile type) throws SdaiException {
		return get_string(a1);
	}
	public void setDescription(EIfcmaterialprofile type, String value) throws SdaiException {
		a1 = set_string(value);
	}
	public void unsetDescription(EIfcmaterialprofile type) throws SdaiException {
		a1 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeDescription(EIfcmaterialprofile type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #4698=EXPLICIT_ATTRIBUTE('Material',#4694,2,#4631,$,.T.);
	//<01> generating methods for consolidated attribute:  Material
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : Material, base type: entity IfcMaterial
	public static int usedinMaterial(EIfcmaterialprofile type, EIfcmaterial instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a2$, domain, result);
	}
	public boolean testMaterial(EIfcmaterialprofile type) throws SdaiException {
		return test_instance(a2);
	}
	public EIfcmaterial getMaterial(EIfcmaterialprofile type) throws SdaiException {
		return (EIfcmaterial)get_instance(a2);
	}
	public void setMaterial(EIfcmaterialprofile type, EIfcmaterial value) throws SdaiException {
		a2 = set_instance(a2, value);
	}
	public void unsetMaterial(EIfcmaterialprofile type) throws SdaiException {
		a2 = unset_instance(a2);
	}
	public static jsdai.dictionary.EAttribute attributeMaterial(EIfcmaterialprofile type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #4699=EXPLICIT_ATTRIBUTE('Profile',#4694,3,#5068,$,.F.);
	//<01> generating methods for consolidated attribute:  Profile
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : Profile, base type: entity IfcProfileDef
	public static int usedinProfile(EIfcmaterialprofile type, EIfcprofiledef instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a3$, domain, result);
	}
	public boolean testProfile(EIfcmaterialprofile type) throws SdaiException {
		return test_instance(a3);
	}
	public EIfcprofiledef getProfile(EIfcmaterialprofile type) throws SdaiException {
		return (EIfcprofiledef)get_instance(a3);
	}
	public void setProfile(EIfcmaterialprofile type, EIfcprofiledef value) throws SdaiException {
		a3 = set_instance(a3, value);
	}
	public void unsetProfile(EIfcmaterialprofile type) throws SdaiException {
		a3 = unset_instance(a3);
	}
	public static jsdai.dictionary.EAttribute attributeProfile(EIfcmaterialprofile type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #4700=EXPLICIT_ATTRIBUTE('Priority',#4694,4,#2593,$,.T.);
	//<01> generating methods for consolidated attribute:  Priority
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Priority, base type: REAL
	public boolean testPriority(EIfcmaterialprofile type) throws SdaiException {
		return test_double(a4);
	}
	public double getPriority(EIfcmaterialprofile type) throws SdaiException {
		return get_double(a4);
	}
	public void setPriority(EIfcmaterialprofile type, double value) throws SdaiException {
		a4 = set_double(value);
	}
	public void unsetPriority(EIfcmaterialprofile type) throws SdaiException {
		a4 = unset_double();
	}
	public static jsdai.dictionary.EAttribute attributePriority(EIfcmaterialprofile type) throws SdaiException {
		return a4$;
	}

	//going through all the attributes: #4701=EXPLICIT_ATTRIBUTE('Category',#4694,5,#2539,$,.T.);
	//<01> generating methods for consolidated attribute:  Category
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Category, base type: STRING
	public boolean testCategory(EIfcmaterialprofile type) throws SdaiException {
		return test_string(a5);
	}
	public String getCategory(EIfcmaterialprofile type) throws SdaiException {
		return get_string(a5);
	}
	public void setCategory(EIfcmaterialprofile type, String value) throws SdaiException {
		a5 = set_string(value);
	}
	public void unsetCategory(EIfcmaterialprofile type) throws SdaiException {
		a5 = unset_string();
	}
	public static jsdai.dictionary.EAttribute attributeCategory(EIfcmaterialprofile type) throws SdaiException {
		return a5$;
	}

	//going through all the attributes: #4702=INVERSE_ATTRIBUTE('ToMaterialProfileSet',#4694,0,#4703,$,#4707,$,$,.F.);
	//<01> generating methods for consolidated attribute:  ToMaterialProfileSet
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	// Inverse attribute - ToMaterialProfileSet : IfcMaterialProfileSet FOR MaterialProfiles
	public AIfcmaterialprofileset getTomaterialprofileset(EIfcmaterialprofile type, ASdaiModel domain) throws SdaiException {
		AIfcmaterialprofileset result = new AIfcmaterialprofileset();
		CIfcmaterialprofileset.usedinMaterialprofiles(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributeTomaterialprofileset(EIfcmaterialprofile type) throws SdaiException {
		return i3$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = null;
			a2 = unset_instance(a2);
			a3 = unset_instance(a3);
			a4 = Double.NaN;
			a5 = null;
			return;
		}
		a0 = av.entityValues[1].getString(0);
		a1 = av.entityValues[1].getString(1);
		a2 = av.entityValues[1].getInstance(2, this, a2$);
		a3 = av.entityValues[1].getInstance(3, this, a3$);
		a4 = av.entityValues[1].getDouble(4);
		a5 = av.entityValues[1].getString(5);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			a1 = null;
			a2 = unset_instance(a2);
			a3 = unset_instance(a3);
			a4 = Double.NaN;
			a5 = null;
			return;
		}
		a0 = av.entityValues[1].getString(0);
		a1 = av.entityValues[1].getString(1);
		a2 = av.entityValues[1].getInstance(2, this, a2$);
		a3 = av.entityValues[1].getInstance(3, this, a3$);
		a4 = av.entityValues[1].getDouble(4);
		a5 = av.entityValues[1].getString(5);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcMaterialDefinition
		// partial entity: IfcMaterialProfile
		av.entityValues[1].setString(0, a0);
		av.entityValues[1].setString(1, a1);
		av.entityValues[1].setInstance(2, a2);
		av.entityValues[1].setInstance(3, a3);
		av.entityValues[1].setDouble(4, a4);
		av.entityValues[1].setString(5, a5);
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcMaterialDefinition
		// partial entity: IfcMaterialProfile
		av.entityValues[1].setString(0, a0);
		av.entityValues[1].setString(1, a1);
		av.entityValues[1].setInstance(2, a2);
		av.entityValues[1].setInstance(3, a3);
		av.entityValues[1].setDouble(4, a4);
		av.entityValues[1].setString(5, a5);
	}
}
