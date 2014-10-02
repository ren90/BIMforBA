/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcBooleanOperator

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcbooleanoperator {

	private static final int unset = 0;
	public static final int UNION = 1;	// UNION
	public static final int INTERSECTION = 2;	// INTERSECTION
	public static final int DIFFERENCE = 3;	// DIFFERENCE

	private static final int dim = 3;

	public static final String values[] = {"UNION", "INTERSECTION", "DIFFERENCE"};

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