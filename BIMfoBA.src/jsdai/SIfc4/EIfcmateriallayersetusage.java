/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcMaterialLayerSetUsage

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcmateriallayersetusage extends EIfcmaterialusagedefinition {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:ForLayerSet, base type: entity IfcMaterialLayerSet
	public boolean testForlayerset(EIfcmateriallayersetusage type) throws SdaiException;
	public EIfcmateriallayerset getForlayerset(EIfcmateriallayersetusage type) throws SdaiException;
	public void setForlayerset(EIfcmateriallayersetusage type, EIfcmateriallayerset value) throws SdaiException;
	public void unsetForlayerset(EIfcmateriallayersetusage type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:LayerSetDirection, base type: ENUMERATION
	public boolean testLayersetdirection(EIfcmateriallayersetusage type) throws SdaiException;
	public int getLayersetdirection(EIfcmateriallayersetusage type) throws SdaiException;
	public void setLayersetdirection(EIfcmateriallayersetusage type, int value) throws SdaiException;
	public void unsetLayersetdirection(EIfcmateriallayersetusage type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:DirectionSense, base type: ENUMERATION
	public boolean testDirectionsense(EIfcmateriallayersetusage type) throws SdaiException;
	public int getDirectionsense(EIfcmateriallayersetusage type) throws SdaiException;
	public void setDirectionsense(EIfcmateriallayersetusage type, int value) throws SdaiException;
	public void unsetDirectionsense(EIfcmateriallayersetusage type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:OffsetFromReferenceLine, base type: REAL
	public boolean testOffsetfromreferenceline(EIfcmateriallayersetusage type) throws SdaiException;
	public double getOffsetfromreferenceline(EIfcmateriallayersetusage type) throws SdaiException;
	public void setOffsetfromreferenceline(EIfcmateriallayersetusage type, double value) throws SdaiException;
	public void unsetOffsetfromreferenceline(EIfcmateriallayersetusage type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:ReferenceExtent, base type: REAL
	public boolean testReferenceextent(EIfcmateriallayersetusage type) throws SdaiException;
	public double getReferenceextent(EIfcmateriallayersetusage type) throws SdaiException;
	public void setReferenceextent(EIfcmateriallayersetusage type, double value) throws SdaiException;
	public void unsetReferenceextent(EIfcmateriallayersetusage type) throws SdaiException;

}
