/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcLoop of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcloop extends AEntity {
	public EIfcloop getByIndex(int index) throws SdaiException {
		return (EIfcloop)getByIndexEntity(index);
	}
	public EIfcloop getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcloop)getCurrentMemberObject(iter);
	}
}