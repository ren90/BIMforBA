/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcPerformanceHistory of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfcperformancehistory extends AEntity {
	public EIfcperformancehistory getByIndex(int index) throws SdaiException {
		return (EIfcperformancehistory)getByIndexEntity(index);
	}
	public EIfcperformancehistory getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfcperformancehistory)getCurrentMemberObject(iter);
	}
}