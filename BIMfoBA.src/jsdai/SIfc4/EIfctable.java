/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcTable

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfctable extends EEntity {

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:Name, base type: STRING
	public boolean testName(EIfctable type) throws SdaiException;
	public String getName(EIfctable type) throws SdaiException;
	public void setName(EIfctable type, String value) throws SdaiException;
	public void unsetName(EIfctable type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: Rows, base type: LIST OF ENTITY
	public boolean testRows(EIfctable type) throws SdaiException;
	public AIfctablerow getRows(EIfctable type) throws SdaiException;
	public AIfctablerow createRows(EIfctable type) throws SdaiException;
	public void unsetRows(EIfctable type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// methods for attribute: Columns, base type: LIST OF ENTITY
	public boolean testColumns(EIfctable type) throws SdaiException;
	public AIfctablecolumn getColumns(EIfctable type) throws SdaiException;
	public AIfctablecolumn createColumns(EIfctable type) throws SdaiException;
	public void unsetColumns(EIfctable type) throws SdaiException;

	// generateDerivedAttributeMethodDeclarations: 1
	/// methods for derived attribute:NumberOfCellsInRow, base type: INTEGER
	public boolean testNumberofcellsinrow(EIfctable type) throws SdaiException;
	public int getNumberofcellsinrow(EIfctable type) throws SdaiException;
	public Value getNumberofcellsinrow(EIfctable type, SdaiContext _context) throws SdaiException;

	// generateDerivedAttributeMethodDeclarations: 1
	/// methods for derived attribute:NumberOfHeadings, base type: INTEGER
	public boolean testNumberofheadings(EIfctable type) throws SdaiException;
	public int getNumberofheadings(EIfctable type) throws SdaiException;
	public Value getNumberofheadings(EIfctable type, SdaiContext _context) throws SdaiException;

	// generateDerivedAttributeMethodDeclarations: 1
	/// methods for derived attribute:NumberOfDataRows, base type: INTEGER
	public boolean testNumberofdatarows(EIfctable type) throws SdaiException;
	public int getNumberofdatarows(EIfctable type) throws SdaiException;
	public Value getNumberofdatarows(EIfctable type, SdaiContext _context) throws SdaiException;

}
