/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcTelecomAddress of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfctelecomaddress extends AEntity {
	public EIfctelecomaddress getByIndex(int index) throws SdaiException {
		return (EIfctelecomaddress)getByIndexEntity(index);
	}
	public EIfctelecomaddress getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfctelecomaddress)getCurrentMemberObject(iter);
	}
}
