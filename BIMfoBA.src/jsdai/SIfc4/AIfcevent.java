/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcEvent of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcevent extends AEntity {
	public EIfcevent getByIndex(int index) throws SdaiException {
		return (EIfcevent)getByIndexEntity(index);
	}
	public EIfcevent getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcevent)getCurrentMemberObject(iter);
	}
}
