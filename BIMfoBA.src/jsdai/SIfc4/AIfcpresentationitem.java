/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcPresentationItem of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcpresentationitem extends AEntity {
	public EIfcpresentationitem getByIndex(int index) throws SdaiException {
		return (EIfcpresentationitem)getByIndexEntity(index);
	}
	public EIfcpresentationitem getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcpresentationitem)getCurrentMemberObject(iter);
	}
}
