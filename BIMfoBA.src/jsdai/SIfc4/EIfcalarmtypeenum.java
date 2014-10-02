/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcAlarmTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcalarmtypeenum {

	private static final int unset = 0;
	public static final int BELL = 1;	// BELL
	public static final int BREAKGLASSBUTTON = 2;	// BREAKGLASSBUTTON
	public static final int LIGHT = 3;	// LIGHT
	public static final int MANUALPULLBOX = 4;	// MANUALPULLBOX
	public static final int SIREN = 5;	// SIREN
	public static final int WHISTLE = 6;	// WHISTLE
	public static final int USERDEFINED = 7;	// USERDEFINED
	public static final int NOTDEFINED = 8;	// NOTDEFINED

	private static final int dim = 8;

	public static final String values[] = {"BELL", "BREAKGLASSBUTTON", "LIGHT", "MANUALPULLBOX", "SIREN", "WHISTLE", "USERDEFINED", "NOTDEFINED"};

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
