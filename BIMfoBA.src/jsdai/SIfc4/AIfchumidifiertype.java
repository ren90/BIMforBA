/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcHumidifierType of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfchumidifiertype extends AEntity {
	public EIfchumidifiertype getByIndex(int index) throws SdaiException {
		return (EIfchumidifiertype)getByIndexEntity(index);
	}
	public EIfchumidifiertype getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfchumidifiertype)getCurrentMemberObject(iter);
	}
}