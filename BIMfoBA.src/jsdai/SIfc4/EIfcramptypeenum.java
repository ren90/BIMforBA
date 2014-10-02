/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcRampTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcramptypeenum {

	private static final int unset = 0;
	public static final int STRAIGHT_RUN_RAMP = 1;	// STRAIGHT_RUN_RAMP
	public static final int TWO_STRAIGHT_RUN_RAMP = 2;	// TWO_STRAIGHT_RUN_RAMP
	public static final int QUARTER_TURN_RAMP = 3;	// QUARTER_TURN_RAMP
	public static final int TWO_QUARTER_TURN_RAMP = 4;	// TWO_QUARTER_TURN_RAMP
	public static final int HALF_TURN_RAMP = 5;	// HALF_TURN_RAMP
	public static final int SPIRAL_RAMP = 6;	// SPIRAL_RAMP
	public static final int USERDEFINED = 7;	// USERDEFINED
	public static final int NOTDEFINED = 8;	// NOTDEFINED

	private static final int dim = 8;

	public static final String values[] = {"STRAIGHT_RUN_RAMP", "TWO_STRAIGHT_RUN_RAMP", "QUARTER_TURN_RAMP", "TWO_QUARTER_TURN_RAMP", "HALF_TURN_RAMP", "SPIRAL_RAMP", "USERDEFINED", "NOTDEFINED"};

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
