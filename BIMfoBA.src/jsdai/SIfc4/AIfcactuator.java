/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcActuator of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcactuator extends AEntity {
	public EIfcactuator getByIndex(int index) throws SdaiException {
		return (EIfcactuator)getByIndexEntity(index);
	}
	public EIfcactuator getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcactuator)getCurrentMemberObject(iter);
	}
}
