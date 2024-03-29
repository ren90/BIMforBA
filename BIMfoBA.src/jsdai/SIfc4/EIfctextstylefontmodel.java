/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcTextStyleFontModel

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfctextstylefontmodel extends EIfcpredefinedtextfont {

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: FontFamily, base type: LIST OF STRING
	public boolean testFontfamily(EIfctextstylefontmodel type) throws SdaiException;
	public A_string getFontfamily(EIfctextstylefontmodel type) throws SdaiException;
	public A_string createFontfamily(EIfctextstylefontmodel type) throws SdaiException;
	public void unsetFontfamily(EIfctextstylefontmodel type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:FontStyle, base type: STRING
	public boolean testFontstyle(EIfctextstylefontmodel type) throws SdaiException;
	public String getFontstyle(EIfctextstylefontmodel type) throws SdaiException;
	public void setFontstyle(EIfctextstylefontmodel type, String value) throws SdaiException;
	public void unsetFontstyle(EIfctextstylefontmodel type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:FontVariant, base type: STRING
	public boolean testFontvariant(EIfctextstylefontmodel type) throws SdaiException;
	public String getFontvariant(EIfctextstylefontmodel type) throws SdaiException;
	public void setFontvariant(EIfctextstylefontmodel type, String value) throws SdaiException;
	public void unsetFontvariant(EIfctextstylefontmodel type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:FontWeight, base type: STRING
	public boolean testFontweight(EIfctextstylefontmodel type) throws SdaiException;
	public String getFontweight(EIfctextstylefontmodel type) throws SdaiException;
	public void setFontweight(EIfctextstylefontmodel type, String value) throws SdaiException;
	public void unsetFontweight(EIfctextstylefontmodel type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: FontSize
	int sFontsizeIfcdescriptivemeasure = 2;
	int sFontsizeIfclengthmeasure = 3;
	int sFontsizeIfcnormalisedratiomeasure = 4;
	int sFontsizeIfcpositivelengthmeasure = 5;
	int sFontsizeIfcpositiveratiomeasure = 6;
	int sFontsizeIfcratiomeasure = 7;

	int testFontsize(EIfctextstylefontmodel type) throws SdaiException;

	String getFontsize(EIfctextstylefontmodel type, EIfcdescriptivemeasure node1) throws SdaiException; // case 2
	double getFontsize(EIfctextstylefontmodel type, EIfclengthmeasure node1) throws SdaiException; // case 3
	double getFontsize(EIfctextstylefontmodel type, EIfcnormalisedratiomeasure node1) throws SdaiException; // case 4
	double getFontsize(EIfctextstylefontmodel type, EIfcpositivelengthmeasure node1) throws SdaiException; // case 5
	double getFontsize(EIfctextstylefontmodel type, EIfcpositiveratiomeasure node1) throws SdaiException; // case 6
	double getFontsize(EIfctextstylefontmodel type, EIfcratiomeasure node1) throws SdaiException; // case 7

	void setFontsize(EIfctextstylefontmodel type, String value, EIfcdescriptivemeasure node1) throws SdaiException; // case 2
	void setFontsize(EIfctextstylefontmodel type, double value, EIfclengthmeasure node1) throws SdaiException; // case 3
	void setFontsize(EIfctextstylefontmodel type, double value, EIfcnormalisedratiomeasure node1) throws SdaiException; // case 4
	void setFontsize(EIfctextstylefontmodel type, double value, EIfcpositivelengthmeasure node1) throws SdaiException; // case 5
	void setFontsize(EIfctextstylefontmodel type, double value, EIfcpositiveratiomeasure node1) throws SdaiException; // case 6
	void setFontsize(EIfctextstylefontmodel type, double value, EIfcratiomeasure node1) throws SdaiException; // case 7

	void unsetFontsize(EIfctextstylefontmodel type) throws SdaiException;

}
