/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcGeometricSet of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcgeometricset extends AEntity {
	public EIfcgeometricset getByIndex(int index) throws SdaiException {
		return (EIfcgeometricset)getByIndexEntity(index);
	}
	public EIfcgeometricset getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcgeometricset)getCurrentMemberObject(iter);
	}
}
