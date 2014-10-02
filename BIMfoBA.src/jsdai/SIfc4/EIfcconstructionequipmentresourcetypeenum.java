/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcConstructionEquipmentResourceTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcconstructionequipmentresourcetypeenum {

	private static final int unset = 0;
	public static final int DEMOLISHING = 1;	// DEMOLISHING
	public static final int EARTHMOVING = 2;	// EARTHMOVING
	public static final int ERECTING = 3;	// ERECTING
	public static final int HEATING = 4;	// HEATING
	public static final int LIGHTING = 5;	// LIGHTING
	public static final int PAVING = 6;	// PAVING
	public static final int PUMPING = 7;	// PUMPING
	public static final int TRANSPORTING = 8;	// TRANSPORTING
	public static final int USERDEFINED = 9;	// USERDEFINED
	public static final int NOTDEFINED = 10;	// NOTDEFINED

	private static final int dim = 10;

	public static final String values[] = {"DEMOLISHING", "EARTHMOVING", "ERECTING", "HEATING", "LIGHTING", "PAVING", "PUMPING", "TRANSPORTING", "USERDEFINED", "NOTDEFINED"};

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
