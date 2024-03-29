/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcTessellatedFaceSet

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfctessellatedfaceset extends CIfctessellateditem implements EIfctessellatedfaceset {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfctessellatedfaceset.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	protected Object a0; // Coordinates - current entity - ENTITY IfcCartesianPointList3D
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected Aa_double a1; // Normals - current entity - LIST OF LIST OF REAL
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected int a2; // Closed - current entity - BOOLEAN
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	// HasColours: protected Object  - inverse - current -  ENTITY IfcIndexedColourMap
	protected static final jsdai.dictionary.CInverse_attribute i2$ = CEntity.initInverseAttribute(definition, 2);
	// HasTextures: protected Object  - inverse - current -  ENTITY IfcIndexedTextureMap
	protected static final jsdai.dictionary.CInverse_attribute i3$ = CEntity.initInverseAttribute(definition, 3);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// Coordinates - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	protected Object a0;
	// Normals - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected Aa_double a1;
	// Closed - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	protected int a2;
	// HasColours - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i2$ = CEntity.initInverseAttribute(definition, 2);
	// HasTextures - inverse - current entity
	protected static final jsdai.dictionary.CInverse_attribute i3$ = CEntity.initInverseAttribute(definition, 3);

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a0 == old) {
			a0 = newer;
		}
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		if (a0 == old) {
			a0 = newer;
		}
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
	//going through all the attributes: #6153=EXPLICIT_ATTRIBUTE('Coordinates',#6151,0,#3568,$,.F.);
	//<01> generating methods for consolidated attribute:  Coordinates
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// attribute (current explicit or supertype explicit) : Coordinates, base type: entity IfcCartesianPointList3D
	public static int usedinCoordinates(EIfctessellatedfaceset type, EIfccartesianpointlist3d instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	public boolean testCoordinates(EIfctessellatedfaceset type) throws SdaiException {
		return test_instance(a0);
	}
	public EIfccartesianpointlist3d getCoordinates(EIfctessellatedfaceset type) throws SdaiException {
		return (EIfccartesianpointlist3d)get_instance(a0);
	}
	public void setCoordinates(EIfctessellatedfaceset type, EIfccartesianpointlist3d value) throws SdaiException {
		a0 = set_instance(a0, value);
	}
	public void unsetCoordinates(EIfctessellatedfaceset type) throws SdaiException {
		a0 = unset_instance(a0);
	}
	public static jsdai.dictionary.EAttribute attributeCoordinates(EIfctessellatedfaceset type) throws SdaiException {
		return a0$;
	}

	//going through all the attributes: #6154=EXPLICIT_ATTRIBUTE('Normals',#6151,1,#7174,$,.T.);
	//<01> generating methods for consolidated attribute:  Normals
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: Normals, base type: LIST OF LIST OF REAL
	public boolean testNormals(EIfctessellatedfaceset type) throws SdaiException {
		return test_aggregate(a1);
	}
	public Aa_double getNormals(EIfctessellatedfaceset type) throws SdaiException {
		return (Aa_double)get_aggregate(a1);
	}
	public Aa_double createNormals(EIfctessellatedfaceset type) throws SdaiException {
		a1 = create_aggregate2_double(a1, a1$, 0);
		return a1;
	}
	public void unsetNormals(EIfctessellatedfaceset type) throws SdaiException {
		unset_aggregate(a1);
		a1 = null;
	}
	public static jsdai.dictionary.EAttribute attributeNormals(EIfctessellatedfaceset type) throws SdaiException {
		return a1$;
	}

	//going through all the attributes: #6155=EXPLICIT_ATTRIBUTE('Closed',#6151,2,#6,$,.T.);
	//<01> generating methods for consolidated attribute:  Closed
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	/// methods for attribute: Closed, base type: BOOLEAN
	public boolean testClosed(EIfctessellatedfaceset type) throws SdaiException {
		return test_boolean(a2);
	}
	public boolean getClosed(EIfctessellatedfaceset type) throws SdaiException {
		return get_boolean(a2);
	}
	public void setClosed(EIfctessellatedfaceset type, boolean value) throws SdaiException {
		a2 = set_boolean(value);
	}
	public void unsetClosed(EIfctessellatedfaceset type) throws SdaiException {
		a2 = unset_boolean();
	}
	public static jsdai.dictionary.EAttribute attributeClosed(EIfctessellatedfaceset type) throws SdaiException {
		return a2$;
	}

	//going through all the attributes: #6156=INVERSE_ATTRIBUTE('HasColours',#6151,0,#4479,$,#4481,#9638,#9639,.F.);
	//<01> generating methods for consolidated attribute:  HasColours
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	public AIfcindexedcolourmap getHascolours(EIfctessellatedfaceset type, ASdaiModel domain) throws SdaiException {
		AIfcindexedcolourmap result = (AIfcindexedcolourmap)get_inverse_aggregate(i2$);
		CIfcindexedcolourmap.usedinMappedto(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributeHascolours(EIfctessellatedfaceset type) throws SdaiException {
		return i2$;
	}

	//going through all the attributes: #6157=INVERSE_ATTRIBUTE('HasTextures',#6151,1,#4485,$,#4487,#9641,$,.F.);
	//<01> generating methods for consolidated attribute:  HasTextures
	//<01-0> current entity
	//<01-0-2> inverse attribute - generateInverseCurrentEntityMethodsX()
	// Inverse attribute - HasTextures : SET[0:-2147483648] OF IfcIndexedTextureMap FOR MappedTo
	public AIfcindexedtexturemap getHastextures(EIfctessellatedfaceset type, ASdaiModel domain) throws SdaiException {
		AIfcindexedtexturemap result = (AIfcindexedtexturemap)get_inverse_aggregate(i3$);
		CIfcindexedtexturemap.usedinMappedto(null, this, domain, result);
		return result;
	}
	public static jsdai.dictionary.EAttribute attributeHastextures(EIfctessellatedfaceset type) throws SdaiException {
		return i3$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			a2 = 0;
			return;
		}
		a0 = av.entityValues[2].getInstance(0, this, a0$);
		a1 = av.entityValues[2].getDouble2Aggregate(1, a1$, this);
		a2 = av.entityValues[2].getBoolean(2);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = unset_instance(a0);
			a2 = 0;
			return;
		}
		a0 = av.entityValues[2].getInstance(0, this, a0$);
		a1 = av.entityValues[2].getDouble2Aggregate(1, a1$, this);
		a2 = av.entityValues[2].getBoolean(2);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
		// partial entity: IfcTessellatedFaceSet
		av.entityValues[2].setInstance(0, a0);
		av.entityValues[2].setDouble2Aggregate(1, a1);
		av.entityValues[2].setBoolean(2, a2);
		// partial entity: IfcTessellatedItem
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
		// partial entity: IfcTessellatedFaceSet
		av.entityValues[2].setInstance(0, a0);
		av.entityValues[2].setDouble2Aggregate(1, a1);
		av.entityValues[2].setBoolean(2, a2);
		// partial entity: IfcTessellatedItem
	}
}
