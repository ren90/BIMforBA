/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcMedicalDeviceTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcmedicaldevicetypeenum {

	private static final int unset = 0;
	public static final int AIRSTATION = 1;	// AIRSTATION
	public static final int FEEDAIRUNIT = 2;	// FEEDAIRUNIT
	public static final int OXYGENGENERATOR = 3;	// OXYGENGENERATOR
	public static final int OXYGENPLANT = 4;	// OXYGENPLANT
	public static final int VACUUMSTATION = 5;	// VACUUMSTATION
	public static final int USERDEFINED = 6;	// USERDEFINED
	public static final int NOTDEFINED = 7;	// NOTDEFINED

	private static final int dim = 7;

	public static final String values[] = {"AIRSTATION", "FEEDAIRUNIT", "OXYGENGENERATOR", "OXYGENPLANT", "VACUUMSTATION", "USERDEFINED", "NOTDEFINED"};

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