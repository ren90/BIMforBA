/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcRelationship of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcrelationship extends AEntity {
	public EIfcrelationship getByIndex(int index) throws SdaiException {
		return (EIfcrelationship)getByIndexEntity(index);
	}
	public EIfcrelationship getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcrelationship)getCurrentMemberObject(iter);
	}
}
