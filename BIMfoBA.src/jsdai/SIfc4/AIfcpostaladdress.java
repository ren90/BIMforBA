/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcPostalAddress of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcpostaladdress extends AEntity {
	public EIfcpostaladdress getByIndex(int index) throws SdaiException {
		return (EIfcpostaladdress)getByIndexEntity(index);
	}
	public EIfcpostaladdress getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcpostaladdress)getCurrentMemberObject(iter);
	}
}
