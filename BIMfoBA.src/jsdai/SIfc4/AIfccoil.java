/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcCoil of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfccoil extends AEntity {
	public EIfccoil getByIndex(int index) throws SdaiException {
		return (EIfccoil)getByIndexEntity(index);
	}
	public EIfccoil getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfccoil)getCurrentMemberObject(iter);
	}
}
