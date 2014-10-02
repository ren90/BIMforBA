/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcTextPath

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfctextpath {

	private static final int unset = 0;
	public static final int LEFT = 1;	// LEFT
	public static final int RIGHT = 2;	// RIGHT
	public static final int UP = 3;	// UP
	public static final int DOWN = 4;	// DOWN

	private static final int dim = 4;

	public static final String values[] = {"LEFT", "RIGHT", "UP", "DOWN"};

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
