/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcWindowStyle

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcwindowstyle extends EIfctypeproduct {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:ConstructionType, base type: ENUMERATION
	public boolean testConstructiontype(EIfcwindowstyle type) throws SdaiException;
	public int getConstructiontype(EIfcwindowstyle type) throws SdaiException;
	public void setConstructiontype(EIfcwindowstyle type, int value) throws SdaiException;
	public void unsetConstructiontype(EIfcwindowstyle type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:OperationType, base type: ENUMERATION
	public boolean testOperationtype(EIfcwindowstyle type) throws SdaiException;
	public int getOperationtype(EIfcwindowstyle type) throws SdaiException;
	public void setOperationtype(EIfcwindowstyle type, int value) throws SdaiException;
	public void unsetOperationtype(EIfcwindowstyle type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:ParameterTakesPrecedence, base type: BOOLEAN
	public boolean testParametertakesprecedence(EIfcwindowstyle type) throws SdaiException;
	public boolean getParametertakesprecedence(EIfcwindowstyle type) throws SdaiException;
	public void setParametertakesprecedence(EIfcwindowstyle type, boolean value) throws SdaiException;
	public void unsetParametertakesprecedence(EIfcwindowstyle type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Sizeable, base type: BOOLEAN
	public boolean testSizeable(EIfcwindowstyle type) throws SdaiException;
	public boolean getSizeable(EIfcwindowstyle type) throws SdaiException;
	public void setSizeable(EIfcwindowstyle type, boolean value) throws SdaiException;
	public void unsetSizeable(EIfcwindowstyle type) throws SdaiException;

}