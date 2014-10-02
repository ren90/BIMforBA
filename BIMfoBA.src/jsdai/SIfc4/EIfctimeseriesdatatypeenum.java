/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcTimeSeriesDataTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfctimeseriesdatatypeenum {

	private static final int unset = 0;
	public static final int CONTINUOUS = 1;	// CONTINUOUS
	public static final int DISCRETE = 2;	// DISCRETE
	public static final int DISCRETEBINARY = 3;	// DISCRETEBINARY
	public static final int PIECEWISEBINARY = 4;	// PIECEWISEBINARY
	public static final int PIECEWISECONSTANT = 5;	// PIECEWISECONSTANT
	public static final int PIECEWISECONTINUOUS = 6;	// PIECEWISECONTINUOUS
	public static final int NOTDEFINED = 7;	// NOTDEFINED

	private static final int dim = 7;

	public static final String values[] = {"CONTINUOUS", "DISCRETE", "DISCRETEBINARY", "PIECEWISEBINARY", "PIECEWISECONSTANT", "PIECEWISECONTINUOUS", "NOTDEFINED"};

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