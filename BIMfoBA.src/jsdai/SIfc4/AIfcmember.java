/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcMember of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcmember extends AEntity {
	public EIfcmember getByIndex(int index) throws SdaiException {
		return (EIfcmember)getByIndexEntity(index);
	}
	public EIfcmember getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcmember)getCurrentMemberObject(iter);
	}
}