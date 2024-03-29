/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing EXPRESS function IfcBaseAxis

package jsdai.SIfc4;
import jsdai.lang.*;










public class FIfcbaseaxis {
	
	// declaration of non-VAR parameters
	Value _nonvar__e_Dim;
	Value _nonvar__e_Axis1;
	Value _nonvar__e_Axis2;
	Value _nonvar__e_Axis3;
	// end of declaration of non-VAR parameters

	// declaration of local variables
	Value _e_U;
	Value _e_Factor;
	Value _e_D1;
	Value _e_D2;
	// end of declaration of local variables


	public Value run(SdaiContext _context, Value _e_Dim, Value _e_Axis1, Value _e_Axis2, Value _e_Axis3) throws SdaiException {

		// initialization of non-VAR parameters
		_nonvar__e_Dim = Value.alloc(ExpressTypes.INTEGER_TYPE).set(_e_Dim);
		_nonvar__e_Axis1 = Value.alloc(jsdai.SIfc4.CIfcdirection.definition).set(_e_Axis1);
		_nonvar__e_Axis2 = Value.alloc(jsdai.SIfc4.CIfcdirection.definition).set(_e_Axis2);
		_nonvar__e_Axis3 = Value.alloc(jsdai.SIfc4.CIfcdirection.definition).set(_e_Axis3);
		// end of initialization of non-VAR parameters

		// initialization of local variables
		_e_U = Value.alloc(jsdai.SIfc4.SIfc4._st_generallist_2_3_ifcdirection);
		_e_Factor = Value.alloc(ExpressTypes.REAL_TYPE);
		_e_D1 = Value.alloc(jsdai.SIfc4.CIfcdirection.definition);
		_e_D2 = Value.alloc(jsdai.SIfc4.CIfcdirection.definition);
		// end of initialization of local variables





						if (Value.alloc(ExpressTypes.LOGICAL_TYPE).equal(_context, _nonvar__e_Dim, Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 3)).getLogical() == 2) {						
														Value _elements346 = Value.alloc(ExpressTypes.AGGREGATE_GENERIC_TYPE).create();
														_elements346.addMember(_context, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 0.0));
														_elements346.addMember(_context, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 0.0));
														_elements346.addMember(_context, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 1.0));
							_e_D1.set(_context, Value.alloc(ExpressTypes.GENERIC_TYPE).NVL(_context, (new jsdai.SIfc4.FIfcnormalise()).run(_context, _nonvar__e_Axis3), new jsdai.lang.Value(CIfcrepresentationitem.definition).addComplex(new jsdai.lang.Value(CIfcgeometricrepresentationitem.definition)).addComplex(new jsdai.lang.Value(CIfcdirection.definition).addParameter(_elements346))));								
							_e_D2.set(_context, (new jsdai.SIfc4.FIfcfirstprojaxis()).run(_context, _e_D1, _nonvar__e_Axis1));																			
							Value _elements347 = Value.alloc(ExpressTypes.AGGREGATE_GENERIC_TYPE).create();
							_elements347.addMember(_context, _e_D2);
							_elements347.addMember(_context, (new jsdai.SIfc4.FIfcsecondprojaxis()).run(_context, _e_D1, _e_D2, _nonvar__e_Axis2));
							_elements347.addMember(_context, _e_D1);
							_e_U.set(_context, _elements347);											
						} else {						
							if (Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(_nonvar__e_Axis1).getLogical() == 2) {							
								_e_D1.set(_context, (new jsdai.SIfc4.FIfcnormalise()).run(_context, _nonvar__e_Axis1));												
								Value _elements348 = Value.alloc(ExpressTypes.AGGREGATE_GENERIC_TYPE).create();
								_elements348.addMember(_context, _e_D1);
								_elements348.addMember(_context, (new jsdai.SIfc4.FIfcorthogonalcomplement()).run(_context, _e_D1));
								_e_U.set(_context, _elements348);																					
								if (Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(_nonvar__e_Axis2).getLogical() == 2) {								
									_e_Factor.set(_context, (new jsdai.SIfc4.FIfcdotproduct()).run(_context, _nonvar__e_Axis2, _e_U.indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 2), null)));									
									if (Value.alloc(ExpressTypes.LOGICAL_TYPE).less(_context, _e_Factor, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 0.0)).getLogical() == 2) {									
										_e_U.indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 2), null).getAttribute(jsdai.SIfc4.CIfcdirection.attributeDirectionratios(null), _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null).set(_context, Value.alloc(ExpressTypes.NUMBER_TYPE).negation(_e_U.indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 2), null).getAttribute(jsdai.SIfc4.CIfcdirection.attributeDirectionratios(null), _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null)));									
										_e_U.indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 2), null).getAttribute(jsdai.SIfc4.CIfcdirection.attributeDirectionratios(null), _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 2), null).set(_context, Value.alloc(ExpressTypes.NUMBER_TYPE).negation(_e_U.indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 2), null).getAttribute(jsdai.SIfc4.CIfcdirection.attributeDirectionratios(null), _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 2), null)));									
									}									
								}									
							} else {							
								if (Value.alloc(ExpressTypes.BOOLEAN_TYPE).exists(_nonvar__e_Axis2).getLogical() == 2) {								
									_e_D1.set(_context, (new jsdai.SIfc4.FIfcnormalise()).run(_context, _nonvar__e_Axis2));													
									Value _elements349 = Value.alloc(ExpressTypes.AGGREGATE_GENERIC_TYPE).create();
									_elements349.addMember(_context, (new jsdai.SIfc4.FIfcorthogonalcomplement()).run(_context, _e_D1));
									_elements349.addMember(_context, _e_D1);
									_e_U.set(_context, _elements349);																					
									_e_U.indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null).getAttribute(jsdai.SIfc4.CIfcdirection.attributeDirectionratios(null), _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null).set(_context, Value.alloc(ExpressTypes.NUMBER_TYPE).negation(_e_U.indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null).getAttribute(jsdai.SIfc4.CIfcdirection.attributeDirectionratios(null), _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null)));																
									_e_U.indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null).getAttribute(jsdai.SIfc4.CIfcdirection.attributeDirectionratios(null), _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 2), null).set(_context, Value.alloc(ExpressTypes.NUMBER_TYPE).negation(_e_U.indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null).getAttribute(jsdai.SIfc4.CIfcdirection.attributeDirectionratios(null), _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 2), null)));								
								} else {								
																Value _elements350 = Value.alloc(ExpressTypes.AGGREGATE_GENERIC_TYPE).create();
																_elements350.addMember(_context, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 1.0));
																_elements350.addMember(_context, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 0.0));
																Value _elements351 = Value.alloc(ExpressTypes.AGGREGATE_GENERIC_TYPE).create();
																_elements351.addMember(_context, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 0.0));
																_elements351.addMember(_context, Value.alloc(ExpressTypes.REAL_TYPE).set(_context, 1.0));
									Value _elements352 = Value.alloc(ExpressTypes.AGGREGATE_GENERIC_TYPE).create();
									_elements352.addMember(_context, new jsdai.lang.Value(CIfcrepresentationitem.definition).addComplex(new jsdai.lang.Value(CIfcgeometricrepresentationitem.definition)).addComplex(new jsdai.lang.Value(CIfcdirection.definition).addParameter(_elements350)));
									_elements352.addMember(_context, new jsdai.lang.Value(CIfcrepresentationitem.definition).addComplex(new jsdai.lang.Value(CIfcgeometricrepresentationitem.definition)).addComplex(new jsdai.lang.Value(CIfcdirection.definition).addParameter(_elements351)));
									_e_U.set(_context, _elements352);
								}
							}
						}




		if (true) return Value.alloc(jsdai.SIfc4.SIfc4._st_generallist_2_3_ifcdirection).set(_context, _e_U).check(_context, jsdai.SIfc4.SIfc4._st_generallist_2_3_ifcdirection);

		return Value.alloc(ExpressTypes.GENERIC_TYPE).unset(); // if return is missing in express - add printing of error message?
	}

}
