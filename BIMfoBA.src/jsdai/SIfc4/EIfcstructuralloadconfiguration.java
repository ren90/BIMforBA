/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcStructuralLoadConfiguration

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcstructuralloadconfiguration extends EIfcstructuralload {

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: Values, base type: LIST OF ENTITY
	public boolean testValues(EIfcstructuralloadconfiguration type) throws SdaiException;
	public AIfcstructuralloadorresult getValues(EIfcstructuralloadconfiguration type) throws SdaiException;
	public AIfcstructuralloadorresult createValues(EIfcstructuralloadconfiguration type) throws SdaiException;
	public void unsetValues(EIfcstructuralloadconfiguration type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: Locations, base type: LIST OF LIST OF REAL
	public boolean testLocations(EIfcstructuralloadconfiguration type) throws SdaiException;
	public Aa_double getLocations(EIfcstructuralloadconfiguration type) throws SdaiException;
	public Aa_double createLocations(EIfcstructuralloadconfiguration type) throws SdaiException;
	public void unsetLocations(EIfcstructuralloadconfiguration type) throws SdaiException;

}
