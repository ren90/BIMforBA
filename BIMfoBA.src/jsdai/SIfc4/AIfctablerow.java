/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcTableRow of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfctablerow extends AEntity {
	public EIfctablerow getByIndex(int index) throws SdaiException {
		return (EIfctablerow)getByIndexEntity(index);
	}
	public EIfctablerow getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfctablerow)getCurrentMemberObject(iter);
	}
}
