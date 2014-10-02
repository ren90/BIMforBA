/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcStairTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcstairtypeenum {

	private static final int unset = 0;
	public static final int STRAIGHT_RUN_STAIR = 1;	// STRAIGHT_RUN_STAIR
	public static final int TWO_STRAIGHT_RUN_STAIR = 2;	// TWO_STRAIGHT_RUN_STAIR
	public static final int QUARTER_WINDING_STAIR = 3;	// QUARTER_WINDING_STAIR
	public static final int QUARTER_TURN_STAIR = 4;	// QUARTER_TURN_STAIR
	public static final int HALF_WINDING_STAIR = 5;	// HALF_WINDING_STAIR
	public static final int HALF_TURN_STAIR = 6;	// HALF_TURN_STAIR
	public static final int TWO_QUARTER_WINDING_STAIR = 7;	// TWO_QUARTER_WINDING_STAIR
	public static final int TWO_QUARTER_TURN_STAIR = 8;	// TWO_QUARTER_TURN_STAIR
	public static final int THREE_QUARTER_WINDING_STAIR = 9;	// THREE_QUARTER_WINDING_STAIR
	public static final int THREE_QUARTER_TURN_STAIR = 10;	// THREE_QUARTER_TURN_STAIR
	public static final int SPIRAL_STAIR = 11;	// SPIRAL_STAIR
	public static final int DOUBLE_RETURN_STAIR = 12;	// DOUBLE_RETURN_STAIR
	public static final int CURVED_RUN_STAIR = 13;	// CURVED_RUN_STAIR
	public static final int TWO_CURVED_RUN_STAIR = 14;	// TWO_CURVED_RUN_STAIR
	public static final int USERDEFINED = 15;	// USERDEFINED
	public static final int NOTDEFINED = 16;	// NOTDEFINED

	private static final int dim = 16;

	public static final String values[] = {"STRAIGHT_RUN_STAIR", "TWO_STRAIGHT_RUN_STAIR", "QUARTER_WINDING_STAIR", "QUARTER_TURN_STAIR", "HALF_WINDING_STAIR", "HALF_TURN_STAIR", "TWO_QUARTER_WINDING_STAIR", "TWO_QUARTER_TURN_STAIR", "THREE_QUARTER_WINDING_STAIR", "THREE_QUARTER_TURN_STAIR", "SPIRAL_STAIR", "DOUBLE_RETURN_STAIR", "CURVED_RUN_STAIR", "TWO_CURVED_RUN_STAIR", "USERDEFINED", "NOTDEFINED"};

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
