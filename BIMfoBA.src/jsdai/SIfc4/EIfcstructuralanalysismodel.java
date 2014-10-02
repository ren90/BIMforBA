/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcStructuralAnalysisModel

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcstructuralanalysismodel extends EIfcsystem {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:PredefinedType, base type: ENUMERATION
	public boolean testPredefinedtype(EIfcstructuralanalysismodel type) throws SdaiException;
	public int getPredefinedtype(EIfcstructuralanalysismodel type) throws SdaiException;
	public void setPredefinedtype(EIfcstructuralanalysismodel type, int value) throws SdaiException;
	public void unsetPredefinedtype(EIfcstructuralanalysismodel type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:OrientationOf2DPlane, base type: entity IfcAxis2Placement3D
	public boolean testOrientationof2dplane(EIfcstructuralanalysismodel type) throws SdaiException;
	public EIfcaxis2placement3d getOrientationof2dplane(EIfcstructuralanalysismodel type) throws SdaiException;
	public void setOrientationof2dplane(EIfcstructuralanalysismodel type, EIfcaxis2placement3d value) throws SdaiException;
	public void unsetOrientationof2dplane(EIfcstructuralanalysismodel type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: LoadedBy, base type: SET OF ENTITY
	public boolean testLoadedby(EIfcstructuralanalysismodel type) throws SdaiException;
	public AIfcstructuralloadgroup getLoadedby(EIfcstructuralanalysismodel type) throws SdaiException;
	public AIfcstructuralloadgroup createLoadedby(EIfcstructuralanalysismodel type) throws SdaiException;
	public void unsetLoadedby(EIfcstructuralanalysismodel type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: HasResults, base type: SET OF ENTITY
	public boolean testHasresults(EIfcstructuralanalysismodel type) throws SdaiException;
	public AIfcstructuralresultgroup getHasresults(EIfcstructuralanalysismodel type) throws SdaiException;
	public AIfcstructuralresultgroup createHasresults(EIfcstructuralanalysismodel type) throws SdaiException;
	public void unsetHasresults(EIfcstructuralanalysismodel type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:SharedPlacement, base type: entity IfcObjectPlacement
	public boolean testSharedplacement(EIfcstructuralanalysismodel type) throws SdaiException;
	public EIfcobjectplacement getSharedplacement(EIfcstructuralanalysismodel type) throws SdaiException;
	public void setSharedplacement(EIfcstructuralanalysismodel type, EIfcobjectplacement value) throws SdaiException;
	public void unsetSharedplacement(EIfcstructuralanalysismodel type) throws SdaiException;

}
