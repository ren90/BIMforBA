/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcDoorTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcdoortypeenum {

	private static final int unset = 0;
	public static final int DOOR = 1;	// DOOR
	public static final int GATE = 2;	// GATE
	public static final int TRAPDOOR = 3;	// TRAPDOOR
	public static final int USERDEFINED = 4;	// USERDEFINED
	public static final int NOTDEFINED = 5;	// NOTDEFINED

	private static final int dim = 5;

	public static final String values[] = {"DOOR", "GATE", "TRAPDOOR", "USERDEFINED", "NOTDEFINED"};

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