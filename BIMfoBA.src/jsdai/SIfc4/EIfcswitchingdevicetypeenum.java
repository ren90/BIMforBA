/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcSwitchingDeviceTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcswitchingdevicetypeenum {

	private static final int unset = 0;
	public static final int CONTACTOR = 1;	// CONTACTOR
	public static final int DIMMERSWITCH = 2;	// DIMMERSWITCH
	public static final int EMERGENCYSTOP = 3;	// EMERGENCYSTOP
	public static final int KEYPAD = 4;	// KEYPAD
	public static final int MOMENTARYSWITCH = 5;	// MOMENTARYSWITCH
	public static final int SELECTORSWITCH = 6;	// SELECTORSWITCH
	public static final int STARTER = 7;	// STARTER
	public static final int SWITCHDISCONNECTOR = 8;	// SWITCHDISCONNECTOR
	public static final int TOGGLESWITCH = 9;	// TOGGLESWITCH
	public static final int USERDEFINED = 10;	// USERDEFINED
	public static final int NOTDEFINED = 11;	// NOTDEFINED

	private static final int dim = 11;

	public static final String values[] = {"CONTACTOR", "DIMMERSWITCH", "EMERGENCYSTOP", "KEYPAD", "MOMENTARYSWITCH", "SELECTORSWITCH", "STARTER", "SWITCHDISCONNECTOR", "TOGGLESWITCH", "USERDEFINED", "NOTDEFINED"};

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
