/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcPcurve

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcpcurve extends EIfccurve {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:BasisSurface, base type: entity IfcSurface
	public boolean testBasissurface(EIfcpcurve type) throws SdaiException;
	public EIfcsurface getBasissurface(EIfcpcurve type) throws SdaiException;
	public void setBasissurface(EIfcpcurve type, EIfcsurface value) throws SdaiException;
	public void unsetBasissurface(EIfcpcurve type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:ReferenceCurve, base type: entity IfcCurve
	public boolean testReferencecurve(EIfcpcurve type) throws SdaiException;
	public EIfccurve getReferencecurve(EIfcpcurve type) throws SdaiException;
	public void setReferencecurve(EIfcpcurve type, EIfccurve value) throws SdaiException;
	public void unsetReferencecurve(EIfcpcurve type) throws SdaiException;

}
