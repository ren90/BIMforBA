/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcPort of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcport extends AEntity {
	public EIfcport getByIndex(int index) throws SdaiException {
		return (EIfcport)getByIndexEntity(index);
	}
	public EIfcport getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcport)getCurrentMemberObject(iter);
	}
}
