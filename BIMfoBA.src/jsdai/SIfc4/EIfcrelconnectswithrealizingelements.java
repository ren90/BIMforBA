/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcRelConnectsWithRealizingElements

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcrelconnectswithrealizingelements extends EIfcrelconnectselements {

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: RealizingElements, base type: SET OF ENTITY
	public boolean testRealizingelements(EIfcrelconnectswithrealizingelements type) throws SdaiException;
	public AIfcelement getRealizingelements(EIfcrelconnectswithrealizingelements type) throws SdaiException;
	public AIfcelement createRealizingelements(EIfcrelconnectswithrealizingelements type) throws SdaiException;
	public void unsetRealizingelements(EIfcrelconnectswithrealizingelements type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:ConnectionType, base type: STRING
	public boolean testConnectiontype(EIfcrelconnectswithrealizingelements type) throws SdaiException;
	public String getConnectiontype(EIfcrelconnectswithrealizingelements type) throws SdaiException;
	public void setConnectiontype(EIfcrelconnectswithrealizingelements type, String value) throws SdaiException;
	public void unsetConnectiontype(EIfcrelconnectswithrealizingelements type) throws SdaiException;

}
