/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcSweptAreaSolid

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcsweptareasolid extends EIfcsolidmodel {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:SweptArea, base type: entity IfcProfileDef
	public boolean testSweptarea(EIfcsweptareasolid type) throws SdaiException;
	public EIfcprofiledef getSweptarea(EIfcsweptareasolid type) throws SdaiException;
	public void setSweptarea(EIfcsweptareasolid type, EIfcprofiledef value) throws SdaiException;
	public void unsetSweptarea(EIfcsweptareasolid type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:Position, base type: entity IfcAxis2Placement3D
	public boolean testPosition(EIfcsweptareasolid type) throws SdaiException;
	public EIfcaxis2placement3d getPosition(EIfcsweptareasolid type) throws SdaiException;
	public void setPosition(EIfcsweptareasolid type, EIfcaxis2placement3d value) throws SdaiException;
	public void unsetPosition(EIfcsweptareasolid type) throws SdaiException;

}
