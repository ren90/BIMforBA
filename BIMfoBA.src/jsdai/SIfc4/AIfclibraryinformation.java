/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcLibraryInformation of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfclibraryinformation extends AEntity {
	public EIfclibraryinformation getByIndex(int index) throws SdaiException {
		return (EIfclibraryinformation)getByIndexEntity(index);
	}
	public EIfclibraryinformation getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfclibraryinformation)getCurrentMemberObject(iter);
	}
}