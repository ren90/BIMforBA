/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcStructuralActivity

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcstructuralactivity extends EIfcproduct {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:AppliedLoad, base type: entity IfcStructuralLoad
	public boolean testAppliedload(EIfcstructuralactivity type) throws SdaiException;
	public EIfcstructuralload getAppliedload(EIfcstructuralactivity type) throws SdaiException;
	public void setAppliedload(EIfcstructuralactivity type, EIfcstructuralload value) throws SdaiException;
	public void unsetAppliedload(EIfcstructuralactivity type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:GlobalOrLocal, base type: ENUMERATION
	public boolean testGlobalorlocal(EIfcstructuralactivity type) throws SdaiException;
	public int getGlobalorlocal(EIfcstructuralactivity type) throws SdaiException;
	public void setGlobalorlocal(EIfcstructuralactivity type, int value) throws SdaiException;
	public void unsetGlobalorlocal(EIfcstructuralactivity type) throws SdaiException;

	public AIfcrelconnectsstructuralactivity getAssignedtostructuralitem(EIfcstructuralactivity type, ASdaiModel domain) throws SdaiException;
}
