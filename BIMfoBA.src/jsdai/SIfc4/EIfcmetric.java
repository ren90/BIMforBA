/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java interface for entity IfcMetric

package jsdai.SIfc4;
import jsdai.lang.*;

public interface EIfcmetric extends EIfcconstraint {

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:Benchmark, base type: ENUMERATION
	public boolean testBenchmark(EIfcmetric type) throws SdaiException;
	public int getBenchmark(EIfcmetric type) throws SdaiException;
	public void setBenchmark(EIfcmetric type, int value) throws SdaiException;
	public void unsetBenchmark(EIfcmetric type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	/// methods for attribute:ValueSource, base type: STRING
	public boolean testValuesource(EIfcmetric type) throws SdaiException;
	public String getValuesource(EIfcmetric type) throws SdaiException;
	public void setValuesource(EIfcmetric type, String value) throws SdaiException;
	public void unsetValuesource(EIfcmetric type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// constants and methods for SELECT attribute: DataValue
	int sDatavalueIfcabsorbeddosemeasure = 2;
	int sDatavalueIfcaccelerationmeasure = 3;
	int sDatavalueIfcangularvelocitymeasure = 4;
	int sDatavalueIfcareadensitymeasure = 5;
	int sDatavalueIfccompoundplaneanglemeasure = 6;
	int sDatavalueIfccurvaturemeasure = 7;
	int sDatavalueIfcdoseequivalentmeasure = 8;
	int sDatavalueIfcdynamicviscositymeasure = 9;
	int sDatavalueIfcelectriccapacitancemeasure = 10;
	int sDatavalueIfcelectricchargemeasure = 11;
	int sDatavalueIfcelectricconductancemeasure = 12;
	int sDatavalueIfcelectricresistancemeasure = 13;
	int sDatavalueIfcelectricvoltagemeasure = 14;
	int sDatavalueIfcenergymeasure = 15;
	int sDatavalueIfcforcemeasure = 16;
	int sDatavalueIfcfrequencymeasure = 17;
	int sDatavalueIfcheatfluxdensitymeasure = 18;
	int sDatavalueIfcheatingvaluemeasure = 19;
	int sDatavalueIfcilluminancemeasure = 20;
	int sDatavalueIfcinductancemeasure = 21;
	int sDatavalueIfcintegercountratemeasure = 22;
	int sDatavalueIfcionconcentrationmeasure = 23;
	int sDatavalueIfcisothermalmoisturecapacitymeasure = 24;
	int sDatavalueIfckinematicviscositymeasure = 25;
	int sDatavalueIfclinearforcemeasure = 26;
	int sDatavalueIfclinearmomentmeasure = 27;
	int sDatavalueIfclinearstiffnessmeasure = 28;
	int sDatavalueIfclinearvelocitymeasure = 29;
	int sDatavalueIfcluminousfluxmeasure = 30;
	int sDatavalueIfcluminousintensitydistributionmeasure = 31;
	int sDatavalueIfcmagneticfluxdensitymeasure = 32;
	int sDatavalueIfcmagneticfluxmeasure = 33;
	int sDatavalueIfcmassdensitymeasure = 34;
	int sDatavalueIfcmassflowratemeasure = 35;
	int sDatavalueIfcmassperlengthmeasure = 36;
	int sDatavalueIfcmodulusofelasticitymeasure = 37;
	int sDatavalueIfcmodulusoflinearsubgradereactionmeasure = 38;
	int sDatavalueIfcmodulusofrotationalsubgradereactionmeasure = 39;
	int sDatavalueIfcmodulusofsubgradereactionmeasure = 40;
	int sDatavalueIfcmoisturediffusivitymeasure = 41;
	int sDatavalueIfcmolecularweightmeasure = 42;
	int sDatavalueIfcmomentofinertiameasure = 43;
	int sDatavalueIfcmonetarymeasure = 44;
	int sDatavalueIfcphmeasure = 45;
	int sDatavalueIfcplanarforcemeasure = 46;
	int sDatavalueIfcpowermeasure = 47;
	int sDatavalueIfcpressuremeasure = 48;
	int sDatavalueIfcradioactivitymeasure = 49;
	int sDatavalueIfcrotationalfrequencymeasure = 50;
	int sDatavalueIfcrotationalmassmeasure = 51;
	int sDatavalueIfcrotationalstiffnessmeasure = 52;
	int sDatavalueIfcsectionmodulusmeasure = 53;
	int sDatavalueIfcsectionalareaintegralmeasure = 54;
	int sDatavalueIfcshearmodulusmeasure = 55;
	int sDatavalueIfcsoundpowerlevelmeasure = 56;
	int sDatavalueIfcsoundpowermeasure = 57;
	int sDatavalueIfcsoundpressurelevelmeasure = 58;
	int sDatavalueIfcsoundpressuremeasure = 59;
	int sDatavalueIfcspecificheatcapacitymeasure = 60;
	int sDatavalueIfctemperaturegradientmeasure = 61;
	int sDatavalueIfctemperaturerateofchangemeasure = 62;
	int sDatavalueIfcthermaladmittancemeasure = 63;
	int sDatavalueIfcthermalconductivitymeasure = 64;
	int sDatavalueIfcthermalexpansioncoefficientmeasure = 65;
	int sDatavalueIfcthermalresistancemeasure = 66;
	int sDatavalueIfcthermaltransmittancemeasure = 67;
	int sDatavalueIfctorquemeasure = 68;
	int sDatavalueIfcvaporpermeabilitymeasure = 69;
	int sDatavalueIfcvolumetricflowratemeasure = 70;
	int sDatavalueIfcwarpingconstantmeasure = 71;
	int sDatavalueIfcwarpingmomentmeasure = 72;
	int sDatavalueIfcamountofsubstancemeasure = 73;
	int sDatavalueIfcareameasure = 74;
	int sDatavalueIfccomplexnumber = 75;
	int sDatavalueIfccontextdependentmeasure = 76;
	int sDatavalueIfccountmeasure = 77;
	int sDatavalueIfcdescriptivemeasure = 78;
	int sDatavalueIfcelectriccurrentmeasure = 79;
	int sDatavalueIfclengthmeasure = 80;
	int sDatavalueIfcluminousintensitymeasure = 81;
	int sDatavalueIfcmassmeasure = 82;
	int sDatavalueIfcnonnegativelengthmeasure = 83;
	int sDatavalueIfcnormalisedratiomeasure = 84;
	int sDatavalueIfcnumericmeasure = 85;
	int sDatavalueIfcparametervalue = 86;
	int sDatavalueIfcplaneanglemeasure = 87;
	int sDatavalueIfcpositivelengthmeasure = 88;
	int sDatavalueIfcpositiveplaneanglemeasure = 89;
	int sDatavalueIfcpositiveratiomeasure = 90;
	int sDatavalueIfcratiomeasure = 91;
	int sDatavalueIfcsolidanglemeasure = 92;
	int sDatavalueIfcthermodynamictemperaturemeasure = 93;
	int sDatavalueIfctimemeasure = 94;
	int sDatavalueIfcvolumemeasure = 95;
	int sDatavalueIfcboolean = 96;
	int sDatavalueIfcdate = 97;
	int sDatavalueIfcdatetime = 98;
	int sDatavalueIfcduration = 99;
	int sDatavalueIfcidentifier = 100;
	int sDatavalueIfcinteger = 101;
	int sDatavalueIfclabel = 102;
	int sDatavalueIfclogical = 103;
	int sDatavalueIfcreal = 104;
	int sDatavalueIfctext = 105;
	int sDatavalueIfctime = 106;
	int sDatavalueIfctimestamp = 107;

	int testDatavalue(EIfcmetric type) throws SdaiException;

	EEntity getDatavalue(EIfcmetric type) throws SdaiException; // case 1
	double getDatavalue(EIfcmetric type, EIfcabsorbeddosemeasure node1) throws SdaiException; // case 2
	double getDatavalue(EIfcmetric type, EIfcaccelerationmeasure node1) throws SdaiException; // case 3
	double getDatavalue(EIfcmetric type, EIfcangularvelocitymeasure node1) throws SdaiException; // case 4
	double getDatavalue(EIfcmetric type, EIfcareadensitymeasure node1) throws SdaiException; // case 5
	A_integer getDatavalue(EIfcmetric type, EIfccompoundplaneanglemeasure node1) throws SdaiException; // case 6
	double getDatavalue(EIfcmetric type, EIfccurvaturemeasure node1) throws SdaiException; // case 7
	double getDatavalue(EIfcmetric type, EIfcdoseequivalentmeasure node1) throws SdaiException; // case 8
	double getDatavalue(EIfcmetric type, EIfcdynamicviscositymeasure node1) throws SdaiException; // case 9
	double getDatavalue(EIfcmetric type, EIfcelectriccapacitancemeasure node1) throws SdaiException; // case 10
	double getDatavalue(EIfcmetric type, EIfcelectricchargemeasure node1) throws SdaiException; // case 11
	double getDatavalue(EIfcmetric type, EIfcelectricconductancemeasure node1) throws SdaiException; // case 12
	double getDatavalue(EIfcmetric type, EIfcelectricresistancemeasure node1) throws SdaiException; // case 13
	double getDatavalue(EIfcmetric type, EIfcelectricvoltagemeasure node1) throws SdaiException; // case 14
	double getDatavalue(EIfcmetric type, EIfcenergymeasure node1) throws SdaiException; // case 15
	double getDatavalue(EIfcmetric type, EIfcforcemeasure node1) throws SdaiException; // case 16
	double getDatavalue(EIfcmetric type, EIfcfrequencymeasure node1) throws SdaiException; // case 17
	double getDatavalue(EIfcmetric type, EIfcheatfluxdensitymeasure node1) throws SdaiException; // case 18
	double getDatavalue(EIfcmetric type, EIfcheatingvaluemeasure node1) throws SdaiException; // case 19
	double getDatavalue(EIfcmetric type, EIfcilluminancemeasure node1) throws SdaiException; // case 20
	double getDatavalue(EIfcmetric type, EIfcinductancemeasure node1) throws SdaiException; // case 21
	int getDatavalue(EIfcmetric type, EIfcintegercountratemeasure node1) throws SdaiException; // case 22
	double getDatavalue(EIfcmetric type, EIfcionconcentrationmeasure node1) throws SdaiException; // case 23
	double getDatavalue(EIfcmetric type, EIfcisothermalmoisturecapacitymeasure node1) throws SdaiException; // case 24
	double getDatavalue(EIfcmetric type, EIfckinematicviscositymeasure node1) throws SdaiException; // case 25
	double getDatavalue(EIfcmetric type, EIfclinearforcemeasure node1) throws SdaiException; // case 26
	double getDatavalue(EIfcmetric type, EIfclinearmomentmeasure node1) throws SdaiException; // case 27
	double getDatavalue(EIfcmetric type, EIfclinearstiffnessmeasure node1) throws SdaiException; // case 28
	double getDatavalue(EIfcmetric type, EIfclinearvelocitymeasure node1) throws SdaiException; // case 29
	double getDatavalue(EIfcmetric type, EIfcluminousfluxmeasure node1) throws SdaiException; // case 30
	double getDatavalue(EIfcmetric type, EIfcluminousintensitydistributionmeasure node1) throws SdaiException; // case 31
	double getDatavalue(EIfcmetric type, EIfcmagneticfluxdensitymeasure node1) throws SdaiException; // case 32
	double getDatavalue(EIfcmetric type, EIfcmagneticfluxmeasure node1) throws SdaiException; // case 33
	double getDatavalue(EIfcmetric type, EIfcmassdensitymeasure node1) throws SdaiException; // case 34
	double getDatavalue(EIfcmetric type, EIfcmassflowratemeasure node1) throws SdaiException; // case 35
	double getDatavalue(EIfcmetric type, EIfcmassperlengthmeasure node1) throws SdaiException; // case 36
	double getDatavalue(EIfcmetric type, EIfcmodulusofelasticitymeasure node1) throws SdaiException; // case 37
	double getDatavalue(EIfcmetric type, EIfcmodulusoflinearsubgradereactionmeasure node1) throws SdaiException; // case 38
	double getDatavalue(EIfcmetric type, EIfcmodulusofrotationalsubgradereactionmeasure node1) throws SdaiException; // case 39
	double getDatavalue(EIfcmetric type, EIfcmodulusofsubgradereactionmeasure node1) throws SdaiException; // case 40
	double getDatavalue(EIfcmetric type, EIfcmoisturediffusivitymeasure node1) throws SdaiException; // case 41
	double getDatavalue(EIfcmetric type, EIfcmolecularweightmeasure node1) throws SdaiException; // case 42
	double getDatavalue(EIfcmetric type, EIfcmomentofinertiameasure node1) throws SdaiException; // case 43
	double getDatavalue(EIfcmetric type, EIfcmonetarymeasure node1) throws SdaiException; // case 44
	double getDatavalue(EIfcmetric type, EIfcphmeasure node1) throws SdaiException; // case 45
	double getDatavalue(EIfcmetric type, EIfcplanarforcemeasure node1) throws SdaiException; // case 46
	double getDatavalue(EIfcmetric type, EIfcpowermeasure node1) throws SdaiException; // case 47
	double getDatavalue(EIfcmetric type, EIfcpressuremeasure node1) throws SdaiException; // case 48
	double getDatavalue(EIfcmetric type, EIfcradioactivitymeasure node1) throws SdaiException; // case 49
	double getDatavalue(EIfcmetric type, EIfcrotationalfrequencymeasure node1) throws SdaiException; // case 50
	double getDatavalue(EIfcmetric type, EIfcrotationalmassmeasure node1) throws SdaiException; // case 51
	double getDatavalue(EIfcmetric type, EIfcrotationalstiffnessmeasure node1) throws SdaiException; // case 52
	double getDatavalue(EIfcmetric type, EIfcsectionmodulusmeasure node1) throws SdaiException; // case 53
	double getDatavalue(EIfcmetric type, EIfcsectionalareaintegralmeasure node1) throws SdaiException; // case 54
	double getDatavalue(EIfcmetric type, EIfcshearmodulusmeasure node1) throws SdaiException; // case 55
	double getDatavalue(EIfcmetric type, EIfcsoundpowerlevelmeasure node1) throws SdaiException; // case 56
	double getDatavalue(EIfcmetric type, EIfcsoundpowermeasure node1) throws SdaiException; // case 57
	double getDatavalue(EIfcmetric type, EIfcsoundpressurelevelmeasure node1) throws SdaiException; // case 58
	double getDatavalue(EIfcmetric type, EIfcsoundpressuremeasure node1) throws SdaiException; // case 59
	double getDatavalue(EIfcmetric type, EIfcspecificheatcapacitymeasure node1) throws SdaiException; // case 60
	double getDatavalue(EIfcmetric type, EIfctemperaturegradientmeasure node1) throws SdaiException; // case 61
	double getDatavalue(EIfcmetric type, EIfctemperaturerateofchangemeasure node1) throws SdaiException; // case 62
	double getDatavalue(EIfcmetric type, EIfcthermaladmittancemeasure node1) throws SdaiException; // case 63
	double getDatavalue(EIfcmetric type, EIfcthermalconductivitymeasure node1) throws SdaiException; // case 64
	double getDatavalue(EIfcmetric type, EIfcthermalexpansioncoefficientmeasure node1) throws SdaiException; // case 65
	double getDatavalue(EIfcmetric type, EIfcthermalresistancemeasure node1) throws SdaiException; // case 66
	double getDatavalue(EIfcmetric type, EIfcthermaltransmittancemeasure node1) throws SdaiException; // case 67
	double getDatavalue(EIfcmetric type, EIfctorquemeasure node1) throws SdaiException; // case 68
	double getDatavalue(EIfcmetric type, EIfcvaporpermeabilitymeasure node1) throws SdaiException; // case 69
	double getDatavalue(EIfcmetric type, EIfcvolumetricflowratemeasure node1) throws SdaiException; // case 70
	double getDatavalue(EIfcmetric type, EIfcwarpingconstantmeasure node1) throws SdaiException; // case 71
	double getDatavalue(EIfcmetric type, EIfcwarpingmomentmeasure node1) throws SdaiException; // case 72
	double getDatavalue(EIfcmetric type, EIfcamountofsubstancemeasure node1) throws SdaiException; // case 73
	double getDatavalue(EIfcmetric type, EIfcareameasure node1) throws SdaiException; // case 74
	A_double getDatavalue(EIfcmetric type, EIfccomplexnumber node1) throws SdaiException; // case 75
	double getDatavalue(EIfcmetric type, EIfccontextdependentmeasure node1) throws SdaiException; // case 76
	double getDatavalue(EIfcmetric type, EIfccountmeasure node1) throws SdaiException; // case 77
	String getDatavalue(EIfcmetric type, EIfcdescriptivemeasure node1) throws SdaiException; // case 78
	double getDatavalue(EIfcmetric type, EIfcelectriccurrentmeasure node1) throws SdaiException; // case 79
	double getDatavalue(EIfcmetric type, EIfclengthmeasure node1) throws SdaiException; // case 80
	double getDatavalue(EIfcmetric type, EIfcluminousintensitymeasure node1) throws SdaiException; // case 81
	double getDatavalue(EIfcmetric type, EIfcmassmeasure node1) throws SdaiException; // case 82
	double getDatavalue(EIfcmetric type, EIfcnonnegativelengthmeasure node1) throws SdaiException; // case 83
	double getDatavalue(EIfcmetric type, EIfcnormalisedratiomeasure node1) throws SdaiException; // case 84
	double getDatavalue(EIfcmetric type, EIfcnumericmeasure node1) throws SdaiException; // case 85
	double getDatavalue(EIfcmetric type, EIfcparametervalue node1) throws SdaiException; // case 86
	double getDatavalue(EIfcmetric type, EIfcplaneanglemeasure node1) throws SdaiException; // case 87
	double getDatavalue(EIfcmetric type, EIfcpositivelengthmeasure node1) throws SdaiException; // case 88
	double getDatavalue(EIfcmetric type, EIfcpositiveplaneanglemeasure node1) throws SdaiException; // case 89
	double getDatavalue(EIfcmetric type, EIfcpositiveratiomeasure node1) throws SdaiException; // case 90
	double getDatavalue(EIfcmetric type, EIfcratiomeasure node1) throws SdaiException; // case 91
	double getDatavalue(EIfcmetric type, EIfcsolidanglemeasure node1) throws SdaiException; // case 92
	double getDatavalue(EIfcmetric type, EIfcthermodynamictemperaturemeasure node1) throws SdaiException; // case 93
	double getDatavalue(EIfcmetric type, EIfctimemeasure node1) throws SdaiException; // case 94
	double getDatavalue(EIfcmetric type, EIfcvolumemeasure node1) throws SdaiException; // case 95
	boolean getDatavalue(EIfcmetric type, EIfcboolean node1) throws SdaiException; // case 96
	String getDatavalue(EIfcmetric type, EIfcdate node1) throws SdaiException; // case 97
	String getDatavalue(EIfcmetric type, EIfcdatetime node1) throws SdaiException; // case 98
	String getDatavalue(EIfcmetric type, EIfcduration node1) throws SdaiException; // case 99
	String getDatavalue(EIfcmetric type, EIfcidentifier node1) throws SdaiException; // case 100
	int getDatavalue(EIfcmetric type, EIfcinteger node1) throws SdaiException; // case 101
	String getDatavalue(EIfcmetric type, EIfclabel node1) throws SdaiException; // case 102
	int getDatavalue(EIfcmetric type, EIfclogical node1) throws SdaiException; // case 103
	double getDatavalue(EIfcmetric type, EIfcreal node1) throws SdaiException; // case 104
	String getDatavalue(EIfcmetric type, EIfctext node1) throws SdaiException; // case 105
	String getDatavalue(EIfcmetric type, EIfctime node1) throws SdaiException; // case 106
	int getDatavalue(EIfcmetric type, EIfctimestamp node1) throws SdaiException; // case 107

	void setDatavalue(EIfcmetric type, EEntity value) throws SdaiException; // case 1
	void setDatavalue(EIfcmetric type, double value, EIfcabsorbeddosemeasure node1) throws SdaiException; // case 2
	void setDatavalue(EIfcmetric type, double value, EIfcaccelerationmeasure node1) throws SdaiException; // case 3
	void setDatavalue(EIfcmetric type, double value, EIfcangularvelocitymeasure node1) throws SdaiException; // case 4
	void setDatavalue(EIfcmetric type, double value, EIfcareadensitymeasure node1) throws SdaiException; // case 5
	A_integer createDatavalue(EIfcmetric type, EIfccompoundplaneanglemeasure node1) throws SdaiException; // case 6
	void setDatavalue(EIfcmetric type, double value, EIfccurvaturemeasure node1) throws SdaiException; // case 7
	void setDatavalue(EIfcmetric type, double value, EIfcdoseequivalentmeasure node1) throws SdaiException; // case 8
	void setDatavalue(EIfcmetric type, double value, EIfcdynamicviscositymeasure node1) throws SdaiException; // case 9
	void setDatavalue(EIfcmetric type, double value, EIfcelectriccapacitancemeasure node1) throws SdaiException; // case 10
	void setDatavalue(EIfcmetric type, double value, EIfcelectricchargemeasure node1) throws SdaiException; // case 11
	void setDatavalue(EIfcmetric type, double value, EIfcelectricconductancemeasure node1) throws SdaiException; // case 12
	void setDatavalue(EIfcmetric type, double value, EIfcelectricresistancemeasure node1) throws SdaiException; // case 13
	void setDatavalue(EIfcmetric type, double value, EIfcelectricvoltagemeasure node1) throws SdaiException; // case 14
	void setDatavalue(EIfcmetric type, double value, EIfcenergymeasure node1) throws SdaiException; // case 15
	void setDatavalue(EIfcmetric type, double value, EIfcforcemeasure node1) throws SdaiException; // case 16
	void setDatavalue(EIfcmetric type, double value, EIfcfrequencymeasure node1) throws SdaiException; // case 17
	void setDatavalue(EIfcmetric type, double value, EIfcheatfluxdensitymeasure node1) throws SdaiException; // case 18
	void setDatavalue(EIfcmetric type, double value, EIfcheatingvaluemeasure node1) throws SdaiException; // case 19
	void setDatavalue(EIfcmetric type, double value, EIfcilluminancemeasure node1) throws SdaiException; // case 20
	void setDatavalue(EIfcmetric type, double value, EIfcinductancemeasure node1) throws SdaiException; // case 21
	void setDatavalue(EIfcmetric type, int value, EIfcintegercountratemeasure node1) throws SdaiException; // case 22
	void setDatavalue(EIfcmetric type, double value, EIfcionconcentrationmeasure node1) throws SdaiException; // case 23
	void setDatavalue(EIfcmetric type, double value, EIfcisothermalmoisturecapacitymeasure node1) throws SdaiException; // case 24
	void setDatavalue(EIfcmetric type, double value, EIfckinematicviscositymeasure node1) throws SdaiException; // case 25
	void setDatavalue(EIfcmetric type, double value, EIfclinearforcemeasure node1) throws SdaiException; // case 26
	void setDatavalue(EIfcmetric type, double value, EIfclinearmomentmeasure node1) throws SdaiException; // case 27
	void setDatavalue(EIfcmetric type, double value, EIfclinearstiffnessmeasure node1) throws SdaiException; // case 28
	void setDatavalue(EIfcmetric type, double value, EIfclinearvelocitymeasure node1) throws SdaiException; // case 29
	void setDatavalue(EIfcmetric type, double value, EIfcluminousfluxmeasure node1) throws SdaiException; // case 30
	void setDatavalue(EIfcmetric type, double value, EIfcluminousintensitydistributionmeasure node1) throws SdaiException; // case 31
	void setDatavalue(EIfcmetric type, double value, EIfcmagneticfluxdensitymeasure node1) throws SdaiException; // case 32
	void setDatavalue(EIfcmetric type, double value, EIfcmagneticfluxmeasure node1) throws SdaiException; // case 33
	void setDatavalue(EIfcmetric type, double value, EIfcmassdensitymeasure node1) throws SdaiException; // case 34
	void setDatavalue(EIfcmetric type, double value, EIfcmassflowratemeasure node1) throws SdaiException; // case 35
	void setDatavalue(EIfcmetric type, double value, EIfcmassperlengthmeasure node1) throws SdaiException; // case 36
	void setDatavalue(EIfcmetric type, double value, EIfcmodulusofelasticitymeasure node1) throws SdaiException; // case 37
	void setDatavalue(EIfcmetric type, double value, EIfcmodulusoflinearsubgradereactionmeasure node1) throws SdaiException; // case 38
	void setDatavalue(EIfcmetric type, double value, EIfcmodulusofrotationalsubgradereactionmeasure node1) throws SdaiException; // case 39
	void setDatavalue(EIfcmetric type, double value, EIfcmodulusofsubgradereactionmeasure node1) throws SdaiException; // case 40
	void setDatavalue(EIfcmetric type, double value, EIfcmoisturediffusivitymeasure node1) throws SdaiException; // case 41
	void setDatavalue(EIfcmetric type, double value, EIfcmolecularweightmeasure node1) throws SdaiException; // case 42
	void setDatavalue(EIfcmetric type, double value, EIfcmomentofinertiameasure node1) throws SdaiException; // case 43
	void setDatavalue(EIfcmetric type, double value, EIfcmonetarymeasure node1) throws SdaiException; // case 44
	void setDatavalue(EIfcmetric type, double value, EIfcphmeasure node1) throws SdaiException; // case 45
	void setDatavalue(EIfcmetric type, double value, EIfcplanarforcemeasure node1) throws SdaiException; // case 46
	void setDatavalue(EIfcmetric type, double value, EIfcpowermeasure node1) throws SdaiException; // case 47
	void setDatavalue(EIfcmetric type, double value, EIfcpressuremeasure node1) throws SdaiException; // case 48
	void setDatavalue(EIfcmetric type, double value, EIfcradioactivitymeasure node1) throws SdaiException; // case 49
	void setDatavalue(EIfcmetric type, double value, EIfcrotationalfrequencymeasure node1) throws SdaiException; // case 50
	void setDatavalue(EIfcmetric type, double value, EIfcrotationalmassmeasure node1) throws SdaiException; // case 51
	void setDatavalue(EIfcmetric type, double value, EIfcrotationalstiffnessmeasure node1) throws SdaiException; // case 52
	void setDatavalue(EIfcmetric type, double value, EIfcsectionmodulusmeasure node1) throws SdaiException; // case 53
	void setDatavalue(EIfcmetric type, double value, EIfcsectionalareaintegralmeasure node1) throws SdaiException; // case 54
	void setDatavalue(EIfcmetric type, double value, EIfcshearmodulusmeasure node1) throws SdaiException; // case 55
	void setDatavalue(EIfcmetric type, double value, EIfcsoundpowerlevelmeasure node1) throws SdaiException; // case 56
	void setDatavalue(EIfcmetric type, double value, EIfcsoundpowermeasure node1) throws SdaiException; // case 57
	void setDatavalue(EIfcmetric type, double value, EIfcsoundpressurelevelmeasure node1) throws SdaiException; // case 58
	void setDatavalue(EIfcmetric type, double value, EIfcsoundpressuremeasure node1) throws SdaiException; // case 59
	void setDatavalue(EIfcmetric type, double value, EIfcspecificheatcapacitymeasure node1) throws SdaiException; // case 60
	void setDatavalue(EIfcmetric type, double value, EIfctemperaturegradientmeasure node1) throws SdaiException; // case 61
	void setDatavalue(EIfcmetric type, double value, EIfctemperaturerateofchangemeasure node1) throws SdaiException; // case 62
	void setDatavalue(EIfcmetric type, double value, EIfcthermaladmittancemeasure node1) throws SdaiException; // case 63
	void setDatavalue(EIfcmetric type, double value, EIfcthermalconductivitymeasure node1) throws SdaiException; // case 64
	void setDatavalue(EIfcmetric type, double value, EIfcthermalexpansioncoefficientmeasure node1) throws SdaiException; // case 65
	void setDatavalue(EIfcmetric type, double value, EIfcthermalresistancemeasure node1) throws SdaiException; // case 66
	void setDatavalue(EIfcmetric type, double value, EIfcthermaltransmittancemeasure node1) throws SdaiException; // case 67
	void setDatavalue(EIfcmetric type, double value, EIfctorquemeasure node1) throws SdaiException; // case 68
	void setDatavalue(EIfcmetric type, double value, EIfcvaporpermeabilitymeasure node1) throws SdaiException; // case 69
	void setDatavalue(EIfcmetric type, double value, EIfcvolumetricflowratemeasure node1) throws SdaiException; // case 70
	void setDatavalue(EIfcmetric type, double value, EIfcwarpingconstantmeasure node1) throws SdaiException; // case 71
	void setDatavalue(EIfcmetric type, double value, EIfcwarpingmomentmeasure node1) throws SdaiException; // case 72
	void setDatavalue(EIfcmetric type, double value, EIfcamountofsubstancemeasure node1) throws SdaiException; // case 73
	void setDatavalue(EIfcmetric type, double value, EIfcareameasure node1) throws SdaiException; // case 74
	A_double createDatavalue(EIfcmetric type, EIfccomplexnumber node1) throws SdaiException; // case 75
	void setDatavalue(EIfcmetric type, double value, EIfccontextdependentmeasure node1) throws SdaiException; // case 76
	void setDatavalue(EIfcmetric type, double value, EIfccountmeasure node1) throws SdaiException; // case 77
	void setDatavalue(EIfcmetric type, String value, EIfcdescriptivemeasure node1) throws SdaiException; // case 78
	void setDatavalue(EIfcmetric type, double value, EIfcelectriccurrentmeasure node1) throws SdaiException; // case 79
	void setDatavalue(EIfcmetric type, double value, EIfclengthmeasure node1) throws SdaiException; // case 80
	void setDatavalue(EIfcmetric type, double value, EIfcluminousintensitymeasure node1) throws SdaiException; // case 81
	void setDatavalue(EIfcmetric type, double value, EIfcmassmeasure node1) throws SdaiException; // case 82
	void setDatavalue(EIfcmetric type, double value, EIfcnonnegativelengthmeasure node1) throws SdaiException; // case 83
	void setDatavalue(EIfcmetric type, double value, EIfcnormalisedratiomeasure node1) throws SdaiException; // case 84
	void setDatavalue(EIfcmetric type, double value, EIfcnumericmeasure node1) throws SdaiException; // case 85
	void setDatavalue(EIfcmetric type, double value, EIfcparametervalue node1) throws SdaiException; // case 86
	void setDatavalue(EIfcmetric type, double value, EIfcplaneanglemeasure node1) throws SdaiException; // case 87
	void setDatavalue(EIfcmetric type, double value, EIfcpositivelengthmeasure node1) throws SdaiException; // case 88
	void setDatavalue(EIfcmetric type, double value, EIfcpositiveplaneanglemeasure node1) throws SdaiException; // case 89
	void setDatavalue(EIfcmetric type, double value, EIfcpositiveratiomeasure node1) throws SdaiException; // case 90
	void setDatavalue(EIfcmetric type, double value, EIfcratiomeasure node1) throws SdaiException; // case 91
	void setDatavalue(EIfcmetric type, double value, EIfcsolidanglemeasure node1) throws SdaiException; // case 92
	void setDatavalue(EIfcmetric type, double value, EIfcthermodynamictemperaturemeasure node1) throws SdaiException; // case 93
	void setDatavalue(EIfcmetric type, double value, EIfctimemeasure node1) throws SdaiException; // case 94
	void setDatavalue(EIfcmetric type, double value, EIfcvolumemeasure node1) throws SdaiException; // case 95
	void setDatavalue(EIfcmetric type, boolean value, EIfcboolean node1) throws SdaiException; // case 96
	void setDatavalue(EIfcmetric type, String value, EIfcdate node1) throws SdaiException; // case 97
	void setDatavalue(EIfcmetric type, String value, EIfcdatetime node1) throws SdaiException; // case 98
	void setDatavalue(EIfcmetric type, String value, EIfcduration node1) throws SdaiException; // case 99
	void setDatavalue(EIfcmetric type, String value, EIfcidentifier node1) throws SdaiException; // case 100
	void setDatavalue(EIfcmetric type, int value, EIfcinteger node1) throws SdaiException; // case 101
	void setDatavalue(EIfcmetric type, String value, EIfclabel node1) throws SdaiException; // case 102
	void setDatavalue(EIfcmetric type, int value, EIfclogical node1) throws SdaiException; // case 103
	void setDatavalue(EIfcmetric type, double value, EIfcreal node1) throws SdaiException; // case 104
	void setDatavalue(EIfcmetric type, String value, EIfctext node1) throws SdaiException; // case 105
	void setDatavalue(EIfcmetric type, String value, EIfctime node1) throws SdaiException; // case 106
	void setDatavalue(EIfcmetric type, int value, EIfctimestamp node1) throws SdaiException; // case 107

	void unsetDatavalue(EIfcmetric type) throws SdaiException;

	// generateExplicitAttributeMethodDeclarations: 1
	// attribute:ReferencePath, base type: entity IfcReference
	public boolean testReferencepath(EIfcmetric type) throws SdaiException;
	public EIfcreference getReferencepath(EIfcmetric type) throws SdaiException;
	public void setReferencepath(EIfcmetric type, EIfcreference value) throws SdaiException;
	public void unsetReferencepath(EIfcmetric type) throws SdaiException;

}
