/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcFlowMeterTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcflowmetertypeenum {

	private static final int unset = 0;
	public static final int ENERGYMETER = 1;	// ENERGYMETER
	public static final int GASMETER = 2;	// GASMETER
	public static final int OILMETER = 3;	// OILMETER
	public static final int WATERMETER = 4;	// WATERMETER
	public static final int USERDEFINED = 5;	// USERDEFINED
	public static final int NOTDEFINED = 6;	// NOTDEFINED

	private static final int dim = 6;

	public static final String values[] = {"ENERGYMETER", "GASMETER", "OILMETER", "WATERMETER", "USERDEFINED", "NOTDEFINED"};

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
