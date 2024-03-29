/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing EXPRESS function IfcSameDirection

package jsdai.SIfc4;
import jsdai.lang.*;










public class FIfcsamedirection {
	
	// declaration of non-VAR parameters
	Value _nonvar__e_dir1;
	Value _nonvar__e_dir2;
	Value _nonvar__e_Epsilon;
	// end of declaration of non-VAR parameters

	// declaration of local variables
	Value _e_dir1x;
	Value _e_dir1y;
	Value _e_dir1z;
	Value _e_dir2x;
	Value _e_dir2y;
	Value _e_dir2z;
	// end of declaration of local variables


	public Value run(SdaiContext _context, Value _e_dir1, Value _e_dir2, Value _e_Epsilon) throws SdaiException {

		// initialization of non-VAR parameters
		_nonvar__e_dir1 = Value.alloc(jsdai.SIfc4.CIfcdirection.definition).set(_e_dir1);
		_nonvar__e_dir2 = Value.alloc(jsdai.SIfc4.CIfcdirection.definition).set(_e_dir2);
		_nonvar__e_Epsilon = Value.alloc(ExpressTypes.REAL_TYPE).set(_e_Epsilon);
		// end of initialization of non-VAR parameters

		// initialization of local variables
		_e_dir1x = Value.alloc(ExpressTypes.REAL_TYPE).set(_context, _nonvar__e_dir1.getAttribute(jsdai.SIfc4.CIfcdirection.attributeDirectionratios(null), _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null));
		_e_dir1y = Value.alloc(ExpressTypes.REAL_TYPE).set(_context, _nonvar__e_dir1.getAttribute(jsdai.SIfc4.CIfcdirection.attributeDirectionratios(null), _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 2), null));
		_e_dir1z = Value.alloc(ExpressTypes.REAL_TYPE).set(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 0));
		_e_dir2x = Value.alloc(ExpressTypes.REAL_TYPE).set(_context, _nonvar__e_dir2.getAttribute(jsdai.SIfc4.CIfcdirection.attributeDirectionratios(null), _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null));
		_e_dir2y = Value.alloc(ExpressTypes.REAL_TYPE).set(_context, _nonvar__e_dir2.getAttribute(jsdai.SIfc4.CIfcdirection.attributeDirectionratios(null), _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 2), null));
		_e_dir2z = Value.alloc(ExpressTypes.REAL_TYPE).set(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 0));
		// end of initialization of local variables





																																		if (Value.alloc(ExpressTypes.LOGICAL_TYPE).greater(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(_nonvar__e_dir1.getAttribute(jsdai.SIfc4.CIfcdirection.attributeDirectionratios(null), _context)), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 2)).getLogical() == 2) {																																		
																																			_e_dir1z.set(_context, _nonvar__e_dir1.getAttribute(jsdai.SIfc4.CIfcdirection.attributeDirectionratios(null), _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 3), null));
																																		}



																																		if (Value.alloc(ExpressTypes.LOGICAL_TYPE).greater(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(_nonvar__e_dir2.getAttribute(jsdai.SIfc4.CIfcdirection.attributeDirectionratios(null), _context)), Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 2)).getLogical() == 2) {																																		
																																			_e_dir2z.set(_context, _nonvar__e_dir2.getAttribute(jsdai.SIfc4.CIfcdirection.attributeDirectionratios(null), _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 3), null));
																																		}




		if (true) return Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).AND(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).AND(_context, (new jsdai.SIfc4.FIfcsamevalue()).run(_context, _e_dir1x, _e_dir2x, _nonvar__e_Epsilon), (new jsdai.SIfc4.FIfcsamevalue()).run(_context, _e_dir1y, _e_dir2y, _nonvar__e_Epsilon)), (new jsdai.SIfc4.FIfcsamevalue()).run(_context, _e_dir1z, _e_dir2z, _nonvar__e_Epsilon))).check(_context, ExpressTypes.LOGICAL_TYPE);

		return Value.alloc(ExpressTypes.GENERIC_TYPE).unset(); // if return is missing in express - add printing of error message?
	}

}
