/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcAnnotationFillArea

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcannotationfillarea extends EIfcgeometricrepresentationitem {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:OuterBoundary, base type: entity IfcCurve
	public boolean testOuterboundary(EIfcannotationfillarea type) throws SdaiException;
	public EIfccurve getOuterboundary(EIfcannotationfillarea type) throws SdaiException;
	public void setOuterboundary(EIfcannotationfillarea type, EIfccurve value) throws SdaiException;
	public void unsetOuterboundary(EIfcannotationfillarea type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: InnerBoundaries, base type: SET OF ENTITY
	public boolean testInnerboundaries(EIfcannotationfillarea type) throws SdaiException;
	public AIfccurve getInnerboundaries(EIfcannotationfillarea type) throws SdaiException;
	public AIfccurve createInnerboundaries(EIfcannotationfillarea type) throws SdaiException;
	public void unsetInnerboundaries(EIfcannotationfillarea type) throws SdaiException;

}