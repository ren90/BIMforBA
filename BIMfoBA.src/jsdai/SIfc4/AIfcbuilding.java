/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcBuilding of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcbuilding extends AEntity {
	public EIfcbuilding getByIndex(int index) throws SdaiException {
		return (EIfcbuilding)getByIndexEntity(index);
	}
	public EIfcbuilding getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcbuilding)getCurrentMemberObject(iter);
	}
}
