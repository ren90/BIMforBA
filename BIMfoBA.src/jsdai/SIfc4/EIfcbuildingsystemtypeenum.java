/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcBuildingSystemTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcbuildingsystemtypeenum {

	private static final int unset = 0;
	public static final int FENESTRATION = 1;	// FENESTRATION
	public static final int FOUNDATION = 2;	// FOUNDATION
	public static final int LOADBEARING = 3;	// LOADBEARING
	public static final int OUTERSHELL = 4;	// OUTERSHELL
	public static final int SHADING = 5;	// SHADING
	public static final int TRANSPORT = 6;	// TRANSPORT
	public static final int USERDEFINED = 7;	// USERDEFINED
	public static final int NOTDEFINED = 8;	// NOTDEFINED

	private static final int dim = 8;

	public static final String values[] = {"FENESTRATION", "FOUNDATION", "LOADBEARING", "OUTERSHELL", "SHADING", "TRANSPORT", "USERDEFINED", "NOTDEFINED"};

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
