/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcMaterialProfile of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcmaterialprofile extends AEntity {
	public EIfcmaterialprofile getByIndex(int index) throws SdaiException {
		return (EIfcmaterialprofile)getByIndexEntity(index);
	}
	public EIfcmaterialprofile getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcmaterialprofile)getCurrentMemberObject(iter);
	}
}
