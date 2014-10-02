/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing EXPRESS function IfcNormalise

package jsdai.SIfc4;
import jsdai.lang.*;



















public class FIfcnormalise {
	
	// declaration of non-VAR parameters
	Value _nonvar__e_Arg;
	// end of declaration of non-VAR parameters

	// declaration of local variables
	Value _e_Ndim;
	Value _e_V;
	Value _e_Vec;
	Value _e_Mag;
	Value _e_Result;
	// end of declaration of local variables


	public Value run(SdaiContext _context, Value _e_Arg) throws SdaiException {

		// initialization of non-VAR parameters
		_nonvar__e_Arg = Value.alloc(jsdai.SIfc4.SIfc4._st_IfcVectorOrDirection).set(_e_Arg);
		// end of initialization of non-VAR parameters

		// initialization of local variables
		_e_Ndim = Value.alloc(ExpressTypes.INTEGER_TYPE);





																																		Value _elements433 = Value.alloc(ExpressTypes.AGGREGATE_GENERIC_TYPE).create();
																																		_elements433.addMember(_context, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 1.0));
																																		_elements433.addMember(_context, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 0.0));

		_e_V = Value.alloc(jsdai.SIfc4.CIfcdirection.definition).set(_context, new jsdai.lang.Value(CIfcrepresentationitem.definition).addComplex(new jsdai.lang.Value(CIfcgeometricrepresentationitem.definition)).addComplex(new jsdai.lang.Value(CIfcdirection.definition).addParameter(_elements433)));





																																						Value _elements434 = Value.alloc(ExpressTypes.AGGREGATE_GENERIC_TYPE).create();
																																						_elements434.addMember(_context, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 1.0));
																																						_elements434.addMember(_context, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 0.0));

		_e_Vec = Value.alloc(jsdai.SIfc4.CIfcvector.definition).set(_context, new jsdai.lang.Value(CIfcrepresentationitem.definition).addComplex(new jsdai.lang.Value(CIfcgeometricrepresentationitem.definition)).addComplex(new jsdai.lang.Value(CIfcvector.definition).addParameter(new jsdai.lang.Value(CIfcrepresentationitem.definition).addComplex(new jsdai.lang.Value(CIfcgeometricrepresentationitem.definition)).addComplex(new jsdai.lang.Value(CIfcdirection.definition).addParameter(_elements434))).addParameter(Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 1.0))));
		_e_Mag = Value.alloc(ExpressTypes.REAL_TYPE);
		_e_Result = Value.alloc(jsdai.SIfc4.SIfc4._st_IfcVectorOrDirection).set(_context, _e_V);
		// end of initialization of local variables





																													if (Value.alloc(ExpressTypes.LOGICAL_TYPE).NOT(Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(_nonvar__e_Arg)).getLogical() == 2) {																													
		if (true) return Value.alloc(jsdai.SIfc4.SIfc4._st_IfcVectorOrDirection).set(_context, Value.alloc(ExpressTypes.GENERIC_TYPE).unset()).check(_context, jsdai.SIfc4.SIfc4._st_IfcVectorOrDirection);
																													} else {																													
																														if (Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCVECTOR", "IFC4"), _nonvar__e_Arg.typeOfV(_context)).getLogical() == 2) {																														
																															{ // BEGIN
																																_e_Ndim.set(_context, _nonvar__e_Arg.groupReference(_context, jsdai.SIfc4.CIfcvector.class).getAttribute(jsdai.SIfc4.CIfcvector.attributeDim(null), _context));
																																_e_V.setAttribute((jsdai.dictionary.EExplicit_attribute)jsdai.SIfc4.CIfcdirection.attributeDirectionratios(null), _nonvar__e_Arg.groupReference(_context, jsdai.SIfc4.CIfcvector.class).getAttribute(jsdai.SIfc4.CIfcvector.attributeOrientation(null), _context).getAttribute(jsdai.SIfc4.CIfcdirection.attributeDirectionratios(null), _context));
																																_e_Vec.setAttribute((jsdai.dictionary.EExplicit_attribute)jsdai.SIfc4.CIfcvector.attributeMagnitude(null), _nonvar__e_Arg.groupReference(_context, jsdai.SIfc4.CIfcvector.class).getAttribute(jsdai.SIfc4.CIfcvector.attributeMagnitude(null), _context));
																																_e_Vec.setAttribute((jsdai.dictionary.EExplicit_attribute)jsdai.SIfc4.CIfcvector.attributeOrientation(null), _e_V);
																																if (Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, _nonvar__e_Arg.groupReference(_context, jsdai.SIfc4.CIfcvector.class).getAttribute(jsdai.SIfc4.CIfcvector.attributeMagnitude(null), _context), Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 0.0)).getLogical() == 2) {																																
		if (true) return Value.alloc(jsdai.SIfc4.SIfc4._st_IfcVectorOrDirection).set(_context, Value.alloc(ExpressTypes.GENERIC_TYPE).unset()).check(_context, jsdai.SIfc4.SIfc4._st_IfcVectorOrDirection);
																																} else {																																
																																	_e_Vec.setAttribute((jsdai.dictionary.EExplicit_attribute)jsdai.SIfc4.CIfcvector.attributeMagnitude(null), Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 1.0));
																																}
																															} // END
																														} else {																														
																															{ // BEGIN
																																_e_Ndim.set(_context, _nonvar__e_Arg.groupReference(_context, jsdai.SIfc4.CIfcdirection.class).getAttribute(jsdai.SIfc4.CIfcdirection.attributeDim(null), _context));
																																_e_V.setAttribute((jsdai.dictionary.EExplicit_attribute)jsdai.SIfc4.CIfcdirection.attributeDirectionratios(null), _nonvar__e_Arg.groupReference(_context, jsdai.SIfc4.CIfcdirection.class).getAttribute(jsdai.SIfc4.CIfcdirection.attributeDirectionratios(null), _context));
																															} // END
																														}																													
																														_e_Mag.set(_context, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 0.0));																																																											
																														Value _end435 = Value.alloc(ExpressTypes.NUMBER_TYPE).set(_e_Ndim);
																														Value _step435 = Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1);
																														for (Value _implicit_106_i=Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1);Value.alloc(ExpressTypes.LOGICAL_TYPE).lequal(_context, _implicit_106_i, _end435).getLogical() == 2;_implicit_106_i.inc(_step435)) {																														
																															_e_Mag.set(_context, Value.alloc().addOrUnionOrConcatenate(_context, _e_Mag, Value.alloc(jsdai.SIfc4.SIfc4._st_IfcVectorOrDirection).mulOrIntersect(_context, _e_V.getAttribute(jsdai.SIfc4.CIfcdirection.attributeDirectionratios(null), _context).indexing(_implicit_106_i, null), _e_V.getAttribute(jsdai.SIfc4.CIfcdirection.attributeDirectionratios(null), _context).indexing(_implicit_106_i, null))));
																														} // for - REPEAT																																																												
																														if (Value.alloc(ExpressTypes.LOGICAL_TYPE).greater(_context, _e_Mag, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 0.0)).getLogical() == 2) {																														
																															_e_Mag.set(_context, Value.alloc(ExpressTypes.REAL_TYPE).sqrt(_e_Mag));																															
																															Value _end436 = Value.alloc(ExpressTypes.NUMBER_TYPE).set(_e_Ndim);
																															Value _step436 = Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1);
																															for (Value _implicit_107_i=Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1);Value.alloc(ExpressTypes.LOGICAL_TYPE).lequal(_context, _implicit_107_i, _end436).getLogical() == 2;_implicit_107_i.inc(_step436)) {																															
																																_e_V.getAttribute(jsdai.SIfc4.CIfcdirection.attributeDirectionratios(null), _context).indexing(_implicit_107_i, null).set(_context, Value.alloc(ExpressTypes.NUMBER_TYPE).divide(_context, _e_V.getAttribute(jsdai.SIfc4.CIfcdirection.attributeDirectionratios(null), _context).indexing(_implicit_107_i, null), _e_Mag));
																															} // for - REPEAT																																																														
																															if (Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCVECTOR", "IFC4"), _nonvar__e_Arg.typeOfV(_context)).getLogical() == 2) {																															
																																_e_Vec.setAttribute((jsdai.dictionary.EExplicit_attribute)jsdai.SIfc4.CIfcvector.attributeOrientation(null), _e_V);																															
																																_e_Result.set(_context, _e_Vec);																															
																															} else {																															
																																_e_Result.set(_context, _e_V);
																															}																															
																														} else {																														
		if (true) return Value.alloc(jsdai.SIfc4.SIfc4._st_IfcVectorOrDirection).set(_context, Value.alloc(ExpressTypes.GENERIC_TYPE).unset()).check(_context, jsdai.SIfc4.SIfc4._st_IfcVectorOrDirection);
																														}																														
																													}




		if (true) return Value.alloc(jsdai.SIfc4.SIfc4._st_IfcVectorOrDirection).set(_context, _e_Result).check(_context, jsdai.SIfc4.SIfc4._st_IfcVectorOrDirection);

		return Value.alloc(ExpressTypes.GENERIC_TYPE).unset(); // if return is missing in express - add printing of error message?
	}

}