/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcStructuralConnection of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcstructuralconnection extends AEntity {
	public EIfcstructuralconnection getByIndex(int index) throws SdaiException {
		return (EIfcstructuralconnection)getByIndexEntity(index);
	}
	public EIfcstructuralconnection getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcstructuralconnection)getCurrentMemberObject(iter);
	}
}
