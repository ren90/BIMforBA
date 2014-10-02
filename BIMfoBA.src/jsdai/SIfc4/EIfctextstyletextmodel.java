/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcTextStyleTextModel

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfctextstyletextmodel extends EIfcpresentationitem {

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: TextIndent
	int sTextindentIfcdescriptivemeasure = 2;
	int sTextindentIfclengthmeasure = 3;
	int sTextindentIfcnormalisedratiomeasure = 4;
	int sTextindentIfcpositivelengthmeasure = 5;
	int sTextindentIfcpositiveratiomeasure = 6;
	int sTextindentIfcratiomeasure = 7;

	int testTextindent(EIfctextstyletextmodel type) throws SdaiException;

	String getTextindent(EIfctextstyletextmodel type, EIfcdescriptivemeasure node1) throws SdaiException; // case 2
	double getTextindent(EIfctextstyletextmodel type, EIfclengthmeasure node1) throws SdaiException; // case 3
	double getTextindent(EIfctextstyletextmodel type, EIfcnormalisedratiomeasure node1) throws SdaiException; // case 4
	double getTextindent(EIfctextstyletextmodel type, EIfcpositivelengthmeasure node1) throws SdaiException; // case 5
	double getTextindent(EIfctextstyletextmodel type, EIfcpositiveratiomeasure node1) throws SdaiException; // case 6
	double getTextindent(EIfctextstyletextmodel type, EIfcratiomeasure node1) throws SdaiException; // case 7

	void setTextindent(EIfctextstyletextmodel type, String value, EIfcdescriptivemeasure node1) throws SdaiException; // case 2
	void setTextindent(EIfctextstyletextmodel type, double value, EIfclengthmeasure node1) throws SdaiException; // case 3
	void setTextindent(EIfctextstyletextmodel type, double value, EIfcnormalisedratiomeasure node1) throws SdaiException; // case 4
	void setTextindent(EIfctextstyletextmodel type, double value, EIfcpositivelengthmeasure node1) throws SdaiException; // case 5
	void setTextindent(EIfctextstyletextmodel type, double value, EIfcpositiveratiomeasure node1) throws SdaiException; // case 6
	void setTextindent(EIfctextstyletextmodel type, double value, EIfcratiomeasure node1) throws SdaiException; // case 7

	void unsetTextindent(EIfctextstyletextmodel type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:TextAlign, base type: STRING
	public boolean testTextalign(EIfctextstyletextmodel type) throws SdaiException;
	public String getTextalign(EIfctextstyletextmodel type) throws SdaiException;
	public void setTextalign(EIfctextstyletextmodel type, String value) throws SdaiException;
	public void unsetTextalign(EIfctextstyletextmodel type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:TextDecoration, base type: STRING
	public boolean testTextdecoration(EIfctextstyletextmodel type) throws SdaiException;
	public String getTextdecoration(EIfctextstyletextmodel type) throws SdaiException;
	public void setTextdecoration(EIfctextstyletextmodel type, String value) throws SdaiException;
	public void unsetTextdecoration(EIfctextstyletextmodel type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: LetterSpacing
	int sLetterspacingIfcdescriptivemeasure = 2;
	int sLetterspacingIfclengthmeasure = 3;
	int sLetterspacingIfcnormalisedratiomeasure = 4;
	int sLetterspacingIfcpositivelengthmeasure = 5;
	int sLetterspacingIfcpositiveratiomeasure = 6;
	int sLetterspacingIfcratiomeasure = 7;

	int testLetterspacing(EIfctextstyletextmodel type) throws SdaiException;

	String getLetterspacing(EIfctextstyletextmodel type, EIfcdescriptivemeasure node1) throws SdaiException; // case 2
	double getLetterspacing(EIfctextstyletextmodel type, EIfclengthmeasure node1) throws SdaiException; // case 3
	double getLetterspacing(EIfctextstyletextmodel type, EIfcnormalisedratiomeasure node1) throws SdaiException; // case 4
	double getLetterspacing(EIfctextstyletextmodel type, EIfcpositivelengthmeasure node1) throws SdaiException; // case 5
	double getLetterspacing(EIfctextstyletextmodel type, EIfcpositiveratiomeasure node1) throws SdaiException; // case 6
	double getLetterspacing(EIfctextstyletextmodel type, EIfcratiomeasure node1) throws SdaiException; // case 7

	void setLetterspacing(EIfctextstyletextmodel type, String value, EIfcdescriptivemeasure node1) throws SdaiException; // case 2
	void setLetterspacing(EIfctextstyletextmodel type, double value, EIfclengthmeasure node1) throws SdaiException; // case 3
	void setLetterspacing(EIfctextstyletextmodel type, double value, EIfcnormalisedratiomeasure node1) throws SdaiException; // case 4
	void setLetterspacing(EIfctextstyletextmodel type, double value, EIfcpositivelengthmeasure node1) throws SdaiException; // case 5
	void setLetterspacing(EIfctextstyletextmodel type, double value, EIfcpositiveratiomeasure node1) throws SdaiException; // case 6
	void setLetterspacing(EIfctextstyletextmodel type, double value, EIfcratiomeasure node1) throws SdaiException; // case 7

	void unsetLetterspacing(EIfctextstyletextmodel type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: WordSpacing
	int sWordspacingIfcdescriptivemeasure = 2;
	int sWordspacingIfclengthmeasure = 3;
	int sWordspacingIfcnormalisedratiomeasure = 4;
	int sWordspacingIfcpositivelengthmeasure = 5;
	int sWordspacingIfcpositiveratiomeasure = 6;
	int sWordspacingIfcratiomeasure = 7;

	int testWordspacing(EIfctextstyletextmodel type) throws SdaiException;

	String getWordspacing(EIfctextstyletextmodel type, EIfcdescriptivemeasure node1) throws SdaiException; // case 2
	double getWordspacing(EIfctextstyletextmodel type, EIfclengthmeasure node1) throws SdaiException; // case 3
	double getWordspacing(EIfctextstyletextmodel type, EIfcnormalisedratiomeasure node1) throws SdaiException; // case 4
	double getWordspacing(EIfctextstyletextmodel type, EIfcpositivelengthmeasure node1) throws SdaiException; // case 5
	double getWordspacing(EIfctextstyletextmodel type, EIfcpositiveratiomeasure node1) throws SdaiException; // case 6
	double getWordspacing(EIfctextstyletextmodel type, EIfcratiomeasure node1) throws SdaiException; // case 7

	void setWordspacing(EIfctextstyletextmodel type, String value, EIfcdescriptivemeasure node1) throws SdaiException; // case 2
	void setWordspacing(EIfctextstyletextmodel type, double value, EIfclengthmeasure node1) throws SdaiException; // case 3
	void setWordspacing(EIfctextstyletextmodel type, double value, EIfcnormalisedratiomeasure node1) throws SdaiException; // case 4
	void setWordspacing(EIfctextstyletextmodel type, double value, EIfcpositivelengthmeasure node1) throws SdaiException; // case 5
	void setWordspacing(EIfctextstyletextmodel type, double value, EIfcpositiveratiomeasure node1) throws SdaiException; // case 6
	void setWordspacing(EIfctextstyletextmodel type, double value, EIfcratiomeasure node1) throws SdaiException; // case 7

	void unsetWordspacing(EIfctextstyletextmodel type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:TextTransform, base type: STRING
	public boolean testTexttransform(EIfctextstyletextmodel type) throws SdaiException;
	public String getTexttransform(EIfctextstyletextmodel type) throws SdaiException;
	public void setTexttransform(EIfctextstyletextmodel type, String value) throws SdaiException;
	public void unsetTexttransform(EIfctextstyletextmodel type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: LineHeight
	int sLineheightIfcdescriptivemeasure = 2;
	int sLineheightIfclengthmeasure = 3;
	int sLineheightIfcnormalisedratiomeasure = 4;
	int sLineheightIfcpositivelengthmeasure = 5;
	int sLineheightIfcpositiveratiomeasure = 6;
	int sLineheightIfcratiomeasure = 7;

	int testLineheight(EIfctextstyletextmodel type) throws SdaiException;

	String getLineheight(EIfctextstyletextmodel type, EIfcdescriptivemeasure node1) throws SdaiException; // case 2
	double getLineheight(EIfctextstyletextmodel type, EIfclengthmeasure node1) throws SdaiException; // case 3
	double getLineheight(EIfctextstyletextmodel type, EIfcnormalisedratiomeasure node1) throws SdaiException; // case 4
	double getLineheight(EIfctextstyletextmodel type, EIfcpositivelengthmeasure node1) throws SdaiException; // case 5
	double getLineheight(EIfctextstyletextmodel type, EIfcpositiveratiomeasure node1) throws SdaiException; // case 6
	double getLineheight(EIfctextstyletextmodel type, EIfcratiomeasure node1) throws SdaiException; // case 7

	void setLineheight(EIfctextstyletextmodel type, String value, EIfcdescriptivemeasure node1) throws SdaiException; // case 2
	void setLineheight(EIfctextstyletextmodel type, double value, EIfclengthmeasure node1) throws SdaiException; // case 3
	void setLineheight(EIfctextstyletextmodel type, double value, EIfcnormalisedratiomeasure node1) throws SdaiException; // case 4
	void setLineheight(EIfctextstyletextmodel type, double value, EIfcpositivelengthmeasure node1) throws SdaiException; // case 5
	void setLineheight(EIfctextstyletextmodel type, double value, EIfcpositiveratiomeasure node1) throws SdaiException; // case 6
	void setLineheight(EIfctextstyletextmodel type, double value, EIfcratiomeasure node1) throws SdaiException; // case 7

	void unsetLineheight(EIfctextstyletextmodel type) throws SdaiException;

}
