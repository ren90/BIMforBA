/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing entity IfcPreDefinedCurveFont

package jsdai.SIfc4;
import jsdai.lang.*;

public class CIfcpredefinedcurvefont extends CIfcpredefineditem implements EIfcpredefinedcurvefont {
	public static final jsdai.dictionary.CEntity_definition definition = initEntityDefinition(CIfcpredefinedcurvefont.class, SIfc4.ss);

	/*----------------------------- Attributes -----------*/

/*
	// Name: protected String a0;   Name - java inheritance - STRING
*/

	/*----------------------------- Attributes (new version) -----------*/

	// Name - explicit - java inheritance
	// protected static final jsdai.dictionary.CExplicit_attribute a0$ = CEntity.initExplicitAttribute(definition, 0);
	// protected String a0;

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

	//going through all the attributes: #5014=EXPLICIT_ATTRIBUTE('Name',#5012,0,#2539,$,.F.);
	//<01> generating methods for consolidated attribute:  Name
	//<01-1> supertype, java inheritance
	//<01-1-0> explicit - generateExplicitSupertypeJavaInheritedMethodsX()

	/*---------------------- setAll() --------------------*/

/* *** old implementation ***
	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			return;
		}
		a0 = av.entityValues[1].getString(0);
	}
*/

	protected void setAll(ComplexEntityValue av) throws SdaiException {
		if (av == null) {
			a0 = null;
			return;
		}
		a0 = av.entityValues[1].getString(0);
	}

	/*---------------------- getAll() --------------------*/

/* *** old implementation ***
	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcPreDefinedCurveFont
		// partial entity: IfcPreDefinedItem
		av.entityValues[1].setString(0, a0);
		// partial entity: IfcPresentationItem
	}
*/

	protected void getAll(ComplexEntityValue av) throws SdaiException {
		// partial entity: IfcPreDefinedCurveFont
		// partial entity: IfcPreDefinedItem
		av.entityValues[1].setString(0, a0);
		// partial entity: IfcPresentationItem
	}
}
