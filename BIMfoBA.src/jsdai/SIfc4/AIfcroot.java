/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcRoot of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcroot extends AEntity {
	public EIfcroot getByIndex(int index) throws SdaiException {
		return (EIfcroot)getByIndexEntity(index);
	}
	public EIfcroot getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcroot)getCurrentMemberObject(iter);
	}
}
