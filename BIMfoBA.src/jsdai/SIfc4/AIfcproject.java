/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcProject of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcproject extends AEntity {
	public EIfcproject getByIndex(int index) throws SdaiException {
		return (EIfcproject)getByIndexEntity(index);
	}
	public EIfcproject getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcproject)getCurrentMemberObject(iter);
	}
}