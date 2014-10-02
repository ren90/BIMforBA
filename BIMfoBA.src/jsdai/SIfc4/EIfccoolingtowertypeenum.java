/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcCoolingTowerTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfccoolingtowertypeenum {

	private static final int unset = 0;
	public static final int NATURALDRAFT = 1;	// NATURALDRAFT
	public static final int MECHANICALINDUCEDDRAFT = 2;	// MECHANICALINDUCEDDRAFT
	public static final int MECHANICALFORCEDDRAFT = 3;	// MECHANICALFORCEDDRAFT
	public static final int USERDEFINED = 4;	// USERDEFINED
	public static final int NOTDEFINED = 5;	// NOTDEFINED

	private static final int dim = 5;

	public static final String values[] = {"NATURALDRAFT", "MECHANICALINDUCEDDRAFT", "MECHANICALFORCEDDRAFT", "USERDEFINED", "NOTDEFINED"};

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
