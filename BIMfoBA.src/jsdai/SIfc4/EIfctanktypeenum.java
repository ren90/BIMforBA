/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcTankTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfctanktypeenum {

	private static final int unset = 0;
	public static final int BASIN = 1;	// BASIN
	public static final int BREAKPRESSURE = 2;	// BREAKPRESSURE
	public static final int EXPANSION = 3;	// EXPANSION
	public static final int FEEDANDEXPANSION = 4;	// FEEDANDEXPANSION
	public static final int PRESSUREVESSEL = 5;	// PRESSUREVESSEL
	public static final int STORAGE = 6;	// STORAGE
	public static final int VESSEL = 7;	// VESSEL
	public static final int USERDEFINED = 8;	// USERDEFINED
	public static final int NOTDEFINED = 9;	// NOTDEFINED

	private static final int dim = 9;

	public static final String values[] = {"BASIN", "BREAKPRESSURE", "EXPANSION", "FEEDANDEXPANSION", "PRESSUREVESSEL", "STORAGE", "VESSEL", "USERDEFINED", "NOTDEFINED"};

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
