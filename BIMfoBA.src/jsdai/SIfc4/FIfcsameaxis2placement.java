/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing EXPRESS function IfcSameAxis2Placement

package jsdai.SIfc4;
import jsdai.lang.*;


public class FIfcsameaxis2placement {
	
	// declaration of non-VAR parameters
	Value _nonvar__e_ap1;
	Value _nonvar__e_ap2;
	Value _nonvar__e_Epsilon;
	// end of declaration of non-VAR parameters


	public Value run(SdaiContext _context, Value _e_ap1, Value _e_ap2, Value _e_Epsilon) throws SdaiException {

		// initialization of non-VAR parameters
		_nonvar__e_ap1 = Value.alloc(jsdai.SIfc4.SIfc4._st_IfcAxis2Placement).set(_e_ap1);
		_nonvar__e_ap2 = Value.alloc(jsdai.SIfc4.SIfc4._st_IfcAxis2Placement).set(_e_ap2);
		_nonvar__e_Epsilon = Value.alloc(ExpressTypes.REAL_TYPE).set(_e_Epsilon);
		// end of initialization of non-VAR parameters






		if (true) return Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).AND(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).AND(_context, (new jsdai.SIfc4.FIfcsamedirection()).run(_context, _nonvar__e_ap1.getAttribute("P", _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null), _nonvar__e_ap2.getAttribute("P", _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null), _nonvar__e_Epsilon), (new jsdai.SIfc4.FIfcsamedirection()).run(_context, _nonvar__e_ap1.getAttribute("P", _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 2), null), _nonvar__e_ap2.getAttribute("P", _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 2), null), _nonvar__e_Epsilon)), (new jsdai.SIfc4.FIfcsamecartesianpoint()).run(_context, _nonvar__e_ap1.getAttribute("Location", _context), _nonvar__e_ap1.getAttribute("Location", _context), _nonvar__e_Epsilon))).check(_context, ExpressTypes.LOGICAL_TYPE);

		return Value.alloc(ExpressTypes.GENERIC_TYPE).unset(); // if return is missing in express - add printing of error message?
	}

}
