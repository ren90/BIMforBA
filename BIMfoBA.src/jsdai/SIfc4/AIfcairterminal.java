/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcAirTerminal of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcairterminal extends AEntity {
	public EIfcairterminal getByIndex(int index) throws SdaiException {
		return (EIfcairterminal)getByIndexEntity(index);
	}
	public EIfcairterminal getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcairterminal)getCurrentMemberObject(iter);
	}
}