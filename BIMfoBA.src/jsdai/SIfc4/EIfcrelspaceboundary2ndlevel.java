/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcRelSpaceBoundary2ndLevel

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcrelspaceboundary2ndlevel extends EIfcrelspaceboundary1stlevel {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:CorrespondingBoundary, base type: entity IfcRelSpaceBoundary2ndLevel
	public boolean testCorrespondingboundary(EIfcrelspaceboundary2ndlevel type) throws SdaiException;
	public EIfcrelspaceboundary2ndlevel getCorrespondingboundary(EIfcrelspaceboundary2ndlevel type) throws SdaiException;
	public void setCorrespondingboundary(EIfcrelspaceboundary2ndlevel type, EIfcrelspaceboundary2ndlevel value) throws SdaiException;
	public void unsetCorrespondingboundary(EIfcrelspaceboundary2ndlevel type) throws SdaiException;

	public AIfcrelspaceboundary2ndlevel getCorresponds(EIfcrelspaceboundary2ndlevel type, ASdaiModel domain) throws SdaiException;
}