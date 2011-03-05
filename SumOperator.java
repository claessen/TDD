package org.claessen.basicreview;

import java.math.BigDecimal;

public class SumOperator implements MathOperator {

	public BigDecimal execute(OperandStack stack) {
		BigDecimal result = BigDecimal.ZERO;
		while (stack.size() > 0)
			result.add(stack.pop());
		stack.push(result);
		return result;
	}

}
