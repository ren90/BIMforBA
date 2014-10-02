/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcAnalysisTheoryTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcanalysistheorytypeenum {

	private static final int unset = 0;
	public static final int FIRST_ORDER_THEORY = 1;	// FIRST_ORDER_THEORY
	public static final int SECOND_ORDER_THEORY = 2;	// SECOND_ORDER_THEORY
	public static final int THIRD_ORDER_THEORY = 3;	// THIRD_ORDER_THEORY
	public static final int FULL_NONLINEAR_THEORY = 4;	// FULL_NONLINEAR_THEORY
	public static final int USERDEFINED = 5;	// USERDEFINED
	public static final int NOTDEFINED = 6;	// NOTDEFINED

	private static final int dim = 6;

	public static final String values[] = {"FIRST_ORDER_THEORY", "SECOND_ORDER_THEORY", "THIRD_ORDER_THEORY", "FULL_NONLINEAR_THEORY", "USERDEFINED", "NOTDEFINED"};

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