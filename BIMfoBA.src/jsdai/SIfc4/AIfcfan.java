/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcFan of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcfan extends AEntity {
	public EIfcfan getByIndex(int index) throws SdaiException {
		return (EIfcfan)getByIndexEntity(index);
	}
	public EIfcfan getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcfan)getCurrentMemberObject(iter);
	}
}