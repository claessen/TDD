package org.claessen.basicreview;

import java.math.BigDecimal;
import java.util.Stack;

public class Subtract extends BinaryMathOperator {

	BigDecimal performOperation(BigDecimal lhs, BigDecimal rhs) {
		return rhs.subtract(lhs);
	}

	public void execute(Stack<BigDecimal> values) {
		BigDecimal rhs = values.peek();
	}

}
