/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcFurnitureType of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcfurnituretype extends AEntity {
	public EIfcfurnituretype getByIndex(int index) throws SdaiException {
		return (EIfcfurnituretype)getByIndexEntity(index);
	}
	public EIfcfurnituretype getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcfurnituretype)getCurrentMemberObject(iter);
	}
}