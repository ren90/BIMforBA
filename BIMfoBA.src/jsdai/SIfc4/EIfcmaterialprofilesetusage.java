/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcMaterialProfileSetUsage

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcmaterialprofilesetusage extends EIfcmaterialusagedefinition {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:ForProfileSet, base type: entity IfcMaterialProfileSet
	public boolean testForprofileset(EIfcmaterialprofilesetusage type) throws SdaiException;
	public EIfcmaterialprofileset getForprofileset(EIfcmaterialprofilesetusage type) throws SdaiException;
	public void setForprofileset(EIfcmaterialprofilesetusage type, EIfcmaterialprofileset value) throws SdaiException;
	public void unsetForprofileset(EIfcmaterialprofilesetusage type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:CardinalPoint, base type: INTEGER
	public boolean testCardinalpoint(EIfcmaterialprofilesetusage type) throws SdaiException;
	public int getCardinalpoint(EIfcmaterialprofilesetusage type) throws SdaiException;
	public void setCardinalpoint(EIfcmaterialprofilesetusage type, int value) throws SdaiException;
	public void unsetCardinalpoint(EIfcmaterialprofilesetusage type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:ReferenceExtent, base type: REAL
	public boolean testReferenceextent(EIfcmaterialprofilesetusage type) throws SdaiException;
	public double getReferenceextent(EIfcmaterialprofilesetusage type) throws SdaiException;
	public void setReferenceextent(EIfcmaterialprofilesetusage type, double value) throws SdaiException;
	public void unsetReferenceextent(EIfcmaterialprofilesetusage type) throws SdaiException;

}