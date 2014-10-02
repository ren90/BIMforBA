/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcCurveInterpolationEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfccurveinterpolationenum {

	private static final int unset = 0;
	public static final int LINEAR = 1;	// LINEAR
	public static final int LOG_LINEAR = 2;	// LOG_LINEAR
	public static final int LOG_LOG = 3;	// LOG_LOG
	public static final int NOTDEFINED = 4;	// NOTDEFINED

	private static final int dim = 4;

	public static final String values[] = {"LINEAR", "LOG_LINEAR", "LOG_LOG", "NOTDEFINED"};

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
