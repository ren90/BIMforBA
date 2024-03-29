/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcAirToAirHeatRecoveryTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcairtoairheatrecoverytypeenum {

	private static final int unset = 0;
	public static final int FIXEDPLATECOUNTERFLOWEXCHANGER = 1;	// FIXEDPLATECOUNTERFLOWEXCHANGER
	public static final int FIXEDPLATECROSSFLOWEXCHANGER = 2;	// FIXEDPLATECROSSFLOWEXCHANGER
	public static final int FIXEDPLATEPARALLELFLOWEXCHANGER = 3;	// FIXEDPLATEPARALLELFLOWEXCHANGER
	public static final int ROTARYWHEEL = 4;	// ROTARYWHEEL
	public static final int RUNAROUNDCOILLOOP = 5;	// RUNAROUNDCOILLOOP
	public static final int HEATPIPE = 6;	// HEATPIPE
	public static final int TWINTOWERENTHALPYRECOVERYLOOPS = 7;	// TWINTOWERENTHALPYRECOVERYLOOPS
	public static final int THERMOSIPHONSEALEDTUBEHEATEXCHANGERS = 8;	// THERMOSIPHONSEALEDTUBEHEATEXCHANGERS
	public static final int THERMOSIPHONCOILTYPEHEATEXCHANGERS = 9;	// THERMOSIPHONCOILTYPEHEATEXCHANGERS
	public static final int USERDEFINED = 10;	// USERDEFINED
	public static final int NOTDEFINED = 11;	// NOTDEFINED

	private static final int dim = 11;

	public static final String values[] = {"FIXEDPLATECOUNTERFLOWEXCHANGER", "FIXEDPLATECROSSFLOWEXCHANGER", "FIXEDPLATEPARALLELFLOWEXCHANGER", "ROTARYWHEEL", "RUNAROUNDCOILLOOP", "HEATPIPE", "TWINTOWERENTHALPYRECOVERYLOOPS", "THERMOSIPHONSEALEDTUBEHEATEXCHANGERS", "THERMOSIPHONCOILTYPEHEATEXCHANGERS", "USERDEFINED", "NOTDEFINED"};

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
