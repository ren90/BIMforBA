/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcPropertySet of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcpropertyset extends AEntity {
	public EIfcpropertyset getByIndex(int index) throws SdaiException {
		return (EIfcpropertyset)getByIndexEntity(index);
	}
	public EIfcpropertyset getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcpropertyset)getCurrentMemberObject(iter);
	}
}
