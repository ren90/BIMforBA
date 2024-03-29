/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcProcedureTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcproceduretypeenum {

	private static final int unset = 0;
	public static final int ADVICE_CAUTION = 1;	// ADVICE_CAUTION
	public static final int ADVICE_NOTE = 2;	// ADVICE_NOTE
	public static final int ADVICE_WARNING = 3;	// ADVICE_WARNING
	public static final int CALIBRATION = 4;	// CALIBRATION
	public static final int DIAGNOSTIC = 5;	// DIAGNOSTIC
	public static final int SHUTDOWN = 6;	// SHUTDOWN
	public static final int STARTUP = 7;	// STARTUP
	public static final int USERDEFINED = 8;	// USERDEFINED
	public static final int NOTDEFINED = 9;	// NOTDEFINED

	private static final int dim = 9;

	public static final String values[] = {"ADVICE_CAUTION", "ADVICE_NOTE", "ADVICE_WARNING", "CALIBRATION", "DIAGNOSTIC", "SHUTDOWN", "STARTUP", "USERDEFINED", "NOTDEFINED"};

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
