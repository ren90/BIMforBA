/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing EXPRESS function IfcSecondProjAxis

package jsdai.SIfc4;
import jsdai.lang.*;



public class FIfcsecondprojaxis {
	
	// declaration of non-VAR parameters
	Value _nonvar__e_ZAxis;
	Value _nonvar__e_XAxis;
	Value _nonvar__e_Arg;
	// end of declaration of non-VAR parameters

	// declaration of local variables
	Value _e_YAxis;
	Value _e_V;
	Value _e_Temp;
	// end of declaration of local variables


	public Value run(SdaiContext _context, Value _e_ZAxis, Value _e_XAxis, Value _e_Arg) throws SdaiException {

		// initialization of non-VAR parameters
		_nonvar__e_ZAxis = Value.alloc(jsdai.SIfc4.CIfcdirection.definition).set(_e_ZAxis);
		_nonvar__e_XAxis = Value.alloc(jsdai.SIfc4.CIfcdirection.definition).set(_e_XAxis);
		_nonvar__e_Arg = Value.alloc(jsdai.SIfc4.CIfcdirection.definition).set(_e_Arg);
		// end of initialization of non-VAR parameters

		// initialization of local variables
		_e_YAxis = Value.alloc(jsdai.SIfc4.CIfcvector.definition);
		_e_V = Value.alloc(jsdai.SIfc4.CIfcdirection.definition);
		_e_Temp = Value.alloc(jsdai.SIfc4.CIfcvector.definition);
		// end of initialization of local variables





																																						if (Value.alloc(ExpressTypes.LOGICAL_TYPE).NOT(Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(_nonvar__e_Arg)).getLogical() == 2) {																																						
																																											Value _elements440 = Value.alloc(ExpressTypes.AGGREGATE_GENERIC_TYPE).create();
																																											_elements440.addMember(_context, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 0.0));
																																											_elements440.addMember(_context, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 1.0));
																																											_elements440.addMember(_context, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 0.0));
																																							_e_V.set(_context, new jsdai.lang.Value(CIfcrepresentationitem.definition).addComplex(new jsdai.lang.Value(CIfcgeometricrepresentationitem.definition)).addComplex(new jsdai.lang.Value(CIfcdirection.definition).addParameter(_elements440)));
																																						} else {																																						
																																							_e_V.set(_context, _nonvar__e_Arg);
																																						}



																																						_e_Temp.set(_context, (new jsdai.SIfc4.FIfcscalartimesvector()).run(_context, (new jsdai.SIfc4.FIfcdotproduct()).run(_context, _e_V, _nonvar__e_ZAxis), _nonvar__e_ZAxis));



																																						_e_YAxis.set(_context, (new jsdai.SIfc4.FIfcvectordifference()).run(_context, _e_V, _e_Temp));



																																						_e_Temp.set(_context, (new jsdai.SIfc4.FIfcscalartimesvector()).run(_context, (new jsdai.SIfc4.FIfcdotproduct()).run(_context, _e_V, _nonvar__e_XAxis), _nonvar__e_XAxis));



																																						_e_YAxis.set(_context, (new jsdai.SIfc4.FIfcvectordifference()).run(_context, _e_YAxis, _e_Temp));



																																						_e_YAxis.set(_context, (new jsdai.SIfc4.FIfcnormalise()).run(_context, _e_YAxis));




		if (true) return Value.alloc(jsdai.SIfc4.CIfcdirection.definition).set(_context, _e_YAxis.getAttribute(jsdai.SIfc4.CIfcvector.attributeOrientation(null), _context)).check(_context, jsdai.SIfc4.CIfcdirection.definition);

		return Value.alloc(ExpressTypes.GENERIC_TYPE).unset(); // if return is missing in express - add printing of error message?
	}

}
