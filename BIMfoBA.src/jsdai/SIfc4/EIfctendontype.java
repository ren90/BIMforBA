/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcTendonType

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfctendontype extends EIfcreinforcingelementtype {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:PredefinedType, base type: ENUMERATION
	public boolean testPredefinedtype(EIfctendontype type) throws SdaiException;
	public int getPredefinedtype(EIfctendontype type) throws SdaiException;
	public void setPredefinedtype(EIfctendontype type, int value) throws SdaiException;
	public void unsetPredefinedtype(EIfctendontype type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:NominalDiameter, base type: REAL
	public boolean testNominaldiameter(EIfctendontype type) throws SdaiException;
	public double getNominaldiameter(EIfctendontype type) throws SdaiException;
	public void setNominaldiameter(EIfctendontype type, double value) throws SdaiException;
	public void unsetNominaldiameter(EIfctendontype type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:CrossSectionArea, base type: REAL
	public boolean testCrosssectionarea(EIfctendontype type) throws SdaiException;
	public double getCrosssectionarea(EIfctendontype type) throws SdaiException;
	public void setCrosssectionarea(EIfctendontype type, double value) throws SdaiException;
	public void unsetCrosssectionarea(EIfctendontype type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:SheethDiameter, base type: REAL
	public boolean testSheethdiameter(EIfctendontype type) throws SdaiException;
	public double getSheethdiameter(EIfctendontype type) throws SdaiException;
	public void setSheethdiameter(EIfctendontype type, double value) throws SdaiException;
	public void unsetSheethdiameter(EIfctendontype type) throws SdaiException;

}