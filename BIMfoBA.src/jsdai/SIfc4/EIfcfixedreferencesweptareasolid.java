/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcFixedReferenceSweptAreaSolid

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcfixedreferencesweptareasolid extends EIfcsweptareasolid {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:Directrix, base type: entity IfcCurve
	public boolean testDirectrix(EIfcfixedreferencesweptareasolid type) throws SdaiException;
	public EIfccurve getDirectrix(EIfcfixedreferencesweptareasolid type) throws SdaiException;
	public void setDirectrix(EIfcfixedreferencesweptareasolid type, EIfccurve value) throws SdaiException;
	public void unsetDirectrix(EIfcfixedreferencesweptareasolid type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:StartParam, base type: REAL
	public boolean testStartparam(EIfcfixedreferencesweptareasolid type) throws SdaiException;
	public double getStartparam(EIfcfixedreferencesweptareasolid type) throws SdaiException;
	public void setStartparam(EIfcfixedreferencesweptareasolid type, double value) throws SdaiException;
	public void unsetStartparam(EIfcfixedreferencesweptareasolid type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:EndParam, base type: REAL
	public boolean testEndparam(EIfcfixedreferencesweptareasolid type) throws SdaiException;
	public double getEndparam(EIfcfixedreferencesweptareasolid type) throws SdaiException;
	public void setEndparam(EIfcfixedreferencesweptareasolid type, double value) throws SdaiException;
	public void unsetEndparam(EIfcfixedreferencesweptareasolid type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:FixedReference, base type: entity IfcDirection
	public boolean testFixedreference(EIfcfixedreferencesweptareasolid type) throws SdaiException;
	public EIfcdirection getFixedreference(EIfcfixedreferencesweptareasolid type) throws SdaiException;
	public void setFixedreference(EIfcfixedreferencesweptareasolid type, EIfcdirection value) throws SdaiException;
	public void unsetFixedreference(EIfcfixedreferencesweptareasolid type) throws SdaiException;

}