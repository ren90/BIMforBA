/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcSimplePropertyTemplateTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcsimplepropertytemplatetypeenum {

	private static final int unset = 0;
	public static final int P_SINGLEVALUE = 1;	// P_SINGLEVALUE
	public static final int P_ENUMERATEDVALUE = 2;	// P_ENUMERATEDVALUE
	public static final int P_BOUNDEDVALUE = 3;	// P_BOUNDEDVALUE
	public static final int P_LISTVALUE = 4;	// P_LISTVALUE
	public static final int P_TABLEVALUE = 5;	// P_TABLEVALUE
	public static final int P_REFERENCEVALUE = 6;	// P_REFERENCEVALUE
	public static final int Q_LENGTH = 7;	// Q_LENGTH
	public static final int Q_AREA = 8;	// Q_AREA
	public static final int Q_VOLUME = 9;	// Q_VOLUME
	public static final int Q_COUNT = 10;	// Q_COUNT
	public static final int Q_WEIGHT = 11;	// Q_WEIGHT
	public static final int Q_TIME = 12;	// Q_TIME

	private static final int dim = 12;

	public static final String values[] = {"P_SINGLEVALUE", "P_ENUMERATEDVALUE", "P_BOUNDEDVALUE", "P_LISTVALUE", "P_TABLEVALUE", "P_REFERENCEVALUE", "Q_LENGTH", "Q_AREA", "Q_VOLUME", "Q_COUNT", "Q_WEIGHT", "Q_TIME"};

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