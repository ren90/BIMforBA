/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcMechanicalFastenerType

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcmechanicalfastenertype extends EIfcelementcomponenttype {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:PredefinedType, base type: ENUMERATION
	public boolean testPredefinedtype(EIfcmechanicalfastenertype type) throws SdaiException;
	public int getPredefinedtype(EIfcmechanicalfastenertype type) throws SdaiException;
	public void setPredefinedtype(EIfcmechanicalfastenertype type, int value) throws SdaiException;
	public void unsetPredefinedtype(EIfcmechanicalfastenertype type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:NominalDiameter, base type: REAL
	public boolean testNominaldiameter(EIfcmechanicalfastenertype type) throws SdaiException;
	public double getNominaldiameter(EIfcmechanicalfastenertype type) throws SdaiException;
	public void setNominaldiameter(EIfcmechanicalfastenertype type, double value) throws SdaiException;
	public void unsetNominaldiameter(EIfcmechanicalfastenertype type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:NominalLength, base type: REAL
	public boolean testNominallength(EIfcmechanicalfastenertype type) throws SdaiException;
	public double getNominallength(EIfcmechanicalfastenertype type) throws SdaiException;
	public void setNominallength(EIfcmechanicalfastenertype type, double value) throws SdaiException;
	public void unsetNominallength(EIfcmechanicalfastenertype type) throws SdaiException;

}