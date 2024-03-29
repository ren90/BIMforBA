/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcHumidifierTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfchumidifiertypeenum {

	private static final int unset = 0;
	public static final int STEAMINJECTION = 1;	// STEAMINJECTION
	public static final int ADIABATICAIRWASHER = 2;	// ADIABATICAIRWASHER
	public static final int ADIABATICPAN = 3;	// ADIABATICPAN
	public static final int ADIABATICWETTEDELEMENT = 4;	// ADIABATICWETTEDELEMENT
	public static final int ADIABATICATOMIZING = 5;	// ADIABATICATOMIZING
	public static final int ADIABATICULTRASONIC = 6;	// ADIABATICULTRASONIC
	public static final int ADIABATICRIGIDMEDIA = 7;	// ADIABATICRIGIDMEDIA
	public static final int ADIABATICCOMPRESSEDAIRNOZZLE = 8;	// ADIABATICCOMPRESSEDAIRNOZZLE
	public static final int ASSISTEDELECTRIC = 9;	// ASSISTEDELECTRIC
	public static final int ASSISTEDNATURALGAS = 10;	// ASSISTEDNATURALGAS
	public static final int ASSISTEDPROPANE = 11;	// ASSISTEDPROPANE
	public static final int ASSISTEDBUTANE = 12;	// ASSISTEDBUTANE
	public static final int ASSISTEDSTEAM = 13;	// ASSISTEDSTEAM
	public static final int USERDEFINED = 14;	// USERDEFINED
	public static final int NOTDEFINED = 15;	// NOTDEFINED

	private static final int dim = 15;

	public static final String values[] = {"STEAMINJECTION", "ADIABATICAIRWASHER", "ADIABATICPAN", "ADIABATICWETTEDELEMENT", "ADIABATICATOMIZING", "ADIABATICULTRASONIC", "ADIABATICRIGIDMEDIA", "ADIABATICCOMPRESSEDAIRNOZZLE", "ASSISTEDELECTRIC", "ASSISTEDNATURALGAS", "ASSISTEDPROPANE", "ASSISTEDBUTANE", "ASSISTEDSTEAM", "USERDEFINED", "NOTDEFINED"};

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
