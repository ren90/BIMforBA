/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcPropertySetTemplate

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcpropertysettemplate extends EIfcpropertytemplatedefinition {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:TemplateType, base type: ENUMERATION
	public boolean testTemplatetype(EIfcpropertysettemplate type) throws SdaiException;
	public int getTemplatetype(EIfcpropertysettemplate type) throws SdaiException;
	public void setTemplatetype(EIfcpropertysettemplate type, int value) throws SdaiException;
	public void unsetTemplatetype(EIfcpropertysettemplate type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:ApplicableEntity, base type: STRING
	public boolean testApplicableentity(EIfcpropertysettemplate type) throws SdaiException;
	public String getApplicableentity(EIfcpropertysettemplate type) throws SdaiException;
	public void setApplicableentity(EIfcpropertysettemplate type, String value) throws SdaiException;
	public void unsetApplicableentity(EIfcpropertysettemplate type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: HasPropertyTemplates, base type: SET OF ENTITY
	public boolean testHaspropertytemplates(EIfcpropertysettemplate type) throws SdaiException;
	public AIfcpropertytemplate getHaspropertytemplates(EIfcpropertysettemplate type) throws SdaiException;
	public AIfcpropertytemplate createHaspropertytemplates(EIfcpropertysettemplate type) throws SdaiException;
	public void unsetHaspropertytemplates(EIfcpropertysettemplate type) throws SdaiException;

	// Inverse attribute - Defines : SET[0:-2147483648] OF IfcRelDefinesByTemplate FOR RelatingTemplate
	public AIfcreldefinesbytemplate getDefines(EIfcpropertysettemplate type, ASdaiModel domain) throws SdaiException;
}
