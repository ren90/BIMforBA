/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcPcurve of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcpcurve extends AEntity {
	public EIfcpcurve getByIndex(int index) throws SdaiException {
		return (EIfcpcurve)getByIndexEntity(index);
	}
	public EIfcpcurve getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcpcurve)getCurrentMemberObject(iter);
	}
}
