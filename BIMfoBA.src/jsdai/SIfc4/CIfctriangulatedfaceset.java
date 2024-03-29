/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcTriangulatedFaceSet

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfctriangulatedfaceset extends CIfctessellatedfaceset implements EIfctriangulatedfaceset {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfctriangulatedfaceset.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	// Coordinates: protected Object a0;   Coordinates - java inheritance - ENTITY IfcCartesianPointList3D
	// Normals: protected Aa_double a1;   Normals - java inheritance - LIST OF LIST OF REAL
	// Closed: protected int a2;   Closed - java inheritance - BOOLEAN
	// HasColours: protected Object  - inverse - java inheritance -  ENTITY IfcIndexedColourMap
	// HasTextures: protected Object  - inverse - java inheritance -  ENTITY IfcIndexedTextureMap
	protected Aa_integer a3; // CoordIndex - current entity - LIST OF LIST OF INTEGER
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected Aa_integer a4; // NormalIndex - current entity - LIST OF LIST OF INTEGER
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	// NumberOfTriangles: protected int  - derived - current -  INTEGER
	protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// Coordinates - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected Object a0;
	// Normals - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	// protected Aa_double a1;
	// Closed - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a2$ = CEntity.initExplicitAttribute(definition, 2);
	// protected int a2;
	// HasColours - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i2$ = CEntity.initInverseAttribute(definition, 2);
	// HasTextures - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i3$ = CEntity.initInverseAttribute(definition, 3);
	// CoordIndex - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a3$ = CEntity.initExplicitAttribute(definition, 3);
	protected Aa_integer a3;
	// NormalIndex - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a4$ = CEntity.initExplicitAttribute(definition, 4);
	protected Aa_integer a4;
	// NumberOfTriangles - derived - current entity
	protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);

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
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): Coordinates, base type: entity IfcCartesianPointList3D
	public static int usedinCoordinates(EIfctessellatedfaceset type, EIfccartesianpointlist3d instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	//going through all the attributes: #6154=EXPLICIT_ATTRIBUTE('Normals',#6151,1,#7174,$,.T.);
	//<01> generating methods for consolidated attribute:  Normals
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #6155=EXPLICIT_ATTRIBUTE('Closed',#6151,2,#6,$,.T.);
	//<01> generating methods for consolidated attribute:  Closed
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #6156=INVERSE_ATTRIBUTE('HasColours',#6151,0,#4479,$,#4481,#9638,#9639,.F.);
	//<01> generating methods for consolidated attribute:  HasColours
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #6157=INVERSE_ATTRIBUTE('HasTextures',#6151,1,#4485,$,#4487,#9641,$,.F.);
	//<01> generating methods for consolidated attribute:  HasTextures
	//<01-1> supertype, java inheritance
	//<01-1-2> inverse - generateInverseSupertypeJavaInheritedMethodsX()
	//going through all the attributes: #6254=EXPLICIT_ATTRIBUTE('CoordIndex',#6252,0,#7188,$,.F.);
	//<01> generating methods for consolidated attribute:  CoordIndex
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: CoordIndex, base type: LIST OF LIST OF INTEGER
	public boolean testCoordindex(EIfctriangulatedfaceset type) throws SdaiException {
		return test_aggregate(a3);
	}
	public Aa_integer getCoordindex(EIfctriangulatedfaceset type) throws SdaiException {
		return (Aa_integer)get_aggregate(a3);
	}
	public Aa_integer createCoordindex(EIfctriangulatedfaceset type) throws SdaiException {
		a3 = create_aggregate2_integer(a3, a3$, 0);
		return a3;
	}
	public void unsetCoordindex(EIfctriangulatedfaceset type) throws SdaiException {
		unset_aggregate(a3);
		a3 = null;
	}
	public static jsdai.dictionary.EAttribute attributeCoordindex(EIfctriangulatedfaceset type) throws SdaiException {
		return a3$;
	}

	//going through all the attributes: #6255=EXPLICIT_ATTRIBUTE('NormalIndex',#6252,1,#7190,$,.T.);
	//<01> generating methods for consolidated attribute:  NormalIndex
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: NormalIndex, base type: LIST OF LIST OF INTEGER
	public boolean testNormalindex(EIfctriangulatedfaceset type) throws SdaiException {
		return test_aggregate(a4);
	}
	public Aa_integer getNormalindex(EIfctriangulatedfaceset type) throws SdaiException {
		return (Aa_integer)get_aggregate(a4);
	}
	public Aa_integer createNormalindex(EIfctriangulatedfaceset type) throws SdaiException {
		a4 = create_aggregate2_integer(a4, a4$, 0);
		return a4;
	}
	public void unsetNormalindex(EIfctriangulatedfaceset type) throws SdaiException {
		unset_aggregate(a4);
		a4 = null;
	}
	public static jsdai.dictionary.EAttribute attributeNormalindex(EIfctriangulatedfaceset type) throws SdaiException {
		return a4$;
	}

	//going through all the attributes: #6256=DERIVED_ATTRIBUTE('NumberOfTriangles',#6252,0,#2,$);
	//<01> generating methods for consolidated attribute:  NumberOfTriangles
	//<01-0> current entity
	//<01-0-1> derived attribute
	//<01-0-1-1> NOT explicit-to-derived - generateDerivedCurrentEntityMethodsX()
	// methods for derived attribute: NumberOfTriangles, base type: INTEGER
	public boolean testNumberoftriangles(EIfctriangulatedfaceset type) throws SdaiException {
			throw new SdaiException(SdaiException.FN_NAVL);
	}
	public Value getNumberoftriangles(EIfctriangulatedfaceset type, SdaiContext _context) throws SdaiException {



//###-01 jc.generated_java: Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(Value.alloc(jsdai.SIfc4.SIfc4._st_list_1_list_3_3_integer).set(_context, get(a3$)))
				return (Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(Value.alloc(jsdai.SIfc4.SIfc4._st_list_1_list_3_3_integer).set(_context, get(a3$))));
	}
	public int getNumberoftriangles(EIfctriangulatedfaceset type) throws SdaiException {
		SdaiContext _context = this.findEntityInstanceSdaiModel().getRepository().getSession().getSdaiContext();
			return getNumberoftriangles((EIfctriangulatedfaceset)null, _context).getInteger();
	}
	public static jsdai.dictionary.EAttribute attributeNumberoftriangles(EIfctriangulatedfaceset type) throws SdaiException {
		return d0$;
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
		a3 = av.entityValues[4].getInteger2Aggregate(0, a3$, this);
		a4 = av.entityValues[4].getInteger2Aggregate(1, a4$, this);
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
		a3 = av.entityValues[4].getInteger2Aggregate(0, a3$, this);
		a4 = av.entityValues[4].getInteger2Aggregate(1, a4$, this);
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
		// partial entity: IfcTriangulatedFaceSet
		av.entityValues[4].setInteger2Aggregate(0, a3);
		av.entityValues[4].setInteger2Aggregate(1, a4);
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
		// partial entity: IfcTriangulatedFaceSet
		av.entityValues[4].setInteger2Aggregate(0, a3);
		av.entityValues[4].setInteger2Aggregate(1, a4);
	}
}
