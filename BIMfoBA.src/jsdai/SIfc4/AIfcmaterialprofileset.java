/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcMaterialProfileSet of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcmaterialprofileset extends AEntity {
	public EIfcmaterialprofileset getByIndex(int index) throws SdaiException {
		return (EIfcmaterialprofileset)getByIndexEntity(index);
	}
	public EIfcmaterialprofileset getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcmaterialprofileset)getCurrentMemberObject(iter);
	}
}