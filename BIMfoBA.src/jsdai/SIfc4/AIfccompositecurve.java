/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcCompositeCurve of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfccompositecurve extends AEntity {
	public EIfccompositecurve getByIndex(int index) throws SdaiException {
		return (EIfccompositecurve)getByIndexEntity(index);
	}
	public EIfccompositecurve getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfccompositecurve)getCurrentMemberObject(iter);
	}
}