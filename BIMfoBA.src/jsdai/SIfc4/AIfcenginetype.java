/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcEngineType of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcenginetype extends AEntity {
	public EIfcenginetype getByIndex(int index) throws SdaiException {
		return (EIfcenginetype)getByIndexEntity(index);
	}
	public EIfcenginetype getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcenginetype)getCurrentMemberObject(iter);
	}
}