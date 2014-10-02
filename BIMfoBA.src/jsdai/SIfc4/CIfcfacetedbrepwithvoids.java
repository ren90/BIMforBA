/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcFacetedBrepWithVoids

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcfacetedbrepwithvoids extends CIfcfacetedbrep implements EIfcfacetedbrepwithvoids {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcfacetedbrepwithvoids.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	// Dim: protected int  - derived - java inheritance -  INTEGER
	protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
	// Outer: protected Object a0;   Outer - java inheritance - ENTITY IfcClosedShell
	protected AIfcclosedshell a1; // Voids - current entity - SET OF ENTITY
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// Dim - derived - java inheritance
	// protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
	// Outer - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected Object a0;
	// Voids - explicit - current entity
	protected static final jsdai.dictionary.CExplicit_attribute a1$ = CEntity.initExplicitAttribute(definition, 1);
	protected AIfcclosedshell a1;

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
		changeReferencesAggregate(a1, old, newer);
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
		super.changeReferences(old, newer);
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
	//going through all the attributes: #5730=DERIVED_ATTRIBUTE('Dim',#5728,0,#2485,$);
	//<01> generating methods for consolidated attribute:  Dim
	//<01-1> supertype, java inheritance
	//<01-1-1> derived
	//<01-1-1-2> NOT explicit-to-derived - generateDerivedSupertypeJavaInheritedMethodsX
	// methods for derived attribute: Dim, base type: INTEGER
	public boolean testDim(EIfcsolidmodel type) throws SdaiException {
			throw new SdaiException(SdaiException.FN_NAVL);
	}
	public Value getDim(EIfcsolidmodel type, SdaiContext _context) throws SdaiException {


//###-01 jc.generated_java: Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 3)
				return (Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 3));
	}
	public int getDim(EIfcsolidmodel type) throws SdaiException {
		SdaiContext _context = this.findEntityInstanceSdaiModel().getRepository().getSession().getSdaiContext();
			return getDim((EIfcsolidmodel)null, _context).getInteger();
	}
	public static jsdai.dictionary.EAttribute attributeDim(EIfcsolidmodel type) throws SdaiException {
		return d0$;
	}

	//going through all the attributes: #4618=EXPLICIT_ATTRIBUTE('Outer',#4616,0,#3642,$,.F.);
	//<01> generating methods for consolidated attribute:  Outer
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()
	// attribute (java explicit): Outer, base type: entity IfcClosedShell
	public static int usedinOuter(EIfcmanifoldsolidbrep type, EIfcclosedshell instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a0$, domain, result);
	}
	//going through all the attributes: #4276=EXPLICIT_ATTRIBUTE('Voids',#4274,0,#6923,$,.F.);
	//<01> generating methods for consolidated attribute:  Voids
	//<01-0> current entity
	//<01-0-0> explicit attribute - generateExplicitCurrentEntityMethodsX()
	// methods for attribute: Voids, base type: SET OF ENTITY
	public static int usedinVoids(EIfcfacetedbrepwithvoids type, EIfcclosedshell instance, ASdaiModel domain, AEntity result) throws SdaiException {
		return ((CEntity)instance).makeUsedin(definition, a1$, domain, result);
	}
	public boolean testVoids(EIfcfacetedbrepwithvoids type) throws SdaiException {
		return test_aggregate(a1);
	}
	public AIfcclosedshell getVoids(EIfcfacetedbrepwithvoids type) throws SdaiException {
		return (AIfcclosedshell)get_aggregate(a1);
	}
	public AIfcclosedshell createVoids(EIfcfacetedbrepwithvoids type) throws SdaiException {
		a1 = (AIfcclosedshell)create_aggregate_class(a1, a1$,  AIfcclosedshell.class, 0);
		return a1;
	}
	public void unsetVoids(EIfcfacetedbrepwithvoids type) throws SdaiException {
		unset_aggregate(a1);
		a1 = null;
	}
	public static jsdai.dictionary.EAttribute attributeVoids(EIfcfacetedbrepwithvoids type) throws SdaiException {
		return a1$;
	}


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			if (a1 instanceof CAggregate)
				a1.unsetAll();
			a1 = null;
			a0 = unset_instance(a0);
			return;
		}
		a1 = (AIfcclosedshell)av.entityValues[1].getInstanceAggregate(0, a1$, this);
		a0 = av.entityValues[3].getInstance(0, this, a0$);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			if (a1 instanceof CAggregate)
				a1.unsetAll();
			a1 = null;
			a0 = unset_instance(a0);
			return;
		}
		a1 = (AIfcclosedshell)av.entityValues[1].getInstanceAggregate(0, a1$, this);
		a0 = av.entityValues[3].getInstance(0, this, a0$);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcFacetedBrep
		// partial entity: IfcFacetedBrepWithVoids
		av.entityValues[1].setInstanceAggregate(0, a1);
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcManifoldSolidBrep
		av.entityValues[3].setInstance(0, a0);
		// partial entity: IfcRepresentationItem
		// partial entity: IfcSolidModel
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcFacetedBrep
		// partial entity: IfcFacetedBrepWithVoids
		av.entityValues[1].setInstanceAggregate(0, a1);
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcManifoldSolidBrep
		av.entityValues[3].setInstance(0, a0);
		// partial entity: IfcRepresentationItem
		// partial entity: IfcSolidModel
	}
}
