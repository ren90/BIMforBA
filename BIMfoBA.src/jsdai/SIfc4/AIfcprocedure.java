/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcProcedure of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcprocedure extends AEntity {
	public EIfcprocedure getByIndex(int index) throws SdaiException {
		return (EIfcprocedure)getByIndexEntity(index);
	}
	public EIfcprocedure getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcprocedure)getCurrentMemberObject(iter);
	}
}