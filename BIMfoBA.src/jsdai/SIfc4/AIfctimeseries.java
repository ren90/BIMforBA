/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcTimeSeries of level 1

package jsdai.SIfc4;
import jsdai.lang.*;


public class AIfctimeseries extends AEntity {
	public EIfctimeseries getByIndex(int index) throws SdaiException {
		return (EIfctimeseries)getByIndexEntity(index);
	}
	public EIfctimeseries getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (EIfctimeseries)getCurrentMemberObject(iter);
	}
}
