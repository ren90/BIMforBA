/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcRelAssignsToActor

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcrelassignstoactor extends EIfcrelassigns {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:RelatingActor, base type: entity IfcActor
	public boolean testRelatingactor(EIfcrelassignstoactor type) throws SdaiException;
	public EIfcactor getRelatingactor(EIfcrelassignstoactor type) throws SdaiException;
	public void setRelatingactor(EIfcrelassignstoactor type, EIfcactor value) throws SdaiException;
	public void unsetRelatingactor(EIfcrelassignstoactor type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:ActingRole, base type: entity IfcActorRole
	public boolean testActingrole(EIfcrelassignstoactor type) throws SdaiException;
	public EIfcactorrole getActingrole(EIfcrelassignstoactor type) throws SdaiException;
	public void setActingrole(EIfcrelassignstoactor type, EIfcactorrole value) throws SdaiException;
	public void unsetActingrole(EIfcrelassignstoactor type) throws SdaiException;

}
