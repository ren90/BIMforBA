/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing EXPRESS function IfcBuildAxes

package jsdai.SIfc4;
import jsdai.lang.*;



public class FIfcbuildaxes {
	
	// declaration of non-VAR parameters
	Value _nonvar__e_Axis;
	Value _nonvar__e_RefDirection;
	// end of declaration of non-VAR parameters

	// declaration of local variables
	Value _e_D1;
	Value _e_D2;
	// end of declaration of local variables


	public Value run(SdaiContext _context, Value _e_Axis, Value _e_RefDirection) throws SdaiException {

		// initialization of non-VAR parameters
		_nonvar__e_Axis = Value.alloc(jsdai.SIfc4.CIfcdirection.definition).set(_e_Axis);
		_nonvar__e_RefDirection = Value.alloc(jsdai.SIfc4.CIfcdirection.definition).set(_e_RefDirection);
		// end of initialization of non-VAR parameters

		// initialization of local variables
		_e_D1 = Value.alloc(jsdai.SIfc4.CIfcdirection.definition);
		_e_D2 = Value.alloc(jsdai.SIfc4.CIfcdirection.definition);
		// end of initialization of local variables




																Value _elements355 = Value.alloc(ExpressTypes.AGGREGATE_GENERIC_TYPE).create();
																_elements355.addMember(_context, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 0.0));
																_elements355.addMember(_context, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 0.0));
																_elements355.addMember(_context, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 1.0));

									_e_D1.set(_context, Value.alloc(ExpressTypes.GENERIC_TYPE).NVL(_context, (new jsdai.SIfc4.FIfcnormalise()).run(_context, _nonvar__e_Axis), new jsdai.lang.Value(CIfcrepresentationitem.definition).addComplex(new jsdai.lang.Value(CIfcgeometricrepresentationitem.definition)).addComplex(new jsdai.lang.Value(CIfcdirection.definition).addParameter(_elements355))));



									_e_D2.set(_context, (new jsdai.SIfc4.FIfcfirstprojaxis()).run(_context, _e_D1, _nonvar__e_RefDirection));



		Value _elements356 = Value.alloc(ExpressTypes.AGGREGATE_GENERIC_TYPE).create();
		_elements356.addMember(_context, _e_D2);
		_elements356.addMember(_context, (new jsdai.SIfc4.FIfcnormalise()).run(_context, (new jsdai.SIfc4.FIfccrossproduct()).run(_context, _e_D1, _e_D2)).groupReference(_context, jsdai.SIfc4.CIfcvector.class).getAttribute(jsdai.SIfc4.CIfcvector.attributeOrientation(null), _context));
		_elements356.addMember(_context, _e_D1);

		if (true) return Value.alloc(jsdai.SIfc4.SIfc4._st_generallist_3_3_ifcdirection).set(_context, _elements356).check(_context, jsdai.SIfc4.SIfc4._st_generallist_3_3_ifcdirection);

		return Value.alloc(ExpressTypes.GENERIC_TYPE).unset(); // if return is missing in express - add printing of error message?
	}

}
