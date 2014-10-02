/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcElementAssemblyTypeEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcelementassemblytypeenum {

	private static final int unset = 0;
	public static final int ACCESSORY_ASSEMBLY = 1;	// ACCESSORY_ASSEMBLY
	public static final int ARCH = 2;	// ARCH
	public static final int BEAM_GRID = 3;	// BEAM_GRID
	public static final int BRACED_FRAME = 4;	// BRACED_FRAME
	public static final int GIRDER = 5;	// GIRDER
	public static final int REINFORCEMENT_UNIT = 6;	// REINFORCEMENT_UNIT
	public static final int RIGID_FRAME = 7;	// RIGID_FRAME
	public static final int SLAB_FIELD = 8;	// SLAB_FIELD
	public static final int TRUSS = 9;	// TRUSS
	public static final int USERDEFINED = 10;	// USERDEFINED
	public static final int NOTDEFINED = 11;	// NOTDEFINED

	private static final int dim = 11;

	public static final String values[] = {"ACCESSORY_ASSEMBLY", "ARCH", "BEAM_GRID", "BRACED_FRAME", "GIRDER", "REINFORCEMENT_UNIT", "RIGID_FRAME", "SLAB_FIELD", "TRUSS", "USERDEFINED", "NOTDEFINED"};

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
