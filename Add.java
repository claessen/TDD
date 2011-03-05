package org.claessen.basicreview;

import java.math.BigDecimal;
import java.util.Stack;

public class Add extends BinaryMathOperator {
	
	Add(OperandStack values) {
		super(values);
	}
	
	Add() {
		super();
	}


	BigDecimal performOperation(BigDecimal lhs, BigDecimal rhs) {
		return rhs.add(lhs);
	}
	
	public void execute(OperandStack stack) {
		super.execute(stack);
		stack.push(rhs.add(lhs));		
	}


}
