/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcTransformerTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfctransformertypeenum {

	private static final int unset = 0;
	public static final int CURRENT = 1;	// CURRENT
	public static final int FREQUENCY = 2;	// FREQUENCY
	public static final int INVERTER = 3;	// INVERTER
	public static final int RECTIFIER = 4;	// RECTIFIER
	public static final int VOLTAGE = 5;	// VOLTAGE
	public static final int USERDEFINED = 6;	// USERDEFINED
	public static final int NOTDEFINED = 7;	// NOTDEFINED

	private static final int dim = 7;

	public static final String values[] = {"CURRENT", "FREQUENCY", "INVERTER", "RECTIFIER", "VOLTAGE", "USERDEFINED", "NOTDEFINED"};

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
