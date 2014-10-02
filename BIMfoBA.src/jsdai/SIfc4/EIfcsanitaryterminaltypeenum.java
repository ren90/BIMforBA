/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcSanitaryTerminalTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcsanitaryterminaltypeenum {

	private static final int unset = 0;
	public static final int BATH = 1;	// BATH
	public static final int BIDET = 2;	// BIDET
	public static final int CISTERN = 3;	// CISTERN
	public static final int SHOWER = 4;	// SHOWER
	public static final int SINK = 5;	// SINK
	public static final int SANITARYFOUNTAIN = 6;	// SANITARYFOUNTAIN
	public static final int TOILETPAN = 7;	// TOILETPAN
	public static final int URINAL = 8;	// URINAL
	public static final int WASHHANDBASIN = 9;	// WASHHANDBASIN
	public static final int WCSEAT = 10;	// WCSEAT
	public static final int USERDEFINED = 11;	// USERDEFINED
	public static final int NOTDEFINED = 12;	// NOTDEFINED

	private static final int dim = 12;

	public static final String values[] = {"BATH", "BIDET", "CISTERN", "SHOWER", "SINK", "SANITARYFOUNTAIN", "TOILETPAN", "URINAL", "WASHHANDBASIN", "WCSEAT", "USERDEFINED", "NOTDEFINED"};

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
