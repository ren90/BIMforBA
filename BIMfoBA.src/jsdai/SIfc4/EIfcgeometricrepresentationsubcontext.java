/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcGeometricRepresentationSubContext

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcgeometricrepresentationsubcontext extends EIfcgeometricrepresentationcontext {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:ParentContext, base type: entity IfcGeometricRepresentationContext
	public boolean testParentcontext(EIfcgeometricrepresentationsubcontext type) throws SdaiException;
	public EIfcgeometricrepresentationcontext getParentcontext(EIfcgeometricrepresentationsubcontext type) throws SdaiException;
	public void setParentcontext(EIfcgeometricrepresentationsubcontext type, EIfcgeometricrepresentationcontext value) throws SdaiException;
	public void unsetParentcontext(EIfcgeometricrepresentationsubcontext type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:TargetScale, base type: REAL
	public boolean testTargetscale(EIfcgeometricrepresentationsubcontext type) throws SdaiException;
	public double getTargetscale(EIfcgeometricrepresentationsubcontext type) throws SdaiException;
	public void setTargetscale(EIfcgeometricrepresentationsubcontext type, double value) throws SdaiException;
	public void unsetTargetscale(EIfcgeometricrepresentationsubcontext type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:TargetView, base type: ENUMERATION
	public boolean testTargetview(EIfcgeometricrepresentationsubcontext type) throws SdaiException;
	public int getTargetview(EIfcgeometricrepresentationsubcontext type) throws SdaiException;
	public void setTargetview(EIfcgeometricrepresentationsubcontext type, int value) throws SdaiException;
	public void unsetTargetview(EIfcgeometricrepresentationsubcontext type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:UserDefinedTargetView, base type: STRING
	public boolean testUserdefinedtargetview(EIfcgeometricrepresentationsubcontext type) throws SdaiException;
	public String getUserdefinedtargetview(EIfcgeometricrepresentationsubcontext type) throws SdaiException;
	public void setUserdefinedtargetview(EIfcgeometricrepresentationsubcontext type, String value) throws SdaiException;
	public void unsetUserdefinedtargetview(EIfcgeometricrepresentationsubcontext type) throws SdaiException;

	// derived-redeclaring 1: direct, redeclared: EIfcgeometricrepresentationcontext, original: EIfcgeometricrepresentationcontext
	// attribute name, current: WorldCoordinateSystem, previous: WorldCoordinateSystem, original: WorldCoordinateSystem
	public Value getWorldcoordinatesystem(EIfcgeometricrepresentationcontext type, SdaiContext _context) throws SdaiException;
	// derived-redeclaring 1: direct, redeclared: EIfcgeometricrepresentationcontext, original: EIfcgeometricrepresentationcontext
	// attribute name, current: CoordinateSpaceDimension, previous: CoordinateSpaceDimension, original: CoordinateSpaceDimension
	public Value getCoordinatespacedimension(EIfcgeometricrepresentationcontext type, SdaiContext _context) throws SdaiException;
	// derived-redeclaring 1: direct, redeclared: EIfcgeometricrepresentationcontext, original: EIfcgeometricrepresentationcontext
	// attribute name, current: TrueNorth, previous: TrueNorth, original: TrueNorth
	public Value getTruenorth(EIfcgeometricrepresentationcontext type, SdaiContext _context) throws SdaiException;
	// derived-redeclaring 1: direct, redeclared: EIfcgeometricrepresentationcontext, original: EIfcgeometricrepresentationcontext
	// attribute name, current: Precision, previous: Precision, original: Precision
	public Value getPrecision(EIfcgeometricrepresentationcontext type, SdaiContext _context) throws SdaiException;
}
