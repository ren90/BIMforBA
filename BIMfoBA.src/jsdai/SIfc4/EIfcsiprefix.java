/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcSIPrefix

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcsiprefix {

	private static final int unset = 0;
	public static final int EXA = 1;	// EXA
	public static final int PETA = 2;	// PETA
	public static final int TERA = 3;	// TERA
	public static final int GIGA = 4;	// GIGA
	public static final int MEGA = 5;	// MEGA
	public static final int KILO = 6;	// KILO
	public static final int HECTO = 7;	// HECTO
	public static final int DECA = 8;	// DECA
	public static final int DECI = 9;	// DECI
	public static final int CENTI = 10;	// CENTI
	public static final int MILLI = 11;	// MILLI
	public static final int MICRO = 12;	// MICRO
	public static final int NANO = 13;	// NANO
	public static final int PICO = 14;	// PICO
	public static final int FEMTO = 15;	// FEMTO
	public static final int ATTO = 16;	// ATTO

	private static final int dim = 16;

	public static final String values[] = {"EXA", "PETA", "TERA", "GIGA", "MEGA", "KILO", "HECTO", "DECA", "DECI", "CENTI", "MILLI", "MICRO", "NANO", "PICO", "FEMTO", "ATTO"};

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
