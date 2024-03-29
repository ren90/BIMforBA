/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcUnitEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcunitenum {

	private static final int unset = 0;
	public static final int ABSORBEDDOSEUNIT = 1;	// ABSORBEDDOSEUNIT
	public static final int AMOUNTOFSUBSTANCEUNIT = 2;	// AMOUNTOFSUBSTANCEUNIT
	public static final int AREAUNIT = 3;	// AREAUNIT
	public static final int DOSEEQUIVALENTUNIT = 4;	// DOSEEQUIVALENTUNIT
	public static final int ELECTRICCAPACITANCEUNIT = 5;	// ELECTRICCAPACITANCEUNIT
	public static final int ELECTRICCHARGEUNIT = 6;	// ELECTRICCHARGEUNIT
	public static final int ELECTRICCONDUCTANCEUNIT = 7;	// ELECTRICCONDUCTANCEUNIT
	public static final int ELECTRICCURRENTUNIT = 8;	// ELECTRICCURRENTUNIT
	public static final int ELECTRICRESISTANCEUNIT = 9;	// ELECTRICRESISTANCEUNIT
	public static final int ELECTRICVOLTAGEUNIT = 10;	// ELECTRICVOLTAGEUNIT
	public static final int ENERGYUNIT = 11;	// ENERGYUNIT
	public static final int FORCEUNIT = 12;	// FORCEUNIT
	public static final int FREQUENCYUNIT = 13;	// FREQUENCYUNIT
	public static final int ILLUMINANCEUNIT = 14;	// ILLUMINANCEUNIT
	public static final int INDUCTANCEUNIT = 15;	// INDUCTANCEUNIT
	public static final int LENGTHUNIT = 16;	// LENGTHUNIT
	public static final int LUMINOUSFLUXUNIT = 17;	// LUMINOUSFLUXUNIT
	public static final int LUMINOUSINTENSITYUNIT = 18;	// LUMINOUSINTENSITYUNIT
	public static final int MAGNETICFLUXDENSITYUNIT = 19;	// MAGNETICFLUXDENSITYUNIT
	public static final int MAGNETICFLUXUNIT = 20;	// MAGNETICFLUXUNIT
	public static final int MASSUNIT = 21;	// MASSUNIT
	public static final int PLANEANGLEUNIT = 22;	// PLANEANGLEUNIT
	public static final int POWERUNIT = 23;	// POWERUNIT
	public static final int PRESSUREUNIT = 24;	// PRESSUREUNIT
	public static final int RADIOACTIVITYUNIT = 25;	// RADIOACTIVITYUNIT
	public static final int SOLIDANGLEUNIT = 26;	// SOLIDANGLEUNIT
	public static final int THERMODYNAMICTEMPERATUREUNIT = 27;	// THERMODYNAMICTEMPERATUREUNIT
	public static final int TIMEUNIT = 28;	// TIMEUNIT
	public static final int VOLUMEUNIT = 29;	// VOLUMEUNIT
	public static final int USERDEFINED = 30;	// USERDEFINED

	private static final int dim = 30;

	public static final String values[] = {"ABSORBEDDOSEUNIT", "AMOUNTOFSUBSTANCEUNIT", "AREAUNIT", "DOSEEQUIVALENTUNIT", "ELECTRICCAPACITANCEUNIT", "ELECTRICCHARGEUNIT", "ELECTRICCONDUCTANCEUNIT", "ELECTRICCURRENTUNIT", "ELECTRICRESISTANCEUNIT", "ELECTRICVOLTAGEUNIT", "ENERGYUNIT", "FORCEUNIT", "FREQUENCYUNIT", "ILLUMINANCEUNIT", "INDUCTANCEUNIT", "LENGTHUNIT", "LUMINOUSFLUXUNIT", "LUMINOUSINTENSITYUNIT", "MAGNETICFLUXDENSITYUNIT", "MAGNETICFLUXUNIT", "MASSUNIT", "PLANEANGLEUNIT", "POWERUNIT", "PRESSUREUNIT", "RADIOACTIVITYUNIT", "SOLIDANGLEUNIT", "THERMODYNAMICTEMPERATUREUNIT", "TIMEUNIT", "VOLUMEUNIT", "USERDEFINED"};

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
