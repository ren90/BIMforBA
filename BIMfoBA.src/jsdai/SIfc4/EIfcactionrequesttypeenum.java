/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcActionRequestTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcactionrequesttypeenum {

	private static final int unset = 0;
	public static final int EMAIL = 1;	// EMAIL
	public static final int FAX = 2;	// FAX
	public static final int PHONE = 3;	// PHONE
	public static final int POST = 4;	// POST
	public static final int VERBAL = 5;	// VERBAL
	public static final int USERDEFINED = 6;	// USERDEFINED
	public static final int NOTDEFINED = 7;	// NOTDEFINED

	private static final int dim = 7;

	public static final String values[] = {"EMAIL", "FAX", "PHONE", "POST", "VERBAL", "USERDEFINED", "NOTDEFINED"};

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