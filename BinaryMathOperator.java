package org.claessen.basicreview;

import java.math.BigDecimal;
import java.util.Stack;

public  class BinaryMathOperator implements MathOperator {
	
	BinaryMathOperator() {
		
	}

	protected BigDecimal lhs;
	protected BigDecimal rhs;

	BinaryMathOperator(OperandStack values) {
		lhs = BigDecimal.ZERO;
		rhs = BigDecimal.ZERO;
		
		if (values.size() > 0) lhs = values.pop();
		if (values.size() > 0) rhs = values.pop();
	}


	public void execute(OperandStack values) {
		lhs = BigDecimal.ZERO;
		rhs = BigDecimal.ZERO;
		
		if (values.size() > 0) lhs = values.pop();
		if (values.size() > 0) rhs = values.pop();
		
	}
	
//	public BigDecimal execute(OperandStack values) {
//		return null;
//		// TODO Auto-generated method stub
//		
//	}

}
