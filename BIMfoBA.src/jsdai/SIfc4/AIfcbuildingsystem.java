/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcBuildingSystem of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcbuildingsystem extends AEntity {
	public EIfcbuildingsystem getByIndex(int index) throws SdaiException {
		return (EIfcbuildingsystem)getByIndexEntity(index);
	}
	public EIfcbuildingsystem getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcbuildingsystem)getCurrentMemberObject(iter);
	}
}
