/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcProperty of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcproperty extends AEntity {
	public EIfcproperty getByIndex(int index) throws SdaiException {
		return (EIfcproperty)getByIndexEntity(index);
	}
	public EIfcproperty getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcproperty)getCurrentMemberObject(iter);
	}
}
