/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing EXPRESS function IfcLoopHeadToTail

package jsdai.SIfc4;
import jsdai.lang.*;







public class FIfcloopheadtotail {
	
	// declaration of non-VAR parameters
	Value _nonvar__e_ALoop;
	// end of declaration of non-VAR parameters

	// declaration of local variables
	Value _e_N;
	Value _e_P;
	// end of declaration of local variables


	public Value run(SdaiContext _context, Value _e_ALoop) throws SdaiException {

		// initialization of non-VAR parameters
		_nonvar__e_ALoop = Value.alloc(jsdai.SIfc4.CIfcedgeloop.definition).set(_e_ALoop);
		// end of initialization of non-VAR parameters

		// initialization of local variables
		_e_N = Value.alloc(ExpressTypes.INTEGER_TYPE);
		_e_P = Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).setLB(_context, 2));
		// end of initialization of local variables





																										_e_N.set(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).sizeOf(_nonvar__e_ALoop.getAttribute(jsdai.SIfc4.CIfcedgeloop.attributeEdgelist(null), _context)));


																										Value _end429 = Value.alloc(ExpressTypes.NUMBER_TYPE).set(_e_N);
																										Value _step429 = Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1);
																										for (Value _implicit_103_i=Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 2);Value.alloc(ExpressTypes.LOGICAL_TYPE).lequal(_context, _implicit_103_i, _end429).getLogical() == 2;_implicit_103_i.inc(_step429)) {																										
																											_e_P.set(_context, Value.alloc(ExpressTypes.LOGICAL_TYPE).AND(_context, _e_P, Value.alloc(ExpressTypes.LOGICAL_TYPE).instanceEqual(_context, _nonvar__e_ALoop.getAttribute(jsdai.SIfc4.CIfcedgeloop.attributeEdgelist(null), _context).indexing(Value.alloc().substractOrDifference(_context, _implicit_103_i, Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1)), null).getAttribute(jsdai.SIfc4.CIfcorientededge.attributeEdgeend(null), _context), _nonvar__e_ALoop.getAttribute(jsdai.SIfc4.CIfcedgeloop.attributeEdgelist(null), _context).indexing(_implicit_103_i, null).getAttribute(jsdai.SIfc4.CIfcorientededge.attributeEdgestart(null), _context))));
																										} // for - REPEAT




		if (true) return Value.alloc(ExpressTypes.LOGICAL_TYPE).set(_context, _e_P).check(_context, ExpressTypes.LOGICAL_TYPE);

		return Value.alloc(ExpressTypes.GENERIC_TYPE).unset(); // if return is missing in express - add printing of error message?
	}

}