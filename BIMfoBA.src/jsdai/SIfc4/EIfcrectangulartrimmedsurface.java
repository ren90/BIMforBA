/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcRectangularTrimmedSurface

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcrectangulartrimmedsurface extends EIfcboundedsurface {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:BasisSurface, base type: entity IfcSurface
	public boolean testBasissurface(EIfcrectangulartrimmedsurface type) throws SdaiException;
	public EIfcsurface getBasissurface(EIfcrectangulartrimmedsurface type) throws SdaiException;
	public void setBasissurface(EIfcrectangulartrimmedsurface type, EIfcsurface value) throws SdaiException;
	public void unsetBasissurface(EIfcrectangulartrimmedsurface type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:U1, base type: REAL
	public boolean testU1(EIfcrectangulartrimmedsurface type) throws SdaiException;
	public double getU1(EIfcrectangulartrimmedsurface type) throws SdaiException;
	public void setU1(EIfcrectangulartrimmedsurface type, double value) throws SdaiException;
	public void unsetU1(EIfcrectangulartrimmedsurface type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:V1, base type: REAL
	public boolean testV1(EIfcrectangulartrimmedsurface type) throws SdaiException;
	public double getV1(EIfcrectangulartrimmedsurface type) throws SdaiException;
	public void setV1(EIfcrectangulartrimmedsurface type, double value) throws SdaiException;
	public void unsetV1(EIfcrectangulartrimmedsurface type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:U2, base type: REAL
	public boolean testU2(EIfcrectangulartrimmedsurface type) throws SdaiException;
	public double getU2(EIfcrectangulartrimmedsurface type) throws SdaiException;
	public void setU2(EIfcrectangulartrimmedsurface type, double value) throws SdaiException;
	public void unsetU2(EIfcrectangulartrimmedsurface type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:V2, base type: REAL
	public boolean testV2(EIfcrectangulartrimmedsurface type) throws SdaiException;
	public double getV2(EIfcrectangulartrimmedsurface type) throws SdaiException;
	public void setV2(EIfcrectangulartrimmedsurface type, double value) throws SdaiException;
	public void unsetV2(EIfcrectangulartrimmedsurface type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Usense, base type: BOOLEAN
	public boolean testUsense(EIfcrectangulartrimmedsurface type) throws SdaiException;
	public boolean getUsense(EIfcrectangulartrimmedsurface type) throws SdaiException;
	public void setUsense(EIfcrectangulartrimmedsurface type, boolean value) throws SdaiException;
	public void unsetUsense(EIfcrectangulartrimmedsurface type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Vsense, base type: BOOLEAN
	public boolean testVsense(EIfcrectangulartrimmedsurface type) throws SdaiException;
	public boolean getVsense(EIfcrectangulartrimmedsurface type) throws SdaiException;
	public void setVsense(EIfcrectangulartrimmedsurface type, boolean value) throws SdaiException;
	public void unsetVsense(EIfcrectangulartrimmedsurface type) throws SdaiException;

}