/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcBSplineSurface

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcbsplinesurface extends EIfcboundedsurface {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:UDegree, base type: INTEGER
	public boolean testUdegree(EIfcbsplinesurface type) throws SdaiException;
	public int getUdegree(EIfcbsplinesurface type) throws SdaiException;
	public void setUdegree(EIfcbsplinesurface type, int value) throws SdaiException;
	public void unsetUdegree(EIfcbsplinesurface type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:VDegree, base type: INTEGER
	public boolean testVdegree(EIfcbsplinesurface type) throws SdaiException;
	public int getVdegree(EIfcbsplinesurface type) throws SdaiException;
	public void setVdegree(EIfcbsplinesurface type, int value) throws SdaiException;
	public void unsetVdegree(EIfcbsplinesurface type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: ControlPointsList, base type: LIST OF LIST OF ENTITY
	public boolean testControlpointslist(EIfcbsplinesurface type) throws SdaiException;
	public AaIfccartesianpoint getControlpointslist(EIfcbsplinesurface type) throws SdaiException;
	public AaIfccartesianpoint createControlpointslist(EIfcbsplinesurface type) throws SdaiException;
	public void unsetControlpointslist(EIfcbsplinesurface type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:SurfaceForm, base type: ENUMERATION
	public boolean testSurfaceform(EIfcbsplinesurface type) throws SdaiException;
	public int getSurfaceform(EIfcbsplinesurface type) throws SdaiException;
	public void setSurfaceform(EIfcbsplinesurface type, int value) throws SdaiException;
	public void unsetSurfaceform(EIfcbsplinesurface type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:UClosed, base type: LOGICAL
	public boolean testUclosed(EIfcbsplinesurface type) throws SdaiException;
	public int getUclosed(EIfcbsplinesurface type) throws SdaiException;
	public void setUclosed(EIfcbsplinesurface type, int value) throws SdaiException;
	public void unsetUclosed(EIfcbsplinesurface type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:VClosed, base type: LOGICAL
	public boolean testVclosed(EIfcbsplinesurface type) throws SdaiException;
	public int getVclosed(EIfcbsplinesurface type) throws SdaiException;
	public void setVclosed(EIfcbsplinesurface type, int value) throws SdaiException;
	public void unsetVclosed(EIfcbsplinesurface type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:SelfIntersect, base type: LOGICAL
	public boolean testSelfintersect(EIfcbsplinesurface type) throws SdaiException;
	public int getSelfintersect(EIfcbsplinesurface type) throws SdaiException;
	public void setSelfintersect(EIfcbsplinesurface type, int value) throws SdaiException;
	public void unsetSelfintersect(EIfcbsplinesurface type) throws SdaiException;

	// generateDerivedAttributeMethodDeclarations: 1
	/// methods for derived attribute:UUpper, base type: INTEGER
	public boolean testUupper(EIfcbsplinesurface type) throws SdaiException;
	public int getUupper(EIfcbsplinesurface type) throws SdaiException;
	public Value getUupper(EIfcbsplinesurface type, SdaiContext _context) throws SdaiException;

	// generateDerivedAttributeMethodDeclarations: 1
	/// methods for derived attribute:VUpper, base type: INTEGER
	public boolean testVupper(EIfcbsplinesurface type) throws SdaiException;
	public int getVupper(EIfcbsplinesurface type) throws SdaiException;
	public Value getVupper(EIfcbsplinesurface type, SdaiContext _context) throws SdaiException;

	// generateDerivedAttributeMethodDeclarations: 1
	// methods for attribute: ControlPoints, base type: ARRAY OF ARRAY OF ENTITY
	public boolean testControlpoints(EIfcbsplinesurface type) throws SdaiException;
	public Value getControlpoints(EIfcbsplinesurface type, SdaiContext _context) throws SdaiException;
	public AaIfccartesianpoint getControlpoints(EIfcbsplinesurface type) throws SdaiException;

}
