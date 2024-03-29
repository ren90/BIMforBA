/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing enumeration IfcDerivedUnitEnum

package jsdai.SIfc4;
import jsdai.lang.*;

public class EIfcderivedunitenum {

	private static final int unset = 0;
	public static final int ANGULARVELOCITYUNIT = 1;	// ANGULARVELOCITYUNIT
	public static final int AREADENSITYUNIT = 2;	// AREADENSITYUNIT
	public static final int COMPOUNDPLANEANGLEUNIT = 3;	// COMPOUNDPLANEANGLEUNIT
	public static final int DYNAMICVISCOSITYUNIT = 4;	// DYNAMICVISCOSITYUNIT
	public static final int HEATFLUXDENSITYUNIT = 5;	// HEATFLUXDENSITYUNIT
	public static final int INTEGERCOUNTRATEUNIT = 6;	// INTEGERCOUNTRATEUNIT
	public static final int ISOTHERMALMOISTURECAPACITYUNIT = 7;	// ISOTHERMALMOISTURECAPACITYUNIT
	public static final int KINEMATICVISCOSITYUNIT = 8;	// KINEMATICVISCOSITYUNIT
	public static final int LINEARVELOCITYUNIT = 9;	// LINEARVELOCITYUNIT
	public static final int MASSDENSITYUNIT = 10;	// MASSDENSITYUNIT
	public static final int MASSFLOWRATEUNIT = 11;	// MASSFLOWRATEUNIT
	public static final int MOISTUREDIFFUSIVITYUNIT = 12;	// MOISTUREDIFFUSIVITYUNIT
	public static final int MOLECULARWEIGHTUNIT = 13;	// MOLECULARWEIGHTUNIT
	public static final int SPECIFICHEATCAPACITYUNIT = 14;	// SPECIFICHEATCAPACITYUNIT
	public static final int THERMALADMITTANCEUNIT = 15;	// THERMALADMITTANCEUNIT
	public static final int THERMALCONDUCTANCEUNIT = 16;	// THERMALCONDUCTANCEUNIT
	public static final int THERMALRESISTANCEUNIT = 17;	// THERMALRESISTANCEUNIT
	public static final int THERMALTRANSMITTANCEUNIT = 18;	// THERMALTRANSMITTANCEUNIT
	public static final int VAPORPERMEABILITYUNIT = 19;	// VAPORPERMEABILITYUNIT
	public static final int VOLUMETRICFLOWRATEUNIT = 20;	// VOLUMETRICFLOWRATEUNIT
	public static final int ROTATIONALFREQUENCYUNIT = 21;	// ROTATIONALFREQUENCYUNIT
	public static final int TORQUEUNIT = 22;	// TORQUEUNIT
	public static final int MOMENTOFINERTIAUNIT = 23;	// MOMENTOFINERTIAUNIT
	public static final int LINEARMOMENTUNIT = 24;	// LINEARMOMENTUNIT
	public static final int LINEARFORCEUNIT = 25;	// LINEARFORCEUNIT
	public static final int PLANARFORCEUNIT = 26;	// PLANARFORCEUNIT
	public static final int MODULUSOFELASTICITYUNIT = 27;	// MODULUSOFELASTICITYUNIT
	public static final int SHEARMODULUSUNIT = 28;	// SHEARMODULUSUNIT
	public static final int LINEARSTIFFNESSUNIT = 29;	// LINEARSTIFFNESSUNIT
	public static final int ROTATIONALSTIFFNESSUNIT = 30;	// ROTATIONALSTIFFNESSUNIT
	public static final int MODULUSOFSUBGRADEREACTIONUNIT = 31;	// MODULUSOFSUBGRADEREACTIONUNIT
	public static final int ACCELERATIONUNIT = 32;	// ACCELERATIONUNIT
	public static final int CURVATUREUNIT = 33;	// CURVATUREUNIT
	public static final int HEATINGVALUEUNIT = 34;	// HEATINGVALUEUNIT
	public static final int IONCONCENTRATIONUNIT = 35;	// IONCONCENTRATIONUNIT
	public static final int LUMINOUSINTENSITYDISTRIBUTIONUNIT = 36;	// LUMINOUSINTENSITYDISTRIBUTIONUNIT
	public static final int MASSPERLENGTHUNIT = 37;	// MASSPERLENGTHUNIT
	public static final int MODULUSOFLINEARSUBGRADEREACTIONUNIT = 38;	// MODULUSOFLINEARSUBGRADEREACTIONUNIT
	public static final int MODULUSOFROTATIONALSUBGRADEREACTIONUNIT = 39;	// MODULUSOFROTATIONALSUBGRADEREACTIONUNIT
	public static final int PHUNIT = 40;	// PHUNIT
	public static final int ROTATIONALMASSUNIT = 41;	// ROTATIONALMASSUNIT
	public static final int SECTIONAREAINTEGRALUNIT = 42;	// SECTIONAREAINTEGRALUNIT
	public static final int SECTIONMODULUSUNIT = 43;	// SECTIONMODULUSUNIT
	public static final int SOUNDPOWERLEVELUNIT = 44;	// SOUNDPOWERLEVELUNIT
	public static final int SOUNDPOWERUNIT = 45;	// SOUNDPOWERUNIT
	public static final int SOUNDPRESSURELEVELUNIT = 46;	// SOUNDPRESSURELEVELUNIT
	public static final int SOUNDPRESSUREUNIT = 47;	// SOUNDPRESSUREUNIT
	public static final int TEMPERATUREGRADIENTUNIT = 48;	// TEMPERATUREGRADIENTUNIT
	public static final int TEMPERATURERATEOFCHANGEUNIT = 49;	// TEMPERATURERATEOFCHANGEUNIT
	public static final int THERMALEXPANSIONCOEFFICIENTUNIT = 50;	// THERMALEXPANSIONCOEFFICIENTUNIT
	public static final int WARPINGCONSTANTUNIT = 51;	// WARPINGCONSTANTUNIT
	public static final int WARPINGMOMENTUNIT = 52;	// WARPINGMOMENTUNIT
	public static final int USERDEFINED = 53;	// USERDEFINED

