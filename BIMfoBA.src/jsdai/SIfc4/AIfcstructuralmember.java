/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcStructuralMember of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcstructuralmember extends AEntity {
	public EIfcstructuralmember getByIndex(int index) throws SdaiException {
		return (EIfcstructuralmember)getByIndexEntity(index);
	}
	public EIfcstructuralmember getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcstructuralmember)getCurrentMemberObject(iter);
	}
}