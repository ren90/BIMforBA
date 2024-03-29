/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcSpatialZoneTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcspatialzonetypeenum {

	private static final int unset = 0;
	public static final int CONSTRUCTION = 1;	// CONSTRUCTION
	public static final int FIRESAFETY = 2;	// FIRESAFETY
	public static final int LIGHTING = 3;	// LIGHTING
	public static final int OCCUPANCY = 4;	// OCCUPANCY
	public static final int SECURITY = 5;	// SECURITY
	public static final int THERMAL = 6;	// THERMAL
	public static final int TRANSPORT = 7;	// TRANSPORT
	public static final int VENTILATION = 8;	// VENTILATION
	public static final int USERDEFINED = 9;	// USERDEFINED
	public static final int NOTDEFINED = 10;	// NOTDEFINED

	private static final int dim = 10;

	public static final String values[] = {"CONSTRUCTION", "FIRESAFETY", "LIGHTING", "OCCUPANCY", "SECURITY", "THERMAL", "TRANSPORT", "VENTILATION", "USERDEFINED", "NOTDEFINED"};

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
