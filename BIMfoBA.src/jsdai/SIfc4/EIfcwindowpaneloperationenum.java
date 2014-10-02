/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcWindowPanelOperationEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcwindowpaneloperationenum {

	private static final int unset = 0;
	public static final int SIDEHUNGRIGHTHAND = 1;	// SIDEHUNGRIGHTHAND
	public static final int SIDEHUNGLEFTHAND = 2;	// SIDEHUNGLEFTHAND
	public static final int TILTANDTURNRIGHTHAND = 3;	// TILTANDTURNRIGHTHAND
	public static final int TILTANDTURNLEFTHAND = 4;	// TILTANDTURNLEFTHAND
	public static final int TOPHUNG = 5;	// TOPHUNG
	public static final int BOTTOMHUNG = 6;	// BOTTOMHUNG
	public static final int PIVOTHORIZONTAL = 7;	// PIVOTHORIZONTAL
	public static final int PIVOTVERTICAL = 8;	// PIVOTVERTICAL
	public static final int SLIDINGHORIZONTAL = 9;	// SLIDINGHORIZONTAL
	public static final int SLIDINGVERTICAL = 10;	// SLIDINGVERTICAL
	public static final int REMOVABLECASEMENT = 11;	// REMOVABLECASEMENT
	public static final int FIXEDCASEMENT = 12;	// FIXEDCASEMENT
	public static final int OTHEROPERATION = 13;	// OTHEROPERATION
	public static final int NOTDEFINED = 14;	// NOTDEFINED

	private static final int dim = 14;

	public static final String values[] = {"SIDEHUNGRIGHTHAND", "SIDEHUNGLEFTHAND", "TILTANDTURNRIGHTHAND", "TILTANDTURNLEFTHAND", "TOPHUNG", "BOTTOMHUNG", "PIVOTHORIZONTAL", "PIVOTVERTICAL", "SLIDINGHORIZONTAL", "SLIDINGVERTICAL", "REMOVABLECASEMENT", "FIXEDCASEMENT", "OTHEROPERATION", "NOTDEFINED"};

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