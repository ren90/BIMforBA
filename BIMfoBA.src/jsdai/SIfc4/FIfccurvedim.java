/* Generated by JSDAI Express Compiler, version 4.3.2, build 500, 2011-12-13 */

// Java class implementing EXPRESS function IfcCurveDim

package jsdai.SIfc4;
import jsdai.lang.*;












public class FIfccurvedim {
	
	// declaration of non-VAR parameters
	Value _nonvar__e_Curve;
	// end of declaration of non-VAR parameters


	public Value run(SdaiContext _context, Value _e_Curve) throws SdaiException {

		// initialization of non-VAR parameters
		_nonvar__e_Curve = Value.alloc(jsdai.SIfc4.CIfccurve.definition).set(_e_Curve);
		// end of initialization of non-VAR parameters





																		if (Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCLINE", "IFC4"), _nonvar__e_Curve.typeOfV(_context)).getLogical() == 2) {																		
		if (true) return Value.alloc(jsdai.SIfc4.SIfc4._st_IfcDimensionCount).set(_context, _nonvar__e_Curve.groupReference(_context, jsdai.SIfc4.CIfcline.class).getAttribute(jsdai.SIfc4.CIfcline.attributePnt(null), _context).getAttribute(jsdai.SIfc4.CIfccartesianpoint.attributeDim(null), _context)).check(_context, jsdai.SIfc4.SIfc4._st_IfcDimensionCount);
																		}



																		if (Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCCONIC", "IFC4"), _nonvar__e_Curve.typeOfV(_context)).getLogical() == 2) {																		
		if (true) return Value.alloc(jsdai.SIfc4.SIfc4._st_IfcDimensionCount).set(_context, _nonvar__e_Curve.groupReference(_context, jsdai.SIfc4.CIfcconic.class).getAttribute(jsdai.SIfc4.CIfcconic.attributePosition(null), _context).getAttribute("Dim", _context)).check(_context, jsdai.SIfc4.SIfc4._st_IfcDimensionCount);
																		}



																		if (Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCPOLYLINE", "IFC4"), _nonvar__e_Curve.typeOfV(_context)).getLogical() == 2) {																		
		if (true) return Value.alloc(jsdai.SIfc4.SIfc4._st_IfcDimensionCount).set(_context, _nonvar__e_Curve.groupReference(_context, jsdai.SIfc4.CIfcpolyline.class).getAttribute(jsdai.SIfc4.CIfcpolyline.attributePoints(null), _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null).getAttribute(jsdai.SIfc4.CIfccartesianpoint.attributeDim(null), _context)).check(_context, jsdai.SIfc4.SIfc4._st_IfcDimensionCount);
																		}



																		if (Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCTRIMMEDCURVE", "IFC4"), _nonvar__e_Curve.typeOfV(_context)).getLogical() == 2) {																		
		if (true) return Value.alloc(jsdai.SIfc4.SIfc4._st_IfcDimensionCount).set(_context, (new jsdai.SIfc4.FIfccurvedim()).run(_context, _nonvar__e_Curve.groupReference(_context, jsdai.SIfc4.CIfctrimmedcurve.class).getAttribute(jsdai.SIfc4.CIfctrimmedcurve.attributeBasiscurve(null), _context))).check(_context, jsdai.SIfc4.SIfc4._st_IfcDimensionCount);
																		}



																		if (Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCCOMPOSITECURVE", "IFC4"), _nonvar__e_Curve.typeOfV(_context)).getLogical() == 2) {																		
		if (true) return Value.alloc(jsdai.SIfc4.SIfc4._st_IfcDimensionCount).set(_context, _nonvar__e_Curve.groupReference(_context, jsdai.SIfc4.CIfccompositecurve.class).getAttribute(jsdai.SIfc4.CIfccompositecurve.attributeSegments(null), _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null).getAttribute(jsdai.SIfc4.CIfccompositecurvesegment.attributeDim(null), _context)).check(_context, jsdai.SIfc4.SIfc4._st_IfcDimensionCount);
																		}



																		if (Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCBSPLINECURVE", "IFC4"), _nonvar__e_Curve.typeOfV(_context)).getLogical() == 2) {																		
		if (true) return Value.alloc(jsdai.SIfc4.SIfc4._st_IfcDimensionCount).set(_context, _nonvar__e_Curve.groupReference(_context, jsdai.SIfc4.CIfcbsplinecurve.class).getAttribute(jsdai.SIfc4.CIfcbsplinecurve.attributeControlpointslist(null), _context).indexing(Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 1), null).getAttribute(jsdai.SIfc4.CIfccartesianpoint.attributeDim(null), _context)).check(_context, jsdai.SIfc4.SIfc4._st_IfcDimensionCount);
																		}



																		if (Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCOFFSETCURVE2D", "IFC4"), _nonvar__e_Curve.typeOfV(_context)).getLogical() == 2) {																		
		if (true) return Value.alloc(jsdai.SIfc4.SIfc4._st_IfcDimensionCount).set(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 2)).check(_context, jsdai.SIfc4.SIfc4._st_IfcDimensionCount);
																		}



																		if (Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCOFFSETCURVE3D", "IFC4"), _nonvar__e_Curve.typeOfV(_context)).getLogical() == 2) {																		
		if (true) return Value.alloc(jsdai.SIfc4.SIfc4._st_IfcDimensionCount).set(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 3)).check(_context, jsdai.SIfc4.SIfc4._st_IfcDimensionCount);
																		}



																		if (Value.alloc(ExpressTypes.LOGICAL_TYPE).IN(_context, Value.alloc(ExpressTypes.STRING_TYPE).set(_context, "*.IFCPCURVE", "IFC4"), _nonvar__e_Curve.typeOfV(_context)).getLogical() == 2) {																		
		if (true) return Value.alloc(jsdai.SIfc4.SIfc4._st_IfcDimensionCount).set(_context, Value.alloc(ExpressTypes.INTEGER_TYPE).set(_context, 3)).check(_context, jsdai.SIfc4.SIfc4._st_IfcDimensionCount);
																		}




		if (true) return Value.alloc(jsdai.SIfc4.SIfc4._st_IfcDimensionCount).set(_context, Value.alloc(ExpressTypes.GENERIC_TYPE).unset()).check(_context, jsdai.SIfc4.SIfc4._st_IfcDimensionCount);

		return Value.alloc(ExpressTypes.GENERIC_TYPE).unset(); // if return is missing in express - add printing of error message?
	}

}
