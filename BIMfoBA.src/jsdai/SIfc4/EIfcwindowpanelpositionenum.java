/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcWindowPanelPositionEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcwindowpanelpositionenum {

	private static final int unset = 0;
	public static final int LEFT = 1;	// LEFT
	public static final int MIDDLE = 2;	// MIDDLE
	public static final int RIGHT = 3;	// RIGHT
	public static final int BOTTOM = 4;	// BOTTOM
	public static final int TOP = 5;	// TOP
	public static final int NOTDEFINED = 6;	// NOTDEFINED

	private static final int dim = 6;

	public static final String values[] = {"LEFT", "MIDDLE", "RIGHT", "BOTTOM", "TOP", "NOTDEFINED"};

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