	private static final int dim = 53;

	public static final String values[] = {"ANGULARVELOCITYUNIT", "AREADENSITYUNIT", "COMPOUNDPLANEANGLEUNIT", "DYNAMICVISCOSITYUNIT", "HEATFLUXDENSITYUNIT", "INTEGERCOUNTRATEUNIT", "ISOTHERMALMOISTURECAPACITYUNIT", "KINEMATICVISCOSITYUNIT", "LINEARVELOCITYUNIT", "MASSDENSITYUNIT", "MASSFLOWRATEUNIT", "MOISTUREDIFFUSIVITYUNIT", "MOLECULARWEIGHTUNIT", "SPECIFICHEATCAPACITYUNIT", "THERMALADMITTANCEUNIT", "THERMALCONDUCTANCEUNIT", "THERMALRESISTANCEUNIT", "THERMALTRANSMITTANCEUNIT", "VAPORPERMEABILITYUNIT", "VOLUMETRICFLOWRATEUNIT", "ROTATIONALFREQUENCYUNIT", "TORQUEUNIT", "MOMENTOFINERTIAUNIT", "LINEARMOMENTUNIT", "LINEARFORCEUNIT", "PLANARFORCEUNIT", "MODULUSOFELASTICITYUNIT", "SHEARMODULUSUNIT", "LINEARSTIFFNESSUNIT", "ROTATIONALSTIFFNESSUNIT", "MODULUSOFSUBGRADEREACTIONUNIT", "ACCELERATIONUNIT", "CURVATUREUNIT", "HEATINGVALUEUNIT", "IONCONCENTRATIONUNIT", "LUMINOUSINTENSITYDISTRIBUTIONUNIT", "MASSPERLENGTHUNIT", "MODULUSOFLINEARSUBGRADEREACTIONUNIT", "MODULUSOFROTATIONALSUBGRADEREACTIONUNIT", "PHUNIT", "ROTATIONALMASSUNIT", "SECTIONAREAINTEGRALUNIT", "SECTIONMODULUSUNIT", "SOUNDPOWERLEVELUNIT", "SOUNDPOWERUNIT", "SOUNDPRESSURELEVELUNIT", "SOUNDPRESSUREUNIT", "TEMPERATUREGRADIENTUNIT", "TEMPERATURERATEOFCHANGEUNIT", "THERMALEXPANSIONCOEFFICIENTUNIT", "WARPINGCONSTANTUNIT", "WARPINGMOMENTUNIT", "USERDEFINED"};

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
