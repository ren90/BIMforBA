/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcPropertyTemplate of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcpropertytemplate extends AEntity {
	public EIfcpropertytemplate getByIndex(int index) throws SdaiException {
		return (EIfcpropertytemplate)getByIndexEntity(index);
	}
	public EIfcpropertytemplate getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcpropertytemplate)getCurrentMemberObject(iter);
	}
}