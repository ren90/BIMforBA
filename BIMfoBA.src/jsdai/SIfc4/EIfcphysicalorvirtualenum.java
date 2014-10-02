/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcPhysicalOrVirtualEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcphysicalorvirtualenum {

	private static final int unset = 0;
	public static final int PHYSICAL = 1;	// PHYSICAL
	public static final int VIRTUAL = 2;	// VIRTUAL
	public static final int NOTDEFINED = 3;	// NOTDEFINED

	private static final int dim = 3;

	public static final String values[] = {"PHYSICAL", "VIRTUAL", "NOTDEFINED"};

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
