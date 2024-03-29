/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcReinforcingMeshType

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcreinforcingmeshtype extends EIfcreinforcingelementtype {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:PredefinedType, base type: ENUMERATION
	public boolean testPredefinedtype(EIfcreinforcingmeshtype type) throws SdaiException;
	public int getPredefinedtype(EIfcreinforcingmeshtype type) throws SdaiException;
	public void setPredefinedtype(EIfcreinforcingmeshtype type, int value) throws SdaiException;
	public void unsetPredefinedtype(EIfcreinforcingmeshtype type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:MeshLength, base type: REAL
	public boolean testMeshlength(EIfcreinforcingmeshtype type) throws SdaiException;
	public double getMeshlength(EIfcreinforcingmeshtype type) throws SdaiException;
	public void setMeshlength(EIfcreinforcingmeshtype type, double value) throws SdaiException;
	public void unsetMeshlength(EIfcreinforcingmeshtype type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:MeshWidth, base type: REAL
	public boolean testMeshwidth(EIfcreinforcingmeshtype type) throws SdaiException;
	public double getMeshwidth(EIfcreinforcingmeshtype type) throws SdaiException;
	public void setMeshwidth(EIfcreinforcingmeshtype type, double value) throws SdaiException;
	public void unsetMeshwidth(EIfcreinforcingmeshtype type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:LongitudinalBarNominalDiameter, base type: REAL
	public boolean testLongitudinalbarnominaldiameter(EIfcreinforcingmeshtype type) throws SdaiException;
	public double getLongitudinalbarnominaldiameter(EIfcreinforcingmeshtype type) throws SdaiException;
	public void setLongitudinalbarnominaldiameter(EIfcreinforcingmeshtype type, double value) throws SdaiException;
	public void unsetLongitudinalbarnominaldiameter(EIfcreinforcingmeshtype type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:TransverseBarNominalDiameter, base type: REAL
	public boolean testTransversebarnominaldiameter(EIfcreinforcingmeshtype type) throws SdaiException;
	public double getTransversebarnominaldiameter(EIfcreinforcingmeshtype type) throws SdaiException;
	public void setTransversebarnominaldiameter(EIfcreinforcingmeshtype type, double value) throws SdaiException;
	public void unsetTransversebarnominaldiameter(EIfcreinforcingmeshtype type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:LongitudinalBarCrossSectionArea, base type: REAL
	public boolean testLongitudinalbarcrosssectionarea(EIfcreinforcingmeshtype type) throws SdaiException;
	public double getLongitudinalbarcrosssectionarea(EIfcreinforcingmeshtype type) throws SdaiException;
	public void setLongitudinalbarcrosssectionarea(EIfcreinforcingmeshtype type, double value) throws SdaiException;
	public void unsetLongitudinalbarcrosssectionarea(EIfcreinforcingmeshtype type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:TransverseBarCrossSectionArea, base type: REAL
	public boolean testTransversebarcrosssectionarea(EIfcreinforcingmeshtype type) throws SdaiException;
	public double getTransversebarcrosssectionarea(EIfcreinforcingmeshtype type) throws SdaiException;
	public void setTransversebarcrosssectionarea(EIfcreinforcingmeshtype type, double value) throws SdaiException;
	public void unsetTransversebarcrosssectionarea(EIfcreinforcingmeshtype type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:LongitudinalBarSpacing, base type: REAL
	public boolean testLongitudinalbarspacing(EIfcreinforcingmeshtype type) throws SdaiException;
	public double getLongitudinalbarspacing(EIfcreinforcingmeshtype type) throws SdaiException;
	public void setLongitudinalbarspacing(EIfcreinforcingmeshtype type, double value) throws SdaiException;
	public void unsetLongitudinalbarspacing(EIfcreinforcingmeshtype type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:TransverseBarSpacing, base type: REAL
	public boolean testTransversebarspacing(EIfcreinforcingmeshtype type) throws SdaiException;
	public double getTransversebarspacing(EIfcreinforcingmeshtype type) throws SdaiException;
	public void setTransversebarspacing(EIfcreinforcingmeshtype type, double value) throws SdaiException;
	public void unsetTransversebarspacing(EIfcreinforcingmeshtype type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:BendingShapeCode, base type: STRING
	public boolean testBendingshapecode(EIfcreinforcingmeshtype type) throws SdaiException;
	public String getBendingshapecode(EIfcreinforcingmeshtype type) throws SdaiException;
	public void setBendingshapecode(EIfcreinforcingmeshtype type, String value) throws SdaiException;
	public void unsetBendingshapecode(EIfcreinforcingmeshtype type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: BendingParameters, base type: LIST OF SELECT
	public boolean testBendingparameters(EIfcreinforcingmeshtype type) throws SdaiException;
	public AIfcbendingparameterselect getBendingparameters(EIfcreinforcingmeshtype type) throws SdaiException;
	public AIfcbendingparameterselect createBendingparameters(EIfcreinforcingmeshtype type) throws SdaiException;
	public void unsetBendingparameters(EIfcreinforcingmeshtype type) throws SdaiException;

}
