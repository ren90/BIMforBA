/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcInternalOrExternalEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcinternalorexternalenum {

	private static final int unset = 0;
	public static final int INTERNAL = 1;	// INTERNAL
	public static final int EXTERNAL = 2;	// EXTERNAL
	public static final int EXTERNAL_EARTH = 3;	// EXTERNAL_EARTH
	public static final int EXTERNAL_WATER = 4;	// EXTERNAL_WATER
	public static final int EXTERNAL_FIRE = 5;	// EXTERNAL_FIRE
	public static final int NOTDEFINED = 6;	// NOTDEFINED

	private static final int dim = 6;

	public static final String values[] = {"INTERNAL", "EXTERNAL", "EXTERNAL_EARTH", "EXTERNAL_WATER", "EXTERNAL_FIRE", "NOTDEFINED"};

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
