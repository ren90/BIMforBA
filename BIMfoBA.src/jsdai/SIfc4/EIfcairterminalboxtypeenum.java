/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcAirTerminalBoxTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcairterminalboxtypeenum {

	private static final int unset = 0;
	public static final int CONSTANTFLOW = 1;	// CONSTANTFLOW
	public static final int VARIABLEFLOWPRESSUREDEPENDANT = 2;	// VARIABLEFLOWPRESSUREDEPENDANT
	public static final int VARIABLEFLOWPRESSUREINDEPENDANT = 3;	// VARIABLEFLOWPRESSUREINDEPENDANT
	public static final int USERDEFINED = 4;	// USERDEFINED
	public static final int NOTDEFINED = 5;	// NOTDEFINED

	private static final int dim = 5;

	public static final String values[] = {"CONSTANTFLOW", "VARIABLEFLOWPRESSUREDEPENDANT", "VARIABLEFLOWPRESSUREINDEPENDANT", "USERDEFINED", "NOTDEFINED"};

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
