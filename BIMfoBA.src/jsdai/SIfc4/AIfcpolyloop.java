/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcPolyLoop of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcpolyloop extends AEntity {
	public EIfcpolyloop getByIndex(int index) throws SdaiException {
		return (EIfcpolyloop)getByIndexEntity(index);
	}
	public EIfcpolyloop getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcpolyloop)getCurrentMemberObject(iter);
	}
}