/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing aggregate of  IfcCartesianPoint of level 2

package jsdai.SIfc4;
import jsdai.lang.*;


public class AaIfccartesianpoint extends CAggregate {
	public boolean isMember(AIfccartesianpoint value) throws SdaiException {
		return isMember(value, null);
	}
	public AIfccartesianpoint getByIndex(int index) throws SdaiException {
		return (AIfccartesianpoint)getByIndexObject(index);
	}
	public AIfccartesianpoint createAggregateByIndex(int index) throws SdaiException {
		return (AIfccartesianpoint)createAggregateByIndex(index, null);
	}
	public AIfccartesianpoint addAggregateByIndex(int index) throws SdaiException {
		return (AIfccartesianpoint)addAggregateByIndex(index, null);
	}
	public AIfccartesianpoint createAggregateUnordered() throws SdaiException {
		return (AIfccartesianpoint)createAggregateUnordered(null);
	}
	public void removeUnordered(AIfccartesianpoint value) throws SdaiException {
		removeUnordered(value, null);
	}
	public AIfccartesianpoint getCurrentMember(SdaiIterator iter) throws SdaiException {
		return (AIfccartesianpoint)getCurrentMemberObject(iter);
	}
	public AIfccartesianpoint createAggregateAsCurrentMember(SdaiIterator iter) throws SdaiException {
		return (AIfccartesianpoint)createAggregateAsCurrentMember(iter, null);
	}
	public AIfccartesianpoint createAggregateBefore(SdaiIterator iter) throws SdaiException {
		return (AIfccartesianpoint)createAggregateBefore(iter, null);
	}
	public AIfccartesianpoint createAggregateAfter(SdaiIterator iter) throws SdaiException {
		return (AIfccartesianpoint)createAggregateAfter(iter, null);
	}
}
