/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcEngineTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcenginetypeenum {

	private static final int unset = 0;
	public static final int EXTERNALCOMBUSTION = 1;	// EXTERNALCOMBUSTION
	public static final int INTERNALCOMBUSTION = 2;	// INTERNALCOMBUSTION
	public static final int USERDEFINED = 3;	// USERDEFINED
	public static final int NOTDEFINED = 4;	// NOTDEFINED

	private static final int dim = 4;

	public static final String values[] = {"EXTERNALCOMBUSTION", "INTERNALCOMBUSTION", "USERDEFINED", "NOTDEFINED"};

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
