/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcDistributionPort

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcdistributionport extends EIfcport {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:FlowDirection, base type: ENUMERATION
	public boolean testFlowdirection(EIfcdistributionport type) throws SdaiException;
	public int getFlowdirection(EIfcdistributionport type) throws SdaiException;
	public void setFlowdirection(EIfcdistributionport type, int value) throws SdaiException;
	public void unsetFlowdirection(EIfcdistributionport type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:PredefinedType, base type: ENUMERATION
	public boolean testPredefinedtype(EIfcdistributionport type) throws SdaiException;
	public int getPredefinedtype(EIfcdistributionport type) throws SdaiException;
	public void setPredefinedtype(EIfcdistributionport type, int value) throws SdaiException;
	public void unsetPredefinedtype(EIfcdistributionport type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:SystemType, base type: ENUMERATION
	public boolean testSystemtype(EIfcdistributionport type) throws SdaiException;
	public int getSystemtype(EIfcdistributionport type) throws SdaiException;
	public void setSystemtype(EIfcdistributionport type, int value) throws SdaiException;
	public void unsetSystemtype(EIfcdistributionport type) throws SdaiException;

}
