/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcStructuralCurveActivityTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcstructuralcurveactivitytypeenum {

	private static final int unset = 0;
	public static final int CONST = 1;	// CONST
	public static final int LINEAR = 2;	// LINEAR
	public static final int POLYGONAL = 3;	// POLYGONAL
	public static final int EQUIDISTANT = 4;	// EQUIDISTANT
	public static final int SINUS = 5;	// SINUS
	public static final int PARABOLA = 6;	// PARABOLA
	public static final int DISCRETE = 7;	// DISCRETE
	public static final int USERDEFINED = 8;	// USERDEFINED
	public static final int NOTDEFINED = 9;	// NOTDEFINED

	private static final int dim = 9;

	public static final String values[] = {"CONST", "LINEAR", "POLYGONAL", "EQUIDISTANT", "SINUS", "PARABOLA", "DISCRETE", "USERDEFINED", "NOTDEFINED"};

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