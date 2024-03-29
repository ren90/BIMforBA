/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcMemberTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcmembertypeenum {

	private static final int unset = 0;
	public static final int BRACE = 1;	// BRACE
	public static final int CHORD = 2;	// CHORD
	public static final int COLLAR = 3;	// COLLAR
	public static final int MEMBER = 4;	// MEMBER
	public static final int MULLION = 5;	// MULLION
	public static final int PLATE = 6;	// PLATE
	public static final int POST = 7;	// POST
	public static final int PURLIN = 8;	// PURLIN
	public static final int RAFTER = 9;	// RAFTER
	public static final int STRINGER = 10;	// STRINGER
	public static final int STRUT = 11;	// STRUT
	public static final int STUD = 12;	// STUD
	public static final int USERDEFINED = 13;	// USERDEFINED
	public static final int NOTDEFINED = 14;	// NOTDEFINED

	private static final int dim = 14;

	public static final String values[] = {"BRACE", "CHORD", "COLLAR", "MEMBER", "MULLION", "PLATE", "POST", "PURLIN", "RAFTER", "STRINGER", "STRUT", "STUD", "USERDEFINED", "NOTDEFINED"};

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
