/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcInventory

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcinventory extends EIfcgroup {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:PredefinedType, base type: ENUMERATION
	public boolean testPredefinedtype(EIfcinventory type) throws SdaiException;
	public int getPredefinedtype(EIfcinventory type) throws SdaiException;
	public void setPredefinedtype(EIfcinventory type, int value) throws SdaiException;
	public void unsetPredefinedtype(EIfcinventory type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: Jurisdiction
	boolean testJurisdiction(EIfcinventory type) throws SdaiException;

	EEntity getJurisdiction(EIfcinventory type) throws SdaiException; // case 1

	void setJurisdiction(EIfcinventory type, EEntity value) throws SdaiException; // case 1

	void unsetJurisdiction(EIfcinventory type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: ResponsiblePersons, base type: SET OF ENTITY
	public boolean testResponsiblepersons(EIfcinventory type) throws SdaiException;
	public AIfcperson getResponsiblepersons(EIfcinventory type) throws SdaiException;
	public AIfcperson createResponsiblepersons(EIfcinventory type) throws SdaiException;
	public void unsetResponsiblepersons(EIfcinventory type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:LastUpdateDate, base type: STRING
	public boolean testLastupdatedate(EIfcinventory type) throws SdaiException;
	public String getLastupdatedate(EIfcinventory type) throws SdaiException;
	public void setLastupdatedate(EIfcinventory type, String value) throws SdaiException;
	public void unsetLastupdatedate(EIfcinventory type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:CurrentValue, base type: entity IfcCostValue
	public boolean testCurrentvalue(EIfcinventory type) throws SdaiException;
	public EIfccostvalue getCurrentvalue(EIfcinventory type) throws SdaiException;
	public void setCurrentvalue(EIfcinventory type, EIfccostvalue value) throws SdaiException;
	public void unsetCurrentvalue(EIfcinventory type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:OriginalValue, base type: entity IfcCostValue
	public boolean testOriginalvalue(EIfcinventory type) throws SdaiException;
	public EIfccostvalue getOriginalvalue(EIfcinventory type) throws SdaiException;
	public void setOriginalvalue(EIfcinventory type, EIfccostvalue value) throws SdaiException;
	public void unsetOriginalvalue(EIfcinventory type) throws SdaiException;

}