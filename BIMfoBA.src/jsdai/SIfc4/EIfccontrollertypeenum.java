/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcControllerTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfccontrollertypeenum {

	private static final int unset = 0;
	public static final int FLOATING = 1;	// FLOATING
	public static final int PROGRAMMABLE = 2;	// PROGRAMMABLE
	public static final int PROPORTIONAL = 3;	// PROPORTIONAL
	public static final int MULTIPOSITION = 4;	// MULTIPOSITION
	public static final int TWOPOSITION = 5;	// TWOPOSITION
	public static final int USERDEFINED = 6;	// USERDEFINED
	public static final int NOTDEFINED = 7;	// NOTDEFINED

	private static final int dim = 7;

	public static final String values[] = {"FLOATING", "PROGRAMMABLE", "PROPORTIONAL", "MULTIPOSITION", "TWOPOSITION", "USERDEFINED", "NOTDEFINED"};

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
