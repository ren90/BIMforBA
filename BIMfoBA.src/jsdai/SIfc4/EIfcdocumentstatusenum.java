/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcDocumentStatusEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcdocumentstatusenum {

	private static final int unset = 0;
	public static final int DRAFT = 1;	// DRAFT
	public static final int FINALDRAFT = 2;	// FINALDRAFT
	public static final int FINAL = 3;	// FINAL
	public static final int REVISION = 4;	// REVISION
	public static final int NOTDEFINED = 5;	// NOTDEFINED

	private static final int dim = 5;

	public static final String values[] = {"DRAFT", "FINALDRAFT", "FINAL", "REVISION", "NOTDEFINED"};

//-------- methods ---------

	private static boolean isSet(int value) { return ((value >= 1) && (value <= dim)); }

	public static int toInt(String str) {
		for (int i = 0; i < dim; i++) {
			if (values[i].equalsIgnoreCase(str)) return i+1;
		}
		return unset;
	}

	public static String toString(int value) {
		if (!isSet(value)) return "unset";
		return values[value-1];
	}
}
