/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcSolidModel

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcsolidmodel extends CIfcgeometricrepresentationitem implements EIfcsolidmodel {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcsolidmodel.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// LayerAssignment: protected Object  - inverse - java inheritance -  ENTITY IfcPresentationLayerAssignment
	// StyledByItem: protected Object  - inverse - java inheritance -  ENTITY IfcStyledItem
	// Dim: protected int  - derived - current -  INTEGER
	protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);
*/

	/*----------------------------- Attributes (new version) -----------*/

	// LayerAssignment - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i0$ = CEntity.initInverseAttribute(definition, 0);
	// StyledByItem - inverse - java inheritance
	// protected static final jsdai.dictionary.CInverse_attribute i1$ = CEntity.initInverseAttribute(definition, 1);
	// Dim - derived - current entity
	protected static final jsdai.dictionary.CDerived_attribute d0$ = CEntity.initDerivedAttribute(definition, 0);

	public jsdai.dictionary.EEntity_definition getInstanceType() {
		return definition;
	}

/* *** old implementation ***

	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
	}
*/


	protected void changeReferences(InverseEntity old, InverseEntity newer) throws SdaiException {
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
	//<01-0> current entity
	//<01-0-1> derived attribute
	//<01-0-1-1> NOT explicit-to-derived - generateDerivedCurrentEntityMethodsX()
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


	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			return;
		}
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			return;
		}
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
		// partial entity: IfcSolidModel
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcGeometricRepresentationItem
		// partial entity: IfcRepresentationItem
		// partial entity: IfcSolidModel
	}
}
