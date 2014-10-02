/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcSurfaceStyleRendering

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcsurfacestylerendering extends EIfcsurfacestyleshading {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Transparency, base type: REAL
	public boolean testTransparency(EIfcsurfacestylerendering type) throws SdaiException;
	public double getTransparency(EIfcsurfacestylerendering type) throws SdaiException;
	public void setTransparency(EIfcsurfacestylerendering type, double value) throws SdaiException;
	public void unsetTransparency(EIfcsurfacestylerendering type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: DiffuseColour
	int sDiffusecolourIfcnormalisedratiomeasure = 2;

	int testDiffusecolour(EIfcsurfacestylerendering type) throws SdaiException;

	EEntity getDiffusecolour(EIfcsurfacestylerendering type) throws SdaiException; // case 1
	double getDiffusecolour(EIfcsurfacestylerendering type, EIfcnormalisedratiomeasure node1) throws SdaiException; // case 2

	void setDiffusecolour(EIfcsurfacestylerendering type, EEntity value) throws SdaiException; // case 1
	void setDiffusecolour(EIfcsurfacestylerendering type, double value, EIfcnormalisedratiomeasure node1) throws SdaiException; // case 2

	void unsetDiffusecolour(EIfcsurfacestylerendering type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: TransmissionColour
	int sTransmissioncolourIfcnormalisedratiomeasure = 2;

	int testTransmissioncolour(EIfcsurfacestylerendering type) throws SdaiException;

	EEntity getTransmissioncolour(EIfcsurfacestylerendering type) throws SdaiException; // case 1
	double getTransmissioncolour(EIfcsurfacestylerendering type, EIfcnormalisedratiomeasure node1) throws SdaiException; // case 2

	void setTransmissioncolour(EIfcsurfacestylerendering type, EEntity value) throws SdaiException; // case 1
	void setTransmissioncolour(EIfcsurfacestylerendering type, double value, EIfcnormalisedratiomeasure node1) throws SdaiException; // case 2

	void unsetTransmissioncolour(EIfcsurfacestylerendering type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: DiffuseTransmissionColour
	int sDiffusetransmissioncolourIfcnormalisedratiomeasure = 2;

	int testDiffusetransmissioncolour(EIfcsurfacestylerendering type) throws SdaiException;

	EEntity getDiffusetransmissioncolour(EIfcsurfacestylerendering type) throws SdaiException; // case 1
	double getDiffusetransmissioncolour(EIfcsurfacestylerendering type, EIfcnormalisedratiomeasure node1) throws SdaiException; // case 2

	void setDiffusetransmissioncolour(EIfcsurfacestylerendering type, EEntity value) throws SdaiException; // case 1
	void setDiffusetransmissioncolour(EIfcsurfacestylerendering type, double value, EIfcnormalisedratiomeasure node1) throws SdaiException; // case 2

	void unsetDiffusetransmissioncolour(EIfcsurfacestylerendering type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: ReflectionColour
	int sReflectioncolourIfcnormalisedratiomeasure = 2;

	int testReflectioncolour(EIfcsurfacestylerendering type) throws SdaiException;

	EEntity getReflectioncolour(EIfcsurfacestylerendering type) throws SdaiException; // case 1
	double getReflectioncolour(EIfcsurfacestylerendering type, EIfcnormalisedratiomeasure node1) throws SdaiException; // case 2

	void setReflectioncolour(EIfcsurfacestylerendering type, EEntity value) throws SdaiException; // case 1
	void setReflectioncolour(EIfcsurfacestylerendering type, double value, EIfcnormalisedratiomeasure node1) throws SdaiException; // case 2

	void unsetReflectioncolour(EIfcsurfacestylerendering type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: SpecularColour
	int sSpecularcolourIfcnormalisedratiomeasure = 2;

	int testSpecularcolour(EIfcsurfacestylerendering type) throws SdaiException;

	EEntity getSpecularcolour(EIfcsurfacestylerendering type) throws SdaiException; // case 1
	double getSpecularcolour(EIfcsurfacestylerendering type, EIfcnormalisedratiomeasure node1) throws SdaiException; // case 2

	void setSpecularcolour(EIfcsurfacestylerendering type, EEntity value) throws SdaiException; // case 1
	void setSpecularcolour(EIfcsurfacestylerendering type, double value, EIfcnormalisedratiomeasure node1) throws SdaiException; // case 2

	void unsetSpecularcolour(EIfcsurfacestylerendering type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: SpecularHighlight
	int sSpecularhighlightIfcspecularexponent = 2;
	int sSpecularhighlightIfcspecularroughness = 3;

	int testSpecularhighlight(EIfcsurfacestylerendering type) throws SdaiException;

	double getSpecularhighlight(EIfcsurfacestylerendering type, EIfcspecularexponent node1) throws SdaiException; // case 2
	double getSpecularhighlight(EIfcsurfacestylerendering type, EIfcspecularroughness node1) throws SdaiException; // case 3

	void setSpecularhighlight(EIfcsurfacestylerendering type, double value, EIfcspecularexponent node1) throws SdaiException; // case 2
	void setSpecularhighlight(EIfcsurfacestylerendering type, double value, EIfcspecularroughness node1) throws SdaiException; // case 3

	void unsetSpecularhighlight(EIfcsurfacestylerendering type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:ReflectanceMethod, base type: ENUMERATION
	public boolean testReflectancemethod(EIfcsurfacestylerendering type) throws SdaiException;
	public int getReflectancemethod(EIfcsurfacestylerendering type) throws SdaiException;
	public void setReflectancemethod(EIfcsurfacestylerendering type, int value) throws SdaiException;
	public void unsetReflectancemethod(EIfcsurfacestylerendering type) throws SdaiException;

}