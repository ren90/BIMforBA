/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcElementAssembly of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcelementassembly extends AEntity {
	public EIfcelementassembly getByIndex(int index) throws SdaiException {
		return (EIfcelementassembly)getByIndexEntity(index);
	}
	public EIfcelementassembly getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcelementassembly)getCurrentMemberObject(iter);
	}
}