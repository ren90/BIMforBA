/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcFaceSurface of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcfacesurface extends AEntity {
	public EIfcfacesurface getByIndex(int index) throws SdaiException {
		return (EIfcfacesurface)getByIndexEntity(index);
	}
	public EIfcfacesurface getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcfacesurface)getCurrentMemberObject(iter);
	}
}